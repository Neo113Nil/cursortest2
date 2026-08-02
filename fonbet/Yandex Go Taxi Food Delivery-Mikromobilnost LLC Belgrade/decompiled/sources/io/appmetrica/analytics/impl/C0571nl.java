package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.nl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0571nl extends Gq {
    public final RunnableC0542ml d;
    public final ICommonExecutor e;

    public C0571nl(S5 s5, InterfaceC0344fp interfaceC0344fp, ICommonExecutor iCommonExecutor) {
        super(s5, interfaceC0344fp);
        this.d = new RunnableC0542ml(this);
        this.e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.Gq
    public final void a() {
        this.e.remove(this.d);
    }

    @Override // io.appmetrica.analytics.impl.Gq
    public final void f() {
        this.b.a();
        Xj xj = (Xj) ((S5) this.a).k.a();
        if (xj.k.a(xj.j)) {
            String str = xj.m;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(Gg.a((S5) this.a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Gq
    public final void g() {
        this.e.executeDelayed(this.d, 1000L);
    }

    public final void h() {
        if (this.c.get()) {
            return;
        }
        this.e.remove(this.d);
        if (((Xj) ((S5) this.a).k.a()).g > 0) {
            this.e.executeDelayed(this.d, TimeUnit.SECONDS.toMillis(((Xj) ((S5) this.a).k.a()).g));
        }
    }
}
