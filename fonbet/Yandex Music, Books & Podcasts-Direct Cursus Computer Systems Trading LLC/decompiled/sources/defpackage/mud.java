package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mud implements fud {
    public final long a;
    public final mm6 b;
    public final dud c;
    public final Context d;
    public final cce e;
    public final fk0 f;
    public final x0q g;
    public final vm0 h;
    public final x6k i;

    public mud(long j, mm6 mm6Var, dud dudVar, Context context, cce cceVar) {
        dudVar.getClass();
        context.getClass();
        cceVar.getClass();
        this.a = j;
        this.b = mm6Var;
        this.c = dudVar;
        this.d = context;
        this.e = cceVar;
        fk0 a = bmq.a(j);
        this.f = a;
        this.g = y0q.b(0, 0, null, 7);
        this.h = a.c;
        this.i = vz1.j(d85.n);
        x97.y(mm6Var, null, null, new kud(this, null, 1), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (defpackage.fk0.c(r1, r9, r3, null, r5, 12) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r9 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(mud mudVar, cg6 cg6Var) {
        lud ludVar;
        int i;
        d85 d85Var;
        if (cg6Var instanceof lud) {
            ludVar = (lud) cg6Var;
            int i2 = ludVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ludVar.l = i2 - Integer.MIN_VALUE;
                lud ludVar2 = ludVar;
                Object obj = ludVar2.j;
                nm6 nm6Var = nm6.a;
                i = ludVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    dud dudVar = mudVar.c;
                    if (!(dudVar instanceof aud)) {
                        if (dudVar instanceof bud) {
                            d85Var = new d85(c3x.f(((bud) dudVar).a));
                        } else {
                            if (!Intrinsics.d(dudVar, cud.a)) {
                                b6e.s();
                                return null;
                            }
                            d85Var = null;
                        }
                        if (d85Var != null) {
                            mudVar.i.setValue(new d85(d85Var.a));
                            fk0 fk0Var = mudVar.f;
                            act S = weo.S(300, 0, null, 6);
                            ludVar2.l = 2;
                        }
                        return Unit.a;
                    }
                    String str = ((aud) dudVar).a;
                    Context context = mudVar.d;
                    cce cceVar = mudVar.e;
                    ludVar2.l = 1;
                    obj = h4a.t(str, context, cceVar, true, ludVar2);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                d85Var = (d85) obj;
                if (d85Var != null) {
                }
                return Unit.a;
            }
        }
        ludVar = new lud(mudVar, cg6Var);
        lud ludVar22 = ludVar;
        Object obj2 = ludVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = ludVar22.l;
        if (i != 0) {
        }
        d85Var = (d85) obj2;
        if (d85Var != null) {
        }
        return Unit.a;
    }

    @Override // defpackage.fud
    public final long a() {
        return ((d85) this.h.b.getValue()).a;
    }

    @Override // defpackage.fud
    public final long b() {
        return ((d85) this.i.getValue()).a;
    }

    @Override // defpackage.fud
    public final dud c() {
        return this.c;
    }

    @Override // defpackage.fud
    public final void d() {
        if (b() == 16) {
            x97.y(this.b, null, null, new kud(this, null, 2), 3);
        }
    }

    @Override // defpackage.fud
    public final long e() {
        return this.a;
    }
}
