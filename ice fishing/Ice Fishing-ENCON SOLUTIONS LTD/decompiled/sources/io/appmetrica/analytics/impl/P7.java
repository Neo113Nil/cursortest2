package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* loaded from: classes.dex */
public abstract class P7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4920a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f4921b;

    /* renamed from: c, reason: collision with root package name */
    public final R7 f4922c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0314bo f4923d;

    /* renamed from: e, reason: collision with root package name */
    public final Im f4924e;

    /* renamed from: f, reason: collision with root package name */
    public final Ui f4925f;

    /* renamed from: g, reason: collision with root package name */
    public final Si f4926g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0917z6 f4927h;

    /* renamed from: i, reason: collision with root package name */
    public Q7 f4928i;

    public P7(Context context, ProtobufStateStorage protobufStateStorage, R7 r7, InterfaceC0314bo interfaceC0314bo, Im im, Ui ui, Si si, InterfaceC0917z6 interfaceC0917z6, Q7 q7) {
        this.f4920a = context;
        this.f4921b = protobufStateStorage;
        this.f4922c = r7;
        this.f4923d = interfaceC0314bo;
        this.f4924e = im;
        this.f4925f = ui;
        this.f4926g = si;
        this.f4927h = interfaceC0917z6;
        this.f4928i = q7;
    }

    public final synchronized Q7 a() {
        return this.f4928i;
    }

    public final synchronized boolean b(T7 t7) {
        try {
            boolean z2 = false;
            if (t7.a() == S7.f5044b) {
                return false;
            }
            if (t7.equals(this.f4928i.b())) {
                return false;
            }
            List list = (List) this.f4923d.invoke(this.f4928i.a(), t7);
            boolean z3 = list != null;
            if (list == null) {
                list = this.f4928i.a();
            }
            if (this.f4922c.a(t7, this.f4928i.b())) {
                z2 = true;
            } else {
                t7 = (T7) this.f4928i.b();
            }
            if (z2 || z3) {
                Q7 q7 = this.f4928i;
                Q7 q72 = (Q7) this.f4924e.invoke(t7, list);
                this.f4928i = q72;
                this.f4921b.save(q72);
                AbstractC0412fj.a("Update distribution data: %s -> %s", q7, this.f4928i);
            }
            return z2;
        } finally {
        }
    }

    public final synchronized T7 c() {
        try {
            if (!this.f4926g.a()) {
                T7 t7 = (T7) this.f4925f.invoke();
                this.f4926g.b();
                if (t7 != null) {
                    b(t7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T7) this.f4928i.b();
    }

    public final T7 a(T7 t7) {
        T7 c2;
        this.f4927h.a(this.f4920a);
        synchronized (this) {
            b(t7);
            c2 = c();
        }
        return c2;
    }

    public final T7 b() {
        this.f4927h.a(this.f4920a);
        return c();
    }
}
