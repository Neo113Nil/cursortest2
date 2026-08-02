package defpackage;

import android.os.IInterface;
import com.samsung.android.sdk.samsungpay.v2.PartnerRequest;
import com.samsung.android.sdk.samsungpay.v2.SamsungPayBase;

/* loaded from: classes11.dex */
public final /* synthetic */ class zyl0 implements PartnerRequest.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ SamsungPayBase b;

    public /* synthetic */ zyl0(SamsungPayBase samsungPayBase, int i) {
        this.a = i;
        this.b = samsungPayBase;
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.PartnerRequest.c
    public final void a(IInterface iInterface, PartnerRequest partnerRequest) {
        int i = this.a;
        SamsungPayBase samsungPayBase = this.b;
        switch (i) {
            case 0:
                samsungPayBase.w(iInterface, partnerRequest);
                break;
            case 1:
                samsungPayBase.v(iInterface, partnerRequest);
                break;
            case 2:
                samsungPayBase.z(iInterface, partnerRequest);
                break;
            default:
                samsungPayBase.q(iInterface, partnerRequest);
                break;
        }
    }
}
