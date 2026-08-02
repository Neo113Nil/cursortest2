package com.anythink.expressad.advanced.d;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.h;
import com.anythink.expressad.out.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements com.anythink.expressad.advanced.b.a {

    /* renamed from: a, reason: collision with root package name */
    private p f18611a;

    /* renamed from: b, reason: collision with root package name */
    private c f18612b;

    public b(c cVar) {
        this.f18612b = cVar;
    }

    private static void a() {
    }

    private void b() {
        if (this.f18611a != null) {
            this.f18611a = null;
        }
        if (this.f18612b != null) {
            this.f18612b = null;
        }
    }

    public final void a(p pVar) {
        this.f18611a = pVar;
    }

    @Override // com.anythink.expressad.advanced.b.a
    public final void a(com.anythink.expressad.foundation.d.d dVar, int i) {
        c cVar;
        c cVar2 = this.f18612b;
        if (cVar2 == null || !cVar2.a() || dVar == null) {
            return;
        }
        p pVar = this.f18611a;
        if (pVar != null && this.f18612b != null) {
            pVar.a();
        }
        this.f18612b.b();
        new ArrayList().add(dVar);
        if (i != 2 || (cVar = this.f18612b) == null) {
            return;
        }
        cVar.a(dVar, true);
    }

    private void a(h hVar) {
        c cVar = this.f18612b;
        if (cVar == null || !cVar.a()) {
            return;
        }
        p pVar = this.f18611a;
        if (pVar != null) {
            pVar.a(hVar != null ? hVar.a() : "");
        }
        this.f18612b.b();
    }

    @Override // com.anythink.expressad.advanced.b.a
    public final void a(com.anythink.expressad.foundation.e.c cVar) {
        c cVar2 = this.f18612b;
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
        p pVar = this.f18611a;
        if (pVar != null) {
            pVar.a(str);
        }
        this.f18612b.b();
    }
}
