package com.squareup.cash.moneybot.views.chat;

import androidx.compose.foundation.lazy.LazyListState;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$3 implements FlowCollector {
    public final /* synthetic */ LazyListState $lazyListState;
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$3(Function1 function1, LazyListState lazyListState, int i) {
        this.$r8$classId = i;
        this.$onEvent = function1;
        this.$lazyListState = lazyListState;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        LazyListState lazyListState = this.$lazyListState;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                function1.invoke(new MoneybotChatViewEvent.SaveScrollPosition(lazyListState.scrollPosition.index$delegate.getIntValue(), lazyListState.scrollPosition.scrollOffset$delegate.getIntValue()));
                break;
            default:
                function1.invoke(Boolean.valueOf(!lazyListState.getCanScrollForward()));
                break;
        }
        return Unit.INSTANCE;
    }
}
