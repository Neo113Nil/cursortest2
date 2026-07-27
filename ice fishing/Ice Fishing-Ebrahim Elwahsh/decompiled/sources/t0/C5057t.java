package t0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: t0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5057t extends androidx.emoji2.text.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5057t(AbstractC5019C abstractC5019C, int i) {
        super(abstractC5019C);
        this.f40794d = i;
    }

    @Override // androidx.emoji2.text.g
    public final int b(View view) {
        switch (this.f40794d) {
            case 0:
                C5020D c5020d = (C5020D) view.getLayoutParams();
                ((AbstractC5019C) this.f4884b).getClass();
                return view.getRight() + ((C5020D) view.getLayoutParams()).f40577b.right + ((ViewGroup.MarginLayoutParams) c5020d).rightMargin;
            default:
                C5020D c5020d2 = (C5020D) view.getLayoutParams();
                ((AbstractC5019C) this.f4884b).getClass();
                return view.getBottom() + ((C5020D) view.getLayoutParams()).f40577b.bottom + ((ViewGroup.MarginLayoutParams) c5020d2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int c(View view) {
        switch (this.f40794d) {
            case 0:
                C5020D c5020d = (C5020D) view.getLayoutParams();
                ((AbstractC5019C) this.f4884b).getClass();
                return AbstractC5019C.A(view) + ((ViewGroup.MarginLayoutParams) c5020d).leftMargin + ((ViewGroup.MarginLayoutParams) c5020d).rightMargin;
            default:
                C5020D c5020d2 = (C5020D) view.getLayoutParams();
                ((AbstractC5019C) this.f4884b).getClass();
                return AbstractC5019C.z(view) + ((ViewGroup.MarginLayoutParams) c5020d2).topMargin + ((ViewGroup.MarginLayoutParams) c5020d2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        switch (this.f40794d) {
            case 0:
                C5020D c5020d = (C5020D) view.getLayoutParams();
                ((AbstractC5019C) this.f4884b).getClass();
                return AbstractC5019C.z(view) + ((ViewGroup.MarginLayoutParams) c5020d).topMargin + ((ViewGroup.MarginLayoutParams) c5020d).bottomMargin;
            default:
                C5020D c5020d2 = (C5020D) view.getLayoutParams();
                ((AbstractC5019C) this.f4884b).getClass();
                return AbstractC5019C.A(view) + ((ViewGroup.MarginLayoutParams) c5020d2).leftMargin + ((ViewGroup.MarginLayoutParams) c5020d2).rightMargin;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int e(View view) {
        switch (this.f40794d) {
            case 0:
                C5020D c5020d = (C5020D) view.getLayoutParams();
                ((AbstractC5019C) this.f4884b).getClass();
                return (view.getLeft() - ((C5020D) view.getLayoutParams()).f40577b.left) - ((ViewGroup.MarginLayoutParams) c5020d).leftMargin;
            default:
                C5020D c5020d2 = (C5020D) view.getLayoutParams();
                ((AbstractC5019C) this.f4884b).getClass();
                return (view.getTop() - ((C5020D) view.getLayoutParams()).f40577b.top) - ((ViewGroup.MarginLayoutParams) c5020d2).topMargin;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int f() {
        switch (this.f40794d) {
            case 0:
                return ((AbstractC5019C) this.f4884b).f40574n;
            default:
                return ((AbstractC5019C) this.f4884b).f40575o;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int g() {
        switch (this.f40794d) {
            case 0:
                AbstractC5019C abstractC5019C = (AbstractC5019C) this.f4884b;
                return abstractC5019C.f40574n - abstractC5019C.F();
            default:
                AbstractC5019C abstractC5019C2 = (AbstractC5019C) this.f4884b;
                return abstractC5019C2.f40575o - abstractC5019C2.D();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.f40794d) {
            case 0:
                return ((AbstractC5019C) this.f4884b).F();
            default:
                return ((AbstractC5019C) this.f4884b).D();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        switch (this.f40794d) {
            case 0:
                return ((AbstractC5019C) this.f4884b).f40572l;
            default:
                return ((AbstractC5019C) this.f4884b).f40573m;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.f40794d) {
            case 0:
                return ((AbstractC5019C) this.f4884b).f40573m;
            default:
                return ((AbstractC5019C) this.f4884b).f40572l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.f40794d) {
            case 0:
                return ((AbstractC5019C) this.f4884b).E();
            default:
                return ((AbstractC5019C) this.f4884b).G();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l() {
        switch (this.f40794d) {
            case 0:
                AbstractC5019C abstractC5019C = (AbstractC5019C) this.f4884b;
                return (abstractC5019C.f40574n - abstractC5019C.E()) - abstractC5019C.F();
            default:
                AbstractC5019C abstractC5019C2 = (AbstractC5019C) this.f4884b;
                return (abstractC5019C2.f40575o - abstractC5019C2.G()) - abstractC5019C2.D();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int m(View view) {
        switch (this.f40794d) {
            case 0:
                AbstractC5019C abstractC5019C = (AbstractC5019C) this.f4884b;
                Rect rect = (Rect) this.f4885c;
                abstractC5019C.K(rect, view);
                return rect.right;
            default:
                AbstractC5019C abstractC5019C2 = (AbstractC5019C) this.f4884b;
                Rect rect2 = (Rect) this.f4885c;
                abstractC5019C2.K(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int n(View view) {
        switch (this.f40794d) {
            case 0:
                AbstractC5019C abstractC5019C = (AbstractC5019C) this.f4884b;
                Rect rect = (Rect) this.f4885c;
                abstractC5019C.K(rect, view);
                return rect.left;
            default:
                AbstractC5019C abstractC5019C2 = (AbstractC5019C) this.f4884b;
                Rect rect2 = (Rect) this.f4885c;
                abstractC5019C2.K(rect2, view);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void o(int i) {
        switch (this.f40794d) {
            case 0:
                ((AbstractC5019C) this.f4884b).O(i);
                break;
            default:
                ((AbstractC5019C) this.f4884b).P(i);
                break;
        }
    }
}
