package com.anythink.basead.ui.a.a;

import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: e, reason: collision with root package name */
    e f11199e;

    public c(View view) {
        super(view);
        if (view == null) {
            return;
        }
        e eVar = new e(view);
        this.f11199e = eVar;
        eVar.g();
    }

    @Override // com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public final synchronized void a() {
        super.a();
        e eVar = this.f11199e;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public final void b() {
        super.b();
        e eVar = this.f11199e;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public final void c() {
        super.c();
        e eVar = this.f11199e;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public final void d() {
        super.d();
        e eVar = this.f11199e;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // com.anythink.basead.ui.a.a.d, com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public final void a(Canvas canvas) {
        super.a(canvas);
        e eVar = this.f11199e;
        if (eVar != null) {
            eVar.a(canvas);
        }
    }

    @Override // com.anythink.basead.ui.a.a.d, com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public final void a(int i, int i4) {
        super.a(i, i4);
        e eVar = this.f11199e;
        if (eVar != null) {
            eVar.a(i, i4);
        }
    }
}
