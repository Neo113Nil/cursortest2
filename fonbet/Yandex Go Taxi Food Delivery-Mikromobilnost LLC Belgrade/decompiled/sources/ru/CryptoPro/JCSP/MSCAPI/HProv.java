package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.dy31;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.yci0;
import defpackage.yu0;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.CryptoPro.JCP.KeyStore.InvalidAliasException;
import ru.CryptoPro.JCP.KeyStore.InvalidPasswordException;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.Util.HexDumpEncoder;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCSP.CAPILogger;
import ru.CryptoPro.JCSP.CSPVersionDependentAlgorithms;
import ru.CryptoPro.JCSP.CSPVersionUtility;
import ru.CryptoPro.JCSP.CStructReader.AuthInfoStructure;
import ru.CryptoPro.JCSP.CStructReader.ContainerExtensionStructure;
import ru.CryptoPro.JCSP.CStructReader.CryptKeysetEnumStructure;
import ru.CryptoPro.JCSP.CStructReader.PinInfoStructure;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.Key.ContainerPassword;
import ru.CryptoPro.JCSP.Key.PublicKeyBlob;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.CryptoPro.JCSP.KeyStore.MetaCSPStore;
import ru.CryptoPro.JCSP.params.DefaultCSPProvider;

/* loaded from: classes4.dex */
public abstract class HProv extends cl_4 {
    public static final int ALG_CLASS_ALL = 57344;
    public static final int ALG_CLASS_ANY = 0;
    public static final int ALG_CLASS_DATA_ENCRYPT = 24576;
    public static final int ALG_CLASS_HASH = 32768;
    public static final int ALG_CLASS_KEY_EXCHANGE = 40960;
    public static final int ALG_CLASS_MSG_ENCRYPT = 16384;
    public static final int ALG_CLASS_SIGNATURE = 8192;
    public static final int ALG_SID_3DES = 3;
    public static final int ALG_SID_3DES_112 = 9;
    public static final int ALG_SID_AES = 17;
    public static final int ALG_SID_AES_128 = 14;
    public static final int ALG_SID_AES_192 = 15;
    public static final int ALG_SID_AES_256 = 16;
    public static final int ALG_SID_ANSI_X9_19_MAC = 66;
    public static final int ALG_SID_CMAC = 62;
    public static final int ALG_SID_DES = 1;
    public static final int ALG_SID_DH_EL_EPHEM = 37;
    public static final int ALG_SID_DH_EL_SF = 36;
    public static final int ALG_SID_DH_EX_EPHEM = 31;
    public static final int ALG_SID_DH_EX_SF = 30;
    public static final int ALG_SID_DH_GR3410_12_256_EPHEM = 71;
    public static final int ALG_SID_DH_GR3410_12_256_SF = 70;
    public static final int ALG_SID_DH_GR3410_12_512_EPHEM = 67;
    public static final int ALG_SID_DH_GR3410_12_512_SF = 66;
    public static final int ALG_SID_ECDH = 5;
    public static final int ALG_SID_ECDSA = 3;
    public static final int ALG_SID_ED25519 = 32;
    public static final int ALG_SID_G28147 = 30;
    public static final int ALG_SID_G28147_MAC = 31;
    public static final int ALG_SID_GENERIC_SECRET = 21;
    public static final int ALG_SID_GOST_GENERIC_SECRET = 22;
    public static final int ALG_SID_GR3410 = 30;
    public static final int ALG_SID_GR3410EL = 35;
    public static final int ALG_SID_GR3410_12_256 = 73;
    public static final int ALG_SID_GR3410_12_512 = 61;
    public static final int ALG_SID_GR3411 = 30;
    public static final int ALG_SID_GR3411_2012_256 = 33;
    public static final int ALG_SID_GR3411_2012_256_HMAC = 52;
    public static final int ALG_SID_GR3411_2012_512 = 34;
    public static final int ALG_SID_GR3411_2012_512_HMAC = 53;
    public static final int ALG_SID_GR3411_HASH = 39;
    public static final int ALG_SID_GR3412_2015_K = 49;
    public static final int ALG_SID_GR3412_2015_M = 48;
    public static final int ALG_SID_GR3413_2015_K_IMIT = 61;
    public static final int ALG_SID_GR3413_2015_M_IMIT = 60;
    public static final int ALG_SID_HMAC = 9;
    public static final int ALG_SID_KDF_TREE_GOSTR3411_2012_256 = 35;
    public static final int ALG_SID_KECCAK_224 = 88;
    public static final int ALG_SID_KECCAK_256 = 89;
    public static final int ALG_SID_KECCAK_384 = 90;
    public static final int ALG_SID_KECCAK_512 = 91;
    public static final int ALG_SID_KEXP_2015_K = 37;
    public static final int ALG_SID_KEXP_2015_M = 36;
    public static final int ALG_SID_MGM_EXPORT_K = 42;
    public static final int ALG_SID_MGM_EXPORT_M = 41;
    public static final int ALG_SID_NO_HASH = 84;
    public static final int ALG_SID_PBKDF2_2012_256 = 59;
    public static final int ALG_SID_PBKDF2_2012_512 = 58;
    public static final int ALG_SID_PBKDF2_94_256 = 64;
    public static final int ALG_SID_PRO12DIVERS = 45;
    public static final int ALG_SID_PRO12_EXP = 33;
    public static final int ALG_SID_PRODIVERS = 38;
    public static final int ALG_SID_PRO_AGREEDKEY_DH = 33;
    public static final int ALG_SID_PRO_EXP = 31;
    public static final int ALG_SID_PRO_SIMMETRYKEY = 34;
    public static final int ALG_SID_RIC1DIVERS = 40;
    public static final int ALG_SID_RSA_ANY = 0;
    public static final int ALG_SID_SCHANNEL_ENC_KEY = 7;
    public static final int ALG_SID_SCHANNEL_MAC_KEY = 3;
    public static final int ALG_SID_SCHANNEL_MASTER_HASH = 2;
    public static final int ALG_SID_SHA1 = 4;
    public static final int ALG_SID_SHA3_224 = 77;
    public static final int ALG_SID_SHA3_256 = 78;
    public static final int ALG_SID_SHA3_384 = 79;
    public static final int ALG_SID_SHA3_512 = 80;
    public static final int ALG_SID_SHA_224 = 285;
    public static final int ALG_SID_SHA_256 = 12;
    public static final int ALG_SID_SHA_384 = 13;
    public static final int ALG_SID_SHA_512 = 14;
    public static final int ALG_SID_SIMPLE_EXP = 32;
    public static final int ALG_SID_SYMMETRIC_512 = 34;
    public static final int ALG_SID_TLS1PRF = 10;
    public static final int ALG_SID_TLS1PRF_2012_256 = 49;
    public static final int ALG_SID_TLS1_MASTER = 6;
    public static final int ALG_SID_TLS1_MASTER_HASH = 32;
    public static final int ALG_SID_TLS1_MASTER_HASH_2012_256 = 54;
    public static final int ALG_TYPE_ANY = 0;
    public static final int ALG_TYPE_BLOCK = 1536;
    public static final int ALG_TYPE_DH = 2560;
    public static final int ALG_TYPE_DSS = 512;
    public static final int ALG_TYPE_GR3410 = 3584;
    public static final int ALG_TYPE_RSA = 1024;
    public static final int ALG_TYPE_SECURECHANNEL = 3072;
    public static final int ALG_TYPE_STREAM = 2048;
    public static final int CALG_3DES = 26115;
    public static final int CALG_3DES_112 = 26121;
    public static final int CALG_AES = 26129;
    public static final int CALG_AES_128 = 26126;
    public static final int CALG_AES_192 = 26127;
    public static final int CALG_AES_256 = 26128;
    public static final int CALG_ANSI_X9_19_MAC = 32834;
    public static final int CALG_CMAC = 32830;
    public static final int CALG_DES = 26113;
    public static final int CALG_DH_EL_EPHEM = 43557;
    public static final int CALG_DH_EL_SF = 43556;
    public static final int CALG_DH_EX = 43550;
    public static final int CALG_DH_EX_EPHEM = 43551;
    public static final int CALG_DH_EX_SF = 43550;
    public static final int CALG_DH_GR3410_12_256_EPHEM = 43591;
    public static final int CALG_DH_GR3410_12_256_SF = 43590;
    public static final int CALG_DH_GR3410_12_512_EPHEM = 43587;
    public static final int CALG_DH_GR3410_12_512_SF = 43586;
    public static final int CALG_ECDH = 43525;
    public static final int CALG_ECDSA = 8707;
    public static final int CALG_ED25519 = 8736;
    public static final int CALG_G28147 = 26142;
    public static final int CALG_G28147_IMIT = 32799;
    public static final int CALG_G28147_MAC = 32799;
    public static final int CALG_GENERIC_SECRET = 26133;
    public static final int CALG_GOST_GENERIC_SECRET = 26134;
    public static final int CALG_GR3410 = 11806;
    public static final int CALG_GR3410EL = 11811;
    public static final int CALG_GR3410_12_256 = 11849;
    public static final int CALG_GR3410_12_512 = 11837;
    public static final int CALG_GR3411 = 32798;
    public static final int CALG_GR3411_2012_256 = 32801;
    public static final int CALG_GR3411_2012_256_HMAC = 32820;
    public static final int CALG_GR3411_2012_512 = 32802;
    public static final int CALG_GR3411_2012_512_HMAC = 32821;
    public static final int CALG_GR3411_HMAC = 32807;
    public static final int CALG_GR3412_2015_K = 26161;
    public static final int CALG_GR3412_2015_M = 26160;
    public static final int CALG_GR3413_2015_K_IMIT = 32829;
    public static final int CALG_GR3413_2015_M_IMIT = 32828;
    public static final int CALG_HMAC = 32777;
    public static final int CALG_KDF_TREE_GOSTR3411_2012_256 = 26147;
    public static final int CALG_KECCAK_224 = 32856;
    public static final int CALG_KECCAK_256 = 32857;
    public static final int CALG_KECCAK_384 = 32858;
    public static final int CALG_KECCAK_512 = 32859;
    public static final int CALG_KEXP_2015_K = 26149;
    public static final int CALG_KEXP_2015_M = 26148;
    public static final int CALG_MGM_EXPORT_K = 26154;
    public static final int CALG_MGM_EXPORT_M = 26153;
    public static final int CALG_NO_HASH = 32852;
    public static final int CALG_OSCAR_DIVERS = 26152;
    public static final int CALG_PBKDF2_2012_256 = 32827;
    public static final int CALG_PBKDF2_2012_512 = 32826;
    public static final int CALG_PBKDF2_94_256 = 32832;
    public static final int CALG_PRO12_DIVERS = 26157;
    public static final int CALG_PRO12_EXPORT = 26145;
    public static final int CALG_PRO_AGREEDKEY_DH = 42529;
    public static final int CALG_PRO_DIVERS = 26150;
    public static final int CALG_PRO_EXPORT = 26143;
    public static final int CALG_RIC_DIVERS = 26152;
    public static final int CALG_RSA_KEYX = 41984;
    public static final int CALG_RSA_SIGN = 9216;
    public static final int CALG_SCHANNEL_ENC_KEY = 19463;
    public static final int CALG_SCHANNEL_MAC_KEY = 19459;
    public static final int CALG_SCHANNEL_MASTER_HASH = 19458;
    public static final int CALG_SHA1 = 32772;
    public static final int CALG_SHA3_224 = 32845;
    public static final int CALG_SHA3_256 = 32846;
    public static final int CALG_SHA3_384 = 32847;
    public static final int CALG_SHA3_512 = 32848;
    public static final int CALG_SHA_224 = 33053;
    public static final int CALG_SHA_256 = 32780;
    public static final int CALG_SHA_384 = 32781;
    public static final int CALG_SHA_512 = 32782;
    public static final int CALG_SIMMETRYKEY = 26142;
    public static final int CALG_SIMPLE_EXPORT = 26144;
    public static final int CALG_SYMMETRIC_512 = 26146;
    public static final int CALG_TLS1PRF = 32778;
    public static final int CALG_TLS1PRF_2012_256 = 32817;
    public static final int CALG_TLS1_ENC_KEY = 27655;
    public static final int CALG_TLS1_MAC_KEY = 27651;
    public static final int CALG_TLS1_MASTER = 19462;
    public static final int CALG_TLS1_MASTER_HASH = 32800;
    public static final int CALG_TLS1_MASTER_HASH_2012_256 = 32822;
    public static final int CP_CRYPT_DH_ALLOWED = 8192;
    public static final int CP_CRYPT_PUBLICKEY_FROM_CERT = 65536;
    public static final int CP_IMIT_NO_KEY_LOAD = 16;
    public static final int CP_PUBKEY_REUSABLE = 8192;
    public static final int CP_REUSABLE_HMAC = 4;
    public static final int CRYPT_ALG_PARAM_OID_GROUP_ID = 20;
    public static final int CRYPT_ARCHIVABLE = 16384;
    public static final int CRYPT_CREATE_IV = 512;
    public static final int CRYPT_CREATE_SALT = 4;
    public static final int CRYPT_DATA_KEY = 2048;
    public static final int CRYPT_DEFAULT_CONTAINER_OPTIONAL = 128;
    public static final int CRYPT_DELETEKEYSET = 16;
    public static final int CRYPT_EX2 = 524288;
    public static final int CRYPT_EXPORTABLE = 1;
    public static final int CRYPT_FASTSGC = 2;
    public static final int CRYPT_FILTER_PROVIDER_TYPE = 256;
    public static final int CRYPT_FIRST = 1;
    public static final int CRYPT_FLAG_IPSEC = 16;
    public static final int CRYPT_FLAG_PCT1 = 1;
    public static final int CRYPT_FLAG_SIGNING = 32;
    public static final int CRYPT_FLAG_SSL2 = 2;
    public static final int CRYPT_FLAG_SSL3 = 4;
    public static final int CRYPT_FLAG_TLS1 = 8;
    public static final int CRYPT_FQCN = 16;
    public static final int CRYPT_IMPL_HARDWARE = 1;
    public static final int CRYPT_IMPL_MIXED = 3;
    public static final int CRYPT_IMPL_REMOVABLE = 8;
    public static final int CRYPT_IMPL_SOFTWARE = 2;
    public static final int CRYPT_IMPL_UNKNOWN = 4;
    public static final int CRYPT_INITIATOR = 64;
    public static final int CRYPT_KEK = 1024;
    public static final int CRYPT_KEYSET_ENUM_FLAG = 1;
    public static final int CRYPT_MACHINE_KEYSET = 32;
    public static final int CRYPT_NEWKEYSET = 8;
    public static final int CRYPT_NEXT = 2;
    public static final int CRYPT_NO_SALT = 16;
    public static final int CRYPT_ONLINE = 128;
    public static final int CRYPT_PREGEN = 64;
    public static final int CRYPT_PROMIX_MODE = 1;
    public static final int CRYPT_PSTORE = 2;
    public static final int CRYPT_RECIPIENT = 16;
    public static final int CRYPT_SEC_DESCR = 1;
    public static final int CRYPT_SF = 256;
    public static final int CRYPT_SGC = 1;
    public static final int CRYPT_SGCKEY = 8192;
    public static final int CRYPT_SGC_ENUM = 4;
    public static final int CRYPT_SILENT = 64;
    public static final int CRYPT_SIMPLEMIX_MODE = 0;
    public static final int CRYPT_UI_PROMPT = 4;
    public static final int CRYPT_UNIQUE = 8;
    public static final int CRYPT_UPDATE_KEY = 8;
    public static final int CRYPT_USER_KEYSET = 4096;
    public static final int CRYPT_USER_PROTECTED = 2;
    public static final int CRYPT_VERIFYCONTEXT = -268435456;
    public static final int CRYPT_VOLATILE = 4096;
    public static final int DIVERSKEYBLOB = 112;
    public static final int EXPORT_IMIT_SIZE = 4;
    public static final int EXPORT_PRIVATE_KEYS = 4;
    public static final int G28147_KEYLEN = 32;
    public static final int HP_ALGID = 1;
    public static final int HP_HASHCOPYVAL = 9;
    public static final int HP_HASHSTARTVECT = 8;
    public static final int HP_OID = 10;
    public static final int HP_OPAQUEBLOB = 12;
    public static final int HP_OPEN = 11;
    public static final int KDF_TREE_DIVERSBLOB = 114;
    public static final int PKCS12_EXPORT_SILENT = 64;
    public static final int PKCS12_IMPORT_SILENT = 64;
    public static final int PKCS12_INCLUDE_EXTENDED_PROPERTIES = 16;
    public static final int PKCS12_NO_PERSIST_KEY = 32768;
    public static final int PKCS8KEYBLOB = 25;
    public static final int PP_ADMIN_CHECKPUBLIC = 113;
    public static final int PP_ADMIN_PIN = 31;
    public static final int PP_APPLI_CERT = 18;
    public static final int PP_AUTH_INFO = 218;
    public static final int PP_BIO_STATISTICA_LEN = 97;
    public static final int PP_CACHE_SIZE = 115;
    public static final int PP_CERTCHAIN = 9;
    public static final int PP_CHANGE_PASSWORD = 7;
    public static final int PP_CHANGE_PIN = 108;
    public static final int PP_CHECKPUBLIC = 112;
    public static final int PP_CIPHEROID = 93;
    public static final int PP_CLIENT_HWND = 1;
    public static final int PP_CONTAINER = 6;
    public static final int PP_CONTAINER_DEFAULT = 135;
    public static final int PP_CONTAINER_EXTENSION = 132;
    public static final int PP_CONTAINER_EXTENSION_DEL = 134;
    public static final int PP_CONTAINER_STATUS = 146;
    public static final int PP_CONTEXT_INFO = 11;
    public static final int PP_DELETEKEY = 24;
    public static final int PP_DELETE_KEYSET = 125;
    public static final int PP_DELETE_SAVED_PASSWD = 126;
    public static final int PP_DHOID = 95;
    public static final int PP_DRVCONTAINER = 101;
    public static final int PP_ENUMALGS = 1;
    public static final int PP_ENUMALGS_EX = 22;
    public static final int PP_ENUMCONTAINERS = 2;
    public static final int PP_ENUMELECTROOTS = 26;
    public static final int PP_ENUMEX_SIGNING_PROT = 40;
    public static final int PP_ENUMMANDROOTS = 25;
    public static final int PP_ENUMOIDS_EX = 91;
    public static final int PP_ENUMREADERS = 114;
    public static final int PP_ENUM_CIPHEROID = 104;
    public static final int PP_ENUM_CONTAINER_EXTENSION = 133;
    public static final int PP_ENUM_DHOID = 106;
    public static final int PP_ENUM_HASHOID = 103;
    public static final int PP_ENUM_LOG = 137;
    public static final int PP_ENUM_SIGNATUREOID = 105;
    public static final int PP_EXPORT_CSP = 172;
    public static final int PP_FAST_CODE = 131;
    public static final int PP_FQCN = 111;
    public static final int PP_HANDLE_COUNT = 163;
    public static final int PP_HASHOID = 92;
    public static final int PP_HCRYPTPROV = 109;
    public static final int PP_IMPTYPE = 3;
    public static final int PP_INFO = 118;
    public static final int PP_KEYEXCHANGE_ALG = 14;
    public static final int PP_KEYEXCHANGE_KEYSIZE = 12;
    public static final int PP_KEYEXCHANGE_PIN = 32;
    public static final int PP_KEYSET_SEC_DESCR = 8;
    public static final int PP_KEYSET_TYPE = 27;
    public static final int PP_KEYSPEC = 39;
    public static final int PP_KEYSTORAGE = 17;
    public static final int PP_KEYX_KEYSIZE_INC = 35;
    public static final int PP_KEY_TYPE_SUBTYPE = 10;
    public static final int PP_LAST_ERROR = 90;
    public static final int PP_LCD_QUERY = 136;
    public static final int PP_LICENSE = 158;
    public static final int PP_MUTEX_ARG = 102;
    public static final int PP_NAME = 4;
    public static final int PP_NK_SYNC = 117;
    public static final int PP_PASSWD_TERM = 123;
    public static final int PP_PIN_INFO = 120;
    public static final int PP_PROVTYPE = 16;
    public static final int PP_RANDOM = 100;
    public static final int PP_REBOOT = 98;
    public static final int PP_REFCOUNT = 171;
    public static final int PP_RESERVED1 = 96;
    public static final int PP_SAME_MEDIA = 124;
    public static final int PP_SECURITY_LEVEL = 129;
    public static final int PP_SELECT_CONTAINER = 110;
    public static final int PP_SESSION_KEYSIZE = 20;
    public static final int PP_SET_PIN = 107;
    public static final int PP_SGC_INFO = 37;
    public static final int PP_SIGNATUREOID = 94;
    public static final int PP_SIGNATURE_ALG = 15;
    public static final int PP_SIGNATURE_KEYSIZE = 13;
    public static final int PP_SIGNATURE_PIN = 33;
    public static final int PP_SIG_KEYSIZE_INC = 34;
    public static final int PP_SYM_KEYSIZE = 19;
    public static final int PP_UI_PROMPT = 21;
    public static final int PP_UNIQUE_CONTAINER = 36;
    public static final int PP_USE_HARDWARE_RNG = 38;
    public static final int PP_VERSION = 5;
    public static final int PP_VERSION_EX = 138;
    public static final int PP_VERSION_TIMESTAMP = 127;
    public static final String PROV_CSP_MASK = "Crypto-Pro";
    public static final int PROV_ECDSA = 16;
    public static final int PROV_EDDSA = 32;
    public static final int PROV_GOST_2001_DH = 75;
    public static final int PROV_GOST_2012_256 = 80;
    public static final int PROV_GOST_2012_512 = 81;
    public static final int PROV_GOST_94_DH = 71;
    public static final int PROV_RSA_1 = 1;
    public static final int PROV_RSA_24 = 24;
    public static final int REPORT_NOT_ABLE_TO_EXPORT_PRIVATE_KEY = 2;
    public static final int REPORT_NO_PRIVATE_KEY = 1;
    public static final int SCHANNEL_ENC_KEY = 1;
    public static final int SCHANNEL_HASH_ALG = 3;
    public static final int SCHANNEL_MAC_KEY = 0;
    public static final int SCHANNEL_PRF_ALG = 2;
    public static final int SEANCE_VECTOR_LEN = 8;
    public static final int SECRET_KEY_BITLEN = 256;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SOURCE_ID_CONT = 3;
    public static final int SOURCE_ID_ERROR = 6;
    public static final int SOURCE_ID_FINAL = 15;
    public static final int SOURCE_ID_HASH = 1;
    public static final int SOURCE_ID_KEY = 2;
    public static final int SOURCE_ID_OTHER = 7;
    public static final int SOURCE_ID_PROV = 4;
    public static final int SOURCE_ID_RAND = 5;
    public static final int SYMMETRIC_KEY_512_BITLEN = 512;
    public static final int SYMMETRIC_KEY_512_LEN = 64;
    public static final int USERKEY_SIMMERYMASTERKEY = 27;
    private long c;
    private cl_7 d = null;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean(false);
    private static final Boolean b = Boolean.valueOf(GetProperty.getBooleanProperty("add.provider.name", false));
    static CharsetEncoder a = Charset.forName("cp1251").newEncoder();
    private static final Map g = new ConcurrentHashMap();

