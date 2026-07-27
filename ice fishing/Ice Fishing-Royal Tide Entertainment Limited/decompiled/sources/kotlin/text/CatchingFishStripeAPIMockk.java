package kotlin.text;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class CatchingFishStripeAPIMockk {
    public final /* synthetic */ CatchingFishFragmentCameraX CatchingFishParcelableFAB;

    public CatchingFishStripeAPIMockk(CatchingFishFragmentCameraX catchingFishFragmentCameraX) {
        this.CatchingFishParcelableFAB = catchingFishFragmentCameraX;
    }

    public final void CatchingFishParcelableFAB(TextInputLayout textInputLayout) {
        CatchingFishFragmentCameraX catchingFishFragmentCameraX = this.CatchingFishParcelableFAB;
        CatchingFishRoomCameraX catchingFishRoomCameraX = catchingFishFragmentCameraX.CatchingFishGsonAppCompat;
        if (catchingFishFragmentCameraX.CatchingFishDaggerHiltFAB == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = catchingFishFragmentCameraX.CatchingFishDaggerHiltFAB;
        if (editText != null) {
            editText.removeTextChangedListener(catchingFishRoomCameraX);
            if (catchingFishFragmentCameraX.CatchingFishDaggerHiltFAB.getOnFocusChangeListener() == catchingFishFragmentCameraX.CatchingFishSnackbar().CatchingFishDaggerWebsocket()) {
                catchingFishFragmentCameraX.CatchingFishDaggerHiltFAB.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        catchingFishFragmentCameraX.CatchingFishDaggerHiltFAB = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(catchingFishRoomCameraX);
        }
        catchingFishFragmentCameraX.CatchingFishSnackbar().CatchingFishOkHttp(catchingFishFragmentCameraX.CatchingFishDaggerHiltFAB);
        catchingFishFragmentCameraX.CatchingFishFragmentHandler(catchingFishFragmentCameraX.CatchingFishSnackbar());
    }
}
