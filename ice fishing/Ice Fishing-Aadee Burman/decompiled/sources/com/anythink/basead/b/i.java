package com.anythink.basead.b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.y;

/* loaded from: classes.dex */
public final class i implements com.anythink.core.common.k.b {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.core.common.t.c f6032a;

    /* renamed from: b, reason: collision with root package name */
    Context f6033b = t.b().g();

    @Override // com.anythink.core.common.k.b
    public final void a(final w wVar, final String str, final String str2, boolean z3, final com.anythink.core.common.k.c cVar) {
        if (z3) {
            boolean a9 = b.a(this.f6033b, wVar);
            if (cVar != null) {
                cVar.a(a9);
                return;
            }
            return;
        }
        y r9 = wVar.r();
        if (r9 == null) {
            if (cVar != null) {
                cVar.a(false);
                return;
            }
            return;
        }
        int R8 = r9.R();
        int S8 = r9.S();
        if (R8 == 1) {
            final com.anythink.basead.a aVar = new com.anythink.basead.a() { // from class: com.anythink.basead.b.i.1
                @Override // com.anythink.basead.a, android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                    super.onActivityPaused(activity);
                    com.anythink.core.common.t.c cVar2 = i.this.f6032a;
                    if (cVar2 != null) {
                        cVar2.b();
                    }
                }

                @Override // com.anythink.basead.a, android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    super.onActivityResumed(activity);
                    com.anythink.core.common.t.c cVar2 = i.this.f6032a;
                    if (cVar2 != null) {
                        cVar2.a();
                    }
                }
            };
            this.f6032a = new com.anythink.core.common.t.c(S8, new Runnable() { // from class: com.anythink.basead.b.i.2
                @Override // java.lang.Runnable
                public final void run() {
                    ((Application) i.this.f6033b).unregisterActivityLifecycleCallbacks(aVar);
                    boolean a10 = b.a(i.this.f6033b, wVar);
                    if (a10) {
                        com.anythink.core.common.u.e.a(str, wVar.v(), str2, 6, (String) null, 0L, 0L, wVar.ap(), wVar.aq());
                    }
                    com.anythink.core.common.k.c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.a(a10);
                    }
                }
            });
            try {
                ((Application) this.f6033b).registerActivityLifecycleCallbacks(aVar);
                return;
            } catch (Exception unused) {
                D.y.w("Error", "Error, cannot registerActivityLifecycleCallbacks here!");
                return;
            }
        }
        if (R8 == 3) {
            com.anythink.core.common.b.a().a("1", new com.anythink.basead.d.h(wVar, str2, str, cVar));
        } else if (cVar != null) {
            cVar.a(false);
        }
    }
}
