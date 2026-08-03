package org.fortheloss.st;

import android.app.Application;
import f8.c;
import hd.k;
import vb.f;
import xb.b;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class JokerAndSevensApp extends Application implements b {

    /* renamed from: g, reason: collision with root package name */
    public boolean f5390g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f5391h = new f(new c(14, this));

    @Override // xb.b
    public final Object c() {
        return this.f5391h.c();
    }

    @Override // android.app.Application
    public final void onCreate() {
        if (!this.f5390g) {
            this.f5390g = true;
            ((k) this.f5391h.c()).getClass();
        }
        super.onCreate();
    }
}
