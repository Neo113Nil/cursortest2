package ru.CryptoPro.XAdES.tools;

import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes4.dex */
public enum ValidateResult {
    VALID(CA20Status.STATUS_CERTIFICATE_DESCRIPTION_V),
    INCOMPLETE("Incomplete validation"),
    INVALID("Invalid");

    private String a;

    ValidateResult(String str) {
        this.a = str;
    }

    public String getResultName() {
        return this.a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getResultName();
    }
}
