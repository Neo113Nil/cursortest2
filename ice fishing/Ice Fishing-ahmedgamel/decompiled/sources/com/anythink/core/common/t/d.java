package com.anythink.core.common.t;

import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.video.module.a.a.m;

/* loaded from: classes.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17228a = "TimeOutHandlerImpl";

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f17229b;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f17231d = com.anythink.core.common.v.b.b.a().a(12);

    /* renamed from: c, reason: collision with root package name */
    private final Handler f17230c = new Handler(Looper.getMainLooper());

    private d() {
    }

    public static a a() {
        if (f17229b == null) {
            synchronized (d.class) {
                try {
                    if (f17229b == null) {
                        f17229b = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17229b;
    }

    @Override // com.anythink.core.common.t.a
    public final void b(b bVar) {
        Handler handler = this.f17230c;
        if (handler != null && bVar != null) {
            handler.removeCallbacks(bVar);
        }
        Handler handler2 = this.f17231d;
        if (handler2 == null || bVar == null) {
            return;
        }
        handler2.removeCallbacks(bVar);
    }

    private Handler a(boolean z6) {
        return z6 ? this.f17230c : this.f17231d;
    }

    @Override // com.anythink.core.common.t.a
    public final void a(b bVar) {
        a(bVar, m.ai, true);
    }

    @Override // com.anythink.core.common.t.a
    public final void a(b bVar, long j6, boolean z6) {
        Handler a9 = a(z6);
        if (a9 == null) {
            return;
        }
        a9.postDelayed(bVar, j6);
    }
}
