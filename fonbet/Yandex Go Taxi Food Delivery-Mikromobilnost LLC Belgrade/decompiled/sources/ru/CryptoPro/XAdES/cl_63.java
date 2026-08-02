package ru.CryptoPro.XAdES;

import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes4.dex */
public enum cl_63 {
    a("BES", "XAdES-BES", "4.4.1", "Basic Electronic Signature"),
    b("T", "XAdES-T", "4.4.3.1", "Electronic Signature with Time"),
    c(CA20Status.STATUS_REQUEST_C, "XAdES-C", "4.4.3.2", "Electronic Signature with Complete Validation Data References"),
    d("X_L", "XAdES-X-L", "B.2", "Extended Long Electronic Signatures with Time");

    public static final String A = "UnsignedProperties";
    public static final String B = "UnsignedSignatureProperties";
    public static final String C = "CounterSignature";
    public static final String D = "SignatureTimeStamp";
    public static final String E = "CompleteCertificateRefs";
    public static final String F = "CompleteCertificateRefsV2";
    public static final String G = "CompleteRevocationRefs";
    public static final String H = "CompleteRevocationRefsV2";
    public static final String I = "AttributeCertificateRefs";
    public static final String J = "AttributeRevocationRefs";
    public static final String K = "CertificateValues";
    public static final String L = "RevocationValues";
    public static final String M = "AttrAuthoritiesCertValues";
    public static final String N = "AttributeRevocationValues";
    public static final String O = "SigAndRefsTimeStamp";
    public static final String P = "SigAndRefsTimeStampV2";
    public static final String Q = "QualifyingPropertiesReference";
    public static final String R = "EnhancedTimeStamp";
    public static final String e = "Object";
    public static final String f = "QualifyingProperties";
    public static final String g = "SignedProperties";
    public static final String h = "SignedSignatureProperties";
    public static final String i = "SigningTime";
    public static final String j = "SigningCertificate";
    public static final String k = "SigningCertificateV2";
    public static final String l = "SignatureProductionPlace";
    public static final String m = "SignerRole";
    public static final String n = "ClaimedRoles";
    public static final String o = "CertifiedRoles";
    public static final String p = "Signer";
    public static final String q = "SignerDetails";
    public static final String r = "SignedDataObjectProperties";
    public static final String s = "DataObjectFormat";
    public static final String t = "Description";
    public static final String u = "ObjectIdentifier";
    public static final String v = "MimeType";
    public static final String w = "Encoding";
    public static final String x = "CommitmentTypeIndication";
    public static final String y = "AllDataObjectsTimeStamp";
    public static final String z = "IndividualDataObjectsTimeStamp";
    private String S;
    private String T;
    private String U;
    private Integer V;

    cl_63(String str, String str2, String str3, String str4) {
        this.S = str2;
        this.T = str3;
        this.U = str4;
        this.V = r2;
    }
}
