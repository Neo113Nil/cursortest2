package defpackage;

import android.content.Context;
import androidx.fragment.app.t;
import java.util.Set;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes6.dex */
public final class iaj {
    public final /* synthetic */ l13 a;

    public iaj(l13 l13Var) {
        this.a = l13Var;
    }

    public static pui a(t tVar, kxi kxiVar) {
        tVar.getClass();
        return new pui(tVar, d.v(), kxiVar);
    }

    public final jac b() {
        bdt I = hag.I(Context.class);
        l13 l13Var = this.a;
        qdc qdcVar = l13Var.a;
        Set set = l13Var.b;
        Context context = (Context) qdcVar.D(I, l13Var, set);
        bdt I2 = hag.I(frt.class);
        qdc qdcVar2 = l13Var.a;
        return new jac(context, (frt) qdcVar2.D(I2, l13Var, set), (cc7) qdcVar2.D(hag.I(cc7.class), l13Var, set));
    }
}
