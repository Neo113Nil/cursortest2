package kotlin.text;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLGson implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, CatchingFishDaggerAdMob {
    public CatchingFishRoomStripeAPI CatchingFishDaggerWebsocket;
    public CatchingFishGradleLifecycle CatchingFishReduxKtor;
    public CatchingFishEspressoGraphQL CatchingFishWorkManager;

    @Override // kotlin.text.CatchingFishDaggerAdMob
    public final void CatchingFishSnackbar(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, boolean z) {
        CatchingFishRoomStripeAPI catchingFishRoomStripeAPI;
        if ((z || catchingFishSharedFlowAdMob == this.CatchingFishReduxKtor) && (catchingFishRoomStripeAPI = this.CatchingFishDaggerWebsocket) != null) {
            catchingFishRoomStripeAPI.dismiss();
        }
    }

    @Override // kotlin.text.CatchingFishDaggerAdMob
    public final boolean CatchingFishViewModelScope(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        CatchingFishGradleLifecycle catchingFishGradleLifecycle = this.CatchingFishReduxKtor;
        CatchingFishEspressoGraphQL catchingFishEspressoGraphQL = this.CatchingFishWorkManager;
        if (catchingFishEspressoGraphQL.CatchingFishLayout == null) {
            catchingFishEspressoGraphQL.CatchingFishLayout = new CatchingFishRoomIntent(catchingFishEspressoGraphQL);
        }
        catchingFishGradleLifecycle.CatchingFishRoomDatabase(catchingFishEspressoGraphQL.CatchingFishLayout.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.CatchingFishWorkManager.CatchingFishSnackbar(this.CatchingFishReduxKtor, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        CatchingFishGradleLifecycle catchingFishGradleLifecycle = this.CatchingFishReduxKtor;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.CatchingFishDaggerWebsocket.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.CatchingFishDaggerWebsocket.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                catchingFishGradleLifecycle.CatchingFishCoroutine(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return catchingFishGradleLifecycle.performShortcut(i, keyEvent, 0);
    }
}
