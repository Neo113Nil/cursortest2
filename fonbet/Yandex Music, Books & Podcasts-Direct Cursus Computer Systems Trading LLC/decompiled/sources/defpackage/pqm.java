package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class pqm implements jx7 {
    public final /* synthetic */ jx7 a;
    public boolean b;
    public boolean c;
    public final qqi d = new qqi(false);

    public pqm(jx7 jx7Var) {
        this.a = jx7Var;
    }

    @Override // defpackage.jx7
    public final long B0(long j) {
        return this.a.B0(j);
    }

    @Override // defpackage.jx7
    public final int L(float f) {
        return this.a.L(f);
    }

    @Override // defpackage.jx7
    public final float N(long j) {
        return this.a.N(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        mqm mqmVar;
        Object obj;
        int i;
        if (cg6Var instanceof mqm) {
            mqmVar = (mqm) cg6Var;
            int i2 = mqmVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mqmVar.l = i2 - Integer.MIN_VALUE;
                obj = mqmVar.j;
                Object obj2 = nm6.a;
                i = mqmVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    mqmVar.l = 1;
                    obj = h(mqmVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new d6d("The press gesture was canceled.");
                }
                return Unit.a;
            }
        }
        mqmVar = new mqm(this, cg6Var);
        obj = mqmVar.j;
        Object obj22 = nm6.a;
        i = mqmVar.l;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void b() {
        this.c = true;
        qqi qqiVar = this.d;
        if (qqiVar.f()) {
            qqiVar.b(null);
        }
    }

    public final void c() {
        this.b = true;
        qqi qqiVar = this.d;
        if (qqiVar.f()) {
            qqiVar.b(null);
        }
    }

    @Override // defpackage.jx7
    public final float c0(int i) {
        return this.a.c0(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        nqm nqmVar;
        int i;
        pqm pqmVar;
        if (cg6Var instanceof nqm) {
            nqmVar = (nqm) cg6Var;
            int i2 = nqmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nqmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = nqmVar.k;
                nm6 nm6Var = nm6.a;
                i = nqmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    nqmVar.j = this;
                    nqmVar.m = 1;
                    if (this.d.a(nqmVar) == nm6Var) {
                        return nm6Var;
                    }
                    pqmVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pqmVar = nqmVar.j;
                    qgg.h0(obj);
                }
                pqmVar.b = false;
                pqmVar.c = false;
                return Unit.a;
            }
        }
        nqmVar = new nqm(this, cg6Var);
        Object obj2 = nqmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nqmVar.m;
        if (i != 0) {
        }
        pqmVar.b = false;
        pqmVar.c = false;
        return Unit.a;
    }

    @Override // defpackage.jx7
    public final float d0(float f) {
        return this.a.d0(f);
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.a.getDensity();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(cg6 cg6Var) {
        oqm oqmVar;
        int i;
        pqm pqmVar;
        if (cg6Var instanceof oqm) {
            oqmVar = (oqm) cg6Var;
            int i2 = oqmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oqmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = oqmVar.k;
                nm6 nm6Var = nm6.a;
                i = oqmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.b || this.c) {
                        pqmVar = this;
                        return Boolean.valueOf(pqmVar.b);
                    }
                    oqmVar.j = this;
                    oqmVar.m = 1;
                    if (this.d.a(oqmVar) == nm6Var) {
                        return nm6Var;
                    }
                    pqmVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pqmVar = oqmVar.j;
                    qgg.h0(obj);
                }
                pqmVar.d.b(null);
                return Boolean.valueOf(pqmVar.b);
            }
        }
        oqmVar = new oqm(this, cg6Var);
        Object obj2 = oqmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = oqmVar.m;
        if (i != 0) {
        }
        pqmVar.d.b(null);
        return Boolean.valueOf(pqmVar.b);
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.a.i0();
    }

    @Override // defpackage.jx7
    public final long l(float f) {
        return this.a.l(f);
    }

    @Override // defpackage.jx7
    public final long m(long j) {
        return this.a.m(j);
    }

    @Override // defpackage.jx7
    public final float n0(float f) {
        return this.a.n0(f);
    }

    @Override // defpackage.jx7
    public final float p(long j) {
        return this.a.p(j);
    }

    @Override // defpackage.jx7
    public final int s0(long j) {
        return this.a.s0(j);
    }

    @Override // defpackage.jx7
    public final long w(float f) {
        return this.a.w(f);
    }
}
