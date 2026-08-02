package coil3.request;

import coil3.RealImageLoader$execute$3;
import kotlin.Unit;

/* loaded from: classes3.dex */
public interface RequestDelegate {
    default void assertActive() {
    }

    default Object awaitStarted(RealImageLoader$execute$3 realImageLoader$execute$3) {
        return Unit.INSTANCE;
    }

    default void complete() {
    }

    default void start() {
    }
}
