package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.player.b;
import ru.yandex.video.m3.player.scaling.ScalingMode;

/* loaded from: classes3.dex */
public final class me8 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me8(e23 e23Var, gc8 gc8Var, pe8 pe8Var, szb szbVar, xzb xzbVar, View view, List list) {
        super(0);
        this.r = 1;
        this.s = view;
        this.t = szbVar;
        this.u = gc8Var;
        this.v = xzbVar;
        this.w = pe8Var;
        this.x = e23Var;
        this.y = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i;
        switch (this.r) {
            case 0:
                pe8 pe8Var = (pe8) this.w;
                yb8 yb8Var = pe8Var.b;
                gc8 gc8Var = (gc8) this.u;
                xzb xzbVar = (xzb) this.v;
                View view = (View) this.s;
                bd8 bd8Var = (bd8) this.x;
                yb8Var.o(gc8Var, xzbVar, view, bd8Var);
                pe8Var.c.b(bd8Var, xzbVar);
                q6k.h(view, (szb) this.t, gc8Var.getInputFocusTracker$div_release(), xzbVar);
                new ol(27, (j6e) this.y).onClick(view);
                return Unit.a;
            case 1:
                View view2 = (View) this.s;
                q6k.h(view2, (szb) this.t, ((gc8) this.u).getInputFocusTracker$div_release(), (xzb) this.v);
                ((pe8) this.w).a.d((e23) this.x, view2, (List) this.y, "double_click");
                return Unit.a;
            default:
                b bVar = (b) this.w;
                to7 to7Var = new to7(bVar.a, new hm7());
                uj7 uj7Var = new uj7(dzr.a);
                Context context = bVar.a;
                rsb rsbVar = (rsb) this.u;
                ct7 ct7Var = (ct7) this.v;
                int i2 = 3;
                qqb qqbVar = new qqb(context, new qo7(5, rsbVar), new qo7(6, to7Var), new qo7(2, ct7Var), new qo7(1, (axh) this.s), new qo7(i2, (cl2) this.x), new g3a(i2, uj7Var));
                ct7Var.getClass();
                fcl fclVar = (fcl) this.t;
                bo7 bo7Var = (bo7) this.y;
                Looper looper = fclVar.b;
                vq1.A(!qqbVar.x);
                qqbVar.i = looper;
                erb erbVar = bVar.j;
                vq1.A(!qqbVar.x);
                vq1.A(!qqbVar.x);
                qqbVar.t = bo7Var;
                ScalingMode scalingMode = fclVar.d;
                scalingMode.getClass();
                int i3 = usb.a[scalingMode.ordinal()];
                if (i3 != 1) {
                    i = 2;
                    if (i3 != 2) {
                        if (i3 != 3) {
                            b6e.s();
                            return null;
                        }
                        vq1.A(!qqbVar.x);
                        qqbVar.n = i;
                        vq1.A(!qqbVar.x);
                        if (erbVar.a.a) {
                            dv1 dv1Var = new dv1(3, 0, 1, 1, 0);
                            vq1.A(!qqbVar.x);
                            qqbVar.k = dv1Var;
                            qqbVar.l = true;
                        }
                        return qqbVar.a();
                    }
                }
                i = 1;
                vq1.A(!qqbVar.x);
                qqbVar.n = i;
                vq1.A(!qqbVar.x);
                if (erbVar.a.a) {
                }
                return qqbVar.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        super(0);
        this.r = i;
        this.w = obj;
        this.u = obj2;
        this.v = obj3;
        this.s = obj4;
        this.x = obj5;
        this.t = obj6;
        this.y = obj7;
    }
}
