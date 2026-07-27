package kotlin.text;

import android.text.Editable;

/* loaded from: classes.dex */
public final class CatchingFishRoomCameraX extends CatchingFishFluxToast {
    public final /* synthetic */ CatchingFishFragmentCameraX CatchingFishReduxKtor;

    public CatchingFishRoomCameraX(CatchingFishFragmentCameraX catchingFishFragmentCameraX) {
        this.CatchingFishReduxKtor = catchingFishFragmentCameraX;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.CatchingFishReduxKtor.CatchingFishSnackbar().CatchingFishParcelableFAB();
    }

    @Override // kotlin.text.CatchingFishFluxToast, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.CatchingFishReduxKtor.CatchingFishSnackbar().CatchingFishSnackbar();
    }
}
