package ru.CryptoPro.JCPRequest.ca20.decoder;

/* loaded from: classes4.dex */
public class CA20GostTemplateField {
    public String a;
    public String b;
    public String c;
    public KeySpecification d;
    public boolean e;

    public enum KeySpecification {
        ksNoPolicy,
        ksSignature,
        ksExchange
    }

    public CA20GostTemplateField(String str, String str2, String str3, KeySpecification keySpecification, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = keySpecification;
        this.e = z;
    }

    public KeySpecification getKeySpec() {
        return this.d;
    }

    public String getLocalizedName() {
        return this.b;
    }

    public String getName() {
        return this.a;
    }

    public String getOid() {
        return this.c;
    }

    public boolean isAutoApproval() {
        return this.e;
    }

    public void setAutoApproval(boolean z) {
        this.e = z;
    }

    public void setKeySpec(KeySpecification keySpecification) {
        this.d = keySpecification;
    }

    public void setLocalizedName(String str) {
        this.b = str;
    }

    public void setName(String str) {
        this.a = str;
    }

    public void setOid(String str) {
        this.c = str;
    }

    public String toString() {
        return "name: " + this.a + ", localized name: " + this.b + ", oid: " + this.c + ", key spec: " + this.d + ", auto approval: " + this.e;
    }
}
