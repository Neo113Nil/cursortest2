package com.squareup.cash.clipboard;

import android.content.ClipData;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.scannerview.SizeMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;

/* loaded from: classes6.dex */
public final class RealClipboardObserver {
    public final Flow activityEvents;
    public final RealClipboardManager clipboard;
    public final CoroutineContext computationDispatcher;

    public RealClipboardObserver(RealClipboardManager realClipboardManager, Flow flow, CoroutineContext coroutineContext) {
        this.clipboard = realClipboardManager;
        this.activityEvents = flow;
        this.computationDispatcher = coroutineContext;
    }

    public final List currentClipboardItems() {
        ClipData primaryClip = this.clipboard.clipboard.getPrimaryClip();
        SizeMap sizeMap = primaryClip != null ? new SizeMap(primaryClip, 16) : null;
        ArrayList arrayList = new ArrayList();
        if (sizeMap != null) {
            ClipData clipData = (ClipData) sizeMap.mRatios;
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                CharSequence text = clipData.getItemAt(i).getText();
                String obj = text != null ? text.toString() : null;
                if (obj != null && !StringsKt.isBlank(obj)) {
                    arrayList.add(new ClipboardItem(obj.toString()));
                }
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    public final Flow observeClipboard() {
        Continuation continuation = null;
        return FlowKt.distinctUntilChanged(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealClipboardObserver$observeClipboard$3(this, continuation, 0), FlowKt.transformLatest(new CardModelView$iconTexture$$inlined$map$1(this.activityEvents, 26), new AnchoredDraggableNode$drag$2(continuation, this, 10))));
    }
}
