package com.squareup.cash.sheet;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ComposeBottomSheetKt$SheetV2$1$1$sheet$1 extends AbstractComposeView implements BottomSheetConfig {
    public final /* synthetic */ BottomSheetStyle $bottomSheetStyle;
    public final /* synthetic */ ComposableLambdaImpl $content;
    public final /* synthetic */ MutableState $isLockedState;
    public final /* synthetic */ MutableState $isSnappingState;
    public final /* synthetic */ MutableState $modelState;
    public Object currentModel;
    public final int initialHeight;
    public final BottomSheetConfig.HeightMode maxHeightMode;
    public final Object viewKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeBottomSheetKt$SheetV2$1$1$sheet$1(int i, BottomSheetConfig.HeightMode heightMode, Object obj, Context context, BottomSheetStyle bottomSheetStyle, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, ComposableLambdaImpl composableLambdaImpl) {
        super(context, null, 6, 0);
        this.$bottomSheetStyle = bottomSheetStyle;
        this.$isSnappingState = mutableState;
        this.$isLockedState = mutableState2;
        this.$modelState = mutableState3;
        this.$content = composableLambdaImpl;
        this.initialHeight = i;
        this.maxHeightMode = heightMode;
        this.viewKey = obj;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-44767084);
        Pair pair = (Pair) this.$modelState.getValue();
        Object obj = pair.first;
        Object obj2 = pair.second;
        if (Intrinsics.areEqual(this.viewKey, obj)) {
            this.currentModel = obj2;
        }
        Object obj3 = this.currentModel;
        if (obj3 != null) {
            gapComposer.startReplaceGroup(2079116934);
            this.$content.invoke(obj3, (Object) gapComposer, (Object) 0);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(2079155374);
            gapComposer.end(false);
        }
        gapComposer.end(false);
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetStyle getBottomSheetStyle() {
        return this.$bottomSheetStyle;
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final int getInitialHeight() {
        return this.initialHeight;
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetConfig.HeightMode getMaxHeightMode() {
        return this.maxHeightMode;
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final boolean getWrapChildInNestedScrollingContainer() {
        return false;
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final boolean isLocked() {
        return ((Boolean) this.$isLockedState.getValue()).booleanValue();
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final boolean isSnapping() {
        return ((Boolean) this.$isSnappingState.getValue()).booleanValue();
    }
}
