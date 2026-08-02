package defpackage;

import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class v5m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavingsAccountFragment b;

    public /* synthetic */ v5m0(SavingsAccountFragment savingsAccountFragment, int i) {
        this.a = i;
        this.b = savingsAccountFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SavingsAccountFragment savingsAccountFragment = this.b;
        switch (i) {
            case 0:
                SavingsAccountFragment.consumeSideEffect$lambda$16(savingsAccountFragment);
                break;
            default:
                SavingsAccountFragment.showThemeSelector$lambda$24(savingsAccountFragment);
                break;
        }
    }
}
