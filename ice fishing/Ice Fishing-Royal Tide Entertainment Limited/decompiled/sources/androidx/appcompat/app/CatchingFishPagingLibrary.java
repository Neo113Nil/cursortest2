package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.text.CatchingFishMockkWidgetKtor;

/* loaded from: classes.dex */
public abstract class CatchingFishPagingLibrary {
    public BroadcastReceiver CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishMockkWidgetKtor CatchingFishSnackbar;

    public CatchingFishPagingLibrary(CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor) {
        this.CatchingFishSnackbar = catchingFishMockkWidgetKtor;
    }

    public abstract int CatchingFishCoroutine();

    public final void CatchingFishDaggerWebsocket() {
        CatchingFishParcelableFAB();
        IntentFilter CatchingFishSnackbar = CatchingFishSnackbar();
        if (CatchingFishSnackbar.countActions() == 0) {
            return;
        }
        if (this.CatchingFishParcelableFAB == null) {
            this.CatchingFishParcelableFAB = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager$1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    CatchingFishPagingLibrary.this.CatchingFishReduxKtor();
                }
            };
        }
        this.CatchingFishSnackbar.CatchingFishUnitTesting.registerReceiver(this.CatchingFishParcelableFAB, CatchingFishSnackbar);
    }

    public final void CatchingFishParcelableFAB() {
        BroadcastReceiver broadcastReceiver = this.CatchingFishParcelableFAB;
        if (broadcastReceiver != null) {
            try {
                this.CatchingFishSnackbar.CatchingFishUnitTesting.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.CatchingFishParcelableFAB = null;
        }
    }

    public abstract void CatchingFishReduxKtor();

    public abstract IntentFilter CatchingFishSnackbar();
}
