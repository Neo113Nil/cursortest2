package com.anythink.basead;

import android.app.Activity;
import android.content.Context;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.basead.e.a f7029a;

    public interface a {
        void a();

        void b();
    }

    public final void a(Context context, w wVar, x xVar, a aVar) {
        try {
            com.anythink.basead.e.a aVar2 = new com.anythink.basead.e.a(!(context instanceof Activity) ? c.a().d() : context, q.a(context, "myoffer_feedback_dialog", k.f20421e));
            this.f7029a = aVar2;
            aVar2.a(aVar, wVar, xVar);
            this.f7029a.show();
        } catch (Throwable th) {
            com.IceFishing.LiveIceFishing.k.x("show feedback dialog error", th.getMessage() + ", " + q.a(th.getStackTrace()));
        }
    }

    public final boolean a() {
        com.anythink.basead.e.a aVar = this.f7029a;
        return aVar != null && aVar.isShowing();
    }
}
