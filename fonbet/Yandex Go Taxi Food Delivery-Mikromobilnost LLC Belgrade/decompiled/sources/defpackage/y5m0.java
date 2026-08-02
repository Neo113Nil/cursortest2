package defpackage;

import android.view.View;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsAccountThemeSelectorView;

/* loaded from: classes3.dex */
public final /* synthetic */ class y5m0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavingsAccountThemeSelectorView b;

    public /* synthetic */ y5m0(SavingsAccountThemeSelectorView savingsAccountThemeSelectorView, int i) {
        this.a = i;
        this.b = savingsAccountThemeSelectorView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View showThemeSelector$lambda$26;
        int themeItemHeight_delegate$lambda$1;
        int i = this.a;
        SavingsAccountThemeSelectorView savingsAccountThemeSelectorView = this.b;
        switch (i) {
            case 0:
                showThemeSelector$lambda$26 = SavingsAccountFragment.showThemeSelector$lambda$26(savingsAccountThemeSelectorView);
                return showThemeSelector$lambda$26;
            default:
                themeItemHeight_delegate$lambda$1 = SavingsAccountThemeSelectorView.themeItemHeight_delegate$lambda$1(savingsAccountThemeSelectorView);
                return Integer.valueOf(themeItemHeight_delegate$lambda$1);
        }
    }
}
