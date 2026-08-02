package com.squareup.cash.pools.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class StartPoolAmountKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StartPoolAmount(CurrencyCode currencyCode, String str, boolean z, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, String str2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Function0 function03;
        Modifier modifier3;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        int i4;
        AmountDisplayState amountDisplayState;
        Modifier modifier4;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1;
        Object obj;
        ?? r4;
        AmountDisplayKeypadListener amountDisplayKeypadListener;
        ?? r5;
        GapComposer gapComposer2;
        boolean z2 = z;
        currencyCode.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(2113011435);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer3.changed(currencyCode.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer3.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer3.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer3.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer3.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer3.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer3.changed(modifier2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            if ((12582912 & i) == 0) {
                i3 |= gapComposer3.changed(str2) ? 8388608 : 4194304;
            }
            if (gapComposer3.shouldExecute(i3 & 1, (4793491 & i3) == 4793490)) {
                function03 = function0;
                gapComposer3.skipToGroupEnd();
                modifier3 = modifier2;
                gapComposer = gapComposer3;
            } else {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier modifier5 = i5 != 0 ? companion : modifier2;
                RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer3.consume(LocalCashVibratorKt.LocalCashVibrator);
                Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer3, 0);
                AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(currencyCode, null, false, 0, 14);
                boolean changedInstance = ((i3 & 7168) == 2048) | gapComposer3.changedInstance(realCashVibrator) | gapComposer3.changedInstance(rememberShaker);
                Object rememberedValue = gapComposer3.rememberedValue();
                int i6 = i3;
                Object obj2 = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == obj2) {
                    i4 = 0;
                    rememberedValue = new StartPoolAmountKt$$ExternalSyntheticLambda4(function1, realCashVibrator, rememberShaker, 0);
                    gapComposer3.updateRememberedValue(rememberedValue);
                } else {
                    i4 = 0;
                }
                AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, str, (Function1) rememberedValue, gapComposer3, i4);
                boolean changed = gapComposer3.changed(rememberAmountDisplayState);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (changed || rememberedValue2 == obj2) {
                    rememberedValue2 = new AmountDisplayKeypadListener(rememberAmountDisplayState);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                AmountDisplayKeypadListener amountDisplayKeypadListener2 = (AmountDisplayKeypadListener) rememberedValue2;
                long j = Strings.getColors(gapComposer3).component.sheet.background;
                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$12 = ColorKt.RectangleShape;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier5, j, rectangleShapeKt$RectangleShape$12);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
                ComposeUiNode.Companion.getClass();
                Function0 function04 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(function04);
                } else {
                    gapComposer3.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                Modifier modifier6 = modifier5;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion);
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(function04);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                DBUtil.TitleBarSub((String) null, NavigationType.CLOSE, (Modifier) null, (DynamicColorConfiguration) null, function02, (Modifier) null, (Function3) null, gapComposer3, ((i6 >> 3) & 57344) | 54, 108);
                GapComposer gapComposer4 = gapComposer3;
                if (str2 == null) {
                    gapComposer4.startReplaceGroup(-165813210);
                    gapComposer4.end(false);
                    amountDisplayState = rememberAmountDisplayState;
                    modifier4 = modifier6;
                    rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                    obj = obj2;
                    r4 = 0;
                    amountDisplayKeypadListener = amountDisplayKeypadListener2;
                    r5 = 1;
                    gapComposer2 = gapComposer4;
                } else {
                    gapComposer4.startReplaceGroup(-165813209);
                    Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center);
                    Strings.getSizes(gapComposer4).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(align, 64.0f, RecyclerView.DECELERATION_RATE, 2);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (rememberedValue3 == obj2) {
                        rememberedValue3 = new PoolsListViewKt$$ExternalSyntheticLambda6(6);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    amountDisplayState = rememberAmountDisplayState;
                    modifier4 = modifier6;
                    rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                    obj = obj2;
                    r4 = 0;
                    amountDisplayKeypadListener = amountDisplayKeypadListener2;
                    r5 = 1;
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3836, 0L, (Composer) gapComposer4, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, false, (Function1) rememberedValue3), (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    GapComposer gapComposer5 = gapComposer4;
                    gapComposer5.end(false);
                    gapComposer2 = gapComposer5;
                }
                gapComposer2.end(r5);
                DBUtil.SpacerWithinSectionMedium(r4, r5, gapComposer2, null);
                Strings.getSizes(gapComposer2).getClass();
                DefaultSizes.spacing.getClass();
                GapComposer gapComposer6 = gapComposer2;
                AmountDisplayKeypadListener amountDisplayKeypadListener3 = amountDisplayKeypadListener;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer6, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer2).pageTitle, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.pools_set_pool_amount_title), (Map) null, (Function1) null, false);
                DBUtil.SpacerWithinSectionMedium(r4, r5, gapComposer6, null);
                Modifier shakeWith = SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(companion, 1.0f), rememberShaker);
                Strings.getSizes(gapComposer6).getClass();
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(shakeWith, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                Object rememberedValue4 = gapComposer6.rememberedValue();
                if (rememberedValue4 == obj) {
                    rememberedValue4 = new PoolsListViewKt$$ExternalSyntheticLambda6(7);
                    gapComposer6.updateRememberedValue(rememberedValue4);
                }
                ConnectionPoolKt.m1177AmountDisplaykNX22eY(amountDisplayState, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default2, r4, (Function1) rememberedValue4), Strings.getColors(gapComposer6).semantic.text.prominent, Strings.getTypography(gapComposer6).numeralLarge.spanStyle.fontSize, 0, 5, gapComposer6, 0, 16);
                GapComposer gapComposer7 = gapComposer6;
                DBUtil.SpacerBetweenSectionLarge(r4, r5, gapComposer7, null);
                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion, 288.0f);
                Strings.getSizes(gapComposer7).getClass();
                Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(m277height3ABfNKs, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                boolean changedInstance2 = gapComposer7.changedInstance(amountDisplayKeypadListener3);
                Object rememberedValue5 = gapComposer7.rememberedValue();
                if (changedInstance2 || rememberedValue5 == obj) {
                    rememberedValue5 = new StartPoolAmountKt$$ExternalSyntheticLambda7(amountDisplayKeypadListener3, r4);
                    gapComposer7.updateRememberedValue(rememberedValue5);
                }
                Function0 function05 = (Function0) rememberedValue5;
                boolean changedInstance3 = gapComposer7.changedInstance(amountDisplayKeypadListener3);
                Object rememberedValue6 = gapComposer7.rememberedValue();
                if (changedInstance3 || rememberedValue6 == obj) {
                    rememberedValue6 = new StartPoolAmountKt$$ExternalSyntheticLambda8(amountDisplayKeypadListener3, r4);
                    gapComposer7.updateRememberedValue(rememberedValue6);
                }
                RelationUtil.m1189KeypadViewww6aTOc(m300paddingVpY3zN4$default3, new KeypadViewModel(null, false, function05, (Function1) rememberedValue6, 3), null, Strings.getColors(gapComposer7).surface.keypad.button.text, gapComposer7, 0, 4);
                DBUtil.SpacerWithinSectionMedium(r4, r5, gapComposer7, null);
                z2 = z;
                function03 = function0;
                DimensionKt.ButtonCtaGroup(ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer7).component.sheet.background, rectangleShapeKt$RectangleShape$1), false, null, null, Expect_jvmKt.rememberComposableLambda(-17345421, new StartPoolAmountKt$$ExternalSyntheticLambda9(function03, z2, (int) r4), gapComposer7), gapComposer7, 24576, 14);
                gapComposer7.end(r5);
                modifier3 = modifier4;
                gapComposer = gapComposer7;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda1(currencyCode, str, z2, function1, function03, function02, modifier3, str2, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((12582912 & i) == 0) {
        }
        if (gapComposer3.shouldExecute(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void StartPoolComposer(StartPoolViewModel startPoolViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        startPoolViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(337246096);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(startPoolViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1435476912, new StartPoolComposerKt$$ExternalSyntheticLambda0(function1, startPoolViewModel, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(startPoolViewModel, function1, realImageLoader, i, 5);
        }
    }

    public static final void StartPoolAmount(StartPoolViewModel.Amount amount, Function1 function1, Modifier modifier, Composer composer, int i) {
        CurrencyCode currencyCode;
        String str;
        Long l;
        Long l2;
        amount.getClass();
        Money money = amount.amount;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1721241511);
        int i2 = i | (gapComposer.changedInstance(amount) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (money == null || (currencyCode = money.currency_code) == null) {
                currencyCode = CurrencyCode.USD;
            }
            if (money == null || (l2 = money.amount) == null || (str = String.valueOf(l2.longValue())) == null) {
                str = "0";
            }
            boolean z = (money == null || (l = money.amount) == null || l.longValue() <= 0) ? false : true;
            String str2 = amount.errorMessage;
            int i3 = i2 & 112;
            boolean changedInstance = (i3 == 32) | gapComposer.changedInstance(amount);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda11(13, function1, amount);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PoolsListViewKt$$ExternalSyntheticLambda3(26, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            boolean z3 = i3 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new PoolsListViewKt$$ExternalSyntheticLambda3(27, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            StartPoolAmount(currencyCode, str, z, function12, function0, (Function0) rememberedValue3, modifier, str2, gapComposer, (i2 << 12) & 3670016, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1((Object) amount, function1, (Object) modifier, i, 8);
        }
    }
}
