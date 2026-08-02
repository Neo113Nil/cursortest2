package com.squareup.cash.arcade.components;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final class FilterBarScope implements LazyListScope {
    public final /* synthetic */ LazyListScope $$delegate_0;

    public FilterBarScope(LazyListScope lazyListScope) {
        lazyListScope.getClass();
        this.$$delegate_0 = lazyListScope;
    }

    public static void chip$default(FilterBarScope filterBarScope, Function0 function0, boolean z, Object obj, ComposableLambdaImpl composableLambdaImpl, int i) {
        FilterBarChipType filterBarChipType = FilterBarChipType.Button;
        Object obj2 = (i & 32) != 0 ? null : obj;
        filterBarScope.getClass();
        function0.getClass();
        LazyListScope.item$default(filterBarScope, null, null, new ComposableLambdaImpl(new SheetKt$$ExternalSyntheticLambda4(function0, Modifier.Companion.$$INSTANCE, z, filterBarChipType, obj2, composableLambdaImpl), true, 1793635016), 3);
    }

    public static void legacyChip$default(FilterBarScope filterBarScope, Function0 function0, Modifier modifier, boolean z, boolean z2, FilterBarChipType filterBarChipType, Object obj, ComposableLambdaImpl composableLambdaImpl, int i) {
        if ((i & 2) != 0) {
            modifier = Modifier.Companion.$$INSTANCE;
        }
        Modifier modifier2 = modifier;
        boolean z3 = (i & 4) != 0 ? true : z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            filterBarChipType = FilterBarChipType.Button;
        }
        filterBarScope.getClass();
        modifier2.getClass();
        LazyListScope.item$default(filterBarScope, null, null, new ComposableLambdaImpl(new ComposeDialogKt$$ExternalSyntheticLambda1(function0, modifier2, z3, z4, filterBarChipType, obj, composableLambdaImpl), true, 391478847), 3);
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
