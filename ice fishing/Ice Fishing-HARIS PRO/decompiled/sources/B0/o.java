package B0;

import android.view.View;

/* loaded from: classes.dex */
public final class o extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f62a;

    public o(q qVar) {
        this.f62a = qVar;
    }

    @Override // B0.h
    public final void b(View view) {
    }

    @Override // B0.h
    public final void c(View view, int i) {
        if (i == 5) {
            this.f62a.cancel();
        }
    }
}
