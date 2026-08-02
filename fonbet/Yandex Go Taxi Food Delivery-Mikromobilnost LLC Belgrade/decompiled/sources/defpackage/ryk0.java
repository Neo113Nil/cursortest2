package defpackage;

import android.view.View;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class ryk0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RoundingFragment b;

    public /* synthetic */ ryk0(RoundingFragment roundingFragment, int i) {
        this.a = i;
        this.b = roundingFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        RoundingFragment roundingFragment = this.b;
        switch (i) {
            case 0:
                RoundingFragment.showSourceBottomSheet$lambda$28$lambda$27(roundingFragment, view);
                break;
            case 1:
                RoundingFragment.getViewBinding$lambda$9$lambda$3(roundingFragment, view);
                break;
            default:
                RoundingFragment.getViewBinding$lambda$9$lambda$5(roundingFragment, view);
                break;
        }
    }
}
