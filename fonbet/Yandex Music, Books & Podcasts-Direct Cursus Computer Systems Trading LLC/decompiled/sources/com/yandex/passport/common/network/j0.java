package com.yandex.passport.common.network;

import defpackage.cg6;
import defpackage.d0o;
import defpackage.l3o;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class j0 extends com.yandex.passport.common.domain.e {
    public com.yandex.passport.common.domain.b e;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object B(j0 j0Var, d0o d0oVar, cg6 cg6Var) {
        i0 i0Var;
        int i;
        Object v;
        if (cg6Var instanceof i0) {
            i0Var = (i0) cg6Var;
            int i2 = i0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = i0Var.j;
                nm6 nm6Var = nm6.a;
                i = i0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    i0Var.l = 1;
                    v = com.yandex.passport.common.domain.e.v(j0Var, d0oVar, i0Var);
                    if (v == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    v = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (!(v instanceof t7o)) {
                    return v;
                }
                try {
                    l3o l3oVar = (l3o) v;
                    boolean b = l3oVar.b();
                    int i3 = l3oVar.d;
                    if (!b && i3 != 304 && l3oVar.g == null) {
                        throw new IOException("Response code " + i3);
                    }
                    return l3oVar;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    return new t7o(th);
                }
            }
        }
        i0Var = new i0(j0Var, cg6Var);
        Object obj2 = i0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = i0Var.l;
        if (i != 0) {
        }
        r7o r7oVar3 = z7o.b;
        if (!(v instanceof t7o)) {
        }
    }

    @Override // com.yandex.passport.common.domain.e
    public final boolean A(Throwable th) {
        return th instanceof IOException;
    }

    @Override // com.yandex.passport.common.domain.e
    public final Object u(Object obj, com.yandex.passport.common.domain.d dVar) {
        return B(this, (d0o) obj, dVar);
    }

    @Override // com.yandex.passport.common.domain.e
    public final com.yandex.passport.common.domain.b y() {
        return this.e;
    }
}
