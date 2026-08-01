package com.anythink.basead;

import D.y;
import android.app.Activity;
import android.content.Context;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.basead.e.a f6243a;

    public interface a {
        void a();

        void b();
    }

    public final void a(Context context, w wVar, x xVar, a aVar) {
        try {
            com.anythink.basead.e.a aVar2 = new com.anythink.basead.e.a(!(context instanceof Activity) ? c.a().d() : context, q.a(context, "myoffer_feedback_dialog", k.f19634e));
            this.f6243a = aVar2;
            aVar2.a(aVar, wVar, xVar);
            this.f6243a.show();
        } catch (Throwable th) {
            y.w("show feedback dialog error", th.getMessage() + ", " + q.a(th.getStackTrace()));
        }
    }

    public final boolean a() {
        com.anythink.basead.e.a aVar = this.f6243a;
        return aVar != null && aVar.isShowing();
    }
}
