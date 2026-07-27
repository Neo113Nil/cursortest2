package kotlin.text;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class CatchingFishJUnitViewModel extends InputConnectionWrapper {
    public final EditText CatchingFishParcelableFAB;
    public final CatchingFishMoshiFluxMoshi CatchingFishSnackbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishJUnitViewModel(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi = new CatchingFishMoshiFluxMoshi(18);
        this.CatchingFishParcelableFAB = editText;
        this.CatchingFishSnackbar = catchingFishMoshiFluxMoshi;
        if (CatchingFishMVPOkHttpMVP.CatchingFishCloudMessaging != null) {
            CatchingFishMVPOkHttpMVP CatchingFishParcelableFAB = CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB();
            if (CatchingFishParcelableFAB.CatchingFishSnackbar() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            CatchingFishMVIDatabinding catchingFishMVIDatabinding = CatchingFishParcelableFAB.CatchingFishDaggerWebsocket;
            catchingFishMVIDatabinding.getClass();
            Bundle bundle = editorInfo.extras;
            CatchingFishBundleRoom catchingFishBundleRoom = (CatchingFishBundleRoom) catchingFishMVIDatabinding.CatchingFishCoroutine.CatchingFishReduxKtor;
            int CatchingFishParcelableFAB2 = catchingFishBundleRoom.CatchingFishParcelableFAB(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", CatchingFishParcelableFAB2 != 0 ? ((ByteBuffer) catchingFishBundleRoom.CatchingFishViewModelScope).getInt(CatchingFishParcelableFAB2 + catchingFishBundleRoom.CatchingFishReduxKtor) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.CatchingFishParcelableFAB.getEditableText();
        this.CatchingFishSnackbar.getClass();
        return CatchingFishMoshiFluxMoshi.CatchingFishEspressoTesting(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.CatchingFishParcelableFAB.getEditableText();
        this.CatchingFishSnackbar.getClass();
        return CatchingFishMoshiFluxMoshi.CatchingFishEspressoTesting(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
