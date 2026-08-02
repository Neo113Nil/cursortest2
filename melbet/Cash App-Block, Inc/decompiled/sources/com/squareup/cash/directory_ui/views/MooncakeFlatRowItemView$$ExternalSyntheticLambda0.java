package com.squareup.cash.directory_ui.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import com.google.android.gms.common.api.internal.zabr;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MooncakeFlatRowItemView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DirectoryListItem.ItemViewModel f$0;

    public /* synthetic */ MooncakeFlatRowItemView$$ExternalSyntheticLambda0(DirectoryListItem.ItemViewModel itemViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = itemViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        DirectoryListItem.ItemViewModel itemViewModel = this.f$0;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(506712686, new MooncakeFlatRowItemView$$ExternalSyntheticLambda0(itemViewModel, i2), gapComposer), gapComposer, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    itemViewModel.getClass();
                    zabr.BoostAddedDecoration(null, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
