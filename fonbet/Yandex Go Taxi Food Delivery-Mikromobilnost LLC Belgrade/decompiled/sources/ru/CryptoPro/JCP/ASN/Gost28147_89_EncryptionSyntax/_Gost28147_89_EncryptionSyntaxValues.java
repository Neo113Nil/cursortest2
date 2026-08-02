package ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import ru.CryptoPro.JCP.ASN.Cryptographic_Gost_Useful_Definitions.ALGORITHM_IDENTIFIER;

/* loaded from: classes4.dex */
public class _Gost28147_89_EncryptionSyntaxValues {
    public static final ALGORITHM_IDENTIFIER[] Gost28147_89_Algorithms;
    public static final int[] id_Gost28147_89;
    public static final int[] id_Gost28147_89_MAC = {1, 2, 643, 2, 2, 22};
    public static final int[] id_Gost28147_89_TestParamSet = {1, 2, 643, 2, 2, 31, 0};
    public static final int[] id_Gost28147_89_CryptoPro_A_ParamSet = {1, 2, 643, 2, 2, 31, 1};
    public static final int[] id_Gost28147_89_CryptoPro_B_ParamSet = {1, 2, 643, 2, 2, 31, 2};
    public static final int[] id_Gost28147_89_CryptoPro_C_ParamSet = {1, 2, 643, 2, 2, 31, 3};
    public static final int[] id_Gost28147_89_CryptoPro_D_ParamSet = {1, 2, 643, 2, 2, 31, 4};
    public static final int[] id_Gost28147_89_CryptoPro_Oscar_1_1_ParamSet = {1, 2, 643, 2, 2, 31, 5};
    public static final int[] id_Gost28147_89_CryptoPro_Oscar_1_0_ParamSet = {1, 2, 643, 2, 2, 31, 6};
    public static final int[] id_Gost28147_89_CryptoPro_RIC_1_ParamSet = {1, 2, 643, 2, 2, 31, 7};
    public static final int[] id_Gost28147_89_TC26_A_ParamSet = {1, 2, 643, 2, 2, 31, 12};
    public static final int[] id_Gost28147_89_TC26_B_ParamSet = {1, 2, 643, 2, 2, 31, 13};
    public static final int[] id_Gost28147_89_TC26_C_ParamSet = {1, 2, 643, 2, 2, 31, 14};
    public static final int[] id_Gost28147_89_TC26_D_ParamSet = {1, 2, 643, 2, 2, 31, 15};
    public static final int[] id_Gost28147_89_TC26_E_ParamSet = {1, 2, 643, 2, 2, 31, 16};
    public static final int[] id_Gost28147_89_TC26_F_ParamSet = {1, 2, 643, 2, 2, 31, 17};
    public static final int[] id_tc26_gost_28147_paramSetISO = {1, 2, 643, 7, 1, 2, 5, 1, 1};
    public static final int[] id_tc26_cipher_gost_3412_2015_M = {1, 2, 643, 7, 1, 1, 5, 1};
    public static final int[] id_tc26_cipher_gost_3412_2015_M_ctr_acpkm = {1, 2, 643, 7, 1, 1, 5, 1, 1};
    public static final int[] id_tc26_cipher_gost_3412_2015_M_ctr_acpkm_omac = {1, 2, 643, 7, 1, 1, 5, 1, 2};
    public static final int[] id_tc26_cipher_gost_3412_2015_K = {1, 2, 643, 7, 1, 1, 5, 2};
    public static final int[] id_tc26_cipher_gost_3412_2015_K_ctr_acpkm = {1, 2, 643, 7, 1, 1, 5, 2, 1};
    public static final int[] id_tc26_cipher_gost_3412_2015_K_ctr_acpkm_omac = {1, 2, 643, 7, 1, 1, 5, 2, 2};
    public static final int[] id_tc26_wrap_gost_3412_2015_M = {1, 2, 643, 7, 1, 1, 7, 1};
    public static final int[] id_tc26_wrap_gost_3412_2015_M_kexp15 = {1, 2, 643, 7, 1, 1, 7, 1, 1};
    public static final int[] id_tc26_wrap_gost_3412_2015_K = {1, 2, 643, 7, 1, 1, 7, 2};
    public static final int[] id_tc26_wrap_gost_3412_2015_K_kexp15 = {1, 2, 643, 7, 1, 1, 7, 2, 1};

    static {
        int[] iArr = {1, 2, 643, 2, 2, 21};
        id_Gost28147_89 = iArr;
        Gost28147_89_Algorithms = new ALGORITHM_IDENTIFIER[]{new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(iArr), new Gost28147_89_Parameters())};
    }
}
