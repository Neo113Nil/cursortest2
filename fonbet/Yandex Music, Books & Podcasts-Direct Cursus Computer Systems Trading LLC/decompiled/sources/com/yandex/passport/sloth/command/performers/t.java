package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.data.k0;
import com.yandex.passport.sloth.data.m0;
import com.yandex.passport.sloth.data.n0;
import com.yandex.passport.sloth.data.o0;
import com.yandex.passport.sloth.r0;
import com.yandex.passport.sloth.z0;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.l2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.uah;
import defpackage.xq0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t implements com.yandex.passport.sloth.command.r {
    public final com.yandex.passport.sloth.data.m a;
    public final com.yandex.passport.sloth.v b;
    public final a1 c;
    public final z0 d;

    public t(com.yandex.passport.sloth.data.m mVar, com.yandex.passport.sloth.v vVar, a1 a1Var, z0 z0Var) {
        mVar.getClass();
        vVar.getClass();
        a1Var.getClass();
        z0Var.getClass();
        this.a = mVar;
        this.b = vVar;
        this.c = a1Var;
        this.d = z0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
    
        if (r3.b(r8, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0104, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0052, code lost:
    
        if (r3.b(r8, r0) == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.yandex.passport.sloth.command.r
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(com.yandex.passport.sloth.command.data.g0 g0Var, cg6 cg6Var) {
        s sVar;
        int i;
        boolean d;
        com.yandex.passport.sloth.data.n nVar;
        if (cg6Var instanceof s) {
            sVar = (s) cg6Var;
            int i2 = sVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.m = i2 - Integer.MIN_VALUE;
                Object obj = sVar.k;
                nm6 nm6Var = nm6.a;
                i = sVar.m;
                com.yandex.passport.sloth.v vVar = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    d = Intrinsics.d(g0Var.a, "ok");
                    com.yandex.passport.sloth.q qVar = new com.yandex.passport.sloth.q(d);
                    sVar.j = d;
                    sVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return new l2b(com.yandex.passport.sloth.command.v.c);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d = sVar.j;
                    qgg.h0(obj);
                }
                if (d) {
                    com.yandex.passport.sloth.q qVar2 = new com.yandex.passport.sloth.q(d);
                    sVar.j = d;
                    sVar.m = 2;
                } else {
                    o0 o0Var = this.a.a;
                    com.yandex.passport.sloth.data.k kVar = o0Var.a;
                    z0 z0Var = this.d;
                    z0Var.getClass();
                    if (o0Var instanceof com.yandex.passport.sloth.data.r) {
                        com.yandex.passport.sloth.dependencies.e d2 = ((com.yandex.passport.sloth.data.r) o0Var).d();
                        d2.getClass();
                        nVar = z0Var.a.a;
                        if (nVar == com.yandex.passport.sloth.data.n.Portal && d2.g.contains(com.yandex.passport.sloth.command.data.a1.b)) {
                            nVar = com.yandex.passport.sloth.data.n.Neophonish;
                        }
                    } else {
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.y) && !(o0Var instanceof com.yandex.passport.sloth.data.v) && !(o0Var instanceof com.yandex.passport.sloth.data.w) && !(o0Var instanceof com.yandex.passport.sloth.data.x) && !(o0Var instanceof com.yandex.passport.sloth.data.g0) && !(o0Var instanceof n0) && !(o0Var instanceof com.yandex.passport.sloth.data.u) && !(o0Var instanceof m0) && !(o0Var instanceof com.yandex.passport.sloth.data.z) && !(o0Var instanceof com.yandex.passport.sloth.data.t) && !(o0Var instanceof com.yandex.passport.sloth.data.d0) && !(o0Var instanceof com.yandex.passport.sloth.data.c0) && !(o0Var instanceof k0) && !(o0Var instanceof com.yandex.passport.sloth.data.a0) && !(o0Var instanceof com.yandex.passport.sloth.data.h0)) {
                            b6e.s();
                            return null;
                        }
                        nVar = com.yandex.passport.sloth.data.n.Nothing;
                    }
                    kVar.getClass();
                    this.c.a(new com.yandex.passport.sloth.n0(16, r0.ACTIVATED, uah.e(new Pair("mode", kVar.a), new Pair("reg_type", nVar.a))));
                }
                return new l2b(com.yandex.passport.sloth.command.v.c);
            }
        }
        sVar = new s(this, cg6Var);
        Object obj2 = sVar.k;
        nm6 nm6Var2 = nm6.a;
        i = sVar.m;
        com.yandex.passport.sloth.v vVar2 = this.b;
        if (i != 0) {
        }
        if (d) {
        }
        return new l2b(com.yandex.passport.sloth.command.v.c);
    }
}
