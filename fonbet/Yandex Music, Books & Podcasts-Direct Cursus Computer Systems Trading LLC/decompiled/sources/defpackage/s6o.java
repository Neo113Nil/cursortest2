package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s6o {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final xdr d;

    public s6o() {
        bdt I = hag.I(frt.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(d6m.class), true);
        this.c = l18Var.b(hag.I(oq7.class), true);
        this.d = fzk.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        m6o m6oVar;
        nm6 nm6Var;
        int i;
        s6o s6oVar;
        Object k;
        boolean z;
        s6o s6oVar2;
        if (cg6Var instanceof m6o) {
            m6oVar = (m6o) cg6Var;
            int i2 = m6oVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m6oVar.n = i2 - Integer.MIN_VALUE;
                Object obj = m6oVar.l;
                nm6Var = nm6.a;
                i = m6oVar.n;
                jyr jyrVar = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    frt frtVar = (frt) jyrVar.getValue();
                    m6oVar.j = this;
                    m6oVar.n = 1;
                    obj = frtVar.f(m6oVar);
                    if (obj != nm6Var) {
                        s6oVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = m6oVar.k;
                    s6oVar2 = m6oVar.j;
                    qgg.h0(obj);
                    yxc yxcVar = (yxc) obj;
                    boolean z2 = yxcVar == null && yxcVar.g;
                    jyr jyrVar2 = p6m.f;
                    boolean d = Intrinsics.d((!o6m.e() ? ((j6m) ((d6m) this.b.getValue())).j : ydr.a(t6m.a)).getValue(), r6m.a);
                    boolean booleanValue = ((Boolean) this.d.getValue()).booleanValue();
                    e6l e6lVar = (e6l) ((oq7) this.c.getValue()).a.c.getValue();
                    e6lVar.getClass();
                    boolean d2 = Intrinsics.d(e6lVar, b6l.a);
                    s6oVar2.getClass();
                    return Boolean.valueOf((z || !z2 || d || booleanValue || !d2) ? false : true);
                }
                s6oVar = m6oVar.j;
                qgg.h0(obj);
                boolean a = ((xxq) obj).a();
                frt frtVar2 = (frt) jyrVar.getValue();
                m6oVar.j = s6oVar;
                m6oVar.k = a;
                m6oVar.n = 2;
                k = frtVar2.k(m6oVar);
                if (k != nm6Var) {
                    z = a;
                    obj = k;
                    s6oVar2 = s6oVar;
                    yxc yxcVar2 = (yxc) obj;
                    if (yxcVar2 == null) {
                    }
                    jyr jyrVar22 = p6m.f;
                    boolean d3 = Intrinsics.d((!o6m.e() ? ((j6m) ((d6m) this.b.getValue())).j : ydr.a(t6m.a)).getValue(), r6m.a);
                    boolean booleanValue2 = ((Boolean) this.d.getValue()).booleanValue();
                    e6l e6lVar2 = (e6l) ((oq7) this.c.getValue()).a.c.getValue();
                    e6lVar2.getClass();
                    boolean d22 = Intrinsics.d(e6lVar2, b6l.a);
                    s6oVar2.getClass();
                    return Boolean.valueOf((z || !z2 || d3 || booleanValue2 || !d22) ? false : true);
                }
                return nm6Var;
            }
        }
        m6oVar = new m6o(this, cg6Var);
        Object obj2 = m6oVar.l;
        nm6Var = nm6.a;
        i = m6oVar.n;
        jyr jyrVar3 = this.a;
        if (i != 0) {
        }
        boolean a2 = ((xxq) obj2).a();
        frt frtVar22 = (frt) jyrVar3.getValue();
        m6oVar.j = s6oVar;
        m6oVar.k = a2;
        m6oVar.n = 2;
        k = frtVar22.k(m6oVar);
        if (k != nm6Var) {
        }
        return nm6Var;
    }
}
