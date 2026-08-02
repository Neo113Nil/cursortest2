package defpackage;

import android.view.View;
import com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class yms implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FundCreationFragment b;

    public /* synthetic */ yms(FundCreationFragment fundCreationFragment, int i) {
        this.a = i;
        this.b = fundCreationFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        FundCreationFragment fundCreationFragment = this.b;
        switch (i) {
            case 0:
                FundCreationFragment.showSourceBottomSheet$lambda$11$lambda$10(fundCreationFragment, view);
                break;
            default:
                FundCreationFragment.getViewBinding$lambda$5$lambda$3(fundCreationFragment, view);
                break;
        }
    }
}
