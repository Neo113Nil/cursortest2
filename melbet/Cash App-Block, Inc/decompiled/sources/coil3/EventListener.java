package coil3;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.SuccessResult;

/* loaded from: classes.dex */
public abstract class EventListener implements ImageRequest.Listener {
    public static final EventListener$Companion$NONE$1 NONE = new EventListener$Companion$NONE$1();

    public interface Factory {
        public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 NONE = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(15);

        EventListener create();
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onSuccess(SuccessResult successResult) {
    }
}
