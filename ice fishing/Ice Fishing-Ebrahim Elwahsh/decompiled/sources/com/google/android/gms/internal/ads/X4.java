package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class X4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f28602a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28603b;

    public X4(String str, String str2) {
        this.f28602a = str;
        this.f28603b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X4.class == obj.getClass()) {
            X4 x42 = (X4) obj;
            if (TextUtils.equals(this.f28602a, x42.f28602a) && TextUtils.equals(this.f28603b, x42.f28603b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f28603b.hashCode() + (this.f28602a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f28602a;
        int length = String.valueOf(str).length();
        String str2 = this.f28603b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        AbstractC5051n.j(sb, "Header[name=", str, ",value=", str2);
        sb.append("]");
        return sb.toString();
    }
}
