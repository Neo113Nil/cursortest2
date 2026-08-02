package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class LazyListInterval implements LazyLayoutIntervalContent$Interval {
    public final ComposableLambdaImpl item;
    public final Function1 key;

    /* renamed from: type, reason: collision with root package name */
    public final Function1 f850type;

    public LazyListInterval(Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl) {
        this.key = function1;
        this.f850type = function12;
        this.item = composableLambdaImpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval
    public final Function1 getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval
    public final Function1 getType() {
        return this.f850type;
    }
}
