package ru.CryptoPro.ssl.gost;

import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public interface GostConstants {
    public static final String ALG_GOST28147_CFB_NO_PADDING = "GOST28147/CFB/NoPadding";
    public static final String ALG_GOST28147_CNT_NO_PADDING = "GOST28147/CNT/NoPadding";
    public static final String ALG_GOST_K_CTR_NO_PADDING = "GOST3412_2015_K/CTR_ACPKM/NoPadding";
    public static final String ALG_GOST_M_CTR_NO_PADDING = "GOST3412_2015_M/CTR_ACPKM/NoPadding";
    public static final int CALG_G28147 = 26142;
    public static final int CALG_G28147_IMIT = 32799;
    public static final int CALG_GR3412_2015_K = 26161;
    public static final int CALG_GR3412_2015_M = 26160;
    public static final int CALG_GR3413_2015_K_IMIT = 32829;
    public static final int CALG_GR3413_2015_M_IMIT = 32828;
    public static final int CALG_SCHANNEL_MASTER_HASH = 19458;
    public static final int CALG_TLS1PRF = 32778;
    public static final int CALG_TLS1PRF_2012_256 = 32817;
    public static final int CALG_TLS1_MASTER_HASH = 32800;
    public static final int CALG_TLS1_MASTER_HASH_2012_256 = 32822;
    public static final String CIPHER28147_ALGORITHM = "GOST28147";
    public static final String CIPHERK_ALGORITHM = "GOST3412_2015_K";
    public static final String CIPHERM_ALGORITHM = "GOST3412_2015_M";
    public static final String GR3410 = "GR3410";
    public static final String GR3410_2012_256 = "GR3410_2012_256";
    public static final String GR3410_2012_256_KUZN = "GR3410_2012_256_KUZN";
    public static final String GR3410_2012_256_MAGMA = "GR3410_2012_256_MAGMA";
    public static final byte[] LABEL_CLIENT_FINISHED = {99, 108, 105, 101, Alerts.alert_unsupported_extension, 116, BlobHeaderStructure.BLOB_VERSION, 102, 105, Alerts.alert_unsupported_extension, 105, 115, 104, 101, Alerts.alert_no_renegotiation};
    public static final byte[] LABEL_SERVER_FINISHED = {115, 101, Alerts.alert_bad_certificate_hash_value, 118, 101, Alerts.alert_bad_certificate_hash_value, BlobHeaderStructure.BLOB_VERSION, 102, 105, Alerts.alert_unsupported_extension, 105, 115, 104, 101, Alerts.alert_no_renegotiation};
    public static final int MODE_CFB = 4;
    public static final int MODE_CNT = 3;
    public static final int MODE_CTR = 32;
    public static final String TLS_CIPHER_2001 = "TLS_CIPHER_2001";
    public static final String TLS_CIPHER_2012 = "TLS_CIPHER_2012";
    public static final String TLS_CIPHER_2012_IANA = "TLS_CIPHER_2012_IANA";
    public static final String TLS_GOSTR341112_256_WITH_KUZNYECHIK_CTR_OMAC = "TLS_GOSTR341112_256_WITH_KUZNYECHIK_CTR_OMAC";
    public static final String TLS_GOSTR341112_256_WITH_MAGMA_CTR_OMAC = "TLS_GOSTR341112_256_WITH_MAGMA_CTR_OMAC";
}
