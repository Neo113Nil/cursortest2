package androidx.core.app;

import android.content.Intent;

/* loaded from: classes.dex */
public final class l implements m {
    public final Intent a;
    public final int b;
    public final /* synthetic */ y0 c;

    public l(y0 y0Var, Intent intent, int i) {
        this.c = y0Var;
        this.a = intent;
        this.b = i;
    }

    @Override // androidx.core.app.m
    public final void g() {
        this.c.stopSelf(this.b);
    }

    @Override // androidx.core.app.m
    public final Intent getIntent() {
        return this.a;
    }
}
