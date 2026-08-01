package Z;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0103u;
import h.AbstractActivityC0168i;
import l0.C0233d;
import l0.InterfaceC0234e;

/* renamed from: Z.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074w extends R.j implements androidx.lifecycle.V, b.v, InterfaceC0234e, Q {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0168i f1628a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0168i f1629b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1630c;

    /* renamed from: d, reason: collision with root package name */
    public final M f1631d;
    public final /* synthetic */ AbstractActivityC0168i e;

    public C0074w(AbstractActivityC0168i abstractActivityC0168i) {
        this.e = abstractActivityC0168i;
        Handler handler = new Handler();
        this.f1631d = new M();
        this.f1628a = abstractActivityC0168i;
        this.f1629b = abstractActivityC0168i;
        this.f1630c = handler;
    }

    @Override // R.j
    public final View X(int i) {
        return this.e.findViewById(i);
    }

    @Override // R.j
    public final boolean Y() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // Z.Q
    public final void a(M m2, AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
    }

    @Override // l0.InterfaceC0234e
    public final C0233d b() {
        return (C0233d) this.e.e.f2300c;
    }

    @Override // androidx.lifecycle.V
    public final androidx.lifecycle.U c() {
        return this.e.c();
    }

    @Override // androidx.lifecycle.InterfaceC0101s
    public final C0103u d() {
        return this.e.f3212s;
    }
}
