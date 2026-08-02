package ru.CryptoPro.AdES.evidence.crl.rfc3280;

import java.util.Date;

/* loaded from: classes4.dex */
class CertStatus {
    public static final int UNDETERMINED = 12;
    public static final int UNREVOKED = 11;
    private int certStatus = 11;
    private Date revocationDate = null;

    public int getCertStatus() {
        return this.certStatus;
    }

    public Date getRevocationDate() {
        return this.revocationDate;
    }

    public void setCertStatus(int i) {
        this.certStatus = i;
    }

    public void setRevocationDate(Date date) {
        this.revocationDate = date;
    }
}
