package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;

/* loaded from: classes3.dex */
public final /* synthetic */ class gy2 implements y7k {
    public final /* synthetic */ int b;

    public /* synthetic */ gy2(int i) {
        this.b = i;
    }

    private final void b(Exception exc) {
    }

    @Override // defpackage.y7k
    public final void a(Exception exc) {
        switch (this.b) {
            case 0:
                ssg.a(6, null, "failed to parse div data: " + exc, exc);
                return;
            case 1:
                Assertions.throwOrSkip("CommunicationTriggerNetworkMapper", new FailedAssertionException("failed to parse div data", exc));
                return;
            case 2:
                Assertions.throwOrSkip("CommunicationTriggerMapper", new FailedAssertionException("failed to parse div data", exc));
                return;
            case 3:
                String message = exc.getMessage();
                if (message == null) {
                    message = exc.toString();
                }
                gut.A(message).y();
                return;
            case 4:
                return;
            case 5:
                throw exc;
            default:
                Assertions.throwOrSkip("SplashScreenNetworkMapper", new FailedAssertionException("failed to parse div data", exc));
                return;
        }
    }
}
