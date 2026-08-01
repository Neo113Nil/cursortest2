package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class SP {

    /* renamed from: a, reason: collision with root package name */
    public final String f27482a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27483b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27484c;

    public SP(String str, boolean z3, boolean z6) {
        this.f27482a = str;
        this.f27483b = z3;
        this.f27484c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != SP.class) {
            return false;
        }
        SP sp = (SP) obj;
        return TextUtils.equals(this.f27482a, sp.f27482a) && this.f27483b == sp.f27483b && this.f27484c == sp.f27484c;
    }

    public final int hashCode() {
        return ((((this.f27482a.hashCode() + 31) * 31) + (true != this.f27483b ? 1237 : 1231)) * 31) + (true != this.f27484c ? 1237 : 1231);
    }
}
