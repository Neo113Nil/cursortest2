package ru.CryptoPro.XAdES.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.crypto.MarshalException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class SignatureStatus {
    public final String a;
    public final ValidateResult b;
    public final ArrayList c;

    public SignatureStatus(String str, ValidateResult validateResult) {
        this.c = new ArrayList();
        this.a = str;
        this.b = validateResult;
    }

    public static boolean isValid(List<SignatureStatus> list) {
        Iterator<SignatureStatus> it = list.iterator();
        while (it.hasNext()) {
            if (!ValidateResult.VALID.equals(it.next().getValidateResult())) {
                return false;
            }
        }
        return true;
    }

    public void addInvalidSignatureReason(InvalidSignatureReason invalidSignatureReason) {
        this.c.add(invalidSignatureReason);
    }

    public Comparable getIndexKey() {
        return getSignatureId();
    }

    public List<InvalidSignatureReason> getInvalidSignatureReasons() {
        return this.c;
    }

    public String getReasonsAsText() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (InvalidSignatureReason invalidSignatureReason : getInvalidSignatureReasons()) {
            if (z) {
                sb.append(invalidSignatureReason.getReason());
                z = false;
            } else {
                sb.append(Extension.FIX_SPACE);
                sb.append(invalidSignatureReason.getReason());
            }
        }
        return sb.toString();
    }

    public String getSignatureId() {
        return this.a;
    }

    public ValidateResult getValidateResult() {
        return this.b;
    }

    public String toString() {
        return this.b.toString();
    }

    public SignatureStatus(String str, ClassCastException classCastException) {
        this(str, ValidateResult.INVALID, new InvalidSignatureReason(InvalidSignature.INAPPROPRIATE_XML_CONTEXT, classCastException));
    }

    public SignatureStatus(String str, NullPointerException nullPointerException) {
        this(str, ValidateResult.INVALID, new InvalidSignatureReason("XML", nullPointerException));
    }

    public SignatureStatus(String str, MarshalException marshalException) {
        this(str, ValidateResult.INVALID, new InvalidSignatureReason(marshalException));
    }

    public SignatureStatus() {
        this.c = new ArrayList();
    }

    public SignatureStatus(String str, ValidateResult validateResult, InvalidSignatureReason invalidSignatureReason) {
        this(str, validateResult);
        addInvalidSignatureReason(invalidSignatureReason);
    }
}
