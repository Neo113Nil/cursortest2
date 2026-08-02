package androidx.compose.foundation.lazy;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public interface LazyListScope {
    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, function3);
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i, Function1 function1, ComposableLambdaImpl composableLambdaImpl, int i2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(i, function1, LazyListScope$items$1.INSTANCE, composableLambdaImpl);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, String str, ComposableLambdaImpl composableLambdaImpl, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        lazyListScope.stickyHeader(str, null, composableLambdaImpl);
    }

    void item(Object obj, Object obj2, Function3 function3);

    void items(int i, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl);

    void stickyHeader(Object obj, Object obj2, ComposableLambdaImpl composableLambdaImpl);
}
