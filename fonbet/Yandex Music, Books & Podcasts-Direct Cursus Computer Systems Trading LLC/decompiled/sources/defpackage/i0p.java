package defpackage;

import android.content.Context;
import java.util.Set;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class i0p {
    public final jyr a = l18.b.b(hag.I(frt.class), true);
    public final g0l b;
    public final xdr c;
    public final qwu d;
    public final k6l e;
    public final uwu f;
    public final fdj g;
    public final e06 h;
    public final /* synthetic */ l13 i;

    public i0p(l13 l13Var) {
        this.i = l13Var;
        bdt I = hag.I(g0l.class);
        qdc qdcVar = l13Var.a;
        Set set = l13Var.b;
        this.b = (g0l) qdcVar.D(I, l13Var, set);
        this.c = k0p.b;
        bdt I2 = hag.I(qwu.class);
        qdc qdcVar2 = l13Var.a;
        this.d = (qwu) qdcVar2.D(I2, l13Var, set);
        this.e = (k6l) qdcVar2.D(hag.I(k6l.class), l13Var, set);
        this.f = (uwu) qdcVar2.D(hag.I(uwu.class), l13Var, set);
        this.g = (fdj) qdcVar2.D(hag.I(fdj.class), l13Var, set);
        this.h = new e06(wct.t());
    }

    public static boolean a() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return ((g7n) ((byb) qdcVar.C(I)).b(g7n.class)).h();
    }

    public static boolean b() {
        l18 l18Var = l18.b;
        bdt I = hag.I(Context.class);
        l18Var.a.getClass();
        return !((Context) r0.C(I)).getResources().getBoolean(R.bool.is_tablet);
    }
}
