package com.knotapi.knot.ui.fragments;

import android.view.View;
import com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment;

/* loaded from: classes4.dex */
public final /* synthetic */ class MerchantWebViewListenerFragment$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MerchantWebViewListenerFragment$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((MerchantWebViewListenerFragment) obj).lambda$onCreateView$3();
                break;
            case 1:
                ((MerchantWebViewListenerFragment.AnonymousClass1) obj).lambda$onLost$1();
                break;
            default:
                MerchantWebViewListenerFragment.lambda$onStart$10((View) obj);
                break;
        }
    }
}
