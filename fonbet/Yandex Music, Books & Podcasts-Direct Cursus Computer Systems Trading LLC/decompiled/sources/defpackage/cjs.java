package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class cjs {
    public final au9 a;
    public final qg8 b;
    public final dfb c;
    public final xzb d;
    public gc8 e;
    public final String f;
    public final List g;
    public final List h;
    public boolean i;
    public final mgs j;

    public cjs(au9 au9Var, qg8 qg8Var, dfb dfbVar, xzb xzbVar) {
        this.a = au9Var;
        this.b = qg8Var;
        this.c = dfbVar;
        this.d = xzbVar;
        String str = au9Var.c;
        this.f = au9Var.f;
        this.g = au9Var.b;
        this.h = au9Var.d;
        int i = 0;
        int i2 = 1;
        this.j = new mgs(str, new lgq(i2, this, cjs.class, "updateTimerVariable", "updateTimerVariable(J)V", i, 13), new lgq(i2, this, cjs.class, "updateTimerVariable", "updateTimerVariable(J)V", i, 14), new lgq(i2, this, cjs.class, "onEnd", "onEnd(J)V", i, 15), new lgq(i2, this, cjs.class, "onTick", "onTick(J)V", i, 16), dfbVar);
        au9Var.a.d(xzbVar, new bjs(this, 0));
        szb szbVar = au9Var.e;
        if (szbVar != null) {
            szbVar.d(xzbVar, new bjs(this, 1));
        }
    }

    public static final void a(cjs cjsVar) {
        mgs mgsVar = cjsVar.j;
        au9 au9Var = cjsVar.a;
        szb szbVar = au9Var.a;
        xzb xzbVar = cjsVar.d;
        long longValue = ((Number) szbVar.a(xzbVar)).longValue();
        szb szbVar2 = au9Var.e;
        mgsVar.h = szbVar2 != null ? (Long) szbVar2.a(xzbVar) : null;
        mgsVar.g = longValue != 0 ? Long.valueOf(longValue) : null;
    }

    public final void b(long j) {
        gc8 gc8Var;
        String str = this.f;
        if (str == null || (gc8Var = this.e) == null) {
            return;
        }
        gc8Var.N(str, String.valueOf(j));
    }
}
