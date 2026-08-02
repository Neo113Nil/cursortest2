package ru.CryptoPro.JCP.ASN.Gost_Qualified_Certificate;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.ATTRIBUTE_CLASS;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.EXTENSION_CLASS;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class _Gost_Qualified_CertificateValues {
    public static final int[] id_inn_attribute;
    public static final int[] id_issuerSignTool_extension;
    public static final int[] id_ogrn_attribute;
    public static final int[] id_ogrnip_attribute;
    public static final int[] id_sign_tool_class_KA1;
    public static final int[] id_sign_tool_class_KB1;
    public static final int[] id_sign_tool_class_KB2;
    public static final int[] id_sign_tool_class_KC1;
    public static final int[] id_sign_tool_class_KC2;
    public static final int[] id_sign_tool_class_KC3;
    public static final int[] id_snils_attribute;
    public static final int[] id_subjectSignTool_extension;
    public static final ATTRIBUTE_CLASS inn;
    public static final EXTENSION_CLASS issuerSignTool;
    public static final ATTRIBUTE_CLASS ogrn;
    public static final ATTRIBUTE_CLASS ogrnip;
    public static final ATTRIBUTE_CLASS snils;
    public static final EXTENSION_CLASS subjectSignTool;
    public static final long ub_inn_length = 32768;
    public static final long ub_ogrn_length = 32768;
    public static final long ub_ogrnip_length = 32768;
    public static final long ub_snils_length = 32768;

    static {
        int[] iArr = {1, 2, 643, 100, 1};
        id_ogrn_attribute = iArr;
        int[] iArr2 = {1, 2, 643, 100, 5};
        id_ogrnip_attribute = iArr2;
        int[] iArr3 = {1, 2, 643, 100, 3};
        id_snils_attribute = iArr3;
        int[] iArr4 = {1, 2, 643, 3, HProv.PP_FAST_CODE, 1, 1};
        id_inn_attribute = iArr4;
        id_sign_tool_class_KC1 = new int[]{1, 2, 643, 100, 113, 1};
        id_sign_tool_class_KC2 = new int[]{1, 2, 643, 100, 113, 2};
        id_sign_tool_class_KC3 = new int[]{1, 2, 643, 100, 113, 3};
        id_sign_tool_class_KB1 = new int[]{1, 2, 643, 100, 113, 4};
        id_sign_tool_class_KB2 = new int[]{1, 2, 643, 100, 113, 5};
        id_sign_tool_class_KA1 = new int[]{1, 2, 643, 100, 113, 6};
        int[] iArr5 = {1, 2, 643, 100, 111};
        id_subjectSignTool_extension = iArr5;
        int[] iArr6 = {1, 2, 643, 100, 112};
        id_issuerSignTool_extension = iArr6;
        ogrn = new ATTRIBUTE_CLASS(new OGRN(), new Asn1ObjectIdentifier(iArr));
        ogrnip = new ATTRIBUTE_CLASS(new OGRNIP(), new Asn1ObjectIdentifier(iArr2));
        snils = new ATTRIBUTE_CLASS(new SNILS(), new Asn1ObjectIdentifier(iArr3));
        inn = new ATTRIBUTE_CLASS(new INN(), new Asn1ObjectIdentifier(iArr4));
        subjectSignTool = new EXTENSION_CLASS(new Asn1ObjectIdentifier(iArr5), new SubjectSignTool());
        issuerSignTool = new EXTENSION_CLASS(new Asn1ObjectIdentifier(iArr6), new IssuerSignTool());
    }
}
