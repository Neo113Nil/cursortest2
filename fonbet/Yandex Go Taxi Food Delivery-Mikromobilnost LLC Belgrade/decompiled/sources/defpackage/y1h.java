package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.dashboard.api.DashboardScreenParams;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Params;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class y1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ wig b;

    public /* synthetic */ y1h(wig wigVar, int i) {
        this.a = i;
        this.b = wigVar;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        wig wigVar = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.DashboardExternalAction)) {
                    return x0hVar;
                }
                String memberId = ((DeeplinkAction.DashboardExternalAction) baseDeeplinkAction).getMemberId();
                ((vcp0) wigVar.c).getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("DashboardV3Fragment", false, new DashboardV3Params.External(memberId), TransitionPolicyType.DEFAULT, qoi0.a(DashboardV3Fragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null)), null, 6);
            default:
                return baseDeeplinkAction instanceof DeeplinkAction.NativeCreditAccount ? new v0h(Collections.singletonList(wigVar.b(new DashboardScreenParams(ProductId.CREDIT_ACCOUNT, null, null, 6, null))), null, 6) : x0hVar;
        }
    }
}
