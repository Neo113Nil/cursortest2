package defpackage;

import android.content.Context;
import com.yandex.music.shared.bdui.core.impl.BduiApi;
import com.yandex.music.shared.bdui.core.impl.a;
import com.yandex.music.shared.bdui.core.preloader.resource.lottie.LottieApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class dzp implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wyp b;

    public /* synthetic */ dzp(wyp wypVar, int i) {
        this.a = i;
        this.b = wypVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(fy2.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                wyp wypVar = this.b;
                rp7Var.E(new dzp(wypVar, 4));
                o18Var.c = hag.I(e0j.class);
                rp7Var.getClass();
                rp7Var.E(new dzp(wypVar, 1));
                o18Var.c = hag.I(BduiApi.class);
                rp7Var.getClass();
                rp7Var.E(new ezp(2));
                o18Var.c = hag.I(a.class);
                rp7Var.getClass();
                rp7Var.E(new ezp(3));
                o18Var.c = hag.I(qc9.class);
                rp7Var.getClass();
                rp7Var.E(new ezp(4));
                o18Var.c = hag.I(sv8.class);
                rp7Var.getClass();
                rp7Var.E(new ezp(5));
                o18Var.c = hag.I(qy2.class);
                rp7Var.getClass();
                rp7Var.D(new dzp(wypVar, 2));
                o18Var.c = hag.I(znm.class);
                rp7Var.getClass();
                rp7Var.E(new dzp(wypVar, 3));
                o18Var.c = hag.I(LottieApi.class);
                rp7Var.getClass();
                rp7Var.E(new dzp(wypVar, 5));
                o18Var.c = hag.I(w89.class);
                rp7Var.getClass();
                rp7Var.D(new ezp(6));
                o18Var.c = hag.I(nsb.class);
                rp7Var.getClass();
                rp7Var.E(new dzp(wypVar, 6));
                o18Var.c = hag.I(ze9.class);
                rp7Var.getClass();
                rp7Var.E(new ezp(7));
                o18Var.c = hag.I(fzp.class);
                rp7Var.getClass();
                rp7Var.D(new dzp(wypVar, 7));
                o18Var.c = hag.I(izp.class);
                rp7Var.getClass();
                rp7Var.D(new ezp(8));
                o18Var.c = hag.I(gzp.class);
                rp7Var.getClass();
                rp7Var.D(new ezp(9));
                o18Var.c = hag.I(hzp.class);
                rp7Var.getClass();
                rp7Var.D(new ezp(10));
                o18Var.c = hag.I(zv8.class);
                rp7Var.getClass();
                rp7Var.D(new ezp(11));
                o18Var.c = hag.I(py2.class);
                rp7Var.getClass();
                rp7Var.D(new dzp(wypVar, 8));
                o18Var.c = hag.I(oy2.class);
                rp7Var.getClass();
                rp7Var.E(new pvp(29));
                o18Var.c = hag.I(q89.class);
                rp7Var.getClass();
                rp7Var.E(new ezp(0));
                o18Var.c = hag.I(we9.class);
                rp7Var.getClass();
                rp7Var.D(new ezp(1));
                return Unit.a;
            case 1:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return i0j.a((i0j) this.b.a.a(hag.I(i0j.class)), new ooj(null, new mjm(29, l13Var), 31), null, new qkp(21), null, 53);
            case 2:
                ((l13) obj).getClass();
                return new qy2((cy2) this.b.a.a(hag.I(cy2.class)));
            case 3:
                ((l13) obj).getClass();
                return new znm((Context) this.b.a.a(hag.I(Context.class)));
            case 4:
                ((l13) obj).getClass();
                return new fy2((Context) this.b.a.a(hag.I(Context.class)));
            case 5:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return (LottieApi) i0j.a((i0j) this.b.a.a(hag.I(i0j.class)), new ooj(null, new mjm(28, (znm) l13Var2.a.D(hag.I(znm.class), l13Var2, l13Var2.b)), 30), null, new qkp(20), null, 53).a.b(LottieApi.class);
            case 6:
                ((l13) obj).getClass();
                Context context = (Context) this.b.a.a(hag.I(Context.class));
                return new nsb(context, new qxp(context));
            case 7:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new fzp(l13Var3, this.b);
            default:
                ((l13) obj).getClass();
                return new py2((cy2) this.b.a.a(hag.I(cy2.class)));
        }
    }
}
