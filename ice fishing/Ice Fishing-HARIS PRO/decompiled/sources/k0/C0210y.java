package k0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: k0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210y extends V.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0210y(K k2, int i) {
        super(k2);
        this.f3627d = i;
    }

    @Override // V.g
    public final int b(View view) {
        switch (this.f3627d) {
            case 0:
                L l2 = (L) view.getLayoutParams();
                ((K) this.f1211b).getClass();
                return view.getRight() + ((L) view.getLayoutParams()).f3397b.right + ((ViewGroup.MarginLayoutParams) l2).rightMargin;
            default:
                L l3 = (L) view.getLayoutParams();
                ((K) this.f1211b).getClass();
                return view.getBottom() + ((L) view.getLayoutParams()).f3397b.bottom + ((ViewGroup.MarginLayoutParams) l3).bottomMargin;
        }
    }

    @Override // V.g
    public final int c(View view) {
        switch (this.f3627d) {
            case 0:
                L l2 = (L) view.getLayoutParams();
                ((K) this.f1211b).getClass();
                return K.A(view) + ((ViewGroup.MarginLayoutParams) l2).leftMargin + ((ViewGroup.MarginLayoutParams) l2).rightMargin;
            default:
                L l3 = (L) view.getLayoutParams();
                ((K) this.f1211b).getClass();
                return K.z(view) + ((ViewGroup.MarginLayoutParams) l3).topMargin + ((ViewGroup.MarginLayoutParams) l3).bottomMargin;
        }
    }

    @Override // V.g
    public final int d(View view) {
        switch (this.f3627d) {
            case 0:
                L l2 = (L) view.getLayoutParams();
                ((K) this.f1211b).getClass();
                return K.z(view) + ((ViewGroup.MarginLayoutParams) l2).topMargin + ((ViewGroup.MarginLayoutParams) l2).bottomMargin;
            default:
                L l3 = (L) view.getLayoutParams();
                ((K) this.f1211b).getClass();
                return K.A(view) + ((ViewGroup.MarginLayoutParams) l3).leftMargin + ((ViewGroup.MarginLayoutParams) l3).rightMargin;
        }
    }

    @Override // V.g
    public final int e(View view) {
        switch (this.f3627d) {
            case 0:
                L l2 = (L) view.getLayoutParams();
                ((K) this.f1211b).getClass();
                return (view.getLeft() - ((L) view.getLayoutParams()).f3397b.left) - ((ViewGroup.MarginLayoutParams) l2).leftMargin;
            default:
                L l3 = (L) view.getLayoutParams();
                ((K) this.f1211b).getClass();
                return (view.getTop() - ((L) view.getLayoutParams()).f3397b.top) - ((ViewGroup.MarginLayoutParams) l3).topMargin;
        }
    }

    @Override // V.g
    public final int f() {
        switch (this.f3627d) {
            case 0:
                return ((K) this.f1211b).f3394n;
            default:
                return ((K) this.f1211b).f3395o;
        }
    }

    @Override // V.g
    public final int g() {
        switch (this.f3627d) {
            case 0:
                K k2 = (K) this.f1211b;
                return k2.f3394n - k2.F();
            default:
                K k3 = (K) this.f1211b;
                return k3.f3395o - k3.D();
        }
    }

    @Override // V.g
    public final int h() {
        switch (this.f3627d) {
            case 0:
                return ((K) this.f1211b).F();
            default:
                return ((K) this.f1211b).D();
        }
    }

    @Override // V.g
    public final int i() {
        switch (this.f3627d) {
            case 0:
                return ((K) this.f1211b).f3392l;
            default:
                return ((K) this.f1211b).f3393m;
        }
    }

    @Override // V.g
    public final int j() {
        switch (this.f3627d) {
            case 0:
                return ((K) this.f1211b).f3393m;
            default:
                return ((K) this.f1211b).f3392l;
        }
    }

    @Override // V.g
    public final int k() {
        switch (this.f3627d) {
            case 0:
                return ((K) this.f1211b).E();
            default:
                return ((K) this.f1211b).G();
        }
    }

    @Override // V.g
    public final int l() {
        switch (this.f3627d) {
            case 0:
                K k2 = (K) this.f1211b;
                return (k2.f3394n - k2.E()) - k2.F();
            default:
                K k3 = (K) this.f1211b;
                return (k3.f3395o - k3.G()) - k3.D();
        }
    }

    @Override // V.g
    public final int n(View view) {
        switch (this.f3627d) {
            case 0:
                K k2 = (K) this.f1211b;
                Rect rect = (Rect) this.f1212c;
                k2.K(view, rect);
                return rect.right;
            default:
                K k3 = (K) this.f1211b;
                Rect rect2 = (Rect) this.f1212c;
                k3.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // V.g
    public final int o(View view) {
        switch (this.f3627d) {
            case 0:
                K k2 = (K) this.f1211b;
                Rect rect = (Rect) this.f1212c;
                k2.K(view, rect);
                return rect.left;
            default:
                K k3 = (K) this.f1211b;
                Rect rect2 = (Rect) this.f1212c;
                k3.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // V.g
    public final void p(int i) {
        switch (this.f3627d) {
            case 0:
                ((K) this.f1211b).P(i);
                break;
            default:
                ((K) this.f1211b).Q(i);
                break;
        }
    }
}
