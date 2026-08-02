package defpackage;

import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2CrossBorderApi;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2MkkCashoutApi;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2TipsApi;

/* loaded from: classes3.dex */
public final class vu01 implements v7p {
    public final /* synthetic */ int a;
    public final qbg b;

    public /* synthetic */ vu01(qbg qbgVar, int i) {
        this.a = i;
        this.b = qbgVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        qbg qbgVar = this.b;
        switch (i) {
            case 0:
                return (Transfer2CrossBorderApi) ((t0k0) qbgVar.get()).b(Transfer2CrossBorderApi.class);
            case 1:
                return (Transfer2MkkCashoutApi) ((t0k0) qbgVar.get()).b(Transfer2MkkCashoutApi.class);
            case 2:
                return (Transfer2Api) ((t0k0) qbgVar.get()).b(Transfer2Api.class);
            default:
                return (Transfer2TipsApi) ((t0k0) qbgVar.get()).b(Transfer2TipsApi.class);
        }
    }
}
