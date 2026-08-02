package ru.CryptoPro.JCP.ASN.PKIXDVCS;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.ECONTENT_TYPE;

/* loaded from: classes4.dex */
public class _PKIXDVCSValues {
    public static final ECONTENT_TYPE e_dvcsRequest;
    public static final ECONTENT_TYPE e_dvcsResponse;
    public static final int[] id_ct_DVCSRequestData;
    public static final int[] id_ct_DVCSResponseData;
    public static final int[] id_ad_dvcs = {1, 3, 6, 1, 5, 5, 7, 48, 4};
    public static final int[] id_kp_dvcs = {1, 3, 6, 1, 5, 5, 7, 3, 10};
    public static final int[] id_smime = {1, 2, 840, 113549, 1, 9, 16};
    public static final int[] id_aa_dvcs_dvc = {1, 2, 840, 113549, 1, 9, 16, 2, 29};

    static {
        int[] iArr = {1, 2, 840, 113549, 1, 9, 16, 1, 7};
        id_ct_DVCSRequestData = iArr;
        int[] iArr2 = {1, 2, 840, 113549, 1, 9, 16, 1, 8};
        id_ct_DVCSResponseData = iArr2;
        e_dvcsRequest = new ECONTENT_TYPE(new DVCSRequest(), new Asn1ObjectIdentifier(iArr));
        e_dvcsResponse = new ECONTENT_TYPE(new DVCSResponse(), new Asn1ObjectIdentifier(iArr2));
    }
}
