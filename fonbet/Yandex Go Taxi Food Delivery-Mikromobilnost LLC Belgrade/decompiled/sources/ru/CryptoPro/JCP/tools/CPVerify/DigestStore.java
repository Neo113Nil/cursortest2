package ru.CryptoPro.JCP.tools.CPVerify;

/* loaded from: classes4.dex */
public interface DigestStore {
    boolean canRead();

    boolean canWrite();

    boolean deleteKey(String str);

    byte[] getDigest(String str);

    String getKeyValue(String str);

    String[] getKeys();

    String getStoreName();

    boolean isExist();

    String[] readStore() throws CPVerifyException;

    void resetStore() throws CPVerifyException;

    String writeKey(String str, byte[] bArr);

    void writeStore() throws CPVerifyException;
}
