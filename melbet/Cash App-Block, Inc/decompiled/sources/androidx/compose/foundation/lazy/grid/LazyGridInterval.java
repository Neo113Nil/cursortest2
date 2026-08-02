package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class LazyGridInterval implements LazyLayoutIntervalContent$Interval {
    public final ComposableLambdaImpl item;
    public final Function1 key;
    public final Function2 span;

    /* renamed from: type, reason: collision with root package name */
    public final Function1 f851type;

    public LazyGridInterval(Function1 function1, Function2 function2, Function1 function12, ComposableLambdaImpl composableLambdaImpl) {
        this.key = function1;
        this.span = function2;
        this.f851type = function12;
        this.item = composableLambdaImpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval
    public final Function1 getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval
    public final Function1 getType() {
        return this.f851type;
    }
}
