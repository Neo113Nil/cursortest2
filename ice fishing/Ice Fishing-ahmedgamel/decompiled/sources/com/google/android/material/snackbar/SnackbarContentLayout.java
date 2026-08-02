package com.google.android.material.snackbar;

import N3.C;
import O.X;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.WeakHashMap;
import n3.AbstractC4770a;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public TextView f36828n;

    /* renamed from: u, reason: collision with root package name */
    public Button f36829u;

    /* renamed from: v, reason: collision with root package name */
    public int f36830v;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C.S(context, C5248R.attr.motionEasingEmphasizedInterpolator, AbstractC4770a.f39642b);
    }

    public final boolean a(int i, int i4, int i6) {
        boolean z6;
        if (i != getOrientation()) {
            setOrientation(i);
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f36828n.getPaddingTop() == i4 && this.f36828n.getPaddingBottom() == i6) {
            return z6;
        }
        TextView textView = this.f36828n;
        WeakHashMap weakHashMap = X.f2142a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i4, textView.getPaddingEnd(), i6);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i4, textView.getPaddingRight(), i6);
        return true;
    }

    public Button getActionView() {
        return this.f36829u;
    }

    public TextView getMessageView() {
        return this.f36828n;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36828n = (TextView) findViewById(C5248R.id.snackbar_text);
        this.f36829u = (Button) findViewById(C5248R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C5248R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C5248R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f36828n.getLayout();
        boolean z6 = layout != null && layout.getLineCount() > 1;
        if (!z6 || this.f36830v <= 0 || this.f36829u.getMeasuredWidth() <= this.f36830v) {
            if (!z6) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i4);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f36830v = i;
    }
}
