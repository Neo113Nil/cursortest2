package k0;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f3379b;

    public /* synthetic */ I(K k2, int i) {
        this.f3378a = i;
        this.f3379b = k2;
    }

    public final int a(View view) {
        switch (this.f3378a) {
            case 0:
                L l2 = (L) view.getLayoutParams();
                this.f3379b.getClass();
                return view.getRight() + ((L) view.getLayoutParams()).f3397b.right + ((ViewGroup.MarginLayoutParams) l2).rightMargin;
            default:
                L l3 = (L) view.getLayoutParams();
                this.f3379b.getClass();
                return view.getBottom() + ((L) view.getLayoutParams()).f3397b.bottom + ((ViewGroup.MarginLayoutParams) l3).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f3378a) {
            case 0:
                L l2 = (L) view.getLayoutParams();
                this.f3379b.getClass();
                return (view.getLeft() - ((L) view.getLayoutParams()).f3397b.left) - ((ViewGroup.MarginLayoutParams) l2).leftMargin;
            default:
                L l3 = (L) view.getLayoutParams();
                this.f3379b.getClass();
                return (view.getTop() - ((L) view.getLayoutParams()).f3397b.top) - ((ViewGroup.MarginLayoutParams) l3).topMargin;
        }
    }

    public final int c() {
        switch (this.f3378a) {
            case 0:
                K k2 = this.f3379b;
                return k2.f3394n - k2.F();
            default:
                K k3 = this.f3379b;
                return k3.f3395o - k3.D();
        }
    }

    public final int d() {
        switch (this.f3378a) {
            case 0:
                return this.f3379b.E();
            default:
                return this.f3379b.G();
        }
    }
}
