package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.IceFishing.LiveIceFishing.C5248R;
import l.ViewTreeObserverOnGlobalLayoutListenerC4658d;

/* loaded from: classes.dex */
public final class L extends B0 implements N {

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f39100V;

    /* renamed from: W, reason: collision with root package name */
    public J f39101W;

    /* renamed from: X, reason: collision with root package name */
    public final Rect f39102X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public final /* synthetic */ O f39103Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O o4, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.spinnerStyle);
        this.f39103Z = o4;
        this.f39102X = new Rect();
        this.f39043H = o4;
        this.f39052R = true;
        this.f39053S.setFocusable(true);
        this.f39044I = new J3.w(1, this);
    }

    @Override // m.N
    public final CharSequence e() {
        return this.f39100V;
    }

    @Override // m.N
    public final void g(CharSequence charSequence) {
        this.f39100V = charSequence;
    }

    @Override // m.N
    public final void i(int i) {
        this.Y = i;
    }

    @Override // m.N
    public final void j(int i, int i4) {
        ViewTreeObserver viewTreeObserver;
        C4737z c4737z = this.f39053S;
        boolean isShowing = c4737z.isShowing();
        o();
        this.f39053S.setInputMethodMode(2);
        show();
        C4719p0 c4719p0 = this.f39056v;
        c4719p0.setChoiceMode(1);
        c4719p0.setTextDirection(i);
        c4719p0.setTextAlignment(i4);
        O o4 = this.f39103Z;
        int selectedItemPosition = o4.getSelectedItemPosition();
        C4719p0 c4719p02 = this.f39056v;
        if (c4737z.isShowing() && c4719p02 != null) {
            c4719p02.setListSelectionHidden(false);
            c4719p02.setSelection(selectedItemPosition);
            if (c4719p02.getChoiceMode() != 0) {
                c4719p02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = o4.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC4658d viewTreeObserverOnGlobalLayoutListenerC4658d = new ViewTreeObserverOnGlobalLayoutListenerC4658d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4658d);
        this.f39053S.setOnDismissListener(new K(this, viewTreeObserverOnGlobalLayoutListenerC4658d));
    }

    @Override // m.B0, m.N
    public final void l(ListAdapter listAdapter) {
        super.l(listAdapter);
        this.f39101W = (J) listAdapter;
    }

    public final void o() {
        int i;
        C4737z c4737z = this.f39053S;
        Drawable background = c4737z.getBackground();
        O o4 = this.f39103Z;
        if (background != null) {
            background.getPadding(o4.f39113A);
            boolean z6 = g1.f39217a;
            int layoutDirection = o4.getLayoutDirection();
            Rect rect = o4.f39113A;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = o4.f39113A;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = o4.getPaddingLeft();
        int paddingRight = o4.getPaddingRight();
        int width = o4.getWidth();
        int i4 = o4.f39120z;
        if (i4 == -2) {
            int a9 = o4.a(this.f39101W, c4737z.getBackground());
            int i6 = o4.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = o4.f39113A;
            int i9 = (i6 - rect3.left) - rect3.right;
            if (a9 > i9) {
                a9 = i9;
            }
            n(Math.max(a9, (width - paddingLeft) - paddingRight));
        } else if (i4 == -1) {
            n((width - paddingLeft) - paddingRight);
        } else {
            n(i4);
        }
        boolean z9 = g1.f39217a;
        this.f39059y = o4.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f39058x) - this.Y) + i : paddingLeft + this.Y + i;
    }
}
