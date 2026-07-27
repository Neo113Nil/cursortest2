package com.google.android.material.snackbar;

import K3.b;
import O.X;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.icefishing.icefishingliveapp.C5284R;
import j3.AbstractC4596a;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public TextView f36225n;

    /* renamed from: u, reason: collision with root package name */
    public Button f36226u;

    /* renamed from: v, reason: collision with root package name */
    public int f36227v;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b.z(context, C5284R.attr.motionEasingEmphasizedInterpolator, AbstractC4596a.f38542b);
    }

    public final boolean a(int i, int i4, int i9) {
        boolean z8;
        if (i != getOrientation()) {
            setOrientation(i);
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f36225n.getPaddingTop() == i4 && this.f36225n.getPaddingBottom() == i9) {
            return z8;
        }
        TextView textView = this.f36225n;
        WeakHashMap weakHashMap = X.f2240a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i4, textView.getPaddingEnd(), i9);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i4, textView.getPaddingRight(), i9);
        return true;
    }

    public Button getActionView() {
        return this.f36226u;
    }

    public TextView getMessageView() {
        return this.f36225n;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36225n = (TextView) findViewById(C5284R.id.snackbar_text);
        this.f36226u = (Button) findViewById(C5284R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C5284R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C5284R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f36225n.getLayout();
        boolean z8 = layout != null && layout.getLineCount() > 1;
        if (!z8 || this.f36227v <= 0 || this.f36226u.getMeasuredWidth() <= this.f36227v) {
            if (!z8) {
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
        this.f36227v = i;
    }
}
