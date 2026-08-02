package com.squareup.cash.sheet;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final class RealSheetState$CreateDragAnchorsEffect$lambda$0$0$$inlined$onDispose$1 implements DisposableEffectResult {
    public final /* synthetic */ Snapshot$Companion$$ExternalSyntheticLambda0 $handle$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RealSheetState$CreateDragAnchorsEffect$lambda$0$0$$inlined$onDispose$1(Snapshot$Companion$$ExternalSyntheticLambda0 snapshot$Companion$$ExternalSyntheticLambda0, int i) {
        this.$r8$classId = i;
        this.$handle$inlined = snapshot$Companion$$ExternalSyntheticLambda0;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        int i = this.$r8$classId;
        Snapshot$Companion$$ExternalSyntheticLambda0 snapshot$Companion$$ExternalSyntheticLambda0 = this.$handle$inlined;
        switch (i) {
            case 0:
                snapshot$Companion$$ExternalSyntheticLambda0.dispose();
                break;
            default:
                snapshot$Companion$$ExternalSyntheticLambda0.dispose();
                break;
        }
    }
}