    public HProv(long j) {
        this.c = 0L;
        this.c = j;
    }

    private synchronized void a(int i, boolean z) throws MSException {
        if (this.c != 0 && isBeDeleted()) {
            CAPILogger.log("CryptReleaseContext", new Object[]{Long.valueOf(this.c), 0}, 0L, "for " + a(i));
            int cryptReleaseContext = CAPI.cryptReleaseContext(this.c, 0);
            if (cryptReleaseContext != 0) {
                CAPILogger.error("CryptReleaseContext", new Object[]{Long.valueOf(this.c), 0}, cryptReleaseContext, "for " + a(i));
                MSProvParamException.procCode(cryptReleaseContext);
            }
        }
    }

    public static int b(String str, ReaderInfo readerInfo, String str2, int i) throws UnrecoverableKeyException {
        int i2;
        HProv provider = getProvider(i);
        int i3 = -1;
        try {
            if (str2 == null) {
                try {
                    try {
                        str2 = readerInfo.getProviderName(i);
                    } catch (MSException e) {
                        throw new IllegalArgumentException(e);
                    }
                } catch (StructException e2) {
                    throw new IllegalArgumentException(e2);
                } catch (MSContextException e3) {
                    if (!e3.isBadKeyset()) {
                        throw new IllegalArgumentException(e3);
                    }
                    provider.releaseContext(7);
                    return -1;
                }
            }
            provider.acquireContext(str, str2, 64);
            int[] getProvParamLength = provider.getGetProvParamLength(PP_CONTAINER_STATUS, 1);
            if (getProvParamLength != null && (i2 = getProvParamLength[0]) > 4) {
                byte[] bArr = new byte[i2];
                provider.getProvParam(PP_CONTAINER_STATUS, bArr, getProvParamLength, 1);
                CryptKeysetEnumStructure cryptKeysetEnumStructure = new CryptKeysetEnumStructure();
                cryptKeysetEnumStructure.read(new ByteArrayInputStream(bArr));
                i3 = cryptKeysetEnumStructure.getCount();
            }
            provider.releaseContext(7);
            return i3;
        } catch (Throwable th) {
            provider.releaseContext(7);
            throw th;
        }
    }

