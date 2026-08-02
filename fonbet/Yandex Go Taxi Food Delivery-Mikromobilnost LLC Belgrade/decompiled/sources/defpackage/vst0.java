package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositAutoTopup;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositAutoTopupSaveRetry;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositProcessing;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.SplitDepositAutoTopupStatusFragment;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.SplitDepositAutoTopupStatusScreenParams;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.a;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class vst0 implements a3z {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeeplinkHandleResult$DeeplinkType b;
    public final /* synthetic */ a c;

    public /* synthetic */ vst0(DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType, a aVar, int i) {
        this.a = i;
        this.b = deeplinkHandleResult$DeeplinkType;
        this.c = aVar;
    }

    @Override // defpackage.a3z
    public final y0h a(Deeplink deeplink) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = this.b;
        EmptyList emptyList = EmptyList.a;
        a aVar = this.c;
        switch (i) {
            case 0:
                if (deeplink.getAction() instanceof SplitDepositAutoTopupSaveRetry) {
                    tfl0 tfl0Var = aVar.C;
                    FragmentScreen a = aVar.K.a();
                    sut0 sut0Var = aVar.D;
                    SplitDepositAutoTopupStatusScreenParams splitDepositAutoTopupStatusScreenParams = aVar.B;
                    sut0Var.getClass();
                    tfl0Var.c(a, new FragmentScreen("SplitDepositAutoTopupStatusScreen", false, splitDepositAutoTopupStatusScreenParams, TransitionPolicyType.POPUP, qoi0.a(SplitDepositAutoTopupStatusFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null));
                    break;
                }
                break;
            case 1:
                if (deeplink.getAction() instanceof SplitDepositAutoTopup) {
                    aVar.Z(new g24((SplitDepositAutoTopup) deeplink.getAction()));
                    break;
                }
                break;
            default:
                if (deeplink.getAction() instanceof SplitDepositProcessing) {
                    aVar.C.c(aVar.K.a(), aVar.J.b(((SplitDepositProcessing) deeplink.getAction()).getTransactionParameters()));
                    break;
                }
                break;
        }
        return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
    }
}
