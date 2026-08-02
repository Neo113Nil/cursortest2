package com.squareup.cash.investing.components.exchange;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public abstract class InvestingExchangeKeypadAmountPickerKt {
    static {
        new Money((Long) 2500000L, CurrencyCode.USD, 4);
    }

    public static final void InvestingExchangeKeypadAmountPicker(InvestingExchangeViewModel.Content.FullScreenContent fullScreenContent, AmountDisplayState amountDisplayState, Shaker shaker, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        InvestingExchangeViewModel.Content.Subtitle subtitle;
        float f;
        float f2;
        boolean z;
        GapComposer gapComposer;
        fullScreenContent.getClass();
        shaker.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1526871915);
        Applier applier = gapComposer2.applier;
        int i3 = i | (gapComposer2.changed(fullScreenContent) ? 4 : 2) | (gapComposer2.changed(amountDisplayState) ? 32 : 16) | (gapComposer2.changedInstance(shaker) ? 256 : 128) | (gapComposer2.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer2.consume(LocalCashVibratorKt.LocalCashVibrator);
            Money money = fullScreenContent.maxAmount;
            InvestingExchangeViewModel.Content.Subtitle subtitle2 = fullScreenContent.subtitle;
            Long l = money.amount;
            l.getClass();
            long longValue = l.longValue();
            boolean changed = ((i3 & 112) == 32) | gapComposer2.changed(longValue) | gapComposer2.changed(realCashVibrator) | gapComposer2.changed(shaker);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                i2 = 3;
                subtitle = subtitle2;
                MaxCentsCappedKeypadListener maxCentsCappedKeypadListener = new MaxCentsCappedKeypadListener(new AmountDisplayKeypadListener(amountDisplayState), amountDisplayState, longValue, new PoolDescriptionKt$$ExternalSyntheticLambda4(realCashVibrator, shaker, 3));
                gapComposer2.updateRememberedValue(maxCentsCappedKeypadListener);
                rememberedValue = maxCentsCappedKeypadListener;
            } else {
                subtitle = subtitle2;
                i2 = 3;
            }
            MaxCentsCappedKeypadListener maxCentsCappedKeypadListener2 = (MaxCentsCappedKeypadListener) rememberedValue;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            InvestingExchangeViewModel.Content.Subtitle subtitle3 = subtitle;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            int i4 = i3 & 7168;
            boolean z2 = i4 == 2048;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new InvestingNewsKt$$ExternalSyntheticLambda0(19, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
            if (((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).getFontScale() < 1.5f) {
                gapComposer2.startReplaceGroup(-680596146);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-680556745);
                gapComposer2.end(false);
            }
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new NewsArticleAdapter$$ExternalSyntheticLambda1(17);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue3);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(semantics, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).titleBarPageTitle, (TextLineBalancing) null, fullScreenContent.title, (Map) null, (Function1) null, false);
            if (subtitle3 == null) {
                gapComposer2.startReplaceGroup(-1573417131);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1573417130);
                Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer2), companion, 4.0f, gapComposer2);
                InvestingExchangeSubtitleKt.m3583InvestingExchangeSubtitle5stqomU(subtitle3, subtitle3.icon == InvestingExchangeViewModel.Content.Icon.RECURRING ? 1 : i2, gapComposer2, 0, 0);
                gapComposer2.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            if (fullScreenContent.orderTypeButtonVisible) {
                gapComposer2.startReplaceGroup(-1573016827);
                boolean z3 = i4 == 2048;
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (z3 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new InvestingNewsKt$$ExternalSyntheticLambda0(20, function1);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                gapComposer = gapComposer2;
                z = true;
                f = 0.0f;
                f2 = 1.0f;
                coil3.size.SizeKt.ButtonDropdown((Function0) rememberedValue4, null, false, null, ComposableSingletons$InvestingExchangeSubtitleKt.lambda$1945716024, gapComposer, 24576, 14);
                gapComposer.end(false);
            } else {
                f = 0.0f;
                f2 = 1.0f;
                z = true;
                gapComposer = gapComposer2;
                gapComposer.startReplaceGroup(-1572805407);
                gapComposer.end(false);
            }
            gapComposer.end(z);
            if (f2 <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(f2 > Float.MAX_VALUE ? Float.MAX_VALUE : f2, z));
            Modifier shakeWith = SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(companion, f2), shaker);
            Strings.getSizes(gapComposer).getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(shakeWith, 16.0f, f, 2);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new NewsArticleAdapter$$ExternalSyntheticLambda1(18);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            boolean z4 = z;
            GapComposer gapComposer3 = gapComposer;
            ConnectionPoolKt.m1177AmountDisplaykNX22eY(amountDisplayState, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, false, (Function1) rememberedValue5), Strings.getColors(gapComposer).semantic.text.prominent, Room.getSp(96), 0, 0, gapComposer3, ((i3 >> 3) & 14) | 3072, 48);
            if (f2 <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            SpacerKt.Spacer(gapComposer3, new LayoutWeightElement(f2 > Float.MAX_VALUE ? Float.MAX_VALUE : f2, z4));
            boolean changedInstance = gapComposer3.changedInstance(maxCentsCappedKeypadListener2);
            Object rememberedValue6 = gapComposer3.rememberedValue();
            if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new RealGooglePayer$$ExternalSyntheticLambda0(maxCentsCappedKeypadListener2, 19);
                gapComposer3.updateRememberedValue(rememberedValue6);
            }
            Function0 function0 = (Function0) rememberedValue6;
            boolean changedInstance2 = gapComposer3.changedInstance(maxCentsCappedKeypadListener2);
            Object rememberedValue7 = gapComposer3.rememberedValue();
            if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new GpsConfigQueries$$ExternalSyntheticLambda2(maxCentsCappedKeypadListener2, 29);
                gapComposer3.updateRememberedValue(rememberedValue7);
            }
            KeypadViewModel keypadViewModel = new KeypadViewModel(null, false, function0, (Function1) rememberedValue7, 3);
            long j = Strings.getColors(gapComposer3).semantic.text.standard;
            Strings.getSizes(gapComposer3).getClass();
            RelationUtil.m1189KeypadViewww6aTOc(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, f, 2), keypadViewModel, null, j, gapComposer3, 0, 4);
            gapComposer2 = gapComposer3;
            gapComposer2.end(z4);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(fullScreenContent, amountDisplayState, shaker, function1, modifier, i);
        }
    }
}
