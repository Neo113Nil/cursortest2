package com.squareup.cash.dialog;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.RemeasureImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.SharedTransitionScope$skipToLookaheadSize$1;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.overlays.OverlaysKt;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.overlays.viewmodels.AlertDialogViewModel;
import com.squareup.util.android.Views;
import com.squareup.util.android.animation.Interpolators;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ArcadeModal2Kt {
    public static final ComposableLambdaImpl lambda$1338760354 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(27), false, 1338760354);

    public static final void AlertDialog(AlertDialogViewModel alertDialogViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        alertDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1336521083);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(alertDialogViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (alertDialogViewModel.equals(AlertDialogViewModel.Dismissed.INSTANCE)) {
            gapComposer.startReplaceGroup(1952870821);
            gapComposer.end(false);
        } else {
            if (!(alertDialogViewModel instanceof AlertDialogViewModel.Show)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 201542721, false);
            }
            gapComposer.startReplaceGroup(1952904983);
            AlertDialogViewModel.Show show = (AlertDialogViewModel.Show) alertDialogViewModel;
            String str = show.message;
            String str2 = show.negativeButton;
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda3(i3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean z2 = i4 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda4(0, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            boolean z3 = i4 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ComposeDialogKt$$ExternalSyntheticLambda4(27, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            AlertDialog(null, str, null, str2, function12, function0, (Function0) rememberedValue3, gapComposer, 0);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(alertDialogViewModel, function1, i, 9);
        }
    }

    public static final void ArcadeModal2(UiScope uiScope, Function0 function0, Function2 function2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        boolean z;
        Modifier skipToLookaheadSize;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1954706659);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(uiScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function2) ? 256 : 128;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            int i4 = ((i3 << 3) & 112) | 6;
            boolean isMatchFound = uiScope.rememberSharedContentState(SharedElementKey.Container, gapComposer2, i4).isMatchFound();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier animateEnterExit$default = isMatchFound ? companion : AnimatedVisibilityScope.animateEnterExit$default(uiScope, companion, EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(200, 0, EasingKt.LinearOutSlowInEasing, 2), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(200, 0, EasingKt.FastOutLinearInEasing, 2), 2), 4);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, animateEnterExit$default);
            ComposeUiNode.Companion.getClass();
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            int i5 = 0;
            Modifier sharedElement$default = SharedTransitionScope.sharedElement$default(uiScope, SizeKt.fillMaxSize(companion, 1.0f), uiScope.rememberSharedContentState(SharedElementKey.Dimmer, gapComposer2, i4), uiScope, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(i5, uiScope, function0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            ModalKt.Dimmer(sharedElement$default, (Function0) rememberedValue, null, lambda$1338760354, gapComposer2, 3072, 4);
            Modifier animateEnterExit$default2 = AnimatedVisibilityScope.animateEnterExit$default(uiScope, SpacerKt.m298padding3ABfNKs(companion, 32.0f), EnterExitTransitionKt.m147scaleInL8ZKhE$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, EasingKt.LinearOutSlowInEasing, 2), 1.05f, 4), EnterExitTransitionKt.m148scaleOutL8ZKhE$default(AnimatableKt.tween$default(200, 0, EasingKt.FastOutLinearInEasing, 2), 1.05f, 4), 4);
            SharedTransitionScope.SharedContentState rememberSharedContentState = uiScope.rememberSharedContentState(SharedElementKey.Modal, gapComposer2, i4);
            SharedTransitionScope.ResizeMode.Companion.getClass();
            gapComposer = gapComposer2;
            Modifier sharedBounds$default = SharedTransitionScope.sharedBounds$default(uiScope, animateEnterExit$default2, rememberSharedContentState, uiScope, null, ExitTransitionImpl.None, null, RemeasureImpl.INSTANCE, null, 980);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(sharedBounds$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                z = false;
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            skipToLookaheadSize = uiScope.skipToLookaheadSize(ImageKt.m177backgroundbw27NRU(clip, colors.component.modal.background, ColorKt.RectangleShape), new SharedTransitionScope$skipToLookaheadSize$1(uiScope, 0));
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, skipToLookaheadSize);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m((i3 >> 6) & 14, function2, gapComposer, true, true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(uiScope, function0, function2, i, 0);
        }
    }

    public static final void Dialog(final Object obj, final Function0 function0, final Function0 function02, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        final Object obj2;
        Function0 function03;
        final Function0 function04;
        final ComposableLambdaImpl composableLambdaImpl2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1919240182);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer.changed(obj) : gapComposer.changedInstance(obj) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i4 = i2;
        if (!gapComposer.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            obj2 = obj;
            function03 = function0;
            function04 = function02;
            composableLambdaImpl2 = composableLambdaImpl;
            i3 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (obj == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i6 = i5;
                            int i7 = i;
                            switch (i6) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    ArcadeModal2Kt.Dialog(obj, function0, function02, composableLambdaImpl, (Composer) obj3, Updater.updateChangedFlags(i7 | 1));
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    ArcadeModal2Kt.Dialog(obj, function0, function02, composableLambdaImpl, (Composer) obj3, Updater.updateChangedFlags(i7 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            obj2 = obj;
            function03 = function0;
            i3 = i;
            composableLambdaImpl2 = composableLambdaImpl;
            function04 = function02;
            OverlaysKt.WithOverlayLayer(Expect_jvmKt.rememberComposableLambda(629568611, new ComposeDialogKt$$ExternalSyntheticLambda12(obj2, i4, composableLambdaImpl, function02, function03), gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i6 = 1;
            final Function0 function05 = function03;
            final int i7 = i3;
            endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    int i62 = i6;
                    int i72 = i7;
                    switch (i62) {
                        case 0:
                            ((Integer) obj4).getClass();
                            ArcadeModal2Kt.Dialog(obj2, function05, function04, composableLambdaImpl2, (Composer) obj3, Updater.updateChangedFlags(i72 | 1));
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            ArcadeModal2Kt.Dialog(obj2, function05, function04, composableLambdaImpl2, (Composer) obj3, Updater.updateChangedFlags(i72 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Modal(Object obj, final Object obj2, final Function0 function0, Function0 function02, boolean z, boolean z2, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        final Object obj3;
        int i3;
        Function0 function03;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        ComposableLambdaImpl composableLambdaImpl2;
        final Function0 function04;
        final boolean z5;
        final boolean z6;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(961398583);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            obj3 = obj;
        } else if ((i & 6) == 0) {
            obj3 = obj;
            i3 = (gapComposer.changedInstance(obj3) ? 4 : 2) | i;
        } else {
            obj3 = obj;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? gapComposer.changed(obj2) : gapComposer.changedInstance(obj2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function03 = function02;
            i3 |= gapComposer.changedInstance(function03) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z;
                i3 |= gapComposer.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    z4 = z2;
                    i3 |= gapComposer.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536;
                    if ((1572864 & i) != 0) {
                        composableLambdaImpl2 = composableLambdaImpl;
                        i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    } else {
                        composableLambdaImpl2 = composableLambdaImpl;
                    }
                    if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                        gapComposer.skipToGroupEnd();
                        function04 = function03;
                        z5 = z3;
                        z6 = z4;
                    } else {
                        if (i6 != 0) {
                            obj3 = null;
                        }
                        final Function0 function05 = i7 != 0 ? null : function03;
                        final boolean z7 = i4 != 0 ? true : z3;
                        final boolean z8 = i5 != 0 ? true : z4;
                        if (obj2 == null) {
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup != null) {
                                final int i8 = 0;
                                final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                                function2 = new Function2() { // from class: com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        int i9 = i8;
                                        int i10 = i;
                                        switch (i9) {
                                            case 0:
                                                ((Integer) obj5).getClass();
                                                ArcadeModal2Kt.Modal(obj3, obj2, function0, function05, z7, z8, composableLambdaImpl3, (Composer) obj4, Updater.updateChangedFlags(i10 | 1), i2);
                                                break;
                                            default:
                                                ((Integer) obj5).getClass();
                                                ArcadeModal2Kt.Modal(obj3, obj2, function0, function05, z7, z8, composableLambdaImpl3, (Composer) obj4, Updater.updateChangedFlags(i10 | 1), i2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                endRestartGroup.block = function2;
                                return;
                            }
                            return;
                        }
                        Function0 function06 = function05;
                        boolean z9 = z7;
                        int i9 = i3;
                        boolean z10 = z8;
                        Object obj4 = obj3;
                        obj3 = obj4;
                        z6 = z10;
                        OverlaysKt.WithOverlayLayer(Expect_jvmKt.rememberComposableLambda(-582315222, new ComposeDialogKt$$ExternalSyntheticLambda1(obj2, i9, obj4, z9, z10, composableLambdaImpl, function06, function0), gapComposer), gapComposer, 6);
                        z5 = z9;
                        function04 = function06;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        final int i10 = 1;
                        function2 = new Function2() { // from class: com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj42, Object obj5) {
                                int i92 = i10;
                                int i102 = i;
                                switch (i92) {
                                    case 0:
                                        ((Integer) obj5).getClass();
                                        ArcadeModal2Kt.Modal(obj3, obj2, function0, function04, z5, z6, composableLambdaImpl, (Composer) obj42, Updater.updateChangedFlags(i102 | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj5).getClass();
                                        ArcadeModal2Kt.Modal(obj3, obj2, function0, function04, z5, z6, composableLambdaImpl, (Composer) obj42, Updater.updateChangedFlags(i102 | 1), i2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        endRestartGroup.block = function2;
                        return;
                    }
                    return;
                }
                z4 = z2;
                if ((1572864 & i) != 0) {
                }
                if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z4 = z2;
            if ((1572864 & i) != 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function03 = function02;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z4 = z2;
        if ((1572864 & i) != 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static AnimatorSet createInAnimator(DesignSystemDialog designSystemDialog, View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat.setDuration(200L);
        DecelerateInterpolator decelerateInterpolator = Interpolators.DECEL;
        ofFloat.setInterpolator(decelerateInterpolator);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(designSystemDialog.getContent(), Views.SCALE, 1.05f, 1.0f);
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(decelerateInterpolator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    public static final void AlertDialog(String str, String str2, String str3, String str4, Function1 function1, Function0 function0, Function0 function02, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2093624837);
        int i2 = i | 6 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128) | (gapComposer.changed(str3) ? 2048 : 1024) | (gapComposer.changed(str4) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changedInstance(function02) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = i2 >> 12;
            Dialog(Unit.INSTANCE, function0, function02, Expect_jvmKt.rememberComposableLambda(-1997119632, new ComposeDialogKt$$ExternalSyntheticLambda8(str, str2, str3, function1, str4), gapComposer), gapComposer, (i3 & 896) | 24630 | (i3 & 7168));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetKt$$ExternalSyntheticLambda0(str, str2, str3, str4, function1, function0, function02, i);
        }
    }

    public static final void ArcadeModal2(Function0 function0, Function2 function2, Composer composer, int i) {
        int i2;
        function0.getClass();
        function2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(602031441);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(865686324, new ArcadeModal2Kt$$ExternalSyntheticLambda0(i3, function0, function2), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(function0, function2, i, i3);
        }
    }
}
