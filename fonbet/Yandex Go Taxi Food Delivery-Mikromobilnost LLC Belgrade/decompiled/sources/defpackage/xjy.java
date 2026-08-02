package defpackage;

import android.app.Activity;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.zalogin.LinkAccountsFullscreen;

/* loaded from: classes10.dex */
public final class xjy {
    public final cxq0 a;

    public xjy(cxq0 cxq0Var) {
        this.a = cxq0Var;
    }

    public final LinkAccountsFullscreen a(Activity activity, boolean z, yjy yjyVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext) {
        cxq0 cxq0Var = this.a;
        return new LinkAccountsFullscreen(activity, events$Zalogin$LinkageContext, yjyVar, z, (pav) ((xvf0) cxq0Var.b).get(), (fhz) ((xvf0) cxq0Var.c).get(), (zky) ((xvf0) cxq0Var.w).get(), (dky) ((lcw) cxq0Var.x).get());
    }
}
