package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class o4g implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ o4g(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(l0g.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                e00 e00Var = this.b;
                rp7Var.E(new o4g(e00Var, 1));
                o18Var.c = hag.I(g4g.class);
                rp7Var.getClass();
                rp7Var.E(new o4g(e00Var, 2));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                i4g i4gVar = (i4g) this.b.b;
                Context context = i4gVar.a;
                xxq c = ((frt) i4gVar.c.getValue()).c();
                c.getClass();
                return new l0g(new pst(context, c.a, "ru.yandex.music.likes.FirstLikeDialogShowController"), (cc7) i4gVar.b.getValue(), (frt) i4gVar.c.getValue());
            default:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new g4g((l0g) l13Var.a.D(hag.I(l0g.class), l13Var, l13Var.b), new bff(24), ((i4g) this.b.b).f);
        }
    }
}
