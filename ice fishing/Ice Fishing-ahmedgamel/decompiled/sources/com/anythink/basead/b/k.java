package com.anythink.basead.b;

import android.content.Context;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.a.f;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static volatile k f6827a;

    /* renamed from: b, reason: collision with root package name */
    private Context f6828b = t.b().g();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.common.v.a.c f6829c = new com.anythink.core.common.v.a.c(1, 50);

    /* renamed from: d, reason: collision with root package name */
    private f.b f6830d = new f.b(1);

    private k() {
    }

    public static k a() {
        if (f6827a == null) {
            synchronized (h.class) {
                try {
                    if (f6827a == null) {
                        f6827a = new k();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6827a;
    }

    public final com.anythink.core.common.v.a.c b() {
        return this.f6829c;
    }

    public final f.b c() {
        return this.f6830d;
    }
}
