package com.google.android.material.snackbar;

import O.X;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.icefishing.icefishinglive2.C5275R;
import java.util.WeakHashMap;
import l3.AbstractC4661a;
import t8.g;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public TextView f36060n;

    /* renamed from: u, reason: collision with root package name */
    public Button f36061u;

    /* renamed from: v, reason: collision with root package name */
    public int f36062v;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.E(context, C5275R.attr.motionEasingEmphasizedInterpolator, AbstractC4661a.f38904b);
    }

    public final boolean a(int i, int i6, int i9) {
        boolean z3;
        if (i != getOrientation()) {
            setOrientation(i);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f36060n.getPaddingTop() == i6 && this.f36060n.getPaddingBottom() == i9) {
            return z3;
        }
        TextView textView = this.f36060n;
        WeakHashMap weakHashMap = X.f2054a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i6, textView.getPaddingEnd(), i9);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i6, textView.getPaddingRight(), i9);
        return true;
    }

    public Button getActionView() {
        return this.f36061u;
    }

    public TextView getMessageView() {
        return this.f36060n;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36060n = (TextView) findViewById(C5275R.id.snackbar_text);
        this.f36061u = (Button) findViewById(C5275R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C5275R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C5275R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f36060n.getLayout();
        boolean z3 = layout != null && layout.getLineCount() > 1;
        if (!z3 || this.f36062v <= 0 || this.f36061u.getMeasuredWidth() <= this.f36062v) {
            if (!z3) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i6);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f36062v = i;
    }
}
