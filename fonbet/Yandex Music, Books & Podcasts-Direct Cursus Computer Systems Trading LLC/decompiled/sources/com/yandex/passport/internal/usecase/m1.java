package com.yandex.passport.internal.usecase;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m1 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final com.yandex.passport.internal.core.tokens.a c;
    public final com.yandex.passport.internal.account.b d;
    public final com.yandex.passport.internal.analytics.o0 e;
    public final p f;
    public final com.yandex.passport.internal.core.accounts.s g;
    public final com.yandex.passport.internal.flags.i h;
    public final com.yandex.passport.internal.push.s0 i;
    public final com.yandex.passport.internal.push.u0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.core.tokens.a aVar2, com.yandex.passport.internal.account.b bVar, com.yandex.passport.internal.analytics.o0 o0Var, p pVar, com.yandex.passport.internal.core.accounts.s sVar, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.push.s0 s0Var, com.yandex.passport.internal.push.u0 u0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        eVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        o0Var.getClass();
        pVar.getClass();
        sVar.getClass();
        iVar.getClass();
        s0Var.getClass();
        u0Var.getClass();
        this.b = eVar;
        this.c = aVar2;
        this.d = bVar;
        this.e = o0Var;
        this.f = pVar;
        this.g = sVar;
        this.h = iVar;
        this.i = s0Var;
        this.j = u0Var;
    }

    public final void u(com.yandex.passport.internal.l lVar) {
        com.yandex.passport.common.core.f fVar = lVar.b;
        this.c.a(lVar);
        this.i.a(fVar, false);
        this.j.b(fVar);
        this.d.a(fVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|(1:21)(1:55)|(9:26|(4:29|(3:31|32|33)(1:35)|34|27)|36|37|(4:40|(3:42|43|44)(1:46)|45|38)|47|(1:49)|50|(1:52))|50|(0))|11|12|13))|63|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b1, code lost:
    
        u(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0031, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
    
        r10 = defpackage.z7o.b;
        r10 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d4, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x002e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d6, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x002b, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        r10 = defpackage.z7o.b;
        r10 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.core.app.n0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(com.yandex.passport.common.core.f fVar, Continuation continuation) {
        l1 l1Var;
        int i;
        p pVar;
        ArrayList g;
        if (continuation instanceof l1) {
            l1Var = (l1) continuation;
            int i2 = l1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = l1Var.j;
                nm6 nm6Var = nm6.a;
                i = l1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.internal.d a = this.b.a();
                    com.yandex.passport.internal.l e = a.e(fVar);
                    com.yandex.passport.common.core.f fVar2 = e != null ? e.c : null;
                    if (fVar2 != null && ((Boolean) this.h.b(com.yandex.passport.internal.flags.o.q0)).booleanValue()) {
                        ArrayList c = this.g.c(fVar2, a);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = c.iterator();
                        while (it.hasNext()) {
                            com.yandex.passport.internal.l e2 = a.e(((com.yandex.passport.internal.entities.n) it.next()).a);
                            if (e2 != null) {
                                arrayList.add(e2);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        boolean z = false;
                        while (it2.hasNext()) {
                            com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) it2.next();
                            u(lVar);
                            if (Intrinsics.d(lVar.b, e.b)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            u(e);
                        }
                        pVar = this.f;
                        g = a.g();
                        l1Var.l = 1;
                        if (pVar.g(g, l1Var) == nm6Var) {
                            return nm6Var;
                        }
                    }
                    pVar = this.f;
                    g = a.g();
                    l1Var.l = 1;
                    if (pVar.g(g, l1Var) == nm6Var) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.e.e(null);
                Object obj2 = Unit.a;
                r7o r7oVar2 = z7o.b;
                return new z7o(obj2);
            }
        }
        l1Var = new l1(this, (cg6) continuation);
        Object obj3 = l1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = l1Var.l;
        if (i != 0) {
        }
        this.e.e(null);
        Object obj22 = Unit.a;
        r7o r7oVar22 = z7o.b;
        return new z7o(obj22);
    }
}
