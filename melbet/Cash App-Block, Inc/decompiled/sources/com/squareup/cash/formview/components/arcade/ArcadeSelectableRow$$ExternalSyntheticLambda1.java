package com.squareup.cash.formview.components.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.formview.components.arcade.SelectableRowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeSelectableRow$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArcadeSelectableRow f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ ArcadeSelectableRow$$ExternalSyntheticLambda1(ArcadeSelectableRow arcadeSelectableRow, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = arcadeSelectableRow;
        this.f$1 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalImageLoaderKt.LocalImageLoader;
                    ArcadeSelectableRow arcadeSelectableRow = this.f$0;
                    Updater.CompositionLocalProvider(staticProvidableCompositionLocal.defaultProvidedValue$runtime(arcadeSelectableRow.imageLoader), Expect_jvmKt.rememberComposableLambda(2015176703, new ArcadeSelectableRow$$ExternalSyntheticLambda1(arcadeSelectableRow, this.f$1, i2), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeSelectableRow arcadeSelectableRow2 = this.f$0;
                    SelectableRowViewModel.LeadingIcon leadingIcon = arcadeSelectableRow2.model.leadingIcon;
                    boolean z = leadingIcon instanceof SelectableRowViewModel.LeadingIcon.Avatar;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Function0 function0 = this.f$1;
                    if (z) {
                        gapComposer2.startReplaceGroup(-923614575);
                        arcadeSelectableRow2.AvatarSelectableRow(arcadeSelectableRow2.model, SizeKt.fillMaxWidth(companion, 1.0f), function0, gapComposer2, 48);
                        gapComposer2.end(false);
                    } else if (leadingIcon instanceof SelectableRowViewModel.LeadingIcon.Small) {
                        gapComposer2.startReplaceGroup(-923408146);
                        arcadeSelectableRow2.SmallIconSelectableRow(arcadeSelectableRow2.model, SizeKt.fillMaxWidth(companion, 1.0f), function0, gapComposer2, 48);
                        gapComposer2.end(false);
                    } else {
                        if (leadingIcon != null) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -445437943, false);
                        }
                        gapComposer2.startReplaceGroup(-923214706);
                        arcadeSelectableRow2.SmallIconSelectableRow(arcadeSelectableRow2.model, SizeKt.fillMaxWidth(companion, 1.0f), function0, gapComposer2, 48);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
