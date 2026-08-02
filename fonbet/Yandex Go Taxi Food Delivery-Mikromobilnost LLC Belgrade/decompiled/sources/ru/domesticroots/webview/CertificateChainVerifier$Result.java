package ru.domesticroots.webview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
final class CertificateChainVerifier$Result {
    private static final /* synthetic */ CertificateChainVerifier$Result[] $VALUES;
    public static final CertificateChainVerifier$Result TRANSIENT_FAILURE;
    public static final CertificateChainVerifier$Result TRUSTED;
    public static final CertificateChainVerifier$Result UNTRUSTED_ROOT;

    static {
        CertificateChainVerifier$Result certificateChainVerifier$Result = new CertificateChainVerifier$Result("TRUSTED", 0);
        TRUSTED = certificateChainVerifier$Result;
        CertificateChainVerifier$Result certificateChainVerifier$Result2 = new CertificateChainVerifier$Result("UNTRUSTED_ROOT", 1);
        UNTRUSTED_ROOT = certificateChainVerifier$Result2;
        CertificateChainVerifier$Result certificateChainVerifier$Result3 = new CertificateChainVerifier$Result("TRANSIENT_FAILURE", 2);
        TRANSIENT_FAILURE = certificateChainVerifier$Result3;
        $VALUES = new CertificateChainVerifier$Result[]{certificateChainVerifier$Result, certificateChainVerifier$Result2, certificateChainVerifier$Result3};
    }

    public static CertificateChainVerifier$Result valueOf(String str) {
        return (CertificateChainVerifier$Result) Enum.valueOf(CertificateChainVerifier$Result.class, str);
    }

    public static CertificateChainVerifier$Result[] values() {
        return (CertificateChainVerifier$Result[]) $VALUES.clone();
    }
}
