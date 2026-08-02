package com.squareup.cash.moneybot.views.chat;

import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotLoadedContentKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ LazyListState f$0;
    public final /* synthetic */ MoneybotChatViewModel.Content f$1;

    public /* synthetic */ MoneybotLoadedContentKt$$ExternalSyntheticLambda2(LazyListState lazyListState, MoneybotChatViewModel.Content content) {
        this.f$0 = lazyListState;
        this.f$1 = content;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        int i = this.$r8$classId;
        boolean z = false;
        LazyListState lazyListState = this.f$0;
        MoneybotChatViewModel.Content content = this.f$1;
        switch (i) {
            case 0:
                LazyListMeasureResult layoutInfo = lazyListState.getLayoutInfo();
                List list = layoutInfo.visibleItemsInfo;
                int i2 = layoutInfo.viewportEndOffset;
                MoneybotChatViewModel.Content.Chat chat = (MoneybotChatViewModel.Content.Chat) content;
                int size = chat.messages.size() - 1;
                if (size >= 0 && !list.isEmpty()) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            if (((LazyListMeasuredItem) obj).index == size) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) obj;
                    if (lazyListMeasuredItem != null && lazyListMeasuredItem.offset + lazyListMeasuredItem.size <= i2) {
                        List<LazyListMeasuredItem> list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (LazyListMeasuredItem lazyListMeasuredItem2 : list2) {
                                MessageViewModel messageViewModel = (MessageViewModel) CollectionsKt.getOrNull(lazyListMeasuredItem2.index, chat.messages);
                                if (!(messageViewModel instanceof MessageViewModel.MoneybotMessageViewModel) || ((MessageViewModel.MoneybotMessageViewModel) messageViewModel).isFinal || lazyListMeasuredItem2.offset + lazyListMeasuredItem2.size <= i2) {
                                }
                            }
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (((MoneybotChatViewModel.Content.Chat) content).processingIndicator != null) {
                    List list3 = lazyListState.getLayoutInfo().visibleItemsInfo;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it = list3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((LazyListMeasuredItem) it.next()).key.equals("thinking_indicator")) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ MoneybotLoadedContentKt$$ExternalSyntheticLambda2(MoneybotChatViewModel.Content content, LazyListState lazyListState) {
        this.f$1 = content;
        this.f$0 = lazyListState;
    }
}
