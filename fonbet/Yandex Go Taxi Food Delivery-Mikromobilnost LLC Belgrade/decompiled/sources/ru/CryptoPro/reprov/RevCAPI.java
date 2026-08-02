package ru.CryptoPro.reprov;

/* loaded from: classes4.dex */
public class RevCAPI {
    public static final int CONTEXT_OID_CERTIFICATE = 1;
    public static final int CONTEXT_OID_CRL = 2;

    public static native int cryptRetrieveObjectByUrl(String str, int i, int i2, byte[] bArr, int[] iArr);
}
