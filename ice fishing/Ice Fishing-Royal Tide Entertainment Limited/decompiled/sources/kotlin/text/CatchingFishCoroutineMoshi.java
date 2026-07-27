package kotlin.text;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class CatchingFishCoroutineMoshi implements TextWatcher {
    public final /* synthetic */ EditText CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor;
    public final /* synthetic */ TextInputLayout CatchingFishWorkManager;

    public CatchingFishCoroutineMoshi(TextInputLayout textInputLayout, EditText editText) {
        this.CatchingFishWorkManager = textInputLayout;
        this.CatchingFishDaggerWebsocket = editText;
        this.CatchingFishReduxKtor = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.CatchingFishWorkManager;
        textInputLayout.CatchingFishSpannableWidget(!textInputLayout.CatchingFishCameraX, false);
        if (textInputLayout.CatchingFishAnimationMockk) {
            textInputLayout.CatchingFishStateLiveData(editable);
        }
        if (textInputLayout.CatchingFishSpannableWidget) {
            textInputLayout.CatchingFishParcelableFlux(editable);
        }
        EditText editText = this.CatchingFishDaggerWebsocket;
        int lineCount = editText.getLineCount();
        int i = this.CatchingFishReduxKtor;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.CatchingFishKtorService;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.CatchingFishReduxKtor = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
