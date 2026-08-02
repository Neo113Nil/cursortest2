package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final class n49 implements View.OnLayoutChangeListener {
    public final /* synthetic */ z0a a;
    public final /* synthetic */ pwt b;
    public final /* synthetic */ j79 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ dfb e;
    public final /* synthetic */ IllegalArgumentException f;

    public n49(z0a z0aVar, pwt pwtVar, j79 j79Var, boolean z, dfb dfbVar, IllegalArgumentException illegalArgumentException) {
        this.a = z0aVar;
        this.b = pwtVar;
        this.c = j79Var;
        this.d = z;
        this.e = dfbVar;
        this.f = illegalArgumentException;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int a = this.a.a(this.b.c);
        IllegalArgumentException illegalArgumentException = this.f;
        dfb dfbVar = this.e;
        if (a == -1) {
            dfbVar.d(illegalArgumentException);
            return;
        }
        j79 j79Var = this.c;
        View findViewById = j79Var.getRootView().findViewById(a);
        if (findViewById != null) {
            findViewById.setLabelFor(this.d ? -1 : j79Var.getId());
        } else {
            dfbVar.d(illegalArgumentException);
        }
    }
}
