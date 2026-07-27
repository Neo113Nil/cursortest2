package com.anythink.basead.f;

import android.content.Context;
import android.view.View;
import com.anythink.basead.f.c;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public final class b extends c {
    private final String i;

    public b(Context context, c.b bVar, x xVar) {
        super(context, bVar, xVar);
        this.i = "b";
    }

    public final View a() {
        com.anythink.basead.f.b.c cVar = this.f9055h;
        if (cVar != null) {
            return cVar.a(this.f9048a);
        }
        return null;
    }

    @Override // com.anythink.basead.f.c
    public final void b() {
        super.b();
        this.f9052e = null;
    }
}
