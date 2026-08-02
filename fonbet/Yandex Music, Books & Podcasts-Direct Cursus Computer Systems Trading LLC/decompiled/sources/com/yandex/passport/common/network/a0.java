package com.yandex.passport.common.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.q5f;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.w4f;
import defpackage.x4f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class a0 implements h0 {

    @NotNull
    public static final z Companion = new z();
    public final q5f a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ a0(int i, q5f q5fVar, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, y.a.getDescriptor());
            throw null;
        }
        this.a = q5fVar;
        if ((i & 2) == 0) {
            w4f w4fVar = (w4f) x4f.f(q5fVar).get("phrase");
            str = String.valueOf(w4fVar != null ? x4f.g(w4fVar) : null);
        }
        this.b = str;
        if ((i & 4) == 0) {
            w4f w4fVar2 = (w4f) x4f.f(q5fVar).get("trace");
            this.c = String.valueOf(w4fVar2 != null ? x4f.g(w4fVar2) : null);
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    @Override // com.yandex.passport.common.network.h0
    public final c a() {
        return new c(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.a, a0Var.a) && Intrinsics.d(this.b, a0Var.b) && Intrinsics.d(this.c, a0Var.c) && Intrinsics.d(this.d, a0Var.d);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhraseTraceErrorResponse(status=");
        sb.append(this.a);
        sb.append(", phrase=");
        sb.append(this.b);
        sb.append(", trace=");
        sb.append(this.c);
        sb.append(", requestId=");
        return dfi.i(sb, this.d, ')');
    }
}
