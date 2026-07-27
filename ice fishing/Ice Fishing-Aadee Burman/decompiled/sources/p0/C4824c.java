package p0;

import B1.v;
import S7.C0389g;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.internal.h;
import n.ExecutorC4742a;
import z7.InterfaceC5267d;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4824c {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f39688a;

    public C4824c(Context context) {
        Object systemService = context.getSystemService((Class<Object>) v.u());
        h.d(systemService, "context.getSystemService…:class.java\n            )");
        this.f39688a = v.d(systemService);
    }

    public Object a(AbstractC4822a abstractC4822a, InterfaceC5267d interfaceC5267d) {
        new C0389g(1, A8.b.l(interfaceC5267d)).r();
        AbstractC4823b.l();
        throw null;
    }

    public Object b(InterfaceC5267d interfaceC5267d) {
        C0389g c0389g = new C0389g(1, A8.b.l(interfaceC5267d));
        c0389g.r();
        this.f39688a.getMeasurementApiStatus(new ExecutorC4742a(1), new K.h(c0389g));
        Object q8 = c0389g.q();
        A7.a aVar = A7.a.f58n;
        return q8;
    }

    public Object c(Uri uri, InputEvent inputEvent, InterfaceC5267d interfaceC5267d) {
        C0389g c0389g = new C0389g(1, A8.b.l(interfaceC5267d));
        c0389g.r();
        this.f39688a.registerSource(uri, inputEvent, new ExecutorC4742a(1), new K.h(c0389g));
        Object q8 = c0389g.q();
        return q8 == A7.a.f58n ? q8 : u7.v.f41350a;
    }

    public Object d(Uri uri, InterfaceC5267d interfaceC5267d) {
        C0389g c0389g = new C0389g(1, A8.b.l(interfaceC5267d));
        c0389g.r();
        this.f39688a.registerTrigger(uri, new ExecutorC4742a(1), new K.h(c0389g));
        Object q8 = c0389g.q();
        return q8 == A7.a.f58n ? q8 : u7.v.f41350a;
    }

    public Object e(AbstractC4825d abstractC4825d, InterfaceC5267d interfaceC5267d) {
        new C0389g(1, A8.b.l(interfaceC5267d)).r();
        AbstractC4823b.p();
        throw null;
    }

    public Object f(e eVar, InterfaceC5267d interfaceC5267d) {
        new C0389g(1, A8.b.l(interfaceC5267d)).r();
        AbstractC4823b.q();
        throw null;
    }
}
