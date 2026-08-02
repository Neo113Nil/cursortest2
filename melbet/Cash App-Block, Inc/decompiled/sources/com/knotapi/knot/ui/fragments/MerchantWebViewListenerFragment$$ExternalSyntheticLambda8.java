package com.knotapi.knot.ui.fragments;

import com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment;
import com.knotapi.knot.utilities.LoaderView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public final /* synthetic */ class MerchantWebViewListenerFragment$$ExternalSyntheticLambda8 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MerchantWebViewListenerFragment$$ExternalSyntheticLambda8(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                MerchantWebViewListenerFragment.lambda$setLoaderVisibility$11((LoaderView) obj2, (KnotViewClient) obj);
                break;
            default:
                ((MerchantWebViewListenerFragment.AnonymousClass1) obj2).lambda$onAvailable$0((Boolean[]) obj);
                break;
        }
    }
}
