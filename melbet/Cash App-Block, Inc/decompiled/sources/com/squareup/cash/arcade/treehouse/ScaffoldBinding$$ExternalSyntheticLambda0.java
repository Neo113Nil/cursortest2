package com.squareup.cash.arcade.treehouse;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

/* loaded from: classes5.dex */
public final /* synthetic */ class ScaffoldBinding$$ExternalSyntheticLambda0 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LinearLayout f$0;

    public /* synthetic */ ScaffoldBinding$$ExternalSyntheticLambda0(LinearLayout linearLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = linearLayout;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = this.$r8$classId;
        LinearLayout linearLayout = this.f$0;
        switch (i) {
            case 0:
                int i2 = ScaffoldBinding.$r8$clinit;
                ((ScaffoldBinding) linearLayout).updateFooterElevation$1();
                break;
            default:
                int i3 = LegacyScaffoldBinding.$r8$clinit;
                ((LegacyScaffoldBinding) linearLayout).updateFooterElevation();
                break;
        }
    }
}
