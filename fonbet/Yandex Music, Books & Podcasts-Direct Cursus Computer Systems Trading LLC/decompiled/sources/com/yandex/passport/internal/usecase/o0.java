package com.yandex.passport.internal.usecase;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 {
    public final com.yandex.passport.internal.l a;
    public final com.yandex.passport.internal.credentials.f b;
    public final boolean c;

    public o0(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.credentials.f fVar, boolean z) {
        lVar.getClass();
        this.a = lVar;
        this.b = fVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.a, o0Var.a) && Intrinsics.d(this.b, o0Var.b) && this.c == o0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.passport.internal.credentials.f fVar = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(account=");
        sb.append(this.a);
        sb.append(", clientCredentials=");
        sb.append(this.b);
        sb.append(", forceNew=");
        return dfi.j(sb, this.c, ')');
    }

    public /* synthetic */ o0(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.credentials.f fVar, int i) {
        this(lVar, (i & 2) != 0 ? null : fVar, false);
    }
}
