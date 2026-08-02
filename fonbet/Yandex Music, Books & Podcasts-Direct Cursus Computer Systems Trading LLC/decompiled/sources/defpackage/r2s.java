package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class r2s implements tqq, wmm {
    public final m2s a;
    public final q2s b;
    public final w2r c;
    public final ArrayList d;
    public final xdr e;
    public final xdr f;
    public final xdr g;
    public final xdr h;
    public final x0q i;
    public final x0q j;
    public final xdr k;
    public final xdr l;
    public final t6k m;
    public rar n;
    public kzp o;
    public volatile boolean p;

    public r2s(m2s m2sVar, q2s q2sVar, w2r w2rVar) {
        m2sVar.getClass();
        this.a = m2sVar;
        this.b = q2sVar;
        this.c = w2rVar;
        ArrayList arrayList = m2sVar.c;
        this.d = arrayList;
        xdr a = ydr.a(0);
        this.e = a;
        this.f = a;
        xdr a2 = ydr.a(new y2s(ocg.G(arrayList), true));
        this.g = a2;
        this.h = a2;
        x0q b = y0q.b(0, 1, oi3.b, 1);
        this.i = b;
        this.j = b;
        xdr a3 = ydr.a(Boolean.FALSE);
        this.k = a3;
        this.l = a3;
        this.m = new t6k(1.0f);
        int i = m2sVar.b;
        if (((r0s) CollectionsKt.S(arrayList, i)) != null) {
            a.m(null, Integer.valueOf(i));
            w2rVar.e(i);
        }
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a;
    }

    @Override // defpackage.tqq
    public final List c() {
        return this.d;
    }

    @Override // defpackage.wmm
    public final void cancel() {
        rar rarVar = this.n;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.n = null;
    }

    @Override // defpackage.tqq
    public final vdr e() {
        return this.l;
    }

    @Override // defpackage.tqq
    public final void g(int i) {
        this.i.a(Unit.a);
        Integer valueOf = Integer.valueOf(i);
        xdr xdrVar = this.e;
        xdrVar.getClass();
        xdrVar.m(null, valueOf);
        this.c.e(i);
    }

    @Override // defpackage.wmm
    public final void h() {
        cancel();
        this.p = true;
    }

    @Override // defpackage.tqq
    public final pjc i() {
        return this.j;
    }

    @Override // defpackage.tqq
    public final vdr j() {
        return this.f;
    }

    @Override // defpackage.wmm
    public final void k(kzp kzpVar) {
        this.o = kzpVar;
    }

    @Override // defpackage.wmm
    public final void l(mm6 mm6Var) {
        onq onqVar = this.a.d;
        if (onqVar == null) {
            return;
        }
        rar rarVar = this.n;
        if (rarVar == null || !rarVar.b()) {
            if (this.p || !(this.g.getValue() instanceof z2s)) {
                rar rarVar2 = this.n;
                Continuation continuation = null;
                if (rarVar2 != null) {
                    rarVar2.g(null);
                }
                this.n = x97.y(mm6Var, null, null, new v0r(this, onqVar, continuation, 16), 3);
            }
        }
    }

    @Override // defpackage.tqq, defpackage.rnq
    public final m2s a() {
        return this.a;
    }
}
