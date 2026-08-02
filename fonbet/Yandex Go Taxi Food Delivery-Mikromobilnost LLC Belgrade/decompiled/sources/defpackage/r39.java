package defpackage;

import androidx.fragment.app.Fragment;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.cashback.impl.screens.dashboard.CashbackDashboardFragment;
import com.ybsdk.feature.cashback.impl.screens.dashboard.CashbackDashboardScreenParams;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r39 implements kcs {
    public final /* synthetic */ tc9 a;

    public r39(ucp0 ucp0Var, Map map) {
        this.a = new tc9(map, 10);
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }

    public final FragmentScreen b(String str) {
        return new FragmentScreen("CashbackDashboardFragment", false, new CashbackDashboardScreenParams(str), null, qoi0.a(CashbackDashboardFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null);
    }
}
