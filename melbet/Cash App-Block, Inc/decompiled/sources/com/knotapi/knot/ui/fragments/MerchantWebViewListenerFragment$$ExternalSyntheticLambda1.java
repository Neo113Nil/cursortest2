package com.knotapi.knot.ui.fragments;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* loaded from: classes4.dex */
public final /* synthetic */ class MerchantWebViewListenerFragment$$ExternalSyntheticLambda1 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MerchantWebViewListenerFragment f$0;

    public /* synthetic */ MerchantWebViewListenerFragment$$ExternalSyntheticLambda1(MerchantWebViewListenerFragment merchantWebViewListenerFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = merchantWebViewListenerFragment;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        boolean lambda$onResume$9;
        boolean lambda$onCreateDialog$0;
        int i2 = this.$r8$classId;
        MerchantWebViewListenerFragment merchantWebViewListenerFragment = this.f$0;
        switch (i2) {
            case 0:
                lambda$onResume$9 = merchantWebViewListenerFragment.lambda$onResume$9(dialogInterface, i, keyEvent);
                return lambda$onResume$9;
            default:
                lambda$onCreateDialog$0 = merchantWebViewListenerFragment.lambda$onCreateDialog$0(dialogInterface, i, keyEvent);
                return lambda$onCreateDialog$0;
        }
    }
}
