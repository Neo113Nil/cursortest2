package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesFragment;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesScreenParams;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CashbackScreenConfig;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class t1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ j3h c;
    public final /* synthetic */ r39 d;

    public /* synthetic */ t1h(b bVar, j3h j3hVar, r39 r39Var, int i) {
        this.a = i;
        this.b = bVar;
        this.c = j3hVar;
        this.d = r39Var;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        r39 r39Var = this.d;
        List list = EmptyList.a;
        j3h j3hVar = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.OpenCashbackCategories)) {
                    return x0hVar;
                }
                DeeplinkAction.OpenCashbackCategories openCashbackCategories = (DeeplinkAction.OpenCashbackCategories) baseDeeplinkAction;
                dfr dfrVar = e49.a;
                if (((CashbackScreenConfig) bVar.d(dfrVar).getData()).isEnabled()) {
                    List c = ((l3h) j3hVar).c(((CashbackScreenConfig) bVar.d(dfrVar).getData()).getDeeplink());
                    if (c != null) {
                        list = c;
                    }
                } else {
                    list = scc.g(r39Var.b(openCashbackCategories.getAgreementId()), new FragmentScreen("CashbackCategoryFragment", false, new CashbackCategoriesScreenParams.UnknownPromo(openCashbackCategories.getAgreementId(), openCashbackCategories.getPromoId()), null, qoi0.a(CashbackCategoriesFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null));
                }
                return new v0h(list, null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.OpenCashback)) {
                    return x0hVar;
                }
                DeeplinkAction.OpenCashback openCashback = (DeeplinkAction.OpenCashback) baseDeeplinkAction;
                dfr dfrVar2 = e49.a;
                if (((CashbackScreenConfig) bVar.d(dfrVar2).getData()).isEnabled()) {
                    List c2 = ((l3h) j3hVar).c(((CashbackScreenConfig) bVar.d(dfrVar2).getData()).getDeeplink());
                    if (c2 != null) {
                        list = c2;
                    }
                } else {
                    list = Collections.singletonList(r39Var.b(openCashback.getAgreementId()));
                }
                return new v0h(list, null, 6);
        }
    }
}
