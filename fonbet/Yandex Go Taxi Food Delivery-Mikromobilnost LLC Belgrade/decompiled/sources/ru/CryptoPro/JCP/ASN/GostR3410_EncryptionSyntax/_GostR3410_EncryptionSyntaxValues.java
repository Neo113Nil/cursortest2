package ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import ru.CryptoPro.JCP.ASN.Cryptographic_Gost_Useful_Definitions.ALGORITHM_IDENTIFIER;
import ru.CryptoPro.JCP.ASN.GostR3410_2001_PKISyntax._GostR3410_2001_PKISyntaxValues;

/* loaded from: classes4.dex */
public class _GostR3410_EncryptionSyntaxValues {
    public static final ALGORITHM_IDENTIFIER[] Gost28147_89_KeyWrapAlgorithms;
    public static final int[] id_Gost28147_89_CryptoPro_KeyWrap;
    public static final int[] id_Gost28147_89_None_KeyWrap;
    public static final int[] id_GostR3410_2001_CryptoPro_ESDH = {1, 2, 643, 2, 2, 96};
    public static final int[] id_GostR3410_2001_KeyTransportSMIMECapability = _GostR3410_2001_PKISyntaxValues.id_GostR3410_2001;

    static {
        int[] iArr = {1, 2, 643, 2, 2, 13, 1};
        id_Gost28147_89_CryptoPro_KeyWrap = iArr;
        int[] iArr2 = {1, 2, 643, 2, 2, 13, 0};
        id_Gost28147_89_None_KeyWrap = iArr2;
        Gost28147_89_KeyWrapAlgorithms = new ALGORITHM_IDENTIFIER[]{new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(iArr), new Gost28147_89_KeyWrapParameters()), new ALGORITHM_IDENTIFIER(new Asn1ObjectIdentifier(iArr2), new Gost28147_89_KeyWrapParameters())};
    }
}
