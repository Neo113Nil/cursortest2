package com.yandex.plus.metrica.utils;

import android.content.Context;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import io.appmetrica.analytics.AppMetrica;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class i {
    public final /* synthetic */ g a;
    public final /* synthetic */ com.yandex.plus.metrica.a b;

    public i(g gVar, com.yandex.plus.metrica.a aVar) {
        this.a = gVar;
        this.b = aVar;
    }

    public final String a() {
        Object t7oVar;
        Context context = this.b.a;
        l lVar = (l) this.a;
        lVar.getClass();
        context.getClass();
        Object obj = null;
        if (!((f) lVar.a.getValue()).a) {
            return null;
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = AppMetrica.getDeviceId(context);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            obj = t7oVar;
        } else {
            Timber.INSTANCE.tag("Metrica7Facade").w(a, "AppMetrica.getDeviceId()".concat(" failed!"), new Object[0]);
        }
        return (String) obj;
    }

    public final String b() {
        Object t7oVar;
        Context context = this.b.a;
        l lVar = (l) this.a;
        lVar.getClass();
        context.getClass();
        Object obj = null;
        if (!((f) lVar.a.getValue()).a) {
            return null;
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = AppMetrica.getUuid(context);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            obj = t7oVar;
        } else {
            Timber.INSTANCE.tag("Metrica7Facade").w(a, "AppMetrica.getUuid()".concat(" failed!"), new Object[0]);
        }
        return (String) obj;
    }
}
