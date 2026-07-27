package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.ExecutionException;
import kotlin.text.CatchingFishBundleGlide;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishFragmentJUnit;
import kotlin.text.CatchingFishViewMVIMVVM;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int CatchingFishParcelableFAB(Context context, CatchingFishFragmentJUnit catchingFishFragmentJUnit) {
        try {
            return ((Integer) CatchingFishViewMVIMVVM.CatchingFishSnackbar(new CatchingFishBundleGlide(context, 1).CatchingFishCustomView(catchingFishFragmentJUnit.CatchingFishReduxKtor))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void CatchingFishSnackbar(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (CatchingFishDaggerBiometric.CatchingFishGradleManifest(putExtras)) {
            CatchingFishDaggerBiometric.CatchingFishCardViewView("_nd", putExtras.getExtras());
        }
    }
}
