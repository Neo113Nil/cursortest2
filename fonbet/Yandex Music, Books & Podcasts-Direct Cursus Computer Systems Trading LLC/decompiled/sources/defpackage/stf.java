package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class stf {
    public final hoo a;
    public final uv2 b;
    public final tpi c;

    public stf(hoo hooVar, uv2 uv2Var) {
        this.a = hooVar;
        this.b = uv2Var;
        long[] jArr = vso.a;
        this.c = new tpi();
    }

    public final Function2 a(int i, Object obj, Object obj2) {
        tpi tpiVar = this.c;
        rtf rtfVar = (rtf) tpiVar.g(obj);
        if (rtfVar != null && rtfVar.c == i && Intrinsics.d(rtfVar.b, obj2)) {
            wn5 wn5Var = rtfVar.d;
            if (wn5Var != null) {
                return wn5Var;
            }
            wn5 wn5Var2 = new wn5(new qtf(0, rtfVar.e, rtfVar), 1403994769, true);
            rtfVar.d = wn5Var2;
            return wn5Var2;
        }
        rtf rtfVar2 = new rtf(this, i, obj, obj2);
        tpiVar.m(obj, rtfVar2);
        wn5 wn5Var3 = rtfVar2.d;
        if (wn5Var3 != null) {
            return wn5Var3;
        }
        wn5 wn5Var4 = new wn5(new qtf(0, this, rtfVar2), 1403994769, true);
        rtfVar2.d = wn5Var4;
        return wn5Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        rtf rtfVar = (rtf) this.c.g(obj);
        if (rtfVar != null) {
            return rtfVar.b;
        }
        ttf ttfVar = (ttf) this.b.invoke();
        int d = ttfVar.d(obj);
        if (d != -1) {
            return ttfVar.c(d);
        }
        return null;
    }
}
