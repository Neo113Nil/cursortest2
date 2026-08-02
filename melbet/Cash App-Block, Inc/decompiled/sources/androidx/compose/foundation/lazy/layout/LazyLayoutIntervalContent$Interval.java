package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public interface LazyLayoutIntervalContent$Interval {
    Function1 getKey();

    default Function1 getType() {
        return LazyLayoutIntervalContent$Interval$type$1.INSTANCE;
    }
}
