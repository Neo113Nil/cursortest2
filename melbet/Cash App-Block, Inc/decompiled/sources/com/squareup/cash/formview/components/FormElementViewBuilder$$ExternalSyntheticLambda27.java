package com.squareup.cash.formview.components;

import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$$ExternalSyntheticLambda27 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ImmutableList f$0;
    public final /* synthetic */ AbstractPersistentList f$1;

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda27(ImmutableList immutableList, AbstractPersistentList abstractPersistentList, int i) {
        this.$r8$classId = i;
        this.f$0 = immutableList;
        this.f$1 = abstractPersistentList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ImmutableList immutableList = this.f$0;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1744553036, new FormElementViewBuilder$$ExternalSyntheticLambda27(immutableList, this.f$1, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    LazyListLayoutInfoKt.Timeline(LazyGridDslKt.rememberTimelineState(immutableList, gapComposer2, 0), this.f$1, null, gapComposer2, 0, 4);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
