package ru.CryptoPro.XAdES;

import ru.CryptoPro.AdES.AdESParameters;

/* loaded from: classes4.dex */
public interface XAdESParameters extends AdESParameters {
    public static final String URI_SIGNED_PROPERTIES = "http://uri.etsi.org/01903#SignedProperties";
    public static final String XADES141_SIGNATURE_NAMESPACE = "http://uri.etsi.org/01903/v1.4.1#";
    public static final String XADES141_SIGNATURE_PREFIX = "xades141";
    public static final String XADES_SIGNATURE_NAMESPACE = "http://uri.etsi.org/01903/v1.3.2#";
    public static final String XADES_SIGNATURE_PREFIX = "xades";
    public static final String XML_SIGNATURE_PREFIX = "ds";
    public static final Integer XAdES_BES = AdESParameters._AdES_BES;
    public static final Integer XAdES_X_Long_Type_1 = AdESParameters._AdES_X_Long_Type_1;
    public static final Integer XAdES_T = AdESParameters._AdES_T;
    public static final Integer XAdES_C = AdESParameters._AdES_C;
    public static final Integer XML_DSIG = AdESParameters._SIMPLE;
    public static final Integer XAdES_Unknown = AdESParameters._AdES_Unknown;
}
