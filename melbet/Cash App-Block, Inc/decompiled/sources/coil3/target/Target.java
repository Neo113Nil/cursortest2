package coil3.target;

import coil3.Image;

/* loaded from: classes3.dex */
public interface Target {
    default void onError(Image image) {
    }

    default void onStart(Image image) {
    }

    default void onSuccess(Image image) {
    }
}
