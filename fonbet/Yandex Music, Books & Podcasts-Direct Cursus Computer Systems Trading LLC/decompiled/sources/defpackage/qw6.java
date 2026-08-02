package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class qw6 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bci b;
    public final /* synthetic */ wn5 c;
    public final /* synthetic */ sai d;

    public /* synthetic */ qw6(wn5 wn5Var, sai saiVar, bci bciVar) {
        this.c = wn5Var;
        this.d = saiVar;
        this.b = bciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                this.c.invoke(this.d, this.b, hq5Var, 64);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                yd5.f(null, null, this.b, null, null, false, false, false, 0L, 0L, 0.0f, ild.C(-1897569718, new gab(8, this.c, this.d), hq5Var2), hq5Var2, 4096, 4087);
        }
        return Unit.a;
    }

    public /* synthetic */ qw6(bci bciVar, wn5 wn5Var, sai saiVar) {
        this.b = bciVar;
        this.c = wn5Var;
        this.d = saiVar;
    }
}
