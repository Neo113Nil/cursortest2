package defpackage;

import androidx.fragment.app.Fragment;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.dashboard.api.DashboardScreenParams;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Params;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3ScreenParams;
import com.ybsdk.feature.settings.api.SettingsOpeningSource;
import com.ybsdk.feature.settings.internal.domain.card.a;
import com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsFragment;
import com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsScreenParams;
import com.ybsdk.feature.settings.internal.view.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wig implements kcs {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ tc9 b;
    public final Object c;
    public final Object d;

    public wig(a aVar, b bVar, odr0 odr0Var, Map map) {
        this.b = new tc9(map, 10);
        this.c = aVar;
        this.d = bVar;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        int i = this.a;
        tc9 tc9Var = this.b;
        switch (i) {
        }
        return tc9Var.a(str);
    }

    public FragmentScreen b(DashboardScreenParams dashboardScreenParams) {
        ((vcp0) this.c).getClass();
        return new FragmentScreen("DashboardScreen", false, dashboardScreenParams, null, qoi0.a(DashboardFragment.class), dashboardScreenParams.getProductId() == ProductId.SPLIT ? OpenScreenRequirement.WithUid.INSTANCE : OpenScreenRequirement.WithBuid.INSTANCE, 10, null);
    }

    public FragmentScreen c(String str, List list, boolean z) {
        vcp0 vcp0Var = (vcp0) this.c;
        List<vig> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (vig vigVar : list2) {
            arrayList.add(new DashboardV3ScreenParams(vigVar.a, vigVar.b));
        }
        vcp0Var.getClass();
        DashboardV3Params.Products products = new DashboardV3Params.Products(arrayList, str);
        int hashCode = str.hashCode();
        return new FragmentScreen("DashboardV3Fragment", false, products, z ? TransitionPolicyType.POPUP : TransitionPolicyType.DEFAULT, qoi0.a(DashboardV3Fragment.class), (hashCode == -1272463739 ? str.equals("corp_card") : hashCode == 108173 ? str.equals("mkk") : hashCode == 109648666 && str.equals("split")) ? OpenScreenRequirement.WithUid.INSTANCE : OpenScreenRequirement.WithBuid.INSTANCE, 2, null);
    }

    public FragmentScreen d(SettingsOpeningSource settingsOpeningSource) {
        return new FragmentScreen("SettingsScreen", false, new SettingsScreenParams(settingsOpeningSource), null, qoi0.a(SettingsFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null);
    }

    public wig(vcp0 vcp0Var, Map map, Map map2) {
        this.b = new tc9(map2, 10);
        this.c = vcp0Var;
        this.d = map;
    }
}
