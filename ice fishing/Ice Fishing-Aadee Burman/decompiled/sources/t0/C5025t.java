package t0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: t0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5025t extends androidx.emoji2.text.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5025t(AbstractC4990E abstractC4990E, int i) {
        super(abstractC4990E);
        this.f40772d = i;
    }

    @Override // androidx.emoji2.text.g
    public final int b(View view) {
        switch (this.f40772d) {
            case 0:
                C4991F c4991f = (C4991F) view.getLayoutParams();
                ((AbstractC4990E) this.f4769b).getClass();
                return view.getRight() + ((C4991F) view.getLayoutParams()).f40552b.right + ((ViewGroup.MarginLayoutParams) c4991f).rightMargin;
            default:
                C4991F c4991f2 = (C4991F) view.getLayoutParams();
                ((AbstractC4990E) this.f4769b).getClass();
                return view.getBottom() + ((C4991F) view.getLayoutParams()).f40552b.bottom + ((ViewGroup.MarginLayoutParams) c4991f2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int c(View view) {
        switch (this.f40772d) {
            case 0:
                C4991F c4991f = (C4991F) view.getLayoutParams();
                ((AbstractC4990E) this.f4769b).getClass();
                return AbstractC4990E.A(view) + ((ViewGroup.MarginLayoutParams) c4991f).leftMargin + ((ViewGroup.MarginLayoutParams) c4991f).rightMargin;
            default:
                C4991F c4991f2 = (C4991F) view.getLayoutParams();
                ((AbstractC4990E) this.f4769b).getClass();
                return AbstractC4990E.z(view) + ((ViewGroup.MarginLayoutParams) c4991f2).topMargin + ((ViewGroup.MarginLayoutParams) c4991f2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        switch (this.f40772d) {
            case 0:
                C4991F c4991f = (C4991F) view.getLayoutParams();
                ((AbstractC4990E) this.f4769b).getClass();
                return AbstractC4990E.z(view) + ((ViewGroup.MarginLayoutParams) c4991f).topMargin + ((ViewGroup.MarginLayoutParams) c4991f).bottomMargin;
            default:
                C4991F c4991f2 = (C4991F) view.getLayoutParams();
                ((AbstractC4990E) this.f4769b).getClass();
                return AbstractC4990E.A(view) + ((ViewGroup.MarginLayoutParams) c4991f2).leftMargin + ((ViewGroup.MarginLayoutParams) c4991f2).rightMargin;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int e(View view) {
        switch (this.f40772d) {
            case 0:
                C4991F c4991f = (C4991F) view.getLayoutParams();
                ((AbstractC4990E) this.f4769b).getClass();
                return (view.getLeft() - ((C4991F) view.getLayoutParams()).f40552b.left) - ((ViewGroup.MarginLayoutParams) c4991f).leftMargin;
            default:
                C4991F c4991f2 = (C4991F) view.getLayoutParams();
                ((AbstractC4990E) this.f4769b).getClass();
                return (view.getTop() - ((C4991F) view.getLayoutParams()).f40552b.top) - ((ViewGroup.MarginLayoutParams) c4991f2).topMargin;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        switch (this.f40772d) {
            case 0:
                return ((AbstractC4990E) this.f4769b).f40549n;
            default:
                return ((AbstractC4990E) this.f4769b).f40550o;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        switch (this.f40772d) {
            case 0:
                AbstractC4990E abstractC4990E = (AbstractC4990E) this.f4769b;
                return abstractC4990E.f40549n - abstractC4990E.F();
            default:
                AbstractC4990E abstractC4990E2 = (AbstractC4990E) this.f4769b;
                return abstractC4990E2.f40550o - abstractC4990E2.D();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.f40772d) {
            case 0:
                return ((AbstractC4990E) this.f4769b).F();
            default:
                return ((AbstractC4990E) this.f4769b).D();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.f40772d) {
            case 0:
                return ((AbstractC4990E) this.f4769b).f40547l;
            default:
                return ((AbstractC4990E) this.f4769b).f40548m;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.f40772d) {
            case 0:
                return ((AbstractC4990E) this.f4769b).f40548m;
            default:
                return ((AbstractC4990E) this.f4769b).f40547l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.f40772d) {
            case 0:
                return ((AbstractC4990E) this.f4769b).E();
            default:
                return ((AbstractC4990E) this.f4769b).G();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l() {
        switch (this.f40772d) {
            case 0:
                AbstractC4990E abstractC4990E = (AbstractC4990E) this.f4769b;
                return (abstractC4990E.f40549n - abstractC4990E.E()) - abstractC4990E.F();
            default:
                AbstractC4990E abstractC4990E2 = (AbstractC4990E) this.f4769b;
                return (abstractC4990E2.f40550o - abstractC4990E2.G()) - abstractC4990E2.D();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.f40772d) {
            case 0:
                AbstractC4990E abstractC4990E = (AbstractC4990E) this.f4769b;
                Rect rect = (Rect) this.f4770c;
                abstractC4990E.K(rect, view);
                return rect.right;
            default:
                AbstractC4990E abstractC4990E2 = (AbstractC4990E) this.f4769b;
                Rect rect2 = (Rect) this.f4770c;
                abstractC4990E2.K(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int n(View view) {
        switch (this.f40772d) {
            case 0:
                AbstractC4990E abstractC4990E = (AbstractC4990E) this.f4769b;
                Rect rect = (Rect) this.f4770c;
                abstractC4990E.K(rect, view);
                return rect.left;
            default:
                AbstractC4990E abstractC4990E2 = (AbstractC4990E) this.f4769b;
                Rect rect2 = (Rect) this.f4770c;
                abstractC4990E2.K(rect2, view);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void o(int i) {
        switch (this.f40772d) {
            case 0:
                ((AbstractC4990E) this.f4769b).O(i);
                break;
            default:
                ((AbstractC4990E) this.f4769b).P(i);
                break;
        }
    }
}
