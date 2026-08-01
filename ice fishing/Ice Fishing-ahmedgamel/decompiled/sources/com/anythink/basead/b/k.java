package com.anythink.basead.b;

import android.content.Context;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.a.f;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static volatile k f6041a;

    /* renamed from: b, reason: collision with root package name */
    private Context f6042b = t.b().g();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.common.v.a.c f6043c = new com.anythink.core.common.v.a.c(1, 50);

    /* renamed from: d, reason: collision with root package name */
    private f.b f6044d = new f.b(1);

    private k() {
    }

    public static k a() {
        if (f6041a == null) {
            synchronized (h.class) {
                try {
                    if (f6041a == null) {
                        f6041a = new k();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6041a;
    }

    public final com.anythink.core.common.v.a.c b() {
        return this.f6043c;
    }

    public final f.b c() {
        return this.f6044d;
    }
}
