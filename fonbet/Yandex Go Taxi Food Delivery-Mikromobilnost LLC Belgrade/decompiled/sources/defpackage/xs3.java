package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation.AutoPullsFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class xs3 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AutoPullsFragment b;

    public /* synthetic */ xs3(AutoPullsFragment autoPullsFragment, int i) {
        this.a = i;
        this.b = autoPullsFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewBinding$lambda$5$lambda$3;
        qa3 adapter_delegate$lambda$0;
        int i = this.a;
        AutoPullsFragment autoPullsFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$5$lambda$3 = AutoPullsFragment.getViewBinding$lambda$5$lambda$3(autoPullsFragment);
                return viewBinding$lambda$5$lambda$3;
            default:
                adapter_delegate$lambda$0 = AutoPullsFragment.adapter_delegate$lambda$0(autoPullsFragment);
                return adapter_delegate$lambda$0;
        }
    }
}
