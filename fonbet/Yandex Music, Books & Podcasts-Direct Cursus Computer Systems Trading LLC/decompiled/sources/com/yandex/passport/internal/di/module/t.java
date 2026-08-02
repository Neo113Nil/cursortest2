package com.yandex.passport.internal.di.module;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.xe;
import defpackage.rzm;
import defpackage.x3f;
import io.appmetrica.analytics.IReporterYandex;

/* loaded from: classes4.dex */
public final class t implements rzm {
    public final /* synthetic */ int a;
    public final p b;
    public final rzm c;

    public /* synthetic */ t(p pVar, rzm rzmVar, int i) {
        this.a = i;
        this.b = pVar;
        this.c = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                IReporterYandex iReporterYandex = (IReporterYandex) this.c.get();
                this.b.getClass();
                iReporterYandex.getClass();
                return new w(iReporterYandex);
            case 1:
                Context context = (Context) this.c.get();
                this.b.getClass();
                context.getClass();
                return (ClipboardManager) context.getSystemService(ClipboardManager.class);
            case 2:
                w wVar = (w) this.c.get();
                this.b.getClass();
                wVar.getClass();
                return new o0(wVar);
            case 3:
                Context context2 = (Context) this.c.get();
                this.b.getClass();
                context2.getClass();
                SharedPreferences sharedPreferences = context2.getSharedPreferences("experiments_current_session", 0);
                sharedPreferences.getClass();
                return new com.yandex.passport.internal.flags.experiments.b(sharedPreferences);
            case 4:
                Context context3 = (Context) this.c.get();
                this.b.getClass();
                context3.getClass();
                String packageName = context3.getPackageName();
                packageName.getClass();
                return new com.yandex.passport.internal.flags.experiments.d(packageName, 0);
            case 5:
                com.yandex.passport.internal.provider.communication.p pVar = (com.yandex.passport.internal.provider.communication.p) this.c.get();
                this.b.getClass();
                pVar.getClass();
                return pVar;
            case 6:
                Context context4 = (Context) this.c.get();
                this.b.getClass();
                context4.getClass();
                return new com.yandex.passport.common.permission.b(context4);
            case 7:
                xe xeVar = (xe) this.c.get();
                this.b.getClass();
                xeVar.getClass();
                return xeVar;
            case 8:
                com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) this.c.get();
                this.b.getClass();
                oVar.getClass();
                return oVar;
            case 9:
                x xVar = (x) this.c.get();
                this.b.getClass();
                xVar.getClass();
                return null;
            default:
                x3f x3fVar = (x3f) this.c.get();
                this.b.getClass();
                x3fVar.getClass();
                return new com.yandex.passport.data.mapper.a(x3fVar);
        }
    }
}
