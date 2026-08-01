package com.anythink.basead.b;

import android.content.Context;
import android.content.IntentFilter;
import com.anythink.core.common.h.w;
import com.anythink.core.common.l;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private static volatile h f6028b;

    /* renamed from: a, reason: collision with root package name */
    g f6029a;

    /* renamed from: c, reason: collision with root package name */
    private Context f6030c;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, w> f6031d = new ConcurrentHashMap<>();

    private h(Context context) {
        this.f6030c = context;
    }

    public static h a(Context context) {
        if (f6028b == null) {
            synchronized (h.class) {
                try {
                    if (f6028b == null) {
                        f6028b = new h(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6028b;
    }

    private void b() {
        if (this.f6029a != null) {
            l.a(this.f6030c).a(this.f6029a);
            this.f6029a = null;
        }
    }

    public final void c(String str, String str2) {
        w wVar = this.f6031d.get(str);
        if (wVar != null) {
            com.anythink.basead.d.j jVar = new com.anythink.basead.d.j("", "");
            com.anythink.basead.d.b bVar = new com.anythink.basead.d.b();
            jVar.f6215k = bVar;
            bVar.f6131a = str2;
            b.a(20, wVar, jVar);
        }
    }

    public final void d(String str, String str2) {
        w remove = this.f6031d.remove(str);
        if (remove != null) {
            com.anythink.basead.d.j jVar = new com.anythink.basead.d.j("", "");
            com.anythink.basead.d.b bVar = new com.anythink.basead.d.b();
            jVar.f6215k = bVar;
            bVar.f6131a = str2;
            b.a(21, remove, jVar);
        }
        if (this.f6031d.size() != 0 || this.f6029a == null) {
            return;
        }
        l.a(this.f6030c).a(this.f6029a);
        this.f6029a = null;
    }

    public final void b(String str, String str2) {
        w wVar = this.f6031d.get(str);
        if (wVar != null) {
            com.anythink.basead.d.j jVar = new com.anythink.basead.d.j("", "");
            com.anythink.basead.d.b bVar = new com.anythink.basead.d.b();
            jVar.f6215k = bVar;
            bVar.f6131a = str2;
            b.a(19, wVar, jVar);
        }
    }

    public final void a() {
        if (this.f6030c != null && this.f6029a == null) {
            this.f6029a = new g();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("at_offer_action_1");
            intentFilter.addAction("at_offer_action_2");
            intentFilter.addAction("at_offer_action_3");
            intentFilter.addAction("at_offer_action_4");
            l.a(this.f6030c).a(this.f6029a, intentFilter);
        }
    }

    public final void a(String str, w wVar) {
        this.f6031d.put(str, wVar);
    }

    public final void a(String str, String str2) {
        w wVar = this.f6031d.get(str);
        if (wVar != null) {
            com.anythink.basead.d.j jVar = new com.anythink.basead.d.j("", "");
            com.anythink.basead.d.b bVar = new com.anythink.basead.d.b();
            jVar.f6215k = bVar;
            bVar.f6131a = str2;
            b.a(18, wVar, jVar);
        }
    }
}
