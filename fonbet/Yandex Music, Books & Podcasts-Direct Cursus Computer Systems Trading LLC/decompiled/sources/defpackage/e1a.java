package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final class e1a implements View.OnLayoutChangeListener {
    public final /* synthetic */ f1a a;
    public final /* synthetic */ i3k b;
    public final /* synthetic */ int c;

    public e1a(f1a f1aVar, i3k i3kVar, int i) {
        this.a = f1aVar;
        this.b = i3kVar;
        this.c = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.a.w0(this.b, this.c, false);
    }
}
