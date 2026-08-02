package com.squareup.cash.api;

import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.text.Charsets;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.Tags;
import okio.ByteString;
import okio.Options;
import okio.RealBufferedSource;

/* loaded from: classes.dex */
public abstract class ResponseBodyKt {
    public static final Options unicodeBoms;

    static {
        int i = Options.$r8$clinit;
        ByteString.Companion companion = ByteString.Companion;
        unicodeBoms = Tags.of(ByteString.Companion.decodeHex("efbbbf"), ByteString.Companion.decodeHex("feff"), ByteString.Companion.decodeHex("fffe"), ByteString.Companion.decodeHex("0000ffff"), ByteString.Companion.decodeHex("ffff0000"));
    }

    public static final String peekString(ResponseBody responseBody) {
        Charset charset;
        responseBody.getClass();
        RealBufferedSource peek = responseBody.source().peek();
        try {
            MediaType contentType = responseBody.contentType();
            if (contentType == null || (charset = MediaType.charset$default(contentType)) == null) {
                charset = Charsets.UTF_8;
            }
            int select = peek.select(unicodeBoms);
            if (select != -1) {
                if (select == 0) {
                    charset = Charsets.UTF_8;
                } else if (select == 1) {
                    charset = Charsets.UTF_16BE;
                } else if (select == 2) {
                    charset = Charsets.UTF_16LE;
                } else if (select == 3) {
                    Charsets.INSTANCE.getClass();
                    charset = Charsets.utf_32be;
                    if (charset == null) {
                        charset = Charset.forName("UTF-32BE");
                        charset.getClass();
                        Charsets.utf_32be = charset;
                    }
                } else {
                    if (select != 4) {
                        throw new AssertionError();
                    }
                    Charsets.INSTANCE.getClass();
                    charset = Charsets.utf_32le;
                    if (charset == null) {
                        charset = Charset.forName("UTF-32LE");
                        charset.getClass();
                        Charsets.utf_32le = charset;
                    }
                }
            }
            return peek.readString(charset);
        } catch (IOException unused) {
            return null;
        }
    }
}
