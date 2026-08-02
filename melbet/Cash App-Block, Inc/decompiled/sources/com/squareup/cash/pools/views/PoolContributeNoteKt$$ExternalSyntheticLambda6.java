package com.squareup.cash.pools.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolContributeNoteKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ImmutableList f$0;

    public /* synthetic */ PoolContributeNoteKt$$ExternalSyntheticLambda6(ImmutableList immutableList, int i) {
        this.$r8$classId = i;
        this.f$0 = immutableList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        ImmutableList immutableList = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    PoolToastKt.m3717PoolAvatarnxwB2Kw(PoolToastKt.toAvatarEntries(immutableList, gapComposer), PoolAvatarSize.Size32, ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer).semantic.background.subtle, RoundedCornerShapeKt.CircleShape), Strings.getColors(gapComposer).semantic.background.f1047app, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0L, Strings.getColors(gapComposer).semantic.background.subtle, null, gapComposer, 48, 752);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    PoolToastKt.m3717PoolAvatarnxwB2Kw(PoolToastKt.toAvatarEntries(immutableList, gapComposer2), PoolAvatarSize.Size32, ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer2).semantic.background.subtle, RoundedCornerShapeKt.CircleShape), Strings.getColors(gapComposer2).semantic.background.f1047app, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0L, Strings.getColors(gapComposer2).semantic.background.subtle, null, gapComposer2, 48, 752);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
