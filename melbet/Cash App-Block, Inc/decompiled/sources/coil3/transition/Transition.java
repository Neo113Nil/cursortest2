package coil3.transition;

import coil3.request.ImageResult;
import coil3.transition.NoneTransition;

/* loaded from: classes3.dex */
public interface Transition {

    /* loaded from: classes.dex */
    public interface Factory {
        public static final NoneTransition.Factory NONE = new NoneTransition.Factory();

        Transition create(TransitionTarget transitionTarget, ImageResult imageResult);
    }

    void transition();
}
