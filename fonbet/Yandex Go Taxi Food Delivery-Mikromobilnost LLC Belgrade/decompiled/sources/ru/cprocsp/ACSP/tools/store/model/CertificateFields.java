package ru.cprocsp.ACSP.tools.store.model;

/* loaded from: classes4.dex */
public class CertificateFields {
    private String certValidity;
    private boolean isCertExpired;
    private String issuerCommonName;
    private String subjectCommonName;

    public CertificateFields(String str, String str2, String str3, boolean z) {
        this.subjectCommonName = str;
        this.issuerCommonName = str2;
        this.certValidity = str3;
        this.isCertExpired = z;
    }

    public String getCertValidity() {
        return this.certValidity;
    }

    public String getIssuerCommonName() {
        return this.issuerCommonName;
    }

    public String getSubjectCommonName() {
        return this.subjectCommonName;
    }

    public boolean isCertExpired() {
        return this.isCertExpired;
    }

    public void setCertExpired(boolean z) {
        this.isCertExpired = z;
    }

    public void setCertValidity(String str) {
        this.certValidity = str;
    }

    public void setIssuerCommonName(String str) {
        this.issuerCommonName = str;
    }

    public void setSubjectCommonName(String str) {
        this.subjectCommonName = str;
    }
}
