package defpackage;

import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.deeplink.api.actions.EnableSbpToAddAccountForTopup;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class rv3 implements a3z {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeeplinkHandleResult$DeeplinkType b;
    public final /* synthetic */ sls c;

    public /* synthetic */ rv3(DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType, sls slsVar, int i) {
        this.a = i;
        this.b = deeplinkHandleResult$DeeplinkType;
        this.c = slsVar;
    }

    @Override // defpackage.a3z
    public final y0h a(Deeplink deeplink) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = this.b;
        EmptyList emptyList = EmptyList.a;
        sls slsVar = this.c;
        switch (i) {
            case 0:
                if (deeplink.getAction() instanceof EnableSbpToAddAccountForTopup) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 1:
                if (deeplink.getAction() instanceof DeeplinkAction.SavingsAutotopupNotice) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 2:
                if (deeplink.getAction() instanceof DeeplinkAction.ReloadScreen) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 3:
                if (deeplink.getAction() instanceof DeeplinkAction.ReloadScreen) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 4:
                if (deeplink.getAction() instanceof DeeplinkAction.SavingsThemeSelector) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 5:
                if (deeplink.getAction() instanceof DeeplinkAction.SavingsUnlock) {
                    slsVar.invoke();
                    break;
                }
                break;
            default:
                if (deeplink.getAction() instanceof DeeplinkAction.TransferDropPreConfirmAction) {
                    slsVar.invoke();
                    break;
                }
                break;
        }
        return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
    }
}
