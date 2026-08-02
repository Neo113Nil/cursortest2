package p0;

import D1.v;
import S7.C0393g;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.internal.h;
import n.ExecutorC4756a;
import z7.InterfaceC5240d;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4828c {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f39799a;

    public C4828c(Context context) {
        Object systemService = context.getSystemService((Class<Object>) v.u());
        h.d(systemService, "context.getSystemService…:class.java\n            )");
        this.f39799a = v.d(systemService);
    }

    public Object a(AbstractC4826a abstractC4826a, InterfaceC5240d interfaceC5240d) {
        new C0393g(1, A8.b.n(interfaceC5240d)).r();
        AbstractC4827b.l();
        throw null;
    }

    public Object b(InterfaceC5240d interfaceC5240d) {
        C0393g c0393g = new C0393g(1, A8.b.n(interfaceC5240d));
        c0393g.r();
        this.f39799a.getMeasurementApiStatus(new ExecutorC4756a(1), new K.h(c0393g));
        Object q8 = c0393g.q();
        A7.a aVar = A7.a.f215n;
        return q8;
    }

    public Object c(Uri uri, InputEvent inputEvent, InterfaceC5240d interfaceC5240d) {
        C0393g c0393g = new C0393g(1, A8.b.n(interfaceC5240d));
        c0393g.r();
        this.f39799a.registerSource(uri, inputEvent, new ExecutorC4756a(1), new K.h(c0393g));
        Object q8 = c0393g.q();
        return q8 == A7.a.f215n ? q8 : u7.v.f41073a;
    }

    public Object d(Uri uri, InterfaceC5240d interfaceC5240d) {
        C0393g c0393g = new C0393g(1, A8.b.n(interfaceC5240d));
        c0393g.r();
        this.f39799a.registerTrigger(uri, new ExecutorC4756a(1), new K.h(c0393g));
        Object q8 = c0393g.q();
        return q8 == A7.a.f215n ? q8 : u7.v.f41073a;
    }

    public Object e(AbstractC4829d abstractC4829d, InterfaceC5240d interfaceC5240d) {
        new C0393g(1, A8.b.n(interfaceC5240d)).r();
        AbstractC4827b.p();
        throw null;
    }

    public Object f(e eVar, InterfaceC5240d interfaceC5240d) {
        new C0393g(1, A8.b.n(interfaceC5240d)).r();
        AbstractC4827b.q();
        throw null;
    }
}
