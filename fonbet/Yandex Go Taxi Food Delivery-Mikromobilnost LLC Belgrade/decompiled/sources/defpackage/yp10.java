package defpackage;

import com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class yp10 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ MerchantOffersSearchFragment b;

    public /* synthetic */ yp10(MerchantOffersSearchFragment merchantOffersSearchFragment, int i) {
        this.a = i;
        this.b = merchantOffersSearchFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 lastItemScrollListener$lambda$0;
        e7n adapter_delegate$lambda$3;
        zy11 adapter_delegate$lambda$3$lambda$2;
        int i = this.a;
        MerchantOffersSearchFragment merchantOffersSearchFragment = this.b;
        switch (i) {
            case 0:
                lastItemScrollListener$lambda$0 = MerchantOffersSearchFragment.lastItemScrollListener$lambda$0(merchantOffersSearchFragment);
                return lastItemScrollListener$lambda$0;
            case 1:
                adapter_delegate$lambda$3 = MerchantOffersSearchFragment.adapter_delegate$lambda$3(merchantOffersSearchFragment);
                return adapter_delegate$lambda$3;
            default:
                adapter_delegate$lambda$3$lambda$2 = MerchantOffersSearchFragment.adapter_delegate$lambda$3$lambda$2(merchantOffersSearchFragment);
                return adapter_delegate$lambda$3$lambda$2;
        }
    }
}
