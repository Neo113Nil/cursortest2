package defpackage;

import android.content.Context;
import ru.yandex.taxi.phone_select.PhoneSelectModalView;

/* loaded from: classes6.dex */
public final class ufb0 {
    public final h3y a;
    public final h3y b;

    public ufb0(h3y h3yVar, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = h3yVar2;
    }

    public final PhoneSelectModalView a(tfb0 tfb0Var, rdq0 rdq0Var, sdq0 sdq0Var, dgq0 dgq0Var, pfb0 pfb0Var) {
        qfb0 qfb0Var = (qfb0) this.a.get();
        if (pfb0Var == null) {
            pfb0Var = (pfb0) this.b.get();
        }
        qfb0Var.getClass();
        tfb0Var.getClass();
        rdq0Var.getClass();
        sdq0Var.getClass();
        dgq0Var.getClass();
        pfb0Var.getClass();
        Context context = qfb0Var.a;
        q5z.h(context);
        wfb0 wfb0Var = new wfb0(sdq0Var, rdq0Var, pfb0Var);
        ibq0 ibq0Var = qfb0Var.b;
        q5z.h(ibq0Var);
        whu whuVar = qfb0Var.c;
        q5z.h(whuVar);
        return new PhoneSelectModalView(context, wfb0Var, tfb0Var, ibq0Var, new hbq0(whuVar), dgq0Var);
    }
}
