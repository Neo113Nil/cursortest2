package com.squareup.cash.pools.views;

import android.icu.text.MessageFormat;
import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.collection.ArrayMap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda1;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.SwitchKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.TooltipKt$animateTooltip$2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase$performClear$1;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.memory.RealWeakMemoryCache;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.blockers.views.SignatureViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.views.SsnViewKt$SsnContent$3$1$1;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.ProgressMeter$CompletionBehavior;
import com.squareup.cash.common.composeui.ProgressMeter$ZeroBehavior;
import com.squareup.cash.common.composeui.SegmentedCircle$ContentLayoutPolicy;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackOrientation;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.investing.components.ArcadeBordersKt$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda32;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda7;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda4;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$4$1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.payments.views.composer.Subject;
import com.squareup.cash.pdf.view.ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.viewmodels.ContributionAnimation;
import com.squareup.cash.pools.viewmodels.FailureDialogViewModel;
import com.squareup.cash.pools.viewmodels.InviteMemberSnackBarViewModel;
import com.squareup.cash.pools.viewmodels.MemberStatusUpdateSnackBarViewModel;
import com.squareup.cash.pools.viewmodels.PoolCategory;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.pools.viewmodels.PoolDetailsViewModel;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewModel;
import com.squareup.cash.pools.viewmodels.PoolListNuxAssets;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewModel;
import com.squareup.cash.pools.viewmodels.PoolMoreOptionsBottomSheetViewModel;
import com.squareup.cash.pools.viewmodels.PoolParticipant;
import com.squareup.cash.pools.viewmodels.PoolRow;
import com.squareup.cash.pools.viewmodels.PoolsListViewModel;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.pools.views.animation.GoalMetTimeline;
import com.squareup.cash.pools.views.animation.PoolDetailsAnimationStateHolder;
import com.squareup.cash.profile.views.ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.tax.views.TaxAuthorizationView$Content$1$1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda22;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.shift.ShiftNoteViewKt$$ExternalSyntheticLambda9;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.SharedViewEventsKt;
import com.stripe.android.uicore.image.StripeImageKt$$ExternalSyntheticLambda3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public abstract class PoolToastKt {
    public static final ComposableLambdaImpl lambda$2101305157 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(28), false, 2101305157);
    public static final ComposableLambdaImpl lambda$1799357971 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(22), false, 1799357971);

    /* renamed from: lambda$-1957729812, reason: not valid java name */
    public static final ComposableLambdaImpl f571lambda$1957729812 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(23), false, -1957729812);
    public static final ComposableLambdaImpl lambda$1994990354 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(29), false, 1994990354);
    public static final ComposableLambdaImpl lambda$866817632 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(24), false, 866817632);
    public static final ComposableLambdaImpl lambda$939617337 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(25), false, 939617337);
    public static final ComposableLambdaImpl lambda$485552457 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(26), false, 485552457);

    /* renamed from: lambda$-90539968, reason: not valid java name */
    public static final ComposableLambdaImpl f576lambda$90539968 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(27), false, -90539968);

    /* renamed from: lambda$-1694816744, reason: not valid java name */
    public static final ComposableLambdaImpl f568lambda$1694816744 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(28), false, -1694816744);

    /* renamed from: lambda$-858899416, reason: not valid java name */
    public static final ComposableLambdaImpl f575lambda$858899416 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(29), false, -858899416);

    /* renamed from: lambda$-79846248, reason: not valid java name */
    public static final ComposableLambdaImpl f574lambda$79846248 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(1), false, -79846248);
    public static final ComposableLambdaImpl lambda$1998993038 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(2), false, 1998993038);
    public static final ComposableLambdaImpl lambda$38040887 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(3), false, 38040887);

    /* renamed from: lambda$-1991026917, reason: not valid java name */
    public static final ComposableLambdaImpl f572lambda$1991026917 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(4), false, -1991026917);

    /* renamed from: lambda$-1868735209, reason: not valid java name */
    public static final ComposableLambdaImpl f570lambda$1868735209 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(5), false, -1868735209);
    public static final ComposableLambdaImpl lambda$155371320 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(6), false, 155371320);

    /* renamed from: lambda$-2095411590, reason: not valid java name */
    public static final ComposableLambdaImpl f573lambda$2095411590 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(7), false, -2095411590);
    public static final ComposableLambdaImpl lambda$315955276 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(1), false, 315955276);
    public static final ComposableLambdaImpl lambda$1458539751 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(2), false, 1458539751);
    public static final ComposableLambdaImpl lambda$1800749899 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(8), false, 1800749899);
    public static final ComposableLambdaImpl lambda$275201719 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(3), false, 275201719);

    /* renamed from: lambda$-1823111520, reason: not valid java name */
    public static final ComposableLambdaImpl f569lambda$1823111520 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(4), false, -1823111520);
    public static final ComposableLambdaImpl lambda$1447243356 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(5), false, 1447243356);
    public static final ComposableLambdaImpl lambda$1454470104 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(9), false, 1454470104);

    public static final void ActionButtons(final Function0 function0, final Function0 function02, final Function0 function03, final Modifier modifier, final boolean z, final boolean z2, final boolean z3, final boolean z4, final String str, final String str2, Composer composer, final int i) {
        int i2;
        boolean z5;
        GapComposer gapComposer;
        Modifier.Companion companion;
        float f;
        boolean z6;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-167904926);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function03) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            z5 = z2;
            i2 |= gapComposer2.changed(z5) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            z5 = z2;
        }
        int i3 = i2 | (gapComposer2.changed(z3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if ((12582912 & i) == 0) {
            i3 |= gapComposer2.changed(z4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= gapComposer2.changed(str) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= gapComposer2.changed(str2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (306783379 & i3) != 306783378)) {
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer2).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(modifier, 16.0f, 16.0f);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Strings.getSizes(gapComposer2).getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m299paddingVpY3zN4);
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
            Strings.getSizes(gapComposer2).getClass();
            int i4 = i3;
            final boolean z7 = z5;
            SizeKt.AdaptiveStack(null, null, null, new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), null, AdaptiveStackOrientation.Auto, Expect_jvmKt.rememberComposableLambda(1961372937, new Function3() { // from class: com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    adaptiveStackScope.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                    }
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        boolean z8 = z7;
                        boolean z9 = z;
                        boolean z10 = z3;
                        if (z8) {
                            gapComposer3.startReplaceGroup(-1768843459);
                            SizeKt.ButtonCta(function02, adaptiveStackScope.horizontalWeight(companion2, 1.0f), (z9 || z10) ? ButtonProminence.STANDARD : ButtonProminence.PROMINENT, false, false, null, PoolToastKt.lambda$485552457, gapComposer3, 1572864, 56);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-1768562599);
                            gapComposer3.end(false);
                        }
                        if (z9) {
                            gapComposer3.startReplaceGroup(-1768512317);
                            SizeKt.ButtonCta(function0, adaptiveStackScope.horizontalWeight(companion2, 1.0f), z10 ? ButtonProminence.STANDARD : ButtonProminence.PROMINENT, false, false, null, PoolToastKt.f576lambda$90539968, gapComposer3, 1572864, 56);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-1768237223);
                            gapComposer3.end(false);
                        }
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer2, 1769472, 23);
            gapComposer = gapComposer2;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z3) {
                gapComposer.startReplaceGroup(930445151);
                companion = companion2;
                f = 1.0f;
                SizeKt.ButtonCta(function03, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, false, null, f568lambda$1694816744, gapComposer, ((i4 >> 6) & 14) | 1573296, 56);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                companion = companion2;
                f = 1.0f;
                gapComposer.startReplaceGroup(930646186);
                gapComposer.end(false);
            }
            if (z4) {
                gapComposer.startReplaceGroup(930719036);
                Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, f);
                Strings.getSizes(gapComposer).getClass();
                Object obj = DefaultSizes.border.annotationsMap;
                long j = Strings.getColors(gapComposer).semantic.border.subtle;
                Strings.getSizes(gapComposer).getClass();
                Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(fillMaxWidth, f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                Strings.getSizes(gapComposer).getClass();
                Strings.getSizes(gapComposer).getClass();
                Modifier m299paddingVpY3zN42 = SpacerKt.m299paddingVpY3zN4(m178borderxT4_qwU, 8.0f, 16.0f);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN42);
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
                GapComposer gapComposer3 = gapComposer;
                Room.m1165Text25TpFw(0, 0, 0, 3, (i4 >> 24) & 14, 0, 3824, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer3, (Modifier) new HorizontalAlignElement(horizontal), Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                Room.m1165Text25TpFw(0, 0, 0, 3, (i4 >> 27) & 14, 0, 3824, Strings.getColors(gapComposer3).semantic.text.subtle, (Composer) gapComposer3, (Modifier) new HorizontalAlignElement(horizontal), Strings.getTypography(gapComposer3).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer3;
                z6 = true;
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                z6 = true;
                gapComposer.startReplaceGroup(931747306);
                gapComposer.end(false);
            }
            gapComposer.end(z6);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    PoolToastKt.ActionButtons(Function0.this, function02, function03, modifier, z, z2, z3, z4, str, str2, (Composer) obj2, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void BasePoolContent(final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final Function2 function2, final String str, final String str2, final String str3, final long j, final String str4, final ContributionAnimation contributionAnimation, final boolean z, final float f, final float f2, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final String str5, final String str6, final ImmutableList immutableList, final Modifier modifier, final GoalMetTimeline goalMetTimeline, Composer composer, final int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1725674549);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changedInstance(function02) ? 32 : 16) | (gapComposer.changedInstance(function03) ? 256 : 128) | (gapComposer.changedInstance(function04) ? 2048 : 1024);
        boolean changedInstance = gapComposer.changedInstance(function05);
        int i3 = PKIFailureInfo.certRevoked;
        int i4 = i2 | (changedInstance ? 16384 : 8192);
        boolean changed = gapComposer.changed(str);
        int i5 = PKIFailureInfo.signerNotTrusted;
        int i6 = i4 | (changed ? 1048576 : 524288) | (gapComposer.changed(str2) ? 8388608 : 4194304) | (gapComposer.changed(str3) ? 67108864 : 33554432) | (gapComposer.changed(j) ? 536870912 : 268435456);
        int i7 = (gapComposer.changed(str4) ? 4 : 2) | (gapComposer.changedInstance(contributionAnimation) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(f) ? 2048 : 1024) | (gapComposer.changed(f2) ? 16384 : 8192) | (gapComposer.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.changed(z3)) {
            i5 = 1048576;
        }
        int i8 = i7 | i5 | (gapComposer.changed(z4) ? 8388608 : 4194304) | (gapComposer.changed(z5) ? 67108864 : 33554432) | (gapComposer.changed(z6) ? 536870912 : 268435456);
        int i9 = (gapComposer.changed(z7) ? 4 : 2) | (gapComposer.changed(str5) ? 32 : 16) | (gapComposer.changed(str6) ? 256 : 128) | (gapComposer.changedInstance(immutableList) ? 2048 : 1024);
        if (gapComposer.changed(modifier)) {
            i3 = 16384;
        }
        int i10 = i9 | i3 | (gapComposer.changed(goalMetTimeline) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i6 & 1, ((i6 & 306783379) == 306783378 && (i8 & 306783379) == 306783378 && (i10 & 74899) == 74898) ? false : true)) {
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue = gapComposer.rememberedValue();
            Continuation continuation = null;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue2;
            float f3 = AvatarSize.Size48.size;
            float f4 = (-f3) / 3.0f;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new PoolDetailsAnimationStateHolder(f3, f4);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder = (PoolDetailsAnimationStateHolder) rememberedValue3;
            Unit unit = Unit.INSTANCE;
            boolean changed2 = ((i10 & 458752) == 131072) | gapComposer.changed(poolDetailsAnimationStateHolder);
            Object rememberedValue4 = gapComposer.rememberedValue();
            int i11 = 3;
            if (changed2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new RingtoneView.AnonymousClass1(goalMetTimeline, poolDetailsAnimationStateHolder, continuation, i11);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new TabToolbarsKt$$ExternalSyntheticLambda10(4, mutableState);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(modifier, (Function1) rememberedValue5);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onGloballyPositioned);
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
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            HeaderText((i6 >> 15) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, gapComposer, SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), str, str2);
            HorizontalInviteAvatarMenu(function04, null, immutableList, poolDetailsAnimationStateHolder, gapComposer, ((i6 >> 9) & 14) | ((i10 >> 3) & 896));
            int i12 = i8 >> 6;
            int i13 = i6 >> 18;
            int i14 = (i13 & 896) | (i12 & 112) | (i13 & 7168) | ((i8 << 6) & 57344);
            int i15 = i6 << 3;
            ProgressContent(new LayoutWeightElement(1.0f, true), f, str3, j, z, function05, contributionAnimation, str4, f2, poolDetailsAnimationStateHolder, gapComposer, i14 | (i15 & 458752) | ((i8 << 15) & 3670016) | ((i8 << 21) & 29360128) | ((i8 << 12) & 234881024));
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(companion);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new MoneyTabUIKt$$ExternalSyntheticLambda14(24, parcelableSnapshotMutableIntState);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Modifier onSizeChanged = RulerKt.onSizeChanged(fillMaxWidth2, (Function1) rememberedValue6);
            boolean changed3 = gapComposer.changed(density);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new OpenSourceKt$$ExternalSyntheticLambda9(mutableState, (Object) density, (Object) function2, (MutableState) parcelableSnapshotMutableIntState, 1);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            int i16 = i10 << 21;
            ActionButtons(function03, function0, function02, ValueInsets.onGloballyPositioned(onSizeChanged, (Function1) rememberedValue7), z2, z6, z3, z7, str5, str6, gapComposer, ((i6 >> 6) & 14) | (i15 & 112) | (i15 & 896) | ((i8 >> 3) & 57344) | ((i8 >> 12) & 458752) | (i8 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192));
            gapComposer = gapComposer;
            if (!z7 || z5) {
                gapComposer.startReplaceGroup(-1234813603);
                int i17 = i8 >> 18;
                int i18 = i8 << 9;
                FooterText(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), z4, z5, z2, contributionAnimation, z, gapComposer, (i17 & 896) | (i17 & 112) | 6 | (i12 & 7168) | (i18 & 57344) | (i18 & 458752));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1234479175);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(function02, function03, function04, function05, function2, str, str2, str3, j, str4, contributionAnimation, z, f, f2, z2, z3, z4, z5, z6, z7, str5, str6, immutableList, modifier, goalMetTimeline, i) { // from class: com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda34
                public final /* synthetic */ Function0 f$1;
                public final /* synthetic */ String f$10;
                public final /* synthetic */ ContributionAnimation f$11;
                public final /* synthetic */ boolean f$12;
                public final /* synthetic */ float f$13;
                public final /* synthetic */ float f$14;
                public final /* synthetic */ boolean f$15;
                public final /* synthetic */ boolean f$16;
                public final /* synthetic */ boolean f$17;
                public final /* synthetic */ boolean f$18;
                public final /* synthetic */ boolean f$19;
                public final /* synthetic */ Function0 f$2;
                public final /* synthetic */ boolean f$20;
                public final /* synthetic */ String f$21;
                public final /* synthetic */ String f$22;
                public final /* synthetic */ ImmutableList f$23;
                public final /* synthetic */ Modifier f$24;
                public final /* synthetic */ GoalMetTimeline f$25;
                public final /* synthetic */ Function0 f$3;
                public final /* synthetic */ Function0 f$4;
                public final /* synthetic */ Function2 f$5;
                public final /* synthetic */ String f$6;
                public final /* synthetic */ String f$7;
                public final /* synthetic */ String f$8;
                public final /* synthetic */ long f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(196609);
                    PoolToastKt.BasePoolContent(Function0.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, this.f$16, this.f$17, this.f$18, this.f$19, this.f$20, this.f$21, this.f$22, this.f$23, this.f$24, this.f$25, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BaseTitleBar(Function0 function0, Function0 function02, Function0 function03, Modifier modifier, boolean z, boolean z2, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        boolean z4;
        RecomposeScopeImpl endRestartGroup;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(455301111);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function02) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function03) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z3 = z;
            i3 |= gapComposer.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
            if ((196608 & i) != 0) {
                z4 = z2;
                i3 |= gapComposer.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536;
            } else {
                z4 = z2;
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                gapComposer.skipToGroupEnd();
            } else {
                boolean z5 = i4 != 0 ? true : z3;
                DBUtil.TitleBarSub((String) null, NavigationType.CLOSE, SpacerKt.statusBarsPadding(modifier), (DynamicColorConfiguration) null, function0, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-276767912, new PoolDetailsViewKt$$ExternalSyntheticLambda18(z4, function03, z5, function02, 0), gapComposer), gapComposer, ((i3 << 12) & 57344) | 1572918, 40);
                z3 = z5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SwitchKt$$ExternalSyntheticLambda0(function0, function02, function03, modifier, z3, z2, i, i2);
                return;
            }
            return;
        }
        z3 = z;
        if ((196608 & i) != 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    public static final void FooterText(final Modifier modifier, final boolean z, final boolean z2, final boolean z3, final ContributionAnimation contributionAnimation, final boolean z4, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer;
        ?? r2;
        Object roomDatabase$performClear$1;
        Boolean bool;
        MutableState mutableState;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-45794129);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(contributionAnimation) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(z4) ? 131072 : 65536;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline1.m(z4 && contributionAnimation != null, gapComposer2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Boolean valueOf = Boolean.valueOf(z4);
            boolean changedInstance = gapComposer2.changedInstance(contributionAnimation) | ((i2 & 458752) == 131072);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                r2 = 0;
                bool = valueOf;
                mutableState = mutableState2;
                roomDatabase$performClear$1 = new RoomDatabase$performClear$1(z4, contributionAnimation, mutableState, (Continuation) null, 15);
                gapComposer2.updateRememberedValue(roomDatabase$performClear$1);
            } else {
                mutableState = mutableState2;
                r2 = 0;
                roomDatabase$performClear$1 = rememberedValue2;
                bool = valueOf;
            }
            Updater.LaunchedEffect(gapComposer2, bool, (Function2) roomDatabase$performClear$1);
            if (z2) {
                gapComposer2.startReplaceGroup(1547312086);
                Boolean bool2 = (Boolean) mutableState.getValue();
                bool2.getClass();
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(28);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                AnimatedContentKt.AnimatedContent(bool2, null, (Function1) rememberedValue3, null, "Footer contribution message swap", null, Expect_jvmKt.rememberComposableLambda(-1503650927, new PoolDetailsViewKt$$ExternalSyntheticLambda41(r2, modifier, contributionAnimation), gapComposer2), gapComposer2, 1597824, 42);
                GapComposer gapComposer3 = gapComposer2;
                gapComposer3.end(r2);
                gapComposer = gapComposer3;
            } else {
                GapComposer gapComposer4 = gapComposer2;
                gapComposer4.startReplaceGroup(1549095671);
                ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                boolean z5 = r2;
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                String stringResource = Room.stringResource(gapComposer4, z3 ? R.string.pools_details_activity_footer_empty_owner : z ? R.string.pools_details_activity_footer_empty : R.string.pools_details_activity_footer_contribute_to_see);
                TextStyle textStyle = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, z5);
                } else {
                    gapComposer4.startReplaceGroup(-1762997739);
                    gapComposer4.end(z5);
                }
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, colors.semantic.text.subtle, (Composer) gapComposer4, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                gapComposer4.end(z5);
                gapComposer = gapComposer4;
            }
        } else {
            GapComposer gapComposer5 = gapComposer2;
            gapComposer5.skipToGroupEnd();
            gapComposer = gapComposer5;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    PoolToastKt.FooterText(Modifier.this, z, z2, z3, contributionAnimation, z4, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void HeaderText(int i, Composer composer, Modifier modifier, String str, String str2) {
        int i2;
        String str3;
        String str4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1653377351);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str2) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            float m939getContainerSizeYbymL2g = ((int) (((LazyWindowInfo) ((WindowInfo) gapComposer.consume(CompositionLocalsKt.LocalWindowInfo))).m939getContainerSizeYbymL2g() & BodyPartID.bodyIdMax)) / ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).getDensity();
            boolean changed = gapComposer.changed(m939getContainerSizeYbymL2g);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Float.valueOf((((RangesKt___RangesKt.coerceIn(m939getContainerSizeYbymL2g, 750.0f, 850.0f) - 750.0f) * 0.3f) / 100.0f) + 0.7f);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            float floatValue = ((Number) rememberedValue).floatValue();
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            TextStyle textStyle = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).headlineLarge;
            long j = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).headlineLarge.spanStyle.fontSize;
            Room.m1167checkArithmeticR2X_6o(j);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.pack(j & 1095216660480L, TextUnit.m1059getValueimpl(j) * floatValue), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            str3 = str;
            str4 = str2;
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 6) & 14, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            str3 = str;
            str4 = str2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolDetailsViewKt$$ExternalSyntheticLambda35(modifier, str3, str4, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [com.squareup.cash.arcade.components.avatar.AvatarImage] */
    /* JADX WARN: Type inference failed for: r29v2 */
    public static final void HorizontalInviteAvatarMenu(Function0 function0, Modifier modifier, ImmutableList immutableList, PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder, Composer composer, int i) {
        Function0 function02;
        int i2;
        Modifier modifier2;
        Throwable th;
        String str;
        String format2;
        boolean z;
        boolean z2;
        long j;
        ?? r29;
        function0.getClass();
        immutableList.getClass();
        poolDetailsAnimationStateHolder.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1858319575);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            function02 = function0;
            i2 = (gapComposer.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(immutableList) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(poolDetailsAnimationStateHolder) ? 2048 : 1024;
        }
        boolean z3 = false;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean changed = gapComposer.changed(immutableList);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = immutableList.size() <= 5 ? new Pair(immutableList, 0) : new Pair(CollectionsKt.take(immutableList, 4), Integer.valueOf(immutableList.size() - 4));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Pair pair = (Pair) rememberedValue;
            List list = (List) pair.first;
            int intValue = ((Number) pair.second).intValue();
            boolean isEmpty = list.isEmpty();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (isEmpty) {
                modifier2 = companion;
                gapComposer.startReplaceGroup(933482425);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(930583088);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = ((PoolParticipant) it.next()).name;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
                int size = list.size();
                if (size == 0) {
                    th = null;
                    gapComposer.startReplaceGroup(930642452);
                    gapComposer.end(false);
                    str = null;
                } else if (size != 1) {
                    gapComposer.startReplaceGroup(930863607);
                    String joinToString$default = arrayList.size() == 2 ? (String) arrayList.get(0) : CollectionsKt.joinToString$default(CollectionsKt.dropLast(1, arrayList), ", ", null, ",", 0, null, null, 58);
                    Object last = CollectionsKt.last((List) arrayList);
                    joinToString$default.getClass();
                    last.getClass();
                    th = null;
                    ArrayMap arrayMap = new ArrayMap(2);
                    arrayMap.put("initialNames", joinToString$default);
                    arrayMap.put("names", last);
                    str = new MessageFormat(Room.stringResource(gapComposer, R.string.pools_details_avatar_row_accessibility_label_plural)).format(arrayMap);
                    str.getClass();
                    gapComposer.end(false);
                } else {
                    th = null;
                    gapComposer.startReplaceGroup(861305773);
                    Object obj = arrayList.get(0);
                    obj.getClass();
                    ArrayMap arrayMap2 = new ArrayMap(1);
                    arrayMap2.put("name", obj);
                    str = new MessageFormat(Room.stringResource(gapComposer, R.string.pools_details_avatar_row_accessibility_label_singular)).format(arrayMap2);
                    str.getClass();
                    gapComposer.end(false);
                }
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                if (intValue == 0) {
                    format2 = re$$ExternalSyntheticOutline0.m(gapComposer, 931647287, R.string.pool_details_horizontal_avatar_row_no_additional_participants_label, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(931815369);
                    format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.pool_details_horizontal_avatar_row_additional_participants_label)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(intValue), "count"));
                    format2.getClass();
                    z3 = false;
                    gapComposer.end(false);
                }
                Function0 function03 = function02;
                modifier2 = companion;
                Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m300paddingVpY3zN4$default, mutableInteractionSourceImpl, null, false, format2, null, function03, 20);
                boolean changed2 = gapComposer.changed(str);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new ClusterItemKt$$ExternalSyntheticLambda3(str, 29);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(m182clickableO2vRcR0$default, (Function1) rememberedValue3);
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw th;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
                gapComposer.startReplaceGroup(262587249);
                Modifier alpha = AlphaKt.alpha(modifier2, ((Number) poolDetailsAnimationStateHolder.avatarAlphaAnimatable.getValue()).floatValue());
                boolean z4 = true;
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(((Dp) poolDetailsAnimationStateHolder.avatarSpacingAnimatable.getValue()).value, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 48);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, alpha);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                gapComposer.startReplaceGroup(-198318776);
                gapComposer.startReplaceGroup(-969953225);
                List<PoolParticipant> list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (PoolParticipant poolParticipant : list2) {
                    String str3 = poolParticipant.name;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = str3;
                    int i4 = 0;
                    Color m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -2094890463, poolParticipant.accentColor, gapComposer, false);
                    if (m == null) {
                        gapComposer.startReplaceGroup(-2094888771);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors.semantic.background.subtle;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-2094891127);
                        gapComposer.end(false);
                        j = m.value;
                    }
                    long j2 = j;
                    Image image = poolParticipant.photoImage;
                    if (image == null) {
                        gapComposer.startReplaceGroup(-516941586);
                        gapComposer.end(false);
                        r29 = th;
                    } else {
                        gapComposer.startReplaceGroup(-516941585);
                        AvatarImage.Remote.Image image2 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image, gapComposer), false, null, 0L, new PoolDetailsViewKt$$ExternalSyntheticLambda47(i4), 62);
                        gapComposer.end(false);
                        r29 = image2;
                    }
                    arrayList2.add(new AvatarEntry(str4, j2, null, r29, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE));
                }
                gapComposer.end(false);
                Iterator it2 = Tags.toImmutableList(arrayList2).iterator();
                while (it2.hasNext()) {
                    TextViewKt.Avatar(AvatarSize.Size48, (AvatarEntry) it2.next(), realWeakMemoryCache.m1459clippedOutlinewH6b6FI(modifier2, RoundedCornerShapeKt.CircleShape, 3.0f), false, gapComposer, 6, 24);
                    intValue = intValue;
                    realWeakMemoryCache = realWeakMemoryCache;
                    z4 = z4;
                }
                boolean z5 = z4;
                RealWeakMemoryCache realWeakMemoryCache2 = realWeakMemoryCache;
                int i5 = intValue;
                gapComposer.end(false);
                if (i5 > 0) {
                    gapComposer.startReplaceGroup(-1852657241);
                    RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                    Modifier m1459clippedOutlinewH6b6FI = realWeakMemoryCache2.m1459clippedOutlinewH6b6FI(modifier2, roundedCornerShape, 3.0f);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m285size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(ImageKt.m177backgroundbw27NRU(m1459clippedOutlinewH6b6FI, colors2.semantic.background.subtle, roundedCornerShape), 48.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    z2 = z5;
                    z = false;
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, (TextLineBalancing) null, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(RangesKt___RangesKt.coerceIn(i5, 0, 99), Marker.ANY_NON_NULL_MARKER), (Map) null, (Function1) null, false);
                    gapComposer = gapComposer;
                    gapComposer.end(z2);
                    gapComposer.end(false);
                } else {
                    z = false;
                    z2 = z5;
                    gapComposer.startReplaceGroup(-1852065265);
                    gapComposer.end(false);
                }
                gapComposer.end(z2);
                gapComposer.end(z);
                gapComposer.end(z2);
                gapComposer.end(z);
            }
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(modifier2, function0, immutableList, poolDetailsAnimationStateHolder, i, 5);
        }
    }

    public static final void NoPoolsPlaceholder(PoolCategory poolCategory, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Pair pair;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1046462300);
        if ((i & 6) == 0) {
            i3 = i | (gapComposer.changed(poolCategory.ordinal()) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i3 | (gapComposer.changed(modifier2) ? 32 : 16);
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier3 = i5 != 0 ? companion : modifier2;
            int ordinal = poolCategory.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-627917619);
                pair = new Pair(Room.stringResource(gapComposer, R.string.pools_list_empty_no_active_pools), Room.stringResource(gapComposer, R.string.pools_list_empty_no_active_pools_subtitle));
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -627919143, false);
                }
                gapComposer.startReplaceGroup(-627912019);
                pair = new Pair(Room.stringResource(gapComposer, R.string.pools_list_empty_no_closed_pools), Room.stringResource(gapComposer, R.string.pools_list_empty_no_closed_pools_subtitle));
                gapComposer.end(false);
            }
            String str = (String) pair.first;
            String str2 = (String) pair.second;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier3, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            long j = Strings.getColors(gapComposer).semantic.border.subtle;
            Strings.getSizes(gapComposer).getClass();
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m300paddingVpY3zN4$default, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m178borderxT4_qwU, 32.0f, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(poolCategory, modifier2, i, i2, 14);
        }
    }

    public static final void NoResults(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1536792596);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
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
            String stringResource = Room.stringResource(gapComposer, R.string.pools_invite_empty_view_title);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            String stringResource2 = Room.stringResource(gapComposer, R.string.pools_invite_empty_view_message);
            TextStyle textStyle = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier2, i, 7);
        }
    }

    public static final void NuxImage(Image image, int i, Modifier modifier, Composer composer, int i2) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(368930331);
        int i3 = (gapComposer.changedInstance(image) ? 4 : 2) | i2 | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Painter painterResource = Countries.painterResource(i, (i3 >> 3) & 14, gapComposer);
            String m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, -1940230456, image, gapComposer, false);
            int i4 = Painter.$stable;
            int i5 = (i3 & 896) | 48 | (i4 << 12) | (i4 << 15);
            modifier2 = modifier;
            AsyncImageKt.m1442AsyncImagex1rPTaM(m, modifier2, null, painterResource, painterResource, null, ContentScale.Companion.FillWidth, gapComposer, i5, 6, 31688);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(i, i2, modifier2, image);
        }
    }

    public static final void NuxInfo(Modifier modifier, PoolListNuxAssets poolListNuxAssets, Composer composer, int i) {
        PoolListNuxAssets poolListNuxAssets2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-739668684);
        int i2 = i | 6 | (gapComposer.changedInstance(poolListNuxAssets) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
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
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.pools_list_nux_learn_more_title), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier aspectRatio = OffsetKt.aspectRatio(1.5f, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), false);
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            NuxImage(poolListNuxAssets.learnMoreImage, 2131231220, ClipKt.clip(aspectRatio, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), gapComposer, 0);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.pools_list_nux_collect_money_description), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.pools_list_nux_all_payments_title), (Modifier) null, (String) null, (Function0) null, Room.stringResource(gapComposer, R.string.pools_list_nux_all_payments_body), gapComposer, 0, 14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            modifier2 = companion;
            Modifier aspectRatio2 = OffsetKt.aspectRatio(1.4f, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(modifier2, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), false);
            Strings.getSizes(gapComposer).getClass();
            poolListNuxAssets2 = poolListNuxAssets;
            NuxImage(poolListNuxAssets2.paymentsImage, 2131231055, ClipKt.clip(aspectRatio2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), gapComposer, 0);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.pools_list_nux_pooled_money_title), (Modifier) null, (String) null, (Function0) null, Room.stringResource(gapComposer, R.string.pools_list_nux_pooled_money_body), gapComposer, 0, 14);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            poolListNuxAssets2 = poolListNuxAssets;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewViewKt$$ExternalSyntheticLambda0(modifier2, poolListNuxAssets2, i, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* renamed from: PoolAvatar-nxwB2Kw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3717PoolAvatarnxwB2Kw(final ImmutableList immutableList, final PoolAvatarSize poolAvatarSize, Modifier modifier, long j, float f, float f2, float f3, long j2, long j3, Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        long j4;
        int i4;
        int i5;
        float f4;
        int i6;
        int i7;
        float f5;
        int i8;
        float f6;
        long j5;
        int i9;
        int i10;
        int i11;
        int i12;
        GapComposer gapComposer;
        final Modifier modifier2;
        final long j6;
        final float f7;
        final float f8;
        final float f9;
        final long j7;
        final long j8;
        final Function3 function32;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier3;
        long j9;
        long j10;
        Function3 function33;
        long j11;
        float f10;
        float f11;
        float f12;
        long j12;
        immutableList.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(446253615);
        int i13 = i | (gapComposer2.changed(immutableList) ? 4 : 2);
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 = i13 | MLKEMEngine.KyberPolyBytes;
        } else {
            i3 = i13 | (gapComposer2.changed(modifier) ? 256 : 128);
        }
        if ((i2 & 8) == 0) {
            j4 = j;
            if (gapComposer2.changed(j4)) {
                i4 = 2048;
                int i15 = i3 | i4;
                i5 = i2 & 16;
                if (i5 == 0) {
                    i6 = i15 | 24576;
                    f4 = f;
                } else {
                    f4 = f;
                    i6 = i15 | (gapComposer2.changed(f4) ? 16384 : PKIFailureInfo.certRevoked);
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                    i6 |= 196608;
                } else if ((i & 196608) == 0) {
                    f5 = f2;
                    i6 |= gapComposer2.changed(f5) ? PKIFailureInfo.unsupportedVersion : 65536;
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        i6 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        f6 = f3;
                        i6 |= gapComposer2.changed(f6) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        if ((i2 & 128) != 0) {
                            j5 = j2;
                            if (gapComposer2.changed(j5)) {
                                i9 = 8388608;
                                int i16 = i6 | i9;
                                if ((i2 & 256) != 0 && gapComposer2.changed(j3)) {
                                    i10 = 67108864;
                                    int i17 = i16 | i10;
                                    i11 = i2 & 512;
                                    if (i11 != 0) {
                                        i17 |= 805306368;
                                    } else if ((i & 805306368) == 0) {
                                        i17 |= gapComposer2.changedInstance(function3) ? PKIFailureInfo.duplicateCertReq : 268435456;
                                        i12 = i17;
                                        if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378)) {
                                            gapComposer = gapComposer2;
                                            gapComposer.skipToGroupEnd();
                                            modifier2 = modifier;
                                            j6 = j4;
                                            f7 = f4;
                                            f8 = f5;
                                            f9 = f6;
                                            j7 = j5;
                                            j8 = j3;
                                            function32 = function3;
                                        } else {
                                            gapComposer2.startDefaults();
                                            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                                modifier3 = i14 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                                                if ((i2 & 8) != 0) {
                                                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                                    if (colors == null) {
                                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                                    } else {
                                                        gapComposer2.startReplaceGroup(-1762997739);
                                                        gapComposer2.end(false);
                                                    }
                                                    j4 = colors.semantic.background.standard;
                                                    i12 &= -7169;
                                                }
                                                float f13 = i5 != 0 ? RecyclerView.DECELERATION_RATE : f4;
                                                float f14 = i7 != 0 ? 2.0f : f5;
                                                float f15 = i8 != 0 ? 1.0f : f6;
                                                if ((i2 & 128) != 0) {
                                                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                                    if (colors2 == null) {
                                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                                    } else {
                                                        gapComposer2.startReplaceGroup(-1762997739);
                                                        gapComposer2.end(false);
                                                    }
                                                    j9 = colors2.semantic.border.brand;
                                                    i12 &= -29360129;
                                                } else {
                                                    j9 = j5;
                                                }
                                                if ((i2 & 256) != 0) {
                                                    Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                                    if (colors3 == null) {
                                                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                                    } else {
                                                        gapComposer2.startReplaceGroup(-1762997739);
                                                        gapComposer2.end(false);
                                                    }
                                                    j10 = colors3.semantic.border.subtle;
                                                    i12 &= -234881025;
                                                } else {
                                                    j10 = j3;
                                                }
                                                function33 = i11 != 0 ? null : function3;
                                                j11 = j10;
                                                f10 = f13;
                                                f11 = f14;
                                                f12 = f15;
                                                j12 = j9;
                                            } else {
                                                gapComposer2.skipToGroupEnd();
                                                if ((i2 & 8) != 0) {
                                                    i12 &= -7169;
                                                }
                                                if ((i2 & 128) != 0) {
                                                    i12 &= -29360129;
                                                }
                                                if ((i2 & 256) != 0) {
                                                    i12 &= -234881025;
                                                }
                                                modifier3 = modifier;
                                                j11 = j3;
                                                f10 = f4;
                                                f11 = f5;
                                                f12 = f6;
                                                j12 = j5;
                                                function33 = function3;
                                            }
                                            gapComposer2.endDefaults();
                                            Modifier m285size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(modifier3, poolAvatarSize.size);
                                            ProgressMeter$CompletionBehavior progressMeter$CompletionBehavior = ProgressMeter$CompletionBehavior.NONE;
                                            ProgressMeter$ZeroBehavior progressMeter$ZeroBehavior = ProgressMeter$ZeroBehavior.HIDDEN;
                                            SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy = SegmentedCircle$ContentLayoutPolicy.INSIDE_EDGE;
                                            int i18 = i12 >> 12;
                                            gapComposer = gapComposer2;
                                            VisibleKt.m3497ProgressMeterUV7SVM(f10, j12, f11, m285size3ABfNKs, j11, f12, 0L, progressMeter$CompletionBehavior, progressMeter$ZeroBehavior, segmentedCircle$ContentLayoutPolicy, segmentedCircle$ContentLayoutPolicy, null, Expect_jvmKt.rememberComposableLambda(344861184, new PoolAvatarKt$$ExternalSyntheticLambda0(immutableList, function33, poolAvatarSize, j4, 0), gapComposer2), gapComposer, (i18 & 57344) | (i18 & 14) | 918552576 | ((i12 >> 18) & 112) | ((i12 >> 9) & 896) | ((i12 >> 3) & 458752), 390, 2112);
                                            modifier2 = modifier3;
                                            j6 = j4;
                                            function32 = function33;
                                            f7 = f10;
                                            j7 = j12;
                                            f8 = f11;
                                            j8 = j11;
                                            f9 = f12;
                                        }
                                        endRestartGroup = gapComposer.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.pools.views.PoolAvatarKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    ((Integer) obj2).getClass();
                                                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                                    PoolToastKt.m3717PoolAvatarnxwB2Kw(ImmutableList.this, poolAvatarSize, modifier2, j6, f7, f8, f9, j7, j8, function32, (Composer) obj, updateChangedFlags, i2);
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            return;
                                        }
                                        return;
                                    }
                                    i12 = i17;
                                    if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378)) {
                                    }
                                    endRestartGroup = gapComposer.endRestartGroup();
                                    if (endRestartGroup == null) {
                                    }
                                }
                                i10 = 33554432;
                                int i172 = i16 | i10;
                                i11 = i2 & 512;
                                if (i11 != 0) {
                                }
                                i12 = i172;
                                if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378)) {
                                }
                                endRestartGroup = gapComposer.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                        } else {
                            j5 = j2;
                        }
                        i9 = 4194304;
                        int i162 = i6 | i9;
                        if ((i2 & 256) != 0) {
                            i10 = 67108864;
                            int i1722 = i162 | i10;
                            i11 = i2 & 512;
                            if (i11 != 0) {
                            }
                            i12 = i1722;
                            if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378)) {
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i10 = 33554432;
                        int i17222 = i162 | i10;
                        i11 = i2 & 512;
                        if (i11 != 0) {
                        }
                        i12 = i17222;
                        if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f6 = f3;
                    if ((i2 & 128) != 0) {
                    }
                    i9 = 4194304;
                    int i1622 = i6 | i9;
                    if ((i2 & 256) != 0) {
                    }
                    i10 = 33554432;
                    int i172222 = i1622 | i10;
                    i11 = i2 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i172222;
                    if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f5 = f2;
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                f6 = f3;
                if ((i2 & 128) != 0) {
                }
                i9 = 4194304;
                int i16222 = i6 | i9;
                if ((i2 & 256) != 0) {
                }
                i10 = 33554432;
                int i1722222 = i16222 | i10;
                i11 = i2 & 512;
                if (i11 != 0) {
                }
                i12 = i1722222;
                if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
        } else {
            j4 = j;
        }
        i4 = 1024;
        int i152 = i3 | i4;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        f5 = f2;
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        f6 = f3;
        if ((i2 & 128) != 0) {
        }
        i9 = 4194304;
        int i162222 = i6 | i9;
        if ((i2 & 256) != 0) {
        }
        i10 = 33554432;
        int i17222222 = i162222 | i10;
        i11 = i2 & 512;
        if (i11 != 0) {
        }
        i12 = i17222222;
        if (gapComposer2.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PoolContributeAmountAtm(String str, List list, String str2, boolean z, Function1 function1, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        str.getClass();
        list.getClass();
        str2.getClass();
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1266000715);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(modifier) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(895805962, new MoneyTabUIKt$$ExternalSyntheticLambda32(modifier, str, list, function1, function0, z, str2), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda2(str, list, str2, z, function1, function0, modifier, i);
        }
    }

    public static final void PoolContributeAmountCustom(CurrencyCode currencyCode, String str, boolean z, String str2, boolean z2, Function1 function1, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        boolean z3;
        currencyCode.getClass();
        str.getClass();
        str2.getClass();
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-126563323);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(currencyCode.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z2;
            i2 |= gapComposer.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            z3 = z2;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changed(modifier) ? 8388608 : 4194304;
        }
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer.consume(LocalCashVibratorKt.LocalCashVibrator);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer, 0);
            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(currencyCode, null, false, 0, 14);
            boolean changedInstance = ((i2 & 458752) == 131072) | gapComposer.changedInstance(realCashVibrator) | gapComposer.changedInstance(rememberShaker);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new StartPoolAmountKt$$ExternalSyntheticLambda4(function1, realCashVibrator, rememberShaker, 5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, str2, (Function1) rememberedValue, gapComposer, 0);
            boolean changed = gapComposer.changed(rememberAmountDisplayState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new AmountDisplayKeypadListener(rememberAmountDisplayState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AmountDisplayKeypadListener amountDisplayKeypadListener = (AmountDisplayKeypadListener) rememberedValue2;
            long j = Strings.getColors(gapComposer).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, j, rectangleShapeKt$RectangleShape$1);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier shakeWith = SharedViewEventsKt.shakeWith(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), rememberShaker);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(shakeWith, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(26);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            ConnectionPoolKt.m1177AmountDisplaykNX22eY(rememberAmountDisplayState, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, false, (Function1) rememberedValue3), Strings.getColors(gapComposer).semantic.text.prominent, 0L, 0, 0, gapComposer, 0, 56);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean changedInstance2 = gapComposer.changedInstance(amountDisplayKeypadListener);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == obj) {
                rememberedValue4 = new StartPoolAmountKt$$ExternalSyntheticLambda7(amountDisplayKeypadListener, 4);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function0 function02 = (Function0) rememberedValue4;
            boolean changedInstance3 = gapComposer.changedInstance(amountDisplayKeypadListener);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue5 == obj) {
                rememberedValue5 = new StartPoolAmountKt$$ExternalSyntheticLambda8(amountDisplayKeypadListener, 3);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            RelationUtil.m1189KeypadViewww6aTOc(m300paddingVpY3zN4$default2, new KeypadViewModel(null, false, function02, (Function1) rememberedValue5, 3), null, Strings.getColors(gapComposer).semantic.text.standard, gapComposer, 0, 4);
            DimensionKt.ButtonCtaGroup(ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), false, null, null, Expect_jvmKt.rememberComposableLambda(1069550989, new SwipeableKt$$ExternalSyntheticLambda0(z3, realCashVibrator, rememberShaker, function0, z, str), gapComposer), gapComposer, 24576, 14);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalendarRowKt$$ExternalSyntheticLambda2(currencyCode, str, z, str2, z2, function1, function0, modifier, i);
        }
    }

    public static final void PoolContributeComposer(PoolContributeWithNoteViewModel poolContributeWithNoteViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        poolContributeWithNoteViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2051694677);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(poolContributeWithNoteViewModel) ? 4 : 2) | i;
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
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-879107349, new PoolContributeComposerKt$$ExternalSyntheticLambda0(function1, poolContributeWithNoteViewModel, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(poolContributeWithNoteViewModel, function1, realImageLoader, i, 1);
        }
    }

    public static final void PoolContributeNote(String str, String str2, ImmutableList immutableList, String str3, Function0 function0, Function1 function1, Function0 function02, Modifier modifier, Composer composer, int i) {
        int i2;
        str.getClass();
        str2.getClass();
        immutableList.getClass();
        function0.getClass();
        function1.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2103558778);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(immutableList) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changed(modifier) ? 8388608 : 4194304;
        }
        if (gapComposer.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1880632015, new DateInputKt$$ExternalSyntheticLambda1(modifier, function0, str, str2, str3, function02, function1, immutableList), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StripeImageKt$$ExternalSyntheticLambda3(str, str2, immutableList, str3, function0, function1, function02, modifier, i);
        }
    }

    public static final void PoolContributeReview(final String str, final String str2, final ImmutableList immutableList, final String str3, final String str4, final InstrumentSelectionRowViewModel instrumentSelectionRowViewModel, final Function0 function0, final Function0 function02, final Function0 function03, final Modifier modifier, Composer composer, final int i) {
        int i2;
        String str5;
        String str6;
        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2;
        Function0 function04;
        Function0 function05;
        Function0 function06;
        Modifier modifier2;
        str.getClass();
        str2.getClass();
        immutableList.getClass();
        str4.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-556656281);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(immutableList) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str5 = str3;
            i2 |= gapComposer.changed(str5) ? 2048 : 1024;
        } else {
            str5 = str3;
        }
        if ((i & 24576) == 0) {
            str6 = str4;
            i2 |= gapComposer.changed(str6) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            str6 = str4;
        }
        if ((196608 & i) == 0) {
            instrumentSelectionRowViewModel2 = instrumentSelectionRowViewModel;
            i2 |= gapComposer.changedInstance(instrumentSelectionRowViewModel2) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            instrumentSelectionRowViewModel2 = instrumentSelectionRowViewModel;
        }
        if ((1572864 & i) == 0) {
            function04 = function0;
            i2 |= gapComposer.changedInstance(function04) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            function04 = function0;
        }
        if ((12582912 & i) == 0) {
            function05 = function02;
            i2 |= gapComposer.changedInstance(function05) ? 8388608 : 4194304;
        } else {
            function05 = function02;
        }
        if ((100663296 & i) == 0) {
            function06 = function03;
            i2 |= gapComposer.changedInstance(function06) ? 67108864 : 33554432;
        } else {
            function06 = function03;
        }
        if ((805306368 & i) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer.changed(modifier2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            modifier2 = modifier;
        }
        if (gapComposer.shouldExecute(i2 & 1, (306783379 & i2) != 306783378)) {
            final String str7 = str5;
            final String str8 = str6;
            final InstrumentSelectionRowViewModel instrumentSelectionRowViewModel3 = instrumentSelectionRowViewModel2;
            final Function0 function07 = function04;
            final Function0 function08 = function05;
            final Function0 function09 = function06;
            final Modifier modifier3 = modifier2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1504292338, new Function2() { // from class: com.squareup.cash.pools.views.PoolContributeReviewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    int i3 = 1;
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.this, Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
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
                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        DBUtil.TitleBarSub((String) null, NavigationType.BACK, (Modifier) null, (DynamicColorConfiguration) null, function07, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                        String str9 = "Contribute " + str;
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1170408982, new PoolContributeNoteKt$$ExternalSyntheticLambda6(immutableList, i3), gapComposer2);
                        String str10 = str2;
                        Subject subject = new Subject(str10, rememberComposableLambda, str10);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        Object obj3 = Composer.Companion.Empty;
                        if (rememberedValue == obj3) {
                            rememberedValue = new DateScrubber$$ExternalSyntheticLambda0(7);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        ErrorKt.SegmentedTitle((Function0) rememberedValue, str9, subject, null, gapComposer2, 221574);
                        String str11 = str7;
                        if (str11 == null || str11.length() == 0) {
                            gapComposer2.startReplaceGroup(-2005311066);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-2005630118);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                            Strings.getSizes(gapComposer2).getClass();
                            DefaultSizes.spacing.getClass();
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("“", str11, "”"), (Map) null, (Function1) null, false);
                            gapComposer2 = gapComposer2;
                            gapComposer2.end(false);
                        }
                        Function0 function010 = function09;
                        boolean changed = gapComposer2.changed(function010);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue2 == obj3) {
                            rememberedValue2 = new LocalMapKt$$ExternalSyntheticLambda10(28, function010);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        Function1 function1 = (Function1) rememberedValue2;
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (rememberedValue3 == obj3) {
                            rememberedValue3 = new DateScrubber$$ExternalSyntheticLambda0(8);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        GapComposer gapComposer3 = gapComposer2;
                        ErrorKt.ReviewPayment(null, function08, function1, (Function0) rememberedValue3, null, null, null, null, instrumentSelectionRowViewModel3, false, false, false, false, null, null, null, null, null, null, null, "Contribute", str8, null, gapComposer3, 805309440, 6, 5242097);
                        gapComposer3.end(true);
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
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.pools.views.PoolContributeReviewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    PoolToastKt.PoolContributeReview(str, str2, immutableList, str3, str4, instrumentSelectionRowViewModel, function0, function02, function03, modifier, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void PoolCreateError(String str, String str2, Function1 function1, Modifier modifier, Composer composer, int i) {
        str.getClass();
        str2.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(77908198);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(577542535, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, i3), gapComposer), (Modifier) null, lambda$2101305157, Expect_jvmKt.rememberComposableLambda(-1431780828, new PoolCreateViewKt$$ExternalSyntheticLambda6(str2, function1, i3), gapComposer), gapComposer, 3462, 2);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            DimensionKt.ButtonCtaGroup(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), false, null, null, Expect_jvmKt.rememberComposableLambda(-1041889170, new PdfPreviewViewKt$$ExternalSyntheticLambda4(10, function1), gapComposer), gapComposer, 24576, 14);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(str, str2, function1, modifier, i, 15);
        }
    }

    public static final void PoolCreateLoading(int i, Composer composer, Modifier modifier, String str) {
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1792165130);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            ArrayMap arrayMap = new ArrayMap(1);
            arrayMap.put("name", str);
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.pools_create_loading_text)).format(arrayMap);
            format2.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(str, modifier, i, 0);
        }
    }

    public static final void PoolDescription(String str, boolean z, Function1 function1, Function0 function0, Modifier modifier, String str2, Composer composer, int i) {
        int i2;
        NeverEqualPolicy neverEqualPolicy;
        boolean z2;
        boolean changedInstance;
        Object rememberedValue;
        str.getClass();
        function1.getClass();
        function0.getClass();
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-582104667);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer.consume(LocalCashVibratorKt.LocalCashVibrator);
            int i3 = i2;
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(str2, 0L, gapComposer, (i2 >> 15) & 14, 2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer, 1);
            Unit unit = Unit.INSTANCE;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = new SsnViewKt$SsnContent$3$1$1(focusRequester, null, 6);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            boolean changed = ((i3 & 896) == 256) | gapComposer.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy2) {
                rememberedValue4 = new MusicViewKt$LoadedMusicContent$1$1(function1, m382rememberTextFieldStateLepunE, (Continuation) null, 15);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer, charSequence, (Function2) rememberedValue4);
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer).component.sheet.background, ColorKt.RectangleShape), 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 16.0f, 1);
            Strings.getSizes(gapComposer).getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Strings.getSizes(gapComposer).getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.pools_description_title)).format(zzel$EnumUnboxingLocalUtility.m(1, "amount", str));
            format2.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, m300paddingVpY3zN4$default2, Strings.getTypography(gapComposer).pageTitle, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Strings.getSizes(gapComposer).getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default3);
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
            String stringResource = Room.stringResource(gapComposer, R.string.pools_description_label);
            TextStyle textStyle = Strings.getTypography(gapComposer).bodyMedium;
            long j = Strings.getColors(gapComposer).semantic.text.subtle;
            gapComposer = gapComposer;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            Modifier shakeWith = SharedViewEventsKt.shakeWith(FocusTraversalKt.focusRequester(new LayoutWeightElement(1.0f, true), focusRequester), rememberShaker);
            boolean z3 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (z3) {
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
                if (rememberedValue5 != neverEqualPolicy) {
                    z2 = z;
                    Function0 function02 = (Function0) rememberedValue5;
                    changedInstance = gapComposer.changedInstance(realCashVibrator) | gapComposer.changedInstance(rememberShaker);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new PoolDescriptionKt$$ExternalSyntheticLambda4(realCashVibrator, rememberShaker, 0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    PoolDescriptiveInput(function02, (Function0) rememberedValue, shakeWith, m382rememberTextFieldStateLepunE, gapComposer, 0);
                    SizeKt.Button(function0, null, ButtonProminence.PROMINENT, false, z2, null, f571lambda$1957729812, gapComposer, ((i3 >> 9) & 14) | 1573248 | (57344 & (i3 << 9)), 42);
                    gapComposer.end(true);
                    gapComposer.end(true);
                }
            }
            z2 = z;
            rememberedValue5 = new PoolDescriptionKt$$ExternalSyntheticLambda3(z2, function0, 0);
            gapComposer.updateRememberedValue(rememberedValue5);
            Function0 function022 = (Function0) rememberedValue5;
            changedInstance = gapComposer.changedInstance(realCashVibrator) | gapComposer.changedInstance(rememberShaker);
            rememberedValue = gapComposer.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new PoolDescriptionKt$$ExternalSyntheticLambda4(realCashVibrator, rememberShaker, 0);
            gapComposer.updateRememberedValue(rememberedValue);
            PoolDescriptiveInput(function022, (Function0) rememberedValue, shakeWith, m382rememberTextFieldStateLepunE, gapComposer, 0);
            SizeKt.Button(function0, null, ButtonProminence.PROMINENT, false, z2, null, f571lambda$1957729812, gapComposer, ((i3 >> 9) & 14) | 1573248 | (57344 & (i3 << 9)), 42);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(str, z, function1, function0, modifier, str2, i);
        }
    }

    public static final void PoolDescriptiveInput(Function0 function0, Function0 function02, Modifier modifier, TextFieldState textFieldState, Composer composer, int i) {
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1453871178);
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changedInstance(function02) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128) | (gapComposer.changed(textFieldState) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            QuickPayViewKt.SheetTextFieldFocusKeyboardWrapper(modifier, null, Expect_jvmKt.rememberComposableLambda(1403314137, new ErrorView$$ExternalSyntheticLambda1(function0, function02, textFieldState), gapComposer), gapComposer, ((i2 >> 6) & 14) | MLKEMEngine.KyberPolyBytes, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(function0, function02, modifier, textFieldState, i, 16);
        }
    }

    public static final void PoolDetailsErrorView(Function0 function0, Function0 function02, PoolDetailsViewModel.LoadingErrorType loadingErrorType, Modifier modifier, Composer composer, int i) {
        Function0 function03;
        GapComposer gapComposer;
        Modifier modifier2;
        Modifier.Companion companion;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(862020078);
        int i2 = i | (gapComposer2.changedInstance(function0) ? 4 : 2) | (gapComposer2.changedInstance(function02) ? 32 : 16) | (gapComposer2.changedInstance(loadingErrorType) ? 256 : 128) | 3072;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion2, j, rectangleShapeKt$RectangleShape$1), 1.0f));
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
            Modifier statusBarsPadding = SpacerKt.statusBarsPadding(companion2);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new DateScrubber$$ExternalSyntheticLambda0(9);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function0 function04 = (Function0) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DateScrubber$$ExternalSyntheticLambda0(10);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            BaseTitleBar(function0, function04, (Function0) rememberedValue2, statusBarsPadding, false, false, gapComposer2, 221616 | (i2 & 14), 0);
            function03 = function0;
            gapComposer = gapComposer2;
            if (loadingErrorType instanceof PoolDetailsViewModel.LoadingErrorType.Forbidden) {
                gapComposer.startReplaceGroup(1308725910);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                Countries.PageHeader(Room.stringResource(gapComposer, R.string.pools_cant_open_pool_header), (Modifier) null, lambda$1994990354, Room.stringResource(gapComposer, R.string.pools_cant_open_pool_body), gapComposer, MLKEMEngine.KyberPolyBytes, 2);
                gapComposer = gapComposer;
                SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                companion = companion2;
                DimensionKt.ButtonCtaGroup(ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), false, null, null, Expect_jvmKt.rememberComposableLambda(-1587789317, new ActionPillKt$$ExternalSyntheticLambda0(2, function03), gapComposer), gapComposer, 24576, 14);
                gapComposer.end(false);
            } else {
                companion = companion2;
                gapComposer.startReplaceGroup(1309582812);
                PoolErrorView((i2 >> 3) & 14, gapComposer, null, function02);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            function03 = function0;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(function03, function02, loadingErrorType, modifier2, i, 17);
        }
    }

    public static final void PoolDetailsView(Function1 function1, PoolDetailsViewModel poolDetailsViewModel, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, Composer composer, int i) {
        int i2;
        function1.getClass();
        poolDetailsViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(626281494);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(poolDetailsViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 2048 : 1024;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator)}, Expect_jvmKt.rememberComposableLambda(-2028769450, new PoolDetailsViewKt$$ExternalSyntheticLambda0(poolDetailsViewModel, function1, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(function1, poolDetailsViewModel, realImageLoader, realCashVibrator, i, 4);
        }
    }

    public static final void PoolErrorView(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        Function0 function02;
        int i3;
        Modifier modifier2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-500742214);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
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
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.pool_list_error_title), (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.pool_list_error_subtitle), (Map) null, (Function1) null, false);
            i3 = 0;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            SizeKt.ButtonCompact(function0, null, null, false, false, null, f575lambda$858899416, gapComposer, (i4 & 14) | 1572864, 62);
            function02 = function0;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            function02 = function0;
            i3 = 0;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolErrorViewKt$$ExternalSyntheticLambda0(function02, modifier2, i, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0174, code lost:
    
        if (r10 == r9) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PoolInvitePeopleList(Function1 function1, Modifier modifier, PoolInvitePeopleListViewModel.Loaded loaded, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Object obj;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1251613339);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(loaded) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            String str = loaded.query;
            InviteMemberSnackBarViewModel inviteMemberSnackBarViewModel = loaded.snackBarViewModel;
            ref$ObjectRef.element = TextFieldStateKt.m382rememberTextFieldStateLepunE(str, 0L, gapComposer, 0, 2);
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            Continuation continuation = null;
            Updater.LaunchedEffect(gapComposer, ref$ObjectRef.element, new RingtoneView.AnonymousClass1(ref$ObjectRef, function1, continuation, 7));
            boolean changed = gapComposer.changed(rememberLazyListState) | gapComposer.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj2) {
                rememberedValue = new RingtoneView.AnonymousClass1(rememberLazyListState, delegatingSoftwareKeyboardController, continuation, 8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, rememberLazyListState, (Function2) rememberedValue);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
            long j = Strings.getColors(gapComposer).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, j, rectangleShapeKt$RectangleShape$1));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            int i4 = i3;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxSize2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
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
            Modifier statusBarsPadding = SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
            NavigationType navigationType = NavigationType.CLOSE;
            int i5 = i4 & 14;
            boolean changed2 = (i5 == 4) | gapComposer.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2) {
                obj = obj2;
            } else {
                obj = obj2;
            }
            rememberedValue2 = new SetNameViewKt$$ExternalSyntheticLambda6(function1, delegatingSoftwareKeyboardController, 19);
            gapComposer.updateRememberedValue(rememberedValue2);
            Object obj3 = obj;
            modifier2 = companion;
            DBUtil.TitleBarSub((String) null, navigationType, statusBarsPadding, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer, 54, 104);
            SearchBarKt.SearchBar((TextFieldState) ref$ObjectRef.element, Room.stringResource(gapComposer, R.string.pools_invite_screen_search_placeholder), rememberSearchBarKeyboardState, null, null, ShowNavigationBack.Never, null, null, null, new PoolInvitePeopleListViewKt$$ExternalSyntheticLambda6(ref$ObjectRef, function1), false, null, gapComposer, 196608, 0, 7640);
            SpacerKt.Spacer(gapComposer, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(modifier2, 24.0f));
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(new LayoutWeightElement(1.0f, true), Strings.getColors(gapComposer).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
            boolean changedInstance = gapComposer.changedInstance(loaded) | (i5 == 4) | gapComposer.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == obj3) {
                rememberedValue3 = new CardTransitionKt$$ExternalSyntheticLambda4(2, loaded, function1, delegatingSoftwareKeyboardController);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            LazyDslKt.LazyColumn(m177backgroundbw27NRU, rememberLazyListState, null, null, null, null, false, null, (Function1) rememberedValue3, gapComposer, 0, 508);
            gapComposer.end(true);
            gapComposer.startMovableGroup(1164183906, inviteMemberSnackBarViewModel);
            Modifier align = BoxScopeInstance.INSTANCE.align(modifier2, Alignment.Companion.BottomCenter);
            boolean z = inviteMemberSnackBarViewModel != null && (!inviteMemberSnackBarViewModel.isCopyLink || Build.VERSION.SDK_INT <= 32);
            String str2 = inviteMemberSnackBarViewModel != null ? inviteMemberSnackBarViewModel.title : null;
            if (str2 == null) {
                str2 = "";
            }
            PoolToast(align, z, str2, inviteMemberSnackBarViewModel != null ? inviteMemberSnackBarViewModel.body : null, inviteMemberSnackBarViewModel != null ? inviteMemberSnackBarViewModel.icon : null, gapComposer, 0, 0);
            gapComposer = gapComposer;
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(function1, modifier2, (Object) loaded, i, 2);
        }
    }

    public static final void PoolInvitePeopleListView(Function1 function1, Modifier modifier, PoolInvitePeopleListViewModel poolInvitePeopleListViewModel, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        function1.getClass();
        poolInvitePeopleListViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1410660623);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(poolInvitePeopleListViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(realImageLoader) ? 2048 : 1024;
        }
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-96977999, new PoolInvitePeopleListViewKt$$ExternalSyntheticLambda0(poolInvitePeopleListViewModel, function1, i4), gapComposer), gapComposer, 56);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(function1, modifier2, poolInvitePeopleListViewModel, realImageLoader, i);
        }
    }

    public static final void PoolListSections(Modifier modifier, Function1 function1, List list, PoolCategory poolCategory, PoolListNuxAssets poolListNuxAssets, Composer composer, int i) {
        function1.getClass();
        poolCategory.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1348804560);
        int i2 = i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(list) ? 256 : 128) | (gapComposer.changed(poolCategory.ordinal()) ? 2048 : 1024) | (gapComposer.changedInstance(poolListNuxAssets) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            boolean changedInstance = gapComposer.changedInstance(list) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | gapComposer.changedInstance(poolListNuxAssets);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                OpenSourceKt$$ExternalSyntheticLambda9 openSourceKt$$ExternalSyntheticLambda9 = new OpenSourceKt$$ExternalSyntheticLambda9(list, poolCategory, function1, poolListNuxAssets, 2);
                gapComposer.updateRememberedValue(openSourceKt$$ExternalSyntheticLambda9);
                rememberedValue = openSourceKt$$ExternalSyntheticLambda9;
            }
            LazyDslKt.LazyColumn(modifier, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 6, 510);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(modifier, function1, list, poolCategory, poolListNuxAssets, i, 17);
        }
    }

    /* renamed from: PoolMainDetails-h_vLjUQ, reason: not valid java name */
    public static final void m3718PoolMainDetailsh_vLjUQ(final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final Function0 function06, final Function0 function07, final Function0 function08, final Function0 function09, Modifier modifier, final String str, final String str2, final String str3, final long j, final String str4, final ContributionAnimation contributionAnimation, final float f, final float f2, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final String str5, final String str6, final boolean z6, ImmutableList immutableList, final boolean z7, final boolean z8, final UiCallbackModel uiCallbackModel, Composer composer, final int i) {
        final Modifier modifier2;
        boolean z9;
        int i2;
        Object obj;
        final GoalMetTimeline goalMetTimeline;
        int i3;
        GapComposer gapComposer;
        final ImmutableList immutableList2 = immutableList;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        function06.getClass();
        function07.getClass();
        function08.getClass();
        function09.getClass();
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        immutableList2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-685533930);
        Applier applier = gapComposer2.applier;
        int i4 = i | (gapComposer2.changedInstance(function0) ? 4 : 2) | (gapComposer2.changedInstance(function02) ? 32 : 16) | (gapComposer2.changedInstance(function03) ? 256 : 128) | (gapComposer2.changedInstance(function04) ? 2048 : 1024);
        boolean changedInstance = gapComposer2.changedInstance(function05);
        int i5 = PKIFailureInfo.certRevoked;
        int i6 = i4 | (changedInstance ? 16384 : 8192) | (gapComposer2.changedInstance(function06) ? PKIFailureInfo.unsupportedVersion : 65536);
        boolean changedInstance2 = gapComposer2.changedInstance(function07);
        int i7 = PKIFailureInfo.signerNotTrusted;
        int i8 = i6 | (changedInstance2 ? PKIFailureInfo.badCertTemplate : 524288) | (gapComposer2.changedInstance(function08) ? 8388608 : 4194304) | (gapComposer2.changedInstance(function09) ? 67108864 : 33554432) | 805306368;
        int i9 = (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(str2) ? 32 : 16) | (gapComposer2.changed(str3) ? 256 : 128) | (gapComposer2.changed(j) ? 2048 : 1024) | (gapComposer2.changed(str4) ? 16384 : 8192) | (gapComposer2.changedInstance(contributionAnimation) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changed(f) ? PKIFailureInfo.badCertTemplate : 524288) | (gapComposer2.changed(f2) ? 8388608 : 4194304) | (gapComposer2.changed(z) ? 67108864 : 33554432) | (gapComposer2.changed(z2) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i10 = (gapComposer2.changed(z3) ? 4 : 2) | (gapComposer2.changed(z4) ? 32 : 16) | (gapComposer2.changed(z5) ? 256 : 128) | (gapComposer2.changed(str5) ? 2048 : 1024);
        if (gapComposer2.changed(str6)) {
            i5 = 16384;
        }
        int i11 = i10 | i5 | (gapComposer2.changed(z6) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer2.changedInstance(immutableList2)) {
            i7 = PKIFailureInfo.badCertTemplate;
        }
        int i12 = i11 | i7 | (gapComposer2.changed(z7) ? 8388608 : 4194304) | (gapComposer2.changed(z8) ? 67108864 : 33554432) | (gapComposer2.changed(uiCallbackModel) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer2.shouldExecute(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 306783379) == 306783378 && (i12 & 306783379) == 306783378) ? false : true)) {
            final Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Recorder$$ExternalSyntheticOutline1.m(contributionAnimation != null && contributionAnimation.animationCompleted, gapComposer2);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj2) {
                rememberedValue2 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == obj2) {
                rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m(8, gapComposer2);
            }
            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj2) {
                rememberedValue4 = Updater.derivedStateOf(new ProfileKt$$ExternalSyntheticLambda11(7, rememberLazyListState, mutableState2));
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            State state = (State) rememberedValue4;
            GoalMetTimeline.Step step = GoalMetTimeline.Step.IDLE;
            boolean changed = gapComposer2.changed(0);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed || rememberedValue5 == obj2) {
                rememberedValue5 = new GoalMetTimeline(step);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            GoalMetTimeline goalMetTimeline2 = (GoalMetTimeline) rememberedValue5;
            MutableState collectAsState = Updater.collectAsState(goalMetTimeline2.steps, null, gapComposer2, 1);
            if (z6) {
                gapComposer2.startReplaceGroup(-169661307);
                Unit unit = Unit.INSTANCE;
                i2 = 29360128;
                boolean changed2 = gapComposer2.changed(goalMetTimeline2) | ((i8 & 29360128) == 8388608);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue6 == obj2) {
                    rememberedValue6 = new RingtoneView.AnonymousClass1(goalMetTimeline2, function08, null, 4);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue6);
                z9 = false;
                gapComposer2.end(false);
            } else {
                z9 = false;
                i2 = 29360128;
                gapComposer2.startReplaceGroup(-169562324);
                gapComposer2.end(false);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z9);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(z9);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            BaseTitleBar(function0, function02, function03, SpacerKt.statusBarsPadding(companion), false, z, gapComposer2, (i8 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i9 >> 9) & 458752), 16);
            ActivityEmbeddedViewModel activityEmbeddedViewModel = (ActivityEmbeddedViewModel) uiCallbackModel.model;
            Function1 function1 = uiCallbackModel.onEvent;
            activityEmbeddedViewModel.getClass();
            function1.getClass();
            Unit unit2 = Unit.INSTANCE;
            boolean changed3 = gapComposer2.changed(function1);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue7 == obj2) {
                obj = null;
                rememberedValue7 = new TaxAuthorizationView$Content$1$1(function1, (Continuation) null, 3);
                gapComposer2.updateRememberedValue(rememberedValue7);
            } else {
                obj = null;
            }
            Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue7);
            boolean changedInstance3 = gapComposer2.changedInstance(activityEmbeddedViewModel) | gapComposer2.changed(function1) | gapComposer2.changed(obj) | gapComposer2.changed(obj) | gapComposer2.changed(obj) | gapComposer2.changed(obj) | gapComposer2.changed(obj) | gapComposer2.changed(true);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue8 == obj2) {
                rememberedValue8 = new CombinedModifier$$ExternalSyntheticLambda0(20, activityEmbeddedViewModel, function1);
                gapComposer2.updateRememberedValue(rememberedValue8);
            }
            final Function1 function12 = (Function1) rememberedValue8;
            Modifier fillMaxSize2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (rememberedValue9 == obj2) {
                rememberedValue9 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(27);
                gapComposer2.updateRememberedValue(rememberedValue9);
            }
            Modifier semantics = SemanticsModifierKt.semantics(fillMaxSize2, false, (Function1) rememberedValue9);
            int i13 = i9 & 14;
            immutableList2 = immutableList;
            boolean changedInstance4 = ((i8 & 234881024) == 67108864) | ((i8 & 57344) == 16384) | ((i8 & 7168) == 2048) | ((i8 & 458752) == 131072) | ((i8 & 3670016) == 1048576) | (i13 == 4) | ((i9 & 112) == 32) | ((i9 & 896) == 256) | ((i9 & 7168) == 2048) | ((i9 & 57344) == 16384) | gapComposer2.changedInstance(contributionAnimation) | ((i9 & 3670016) == 1048576) | ((i9 & i2) == 8388608) | ((i9 & 1879048192) == 536870912) | ((i12 & 14) == 4) | ((i12 & i2) == 8388608) | ((i12 & 234881024) == 67108864) | ((i12 & 112) == 32) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048) | ((i12 & 57344) == 16384) | gapComposer2.changedInstance(immutableList2) | gapComposer2.changed(goalMetTimeline2) | gapComposer2.changed(function12) | gapComposer2.changed(density);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue10 == obj2) {
                goalMetTimeline = goalMetTimeline2;
                i3 = i13;
                gapComposer = gapComposer2;
                Function1 function13 = new Function1() { // from class: com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        LazyListScope lazyListScope = (LazyListScope) obj3;
                        lazyListScope.getClass();
                        final Function0 function010 = function04;
                        final Function0 function011 = function05;
                        final Function0 function012 = function06;
                        final Function0 function013 = function07;
                        final Function0 function014 = function09;
                        final String str7 = str;
                        final String str8 = str2;
                        final String str9 = str3;
                        final long j2 = j;
                        final String str10 = str4;
                        final ContributionAnimation contributionAnimation2 = contributionAnimation;
                        final float f3 = f;
                        final float f4 = f2;
                        final boolean z10 = z2;
                        final boolean z11 = z3;
                        final boolean z12 = z7;
                        final boolean z13 = z8;
                        final boolean z14 = z4;
                        final boolean z15 = z5;
                        final String str11 = str5;
                        final String str12 = str6;
                        final ImmutableList immutableList3 = immutableList2;
                        final GoalMetTimeline goalMetTimeline3 = goalMetTimeline;
                        final MutableState mutableState3 = mutableState;
                        final MutableState mutableState4 = mutableState2;
                        final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                        LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj4;
                                Composer composer2 = (Composer) obj5;
                                int intValue = ((Integer) obj6).intValue();
                                lazyItemScopeImpl.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((GapComposer) composer2).changed(lazyItemScopeImpl) ? 4 : 2;
                                }
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                    Modifier then = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f).then(LazyItemScopeImpl.fillParentMaxHeight$default(lazyItemScopeImpl));
                                    MutableState mutableState5 = mutableState3;
                                    boolean booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
                                    Function0 function015 = function014;
                                    boolean changed4 = gapComposer3.changed(function015);
                                    Object rememberedValue11 = gapComposer3.rememberedValue();
                                    Object obj7 = Composer.Companion.Empty;
                                    if (changed4 || rememberedValue11 == obj7) {
                                        rememberedValue11 = new MoneyTabUIKt$$ExternalSyntheticLambda7(function015, mutableState5, 5);
                                        gapComposer3.updateRememberedValue(rememberedValue11);
                                    }
                                    Function0 function016 = (Function0) rememberedValue11;
                                    Object rememberedValue12 = gapComposer3.rememberedValue();
                                    if (rememberedValue12 == obj7) {
                                        rememberedValue12 = new PdfPreviewViewKt$$ExternalSyntheticLambda0(23, mutableState4, parcelableSnapshotMutableIntState2);
                                        gapComposer3.updateRememberedValue(rememberedValue12);
                                    }
                                    PoolToastKt.BasePoolContent(Function0.this, function011, function012, function013, function016, (Function2) rememberedValue12, str7, str8, str9, j2, str10, contributionAnimation2, booleanValue, f3, f4, z10, z11, z12, z13, z14, z15, str11, str12, immutableList3, then, goalMetTimeline3, gapComposer3, 196608);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, true, 1014177127), 3);
                        if (z13) {
                            function12.invoke(lazyListScope);
                            LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda28(density.mo233toDpu2uoSUM(parcelableSnapshotMutableIntState2.getIntValue()), 0), true, 1887567170), 3);
                            LazyListScope.item$default(lazyListScope, null, null, PoolToastKt.lambda$939617337, 3);
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(function13);
                rememberedValue10 = function13;
            } else {
                goalMetTimeline = goalMetTimeline2;
                gapComposer = gapComposer2;
                i3 = i13;
            }
            GapComposer gapComposer3 = gapComposer;
            LazyDslKt.LazyColumn(semantics, rememberLazyListState, null, null, null, null, false, null, (Function1) rememberedValue10, gapComposer3, 0, 508);
            gapComposer2 = gapComposer3;
            gapComposer2.end(true);
            Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
            boolean booleanValue = ((Boolean) state.getValue()).booleanValue();
            Object rememberedValue11 = gapComposer2.rememberedValue();
            if (rememberedValue11 == obj2) {
                rememberedValue11 = new SvgDecoder$$ExternalSyntheticLambda0(1);
                gapComposer2.updateRememberedValue(rememberedValue11);
            }
            EnterTransitionImpl slideInVertically$default = EnterExitTransitionKt.slideInVertically$default(1, (Function1) rememberedValue11);
            Object rememberedValue12 = gapComposer2.rememberedValue();
            if (rememberedValue12 == obj2) {
                rememberedValue12 = new SvgDecoder$$ExternalSyntheticLambda0(1);
                gapComposer2.updateRememberedValue(rememberedValue12);
            }
            AnimatedContentKt.AnimatedVisibility(booleanValue, align, slideInVertically$default, EnterExitTransitionKt.slideOutVertically$default(1, (Function1) rememberedValue12), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1114790004, new Function3() { // from class: com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    Composer composer2 = (Composer) obj4;
                    ((Integer) obj5).getClass();
                    ((AnimatedVisibilityScope) obj3).getClass();
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f);
                    GapComposer gapComposer4 = (GapComposer) composer2;
                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors2.semantic.background.f1047app, ColorKt.RectangleShape));
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer2, 0);
                    int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(composer2, navigationBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    GapComposer gapComposer5 = (GapComposer) composer2;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(composer2, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(composer2, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(composer2, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(composer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(composer2, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    ModalKt.HorizontalDivider(0, 1, composer2, null);
                    PoolToastKt.ActionButtons(Function0.this, function04, function05, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), z2, z4, z3, z5, str5, str6, composer2, 3072);
                    gapComposer5.end(true);
                    return Unit.INSTANCE;
                }
            }, gapComposer2), (Composer) gapComposer2, 200064, 16);
            if (((GoalMetTimeline.Step) collectAsState.getValue()).compareTo(GoalMetTimeline.Step.SHOW_HERO) >= 0) {
                gapComposer2.startReplaceGroup(30195535);
                PoolGoalMetKt.PoolGoalMet(str, toAvatarEntries(immutableList2, gapComposer2), goalMetTimeline, androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f), gapComposer2, i3 | 3072);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(30377350);
                gapComposer2.end(false);
            }
            gapComposer2.end(true);
            modifier2 = companion;
        } else {
            gapComposer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            final ImmutableList immutableList3 = immutableList2;
            endRestartGroup.block = new Function2(function02, function03, function04, function05, function06, function07, function08, function09, modifier2, str, str2, str3, j, str4, contributionAnimation, f, f2, z, z2, z3, z4, z5, str5, str6, z6, immutableList3, z7, z8, uiCallbackModel, i) { // from class: com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda24
                public final /* synthetic */ Function0 f$1;
                public final /* synthetic */ String f$10;
                public final /* synthetic */ String f$11;
                public final /* synthetic */ String f$12;
                public final /* synthetic */ long f$13;
                public final /* synthetic */ String f$14;
                public final /* synthetic */ ContributionAnimation f$15;
                public final /* synthetic */ float f$16;
                public final /* synthetic */ float f$17;
                public final /* synthetic */ boolean f$18;
                public final /* synthetic */ boolean f$19;
                public final /* synthetic */ Function0 f$2;
                public final /* synthetic */ boolean f$20;
                public final /* synthetic */ boolean f$21;
                public final /* synthetic */ boolean f$22;
                public final /* synthetic */ String f$23;
                public final /* synthetic */ String f$24;
                public final /* synthetic */ boolean f$25;
                public final /* synthetic */ ImmutableList f$26;
                public final /* synthetic */ boolean f$27;
                public final /* synthetic */ boolean f$28;
                public final /* synthetic */ UiCallbackModel f$29;
                public final /* synthetic */ Function0 f$3;
                public final /* synthetic */ Function0 f$4;
                public final /* synthetic */ Function0 f$5;
                public final /* synthetic */ Function0 f$6;
                public final /* synthetic */ Function0 f$7;
                public final /* synthetic */ Function0 f$8;
                public final /* synthetic */ Modifier f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    PoolToastKt.m3718PoolMainDetailsh_vLjUQ(Function0.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, this.f$16, this.f$17, this.f$18, this.f$19, this.f$20, this.f$21, this.f$22, this.f$23, this.f$24, this.f$25, this.f$26, this.f$27, this.f$28, this.f$29, (Composer) obj3, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void PoolMemberList(Function1 function1, Modifier modifier, PoolMemberListViewModel poolMemberListViewModel, Composer composer, int i) {
        Function1 function12;
        PoolMemberListViewModel poolMemberListViewModel2;
        GapComposer gapComposer;
        Modifier modifier2;
        NavigationType navigationType;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-136953618);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(function1) ? 4 : 2) | 48 | (gapComposer2.changedInstance(poolMemberListViewModel) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, j, rectangleShapeKt$RectangleShape$1));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
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
            Modifier fillMaxSize2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize2);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
            String str = poolMemberListViewModel.title;
            NavigationType navigationType2 = NavigationType.CLOSE;
            int i3 = 14;
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                navigationType = navigationType2;
                rememberedValue = new PoolsListViewKt$$ExternalSyntheticLambda3(18, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            } else {
                navigationType = navigationType2;
            }
            DBUtil.TitleBarSub(str, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 432, 104);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            boolean changedInstance = gapComposer2.changedInstance(poolMemberListViewModel) | (i4 == 4);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new OpenSourceKt$$ExternalSyntheticLambda11(12, poolMemberListViewModel, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            int i5 = 0;
            LazyDslKt.LazyColumn(layoutWeightElement, null, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer2, 0, 510);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            modifier2 = companion;
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, modifier2);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            poolMemberListViewModel2 = poolMemberListViewModel;
            MemberStatusUpdateSnackBarViewModel memberStatusUpdateSnackBarViewModel = poolMemberListViewModel2.memberStatusUpdateSnackBar;
            boolean z2 = memberStatusUpdateSnackBarViewModel != null;
            String str2 = memberStatusUpdateSnackBarViewModel != null ? memberStatusUpdateSnackBarViewModel.title : null;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = memberStatusUpdateSnackBarViewModel != null ? memberStatusUpdateSnackBarViewModel.subtitle : null;
            PoolToast(null, z2, str2, str3 == null ? "" : str3, null, gapComposer2, 0, 17);
            gapComposer = gapComposer2;
            if (poolMemberListViewModel2.isOwner && poolMemberListViewModel2.canAddPeople) {
                gapComposer.startReplaceGroup(-732997244);
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                function12 = function1;
                DimensionKt.ButtonCtaGroup(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(modifier2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 1.0f), false, ButtonCtaGroupOrientation.AUTOMATIC, poolMemberListViewModel2.hasReachedMemberLimit ? f570lambda$1868735209 : null, Expect_jvmKt.rememberComposableLambda(836736317, new PoolMemberListViewKt$$ExternalSyntheticLambda5(i5, poolMemberListViewModel2, function12), gapComposer), gapComposer, 24960, 2);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                function12 = function1;
                gapComposer.startReplaceGroup(-732261118);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
            if (poolMemberListViewModel2.failureDialog == null) {
                gapComposer.startReplaceGroup(-1795650104);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1795650103);
                FailureDialogViewModel failureDialogViewModel = poolMemberListViewModel2.failureDialog;
                boolean z3 = i4 == 4;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new PoolsListViewKt$$ExternalSyntheticLambda3(19, function12);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Function0 function0 = (Function0) rememberedValue3;
                boolean z4 = i4 == 4;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z4 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new PoolsListViewKt$$ExternalSyntheticLambda3(20, function12);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                ArcadeModal2Kt.Modal(null, failureDialogViewModel, function0, (Function0) rememberedValue4, false, false, Expect_jvmKt.rememberComposableLambda(-1081432055, new PdfPreviewViewKt$$ExternalSyntheticLambda4(i3, function12), gapComposer), gapComposer, 1572864, 49);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            function12 = function1;
            poolMemberListViewModel2 = poolMemberListViewModel;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(function12, modifier2, poolMemberListViewModel2, i);
        }
    }

    public static final void PoolMemberListView(Function1 function1, PoolMemberListViewModel poolMemberListViewModel, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        function1.getClass();
        poolMemberListViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1725239192);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(poolMemberListViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(36164312, new PoolMemberListViewKt$$ExternalSyntheticLambda0(0, poolMemberListViewModel, function1), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(function1, poolMemberListViewModel, realImageLoader, i);
        }
    }

    public static final void PoolMoreOptionsBottomSheet(Function1 function1, Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, Composer composer, int i) {
        GapComposer gapComposer;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1321594932);
        int i2 = i | (gapComposer2.changedInstance(function1) ? 4 : 2) | (gapComposer2.changed(modifier) ? 32 : 16) | (gapComposer2.changed(z) ? 256 : 128) | (gapComposer2.changed(z2) ? 2048 : 1024) | (gapComposer2.changed(z3) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer2, SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).header, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.pools_more_options_title), (Map) null, (Function1) null, false);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(492283533, new SignatureViewKt$$ExternalSyntheticLambda2(z, 5), gapComposer2);
            int i3 = i2 & 14;
            boolean z5 = i3 == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z5 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PoolsListViewKt$$ExternalSyntheticLambda3(22, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            byte b = 0;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1550253075, new ArcadeBordersKt$$ExternalSyntheticLambda0(z, z4, 3, b), gapComposer2);
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(lambda$315955276, rememberComposableLambda, null, (Function0) rememberedValue, null, true, true, rememberComposableLambda2, null, push, 0L, null, gapComposer2, 819658806, 0, 3348);
            gapComposer = gapComposer2;
            if (z || z2) {
                gapComposer.startReplaceGroup(-1384250465);
                ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(1344929256, new SignatureViewKt$$ExternalSyntheticLambda2(z, 6), gapComposer);
                boolean z6 = (i3 == 4) | ((i2 & 896) == 256);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z6 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ToggleableNode$$ExternalSyntheticLambda1(z, function1, 5);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(lambda$1458539751, rememberComposableLambda3, null, (Function0) rememberedValue2, null, true, true, Expect_jvmKt.rememberComposableLambda(663266286, new ArcadeBordersKt$$ExternalSyntheticLambda0(z, z3, 4, b), gapComposer), null, push, 0L, null, gapComposer, 819658806, 0, 3348);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1382596584);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardAppletTileKt$$ExternalSyntheticLambda22(function1, modifier, z, z2, z3, z4, i);
        }
    }

    public static final void PoolMoreOptionsBottomSheetView(Function1 function1, PoolMoreOptionsBottomSheetViewModel poolMoreOptionsBottomSheetViewModel, Composer composer, int i) {
        int i2;
        function1.getClass();
        poolMoreOptionsBottomSheetViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2055666819);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(poolMoreOptionsBottomSheetViewModel) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-973023400, new PdfPreviewViewKt$$ExternalSyntheticLambda0(function1, poolMoreOptionsBottomSheetViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(function1, poolMoreOptionsBottomSheetViewModel, i);
        }
    }

    public static final void PoolRow(Modifier modifier, Function1 function1, final PoolRow poolRow, boolean z, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        final long j;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-488140090);
        int i2 = i | 6 | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changedInstance(poolRow) ? 256 : 128) | (gapComposer2.changed(z) ? 2048 : 1024);
        final int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                gapComposer2.startReplaceGroup(578008453);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors.semantic.text.standard;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(578068903);
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors2.semantic.text.subtle;
                gapComposer2.end(false);
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-625128576, new PoolListSectionKt$$ExternalSyntheticLambda2(poolRow, 16), gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(794704485, new Function2() { // from class: com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = r4;
                    PoolRow poolRow2 = poolRow;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4022, j, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, poolRow2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4022, j, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, poolRow2.secondaryLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4022, j, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, poolRow2.tertiaryLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-566644153, new PoolListSectionKt$$ExternalSyntheticLambda8(poolRow, j, r9), gapComposer2);
            int i4 = (gapComposer2.changedInstance(poolRow) ? 1 : 0) | ((i2 & 112) == 32 ? 1 : 0);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (i4 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(8, function1, poolRow);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(-1575425430, new Function2() { // from class: com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i3;
                    PoolRow poolRow2 = poolRow;
                    switch (i42) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4022, j, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, poolRow2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4022, j, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, poolRow2.secondaryLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4022, j, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, poolRow2.tertiaryLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            final int i5 = 2;
            ComposableLambdaImpl rememberComposableLambda5 = Expect_jvmKt.rememberComposableLambda(-2049451413, new Function2() { // from class: com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i5;
                    PoolRow poolRow2 = poolRow;
                    switch (i42) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4022, j, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, poolRow2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4022, j, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, poolRow2.secondaryLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4022, j, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, poolRow2.tertiaryLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            CellDefaultKt.m3388CellActivity6RhP_wg(rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, (Function0) rememberedValue, companion, null, rememberComposableLambda4, rememberComposableLambda5, false, 0L, gapComposer, 14180790, 800);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(modifier2, function1, poolRow, z, i);
        }
    }

    public static final void PoolToast(Modifier modifier, boolean z, String str, String str2, Icons icons, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Icons icons2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1654387868);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (gapComposer.changed(modifier) ? 4 : 2);
        }
        int i6 = i3 | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128) | (gapComposer.changed(str2) ? 2048 : 1024);
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i6 | 24576;
        } else {
            i4 = i6 | (gapComposer.changed(icons == null ? -1 : icons.ordinal()) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i8 = 0;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            if (i5 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Icons icons3 = i7 != 0 ? Icons.Failed24 : icons;
            AnimatedContentKt.AnimatedVisibility(z, SpacerKt.imePadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier, 1.0f)), EnterExitTransitionKt.slideInVertically$default(3, null).plus(EnterExitTransitionKt.expandVertically$default(null, 13)), EnterExitTransitionKt.slideOutVertically$default(3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, Alignment.Companion.Top, 13)), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1955357244, new PoolToastKt$$ExternalSyntheticLambda0(i8, (Object) icons3, (Object) str, (Object) str2), gapComposer), (Composer) gapComposer, ((i4 >> 3) & 14) | 200064, 16);
            icons2 = icons3;
        } else {
            gapComposer.skipToGroupEnd();
            icons2 = icons;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(modifier2, z, str, str2, icons2, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static final void PoolsList(Modifier modifier, Function1 function1, PoolsListViewModel poolsListViewModel, Composer composer, int i) {
        Modifier modifier2;
        ?? r13;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1419233259);
        Applier applier = gapComposer.applier;
        int i2 = 16;
        int i3 = i | 6 | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(poolsListViewModel) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
            String stringResource = Room.stringResource(gapComposer, R.string.pools_list_title);
            NavigationType navigationType = NavigationType.BACK;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PoolsListViewKt$$ExternalSyntheticLambda3(0, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(stringResource, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(797056342, new PdfPreviewViewKt$$ExternalSyntheticLambda4(i2, function1), gapComposer), gapComposer, 1573296, 40);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
            int ordinal = poolsListViewModel.getCategory().ordinal();
            boolean z2 = i4 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda3(14, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                r13 = 0;
                rememberedValue3 = new PoolsListViewKt$$ExternalSyntheticLambda6(0);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                r13 = 0;
            }
            ModalKt.SegmentedControl(ordinal, function12, fillMaxWidth2, (Function1) rememberedValue3, gapComposer, 3456, 0);
            DBUtil.SpacerWithinSectionMedium(r13, 1, gapComposer, null);
            if (poolsListViewModel instanceof PoolsListViewModel.Loading) {
                gapComposer.startReplaceGroup(1090177575);
                Modifier fillMaxSize2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, r13);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
            } else if (poolsListViewModel instanceof PoolsListViewModel.Error) {
                gapComposer.startReplaceGroup(1090328142);
                boolean z3 = i4 == 32;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z3 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new PoolsListViewKt$$ExternalSyntheticLambda3(24, function1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                PoolErrorView(0, gapComposer, null, (Function0) rememberedValue4);
                gapComposer.end(false);
            } else {
                if (!(poolsListViewModel instanceof PoolsListViewModel.Loaded)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 589355921, false);
                }
                gapComposer.startReplaceGroup(1090435898);
                Modifier fillMaxSize3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
                boolean z4 = ((PoolsListViewModel.Loaded) poolsListViewModel).isRefreshing;
                String stringResource2 = Room.stringResource(gapComposer, R.string.pool_list_pull_to_refresh_content_description);
                boolean z5 = i4 == 32;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z5 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new PoolsListViewKt$$ExternalSyntheticLambda3(25, function1);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                VisibleKt.PullToRefresh(196992, 8, gapComposer, Expect_jvmKt.rememberComposableLambda(1317579082, new PoolsListViewKt$$ExternalSyntheticLambda0(function1, poolsListViewModel, 2), gapComposer), fillMaxSize3, stringResource2, (Function0) rememberedValue5, z4, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1((Object) modifier2, function1, (Object) poolsListViewModel, i, 7);
        }
    }

    public static final void PoolsListView(PoolsListViewModel poolsListViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        poolsListViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(452899463);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(poolsListViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(895866695, new PoolsListViewKt$$ExternalSyntheticLambda0(function1, poolsListViewModel, 0), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(poolsListViewModel, function1, realImageLoader, i, 4);
        }
    }

    public static final void ProgressContent(final Modifier modifier, final float f, final String str, final long j, final boolean z, final Function0 function0, final ContributionAnimation contributionAnimation, final String str2, final float f2, final PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder, Composer composer, final int i) {
        int i2;
        float f3;
        long j2;
        boolean z2;
        Function0 function02;
        String str3;
        float f4;
        PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(458425052);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            f3 = f;
            i2 |= gapComposer.changed(f3) ? 32 : 16;
        } else {
            f3 = f;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            j2 = j;
            i2 |= gapComposer.changed(j2) ? 2048 : 1024;
        } else {
            j2 = j;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            function02 = function0;
            i2 |= gapComposer.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            function02 = function0;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(contributionAnimation) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            str3 = str2;
            i2 |= gapComposer.changed(str3) ? 8388608 : 4194304;
        } else {
            str3 = str2;
        }
        if ((100663296 & i) == 0) {
            f4 = f2;
            i2 |= gapComposer.changed(f4) ? 67108864 : 33554432;
        } else {
            f4 = f2;
        }
        if ((805306368 & i) == 0) {
            poolDetailsAnimationStateHolder2 = poolDetailsAnimationStateHolder;
            i2 |= gapComposer.changed(poolDetailsAnimationStateHolder2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            poolDetailsAnimationStateHolder2 = poolDetailsAnimationStateHolder;
        }
        if (gapComposer.shouldExecute(i2 & 1, (306783379 & i2) != 306783378)) {
            final float f5 = f3;
            final long j3 = j2;
            final boolean z3 = z2;
            final Function0 function03 = function02;
            final String str4 = str3;
            final float f6 = f4;
            final PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder3 = poolDetailsAnimationStateHolder2;
            OffsetKt.BoxWithConstraints(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier, 1.0f), Alignment.Companion.Center, false, Expect_jvmKt.rememberComposableLambda(471669830, new Function3() { // from class: com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MutableState mutableState;
                    MutableState mutableState2;
                    boolean z4;
                    Object quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
                    ConstraintSetForInlineDsl constraintSetForInlineDsl;
                    MutableState mutableState3;
                    AnimatedAmountTextView.Amount amount;
                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    boxWithConstraintsScopeImpl.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        final boolean booleanValue = ((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                        Object rememberedValue = gapComposer2.rememberedValue();
                        Object obj4 = Composer.Companion.Empty;
                        if (rememberedValue == obj4) {
                            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        MutableState mutableState4 = (MutableState) rememberedValue;
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        boolean z5 = z3;
                        if (rememberedValue2 == obj4) {
                            rememberedValue2 = Recorder$$ExternalSyntheticOutline1.m(z5, gapComposer2);
                        }
                        MutableState mutableState5 = (MutableState) rememberedValue2;
                        final ContributionAnimation contributionAnimation2 = ContributionAnimation.this;
                        boolean z6 = (contributionAnimation2 == null || ((Boolean) mutableState5.getValue()).booleanValue()) ? false : true;
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (rememberedValue3 == obj4) {
                            rememberedValue3 = Recorder$$ExternalSyntheticOutline1.m(z5, gapComposer2);
                        }
                        MutableState mutableState6 = (MutableState) rememberedValue3;
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        String str5 = str;
                        long j4 = j3;
                        if (rememberedValue4 == obj4) {
                            if (z6) {
                                contributionAnimation2.getClass();
                                String str6 = contributionAnimation2.originalAmountFormatted;
                                Long l = contributionAnimation2.originalAmount.amount;
                                l.getClass();
                                amount = new AnimatedAmountTextView.Amount(str6, l.longValue());
                            } else {
                                amount = new AnimatedAmountTextView.Amount(str5, j4);
                            }
                            rememberedValue4 = Updater.mutableStateOf$default(amount);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        MutableState mutableState7 = (MutableState) rememberedValue4;
                        Unit unit = Unit.INSTANCE;
                        boolean changed = gapComposer2.changed(z6) | gapComposer2.changed(str5) | gapComposer2.changed(j4);
                        Function0 function04 = function03;
                        boolean changed2 = changed | gapComposer2.changed(function04);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue5 == obj4) {
                            Object poolDetailsViewKt$ProgressContent$1$1$1 = new PoolDetailsViewKt$ProgressContent$1$1$1(z6, str5, j4, function04, mutableState6, mutableState4, mutableState7, mutableState5, null);
                            mutableState = mutableState4;
                            mutableState2 = mutableState7;
                            gapComposer2.updateRememberedValue(poolDetailsViewKt$ProgressContent$1$1$1);
                            rememberedValue5 = poolDetailsViewKt$ProgressContent$1$1$1;
                        } else {
                            mutableState = mutableState4;
                            mutableState2 = mutableState7;
                        }
                        Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue5);
                        float f7 = f5;
                        if (z5) {
                            gapComposer2.startReplaceGroup(-1615839013);
                        } else {
                            gapComposer2.startReplaceGroup(-1615793009);
                            if (!((Boolean) mutableState6.getValue()).booleanValue()) {
                                f7 = f6;
                            }
                            f7 = ((Number) AnimateAsStateKt.animateFloatAsState(f7, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, null, 5), null, null, gapComposer2, 48, 28).getValue()).floatValue();
                        }
                        gapComposer2.end(false);
                        float f8 = ((Dp) ComparisonsKt___ComparisonsJvmKt.minOf(new Dp(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM() * 0.75f), new Dp(boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM()))).value;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier m285size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, f8);
                        PoolDetailsAnimationStateHolder poolDetailsAnimationStateHolder4 = poolDetailsAnimationStateHolder3;
                        boolean changed3 = gapComposer2.changed(poolDetailsAnimationStateHolder4);
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue6 == obj4) {
                            z4 = false;
                            rememberedValue6 = new PoolDetailsViewKt$$ExternalSyntheticLambda43(poolDetailsAnimationStateHolder4, 0);
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        } else {
                            z4 = false;
                        }
                        Modifier graphicsLayer = ColorKt.graphicsLayer(m285size3ABfNKs, (Function1) rememberedValue6);
                        ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalColors;
                        Colors colors = (Colors) gapComposer2.consume(providableCompositionLocal);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z4);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(z4);
                        }
                        long j5 = colors.semantic.border.brand;
                        Colors colors2 = (Colors) gapComposer2.consume(providableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z4);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(z4);
                        }
                        VisibleKt.m3497ProgressMeterUV7SVM(f7, j5, 10.0f, graphicsLayer, colors2.semantic.border.subtle, 2.0f, 0L, ProgressMeter$CompletionBehavior.NONE, ProgressMeter$ZeroBehavior.HIDDEN, null, null, null, null, gapComposer2, 113443200, 0, 7744);
                        Object rememberedValue7 = gapComposer2.rememberedValue();
                        if (rememberedValue7 == obj4) {
                            rememberedValue7 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(29);
                            gapComposer2.updateRememberedValue(rememberedValue7);
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue7);
                        boolean changed4 = gapComposer2.changed(poolDetailsAnimationStateHolder4);
                        Object rememberedValue8 = gapComposer2.rememberedValue();
                        if (changed4 || rememberedValue8 == obj4) {
                            rememberedValue8 = new PoolDetailsViewKt$$ExternalSyntheticLambda43(poolDetailsAnimationStateHolder4, 1);
                            gapComposer2.updateRememberedValue(rememberedValue8);
                        }
                        Modifier graphicsLayer2 = ColorKt.graphicsLayer(semantics, (Function1) rememberedValue8);
                        gapComposer2.startReplaceGroup(-1003410150);
                        gapComposer2.startReplaceGroup(212064437);
                        gapComposer2.end(false);
                        Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                        Object rememberedValue9 = gapComposer2.rememberedValue();
                        if (rememberedValue9 == obj4) {
                            rememberedValue9 = new Measurer2(density);
                            gapComposer2.updateRememberedValue(rememberedValue9);
                        }
                        Measurer2 measurer2 = (Measurer2) rememberedValue9;
                        Object rememberedValue10 = gapComposer2.rememberedValue();
                        if (rememberedValue10 == obj4) {
                            rememberedValue10 = new ConstraintLayoutScope();
                            gapComposer2.updateRememberedValue(rememberedValue10);
                        }
                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue10;
                        Object rememberedValue11 = gapComposer2.rememberedValue();
                        if (rememberedValue11 == obj4) {
                            rememberedValue11 = Updater.mutableStateOf$default(Boolean.FALSE);
                            gapComposer2.updateRememberedValue(rememberedValue11);
                        }
                        MutableState mutableState8 = (MutableState) rememberedValue11;
                        Object rememberedValue12 = gapComposer2.rememberedValue();
                        if (rememberedValue12 == obj4) {
                            rememberedValue12 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                            gapComposer2.updateRememberedValue(rememberedValue12);
                        }
                        ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue12;
                        Object rememberedValue13 = gapComposer2.rememberedValue();
                        if (rememberedValue13 == obj4) {
                            Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(unit, NeverEqualPolicy.INSTANCE);
                            gapComposer2.updateRememberedValue(parcelableSnapshotMutableState);
                            rememberedValue13 = parcelableSnapshotMutableState;
                        }
                        final MutableState mutableState9 = (MutableState) rememberedValue13;
                        boolean changedInstance = gapComposer2.changedInstance(measurer2) | gapComposer2.changed(EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        Object rememberedValue14 = gapComposer2.rememberedValue();
                        if (changedInstance || rememberedValue14 == obj4) {
                            quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2(mutableState9, measurer2, constraintSetForInlineDsl2, mutableState8, 6);
                            constraintSetForInlineDsl = constraintSetForInlineDsl2;
                            mutableState3 = mutableState8;
                            gapComposer2.updateRememberedValue(quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2);
                        } else {
                            quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2 = rememberedValue14;
                            constraintSetForInlineDsl = constraintSetForInlineDsl2;
                            mutableState3 = mutableState8;
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
                        Object rememberedValue15 = gapComposer2.rememberedValue();
                        if (rememberedValue15 == obj4) {
                            rememberedValue15 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3(mutableState3, constraintSetForInlineDsl, 6);
                            gapComposer2.updateRememberedValue(rememberedValue15);
                        }
                        final Function0 function05 = (Function0) rememberedValue15;
                        boolean changedInstance2 = gapComposer2.changedInstance(measurer2);
                        Object rememberedValue16 = gapComposer2.rememberedValue();
                        if (changedInstance2 || rememberedValue16 == obj4) {
                            rememberedValue16 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4(measurer2, 6);
                            gapComposer2.updateRememberedValue(rememberedValue16);
                        }
                        Modifier semantics2 = SemanticsModifierKt.semantics(graphicsLayer2, false, (Function1) rememberedValue16);
                        final String str7 = str4;
                        final MutableState mutableState10 = mutableState;
                        final MutableState mutableState11 = mutableState2;
                        RulerKt.MultiMeasureLayout(semantics2, Expect_jvmKt.rememberComposableLambda(1200550679, new Function2() { // from class: com.squareup.cash.pools.views.PoolDetailsViewKt$ProgressContent$lambda$0$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                Composer composer3 = (Composer) obj5;
                                if ((((Number) obj6).intValue() & 3) == 2) {
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.getSkipping()) {
                                        gapComposer3.skipToGroupEnd();
                                        return Unit.INSTANCE;
                                    }
                                }
                                MutableState.this.setValue(Unit.INSTANCE);
                                ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                constraintLayoutScope2.getClass();
                                constraintLayoutScope2.reset();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                gapComposer4.startReplaceGroup(2084709477);
                                ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) constraintLayoutScope2.createRefs().mClientFragmentManager;
                                ConstrainedLayoutReference createRef = constraintLayoutScope3.createRef();
                                ConstrainedLayoutReference createRef2 = constraintLayoutScope3.createRef();
                                ConstrainedLayoutReference createRef3 = constraintLayoutScope3.createRef();
                                Object rememberedValue17 = gapComposer4.rememberedValue();
                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                if (rememberedValue17 == neverEqualPolicy) {
                                    rememberedValue17 = PoolDetailsViewKt$ProgressContent$1$5$1$1.INSTANCE;
                                    gapComposer4.updateRememberedValue(rememberedValue17);
                                }
                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                VisibleKt.m3482AnimatedAmountTextJDMA8c0(ConstraintLayoutScope.constrainAs(companion2, createRef, (Function1) rememberedValue17), Strings.getTypography(gapComposer4).numeralLarge, Strings.getColors(gapComposer4).semantic.text.standard, 0, (AnimatedAmountTextView.Amount) mutableState11.getValue(), new AnimatedAmountTextView.AnimationSpeed(700L, 240L, 200L, 60L), false, 0L, gapComposer4, 0, 200);
                                boolean changed5 = gapComposer4.changed(createRef);
                                Object rememberedValue18 = gapComposer4.rememberedValue();
                                if (changed5 || rememberedValue18 == neverEqualPolicy) {
                                    rememberedValue18 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef, 13);
                                    gapComposer4.updateRememberedValue(rememberedValue18);
                                }
                                Modifier constrainAs = ConstraintLayoutScope.constrainAs(companion2, createRef2, (Function1) rememberedValue18);
                                String str8 = str7;
                                String format2 = new MessageFormat(Room.stringResource(gapComposer4, R.string.pools_details_goal_amount)).format(SVG$Unit$EnumUnboxingLocalUtility.m(1, str8, "amount", str8));
                                format2.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer4).semantic.text.subtle, (Composer) gapComposer4, constrainAs, Strings.getTypography(gapComposer4).bodyMedium, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                                boolean booleanValue2 = ((Boolean) mutableState10.getValue()).booleanValue();
                                ContributionAnimation contributionAnimation3 = contributionAnimation2;
                                boolean z7 = booleanValue2 || (booleanValue && contributionAnimation3 != null);
                                boolean changed6 = gapComposer4.changed(createRef);
                                Object rememberedValue19 = gapComposer4.rememberedValue();
                                if (changed6 || rememberedValue19 == neverEqualPolicy) {
                                    rememberedValue19 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef, 14);
                                    gapComposer4.updateRememberedValue(rememberedValue19);
                                }
                                AnimatedContentKt.AnimatedVisibility(z7, ConstraintLayoutScope.constrainAs(companion2, createRef3, (Function1) rememberedValue19), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), "Contribution Animation", (Function3) Expect_jvmKt.rememberComposableLambda(172431415, new TooltipKt$animateTooltip$2(contributionAnimation3, 8), gapComposer4), (Composer) gapComposer4, 224640, 0);
                                gapComposer4.end(false);
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), measurePolicy, gapComposer2, 48);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3120, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    PoolToastKt.ProgressContent(Modifier.this, f, str, j, z, function0, contributionAnimation, str2, f2, poolDetailsAnimationStateHolder, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void SharePoolSection(int i, Composer composer, Modifier modifier, Function0 function0, Function0 function02) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2015678373);
        int i2 = i | 6 | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            modifier = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier, 1.0f);
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
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PoolsListViewKt$$ExternalSyntheticLambda6(3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.pools_share_link_title), SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue), (String) null, (Function0) null, Room.stringResource(gapComposer, R.string.pools_share_link_body), gapComposer, 0, 12);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            DimensionKt.ButtonCtaGroup(ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.f1047app, ColorKt.RectangleShape), false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(690284499, new ShiftNoteViewKt$$ExternalSyntheticLambda9(function0, function02, 8), gapComposer), gapComposer, 24960, 10);
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolInvitePeopleListViewKt$$ExternalSyntheticLambda19(modifier, function0, function02, i);
        }
    }

    public static final void StartPoolError(StartPoolViewModel.Error error, Function1 function1, Modifier modifier, Composer composer, int i) {
        error.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1849193772);
        int i2 = (gapComposer.changedInstance(error) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m277height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(SpacerKt.navigationBarsPadding(modifier), 350.0f);
            boolean z = false;
            String str = error.title;
            String str2 = error.body;
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(12, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            PoolCreateError(str, str2, (Function1) rememberedValue, m277height3ABfNKs, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1((Object) error, function1, (Object) modifier, i, 2);
        }
    }

    public static final void StartPoolName(StartPoolViewModel.Name name, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        boolean z;
        boolean z2;
        name.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-600715619);
        int i3 = i | (gapComposer.changedInstance(name) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            String str = name.formattedAmount;
            if (name.name.length() > 0) {
                i2 = i3;
                z2 = false;
                z = true;
            } else {
                i2 = i3;
                z = false;
                z2 = false;
            }
            String str2 = name.name;
            int i4 = i2 & 112;
            boolean z3 = i4 == 32 ? true : z2;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean z4 = i4 != 32 ? z2 : true;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z4 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PdfPreviewView$$ExternalSyntheticLambda0(28, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            PoolDescription(str, z, function12, (Function0) rememberedValue2, modifier, str2, gapComposer, 57344 & (i2 << 6));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1((Object) name, function1, (Object) modifier, i, 3);
        }
    }

    public static final void StartPoolSubmit(StartPoolViewModel.Submit submit, Modifier modifier, Composer composer, int i) {
        submit.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1795140993);
        int i2 = (gapComposer.changedInstance(submit) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            PoolCreateLoading(0, gapComposer, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(SpacerKt.navigationBarsPadding(modifier), 350.0f), submit.name);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewViewKt$$ExternalSyntheticLambda0(submit, modifier, i, 21);
        }
    }

    public static final void StartPoolSuccess(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(636190562);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m277height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(SpacerKt.navigationBarsPadding(modifier), 350.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
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
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), Strings.getColors(gapComposer).semantic.background.brand, RoundedCornerShapeKt.CircleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Trace.m1191Iconww6aTOc(Icons.Check32, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.inverse, gapComposer, 54, 4);
            gapComposer.end(true);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.pools_create_success_text), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 6);
        }
    }

    public static final ImmutableList toAvatarEntries(ImmutableList immutableList, Composer composer) {
        long j;
        AvatarImage.Remote.Image image;
        immutableList.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1956297905);
        int i = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(immutableList, 10));
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            PoolParticipant poolParticipant = (PoolParticipant) it.next();
            String str = poolParticipant.name;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            Color m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1965880829, poolParticipant.accentColor, gapComposer, false);
            if (m == null) {
                gapComposer.startReplaceGroup(1965882521);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1965880165);
                gapComposer.end(false);
                j = m.value;
            }
            long j2 = j;
            Image image2 = poolParticipant.photoImage;
            if (image2 == null) {
                gapComposer.startReplaceGroup(812916882);
                gapComposer.end(false);
                image = null;
            } else {
                gapComposer.startReplaceGroup(812916883);
                AvatarImage.Remote.Image image3 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image2, gapComposer), false, null, 0L, new PoolDetailsViewKt$$ExternalSyntheticLambda47(i), 62);
                gapComposer.end(false);
                image = image3;
            }
            arrayList.add(new AvatarEntry(str2, j2, null, image, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE));
        }
        gapComposer.end(false);
        return Tags.toImmutableList(arrayList);
    }

    public static final void PoolContributeAmountAtm(PoolContributeWithNoteViewModel.AmountAtmPicker amountAtmPicker, Function1 function1, Modifier modifier, Composer composer, int i) {
        amountAtmPicker.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(219599039);
        int i2 = i | (gapComposer.changedInstance(amountAtmPicker) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String stringResource = Room.stringResource(gapComposer, R.string.pools_contribute_choose_an_amount);
            List list = amountAtmPicker.amountOptions;
            String stringResource2 = Room.stringResource(gapComposer, R.string.pools_continue_button);
            boolean z = amountAtmPicker.buttonEnabled;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(9, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean z3 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PdfPreviewView$$ExternalSyntheticLambda0(19, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            PoolContributeAmountAtm(stringResource, list, stringResource2, z, function12, (Function0) rememberedValue2, modifier, gapComposer, (i2 << 12) & 3670016);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1((Object) amountAtmPicker, function1, (Object) modifier, i, 27);
        }
    }

    public static final void PoolContributeNote(PoolContributeWithNoteViewModel.InputNote inputNote, Function1 function1, Modifier modifier, Composer composer, int i) {
        inputNote.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-38027471);
        int i2 = i | (gapComposer.changedInstance(inputNote) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = inputNote.amountFormatted;
            String str2 = inputNote.poolName;
            ImmutableList immutableList = inputNote.participants;
            String str3 = inputNote.note;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PdfPreviewView$$ExternalSyntheticLambda0(22, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda3(11, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            boolean z3 = i3 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new PdfPreviewView$$ExternalSyntheticLambda0(23, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            PoolContributeNote(str, str2, immutableList, str3, function0, function12, (Function0) rememberedValue3, modifier, gapComposer, (i2 << 15) & 29360128);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1((Object) inputNote, function1, (Object) modifier, i, 29);
        }
    }

    public static final void PoolContributeReview(PoolContributeWithNoteViewModel.Review review, Function1 function1, Modifier modifier, Composer composer, int i) {
        review.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1147813737);
        int i2 = i | (gapComposer.changedInstance(review) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = review.amountFormatted;
            String str2 = review.poolName;
            ImmutableList immutableList = review.participants;
            String str3 = review.note;
            String str4 = review.disclaimerText;
            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = review.instrumentModel;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PdfPreviewView$$ExternalSyntheticLambda0(24, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PdfPreviewView$$ExternalSyntheticLambda0(25, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function02 = (Function0) rememberedValue2;
            boolean z3 = i3 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new PdfPreviewView$$ExternalSyntheticLambda0(26, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            PoolContributeReview(str, str2, immutableList, str3, str4, instrumentSelectionRowViewModel, function0, function02, (Function0) rememberedValue3, modifier, gapComposer, (i2 << 21) & 1879048192);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1((Object) review, function1, (Object) modifier, i, 1);
        }
    }

    public static final void PoolContributeAmountCustom(PoolContributeWithNoteViewModel.AmountCustomPicker amountCustomPicker, Function1 function1, Modifier modifier, Composer composer, int i) {
        amountCustomPicker.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1818791704);
        int i2 = i | (gapComposer.changedInstance(amountCustomPicker) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            CurrencyCode currencyCode = amountCustomPicker.currency;
            String stringResource = Room.stringResource(gapComposer, R.string.pools_continue_button);
            boolean z = amountCustomPicker.buttonEnabled;
            String str = amountCustomPicker.rawAmount;
            boolean z2 = amountCustomPicker.isAmountInvalid;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(10, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean z4 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z4 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PdfPreviewView$$ExternalSyntheticLambda0(20, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            PoolContributeAmountCustom(currencyCode, stringResource, z, str, z2, function12, (Function0) rememberedValue2, modifier, gapComposer, (i2 << 15) & 29360128);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1((Object) amountCustomPicker, function1, (Object) modifier, i, 28);
        }
    }
}
