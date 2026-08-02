package com.yandex.plus.metrica.utils;

import android.content.Context;
import defpackage.btf;
import defpackage.jyr;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import timber.log.Timber;

/* loaded from: classes5.dex */
public abstract class h implements z {
    public final Context a;
    public final g b;
    public final String c;
    public final String d;
    public final String e;
    public final com.yandex.plus.core.config.a f;
    public final jyr g;
    public final jyr h;
    public final jyr i;

    public h(Context context, g gVar, String str, String str2, String str3, String str4, com.yandex.plus.core.config.a aVar, Function0 function0, Function0 function02) {
        context.getClass();
        gVar.getClass();
        aVar.getClass();
        this.a = context;
        this.b = gVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = aVar;
        this.g = btf.b(new com.yandex.plus.bdui.content.b(27, this, str4));
        this.h = btf.b(function0);
        this.i = btf.b(function02);
    }

    public final Object g() {
        boolean booleanValue = ((Boolean) this.h.getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.i.getValue()).booleanValue();
        g gVar = this.b;
        gVar.getClass();
        Context context = this.a;
        context.getClass();
        com.yandex.plus.core.config.a aVar = this.f;
        aVar.getClass();
        Timber.Companion companion = Timber.INSTANCE;
        companion.tag("Metrica7Facade").d("Get AppMetrica reporter", new Object[0]);
        String str = this.c;
        Object e = gVar.e(context, str, this.d, this.e, aVar, booleanValue, booleanValue2);
        if (e != null) {
            return e;
        }
        companion.tag("Metrica7Facade").d("Can't get AppMetrica internal reporter, fallback to public reporter", new Object[0]);
        Object c = gVar.c("IReporter", new a(gVar, str, context, booleanValue));
        gVar.a(aVar, new com.yandex.plus.home.feature.webviews.internal.stories.i(0, gVar, g.class, "getMetricaStatus", "getMetricaStatus()Lcom/yandex/plus/metrica/utils/BaseMetricaFacade$Status;", 0, 24), c);
        return c;
    }

    public final Object h() {
        return this.b.e(this.a, this.c, this.d, this.e, this.f, ((Boolean) this.h.getValue()).booleanValue(), ((Boolean) this.i.getValue()).booleanValue());
    }

    public final Object i(Function0 function0, Function1 function1) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            Object invoke = function0.invoke();
            t7oVar = invoke != null ? function1.invoke(invoke) : null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return t7oVar;
        }
        if ((a instanceof k) && this.f == com.yandex.plus.core.config.a.a) {
            throw a;
        }
        Timber.INSTANCE.tag("Metrica7ObjectProviders").e(a);
        return null;
    }
}
