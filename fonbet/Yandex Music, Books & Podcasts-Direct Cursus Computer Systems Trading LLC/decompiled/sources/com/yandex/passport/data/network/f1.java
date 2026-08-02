package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class f1 {

    @NotNull
    public static final e1 Companion = new e1();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public /* synthetic */ f1(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, d1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Intrinsics.d(this.a, f1Var.a) && this.b == f1Var.b && this.c == f1Var.c && this.d == f1Var.d && this.e == f1Var.e && Intrinsics.d(this.f, f1Var.f);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e(k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", isComplete=");
        sb.append(this.b);
        sb.append(", isCompletionAvailable=");
        sb.append(this.c);
        sb.append(", isCompletionRecommended=");
        sb.append(this.d);
        sb.append(", isCompletionRequired=");
        sb.append(this.e);
        sb.append(", completionUrl=");
        return dfi.i(sb, this.f, ')');
    }

    public f1(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = str2;
    }
}
