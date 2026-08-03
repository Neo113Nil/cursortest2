package r6;

import android.content.Context;
import android.os.Build;
import g7.h;
import g7.m;
import g7.o;
import java.util.Collections;
import java.util.Set;
import m6.i;
import n6.e;
import o6.d;
import o6.k0;
import o6.m0;
import p6.k;
import p6.l;
import p6.u;
import s.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static final n6.c f6085i = new n6.c("ClientTelemetry.API", new d7.b(2), new n6.b());

    /* renamed from: a, reason: collision with root package name */
    public final Context f6086a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6087b;

    /* renamed from: c, reason: collision with root package name */
    public final n6.c f6088c;

    /* renamed from: d, reason: collision with root package name */
    public final l f6089d;

    /* renamed from: e, reason: collision with root package name */
    public final o6.a f6090e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6091f;

    /* renamed from: g, reason: collision with root package name */
    public final i f6092g;

    /* renamed from: h, reason: collision with root package name */
    public final d f6093h;

    public b(Context context, n6.c cVar, l lVar, e eVar) {
        u.h(context, "Null context is not permitted.");
        u.h(cVar, "Api must not be null.");
        u.h(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        u.h(applicationContext, "The provided context did not have an application context.");
        this.f6086a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f6087b = attributionTag;
        this.f6088c = cVar;
        this.f6089d = lVar;
        this.f6090e = new o6.a(cVar, lVar, attributionTag);
        d d10 = d.d(applicationContext);
        this.f6093h = d10;
        this.f6091f = d10.f5262h.getAndIncrement();
        this.f6092g = eVar.f5076a;
        a7.c cVar2 = d10.f5267m;
        cVar2.sendMessage(cVar2.obtainMessage(7, this));
    }

    public final a5.c a() {
        a5.c cVar = new a5.c();
        Set set = Collections.EMPTY_SET;
        if (((g) cVar.f262h) == null) {
            cVar.f262h = new g(0);
        }
        ((g) cVar.f262h).addAll(set);
        Context context = this.f6086a;
        cVar.f263i = context.getClass().getName();
        cVar.f261g = context.getPackageName();
        return cVar;
    }

    public final o b(k kVar) {
        m7.g gVar = new m7.g(3, false);
        m6.d[] dVarArr = {y6.c.f8793a};
        gVar.f4957h = new m7.g(13, kVar);
        m mVar = new m(gVar, dVarArr, false);
        h hVar = new h();
        d dVar = this.f6093h;
        dVar.getClass();
        k0 k0Var = new k0(new m0(mVar, hVar, this.f6092g), dVar.f5263i.get(), this);
        a7.c cVar = dVar.f5267m;
        cVar.sendMessage(cVar.obtainMessage(4, k0Var));
        return hVar.f2537a;
    }
}
