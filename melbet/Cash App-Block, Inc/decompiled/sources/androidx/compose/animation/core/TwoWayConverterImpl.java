package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class TwoWayConverterImpl {
    public final Function1 convertFromVector;
    public final Function1 convertToVector;

    public TwoWayConverterImpl(Function1 function1, Function1 function12) {
        this.convertToVector = function1;
        this.convertFromVector = function12;
    }
}
