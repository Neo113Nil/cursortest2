package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class mbb implements bbb {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final syc d;

    /* JADX WARN: Multi-variable type inference failed */
    public mbb(oq7 oq7Var, g0l g0lVar, Function1 function1) {
        this.b = oq7Var;
        this.c = g0lVar;
        this.d = (ezc) function1;
    }

    @Override // defpackage.bbb
    public final pjc c(aab aabVar) {
        int i = this.a;
        aabVar.getClass();
        switch (i) {
            case 0:
                return zsd.b0(new ibb(((oq7) this.b).a.c, aabVar, 1));
            default:
                return ((Boolean) ((Function0) this.d).invoke()).booleanValue() ? ((mbb) this.c).c(aabVar) : ((kbb) this.b).c(aabVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // defpackage.bbb
    public final qls d(aab aabVar, w5l w5lVar, a6l a6lVar, kxi kxiVar) {
        switch (this.a) {
            case 0:
                g0l g0lVar = (g0l) this.c;
                ?? r0 = (ezc) this.d;
                aabVar.getClass();
                boolean z = aabVar instanceof lt;
                hcr hcrVar = hcr.a;
                if (z) {
                    g0l.g(g0lVar, ((lt) aabVar).a, hcrVar, kxiVar, w5lVar, (String) r0.invoke(aabVar), null, null, null, null, null, 2016);
                    return null;
                }
                if (aabVar instanceof u51) {
                    g0l.h(g0lVar, ((u51) aabVar).a, hcrVar, kxiVar, w5lVar, (String) r0.invoke(aabVar), null, null, null, null, 2016);
                    return null;
                }
                if (aabVar instanceof eul) {
                    g0l.m(g0lVar, ((eul) aabVar).d().d(), hcrVar, kxiVar, w5lVar, (String) r0.invoke(aabVar), null, null, null, null, 2016);
                    return null;
                }
                b6e.s();
                return null;
            default:
                aabVar.getClass();
                return (((Boolean) ((Function0) this.d).invoke()).booleanValue() ? (mbb) this.c : (kbb) this.b).d(aabVar, w5lVar, a6lVar, kxiVar);
        }
    }

    public mbb(kbb kbbVar, mbb mbbVar, Function0 function0) {
        this.b = kbbVar;
        this.c = mbbVar;
        this.d = function0;
    }
}
