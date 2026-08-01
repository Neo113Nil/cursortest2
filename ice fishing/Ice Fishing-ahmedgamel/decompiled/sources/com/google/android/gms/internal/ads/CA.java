package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class CA {

    /* renamed from: a, reason: collision with root package name */
    public final int f24059a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24060b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24061c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f24062d;

    public CA(int i, String str, int i6, Boolean bool) {
        this.f24059a = i;
        this.f24060b = str;
        this.f24061c = i6;
        this.f24062d = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CA) {
            CA ca = (CA) obj;
            if (this.f24059a == ca.f24059a) {
                String str = ca.f24060b;
                String str2 = this.f24060b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f24061c == ca.f24061c) {
                        Boolean bool = ca.f24062d;
                        Boolean bool2 = this.f24062d;
                        if (bool2 != null ? bool2.equals(bool) : bool == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f24060b;
        int hashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.f24062d;
        return (bool != null ? bool.hashCode() : 0) ^ ((((hashCode ^ ((this.f24059a ^ 1000003) * 1000003)) * 1000003) ^ this.f24061c) * 1000003);
    }

    public final String toString() {
        int i = this.f24059a;
        int length = String.valueOf(i).length();
        String str = this.f24060b;
        int length2 = String.valueOf(str).length();
        int i6 = this.f24061c;
        int length3 = String.valueOf(i6).length();
        Boolean bool = this.f24062d;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + length3 + 17 + String.valueOf(bool).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i);
        sb.append(", sessionToken=");
        sb.append(str);
        sb.append(", uiMode=");
        sb.append(i6);
        sb.append(", userInteracted=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }
}
