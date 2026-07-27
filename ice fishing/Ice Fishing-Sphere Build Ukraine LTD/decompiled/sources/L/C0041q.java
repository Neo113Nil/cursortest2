package L;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: L.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041q {

    /* renamed from: a, reason: collision with root package name */
    public final x f592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f593b;

    public C0041q(x xVar, int i2) {
        this.f593b = i2;
        new Rect();
        this.f592a = xVar;
    }

    public static C0041q a(x xVar, int i2) {
        if (i2 == 0) {
            return new C0041q(xVar, 0);
        }
        if (i2 == 1) {
            return new C0041q(xVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public final int b(View view) {
        switch (this.f593b) {
            case 0:
                y yVar = (y) view.getLayoutParams();
                this.f592a.getClass();
                return view.getRight() + ((y) view.getLayoutParams()).f607a.right + ((ViewGroup.MarginLayoutParams) yVar).rightMargin;
            default:
                y yVar2 = (y) view.getLayoutParams();
                this.f592a.getClass();
                return view.getBottom() + ((y) view.getLayoutParams()).f607a.bottom + ((ViewGroup.MarginLayoutParams) yVar2).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.f593b) {
            case 0:
                y yVar = (y) view.getLayoutParams();
                this.f592a.getClass();
                return (view.getLeft() - ((y) view.getLayoutParams()).f607a.left) - ((ViewGroup.MarginLayoutParams) yVar).leftMargin;
            default:
                y yVar2 = (y) view.getLayoutParams();
                this.f592a.getClass();
                return (view.getTop() - ((y) view.getLayoutParams()).f607a.top) - ((ViewGroup.MarginLayoutParams) yVar2).topMargin;
        }
    }

    public final int d() {
        switch (this.f593b) {
            case 0:
                x xVar = this.f592a;
                return xVar.f605f - xVar.t();
            default:
                x xVar2 = this.f592a;
                return xVar2.f606g - xVar2.r();
        }
    }

    public final int e() {
        switch (this.f593b) {
            case 0:
                return this.f592a.s();
            default:
                return this.f592a.u();
        }
    }
}
