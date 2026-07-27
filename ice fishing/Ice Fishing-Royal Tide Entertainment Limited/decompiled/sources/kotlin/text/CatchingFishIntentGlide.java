package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class CatchingFishIntentGlide extends CancellationException {
    public final /* synthetic */ int CatchingFishReduxKtor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishIntentGlide(String str, int i) {
        super(str);
        this.CatchingFishReduxKtor = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 1:
                setStackTrace(CatchingFishGsonCardView.CatchingFishAnimationMockk);
                break;
            default:
                setStackTrace(CatchingFishBiometricBundle.CatchingFishViewModelScope);
                break;
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishIntentGlide() {
        super("The coroutine scope left the composition");
        this.CatchingFishReduxKtor = 1;
    }
}
