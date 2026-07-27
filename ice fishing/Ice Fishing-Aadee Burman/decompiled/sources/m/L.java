package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.icefishing.icefishinglive2.C5275R;
import l.ViewTreeObserverOnGlobalLayoutListenerC4647d;

/* loaded from: classes.dex */
public final class L extends B0 implements N {

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f39032V;

    /* renamed from: W, reason: collision with root package name */
    public J f39033W;

    /* renamed from: X, reason: collision with root package name */
    public final Rect f39034X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public final /* synthetic */ O f39035Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O o6, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.spinnerStyle);
        this.f39035Z = o6;
        this.f39034X = new Rect();
        this.f38975H = o6;
        this.f38984R = true;
        this.f38985S.setFocusable(true);
        this.f38976I = new H3.w(1, this);
    }

    @Override // m.N
    public final CharSequence e() {
        return this.f39032V;
    }

    @Override // m.N
    public final void g(CharSequence charSequence) {
        this.f39032V = charSequence;
    }

    @Override // m.N
    public final void i(int i) {
        this.Y = i;
    }

    @Override // m.N
    public final void j(int i, int i6) {
        ViewTreeObserver viewTreeObserver;
        C4724z c4724z = this.f38985S;
        boolean isShowing = c4724z.isShowing();
        p();
        this.f38985S.setInputMethodMode(2);
        show();
        C4706p0 c4706p0 = this.f38988v;
        c4706p0.setChoiceMode(1);
        c4706p0.setTextDirection(i);
        c4706p0.setTextAlignment(i6);
        O o6 = this.f39035Z;
        int selectedItemPosition = o6.getSelectedItemPosition();
        C4706p0 c4706p02 = this.f38988v;
        if (c4724z.isShowing() && c4706p02 != null) {
            c4706p02.setListSelectionHidden(false);
            c4706p02.setSelection(selectedItemPosition);
            if (c4706p02.getChoiceMode() != 0) {
                c4706p02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = o6.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC4647d viewTreeObserverOnGlobalLayoutListenerC4647d = new ViewTreeObserverOnGlobalLayoutListenerC4647d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC4647d);
        this.f38985S.setOnDismissListener(new K(this, viewTreeObserverOnGlobalLayoutListenerC4647d));
    }

    @Override // m.B0, m.N
    public final void m(ListAdapter listAdapter) {
        super.m(listAdapter);
        this.f39033W = (J) listAdapter;
    }

    public final void p() {
        int i;
        C4724z c4724z = this.f38985S;
        Drawable background = c4724z.getBackground();
        O o6 = this.f39035Z;
        if (background != null) {
            background.getPadding(o6.f39045A);
            boolean z3 = f1.f39146a;
            int layoutDirection = o6.getLayoutDirection();
            Rect rect = o6.f39045A;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = o6.f39045A;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = o6.getPaddingLeft();
        int paddingRight = o6.getPaddingRight();
        int width = o6.getWidth();
        int i6 = o6.f39052z;
        if (i6 == -2) {
            int a9 = o6.a(this.f39033W, c4724z.getBackground());
            int i9 = o6.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = o6.f39045A;
            int i10 = (i9 - rect3.left) - rect3.right;
            if (a9 > i10) {
                a9 = i10;
            }
            o(Math.max(a9, (width - paddingLeft) - paddingRight));
        } else if (i6 == -1) {
            o((width - paddingLeft) - paddingRight);
        } else {
            o(i6);
        }
        boolean z6 = f1.f39146a;
        this.f38991y = o6.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f38990x) - this.Y) + i : paddingLeft + this.Y + i;
    }
}
