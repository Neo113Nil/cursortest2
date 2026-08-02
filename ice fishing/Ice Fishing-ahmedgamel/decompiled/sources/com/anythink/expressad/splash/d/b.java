package com.anythink.expressad.splash.d;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.splash.b.c {

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.expressad.out.d f21399a;

    /* renamed from: b, reason: collision with root package name */
    private c f21400b;

    /* renamed from: c, reason: collision with root package name */
    private String f21401c;

    /* renamed from: d, reason: collision with root package name */
    private String f21402d;

    public b(c cVar) {
        this.f21400b = cVar;
    }

    public final void a(com.anythink.expressad.out.d dVar) {
        this.f21399a = dVar;
    }

    public final void a(String str) {
        this.f21402d = str;
    }

    @Override // com.anythink.expressad.splash.b.c
    public final void a(com.anythink.expressad.foundation.d.d dVar, int i) {
        c cVar;
        c cVar2 = this.f21400b;
        if (cVar2 == null || !cVar2.a() || dVar == null) {
            return;
        }
        com.anythink.expressad.out.d dVar2 = this.f21399a;
        if (dVar2 != null) {
            dVar2.a();
            dVar.u();
        }
        this.f21400b.b();
        new ArrayList().add(dVar);
        if (i != 2 || (cVar = this.f21400b) == null) {
            return;
        }
        cVar.a(dVar, true);
    }

    @Override // com.anythink.expressad.splash.b.c
    public final void a(com.anythink.expressad.foundation.e.c cVar) {
        c cVar2 = this.f21400b;
        if (cVar2 == null || !cVar2.a()) {
            return;
        }
        String str = "";
        if (cVar != null) {
            String a9 = cVar.a();
            if (!TextUtils.isEmpty(a9)) {
                str = a9;
            }
        }
        com.anythink.expressad.out.d dVar = this.f21399a;
        if (dVar != null) {
            dVar.a(str);
        }
        this.f21400b.b();
    }

    private void a() {
        if (this.f21399a != null) {
            this.f21399a = null;
        }
    }
}
