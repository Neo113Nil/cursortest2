package com.squareup.cash.paychecks.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import com.squareup.cash.paychecks.viewmodels.common.ColorTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes6.dex */
public final /* synthetic */ class EditDistributionViewKt$$ExternalSyntheticLambda0 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Modifier f$1;

    public /* synthetic */ EditDistributionViewKt$$ExternalSyntheticLambda0(int i, Modifier modifier, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = modifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    @Override // kotlin.jvm.functions.Function4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long j;
        Color m;
        int i = this.$r8$classId;
        Modifier modifier = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                EditDistributionViewModel editDistributionViewModel = (EditDistributionViewModel) obj2;
                Composer composer = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                editDistributionViewModel.getClass();
                EditDistributionViewModel.Content content = (EditDistributionViewModel.Content) editDistributionViewModel;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                GapComposer gapComposer = (GapComposer) composer;
                Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                ColorTheme colorTheme = content.colorTheme;
                colors.getClass();
                int ordinal = colorTheme.ordinal();
                if (ordinal == 0) {
                    gapComposer.startReplaceGroup(1682074128);
                    Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.icon.brand;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1682071918, false);
                        }
                        gapComposer.startReplaceGroup(604799506);
                        gapComposer.end(false);
                        m = null;
                        if (m != null) {
                            colors = DimensionKt.m1468withTint4WTKRHQ(colors, m.value);
                        }
                        ArcadeThemeKt.ArcadeTheme(colors, null, null, Expect_jvmKt.rememberComposableLambda(-1610095692, new EditDistributionViewKt$$ExternalSyntheticLambda1(editDistributionViewModel, function1, modifier), composer), composer, 3072, 6);
                        return Unit.INSTANCE;
                    }
                    gapComposer.startReplaceGroup(1682076436);
                    Colors colors3 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors3.semantic.service.investing;
                }
                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, j);
                if (m != null) {
                }
                ArcadeThemeKt.ArcadeTheme(colors, null, null, Expect_jvmKt.rememberComposableLambda(-1610095692, new EditDistributionViewKt$$ExternalSyntheticLambda1(editDistributionViewModel, function1, modifier), composer), composer, 3072, 6);
                return Unit.INSTANCE;
            default:
                AtmPickerAmountBlockerViewModel.AtmPicker atmPicker = (AtmPickerAmountBlockerViewModel.AtmPicker) obj2;
                int intValue = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                atmPicker.getClass();
                AmountBlockerViewKt.AtmPicker(atmPicker, function1, modifier, (Composer) obj3, (intValue >> 3) & 14);
                return Unit.INSTANCE;
        }
    }
}
