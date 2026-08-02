package coil3.transition;

import android.graphics.drawable.Drawable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.decode.DataSource;
import coil3.request.ErrorResult;
import coil3.request.ImageResult;
import coil3.request.SuccessResult;
import coil3.transition.Transition;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class CrossfadeTransition implements Transition {
    public final int durationMillis;
    public final ImageResult result;
    public final TransitionTarget target;

    /* loaded from: classes.dex */
    public final class Factory implements Transition.Factory {
        public final int durationMillis;

        public Factory(int i) {
            this.durationMillis = i;
            if (i > 0) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("durationMillis must be > 0.");
            throw null;
        }

        @Override // coil3.transition.Transition.Factory
        public final Transition create(TransitionTarget transitionTarget, ImageResult imageResult) {
            if ((imageResult instanceof SuccessResult) && ((SuccessResult) imageResult).getDataSource() != DataSource.MEMORY_CACHE) {
                return new CrossfadeTransition(transitionTarget, imageResult, this.durationMillis);
            }
            return new NoneTransition(transitionTarget, imageResult);
        }
    }

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i) {
        this.target = transitionTarget;
        this.result = imageResult;
        this.durationMillis = i;
        if (i > 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("durationMillis must be > 0.");
        throw null;
    }

    @Override // coil3.transition.Transition
    public final void transition() {
        TransitionTarget transitionTarget = this.target;
        Drawable drawable = transitionTarget.getDrawable();
        ImageResult imageResult = this.result;
        Image image = imageResult.getImage();
        boolean z = imageResult instanceof SuccessResult;
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawable, image != null ? Image_androidKt.asDrawable(image, transitionTarget.getView().getResources()) : null, imageResult.getRequest().scale, this.durationMillis, (z && ((SuccessResult) imageResult).isPlaceholderCached) ? false : true);
        if (z) {
            transitionTarget.onSuccess(Image_androidKt.asImage(crossfadeDrawable));
        } else if (imageResult instanceof ErrorResult) {
            transitionTarget.onError(Image_androidKt.asImage(crossfadeDrawable));
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }
}
