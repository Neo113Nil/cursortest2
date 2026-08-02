package com.squareup.cash.contacts.encryption;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.JsonKeysetReader;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Util;
import com.google.crypto.tink.hybrid.HybridConfig;
import com.google.crypto.tink.internal.JsonParser;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.gson.JsonParseException;
import com.squareup.encryption.Encryptor;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class HybridEncryptor implements Encryptor {
    public final HybridEncrypt primitive;

    static {
        HybridConfig.register();
    }

    public HybridEncryptor(InputStream inputStream) {
        inputStream.getClass();
        try {
            InputStream inputStream2 = new JsonKeysetReader(inputStream).inputStream;
            try {
                try {
                    Keyset keysetFromJson = JsonKeysetReader.keysetFromJson(JsonParser.parse(new String(Util.readAll(inputStream2), JsonKeysetReader.UTF_8)).getAsJsonObject());
                    inputStream2.close();
                    try {
                        Keyset parseFrom = Keyset.parseFrom(keysetFromJson.toByteArray(), ExtensionRegistryLite.getEmptyRegistry());
                        KeysetHandle.assertNoSecretKeyMaterial(parseFrom);
                        this.primitive = (HybridEncrypt) KeysetHandle.fromKeyset(parseFrom).getPrimitive(HybridEncrypt.class);
                    } catch (InvalidProtocolBufferException unused) {
                        a$$ExternalSyntheticBUOutline0.m$6("invalid keyset");
                        throw null;
                    }
                } catch (JsonParseException | IllegalStateException e) {
                    throw new IOException(e);
                }
            } catch (Throwable th) {
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (InvalidProtocolBufferException unused2) {
            a$$ExternalSyntheticBUOutline0.m$6("invalid keyset");
            throw null;
        }
    }

    @Override // com.squareup.encryption.Encryptor
    public final byte[] encrypt(byte[] bArr) {
        byte[] encrypt = this.primitive.encrypt(bArr);
        encrypt.getClass();
        return encrypt;
    }
}
