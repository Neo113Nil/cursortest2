package kotlin.text;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class CatchingFishToastContext implements PopupWindow.OnDismissListener {
    public final /* synthetic */ CatchingFishToastParcelable CatchingFishReduxKtor;

    public CatchingFishToastContext(CatchingFishToastParcelable catchingFishToastParcelable) {
        this.CatchingFishReduxKtor = catchingFishToastParcelable;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.CatchingFishReduxKtor.CatchingFishCoroutine();
    }
}
