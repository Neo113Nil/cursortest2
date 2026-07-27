package kotlin.text;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class CatchingFishGsonFirebase implements PopupWindow.OnDismissListener {
    public final /* synthetic */ CatchingFishMVIFAB CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishMVPStateFlow CatchingFishReduxKtor;

    public CatchingFishGsonFirebase(CatchingFishMVIFAB catchingFishMVIFAB, CatchingFishMVPStateFlow catchingFishMVPStateFlow) {
        this.CatchingFishDaggerWebsocket = catchingFishMVIFAB;
        this.CatchingFishReduxKtor = catchingFishMVPStateFlow;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.CatchingFishDaggerWebsocket.CatchingFishEspressoMockk.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.CatchingFishReduxKtor);
        }
    }
}
