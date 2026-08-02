package com.anythink.basead.f.b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.f.b.a.e;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.x;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    protected com.anythink.basead.f.c.d f9676a;

    public b(com.anythink.basead.f.c.d dVar) {
        this.f9676a = dVar;
    }

    @Override // com.anythink.basead.f.b.c
    public final boolean a() {
        com.anythink.basead.f.c.d dVar = this.f9676a;
        if (dVar != null) {
            return dVar.a();
        }
        return false;
    }

    @Override // com.anythink.basead.f.b.c
    public final void b() {
        com.anythink.basead.f.c.d dVar = this.f9676a;
        if (dVar != null) {
            dVar.i();
        }
    }

    @Override // com.anythink.basead.f.b.c
    public final void a(com.anythink.basead.g.a aVar) {
        com.anythink.basead.f.c.d dVar = this.f9676a;
        if (dVar != null) {
            dVar.a(aVar);
        }
    }

    @Override // com.anythink.basead.f.b.c
    public final void b(Activity activity, Map<String, Object> map, int i, String str, String str2, String str3) {
        com.anythink.basead.f.c.d dVar = this.f9676a;
        if (dVar != null) {
            dVar.a(activity, map, str3, str2);
        }
    }

    @Override // com.anythink.basead.f.b.c
    public final void a(Activity activity, Map<String, Object> map, int i, String str, String str2, String str3) {
        com.anythink.basead.f.c.d dVar = this.f9676a;
        if (dVar != null) {
            dVar.b(activity, map, str3, str2);
        }
    }

    @Override // com.anythink.basead.f.b.c
    public final void a(ViewGroup viewGroup, Map<String, Object> map, boolean z6) {
        com.anythink.basead.f.c.d dVar = this.f9676a;
        if (dVar != null) {
            dVar.a(viewGroup, map);
        }
    }

    @Override // com.anythink.basead.f.b.c
    public final View a(Context context) {
        com.anythink.basead.f.c.d dVar = this.f9676a;
        if (dVar == null) {
            return null;
        }
        dVar.h();
        return this.f9676a.g();
    }

    @Override // com.anythink.basead.f.b.c
    public final com.anythink.basead.f.b.a.d a(Context context, bj bjVar, x xVar, boolean z6) {
        com.anythink.basead.f.c.d dVar = this.f9676a;
        if (dVar != null) {
            return new e(context, bjVar, xVar, dVar, z6);
        }
        return null;
    }
}
