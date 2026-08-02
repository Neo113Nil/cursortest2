package com.fillr.browsersdk.apiclient;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes4.dex */
public final class FillrWidgetResponse {
    public final String eTagString;
    public final int httpResponseCode;
    public final String widgetString;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r1.equals(r3) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FillrWidgetResponse(String str, InputStream inputStream, int i, String str2) {
        String str3;
        this.eTagString = str2;
        this.httpResponseCode = i;
        if (inputStream == null || str == null) {
            return;
        }
        try {
            DigestInputStream digestInputStream = new DigestInputStream(inputStream, MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1));
            int i2 = IOUtils.$r8$clinit;
            int i3 = Charsets.$r8$clinit;
            str3 = IOUtils.toString(digestInputStream, Charset.forName("utf-8"));
            String hex = toHex(digestInputStream.getMessageDigest().digest());
            if (str3.length() > 0) {
            }
        } catch (IOException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
        str3 = null;
        this.widgetString = str3;
    }

    public static String toHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}
