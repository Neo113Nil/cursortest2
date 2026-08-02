package ru.CryptoPro.XAdES.tools;

/* loaded from: classes4.dex */
public enum InvalidSignature {
    WRONG_XML_SIGNATURE("Wrong XML Signature"),
    INAPPROPRIATE_XML_CONTEXT("Inappropriate XML Context"),
    NOT_COMPATIBLE_VALIDATE_CONTEXT("Not compatible Validate Context"),
    NULL_VALIDATE_CONTEXT("Null/Empty Validate Context"),
    BAD_SIGNATURE_VALUE("Bad Signature Value"),
    BAD_REFERENCE("Bad Reference"),
    UNEXPECTED_EXCEPTION("Unexpected Exception");

    private String a;

    InvalidSignature(String str) {
        this.a = str;
    }

    public String getDescription() {
        return this.a;
    }
}
