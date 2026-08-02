package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.navigation.Navigation;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.ui.ArcadeBottomSheetStyle;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class FilesetUploadOptionsSheet extends ComposeUiView implements OutsideTapCloses, BottomSheetConfig {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ArcadeBottomSheetStyle bottomSheetStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesetUploadOptionsSheet(Context context) {
        super(context);
        context.getClass();
        this.bottomSheetStyle = Navigation.ArcadeBottomSheetStyle(this);
    }

    public final void Content(Unit unit, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2078613239);
        int i2 = (gapComposer.changedInstance(function1) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            SsnViewKt.FilesetUploadOptionsSheet(function1, gapComposer, (i2 >> 3) & 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(this, unit, function1, i, 17);
        }
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetStyle getBottomSheetStyle() {
        return this.bottomSheetStyle;
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((Unit) obj, function1, gapComposer, 0);
    }
}
