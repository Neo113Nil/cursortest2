package defpackage;

import android.os.SystemClock;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class t88 {
    public final jyr a = l18.b.b(hag.I(e15.class), true);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bd, code lost:
    
        if (((java.lang.Boolean) r12).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        s88 s88Var;
        Object obj;
        int i;
        long elapsedRealtimeNanos;
        String str;
        int i2;
        int i3;
        if (cg6Var instanceof s88) {
            s88Var = (s88) cg6Var;
            int i4 = s88Var.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s88Var.p = i4 - Integer.MIN_VALUE;
                obj = s88Var.n;
                nm6 nm6Var = nm6.a;
                i = s88Var.p;
                Continuation continuation = null;
                boolean z = false;
                if (i != 0) {
                    qgg.h0(obj);
                    elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    str = ((frt) qdcVar.C(I)).c().a;
                    str.getClass();
                    e15 e15Var = (e15) this.a.getValue();
                    s88Var.m = str;
                    s88Var.j = elapsedRealtimeNanos;
                    s88Var.k = 0;
                    s88Var.l = 0;
                    s88Var.p = 1;
                    e15Var.getClass();
                    obj = x97.V(dm6.b, new rc4(e15Var, str, continuation, 12), s88Var);
                    if (obj != nm6Var) {
                        i2 = 0;
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    i2 = s88Var.l;
                    i3 = s88Var.k;
                    elapsedRealtimeNanos = s88Var.j;
                    str = s88Var.m;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    e15 e15Var2 = (e15) this.a.getValue();
                    s88Var.m = null;
                    s88Var.j = elapsedRealtimeNanos;
                    s88Var.k = i3;
                    s88Var.l = i2;
                    s88Var.p = 2;
                    e15Var2.getClass();
                    obj = x97.V(dm6.b, new ov(e15Var2, str, continuation, 8), s88Var);
                }
                z = true;
                o98 o98Var = new o98(z);
                SystemClock.elapsedRealtimeNanos();
                return o98Var;
            }
        }
        s88Var = new s88(this, cg6Var);
        obj = s88Var.n;
        nm6 nm6Var2 = nm6.a;
        i = s88Var.p;
        Continuation continuation2 = null;
        boolean z2 = false;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        z2 = true;
        o98 o98Var2 = new o98(z2);
        SystemClock.elapsedRealtimeNanos();
        return o98Var2;
    }
}
