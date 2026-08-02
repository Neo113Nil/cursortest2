package ru.CryptoPro.JCPRequest.ca20.decoder;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class CA20UserRegistrationField {
    public String a;
    public String b;
    public String c;
    public String[] d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;

    public CA20UserRegistrationField(String str, String str2, String str3, String[] strArr, String str4, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public String getDefaultValue() {
        return this.e;
    }

    public String getLocalizedName() {
        return this.c;
    }

    public String getName() {
        return this.b;
    }

    public String getOid() {
        return this.a;
    }

    public String[] getSettingsValues() {
        return this.d;
    }

    public boolean isProhibitAnyValue() {
        return this.f;
    }

    public boolean isProhibitChange() {
        return this.g;
    }

    public boolean isProhibitEmpty() {
        return this.h;
    }

    public void setDefaultValue(String str) {
        this.e = str;
    }

    public void setLocalizedName(String str) {
        this.c = str;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setOid(String str) {
        this.a = str;
    }

    public void setProhibitAnyValue(boolean z) {
        this.f = z;
    }

    public void setProhibitChange(boolean z) {
        this.g = z;
    }

    public void setProhibitEmpty(boolean z) {
        this.h = z;
    }

    public void setSettingsValues(String[] strArr) {
        this.d = strArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("oid: ");
        sb.append(this.a);
        sb.append(", name: ");
        sb.append(this.b);
        sb.append(", localized name: ");
        sb.append(this.c);
        sb.append(", default value: ");
        sb.append(this.e);
        sb.append(", prohibit any value: ");
        sb.append(this.f);
        sb.append(", prohibit change: ");
        sb.append(this.g);
        sb.append(", prohibit empty: ");
        sb.append(this.h);
        if (this.d != null) {
            sb.append(", settings values: [");
            for (String str : this.d) {
                sb.append(str);
                sb.append(Extension.SEMICOLON_SPACE);
            }
            sb.append("]");
        }
        return sb.toString();
    }
}
