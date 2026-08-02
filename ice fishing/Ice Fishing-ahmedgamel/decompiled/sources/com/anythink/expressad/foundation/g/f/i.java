package com.anythink.expressad.foundation.g.f;

import android.os.Process;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20147a = "i";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.e.a f20148b;

    /* renamed from: c, reason: collision with root package name */
    private h f20149c;

    /* renamed from: d, reason: collision with root package name */
    private c f20150d;

    public i(SSLSocketFactory sSLSocketFactory, c cVar) {
        com.anythink.expressad.foundation.g.f.e.b bVar = new com.anythink.expressad.foundation.g.f.e.b(sSLSocketFactory, null);
        this.f20148b = bVar;
        this.f20149c = new com.anythink.expressad.foundation.g.f.f.a(bVar, cVar);
        this.f20150d = cVar;
    }

    private void b(j jVar) {
        try {
            this.f20150d.c(jVar);
            if (jVar.f()) {
                jVar.c();
                this.f20150d.b(jVar);
                this.f20150d.a(jVar);
            } else {
                this.f20150d.d(jVar);
                this.f20150d.a((j<?>) jVar, jVar.a(this.f20149c.a(jVar)));
            }
        } catch (com.anythink.expressad.foundation.g.f.a.a e9) {
            this.f20150d.a((j<?>) jVar, j.a(e9));
        } catch (Exception e10) {
            e10.getMessage();
            this.f20150d.a((j<?>) jVar, new com.anythink.expressad.foundation.g.f.a.a(4, null));
        }
    }

    public final void a(j jVar) {
        Process.setThreadPriority(10);
        try {
            this.f20150d.c(jVar);
            if (jVar.f()) {
                jVar.c();
                this.f20150d.b(jVar);
                this.f20150d.a(jVar);
            } else {
                this.f20150d.d(jVar);
                this.f20150d.a((j<?>) jVar, jVar.a(this.f20149c.a(jVar)));
            }
        } catch (com.anythink.expressad.foundation.g.f.a.a e9) {
            this.f20150d.a((j<?>) jVar, j.a(e9));
        } catch (Exception e10) {
            e10.getMessage();
            this.f20150d.a((j<?>) jVar, new com.anythink.expressad.foundation.g.f.a.a(4, null));
        }
    }

    public i(SSLSocketFactory sSLSocketFactory, c cVar, com.anythink.expressad.foundation.g.f.e.a aVar) {
        if (aVar == null) {
            this.f20148b = new com.anythink.expressad.foundation.g.f.e.b(sSLSocketFactory, null);
        } else {
            this.f20148b = aVar;
        }
        this.f20149c = new com.anythink.expressad.foundation.g.f.f.a(this.f20148b, cVar);
        this.f20150d = cVar;
    }
}
