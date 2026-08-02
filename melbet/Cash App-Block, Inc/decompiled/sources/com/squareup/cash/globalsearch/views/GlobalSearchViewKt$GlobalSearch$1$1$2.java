package com.squareup.cash.globalsearch.views;

import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class GlobalSearchViewKt$GlobalSearch$1$1$2 implements FlowCollector {
    public final /* synthetic */ SearchBarKeyboardState $keyboardState;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ GlobalSearchViewKt$GlobalSearch$1$1$2(SearchBarKeyboardState searchBarKeyboardState, int i) {
        this.$r8$classId = i;
        this.$keyboardState = searchBarKeyboardState;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                if (((Number) obj).intValue() > 20) {
                    this.$keyboardState.setOpen(false);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    this.$keyboardState.setOpen(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
