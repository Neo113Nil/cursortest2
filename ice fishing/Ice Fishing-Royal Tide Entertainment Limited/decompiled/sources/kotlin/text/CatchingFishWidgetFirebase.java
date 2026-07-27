package kotlin.text;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class CatchingFishWidgetFirebase extends CatchingFishWidgetLiveData {
    public final OnBackInvokedDispatcher CatchingFishCoroutine;
    public final OnBackInvokedCallback CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public boolean CatchingFishWorkManager;

    public CatchingFishWidgetFirebase(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.CatchingFishCoroutine = onBackInvokedDispatcher;
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = Build.VERSION.SDK_INT == 33 ? new CatchingFishKtorParcelable(1, this) : new CatchingFishGraphQLDagger(this);
    }

    @Override // kotlin.text.CatchingFishWidgetLiveData
    public final void CatchingFishSnackbar(boolean z) {
        if (z && !this.CatchingFishWorkManager) {
            this.CatchingFishCoroutine.registerOnBackInvokedCallback(this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket);
            this.CatchingFishWorkManager = true;
        } else {
            if (z || !this.CatchingFishWorkManager) {
                return;
            }
            this.CatchingFishCoroutine.unregisterOnBackInvokedCallback(this.CatchingFishDaggerWebsocket);
            this.CatchingFishWorkManager = false;
        }
    }
}
