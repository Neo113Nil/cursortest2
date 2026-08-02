package defpackage;

import android.content.Context;

/* loaded from: classes4.dex */
public final class ms2 implements rzm {
    public final /* synthetic */ int a;
    public final cr b;

    public /* synthetic */ ms2(cr crVar, int i) {
        this.a = i;
        this.b = crVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        String str;
        switch (this.a) {
            case 0:
                return (ugk) this.b.h;
            case 1:
                ln lnVar = (ln) this.b.f;
                a4g.t(lnVar);
                return lnVar;
            case 2:
                Context context = (Context) this.b.b;
                a4g.t(context);
                return context;
            case 3:
                return zsd.D(((ln) this.b.f).a);
            case 4:
                return (g86) this.b.i;
            case 5:
                String str2 = (String) this.b.d;
                a4g.t(str2);
                return str2;
            case 6:
                return new pxf((ugk) this.b.h);
            case 7:
                return (pyh) this.b.e;
            case 8:
                return (jdk) this.b.c;
            case 9:
                cr crVar = this.b;
                return new xek((Context) crVar.b, (ugk) crVar.h, (g86) crVar.i, x3i.a);
            default:
                cr crVar2 = this.b;
                jdk jdkVar = (jdk) crVar2.c;
                lmk lmkVar = ((ln) crVar2.f).g;
                lmkVar.getClass();
                mmk mmkVar = lmkVar.a;
                return new pmk(mmkVar == mmk.a || (mmkVar == mmk.b && !jdkVar.d()) || (mmkVar == mmk.c && ((str = jdkVar.b) == null || str.length() == 0)), lmkVar);
        }
    }
}
