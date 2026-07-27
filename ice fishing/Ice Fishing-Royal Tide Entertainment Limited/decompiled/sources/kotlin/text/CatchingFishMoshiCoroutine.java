package kotlin.text;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishMoshiCoroutine extends CatchingFishDaggerFlux {
    public final int CatchingFishDaggerWebsocket;
    public final CatchingFishWebSocketRedux CatchingFishViewModelScope;
    public EditText CatchingFishWorkManager;

    public CatchingFishMoshiCoroutine(CatchingFishFragmentCameraX catchingFishFragmentCameraX, int i) {
        super(catchingFishFragmentCameraX);
        this.CatchingFishDaggerWebsocket = R.drawable.design_password_eye;
        this.CatchingFishViewModelScope = new CatchingFishWebSocketRedux(3, this);
        if (i != 0) {
            this.CatchingFishDaggerWebsocket = i;
        }
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFish() {
        EditText editText = this.CatchingFishWorkManager;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final boolean CatchingFishCloudMessaging() {
        return true;
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final int CatchingFishCoroutine() {
        return R.string.password_toggle_content_description;
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final boolean CatchingFishEspressoTesting() {
        EditText editText = this.CatchingFishWorkManager;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFishNavigation() {
        EditText editText = this.CatchingFishWorkManager;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.CatchingFishWorkManager.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFishOkHttp(EditText editText) {
        this.CatchingFishWorkManager = editText;
        CatchingFishRoomDatabase();
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final int CatchingFishReduxKtor() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFishSnackbar() {
        CatchingFishRoomDatabase();
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final View.OnClickListener CatchingFishWorkManager() {
        return this.CatchingFishViewModelScope;
    }
}
