package defpackage;

import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ctb implements Function2 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ctb(int i, xsq xsqVar, hvq hvqVar, zsq zsqVar, ml4 ml4Var, Boolean bool, int i2, int i3) {
        this.c = i;
        this.f = xsqVar;
        this.g = hvqVar;
        this.h = zsqVar;
        this.i = ml4Var;
        this.b = bool;
        this.d = i2;
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                pd.n((String) this.f, this.c, (ges) this.h, (Function0) this.i, (yci) this.b, (String) this.g, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                lqd.b((List) this.f, (yci) this.b, this.c, (o0k) this.g, (mqd) this.h, (wn5) this.i, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ild.l(this.c, (xsq) this.f, (hvq) this.g, (zsq) this.h, (ml4) this.i, (Boolean) this.b, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                gwq.a(this.c, (Function0) this.i, (String) this.f, (Function0) this.g, (d85) this.h, (yci) this.b, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                wyf.n((pas) this.f, (um0) this.g, (Locale) this.h, (d85) this.i, (yci) this.b, this.c, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ctb(int i, Function0 function0, String str, Function0 function02, d85 d85Var, yci yciVar, int i2, int i3) {
        this.c = i;
        this.i = function0;
        this.f = str;
        this.g = function02;
        this.h = d85Var;
        this.b = yciVar;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ ctb(pas pasVar, um0 um0Var, Locale locale, d85 d85Var, yci yciVar, int i, int i2, int i3) {
        this.f = pasVar;
        this.g = um0Var;
        this.h = locale;
        this.i = d85Var;
        this.b = yciVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ ctb(String str, int i, ges gesVar, Function0 function0, yci yciVar, String str2, int i2, int i3) {
        this.f = str;
        this.c = i;
        this.h = gesVar;
        this.i = function0;
        this.b = yciVar;
        this.g = str2;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ ctb(List list, yci yciVar, int i, o0k o0kVar, mqd mqdVar, wn5 wn5Var, int i2, int i3) {
        this.f = list;
        this.b = yciVar;
        this.c = i;
        this.g = o0kVar;
        this.h = mqdVar;
        this.i = wn5Var;
        this.d = i2;
        this.e = i3;
    }
}
