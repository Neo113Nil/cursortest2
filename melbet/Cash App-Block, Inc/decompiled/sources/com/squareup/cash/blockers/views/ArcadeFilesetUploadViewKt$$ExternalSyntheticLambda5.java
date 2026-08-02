package com.squareup.cash.blockers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.size.DimensionKt;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ArcadeFilesetUploadViewKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FilesetUploadViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ArcadeFilesetUploadViewKt$$ExternalSyntheticLambda5(FilesetUploadViewModel filesetUploadViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = filesetUploadViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    FilesetUploadViewModel filesetUploadViewModel = this.f$0;
                    boolean z = filesetUploadViewModel.submittingState != FilesetUploadViewModel.SubmittingState.IDLE;
                    boolean changedInstance = gapComposer.changedInstance(filesetUploadViewModel);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BadgeQueries$$ExternalSyntheticLambda5(filesetUploadViewModel, 27);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Strings.LoadableFullScreenContent(filesetUploadViewModel, z, null, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(-73744498, new SetPinViewKt$$ExternalSyntheticLambda4(16, function1), gapComposer), gapComposer, 196608, 20);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1992659559, new BorrowHomeKt$$ExternalSyntheticLambda0(13, this.f$0, function1), gapComposer2), gapComposer2, 24576, 15);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
