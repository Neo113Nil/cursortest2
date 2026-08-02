package app.cash.local.views.map;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.views.ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import bo.app.c7$$ExternalSyntheticLambda6;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import coil3.compose.AsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.dynamite.zzg;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.components.AccountAvatarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.ClusterItemKt;
import com.squareup.cash.maps.views.MapMarkerPropertiesKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;

/* loaded from: classes3.dex */
public abstract class LocalMapPinKt {

    /* renamed from: lambda$-1120212204, reason: not valid java name */
    public static final ComposableLambdaImpl f51lambda$1120212204 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(27), false, -1120212204);

    /* renamed from: lambda$-1786935808, reason: not valid java name */
    public static final ComposableLambdaImpl f52lambda$1786935808 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(1), false, -1786935808);
    public static final ComposableLambdaImpl lambda$1548716539 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(28), false, 1548716539);
    public static final ComposableLambdaImpl lambda$537505075 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(29), false, 537505075);
    public static final ComposableLambdaImpl lambda$1441591038 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(1), false, 1441591038);

    /* renamed from: lambda$-509543051, reason: not valid java name */
    public static final ComposableLambdaImpl f53lambda$509543051 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(2), false, -509543051);
    public static final ComposableLambdaImpl lambda$916218348 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(3), false, 916218348);

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalBrandLocationMarker(String str, boolean z, String str2, LocalColor localColor, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Color m;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(953511196);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changedInstance(localColor) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                LocalMapPinState.Companion.getClass();
                LocalMapPinState localMapPinState = z ? LocalMapPinState.Selected : LocalMapPinState.Mini;
                if (localColor == null) {
                    gapComposer2.startReplaceGroup(-861320907);
                    gapComposer2.end(false);
                    m = null;
                } else {
                    gapComposer2.startReplaceGroup(1496236108);
                    m = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, LocalViewsKt.toComposeColor(localColor, gapComposer2, (i3 >> 9) & 14));
                }
                gapComposer = gapComposer2;
                m1327LocalMapPinFpGtcJw(localMapPinState, str, m != null ? m.value : Color.Transparent, str2, modifier3, 0L, 0L, gapComposer, ((i3 << 3) & 7280) | (i3 & 57344));
                modifier2 = modifier3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(str, z, str2, localColor, modifier2, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x08f6, code lost:
    
        if (r11 == r9) goto L339;
     */
    /* renamed from: LocalMapPin-FpGtcJw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1327LocalMapPinFpGtcJw(final LocalMapPinState localMapPinState, final String str, final long j, final String str2, final Modifier modifier, long j2, long j3, Composer composer, final int i) {
        int i2;
        final long j4;
        GapComposer gapComposer;
        final long j5;
        Applier applier;
        long j6;
        int i3;
        long j7;
        Object m;
        Transition.TransitionAnimationState transitionAnimationState;
        TweenSpec tweenSpec;
        boolean z;
        Object m2;
        Transition.TransitionAnimationState transitionAnimationState2;
        TweenSpec tweenSpec2;
        boolean z2;
        Object m3;
        Transition.TransitionAnimationState transitionAnimationState3;
        TweenSpec tweenSpec3;
        boolean z3;
        Object m4;
        boolean z4;
        float f;
        Transition.TransitionAnimationState transitionAnimationState4;
        boolean z5;
        Object m5;
        Transition.TransitionAnimationState transitionAnimationState5;
        TweenSpec tweenSpec4;
        Object m6;
        boolean z6;
        Object m7;
        NeverEqualPolicy neverEqualPolicy;
        Snapshot currentThreadSnapshot;
        Function1 readObserver;
        Snapshot makeCurrentNonObservable;
        boolean z7;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1512123180);
        Applier applier2 = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(localMapPinState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                applier = applier2;
                j6 = colors.semantic.icon.standard;
                i3 = i2 & (-4128769);
                j7 = j6;
            } else {
                gapComposer2.skipToGroupEnd();
                i3 = i2 & (-4128769);
                j7 = j3;
                applier = applier2;
                j6 = j2;
            }
            int i4 = i3;
            gapComposer2.endDefaults();
            long j8 = j6;
            Transition updateTransition = AnimatableKt.updateTransition(localMapPinState, "localMapPin", gapComposer2, (i4 & 14) | 48, 0);
            InteractionResult interactionResult = updateTransition.transitionState;
            TweenSpec tween$default = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, EasingKt.FastOutSlowInEasing, 2);
            TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.DpToVector;
            boolean isSeeking = updateTransition.isSeeking();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (isSeeking) {
                m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
            } else {
                gapComposer2.startReplaceGroup(1666573488);
                boolean changed = gapComposer2.changed(updateTransition);
                m = gapComposer2.rememberedValue();
                if (changed || m == neverEqualPolicy2) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer2.updateRememberedValue(currentState);
                        m = currentState;
                        z7 = false;
                    } finally {
                    }
                } else {
                    z7 = false;
                }
                gapComposer2.end(z7);
            }
            LocalMapPinState localMapPinState2 = (LocalMapPinState) m;
            gapComposer2.startReplaceGroup(2050866705);
            LocalMapPinState localMapPinState3 = LocalMapPinState.Mini;
            Dp m8 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, localMapPinState2 == localMapPinState3 ? 20.0f : localMapPinState2.scale * 36.0f);
            boolean changed2 = gapComposer2.changed(updateTransition);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue == neverEqualPolicy2) {
                rememberedValue = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 0));
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            LocalMapPinState localMapPinState4 = (LocalMapPinState) ((State) rememberedValue).getValue();
            gapComposer2.startReplaceGroup(2050866705);
            Dp m9 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, localMapPinState4 == localMapPinState3 ? 20.0f : localMapPinState4.scale * 36.0f);
            boolean changed3 = gapComposer2.changed(updateTransition);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 24));
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            ((Transition.Segment) ((State) rememberedValue2).getValue()).getClass();
            gapComposer2.startReplaceGroup(-288249633);
            gapComposer2.end(false);
            Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(updateTransition, m8, m9, tween$default, twoWayConverterImpl, gapComposer2, 196608);
            if (updateTransition.isSeeking()) {
                transitionAnimationState = createTransitionAnimation;
                tweenSpec = tween$default;
                z = false;
                m2 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
            } else {
                gapComposer2.startReplaceGroup(1666573488);
                boolean changed4 = gapComposer2.changed(updateTransition);
                m2 = gapComposer2.rememberedValue();
                if (changed4 || m2 == neverEqualPolicy2) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    transitionAnimationState = createTransitionAnimation;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    tweenSpec = tween$default;
                    try {
                        Object currentState2 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer2.updateRememberedValue(currentState2);
                        m2 = currentState2;
                    } finally {
                    }
                } else {
                    transitionAnimationState = createTransitionAnimation;
                    tweenSpec = tween$default;
                }
                z = false;
                gapComposer2.end(false);
            }
            LocalMapPinState localMapPinState5 = (LocalMapPinState) m2;
            gapComposer2.startReplaceGroup(-1831745322);
            Dp m10 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, z, localMapPinState5 == localMapPinState3 ? 20.0f : localMapPinState5.scale * 50.0f);
            boolean changed5 = gapComposer2.changed(updateTransition);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed5 || rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 25));
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            LocalMapPinState localMapPinState6 = (LocalMapPinState) ((State) rememberedValue3).getValue();
            gapComposer2.startReplaceGroup(-1831745322);
            Dp m11 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, localMapPinState6 != localMapPinState3 ? localMapPinState6.scale * 50.0f : 20.0f);
            boolean changed6 = gapComposer2.changed(updateTransition);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed6 || rememberedValue4 == neverEqualPolicy2) {
                rememberedValue4 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 26));
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            ((Transition.Segment) ((State) rememberedValue4).getValue()).getClass();
            gapComposer2.startReplaceGroup(-1329907768);
            gapComposer2.end(false);
            Transition.TransitionAnimationState transitionAnimationState6 = transitionAnimationState;
            TweenSpec tweenSpec5 = tweenSpec;
            Transition.TransitionAnimationState createTransitionAnimation2 = AnimatableKt.createTransitionAnimation(updateTransition, m10, m11, tweenSpec5, twoWayConverterImpl, gapComposer2, 196608);
            if (updateTransition.isSeeking()) {
                transitionAnimationState2 = createTransitionAnimation2;
                tweenSpec2 = tweenSpec5;
                z2 = false;
                m3 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
            } else {
                gapComposer2.startReplaceGroup(1666573488);
                boolean changed7 = gapComposer2.changed(updateTransition);
                m3 = gapComposer2.rememberedValue();
                if (changed7 || m3 == neverEqualPolicy2) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    transitionAnimationState2 = createTransitionAnimation2;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    tweenSpec2 = tweenSpec5;
                    try {
                        Object currentState3 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer2.updateRememberedValue(currentState3);
                        m3 = currentState3;
                    } finally {
                    }
                } else {
                    transitionAnimationState2 = createTransitionAnimation2;
                    tweenSpec2 = tweenSpec5;
                }
                z2 = false;
                gapComposer2.end(false);
            }
            gapComposer2.startReplaceGroup(-1373931146);
            Dp m12 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, z2, ((LocalMapPinState) m3).contentCornerRadius);
            boolean changed8 = gapComposer2.changed(updateTransition);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed8 || rememberedValue5 == neverEqualPolicy2) {
                rememberedValue5 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 27));
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            LocalMapPinState localMapPinState7 = (LocalMapPinState) ((State) rememberedValue5).getValue();
            gapComposer2.startReplaceGroup(-1373931146);
            Dp m13 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, localMapPinState7.contentCornerRadius);
            boolean changed9 = gapComposer2.changed(updateTransition);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changed9 || rememberedValue6 == neverEqualPolicy2) {
                rememberedValue6 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 28));
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            ((Transition.Segment) ((State) rememberedValue6).getValue()).getClass();
            gapComposer2.startReplaceGroup(-396465432);
            gapComposer2.end(false);
            Transition.TransitionAnimationState transitionAnimationState7 = transitionAnimationState2;
            TweenSpec tweenSpec6 = tweenSpec2;
            Transition.TransitionAnimationState createTransitionAnimation3 = AnimatableKt.createTransitionAnimation(updateTransition, m12, m13, tweenSpec6, twoWayConverterImpl, gapComposer2, 196608);
            if (updateTransition.isSeeking()) {
                transitionAnimationState3 = createTransitionAnimation3;
                tweenSpec3 = tweenSpec6;
                z3 = false;
                m4 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
            } else {
                gapComposer2.startReplaceGroup(1666573488);
                boolean changed10 = gapComposer2.changed(updateTransition);
                m4 = gapComposer2.rememberedValue();
                if (changed10 || m4 == neverEqualPolicy2) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    transitionAnimationState3 = createTransitionAnimation3;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    tweenSpec3 = tweenSpec6;
                    try {
                        Object currentState4 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer2.updateRememberedValue(currentState4);
                        m4 = currentState4;
                    } finally {
                    }
                } else {
                    transitionAnimationState3 = createTransitionAnimation3;
                    tweenSpec3 = tweenSpec6;
                }
                z3 = false;
                gapComposer2.end(false);
            }
            gapComposer2.startReplaceGroup(194447580);
            Dp m14 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, z3, ((LocalMapPinState) m4).scale * 4.0f);
            boolean changed11 = gapComposer2.changed(updateTransition);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changed11 || rememberedValue7 == neverEqualPolicy2) {
                rememberedValue7 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 29));
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            LocalMapPinState localMapPinState8 = (LocalMapPinState) ((State) rememberedValue7).getValue();
            gapComposer2.startReplaceGroup(194447580);
            Dp m15 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, localMapPinState8.scale * 4.0f);
            boolean changed12 = gapComposer2.changed(updateTransition);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changed12 || rememberedValue8 == neverEqualPolicy2) {
                z4 = false;
                rememberedValue8 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 0));
                gapComposer2.updateRememberedValue(rememberedValue8);
            } else {
                z4 = false;
            }
            ((Transition.Segment) ((State) rememberedValue8).getValue()).getClass();
            gapComposer2.startReplaceGroup(-1428457430);
            gapComposer2.end(z4);
            Transition.TransitionAnimationState transitionAnimationState8 = transitionAnimationState3;
            TweenSpec tweenSpec7 = tweenSpec3;
            Transition.TransitionAnimationState createTransitionAnimation4 = AnimatableKt.createTransitionAnimation(updateTransition, m14, m15, tweenSpec7, twoWayConverterImpl, gapComposer2, 196608);
            if (updateTransition.isSeeking()) {
                f = 4.0f;
                transitionAnimationState4 = createTransitionAnimation4;
                z5 = false;
                m5 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
            } else {
                gapComposer2.startReplaceGroup(1666573488);
                boolean changed13 = gapComposer2.changed(updateTransition);
                m5 = gapComposer2.rememberedValue();
                if (changed13 || m5 == neverEqualPolicy2) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    f = 4.0f;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    transitionAnimationState4 = createTransitionAnimation4;
                    try {
                        Object currentState5 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer2.updateRememberedValue(currentState5);
                        m5 = currentState5;
                    } finally {
                    }
                } else {
                    f = 4.0f;
                    transitionAnimationState4 = createTransitionAnimation4;
                }
                z5 = false;
                gapComposer2.end(false);
            }
            gapComposer2.startReplaceGroup(-2035220567);
            Dp m16 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, z5, ((LocalMapPinState) m5).scale * 2.0f);
            boolean changed14 = gapComposer2.changed(updateTransition);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (changed14 || rememberedValue9 == neverEqualPolicy2) {
                rememberedValue9 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 1));
                gapComposer2.updateRememberedValue(rememberedValue9);
            }
            LocalMapPinState localMapPinState9 = (LocalMapPinState) ((State) rememberedValue9).getValue();
            gapComposer2.startReplaceGroup(-2035220567);
            Dp m17 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, localMapPinState9.scale * 2.0f);
            boolean changed15 = gapComposer2.changed(updateTransition);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (changed15 || rememberedValue10 == neverEqualPolicy2) {
                rememberedValue10 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 19));
                gapComposer2.updateRememberedValue(rememberedValue10);
            }
            ((Transition.Segment) ((State) rememberedValue10).getValue()).getClass();
            gapComposer2.startReplaceGroup(636841719);
            gapComposer2.end(false);
            Transition.TransitionAnimationState transitionAnimationState9 = transitionAnimationState4;
            Transition.TransitionAnimationState createTransitionAnimation5 = AnimatableKt.createTransitionAnimation(updateTransition, m16, m17, tweenSpec7, twoWayConverterImpl, gapComposer2, 196608);
            if (updateTransition.isSeeking()) {
                transitionAnimationState5 = createTransitionAnimation5;
                tweenSpec4 = tweenSpec7;
                m6 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
            } else {
                gapComposer2.startReplaceGroup(1666573488);
                boolean changed16 = gapComposer2.changed(updateTransition);
                m6 = gapComposer2.rememberedValue();
                if (changed16 || m6 == neverEqualPolicy2) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    transitionAnimationState5 = createTransitionAnimation5;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    tweenSpec4 = tweenSpec7;
                    try {
                        Object currentState6 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer2.updateRememberedValue(currentState6);
                        m6 = currentState6;
                    } finally {
                    }
                } else {
                    transitionAnimationState5 = createTransitionAnimation5;
                    tweenSpec4 = tweenSpec7;
                }
                gapComposer2.end(false);
            }
            LocalMapPinState localMapPinState10 = (LocalMapPinState) m6;
            gapComposer2.startReplaceGroup(792391360);
            Dp m18 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, localMapPinState10 == localMapPinState3 ? RecyclerView.DECELERATION_RATE : localMapPinState10.scale * 15.0f);
            boolean changed17 = gapComposer2.changed(updateTransition);
            Object rememberedValue11 = gapComposer2.rememberedValue();
            if (changed17 || rememberedValue11 == neverEqualPolicy2) {
                rememberedValue11 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 20));
                gapComposer2.updateRememberedValue(rememberedValue11);
            }
            LocalMapPinState localMapPinState11 = (LocalMapPinState) ((State) rememberedValue11).getValue();
            gapComposer2.startReplaceGroup(792391360);
            Dp m19 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, localMapPinState11 == localMapPinState3 ? RecyclerView.DECELERATION_RATE : localMapPinState11.scale * 15.0f);
            boolean changed18 = gapComposer2.changed(updateTransition);
            Object rememberedValue12 = gapComposer2.rememberedValue();
            if (changed18 || rememberedValue12 == neverEqualPolicy2) {
                rememberedValue12 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 21));
                gapComposer2.updateRememberedValue(rememberedValue12);
            }
            ((Transition.Segment) ((State) rememberedValue12).getValue()).getClass();
            gapComposer2.startReplaceGroup(-830513650);
            gapComposer2.end(false);
            Transition.TransitionAnimationState transitionAnimationState10 = transitionAnimationState5;
            TweenSpec tweenSpec8 = tweenSpec4;
            Transition.TransitionAnimationState createTransitionAnimation6 = AnimatableKt.createTransitionAnimation(updateTransition, m18, m19, tweenSpec8, twoWayConverterImpl, gapComposer2, 196608);
            if (updateTransition.isSeeking()) {
                z6 = false;
                m7 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
            } else {
                gapComposer2.startReplaceGroup(1666573488);
                boolean changed19 = gapComposer2.changed(updateTransition);
                m7 = gapComposer2.rememberedValue();
                if (changed19 || m7 == neverEqualPolicy2) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState7 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer2.updateRememberedValue(currentState7);
                        m7 = currentState7;
                    } finally {
                    }
                }
                gapComposer2.end(false);
                z6 = false;
            }
            LocalMapPinState localMapPinState12 = (LocalMapPinState) m7;
            gapComposer2.startReplaceGroup(2105191943);
            Dp m20 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, z6, localMapPinState12 == localMapPinState3 ? RecyclerView.DECELERATION_RATE : localMapPinState12.scale * 6.0f);
            boolean changed20 = gapComposer2.changed(updateTransition);
            Object rememberedValue13 = gapComposer2.rememberedValue();
            if (changed20 || rememberedValue13 == neverEqualPolicy2) {
                rememberedValue13 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 22));
                gapComposer2.updateRememberedValue(rememberedValue13);
            }
            LocalMapPinState localMapPinState13 = (LocalMapPinState) ((State) rememberedValue13).getValue();
            gapComposer2.startReplaceGroup(2105191943);
            Dp m21 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, localMapPinState13 == localMapPinState3 ? RecyclerView.DECELERATION_RATE : localMapPinState13.scale * 6.0f);
            boolean changed21 = gapComposer2.changed(updateTransition);
            Object rememberedValue14 = gapComposer2.rememberedValue();
            if (changed21 || rememberedValue14 == neverEqualPolicy2) {
                rememberedValue14 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 23));
                gapComposer2.updateRememberedValue(rememberedValue14);
            }
            ((Transition.Segment) ((State) rememberedValue14).getValue()).getClass();
            gapComposer2.startReplaceGroup(-960223111);
            gapComposer2.end(false);
            Transition.TransitionAnimationState createTransitionAnimation7 = AnimatableKt.createTransitionAnimation(updateTransition, m20, m21, tweenSpec8, twoWayConverterImpl, gapComposer2, 196608);
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(((Dp) transitionAnimationState8.value$delegate.getValue()).value);
            float f2 = ((Dp) createTransitionAnimation7.value$delegate.getValue()).value + ((Dp) transitionAnimationState7.value$delegate.getValue()).value;
            Object rememberedValue15 = gapComposer2.rememberedValue();
            if (rememberedValue15 == neverEqualPolicy2) {
                rememberedValue15 = Updater.mutableStateOf$default(new IntSize(0L));
                gapComposer2.updateRememberedValue(rememberedValue15);
            }
            MutableState mutableState = (MutableState) rememberedValue15;
            MapMarkerPropertiesKt.m3595MapMarkerAnchor9KIMszo((Float.floatToRawIntBits(Dp.m1036compareTo0680j_4((f2 + f) + ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM((int) (((IntSize) mutableState.getValue()).packedValue & BodyPartID.bodyIdMax)), RecyclerView.DECELERATION_RATE) > 0 ? f2 / r11 : 1.0f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(0.5f) << 32), gapComposer2, 0);
            boolean z8 = (i4 & 112) == 32;
            Object rememberedValue16 = gapComposer2.rememberedValue();
            if (z8 || rememberedValue16 == neverEqualPolicy2) {
                rememberedValue16 = new IconKt$$ExternalSyntheticLambda0(str, 28);
                gapComposer2.updateRememberedValue(rememberedValue16);
            }
            Modifier m284requiredWidth3ABfNKs = SizeKt.m284requiredWidth3ABfNKs(SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue16), 96.0f);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m284requiredWidth3ABfNKs);
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
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            long j9 = j7;
            Modifier clip = ClipKt.clip(ImageKt.m178borderxT4_qwU(SizeKt.m287sizeVpY3zN4(companion, ((Dp) transitionAnimationState6.value$delegate.getValue()).value, ((Dp) transitionAnimationState7.value$delegate.getValue()).value), ((Dp) transitionAnimationState10.value$delegate.getValue()).value, j9, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, clip);
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
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), j, ColorKt.RectangleShape), gapComposer2, 0);
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxSize(companion, 1.0f), ((Dp) transitionAnimationState9.value$delegate.getValue()).value);
            ImageRequest.Builder builder = new ImageRequest.Builder((Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext));
            Boolean bool = (Boolean) ClusterItemKt.supportsHardware$delegate.getValue();
            bool.getClass();
            Extras.Key key = ImageRequests_androidKt.transitionFactoryKey;
            builder.getExtras().set(ImageRequests_androidKt.allowHardwareKey, bool);
            builder.data = str2;
            AsyncImageKt.m1438AsyncImage10Xjiaw(builder.build(), null, m298padding3ABfNKs, null, null, null, gapComposer2, 48, 2040);
            gapComposer2.end(true);
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, ((Dp) createTransitionAnimation6.value$delegate.getValue()).value, ((Dp) createTransitionAnimation7.value$delegate.getValue()).value);
            boolean changed22 = gapComposer2.changed(j8);
            Object rememberedValue17 = gapComposer2.rememberedValue();
            if (changed22) {
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
            }
            rememberedValue17 = new c7$$ExternalSyntheticLambda6(j8, 5);
            gapComposer2.updateRememberedValue(rememberedValue17);
            BoxKt.Box(ClipKt.drawWithCache(m287sizeVpY3zN4, (Function1) rememberedValue17), gapComposer2, 0);
            gapComposer2.end(true);
            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, f));
            Modifier m284requiredWidth3ABfNKs2 = SizeKt.m284requiredWidth3ABfNKs(companion, 96.0f);
            Object rememberedValue18 = gapComposer2.rememberedValue();
            if (rememberedValue18 == neverEqualPolicy) {
                rememberedValue18 = new DateInputKt$$ExternalSyntheticLambda5(20, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue18);
            }
            Modifier onSizeChanged = RulerKt.onSizeChanged(m284requiredWidth3ABfNKs2, (Function1) rememberedValue18);
            Object rememberedValue19 = gapComposer2.rememberedValue();
            if (rememberedValue19 == neverEqualPolicy) {
                rememberedValue19 = new Yoga$$ExternalSyntheticLambda0(10);
                gapComposer2.updateRememberedValue(rememberedValue19);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(onSizeChanged, (Function1) rememberedValue19);
            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
            Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Room.m1165Text25TpFw(2, 1, 0, 3, ((i4 >> 3) & 14) | 1769472, 0, 3728, colors2.semantic.text.standard, (Composer) gapComposer2, clearAndSetSemantics, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer2.end(true);
            gapComposer = gapComposer2;
            j5 = j9;
            j4 = j8;
        } else {
            gapComposer2.skipToGroupEnd();
            j4 = j2;
            gapComposer = gapComposer2;
            j5 = j3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: app.cash.local.views.map.LocalMapPinKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    LocalMapPinKt.m1327LocalMapPinFpGtcJw(LocalMapPinState.this, str, j, str2, modifier, j4, j5, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
