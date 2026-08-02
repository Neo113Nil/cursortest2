package defpackage;

import com.ybsdk.api.YBSdkScenarioResultReceiver$CreditResult;
import com.ybsdk.api.YBSdkScenarioResultReceiver$CreditResultV2;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.navigation.ScenarioResultReceiver$AccountUpgradeResult;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class w1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ nvd b;

    public /* synthetic */ w1h(nvd nvdVar, int i) {
        this.a = i;
        this.b = nvdVar;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        YBSdkScenarioResultReceiver$CreditResult yBSdkScenarioResultReceiver$CreditResult;
        int i = this.a;
        nvd nvdVar = this.b;
        x0h x0hVar = x0h.a;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CreditResult)) {
                    return x0hVar;
                }
                DeeplinkAction.CreditResult creditResult = (DeeplinkAction.CreditResult) baseDeeplinkAction;
                YBSdkScenarioResultReceiver$CreditResultV2 result = creditResult.getResult();
                if (result instanceof YBSdkScenarioResultReceiver$CreditResultV2.Success) {
                    yBSdkScenarioResultReceiver$CreditResult = YBSdkScenarioResultReceiver$CreditResult.SUCCESS;
                } else {
                    if (!(result instanceof YBSdkScenarioResultReceiver$CreditResultV2.Fail)) {
                        w511.b();
                        return null;
                    }
                    yBSdkScenarioResultReceiver$CreditResult = YBSdkScenarioResultReceiver$CreditResult.FAIL;
                }
                nvdVar.c(yBSdkScenarioResultReceiver$CreditResult);
                nvdVar.d(creditResult.getResult());
                return new v0h(EmptyList.a, null, 6);
            default:
                if (baseDeeplinkAction instanceof DeeplinkAction.Upgrade) {
                    nvdVar.f(ScenarioResultReceiver$AccountUpgradeResult.SUCCESS);
                }
                return x0hVar;
        }
    }
}
