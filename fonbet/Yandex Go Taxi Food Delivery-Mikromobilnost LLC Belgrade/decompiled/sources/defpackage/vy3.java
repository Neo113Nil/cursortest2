package defpackage;

import android.view.View;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class vy3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AutoTopupResultFragment b;

    public /* synthetic */ vy3(AutoTopupResultFragment autoTopupResultFragment, int i) {
        this.a = i;
        this.b = autoTopupResultFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        AutoTopupResultFragment autoTopupResultFragment = this.b;
        switch (i) {
            case 0:
                AutoTopupResultFragment.onViewCreated$lambda$0(autoTopupResultFragment, view);
                break;
            case 1:
                AutoTopupResultFragment.onViewCreated$lambda$1(autoTopupResultFragment, view);
                break;
            default:
                AutoTopupResultFragment.renderBottomSheet$lambda$7$lambda$5(autoTopupResultFragment, view);
                break;
        }
    }
}
