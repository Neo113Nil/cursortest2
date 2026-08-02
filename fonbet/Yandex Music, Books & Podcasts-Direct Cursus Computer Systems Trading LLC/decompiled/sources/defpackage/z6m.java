package defpackage;

import defpackage.hmm;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z6m {
    public static final hmm.a e = new hmm.a("is_plus_devices_registration_slot_limit");
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final jyr c;
    public final jyr d;

    public z6m(jyr jyrVar, jyr jyrVar2) {
        this.c = jyrVar;
        this.d = jyrVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r7 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        v6m v6mVar;
        int i;
        if (cg6Var instanceof v6m) {
            v6mVar = (v6m) cg6Var;
            int i2 = v6mVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v6mVar.l = i2 - Integer.MIN_VALUE;
                Object obj = v6mVar.j;
                Object obj2 = nm6.a;
                i = v6mVar.l;
                AtomicBoolean atomicBoolean = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.a.get()) {
                        return Boolean.valueOf(atomicBoolean.get());
                    }
                    v6mVar.l = 1;
                    obj = b(v6mVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        hmm hmmVar = (hmm) obj;
                        if (hmmVar == null) {
                            return Boolean.FALSE;
                        }
                        boolean d = Intrinsics.d(hmmVar.a(e), Boolean.TRUE);
                        Boolean valueOf = Boolean.valueOf(d);
                        atomicBoolean.set(d);
                        return valueOf;
                    }
                    qgg.h0(obj);
                }
                pjc data = ((wb7) obj).getData();
                v6mVar.l = 2;
                obj = zsd.i0(data, v6mVar);
            }
        }
        v6mVar = new v6m(this, cg6Var);
        Object obj3 = v6mVar.j;
        Object obj22 = nm6.a;
        i = v6mVar.l;
        AtomicBoolean atomicBoolean2 = this.b;
        if (i != 0) {
        }
        pjc data2 = ((wb7) obj3).getData();
        v6mVar.l = 2;
        obj3 = zsd.i0(data2, v6mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        w6m w6mVar;
        int i;
        cc7 cc7Var;
        if (cg6Var instanceof w6m) {
            w6mVar = (w6m) cg6Var;
            int i2 = w6mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6mVar.m = i2 - Integer.MIN_VALUE;
                Object obj = w6mVar.k;
                nm6 nm6Var = nm6.a;
                i = w6mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    cc7 cc7Var2 = (cc7) this.c.getValue();
                    pjc g = ((frt) this.d.getValue()).g();
                    w6mVar.j = cc7Var2;
                    w6mVar.m = 1;
                    Object g0 = zsd.g0(g, w6mVar);
                    if (g0 == nm6Var) {
                        return nm6Var;
                    }
                    cc7Var = cc7Var2;
                    obj = g0;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cc7Var = w6mVar.j;
                    qgg.h0(obj);
                }
                return ((dc7) cc7Var).c(((xxq) obj).a, "plus_devices_storage");
            }
        }
        w6mVar = new w6m(this, cg6Var);
        Object obj2 = w6mVar.k;
        nm6 nm6Var2 = nm6.a;
        i = w6mVar.m;
        if (i != 0) {
        }
        return ((dc7) cc7Var).c(((xxq) obj2).a, "plus_devices_storage");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (defpackage.lmm.a((defpackage.wb7) r7, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(boolean z, Continuation continuation) {
        x6m x6mVar;
        int i;
        if (continuation instanceof x6m) {
            x6mVar = (x6m) continuation;
            int i2 = x6mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x6mVar.m = i2 - Integer.MIN_VALUE;
                Object obj = x6mVar.k;
                Object obj2 = nm6.a;
                i = x6mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    this.a.set(true);
                    this.b.set(z);
                    x6mVar.j = z;
                    x6mVar.m = 1;
                    obj = b(x6mVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = x6mVar.j;
                    qgg.h0(obj);
                }
                y6m y6mVar = new y6m(z, null);
                x6mVar.j = z;
                x6mVar.m = 2;
            }
        }
        x6mVar = new x6m(this, continuation);
        Object obj3 = x6mVar.k;
        Object obj22 = nm6.a;
        i = x6mVar.m;
        if (i != 0) {
        }
        y6m y6mVar2 = new y6m(z, null);
        x6mVar.j = z;
        x6mVar.m = 2;
    }
}
