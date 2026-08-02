package ru.yandex.music.ui.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import defpackage.bdt;
import defpackage.btf;
import defpackage.byb;
import defpackage.g4w;
import defpackage.hag;
import defpackage.jvu;
import defpackage.jyr;
import defpackage.knv;
import defpackage.l18;
import defpackage.pkd;
import defpackage.pv0;
import defpackage.qdc;
import defpackage.qv0;
import defpackage.trj;
import defpackage.uiu;
import defpackage.urj;
import kotlin.text.c;
import ru.yandex.music.widget.VivoWidgetUpdateWorker;

/* loaded from: classes6.dex */
public final class WidgetSquareReceiver extends pkd {
    public static final /* synthetic */ int d = 0;
    public final jyr b = l18.b.b(hag.I(knv.class), true);
    public final jyr c = btf.b(new jvu(24, this));

    @Override // defpackage.pkd
    public final pv0 b() {
        return (pv0) this.c.getValue();
    }

    @Override // defpackage.pkd, android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        context.getClass();
        appWidgetManager.getClass();
        bundle.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((uiu) ((byb) qdcVar.C(I)).b(uiu.class)).h()) {
            jyr jyrVar = qv0.a;
            if (c.o(Build.MANUFACTURER, "vivo", true)) {
                urj urjVar = (urj) new trj(VivoWidgetUpdateWorker.class).a();
                g4w d2 = g4w.d(context);
                d2.getClass();
                d2.a(urjVar);
                return;
            }
        }
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        ((knv) this.b.getValue()).a().b();
    }
}
