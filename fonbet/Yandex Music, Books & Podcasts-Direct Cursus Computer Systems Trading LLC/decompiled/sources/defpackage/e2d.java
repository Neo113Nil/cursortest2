package defpackage;

import android.content.Context;
import com.yandex.music.shared.gdpr.data.GdprApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class e2d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ e2d(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(cc7.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                e00 e00Var = this.b;
                rp7Var.E(new e2d(e00Var, 1));
                o18Var.c = hag.I(frt.class);
                rp7Var.getClass();
                rp7Var.E(new e2d(e00Var, 2));
                o18Var.c = hag.I(q1d.class);
                rp7Var.getClass();
                rp7Var.E(new e2d(e00Var, 3));
                o18Var.c = hag.I(p2d.class);
                rp7Var.getClass();
                rp7Var.E(new cnc(20));
                o18Var.c = hag.I(v1d.class);
                rp7Var.getClass();
                rp7Var.E(new cnc(21));
                o18Var.c = hag.I(y1d.class);
                rp7Var.getClass();
                rp7Var.E(new e2d(e00Var, 4));
                o18Var.c = hag.I(r1d.class);
                rp7Var.getClass();
                rp7Var.E(new cnc(22));
                o18Var.c = hag.I(GdprApi.class);
                rp7Var.getClass();
                rp7Var.E(new e2d(e00Var, 5));
                o18Var.c = hag.I(t1d.class);
                rp7Var.getClass();
                rp7Var.E(new cnc(23));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (cc7) ((z1d) this.b.b).c.getValue();
            case 2:
                ((l13) obj).getClass();
                return (frt) ((z1d) this.b.b).b.getValue();
            case 3:
                ((l13) obj).getClass();
                return (q1d) ((z1d) this.b.b).e.getValue();
            case 4:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new y1d((Context) ((z1d) this.b.b).a.getValue(), l13Var.b(hag.I(v1d.class), true));
            default:
                ((l13) obj).getClass();
                return (GdprApi) i0j.a((i0j) ((z1d) this.b.b).d.getValue(), null, null, new htb(17), null, 55).a.b(GdprApi.class);
        }
    }
}
