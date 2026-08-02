package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.Color;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.investing.components.ArcadeMigrationUtilsKt$investingCryptoExchangeView$1;
import com.squareup.cash.investing.viewmodels.TransferStockViewModel;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewEvent;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class ArcadeMigrationUtilsKt$investingCryptoExchangeView$1 extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ColorModel accentColor;
    public final ActivityItemLayout$$ExternalSyntheticLambda4 eventMapper;
    public final boolean isBuy;
    public final boolean isCustomOrder;
    public final ActivityItemLayout$$ExternalSyntheticLambda4 modelMapper;
    public final boolean showKeypadOnStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeMigrationUtilsKt$investingCryptoExchangeView$1(Context context, ColorModel colorModel, boolean z, boolean z2, boolean z3, ActivityItemLayout$$ExternalSyntheticLambda4 activityItemLayout$$ExternalSyntheticLambda4, ActivityItemLayout$$ExternalSyntheticLambda4 activityItemLayout$$ExternalSyntheticLambda42) {
        super(context);
        context.getClass();
        colorModel.getClass();
        this.accentColor = colorModel;
        this.isBuy = z;
        this.isCustomOrder = z2;
        this.showKeypadOnStart = z3;
        this.modelMapper = activityItemLayout$$ExternalSyntheticLambda4;
        this.eventMapper = activityItemLayout$$ExternalSyntheticLambda42;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
    }

    public static String amountString(AmountSelection.HasAmount hasAmount) {
        return (hasAmount.getAmount() % 100 == 0 ? Long.valueOf(hasAmount.getAmount() / 100) : Float.valueOf(hasAmount.getAmount() / 100.0f)).toString();
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final void Content(Object obj, final Function1 function1, GapComposer gapComposer) {
        function1.getClass();
        gapComposer.startReplaceGroup(-1460221202);
        gapComposer.startReplaceGroup(1948445598);
        Object obj2 = Composer.Companion.Empty;
        final int i = 0;
        if (obj != null) {
            boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == obj2) {
                rememberedValue = new Function1() { // from class: com.squareup.cash.investing.components.exchange.InvestingExchangeView$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i2 = i;
                        ArcadeMigrationUtilsKt$investingCryptoExchangeView$1 arcadeMigrationUtilsKt$investingCryptoExchangeView$1 = this;
                        Function1 function12 = function1;
                        InvestingExchangeViewEvent investingExchangeViewEvent = (InvestingExchangeViewEvent) obj3;
                        switch (i2) {
                            case 0:
                                investingExchangeViewEvent.getClass();
                                function12.invoke(arcadeMigrationUtilsKt$investingCryptoExchangeView$1.eventMapper.invoke(investingExchangeViewEvent));
                                break;
                            default:
                                investingExchangeViewEvent.getClass();
                                function12.invoke(arcadeMigrationUtilsKt$investingCryptoExchangeView$1.eventMapper.invoke(investingExchangeViewEvent));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean changed2 = gapComposer.changed(obj);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj2) {
                rememberedValue2 = (InvestingExchangeViewModel) this.modelMapper.invoke(obj);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            InvestingExchangeViewModel investingExchangeViewModel = (InvestingExchangeViewModel) rememberedValue2;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Color forTheme = ThemablesKt.forTheme(this.accentColor, gapComposer);
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, forTheme != null ? forTheme.value : Color.Unspecified), null, null, Expect_jvmKt.rememberComposableLambda(1812742579, new QuickAccessBarKt$$ExternalSyntheticLambda1(27, this, investingExchangeViewModel, function12), gapComposer), gapComposer, 3072, 6);
        }
        gapComposer.end(false);
        boolean changed3 = gapComposer.changed(function1) | gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue3 == obj2) {
            final int i2 = 1;
            rememberedValue3 = new Function1() { // from class: com.squareup.cash.investing.components.exchange.InvestingExchangeView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    int i22 = i2;
                    ArcadeMigrationUtilsKt$investingCryptoExchangeView$1 arcadeMigrationUtilsKt$investingCryptoExchangeView$1 = this;
                    Function1 function122 = function1;
                    InvestingExchangeViewEvent investingExchangeViewEvent = (InvestingExchangeViewEvent) obj3;
                    switch (i22) {
                        case 0:
                            investingExchangeViewEvent.getClass();
                            function122.invoke(arcadeMigrationUtilsKt$investingCryptoExchangeView$1.eventMapper.invoke(investingExchangeViewEvent));
                            break;
                        default:
                            investingExchangeViewEvent.getClass();
                            function122.invoke(arcadeMigrationUtilsKt$investingCryptoExchangeView$1.eventMapper.invoke(investingExchangeViewEvent));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Function1 function13 = (Function1) rememberedValue3;
        if (obj instanceof TransferStockViewModel.Content.FullScreenContent) {
            gapComposer.startReplaceGroup(-2020743652);
            TransferStockViewModel.Content.FullScreenContent.DialogContent dialogContent = ((TransferStockViewModel.Content.FullScreenContent) obj).dialogContent;
            if (dialogContent != null) {
                gapComposer.startReplaceGroup(-2020650745);
                boolean changed4 = gapComposer.changed(function13);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed4 || rememberedValue4 == obj2) {
                    rememberedValue4 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(19, function13);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Function0 function0 = (Function0) rememberedValue4;
                boolean changed5 = gapComposer.changed(function13);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed5 || rememberedValue5 == obj2) {
                    rememberedValue5 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(20, function13);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                ArcadeModal2Kt.Modal(dialogContent, dialogContent, function0, (Function0) rememberedValue5, false, false, Expect_jvmKt.rememberComposableLambda(1597996888, new ArcadeMigrationUtilsKt$investingCryptoExchangeView$1$$ExternalSyntheticLambda3(dialogContent, function13), gapComposer), gapComposer, 1572864, 48);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2019254412);
                gapComposer.end(false);
            }
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-2019236556);
            gapComposer.end(false);
        }
        gapComposer.end(false);
    }
}
