package com.squareup.cash.common.composeui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda7;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda5;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1;
import androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.SwitchKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0;
import coil3.memory.RealWeakMemoryCache;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.trace.model.SpanEvent;
import com.fillr.e;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadq;
import com.google.android.gms.internal.mlkit_vision_face.zzmn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Emojis;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda9;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.avatar.components.AvatarKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.checks.ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.common.composeui.SegmentedCircleConfig;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda12;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.genie.TextViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.themes.Dimen$Sp;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.tax.views.TaxToolTipViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.widget.BadgedLayout;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.ScaledSizeKt;
import com.squareup.util.emojis.EmojiEmbeddedImageResolver;
import com.squareup.util.emojis.EmojiEmbeddedImageResolverKt;
import com.valentinilk.shimmer.ShimmerBounds;
import com.valentinilk.shimmer.ShimmerKt;
import com.valentinilk.shimmer.ShimmerTheme;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public abstract class VisibleKt {
    public static final ComposableLambdaImpl lambda$2112913107;

    /* renamed from: lambda$-1770976839, reason: not valid java name */
    public static final ComposableLambdaImpl f355lambda$1770976839 = new ComposableLambdaImpl(new ComposableSingletons$CheckDepositUiFactoryKt$$ExternalSyntheticLambda0(10), false, -1770976839);
    public static final ComposableLambdaImpl lambda$669027078 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(14), false, 669027078);
    public static final ComposableLambdaImpl lambda$1286309434 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(9), false, 1286309434);

    static {
        new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(10), false, -1677356726);
        lambda$2112913107 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda7(11), false, 2112913107);
    }

    /* renamed from: ActionButton-eopBjH0, reason: not valid java name */
    public static final void m3481ActionButtoneopBjH0(String str, long j, long j2, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1606326956);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(j) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 16.0f, gapComposer);
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 1.0f), j2, ColorKt.RectangleShape), gapComposer, 0);
            Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal), companion, 16.0f, gapComposer);
            coil3.size.SizeKt.Button(function0, SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.SUBTLE, false, false, null, Expect_jvmKt.rememberComposableLambda(-119755887, new ArcadeBannerCardKt$$ExternalSyntheticLambda4(str, j, 0), gapComposer), gapComposer, ((i2 >> 9) & 14) | 1573296, 56);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBannerCardKt$$ExternalSyntheticLambda5(str, j, j2, function0, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d6  */
    /* renamed from: AnimatedAmountText-JDMA8c0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3482AnimatedAmountTextJDMA8c0(Modifier modifier, final TextStyle textStyle, final long j, int i, final AnimatedAmountTextView.Amount amount, AnimatedAmountTextView.AnimationSpeed animationSpeed, boolean z, long j2, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        TextStyle textStyle2;
        final int i5;
        boolean z2;
        int i6;
        int i7;
        final AnimatedAmountTextView.AnimationSpeed animationSpeed2;
        final Modifier modifier3;
        GapComposer gapComposer;
        final boolean z3;
        final long j3;
        RecomposeScopeImpl endRestartGroup;
        AnimatedAmountTextView.AnimationSpeed animationSpeed3;
        long j4;
        Modifier modifier4;
        AnimatedAmountTextView.AnimationSpeed animationSpeed4;
        boolean z4;
        int i8;
        int i9;
        textStyle.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1027645565);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (gapComposer2.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            textStyle2 = textStyle;
            i4 |= gapComposer2.changed(textStyle2) ? 32 : 16;
        } else {
            textStyle2 = textStyle;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                i5 = i;
                if (gapComposer2.changed(i5)) {
                    i9 = 2048;
                    i4 |= i9;
                }
            } else {
                i5 = i;
            }
            i9 = 1024;
            i4 |= i9;
        } else {
            i5 = i;
        }
        if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? gapComposer2.changed(amount) : gapComposer2.changedInstance(amount) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                if ((262144 & i2) == 0 ? gapComposer2.changed(animationSpeed) : gapComposer2.changedInstance(animationSpeed)) {
                    i8 = PKIFailureInfo.unsupportedVersion;
                    i4 |= i8;
                }
            }
            i8 = 65536;
            i4 |= i8;
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i2) == 0) {
            z2 = z;
            i4 |= gapComposer2.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 12582912;
                i7 = i10;
            } else {
                i7 = i10;
                if ((12582912 & i2) == 0) {
                    i4 |= gapComposer2.changed(j2) ? 8388608 : 4194304;
                }
            }
            if (gapComposer2.shouldExecute(i4 & 1, (4793491 & i4) == 4793490)) {
                gapComposer2.skipToGroupEnd();
                animationSpeed2 = animationSpeed;
                modifier3 = modifier2;
                gapComposer = gapComposer2;
                z3 = z2;
                j3 = j2;
            } else {
                gapComposer2.startDefaults();
                if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                    Modifier modifier5 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                        i5 = 5;
                    }
                    if ((i3 & 32) != 0) {
                        animationSpeed3 = new AnimatedAmountTextView.AnimationSpeed(15);
                        i4 &= -458753;
                    } else {
                        animationSpeed3 = animationSpeed;
                    }
                    if (i11 != 0) {
                        z2 = false;
                    }
                    if (i6 != 0) {
                        animationSpeed4 = animationSpeed3;
                        z4 = z2;
                        j4 = TextUnit.Unspecified;
                        modifier4 = modifier5;
                        gapComposer2.endDefaults();
                        int i12 = i4 << 3;
                        m3483AnimatedAmountTextImplementation5vZORyg(amount, TestTagKt.testTag(modifier4, "amountTextTag"), textStyle2, j, i5, animationSpeed4, z4, j4, gapComposer2, ((i4 >> 12) & 14) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (458752 & i4) | (3670016 & i4) | (29360128 & i4));
                        gapComposer = gapComposer2;
                        modifier3 = modifier4;
                        j3 = j4;
                        z3 = z4;
                        animationSpeed2 = animationSpeed4;
                    } else {
                        j4 = j2;
                        modifier4 = modifier5;
                        animationSpeed4 = animationSpeed3;
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                    animationSpeed4 = animationSpeed;
                    j4 = j2;
                    modifier4 = modifier2;
                }
                z4 = z2;
                gapComposer2.endDefaults();
                int i122 = i4 << 3;
                m3483AnimatedAmountTextImplementation5vZORyg(amount, TestTagKt.testTag(modifier4, "amountTextTag"), textStyle2, j, i5, animationSpeed4, z4, j4, gapComposer2, ((i4 >> 12) & 14) | (i122 & 896) | (i122 & 7168) | (i122 & 57344) | (458752 & i4) | (3670016 & i4) | (29360128 & i4));
                gapComposer = gapComposer2;
                modifier3 = modifier4;
                j3 = j4;
                z3 = z4;
                animationSpeed2 = animationSpeed4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.common.composeui.AnimatedAmountTextKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        VisibleKt.m3482AnimatedAmountTextJDMA8c0(Modifier.this, textStyle, j, i5, amount, animationSpeed2, z3, j3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), i3);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        if (gapComposer2.shouldExecute(i4 & 1, (4793491 & i4) == 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: AnimatedAmountTextImplementation-5vZORyg, reason: not valid java name */
    public static final void m3483AnimatedAmountTextImplementation5vZORyg(final AnimatedAmountTextView.Amount amount, final Modifier modifier, final TextStyle textStyle, final long j, final int i, final AnimatedAmountTextView.AnimationSpeed animationSpeed, final boolean z, final long j2, Composer composer, final int i2) {
        int i3;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1822445059);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? gapComposer2.changed(amount) : gapComposer2.changedInstance(amount) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(textStyle) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer2.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= gapComposer2.changed(i) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i2 & 196608) == 0) {
            i3 |= (i2 & PKIFailureInfo.transactionIdInUse) == 0 ? gapComposer2.changed(animationSpeed) : gapComposer2.changedInstance(animationSpeed) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= gapComposer2.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= gapComposer2.changed(j2) ? 8388608 : 4194304;
        }
        boolean z2 = false;
        if (gapComposer2.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            textStyle.getClass();
            SpanStyle spanStyle = textStyle.spanStyle;
            ParagraphStyle paragraphStyle = textStyle.paragraphStyle;
            if (!TextUnit.m1060isSpimpl(spanStyle.fontSize)) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return;
            }
            if (!TextUnit.m1060isSpimpl(paragraphStyle.lineHeight)) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return;
            }
            Dimen$Sp dimen$Sp = new Dimen$Sp(MathKt__MathJVMKt.roundToInt(TextUnit.m1059getValueimpl(spanStyle.fontSize)));
            FontWeight fontWeight = spanStyle.fontWeight;
            if (fontWeight == null) {
                fontWeight = FontWeight.Normal;
            }
            int i4 = Strings.TextThemeInfo(dimen$Sp, Intrinsics.areEqual(fontWeight, FontWeight.ExtraLight) ? R.font.cashsans_extlight : Intrinsics.areEqual(fontWeight, FontWeight.Light) ? R.font.cashsans_light : Intrinsics.areEqual(fontWeight, FontWeight.Medium) ? R.font.cashsans_medium : Intrinsics.areEqual(fontWeight, FontWeight.SemiBold) ? R.font.cashsans_semibold : Intrinsics.areEqual(fontWeight, FontWeight.Bold) ? R.font.cashsans_bold : (Intrinsics.areEqual(fontWeight, FontWeight.ExtraBold) || Intrinsics.areEqual(fontWeight, FontWeight.Black)) ? R.font.cashsans_black : R.font.cashsans_regular, new Dimen$Sp(MathKt__MathJVMKt.roundToInt(TextUnit.m1059getValueimpl(paragraphStyle.lineHeight))), TextUnit.m1059getValueimpl(spanStyle.letterSpacing)).font;
            boolean changed = gapComposer2.changed(i4);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = ResourcesCompat.getFont(context, i4);
                rememberedValue.getClass();
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final Typeface typeface = (Typeface) rememberedValue;
            final DisplayMetrics displayMetrics = ((Resources) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalResources)).getDisplayMetrics();
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(modifier, Alignment.Companion.TopStart, 2);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = AnimatedAmountTextKt$AnimatedAmountTextImplementation$1$1.INSTANCE;
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Function1 function1 = (Function1) ((KFunction) rememberedValue2);
            boolean changedInstance = ((((57344 & i3) ^ 24576) > 16384 && gapComposer2.changed(i)) || (i3 & 24576) == 16384) | ((i3 & 896) == 256) | gapComposer2.changedInstance(typeface) | ((i3 & 7168) == 2048) | ((((458752 & i3) ^ 196608) > 131072 && gapComposer2.changedInstance(animationSpeed)) || (i3 & 196608) == 131072) | ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | gapComposer2.changedInstance(displayMetrics);
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && gapComposer2.changedInstance(amount))) {
                z2 = true;
            }
            boolean z3 = changedInstance | z2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                Function1 function12 = new Function1() { // from class: com.squareup.cash.common.composeui.AnimatedAmountTextKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i5;
                        AnimatedAmountTextView animatedAmountTextView = (AnimatedAmountTextView) obj;
                        animatedAmountTextView.getClass();
                        Float f = null;
                        int i6 = i;
                        if (i6 == 5) {
                            i5 = 8388611;
                        } else if (i6 == 3) {
                            i5 = 1;
                        } else {
                            if (i6 != 6) {
                                a$$ExternalSyntheticBUOutline0.m$3("Unsupported TextAlign: ".concat(TextAlign.m1013toStringimpl(i6)));
                                return null;
                            }
                            i5 = 8388613;
                        }
                        animatedAmountTextView.setGravity(i5);
                        SpanStyle spanStyle2 = textStyle.spanStyle;
                        long j3 = spanStyle2.fontSize;
                        long j4 = spanStyle2.letterSpacing;
                        animatedAmountTextView.setTextSize(TextUnit.m1059getValueimpl(j3));
                        animatedAmountTextView.setLetterSpacing(TextUnit.m1060isSpimpl(j4) ? TextUnit.m1059getValueimpl(j4) / TextUnit.m1059getValueimpl(spanStyle2.fontSize) : TextUnit.m1059getValueimpl(j4));
                        animatedAmountTextView.setTypeface(typeface);
                        animatedAmountTextView.setTextColor(ColorKt.m694toArgb8_81llA(j));
                        animatedAmountTextView.setAnimationSpeed(animationSpeed);
                        animatedAmountTextView.setAnimateEvenIfSame(z);
                        long j5 = j2;
                        if (TextUnit.m1060isSpimpl(j5)) {
                            f = Float.valueOf(TypedValue.applyDimension(2, TextUnit.m1059getValueimpl(j5), displayMetrics));
                        } else if ((j5 & 1095216660480L) == 8589934592L) {
                            a$$ExternalSyntheticBUOutline0.m$3("Em units not supported for minTextSize");
                            return null;
                        }
                        animatedAmountTextView.setMinTextSizeInPx(f);
                        animatedAmountTextView.setText(amount);
                        return Unit.INSTANCE;
                    }
                };
                gapComposer2.updateRememberedValue(function12);
                rememberedValue3 = function12;
            }
            SpanEvent.Account.AccessibleAndroidView(function1, wrapContentSize$default, null, (Function1) rememberedValue3, gapComposer2, 6);
            gapComposer = gapComposer2;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.common.composeui.AnimatedAmountTextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    VisibleKt.m3483AnimatedAmountTextImplementation5vZORyg(AnimatedAmountTextView.Amount.this, modifier, textStyle, j, i, animationSpeed, z, j2, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ArcadeBannerCard(Icons icons, String str, Modifier modifier, String str2, Function2 function2, String str3, Function0 function0, BannerColors bannerColors, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str4;
        int i5;
        Function2 function22;
        String str5;
        Function2 function23;
        RecomposeScopeImpl endRestartGroup;
        Function2 function24;
        String str6;
        boolean z;
        Modifier modifier3;
        boolean z2;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1044371353);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(icons.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str4 = str2;
                i3 |= gapComposer.changed(str4) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function22 = function2;
                    i3 |= gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
                    if ((196608 & i) == 0) {
                        i3 |= gapComposer.changed(str3) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                    if ((1572864 & i) == 0) {
                        i3 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                    if ((12582912 & i) == 0) {
                        i3 |= gapComposer.changed(bannerColors) ? 8388608 : 4194304;
                    }
                    if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) == 4793490)) {
                        gapComposer.skipToGroupEnd();
                        str5 = str4;
                        function23 = function22;
                    } else {
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier modifier4 = i6 != 0 ? companion : modifier2;
                        if (i4 != 0) {
                            str4 = null;
                        }
                        Function2 function25 = i5 != 0 ? null : function22;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier4, 1.0f);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                        Object obj = DefaultSizes.border.annotationsMap;
                        long j = bannerColors.borderColor;
                        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                        Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(fillMaxWidth, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                        long j2 = bannerColors.backgroundColor;
                        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m178borderxT4_qwU, j2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                        DefaultSizes.spacing.getClass();
                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 16.0f);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        int i7 = i3;
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
                        m3499Titlet6yy7ic(icons, str, bannerColors.iconColor, bannerColors.titleColor, null, gapComposer, i7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal), companion, 8.0f, gapComposer);
                        if (str4 == null) {
                            gapComposer.startReplaceGroup(1198465565);
                            gapComposer.end(false);
                            function24 = function25;
                            z = false;
                            str6 = str4;
                        } else {
                            gapComposer.startReplaceGroup(1198465566);
                            if (StringsKt.isBlank(str4)) {
                                function24 = function25;
                                str6 = str4;
                                z = false;
                                gapComposer.startReplaceGroup(-1260099999);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-1260300135);
                                function24 = function25;
                                str6 = str4;
                                m3498SubtitleRIQooxk(str6, bannerColors.subtitleColor, bannerColors.linkColor, function24, gapComposer, (i7 >> 3) & 7168);
                                z = false;
                                gapComposer.end(false);
                            }
                            gapComposer.end(z);
                        }
                        if (str3 == null) {
                            gapComposer.startReplaceGroup(1198740535);
                            gapComposer.end(z);
                            modifier3 = modifier4;
                        } else {
                            gapComposer.startReplaceGroup(1198740536);
                            if (StringsKt.isBlank(str3)) {
                                modifier3 = modifier4;
                                z2 = false;
                                gapComposer.startReplaceGroup(-923460264);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-923635414);
                                modifier3 = modifier4;
                                m3481ActionButtoneopBjH0(str3, bannerColors.buttonColor, bannerColors.dividerColor, function0, gapComposer, (i7 >> 9) & 7168);
                                gapComposer = gapComposer;
                                z2 = false;
                                gapComposer.end(false);
                            }
                            gapComposer.end(z2);
                        }
                        gapComposer.end(true);
                        str5 = str6;
                        modifier2 = modifier3;
                        function23 = function24;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new ToastKt$$ExternalSyntheticLambda8(icons, str, modifier2, str5, function23, str3, function0, bannerColors, i, i2);
                        return;
                    }
                    return;
                }
                function22 = function2;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if ((12582912 & i) == 0) {
                }
                if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) == 4793490)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str4 = str2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function22 = function2;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) == 4793490)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str4 = str2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function22 = function2;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ArcadeBannerCardStandard(Icons icons, String str, Modifier modifier, String str2, Function2 function2, String str3, Function0 function0, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function2 function22;
        int i4;
        String str4;
        int i5;
        Function0 function02;
        int i6;
        String str5;
        Function0 function03;
        Function0 function04;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-580198588);
        int i7 = i | (gapComposer.changed(str) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 = i7 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i7 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i9 = i3 | (gapComposer.changed(str2) ? 2048 : 1024);
        int i10 = i2 & 16;
        if (i10 != 0) {
            i4 = i9 | 24576;
            function22 = function2;
        } else {
            function22 = function2;
            i4 = i9 | (gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i5 = i4 | 196608;
            str4 = str3;
        } else {
            str4 = str3;
            i5 = i4 | (gapComposer.changed(str4) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        int i12 = i2 & 64;
        if (i12 != 0) {
            i6 = i5 | 1572864;
            function02 = function0;
        } else {
            function02 = function0;
            i6 = i5 | (gapComposer.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        }
        if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
            if (i8 != 0) {
                modifier2 = Modifier.Companion.$$INSTANCE;
            }
            if (i10 != 0) {
                function22 = null;
            }
            String str6 = i11 != 0 ? null : str4;
            if (i12 != 0) {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CardScene$$ExternalSyntheticLambda1(27);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function04 = (Function0) rememberedValue;
            } else {
                function04 = function02;
            }
            ArcadeBannerCard(icons, str, modifier2, str2, function22, str6, function04, standard(gapComposer), gapComposer, i6 & 4194302, 0);
            str5 = str6;
            function03 = function04;
        } else {
            gapComposer.skipToGroupEnd();
            str5 = str4;
            function03 = function02;
        }
        Modifier modifier3 = modifier2;
        Function2 function23 = function22;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScaffoldKt$$ExternalSyntheticLambda5(icons, str, modifier3, str2, function23, str5, function03, i, i2);
        }
    }

    public static final void ArcadeInfoBlocker(String str, String str2, AvatarEntry avatarEntry, Function0 function0, Function0 function02, NavigationType navigationType, Composer composer, int i) {
        String str3;
        Function0 function03;
        NavigationType navigationType2;
        NavigationType navigationType3;
        int i2;
        Function0 function04;
        str.getClass();
        str2.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(723460171);
        int i3 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(avatarEntry) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i4 = i3 | (gapComposer.changed(companion) ? 16384 : PKIFailureInfo.certRevoked) | 1638400;
        int i5 = 0;
        if (gapComposer.shouldExecute(i4 & 1, (599187 & i4) != 599186)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                navigationType3 = NavigationType.CLOSE;
                i2 = i4 & (-458753);
                function04 = function0;
            } else {
                gapComposer.skipToGroupEnd();
                navigationType3 = navigationType;
                i2 = i4 & (-458753);
                function04 = function02;
            }
            gapComposer.endDefaults();
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Function0 function05 = function04;
            DBUtil.TitleBarSub((String) null, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, function05, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            AvatarSize avatarSize = AvatarSize.Size64;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            TextViewKt.Avatar(avatarSize, avatarEntry, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, gapComposer, ((i2 >> 3) & 112) | 6, 24);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            TextStyle textStyle = Strings.getTypography(gapComposer).header;
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4080, j, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            str3 = str2;
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(2033844163, new ArcadeInfoBlockerKt$$ExternalSyntheticLambda0(function0, str3, i5), gapComposer), gapComposer, 24960, 11);
            gapComposer = gapComposer;
            gapComposer.end(true);
            navigationType2 = navigationType3;
            function03 = function05;
        } else {
            str3 = str2;
            gapComposer.skipToGroupEnd();
            function03 = function02;
            navigationType2 = navigationType;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissKt$$ExternalSyntheticLambda3(str, str3, avatarEntry, function0, function03, navigationType2, i, 12);
        }
    }

    /* renamed from: BackgroundCircle-RPmYEkk, reason: not valid java name */
    public static final void m3484BackgroundCircleRPmYEkk(int i, long j, Composer composer, Modifier modifier) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1718593557);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changed(j) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SurfaceKt.m554SurfaceT9BRK9s(modifier, RoundedCornerShapeKt.CircleShape, j, 0L, RecyclerView.DECELERATION_RATE, lambda$669027078, gapComposer, (i2 & 14) | 12582912 | ((i2 << 3) & 896), 120);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconAnimationViewKt$$ExternalSyntheticLambda3(i, j, modifier, 0);
        }
    }

    /* renamed from: BadgedBox-3GLzNTs, reason: not valid java name */
    public static final void m3485BadgedBox3GLzNTs(float f, float f2, int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, RealImageLoader realImageLoader, final CircularBadgeShape circularBadgeShape, final AvatarBadgeViewModel avatarBadgeViewModel) {
        int i2;
        float f3;
        float f4;
        GapComposer gapComposer;
        realImageLoader.getClass();
        avatarBadgeViewModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(860023851);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer2.changed(avatarBadgeViewModel) : gapComposer2.changedInstance(avatarBadgeViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(circularBadgeShape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f3 = f;
            i2 |= gapComposer2.changed(f3) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            f3 = f;
        }
        if ((196608 & i) == 0) {
            f4 = f2;
            i2 |= gapComposer2.changed(f4) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            f4 = f2;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? 1048576 : PKIFailureInfo.signerNotTrusted;
        }
        int i3 = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            final Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            boolean changedInstance = ((i2 & 3670016) == 1048576) | gapComposer2.changedInstance(realImageLoader);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BadgedBoxKt$$ExternalSyntheticLambda0(i3, realImageLoader, composableLambdaImpl);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            boolean changed = ((i2 & 896) == 256 || ((i2 & 512) != 0 && gapComposer2.changedInstance(avatarBadgeViewModel))) | gapComposer2.changed(density) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((((i2 & 7168) ^ 3072) > 2048 && gapComposer2.changed(circularBadgeShape)) || (i2 & 3072) == 2048);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                final float f5 = f4;
                final float f6 = f3;
                Function1 function12 = new Function1() { // from class: com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        BadgedLayout badgedLayout = (BadgedLayout) obj;
                        badgedLayout.getClass();
                        badgedLayout.setModel(AvatarBadgeViewModel.this);
                        Density density2 = density;
                        badgedLayout.setBaselineDrop(density2.mo230roundToPx0680j_4(f6));
                        badgedLayout.setGapWithBadge(density2.mo236toPx0680j_4(f5));
                        badgedLayout.setBadge(new BadgedLayout.BadgeShape.Circular(density2.mo230roundToPx0680j_4(circularBadgeShape.diameter)));
                        return Unit.INSTANCE;
                    }
                };
                gapComposer2.updateRememberedValue(function12);
                rememberedValue2 = function12;
            }
            gapComposer = gapComposer2;
            AndroidView_androidKt.AndroidView(function1, modifier, (Function1) rememberedValue2, gapComposer, i2 & 112, 0);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgedBoxKt$$ExternalSyntheticLambda2(f, f2, i, composableLambdaImpl, modifier, realImageLoader, circularBadgeShape, avatarBadgeViewModel);
        }
    }

    public static final void BannerCard(String str, String str2, Function0 function0, Modifier modifier, String str3, Function2 function2, boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        str.getClass();
        function0.getClass();
        function2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1542940669);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(str3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            KeypadKt.m3641CardIkByU14(null, null, colors.semantic.background.standard, z, null, null, null, Expect_jvmKt.rememberComposableLambda(-1729134785, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(modifier, str3, function2, str2, function0, str), gapComposer2), gapComposer, ((i2 >> 6) & 57344) | 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda2(str, str2, function0, modifier, str3, function2, z, i);
        }
    }

    /* renamed from: ClusteredAvatars-ww6aTOc, reason: not valid java name */
    public static final void m3486ClusteredAvatarsww6aTOc(ImmutableList immutableList, ClusteredAvatarValues clusteredAvatarValues, Modifier modifier, long j, Composer composer, int i) {
        Object take;
        Modifier.Companion companion;
        boolean z;
        float f = clusteredAvatarValues.size;
        immutableList.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-374996367);
        int i2 = i | (gapComposer.changed(immutableList) ? 4 : 2) | (gapComposer.changed(clusteredAvatarValues) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128) | (gapComposer.changed(j) ? 2048 : 1024);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            AvatarEntry avatarEntry = new AvatarEntry("", j, null, null, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                int size = immutableList.size() > 5 ? immutableList.size() - 4 : 0;
                if (immutableList.size() < 2) {
                    int size2 = 2 - immutableList.size();
                    ArrayList arrayList = new ArrayList(size2);
                    for (int i4 = 0; i4 < size2; i4++) {
                        arrayList.add(avatarEntry);
                    }
                    take = CollectionsKt.plus((Iterable) arrayList, (Collection) immutableList);
                } else {
                    take = CollectionsKt.take(immutableList, size <= 0 ? 5 : 4);
                }
                Pair pair = new Pair(take, Integer.valueOf(size));
                gapComposer.updateRememberedValue(pair);
                rememberedValue = pair;
            }
            Pair pair2 = (Pair) rememberedValue;
            List list = (List) pair2.first;
            int intValue = ((Number) pair2.second).intValue();
            float size3 = 360.0f / (list.size() + (intValue > 0 ? 1 : 0));
            float f2 = (r9 - 2) / 3.0f;
            float lerp = TransactorKt.lerp(0.55f, 0.46f, f2);
            float lerp2 = TransactorKt.lerp(45.0f, 23.0f, f2);
            float f3 = clusteredAvatarValues.clipGap;
            float f4 = lerp * f;
            RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
            gapComposer.startReplaceGroup(12912141);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier, f);
            boolean changed = gapComposer.changed(lerp2) | gapComposer.changed(size3);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AlertDialogKt$AlertDialogFlowRow$1$1(lerp2, size3, i3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs);
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
            gapComposer.startReplaceGroup(-91150609);
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                companion = Modifier.Companion.$$INSTANCE;
                if (!hasNext) {
                    break;
                } else {
                    ScalableAvatar((AvatarEntry) it.next(), SizeKt.m285size3ABfNKs(realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, RoundedCornerShapeKt.CircleShape, f3), f4), gapComposer, 0);
                }
            }
            gapComposer.end(false);
            if (intValue > 0) {
                gapComposer.startReplaceGroup(1469573234);
                z = true;
                m3495OverflowAvatar3IgeMak(intValue, 0, j, gapComposer, SizeKt.m285size3ABfNKs(realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, RoundedCornerShapeKt.CircleShape, f3), f4));
                gapComposer.end(false);
            } else {
                z = true;
                gapComposer.startReplaceGroup(1469837819);
                gapComposer.end(false);
            }
            gapComposer.end(z);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextViewKt$$ExternalSyntheticLambda0(immutableList, clusteredAvatarValues, modifier, j, i);
        }
    }

    /* renamed from: DrawerView-We2iE6E, reason: not valid java name */
    public static final void m3487DrawerViewWe2iE6E(Modifier modifier, String str, TextStyle textStyle, long j, ComposableLambdaImpl composableLambdaImpl, long j2, float f, Composer composer, int i) {
        Modifier modifier2;
        TextStyle textStyle2;
        long j3;
        long j4;
        float f2;
        float f3;
        long j5;
        TextStyle textStyle3;
        Modifier modifier3;
        long j6;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-690010377);
        int i2 = i | 6 | (gapComposer.changed(str) ? 32 : 16) | 590976;
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                TextStyle textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j7 = colors.semantic.text.standard;
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j8 = colors2.semantic.icon.standard;
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                f3 = 8.0f;
                j5 = j7;
                textStyle3 = textStyle4;
                modifier3 = Modifier.Companion.$$INSTANCE;
                j6 = j8;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                textStyle3 = textStyle;
                j5 = j;
                j6 = j2;
                f3 = f;
            }
            gapComposer.endDefaults();
            m3488DrawerViewq9LK7_k(modifier3, Expect_jvmKt.rememberComposableLambda(719536892, new TaxToolTipViewKt$$ExternalSyntheticLambda3(str, textStyle3, j5, 3), gapComposer), composableLambdaImpl, j6, f3, gapComposer, 438);
            modifier2 = modifier3;
            j4 = j6;
            f2 = f3;
            j3 = j5;
            textStyle2 = textStyle3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            textStyle2 = textStyle;
            j3 = j;
            j4 = j2;
            f2 = f;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AppBarKt$$ExternalSyntheticLambda7(modifier2, str, textStyle2, j3, composableLambdaImpl, j4, f2, i);
        }
    }

    /* renamed from: DrawerView-q9LK7_k, reason: not valid java name */
    public static final void m3488DrawerViewq9LK7_k(final Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, final long j, float f, Composer composer, final int i) {
        int i2;
        ComposableLambdaImpl composableLambdaImpl3;
        GapComposer gapComposer;
        ComposableLambdaImpl composableLambdaImpl4;
        boolean z;
        Painter painter;
        int i3;
        int i4;
        final float f2 = f;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1938738849);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(f2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            int i5 = i2;
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
            RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new DrawerViewKt$$ExternalSyntheticLambda2(0, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(fillMaxWidth2, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue3, 28);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m182clickableO2vRcR0$default, RecyclerView.DECELERATION_RATE, 16.0f, 1);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m);
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
            composableLambdaImpl4 = composableLambdaImpl;
            composableLambdaImpl4.invoke(BoxScopeInstance.INSTANCE, gapComposer2, Integer.valueOf((i5 & 112) | 6));
            gapComposer2.end(true);
            SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 26.0f));
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer2.startReplaceGroup(20980276);
                painter = Icons.CaretUp16.painter(gapComposer2);
                z = false;
                gapComposer2.end(false);
            } else {
                z = false;
                gapComposer2.startReplaceGroup(21036882);
                painter = Icons.CaretDown16.painter(gapComposer2);
                gapComposer2.end(false);
            }
            Painter painter2 = painter;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                i3 = 21144514;
                i4 = R.string.common_ui_collapse;
            } else {
                i3 = 21218852;
                i4 = R.string.common_ui_expand;
            }
            ImageKt.Image(painter2, re$$ExternalSyntheticOutline0.m(gapComposer2, i3, i4, gapComposer2, z), m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 24960, 40);
            gapComposer2.end(true);
            composableLambdaImpl3 = composableLambdaImpl2;
            f2 = f;
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, ((Boolean) mutableState.getValue()).booleanValue(), SizeKt.fillMaxWidth(companion, 1.0f), EnterExitTransitionKt.expandVertically$default(null, 15), EnterExitTransitionKt.shrinkVertically$default(null, null, 15), null, Expect_jvmKt.rememberComposableLambda(-1729159057, new MoneyTabUIKt$$ExternalSyntheticLambda12(f2, composableLambdaImpl3, 3), gapComposer2), gapComposer2, 1600902, 16);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            composableLambdaImpl3 = composableLambdaImpl2;
            gapComposer = gapComposer2;
            composableLambdaImpl4 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final ComposableLambdaImpl composableLambdaImpl5 = composableLambdaImpl4;
            final ComposableLambdaImpl composableLambdaImpl6 = composableLambdaImpl3;
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    VisibleKt.m3488DrawerViewq9LK7_k(Modifier.this, composableLambdaImpl5, composableLambdaImpl6, j, f2, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0057  */
    /* renamed from: EmojiIcon-DzVHIIc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3489EmojiIconDzVHIIc(String str, float f, Modifier modifier, String str2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str3;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        int intValue;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-704187201);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(f) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str3 = str2;
                i3 |= gapComposer.changed(str3) ? 2048 : 1024;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
                    modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if (i4 != 0) {
                        str3 = null;
                    }
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier3, f);
                    Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    if (Dp.m1036compareTo0680j_4(f, 40.0f) >= 0) {
                        gapComposer.startReplaceGroup(-1820315683);
                        ArrayList arrayList = EmojiEmbeddedImageResolver.supportedEmoji;
                        ArrayList arrayList2 = EmojiEmbeddedImageResolver.supportedEmoji;
                        Integer imageResource48ForTheme = EmojiEmbeddedImageResolverKt.getImageResource48ForTheme(str, gapComposer);
                        if (imageResource48ForTheme == null) {
                            gapComposer.startReplaceGroup(1880945517);
                            e eVar = Emojis.Companion;
                            Integer imageResource48ForTheme2 = EmojiEmbeddedImageResolverKt.getImageResource48ForTheme("extra_cash", gapComposer);
                            imageResource48ForTheme2.getClass();
                            intValue = imageResource48ForTheme2.intValue();
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(1880942789);
                            gapComposer.end(false);
                            intValue = imageResource48ForTheme.intValue();
                        }
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1820119267);
                        ArrayList arrayList3 = EmojiEmbeddedImageResolver.supportedEmoji;
                        ArrayList arrayList4 = EmojiEmbeddedImageResolver.supportedEmoji;
                        Integer imageResource24ForTheme = EmojiEmbeddedImageResolverKt.getImageResource24ForTheme(str, gapComposer);
                        if (imageResource24ForTheme == null) {
                            gapComposer.startReplaceGroup(1880951853);
                            e eVar2 = Emojis.Companion;
                            Integer imageResource24ForTheme2 = EmojiEmbeddedImageResolverKt.getImageResource24ForTheme("extra_cash", gapComposer);
                            imageResource24ForTheme2.getClass();
                            intValue = imageResource24ForTheme2.intValue();
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(1880949125);
                            gapComposer.end(false);
                            intValue = imageResource24ForTheme.intValue();
                        }
                        gapComposer.end(false);
                    }
                    ImageKt.Image(DrawablePainterKt.rememberDrawablePainter(PlatformKt.getDrawableCompat(context, intValue, null), gapComposer), str3, m285size3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | ((i3 >> 6) & 112), 120);
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                String str4 = str3;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new EmojiIconsKt$$ExternalSyntheticLambda0(str, f, modifier3, str4, i, i2);
                    return;
                }
                return;
            }
            str3 = str2;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            }
            String str42 = str3;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str3 = str2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
        }
        String str422 = str3;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void HintCarousel(Modifier modifier, String str, ImmutableList immutableList, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        immutableList.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1182984177);
        int i4 = i | 6;
        int i5 = i2 & 2;
        int i6 = 16;
        if (i5 != 0) {
            i3 = i | 54;
        } else {
            i3 = i4 | (gapComposer.changed(str) ? 32 : 16);
        }
        int i7 = i3 | (gapComposer.changed(immutableList) ? 256 : 128);
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 147) != 146)) {
            Continuation continuation = null;
            if (i5 != 0) {
                str = null;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(-1, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
            boolean z = (i7 & 896) == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new EntitySyncerKt$hasSyncedFlow$1(immutableList, parcelableSnapshotMutableIntState, continuation, i6);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
            boolean z2 = (i7 & 112) == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BadgeKt$$ExternalSyntheticLambda3(str, 23);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue3);
            String str2 = parcelableSnapshotMutableIntState.getIntValue() < 0 ? "" : (String) immutableList.get(parcelableSnapshotMutableIntState.getIntValue());
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new SyncRangeQueries$$ExternalSyntheticLambda1(27);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            AnimatedContentKt.AnimatedContent(str2, clearAndSetSemantics, (Function1) rememberedValue4, null, "hints", null, f355lambda$1770976839, gapComposer, 1597824, 40);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        String str3 = str;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(modifier2, str3, immutableList, i, i2, 24);
        }
    }

    /* renamed from: Icon-XO-JAsU, reason: not valid java name */
    public static final void m3490IconXOJAsU(int i, int i2, long j, Composer composer, Modifier modifier) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1366996845);
        int i3 = (gapComposer.changed(modifier) ? 4 : 2) | i2 | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changed(j) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            modifier2 = modifier;
            ImageKt.Image(Countries.painterResource(i, (i3 >> 3) & 14, gapComposer), null, modifier2, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48 | ((i3 << 6) & 896), 56);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda5(modifier2, i, j, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d3  */
    /* renamed from: IconAnimationView-JXYZ-CY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3491IconAnimationViewJXYZCY(final Modifier modifier, final Context context, final String str, int i, long j, long j2, boolean z, final Function0 function0, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        long j3;
        int i7;
        long j4;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        final int i13;
        final long j5;
        final long j6;
        final boolean z4;
        final boolean z5;
        RecomposeScopeImpl endRestartGroup;
        int i14;
        long j7;
        int i15;
        long j8;
        long j9;
        boolean z6;
        boolean z7;
        boolean booleanValue;
        Object rememberedValue;
        Object obj;
        Animatable animatable;
        Object rememberedValue2;
        Animatable animatable2;
        Object rememberedValue3;
        Animatable animatable3;
        Unit unit;
        boolean z8;
        boolean changed;
        Object iconAnimationViewKt$IconAnimationView$1$1;
        Animatable animatable4;
        boolean z9;
        Unit unit2;
        Animatable animatable5;
        Animatable animatable6;
        modifier.getClass();
        context.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1624428525);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i16 = i4 | (gapComposer.changedInstance(context) ? 32 : 16);
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= gapComposer.changed(str) ? 256 : 128;
        }
        if ((i3 & 8) == 0 && gapComposer.changed(i)) {
            i5 = 2048;
            int i17 = i16 | i5;
            i6 = i3 & 16;
            if (i6 == 0) {
                i7 = i17 | 24576;
                j3 = j;
            } else {
                j3 = j;
                i7 = i17 | (gapComposer.changed(j3) ? 16384 : PKIFailureInfo.certRevoked);
            }
            if ((i3 & 32) != 0) {
                j4 = j2;
                if (gapComposer.changed(j4)) {
                    i8 = PKIFailureInfo.unsupportedVersion;
                    int i18 = i7 | i8;
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        i10 = i18 | 1572864;
                        z3 = z;
                    } else {
                        z3 = z;
                        i10 = i18 | (gapComposer.changed(z3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
                    }
                    if ((i2 & 12582912) == 0) {
                        i10 |= gapComposer.changedInstance(function0) ? 8388608 : 4194304;
                    }
                    int i19 = i10;
                    i11 = i3 & 256;
                    if (i11 != 0) {
                        i19 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i19 |= gapComposer.changed(z2) ? 67108864 : 33554432;
                    }
                    i12 = i19;
                    if (gapComposer.shouldExecute(i12 & 1, (i12 & 38347923) != 38347922)) {
                        gapComposer.startDefaults();
                        if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                            if ((i3 & 8) != 0) {
                                i12 &= -7169;
                                i14 = R.drawable.ic_checkmark;
                            } else {
                                i14 = i;
                            }
                            long Color = i6 != 0 ? ColorKt.Color(-1) : j3;
                            if ((i3 & 32) != 0) {
                                j7 = MooncakeTheme.getColors(gapComposer).green;
                                i12 &= -458753;
                            } else {
                                j7 = j4;
                            }
                            if (i9 != 0) {
                                z3 = true;
                            }
                            i15 = i14;
                            j8 = Color;
                            if (i11 != 0) {
                                j9 = j7;
                                z6 = z3;
                                z7 = true;
                                gapComposer.endDefaults();
                                TweenSpec tween$default = AnimatableKt.tween$default(400, 0, new CubicBezierEasing(0.5f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f), 2);
                                PlatformHapticFeedback platformHapticFeedback = (PlatformHapticFeedback) gapComposer.consume(CompositionLocalsKt.LocalHapticFeedback);
                                booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                                rememberedValue = gapComposer.rememberedValue();
                                obj = Composer.Companion.Empty;
                                if (rememberedValue == obj) {
                                    rememberedValue = AnimatableKt.Animatable(booleanValue ? 1.0f : 0.0f, 0.01f);
                                    gapComposer.updateRememberedValue(rememberedValue);
                                }
                                animatable = (Animatable) rememberedValue;
                                rememberedValue2 = gapComposer.rememberedValue();
                                if (rememberedValue2 == obj) {
                                    rememberedValue2 = AnimatableKt.Animatable(booleanValue ? 1.0f : RecyclerView.DECELERATION_RATE, 0.01f);
                                    gapComposer.updateRememberedValue(rememberedValue2);
                                }
                                animatable2 = (Animatable) rememberedValue2;
                                rememberedValue3 = gapComposer.rememberedValue();
                                if (rememberedValue3 == obj) {
                                    rememberedValue3 = AnimatableKt.Animatable(booleanValue ? RecyclerView.DECELERATION_RATE : 30.0f, 0.01f);
                                    gapComposer.updateRememberedValue(rememberedValue3);
                                }
                                animatable3 = (Animatable) rememberedValue3;
                                unit = Unit.INSTANCE;
                                int i20 = i12;
                                z8 = z6;
                                changed = ((i20 & 3670016) != 1048576) | gapComposer.changed(booleanValue) | gapComposer.changedInstance(context) | gapComposer.changedInstance(animatable) | gapComposer.changedInstance(platformHapticFeedback) | gapComposer.changedInstance(animatable2) | gapComposer.changedInstance(animatable3) | ((i20 & 234881024) != 67108864) | ((i20 & 29360128) == 8388608);
                                Object rememberedValue4 = gapComposer.rememberedValue();
                                if (!changed || rememberedValue4 == obj) {
                                    animatable4 = animatable;
                                    z9 = z8;
                                    unit2 = unit;
                                    iconAnimationViewKt$IconAnimationView$1$1 = new IconAnimationViewKt$IconAnimationView$1$1(z9, booleanValue, context, animatable4, tween$default, platformHapticFeedback, z7, function0, animatable2, animatable3, null);
                                    animatable5 = animatable2;
                                    animatable6 = animatable3;
                                    gapComposer.updateRememberedValue(iconAnimationViewKt$IconAnimationView$1$1);
                                } else {
                                    iconAnimationViewKt$IconAnimationView$1$1 = rememberedValue4;
                                    unit2 = unit;
                                    animatable6 = animatable3;
                                    animatable5 = animatable2;
                                    animatable4 = animatable;
                                    z9 = z8;
                                }
                                Updater.LaunchedEffect(gapComposer, unit2, (Function2) iconAnimationViewKt$IconAnimationView$1$1);
                                ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(793003960, new FloatingActionButtonKt$$ExternalSyntheticLambda1(modifier, str, animatable4, j9, animatable5, i15, j8, animatable6), gapComposer), gapComposer, 6);
                                z4 = z9;
                                z5 = z7;
                                j6 = j9;
                                i13 = i15;
                                j5 = j8;
                            } else {
                                j9 = j7;
                            }
                        } else {
                            gapComposer.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i3 & 32) != 0) {
                                i12 &= -458753;
                            }
                            i15 = i;
                            j8 = j3;
                            j9 = j4;
                        }
                        z6 = z3;
                        z7 = z2;
                        gapComposer.endDefaults();
                        TweenSpec tween$default2 = AnimatableKt.tween$default(400, 0, new CubicBezierEasing(0.5f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f), 2);
                        PlatformHapticFeedback platformHapticFeedback2 = (PlatformHapticFeedback) gapComposer.consume(CompositionLocalsKt.LocalHapticFeedback);
                        booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                        rememberedValue = gapComposer.rememberedValue();
                        obj = Composer.Companion.Empty;
                        if (rememberedValue == obj) {
                        }
                        animatable = (Animatable) rememberedValue;
                        rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == obj) {
                        }
                        animatable2 = (Animatable) rememberedValue2;
                        rememberedValue3 = gapComposer.rememberedValue();
                        if (rememberedValue3 == obj) {
                        }
                        animatable3 = (Animatable) rememberedValue3;
                        unit = Unit.INSTANCE;
                        int i202 = i12;
                        z8 = z6;
                        changed = ((i202 & 3670016) != 1048576) | gapComposer.changed(booleanValue) | gapComposer.changedInstance(context) | gapComposer.changedInstance(animatable) | gapComposer.changedInstance(platformHapticFeedback2) | gapComposer.changedInstance(animatable2) | gapComposer.changedInstance(animatable3) | ((i202 & 234881024) != 67108864) | ((i202 & 29360128) == 8388608);
                        Object rememberedValue42 = gapComposer.rememberedValue();
                        if (changed) {
                        }
                        animatable4 = animatable;
                        z9 = z8;
                        unit2 = unit;
                        iconAnimationViewKt$IconAnimationView$1$1 = new IconAnimationViewKt$IconAnimationView$1$1(z9, booleanValue, context, animatable4, tween$default2, platformHapticFeedback2, z7, function0, animatable2, animatable3, null);
                        animatable5 = animatable2;
                        animatable6 = animatable3;
                        gapComposer.updateRememberedValue(iconAnimationViewKt$IconAnimationView$1$1);
                        Updater.LaunchedEffect(gapComposer, unit2, (Function2) iconAnimationViewKt$IconAnimationView$1$1);
                        ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(793003960, new FloatingActionButtonKt$$ExternalSyntheticLambda1(modifier, str, animatable4, j9, animatable5, i15, j8, animatable6), gapComposer), gapComposer, 6);
                        z4 = z9;
                        z5 = z7;
                        j6 = j9;
                        i13 = i15;
                        j5 = j8;
                    } else {
                        gapComposer.skipToGroupEnd();
                        i13 = i;
                        j5 = j3;
                        j6 = j4;
                        z4 = z3;
                        z5 = z2;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.common.composeui.IconAnimationViewKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                                VisibleKt.m3491IconAnimationViewJXYZCY(Modifier.this, context, str, i13, j5, j6, z4, function0, z5, (Composer) obj2, updateChangedFlags, i3);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
            } else {
                j4 = j2;
            }
            i8 = 65536;
            int i182 = i7 | i8;
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            int i192 = i10;
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i192;
            if (gapComposer.shouldExecute(i12 & 1, (i12 & 38347923) != 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = 1024;
        int i172 = i16 | i5;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i8 = 65536;
        int i1822 = i7 | i8;
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        int i1922 = i10;
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i1922;
        if (gapComposer.shouldExecute(i12 & 1, (i12 & 38347923) != 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d9  */
    /* renamed from: InfoUpsell-vCkY0N0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3492InfoUpsellvCkY0N0(String str, Painter painter, Modifier modifier, DpSize dpSize, String str2, NavigationType navigationType, Function0 function0, Function3 function3, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        DpSize dpSize2;
        String str3;
        Modifier modifier3;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        painter.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-141674380);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? gapComposer2.changed(painter) : gapComposer2.changedInstance(painter) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                dpSize2 = dpSize;
                i3 |= gapComposer2.changed(dpSize2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    str3 = str2;
                    i3 |= gapComposer2.changed(str3) ? 16384 : PKIFailureInfo.certRevoked;
                } else {
                    str3 = str2;
                }
                if ((196608 & i) == 0) {
                    i3 |= gapComposer2.changed(navigationType.ordinal()) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if ((1572864 & i) == 0) {
                    i3 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                if ((12582912 & i) == 0) {
                    i3 |= gapComposer2.changedInstance(function3) ? 8388608 : 4194304;
                }
                if ((100663296 & i) == 0) {
                    i3 |= gapComposer2.changedInstance(composableLambdaImpl) ? 67108864 : 33554432;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (38347923 & i3) != 38347922)) {
                    Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if (i4 != 0) {
                        dpSize2 = null;
                    }
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj = rememberedValue;
                    if (rememberedValue == Composer.Companion.Empty) {
                        InfoUpsellCtaButtonScope infoUpsellCtaButtonScope = new InfoUpsellCtaButtonScope();
                        infoUpsellCtaButtonScope.prominentButton = Updater.mutableStateOf$default(null);
                        gapComposer2.updateRememberedValue(infoUpsellCtaButtonScope);
                        obj = infoUpsellCtaButtonScope;
                    }
                    InfoUpsellCtaButtonScope infoUpsellCtaButtonScope2 = (InfoUpsellCtaButtonScope) obj;
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(modifier4, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
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
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    int i6 = i3 >> 12;
                    int i7 = i3 >> 6;
                    int i8 = i3;
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, function0, (Modifier) null, (Function3) null, gapComposer2, (i6 & 112) | 6 | (i7 & 57344), 108);
                    ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
                    Modifier modifier5 = modifier4;
                    GapComposer gapComposer3 = gapComposer2;
                    m3493InfoUpsellContentnWqOM5s(rememberScrollState, str, str3, painter, composableLambdaImpl, new LayoutWeightElement(1.0f, true), dpSize2, gapComposer3, ((i8 << 3) & 112) | (i7 & 896) | (Painter.$stable << 9) | ((i8 << 6) & 7168) | (i6 & 57344) | (3670016 & (i8 << 9)));
                    if (function3 == null) {
                        gapComposer3.startReplaceGroup(-1168926943);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-1168926942);
                        gapComposer3.startReplaceGroup(793577410);
                        function3.invoke(infoUpsellCtaButtonScope2, gapComposer3, 0);
                        infoUpsellCtaButtonScope2.ShowCtaButton$compose_ui(rememberScrollState, gapComposer3, 0);
                        gapComposer3.end(false);
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(true);
                    modifier3 = modifier5;
                    gapComposer = gapComposer3;
                } else {
                    gapComposer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    gapComposer = gapComposer2;
                }
                DpSize dpSize3 = dpSize2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new InfoUpsellKt$$ExternalSyntheticLambda0(str, painter, modifier3, dpSize3, str2, navigationType, function0, function3, composableLambdaImpl, i, i2);
                    return;
                }
                return;
            }
            dpSize2 = dpSize;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if ((100663296 & i) == 0) {
            }
            if (gapComposer2.shouldExecute(i3 & 1, (38347923 & i3) != 38347922)) {
            }
            DpSize dpSize32 = dpSize2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        dpSize2 = dpSize;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (38347923 & i3) != 38347922)) {
        }
        DpSize dpSize322 = dpSize2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: InfoUpsellContent-nWqOM5s, reason: not valid java name */
    public static final void m3493InfoUpsellContentnWqOM5s(ScrollState scrollState, String str, String str2, Painter painter, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, DpSize dpSize, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1250255809);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(scrollState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? gapComposer.changed(painter) : gapComposer.changedInstance(painter) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(modifier) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(dpSize) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InfoUpsellContentScope();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Object obj = (InfoUpsellContentScope) rememberedValue;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(modifier, 1.0f), scrollState, false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            int i3 = i2 >> 9;
            m3494InfoUpsellImage5H3ToQM(painter, null, dpSize, gapComposer, 6 | (Painter.$stable << 3) | ((i2 >> 6) & 112) | (i3 & 7168));
            ViewfinderKt.HeroHeader(str, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), str2, (TextStyle) null, gapComposer, ((i2 >> 3) & 14) | 48 | (i2 & 896), 8);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            composableLambdaImpl.invoke(obj, gapComposer, Integer.valueOf((i3 & 112) | 6));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScaffoldKt$$ExternalSyntheticLambda5(scrollState, str, str2, painter, composableLambdaImpl, modifier, dpSize, i);
        }
    }

    /* renamed from: InfoUpsellImage-5H3ToQM, reason: not valid java name */
    public static final void m3494InfoUpsellImage5H3ToQM(Painter painter, Modifier modifier, DpSize dpSize, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(261209639);
        int i3 = i & 6;
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(columnScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer.changed(painter) : gapComposer.changedInstance(painter) ? 32 : 16;
        }
        int i4 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i4 |= gapComposer.changed(dpSize) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (dpSize == null || (modifier3 = SizeKt.m286size6HolHcs(dpSize.packedValue, companion)) == null) {
                modifier3 = companion;
            }
            Modifier align = columnScopeInstance.align(modifier3, Alignment.Companion.CenterHorizontally);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ImageKt.Image(painter, null, SpacerKt.m300paddingVpY3zN4$default(align, RecyclerView.DECELERATION_RATE, 16.0f, 1), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 48 | ((i4 >> 3) & 14), 120);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(painter, modifier2, dpSize, i, 25);
        }
    }

    /* renamed from: OverflowAvatar-3IgeMak, reason: not valid java name */
    public static final void m3495OverflowAvatar3IgeMak(int i, int i2, long j, Composer composer, Modifier modifier) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(879738816);
        int i3 = i2 | (gapComposer.changed(i) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(modifier, RoundedCornerShapeKt.CircleShape), j, ColorKt.RectangleShape);
            String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(RangesKt___RangesKt.coerceIn(i, 0, 99), Marker.ANY_NON_NULL_MARKER);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ImageKt.Image(rememberTextPainter(m, TextStyle.m994copyp1EtxEg$default(textStyle, colors.semantic.text.standard, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), gapComposer), null, m177backgroundbw27NRU, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 48, 120);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda5(i, j, modifier, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0066  */
    /* renamed from: ProgressEmojiIcon-Lzaahlw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3496ProgressEmojiIconLzaahlw(final String str, final Float f, final Modifier modifier, float f2, float f3, long j, long j2, long j3, Composer composer, final int i, final int i2) {
        float f4;
        float f5;
        int i3;
        long j4;
        int i4;
        int i5;
        GapComposer gapComposer;
        final long j5;
        final float f6;
        final float f7;
        final long j6;
        final long j7;
        RecomposeScopeImpl endRestartGroup;
        int i6;
        float f8;
        long j8;
        long j9;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1890695603);
        int i7 = (gapComposer2.changed(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i7 |= gapComposer2.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i7 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i & 3072) == 0) {
            f4 = f2;
            i7 |= gapComposer2.changed(f4) ? 2048 : 1024;
            if ((i2 & 16) != 0) {
                f5 = f3;
                if (gapComposer2.changed(f5)) {
                    i3 = 16384;
                    int i9 = i7 | i3;
                    if ((i2 & 32) == 0) {
                        j4 = j;
                        if (gapComposer2.changed(j4)) {
                            i4 = PKIFailureInfo.unsupportedVersion;
                            i5 = i9 | i4 | 382205952;
                            if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) == 306783378)) {
                                gapComposer = gapComposer2;
                                gapComposer.skipToGroupEnd();
                                j5 = j3;
                                f6 = f4;
                                f7 = f5;
                                j6 = j4;
                                j7 = j2;
                            } else {
                                gapComposer2.startDefaults();
                                if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                    float f9 = i8 != 0 ? 4.0f : f4;
                                    if ((i2 & 16) != 0) {
                                        i5 &= -57345;
                                        f5 = f9;
                                    }
                                    if ((i2 & 32) != 0) {
                                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                        } else {
                                            gapComposer2.startReplaceGroup(-1762997739);
                                            gapComposer2.end(false);
                                        }
                                        j4 = colors.semantic.border.brand;
                                        i5 &= -458753;
                                    }
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                    Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    long j10 = colors2.semantic.border.subtle;
                                    Colors colors3 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                                    if (colors3 == null) {
                                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    long j11 = colors3.semantic.border.brand;
                                    i6 = i5 & (-1882718209);
                                    f8 = f9;
                                    j8 = j10;
                                    j9 = j11;
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i5 &= -57345;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i5 &= -458753;
                                    }
                                    j8 = j2;
                                    f8 = f4;
                                    i6 = i5 & (-1882718209);
                                    j9 = j3;
                                }
                                float f10 = f5;
                                gapComposer2.endDefaults();
                                if (f == null) {
                                    gapComposer2.startReplaceGroup(1512305889);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new SyncRangeQueries$$ExternalSyntheticLambda1(26);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue);
                                    gapComposer2.end(false);
                                    modifier2 = clearAndSetSemantics;
                                } else {
                                    gapComposer2.startReplaceGroup(1512356729);
                                    gapComposer2.end(false);
                                    modifier2 = modifier;
                                }
                                gapComposer = gapComposer2;
                                m3497ProgressMeterUV7SVM(f != null ? f.floatValue() : 1.0f, f != null ? j4 : j8, f8, modifier2, j8, f10, 0L, ProgressMeter$CompletionBehavior.NONE, ProgressMeter$ZeroBehavior.HIDDEN, null, null, null, Expect_jvmKt.rememberComposableLambda(-1904928318, new SetPinViewKt$$ExternalSyntheticLambda7(str, j9), gapComposer2), gapComposer, ((i6 >> 3) & 896) | 113246208 | ((i6 << 3) & 458752), 432, 1600);
                                j5 = j9;
                                j6 = j4;
                                f6 = f8;
                                j7 = j8;
                                f7 = f10;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.common.composeui.EmojiIconsKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                        VisibleKt.m3496ProgressEmojiIconLzaahlw(str, f, modifier, f6, f7, j6, j7, j5, (Composer) obj, updateChangedFlags, i2);
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                    } else {
                        j4 = j;
                    }
                    i4 = 65536;
                    i5 = i9 | i4 | 382205952;
                    if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) == 306783378)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
            } else {
                f5 = f3;
            }
            i3 = PKIFailureInfo.certRevoked;
            int i92 = i7 | i3;
            if ((i2 & 32) == 0) {
            }
            i4 = 65536;
            i5 = i92 | i4 | 382205952;
            if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) == 306783378)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f4 = f2;
        if ((i2 & 16) != 0) {
        }
        i3 = PKIFailureInfo.certRevoked;
        int i922 = i7 | i3;
        if ((i2 & 32) == 0) {
        }
        i4 = 65536;
        i5 = i922 | i4 | 382205952;
        if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) == 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* renamed from: ProgressMeter-UV-7SVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3497ProgressMeterUV7SVM(final float f, final long j, final float f2, Modifier modifier, long j2, float f3, long j3, ProgressMeter$CompletionBehavior progressMeter$CompletionBehavior, ProgressMeter$ZeroBehavior progressMeter$ZeroBehavior, SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy, SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy2, String str, Function3 function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        long j4;
        float f4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int ordinal;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        final SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy3;
        final SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy4;
        final String str2;
        final Function3 function32;
        Modifier modifier3;
        final float f5;
        final long j5;
        final long j6;
        final ProgressMeter$CompletionBehavior progressMeter$CompletionBehavior2;
        final ProgressMeter$ZeroBehavior progressMeter$ZeroBehavior2;
        RecomposeScopeImpl endRestartGroup;
        ProgressMeter$CompletionBehavior progressMeter$CompletionBehavior3;
        ProgressMeter$ZeroBehavior progressMeter$ZeroBehavior3;
        Function3 function33;
        long j7;
        SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy5;
        SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy6;
        long j8;
        String str3;
        String str4;
        ?? r11;
        Object obj;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-915583072);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i4 = (gapComposer.changed(f) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer.changed(j) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changed(f2) ? 256 : 128;
        }
        int i18 = i3 & 8;
        if (i18 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer.changed(modifier2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
                j4 = j2;
            } else {
                j4 = j2;
                if ((i & 24576) == 0) {
                    i4 |= gapComposer.changed(j4) ? 16384 : PKIFailureInfo.certRevoked;
                }
            }
            if ((i & 196608) != 0) {
                f4 = f3;
                i4 |= ((i3 & 32) == 0 && gapComposer.changed(f4)) ? PKIFailureInfo.unsupportedVersion : 65536;
            } else {
                f4 = f3;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= gapComposer.changed(j3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= gapComposer.changed(progressMeter$CompletionBehavior == null ? -1 : progressMeter$CompletionBehavior.ordinal()) ? 8388608 : 4194304;
            }
            i8 = i3 & 256;
            int i19 = 100663296;
            if (i8 == 0) {
                if ((i & 100663296) == 0) {
                    i19 = gapComposer.changed(progressMeter$ZeroBehavior == null ? -1 : progressMeter$ZeroBehavior.ordinal()) ? 67108864 : 33554432;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (segmentedCircle$ContentLayoutPolicy == null) {
                        i10 = i8;
                        ordinal = -1;
                    } else {
                        i10 = i8;
                        ordinal = segmentedCircle$ContentLayoutPolicy.ordinal();
                    }
                    i4 |= gapComposer.changed(ordinal) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    i11 = i3 & 1024;
                    if (i11 == 0) {
                        i13 = i2 | 6;
                        i12 = i11;
                    } else if ((i2 & 6) == 0) {
                        i12 = i11;
                        i13 = i2 | (gapComposer.changed(segmentedCircle$ContentLayoutPolicy2 != null ? segmentedCircle$ContentLayoutPolicy2.ordinal() : -1) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i2;
                    }
                    i14 = i3 & 2048;
                    if (i14 == 0) {
                        i13 |= 48;
                        i15 = i14;
                    } else if ((i2 & 48) == 0) {
                        i15 = i14;
                        i13 |= gapComposer.changed(str) ? 32 : 16;
                    } else {
                        i15 = i14;
                    }
                    int i20 = i13;
                    i16 = i3 & 4096;
                    if (i16 == 0) {
                        i17 = i20 | MLKEMEngine.KyberPolyBytes;
                    } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                        i17 = i20 | (gapComposer.changedInstance(function3) ? 256 : 128);
                    } else {
                        i17 = i20;
                    }
                    if (gapComposer.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i17 & 147) != 146)) {
                        gapComposer.skipToGroupEnd();
                        segmentedCircle$ContentLayoutPolicy3 = segmentedCircle$ContentLayoutPolicy;
                        segmentedCircle$ContentLayoutPolicy4 = segmentedCircle$ContentLayoutPolicy2;
                        str2 = str;
                        function32 = function3;
                        modifier3 = modifier2;
                        f5 = f4;
                        j5 = j4;
                        j6 = j3;
                        progressMeter$CompletionBehavior2 = progressMeter$CompletionBehavior;
                        progressMeter$ZeroBehavior2 = progressMeter$ZeroBehavior;
                    } else {
                        gapComposer.startDefaults();
                        int i21 = i & 1;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        if (i21 == 0 || gapComposer.getDefaultsInvalid()) {
                            if (i18 != 0) {
                                modifier2 = companion;
                            }
                            long Color = i5 != 0 ? ColorKt.Color(-2500135) : j4;
                            if ((i3 & 32) != 0) {
                                f4 = f2;
                            }
                            long j9 = i6 != 0 ? Color.Transparent : j3;
                            progressMeter$CompletionBehavior3 = i7 != 0 ? ProgressMeter$CompletionBehavior.SOLID_BACKGROUND : progressMeter$CompletionBehavior;
                            progressMeter$ZeroBehavior3 = i10 != 0 ? ProgressMeter$ZeroBehavior.MINIMUM_PROGRESS : progressMeter$ZeroBehavior;
                            SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy7 = i9 != 0 ? SegmentedCircle$ContentLayoutPolicy.INSIDE_CORNER : segmentedCircle$ContentLayoutPolicy;
                            SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy8 = i12 != 0 ? SegmentedCircle$ContentLayoutPolicy.INSIDE_CORNER : segmentedCircle$ContentLayoutPolicy2;
                            String str5 = i15 != 0 ? null : str;
                            if (i16 != 0) {
                                j7 = Color;
                                segmentedCircle$ContentLayoutPolicy5 = segmentedCircle$ContentLayoutPolicy7;
                                segmentedCircle$ContentLayoutPolicy6 = segmentedCircle$ContentLayoutPolicy8;
                                j8 = j9;
                                str3 = str5;
                                function33 = lambda$1286309434;
                            } else {
                                function33 = function3;
                                j7 = Color;
                                segmentedCircle$ContentLayoutPolicy5 = segmentedCircle$ContentLayoutPolicy7;
                                segmentedCircle$ContentLayoutPolicy6 = segmentedCircle$ContentLayoutPolicy8;
                                j8 = j9;
                                str3 = str5;
                            }
                        } else {
                            gapComposer.skipToGroupEnd();
                            j8 = j3;
                            progressMeter$CompletionBehavior3 = progressMeter$CompletionBehavior;
                            progressMeter$ZeroBehavior3 = progressMeter$ZeroBehavior;
                            segmentedCircle$ContentLayoutPolicy5 = segmentedCircle$ContentLayoutPolicy;
                            segmentedCircle$ContentLayoutPolicy6 = segmentedCircle$ContentLayoutPolicy2;
                            str3 = str;
                            function33 = function3;
                            j7 = j4;
                        }
                        gapComposer.endDefaults();
                        int roundToInt = MathKt__MathJVMKt.roundToInt(100.0f * f);
                        SegmentedCircleConfig.SizingConfig.Fixed fixed = new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(f2, gapComposer));
                        SegmentedCircleConfig.SizingConfig.Fixed fixed2 = new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(f4, gapComposer));
                        final ProgressMeter$CompletionBehavior progressMeter$CompletionBehavior4 = progressMeter$CompletionBehavior3;
                        SegmentedCircleConfig.SizingConfig.Fixed fixed3 = new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(f2 / 5.0f, gapComposer));
                        if (str3 == null) {
                            gapComposer.startReplaceGroup(592994694);
                            String stringResource = Room.stringResource(R.string.progress_meter_label, new Object[]{Integer.valueOf(roundToInt)}, gapComposer);
                            gapComposer.end(false);
                            str4 = stringResource;
                        } else {
                            gapComposer.startReplaceGroup(592993702);
                            gapComposer.end(false);
                            str4 = str3;
                        }
                        final SegmentedCircleConfig segmentedCircleConfig = new SegmentedCircleConfig(fixed, fixed2, fixed3, str4, j8, j7, segmentedCircle$ContentLayoutPolicy5, segmentedCircle$ContentLayoutPolicy6, function33, 256);
                        boolean z = f >= 1.0f;
                        final SegmentedCircleInteractableState m3501rememberSegmentedCircleInteractableStatekHDZbjc = m3501rememberSegmentedCircleInteractableStatekHDZbjc(gapComposer);
                        final float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(12.0f, gapComposer);
                        final float m3477toPx8Feqmps2 = DensityUtilsKt.m3477toPx8Feqmps(4.0f, gapComposer);
                        Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, modifier2, false);
                        BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        final ProgressMeter$ZeroBehavior progressMeter$ZeroBehavior4 = progressMeter$ZeroBehavior3;
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, aspectRatio);
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
                        modifier3 = modifier2;
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        float f6 = f4;
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        String str6 = str3;
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                        boolean changedInstance = gapComposer.changedInstance(segmentedCircleConfig);
                        Object rememberedValue = gapComposer.rememberedValue();
                        final boolean z2 = z;
                        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                            r11 = 0;
                            SegmentedCircleKt$SegmentedCircle$3$1$1 segmentedCircleKt$SegmentedCircle$3$1$1 = new SegmentedCircleKt$SegmentedCircle$3$1$1(segmentedCircleConfig, false ? 1 : 0);
                            gapComposer.updateRememberedValue(segmentedCircleKt$SegmentedCircle$3$1$1);
                            obj = segmentedCircleKt$SegmentedCircle$3$1$1;
                        } else {
                            r11 = 0;
                            obj = rememberedValue;
                        }
                        CanvasKt.Canvas(r11, gapComposer, SemanticsModifierKt.semantics(fillMaxSize, r11, (Function1) obj).then(companion), new Function1() { // from class: com.squareup.cash.common.composeui.ProgressMeterKt$ProgressMeter-UV-7SVM$$inlined$SegmentedCircle$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                float f7;
                                DrawScope drawScope = (DrawScope) obj2;
                                drawScope.getClass();
                                SegmentedCircleConfig segmentedCircleConfig2 = SegmentedCircleConfig.this;
                                float strokeWidth = VisibleKt.strokeWidth(segmentedCircleConfig2.strokeThickness, Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)));
                                float strokeWidth2 = VisibleKt.strokeWidth(segmentedCircleConfig2.backgroundStrokeThickness, Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)));
                                long floatToRawIntBits = (Float.floatToRawIntBits(r2) << 32) | (Float.floatToRawIntBits(r2) & BodyPartID.bodyIdMax);
                                float f8 = 1.33f * strokeWidth * 2.0f;
                                float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f8;
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f8;
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
                                long floatToRawIntBits3 = (Float.floatToRawIntBits(r4) << 32) | (Float.floatToRawIntBits(r4) & BodyPartID.bodyIdMax);
                                float f9 = (strokeWidth / 2.0f) * 2.0f;
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f9;
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f9;
                                long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax);
                                long j10 = segmentedCircleConfig2.backgroundColor;
                                Fill fill = Fill.INSTANCE;
                                DrawScope.m743drawOvalnJ9OG0$default(drawScope, j10, floatToRawIntBits, floatToRawIntBits2, fill, 104);
                                DrawScope.m743drawOvalnJ9OG0$default(drawScope, segmentedCircleConfig2.segmentsBackgroundColor, floatToRawIntBits3, floatToRawIntBits4, new Stroke(strokeWidth2, RecyclerView.DECELERATION_RATE, 0, 0, null, 30), 104);
                                SegmentedCircleDrawScope segmentedCircleDrawScope = new SegmentedCircleDrawScope(drawScope, strokeWidth, floatToRawIntBits3, floatToRawIntBits4, segmentedCircleConfig2, m3501rememberSegmentedCircleInteractableStatekHDZbjc, m3477toPx8Feqmps, m3477toPx8Feqmps2);
                                if (z2 && progressMeter$CompletionBehavior4 == ProgressMeter$CompletionBehavior.SOLID_BACKGROUND) {
                                    DrawScope.m743drawOvalnJ9OG0$default(segmentedCircleDrawScope, j, 0L, 0L, fill, 110);
                                } else {
                                    float f10 = f;
                                    if (f10 != RecyclerView.DECELERATION_RATE || progressMeter$ZeroBehavior4 != ProgressMeter$ZeroBehavior.HIDDEN) {
                                        float f11 = f10 * 360.0f;
                                        float gapBetweenSegments = 360.0f - segmentedCircleDrawScope.getGapBetweenSegments();
                                        if (f11 < 0.1f) {
                                            f7 = 0.1f;
                                        } else {
                                            if (f11 < 360.0f) {
                                                f11 = Math.min(f11, gapBetweenSegments);
                                            }
                                            f7 = f11;
                                        }
                                        segmentedCircleDrawScope.m3479drawSegmentArcAgEwaKs(-90.0f, f7, 1, j);
                                    }
                                }
                                segmentedCircleConfig2.debugSettings.getClass();
                                return Unit.INSTANCE;
                            }
                        });
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(layoutWithConfig(segmentedCircleConfig), 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, r11);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
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
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        segmentedCircleConfig.innerContent.invoke(BoxScopeInstance.INSTANCE, gapComposer, 6);
                        gapComposer.end(true);
                        gapComposer.end(true);
                        progressMeter$CompletionBehavior2 = progressMeter$CompletionBehavior4;
                        progressMeter$ZeroBehavior2 = progressMeter$ZeroBehavior4;
                        f5 = f6;
                        str2 = str6;
                        j6 = j8;
                        j5 = j7;
                        segmentedCircle$ContentLayoutPolicy3 = segmentedCircle$ContentLayoutPolicy5;
                        segmentedCircle$ContentLayoutPolicy4 = segmentedCircle$ContentLayoutPolicy6;
                        function32 = function33;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier4 = modifier3;
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.common.composeui.ProgressMeterKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                                VisibleKt.m3497ProgressMeterUV7SVM(f, j, f2, modifier4, j5, f5, j6, progressMeter$CompletionBehavior2, progressMeter$ZeroBehavior2, segmentedCircle$ContentLayoutPolicy3, segmentedCircle$ContentLayoutPolicy4, str2, function32, (Composer) obj2, updateChangedFlags, updateChangedFlags2, i3);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                i10 = i8;
                i11 = i3 & 1024;
                if (i11 == 0) {
                }
                i14 = i3 & 2048;
                if (i14 == 0) {
                }
                int i202 = i13;
                i16 = i3 & 4096;
                if (i16 == 0) {
                }
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i17 & 147) != 146)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i4 |= i19;
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i8;
            i11 = i3 & 1024;
            if (i11 == 0) {
            }
            i14 = i3 & 2048;
            if (i14 == 0) {
            }
            int i2022 = i13;
            i16 = i3 & 4096;
            if (i16 == 0) {
            }
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i17 & 147) != 146)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        if ((i & 196608) != 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        int i192 = 100663296;
        if (i8 == 0) {
        }
        i4 |= i192;
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i8;
        i11 = i3 & 1024;
        if (i11 == 0) {
        }
        i14 = i3 & 2048;
        if (i14 == 0) {
        }
        int i20222 = i13;
        i16 = i3 & 4096;
        if (i16 == 0) {
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i17 & 147) != 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PullToRefresh(int i, int i2, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, String str, Function0 function0, boolean z, boolean z2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        boolean z4;
        RecomposeScopeImpl endRestartGroup;
        function0.getClass();
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(521254508);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= gapComposer.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked;
                }
                if ((196608 & i) == 0) {
                    i3 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i5 != 0) {
                        modifier2 = companion;
                    }
                    boolean z5 = i4 != 0 ? true : z3;
                    int i6 = (i3 >> 3) & 14;
                    PullRefreshState m2016rememberPullRefreshStateUuyPYSY = zzadq.m2016rememberPullRefreshStateUuyPYSY(z, function0, gapComposer, ((i3 << 3) & 112) | i6);
                    Modifier pullRefresh = PullRefreshKt.pullRefresh(ClipKt.clipToBounds(modifier2), m2016rememberPullRefreshStateUuyPYSY, z5);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, pullRefresh);
                    ComposeUiNode.Companion.getClass();
                    int i7 = i3;
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
                    composableLambdaImpl.invoke(gapComposer, Integer.valueOf((i7 >> 15) & 14));
                    Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.TopCenter);
                    boolean z6 = (i7 & 57344) == 16384;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (z6 || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BadgeKt$$ExternalSyntheticLambda3(str, 24);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(align, false, (Function1) rememberedValue);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    boolean z7 = z5;
                    long j = colors.component.modal.background;
                    Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    PullRefreshIndicatorKt.m511PullRefreshIndicatorjB83MbM(z, m2016rememberPullRefreshStateUuyPYSY, semantics, j, colors2.semantic.icon.brand, gapComposer, i6 | 64);
                    gapComposer.end(true);
                    z4 = z7;
                } else {
                    gapComposer.skipToGroupEnd();
                    z4 = z3;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SwitchKt$$ExternalSyntheticLambda0(function0, z, modifier2, z4, str, composableLambdaImpl, i, i2);
                    return;
                }
                return;
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ScalableAvatar(AvatarEntry avatarEntry, Modifier modifier, Composer composer, int i) {
        avatarEntry.getClass();
        String str = avatarEntry.monogram;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1921263642);
        int i2 = (gapComposer.changed(avatarEntry) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.CircleShape);
            long j = avatarEntry.backgroundColor;
            AvatarImage avatarImage = avatarEntry.avatarImage;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            if (avatarImage != null) {
                gapComposer.startReplaceGroup(732322672);
                ScalableAvatarImage(avatarImage, str, null, gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(732409038);
                ScalableMonogram(0, gapComposer, null, str);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(avatarEntry, modifier, i, 25);
        }
    }

    public static final void ScalableAvatarImage(AvatarImage avatarImage, String str, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        String str2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-598273251);
        int i2 = i | (gapComposer2.changed(avatarImage) ? 4 : 2) | (gapComposer2.changed(str) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            float ScalableAvatarImage$imageScale = ScalableAvatarImage$imageScale(avatarImage);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, ScalableAvatarImage$imageScale);
            if (avatarImage instanceof AvatarImage.Remote) {
                str2 = ((AvatarImage.Remote) avatarImage).getImageUrl();
            } else {
                if (!(avatarImage instanceof AvatarImage.Local)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                str2 = null;
            }
            gapComposer = gapComposer2;
            zzmn.m2026FoundationRemoteImageNXws8ko(new AvatarKt$$ExternalSyntheticLambda9(avatarImage, i3), str2, fillMaxSize, Alignment.Companion.Center, avatarImage.getContentScale(), null, null, avatarImage.colorFilter(gapComposer2), null, null, null, Expect_jvmKt.rememberComposableLambda(1011432318, new CaptureCheckFaceKt$$ExternalSyntheticLambda6(26, avatarImage, str), gapComposer2), gapComposer, 199680, 48, 1856);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(i, 29, modifier2, avatarImage, str);
        }
    }

    public static final float ScalableAvatarImage$imageScale(AvatarImage avatarImage) {
        if (avatarImage instanceof AvatarImage.Remote.Icon) {
            return 0.5f;
        }
        if (avatarImage instanceof AvatarImage.Remote.Image) {
            return 1.0f;
        }
        if (avatarImage instanceof AvatarImage.LocalIcon) {
            return 0.5f;
        }
        if (avatarImage instanceof AvatarImage.LocalResource) {
            return 1.0f;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return RecyclerView.DECELERATION_RATE;
    }

    public static final void ScalableMonogram(int i, Composer composer, Modifier modifier, String str) {
        Modifier modifier2;
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1449254901);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier2, 1.0f);
            Character firstOrNull = StringsKt___StringsKt.firstOrNull(str);
            if (firstOrNull != null) {
                String valueOf = String.valueOf(firstOrNull.charValue());
                valueOf.getClass();
                str2 = valueOf.toUpperCase(Locale.ROOT);
                str2.getClass();
            } else {
                str2 = "";
            }
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).hero;
            FontWeight fontWeight = new FontWeight(500);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ImageKt.Image(rememberTextPainter(str2, TextStyle.m994copyp1EtxEg$default(textStyle, colors.semantic.text.inverse, 0L, fontWeight, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777210), gapComposer), null, fillMaxSize, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 48, 120);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(str, modifier2, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004e  */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SegmentedCircle(ArrayList arrayList, SegmentedCircleConfig segmentedCircleConfig, Modifier modifier, Modifier modifier2, Composer composer, int i, int i2) {
        Modifier modifier3;
        int i3;
        Modifier modifier4;
        RecomposeScopeImpl endRestartGroup;
        ?? r14;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(938718489);
        Applier applier = gapComposer.applier;
        int i4 = (gapComposer.changedInstance(arrayList) ? 4 : 2) | i | (gapComposer.changed(segmentedCircleConfig) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier3 = modifier;
            i4 |= gapComposer.changed(modifier3) ? 256 : 128;
            i3 = i4 | 3072;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                modifier4 = modifier3;
            } else {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier modifier5 = i5 != 0 ? companion : modifier3;
                int i6 = ((i3 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | 3072;
                SegmentedCircleInteractableState m3501rememberSegmentedCircleInteractableStatekHDZbjc = m3501rememberSegmentedCircleInteractableStatekHDZbjc(gapComposer);
                float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(12.0f, gapComposer);
                float m3477toPx8Feqmps2 = DensityUtilsKt.m3477toPx8Feqmps(4.0f, gapComposer);
                Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, modifier5, false);
                BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, aspectRatio);
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
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                boolean z = (((i6 & 14) ^ 6) > 4 && gapComposer.changedInstance(segmentedCircleConfig)) || (i6 & 6) == 4;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    r14 = 0;
                    rememberedValue = new SegmentedCircleKt$SegmentedCircle$3$1$1(segmentedCircleConfig, null == true ? 1 : 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    r14 = 0;
                }
                modifier2 = companion;
                Modifier modifier6 = modifier5;
                CanvasKt.Canvas(r14, gapComposer, SemanticsModifierKt.semantics(fillMaxSize, r14, (Function1) rememberedValue).then(companion), new SegmentedCircleKt$SegmentedCircle$$inlined$SegmentedCircle$1(segmentedCircleConfig, m3501rememberSegmentedCircleInteractableStatekHDZbjc, m3477toPx8Feqmps, m3477toPx8Feqmps2, arrayList, 0));
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(layoutWithConfig(segmentedCircleConfig), 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, r14);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
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
                segmentedCircleConfig.innerContent.invoke(BoxScopeInstance.INSTANCE, gapComposer, 6);
                gapComposer.end(true);
                gapComposer.end(true);
                modifier4 = modifier6;
            }
            Modifier modifier7 = modifier2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5((Object) arrayList, (Object) segmentedCircleConfig, modifier4, (Object) modifier7, i, i2, 17);
                return;
            }
            return;
        }
        modifier3 = modifier;
        i3 = i4 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        Modifier modifier72 = modifier2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShimmerBox(Modifier modifier, boolean z, Alignment alignment, Function3 function3, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        Alignment alignment2;
        RecomposeScopeImpl endRestartGroup;
        boolean z3;
        function3.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1448352967);
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
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                alignment2 = alignment;
                i3 |= gapComposer.changed(alignment2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= gapComposer.changedInstance(function3) ? 2048 : 1024;
                }
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
                    Modifier modifier3 = Modifier.Companion.$$INSTANCE;
                    if (i5 != 0) {
                        modifier2 = modifier3;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        alignment2 = Alignment.Companion.TopStart;
                    }
                    if (z2) {
                        gapComposer.startReplaceGroup(-641528157);
                        InfiniteRepeatableSpec m154infiniteRepeatable9IiC70o$default = AnimatableKt.m154infiniteRepeatable9IiC70o$default(new TweenSpec(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, EasingKt.LinearEasing), RepeatMode.Restart, 4);
                        long j = Color.Black;
                        Color color = new Color(Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j, 14));
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        z3 = false;
                        modifier3 = ShimmerKt.shimmer(modifier3, ShimmerKt.rememberShimmer(ShimmerBounds.Window.INSTANCE, new ShimmerTheme(m154infiniteRepeatable9IiC70o$default, 9, 30.0f, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{color, new Color(Color.m675copywmQWz5c$default(colors.isLight ? 0.05f : 0.5f, j, 14)), new Color(Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j, 14))}), CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(RecyclerView.DECELERATION_RATE), Float.valueOf(0.5f), Float.valueOf(1.0f)})), gapComposer, 0), gapComposer, 70);
                        gapComposer.end(false);
                    } else {
                        z3 = false;
                        gapComposer.startReplaceGroup(-640685453);
                        gapComposer.end(false);
                    }
                    Modifier then = modifier2.then(modifier3);
                    int i7 = (i3 & 7168) | ((i3 >> 3) & 112);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment2, z3);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
                    function3.invoke(BoxScopeInstance.INSTANCE, gapComposer, Integer.valueOf(((i7 >> 6) & 112) | 6));
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                Modifier modifier4 = modifier2;
                boolean z4 = z2;
                Alignment alignment3 = alignment2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(modifier4, z4, alignment3, function3, i, i2);
                    return;
                }
                return;
            }
            alignment2 = alignment;
            if ((i & 3072) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            }
            Modifier modifier42 = modifier2;
            boolean z42 = z2;
            Alignment alignment32 = alignment2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        alignment2 = alignment;
        if ((i & 3072) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
        }
        Modifier modifier422 = modifier2;
        boolean z422 = z2;
        Alignment alignment322 = alignment2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: Subtitle-RIQooxk, reason: not valid java name */
    public static final void m3498SubtitleRIQooxk(String str, long j, long j2, Function2 function2, Composer composer, int i) {
        String str2;
        int i2;
        long j3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1982077790);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (gapComposer.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            j3 = j;
            i2 |= gapComposer.changed(j3) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 32.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14));
            if (function2 == null) {
                gapComposer.startReplaceGroup(-2099950088);
                Room.m1165Text25TpFw(0, 0, 0, 0, (i2 & 14) | ((i2 << 6) & 7168), 0, 4082, j3, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2099829374);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                LazyDslKt.m304MarkdownTextpCuZGqc(str, function2, null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, j, new MarkdownSpanValues(SpanStyle.m973copyGSF8kmg$default(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).linkMedium.spanStyle, j2, null, 0L, JpegConstants.COM_MARKER), 2), null, null, 0, 0, 0, gapComposer, (i2 & 14) | ((i2 >> 6) & 112) | ((i2 << 9) & 57344), 1988);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBannerCardKt$$ExternalSyntheticLambda5(str, j, j2, function2, i, 1);
        }
    }

    /* renamed from: Title-t6yy7ic, reason: not valid java name */
    public static final void m3499Titlet6yy7ic(final Icons icons, final String str, final long j, final long j2, Modifier modifier, Composer composer, final int i) {
        int i2;
        final Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-538175779);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(icons.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(j2) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            BiasAlignment.Vertical vertical = Alignment.Companion.Top;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLinesKt.FirstLineCenter;
            Trace.m1191Iconww6aTOc(icons, (String) null, new WithAlignmentLineElement(horizontalAlignmentLine), j, gapComposer, (i3 & 14) | 48 | ((i3 << 3) & 7168), 0);
            Room.m1165Text25TpFw(0, 0, 0, 0, ((i3 >> 3) & 14) | (i3 & 7168), 0, 4080, j2, (Composer) gapComposer, (Modifier) new WithAlignmentLineElement(horizontalAlignmentLine), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.common.composeui.ArcadeBannerCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    VisibleKt.m3499Titlet6yy7ic(Icons.this, str, j, j2, modifier2, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: TooltipBubble-sW7UJKQ, reason: not valid java name */
    public static final void m3500TooltipBubblesW7UJKQ(Modifier modifier, long j, PaddingValuesImpl paddingValuesImpl, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1218264034);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed(paddingValuesImpl) ? 256 : 128);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Modifier m291widthInVpY3zN4 = SizeKt.m291widthInVpY3zN4(SizeKt.m276defaultMinSizeVpY3zN4$default(SpacerKt.m300paddingVpY3zN4$default(modifier, 40.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 48.0f, 1), 120.0f, 291.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(ClipKt.clip(m291widthInVpY3zN4, new TooltipShape(i3)), j, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Modifier padding = SpacerKt.padding(Modifier.Companion.$$INSTANCE, paddingValuesImpl);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, padding);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            composableLambdaImpl2 = composableLambdaImpl;
            Recorder$$ExternalSyntheticOutline1.m(54, composableLambdaImpl2, ColumnScopeInstance.INSTANCE, gapComposer, true);
            gapComposer.end(true);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextViewKt$$ExternalSyntheticLambda0(modifier, j, paddingValuesImpl, composableLambdaImpl2, i);
        }
    }

    public static final Modifier layoutWithConfig(SegmentedCircleConfig segmentedCircleConfig) {
        return ValueInsets.layout(Modifier.Companion.$$INSTANCE, new CheckDepositAmountKt$$ExternalSyntheticLambda8(segmentedCircleConfig, 27));
    }

    public static Modifier onVisible$default(Modifier modifier, Function0 function0) {
        modifier.getClass();
        function0.getClass();
        return RulerKt.onVisibilityChanged$default(modifier, 0L, 0.01f, new LocalMapKt$$ExternalSyntheticLambda10(21, function0), 4);
    }

    /* renamed from: rememberSegmentedCircleInteractableState-kHDZbjc, reason: not valid java name */
    public static final SegmentedCircleInteractableState m3501rememberSegmentedCircleInteractableStatekHDZbjc(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new SegmentedCircleInteractableState();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (SegmentedCircleInteractableState) rememberedValue;
    }

    public static final TextPainter rememberTextPainter(String str, TextStyle textStyle, Composer composer) {
        TextMeasurer rememberTextMeasurer = TextPainterKt.rememberTextMeasurer(composer);
        boolean changed = ((GapComposer) composer).changed(str);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new TextPainter(str, rememberTextMeasurer, TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, null, null, 0L, new BaselineShift(0.09f), 0L, null, null, null, 3, 0L, null, null, 0, 16744191));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (TextPainter) rememberedValue;
    }

    public static final Modifier scaleHeightToTextLineHeight(Modifier modifier, GapComposer gapComposer, int i) {
        modifier.getClass();
        TextStyle textStyle = (TextStyle) gapComposer.consume(ArcadeThemeKt.LocalTextStyle);
        if (textStyle == null) {
            gapComposer.startReplaceGroup(-1100573765);
            textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
        } else {
            gapComposer.startReplaceGroup(-1100574912);
        }
        gapComposer.end(false);
        return ScaledSizeKt.m3994scaleHeightToTextHeightr9BaKPg(modifier, textStyle.paragraphStyle.lineHeight, gapComposer);
    }

    public static BannerColors standard(Composer composer) {
        return new BannerColors(Strings.getColors(composer).semantic.border.subtle, Strings.getColors(composer).semantic.background.subtle, Strings.getColors(composer).semantic.icon.standard, Strings.getColors(composer).semantic.text.standard, Strings.getColors(composer).semantic.text.subtle, Strings.getColors(composer).semantic.text.standard, Strings.getColors(composer).semantic.text.link, Strings.getColors(composer).component.ui.divider.border);
    }

    public static final float strokeWidth(SegmentedCircleConfig.SizingConfig sizingConfig, float f) {
        sizingConfig.getClass();
        if (sizingConfig instanceof SegmentedCircleConfig.SizingConfig.Fixed) {
            return ((SegmentedCircleConfig.SizingConfig.Fixed) sizingConfig).size;
        }
        if (sizingConfig instanceof SegmentedCircleConfig.SizingConfig.Percentage) {
            return ((SegmentedCircleConfig.SizingConfig.Percentage) sizingConfig).percentage * f;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return RecyclerView.DECELERATION_RATE;
    }
}
