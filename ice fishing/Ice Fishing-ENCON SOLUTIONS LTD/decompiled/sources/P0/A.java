package P0;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1381a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1382b;

    public A(String str, boolean z2) {
        this.f1382b = str;
        this.f1381a = z2;
    }

    public void a(boolean z2) {
        if (this.f1381a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f1381a = true;
        K.a aVar = (K.a) this.f1382b;
        int i2 = aVar.f1017b - 1;
        aVar.f1017b = i2;
        boolean z3 = z2 | aVar.f1018c;
        aVar.f1018c = z3;
        if (i2 != 0 || z3) {
            return;
        }
        ((I0.b) aVar.f1020e).I((KeyEvent) aVar.f1019d);
    }

    public A(K.a aVar) {
        this.f1382b = aVar;
        this.f1381a = false;
    }
}
