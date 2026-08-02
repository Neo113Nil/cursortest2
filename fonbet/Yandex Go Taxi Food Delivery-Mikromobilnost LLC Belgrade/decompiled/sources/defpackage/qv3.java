package defpackage;

import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class qv3 implements a3z {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeeplinkHandleResult$DeeplinkType b;
    public final /* synthetic */ tls c;

    public /* synthetic */ qv3(DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType, tls tlsVar, int i) {
        this.a = i;
        this.b = deeplinkHandleResult$DeeplinkType;
        this.c = tlsVar;
    }

    @Override // defpackage.a3z
    public final y0h a(Deeplink deeplink) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = this.b;
        EmptyList emptyList = EmptyList.a;
        tls tlsVar = this.c;
        switch (i) {
            case 0:
                if (deeplink.getAction() instanceof DeeplinkAction.AutotopupResolveConflict) {
                    tlsVar.invoke(((DeeplinkAction.AutotopupResolveConflict) deeplink.getAction()).getAgreementId());
                    break;
                }
                break;
            default:
                if (deeplink.getAction() instanceof DeeplinkAction.RemoveItem) {
                    tlsVar.invoke(((DeeplinkAction.RemoveItem) deeplink.getAction()).getId());
                    break;
                }
                break;
        }
        return new v0h(emptyList, deeplinkHandleResult$DeeplinkType, 2);
    }
}
