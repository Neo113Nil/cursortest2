package com.anythink.expressad.foundation.g.f;

import android.os.Process;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19360a = "i";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.e.a f19361b;

    /* renamed from: c, reason: collision with root package name */
    private h f19362c;

    /* renamed from: d, reason: collision with root package name */
    private c f19363d;

    public i(SSLSocketFactory sSLSocketFactory, c cVar) {
        com.anythink.expressad.foundation.g.f.e.b bVar = new com.anythink.expressad.foundation.g.f.e.b(sSLSocketFactory, null);
        this.f19361b = bVar;
        this.f19362c = new com.anythink.expressad.foundation.g.f.f.a(bVar, cVar);
        this.f19363d = cVar;
    }

    private void b(j jVar) {
        try {
            this.f19363d.c(jVar);
            if (jVar.f()) {
                jVar.c();
                this.f19363d.b(jVar);
                this.f19363d.a(jVar);
            } else {
                this.f19363d.d(jVar);
                this.f19363d.a((j<?>) jVar, jVar.a(this.f19362c.a(jVar)));
            }
        } catch (com.anythink.expressad.foundation.g.f.a.a e9) {
            this.f19363d.a((j<?>) jVar, j.a(e9));
        } catch (Exception e10) {
            e10.getMessage();
            this.f19363d.a((j<?>) jVar, new com.anythink.expressad.foundation.g.f.a.a(4, null));
        }
    }

    public final void a(j jVar) {
        Process.setThreadPriority(10);
        try {
            this.f19363d.c(jVar);
            if (jVar.f()) {
                jVar.c();
                this.f19363d.b(jVar);
                this.f19363d.a(jVar);
            } else {
                this.f19363d.d(jVar);
                this.f19363d.a((j<?>) jVar, jVar.a(this.f19362c.a(jVar)));
            }
        } catch (com.anythink.expressad.foundation.g.f.a.a e9) {
            this.f19363d.a((j<?>) jVar, j.a(e9));
        } catch (Exception e10) {
            e10.getMessage();
            this.f19363d.a((j<?>) jVar, new com.anythink.expressad.foundation.g.f.a.a(4, null));
        }
    }

    public i(SSLSocketFactory sSLSocketFactory, c cVar, com.anythink.expressad.foundation.g.f.e.a aVar) {
        if (aVar == null) {
            this.f19361b = new com.anythink.expressad.foundation.g.f.e.b(sSLSocketFactory, null);
        } else {
            this.f19361b = aVar;
        }
        this.f19362c = new com.anythink.expressad.foundation.g.f.f.a(this.f19361b, cVar);
        this.f19363d = cVar;
    }
}
