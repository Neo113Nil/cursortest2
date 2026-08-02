package defpackage;

import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class w5m0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavingsAccountFragment b;

    public /* synthetic */ w5m0(SavingsAccountFragment savingsAccountFragment, int i) {
        this.a = i;
        this.b = savingsAccountFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewBinding$lambda$10$lambda$5;
        zy11 viewBinding$lambda$10$lambda$6;
        qa3 adapter_delegate$lambda$0;
        int i = this.a;
        SavingsAccountFragment savingsAccountFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$10$lambda$5 = SavingsAccountFragment.getViewBinding$lambda$10$lambda$5(savingsAccountFragment);
                return viewBinding$lambda$10$lambda$5;
            case 1:
                viewBinding$lambda$10$lambda$6 = SavingsAccountFragment.getViewBinding$lambda$10$lambda$6(savingsAccountFragment);
                return viewBinding$lambda$10$lambda$6;
            default:
                adapter_delegate$lambda$0 = SavingsAccountFragment.adapter_delegate$lambda$0(savingsAccountFragment);
                return adapter_delegate$lambda$0;
        }
    }
}
