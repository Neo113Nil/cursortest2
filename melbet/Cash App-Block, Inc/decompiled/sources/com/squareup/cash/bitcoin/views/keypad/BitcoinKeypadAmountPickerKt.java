package com.squareup.cash.bitcoin.views.keypad;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.ta$$ExternalSyntheticLambda1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.ChangeCurrencyAmountCaptionKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadModel;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.CalendarDatePickerKt$$ExternalSyntheticLambda12;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.paychecks.views.DistributePaycheckViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.payments.views.SchedulePaymentViewKt$$ExternalSyntheticLambda23;
import com.squareup.cash.pools.views.PoolErrorViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.StartPoolAmountKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.StartPoolAmountKt$$ExternalSyntheticLambda7;
import com.squareup.cash.pools.views.StartPoolAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.wallet.views.InteractiveCardState$animateLock$2;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public abstract class BitcoinKeypadAmountPickerKt {
    public static final ComposableLambdaImpl lambda$1998444013 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(6), false, 1998444013);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BitcoinKeypadAmountPicker(BitcoinKeypadAmountPickerModel bitcoinKeypadAmountPickerModel, boolean z, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Object interactiveCardState$animateLock$2;
        Shaker shaker;
        int i5;
        BitcoinKeypadModel bitcoinKeypadModel;
        RealCashVibrator realCashVibrator;
        int i6;
        int i7;
        Modifier modifier4;
        Applier applier;
        Object[] objArr;
        int i8;
        Object obj;
        AmountDisplayState amountDisplayState;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        Modifier modifier5;
        ?? r10;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        MutableState mutableState;
        Arrangement$Top$1 arrangement$Top$1;
        BitcoinKeypadModel bitcoinKeypadModel2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        int i9;
        Modifier modifier6;
        int i10;
        BiasAlignment.Horizontal horizontal;
        Object obj2;
        int i11;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ?? r8;
        GapComposer gapComposer;
        Modifier.Companion companion;
        int i12;
        int i13;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-623091195);
        Applier applier2 = gapComposer2.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(bitcoinKeypadAmountPickerModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i3 |= gapComposer2.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        int i14 = i2 & 8;
        if (i14 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (gapComposer2.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
                gapComposer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                if (i14 != 0) {
                    modifier2 = companion2;
                }
                RealCashVibrator realCashVibrator2 = (RealCashVibrator) gapComposer2.consume(LocalCashVibratorKt.LocalCashVibrator);
                Modifier modifier7 = modifier2;
                Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer2, 1);
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj3 = Composer.Companion.Empty;
                if (rememberedValue == obj3) {
                    rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState2 = (MutableState) rememberedValue;
                BitcoinKeypadModel bitcoinKeypadModel3 = bitcoinKeypadAmountPickerModel.keypadModel;
                CurrencyCode currencyCode = bitcoinKeypadModel3.transferMoney.currency_code;
                currencyCode.getClass();
                BitcoinDisplayUnits bitcoinDisplayUnits = bitcoinKeypadModel3.displayUnits;
                String str = bitcoinKeypadModel3.transferRawAmount;
                AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(currencyCode, bitcoinDisplayUnits, z2, 0, 8);
                int i15 = i4 & 896;
                boolean changedInstance = (i15 == 256) | gapComposer2.changedInstance(realCashVibrator2) | gapComposer2.changedInstance(rememberShaker);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue2 == obj3) {
                    rememberedValue2 = new StartPoolAmountKt$$ExternalSyntheticLambda4(function1, realCashVibrator2, rememberShaker, 1);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, str, (Function1) rememberedValue2, gapComposer2, 0);
                boolean changed = gapComposer2.changed(rememberAmountDisplayState);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changed || rememberedValue3 == obj3) {
                    rememberedValue3 = new AmountDisplayKeypadListener(rememberAmountDisplayState);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                AmountDisplayKeypadListener amountDisplayKeypadListener = (AmountDisplayKeypadListener) rememberedValue3;
                Object[] objArr2 = {bitcoinKeypadModel3.transferMoney.currency_code, bitcoinKeypadModel3.displayUnits, str, Boolean.valueOf(z)};
                int i16 = i4 & 14;
                boolean changed2 = ((i4 & 112) == 32) | gapComposer2.changed(rememberAmountDisplayState) | (i16 == 4);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                Continuation continuation = null;
                if (changed2 || rememberedValue4 == obj3) {
                    shaker = rememberShaker;
                    i5 = i16;
                    bitcoinKeypadModel = bitcoinKeypadModel3;
                    realCashVibrator = realCashVibrator2;
                    i6 = i15;
                    i7 = 1;
                    modifier4 = modifier7;
                    applier = applier2;
                    objArr = objArr2;
                    i8 = i4;
                    obj = obj3;
                    interactiveCardState$animateLock$2 = new InteractiveCardState$animateLock$2(rememberAmountDisplayState, bitcoinKeypadAmountPickerModel, z, continuation, 2);
                    amountDisplayState = rememberAmountDisplayState;
                    gapComposer2.updateRememberedValue(interactiveCardState$animateLock$2);
                } else {
                    interactiveCardState$animateLock$2 = rememberedValue4;
                    i5 = i16;
                    shaker = rememberShaker;
                    bitcoinKeypadModel = bitcoinKeypadModel3;
                    amountDisplayState = rememberAmountDisplayState;
                    realCashVibrator = realCashVibrator2;
                    i6 = i15;
                    i7 = 1;
                    modifier4 = modifier7;
                    applier = applier2;
                    objArr = objArr2;
                    i8 = i4;
                    obj = obj3;
                }
                Updater.LaunchedEffect(objArr, (Function2) interactiveCardState$animateLock$2, gapComposer2);
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.CenterHorizontally;
                Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer2, 48);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier4);
                ComposeUiNode.Companion.getClass();
                Modifier modifier8 = modifier4;
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$16);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$17);
                NavigationType navigationType = NavigationType.CLOSE;
                int i17 = i6 == 256 ? i7 : 0;
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (i17 != 0 || rememberedValue5 == obj) {
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    rememberedValue5 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(22, function1);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                } else {
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                }
                int i18 = i6;
                int i19 = i7;
                Object obj4 = obj;
                BitcoinKeypadModel bitcoinKeypadModel4 = bitcoinKeypadModel;
                BitcoinKeypadAmountPickerModel bitcoinKeypadAmountPickerModel2 = bitcoinKeypadAmountPickerModel;
                DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, Expect_jvmKt.rememberComposableLambda(49829626, new BorrowHomeKt$$ExternalSyntheticLambda0(3, bitcoinKeypadAmountPickerModel, function1), gapComposer2), gapComposer2, 1572918, 44);
                if (((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).getFontScale() < 1.5f) {
                    gapComposer2.startReplaceGroup(1164119390);
                    modifier5 = null;
                    r10 = 0;
                    DBUtil.SpacerWithinSectionMedium(0, i19, gapComposer2, null);
                    gapComposer2.end(false);
                } else {
                    modifier5 = null;
                    r10 = 0;
                    gapComposer2.startReplaceGroup(1164158791);
                    gapComposer2.end(false);
                }
                int i20 = (bitcoinKeypadAmountPickerModel2.title != null || bitcoinKeypadModel4.subtitle.length() > 0) ? i19 : r10;
                if (i20 != 0) {
                    gapComposer2.startReplaceGroup(1164275444);
                    boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (rememberedValue6 == obj4) {
                        rememberedValue6 = new TabContentViewKt$$ExternalSyntheticLambda1(19, mutableState2);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function0 = (Function0) rememberedValue6;
                    boolean z3 = i18 == 256 ? true : r10;
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (z3 || rememberedValue7 == obj4) {
                        rememberedValue7 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(23, function1);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    bitcoinKeypadModel2 = bitcoinKeypadModel4;
                    arrangement$Top$1 = arrangement$Top$12;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    GapComposer gapComposer3 = gapComposer2;
                    mutableState = mutableState2;
                    i9 = i18;
                    obj2 = obj4;
                    i10 = i20;
                    r8 = 1;
                    modifier6 = null;
                    i11 = 3;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                    horizontal = horizontal2;
                    KeypadHeader(bitcoinKeypadAmountPickerModel2, function0, booleanValue, (Function0) rememberedValue7, null, gapComposer3, i5 | 48);
                    bitcoinKeypadAmountPickerModel2 = bitcoinKeypadAmountPickerModel2;
                    gapComposer3.end(r10);
                    gapComposer = gapComposer3;
                } else {
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    GapComposer gapComposer4 = gapComposer2;
                    mutableState = mutableState2;
                    arrangement$Top$1 = arrangement$Top$12;
                    bitcoinKeypadModel2 = bitcoinKeypadModel4;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                    i9 = i18;
                    modifier6 = modifier5;
                    i10 = i20;
                    horizontal = horizontal2;
                    obj2 = obj4;
                    i11 = 3;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                    r8 = i19;
                    gapComposer4.startReplaceGroup(1164453415);
                    gapComposer4.end(r10);
                    gapComposer = gapComposer4;
                }
                String str2 = bitcoinKeypadAmountPickerModel2.noteText;
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (str2 == null) {
                    gapComposer.startReplaceGroup(1164481562);
                    gapComposer.end(r10);
                    companion = companion2;
                } else {
                    gapComposer.startReplaceGroup(1164481563);
                    if (i10 != 0) {
                        gapComposer.startReplaceGroup(-294496968);
                        DBUtil.SpacerWithinSectionMedium(r10, r8, gapComposer, modifier6);
                    } else {
                        gapComposer.startReplaceGroup(-539445467);
                    }
                    gapComposer.end(r10);
                    companion = companion2;
                    KeypadNote((i8 >> 3) & 112, gapComposer, columnScopeInstance.align(companion, horizontal), str2, function1);
                    gapComposer.end(r10);
                }
                SpacerKt.Spacer(gapComposer, columnScopeInstance.weight(1.0f, companion, r8));
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$17);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Shaker shaker2 = shaker;
                Modifier shakeWith = SharedViewEventsKt.shakeWith(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), shaker2);
                Object rememberedValue8 = gapComposer.rememberedValue();
                Object obj5 = obj2;
                if (rememberedValue8 == obj5) {
                    rememberedValue8 = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(i11);
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                GapComposer gapComposer5 = gapComposer;
                int i21 = i5;
                ConnectionPoolKt.m1177AmountDisplaykNX22eY(amountDisplayState, SemanticsModifierKt.semantics(shakeWith, r10, (Function1) rememberedValue8), Strings.getColors(gapComposer).semantic.text.prominent, Room.pack(4294967296L, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.amount_view_text_size)), 0, 0, gapComposer5, 0, 48);
                gapComposer2 = gapComposer5;
                String str3 = bitcoinKeypadModel2.convertedAmount;
                if (str3.length() <= 0) {
                    str3 = null;
                }
                if (str3 == null) {
                    gapComposer2.startReplaceGroup(-1946264975);
                    gapComposer2.end(false);
                    i12 = i9;
                    i13 = 256;
                } else {
                    gapComposer2.startReplaceGroup(-1946264974);
                    i12 = i9;
                    i13 = 256;
                    boolean z4 = i12 == 256;
                    Object rememberedValue9 = gapComposer2.rememberedValue();
                    if (z4 || rememberedValue9 == obj5) {
                        rememberedValue9 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(24, function1);
                        gapComposer2.updateRememberedValue(rememberedValue9);
                    }
                    ChangeCurrencyAmountCaptionKt.ChangeCurrencyAmountCaption(0, gapComposer2, null, str3, (Function0) rememberedValue9);
                    gapComposer2.end(false);
                }
                gapComposer2.end(true);
                SpacerKt.Spacer(gapComposer2, columnScopeInstance.weight(1.0f, companion, true));
                boolean changedInstance2 = gapComposer2.changedInstance(amountDisplayKeypadListener);
                Object rememberedValue10 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue10 == obj5) {
                    rememberedValue10 = new StartPoolAmountKt$$ExternalSyntheticLambda7(amountDisplayKeypadListener, 2);
                    gapComposer2.updateRememberedValue(rememberedValue10);
                }
                Function0 function02 = (Function0) rememberedValue10;
                boolean changedInstance3 = gapComposer2.changedInstance(amountDisplayKeypadListener);
                Object rememberedValue11 = gapComposer2.rememberedValue();
                if (changedInstance3 || rememberedValue11 == obj5) {
                    rememberedValue11 = new StartPoolAmountKt$$ExternalSyntheticLambda8(amountDisplayKeypadListener, 1);
                    gapComposer2.updateRememberedValue(rememberedValue11);
                }
                KeypadViewModel keypadViewModel = new KeypadViewModel(null, false, function02, (Function1) rememberedValue11, 3);
                long j = Strings.getColors(gapComposer2).semantic.text.standard;
                Strings.getSizes(gapComposer2).getClass();
                int i22 = i13;
                int i23 = i12;
                RelationUtil.m1189KeypadViewww6aTOc(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), keypadViewModel, null, j, gapComposer2, 0, 4);
                boolean z5 = bitcoinKeypadAmountPickerModel2.buttonEnabled;
                String str4 = bitcoinKeypadAmountPickerModel2.buttonText;
                RealCashVibrator realCashVibrator3 = realCashVibrator;
                boolean changedInstance4 = (i21 == 4) | (i23 == i22) | gapComposer2.changedInstance(realCashVibrator3) | gapComposer2.changedInstance(shaker2);
                Object rememberedValue12 = gapComposer2.rememberedValue();
                if (changedInstance4 || rememberedValue12 == obj5) {
                    ta$$ExternalSyntheticLambda1 ta__externalsyntheticlambda1 = new ta$$ExternalSyntheticLambda1(bitcoinKeypadAmountPickerModel2, function1, realCashVibrator3, shaker2, mutableState, 5);
                    gapComposer2.updateRememberedValue(ta__externalsyntheticlambda1);
                    rememberedValue12 = ta__externalsyntheticlambda1;
                }
                KeypadButton(0, gapComposer2, null, str4, (Function0) rememberedValue12, z5);
                gapComposer2.end(true);
                modifier3 = modifier8;
            }
            endRestartGroup = gapComposer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(bitcoinKeypadAmountPickerModel, z, function1, modifier3, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void KeypadButton(int i, Composer composer, Modifier modifier, String str, Function0 function0, boolean z) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1761403888);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | 3072;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2109958572, new CalendarDatePickerKt$$ExternalSyntheticLambda12(str, function0, z, i3), gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            zzabx.ButtonDefaultGroupVertical(companion, rememberComposableLambda, gapComposer, 54, 0);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SchedulePaymentViewKt$$ExternalSyntheticLambda23(str, function0, z, modifier2, i);
        }
    }

    public static final void KeypadHeader(BitcoinKeypadAmountPickerModel bitcoinKeypadAmountPickerModel, Function0 function0, boolean z, Function0 function02, Modifier modifier, Composer composer, int i) {
        int i2;
        boolean z2;
        Modifier modifier2;
        boolean z3;
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1130195969);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(bitcoinKeypadAmountPickerModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i2 |= gapComposer.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier semantics = SemanticsModifierKt.semantics(companion2, true, (Function1) rememberedValue);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(semantics, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (bitcoinKeypadAmountPickerModel.title == null) {
                gapComposer.startReplaceGroup(-146406392);
                gapComposer.end(false);
                companion = companion2;
                z3 = false;
            } else {
                gapComposer.startReplaceGroup(-146406391);
                z3 = false;
                companion = companion2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).titleBarPageTitle, (TextLineBalancing) null, bitcoinKeypadAmountPickerModel.title, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 4.0f, gapComposer);
            BitcoinKeypadModel bitcoinKeypadModel = bitcoinKeypadAmountPickerModel.keypadModel;
            String str = bitcoinKeypadModel.subtitle;
            AndroidTileMode_androidKt androidTileMode_androidKt = bitcoinKeypadModel.error;
            SubtitleOrError((i4 & 896) | ((i4 << 6) & 7168), gapComposer, null, str, androidTileMode_androidKt != null ? androidTileMode_androidKt.getMessage() : null, function0, z2);
            if (bitcoinKeypadAmountPickerModel.showMaxButton) {
                gapComposer.startReplaceGroup(-145932897);
                Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 4.0f, gapComposer);
                MaxButton((i4 >> 9) & 14, gapComposer, null, function02);
                gapComposer.end(z3);
            } else {
                gapComposer.startReplaceGroup(-145815655);
                gapComposer.end(z3);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(bitcoinKeypadAmountPickerModel, function0, z, function02, modifier2, i);
        }
    }

    public static final void KeypadNote(int i, Composer composer, Modifier modifier, String str, Function1 function1) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(361156459);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(20, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, modifier, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-802977421, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, 17), gapComposer), gapComposer, ((i2 >> 3) & 112) | 1572864, 60);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DistributePaycheckViewKt$$ExternalSyntheticLambda7(i, 1, modifier, str, function1);
        }
    }

    public static final void MaxButton(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-129854491);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            function02 = function0;
            coil3.size.SizeKt.ButtonCompact(function02, companion, null, false, false, null, lambda$1998444013, gapComposer, (i3 & 14) | 1572864 | (i3 & 112), 60);
            modifier = companion;
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolErrorViewKt$$ExternalSyntheticLambda0(function02, modifier, i, 2);
        }
    }

    public static final void SubtitleOrError(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0, boolean z) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(112704722);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Boolean valueOf = Boolean.valueOf(z);
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            int i4 = 3;
            Continuation continuation = null;
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealBoostSyncer$refresh$1(z, function0, continuation, i4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            AnimatedContentKt.AnimatedVisibility(z && str2 != null, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3).plus(EnterExitTransitionKt.slideInVertically$default(3, null)), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-1715319884, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str2, 19), gapComposer), (Composer) gapComposer, 200064, 18);
            AnimatedContentKt.AnimatedVisibility(!z || str2 == null, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3).plus(EnterExitTransitionKt.slideInVertically$default(3, null)), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-1109076579, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, 20), gapComposer), (Composer) gapComposer, 200064, 18);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(i, modifier2, str, str2, function0, z);
        }
    }
}
