package com.knotapi.knot.ui.fragments;

import android.view.View;

/* loaded from: classes4.dex */
public final /* synthetic */ class MerchantWebViewListenerFragment$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MerchantWebViewListenerFragment f$0;

    public /* synthetic */ MerchantWebViewListenerFragment$$ExternalSyntheticLambda2(MerchantWebViewListenerFragment merchantWebViewListenerFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = merchantWebViewListenerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        MerchantWebViewListenerFragment merchantWebViewListenerFragment = this.f$0;
        switch (i) {
            case 0:
                merchantWebViewListenerFragment.lambda$onCreateView$4(view);
                break;
            default:
                merchantWebViewListenerFragment.lambda$new$1(view);
                break;
        }
    }
}
