package ru.CryptoPro.JCP.ASN.Cryptocom_Useful_Definitions;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OpenType;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public class _Cryptocom_Useful_DefinitionsValues {
    public static final AlgorithmIdentifier gostR3410_2001_Cryptocom_0_ParamSet;
    public static final int[] id_Cryptocom = {1, 2, 643, 2, 9};
    public static final int[] id_Cryptocom_algorithms = {1, 2, 643, 2, 9, 1};
    public static final int[] id_Cryptocom_ecc_signs = {1, 2, 643, 2, 9, 1, 8};
    public static final int[] id_GostR3410_2001_Cryptocom_0_ParamSet;

    static {
        int[] iArr = {1, 2, 643, 2, 9, 1, 8, 1};
        id_GostR3410_2001_Cryptocom_0_ParamSet = iArr;
        gostR3410_2001_Cryptocom_0_ParamSet = new AlgorithmIdentifier(new Asn1ObjectIdentifier(iArr), (Asn1OpenType) null);
    }
}
