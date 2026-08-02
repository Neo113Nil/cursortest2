package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class uzc {
    public final long a;
    public final cu3 b;
    public Object c;
    public Object d;
    public final Object e;
    public mm6 f;

    public uzc() {
        msa msaVar = nsa.b;
        this.a = yd5.M(500, ssa.MILLISECONDS);
        wdp.W(this, "GainController");
        this.b = ydr.a(Float.valueOf(0.0f));
        g6q g6qVar = g6q.a;
        this.d = h6q.None;
        rjq rjqVar = new rjq(false);
        this.e = rjqVar;
        this.f = hld.s(rjqVar, mal.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(uzc uzcVar, Continuation continuation) {
        mot motVar;
        int i;
        uzcVar.getClass();
        jyr jyrVar = (jyr) uzcVar.e;
        if (continuation instanceof mot) {
            motVar = (mot) continuation;
            int i2 = motVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                motVar.l = i2 - Integer.MIN_VALUE;
                Object obj = motVar.j;
                nm6 nm6Var = nm6.a;
                i = motVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (System.currentTimeMillis() - ((SharedPreferences) jyrVar.getValue()).getLong("UPDATE_TIMESTAMP", 0L) >= nsa.f(uzcVar.a)) {
                        hv0 hv0Var = (hv0) uzcVar.c;
                        motVar.l = 1;
                        if (hv0Var.invoke(motVar) == nm6Var) {
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
                ((SharedPreferences) jyrVar.getValue()).edit().putLong("UPDATE_TIMESTAMP", System.currentTimeMillis()).apply();
                return Unit.a;
            }
        }
        motVar = new mot(uzcVar, continuation);
        Object obj2 = motVar.j;
        nm6 nm6Var2 = nm6.a;
        i = motVar.l;
        if (i != 0) {
        }
        ((SharedPreferences) jyrVar.getValue()).edit().putLong("UPDATE_TIMESTAMP", System.currentTimeMillis()).apply();
        return Unit.a;
    }

    public void b(long j, long j2) {
        float f;
        ((rjq) this.e).g();
        xdr xdrVar = (xdr) this.b;
        float floatValue = ((Number) xdrVar.getValue()).floatValue();
        vzg vzgVar = (vzg) this.c;
        if (vzgVar != null) {
            float f2 = (-14.0f) - vzgVar.a;
            if (f2 > 0.0f) {
                float f3 = vzgVar.b;
                if (f3 + f2 >= -1.0f && !((h6q) this.d).a) {
                    float f4 = (-1.0f) - f3;
                    if (f4 >= 0.0f) {
                        f = f4;
                    }
                } else {
                    f = f2;
                }
                if (nsa.f(j) > 0 || f == floatValue) {
                    f1d.s(f, xdrVar, null);
                } else {
                    x97.y((um6) this.f, null, null, new tzc(j, this, f, floatValue, j2, null), 3);
                    return;
                }
            }
        }
        f = 0.0f;
        if (nsa.f(j) > 0) {
        }
        f1d.s(f, xdrVar, null);
    }

    public uzc(Context context, eno enoVar, long j, hv0 hv0Var, tf6 tf6Var) {
        this.b = enoVar;
        this.a = j;
        this.c = hv0Var;
        this.d = tf6Var;
        this.e = btf.b(new vw1(context, 24));
    }
}
