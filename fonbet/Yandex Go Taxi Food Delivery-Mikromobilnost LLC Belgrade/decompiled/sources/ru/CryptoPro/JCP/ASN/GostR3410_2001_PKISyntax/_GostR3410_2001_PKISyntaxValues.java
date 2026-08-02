package ru.CryptoPro.JCP.ASN.GostR3410_2001_PKISyntax;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import ru.CryptoPro.JCP.ASN.Cryptographic_Gost_Useful_Definitions.ALGORITHM_IDENTIFIER;

/* loaded from: classes4.dex */
public class _GostR3410_2001_PKISyntaxValues {
    public static final ALGORITHM_IDENTIFIER[] GostR3410_2001_PublicKeyAlgorithms;
    public static final int[] id_GostR3410_2001;
    public static final int[] id_GostR3410_2001DH = {1, 2, 643, 2, 2, 98};
    public static final int[] id_GostR3411_94_with_GostR3410_2001 = {1, 2, 643, 2, 2, 3};
    public static final int[] id_GostR3410_2001_TestParamSet = {1, 2, 643, 2, 2, 35, 0};
    public static final int[] id_GostR3410_2001_CryptoPro_A_ParamSet = {1, 2, 643, 2, 2, 35, 1};
    public static final int[] id_GostR3410_2001_CryptoPro_B_ParamSet = {1, 2, 643, 2, 2, 35, 2};
    public static final int[] id_GostR3410_2001_CryptoPro_C_ParamSet = {1, 2, 643, 2, 2, 35, 3};
    public static final int[] id_GostR3410_2001_CryptoPro_XchA_ParamSet = {1, 2, 643, 2, 2, 36, 0};
    public static final int[] id_GostR3410_2001_CryptoPro_XchB_ParamSet = {1, 2, 643, 2, 2, 36, 1};

    static {
        int[] iArr = {1, 2, 643, 2, 2, 19};
        id_GostR3410_2001 = iArr;
        GostR3410_2001_PublicKeyAlgorithms = new ALGORITHM_IDENTIFIER[]{new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(iArr), new GostR3410_2001_PublicKeyParameters())};
    }
}
