package L;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: L.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066q {

    /* renamed from: a, reason: collision with root package name */
    public final x f670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f671b;

    public C0066q(x xVar, int i2) {
        this.f671b = i2;
        new Rect();
        this.f670a = xVar;
    }

    public static C0066q a(x xVar, int i2) {
        if (i2 == 0) {
            return new C0066q(xVar, 0);
        }
        if (i2 == 1) {
            return new C0066q(xVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public final int b(View view) {
        switch (this.f671b) {
            case 0:
                y yVar = (y) view.getLayoutParams();
                this.f670a.getClass();
                return view.getRight() + ((y) view.getLayoutParams()).f685a.right + ((ViewGroup.MarginLayoutParams) yVar).rightMargin;
            default:
                y yVar2 = (y) view.getLayoutParams();
                this.f670a.getClass();
                return view.getBottom() + ((y) view.getLayoutParams()).f685a.bottom + ((ViewGroup.MarginLayoutParams) yVar2).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.f671b) {
            case 0:
                y yVar = (y) view.getLayoutParams();
                this.f670a.getClass();
                return (view.getLeft() - ((y) view.getLayoutParams()).f685a.left) - ((ViewGroup.MarginLayoutParams) yVar).leftMargin;
            default:
                y yVar2 = (y) view.getLayoutParams();
                this.f670a.getClass();
                return (view.getTop() - ((y) view.getLayoutParams()).f685a.top) - ((ViewGroup.MarginLayoutParams) yVar2).topMargin;
        }
    }

    public final int d() {
        switch (this.f671b) {
            case 0:
                x xVar = this.f670a;
                return xVar.f683f - xVar.t();
            default:
                x xVar2 = this.f670a;
                return xVar2.f684g - xVar2.r();
        }
    }

    public final int e() {
        switch (this.f671b) {
            case 0:
                return this.f670a.s();
            default:
                return this.f670a.u();
        }
    }
}
