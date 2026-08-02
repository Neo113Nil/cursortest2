package com.squareup.cash.moneybot.views.chat;

import androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.header.SheetHeaderKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.header.SheetHeaderKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.widgets.KeyboardState;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda8;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class EmptyChatKt {
    public static final void EmptyChat(final MoneybotChatViewModel.Content.Empty empty, boolean z, Modifier modifier, final KeyboardState keyboardState, int i, final int i2, final boolean z2, final Function1 function1, Composer composer, int i3) {
        int i4;
        boolean z3;
        empty.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(145974054);
        if ((i3 & 6) == 0) {
            i4 = (gapComposer.changedInstance(empty) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            z3 = z;
            i4 |= gapComposer.changed(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= gapComposer.changed(keyboardState.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= gapComposer.changed(i) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i3) == 0) {
            i4 |= gapComposer.changed(i2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= gapComposer.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i3) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 8388608 : 4194304;
        }
        int i5 = 0;
        if (gapComposer.shouldExecute(i4 & 1, (4793491 & i4) != 4793490)) {
            gapComposer.startDefaults();
            if ((i3 & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            final Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            final FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer.consume(CompositionLocalsKt.LocalFocusManager);
            final float mo233toDpu2uoSUM = density.mo233toDpu2uoSUM(i);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(-1, gapComposer);
            }
            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda14(17, parcelableSnapshotMutableIntState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            modifier.getClass();
            function12.getClass();
            final boolean z4 = z3;
            OffsetKt.BoxWithConstraints(ValueInsets.onGloballyPositioned(modifier, new UtilsKt$$ExternalSyntheticLambda0(i5, function12)), null, false, Expect_jvmKt.rememberComposableLambda(-343157892, new Function3() { // from class: com.squareup.cash.moneybot.views.chat.EmptyChatKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f;
                    int i6;
                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    boxWithConstraintsScopeImpl.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        if (!z4) {
                            MoneybotChatViewModel.Content.Empty empty2 = empty;
                            if (!empty2.inChatPrompts.isEmpty()) {
                                gapComposer2.startReplaceGroup(-994510189);
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                                int intValue2 = (parcelableSnapshotMutableIntState2.getIntValue() < 0 || (i6 = i2) < 0) ? -1 : i6 - parcelableSnapshotMutableIntState2.getIntValue();
                                if (intValue2 >= 0) {
                                    int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(boxWithConstraintsScopeImpl.constraints) - intValue2;
                                    if (m1024getMaxHeightimpl < 0) {
                                        m1024getMaxHeightimpl = 0;
                                    }
                                    f = density.mo233toDpu2uoSUM(m1024getMaxHeightimpl);
                                } else {
                                    f = mo233toDpu2uoSUM;
                                }
                                ViewfinderDefaults.InChatPromptsVerticalStack(SpacerKt.m302paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.BottomStart), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f + 12.0f, 7), focusOwnerImpl, empty2.inChatPrompts, keyboardState, z2, null, function1, gapComposer2, 0);
                                gapComposer2.end(false);
                            }
                        }
                        gapComposer2.startReplaceGroup(-993815386);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldUIKt$$ExternalSyntheticLambda8(empty, z, modifier, keyboardState, i, i2, z2, function1, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProfileHeader(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function2 function2, Function2 function22, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function23;
        int i5;
        Function2 function24;
        Function2 function25;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-454198859);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                Function2 function26 = function2;
                i3 |= gapComposer.changedInstance(function26) ? 256 : 128;
                function23 = function26;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function24 = function22;
                    i3 |= gapComposer.changedInstance(function24) ? 2048 : 1024;
                    if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                        gapComposer.skipToGroupEnd();
                        function25 = function23;
                    } else {
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        if (i6 != 0) {
                            modifier2 = companion;
                        }
                        if (i4 != 0) {
                            function23 = null;
                        }
                        if (i5 != 0) {
                            function24 = null;
                        }
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(modifier2, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 48);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
                        if (function23 != null) {
                            gapComposer.startReplaceGroup(-249783971);
                            function23.invoke(gapComposer, Integer.valueOf((i3 >> 6) & 14));
                            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-249716701);
                            gapComposer.end(false);
                        }
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                        ProvidedValue defaultProvidedValue$runtime = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).header);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                        Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(486359743, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 5), gapComposer), gapComposer, 56);
                        if (function24 != null) {
                            re$$ExternalSyntheticOutline0.m(gapComposer, -249493315, companion, 4.0f, gapComposer);
                            Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).bodyMedium), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(897440429, new ToastKt$$ExternalSyntheticLambda11(12, function24), gapComposer), gapComposer, 56);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-249241533);
                            gapComposer.end(false);
                        }
                        gapComposer.end(true);
                        function25 = function23;
                    }
                    Modifier modifier3 = modifier2;
                    Function2 function27 = function25;
                    Function2 function28 = function24;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new SheetHeaderKt$$ExternalSyntheticLambda2(composableLambdaImpl, modifier3, function27, function28, i, i2, 1);
                        return;
                    }
                    return;
                }
                function24 = function22;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                }
                Modifier modifier32 = modifier2;
                Function2 function272 = function25;
                Function2 function282 = function24;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function23 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function24 = function22;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
            }
            Modifier modifier322 = modifier2;
            Function2 function2722 = function25;
            Function2 function2822 = function24;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function24 = function22;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        Modifier modifier3222 = modifier2;
        Function2 function27222 = function25;
        Function2 function28222 = function24;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: ViewfinderExternalSurface-JQ-Ljw8, reason: not valid java name */
    public static final void m3629ViewfinderExternalSurfaceJQLjw8(Modifier modifier, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1843357976);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 = i2 | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE;
        }
        int i5 = i4 | 3072;
        if ((i & 24576) == 0) {
            i5 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i5 & 9363) == 9362 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
            z3 = z;
        } else {
            gapComposer.startDefaults();
            int i6 = 1;
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                i3 = i5 & (-897);
                z2 = true;
            } else {
                gapComposer.skipToGroupEnd();
                i3 = i5 & (-897);
                z2 = z;
            }
            gapComposer.endDefaults();
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer));
                gapComposer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).coroutineScope;
            Object rememberedValue2 = gapComposer.rememberedValue();
            Object obj = rememberedValue2;
            if (rememberedValue2 == neverEqualPolicy) {
                ViewfinderExternalSurfaceState viewfinderExternalSurfaceState = new ViewfinderExternalSurfaceState(coroutineScope);
                viewfinderExternalSurfaceState.lastWidth = -1;
                viewfinderExternalSurfaceState.lastHeight = -1;
                gapComposer.updateRememberedValue(viewfinderExternalSurfaceState);
                obj = viewfinderExternalSurfaceState;
            }
            ViewfinderExternalSurfaceState viewfinderExternalSurfaceState2 = (ViewfinderExternalSurfaceState) obj;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BorderKt$$ExternalSyntheticLambda1(13);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function1 function12 = (Function1) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new BorderKt$$ExternalSyntheticLambda1(14);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function1 function13 = (Function1) rememberedValue4;
            boolean changedInstance = ((57344 & i3) == 16384) | gapComposer.changedInstance(viewfinderExternalSurfaceState2) | gapComposer.changed(0L) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new DialogHostKt$$ExternalSyntheticLambda2(viewfinderExternalSurfaceState2, function1, z2, i6);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            AndroidView_androidKt.AndroidView(function12, modifier, function13, null, (Function1) rememberedValue5, gapComposer, ((i3 << 3) & 112) | 390, 8);
            z3 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(modifier, z3, function1, i, 1);
        }
    }

    public static final void ProfileHeader(String str, Modifier modifier, Function2 function2, String str2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Function2 function22;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1187914507);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(str2) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            ComposableLambdaImpl composableLambdaImpl = null;
            Function2 function23 = i5 != 0 ? null : function2;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1572429120, new TransfersViewKt$$ExternalSyntheticLambda5(str, 5), gapComposer);
            int i6 = 6;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1369185159);
            } else {
                gapComposer.startReplaceGroup(-1369185158);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-514091016, new TransfersViewKt$$ExternalSyntheticLambda5(str2, i6), gapComposer);
            }
            gapComposer.end(false);
            Modifier modifier3 = modifier;
            ProfileHeader(rememberComposableLambda, modifier3, function23, composableLambdaImpl, gapComposer, 6 | (i3 & 112) | (i3 & 896), 0);
            modifier2 = modifier3;
            function22 = function23;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            function22 = function2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetHeaderKt$$ExternalSyntheticLambda5(str, modifier2, function22, str2, i, i2, 1);
        }
    }
}
