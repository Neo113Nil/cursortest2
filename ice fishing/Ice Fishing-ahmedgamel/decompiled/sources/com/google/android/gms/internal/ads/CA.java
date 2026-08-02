package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class CA {

    /* renamed from: a, reason: collision with root package name */
    public final int f24822a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24823b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24824c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f24825d;

    public CA(int i, String str, int i4, Boolean bool) {
        this.f24822a = i;
        this.f24823b = str;
        this.f24824c = i4;
        this.f24825d = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CA) {
            CA ca = (CA) obj;
            if (this.f24822a == ca.f24822a) {
                String str = ca.f24823b;
                String str2 = this.f24823b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f24824c == ca.f24824c) {
                        Boolean bool = ca.f24825d;
                        Boolean bool2 = this.f24825d;
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
        String str = this.f24823b;
        int hashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.f24825d;
        return (bool != null ? bool.hashCode() : 0) ^ ((((hashCode ^ ((this.f24822a ^ 1000003) * 1000003)) * 1000003) ^ this.f24824c) * 1000003);
    }

    public final String toString() {
        int i = this.f24822a;
        int length = String.valueOf(i).length();
        String str = this.f24823b;
        int length2 = String.valueOf(str).length();
        int i4 = this.f24824c;
        int length3 = String.valueOf(i4).length();
        Boolean bool = this.f24825d;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + length3 + 17 + String.valueOf(bool).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i);
        sb.append(", sessionToken=");
        sb.append(str);
        sb.append(", uiMode=");
        sb.append(i4);
        sb.append(", userInteracted=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }
}
