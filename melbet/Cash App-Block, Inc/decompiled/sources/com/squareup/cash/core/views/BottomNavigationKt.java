package com.squareup.cash.core.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.RemeasureImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.SimpleDropShadowElement;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.map.LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.BadgePlacement;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$Tab;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.TooltipState;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.Snapshots;
import com.stripe.android.model.parsers.WalletJsonParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;

/* loaded from: classes6.dex */
public abstract class BottomNavigationKt {
    public static final RoundedCornerShape pillShape = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f);
    public static final long defaultSelectedBackgroundLight = Color.m675copywmQWz5c$default(0.08f, Color.Black, 14);
    public static final long defaultSelectedBackgroundDark = Color.m675copywmQWz5c$default(0.08f, Color.White, 14);
    public static final float iconTabHorizontalPadding = 24.0f;
    public static final float textTabHorizontalPadding = 6.0f;
    public static final float iconTabSize = 24.0f;
    public static final float textTabContentWidth = 60.0f;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MainScreensViewModel$Tab.TooltipTarget.values().length];
            try {
                MainScreensViewModel$Tab.TooltipTarget tooltipTarget = MainScreensViewModel$Tab.TooltipTarget.Activity;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MainScreensViewModel$Tab.TooltipTarget tooltipTarget2 = MainScreensViewModel$Tab.TooltipTarget.Activity;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MainScreensViewModel$Tab.TooltipTarget tooltipTarget3 = MainScreensViewModel$Tab.TooltipTarget.Activity;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MainScreensViewModel$Tab.TooltipTarget tooltipTarget4 = MainScreensViewModel$Tab.TooltipTarget.Activity;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MainScreensViewModel$Tab.TooltipTarget tooltipTarget5 = MainScreensViewModel$Tab.TooltipTarget.Activity;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: BottomNavigation-225kfQQ, reason: not valid java name */
    public static final void m3507BottomNavigation225kfQQ(final Modifier modifier, final List list, final boolean z, final Integer num, final boolean z2, final long j, final long j2, final long j3, final long j4, final Function1 function1, final ElementBoundsRegistry elementBoundsRegistry, final SharedTransitionScope sharedTransitionScope, final AnimatedVisibilityScope animatedVisibilityScope, final SplashScreenAnimationObserver splashScreenAnimationObserver, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        Integer num2;
        boolean z4;
        int i4;
        list.getClass();
        splashScreenAnimationObserver.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2132502472);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z3 = z;
            i3 |= gapComposer.changed(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            num2 = num;
            i3 |= gapComposer.changed(num2) ? 2048 : 1024;
        } else {
            num2 = num;
        }
        if ((i & 24576) == 0) {
            z4 = z2;
            i3 |= gapComposer.changed(z4) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            z4 = z2;
        }
        if ((i & 196608) == 0) {
            i3 |= gapComposer.changed(j) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= gapComposer.changed(j2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i3 |= gapComposer.changed(j3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer.changed(j4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer.changedInstance(elementBoundsRegistry) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer.changed(sharedTransitionScope) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changedInstance(animatedVisibilityScope) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer.changed(splashScreenAnimationObserver) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            final boolean z5 = z4;
            final boolean z6 = z3;
            final Integer num3 = num2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(959354835, new Function2() { // from class: com.squareup.cash.core.views.BottomNavigationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Object m;
                    Modifier wrapContentHeight;
                    boolean z7;
                    Modifier modifier2;
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2);
                    Applier applier = gapComposer2.applier;
                    if (shouldExecute) {
                        final boolean z8 = z5;
                        Transition updateTransition = AnimatableKt.updateTransition(Boolean.valueOf(z8), "tab_shadow", gapComposer2, 48, 0);
                        InteractionResult interactionResult = updateTransition.transitionState;
                        TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
                        boolean isSeeking = updateTransition.isSeeking();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (isSeeking) {
                            m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
                        } else {
                            gapComposer2.startReplaceGroup(1666573488);
                            boolean changed = gapComposer2.changed(updateTransition);
                            m = gapComposer2.rememberedValue();
                            if (changed || m == neverEqualPolicy) {
                                Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                                Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                                try {
                                    Object currentState = interactionResult.getCurrentState();
                                    zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                    gapComposer2.updateRememberedValue(currentState);
                                    m = currentState;
                                } catch (Throwable th) {
                                    zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                    throw th;
                                }
                            }
                            gapComposer2.end(false);
                        }
                        boolean booleanValue = ((Boolean) m).booleanValue();
                        gapComposer2.startReplaceGroup(410124124);
                        float f = booleanValue ? 0.0f : 1.0f;
                        gapComposer2.end(false);
                        Float valueOf = Float.valueOf(f);
                        boolean changed2 = gapComposer2.changed(updateTransition);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue == neverEqualPolicy) {
                            rememberedValue = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 4));
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        boolean booleanValue2 = ((Boolean) ((State) rememberedValue).getValue()).booleanValue();
                        gapComposer2.startReplaceGroup(410124124);
                        float f2 = booleanValue2 ? 0.0f : 1.0f;
                        gapComposer2.end(false);
                        Float valueOf2 = Float.valueOf(f2);
                        boolean changed3 = gapComposer2.changed(updateTransition);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 5));
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        gapComposer2.startReplaceGroup(-985243360);
                        SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7);
                        gapComposer2.end(false);
                        Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, spring$default, twoWayConverterImpl, gapComposer2, 196608);
                        GapComposer gapComposer3 = gapComposer2;
                        gapComposer3.startReplaceGroup(-1477964047);
                        long j5 = j;
                        if (j5 == 16) {
                            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(false);
                            }
                            j5 = colors.semantic.background.standard;
                        }
                        long j6 = j5;
                        gapComposer3.end(false);
                        long j7 = z8 ? Color.Transparent : j2;
                        SplashScreenAnimationObserver splashScreenAnimationObserver2 = splashScreenAnimationObserver;
                        boolean changed4 = gapComposer3.changed(splashScreenAnimationObserver2);
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        if (changed4 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new HomeViewKt$$ExternalSyntheticLambda10(splashScreenAnimationObserver2, 2);
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(OffsetKt.offset(modifier, (Function1) rememberedValue3), 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, wrapContentHeight);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf3 = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer3, valueOf3, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        BiasAlignment biasAlignment = Alignment.Companion.Center;
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        long j8 = j7;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier align = boxScopeInstance.align(companion, biasAlignment);
                        AdaptiveStackKt$spacedBetween$1 adaptiveStackKt$spacedBetween$1 = new AdaptiveStackKt$spacedBetween$1(8.0f);
                        BiasAlignment.Vertical vertical = Alignment.Companion.Top;
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(adaptiveStackKt$spacedBetween$1, vertical, gapComposer3, 6);
                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, align);
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        gapComposer3.startReplaceGroup(1393073399);
                        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, 3);
                        RoundedCornerShape roundedCornerShape = BottomNavigationKt.pillShape;
                        Modifier navShadow = BottomNavigationKt.navShadow(wrapContentSize$default, roundedCornerShape, ((Number) createTransitionAnimation.value$delegate.getValue()).floatValue());
                        SharedTransitionScope sharedTransitionScope2 = sharedTransitionScope;
                        if (sharedTransitionScope2 != null) {
                            AnimatedVisibilityScope animatedVisibilityScope2 = animatedVisibilityScope;
                            if (animatedVisibilityScope2 != null) {
                                gapComposer3.startReplaceGroup(1115424407);
                                Modifier sharedElement$default = SharedTransitionScope.sharedElement$default(sharedTransitionScope2, companion, sharedTransitionScope2.rememberSharedContentState(BottomNavigationElementKeys.Background, gapComposer3, 6), animatedVisibilityScope2, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope2.rememberSharedContentState(BottomNavigationElementKeys.Bounds, gapComposer3, 6);
                                SharedTransitionScope.ResizeMode.Companion.getClass();
                                modifier2 = SharedTransitionScope.sharedBounds$default(sharedTransitionScope2, sharedElement$default, rememberSharedContentState, animatedVisibilityScope2, null, null, null, RemeasureImpl.INSTANCE, null, 988);
                                z7 = false;
                                gapComposer3.end(false);
                            } else {
                                z7 = false;
                                gapComposer3.startReplaceGroup(-1488019553);
                                gapComposer3.end(false);
                                modifier2 = companion;
                            }
                            navShadow = navShadow.then(modifier2);
                        } else {
                            z7 = false;
                        }
                        gapComposer3.end(z7);
                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(navShadow, j6, roundedCornerShape), 4.0f);
                        Unit unit = Unit.INSTANCE;
                        Object rememberedValue4 = gapComposer3.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy2 = neverEqualPolicy;
                        if (rememberedValue4 == neverEqualPolicy2) {
                            rememberedValue4 = BottomNavigationKt$BottomNavigation$2$2$1$2$1.INSTANCE;
                            gapComposer3.updateRememberedValue(rememberedValue4);
                        }
                        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(m298padding3ABfNKs, unit, (PointerInputEventHandler) rememberedValue4);
                        RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, vertical, gapComposer3, 6);
                        int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, pointerInput);
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                        gapComposer3.startReplaceGroup(1857498401);
                        Iterator it = list.iterator();
                        int i5 = 0;
                        while (true) {
                            boolean hasNext = it.hasNext();
                            final long j9 = j3;
                            final Function1 function12 = function1;
                            if (hasNext) {
                                Object next = it.next();
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    throw null;
                                }
                                MainScreensViewModel$Tab mainScreensViewModel$Tab = (MainScreensViewModel$Tab) next;
                                Modifier provideBounds = BottomNavigationKt.provideBounds(elementBoundsRegistry, mainScreensViewModel$Tab.tooltipTarget);
                                long j10 = j6;
                                MainScreensViewModel$Tab.Icon icon = mainScreensViewModel$Tab.icon;
                                String str = mainScreensViewModel$Tab.contentAccessibilityText;
                                boolean z9 = i5 == num3.intValue();
                                Iterator it2 = it;
                                long j11 = mainScreensViewModel$Tab.badgeCount;
                                boolean changed5 = gapComposer3.changed(function12) | gapComposer3.changedInstance(mainScreensViewModel$Tab);
                                Object rememberedValue5 = gapComposer3.rememberedValue();
                                if (changed5 || rememberedValue5 == neverEqualPolicy2) {
                                    rememberedValue5 = new BottomNavigationKt$$ExternalSyntheticLambda3(function12, mainScreensViewModel$Tab, 0);
                                    gapComposer3.updateRememberedValue(rememberedValue5);
                                }
                                GapComposer gapComposer4 = gapComposer3;
                                long j12 = j8;
                                BottomNavigationKt.m3508TabsTxsimY(provideBounds, icon, str, z9, j12, j9, j4, j11, (Function0) rememberedValue5, gapComposer4, 0);
                                neverEqualPolicy2 = neverEqualPolicy2;
                                j6 = j10;
                                j8 = j12;
                                gapComposer3 = gapComposer4;
                                i5 = i6;
                                it = it2;
                            } else {
                                NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy2;
                                final long j13 = j6;
                                gapComposer3.end(false);
                                gapComposer3.end(true);
                                if (z6) {
                                    gapComposer3.startReplaceGroup(237410796);
                                    final TooltipState rememberTooltipState = KeypadKt.rememberTooltipState(gapComposer3);
                                    Object rememberedValue6 = gapComposer3.rememberedValue();
                                    if (rememberedValue6 == neverEqualPolicy3) {
                                        rememberedValue6 = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                                    }
                                    final MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue6;
                                    KeypadKt.TooltipBox(Room.stringResource(gapComposer3, R.string.core_tab_moneybot), rememberTooltipState, null, Expect_jvmKt.rememberComposableLambda(225113814, new Function2() { // from class: com.squareup.cash.core.views.BottomNavigationKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj3, Object obj4) {
                                            Composer composer3 = (Composer) obj3;
                                            int intValue2 = ((Integer) obj4).intValue();
                                            RoundedCornerShape roundedCornerShape2 = BottomNavigationKt.pillShape;
                                            GapComposer gapComposer5 = (GapComposer) composer3;
                                            if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 60.0f);
                                                if (!z8) {
                                                    m285size3ABfNKs = BottomNavigationKt.navShadow(m285size3ABfNKs, roundedCornerShape2, 1.0f);
                                                }
                                                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m285size3ABfNKs, roundedCornerShape2), j13, ColorKt.RectangleShape);
                                                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer5, 0, 15);
                                                TooltipState tooltipState = rememberTooltipState;
                                                boolean changedInstance = gapComposer5.changedInstance(tooltipState);
                                                Object rememberedValue7 = gapComposer5.rememberedValue();
                                                Object obj5 = Composer.Companion.Empty;
                                                if (changedInstance || rememberedValue7 == obj5) {
                                                    rememberedValue7 = new BottomNavigationKt$$ExternalSyntheticLambda7(tooltipState, 0);
                                                    gapComposer5.updateRememberedValue(rememberedValue7);
                                                }
                                                Function0 function0 = (Function0) rememberedValue7;
                                                Function1 function13 = function12;
                                                boolean changed6 = gapComposer5.changed(function13);
                                                Object rememberedValue8 = gapComposer5.rememberedValue();
                                                if (changed6 || rememberedValue8 == obj5) {
                                                    rememberedValue8 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(21, function13);
                                                    gapComposer5.updateRememberedValue(rememberedValue8);
                                                }
                                                Modifier m184combinedClickableauXiCPI$default = ImageKt.m184combinedClickableauXiCPI$default(m177backgroundbw27NRU, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, null, function0, (Function0) rememberedValue8, 444);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                                                int hashCode4 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer5.currentCompositionLocalScope();
                                                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer5, m184combinedClickableauXiCPI$default);
                                                ComposeUiNode.Companion.getClass();
                                                Function0 function02 = ComposeUiNode.Companion.Constructor;
                                                if (gapComposer5.applier == null) {
                                                    Updater.invalidApplier();
                                                    throw null;
                                                }
                                                gapComposer5.startReusableNode();
                                                if (gapComposer5.inserting) {
                                                    gapComposer5.createNode(function02);
                                                } else {
                                                    gapComposer5.useNode();
                                                }
                                                Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                                Updater.m576setimpl(gapComposer5, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                Updater.m576setimpl(gapComposer5, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                                                Icons icons = Icons.NavigationMoneybotAlt;
                                                String stringResource = Room.stringResource(gapComposer5, R.string.core_tab_moneybot);
                                                gapComposer5.startReplaceGroup(-79273568);
                                                long j14 = j9;
                                                if (j14 == 16) {
                                                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                                                    if (colors2 == null) {
                                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                                                    } else {
                                                        gapComposer5.startReplaceGroup(-1762997739);
                                                        gapComposer5.end(false);
                                                    }
                                                    j14 = colors2.component.bottomNavigation.icon.selected;
                                                }
                                                long j15 = j14;
                                                gapComposer5.end(false);
                                                Trace.m1191Iconww6aTOc(icons, stringResource, (Modifier) null, j15, gapComposer5, 6, 4);
                                                gapComposer5.end(true);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), gapComposer3, 3136, 4);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(238591865);
                                    gapComposer3.end(false);
                                }
                                gapComposer3.end(true);
                                gapComposer3.end(true);
                            }
                        }
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.core.views.BottomNavigationKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    BottomNavigationKt.m3507BottomNavigation225kfQQ(Modifier.this, list, z, num, z2, j, j2, j3, j4, function1, elementBoundsRegistry, sharedTransitionScope, animatedVisibilityScope, splashScreenAnimationObserver, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: Tab-sTxsimY, reason: not valid java name */
    public static final void m3508TabsTxsimY(final Modifier modifier, final MainScreensViewModel$Tab.Icon icon, final String str, final boolean z, final long j, final long j2, final long j3, final long j4, final Function0 function0, Composer composer, final int i) {
        boolean z2;
        final long j5;
        float f;
        float f2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-610237377);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(icon) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024) | (gapComposer.changed(j) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(j2) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(j3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(j4) ? 8388608 : 4194304) | (gapComposer.changedInstance(function0) ? 67108864 : 33554432);
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            boolean z3 = icon instanceof MainScreensViewModel$Tab.Icon.FullBadge;
            if (z3) {
                z2 = z3;
                j5 = ((MainScreensViewModel$Tab.Icon.FullBadge) icon).count;
            } else {
                z2 = z3;
                j5 = j4;
            }
            MainScreensViewModel$Tab.Icon icon2 = z2 ? MainScreensViewModel$Tab.Icon.Activity.INSTANCE : icon;
            if (icon2 instanceof MainScreensViewModel$Tab.Icon.Text) {
                f = textTabHorizontalPadding;
                f2 = textTabContentWidth;
            } else {
                f = iconTabHorizontalPadding;
                f2 = iconTabSize;
            }
            final float f3 = f;
            final float f4 = f2;
            final TooltipState rememberTooltipState = KeypadKt.rememberTooltipState(gapComposer);
            final MainScreensViewModel$Tab.Icon icon3 = icon2;
            KeypadKt.TooltipBox(str, rememberTooltipState, modifier, Expect_jvmKt.rememberComposableLambda(-824972825, new Function2() { // from class: com.squareup.cash.core.views.BottomNavigationKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        Object rememberedValue = gapComposer2.rememberedValue();
                        Object obj3 = Composer.Companion.Empty;
                        if (rememberedValue == obj3) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                        RoundedCornerShape roundedCornerShape = BottomNavigationKt.pillShape;
                        Modifier modifier2 = Modifier.Companion.$$INSTANCE;
                        Modifier clip = ClipKt.clip(modifier2, roundedCornerShape);
                        final boolean z4 = z;
                        if (z4) {
                            gapComposer2.startReplaceGroup(-962367770);
                            long j6 = j;
                            if (j6 == 16) {
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                j6 = colors.isLight ? BottomNavigationKt.defaultSelectedBackgroundLight : BottomNavigationKt.defaultSelectedBackgroundDark;
                            }
                            modifier2 = ImageKt.m177backgroundbw27NRU(modifier2, j6, ColorKt.RectangleShape);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-962032939);
                            gapComposer2.end(false);
                        }
                        Modifier then = clip.then(modifier2);
                        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 0, 15);
                        TooltipState tooltipState = rememberTooltipState;
                        boolean changedInstance = gapComposer2.changedInstance(tooltipState);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changedInstance || rememberedValue2 == obj3) {
                            rememberedValue2 = new BottomNavigationKt$$ExternalSyntheticLambda7(tooltipState, 1);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        Function0 function02 = (Function0) rememberedValue2;
                        Function0 function03 = function0;
                        boolean changed = gapComposer2.changed(function03);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue3 == obj3) {
                            rememberedValue3 = new ComposeDialogKt$$ExternalSyntheticLambda10(17, function03);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        Modifier m184combinedClickableauXiCPI$default = ImageKt.m184combinedClickableauXiCPI$default(then, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, null, function02, (Function0) rememberedValue3, 444);
                        boolean changed2 = gapComposer2.changed(z4);
                        final MainScreensViewModel$Tab.Icon icon4 = icon3;
                        boolean changedInstance2 = changed2 | gapComposer2.changedInstance(icon4);
                        final String str2 = str;
                        boolean changed3 = changedInstance2 | gapComposer2.changed(str2);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue4 == obj3) {
                            rememberedValue4 = new DialogHostKt$$ExternalSyntheticLambda2(z4, icon4, str2, 4);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(SpacerKt.m299paddingVpY3zN4(SemanticsModifierKt.semantics(m184combinedClickableauXiCPI$default, false, (Function1) rememberedValue4), f3, 14.0f), f4, BottomNavigationKt.iconTabSize);
                        long j7 = j5;
                        Badge.Large large = j7 > 0 ? new Badge.Large(j7) : null;
                        BadgePlacement badgePlacement = BadgePlacement.BottomNavigation;
                        final long j8 = j2;
                        final long j9 = j3;
                        Room.BadgeAssetLayout(large, badgePlacement, m287sizeVpY3zN4, false, Expect_jvmKt.rememberComposableLambda(-1826790465, new Function2() { // from class: com.squareup.cash.core.views.BottomNavigationKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                long j10;
                                Painter painterResource;
                                Composer composer3 = (Composer) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    MainScreensViewModel$Tab.Icon icon5 = MainScreensViewModel$Tab.Icon.this;
                                    boolean z5 = icon5 instanceof MainScreensViewModel$Tab.Icon.Text;
                                    boolean z6 = z4;
                                    long j11 = j8;
                                    long j12 = j9;
                                    if (z5) {
                                        gapComposer3.startReplaceGroup(-384050722);
                                        if (z6) {
                                            gapComposer3.startReplaceGroup(-384031967);
                                            if (j11 == 16) {
                                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j11 = colors2.component.bottomNavigation.text.selected;
                                            }
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-383865280);
                                            if (j12 == 16) {
                                                Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors3 == null) {
                                                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j12 = colors3.component.bottomNavigation.text.f150default;
                                            }
                                            gapComposer3.end(false);
                                            j11 = j12;
                                        }
                                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxSize);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer3.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer3.startReusableNode();
                                        if (gapComposer3.inserting) {
                                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer3.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                        Modifier m273offsetVpY3zN4$default = OffsetKt.m273offsetVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, -1.0f, 1);
                                        String str3 = ((MainScreensViewModel$Tab.Icon.Text) icon5).text;
                                        zzacn.m2012AutoScaleTextZLomxE(0, 3, 1, 12582960, EnumC0170g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, j11, Snapshots.getNotScaledUp(Room.getSp(14), gapComposer3), gapComposer3, m273offsetVpY3zN4$default, new TextStyle(0L, Snapshots.getNotScaledUp(Room.getSp(20), gapComposer3), new FontWeight(500), Fonts.CashSans, Snapshots.getNotScaledUp(Room.getSp(0.2d), gapComposer3), 0L, 0, 0, Snapshots.getNotScaledUp(Room.getSp(24), gapComposer3), null, 16645977), str3, null);
                                        gapComposer3.end(true);
                                        gapComposer3.end(false);
                                    } else {
                                        boolean z7 = icon5 instanceof MainScreensViewModel$Tab.Icon.FullBadge;
                                        if (z7) {
                                            gapComposer3.startReplaceGroup(-382911472);
                                            gapComposer3.end(false);
                                            Path$$ExternalSyntheticBUOutline0.m();
                                            return null;
                                        }
                                        gapComposer3.startReplaceGroup(-382804677);
                                        if (z6) {
                                            gapComposer3.startReplaceGroup(-382789983);
                                            if (j11 == 16) {
                                                Colors colors4 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors4 == null) {
                                                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j11 = colors4.component.bottomNavigation.icon.selected;
                                            }
                                            gapComposer3.end(false);
                                            j10 = j11;
                                        } else {
                                            gapComposer3.startReplaceGroup(-382623296);
                                            if (j12 == 16) {
                                                Colors colors5 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors5 == null) {
                                                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j12 = colors5.component.bottomNavigation.icon.f147default;
                                            }
                                            gapComposer3.end(false);
                                            j10 = j12;
                                        }
                                        if (Intrinsics.areEqual(icon5, MainScreensViewModel$Tab.Icon.Activity.INSTANCE)) {
                                            gapComposer3.startReplaceGroup(1096045160);
                                            painterResource = Icons.NavigationActivity.painter(gapComposer3);
                                            gapComposer3.end(false);
                                        } else if (Intrinsics.areEqual(icon5, MainScreensViewModel$Tab.Icon.Card.INSTANCE)) {
                                            gapComposer3.startReplaceGroup(1096046920);
                                            painterResource = Icons.NavigationCard.painter(gapComposer3);
                                            gapComposer3.end(false);
                                        } else if (Intrinsics.areEqual(icon5, MainScreensViewModel$Tab.Icon.Money.INSTANCE)) {
                                            gapComposer3.startReplaceGroup(1096048744);
                                            painterResource = Icons.NavigationMoney.painter(gapComposer3);
                                            gapComposer3.end(false);
                                        } else if (Intrinsics.areEqual(icon5, MainScreensViewModel$Tab.Icon.PaymentDollar.INSTANCE)) {
                                            gapComposer3.startReplaceGroup(1096050888);
                                            painterResource = Icons.NavigationLogoUsd.painter(gapComposer3);
                                            gapComposer3.end(false);
                                        } else if (Intrinsics.areEqual(icon5, MainScreensViewModel$Tab.Icon.PaymentGeneric.INSTANCE)) {
                                            gapComposer3.startReplaceGroup(1096052968);
                                            painterResource = Icons.NavigationSend.painter(gapComposer3);
                                            gapComposer3.end(false);
                                        } else if (Intrinsics.areEqual(icon5, MainScreensViewModel$Tab.Icon.PaymentPound.INSTANCE)) {
                                            gapComposer3.startReplaceGroup(1096055080);
                                            painterResource = Icons.NavigationLogoGbp.painter(gapComposer3);
                                            gapComposer3.end(false);
                                        } else {
                                            if (!(icon5 instanceof MainScreensViewModel$Tab.Icon.Local)) {
                                                if (z7 || z5) {
                                                    throw NavAction$$ExternalSyntheticOutline0.m(gapComposer3, 1096065619, false, "Unreachable");
                                                }
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1096043501, false);
                                            }
                                            gapComposer3.startReplaceGroup(1096061914);
                                            painterResource = Countries.painterResource(R.drawable.core_tab_neighborhoods_tab_icon, 0, gapComposer3);
                                            gapComposer3.end(false);
                                        }
                                        Trace.m1190Iconww6aTOc(painterResource, str2, (Modifier) null, j10, gapComposer3, Painter.$stable, 4);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), gapComposer2, 24576, 8);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, ((i2 >> 6) & 14) | 3136 | ((i2 << 6) & 896), 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(icon, str, z, j, j2, j3, j4, function0, i) { // from class: com.squareup.cash.core.views.BottomNavigationKt$$ExternalSyntheticLambda6
                public final /* synthetic */ MainScreensViewModel$Tab.Icon f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ long f$4;
                public final /* synthetic */ long f$5;
                public final /* synthetic */ long f$6;
                public final /* synthetic */ long f$7;
                public final /* synthetic */ Function0 f$8;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    BottomNavigationKt.m3508TabsTxsimY(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Modifier navShadow(Modifier modifier, Shape shape, float f) {
        float f2 = 3.0f * f;
        return modifier.then(new SimpleDropShadowElement(shape, new Shadow(8.0f * f, 0L, f2, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(4.0f * f) & BodyPartID.bodyIdMax), f * 0.15f, 34))).then(new SimpleDropShadowElement(shape, new Shadow(f2, 0L, RecyclerView.DECELERATION_RATE, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(1.0f * f) & BodyPartID.bodyIdMax), f * 0.3f, 34)));
    }

    public static final Modifier provideBounds(ElementBoundsRegistry elementBoundsRegistry, MainScreensViewModel$Tab.TooltipTarget tooltipTarget) {
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (elementBoundsRegistry == null) {
            return companion;
        }
        int i = tooltipTarget == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tooltipTarget.ordinal()];
        ElementBoundsRegistry.Element element = null;
        if (i != -1) {
            if (i == 1) {
                element = ElementBoundsRegistry.Element.ActivityTab;
            } else if (i == 2) {
                element = ElementBoundsRegistry.Element.WalletTab;
            } else if (i == 3) {
                element = ElementBoundsRegistry.Element.MoneyTab;
            } else if (i == 4) {
                element = ElementBoundsRegistry.Element.SendTab;
            } else {
                if (i != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                element = ElementBoundsRegistry.Element.LocalTab;
            }
        }
        return element == null ? companion : WalletJsonParser.provideBounds(elementBoundsRegistry, element);
    }
}
