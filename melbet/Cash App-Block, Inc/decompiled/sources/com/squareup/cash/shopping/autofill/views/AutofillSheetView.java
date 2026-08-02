package com.squareup.cash.shopping.autofill.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.navigation.Navigation;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.MooncakeBottomSheetStyle;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes7.dex */
public final class AutofillSheetView extends ComposeUiView implements BottomSheetConfig {
    public final boolean useArcade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutofillSheetView(Context context, boolean z) {
        super(context);
        context.getClass();
        this.useArcade = z;
    }

    public final void Content(AutofillViewModel autofillViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1632025834);
        int i2 = (gapComposer.changedInstance(autofillViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (autofillViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            AutofillSheetViewKt.AutofillSheet(this.useArcade, autofillViewModel, function1, gapComposer, (i2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(this, autofillViewModel, function1, i, 10);
        }
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetStyle getBottomSheetStyle() {
        return this.useArcade ? Navigation.ArcadeBottomSheetStyle(this) : new MooncakeBottomSheetStyle(ThemeHelpersKt.themeInfo(this));
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((AutofillViewModel) obj, function1, gapComposer, 0);
    }
}
