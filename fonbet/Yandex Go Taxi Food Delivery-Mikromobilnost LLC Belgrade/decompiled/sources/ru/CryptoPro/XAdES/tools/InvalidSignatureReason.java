package ru.CryptoPro.XAdES.tools;

import defpackage.ms61;
import defpackage.unr0;
import defpackage.x4e;
import java.util.Collections;
import java.util.Vector;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.util.SystemUtils;

/* loaded from: classes4.dex */
public class InvalidSignatureReason {
    public final InvalidSignature a;
    public final String b;
    public ms61 c;

    public InvalidSignatureReason(Reference reference) {
        this.a = InvalidSignature.BAD_REFERENCE;
        StringBuilder sb = new StringBuilder("Bad reference");
        String id = reference.getId();
        if (id != null) {
            id = id.trim();
            if (id.length() > 0) {
                x4e.C(sb, " with Id '", id, "'");
            }
        }
        String uri = reference.getURI();
        if (uri != null) {
            String trim = uri.trim();
            if (trim.length() > 0) {
                sb.append((id == null || id.length() <= 0) ? " with URI = '" : " and URI = '");
                sb.append(trim);
                sb.append("'");
            }
        }
        this.b = sb.toString();
    }

    public Comparable<ms61> getIndexKey() {
        if (this.c == null) {
            Comparable[] comparableArr = {this.a.getDescription(), this.b};
            ms61 ms61Var = new ms61();
            Vector vector = new Vector(2);
            ms61Var.a = vector;
            Collections.addAll(vector, comparableArr);
            this.c = ms61Var;
        }
        return this.c;
    }

    public InvalidSignature getInvalidSignature() {
        return this.a;
    }

    public String getReason() {
        return this.b;
    }

    public InvalidSignatureReason(String str, NullPointerException nullPointerException) {
        this.a = InvalidSignature.NULL_VALIDATE_CONTEXT;
        StringBuilder x = unr0.x("NULL ", str, " validate context: ");
        x.append(SystemUtils.getCauseMessages(nullPointerException));
        this.b = x.toString();
    }

    public InvalidSignatureReason(String str, XMLSignatureException xMLSignatureException) {
        this.a = InvalidSignature.UNEXPECTED_EXCEPTION;
        StringBuilder x = unr0.x("Unexpected exception occurs in ", str, " while validating the signature: ");
        x.append(SystemUtils.getCauseMessages(xMLSignatureException));
        this.b = x.toString();
    }

    public InvalidSignatureReason(MarshalException marshalException) {
        this.a = InvalidSignature.WRONG_XML_SIGNATURE;
        this.b = "Wrong XML signature: " + SystemUtils.getCauseMessages(marshalException);
    }

    public InvalidSignatureReason() {
    }

    public InvalidSignatureReason(XMLSignature.SignatureValue signatureValue) {
        this.a = InvalidSignature.BAD_SIGNATURE_VALUE;
        StringBuilder sb = new StringBuilder("Bad signature value");
        String id = signatureValue.getId();
        if (id != null) {
            String trim = id.trim();
            if (trim.length() > 0) {
                x4e.C(sb, " with Id '", trim, "'");
            }
        }
        this.b = sb.toString();
    }

    public InvalidSignatureReason(InvalidSignature invalidSignature, ClassCastException classCastException) {
        this.a = invalidSignature;
        StringBuilder sb = InvalidSignature.NOT_COMPATIBLE_VALIDATE_CONTEXT.equals(invalidSignature) ? new StringBuilder("Not compatible validate context: ") : new StringBuilder("Inappropriate XML structure: ");
        sb.append(SystemUtils.getCauseMessages(classCastException));
        this.b = sb.toString();
    }

    public InvalidSignatureReason(InvalidSignature invalidSignature, XAdESException xAdESException) {
        this.a = invalidSignature;
        StringBuilder sb = InvalidSignature.NOT_COMPATIBLE_VALIDATE_CONTEXT.equals(invalidSignature) ? new StringBuilder("Not compatible validate context: ") : new StringBuilder("Inappropriate XML structure: ");
        sb.append(SystemUtils.getCauseMessages(xAdESException));
        this.b = sb.toString();
    }
}
