package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class Z4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f28837a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28838b;

    public Z4(String str, String str2) {
        this.f28837a = str;
        this.f28838b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z4.class == obj.getClass()) {
            Z4 z42 = (Z4) obj;
            if (TextUtils.equals(this.f28837a, z42.f28837a) && TextUtils.equals(this.f28838b, z42.f28838b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f28838b.hashCode() + (this.f28837a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f28837a;
        int length = String.valueOf(str).length();
        String str2 = this.f28838b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        u1.h.i(sb, "Header[name=", str, ",value=", str2);
        sb.append("]");
        return sb.toString();
    }
}
