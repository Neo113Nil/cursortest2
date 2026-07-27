package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.catchingfish.fishcatcherpro.R;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishRobolectricRoom;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public Button CatchingFishDaggerWebsocket;
    public TextView CatchingFishReduxKtor;
    public int CatchingFishWorkManager;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CatchingFishHiltMVPToast.CatchingFishCustomView(context, R.attr.motionEasingEmphasizedInterpolator, CatchingFishRobolectricRoom.CatchingFishSnackbar);
    }

    public final boolean CatchingFishParcelableFAB(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.CatchingFishReduxKtor.getPaddingTop() == i2 && this.CatchingFishReduxKtor.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.CatchingFishReduxKtor;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.CatchingFishDaggerWebsocket;
    }

    public TextView getMessageView() {
        return this.CatchingFishReduxKtor;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.CatchingFishReduxKtor = (TextView) findViewById(R.id.snackbar_text);
        this.CatchingFishDaggerWebsocket = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.CatchingFishReduxKtor.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.CatchingFishWorkManager <= 0 || this.CatchingFishDaggerWebsocket.getMeasuredWidth() <= this.CatchingFishWorkManager) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!CatchingFishParcelableFAB(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!CatchingFishParcelableFAB(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.CatchingFishWorkManager = i;
    }
}
