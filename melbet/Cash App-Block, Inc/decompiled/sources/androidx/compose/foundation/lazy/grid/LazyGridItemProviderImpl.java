package androidx.compose.foundation.lazy.grid;

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
public final class LazyGridItemProviderImpl implements LazyLayoutItemProvider {
    public final LazyGridIntervalContent intervalContent;
    public final HuffmanTreeGroup keyIndexMap;
    public final LazyGridState state;

    public LazyGridItemProviderImpl(LazyGridState lazyGridState, LazyGridIntervalContent lazyGridIntervalContent, HuffmanTreeGroup huffmanTreeGroup) {
        this.state = lazyGridState;
        this.intervalContent = lazyGridIntervalContent;
        this.keyIndexMap = huffmanTreeGroup;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void Item(int i, int i2, Composer composer, Object obj) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1493551140);
        int i3 = 2;
        int i4 = (gapComposer.changed(i) ? 4 : 2) | i2 | (gapComposer.changedInstance(obj) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            LazyLayoutKt.LazyLayoutPinnableItem(obj, i, this.state.pinnedItems, Expect_jvmKt.rememberComposableLambda(726189336, new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(this, i, i3), gapComposer), gapComposer, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(this, i, obj, i2, 2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyGridItemProviderImpl)) {
            return false;
        }
        return Intrinsics.areEqual(this.intervalContent, ((LazyGridItemProviderImpl) obj).intervalContent);
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
