package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import com.android.vending.billing.IInAppBillingService;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.1.1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzam extends zzar implements zzan {
    public static zzan zzu(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IInAppBillingService.DESCRIPTOR);
        return iInterfaceQueryLocalInterface instanceof zzan ? (zzan) iInterfaceQueryLocalInterface : new zzal(iBinder);
    }
}
