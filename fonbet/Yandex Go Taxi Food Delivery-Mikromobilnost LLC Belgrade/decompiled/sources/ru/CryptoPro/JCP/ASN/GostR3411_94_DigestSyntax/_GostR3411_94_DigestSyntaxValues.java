package ru.CryptoPro.JCP.ASN.GostR3411_94_DigestSyntax;

import com.objsys.asn1j.runtime.Asn1Null;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import ru.CryptoPro.JCP.ASN.Cryptographic_Gost_Useful_Definitions.ALGORITHM_IDENTIFIER;

/* loaded from: classes4.dex */
public class _GostR3411_94_DigestSyntaxValues {
    public static final ALGORITHM_IDENTIFIER[] GostR3411_94_DigestAlgorithms;
    public static final int[] id_GostR3411_94;
    public static final int[] id_GostR3411_94_TestParamSet = {1, 2, 643, 2, 2, 30, 0};
    public static final int[] id_GostR3411_94_CryptoProParamSet = {1, 2, 643, 2, 2, 30, 1};

    static {
        int[] iArr = {1, 2, 643, 2, 2, 9};
        id_GostR3411_94 = iArr;
        GostR3411_94_DigestAlgorithms = new ALGORITHM_IDENTIFIER[]{new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(iArr), new Asn1Null()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(iArr), new GostR3411_94_DigestParameters())};
    }
}
