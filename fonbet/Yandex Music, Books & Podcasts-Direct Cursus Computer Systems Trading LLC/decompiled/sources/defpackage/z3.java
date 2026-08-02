package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.passport.sloth.ui.dependencies.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                a4 a4Var = (a4) this.b;
                return new y3(a4Var.a, a4Var.b);
            case 1:
                c4 c4Var = (c4) this.b;
                return new a4((ep5) c4Var.d, (itb) c4Var.e);
            case 2:
                t4 t4Var = (t4) this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(v4.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                Context context = t4Var.a;
                z3 z3Var = t4Var.b;
                context.getClass();
                return new s4(context, z3Var);
            case 3:
                ((y4) this.b).requireActivity().getOnBackPressedDispatcher().d();
                return Unit.a;
            case 4:
                View f = ((p9) this.b).u().f();
                f.getClass();
                return f;
            case 5:
                ((pfi) this.b).b.invoke();
                return Boolean.TRUE;
            case 6:
                return (gbv) ((dgv) this.b).b.getValue();
            case 7:
                return new v5f(quj.r(x3f.d, new ny2(16, (m) ((le3) this.b).a, new u4(11))));
            case 8:
                return new zl((yl) ((bm) this.b).d);
            case 9:
                String string = ((br) this.b).b.getResources().getString(R.string.dialog_action_radio_album);
                string.getClass();
                return new ir(string);
            case 10:
                return (e0j) ((jyr) ((le3) this.b).a).getValue();
            case 11:
                e00 e00Var = ((vy) this.b).a;
                bdt I2 = hag.I(tmb.class);
                qdc qdcVar2 = e00Var.a;
                qdcVar2.getClass();
                return (tmb) qdcVar2.C(I2);
            case 12:
                ((fz) this.b).b.L(false, false);
                return Unit.a;
            case 13:
                l13 l13Var = ((e10) this.b).o.a;
                return (s14) l13Var.a.D(hag.I(s14.class), l13Var, l13Var.b);
            case 14:
                ((zx4) ((y40) this.b).n.getValue()).getClass();
                return new u40();
            case 15:
                ((zx4) ((e60) this.b).m.getValue()).getClass();
                return new u50();
            case 16:
                return zc4.H((Object[]) this.b);
            case 17:
                return (yci) this.b;
            case 18:
                return new w11((c01) ((ia0) this.b).a);
            case 19:
                s71 s71Var = (s71) this.b;
                return new a81(s71Var.b, s71Var.e, s71Var.a);
            case 20:
                yi1 yi1Var = (yi1) this.b;
                ka1 a = yi1Var.a();
                if (a != null && (str = a.h) != null) {
                    o11 o11Var = yi1Var.q;
                    o11Var.getClass();
                    d70 d70Var = o11Var.d;
                    if (d70Var != null) {
                        o11Var.a().e(d70Var, str);
                    }
                    zh1 zh1Var = yi1Var.e;
                    zh1Var.getClass();
                    jyr jyrVar = y7a.a;
                    y7a.a((np2) zh1Var.a.b, str, true);
                }
                return Unit.a;
            case 21:
                w41 w41Var = (w41) this.b;
                if (w41Var != null) {
                    w41Var.a = true;
                }
                return Unit.a;
            case 22:
                return new fkn((xdr) ((dn9) this.b).e);
            case 23:
                return (xc1) ((sc1) this.b).a.a.getValue();
            case 24:
                vc1 vc1Var = (vc1) this.b;
                return new sc1((rc1) vc1Var.b.c.getValue(), (bd1) vc1Var.c.b().f.getValue(), vc1Var.d, vc1Var.e);
            case 25:
                return (qe1) ((le1) this.b).a.b().d.getValue();
            case 26:
                return new lg1((ng1) ((of1) ((g01) this.b).d).a.getValue());
            case 27:
                String string2 = ((Context) ((mg1) this.b).a.getValue()).getString(R.string.new_release_single);
                string2.getClass();
                return string2;
            default:
                return new eh1((ng1) ((rg1) ((g01) this.b).d).a.getValue());
        }
    }
}
