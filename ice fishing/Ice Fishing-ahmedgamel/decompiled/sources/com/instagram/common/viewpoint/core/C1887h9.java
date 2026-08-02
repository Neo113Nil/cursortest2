package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.h9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1887h9 extends Pv {
    public int A00;

    public C1887h9(Context context) {
        super(context);
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    @Override // com.instagram.common.viewpoint.core.Pv, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        int h3 = this.A00;
        for (int i6 = 0; i6 < height; i6++) {
            View childAt = getChildAt(i6);
            int height = View.MeasureSpec.makeMeasureSpec(0, 0);
            childAt.measure(i, height);
            int height2 = childAt.getMeasuredHeight();
            if (height2 > h3) {
                h3 = height2;
            }
        }
        int height3 = View.MeasureSpec.makeMeasureSpec(h3, 1073741824);
        super.onMeasure(i, height3);
    }
}
