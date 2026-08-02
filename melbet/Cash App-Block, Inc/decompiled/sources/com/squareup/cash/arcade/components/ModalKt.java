package com.squareup.cash.arcade.components;

import android.content.Context;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.material.ModalBottomSheetState$$ExternalSyntheticLambda1;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.SliderKt$SliderImpl$2$1;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.compose.PlayerSurfaceKt;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.media3.ui.compose.modifiers.ExtensionsKt;
import androidx.media3.ui.compose.state.PresentationStateKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.local.views.internal.LocalRadioKt$$ExternalSyntheticLambda0;
import app.cash.local.views.internal.ProgressBarKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.molecule.PlatformKt;
import app.cash.paraphrase.FormattedResource;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.viewmodels.LoadingAnimationAssets;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda7;
import com.squareup.cash.profile.views.BadgeNameKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda5;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.Tags;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class ModalKt {

    /* renamed from: lambda$-982941318, reason: not valid java name */
    public static final ComposableLambdaImpl f232lambda$982941318 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(2), false, -982941318);

    public static final void BottomNavigation(Modifier modifier, boolean z, DynamicColorConfiguration dynamicColorConfiguration, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1827423637);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(dynamicColorConfiguration) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ClipKt.clipToBounds(SizeKt.m276defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), RecyclerView.DECELERATION_RATE, 52.0f, 1)), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            composableLambdaImpl.invoke(new BottomNavigationScope(dynamicColorConfiguration), gapComposer, Integer.valueOf((i2 >> 6) & 112));
            gapComposer.end(true);
            if (z) {
                gapComposer.startReplaceGroup(2088821296);
                HorizontalDivider(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2088853009);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(modifier, z, dynamicColorConfiguration, composableLambdaImpl, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Dimmer(Modifier modifier, Function0 function0, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function0 function02;
        int i4;
        PaddingValues paddingValues2;
        Modifier modifier3;
        Function0 function03;
        RecomposeScopeImpl endRestartGroup;
        Function0 function04;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1589199638);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= gapComposer.changedInstance(function02) ? 32 : 16;
            i4 = i3 | MLKEMEngine.KyberPolyBytes;
            if ((i & 3072) == 0) {
                i4 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
            }
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                paddingValues2 = paddingValues;
                modifier3 = modifier2;
                function03 = function02;
            } else {
                modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (i6 != 0) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MotionKt$$ExternalSyntheticLambda0(21);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    function04 = (Function0) rememberedValue;
                } else {
                    function04 = function02;
                }
                PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(32.0f, 32.0f, 32.0f, 32.0f);
                Modifier fillMaxSize = SizeKt.fillMaxSize(modifier3, 1.0f);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.component.ui.dimmer.background, ColorKt.RectangleShape));
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                Modifier padding = SpacerKt.padding(ImageKt.m182clickableO2vRcR0$default(systemBarsPadding, (MutableInteractionSourceImpl) rememberedValue2, null, false, null, null, function04, 28), paddingValuesImpl);
                int i7 = (i4 & 7168) | 48;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, padding);
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
                composableLambdaImpl.invoke(BoxScopeInstance.INSTANCE, gapComposer, Integer.valueOf(((i7 >> 6) & 112) | 6));
                gapComposer.end(true);
                paddingValues2 = paddingValuesImpl;
                function03 = function04;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(modifier3, function03, paddingValues2, composableLambdaImpl, i, i2, 6);
                return;
            }
            return;
        }
        function02 = function0;
        i4 = i3 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void HorizontalDivider(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(409712903);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier, 1.0f), 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, colors.component.ui.divider.border, ColorKt.RectangleShape), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(modifier2, i, i2, 1, (byte) 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InlineMessage(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, Function3 function3, Function3 function32, Composer composer, int i, int i2) {
        int i3;
        Function3 function33;
        Function3 function34;
        RecomposeScopeImpl endRestartGroup;
        ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-345209621);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl4) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function33 = function3;
            i3 |= gapComposer.changedInstance(function33) ? 16384 : PKIFailureInfo.certRevoked;
            if ((196608 & i) == 0) {
                i3 |= gapComposer.changedInstance(function32) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                gapComposer.skipToGroupEnd();
                function34 = function33;
            } else {
                Function3 function35 = i4 != 0 ? null : function33;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer).component.modal.background, ColorKt.RectangleShape);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                if (function32 == null) {
                    gapComposer.startReplaceGroup(-1750851660);
                } else {
                    gapComposer.startReplaceGroup(-1303405075);
                    function32.invoke(ColumnScopeInstance.INSTANCE, gapComposer, Integer.valueOf(((i3 >> 12) & 112) | 6));
                }
                gapComposer.end(false);
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 24.0f);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, false, null), Alignment.Companion.CenterHorizontally, gapComposer, 54);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, Strings.getColors(gapComposer).semantic.text.standard, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446)), Expect_jvmKt.rememberComposableLambda(1426497943, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 21), gapComposer), gapComposer, 56);
                Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, Strings.getColors(gapComposer).semantic.text.subtle, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446)), Expect_jvmKt.rememberComposableLambda(2059078734, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl2, 22), gapComposer), gapComposer, 56);
                gapComposer.end(true);
                HorizontalDivider(0, 1, gapComposer, null);
                composableLambdaImpl4 = composableLambdaImpl3;
                coil3.size.SizeKt.AdaptiveStack(null, null, null, null, null, null, Expect_jvmKt.rememberComposableLambda(620382226, new BankingDialogKt$$ExternalSyntheticLambda2(1, function35, composableLambdaImpl4), gapComposer), gapComposer, 1572864, 63);
                gapComposer.end(true);
                function34 = function35;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(modifier, composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl4, function34, function32, i, i2);
                return;
            }
            return;
        }
        function33 = function3;
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Modal(Modifier modifier, Function3 function3, Function3 function32, Function3 function33, Function3 function34, Function3 function35, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function3 function36;
        int i4;
        Function3 function37;
        Function3 function38;
        Modifier modifier3;
        Function3 function39;
        Function3 function310;
        RecomposeScopeImpl endRestartGroup;
        Function3 function311;
        boolean z;
        Function3 function312;
        function3.getClass();
        function32.getClass();
        function33.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1812388235);
        Applier applier = gapComposer.applier;
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function3) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function32) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function33) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function36 = function34;
            i3 |= gapComposer.changedInstance(function36) ? 16384 : PKIFailureInfo.certRevoked;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                function37 = function35;
                i3 |= gapComposer.changedInstance(function37) ? PKIFailureInfo.unsupportedVersion : 65536;
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i5 != 0) {
                        modifier2 = companion;
                    }
                    if (i6 != 0) {
                        function36 = null;
                    }
                    if (i4 != 0) {
                        function37 = null;
                    }
                    Modifier m276defaultMinSizeVpY3zN4$default = SizeKt.m276defaultMinSizeVpY3zN4$default(modifier2, 311.0f, RecyclerView.DECELERATION_RATE, 2);
                    Strings.getSizes(gapComposer).getClass();
                    Object obj = DefaultSizes.border.entries;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m276defaultMinSizeVpY3zN4$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), Strings.getColors(gapComposer).component.modal.background, ColorKt.RectangleShape);
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
                    Function3 function313 = function37;
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                    Modifier modifier4 = modifier2;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    int i7 = i3;
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Function3 function314 = function36;
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(columnScopeInstance.weight(1.0f, companion, false), ImageKt.rememberScrollState(gapComposer), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    if (function313 == null) {
                        gapComposer.startReplaceGroup(787865246);
                        gapComposer.end(false);
                        function311 = function313;
                    } else {
                        gapComposer.startReplaceGroup(-944416317);
                        function311 = function313;
                        function311.invoke(columnScopeInstance, gapComposer, Integer.valueOf(((i7 >> 12) & 112) | 6));
                        gapComposer.end(false);
                    }
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 32.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 54);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                    Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744447)), Expect_jvmKt.rememberComposableLambda(1517578157, new ModalKt$$ExternalSyntheticLambda3(function3, 0), gapComposer), gapComposer, 56);
                    function38 = function32;
                    Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, Strings.getColors(gapComposer).semantic.text.subtle, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446)), Expect_jvmKt.rememberComposableLambda(1085539044, new ModalKt$$ExternalSyntheticLambda3(function38, 2), gapComposer), gapComposer, 56);
                    gapComposer.end(true);
                    gapComposer.end(true);
                    HorizontalDivider(0, 1, gapComposer, null);
                    function33.invoke(new ModalButtonScope(), gapComposer, Integer.valueOf((i7 >> 6) & 112));
                    if (function314 == null) {
                        gapComposer.startReplaceGroup(614444057);
                        gapComposer.end(false);
                        function312 = function314;
                        z = true;
                    } else {
                        gapComposer.startReplaceGroup(614444058);
                        z = true;
                        HorizontalDivider(0, 1, gapComposer, null);
                        function312 = function314;
                        function312.invoke(new ModalButtonScope(), gapComposer, 0);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z);
                    function310 = function311;
                    function39 = function312;
                    modifier3 = modifier4;
                } else {
                    function38 = function32;
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    function39 = function36;
                    function310 = function37;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(modifier3, function3, function38, function33, function39, function310, i, i2, 9);
                    return;
                }
                return;
            }
            function37 = function35;
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function36 = function34;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function37 = function35;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ProgressBranded(Modifier modifier, LoadingAnimationAssets loadingAnimationAssets, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Function1 function12;
        int i5;
        Modifier modifier2;
        LoadingAnimationAssets loadingAnimationAssets2;
        Function1 function13;
        MutableState mutableState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(349027627);
        if ((i & 48) == 0) {
            i3 = i | (gapComposer.changed(false) ? 32 : 16);
        } else {
            i3 = i;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i4 = i3 | MLKEMEngine.KyberPolyBytes;
        } else {
            i4 = i3 | (gapComposer.changed(loadingAnimationAssets == null ? -1 : loadingAnimationAssets.ordinal()) ? 256 : 128);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i5 = i4 | 3072;
            function12 = function1;
        } else {
            function12 = function1;
            i5 = i4 | (gapComposer.changedInstance(function12) ? 2048 : 1024);
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
            LoadingAnimationAssets loadingAnimationAssets3 = i6 != 0 ? LoadingAnimationAssets.BrandLarge : loadingAnimationAssets;
            Continuation continuation = null;
            Function1 function14 = i7 != 0 ? null : function12;
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            boolean z = !colors.isLight;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = ((i5 & 896) == 256) | gapComposer.changedInstance(context) | gapComposer.changed(z) | ((i5 & 7168) == 2048);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0((Object) context, z, (Object) loadingAnimationAssets3, mutableState2, function14, 3);
                mutableState = mutableState2;
                gapComposer.updateRememberedValue(menuKt$$ExternalSyntheticLambda0);
                rememberedValue2 = menuKt$$ExternalSyntheticLambda0;
            } else {
                mutableState = mutableState2;
            }
            DimensionKt.LifecycleStartEffect(unit, null, (Function1) rememberedValue2, gapComposer, 6);
            Boolean bool = Boolean.FALSE;
            boolean z2 = (i5 & 112) == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ToastKt$Toast$7$1(mutableState, continuation, 4);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, bool, (Function2) rememberedValue3);
            ExoPlayer exoPlayer = (ExoPlayer) mutableState.getValue();
            if (exoPlayer == null) {
                gapComposer.startReplaceGroup(-231758956);
                gapComposer.end(false);
                modifier2 = modifier;
            } else {
                gapComposer.startReplaceGroup(-231758955);
                modifier2 = modifier;
                ProgressBrandedContent(exoPlayer, modifier2, gapComposer, 48);
                gapComposer.end(false);
            }
            loadingAnimationAssets2 = loadingAnimationAssets3;
            function13 = function14;
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
            loadingAnimationAssets2 = loadingAnimationAssets;
            function13 = function12;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(modifier2, loadingAnimationAssets2, function13, i, i2, 12);
        }
    }

    public static final void ProgressBrandedContent(ExoPlayer exoPlayer, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1760362441);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(exoPlayer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            PlayerSurfaceKt.PlayerSurface(exoPlayer, ExtensionsKt.m1153resizeWithContentScaleXrYQPog(modifier, ContentScale.Companion.Inside, (Size) PresentationStateKt.rememberPresentationState(exoPlayer, gapComposer, i3).videoSizeDp$delegate.getValue(), gapComposer, ((i2 >> 3) & 14) | 48), 2, gapComposer, i3 | MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(exoPlayer, modifier, i, 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Radio(boolean z, Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        Function0 function02;
        GapComposer gapComposer;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        Modifier modifier3;
        boolean z4;
        Function0 function03;
        RecomposeScopeImpl endRestartGroup;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        int i6;
        Function0 function04;
        Modifier modifier4;
        Modifier modifier5;
        long j;
        long j2;
        ?? r14;
        Haptics.VibrationEffectFactory vibrationEffectFactory;
        long j3;
        ArrayMap arrayMap;
        MutableState mutableState;
        Function0 function05;
        MutableInteractionSourceImpl mutableInteractionSourceImpl4;
        boolean z5;
        Object obj;
        Throwable th;
        long j4;
        Function0 function06;
        Animatable animatable;
        Animatable animatable2;
        Modifier modifier6;
        Modifier.Companion companion;
        Modifier modifier7;
        boolean z6;
        Modifier modifier8;
        int i7;
        float f;
        int i8;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(426896504);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 32 : 16;
            i4 = i3 | MLKEMEngine.KyberPolyBytes;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    z3 = z2;
                    if (gapComposer2.changed(z3)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    z3 = z2;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                z3 = z2;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                function02 = function0;
                i4 |= gapComposer2.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
                if (gapComposer2.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
                    gapComposer2.startDefaults();
                    int i10 = i & 1;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Object obj2 = Composer.Companion.Empty;
                    if (i10 == 0 || gapComposer2.getDefaultsInvalid()) {
                        if (i9 != 0) {
                            modifier2 = companion2;
                        }
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (rememberedValue == obj2) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                        }
                        mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
                        if ((i2 & 8) != 0) {
                            z3 = ((Boolean) gapComposer2.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            modifier4 = modifier2;
                            i6 = i4;
                            function04 = null;
                        } else {
                            Modifier modifier9 = modifier2;
                            i6 = i4;
                            function04 = function02;
                            modifier4 = modifier9;
                        }
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i4 &= -7169;
                        }
                        Modifier modifier10 = modifier2;
                        i6 = i4;
                        function04 = function02;
                        modifier4 = modifier10;
                        mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                    }
                    gapComposer2.endDefaults();
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == obj2) {
                        rememberedValue2 = new ArrayMap(1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    ArrayMap arrayMap2 = (ArrayMap) rememberedValue2;
                    if (z3) {
                        gapComposer2.startReplaceGroup(-856692185);
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        modifier5 = modifier4;
                        j = colors.component.radio.active.border.f209default;
                        gapComposer2.end(false);
                    } else {
                        modifier5 = modifier4;
                        gapComposer2.startReplaceGroup(-856604858);
                        Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = colors2.component.radio.active.border.disabled;
                        gapComposer2.end(false);
                    }
                    if (z3) {
                        gapComposer2.startReplaceGroup(-856476859);
                        Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j2 = colors3.component.radio.inactive.border.f211default;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-856387548);
                        Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j2 = colors4.component.radio.inactive.border.disabled;
                        gapComposer2.end(false);
                    }
                    Function0 rememberHapticTrigger = PlatformKt.rememberHapticTrigger(null, gapComposer2, 1);
                    if (z) {
                        gapComposer2.startReplaceGroup(-2069304034);
                        vibrationEffectFactory = ((Haptics) gapComposer2.consume(HapticsKt.LocalHaptics)).input.subtle;
                        r14 = 0;
                    } else {
                        r14 = 0;
                        gapComposer2.startReplaceGroup(-2069302977);
                        vibrationEffectFactory = ((Haptics) gapComposer2.consume(HapticsKt.LocalHaptics)).success;
                    }
                    gapComposer2.end(r14);
                    Function0 rememberHapticTrigger2 = PlatformKt.rememberHapticTrigger(vibrationEffectFactory, gapComposer2, r14);
                    MutableState rememberUpdatedState = Updater.rememberUpdatedState(function04, gapComposer2);
                    long j5 = j2;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = MotionKt.LocalMotion;
                    SpringSpec sharp$default = TargetUtils.sharp$default((zzb) ((Motion) gapComposer2.consume(staticProvidableCompositionLocal)).springs.text);
                    SpringSpec sharp$default2 = TargetUtils.sharp$default((zzb) ((Motion) gapComposer2.consume(staticProvidableCompositionLocal)).springs.text);
                    boolean isInScreenshotTest = UtilsKt.isInScreenshotTest(gapComposer2);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == obj2) {
                        rememberedValue3 = AnimatableKt.Animatable(z ? 1.0f : RecyclerView.DECELERATION_RATE, 0.01f);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Animatable animatable3 = (Animatable) rememberedValue3;
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (rememberedValue4 == obj2) {
                        if (z) {
                            j3 = j;
                            f = 8.0f;
                        } else {
                            j3 = j;
                            f = 1.0f;
                        }
                        mutableState = rememberUpdatedState;
                        arrayMap = arrayMap2;
                        rememberedValue4 = new Animatable(new Dp(f), AnimatableKt.DpToVector, (Object) null, 12);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    } else {
                        j3 = j;
                        arrayMap = arrayMap2;
                        mutableState = rememberUpdatedState;
                    }
                    Animatable animatable4 = (Animatable) rememberedValue4;
                    Object[] objArr = {mutableInteractionSourceImpl3, Boolean.valueOf(z3), function04, rememberHapticTrigger};
                    boolean changed = ((((i6 & 7168) ^ 3072) > 2048 && gapComposer2.changed(z3)) || (i6 & 3072) == 2048) | ((57344 & i6) == 16384) | ((i6 & 896) == 256) | gapComposer2.changed(rememberHapticTrigger);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue5 == obj2) {
                        function05 = function04;
                        mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                        z5 = z3;
                        rememberedValue5 = new RoomDatabase$performClear$1.AnonymousClass1(z5, function05, mutableInteractionSourceImpl4, rememberHapticTrigger, (Continuation) null, 5);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    } else {
                        function05 = function04;
                        mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                        z5 = z3;
                    }
                    Updater.LaunchedEffect(objArr, (Function2) rememberedValue5, gapComposer2);
                    Boolean valueOf = Boolean.valueOf(z);
                    boolean changed2 = gapComposer2.changed(isInScreenshotTest) | ((i6 & 14) == 4) | gapComposer2.changedInstance(animatable4) | gapComposer2.changed(sharp$default2) | gapComposer2.changedInstance(animatable3) | gapComposer2.changed(sharp$default);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue6 == obj2) {
                        obj = obj2;
                        th = null;
                        j4 = j5;
                        function06 = rememberHapticTrigger2;
                        RadioKt$Radio$3$1 radioKt$Radio$3$1 = new RadioKt$Radio$3$1(isInScreenshotTest, z, animatable4, sharp$default2, animatable3, sharp$default, null);
                        animatable = animatable4;
                        animatable2 = animatable3;
                        gapComposer2.updateRememberedValue(radioKt$Radio$3$1);
                        rememberedValue6 = radioKt$Radio$3$1;
                    } else {
                        j4 = j5;
                        animatable2 = animatable3;
                        animatable = animatable4;
                        th = null;
                        function06 = rememberHapticTrigger2;
                        obj = obj2;
                    }
                    Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue6);
                    Modifier modifier11 = modifier5;
                    Modifier recordVerticalCenter = AlignmentLinesKt.recordVerticalCenter(SizeKt.m285size3ABfNKs(modifier11, 24.0f), AlignmentLinesKt.FirstLineCenter, arrayMap);
                    if (!z5 || function05 == null) {
                        modifier6 = modifier11;
                        gapComposer = gapComposer2;
                        companion = companion2;
                        modifier7 = recordVerticalCenter;
                        z6 = false;
                        gapComposer.startReplaceGroup(278110920);
                        gapComposer.end(false);
                        modifier8 = companion;
                    } else {
                        gapComposer2.startReplaceGroup(277749305);
                        modifier6 = modifier11;
                        modifier7 = recordVerticalCenter;
                        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer2, 432, 9);
                        gapComposer = gapComposer2;
                        Role role = new Role(3);
                        MutableState mutableState2 = mutableState;
                        boolean changed3 = gapComposer.changed(function06) | gapComposer.changed(mutableState2);
                        Object rememberedValue7 = gapComposer.rememberedValue();
                        if (changed3 || rememberedValue7 == obj) {
                            rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda7(function06, mutableState2, 1);
                            gapComposer.updateRememberedValue(rememberedValue7);
                        }
                        companion = companion2;
                        modifier8 = SelectableKt.m334selectableO2vRcR0(companion, z, mutableInteractionSourceImpl4, m3400rippleYJYuY3k, true, role, (Function0) rememberedValue7);
                        z6 = false;
                        gapComposer.end(false);
                    }
                    Modifier then = modifier7.then(modifier8);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z6);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw th;
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
                    if (z5 || !z) {
                        i7 = 0;
                        gapComposer.startReplaceGroup(1609074063);
                        BoxKt.Box(ImageKt.m178borderxT4_qwU(SizeKt.m285size3ABfNKs(companion, 24.0f), 1.0f, j4, RoundedCornerShapeKt.CircleShape), gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1609228784);
                        i7 = 0;
                        gapComposer.end(false);
                    }
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    boolean changedInstance = gapComposer.changedInstance(animatable2);
                    Object rememberedValue8 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue8 == obj) {
                        rememberedValue8 = new RadioKt$$ExternalSyntheticLambda1(animatable2, i7);
                        gapComposer.updateRememberedValue(rememberedValue8);
                    }
                    BoxKt.Box(ImageKt.m178borderxT4_qwU(ColorKt.graphicsLayer(m285size3ABfNKs, (Function1) rememberedValue8), ((Dp) animatable.getValue()).value, j3, RoundedCornerShapeKt.CircleShape), gapComposer, i7);
                    gapComposer.end(true);
                    modifier3 = modifier6;
                    z4 = z5;
                    function03 = function05;
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl4;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                    modifier3 = modifier2;
                    z4 = z3;
                    function03 = function02;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new LocalRadioKt$$ExternalSyntheticLambda0(z, modifier3, mutableInteractionSourceImpl2, z4, function03, i, i2, 1);
                    return;
                }
                return;
            }
            function02 = function0;
            if (gapComposer2.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i3 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) != 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function02 = function0;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void RootContainer(final ImmutableList immutableList, final ComposableLambdaImpl composableLambdaImpl, final int i, final Function1 function1, final Modifier modifier, Composer composer, final int i2) {
        int i3;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(701890710);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(immutableList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (immutableList.size() <= 0) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    function2 = new Function2() { // from class: com.squareup.cash.arcade.components.SegmentedControlKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            int i7 = i2;
                            switch (i6) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ModalKt.RootContainer(immutableList, composableLambdaImpl, i, function1, modifier, (Composer) obj, Updater.updateChangedFlags(i7 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ModalKt.RootContainer(immutableList, composableLambdaImpl, i, function1, modifier, (Composer) obj, Updater.updateChangedFlags(i7 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            int i6 = i3;
            int i7 = i6 & 14;
            boolean z = i7 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SliderKt$SliderImpl$2$1(immutableList, i4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            int i8 = i6 >> 3;
            composableLambdaImpl.invoke(gapComposer, Integer.valueOf(i8 & 14));
            Segments(immutableList, i, function1, gapComposer, (i8 & 896) | (i8 & 112) | i7);
            gapComposer.end(true);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i9 = 1;
            function2 = new Function2() { // from class: com.squareup.cash.arcade.components.SegmentedControlKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i9;
                    int i72 = i2;
                    switch (i62) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ModalKt.RootContainer(immutableList, composableLambdaImpl, i, function1, modifier, (Composer) obj, Updater.updateChangedFlags(i72 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            ModalKt.RootContainer(immutableList, composableLambdaImpl, i, function1, modifier, (Composer) obj, Updater.updateChangedFlags(i72 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SegmentedControl(int i, Function1 function1, Modifier modifier, Function1 function12, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        int i5 = i;
        function1.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1824110738);
        int i6 = 4;
        if ((i2 & 6) == 0) {
            i4 = (gapComposer.changed(i5) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i4 | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i8 = i3 & 4;
        if (i8 != 0) {
            i7 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i7 |= gapComposer.changed(modifier2) ? 256 : 128;
            if ((i2 & 3072) == 0) {
                i7 |= gapComposer.changedInstance(function12) ? 2048 : 1024;
            }
            if (gapComposer.shouldExecute(i7 & 1, (i7 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
            } else {
                if (i8 != 0) {
                    modifier2 = Modifier.Companion.$$INSTANCE;
                }
                Integer valueOf = Integer.valueOf(i5);
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (rememberedValue == obj) {
                    rememberedValue = new FlowStarter$$ExternalSyntheticLambda0(i6);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function13 = (Function1) rememberedValue;
                SpringSpec springSpec = new SpringSpec(null, 7);
                DecayAnimationSpecImpl exponentialDecay$default = AnimatableKt.exponentialDecay$default();
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = new BorderKt$$ExternalSyntheticLambda1(18);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function1 function14 = (Function1) rememberedValue2;
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == obj) {
                    ModalBottomSheetState$$ExternalSyntheticLambda1 modalBottomSheetState$$ExternalSyntheticLambda1 = new ModalBottomSheetState$$ExternalSyntheticLambda1(density, 3);
                    AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(function14, valueOf);
                    anchoredDraggableState.positionalThreshold = function13;
                    anchoredDraggableState.velocityThreshold = modalBottomSheetState$$ExternalSyntheticLambda1;
                    anchoredDraggableState.snapAnimationSpec = springSpec;
                    anchoredDraggableState.decayAnimationSpec = exponentialDecay$default;
                    gapComposer.updateRememberedValue(anchoredDraggableState);
                    rememberedValue3 = anchoredDraggableState;
                }
                Object obj2 = (AnchoredDraggableState) rememberedValue3;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == obj) {
                    rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue4;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == obj) {
                    rememberedValue5 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Object obj3 = (CoroutineScope) rememberedValue5;
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == obj) {
                    rememberedValue6 = new RealSegmentedControlScope();
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                RealSegmentedControlScope realSegmentedControlScope = (RealSegmentedControlScope) rememberedValue6;
                SnapshotStateList snapshotStateList = realSegmentedControlScope.segments;
                snapshotStateList.clear();
                function12.invoke(realSegmentedControlScope);
                if (i5 < 0 || i5 > snapshotStateList.size()) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "selectedIndex ", " outside the bounds of the number of segments."));
                    return;
                }
                boolean changed = gapComposer.changed(obj2) | ((i7 & 112) == 32);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (changed || rememberedValue7 == obj) {
                    rememberedValue7 = new MLKitTitleGenerator$prepareModel$1(obj2, function1, null, 15);
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                Updater.LaunchedEffect(gapComposer, obj2, (Function2) rememberedValue7);
                int i9 = i7;
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.m276defaultMinSizeVpY3zN4$default(modifier2, 375.0f, RecyclerView.DECELERATION_RATE, 2), ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(m300paddingVpY3zN4$default, colors.component.segmentedControl.background, RoundedCornerShapeKt.CircleShape), 2.0f);
                boolean changed2 = gapComposer.changed(realSegmentedControlScope) | gapComposer.changed(obj2);
                Object rememberedValue8 = gapComposer.rememberedValue();
                int i10 = 6;
                if (changed2 || rememberedValue8 == obj) {
                    rememberedValue8 = new BadgeQueries$$ExternalSyntheticLambda0(i10, realSegmentedControlScope, obj2);
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                Modifier onSizeChanged = RulerKt.onSizeChanged(m298padding3ABfNKs, (Function1) rememberedValue8);
                ImmutableList immutableList = Tags.toImmutableList(snapshotStateList);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1795050209, new BadgeKt$$ExternalSyntheticLambda2(2, obj2, mutableInteractionSourceImpl), gapComposer);
                boolean changedInstance = gapComposer.changedInstance(obj3) | gapComposer.changed(obj2);
                Object rememberedValue9 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue9 == obj) {
                    rememberedValue9 = new BadgeQueries$$ExternalSyntheticLambda0(7, obj3, obj2);
                    gapComposer.updateRememberedValue(rememberedValue9);
                }
                RootContainer(immutableList, rememberComposableLambda, i5, (Function1) rememberedValue9, onSizeChanged, gapComposer, ((i9 << 6) & 896) | 48);
                i5 = i5;
            }
            Modifier modifier3 = modifier2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new BadgeNameKt$$ExternalSyntheticLambda1(i5, function1, modifier3, function12, i2, i3);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 3072) == 0) {
        }
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 1171) == 1170)) {
        }
        Modifier modifier32 = modifier2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Segments(ImmutableList immutableList, int i, Function1 function1, Composer composer, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        Function2 function2;
        BiasAlignment biasAlignment;
        Modifier modifier;
        ImmutableList immutableList2 = immutableList;
        int i6 = i;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-486041119);
        Applier applier = gapComposer.applier;
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(immutableList2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i7 = 32;
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(i6) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        boolean z2 = true;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier height = OffsetKt.height(SizeKt.m279heightInVpY3zN4$default(modifier2, 32.0f, RecyclerView.DECELERATION_RATE, 2), IntrinsicSize.Max);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, height);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1744735693);
            int size = immutableList2.size();
            int i8 = 0;
            while (i8 < size) {
                Function2 function22 = (Function2) immutableList2.get(i8);
                BiasAlignment biasAlignment2 = Alignment.Companion.Center;
                Modifier clip = ClipKt.clip(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxHeight(modifier2, 1.0f), z2), RoundedCornerShapeKt.CircleShape);
                boolean changed = gapComposer.changed(i8) | ((i3 & 112) == i7 ? z2 : false);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changed || rememberedValue == neverEqualPolicy) {
                    z = false;
                    rememberedValue = new SegmentedControlKt$$ExternalSyntheticLambda8(i8, i6, 0 == true ? 1 : 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    z = false;
                }
                Modifier semantics = SemanticsModifierKt.semantics(clip, z2, (Function1) rememberedValue);
                if (i8 != i6) {
                    gapComposer.startReplaceGroup(-1458148811);
                    i4 = size;
                    i5 = i8;
                    function2 = function22;
                    biasAlignment = biasAlignment2;
                    modifier = modifier2;
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15);
                    boolean changed2 = gapComposer.changed(i5) | ((i3 & 896) == 256);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new TabContentViewKt$$ExternalSyntheticLambda18(i5, 4, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    modifier2 = ImageKt.m182clickableO2vRcR0$default(modifier, null, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue2, 28);
                    z = false;
                    gapComposer.end(false);
                } else {
                    i4 = size;
                    i5 = i8;
                    function2 = function22;
                    biasAlignment = biasAlignment2;
                    modifier = modifier2;
                    gapComposer.startReplaceGroup(-1457964237);
                    gapComposer.end(z);
                }
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(semantics.then(modifier2), 12.0f, 4.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                ProvidedValue defaultProvidedValue$runtime = ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z);
                }
                Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(colors.component.segmentedControl.button.text, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(-1683484181, new ToastKt$$ExternalSyntheticLambda11(4, function2), gapComposer), gapComposer, 56);
                gapComposer.end(true);
                i8 = i5 + 1;
                immutableList2 = immutableList;
                size = i4;
                z2 = true;
                modifier2 = modifier;
                i7 = 32;
                i6 = i;
            }
            gapComposer.end(false);
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(i, i2, 5, immutableList, function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: Toast-BAHpl2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3380ToastBAHpl2s(Modifier modifier, Object obj, ComposableLambdaImpl composableLambdaImpl, Function3 function3, Function2 function2, Function3 function32, Function0 function0, Duration duration, Composer composer, int i, int i2) {
        int i3;
        Object obj2;
        int i4;
        Function3 function33;
        int i5;
        Function2 function22;
        int i6;
        int i7;
        int i8;
        int i9;
        Duration duration2;
        Object obj3;
        GapComposer gapComposer;
        Function3 function34;
        Function2 function23;
        Function3 function35;
        Function0 function02;
        RecomposeScopeImpl endRestartGroup;
        int i10;
        Function3 function36;
        Function0 function03;
        int i11;
        long duration3;
        Function0 function04;
        MutableState mutableState;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(484639749);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            obj2 = obj;
            i3 |= gapComposer2.changedInstance(obj2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer2.changedInstance(composableLambdaImpl) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function33 = function3;
                i3 |= gapComposer2.changedInstance(function33) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function22 = function2;
                    i3 |= gapComposer2.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= gapComposer2.changedInstance(function32) ? PKIFailureInfo.unsupportedVersion : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i9 = i8;
                            i3 |= gapComposer2.changed(duration) ? 8388608 : 4194304;
                            if ((i2 & 256) == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i3 |= gapComposer2.changed(false) ? 67108864 : 33554432;
                            }
                            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 38347923) == 38347922)) {
                                gapComposer2.skipToGroupEnd();
                                duration2 = duration;
                                obj3 = obj2;
                                gapComposer = gapComposer2;
                                function34 = function33;
                                function23 = function22;
                                function35 = function32;
                                function02 = function0;
                            } else {
                                Object obj4 = i12 != 0 ? Unit.INSTANCE : obj2;
                                Continuation continuation = null;
                                Function3 function37 = i4 != 0 ? null : function33;
                                Function2 function24 = i5 != 0 ? null : function22;
                                if (i6 != 0) {
                                    i10 = i7;
                                    function36 = null;
                                } else {
                                    i10 = i7;
                                    function36 = function32;
                                }
                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                if (i10 != 0) {
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (rememberedValue == neverEqualPolicy) {
                                        rememberedValue = new MotionKt$$ExternalSyntheticLambda0(23);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    function03 = (Function0) rememberedValue;
                                } else {
                                    function03 = function0;
                                }
                                Duration duration4 = i9 != 0 ? null : duration;
                                boolean booleanValue = ((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                if (rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = Recorder$$ExternalSyntheticOutline1.m(booleanValue, gapComposer2);
                                }
                                MutableState mutableState2 = (MutableState) rememberedValue2;
                                Object rememberedValue3 = gapComposer2.rememberedValue();
                                if (rememberedValue3 == neverEqualPolicy) {
                                    rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                                    gapComposer2.updateRememberedValue(rememberedValue3);
                                }
                                MutableState mutableState3 = (MutableState) rememberedValue3;
                                Object rememberedValue4 = gapComposer2.rememberedValue();
                                if (rememberedValue4 == neverEqualPolicy) {
                                    i11 = i3;
                                    rememberedValue4 = new ToastKt$Toast$7$1(mutableState2, continuation, 0);
                                    gapComposer2.updateRememberedValue(rememberedValue4);
                                } else {
                                    i11 = i3;
                                }
                                Updater.LaunchedEffect(gapComposer2, obj4, (Function2) rememberedValue4);
                                if (duration4 != null) {
                                    duration3 = duration4.rawValue;
                                } else if (function36 == null) {
                                    Duration.Companion companion = Duration.Companion;
                                    duration3 = DurationKt.toDuration(3, DurationUnit.SECONDS);
                                } else {
                                    Duration.Companion companion2 = Duration.Companion;
                                    duration3 = DurationKt.toDuration(5, DurationUnit.SECONDS);
                                }
                                Object[] objArr = {obj4, function36, new Duration(duration3), function03};
                                Object obj5 = obj4;
                                int i13 = i11 & 3670016;
                                long j = duration3;
                                boolean changed = gapComposer2.changed(duration3) | (i13 == 1048576);
                                Object rememberedValue5 = gapComposer2.rememberedValue();
                                if (changed || rememberedValue5 == neverEqualPolicy) {
                                    Function0 function05 = function03;
                                    rememberedValue5 = new ToastKt$Toast$8$1(j, function05, mutableState2, (Continuation) null, 0);
                                    function04 = function05;
                                    mutableState = mutableState2;
                                    gapComposer2.updateRememberedValue(rememberedValue5);
                                } else {
                                    function04 = function03;
                                    mutableState = mutableState2;
                                }
                                Updater.LaunchedEffect(objArr, (Function2) rememberedValue5, gapComposer2);
                                Boolean bool = (Boolean) mutableState.getValue();
                                bool.getClass();
                                boolean z = i13 == 1048576;
                                Object rememberedValue6 = gapComposer2.rememberedValue();
                                if (z || rememberedValue6 == neverEqualPolicy) {
                                    rememberedValue6 = new ToastKt$Toast$9$1(function04, mutableState, mutableState3, null, 0);
                                    gapComposer2.updateRememberedValue(rememberedValue6);
                                }
                                Updater.LaunchedEffect(gapComposer2, bool, (Function2) rememberedValue6);
                                Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                                boolean booleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal = MotionKt.LocalMotion;
                                EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(TargetUtils.fast$default((zzb) ((Motion) gapComposer2.consume(staticProvidableCompositionLocal)).springs.text), 2);
                                SpringSpec urgent$default = ImageUtil.urgent$default((zzc) ((Motion) gapComposer2.consume(staticProvidableCompositionLocal)).springs.resultMetadata);
                                boolean changed2 = gapComposer2.changed(density);
                                Object rememberedValue7 = gapComposer2.rememberedValue();
                                if (changed2 || rememberedValue7 == neverEqualPolicy) {
                                    rememberedValue7 = new ToastKt$$ExternalSyntheticLambda5(density, 0);
                                    gapComposer2.updateRememberedValue(rememberedValue7);
                                }
                                EnterTransitionImpl plus = fadeIn$default.plus(EnterExitTransitionKt.slideInVertically(urgent$default, (Function1) rememberedValue7));
                                ExitTransitionImpl fadeOut$default = EnterExitTransitionKt.fadeOut$default(TargetUtils.soft$default((zzb) ((Motion) gapComposer2.consume(staticProvidableCompositionLocal)).springs.text), 2);
                                SpringSpec soft$default = TargetUtils.soft$default((zzb) ((Motion) gapComposer2.consume(staticProvidableCompositionLocal)).springs.text);
                                boolean changed3 = gapComposer2.changed(density);
                                Object rememberedValue8 = gapComposer2.rememberedValue();
                                if (changed3 || rememberedValue8 == neverEqualPolicy) {
                                    rememberedValue8 = new ToastKt$$ExternalSyntheticLambda5(density, 2);
                                    gapComposer2.updateRememberedValue(rememberedValue8);
                                }
                                AnimatedContentKt.AnimatedVisibility(booleanValue2, modifier, plus, fadeOut$default.plus(EnterExitTransitionKt.slideOutVertically(soft$default, (Function1) rememberedValue8)), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-1173161939, new SwipeToDismissKt$$ExternalSyntheticLambda2((Object) function37, composableLambdaImpl, (Object) function24, (Object) function36, mutableState, 4), gapComposer2), (Composer) gapComposer2, ((i11 << 3) & 112) | 196608, 16);
                                gapComposer = gapComposer2;
                                duration2 = duration4;
                                function34 = function37;
                                function23 = function24;
                                function35 = function36;
                                function02 = function04;
                                obj3 = obj5;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new ToastKt$$ExternalSyntheticLambda8(modifier, obj3, composableLambdaImpl, function34, function23, function35, function02, duration2, i, i2);
                                return;
                            }
                            return;
                        }
                        i9 = i8;
                        if ((i2 & 256) == 0) {
                        }
                        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 38347923) == 38347922)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    if ((i2 & 256) == 0) {
                    }
                    if (gapComposer2.shouldExecute(i3 & 1, (i3 & 38347923) == 38347922)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function22 = function2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i8;
                if ((i2 & 256) == 0) {
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 38347923) == 38347922)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function33 = function3;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function22 = function2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i8;
            if ((i2 & 256) == 0) {
            }
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 38347923) == 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj2 = obj;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function33 = function3;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function22 = function2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i2 & 256) == 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 38347923) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Toggle(boolean z, Modifier modifier, Function1 function1, boolean z2, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z3;
        int i4;
        Function3 function32;
        Modifier modifier3;
        Function3 function33;
        RecomposeScopeImpl endRestartGroup;
        boolean z4;
        boolean z5;
        final Function3 function34;
        int i5;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1655953268);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    z3 = z2;
                    if (gapComposer.changed(z3)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    z3 = z2;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                z3 = z2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function32 = function3;
                i3 |= gapComposer.changedInstance(function32) ? 16384 : PKIFailureInfo.certRevoked;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        modifier3 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
                            z4 = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                            i3 &= -7169;
                        } else {
                            z4 = z3;
                        }
                        if (i4 != 0) {
                            z5 = z4;
                            function34 = f232lambda$982941318;
                            gapComposer.endDefaults();
                            final long j = Strings.getColors(gapComposer).component.toggle.knob.background.f224default;
                            final long j2 = Strings.getColors(gapComposer).component.toggle.knob.background.disabled;
                            long j3 = Color.Transparent;
                            long j4 = Strings.getColors(gapComposer).component.toggle.active.background.f222default;
                            int i7 = i3;
                            long j5 = Strings.getColors(gapComposer).component.toggle.inactive.background.f223default;
                            long j6 = Strings.getColors(gapComposer).component.toggle.active.background.disabled;
                            long j7 = Strings.getColors(gapComposer).component.toggle.inactive.background.disabled;
                            long value = ColorSchemeKt.getValue(SwitchTokens.SelectedIconColor, gapComposer);
                            long value2 = ColorSchemeKt.getValue(SwitchTokens.UnselectedIconColor, gapComposer);
                            long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(SwitchTokens.DisabledSelectedIconOpacity, ColorSchemeKt.getValue(SwitchTokens.DisabledSelectedIconColor, gapComposer), 14);
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ColorSchemeKt.LocalColorScheme;
                            final boolean z6 = z5;
                            SwitchKt.Switch(z, function1, SizeKt.m287sizeVpY3zN4(modifier3, 52.0f, 32.0f), Expect_jvmKt.rememberComposableLambda(442230480, new Function2() { // from class: com.squareup.cash.arcade.components.ToggleKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m281requiredSize3ABfNKs(Modifier.Companion.$$INSTANCE, 28.0f), RoundedCornerShapeKt.CircleShape), z6 ? j : j2, ColorKt.RectangleShape);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer2.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer2.startReusableNode();
                                        if (gapComposer2.inserting) {
                                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer2.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                        function34.invoke(BoxScopeInstance.INSTANCE, gapComposer2, 6);
                                        gapComposer2.end(true);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer), z5, new SwitchColors(j3, j4, j3, value, j3, j5, j3, value2, j3, j6, j3, ColorKt.m684compositeOverOWjLjI(m675copywmQWz5c$default, ((ColorScheme) gapComposer.consume(staticProvidableCompositionLocal)).surface), j3, j7, j3, ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(SwitchTokens.DisabledUnselectedIconOpacity, ColorSchemeKt.getValue(SwitchTokens.DisabledUnselectedIconColor, gapComposer), 14), ((ColorScheme) gapComposer.consume(staticProvidableCompositionLocal)).surface)), gapComposer, (i7 & 14) | 3072 | ((i7 >> 3) & 112) | (57344 & (i7 << 3)), 64);
                            z3 = z5;
                            function33 = function34;
                        } else {
                            z5 = z4;
                        }
                    } else {
                        gapComposer.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier3 = modifier2;
                        z5 = z3;
                    }
                    function34 = function32;
                    gapComposer.endDefaults();
                    final long j8 = Strings.getColors(gapComposer).component.toggle.knob.background.f224default;
                    final long j22 = Strings.getColors(gapComposer).component.toggle.knob.background.disabled;
                    long j32 = Color.Transparent;
                    long j42 = Strings.getColors(gapComposer).component.toggle.active.background.f222default;
                    int i72 = i3;
                    long j52 = Strings.getColors(gapComposer).component.toggle.inactive.background.f223default;
                    long j62 = Strings.getColors(gapComposer).component.toggle.active.background.disabled;
                    long j72 = Strings.getColors(gapComposer).component.toggle.inactive.background.disabled;
                    long value3 = ColorSchemeKt.getValue(SwitchTokens.SelectedIconColor, gapComposer);
                    long value22 = ColorSchemeKt.getValue(SwitchTokens.UnselectedIconColor, gapComposer);
                    long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(SwitchTokens.DisabledSelectedIconOpacity, ColorSchemeKt.getValue(SwitchTokens.DisabledSelectedIconColor, gapComposer), 14);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ColorSchemeKt.LocalColorScheme;
                    final boolean z62 = z5;
                    SwitchKt.Switch(z, function1, SizeKt.m287sizeVpY3zN4(modifier3, 52.0f, 32.0f), Expect_jvmKt.rememberComposableLambda(442230480, new Function2() { // from class: com.squareup.cash.arcade.components.ToggleKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m281requiredSize3ABfNKs(Modifier.Companion.$$INSTANCE, 28.0f), RoundedCornerShapeKt.CircleShape), z62 ? j8 : j22, ColorKt.RectangleShape);
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer2.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer2.startReusableNode();
                                if (gapComposer2.inserting) {
                                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer2.useNode();
                                }
                                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                function34.invoke(BoxScopeInstance.INSTANCE, gapComposer2, 6);
                                gapComposer2.end(true);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), z5, new SwitchColors(j32, j42, j32, value3, j32, j52, j32, value22, j32, j62, j32, ColorKt.m684compositeOverOWjLjI(m675copywmQWz5c$default2, ((ColorScheme) gapComposer.consume(staticProvidableCompositionLocal2)).surface), j32, j72, j32, ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(SwitchTokens.DisabledUnselectedIconOpacity, ColorSchemeKt.getValue(SwitchTokens.DisabledUnselectedIconColor, gapComposer), 14), ((ColorScheme) gapComposer.consume(staticProvidableCompositionLocal2)).surface)), gapComposer, (i72 & 14) | 3072 | ((i72 >> 3) & 112) | (57344 & (i72 << 3)), 64);
                    z3 = z5;
                    function33 = function34;
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    function33 = function32;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ProfileKt$$ExternalSyntheticLambda5(z, modifier3, function1, z3, function33, i, i2);
                    return;
                }
                return;
            }
            function32 = function3;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function32 = function3;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void VerticalDivider(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1200283787);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(SizeKt.fillMaxHeight(modifier, 1.0f), 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(m290width3ABfNKs, colors.component.ui.divider.border, ColorKt.RectangleShape), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, i3);
        }
    }

    public static FormattedResource badge_notifications_available(Long l) {
        ArrayMap arrayMap = new ArrayMap(1);
        arrayMap.put("count", l);
        return new FormattedResource(R.string.badge_notifications_available, arrayMap);
    }

    public static final void Toggle(int i, int i2, Composer composer, Modifier modifier, boolean z, boolean z2) {
        int i3;
        boolean z3;
        Modifier modifier2;
        boolean z4;
        boolean z5;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-934166593);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= ((i2 & 4) == 0 && gapComposer.changed(z2)) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i4 &= -897;
                }
                modifier3 = modifier;
                z5 = z2;
            } else {
                int i5 = i2 & 4;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i5 != 0) {
                    z2 = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                    i4 &= -897;
                }
                z5 = z2;
                modifier3 = companion;
            }
            gapComposer.endDefaults();
            z3 = z;
            Toggle(z3, modifier3, null, z5, null, gapComposer, (i4 & 14) | 432 | ((i4 << 3) & 7168), 16);
            modifier2 = modifier3;
            z4 = z5;
        } else {
            z3 = z;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            z4 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToggleKt$$ExternalSyntheticLambda2(z3, modifier2, z4, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InlineMessage(Modifier modifier, String str, String str2, ComposableLambdaImpl composableLambdaImpl, Function3 function3, Function3 function32, Composer composer, int i, int i2) {
        int i3;
        Function3 function33;
        int i4;
        Function3 function34;
        Function3 function35;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1790274357);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function33 = function3;
            i3 |= gapComposer.changedInstance(function33) ? 16384 : PKIFailureInfo.certRevoked;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                function34 = function32;
                i3 |= gapComposer.changedInstance(function34) ? PKIFailureInfo.unsupportedVersion : 65536;
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    Function3 function36 = i5 != 0 ? null : function33;
                    Function3 function37 = i4 != 0 ? null : function34;
                    InlineMessage(modifier, Expect_jvmKt.rememberComposableLambda(-1240952675, new LocalHomeViewKt$$ExternalSyntheticLambda1(str, 22), gapComposer), Expect_jvmKt.rememberComposableLambda(2016898044, new LocalHomeViewKt$$ExternalSyntheticLambda1(str2, 23), gapComposer), composableLambdaImpl, function36, function37, gapComposer, (i3 & 14) | 432 | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
                    function35 = function36;
                    function34 = function37;
                } else {
                    gapComposer.skipToGroupEnd();
                    function35 = function33;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ModalKt$$ExternalSyntheticLambda2(modifier, str, str2, composableLambdaImpl, function35, function34, i, i2, 1);
                    return;
                }
                return;
            }
            function34 = function32;
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function33 = function3;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function34 = function32;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Modal(Modifier modifier, String str, String str2, ComposableLambdaImpl composableLambdaImpl, Function3 function3, Function3 function32, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function3 function33;
        int i4;
        Function3 function34;
        Function3 function35;
        Function3 function36;
        RecomposeScopeImpl endRestartGroup;
        int i5;
        Modifier modifier3;
        str.getClass();
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(524249643);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function33 = function3;
            i3 |= gapComposer.changedInstance(function33) ? 16384 : PKIFailureInfo.certRevoked;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                function34 = function32;
                i3 |= gapComposer.changedInstance(function34) ? PKIFailureInfo.unsupportedVersion : 65536;
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    if (i6 != 0) {
                        modifier3 = Modifier.Companion.$$INSTANCE;
                        i5 = i4;
                    } else {
                        i5 = i4;
                        modifier3 = modifier2;
                    }
                    Function3 function37 = i7 != 0 ? null : function33;
                    Function3 function38 = i5 != 0 ? null : function34;
                    Modal(modifier3, Expect_jvmKt.rememberComposableLambda(-391224452, new LocalHomeViewKt$$ExternalSyntheticLambda1(str, 24), gapComposer), Expect_jvmKt.rememberComposableLambda(-1253528613, new LocalHomeViewKt$$ExternalSyntheticLambda1(str2, 25), gapComposer), composableLambdaImpl, function37, function38, gapComposer, (i3 & 14) | 432 | (i3 & 7168) | (57344 & i3) | (458752 & i3), 0);
                    modifier2 = modifier3;
                    function35 = function37;
                    function36 = function38;
                } else {
                    gapComposer.skipToGroupEnd();
                    function35 = function33;
                    function36 = function34;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ModalKt$$ExternalSyntheticLambda2(modifier2, str, str2, composableLambdaImpl, function35, function36, i, i2, 0);
                    return;
                }
                return;
            }
            function34 = function32;
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function33 = function3;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function34 = function32;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0065  */
    /* renamed from: Toast-BAHpl2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3381ToastBAHpl2s(Modifier modifier, Object obj, String str, Function3 function3, String str2, Function0 function0, Duration duration, Composer composer, int i, int i2) {
        int i3;
        Object obj2;
        int i4;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        int i9;
        GapComposer gapComposer;
        Modifier modifier2;
        Function3 function32;
        Duration duration2;
        Object obj3;
        String str4;
        Function0 function02;
        RecomposeScopeImpl endRestartGroup;
        int i10;
        Object obj4;
        Function0 function03;
        ComposableLambdaImpl composableLambdaImpl;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1874280120);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            obj2 = obj;
            i3 |= gapComposer2.changedInstance(obj2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer2.changed(str) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= gapComposer2.changedInstance(function3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    str3 = str2;
                    i3 |= gapComposer2.changed(str3) ? 16384 : PKIFailureInfo.certRevoked;
                    int i13 = 196608 | i3;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i13 = 1769472 | i3;
                    } else if ((1572864 & i) == 0) {
                        i13 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i13 |= 12582912;
                            i8 = i11;
                        } else {
                            i8 = i11;
                            if ((i & 12582912) == 0) {
                                i13 |= gapComposer2.changed(duration) ? 8388608 : 4194304;
                            }
                        }
                        i9 = i13 | 100663296;
                        int i14 = 0;
                        if (gapComposer2.shouldExecute(i9 & 1, (i9 & 38347923) != 38347922)) {
                            Modifier modifier3 = i8 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                            if (i12 != 0) {
                                obj4 = Unit.INSTANCE;
                                i10 = i5;
                            } else {
                                i10 = i5;
                                obj4 = obj2;
                            }
                            Function3 function33 = i4 != 0 ? null : function3;
                            String str5 = i10 != 0 ? null : str3;
                            if (i6 != 0) {
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = new MotionKt$$ExternalSyntheticLambda0(22);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                function03 = (Function0) rememberedValue;
                            } else {
                                function03 = function0;
                            }
                            Duration duration3 = i7 != 0 ? null : duration;
                            if (str5 == null) {
                                gapComposer2.startReplaceGroup(2104629358);
                                gapComposer2.end(false);
                                composableLambdaImpl = null;
                            } else {
                                gapComposer2.startReplaceGroup(2104629359);
                                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-246588389, new ToastKt$$ExternalSyntheticLambda1(str5, i14), gapComposer2);
                                gapComposer2.end(false);
                                composableLambdaImpl = rememberComposableLambda;
                            }
                            gapComposer2.startReplaceGroup(2104679578);
                            gapComposer2.end(false);
                            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1922032142, new ToastKt$$ExternalSyntheticLambda1(str, 24), gapComposer2);
                            int i15 = (i9 & 14) | MLKEMEngine.KyberPolyBytes | (i9 & 112) | (i9 & 7168) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                            gapComposer = gapComposer2;
                            Function3 function34 = function33;
                            m3380ToastBAHpl2s(modifier3, obj4, rememberComposableLambda2, function34, composableLambdaImpl, null, function03, duration3, gapComposer, i15, 0);
                            str4 = str5;
                            modifier2 = modifier3;
                            obj3 = obj4;
                            function32 = function34;
                            function02 = function03;
                            duration2 = duration3;
                        } else {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            modifier2 = modifier;
                            function32 = function3;
                            duration2 = duration;
                            obj3 = obj2;
                            str4 = str3;
                            function02 = function0;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new ToastKt$$ExternalSyntheticLambda3(modifier2, obj3, str, function32, str4, function02, duration2, i, i2);
                            return;
                        }
                        return;
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i9 = i13 | 100663296;
                    int i142 = 0;
                    if (gapComposer2.shouldExecute(i9 & 1, (i9 & 38347923) != 38347922)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                str3 = str2;
                int i132 = 196608 | i3;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i9 = i132 | 100663296;
                int i1422 = 0;
                if (gapComposer2.shouldExecute(i9 & 1, (i9 & 38347923) != 38347922)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str3 = str2;
            int i1322 = 196608 | i3;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i9 = i1322 | 100663296;
            int i14222 = 0;
            if (gapComposer2.shouldExecute(i9 & 1, (i9 & 38347923) != 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj2 = obj;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str3 = str2;
        int i13222 = 196608 | i3;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i9 = i13222 | 100663296;
        int i142222 = 0;
        if (gapComposer2.shouldExecute(i9 & 1, (i9 & 38347923) != 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
