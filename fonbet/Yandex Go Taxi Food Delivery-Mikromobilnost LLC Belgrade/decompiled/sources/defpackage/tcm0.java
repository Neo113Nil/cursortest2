package defpackage;

import androidx.fragment.app.Fragment;
import com.ybsdk.core.design.theme.ThemedParams;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountFragment;
import com.ybsdk.feature.savings.internal.screens.account.SavingsAccountScreenParams;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tcm0 implements kcs {
    public final /* synthetic */ tc9 a;
    public final adp0 b;

    public tcm0(adp0 adp0Var, Map map) {
        this.a = new tc9(map, 10);
        this.b = adp0Var;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }

    public final FragmentScreen b(String str, ThemedParams themedParams) {
        this.b.getClass();
        return new FragmentScreen("SavingsAccountScreen", false, new SavingsAccountScreenParams(str, themedParams), null, qoi0.a(SavingsAccountFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null);
    }
}
