package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;

/* loaded from: classes3.dex */
public final /* synthetic */ class qtw implements zbv {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemedImageUrlEntity b;

    public /* synthetic */ qtw(ThemedImageUrlEntity themedImageUrlEntity, int i) {
        this.a = i;
        this.b = themedImageUrlEntity;
    }

    @Override // defpackage.zbv
    public final rbv g(Context context, int i, int i2) {
        int i3 = this.a;
        ThemedImageUrlEntity themedImageUrlEntity = this.b;
        switch (i3) {
            case 0:
                rbv f = job1.f(themedImageUrlEntity, new mtw(3));
                return f == null ? new nbv(myg0.ybsdk_ic_internet_provider_placeholder, null) : f;
            case 1:
                rbv f2 = job1.f(themedImageUrlEntity, new xpy(1));
                return f2 == null ? new nbv(txg0.ybsdk_ic_yb_placeholder, null) : f2;
            case 2:
                rbv f3 = job1.f(themedImageUrlEntity, new xpy(2));
                return f3 == null ? new nbv(txg0.ybsdk_ic_yb_placeholder, null) : f3;
            case 3:
                rbv f4 = job1.f(themedImageUrlEntity, new ps20(8));
                return f4 == null ? new nbv(myg0.ybsdk_ic_mobile_provider_placeholder, null) : f4;
            default:
                rbv f5 = job1.f(themedImageUrlEntity, new ri01(0));
                return f5 == null ? new nbv(txg0.ybsdk_ic_yb_placeholder, null) : f5;
        }
    }
}
