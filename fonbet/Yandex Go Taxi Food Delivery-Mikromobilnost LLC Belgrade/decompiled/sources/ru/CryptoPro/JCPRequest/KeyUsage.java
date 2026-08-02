package ru.CryptoPro.JCPRequest;

/* loaded from: classes4.dex */
public interface KeyUsage {
    public static final int BIT_CRL_SIGN = 6;
    public static final int BIT_DATA_ENCIPHERMENT = 3;
    public static final int BIT_DECIPHER_ONLY = 8;
    public static final int BIT_DIGITAL_SIGNATURE = 0;
    public static final int BIT_ENCIPHER_ONLY = 7;
    public static final int BIT_KEY_AGREEMENT = 4;
    public static final int BIT_KEY_CERT_SIGN = 5;
    public static final int BIT_KEY_ENCIPHERMENT = 2;
    public static final int BIT_NON_REPUDIATION = 1;
    public static final int CENTER_DEFAULT = 119;
    public static final int CRL_SIGN = 64;
    public static final int CRYPT_DEFAULT = 23;
    public static final int DATA_ENCIPHERMENT = 8;
    public static final int DECIPHER_ONLY = 256;
    public static final int DIGITAL_SIGNATURE = 1;
    public static final int ENCIPHER_ONLY = 128;
    public static final int KEY_AGREEMENT = 16;
    public static final int KEY_CERT_SIGN = 32;
    public static final int KEY_ENCIPHERMENT = 4;
    public static final int NON_REPUDIATION = 2;
    public static final int NOT_SET = 0;
    public static final int SIGN_DEFAULT = 3;
    public static final String STR_OID_PKIX_CLIENT_AUTH = "1.3.6.1.5.5.7.3.2";
    public static final String STR_OID_PKIX_CODE_SIGNING = "1.3.6.1.5.5.7.3.3";
    public static final String STR_OID_PKIX_EMAIL_PROTECTION = "1.3.6.1.5.5.7.3.4";
    public static final String STR_OID_PKIX_IPSEC_END_SYSTEM = "1.3.6.1.5.5.7.3.5";
    public static final String STR_OID_PKIX_IPSEC_TUNNEL = "1.3.6.1.5.5.7.3.6";
    public static final String STR_OID_PKIX_IPSEC_USER = "1.3.6.1.5.5.7.3.7";
    public static final String STR_OID_PKIX_OCSP_SIGNING = "1.3.6.1.5.5.7.3.9";
    public static final String STR_OID_PKIX_SERVER_AUTH = "1.3.6.1.5.5.7.3.1";
    public static final String STR_OID_PKIX_TIME_STAMPING = "1.3.6.1.5.5.7.3.8";
    public static final int[] INTS_PKIX_SERVER_AUTH = {1, 3, 6, 1, 5, 5, 7, 3, 1};
    public static final int[] INTS_PKIX_CLIENT_AUTH = {1, 3, 6, 1, 5, 5, 7, 3, 2};
    public static final int[] INTS_PKIX_CODE_SIGNING = {1, 3, 6, 1, 5, 5, 7, 3, 3};
    public static final int[] INTS_PKIX_EMAIL_PROTECTION = {1, 3, 6, 1, 5, 5, 7, 3, 4};
    public static final int[] INTS_PKIX_IPSEC_END_SYSTEM = {1, 3, 6, 1, 5, 5, 7, 3, 5};
    public static final int[] INTS_PKIX_IPSEC_TUNNEL = {1, 3, 6, 1, 5, 5, 7, 3, 6};
    public static final int[] INTS_PKIX_IPSEC_USER = {1, 3, 6, 1, 5, 5, 7, 3, 7};
    public static final int[] INTS_PKIX_TIME_STAMPING = {1, 3, 6, 1, 5, 5, 7, 3, 8};
    public static final int[] INTS_PKIX_OCSP_SIGNING = {1, 3, 6, 1, 5, 5, 7, 3, 9};
}
