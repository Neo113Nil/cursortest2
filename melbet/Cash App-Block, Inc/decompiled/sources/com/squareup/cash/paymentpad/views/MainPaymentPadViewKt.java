package com.squareup.cash.paymentpad.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.CashtagViewKt$Cashtag$1$1;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewModel;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.taptopay.views.components.TapToPayButtonKt;
import com.stripe.android.model.parsers.WalletJsonParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class MainPaymentPadViewKt {
    public static final StaticProvidableCompositionLocal LocalElementBoundsRegistry = new StaticProvidableCompositionLocal(new MainPaymentViewKt$$ExternalSyntheticLambda0(4));

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainPaymentPad(MainPaymentPadViewModel mainPaymentPadViewModel, Function1 function1, boolean z, Modifier modifier, ElementBoundsRegistry elementBoundsRegistry, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ElementBoundsRegistry elementBoundsRegistry2;
        RecomposeScopeImpl endRestartGroup;
        mainPaymentPadViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1825759958);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(mainPaymentPadViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                elementBoundsRegistry2 = elementBoundsRegistry;
                i3 |= gapComposer.changedInstance(elementBoundsRegistry2) ? 16384 : PKIFailureInfo.certRevoked;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    if (i5 != 0) {
                        modifier2 = Modifier.Companion.$$INSTANCE;
                    }
                    Continuation continuation = null;
                    if (i4 != 0) {
                        elementBoundsRegistry2 = null;
                    }
                    MainPaymentPadViewState mainPaymentPadViewState = new MainPaymentPadViewState(mainPaymentPadViewModel.rawAmount, null, mainPaymentPadViewModel.currencyCode, null, false);
                    Object[] objArr = new Object[0];
                    boolean changed = gapComposer.changed(mainPaymentPadViewState);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda5(mainPaymentPadViewState, 25);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
                    Updater.CompositionLocalProvider(LocalElementBoundsRegistry.defaultProvidedValue$runtime(elementBoundsRegistry2), Expect_jvmKt.rememberComposableLambda(-399751658, new MainPaymentPadViewKt$$ExternalSyntheticLambda2(modifier2, mainPaymentPadViewModel, function1, z), gapComposer), gapComposer, 56);
                    Unit unit = Unit.INSTANCE;
                    boolean changed2 = gapComposer.changed(mutableState) | ((i3 & 112) == 32);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CashtagViewKt$Cashtag$1$1(function1, mutableState, continuation, 6);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
                    boolean changed3 = gapComposer.changed(mutableState) | gapComposer.changed(mainPaymentPadViewState);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MainPaymentView$Content$2$1(mainPaymentPadViewState, mutableState, continuation, 9);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer, mainPaymentPadViewState, (Function2) rememberedValue3);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                Modifier modifier3 = modifier2;
                ElementBoundsRegistry elementBoundsRegistry3 = elementBoundsRegistry2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(mainPaymentPadViewModel, function1, z, modifier3, elementBoundsRegistry3, i, i2);
                    return;
                }
                return;
            }
            elementBoundsRegistry2 = elementBoundsRegistry;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            Modifier modifier32 = modifier2;
            ElementBoundsRegistry elementBoundsRegistry32 = elementBoundsRegistry2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        elementBoundsRegistry2 = elementBoundsRegistry;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        Modifier modifier322 = modifier2;
        ElementBoundsRegistry elementBoundsRegistry322 = elementBoundsRegistry2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void MainPaymentPadView(Modifier modifier, MainPaymentPadViewModel mainPaymentPadViewModel, Function1 function1, boolean z, Composer composer, int i) {
        mainPaymentPadViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1597319833);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(mainPaymentPadViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ArcadeThemeKt.ArcadeTheme(HomeViewKt.colors(mainPaymentPadViewModel.paymentPadTheme, gapComposer), null, null, Expect_jvmKt.rememberComposableLambda(960567548, new MainPaymentPadViewKt$$ExternalSyntheticLambda2(mainPaymentPadViewModel, function1, modifier, z), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MainPaymentPadViewKt$$ExternalSyntheticLambda2(modifier, mainPaymentPadViewModel, function1, z, i);
        }
    }

    public static final void PayRequestButtons(ButtonProminence buttonProminence, String str, String str2, Function2 function2, Modifier modifier, Composer composer, int i) {
        String str3 = str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-57358447);
        int i2 = i | (gapComposer.changed(buttonProminence.ordinal()) ? 4 : 2) | (gapComposer.changed(str3) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128) | (gapComposer.changedInstance(function2) ? 2048 : 1024) | (gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier height = OffsetKt.height(SizeKt.fillMaxWidth(modifier, 1.0f), IntrinsicSize.Min);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(height, 16.0f, 16.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MainPaymentPadViewKt$$ExternalSyntheticLambda10(0, function2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int i4 = 1572864 | ((i2 << 6) & 896);
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, weight, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1030659048, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str2, 19), gapComposer), gapComposer, i4, 56);
            Modifier weight2 = rowScopeInstance.weight(1.0f, companion, true);
            boolean z2 = i3 == 2048;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MainPaymentPadViewKt$$ExternalSyntheticLambda10(1, function2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            str3 = str;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, weight2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1560482543, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str3, 20), gapComposer), gapComposer, i4, 56);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MainPaymentPadViewKt$$ExternalSyntheticLambda14(buttonProminence, str3, str2, function2, modifier, i, 0);
        }
    }

    public static final void PayTapToPayRequestButtons(ButtonProminence buttonProminence, String str, String str2, Function2 function2, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-137166873);
        int i2 = i | (gapComposer.changed(buttonProminence.ordinal()) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128) | (gapComposer.changedInstance(function2) ? 2048 : 1024) | (gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f);
            boolean changed = gapComposer.changed(8.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MainPaymentPadViewKt$PayTapToPayRequestButtons$1$1();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MainPaymentPadViewKt$$ExternalSyntheticLambda10(2, function2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            int i4 = ((i2 << 6) & 896) | 1572864;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-676919349, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str2, 21), gapComposer), gapComposer, i4, 58);
            ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) gapComposer.consume(LocalElementBoundsRegistry);
            if (elementBoundsRegistry == null || (modifier2 = WalletJsonParser.provideBounds(elementBoundsRegistry, ElementBoundsRegistry.Element.KeypadTapToPayButton)) == null) {
                modifier2 = Modifier.Companion.$$INSTANCE;
            }
            boolean z2 = i3 == 2048;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MainPaymentPadViewKt$$ExternalSyntheticLambda10(3, function2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            TapToPayButtonKt.TapToPayButton(modifier2, buttonProminence, (Function0) rememberedValue3, gapComposer, (i2 << 3) & 112, 0);
            boolean z3 = i3 == 2048;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z3 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new MainPaymentPadViewKt$$ExternalSyntheticLambda10(4, function2);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(317043380, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str, 22), gapComposer), gapComposer, i4, 58);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MainPaymentPadViewKt$$ExternalSyntheticLambda14(buttonProminence, str, str2, function2, modifier, i, 1);
        }
    }

    public static final void PoolRequestPayButtons(String str, String str2, String str3, Function2 function2, Modifier modifier, Composer composer, int i) {
        String str4;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1760067442);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(str3) ? 256 : 128) | (gapComposer.changedInstance(function2) ? 2048 : 1024) | (gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier height = OffsetKt.height(SizeKt.fillMaxWidth(modifier, 1.0f), IntrinsicSize.Min);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(height, 16.0f, 16.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ButtonProminence buttonProminence = ButtonProminence.STANDARD;
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
            ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) gapComposer.consume(LocalElementBoundsRegistry);
            if (elementBoundsRegistry == null || (modifier2 = WalletJsonParser.provideBounds(elementBoundsRegistry, ElementBoundsRegistry.Element.KeypadPoolButton)) == null) {
                modifier2 = companion;
            }
            Modifier then = weight.then(modifier2);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MainPaymentPadViewKt$$ExternalSyntheticLambda10(5, function2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, then, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1104889967, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str3, 23), gapComposer), gapComposer, 1573248, 56);
            Modifier weight2 = rowScopeInstance.weight(1.0f, companion, true);
            boolean z2 = i3 == 2048;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MainPaymentPadViewKt$$ExternalSyntheticLambda10(6, function2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, weight2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1785464360, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str2, 24), gapComposer), gapComposer, 1573248, 56);
            gapComposer.end(true);
            ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z3 = i3 == 2048;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MainPaymentPadViewKt$$ExternalSyntheticLambda10(7, function2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            str4 = str;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth2, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(1305664147, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str4, 25), gapComposer), gapComposer, 1573296, 56);
            gapComposer.end(true);
        } else {
            str4 = str;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(str4, str2, str3, function2, modifier, i, 14);
        }
    }
}
