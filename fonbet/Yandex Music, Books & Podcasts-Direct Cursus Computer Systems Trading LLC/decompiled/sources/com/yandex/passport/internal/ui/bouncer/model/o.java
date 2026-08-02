package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.f1d;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements k0 {
    public final String a;
    public final String b;
    public final Throwable c;

    public o(String str, String str2, Throwable th) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.a, oVar.a) && Intrinsics.d(this.b, oVar.b) && Intrinsics.d(this.c, oVar.c);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        Throwable th = this.c;
        return c + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(tag=");
        sb.append(this.a);
        sb.append(", publicDescription=");
        sb.append(this.b);
        sb.append(", th=");
        return f1d.k(sb, this.c, ')');
    }
}
