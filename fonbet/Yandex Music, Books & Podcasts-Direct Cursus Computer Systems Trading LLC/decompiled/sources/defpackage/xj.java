package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class xj implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ xj(ik ikVar, yci yciVar, ges gesVar, int i, Function2 function2, int i2, int i3) {
        this.g = ikVar;
        this.c = yciVar;
        this.b = gesVar;
        this.d = i;
        this.h = function2;
        this.e = i2;
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                xp3.a((ik) this.g, (yci) this.c, (ges) this.b, this.d, (Function2) this.h, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                n7w.x((String) this.g, (ges) this.b, (fds) this.h, (yci) this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1));
                break;
            case 2:
                c26 c26Var = (c26) this.g;
                s06 s06Var = (s06) this.c;
                xqc xqcVar = (xqc) this.b;
                lvf lvfVar = (lvf) this.h;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                h06 h06Var = s06Var.a;
                int i = xqcVar.a;
                int i2 = this.e;
                int i3 = this.d;
                spd spdVar = new spd(i3, i2, (i * i2) + i3);
                lvfVar.d();
                c26Var.v(booleanValue, h06Var, spdVar, this.f, str);
                break;
            case 3:
                ((Integer) obj2).getClass();
                y2x.f((String) this.g, (yci) this.c, this.d, (g40) this.b, (o0k) this.h, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            case 4:
                ((Integer) obj2).getClass();
                trp.b((if5) this.g, this.d, (Function0) this.b, (yci) this.c, (Function0) this.h, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                ivf.q((String) this.g, (String) this.b, this.d, (yci) this.c, (Function2) this.h, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xj(if5 if5Var, int i, Function0 function0, yci yciVar, Function0 function02, int i2, int i3) {
        this.g = if5Var;
        this.d = i;
        this.b = function0;
        this.c = yciVar;
        this.h = function02;
        this.e = i2;
        this.f = i3;
    }

    public /* synthetic */ xj(c26 c26Var, s06 s06Var, int i, int i2, xqc xqcVar, lvf lvfVar, int i3) {
        this.g = c26Var;
        this.c = s06Var;
        this.d = i;
        this.e = i2;
        this.b = xqcVar;
        this.h = lvfVar;
        this.f = i3;
    }

    public /* synthetic */ xj(String str, yci yciVar, int i, g40 g40Var, o0k o0kVar, int i2, int i3) {
        this.g = str;
        this.c = yciVar;
        this.d = i;
        this.b = g40Var;
        this.h = o0kVar;
        this.e = i2;
        this.f = i3;
    }

    public /* synthetic */ xj(String str, ges gesVar, fds fdsVar, yci yciVar, int i, int i2, int i3) {
        this.g = str;
        this.b = gesVar;
        this.h = fdsVar;
        this.c = yciVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public /* synthetic */ xj(String str, String str2, int i, yci yciVar, Function2 function2, int i2, int i3) {
        this.g = str;
        this.b = str2;
        this.d = i;
        this.c = yciVar;
        this.h = function2;
        this.e = i2;
        this.f = i3;
    }
}
