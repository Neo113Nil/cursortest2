package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 {
    public final com.yandex.passport.internal.l a;
    public final String b;
    public final String c;

    public j0(com.yandex.passport.internal.l lVar, String str, String str2) {
        lVar.getClass();
        str.getClass();
        this.a = lVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.a, j0Var.a) && Intrinsics.d(this.b, j0Var.b) && Intrinsics.d(this.c, j0Var.c);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Phonish(modernAccount=");
        sb.append(this.a);
        sb.append(", phone=");
        sb.append(this.b);
        sb.append(", deleteMessageOverride=");
        return dfi.i(sb, this.c, ')');
    }
}
