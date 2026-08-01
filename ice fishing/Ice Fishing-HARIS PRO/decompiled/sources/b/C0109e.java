package b;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.InterfaceC0100q;
import androidx.lifecycle.InterfaceC0101s;
import androidx.lifecycle.U;
import h.AbstractActivityC0168i;

/* renamed from: b.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109e implements InterfaceC0100q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0168i f2275b;

    public /* synthetic */ C0109e(AbstractActivityC0168i abstractActivityC0168i, int i) {
        this.f2274a = i;
        this.f2275b = abstractActivityC0168i;
    }

    @Override // androidx.lifecycle.InterfaceC0100q
    public final void a(InterfaceC0101s interfaceC0101s, EnumC0096m enumC0096m) {
        switch (this.f2274a) {
            case 0:
                if (enumC0096m == EnumC0096m.ON_STOP) {
                    Window window = this.f2275b.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case 1:
                if (enumC0096m == EnumC0096m.ON_DESTROY) {
                    this.f2275b.f2282b.f2338b = null;
                    if (!this.f2275b.isChangingConfigurations()) {
                        this.f2275b.c().a();
                    }
                    ExecutorC0112h executorC0112h = this.f2275b.f2287h;
                    AbstractActivityC0168i abstractActivityC0168i = executorC0112h.f2280d;
                    abstractActivityC0168i.getWindow().getDecorView().removeCallbacks(executorC0112h);
                    abstractActivityC0168i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC0112h);
                    break;
                }
                break;
            default:
                AbstractActivityC0168i abstractActivityC0168i2 = this.f2275b;
                if (abstractActivityC0168i2.f2285f == null) {
                    C0111g c0111g = (C0111g) abstractActivityC0168i2.getLastNonConfigurationInstance();
                    if (c0111g != null) {
                        abstractActivityC0168i2.f2285f = c0111g.f2276a;
                    }
                    if (abstractActivityC0168i2.f2285f == null) {
                        abstractActivityC0168i2.f2285f = new U();
                    }
                }
                abstractActivityC0168i2.f2284d.f(this);
                break;
        }
    }
}
