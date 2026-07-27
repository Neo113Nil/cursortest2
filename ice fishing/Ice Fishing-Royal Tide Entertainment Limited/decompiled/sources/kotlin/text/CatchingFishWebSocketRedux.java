package kotlin.text;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishWebSocketRedux implements View.OnClickListener {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishWebSocketRedux(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishServiceCardView catchingFishServiceCardView = (CatchingFishServiceCardView) this.CatchingFishDaggerWebsocket;
                EditText editText = catchingFishServiceCardView.CatchingFishLayout;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                catchingFishServiceCardView.CatchingFishRoomDatabase();
                return;
            case 1:
                ((CatchingFishJUnitBundle) this.CatchingFishDaggerWebsocket).CatchingFishCoroutineFlow();
                return;
            case 2:
                ((CatchingFishLiveDataContext) this.CatchingFishDaggerWebsocket).CatchingFishJobScheduler();
                throw null;
            default:
                CatchingFishMoshiCoroutine catchingFishMoshiCoroutine = (CatchingFishMoshiCoroutine) this.CatchingFishDaggerWebsocket;
                EditText editText2 = catchingFishMoshiCoroutine.CatchingFishWorkManager;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = catchingFishMoshiCoroutine.CatchingFishWorkManager;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    catchingFishMoshiCoroutine.CatchingFishWorkManager.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    catchingFishMoshiCoroutine.CatchingFishWorkManager.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    catchingFishMoshiCoroutine.CatchingFishWorkManager.setSelection(selectionEnd);
                }
                catchingFishMoshiCoroutine.CatchingFishRoomDatabase();
                return;
        }
    }
}
