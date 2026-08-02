package ru.yandex.taxi.zalogin;

import defpackage.hbp0;
import defpackage.pzt0;
import defpackage.sjy;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ sjy a;
    public final /* synthetic */ Events$Zalogin$LinkageContext b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ e(sjy sjyVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, Runnable runnable) {
        this.a = sjyVar;
        this.b = events$Zalogin$LinkageContext;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sjy sjyVar = this.a;
        pzt0 pzt0Var = sjyVar.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        sjyVar.g = hbp0.e(sjyVar.e, null, null, new LinkAccountInteractor$performLinkage$1(sjyVar, this.b, this.c, null), 3);
    }
}
