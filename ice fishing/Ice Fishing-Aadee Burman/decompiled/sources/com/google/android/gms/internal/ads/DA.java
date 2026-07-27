package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class DA {

    /* renamed from: a, reason: collision with root package name */
    public final String f24359a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24360b;

    public DA(String str, String str2) {
        this.f24359a = str;
        this.f24360b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DA) {
            DA da = (DA) obj;
            String str = this.f24359a;
            if (str != null ? str.equals(da.f24359a) : da.f24359a == null) {
                String str2 = this.f24360b;
                if (str2 != null ? str2.equals(da.f24360b) : da.f24360b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f24359a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f24360b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f24359a;
        int length = String.valueOf(str).length();
        String str2 = this.f24360b;
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        u1.h.i(sb, "OverlayDisplayUpdateRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }
}
