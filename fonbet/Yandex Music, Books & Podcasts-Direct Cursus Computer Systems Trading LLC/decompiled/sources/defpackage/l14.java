package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class l14 extends xmm implements ayd {
    public final /* synthetic */ byd d;
    public final s63 e;
    public final q43 f;
    public final j14 g;
    public final jyr h;
    public final r04 i;
    public final xdr j;

    public l14(s63 s63Var, q43 q43Var, j14 j14Var, jyr jyrVar, jyr jyrVar2) {
        j14Var.getClass();
        drf drfVar = s63Var.a;
        wfm wfmVar = (wfm) drfVar;
        wfmVar.getClass();
        this.d = new byd(wfmVar, jyrVar2);
        this.e = s63Var;
        this.f = q43Var;
        this.g = j14Var;
        this.h = jyrVar;
        r04 r04Var = (r04) drfVar;
        this.i = r04Var;
        this.j = ydr.a(new lgt(r04Var.a().a, true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.i;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.j.getValue() instanceof ygt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f9, code lost:
    
        if (r11.d.a(r13, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007f, code lost:
    
        if (r13 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        k14 k14Var;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof k14) {
            k14Var = (k14) cg6Var;
            int i2 = k14Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k14Var.m = i2 - Integer.MIN_VALUE;
                Object obj = k14Var.k;
                nm6 nm6Var = nm6.a;
                i = k14Var.m;
                xdr xdrVar = this.j;
                r04 r04Var = this.i;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        lgt lgtVar = new lgt(r04Var.a().a, true);
                        xdrVar.getClass();
                        xdrVar.m(null, lgtVar);
                    }
                    k14Var.j = z;
                    k14Var.m = 1;
                    j14 j14Var = this.g;
                    j14Var.getClass();
                    if (r04Var instanceof tig) {
                        obj = new qj6(new r14(((tig) r04Var).d, null));
                    } else {
                        if (!(r04Var instanceof run)) {
                            b6e.s();
                            return null;
                        }
                        obj = j14Var.a((uvn) r04Var, z, k14Var);
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return new d73(r04Var);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = k14Var.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    p();
                    ((pj6) rj6Var).a();
                    return new c73(r04Var);
                }
                r14 r14Var = (r14) ((qj6) rj6Var).a;
                ArrayList<yit> arrayList = r14Var.a;
                ArrayList arrayList2 = new ArrayList();
                for (yit yitVar : arrayList) {
                    ((s14) this.h.getValue()).getClass();
                    c24 a = s14.a(yitVar);
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                boolean isEmpty = arrayList2.isEmpty();
                if (isEmpty) {
                    p();
                } else {
                    if (isEmpty) {
                        b6e.s();
                        return null;
                    }
                    ygt ygtVar = new ygt(r04Var.a().a, arrayList2);
                    xdrVar.getClass();
                    xdrVar.m(null, ygtVar);
                }
                int size = arrayList2.size();
                p43 p43Var = r14Var.b;
                String str = p43Var != null ? p43Var.a : null;
                q43 q43Var = this.f;
                q43Var.b(q43Var.a, size, str, null);
                boolean isEmpty2 = arrayList2.isEmpty();
                k14Var.j = z;
                k14Var.m = 2;
            }
        }
        k14Var = new k14(this, cg6Var);
        Object obj2 = k14Var.k;
        nm6 nm6Var2 = nm6.a;
        i = k14Var.m;
        xdr xdrVar2 = this.j;
        r04 r04Var2 = this.i;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    public final void p() {
        if (n()) {
            return;
        }
        lgt lgtVar = new lgt(this.i.a().a, false);
        xdr xdrVar = this.j;
        xdrVar.getClass();
        xdrVar.m(null, lgtVar);
    }
}
