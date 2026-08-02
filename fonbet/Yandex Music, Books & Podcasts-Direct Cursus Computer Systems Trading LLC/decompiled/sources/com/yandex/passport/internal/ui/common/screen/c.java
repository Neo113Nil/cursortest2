package com.yandex.passport.internal.ui.common.screen;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    public final Throwable a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public c(Throwable th, String str, String str2, String str3, boolean z, boolean z2) {
        th.getClass();
        str.getClass();
        str3.getClass();
        this.a = th;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && Intrinsics.d(this.b, cVar.b) && this.c.equals(cVar.c) && Intrinsics.d(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + k5r.e(k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorScreenState(throwable=");
        sb.append(this.a);
        sb.append(", applicationPackageName=");
        sb.append(this.b);
        sb.append(", deviceId=");
        sb.append(this.c);
        sb.append(", time=");
        sb.append(this.d);
        sb.append(", isShowCancelButton=");
        sb.append(this.e);
        sb.append(", isShowPackageName=");
        return dfi.j(sb, this.f, ')');
    }
}
