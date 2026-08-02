package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import kotlin.jvm.internal.Intrinsics;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final class LazyListItemProviderImpl implements LazyLayoutItemProvider {
    public final LazyListIntervalContent intervalContent;
    public final LazyItemScopeImpl itemScope;
    public final HuffmanTreeGroup keyIndexMap;
    public final LazyListState state;

    public LazyListItemProviderImpl(LazyListState lazyListState, LazyListIntervalContent lazyListIntervalContent, LazyItemScopeImpl lazyItemScopeImpl, HuffmanTreeGroup huffmanTreeGroup) {
        this.state = lazyListState;
        this.intervalContent = lazyListIntervalContent;
        this.itemScope = lazyItemScopeImpl;
        this.keyIndexMap = huffmanTreeGroup;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void Item(int i, int i2, Composer composer, Object obj) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-462424778);
        int i3 = (gapComposer.changed(i) ? 4 : 2) | i2 | (gapComposer.changedInstance(obj) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            LazyLayoutKt.LazyLayoutPinnableItem(obj, i, this.state.pinnedItems, Expect_jvmKt.rememberComposableLambda(-824725566, new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(this, i, i4), gapComposer), gapComposer, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(this, i, obj, i2, 1);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyListItemProviderImpl)) {
            return false;
        }
        return Intrinsics.areEqual(this.intervalContent, ((LazyListItemProviderImpl) obj).intervalContent);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object getContentType(int i) {
        return this.intervalContent.getContentType(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getIndex(Object obj) {
        return this.keyIndexMap.getIndex(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.intervalContent.getIntervals().alphabetSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object getKey(int i) {
        Object key = this.keyIndexMap.getKey(i);
        return key == null ? this.intervalContent.getKey(i) : key;
    }

    public final int hashCode() {
        return this.intervalContent.hashCode();
    }
}
