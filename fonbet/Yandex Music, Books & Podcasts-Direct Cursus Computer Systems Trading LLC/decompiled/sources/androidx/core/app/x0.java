package androidx.core.app;

import android.content.Intent;

/* loaded from: classes.dex */
public final class x0 implements m {
    public final m a;
    public final /* synthetic */ y0 b;

    public x0(y0 y0Var, m mVar) {
        this.b = y0Var;
        this.a = mVar;
    }

    @Override // androidx.core.app.m
    public final void g() {
        try {
            this.a.g();
        } catch (Exception e) {
            this.b.f.d(com.yandex.passport.internal.analytics.m.k, e);
        }
    }

    @Override // androidx.core.app.m
    public final Intent getIntent() {
        return this.a.getIntent();
    }
}
