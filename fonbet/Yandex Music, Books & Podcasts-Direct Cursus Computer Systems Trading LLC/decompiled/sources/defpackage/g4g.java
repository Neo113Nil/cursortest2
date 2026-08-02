package defpackage;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final class g4g {
    public final l0g a;
    public final bff b;
    public final mm6 c;
    public final ou7 d;
    public volatile boolean e;
    public volatile int f;
    public volatile boolean g;

    public g4g(l0g l0gVar, bff bffVar, tf6 tf6Var) {
        tf6Var.getClass();
        this.a = l0gVar;
        this.b = bffVar;
        this.c = tf6Var;
        this.d = x97.p(tf6Var, null, null, new f4g(this, null, 2), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        d4g d4gVar;
        int i;
        if (cg6Var instanceof d4g) {
            d4gVar = (d4g) cg6Var;
            int i2 = d4gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d4gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = d4gVar.j;
                nm6 nm6Var = nm6.a;
                i = d4gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!this.g) {
                        ou7 ou7Var = this.d;
                        d4gVar.l = 1;
                        obj = ou7Var.s(d4gVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                h0g h0gVar = (h0g) obj;
                this.e = h0gVar.a;
                this.f = h0gVar.b;
                this.g = true;
                return Unit.a;
            }
        }
        d4gVar = new d4g(this, cg6Var);
        Object obj2 = d4gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = d4gVar.l;
        if (i != 0) {
        }
        h0g h0gVar2 = (h0g) obj2;
        this.e = h0gVar2.a;
        this.f = h0gVar2.b;
        this.g = true;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(cg6 cg6Var) {
        e4g e4gVar;
        int i;
        if (cg6Var instanceof e4g) {
            e4gVar = (e4g) cg6Var;
            int i2 = e4gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e4gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = e4gVar.j;
                nm6 nm6Var = nm6.a;
                i = e4gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    e4gVar.l = 1;
                    if (a(e4gVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((Boolean) this.b.invoke()).booleanValue() ? c4g.b : this.f >= 2 ? !this.e ? c4g.a : c4g.c : c4g.b;
            }
        }
        e4gVar = new e4g(this, cg6Var);
        Object obj2 = e4gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = e4gVar.l;
        if (i != 0) {
        }
        if (((Boolean) this.b.invoke()).booleanValue()) {
        }
    }
}
