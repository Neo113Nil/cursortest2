package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694qg implements InterfaceC0538kg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f6783a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6784b;

    /* renamed from: c, reason: collision with root package name */
    public C0616ng f6785c;

    public C0694qg() {
        this(C0610na.k().u());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0538kg
    public final synchronized void a(C0616ng c0616ng) {
        if (c0616ng != null) {
            try {
                LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c0616ng.f6627d.f6523a, c0616ng.f6624a);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6785c = c0616ng;
        this.f6784b = true;
        Iterator it = this.f6783a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0409fg) it.next()).a(this.f6785c);
        }
        this.f6783a.clear();
    }

    public C0694qg(C0564lg c0564lg) {
        this.f6783a = new HashSet();
        c0564lg.a(new C0880xl(this));
        c0564lg.a();
    }

    public final synchronized void a(InterfaceC0409fg interfaceC0409fg) {
        this.f6783a.add(interfaceC0409fg);
        if (this.f6784b) {
            interfaceC0409fg.a(this.f6785c);
            this.f6783a.remove(interfaceC0409fg);
        }
    }
}
