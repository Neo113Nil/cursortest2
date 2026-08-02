package t0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: t0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5023s extends androidx.emoji2.text.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40822d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5023s(AbstractC4987C abstractC4987C, int i) {
        super(abstractC4987C);
        this.f40822d = i;
    }

    @Override // androidx.emoji2.text.g
    public final int b(View view) {
        switch (this.f40822d) {
            case 0:
                C4988D c4988d = (C4988D) view.getLayoutParams();
                ((AbstractC4987C) this.f4737b).getClass();
                return view.getRight() + ((C4988D) view.getLayoutParams()).f40605b.right + ((ViewGroup.MarginLayoutParams) c4988d).rightMargin;
            default:
                C4988D c4988d2 = (C4988D) view.getLayoutParams();
                ((AbstractC4987C) this.f4737b).getClass();
                return view.getBottom() + ((C4988D) view.getLayoutParams()).f40605b.bottom + ((ViewGroup.MarginLayoutParams) c4988d2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int c(View view) {
        switch (this.f40822d) {
            case 0:
                C4988D c4988d = (C4988D) view.getLayoutParams();
                ((AbstractC4987C) this.f4737b).getClass();
                return AbstractC4987C.A(view) + ((ViewGroup.MarginLayoutParams) c4988d).leftMargin + ((ViewGroup.MarginLayoutParams) c4988d).rightMargin;
            default:
                C4988D c4988d2 = (C4988D) view.getLayoutParams();
                ((AbstractC4987C) this.f4737b).getClass();
                return AbstractC4987C.z(view) + ((ViewGroup.MarginLayoutParams) c4988d2).topMargin + ((ViewGroup.MarginLayoutParams) c4988d2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        switch (this.f40822d) {
            case 0:
                C4988D c4988d = (C4988D) view.getLayoutParams();
                ((AbstractC4987C) this.f4737b).getClass();
                return AbstractC4987C.z(view) + ((ViewGroup.MarginLayoutParams) c4988d).topMargin + ((ViewGroup.MarginLayoutParams) c4988d).bottomMargin;
            default:
                C4988D c4988d2 = (C4988D) view.getLayoutParams();
                ((AbstractC4987C) this.f4737b).getClass();
                return AbstractC4987C.A(view) + ((ViewGroup.MarginLayoutParams) c4988d2).leftMargin + ((ViewGroup.MarginLayoutParams) c4988d2).rightMargin;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int e(View view) {
        switch (this.f40822d) {
            case 0:
                C4988D c4988d = (C4988D) view.getLayoutParams();
                ((AbstractC4987C) this.f4737b).getClass();
                return (view.getLeft() - ((C4988D) view.getLayoutParams()).f40605b.left) - ((ViewGroup.MarginLayoutParams) c4988d).leftMargin;
            default:
                C4988D c4988d2 = (C4988D) view.getLayoutParams();
                ((AbstractC4987C) this.f4737b).getClass();
                return (view.getTop() - ((C4988D) view.getLayoutParams()).f40605b.top) - ((ViewGroup.MarginLayoutParams) c4988d2).topMargin;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        switch (this.f40822d) {
            case 0:
                return ((AbstractC4987C) this.f4737b).f40602n;
            default:
                return ((AbstractC4987C) this.f4737b).f40603o;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        switch (this.f40822d) {
            case 0:
                AbstractC4987C abstractC4987C = (AbstractC4987C) this.f4737b;
                return abstractC4987C.f40602n - abstractC4987C.F();
            default:
                AbstractC4987C abstractC4987C2 = (AbstractC4987C) this.f4737b;
                return abstractC4987C2.f40603o - abstractC4987C2.D();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.f40822d) {
            case 0:
                return ((AbstractC4987C) this.f4737b).F();
            default:
                return ((AbstractC4987C) this.f4737b).D();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.f40822d) {
            case 0:
                return ((AbstractC4987C) this.f4737b).f40600l;
            default:
                return ((AbstractC4987C) this.f4737b).f40601m;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.f40822d) {
            case 0:
                return ((AbstractC4987C) this.f4737b).f40601m;
            default:
                return ((AbstractC4987C) this.f4737b).f40600l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.f40822d) {
            case 0:
                return ((AbstractC4987C) this.f4737b).E();
            default:
                return ((AbstractC4987C) this.f4737b).G();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l() {
        switch (this.f40822d) {
            case 0:
                AbstractC4987C abstractC4987C = (AbstractC4987C) this.f4737b;
                return (abstractC4987C.f40602n - abstractC4987C.E()) - abstractC4987C.F();
            default:
                AbstractC4987C abstractC4987C2 = (AbstractC4987C) this.f4737b;
                return (abstractC4987C2.f40603o - abstractC4987C2.G()) - abstractC4987C2.D();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.f40822d) {
            case 0:
                AbstractC4987C abstractC4987C = (AbstractC4987C) this.f4737b;
                Rect rect = (Rect) this.f4738c;
                abstractC4987C.K(rect, view);
                return rect.right;
            default:
                AbstractC4987C abstractC4987C2 = (AbstractC4987C) this.f4737b;
                Rect rect2 = (Rect) this.f4738c;
                abstractC4987C2.K(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int n(View view) {
        switch (this.f40822d) {
            case 0:
                AbstractC4987C abstractC4987C = (AbstractC4987C) this.f4737b;
                Rect rect = (Rect) this.f4738c;
                abstractC4987C.K(rect, view);
                return rect.left;
            default:
                AbstractC4987C abstractC4987C2 = (AbstractC4987C) this.f4737b;
                Rect rect2 = (Rect) this.f4738c;
                abstractC4987C2.K(rect2, view);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void o(int i) {
        switch (this.f40822d) {
            case 0:
                ((AbstractC4987C) this.f4737b).O(i);
                break;
            default:
                ((AbstractC4987C) this.f4737b).P(i);
                break;
        }
    }
}
