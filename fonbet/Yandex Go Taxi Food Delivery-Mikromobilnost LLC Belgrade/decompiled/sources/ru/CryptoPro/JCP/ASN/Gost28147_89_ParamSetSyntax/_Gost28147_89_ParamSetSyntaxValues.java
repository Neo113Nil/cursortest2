package ru.CryptoPro.JCP.ASN.Gost28147_89_ParamSetSyntax;

import com.objsys.asn1j.runtime.Asn1Null;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import ru.CryptoPro.JCP.ASN.Cryptographic_Gost_Useful_Definitions.ALGORITHM_IDENTIFIER;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax._Gost28147_89_EncryptionSyntaxValues;

/* loaded from: classes4.dex */
public class _Gost28147_89_ParamSetSyntaxValues {
    public static final ALGORITHM_IDENTIFIER[] Gost28147_89_KeyMeshingAlgorithms;
    public static final ALGORITHM_IDENTIFIER[] Gost28147_89_ParamSetAlgorithms = {new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_TestParamSet), new Gost28147_89_ParamSetParameters()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_CryptoPro_A_ParamSet), new Gost28147_89_ParamSetParameters()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_CryptoPro_B_ParamSet), new Gost28147_89_ParamSetParameters()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_CryptoPro_C_ParamSet), new Gost28147_89_ParamSetParameters()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_CryptoPro_D_ParamSet), new Gost28147_89_ParamSetParameters()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_TC26_A_ParamSet), new Gost28147_89_ParamSetParameters()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_TC26_B_ParamSet), new Gost28147_89_ParamSetParameters()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_TC26_C_ParamSet), new Gost28147_89_ParamSetParameters()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_TC26_D_ParamSet), new Gost28147_89_ParamSetParameters()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_TC26_E_ParamSet), new Gost28147_89_ParamSetParameters()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_TC26_F_ParamSet), new Gost28147_89_ParamSetParameters())};
    public static final int[] id_Gost28147_89_CryptoPro_KeyMeshing;
    public static final int[] id_Gost28147_89_None_KeyMeshing;

    static {
        int[] iArr = {1, 2, 643, 2, 2, 14, 1};
        id_Gost28147_89_CryptoPro_KeyMeshing = iArr;
        int[] iArr2 = {1, 2, 643, 2, 2, 14, 0};
        id_Gost28147_89_None_KeyMeshing = iArr2;
        Gost28147_89_KeyMeshingAlgorithms = new ALGORITHM_IDENTIFIER[]{new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(iArr), new Asn1Null()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(iArr2), new Asn1Null())};
    }
}
