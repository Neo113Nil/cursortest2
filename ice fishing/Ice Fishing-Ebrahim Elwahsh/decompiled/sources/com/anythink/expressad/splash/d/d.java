package com.anythink.expressad.splash.d;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.out.e;
import java.util.Random;

/* loaded from: classes.dex */
public class d implements com.anythink.expressad.splash.b.d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20811a = "SplashShowListenerImpl";

    /* renamed from: b, reason: collision with root package name */
    private e f20812b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f20813c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20814d;

    /* renamed from: e, reason: collision with root package name */
    private c f20815e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f20816f = new Runnable() { // from class: com.anythink.expressad.splash.d.d.1
        @Override // java.lang.Runnable
        public final void run() {
            d.this.a("show timeout!");
        }
    };

    public d(c cVar, e eVar, double d2, com.anythink.expressad.foundation.d.d dVar) {
        this.f20815e = cVar;
        this.f20812b = eVar;
        this.f20813c = dVar;
        this.f20814d = a(d2, dVar);
    }

    private static void d() {
    }

    private static void e() {
    }

    private void f() {
        if (this.f20812b != null) {
            this.f20812b = null;
        }
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void a() {
        if (this.f20816f != null) {
            t.b().d(this.f20816f);
        }
        c cVar = this.f20815e;
        if (cVar != null) {
            cVar.f20781a = true;
        }
        cVar.c();
        this.f20815e.d();
        this.f20815e.e();
        e eVar = this.f20812b;
        if (eVar == null || this.f20814d) {
            return;
        }
        eVar.a();
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void b() {
    }

    public final void c() {
        t.b().a(this.f20816f, 10000L);
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void a(String str) {
        c cVar = this.f20815e;
        if (cVar != null) {
            cVar.f20781a = false;
        }
        e eVar = this.f20812b;
        if (eVar != null) {
            eVar.a(str);
        }
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        e eVar = this.f20812b;
        if (eVar == null || this.f20814d) {
            return;
        }
        eVar.a(dVar);
    }

    @Override // com.anythink.expressad.splash.b.d
    public final void a(int i) {
        if (i != 1 && i != 2 && i != 6 && i != 11) {
            i = -999;
        }
        e eVar = this.f20812b;
        if (eVar != null) {
            eVar.a(i);
        }
        c cVar = this.f20815e;
        if (cVar != null) {
            cVar.f20781a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: Exception -> 0x0055, TryCatch #0 {Exception -> 0x0055, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0018, B:10:0x002b, B:12:0x0031, B:15:0x0035, B:17:0x003a, B:22:0x0047), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(double d2, com.anythink.expressad.foundation.d.d dVar) {
        long j9;
        long j10;
        if (!TextUtils.isEmpty(com.anythink.expressad.foundation.b.a.c().f())) {
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
            if (b9 != null) {
                j9 = b9.l() * 1000;
                j10 = b9.w() * 1000;
                if (dVar != null) {
                    if (dVar.a(j10, j9)) {
                        dVar.g(1);
                        return true;
                    }
                    dVar.g(0);
                }
                return dVar == null && !dVar.B() && d2 != 1.0d && new Random().nextDouble() > d2;
            }
        }
        j9 = 0;
        j10 = 0;
        if (dVar != null) {
        }
        if (dVar == null) {
        }
    }
}
