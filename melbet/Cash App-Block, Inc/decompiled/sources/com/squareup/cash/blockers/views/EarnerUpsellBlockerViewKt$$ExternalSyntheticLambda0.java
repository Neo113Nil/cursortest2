package com.squareup.cash.blockers.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.EarnerUpsellBlockerViewModel;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.sheet.SheetTopCornerBehavior;
import com.squareup.cash.sheet.UserDismissMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ EarnerUpsellBlockerViewModel f$2;

    public /* synthetic */ EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda0(EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel, Function1 function1, boolean z, int i) {
        this.f$2 = earnerUpsellBlockerViewModel;
        this.f$1 = function1;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        boolean z = this.f$0;
        Function1 function1 = this.f$1;
        EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel = this.f$2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = 0;
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (z) {
                    gapComposer.startReplaceGroup(873308795);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(18, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SheetKt.Sheet((Function0) rememberedValue, null, SheetStateKt.rememberSheetState(UserDismissMode.OutsideTapOnly, gapComposer, 6, 0), null, null, false, SheetTopCornerBehavior.AlwaysRounded, Expect_jvmKt.rememberComposableLambda(1237007398, new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda3(i2, earnerUpsellBlockerViewModel, function1), gapComposer), gapComposer, 113246208, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(873888154);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(-1077990722, new BookletGridKt$$ExternalSyntheticLambda1(7, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-348082385, new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda5(earnerUpsellBlockerViewModel, function1, 0, (byte) 0), gapComposer), Expect_jvmKt.rememberComposableLambda(-684137560, new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda6(earnerUpsellBlockerViewModel, i2), gapComposer), gapComposer, 224256, 6);
                    gapComposer.end(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                EarnerUpsellBlockerViewKt.EarnerUpsellBlocker(earnerUpsellBlockerViewModel, function1, z, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda0(boolean z, Function1 function1, EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel) {
        this.f$0 = z;
        this.f$1 = function1;
        this.f$2 = earnerUpsellBlockerViewModel;
    }
}
