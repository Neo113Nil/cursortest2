package com.google.android.material.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.stripe.android.stripe3ds2.views.InformationZoneView;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;

/* loaded from: classes4.dex */
public final /* synthetic */ class ViewUtils$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ View f$0;

    public /* synthetic */ ViewUtils$$ExternalSyntheticLambda0(View view, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        int i2 = 0;
        View view = this.f$0;
        switch (i) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
            case 1:
                view.requestFocus();
                break;
            case 2:
                int i3 = BottomAppBar.$r8$clinit;
                view.requestLayout();
                break;
            case 3:
                view.requestFocus();
                view.post(new ViewUtils$$ExternalSyntheticLambda0(view, i2));
                break;
            case 4:
                int i4 = InformationZoneView.$r8$clinit;
                Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
                view.getHitRect(rect);
                view.requestRectangleOnScreen(rect, false);
                break;
            case 5:
                view.setVisibility(4);
                break;
            case 6:
                int i5 = OldSelfieOverlayView.$r8$clinit;
                view.setVisibility(4);
                break;
            default:
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(view, 1);
                    break;
                }
                break;
        }
    }
}
