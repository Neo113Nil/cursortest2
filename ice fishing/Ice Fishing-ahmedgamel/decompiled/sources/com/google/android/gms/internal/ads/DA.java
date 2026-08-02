package com.google.android.gms.internal.ads;

import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class DA {

    /* renamed from: a, reason: collision with root package name */
    public final String f25104a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25105b;

    public DA(String str, String str2) {
        this.f25104a = str;
        this.f25105b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DA) {
            DA da = (DA) obj;
            String str = this.f25104a;
            if (str != null ? str.equals(da.f25104a) : da.f25104a == null) {
                String str2 = this.f25105b;
                if (str2 != null ? str2.equals(da.f25105b) : da.f25105b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f25104a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f25105b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f25104a;
        int length = String.valueOf(str).length();
        String str2 = this.f25105b;
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        AbstractC5128c.h(sb, "OverlayDisplayUpdateRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }
}