    private static void c(String str) throws InvalidAliasException {
        String[] a2 = ru.CryptoPro.JCSP.KeyStore.cl_0.a(str);
        if (a2[0].isEmpty()) {
            a2 = ru.CryptoPro.JCSP.KeyStore.cl_0.b(str);
        }
        if (a2[1].indexOf(92) >= 0) {
            throw new InvalidAliasException();
        }
        if (str.indexOf("::::") >= 0) {
            throw new InvalidAliasException();
        }
        if (str.indexOf("****") >= 0) {
            throw new InvalidAliasException();
        }
        if (str.indexOf(CSPStore.PROVNAME_PREFIX) >= 0) {
            throw new InvalidAliasException();
        }
        if (str.endsWith("/")) {
            throw new InvalidAliasException();
        }
    }

    public static void deleteContainer(String str, String str2, ReaderInfo readerInfo, ContainerPassword containerPassword, int i) throws AccessControlException, UnrecoverableKeyException {
        JCSPLogger.subEnter();
        HProv provider = getProvider(i);
        String providerName = readerInfo != null ? readerInfo.getProviderName(i) : null;
        if (str == null) {
            str = providerName;
        }
        if (containerPassword != null) {
            try {
                try {
                    provider.acquireContext(str2, str, 0);
                    try {
                        provider.setProvParam(32, containerPassword.getPassword(), 0);
                        provider.setProvParam(PP_DELETE_KEYSET, null, 0);
                    } catch (MSProvParamException e) {
                        if (!e.isWrongPassword()) {
                            throw new IllegalArgumentException(e);
                        }
                        AccessControlException accessControlException = new AccessControlException("Password is not valid");
                        accessControlException.initCause(e);
                        throw accessControlException;
                    } catch (MSException e2) {
                        throw new IllegalArgumentException(e2);
                    }
                } finally {
                }
            } catch (MSContextException e3) {
                if (!e3.isBadKeyset()) {
                    throw new IllegalArgumentException(e3);
                }
                throw new UnrecoverableKeyException();
            } catch (MSException e4) {
                throw new IllegalArgumentException(e4);
            }
        } else {
            try {
                try {
                    provider.acquireContext(str2, str, 16);
                } finally {
                }
            } catch (MSContextException e5) {
                if (e5.isBadKeyset()) {
                    UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException(e5.getMessage());
                    unrecoverableKeyException.initCause(e5);
                    throw unrecoverableKeyException;
                }
                if (!e5.b()) {
                    throw new IllegalArgumentException(e5);
                }
                UnrecoverableKeyException unrecoverableKeyException2 = new UnrecoverableKeyException(e5.getMessage());
                unrecoverableKeyException2.initCause(e5);
                throw unrecoverableKeyException2;
            } catch (MSException e6) {
                throw new IllegalArgumentException(e6);
            }
        }
        JCSPLogger.subExit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0121, code lost:
    
        if (r11 != null) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013c A[LOOP:0: B:11:0x0033->B:60:0x013c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Vector enumContainers(int i, ReaderInfo readerInfo) {
        int i2;
        HProv hProv;
        String str;
        int i3 = i;
        JCSPLogger.subEnter();
        int i4 = 0;
        Vector vector = new Vector(0);
        List<String> providerNames = readerInfo.getProviderNames(i3);
        boolean z = true;
        Object[] objArr = b.booleanValue() || DefaultCSPProvider.isAddProviderName();
        Object[] objArr2 = objArr == true && providerNames.size() > 1;
        for (String str2 : providerNames) {
            int i5 = 24;
            if (CSPVersionUtility.isCSPVersion50OrHigher() && i3 == 24) {
                i5 = 280;
            }
            HProv hProv2 = null;
            int[] iArr = null;
            hProv2 = null;
            try {
                try {
                    String makePrefix = MetaCSPStore.makePrefix(readerInfo.getReaderName());
                    i2 = 2;
                    try {
                        hProv = getProvider(i3);
                        try {
                            try {
                                hProv.acquireContext(makePrefix, str2, -268435392);
                                iArr = hProv.getGetProvParamLength(2, i5 | 1);
                            } catch (Exception e) {
                                e = e;
                                try {
                                    JCSPLogger.ignoredException(e);
                                    if (iArr == null) {
                                    }
                                } catch (MSException e2) {
                                    e = e2;
                                    throw new IllegalArgumentException(e);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            hProv2 = hProv;
                            try {
                                JCSPLogger.thrown(th);
                            } finally {
                                if (hProv2 != null) {
                                    hProv2.releaseContext(7);
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        hProv = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (MSProvParamException e4) {
                e = e4;
            } catch (MSException e5) {
                e = e5;
            }
            if (iArr == null) {
                boolean z2 = z;
                while (true) {
                    try {
                        int i6 = iArr[i4];
                        byte[] bArr = new byte[i6];
                        hProv.getProvParam(i2, bArr, new int[]{i6}, z2 ? i5 | 1 : i5);
                        int nullChar = CPString.getNullChar(bArr, i4);
                        Charset charset = StandardCharsets.UTF_8;
                        String str3 = new String(bArr, i4, nullChar, charset);
                        if (!a(str3)) {
                            try {
                                str3 = new String(bArr, 0, nullChar, "cp1251");
                            } catch (MSProvParamException e6) {
                                e = e6;
                                hProv2 = hProv;
                                if (!e.enumFinished()) {
                                    throw new IllegalArgumentException(e);
                                }
                                if (hProv2 != null) {
                                    hProv2.releaseContext(7);
                                }
                                if (objArr == true) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                hProv2 = hProv;
                                JCSPLogger.thrown(th);
                            }
                        }
                        int i7 = nullChar + 1;
                        if (i7 < i6) {
                            int nullChar2 = CPString.getNullChar(bArr, i7) - i7;
                            str = new String(bArr, i7, nullChar2, charset);
                            if (!a(str)) {
                                str = new String(bArr, i7, nullChar2, "cp1251");
                            }
                        } else {
                            str = "";
                        }
                        String str4 = objArr2 == true ? str2 + CSPStore.PROVNAME_PREFIX : "";
                        vector.add(new cl_1(str4 + str, str4 + str3));
                        z2 = false;
                        i4 = 0;
                        i2 = 2;
                    } catch (MSProvParamException e7) {
                        e = e7;
                    }
                }
            } else {
                if (objArr == true) {
                    break;
                }
                i3 = i;
                i4 = 0;
                z = true;
            }
        }
        JCSPLogger.subExit();
        return vector;
    }

    public static synchronized Vector enumInstalledProviders(int i) {
        Vector vector;
        synchronized (HProv.class) {
            JCSPLogger.subEnter();
            JCSPLogger.fine("Loading of installed providers with type: " + i + "...");
            vector = new Vector(16);
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int i2 = 0;
            while (a(i2, 0, iArr, null, iArr2) == 0) {
                try {
                    if (iArr[0] != i) {
                        i2++;
                    } else {
                        int i3 = iArr2[0];
                        byte[] bArr = new byte[i3];
                        int i4 = i2 + 1;
                        if (a(i2, 0, iArr, bArr, iArr2) == 0) {
                            int i5 = i3 - 1;
                            if (bArr[i5] == 0) {
                                i3 = i5;
                            }
                            byte[] bArr2 = new byte[i3];
                            System.arraycopy(bArr, 0, bArr2, 0, i3);
                            String str = new String(bArr2);
                            if (str.contains(PROV_CSP_MASK)) {
                                vector.add(str);
                            }
                        }
                        i2 = i4;
                    }
                } catch (Exception e) {
                    JCSPLogger.thrown(e);
                }
            }
            if (vector.isEmpty()) {
                JCSPLogger.fine("Provider with type " + i + " not found.");
            }
            JCSPLogger.fine("Loading of installed providers completed.");
            JCSPLogger.subExit();
        }
        return vector;
    }

    public static synchronized Vector enumReaders(String str, int i) {
        Vector vector;
        int[] iArr;
        synchronized (HProv.class) {
            JCSPLogger.subEnter();
            JCSPLogger.fine("Enumerating readers of provider " + str + " (type = " + i + ")...");
            vector = new Vector(0);
            HProv provider = getProvider(i);
            try {
                provider.createWithoutContainer(str);
                iArr = provider.getGetProvParamLength(114, 1);
            } catch (Exception e) {
                JCSPLogger.ignoredException(e);
                iArr = null;
            }
            if (iArr != null) {
                int i2 = 1;
                while (true) {
                    try {
                        try {
                            int i3 = iArr[0];
                            int[] iArr2 = {i3};
                            byte[] bArr = new byte[i3];
                            provider.getProvParam(114, bArr, iArr2, i2);
                            vector.add(CPString.getStrings(bArr)[1]);
                            i2 = 0;
                        } catch (MSProvParamException e2) {
                            if (!e2.enumFinished()) {
                                throw new IllegalArgumentException(e2);
                            }
                        } catch (MSException e3) {
                            throw new IllegalArgumentException(e3);
                        }
                    } finally {
                        provider.releaseContext(7);
                    }
                }
            }
            JCSPLogger.fine("Enumerating of readers completed.");
            JCSPLogger.subExit();
        }
        return vector;
    }

    public static HProv getInstanceByParamSet(AlgIdInterface algIdInterface) {
        return AlgorithmGroups.b(algIdInterface.getOID());
    }

    public static HProv getProvider(int i) {
        return AlgorithmGroups.b(i);
    }

    public static HProv getProvider_2001() {
        return new CSPProv2001();
    }

    public static HProv getProvider_2012_256() {
        return new CSPProv2012_256();
    }

    public static HProv getProvider_2012_512() {
        return new CSPProv2012_512();
    }

    public static HProv getProvider_ECDSA() {
        return new CSPProvECDSA();
    }

    public static HProv getProvider_RSA() {
        return new CSPProvRSA();
    }

    public static boolean isForeignProvider(String str) {
        return str.equalsIgnoreCase("JCSPRSA") || str.equalsIgnoreCase("JCSPECDSA") || str.equalsIgnoreCase("JCSPEDDSA");
    }

    public void acquireContext(String str, String str2, int i) throws MSException {
        if (this.f.get()) {
            ny61.r("Provider context has been already freed.");
            return;
        }
        if (this.c != 0) {
            ny61.r("Provider context has been already set.");
            return;
        }
        long[] jArr = new long[1];
        if ((i & 16) == 0) {
            setBeDeleted();
        }
        if (DefaultCSPProvider.getKeySetType() == 1) {
            i |= 32;
        }
        int provType = getProvType();
        CAPILogger.log("CryptAcquireContext", new Object[]{str, str2, Integer.valueOf(provType), Integer.valueOf(i)}, 0L, new String[0]);
        int cryptAcquireContext = CAPI.cryptAcquireContext(jArr, str, str2, provType, i);
        if (cryptAcquireContext != 0) {
            if (str != null && (i & 8) == 0 && (cryptAcquireContext == -2146893799 || cryptAcquireContext == -2146893802)) {
                str = b(str);
                if (str != null) {
                    CAPILogger.log("CryptAcquireContext", new Object[]{str, str2, Integer.valueOf(provType), Integer.valueOf(i)}, 0L, oyr.r(new StringBuilder("again after error 0x"), cryptAcquireContext));
                    cryptAcquireContext = CAPI.cryptAcquireContext(jArr, str, str2, provType, i);
                }
                if (cryptAcquireContext != 0) {
                    CAPILogger.error("CryptAcquireContext", new Object[]{str, str2, Integer.valueOf(provType), Integer.valueOf(i)}, cryptAcquireContext, new String[0]);
                }
            }
            MSContextException.procCode(cryptAcquireContext);
        }
        this.c = jArr[0];
        this.d = new cl_7(str2, provType);
        CAPILogger.log("CryptAcquireContext", new Object[]{str, str2, Integer.valueOf(provType), Integer.valueOf(i)}, this.c, new String[0]);
    }

    public void changePin(int i, byte b2, byte[] bArr, int i2) throws MSException {
        CAPILogger.log("ChangePin", new Object[]{Long.valueOf(this.c), Integer.valueOf(i), Byte.valueOf(b2), bArr, Integer.valueOf(i2)}, 0L, new String[0]);
        int changePin = CAPI.changePin(this.c, i, b2, bArr, i2);
        if (changePin != 0) {
            CAPILogger.error("ChangePin", new Object[]{Long.valueOf(this.c), Integer.valueOf(i), Byte.valueOf(b2), bArr, Integer.valueOf(i2)}, changePin, new String[0]);
            MSProvParamException.procCode(changePin);
        }
    }

    public void contextAddRef(int i, long j) throws MSException {
        long j2 = this.c;
        if (j2 != 0) {
            String str = i != 1 ? i != 2 ? "for ref handle" : "for key handle" : "for hash handle";
            Object[] objArr = {Long.valueOf(j2)};
            StringBuilder v = oyr.v(str, " = 0x");
            v.append(Long.toHexString(j));
            CAPILogger.log("CryptContextAddRef", objArr, 0L, v.toString());
            int cryptContextAddRef = CAPI.cryptContextAddRef(this.c, 0);
            if (cryptContextAddRef != 0) {
                Object[] objArr2 = {Long.valueOf(this.c)};
                StringBuilder v2 = oyr.v(str, " = 0x");
                v2.append(Long.toHexString(j));
                CAPILogger.error("CryptContextAddRef", objArr2, cryptContextAddRef, v2.toString());
                MSProvParamException.procCode(cryptContextAddRef);
            }
        }
    }

    public void createContainer(ru.CryptoPro.JCSP.KeyStore.cl_0 cl_0Var, String str, ContainerPassword containerPassword) throws UnrecoverableKeyException {
        try {
            c(cl_0Var.c());
            a(cl_0Var.d(), str, false, containerPassword, 8, false);
        } catch (KeyStoreException e) {
            UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException(e.getMessage());
            unrecoverableKeyException.initCause(e);
            throw unrecoverableKeyException;
        } catch (MSContextException e2) {
            UnrecoverableKeyException unrecoverableKeyException2 = new UnrecoverableKeyException(e2.getMessage());
            unrecoverableKeyException2.initCause(e2);
            throw unrecoverableKeyException2;
        }
    }

    public void createContainerWithSetPin(ru.CryptoPro.JCSP.KeyStore.cl_0 cl_0Var, String str, ContainerPassword containerPassword) throws UnrecoverableKeyException, InvalidAliasException {
        try {
            c(cl_0Var.c());
            a(cl_0Var.d(), str, true, containerPassword, 8, false);
        } catch (MSContextException e) {
            UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException(e.getMessage());
            unrecoverableKeyException.initCause(e);
            throw unrecoverableKeyException;
        }
    }

    public HHash createHash(int i, HKey hKey, int i2) throws MSException {
        long[] jArr = new long[1];
        if (hKey == null) {
            CAPILogger.log("CryptCreateHash", new Object[]{Long.valueOf(this.c), Integer.valueOf(i), 0, Integer.valueOf(i2)}, 0L, new String[0]);
            int cryptCreateHash = CAPI.cryptCreateHash(this.c, i, 0L, i2, jArr);
            long j = this.c;
            if (cryptCreateHash != 0) {
                CAPILogger.error("CryptCreateHash", new Object[]{Long.valueOf(j), Integer.valueOf(i), 0, Integer.valueOf(i2)}, cryptCreateHash, new String[0]);
                MSHashNSignException.procCode(cryptCreateHash);
            } else {
                CAPILogger.log("CryptCreateHash", new Object[]{Long.valueOf(j), Integer.valueOf(i), 0, Integer.valueOf(i2)}, jArr[0], new String[0]);
            }
            return new HHash(this, jArr[0]);
        }
        try {
            hKey.readLock();
            CAPILogger.log("CryptCreateHash", new Object[]{Long.valueOf(this.c), Integer.valueOf(i), Long.valueOf(hKey.getHandle()), Integer.valueOf(i2)}, 0L, new String[0]);
            int cryptCreateHash2 = CAPI.cryptCreateHash(this.c, i, hKey.getHandle(), i2, jArr);
            if (cryptCreateHash2 != 0) {
                CAPILogger.error("CryptCreateHash", new Object[]{Long.valueOf(this.c), Integer.valueOf(i), Long.valueOf(hKey.getHandle()), Integer.valueOf(i2)}, cryptCreateHash2, new String[0]);
                MSHashNSignException.procCode(cryptCreateHash2);
            } else {
                CAPILogger.log("CryptCreateHash", new Object[]{Long.valueOf(this.c), Integer.valueOf(i), Long.valueOf(hKey.getHandle()), Integer.valueOf(i2)}, jArr[0], new String[0]);
            }
            HHash hHash = new HHash(this, jArr[0]);
            hKey.readUnlock();
            return hHash;
        } catch (Throwable th) {
            hKey.readUnlock();
            throw th;
        }
    }

    public void createWithoutContainer(String str) {
        try {
            acquireContext(null, str, -268435456);
        } catch (MSContextException e) {
            if (e.a()) {
                throw new ProviderException("Bad provider library signature", e);
            }
        } catch (MSException e2) {
            yci0.r(e2);
        }
    }

    public HKey cryptDeriveKey(int i, long j, int i2) throws MSException {
        long[] jArr = new long[1];
        CAPILogger.log("CryptDeriveKey", new Object[]{Long.valueOf(this.c), Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2)}, 0L, new String[0]);
        int cryptDeriveKey = CAPI.cryptDeriveKey(this.c, i, j, i2, jArr);
        long j2 = this.c;
        if (cryptDeriveKey != 0) {
            CAPILogger.error("CryptDeriveKey", new Object[]{Long.valueOf(j2), Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2)}, cryptDeriveKey, new String[0]);
            MSKeyException.procCode(cryptDeriveKey);
        } else {
            CAPILogger.log("CryptDeriveKey", new Object[]{Long.valueOf(j2), Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2)}, jArr[0], new String[0]);
        }
        return new HKey(this, jArr[0], i);
    }

    public Vector enumContainerExtensions() {
        Vector vector = new Vector(0);
        int[] iArr = {0};
        int i = 1;
        try {
            getProvParam(PP_ENUM_CONTAINER_EXTENSION, null, iArr, 1);
        } catch (Exception e) {
            JCSPLogger.ignoredException(e);
        }
        if (iArr[0] <= 0) {
            return vector;
        }
        int[] iArr2 = new int[1];
        while (true) {
            try {
                iArr2[0] = iArr[0];
                byte[] bArr = new byte[iArr[0]];
                getProvParam(PP_ENUM_CONTAINER_EXTENSION, bArr, iArr2, i);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                ContainerExtensionStructure containerExtensionStructure = new ContainerExtensionStructure();
                containerExtensionStructure.read(byteArrayInputStream);
                vector.add(containerExtensionStructure);
                i = 0;
            } catch (StructException | MSException unused) {
                return null;
            } catch (MSProvParamException e2) {
                if (e2.enumFinished()) {
                    return vector;
                }
                return null;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof HProv)) {
            HProv hProv = (HProv) obj;
            if (getProvType() == hProv.getProvType() && this.c == hProv.c && this.e == hProv.e && this.f == hProv.f) {
                return true;
            }
        }
        return false;
    }

    public HKey genKey(int i, int i2) throws MSException {
        long[] jArr = new long[1];
        CAPILogger.log("CryptGenKey", new Object[]{Long.valueOf(this.c), Integer.valueOf(i), Integer.valueOf(i2)}, 0L, new String[0]);
        int cryptGenKey = CAPI.cryptGenKey(this.c, i, i2, jArr);
        long j = this.c;
        if (cryptGenKey != 0) {
            CAPILogger.error("CryptGenKey", new Object[]{Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)}, cryptGenKey, new String[0]);
            MSKeyException.procCode(cryptGenKey);
        } else {
            CAPILogger.log("CryptGenKey", new Object[]{Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)}, jArr[0], new String[0]);
        }
        return new HKey(this, jArr[0], 0);
    }

    public void genRandom(int i, byte[] bArr) throws MSException {
        CAPILogger.log("CryptGenRandom", new Object[]{Long.valueOf(this.c), Integer.valueOf(i)}, 0L, new String[0]);
        int cryptGenRandom = CAPI.cryptGenRandom(this.c, i, bArr);
        if (cryptGenRandom != 0) {
            CAPILogger.error("CryptGenRandom", new Object[]{Long.valueOf(this.c), Integer.valueOf(i)}, cryptGenRandom, new String[0]);
            MSException.procCode(cryptGenRandom);
        }
    }

    public String getContainerName() {
        return CPString.getString(getProvParam(6, 0));
    }

    public String getFullName() {
        return CPString.getString(getProvParam(111, 0));
    }

    public int[] getGetProvParamLength(int i, int i2) {
        int[] iArr = {0};
        try {
            getProvParam(i, null, iArr, i2);
            return iArr;
        } catch (MSProvParamException | MSException e) {
            yci0.r(e);
            return null;
        }
    }

    public long getHandle() {
        return this.c;
    }

    public void getProvParam(int i, byte[] bArr, int[] iArr, int i2) throws MSException {
        CAPILogger.log("CryptGetProvParam", new Object[]{Long.valueOf(this.c), Integer.valueOf(i), bArr, iArr, Integer.valueOf(i2)}, 0L, new String[0]);
        int cryptGetProvParam = CAPI.cryptGetProvParam(this.c, i, bArr, iArr, i2);
        if (cryptGetProvParam != 0) {
            CAPILogger.error("CryptGetProvParam", new Object[]{Long.valueOf(this.c), Integer.valueOf(i), bArr, iArr, Integer.valueOf(i2)}, cryptGetProvParam, new String[0]);
            MSProvParamException.procCode(cryptGetProvParam);
        }
    }

    public abstract int getProvType();

    public void getRandom(byte[] bArr) {
        try {
            genRandom(bArr.length, bArr);
        } catch (MSException e) {
            yci0.r(e);
        }
    }

    public String getUniqueName() {
        return CPString.getString(getProvParam(36, 0));
    }

    public HKey getUserKey(int i) throws MSException {
        long[] jArr = new long[1];
        CAPILogger.log("CryptGetUserKey", new Object[]{Long.valueOf(this.c), Integer.valueOf(i)}, 0L, new String[0]);
        int cryptGetUserKey = CAPI.cryptGetUserKey(this.c, i, jArr);
        long j = this.c;
        if (cryptGetUserKey != 0) {
            CAPILogger.error("CryptGetUserKey", new Object[]{Long.valueOf(j), Integer.valueOf(i)}, cryptGetUserKey, new String[0]);
            MSKeyException.procCode(cryptGetUserKey);
        } else {
            CAPILogger.log("CryptGetUserKey", new Object[]{Long.valueOf(j), Integer.valueOf(i)}, jArr[0], new String[0]);
        }
        return new HKey(this, jArr[0], 0);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.c), this.e, this.f});
    }

    public HKey importKey(byte[] bArr, HKey hKey, int i, int i2) throws MSException {
        long[] jArr = new long[1];
        if (hKey == null) {
            CAPILogger.log("CryptImportKey", new Object[]{Long.valueOf(this.c), bArr, Integer.valueOf(bArr.length), 0, Integer.valueOf(i), Long.valueOf(jArr[0]), Integer.valueOf(i2)}, 0L, new String[0]);
            int cryptImportKey = CAPI.cryptImportKey(this.c, bArr, bArr.length, 0L, i, jArr, i2);
            Long valueOf = Long.valueOf(this.c);
            Integer valueOf2 = Integer.valueOf(bArr.length);
            Integer valueOf3 = Integer.valueOf(i);
            if (cryptImportKey != 0) {
                CAPILogger.error("CryptImportKey", new Object[]{valueOf, bArr, valueOf2, 0, valueOf3, Long.valueOf(jArr[0]), Integer.valueOf(i2)}, cryptImportKey, new String[0]);
                MSException.procCode(cryptImportKey);
            } else {
                CAPILogger.log("CryptImportKey", new Object[]{valueOf, bArr, valueOf2, 0, valueOf3, Long.valueOf(jArr[0]), Integer.valueOf(i2)}, jArr[0], new String[0]);
            }
            return new HKey(this, jArr[0], 0);
        }
        try {
            hKey.readLock();
            CAPILogger.log("CryptImportKey", new Object[]{Long.valueOf(this.c), bArr, Long.valueOf(hKey.getHandle()), Integer.valueOf(i), Long.valueOf(jArr[0]), Integer.valueOf(i2)}, 0L, new String[0]);
            int cryptImportKey2 = CAPI.cryptImportKey(this.c, bArr, bArr.length, hKey.getHandle(), i, jArr, i2);
            if (cryptImportKey2 != 0) {
                CAPILogger.error("CryptImportKey", new Object[]{Long.valueOf(this.c), bArr, Long.valueOf(hKey.getHandle()), Integer.valueOf(i), Long.valueOf(jArr[0]), Integer.valueOf(i2)}, cryptImportKey2, new String[0]);
                MSException.procCode(cryptImportKey2);
            } else {
                CAPILogger.log("CryptImportKey", new Object[]{Long.valueOf(this.c), bArr, Long.valueOf(hKey.getHandle()), Integer.valueOf(i), Long.valueOf(jArr[0]), Integer.valueOf(i2)}, jArr[0], new String[0]);
            }
            HKey hKey2 = new HKey(this, jArr[0], 0);
            hKey.readUnlock();
            return hKey2;
        } catch (Throwable th) {
            hKey.readUnlock();
            throw th;
        }
    }

    public void importParam(int i, HProv hProv) {
        try {
            setProvParam(i, hProv.getProvParam(i, 0), 0);
        } catch (MSException e) {
            yci0.r(e);
        }
    }

    public HKey importPublicKey(PublicKeyBlob publicKeyBlob, boolean z, int i) {
        try {
            int i2 = (CSPVersionUtility.isCSPVersion40OrHigher() && z) ? 65536 : 0;
            if (JCSPLogger.isFinerEnabled() && CAPI.StrengthenedKeyUsageControlState == 1 && !z) {
                JCSPLogger.warning(("CryptImportKey tries to import untrusted public key without CP_CRYPT_PUBLICKEY_FROM_CERT in strict mode;\nCSP is 4.0 or higher: " + CSPVersionUtility.isCSPVersion40OrHigher() + ", dwFlags: " + i2 + ", algorithm group: " + i + "\n") + new HexDumpEncoder().encode(ByteBuffer.wrap(publicKeyBlob.getBlob())));
            }
            return importKey(publicKeyBlob.getBlob(), null, i2 | 8192, i);
        } catch (MSKeyException e) {
            yci0.r(e);
            return null;
        } catch (MSException e2) {
            yci0.r(e2);
            return null;
        }
    }

    public HKey importSessionSecretKey(byte[] bArr, HKey hKey, int i, int i2) {
        try {
            return importKey(bArr, hKey, i, i2);
        } catch (MSKeyException | MSException e) {
            yci0.r(e);
            return null;
        }
    }

    public void increaseRefCount(int i, long j) throws MSException {
        if (j != 0) {
            contextAddRef(i, j);
        }
    }

    public HHash initHMAC(HKey hKey, int i, OID oid) throws InvalidKeyException {
        return initHash(i, hKey, null, oid, 0);
    }

    public HHash initHash(int i, HKey hKey, byte[] bArr, OID oid, int i2) throws InvalidKeyException {
        HHash createHash;
        try {
            if (i2 == 0) {
                createHash = createHash(i, hKey, 0);
            } else {
                createHash = createHash(i, hKey, 16);
                createHash.setHashParam(4, Array.toByteArray(i2));
            }
            if (i == 32807 && oid != null) {
                createHash.setHashOID(oid);
            }
            if (bArr != null) {
                createHash.a(bArr);
            }
            return createHash;
        } catch (MSHashNSignException e) {
            yci0.r(e);
            return null;
        } catch (MSKeyException e2) {
            if (e2.isBadKey()) {
                dy31.s(e2);
                return null;
            }
            yci0.r(e2);
            return null;
        } catch (MSException e3) {
            yci0.r(e3);
            return null;
        }
    }

    public HHash initHashG28147(HKey hKey, byte[] bArr) throws InvalidKeyException {
        return initHash(32799, hKey, bArr, null, 0);
    }

    public HHash initHashGR3411(int i) {
        try {
            return initHash(i, null, null, null, 0);
        } catch (InvalidKeyException e) {
            yci0.r(e);
            return null;
        }
    }

    public HHash initMac(HKey hKey, int i, int i2) throws InvalidKeyException {
        return initHash(i, hKey, null, null, i2);
    }

    public boolean isBeDeleted() {
        return this.e.get();
    }

    public boolean isSupported(int i) {
        cl_7 cl_7Var = this.d;
        if (cl_7Var != null) {
            return ((ProviderFeatures) g.computeIfAbsent(cl_7Var, new yu0(10, this))).isSupported(i);
        }
        if (i != 2) {
            return false;
        }
        return CSPVersionDependentAlgorithms.isKoblitzCurveSupported();
    }

    public HKey newKey(int i, int i2) throws AccessControlException, UnrecoverableKeyException {
        try {
            return genKey(i, i2);
        } catch (MSException e) {
            if (e.isWrongPassword()) {
                AccessControlException accessControlException = new AccessControlException("Password is not valid");
                accessControlException.initCause(e);
                throw accessControlException;
            }
            if (!e.isCanceled()) {
                yci0.r(e);
                return null;
            }
            UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException("Operation cancelled");
            unrecoverableKeyException.initCause(e);
            throw unrecoverableKeyException;
        }
    }

    public void openContainer(String str, String str2, ContainerPassword containerPassword, int i, boolean z) throws UnrecoverableKeyException {
        try {
            a(str, str2, false, containerPassword, i, z);
        } catch (MSContextException e) {
            UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException(e.getMessage());
            unrecoverableKeyException.initCause(e);
            throw unrecoverableKeyException;
        }
    }

    public void openContainerWithSetPin(String str, String str2, ContainerPassword containerPassword, int i, boolean z) throws UnrecoverableKeyException {
        try {
            a(str, str2, true, containerPassword, i, z);
        } catch (MSContextException e) {
            UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException(e.getMessage());
            unrecoverableKeyException.initCause(e);
            throw unrecoverableKeyException;
        }
    }

    public void readContextOnly(String str, String str2) {
        try {
            acquireContext(str, str2, 0);
        } catch (MSException e) {
            yci0.r(e);
        }
    }

    public HKey readKey(int i) throws AccessControlException, UnrecoverableKeyException {
        try {
            return getUserKey(i);
        } catch (MSKeyException e) {
            e = e;
            if (e.isWrongPassword()) {
                AccessControlException accessControlException = new AccessControlException("Password is not valid");
                accessControlException.initCause(e);
                throw accessControlException;
            }
            if (e.isBadKeyset()) {
                UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException("Bad keyset");
                unrecoverableKeyException.initCause(e);
                throw unrecoverableKeyException;
            }
            if (e.isNoKey()) {
                UnrecoverableKeyException unrecoverableKeyException2 = new UnrecoverableKeyException("No key");
                unrecoverableKeyException2.initCause(e);
                throw unrecoverableKeyException2;
            }
            yci0.r(e);
            return null;
        } catch (MSException e2) {
            e = e2;
            yci0.r(e);
            return null;
        }
    }

    public synchronized void releaseContext(int i) {
        if (this.f.get()) {
            throw new IllegalStateException("Provider context has been already freed.");
        }
        try {
            a(i, false);
        } catch (Exception e) {
            if (CAPI.STRICT_DESTROY_CHECK) {
                throw new IllegalStateException("Illegal context state (-Dstrict_destroy_check=true).", e);
            }
            JCSPLogger.subThrown(e);
        }
        this.f.set(true);
    }

    public void setBeDeleted() {
        this.e.set(true);
    }

    public void setBeUndeleted() {
        this.e.set(false);
    }

    public void setCertExtension(String str, boolean z, byte[] bArr, int i, int i2) throws MSException {
        CAPILogger.log("SetCertExtension", new Object[]{Long.valueOf(this.c), str, Boolean.valueOf(z), bArr, Integer.valueOf(i), Integer.valueOf(i2)}, 0L, new String[0]);
        int certExtension = CAPI.setCertExtension(this.c, str, z, bArr, i, i2);
        if (certExtension != 0) {
            CAPILogger.error("SetCertExtension", new Object[]{Long.valueOf(this.c), str, Boolean.valueOf(z), bArr, Integer.valueOf(i), Integer.valueOf(i2)}, certExtension, new String[0]);
            MSException.procCode(certExtension);
        }
    }

    public void setOIDParam(int i, byte[] bArr) {
        try {
            setProvParam(i, bArr, 0);
        } catch (MSException e) {
            yci0.r(e);
        }
    }

    public void setProvParam(int i, byte[] bArr, int i2) throws MSException {
        CAPILogger.log("CryptSetProvParam", new Object[]{Long.valueOf(this.c), Integer.valueOf(i), "***", Integer.valueOf(i2)}, 0L, new String[0]);
        int cryptSetProvParam = CAPI.cryptSetProvParam(this.c, i, bArr, i2);
        if (cryptSetProvParam != 0) {
            CAPILogger.error("CryptSetProvParam", new Object[]{Long.valueOf(this.c), Integer.valueOf(i), "***", Integer.valueOf(i2)}, cryptSetProvParam, new String[0]);
            MSProvParamException.procCode(cryptSetProvParam);
        }
    }

    public void createWithoutContainer() {
        createWithoutContainer(DefaultCSPProvider.getProviderNameByType(getProvType()));
    }

    public byte[] getProvParam(int i, int i2) {
        int[] getProvParamLength = getGetProvParamLength(i, i2);
        int i3 = getProvParamLength[0];
        byte[] bArr = new byte[i3];
        try {
            getProvParam(i, bArr, getProvParamLength, i2);
            int i4 = getProvParamLength[0];
            return i3 != i4 ? Arrays.copyOf(bArr, i4) : bArr;
        } catch (MSException e) {
            yci0.r(e);
            return null;
        }
    }

    public void setCertExtension(String str, boolean z, byte[] bArr) {
        try {
            setCertExtension(str, z, bArr, bArr.length, 0);
        } catch (MSProvParamException e) {
            yci0.r(e);
        } catch (MSException e2) {
            yci0.r(e2);
        }
    }

    private static String b(String str) {
        JCSPLogger.fine("Converted container name: " + str);
        try {
            return new String(str.getBytes(StandardCharsets.UTF_8), "cp1251");
        } catch (UnsupportedEncodingException e) {
            JCSPLogger.subThrown(e);
            return null;
        }
    }

    public void b(boolean z) throws MSException {
        a(2, z);
    }

    private static int a(int i, int i2, int[] iArr, byte[] bArr, int[] iArr2) {
        CAPILogger.log("CryptEnumProviders", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), iArr, bArr, iArr2}, 0L, new String[0]);
        int cryptEnumProviders = CAPI.cryptEnumProviders(i, i2, iArr, bArr, iArr2);
        if (cryptEnumProviders != 0) {
            CAPILogger.error("CryptEnumProviders", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), iArr, bArr, iArr2}, cryptEnumProviders, new String[0]);
        }
        return cryptEnumProviders;
    }

    private static String a(int i) {
        switch (i) {
            case 1:
                return "hash";
            case 2:
                return "key";
            case 3:
                return "container (after open)";
            case 4:
                return "provider (after create/gen/derive/import/export)";
            case 5:
                return "random";
            case 6:
                return "error";
            default:
                return "other (after get PP_*, delete)";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ProviderFeatures a(cl_7 cl_7Var) {
        return new ProviderFeatures(this);
    }

    public void a() throws AccessControlException {
        try {
            setProvParam(32, null, 0);
        } catch (MSProvParamException e) {
            if (!e.isWrongPassword()) {
                yci0.r(e);
            } else {
                AccessControlException accessControlException = new AccessControlException("Password is not valid");
                accessControlException.initCause(e);
                throw accessControlException;
            }
        } catch (MSException e2) {
            yci0.r(e2);
        }
    }

    private void a(String str, String str2, boolean z, ContainerPassword containerPassword, int i, boolean z2) throws AccessControlException, MSContextException, InvalidPasswordException {
        try {
            acquireContext(str, str2, i);
            if (z2) {
                byte[] password = containerPassword != null ? containerPassword.getPassword() : null;
                PinInfoStructure pinInfoStructure = new PinInfoStructure();
                try {
                    pinInfoStructure.read(new ByteArrayInputStream(getProvParam(120, 0)));
                    if (pinInfoStructure.type.value == 5) {
                        AuthInfoStructure authInfoStructure = new AuthInfoStructure();
                        authInfoStructure.read(new ByteArrayInputStream(getProvParam(PP_AUTH_INFO, 0)));
                        if ((authInfoStructure.flags.value & 1) == 0) {
                            if (password != null && password.length > 0) {
                                throw new InvalidPasswordException("Password is not valid");
                            }
                            containerPassword = null;
                        }
                    } else if (password == null) {
                        throw new InvalidPasswordException("Need password");
                    }
                } catch (StructException e) {
                    JCSPLogger.ignoredException(e);
                }
            }
            a(z, containerPassword);
        } catch (MSContextException e2) {
            throw e2;
        } catch (MSException e3) {
            yci0.r(e3);
        }
    }

    public void a(ContainerPassword containerPassword) throws AccessControlException, IllegalArgumentException {
        try {
            changePin(108, containerPassword.getUnionType(), containerPassword.getPassword(), 0);
        } catch (MSProvParamException e) {
            if (e.isWantGraphic()) {
                AccessControlException accessControlException = new AccessControlException("Silent context");
                accessControlException.initCause(e);
                throw accessControlException;
            }
            if (!e.isWrongPassword()) {
                yci0.r(e);
            } else {
                AccessControlException accessControlException2 = new AccessControlException("Password is not valid");
                accessControlException2.initCause(e);
                throw accessControlException2;
            }
        } catch (MSException e2) {
            yci0.r(e2);
        }
    }

    public void a(boolean z) throws MSException {
        a(1, z);
    }

    public void a(boolean z, ContainerPassword containerPassword) throws InvalidPasswordException {
        if (!z || containerPassword == null) {
            return;
        }
        if (CSPStore.CSP_KEY_CACHE.booleanValue()) {
            try {
                getProvParam(109, 0);
                return;
            } catch (Exception e) {
                JCSPLogger.ignoredException(e);
            }
        }
        try {
            setProvParam(32, containerPassword.getPassword(), 0);
        } catch (MSProvParamException e2) {
            if (!e2.isWrongPassword()) {
                yci0.r(e2);
            } else {
                AccessControlException accessControlException = new AccessControlException("Password is not valid");
                accessControlException.initCause(e2);
                throw accessControlException;
            }
        } catch (MSException e3) {
            yci0.r(e3);
        }
    }

    public static synchronized boolean a(String str) {
        boolean canEncode;
        synchronized (HProv.class) {
            canEncode = a.canEncode(str);
        }
        return canEncode;
    }

    public static boolean a(String str, ReaderInfo readerInfo, String str2, int i) throws UnrecoverableKeyException {
        HProv provider = getProvider(i);
        try {
            try {
                if (str2 == null) {
                    str2 = readerInfo != null ? readerInfo.getProviderName(i) : DefaultCSPProvider.getProviderNameByType(i);
                }
                provider.acquireContext(str, str2, 64);
                provider.releaseContext(7);
                return true;
            } catch (MSContextException e) {
                if (e.isBadKeyset()) {
                    provider.releaseContext(7);
                    return false;
                }
                if (!e.b()) {
                    throw new IllegalArgumentException(e);
                }
                UnrecoverableKeyException unrecoverableKeyException = new UnrecoverableKeyException("Key is already open");
                unrecoverableKeyException.initCause(e);
                throw unrecoverableKeyException;
            } catch (MSException e2) {
                throw new IllegalArgumentException(e2);
            }
        } catch (Throwable th) {
            provider.releaseContext(7);
            throw th;
        }
    }

    public static boolean a(HProv hProv, HProv hProv2) {
        String str;
        if (hProv.getProvType() != hProv2.getProvType()) {
            return false;
        }
        String str2 = hProv.d.a;
        return (str2 == null || (str = hProv2.d.a) == null) ? str2 == null && hProv2.d.a == null : str2.equals(str);
    }
}
