package com.knotapi.knot.ui.fragments;

import com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment;

/* loaded from: classes4.dex */
public final /* synthetic */ class MerchantWebViewListenerFragment$4$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MerchantWebViewListenerFragment.AnonymousClass4 f$0;

    public /* synthetic */ MerchantWebViewListenerFragment$4$$ExternalSyntheticLambda0(MerchantWebViewListenerFragment.AnonymousClass4 anonymousClass4, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MerchantWebViewListenerFragment.AnonymousClass4 anonymousClass4 = this.f$0;
        switch (i) {
            case 0:
                anonymousClass4.lambda$onTryAgain$0();
                break;
            default:
                anonymousClass4.lambda$onErrorViewContinue$1();
                break;
        }
    }
}
