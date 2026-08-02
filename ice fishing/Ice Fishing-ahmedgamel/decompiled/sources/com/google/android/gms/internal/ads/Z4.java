package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class Z4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29617a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29618b;

    public Z4(String str, String str2) {
        this.f29617a = str;
        this.f29618b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z4.class == obj.getClass()) {
            Z4 z42 = (Z4) obj;
            if (TextUtils.equals(this.f29617a, z42.f29617a) && TextUtils.equals(this.f29618b, z42.f29618b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29618b.hashCode() + (this.f29617a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f29617a;
        int length = String.valueOf(str).length();
        String str2 = this.f29618b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        AbstractC5128c.h(sb, "Header[name=", str, ",value=", str2);
        sb.append("]");
        return sb.toString();
    }
}
