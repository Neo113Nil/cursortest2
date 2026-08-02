package com.squareup.cash.arcade.components;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final class LazyScaffoldContentScope implements LazyListScope, ScreenScaffoldContentScope {
    public final /* synthetic */ LazyListScope $$delegate_0;

    public LazyScaffoldContentScope(LazyListScope lazyListScope) {
        lazyListScope.getClass();
        this.$$delegate_0 = lazyListScope;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final void item(Object obj, Object obj2, Function3 function3) {
        function3.getClass();
        this.$$delegate_0.item(obj, obj2, function3);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final void items(int i, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl) {
        this.$$delegate_0.items(i, function1, function12, composableLambdaImpl);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final void stickyHeader(Object obj, Object obj2, ComposableLambdaImpl composableLambdaImpl) {
        this.$$delegate_0.stickyHeader(obj, obj2, composableLambdaImpl);
    }
}
