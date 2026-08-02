package defpackage;

import android.content.Context;
import androidx.compose.animation.a;
import androidx.compose.animation.c;
import com.yandex.music.shared.wizard.entry.data.WizardMonolithApi;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* loaded from: classes6.dex */
public final /* synthetic */ class ulv implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ulv(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new lmv(l13Var.b(hag.I(wmg.class), true), btf.b(new h4d(l13Var, 15)), l13Var.b(hag.I(t3g.class), true));
            case 1:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new vmv((Context) l13Var2.a.D(hag.I(Context.class), l13Var2, l13Var2.b));
            case 2:
                ((IntRange) obj).getClass();
                return Unit.a;
            case 3:
                Boolean bool = (Boolean) obj;
                k5r.v("[queuePreparingStateFlow] queuePreparingStateFlow is ", bool.booleanValue(), 4, "WidgetSharedViewModel", null);
                return bool;
            case 4:
                ifp ifpVar = (ifp) obj;
                ifpVar.getClass();
                ngg.H(ifpVar, "subtitle_text");
                return Unit.a;
            case 5:
                ifp ifpVar2 = (ifp) obj;
                ifpVar2.getClass();
                ngg.H(ifpVar2, "title_text");
                return Unit.a;
            case 6:
                ifp ifpVar3 = (ifp) obj;
                ifpVar3.getClass();
                ngg.H(ifpVar3, "inline_subtitle_text");
                return Unit.a;
            case 7:
                ((jx7) obj).getClass();
                return new wpe(xv.t(-4, 0));
            case 8:
                ((jx7) obj).getClass();
                return new wpe(xv.t(-4, 0));
            case 9:
                ((jx7) obj).getClass();
                return new wpe(xv.t(4, 1));
            case 10:
                return Boolean.valueOf(((osv) obj) instanceof nsv);
            case 11:
                ((hl0) obj).getClass();
                e9b e = c.e(null, 3);
                vpb f = c.f(null, 3);
                int i = a.b;
                return new zd6(e, f);
            case 12:
                ((jfp) obj).getClass();
                return Unit.a;
            case 13:
                wsv wsvVar = (wsv) obj;
                wsvVar.getClass();
                return Boolean.valueOf(wsvVar instanceof vsv);
            case 14:
                zsv zsvVar = (zsv) obj;
                zsvVar.getClass();
                return Boolean.valueOf(zsvVar instanceof xsv);
            case 15:
                bs1 bs1Var = (bs1) obj;
                bs1Var.getClass();
                return ern.a(bs1Var.getClass());
            case 16:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, kuv.class).E(new ulv(17));
                o18Var.b(hag.I(nuv.class)).E(new ulv(18));
                o18Var.b(hag.I(mvv.class)).E(new ulv(19));
                return Unit.a;
            case 17:
                ((l13) obj).getClass();
                return kuv.a;
            case 18:
                ((l13) obj).getClass();
                return new nuv(new mg1(4));
            case 19:
                ((l13) obj).getClass();
                return new mvv(new o(8));
            case 20:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return (WizardMonolithApi) ((e0j) l13Var3.a.D(hag.I(e0j.class), l13Var3, l13Var3.b)).a.b(WizardMonolithApi.class);
            case 21:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new gvv((wuv) l13Var4.a.D(hag.I(wuv.class), l13Var4, l13Var4.b));
            case 22:
                ((l13) obj).getClass();
                return new lvv();
            case 23:
                return Integer.valueOf(((Integer) obj).intValue() * 2);
            case 24:
                g0w g0wVar = (g0w) obj;
                if (g0wVar != null && !g0wVar.a()) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 25:
                return Integer.valueOf(((Integer) obj).intValue() * 2);
            case 26:
                return Boolean.valueOf(((g0w) obj) != null);
            case 27:
                ((hl0) obj).getClass();
                ov6 ov6Var = lya.c;
                e9b e2 = c.e(new act(225, 450, ov6Var), 2);
                vpb f2 = c.f(weo.S(450, 0, ov6Var, 2), 2);
                int i2 = a.b;
                return new zd6(e2, f2);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return Integer.valueOf((-((Integer) obj).intValue()) / 2);
            default:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.d(1);
                return Unit.a;
        }
    }
}
