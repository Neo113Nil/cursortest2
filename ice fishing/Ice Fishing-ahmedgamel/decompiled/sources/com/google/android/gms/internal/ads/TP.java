package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class TP {

    /* renamed from: a, reason: collision with root package name */
    public final String f28523a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28524b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28525c;

    public TP(String str, boolean z6, boolean z9) {
        this.f28523a = str;
        this.f28524b = z6;
        this.f28525c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != TP.class) {
            return false;
        }
        TP tp = (TP) obj;
        return TextUtils.equals(this.f28523a, tp.f28523a) && this.f28524b == tp.f28524b && this.f28525c == tp.f28525c;
    }

    public final int hashCode() {
        return ((((this.f28523a.hashCode() + 31) * 31) + (true != this.f28524b ? 1237 : 1231)) * 31) + (true != this.f28525c ? 1237 : 1231);
    }
}
