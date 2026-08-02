package com.squareup.cash.family.familyhub.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import androidx.compose.material3.SliderKt$sliderTapModifier$1;
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
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.glance.session.SessionWorkerKt$runSession$4$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.ui.compose.ChromeConfigKt$$ExternalSyntheticLambda5;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.libraries.places.api.model.zzco;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter$register$result$1;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda7;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewModel;
import com.squareup.cash.family.familyhub.viewmodels.ControlDisablingConfirmationViewModel;
import com.squareup.cash.family.familyhub.viewmodels.ControlErrorViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentAccessControlsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentBalancesViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlInfo;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$Enabled;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$Gone;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsFooterViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsLimitsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsToggleViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailIntroductionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentNotificationsSectionModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.FamilyListGroup;
import com.squareup.cash.family.familyhub.viewmodels.FamilyListItem;
import com.squareup.cash.family.familyhub.viewmodels.FamilyListSection;
import com.squareup.cash.family.familyhub.viewmodels.FamilyMemberRowViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyMultiplePendingRequestsRowModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingInvitesViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel;
import com.squareup.cash.family.familyhub.viewmodels.P2PControlListViewModel;
import com.squareup.cash.family.familyhub.viewmodels.U13CelebrationViewModel;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.favorites.components.AddFavoritesViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.formview.components.FormCashtag$8$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda0;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.pools.views.StartPoolAmountKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.StartPoolAmountKt$$ExternalSyntheticLambda7;
import com.squareup.cash.pools.views.StartPoolAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.taptopay.views.TapToPayPaymentKt$$ExternalSyntheticLambda3;
import com.squareup.cash.tax.views.TaxToolTipViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.util.Strings;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.SharedViewEventsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.random.Random;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;
import string.TrimMode;

/* loaded from: classes6.dex */
public abstract class AllowanceViewKt {

    /* renamed from: lambda$-1183607260, reason: not valid java name */
    public static final ComposableLambdaImpl f402lambda$1183607260;

    /* renamed from: lambda$-1251446859, reason: not valid java name */
    public static final ComposableLambdaImpl f403lambda$1251446859;

    /* renamed from: lambda$-1383770604, reason: not valid java name */
    public static final ComposableLambdaImpl f404lambda$1383770604;

    /* renamed from: lambda$-13875307, reason: not valid java name */
    public static final ComposableLambdaImpl f405lambda$13875307;

    /* renamed from: lambda$-144963357, reason: not valid java name */
    public static final ComposableLambdaImpl f406lambda$144963357;

    /* renamed from: lambda$-1591443944, reason: not valid java name */
    public static final ComposableLambdaImpl f407lambda$1591443944;

    /* renamed from: lambda$-1813827076, reason: not valid java name */
    public static final ComposableLambdaImpl f409lambda$1813827076;

    /* renamed from: lambda$-1911139793, reason: not valid java name */
    public static final ComposableLambdaImpl f410lambda$1911139793;

    /* renamed from: lambda$-1921921037, reason: not valid java name */
    public static final ComposableLambdaImpl f411lambda$1921921037;

    /* renamed from: lambda$-2018991892, reason: not valid java name */
    public static final ComposableLambdaImpl f412lambda$2018991892;

    /* renamed from: lambda$-352657231, reason: not valid java name */
    public static final ComposableLambdaImpl f413lambda$352657231;

    /* renamed from: lambda$-366285759, reason: not valid java name */
    public static final ComposableLambdaImpl f414lambda$366285759;

    /* renamed from: lambda$-438542907, reason: not valid java name */
    public static final ComposableLambdaImpl f415lambda$438542907;

    /* renamed from: lambda$-667063402, reason: not valid java name */
    public static final ComposableLambdaImpl f416lambda$667063402;

    /* renamed from: lambda$-888804365, reason: not valid java name */
    public static final ComposableLambdaImpl f417lambda$888804365;
    public static final ComposableLambdaImpl lambda$1014272118;
    public static final ComposableLambdaImpl lambda$1068030227;
    public static final ComposableLambdaImpl lambda$107369277;
    public static final ComposableLambdaImpl lambda$122518036;
    public static final ComposableLambdaImpl lambda$1386412006;
    public static final ComposableLambdaImpl lambda$1464660993;
    public static final ComposableLambdaImpl lambda$1800636183;
    public static final ComposableLambdaImpl lambda$2117254222;
    public static final ComposableLambdaImpl lambda$230647414;
    public static final ComposableLambdaImpl lambda$314428914;
    public static final ComposableLambdaImpl lambda$352973825;
    public static final ComposableLambdaImpl lambda$437005797;
    public static final ComposableLambdaImpl lambda$948875104;
    public static final ComposableLambdaImpl lambda$597407782 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(13), false, 597407782);
    public static final ComposableLambdaImpl lambda$1159175003 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(14), false, 1159175003);

    /* renamed from: lambda$-1608173300, reason: not valid java name */
    public static final ComposableLambdaImpl f408lambda$1608173300 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(15), false, -1608173300);
    public static final int[] CARD_DRAWABLES = {2131233654, 2131233656, 2131233653, 2131233652, 2131233651, 2131233650, 2131233655, 2131233657};

    static {
        int i = 1;
        f403lambda$1251446859 = new ComposableLambdaImpl(new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i), false, -1251446859);
        int i2 = 2;
        f404lambda$1383770604 = new ComposableLambdaImpl(new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i2), false, -1383770604);
        int i3 = 3;
        lambda$2117254222 = new ComposableLambdaImpl(new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i3), false, 2117254222);
        int i4 = 4;
        f415lambda$438542907 = new ComposableLambdaImpl(new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i4), false, -438542907);
        int i5 = 5;
        f407lambda$1591443944 = new ComposableLambdaImpl(new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i5), false, -1591443944);
        lambda$230647414 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(i), false, 230647414);
        f409lambda$1813827076 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(i2), false, -1813827076);
        f411lambda$1921921037 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(i3), false, -1921921037);
        lambda$1800636183 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(i4), false, 1800636183);
        f412lambda$2018991892 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(i5), false, -2018991892);
        int i6 = 6;
        f402lambda$1183607260 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(i6), false, -1183607260);
        int i7 = 7;
        lambda$314428914 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(i7), false, 314428914);
        int i8 = 8;
        f416lambda$667063402 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(i8), false, -667063402);
        f417lambda$888804365 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(i4), false, -888804365);
        int i9 = 9;
        lambda$107369277 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(i9), false, 107369277);
        int i10 = 10;
        f414lambda$366285759 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(i10), false, -366285759);
        int i11 = 11;
        lambda$122518036 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(i11), false, 122518036);
        int i12 = 12;
        lambda$1068030227 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(i12), false, 1068030227);
        lambda$352973825 = new ComposableLambdaImpl(new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i6), false, 352973825);
        lambda$1014272118 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(i5), false, 1014272118);
        f413lambda$352657231 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(i6), false, -352657231);
        lambda$1464660993 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(i7), false, 1464660993);
        f410lambda$1911139793 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(i8), false, -1911139793);
        f405lambda$13875307 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(i9), false, -13875307);
        lambda$1386412006 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(i10), false, 1386412006);
        lambda$948875104 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(i11), false, 948875104);
        f406lambda$144963357 = new ComposableLambdaImpl(new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i7), false, -144963357);
        lambda$437005797 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(i12), false, 437005797);
    }

    public static final void AllowanceDetail(final AllowanceViewModel.AllowanceDetail allowanceDetail, Function1 function1, Composer composer, int i) {
        Function0 function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1236152993);
        final int i2 = 2;
        int i3 = (gapComposer.changedInstance(allowanceDetail) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            boolean z = allowanceDetail.isReadOnly;
            String str = allowanceDetail.amount;
            CellDefaultAccessory.Label label = !z ? new CellDefaultAccessory.Label(str, 2) : new CellDefaultAccessory.Label(str, 0);
            if (allowanceDetail.isReadOnly) {
                gapComposer.startReplaceGroup(1184938443);
                gapComposer.end(false);
                function0 = null;
            } else {
                gapComposer.startReplaceGroup(1184872227);
                boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(allowanceDetail);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(26, function1, allowanceDetail);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function0 = (Function0) rememberedValue;
                gapComposer.end(false);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1790782479, new Function2() { // from class: com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i4;
                    AllowanceViewModel.AllowanceDetail allowanceDetail2 = allowanceDetail;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                Painter painterResource = Countries.painterResource(R.drawable.allowance_icon, 0, gapComposer2);
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                long j = colors.semantic.icon.standard;
                                ImageKt.Image(painterResource, allowanceDetail2.title, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable, 60);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowanceDetail2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowanceDetail2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), Expect_jvmKt.rememberComposableLambda(-1555695088, new Function2() { // from class: com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    AllowanceViewModel.AllowanceDetail allowanceDetail2 = allowanceDetail;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                Painter painterResource = Countries.painterResource(R.drawable.allowance_icon, 0, gapComposer2);
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                long j = colors.semantic.icon.standard;
                                ImageKt.Image(painterResource, allowanceDetail2.title, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable, 60);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowanceDetail2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowanceDetail2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, function0, false, false, Expect_jvmKt.rememberComposableLambda(-159724010, new Function2() { // from class: com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i2;
                    AllowanceViewModel.AllowanceDetail allowanceDetail2 = allowanceDetail;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                Painter painterResource = Countries.painterResource(R.drawable.allowance_icon, 0, gapComposer2);
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                long j = colors.semantic.icon.standard;
                                ImageKt.Image(painterResource, allowanceDetail2.title, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable, 60);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowanceDetail2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowanceDetail2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, label, 0L, gapComposer, 12582966, 3444);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(allowanceDetail, function1, i, 3);
        }
    }

    public static final void AllowanceSelectionBottomSheetContent(AmountChooserViewModel amountChooserViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        amountChooserViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-624363935);
        int i2 = (gapComposer.changedInstance(amountChooserViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            if (amountChooserViewModel instanceof AmountChooserViewModel.Content) {
                gapComposer.startReplaceGroup(1281687038);
                AllowanceSelectionBottomSheetLoaded((AmountChooserViewModel.Content) amountChooserViewModel, function1, gapComposer, i3 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer.end(false);
            } else {
                if (!amountChooserViewModel.equals(AmountChooserViewModel.Loading.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1281685169, false);
                }
                gapComposer.startReplaceGroup(1281690218);
                Loading(gapComposer, 0);
                gapComposer.end(false);
            }
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) amountChooserViewModel, function1, (Object) modifier2, i, 18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0277, code lost:
    
        if (r2 == r26) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AllowanceSelectionBottomSheetLoaded(AmountChooserViewModel.Content content, Function1 function1, Composer composer, int i) {
        int i2;
        Easing easing;
        int i3;
        boolean z;
        int i4;
        ?? r6;
        NeverEqualPolicy neverEqualPolicy;
        Modifier.Companion companion;
        int i5;
        ?? r5;
        Object obj;
        Function1 function12 = function1;
        ?? r15 = (GapComposer) composer;
        r15.startRestartGroup(-1178087577);
        Applier applier = r15.applier;
        if ((i & 6) == 0) {
            i2 = (r15.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= r15.changedInstance(function12) ? 32 : 16;
        }
        int i6 = i & MLKEMEngine.KyberPolyBytes;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        if (i6 == 0) {
            i2 |= r15.changed(companion2) ? 256 : 128;
        }
        int i7 = i2;
        if (r15.shouldExecute(i7 & 1, (i7 & 147) != 146)) {
            Object rememberedValue = r15.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            Object obj2 = rememberedValue;
            if (rememberedValue == neverEqualPolicy2) {
                obj2 = Recorder$$ExternalSyntheticOutline2.m((GapComposer) r15);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj2;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, r15, 0);
            int hashCode = Long.hashCode(r15.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = r15.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(r15, companion2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            r15.startReusableNode();
            if (r15.inserting) {
                r15.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r15.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(r15, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(r15, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(r15, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(r15, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(r15, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Object rememberedValue2 = r15.rememberedValue();
            int i8 = 22;
            Object obj3 = rememberedValue2;
            if (rememberedValue2 == neverEqualPolicy2) {
                Recipient$$ExternalSyntheticLambda2 recipient$$ExternalSyntheticLambda2 = new Recipient$$ExternalSyntheticLambda2(i8);
                r15.updateRememberedValue(recipient$$ExternalSyntheticLambda2);
                obj3 = recipient$$ExternalSyntheticLambda2;
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(companion2, mutableInteractionSourceImpl, null, false, null, null, (Function0) obj3, 28);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(r15.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = r15.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(r15, m182clickableO2vRcR0$default);
            r15.startReusableNode();
            if (r15.inserting) {
                r15.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r15.useNode();
            }
            Updater.m576setimpl(r15, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(r15, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, (GapComposer) r15, composeUiNode$Companion$SetModifier$13, (GapComposer) r15, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(r15, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            if (content.shouldExpand) {
                function12 = function1;
                easing = null;
                i3 = 0;
                z = true;
                r15.startReplaceGroup(584326911);
                r15.end(false);
            } else {
                r15.startReplaceGroup(582934422);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                Colors colors = (Colors) r15.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m((GapComposer) r15, -1762997026, (GapComposer) r15, false);
                } else {
                    r15.startReplaceGroup(-1762997739);
                    r15.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) r15.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m177backgroundbw27NRU, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, r15, 0);
                int hashCode3 = Long.hashCode(r15.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = r15.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(r15, m300paddingVpY3zN4$default);
                r15.startReusableNode();
                if (r15.inserting) {
                    r15.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    r15.useNode();
                }
                Updater.m576setimpl(r15, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(r15, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, (GapComposer) r15, composeUiNode$Companion$SetModifier$13, (GapComposer) r15, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(r15, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                AllowanceSelectionHeader(content.title, content.subtitle, content.configButton, function1, r15, (i7 << 6) & 7168);
                z = true;
                DBUtil.SpacerBetweenSectionLarge(0, 1, r15, null);
                List list = content.amountSelectorOptions;
                int i9 = i7 & 112;
                boolean z2 = i9 == 32;
                Object rememberedValue3 = r15.rememberedValue();
                Object obj4 = rememberedValue3;
                if (z2 || rememberedValue3 == neverEqualPolicy2) {
                    ComposeDialogKt$$ExternalSyntheticLambda3 composeDialogKt$$ExternalSyntheticLambda3 = new ComposeDialogKt$$ExternalSyntheticLambda3(19, function1);
                    r15.updateRememberedValue(composeDialogKt$$ExternalSyntheticLambda3);
                    obj4 = composeDialogKt$$ExternalSyntheticLambda3;
                }
                TrimMode.AtmPickerGrid(0, 1, r15, null, list, (Function1) obj4);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                ((DefaultSizes) r15.consume(staticProvidableCompositionLocal)).getClass();
                SpacerKt.Spacer(r15, SizeKt.m277height3ABfNKs(fillMaxWidth2, 64.0f));
                AmountChooserViewModel.Content.AmountChooserActionButtonModel amountChooserActionButtonModel = content.secondaryButton;
                if (amountChooserActionButtonModel == null) {
                    r15.startReplaceGroup(-2032754258);
                    r6 = 0;
                    r15.end(false);
                    function12 = function1;
                    r5 = 0;
                    companion = companion2;
                    i5 = i9;
                    neverEqualPolicy = neverEqualPolicy2;
                    i4 = 32;
                } else {
                    r15.startReplaceGroup(-2032754257);
                    boolean z3 = amountChooserActionButtonModel.isEnabled;
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion2, 1.0f);
                    i4 = 32;
                    boolean z4 = i9 == 32;
                    Object rememberedValue4 = r15.rememberedValue();
                    Object obj5 = rememberedValue4;
                    if (z4 || rememberedValue4 == neverEqualPolicy2) {
                        FamilyHomeViewKt$$ExternalSyntheticLambda6 familyHomeViewKt$$ExternalSyntheticLambda6 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(22, function1);
                        r15.updateRememberedValue(familyHomeViewKt$$ExternalSyntheticLambda6);
                        obj5 = familyHomeViewKt$$ExternalSyntheticLambda6;
                    }
                    Function0 function0 = (Function0) obj5;
                    r6 = 0;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-725979818, new FamilyAmountSelectionBottomSheetKt$$ExternalSyntheticLambda5(amountChooserActionButtonModel, false ? 1 : 0), r15);
                    neverEqualPolicy = neverEqualPolicy2;
                    companion = companion2;
                    i5 = i9;
                    function12 = function1;
                    r5 = 0;
                    coil3.size.SizeKt.Button(function0, fillMaxWidth3, null, false, z3, null, rememberComposableLambda, r15, 1572912, 44);
                    DBUtil.SpacerWithinSectionMedium(0, 1, r15, null);
                    r15.end(false);
                }
                AmountChooserViewModel.Content.AmountChooserActionButtonModel amountChooserActionButtonModel2 = content.primaryButton;
                if (amountChooserActionButtonModel2 == null) {
                    r15.startReplaceGroup(-2032435702);
                    r15.end(r6);
                } else {
                    r15.startReplaceGroup(-2032435701);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean z5 = amountChooserActionButtonModel2.isEnabled;
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean z6 = i5 == i4 ? true : r6 == true ? 1 : 0;
                    Object rememberedValue5 = r15.rememberedValue();
                    if (!z6) {
                        obj = rememberedValue5;
                    }
                    FamilyHomeViewKt$$ExternalSyntheticLambda6 familyHomeViewKt$$ExternalSyntheticLambda62 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(23, function12);
                    r15.updateRememberedValue(familyHomeViewKt$$ExternalSyntheticLambda62);
                    obj = familyHomeViewKt$$ExternalSyntheticLambda62;
                    coil3.size.SizeKt.Button((Function0) obj, fillMaxWidth4, buttonProminence, false, z5, null, Expect_jvmKt.rememberComposableLambda(-1872890355, new FamilyAmountSelectionBottomSheetKt$$ExternalSyntheticLambda5(amountChooserActionButtonModel2, 3), r15), r15, 1573296, 40);
                    DBUtil.SpacerWithinSectionMedium(r6 == true ? 1 : 0, 1, r15, r5);
                    r15.end(r6);
                }
                DBUtil.SpacerWithinSectionMedium(r6 == true ? 1 : 0, 1, r15, r5);
                r15.end(true);
                r15.end(r6);
                easing = r5;
                i3 = r6;
            }
            r15.end(z);
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, content.shouldExpand, null, EnterExitTransitionKt.fadeIn(0.2f, AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, i3, easing, 6)), ExitTransitionImpl.None, null, Expect_jvmKt.rememberComposableLambda(-57757003, new ArcadeModal2Kt$$ExternalSyntheticLambda0(11, content, function12), r15), r15, 1572870, 18);
            r15.end(z);
        } else {
            r15.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = r15.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(content, function12, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    public static final void AllowanceSelectionHeader(String str, String str2, AmountChooserViewModel.Content.AmountChooserConfigButtonModel amountChooserConfigButtonModel, Function1 function1, Composer composer, int i) {
        String str3;
        int i2;
        AmountChooserViewModel.Content.AmountChooserConfigButtonModel amountChooserConfigButtonModel2;
        Function1 function12;
        GapComposer gapComposer;
        int i3;
        NeverEqualPolicy neverEqualPolicy;
        ?? r15;
        Modifier modifier;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(961975325);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (gapComposer3.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer3.changedInstance(amountChooserConfigButtonModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer3.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = new FamilyActivityFixtures$$ExternalSyntheticLambda0(5);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 48);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).header, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            if (str2 == null) {
                gapComposer3.startReplaceGroup(-1137712335);
                gapComposer3.end(false);
                modifier = null;
                i3 = i2;
                neverEqualPolicy = neverEqualPolicy2;
                r15 = 0;
                gapComposer2 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(-1137712334);
                Strings.getSizes(gapComposer3).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(companion, 4.0f));
                i3 = i2;
                neverEqualPolicy = neverEqualPolicy2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                GapComposer gapComposer4 = gapComposer3;
                r15 = 0;
                gapComposer4.end(false);
                modifier = null;
                gapComposer2 = gapComposer4;
            }
            DBUtil.SpacerWithinSectionSmall(r15, 1, gapComposer2, modifier);
            amountChooserConfigButtonModel2 = amountChooserConfigButtonModel;
            if (amountChooserConfigButtonModel2 == null) {
                gapComposer2.startReplaceGroup(-1137425120);
                gapComposer2.end(r15);
                function12 = function1;
            } else {
                gapComposer2.startReplaceGroup(-1137425119);
                boolean z = (i3 & 7168) == 2048 ? true : r15;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z || rememberedValue2 == neverEqualPolicy) {
                    function12 = function1;
                    rememberedValue2 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(17, function12);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                } else {
                    function12 = function1;
                }
                coil3.size.SizeKt.ButtonDropdown((Function0) rememberedValue2, null, false, null, Expect_jvmKt.rememberComposableLambda(50331241, new FamilyAmountSelectionBottomSheetKt$$ExternalSyntheticLambda12(amountChooserConfigButtonModel2, r15), gapComposer2), gapComposer2, 24576, 14);
                gapComposer2.end(r15);
            }
            gapComposer2.end(true);
            gapComposer = gapComposer2;
        } else {
            amountChooserConfigButtonModel2 = amountChooserConfigButtonModel;
            function12 = function1;
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(str, i, str2, amountChooserConfigButtonModel2, function12, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void AllowanceSelectionKeypadAmountPicker(AmountChooserViewModel.Content content, Function1 function1, Modifier modifier, Composer composer, int i) {
        AmountChooserViewModel.Content content2;
        Modifier modifier2;
        Object gLSceneScopeProvider$SceneScope$2$1$1;
        Shaker shaker;
        NeverEqualPolicy neverEqualPolicy;
        float f;
        int i2;
        boolean z;
        boolean z2;
        Function1 function12 = function1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(598531084);
        Applier applier = gapComposer.applier;
        int i3 = 4;
        int i4 = i | (gapComposer.changedInstance(content) ? 4 : 2) | (gapComposer.changedInstance(function12) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer.consume(LocalCashVibratorKt.LocalCashVibrator);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer, 0);
            CurrencyCode currencyCode = content.currencyCode;
            String str = content.rawAmount;
            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(currencyCode, null, false, 0, 14);
            int i5 = i4 & 112;
            boolean changedInstance = (i5 == 32) | gapComposer.changedInstance(rememberShaker) | gapComposer.changedInstance(realCashVibrator);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new StartPoolAmountKt$$ExternalSyntheticLambda4(function12, rememberShaker, realCashVibrator);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, str, (Function1) rememberedValue, gapComposer, 0);
            boolean changed = gapComposer.changed(rememberAmountDisplayState) | gapComposer.changedInstance(content);
            Object rememberedValue2 = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (changed || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new CheckStatusPresenter.AnonymousClass1.C00611(rememberAmountDisplayState, content, continuation, i3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue2);
            Versioned versioned = content.shouldShakeAmount;
            boolean changedInstance2 = gapComposer.changedInstance(content) | gapComposer.changedInstance(rememberShaker) | gapComposer.changedInstance(realCashVibrator);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy2) {
                shaker = rememberShaker;
                gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1(content, shaker, realCashVibrator, continuation, 10);
                gapComposer.updateRememberedValue(gLSceneScopeProvider$SceneScope$2$1$1);
            } else {
                gLSceneScopeProvider$SceneScope$2$1$1 = rememberedValue3;
                shaker = rememberShaker;
            }
            Updater.LaunchedEffect(gapComposer, versioned, (Function2) gLSceneScopeProvider$SceneScope$2$1$1);
            boolean changed2 = gapComposer.changed(rememberAmountDisplayState);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue4 == neverEqualPolicy2) {
                rememberedValue4 = new AmountDisplayKeypadListener(rememberAmountDisplayState);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            AmountDisplayKeypadListener amountDisplayKeypadListener = (AmountDisplayKeypadListener) rememberedValue4;
            long j = Strings.getColors(gapComposer).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
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
            NavigationType navigationType = NavigationType.CLOSE;
            boolean z3 = i5 == 32;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (z3 || rememberedValue5 == neverEqualPolicy2) {
                neverEqualPolicy = neverEqualPolicy2;
                rememberedValue5 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(19, function12);
                gapComposer.updateRememberedValue(rememberedValue5);
            } else {
                neverEqualPolicy = neverEqualPolicy2;
            }
            Function0 function0 = (Function0) rememberedValue5;
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            modifier2 = companion;
            Shaker shaker2 = shaker;
            int i6 = 1;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, function0, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy3) {
                rememberedValue6 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(6);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SemanticsModifierKt.semantics(modifier2, true, (Function1) rememberedValue6), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            content2 = content;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).titleBarPageTitle, (TextLineBalancing) null, content2.title, (Map) null, (Function1) null, false);
            GapComposer gapComposer2 = gapComposer;
            String str2 = content2.subtitle;
            if (str2 == null) {
                gapComposer2.startReplaceGroup(395475436);
                gapComposer2.end(false);
                f = 16.0f;
            } else {
                gapComposer2.startReplaceGroup(395475437);
                Strings.getSizes(gapComposer2).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(modifier2, 4.0f));
                Strings.getSizes(gapComposer2).getClass();
                f = 16.0f;
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, SpacerKt.m300paddingVpY3zN4$default(modifier2, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer2 = gapComposer2;
                gapComposer2.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            AmountChooserViewModel.Content.AmountChooserConfigButtonModel amountChooserConfigButtonModel = content2.configButton;
            if (amountChooserConfigButtonModel == null) {
                gapComposer2.startReplaceGroup(395898555);
                gapComposer2.end(false);
                i2 = i5;
            } else {
                gapComposer2.startReplaceGroup(395898556);
                i2 = i5;
                Object[] objArr = i2 == 32;
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (objArr != false || rememberedValue7 == neverEqualPolicy3) {
                    rememberedValue7 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(20, function1);
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                GapComposer gapComposer3 = gapComposer2;
                coil3.size.SizeKt.ButtonDropdown((Function0) rememberedValue7, null, false, null, Expect_jvmKt.rememberComposableLambda(-1735348062, new FamilyAmountSelectionBottomSheetKt$$ExternalSyntheticLambda12(amountChooserConfigButtonModel, i6), gapComposer2), gapComposer3, 24576, 14);
                gapComposer2 = gapComposer3;
                gapComposer2.end(false);
            }
            gapComposer2.end(true);
            Modifier shakeWith = SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(modifier2, 1.0f).then(new LayoutWeightElement(1.0f, true)), shaker2);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            int i7 = 2;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(shakeWith, f, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (rememberedValue8 == neverEqualPolicy3) {
                rememberedValue8 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(7);
                gapComposer2.updateRememberedValue(rememberedValue8);
            }
            int i8 = i2;
            GapComposer gapComposer4 = gapComposer2;
            ConnectionPoolKt.m1177AmountDisplaykNX22eY(rememberAmountDisplayState, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, false, (Function1) rememberedValue8), Strings.getColors(gapComposer2).semantic.text.prominent, 0L, 0, 0, gapComposer4, 0, 56);
            boolean changedInstance3 = gapComposer4.changedInstance(amountDisplayKeypadListener);
            Object rememberedValue9 = gapComposer4.rememberedValue();
            if (changedInstance3 || rememberedValue9 == neverEqualPolicy3) {
                rememberedValue9 = new StartPoolAmountKt$$ExternalSyntheticLambda7(amountDisplayKeypadListener, 3);
                gapComposer4.updateRememberedValue(rememberedValue9);
            }
            Function0 function02 = (Function0) rememberedValue9;
            boolean changedInstance4 = gapComposer4.changedInstance(amountDisplayKeypadListener);
            Object rememberedValue10 = gapComposer4.rememberedValue();
            if (changedInstance4 || rememberedValue10 == neverEqualPolicy3) {
                rememberedValue10 = new StartPoolAmountKt$$ExternalSyntheticLambda8(amountDisplayKeypadListener, 2);
                gapComposer4.updateRememberedValue(rememberedValue10);
            }
            KeypadViewModel keypadViewModel = new KeypadViewModel(null, false, function02, (Function1) rememberedValue10, 3);
            long j2 = Strings.getColors(gapComposer4).semantic.text.standard;
            Strings.getSizes(gapComposer4).getClass();
            RelationUtil.m1189KeypadViewww6aTOc(SpacerKt.m300paddingVpY3zN4$default(modifier2, f, RecyclerView.DECELERATION_RATE, 2), keypadViewModel, null, j2, gapComposer4, 0, 4);
            gapComposer = gapComposer4;
            AmountChooserViewModel.Content.AmountChooserActionButtonModel amountChooserActionButtonModel = content2.secondaryButton;
            if (amountChooserActionButtonModel == null) {
                gapComposer.startReplaceGroup(-788443445);
                gapComposer.end(false);
                z = false;
            } else {
                gapComposer.startReplaceGroup(-788443444);
                boolean z4 = amountChooserActionButtonModel.isEnabled;
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(modifier2, 1.0f);
                Strings.getSizes(gapComposer).getClass();
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, f, RecyclerView.DECELERATION_RATE, 2);
                boolean z5 = i8 == 32;
                Object rememberedValue11 = gapComposer.rememberedValue();
                if (z5 || rememberedValue11 == neverEqualPolicy3) {
                    rememberedValue11 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(21, function1);
                    gapComposer.updateRememberedValue(rememberedValue11);
                }
                coil3.size.SizeKt.Button((Function0) rememberedValue11, m300paddingVpY3zN4$default2, null, false, z4, null, Expect_jvmKt.rememberComposableLambda(-1812463308, new FamilyAmountSelectionBottomSheetKt$$ExternalSyntheticLambda5(amountChooserActionButtonModel, i7), gapComposer), gapComposer, 1572864, 44);
                z = false;
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            AmountChooserViewModel.Content.AmountChooserActionButtonModel amountChooserActionButtonModel2 = content2.primaryButton;
            if (amountChooserActionButtonModel2 == null) {
                gapComposer.startReplaceGroup(-788130035);
                gapComposer.end(z);
                function12 = function1;
                z2 = true;
            } else {
                gapComposer.startReplaceGroup(-788130034);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                boolean z6 = amountChooserActionButtonModel2.isEnabled;
                Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(modifier2, 1.0f);
                Strings.getSizes(gapComposer).getClass();
                Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth3, f, RecyclerView.DECELERATION_RATE, 2);
                boolean z7 = i8 == 32;
                Object rememberedValue12 = gapComposer.rememberedValue();
                if (z7 || rememberedValue12 == neverEqualPolicy3) {
                    function12 = function1;
                    rememberedValue12 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(18, function12);
                    gapComposer.updateRememberedValue(rememberedValue12);
                } else {
                    function12 = function1;
                }
                z2 = true;
                coil3.size.SizeKt.Button((Function0) rememberedValue12, m300paddingVpY3zN4$default3, buttonProminence, false, z6, null, Expect_jvmKt.rememberComposableLambda(1842704605, new FamilyAmountSelectionBottomSheetKt$$ExternalSyntheticLambda5(amountChooserActionButtonModel2, 1 == true ? 1 : 0), gapComposer), gapComposer, 1573248, 40);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.end(z2);
        } else {
            content2 = content;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2(modifier2, (Object) content2, function12, i, 24);
        }
    }

    public static final void AllowanceView(AllowanceViewModel allowanceViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1397666378);
        int i2 = (gapComposer.changedInstance(allowanceViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-481049057, new AllowanceViewKt$$ExternalSyntheticLambda0(i3, allowanceViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(allowanceViewModel, function1, i, 25);
        }
    }

    public static final void AllowlistToggleSection(DependentControlsToggleViewModel dependentControlsToggleViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(749576862);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(dependentControlsToggleViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer.startReplaceGroup(1109528571);
            CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(dependentControlsToggleViewModel.toggleChecked);
            boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(dependentControlsToggleViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new DependentControlViewKt$$ExternalSyntheticLambda8(function1, dependentControlsToggleViewModel, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            gapComposer.end(false);
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(906858064, new DependentControlViewKt$$ExternalSyntheticLambda7(dependentControlsToggleViewModel, i4), gapComposer), null, (Function0) rememberedValue, false, false, Expect_jvmKt.rememberComposableLambda(-1805927082, new DependentControlViewKt$$ExternalSyntheticLambda7(dependentControlsToggleViewModel, i2), gapComposer), null, 0L, toggle, null, gapComposer, 1572870, 1466);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(dependentControlsToggleViewModel, function1, i, 10);
        }
    }

    /* renamed from: AutoplayCycler-o3XDK20, reason: not valid java name */
    public static final void m3531AutoplayCyclero3XDK20(final float f, final float f2, final boolean z, final int i, final Function1 function1, Composer composer, final int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(269711861);
        int i3 = i2 | (gapComposer.changed(true) ? 4 : 2) | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changed(f2) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024) | (gapComposer.changed(i) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            Object[] objArr = {Boolean.TRUE, new Dp(f), new Dp(f2), Boolean.valueOf(z), Integer.valueOf(i)};
            boolean changedInstance = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 57344) == 16384) | gapComposer.changedInstance(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new U13CelebrationViewKt$AutoplayCycler$1$1(i, null, function1, z);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(objArr, (Function2) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(f, f2, z, i, function1, i2) { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda18
                public final /* synthetic */ float f$1;
                public final /* synthetic */ float f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ int f$4;
                public final /* synthetic */ Function1 f$5;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    AllowanceViewKt.m3531AutoplayCyclero3XDK20(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void AvatarLoadingView(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1998324608);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 64.0f), RoundedCornerShapeKt.CircleShape);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i, 10);
        }
    }

    public static final void ControlDisablingConfirmationDialog(ControlDisablingConfirmationViewModel controlDisablingConfirmationViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1505618128);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(controlDisablingConfirmationViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-131002555, new ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda0(controlDisablingConfirmationViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) controlDisablingConfirmationViewModel, function1, (Object) modifier2, i, 14);
        }
    }

    public static final void ControlErrorDialog(ControlErrorViewModel controlErrorViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1167310905);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(controlErrorViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2114375186, new AllowanceViewKt$$ExternalSyntheticLambda0(i3, controlErrorViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(controlErrorViewModel, function1, i, 26);
        }
    }

    public static final void ControlRow(Icons icons, int i, ControlType controlType, zzco zzcoVar, Function1 function1, Composer composer, int i2) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2133138167);
        int i3 = i2 | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changedInstance(zzcoVar) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer.skipToGroupEnd();
        } else if (zzcoVar instanceof DependentControlRowState$Gone) {
            gapComposer.startReplaceGroup(-15545077);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-16714614);
            zzcoVar.getClass();
            boolean z = zzcoVar instanceof DependentControlRowState$Enabled;
            if ((z && ((DependentControlRowState$Enabled) zzcoVar).isChecked) || !z || ((DependentControlRowState$Enabled) zzcoVar).controlInfo == DependentControlInfo.P2P) {
                gapComposer.startReplaceGroup(-16588816);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.standard;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-16653296);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.text.disabled;
                gapComposer.end(false);
            }
            long j2 = j;
            DependentControlRowState$Enabled dependentControlRowState$Enabled = z ? (DependentControlRowState$Enabled) zzcoVar : null;
            String str = dependentControlRowState$Enabled != null ? dependentControlRowState$Enabled.title : null;
            if (str == null) {
                str = re$$ExternalSyntheticOutline0.m(gapComposer, 1246394348, i, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(1246393418);
                gapComposer.end(false);
            }
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-868679922, new AllowanceViewKt$$ExternalSyntheticLambda0(14, icons, zzcoVar), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(313552813, new TapToPayPaymentKt$$ExternalSyntheticLambda3(str, zzcoVar, j2, 5), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(zzcoVar) | ((i3 & 57344) == 16384);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda2(6, zzcoVar, function1, controlType);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, true, null, null, push, 0L, gapComposer, 806879286, 3508);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(icons, i, controlType, zzcoVar, function1, i2);
        }
    }

    public static final void DependentAccessControls(Modifier modifier, DependentAccessControlsViewModel dependentAccessControlsViewModel, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-365708985);
        int i2 = i | 6 | (gapComposer.changedInstance(dependentAccessControlsViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1773888547);
            List list = dependentAccessControlsViewModel != null ? dependentAccessControlsViewModel.allowanceItems : null;
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            List<AllowanceViewModel> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (AllowanceViewModel allowanceViewModel : list2) {
                boolean z = (i2 & 896) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda3(17, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                AllowanceView(allowanceViewModel, (Function1) rememberedValue, gapComposer, 0);
                arrayList.add(Unit.INSTANCE);
            }
            gapComposer.end(false);
            SpendingControlsItem(function1, gapComposer, (i2 >> 6) & 14);
            DependentNotificationsSectionModel dependentNotificationsSectionModel = dependentAccessControlsViewModel != null ? dependentAccessControlsViewModel.notificationSettings : null;
            if (dependentNotificationsSectionModel == null) {
                gapComposer.startReplaceGroup(844256967);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(844256968);
                NotificationControlsItem(dependentNotificationsSectionModel, function1, gapComposer, (i2 >> 3) & 112);
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
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2((Object) modifier2, (Object) dependentAccessControlsViewModel, function1, i, 19);
        }
    }

    public static final void DependentControlApprovedContactsContent(DependentControlViewModel.ApprovedContacts approvedContacts, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(571204826);
        int i2 = (gapComposer.changedInstance(approvedContacts) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            AllowlistToggleSection(approvedContacts.toggleViewModel, function1, gapComposer, i2 & 112);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            function12 = function1;
            P2PRowSection(approvedContacts.approvedRowViewModel, approvedContacts.blockedRowViewModel, approvedContacts.limitViewModel, function12, gapComposer, (i2 << 6) & 7168);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(approvedContacts, function12, i, i3);
        }
    }

    public static final void DependentControlCashCardWithTagsContent(DependentControlViewModel.CashCardWithTags cashCardWithTags, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1572510506);
        int i2 = (gapComposer.changedInstance(cashCardWithTags) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            DependentControlViewModel.Toggle toggle = cashCardWithTags.card;
            int i3 = (i2 << 6) & 7168;
            function12 = function1;
            ToggleSection(toggle.toggleViewModel, toggle.controlType, toggle.tagDeviceId, function12, gapComposer, i3);
            gapComposer.startReplaceGroup(563828363);
            for (DependentControlViewModel.Toggle toggle2 : cashCardWithTags.tags) {
                ToggleSection(toggle2.toggleViewModel, toggle2.controlType, toggle2.tagDeviceId, function12, gapComposer, i3);
            }
            gapComposer.end(false);
            DependentControlsLimitsViewModel dependentControlsLimitsViewModel = toggle.limitsViewModel;
            if (dependentControlsLimitsViewModel == null) {
                gapComposer.startReplaceGroup(299042260);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(299042261);
                LimitSection(dependentControlsLimitsViewModel, toggle.controlType, function12, gapComposer, (i2 << 3) & 896);
                gapComposer.end(false);
            }
            String str = toggle.footerText;
            if (str == null) {
                gapComposer.startReplaceGroup(299179962);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(299179963);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                FooterSection(str, function12, gapComposer, i2 & 112);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(cashCardWithTags, function12, i, 7);
        }
    }

    public static final void DependentControlManagedAccountContent(DependentControlViewModel.ManagedAccount managedAccount, Function1 function1, Composer composer, int i) {
        RecomposeScopeImpl endRestartGroup;
        NeverEqualPolicy neverEqualPolicy;
        Function1 function12;
        int i2;
        Modifier wrapContentHeight;
        Function1 function13 = function1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1756359214);
        int i3 = i | (gapComposer.changedInstance(managedAccount) ? 4 : 2) | (gapComposer.changedInstance(function13) ? 32 : 16);
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
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
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            ViewfinderDefaults.SectionHeader(managedAccount.approvedContactsTitle, (Modifier) null, (String) null, (Function0) null, managedAccount.approvedContactsBody, gapComposer, 0, 14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            P2PControlListViewModel p2PControlListViewModel = managedAccount.approvedRowViewModel;
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda6(9, function13);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            P2PControlRow(p2PControlListViewModel, (Function0) rememberedValue, gapComposer, 0);
            P2PControlListViewModel p2PControlListViewModel2 = managedAccount.blockedRowViewModel;
            boolean z2 = i5 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(10, function13);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            P2PControlRow(p2PControlListViewModel2, (Function0) rememberedValue2, gapComposer, 0);
            String str = managedAccount.cashTitle;
            DependentControlsToggleViewModel dependentControlsToggleViewModel = managedAccount.cashCardToggleViewModel;
            if (str == null || dependentControlsToggleViewModel == null) {
                neverEqualPolicy = neverEqualPolicy2;
                function12 = function13;
                i2 = i5;
                gapComposer.startReplaceGroup(2134816698);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2133717314);
                ModalKt.HorizontalDivider(0, 1, gapComposer, null);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(dependentControlsToggleViewModel.toggleChecked);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1639926354, new DependentControlViewKt$$ExternalSyntheticLambda7(dependentControlsToggleViewModel, i4), gapComposer);
                boolean changedInstance = (i5 == 32) | gapComposer.changedInstance(dependentControlsToggleViewModel);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy2) {
                    rememberedValue3 = new DependentControlViewKt$$ExternalSyntheticLambda8(function13, dependentControlsToggleViewModel, 0);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                i2 = i5;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(null, rememberComposableLambda, null, (Function0) rememberedValue3, false, false, Expect_jvmKt.rememberComposableLambda(-1707978024, new DependentControlViewKt$$ExternalSyntheticLambda7(dependentControlsToggleViewModel, 5), gapComposer), null, toggle, 0L, gapComposer, 12582966, 3444);
                gapComposer = gapComposer;
                P2PControlListViewModel p2PControlListViewModel3 = managedAccount.cashSpendLimitViewModel;
                if (p2PControlListViewModel3 == null) {
                    gapComposer.startReplaceGroup(2134655063);
                    gapComposer.end(false);
                    function12 = function1;
                    neverEqualPolicy = neverEqualPolicy2;
                } else {
                    gapComposer.startReplaceGroup(2134655064);
                    boolean z3 = i2 == 32;
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    neverEqualPolicy = neverEqualPolicy2;
                    if (z3 || rememberedValue4 == neverEqualPolicy) {
                        function12 = function1;
                        rememberedValue4 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(4, function12);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    } else {
                        function12 = function1;
                    }
                    P2PControlRow(p2PControlListViewModel3, (Function0) rememberedValue4, gapComposer, 0);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            String str2 = managedAccount.footerText;
            gapComposer.startReplaceGroup(2134904707);
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(wrapContentHeight, 16.0f, 32.0f);
            TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
            long j = Strings.getColors(gapComposer).semantic.text.subtle;
            MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(new SpanStyle(Strings.getColors(gapComposer).semantic.text.subtle, 0L, Strings.getTypography(gapComposer).bodyXSmall.spanStyle.fontWeight, Strings.getTypography(gapComposer).bodyXSmall.spanStyle.fontStyle, (FontSynthesis) null, Strings.getTypography(gapComposer).bodyXSmall.spanStyle.fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61394), 2);
            boolean z4 = i2 == 32;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (z4 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new SsnViewKt$$ExternalSyntheticLambda12(27, function12);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Function2 function2 = (Function2) rememberedValue5;
            GapComposer gapComposer2 = gapComposer;
            function13 = function1;
            LazyDslKt.m304MarkdownTextpCuZGqc(str2, function2, m299paddingVpY3zN4, textStyle, j, markdownSpanValues, null, null, 0, 0, 3, gapComposer2, 0, 960);
            gapComposer = gapComposer2;
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(managedAccount, function13, i, 5);
        }
    }

    public static final void DependentControlToggleContent(DependentControlViewModel.Toggle toggle, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2078583482);
        int i2 = (gapComposer.changedInstance(toggle) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            function12 = function1;
            ToggleSection(toggle.toggleViewModel, toggle.controlType, toggle.tagDeviceId, function12, gapComposer, (i2 << 6) & 7168);
            DependentControlsLimitsViewModel dependentControlsLimitsViewModel = toggle.limitsViewModel;
            if (dependentControlsLimitsViewModel == null) {
                gapComposer.startReplaceGroup(1293642909);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1293642910);
                LimitSection(dependentControlsLimitsViewModel, toggle.controlType, function12, gapComposer, (i2 << 3) & 896);
                gapComposer.end(false);
            }
            String str = toggle.footerText;
            if (str == null) {
                gapComposer.startReplaceGroup(1293770846);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1293770847);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                FooterSection(str, function12, gapComposer, i2 & 112);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(toggle, function12, i, 8);
        }
    }

    public static final void DependentControlView(final DependentControlViewModel dependentControlViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1005967782);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(dependentControlViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (dependentControlViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2() { // from class: com.squareup.cash.family.familyhub.views.DependentControlViewKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    AllowanceViewKt.DependentControlView(dependentControlViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    AllowanceViewKt.DependentControlView(dependentControlViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1287439963, new AllowanceViewKt$$ExternalSyntheticLambda0(function1, dependentControlViewModel), gapComposer), gapComposer, 3072, 7);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2() { // from class: com.squareup.cash.family.familyhub.views.DependentControlViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            AllowanceViewKt.DependentControlView(dependentControlViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            AllowanceViewKt.DependentControlView(dependentControlViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void DependentControlsAndLimits(DependentControlsAndLimitsViewModel dependentControlsAndLimitsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1258228562);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(dependentControlsAndLimitsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1294170749, new AllowanceViewKt$$ExternalSyntheticLambda0(dependentControlsAndLimitsViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) dependentControlsAndLimitsViewModel, function1, (Object) modifier2, i, 16);
        }
    }

    public static final void DependentDetailBalanceHeader(int i, Composer composer, Modifier modifier, DependentDetailViewModel dependentDetailViewModel, Function1 function1) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(230006309);
        int i2 = (gapComposer.changed(dependentDetailViewModel) ? 4 : 2) | i | 48 | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1909211248, new AllowanceViewKt$$ExternalSyntheticLambda0(dependentDetailViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DependentDetailViewKt$$ExternalSyntheticLambda3(dependentDetailViewModel, modifier, function1, i);
        }
    }

    public static final void DependentDetailIntroductionDialogScreen(RealImageLoader realImageLoader, DependentDetailIntroductionViewModel dependentDetailIntroductionViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(249871131);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(dependentDetailIntroductionViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(322985200, new EarningsHomeKt$$ExternalSyntheticLambda2(realImageLoader, dependentDetailIntroductionViewModel, function1, 21), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(realImageLoader, dependentDetailIntroductionViewModel, function1, i, 17);
        }
    }

    public static final void DependentDetailLoadingState(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2075493325);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            VisibleKt.ShimmerBox(null, false, null, f409lambda$1813827076, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i, 9);
        }
    }

    public static final void DependentDetailSettingsSection(DependentAccessControlsViewModel dependentAccessControlsViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(49218727);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(dependentAccessControlsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1759459964, new AllowanceViewKt$$ExternalSyntheticLambda0(19, dependentAccessControlsViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(dependentAccessControlsViewModel, function1, i, 29);
        }
    }

    public static final void DependentDetailToolbar(DependentDetailToolbarModel dependentDetailToolbarModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1813937298);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(dependentDetailToolbarModel) : gapComposer.changedInstance(dependentDetailToolbarModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-495932515, new AllowanceViewKt$$ExternalSyntheticLambda0(20, dependentDetailToolbarModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(dependentDetailToolbarModel, function1, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DependentDetailsBalanceItem(DependentBalancesViewModel.BalanceStatModel balanceStatModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Icons icons;
        String str;
        boolean z;
        Object rememberedValue;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1985565300);
        int i2 = 4;
        int i3 = 16;
        int i4 = (gapComposer2.changed(balanceStatModel) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            int i5 = i4 & 14;
            String str2 = balanceStatModel.balanceName;
            int hashCode = str2.hashCode();
            ComposableLambdaImpl composableLambdaImpl = null;
            if (hashCode == -1808213955) {
                if (str2.equals("Stocks")) {
                    icons = Icons.Investing24;
                    str = balanceStatModel.body;
                    if (str != null) {
                    }
                    gapComposer2.end(false);
                    CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(balanceStatModel.balance, 0);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-450530774, new InfoSectionKt$$ExternalSyntheticLambda6(icons, i3), gapComposer2);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-865857591, new ArcadeModal$$ExternalSyntheticLambda5(balanceStatModel, 11), gapComposer2);
                    z = ((i4 & 112) != 32) | (i5 == 4);
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(29, function1, balanceStatModel);
                    gapComposer2.updateRememberedValue(rememberedValue);
                    gapComposer = gapComposer2;
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, null, false, true, composableLambdaImpl, null, label, 0L, null, gapComposer, 1572918, 0, 3380);
                }
                icons = null;
                str = balanceStatModel.body;
                if (str != null) {
                }
                gapComposer2.end(false);
                CellDefaultAccessory.Label label2 = new CellDefaultAccessory.Label(balanceStatModel.balance, 0);
                ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-450530774, new InfoSectionKt$$ExternalSyntheticLambda6(icons, i3), gapComposer2);
                ComposableLambdaImpl rememberComposableLambda22 = Expect_jvmKt.rememberComposableLambda(-865857591, new ArcadeModal$$ExternalSyntheticLambda5(balanceStatModel, 11), gapComposer2);
                z = ((i4 & 112) != 32) | (i5 == 4);
                rememberedValue = gapComposer2.rememberedValue();
                if (!z) {
                }
                rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(29, function1, balanceStatModel);
                gapComposer2.updateRememberedValue(rememberedValue);
                gapComposer = gapComposer2;
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda3, rememberComposableLambda22, null, (Function0) rememberedValue, null, false, true, composableLambdaImpl, null, label2, 0L, null, gapComposer, 1572918, 0, 3380);
            } else if (hashCode != -757365607) {
                if (hashCode == 1561949438 && str2.equals("Bitcoin")) {
                    icons = Icons.CurrencyBtc24;
                    str = balanceStatModel.body;
                    if (str != null) {
                        gapComposer2.startReplaceGroup(-1685561510);
                    } else {
                        gapComposer2.startReplaceGroup(-1685561509);
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(690357768, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, i2), gapComposer2);
                    }
                    gapComposer2.end(false);
                    CellDefaultAccessory.Label label22 = new CellDefaultAccessory.Label(balanceStatModel.balance, 0);
                    ComposableLambdaImpl rememberComposableLambda32 = Expect_jvmKt.rememberComposableLambda(-450530774, new InfoSectionKt$$ExternalSyntheticLambda6(icons, i3), gapComposer2);
                    ComposableLambdaImpl rememberComposableLambda222 = Expect_jvmKt.rememberComposableLambda(-865857591, new ArcadeModal$$ExternalSyntheticLambda5(balanceStatModel, 11), gapComposer2);
                    z = ((i4 & 112) != 32) | (i5 == 4);
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!z || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(29, function1, balanceStatModel);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    gapComposer = gapComposer2;
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda32, rememberComposableLambda222, null, (Function0) rememberedValue, null, false, true, composableLambdaImpl, null, label22, 0L, null, gapComposer, 1572918, 0, 3380);
                }
                icons = null;
                str = balanceStatModel.body;
                if (str != null) {
                }
                gapComposer2.end(false);
                CellDefaultAccessory.Label label222 = new CellDefaultAccessory.Label(balanceStatModel.balance, 0);
                ComposableLambdaImpl rememberComposableLambda322 = Expect_jvmKt.rememberComposableLambda(-450530774, new InfoSectionKt$$ExternalSyntheticLambda6(icons, i3), gapComposer2);
                ComposableLambdaImpl rememberComposableLambda2222 = Expect_jvmKt.rememberComposableLambda(-865857591, new ArcadeModal$$ExternalSyntheticLambda5(balanceStatModel, 11), gapComposer2);
                z = ((i4 & 112) != 32) | (i5 == 4);
                rememberedValue = gapComposer2.rememberedValue();
                if (!z) {
                }
                rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(29, function1, balanceStatModel);
                gapComposer2.updateRememberedValue(rememberedValue);
                gapComposer = gapComposer2;
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda322, rememberComposableLambda2222, null, (Function0) rememberedValue, null, false, true, composableLambdaImpl, null, label222, 0L, null, gapComposer, 1572918, 0, 3380);
            } else {
                if (str2.equals("Savings")) {
                    icons = Icons.Savings24;
                    str = balanceStatModel.body;
                    if (str != null) {
                    }
                    gapComposer2.end(false);
                    CellDefaultAccessory.Label label2222 = new CellDefaultAccessory.Label(balanceStatModel.balance, 0);
                    ComposableLambdaImpl rememberComposableLambda3222 = Expect_jvmKt.rememberComposableLambda(-450530774, new InfoSectionKt$$ExternalSyntheticLambda6(icons, i3), gapComposer2);
                    ComposableLambdaImpl rememberComposableLambda22222 = Expect_jvmKt.rememberComposableLambda(-865857591, new ArcadeModal$$ExternalSyntheticLambda5(balanceStatModel, 11), gapComposer2);
                    z = ((i4 & 112) != 32) | (i5 == 4);
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(29, function1, balanceStatModel);
                    gapComposer2.updateRememberedValue(rememberedValue);
                    gapComposer = gapComposer2;
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda3222, rememberComposableLambda22222, null, (Function0) rememberedValue, null, false, true, composableLambdaImpl, null, label2222, 0L, null, gapComposer, 1572918, 0, 3380);
                }
                icons = null;
                str = balanceStatModel.body;
                if (str != null) {
                }
                gapComposer2.end(false);
                CellDefaultAccessory.Label label22222 = new CellDefaultAccessory.Label(balanceStatModel.balance, 0);
                ComposableLambdaImpl rememberComposableLambda32222 = Expect_jvmKt.rememberComposableLambda(-450530774, new InfoSectionKt$$ExternalSyntheticLambda6(icons, i3), gapComposer2);
                ComposableLambdaImpl rememberComposableLambda222222 = Expect_jvmKt.rememberComposableLambda(-865857591, new ArcadeModal$$ExternalSyntheticLambda5(balanceStatModel, 11), gapComposer2);
                z = ((i4 & 112) != 32) | (i5 == 4);
                rememberedValue = gapComposer2.rememberedValue();
                if (!z) {
                }
                rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(29, function1, balanceStatModel);
                gapComposer2.updateRememberedValue(rememberedValue);
                gapComposer = gapComposer2;
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda32222, rememberComposableLambda222222, null, (Function0) rememberedValue, null, false, true, composableLambdaImpl, null, label22222, 0L, null, gapComposer, 1572918, 0, 3380);
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(balanceStatModel, function1, i, 17);
        }
    }

    public static final void DependentDetailsBalanceSection(Modifier modifier, DependentBalancesViewModel dependentBalancesViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(343677470);
        int i2 = i | 6 | (gapComposer.changed(dependentBalancesViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1086968141, new AllowanceViewKt$$ExternalSyntheticLambda0(dependentBalancesViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2((Object) modifier2, (Object) dependentBalancesViewModel, function1, i, 20);
        }
    }

    public static final void DisablingConfirmationDialog(ControlDisablingConfirmationViewModel controlDisablingConfirmationViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1863184753);
        int i2 = (gapComposer.changedInstance(controlDisablingConfirmationViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = i2 | (gapComposer.changed(companion) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (controlDisablingConfirmationViewModel == null) {
            gapComposer.startReplaceGroup(-2020099828);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-2020099827);
            AnimatedContentKt.AnimatedVisibility(true, (Modifier) companion, (EnterTransitionImpl) null, (ExitTransitionImpl) null, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(56533195, new ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda2(controlDisablingConfirmationViewModel, function1), gapComposer), (Composer) gapComposer, ((i3 >> 3) & 112) | 196614, 28);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda0(i, controlDisablingConfirmationViewModel, function1);
        }
    }

    /* renamed from: EntranceAnimation-6blBNOA, reason: not valid java name */
    public static final void m3532EntranceAnimation6blBNOA(final float f, final float f2, final WalletMetrics walletMetrics, final Animatable animatable, final Animatable animatable2, final Animatable animatable3, final Animatable animatable4, final Animatable animatable5, final Animatable animatable6, final Function0 function0, final Function0 function02, Composer composer, final int i) {
        Dp dp;
        Dp dp2;
        Boolean bool;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(414374315);
        int i2 = i | (gapComposer.changed(true) ? 4 : 2) | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changed(f2) ? 256 : 128) | (gapComposer.changed(walletMetrics) ? 2048 : 1024) | (gapComposer.changedInstance(animatable) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(animatable2) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(animatable3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changedInstance(animatable4) ? 8388608 : 4194304) | (gapComposer.changedInstance(animatable5) ? 67108864 : 33554432) | (gapComposer.changedInstance(animatable6) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer.shouldExecute(i2 & 1, (306783379 & i2) != 306783378)) {
            Boolean bool2 = Boolean.TRUE;
            Dp dp3 = new Dp(f);
            Dp dp4 = new Dp(f2);
            boolean z = ((i2 & 14) == 4) | ((57344 & i2) == 16384 || gapComposer.changedInstance(animatable)) | ((458752 & i2) == 131072 || gapComposer.changedInstance(animatable2)) | ((3670016 & i2) == 1048576 || gapComposer.changedInstance(animatable3)) | ((i2 & 7168) == 2048) | ((29360128 & i2) == 8388608 || gapComposer.changedInstance(animatable4)) | ((234881024 & i2) == 67108864 || gapComposer.changedInstance(animatable5)) | ((i2 & 1879048192) == 536870912 || gapComposer.changedInstance(animatable6));
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                dp = dp4;
                dp2 = dp3;
                bool = bool2;
                SessionWorkerKt$runSession$4$1 sessionWorkerKt$runSession$4$1 = new SessionWorkerKt$runSession$4$1(function02, animatable, animatable2, animatable3, walletMetrics, animatable4, animatable5, animatable6, function0, (Continuation) null, 5);
                gapComposer.updateRememberedValue(sessionWorkerKt$runSession$4$1);
                rememberedValue = sessionWorkerKt$runSession$4$1;
            } else {
                dp = dp4;
                dp2 = dp3;
                bool = bool2;
            }
            Updater.LaunchedEffect(bool, dp2, dp, (Function2) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(f, f2, walletMetrics, animatable, animatable2, animatable3, animatable4, animatable5, animatable6, function0, function02, i) { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda11
                public final /* synthetic */ float f$1;
                public final /* synthetic */ Function0 f$10;
                public final /* synthetic */ Function0 f$11;
                public final /* synthetic */ float f$2;
                public final /* synthetic */ WalletMetrics f$3;
                public final /* synthetic */ Animatable f$4;
                public final /* synthetic */ Animatable f$5;
                public final /* synthetic */ Animatable f$6;
                public final /* synthetic */ Animatable f$7;
                public final /* synthetic */ Animatable f$8;
                public final /* synthetic */ Animatable f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1227128833);
                    AllowanceViewKt.m3532EntranceAnimation6blBNOA(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void FamilyHomeListItem(FamilyListItem familyListItem, Function1 function1, Composer composer, int i) {
        familyListItem.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(785759808);
        int i2 = (gapComposer.changedInstance(familyListItem) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (familyListItem instanceof FamilyListItem.Loaded) {
            gapComposer.startReplaceGroup(-799064184);
            LoadedFamilyHomeListItem((FamilyListItem.Loaded) familyListItem, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else {
            if (!(familyListItem instanceof FamilyListItem.Loading)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -799065575, false);
            }
            gapComposer.startReplaceGroup(-799061797);
            LoadingFamilyHomeListItem(gapComposer, 0);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(familyListItem, function1, i, 24);
        }
    }

    public static final void FamilyHomeListSection(FamilyListSection familyListSection, Function1 function1, Composer composer, int i) {
        familyListSection.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1376582998);
        int i2 = (gapComposer.changedInstance(familyListSection) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            FamilyHomeSectionHeader(familyListSection.headerText, true, gapComposer, 432, 8);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(80493789);
            for (FamilyListGroup familyListGroup : familyListSection.groups) {
                gapComposer.startReplaceGroup(80495300);
                List list = familyListGroup.items;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    FamilyHomeListItem((FamilyListItem) it.next(), function1, gapComposer, i2 & 112);
                    arrayList.add(Unit.INSTANCE);
                }
                gapComposer.end(false);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(familyListSection, function1, i, 23);
        }
    }

    public static final void FamilyHomePendingInviteSection(FamilyPendingInvitesViewModel familyPendingInvitesViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(757222313);
        int i2 = (gapComposer.changedInstance(familyPendingInvitesViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (familyPendingInvitesViewModel.isVisible) {
            gapComposer.startReplaceGroup(1241858090);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            FamilyHomeSectionHeader(familyPendingInvitesViewModel.sectionTitle, false, gapComposer, 48, 12);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(1888434587);
            for (FamilyPendingRequestRowModel familyPendingRequestRowModel : familyPendingInvitesViewModel.rows) {
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1);
                boolean changedInstance = gapComposer.changedInstance(familyPendingRequestRowModel) | ((i2 & 112) == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda17(familyPendingRequestRowModel, function1, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                FamilyPendingRequestRow(familyPendingRequestRowModel, m300paddingVpY3zN4$default, (Function0) rememberedValue, gapComposer, 0, 0);
            }
            gapComposer.end(false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.end(true);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1242672057);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(familyPendingInvitesViewModel, function1, i, 22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FamilyHomeSectionHeader(String str, boolean z, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1847508091);
        Applier applier = gapComposer.applier;
        int i4 = (gapComposer.changed(str) ? 4 : 2) | i;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i4 |= gapComposer.changed(z2) ? 256 : 128;
            i3 = i4 | 3072;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                boolean z4 = i5 != 0 ? false : z2;
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 48);
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
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Room.m1165Text25TpFw(0, 0, 0, 0, i3 & 14, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, true), Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.startReplaceGroup(-1158482848);
                gapComposer.end(false);
                gapComposer.end(true);
                z3 = z4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ChromeConfigKt$$ExternalSyntheticLambda5(str, z3, i, i2, 1);
                return;
            }
            return;
        }
        z2 = z;
        i3 = i4 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    public static final void FamilyMemberAccountType(String str, Composer composer, int i) {
        ?? r14;
        boolean z;
        Unit unit;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-567635017);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            if (str == null) {
                gapComposer.startReplaceGroup(-1128466680);
                gapComposer.end(false);
                unit = null;
                z = false;
            } else {
                gapComposer.startReplaceGroup(-1128466679);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3986, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                z = false;
                gapComposer.end(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                gapComposer.startReplaceGroup(-36395983);
                m3533LoadingText8Feqmps(96.0f, gapComposer, 6);
            } else {
                gapComposer.startReplaceGroup(-36402648);
            }
            gapComposer.end(z);
            r14 = z;
        } else {
            r14 = 0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, i, r14);
        }
    }

    public static final void FamilyMemberBalance(String str, Composer composer, int i) {
        int i2;
        boolean z;
        Unit unit;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1130649218);
        int i3 = i | (gapComposer.changed(str) ? 4 : 2);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (str == null) {
                gapComposer.startReplaceGroup(2037387833);
                gapComposer.end(false);
                unit = null;
                z = false;
            } else {
                gapComposer.startReplaceGroup(2037387834);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(2, 1, 0, 6, 1769472, 0, 3730, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                z = false;
                gapComposer.end(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                gapComposer.startReplaceGroup(-72817860);
                i2 = 6;
                m3533LoadingText8Feqmps(91.0f, gapComposer, 6);
            } else {
                i2 = 6;
                gapComposer.startReplaceGroup(-72825517);
            }
            gapComposer.end(z);
        } else {
            i2 = 6;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FamilyMemberCard(FamilyMemberRowViewModel familyMemberRowViewModel, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Modifier wrapContentHeight;
        Function0 function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-73339589);
        int i4 = 4;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(familyMemberRowViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier4, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                FamilyHomeViewEvent familyHomeViewEvent = familyMemberRowViewModel.onClickEvent;
                if (familyHomeViewEvent == null) {
                    gapComposer.startReplaceGroup(1278894575);
                    gapComposer.end(false);
                    function0 = null;
                } else {
                    gapComposer.startReplaceGroup(1278894576);
                    boolean changedInstance = gapComposer.changedInstance(familyHomeViewEvent) | ((i3 & 112) == 32);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new GLSceneScope$$ExternalSyntheticLambda4(i4, function1, familyHomeViewEvent);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    function0 = (Function0) rememberedValue;
                    gapComposer.end(false);
                }
                MoneybotTheme.m3623Cardjb40ds(wrapContentHeight, false, 0L, RecyclerView.DECELERATION_RATE, function0, null, Expect_jvmKt.rememberComposableLambda(-1256302783, new ArcadeModal$$ExternalSyntheticLambda3(familyMemberRowViewModel, 15), gapComposer), gapComposer, 1572864, 46);
                modifier3 = modifier4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(familyMemberRowViewModel, function1, modifier3, i, i2, 29);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void FamilyMemberFullName(String str, Composer composer, int i) {
        boolean z;
        Unit unit;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1221011212);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            if (str == null) {
                gapComposer.startReplaceGroup(1067050512);
                gapComposer.end(false);
                unit = null;
                z = false;
            } else {
                gapComposer.startReplaceGroup(1067050513);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3986, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                z = false;
                gapComposer.end(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                gapComposer.startReplaceGroup(865711239);
                m3533LoadingText8Feqmps(128.0f, gapComposer, 6);
            } else {
                gapComposer.startReplaceGroup(865704698);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, i, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.Companion.Empty) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FamilyMemberRow(FamilyMemberRowViewModel familyMemberRowViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        Modifier.Companion companion;
        Object obj;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-815868115);
        int i2 = i | (gapComposer2.changedInstance(familyMemberRowViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = familyMemberRowViewModel.shouldAnimateHighlightEntry;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer2.startReplaceGroup(-306893265);
                boolean changed = gapComposer2.changed(familyMemberRowViewModel.customerToken);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (!changed) {
                    obj = rememberedValue;
                }
                MutableTransitionState mutableTransitionState = new MutableTransitionState(Boolean.FALSE);
                mutableTransitionState.setTargetState(Boolean.TRUE);
                gapComposer2.updateRememberedValue(mutableTransitionState);
                obj = mutableTransitionState;
                MutableTransitionState mutableTransitionState2 = (MutableTransitionState) obj;
                EnterTransitionImpl plus = EnterExitTransitionKt.expandVertically$default(AnimatableKt.tween$default(280, 0, null, 6), 12).plus(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(200, 0, null, 6), 2)).plus(EnterExitTransitionKt.m147scaleInL8ZKhE$default(AnimatableKt.tween$default(280, 0, null, 6), 0.05f, 4));
                ExitTransitionImpl exitTransitionImpl = ExitTransitionImpl.None;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(753490656, new ArcadeModal2Kt$$ExternalSyntheticLambda0(15, familyMemberRowViewModel, function1), gapComposer2);
                gapComposer = gapComposer2;
                companion = companion2;
                AnimatedContentKt.AnimatedVisibility(mutableTransitionState2, companion, plus, exitTransitionImpl, (String) null, rememberComposableLambda, gapComposer, 196656, 16);
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                gapComposer.startReplaceGroup(-306325500);
                FamilyMemberCard(familyMemberRowViewModel, function1, companion2, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
                companion = companion2;
                gapComposer.end(false);
            }
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2(modifier2, (Object) familyMemberRowViewModel, function1, i, 27);
        }
    }

    public static final void FamilyMultiplePendingRequestsRow(final FamilyMultiplePendingRequestsRowModel familyMultiplePendingRequestsRowModel, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer;
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2106003339);
        int i2 = i | (gapComposer2.changedInstance(familyMultiplePendingRequestsRowModel) ? 4 : 2) | (gapComposer2.changedInstance(function0) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Icons icons = Icons.NotificationsFill24;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, colors.semantic.background.subtle, Expect_jvmKt.rememberComposableLambda(650381296, new Function2() { // from class: com.squareup.cash.family.familyhub.views.FamilyMultiplePendingRequestsRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    FamilyMultiplePendingRequestsRowModel familyMultiplePendingRequestsRowModel2 = familyMultiplePendingRequestsRowModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                String str = familyMultiplePendingRequestsRowModel2.title;
                                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                                int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, Modifier.Companion.$$INSTANCE);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                Unit unit = null;
                                if (gapComposer4.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer4.startReusableNode();
                                if (gapComposer4.inserting) {
                                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer4.useNode();
                                }
                                Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                String str2 = familyMultiplePendingRequestsRowModel2.subtitle;
                                if (str2 == null) {
                                    gapComposer4.startReplaceGroup(-2050378364);
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.startReplaceGroup(-2050378363);
                                    TextStyle textStyle2 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                    Colors colors3 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                    if (colors3 == null) {
                                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, colors3.semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    gapComposer4.end(false);
                                    unit = Unit.INSTANCE;
                                }
                                if (unit == null) {
                                    gapComposer4.startReplaceGroup(-1590155329);
                                    AllowanceViewKt.LoadingSubtitle(gapComposer4, 0);
                                } else {
                                    gapComposer4.startReplaceGroup(-1590162366);
                                }
                                gapComposer4.end(false);
                                gapComposer4.end(true);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer2), null, 0L, function0, null, false, false, Expect_jvmKt.rememberComposableLambda(-234238140, new Function2() { // from class: com.squareup.cash.family.familyhub.views.FamilyMultiplePendingRequestsRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    FamilyMultiplePendingRequestsRowModel familyMultiplePendingRequestsRowModel2 = familyMultiplePendingRequestsRowModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                String str = familyMultiplePendingRequestsRowModel2.title;
                                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                                int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, Modifier.Companion.$$INSTANCE);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                Unit unit = null;
                                if (gapComposer4.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer4.startReusableNode();
                                if (gapComposer4.inserting) {
                                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer4.useNode();
                                }
                                Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                String str2 = familyMultiplePendingRequestsRowModel2.subtitle;
                                if (str2 == null) {
                                    gapComposer4.startReplaceGroup(-2050378364);
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.startReplaceGroup(-2050378363);
                                    TextStyle textStyle2 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                    Colors colors3 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                    if (colors3 == null) {
                                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, colors3.semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    gapComposer4.end(false);
                                    unit = Unit.INSTANCE;
                                }
                                if (unit == null) {
                                    gapComposer4.startReplaceGroup(-1590155329);
                                    AllowanceViewKt.LoadingSubtitle(gapComposer4, 0);
                                } else {
                                    gapComposer4.startReplaceGroup(-1590162366);
                                }
                                gapComposer4.end(false);
                                gapComposer4.end(true);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer2), null, CellDefaultAccessory.Push.INSTANCE, 0L, null, gapComposer, ((i2 << 15) & 3670016) | 3126, 390, 27568);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(familyMultiplePendingRequestsRowModel, function0, i, 27);
        }
    }

    public static final void FamilyPendingRequestRow(FamilyPendingRequestRowModel familyPendingRequestRowModel, Modifier modifier, Function0 function0, Composer composer, int i, int i2) {
        Modifier wrapContentHeight;
        familyPendingRequestRowModel.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1095868733);
        int i3 = (gapComposer.changedInstance(familyPendingRequestRowModel) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i5 = i3 | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(wrapContentHeight, colors.component.cell.background.f171default, ColorKt.RectangleShape);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (familyPendingRequestRowModel instanceof FamilyPendingRequestRowModel.Loaded) {
                gapComposer.startReplaceGroup(937572693);
                FamilyPendingRequestRowContentLoaded((FamilyPendingRequestRowModel.Loaded) familyPendingRequestRowModel, function0, gapComposer, ((i5 >> 3) & 112) | (i5 & 14));
                gapComposer.end(false);
            } else if (familyPendingRequestRowModel instanceof FamilyPendingRequestRowModel.Activity) {
                gapComposer.startReplaceGroup(937693500);
                FamilyPendingRequestRowContentActivity((FamilyPendingRequestRowModel.Activity) familyPendingRequestRowModel, gapComposer, i5 & 14);
                gapComposer.end(false);
            } else {
                if (!familyPendingRequestRowModel.equals(FamilyPendingRequestRowModel.Loading.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 722979214, false);
                }
                gapComposer.startReplaceGroup(937803426);
                FamilyPendingRequestRowContentLoading(gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) familyPendingRequestRowModel, modifier2, (Object) function0, i, i2, 1);
        }
    }

    public static final void FamilyPendingRequestRowContentActivity(FamilyPendingRequestRowModel.Activity activity, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-647463914);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(activity) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            UiCallbackModel uiCallbackModel = activity.activityItemUiCallbackModel;
            ActivityItemViewKt.m2972ActivityItemViewww6aTOc((ActivityItemViewModel) uiCallbackModel.model, uiCallbackModel.onEvent, new LayoutWeightElement(1.0f, true), 0L, gapComposer, 0, 8);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(activity, i, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static final void FamilyPendingRequestRowContentLoaded(final FamilyPendingRequestRowModel.Loaded loaded, Function0 function0, Composer composer, int i) {
        int i2;
        int i3;
        GapComposer gapComposer;
        ?? r8;
        Modifier.Companion companion;
        final boolean z;
        float f;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-96902174);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2;
        final int i5 = 0;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion2, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Unit unit = null;
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(loaded.avatar, null, new Function3() { // from class: com.squareup.cash.family.familyhub.views.FamilyPendingRequestRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String m;
                    int i6 = i5;
                    FamilyPendingRequestRowModel.Loaded loaded2 = loaded;
                    switch (i6) {
                        case 0:
                            PainterRequest painterRequest = (PainterRequest) obj;
                            int intValue = ((Integer) obj3).intValue();
                            painterRequest.getClass();
                            GapComposer gapComposer3 = (GapComposer) ((Composer) obj2);
                            gapComposer3.startReplaceGroup(542959779);
                            Image image = loaded2.avatar.remoteImage;
                            if (image == null) {
                                gapComposer3.startReplaceGroup(468013265);
                                gapComposer3.end(false);
                                m = null;
                            } else {
                                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer3, 2093307184, image, gapComposer3, false);
                            }
                            AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, m, gapComposer3, intValue & 14, 0);
                            gapComposer3.end(false);
                            return rememberAsyncImagePainter;
                        default:
                            Composer composer2 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((RowScope) obj).getClass();
                            GapComposer gapComposer4 = (GapComposer) composer2;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                String str = loaded2.buttonText;
                                TextStyle textStyle = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).buttonCompact;
                                Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                } else {
                                    gapComposer4.startReplaceGroup(-1762997739);
                                    gapComposer4.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.component.button.standard.text.f165default, (Composer) gapComposer4, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer2, 8, 1), null, false, gapComposer2, 6, 28);
            Strings.getSizes(gapComposer2).getClass();
            SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion2, 16.0f));
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, layoutWeightElement);
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
            String str = loaded.title;
            if (str == null) {
                gapComposer2.startReplaceGroup(-974270440);
                gapComposer2.end(false);
                z = 1;
                r8 = 0;
                companion = companion2;
                f = 16.0f;
            } else {
                gapComposer2.startReplaceGroup(-974270439);
                r8 = 0;
                companion = companion2;
                z = 1;
                f = 16.0f;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer2.end(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                gapComposer2.startReplaceGroup(-308517238);
                LoadingTitle(gapComposer2, r8);
            } else {
                gapComposer2.startReplaceGroup(-308523128);
            }
            gapComposer2.end(r8);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, loaded.subtitle, (Map) null, (Function1) null, false);
            gapComposer2.end(z);
            Strings.getSizes(gapComposer2).getClass();
            SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, f));
            i3 = 4;
            coil3.size.SizeKt.ButtonCompact(function0, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1139462082, new Function3() { // from class: com.squareup.cash.family.familyhub.views.FamilyPendingRequestRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String m;
                    int i6 = z;
                    FamilyPendingRequestRowModel.Loaded loaded2 = loaded;
                    switch (i6) {
                        case 0:
                            PainterRequest painterRequest = (PainterRequest) obj;
                            int intValue = ((Integer) obj3).intValue();
                            painterRequest.getClass();
                            GapComposer gapComposer3 = (GapComposer) ((Composer) obj2);
                            gapComposer3.startReplaceGroup(542959779);
                            Image image = loaded2.avatar.remoteImage;
                            if (image == null) {
                                gapComposer3.startReplaceGroup(468013265);
                                gapComposer3.end(false);
                                m = null;
                            } else {
                                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer3, 2093307184, image, gapComposer3, false);
                            }
                            AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, m, gapComposer3, intValue & 14, 0);
                            gapComposer3.end(false);
                            return rememberAsyncImagePainter;
                        default:
                            Composer composer2 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((RowScope) obj).getClass();
                            GapComposer gapComposer4 = (GapComposer) composer2;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                String str2 = loaded2.buttonText;
                                TextStyle textStyle = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).buttonCompact;
                                Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                } else {
                                    gapComposer4.startReplaceGroup(-1762997739);
                                    gapComposer4.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.component.button.standard.text.f165default, (Composer) gapComposer4, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer2), gapComposer2, ((i4 >> 3) & 14) | 1572864, 62);
            GapComposer gapComposer3 = gapComposer2;
            gapComposer3.end(z);
            gapComposer = gapComposer3;
        } else {
            i3 = 4;
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(loaded, function0, i, i3);
        }
    }

    public static final void FamilyPendingRequestRowContentLoading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-791660532);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            AvatarSize avatarSize = AvatarSize.Size48;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            TextViewKt.Avatar(avatarSize, new AvatarEntry("", colors.semantic.background.subtle, null, null, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE), null, false, gapComposer, 6, 28);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            LoadingTitleAndSubtitle(new LayoutWeightElement(1.0f, true), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i, 13);
        }
    }

    public static final void FooterComponent(DependentControlsAndLimitsFooterViewModel dependentControlsAndLimitsFooterViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier wrapContentHeight;
        TextStyle textStyle;
        long j;
        boolean z = dependentControlsAndLimitsFooterViewModel.isAllowlistStyle;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-364661358);
        int i2 = (gapComposer2.changedInstance(dependentControlsAndLimitsFooterViewModel) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(wrapContentHeight, 16.0f, 12.0f);
            int i3 = z ? 3 : 5;
            String str = dependentControlsAndLimitsFooterViewModel.footerText;
            if (z) {
                gapComposer2.startReplaceGroup(1747769020);
                textStyle = Strings.getTypography(gapComposer2).linkXSmall;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(1747770460);
                textStyle = Strings.getTypography(gapComposer2).bodyXSmall;
                gapComposer2.end(false);
            }
            if (z) {
                gapComposer2.startReplaceGroup(1747773400);
                j = Strings.getColors(gapComposer2).semantic.text.subtle;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(1747775037);
                j = Strings.getColors(gapComposer2).semantic.text.placeholder;
                gapComposer2.end(false);
            }
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda12(29, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m299paddingVpY3zN4, textStyle, j, null, null, null, 0, 0, i3, gapComposer, 0, 992);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(dependentControlsAndLimitsFooterViewModel, function1, i, 12);
        }
    }

    public static final void FooterSection(String str, Function1 function1, Composer composer, int i) {
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(822871596);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(wrapContentHeight, 16.0f, 32.0f);
            TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
            long j = Strings.getColors(gapComposer).semantic.text.subtle;
            MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(new SpanStyle(Strings.getColors(gapComposer).semantic.text.subtle, 0L, Strings.getTypography(gapComposer).bodyXSmall.spanStyle.fontWeight, Strings.getTypography(gapComposer).bodyXSmall.spanStyle.fontStyle, (FontSynthesis) null, Strings.getTypography(gapComposer).bodyXSmall.spanStyle.fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61394), 2);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda12(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m299paddingVpY3zN4, textStyle, j, markdownSpanValues, null, null, 0, 0, 0, gapComposer, i2 & 14, 1984);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda6(str, function1, i, 8);
        }
    }

    public static final void LimitSection(final DependentControlsLimitsViewModel dependentControlsLimitsViewModel, ControlType controlType, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2100896823);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(dependentControlsLimitsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(controlType.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        final int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = dependentControlsLimitsViewModel.isLimitEditable;
            boolean z2 = dependentControlsLimitsViewModel.limitSubtitle == null;
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1370690711, new Function2() { // from class: com.squareup.cash.family.familyhub.views.DependentControlViewKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    long j;
                    int i4 = r2;
                    DependentControlsLimitsViewModel dependentControlsLimitsViewModel2 = dependentControlsLimitsViewModel;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
                                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, Modifier.Companion.$$INSTANCE);
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
                                Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                String str = dependentControlsLimitsViewModel2.limitTitle;
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4084, ((Color) gapComposer3.consume(staticProvidableCompositionLocal)).value, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, true), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                String str2 = dependentControlsLimitsViewModel2.currentLimit;
                                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                if (dependentControlsLimitsViewModel2.subtleRowValue) {
                                    gapComposer3.startReplaceGroup(-1856322352);
                                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    j = colors.semantic.text.subtle;
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1856248479);
                                    j = ((Color) gapComposer3.consume(staticProvidableCompositionLocal)).value;
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                gapComposer3.end(true);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str3 = dependentControlsLimitsViewModel2.limitSubtitle;
                                if (str3 == null) {
                                    gapComposer4.startReplaceGroup(699119234);
                                } else {
                                    gapComposer4.startReplaceGroup(699119235);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                }
                                gapComposer4.end(false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer2);
            int i4 = ((i2 & 896) == 256 ? 1 : 0) | ((i2 & 112) == 32 ? 1 : 0);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (i4 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(27, function1, controlType);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue, z, z2, Expect_jvmKt.rememberComposableLambda(-1312067345, new Function2() { // from class: com.squareup.cash.family.familyhub.views.DependentControlViewKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    long j;
                    int i42 = i3;
                    DependentControlsLimitsViewModel dependentControlsLimitsViewModel2 = dependentControlsLimitsViewModel;
                    switch (i42) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
                                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, Modifier.Companion.$$INSTANCE);
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
                                Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                String str = dependentControlsLimitsViewModel2.limitTitle;
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4084, ((Color) gapComposer3.consume(staticProvidableCompositionLocal)).value, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, true), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                String str2 = dependentControlsLimitsViewModel2.currentLimit;
                                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                if (dependentControlsLimitsViewModel2.subtleRowValue) {
                                    gapComposer3.startReplaceGroup(-1856322352);
                                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    j = colors.semantic.text.subtle;
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1856248479);
                                    j = ((Color) gapComposer3.consume(staticProvidableCompositionLocal)).value;
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                gapComposer3.end(true);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str3 = dependentControlsLimitsViewModel2.limitSubtitle;
                                if (str3 == null) {
                                    gapComposer4.startReplaceGroup(699119234);
                                } else {
                                    gapComposer4.startReplaceGroup(699119235);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                }
                                gapComposer4.end(false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer2), null, 0L, push, null, gapComposer, 806879238, 1418);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(dependentControlsLimitsViewModel, controlType, function1, i, 15);
        }
    }

    public static final void LoadedFamilyHomeListItem(FamilyListItem.Loaded loaded, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1338348085);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(loaded);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda4(i2, function1, loaded);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(fillMaxWidth, false, null, null, (Function0) rememberedValue, 15);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m183clickableoSLSa3U$default, 16.0f, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
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
            zzd zzdVar = Icons.Companion;
            String str = loaded.icon.arcade_id;
            str.getClass();
            zzdVar.getClass();
            Icons icons = zzd.get(str);
            if (icons == null) {
                gapComposer.startReplaceGroup(1729534979);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1729534980);
                Trace.m1191Iconww6aTOc(icons, (String) null, SizeKt.m285size3ABfNKs(companion, 24.0f), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 432, 0);
                Strings.getSizes(gapComposer).getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, true), Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, loaded.title, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 12.0f));
            Trace.m1191Iconww6aTOc(Icons.Push24, (String) null, SizeKt.m285size3ABfNKs(companion, 15.0f), Strings.getColors(gapComposer).component.cell.controls.icon.f174default, gapComposer, 438, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(loaded, function1, i, 25);
        }
    }

    public static final void Loading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-140751589);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            AnimatedContentKt.AnimatedVisibility(true, (Modifier) null, EnterExitTransitionKt.fadeIn(0.2f, AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, null, 6)), ExitTransitionImpl.None, (String) null, (Function3) f411lambda$1921921037, (Composer) gapComposer, 196614, 18);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i, 11);
        }
    }

    public static final void LoadingFamilyHomeListItem(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1934113794);
        int i2 = 0;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f), 20.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            AvatarSize avatarSize = AvatarSize.Size32;
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            AvatarsKt.HorizontalStackedAvatars(avatarSize, new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(new ColorModel.Accented(ColorsKt.toColor(ColorKt.m694toArgb8_81llA(colors2.semantic.background.subtle))), ' ', null, null, null, null, null, null, false, false, null, false, null, null, 131068)), null, null, gapComposer, 70, 28);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 13.0f));
            VisibleKt.ShimmerBox(null, false, Alignment.Companion.CenterStart, lambda$1800636183, gapComposer, 3456, 3);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i, i2);
        }
    }

    public static final void LoadingShimmer(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1637712877);
        int i2 = 0;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.subtle;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(30439262, new TaxToolTipViewKt$$ExternalSyntheticLambda3(j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f), density), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda3(i, i2);
        }
    }

    public static final void LoadingSubtitle(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1418955100);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            VisibleKt.ShimmerBox(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 8.0f, 1), false, Alignment.Companion.CenterStart, f405lambda$13875307, gapComposer, 3456, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i, 12);
        }
    }

    /* renamed from: LoadingText-8Feqmps, reason: not valid java name */
    public static final void m3533LoadingText8Feqmps(float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1018405490);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            VisibleKt.ShimmerBox(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 4.0f, 1), false, Alignment.Companion.CenterStart, Expect_jvmKt.rememberComposableLambda(-1562436319, new PoolDetailsViewKt$$ExternalSyntheticLambda28(f, 4), gapComposer), gapComposer, 3456, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TrackRowKt$$ExternalSyntheticLambda0(f, i, 5);
        }
    }

    public static final void LoadingTitle(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1663171211);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            VisibleKt.ShimmerBox(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Room.getSp(6)), 1), false, Alignment.Companion.CenterStart, lambda$1386412006, gapComposer, 3456, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i, 14);
        }
    }

    public static final void LoadingTitleAndSubtitle(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1312997007);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            VisibleKt.ShimmerBox(SpacerKt.m300paddingVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Room.getSp(5)), 1), false, Alignment.Companion.CenterStart, lambda$948875104, gapComposer, 3456, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 17);
        }
    }

    public static final void NoAllowanceInDependentDetailView(final AllowanceViewModel.NoAllowanceInDependentDetail noAllowanceInDependentDetail, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1695111366);
        final int i2 = 2;
        int i3 = (gapComposer.changedInstance(noAllowanceInDependentDetail) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1448209448, new Function2() { // from class: com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = r2;
                    AllowanceViewModel.NoAllowanceInDependentDetail noAllowanceInDependentDetail2 = noAllowanceInDependentDetail;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                Painter painterResource = Countries.painterResource(R.drawable.allowance_icon, 0, gapComposer2);
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                long j = colors.semantic.icon.standard;
                                ImageKt.Image(painterResource, noAllowanceInDependentDetail2.title, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable, 60);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, noAllowanceInDependentDetail2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, noAllowanceInDependentDetail2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1457980009, new Function2() { // from class: com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    AllowanceViewModel.NoAllowanceInDependentDetail noAllowanceInDependentDetail2 = noAllowanceInDependentDetail;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                Painter painterResource = Countries.painterResource(R.drawable.allowance_icon, 0, gapComposer2);
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                long j = colors.semantic.icon.standard;
                                ImageKt.Image(painterResource, noAllowanceInDependentDetail2.title, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable, 60);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, noAllowanceInDependentDetail2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, noAllowanceInDependentDetail2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            r8 = (i3 & 112) == 32 ? 1 : 0;
            Object rememberedValue = gapComposer.rememberedValue();
            if (r8 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new EarningsHomeKt$$ExternalSyntheticLambda7(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, false, Expect_jvmKt.rememberComposableLambda(1516603375, new Function2() { // from class: com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i2;
                    AllowanceViewModel.NoAllowanceInDependentDetail noAllowanceInDependentDetail2 = noAllowanceInDependentDetail;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                Painter painterResource = Countries.painterResource(R.drawable.allowance_icon, 0, gapComposer2);
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                long j = colors.semantic.icon.standard;
                                ImageKt.Image(painterResource, noAllowanceInDependentDetail2.title, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable, 60);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, noAllowanceInDependentDetail2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, noAllowanceInDependentDetail2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, push, 0L, gapComposer, 817889334, 3444);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda0(noAllowanceInDependentDetail, function1, i, 2);
        }
    }

    public static final void NotificationControlsItem(final DependentNotificationsSectionModel dependentNotificationsSectionModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-814281257);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(dependentNotificationsSectionModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2134566266, new Function2() { // from class: com.squareup.cash.family.familyhub.views.DependentAccessControlsViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = r2;
                    DependentNotificationsSectionModel dependentNotificationsSectionModel2 = dependentNotificationsSectionModel;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dependentNotificationsSectionModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dependentNotificationsSectionModel2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            r7 = (i2 & 112) == 32 ? 1 : 0;
            Object rememberedValue = gapComposer.rememberedValue();
            if (r7 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda6(3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f415lambda$438542907, rememberComposableLambda, null, (Function0) rememberedValue, false, false, Expect_jvmKt.rememberComposableLambda(574195468, new Function2() { // from class: com.squareup.cash.family.familyhub.views.DependentAccessControlsViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = i3;
                    DependentNotificationsSectionModel dependentNotificationsSectionModel2 = dependentNotificationsSectionModel;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dependentNotificationsSectionModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dependentNotificationsSectionModel2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, push, 0L, gapComposer, 817889334, 3444);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(dependentNotificationsSectionModel, function1, i, 27);
        }
    }

    public static final void P2PControlRow(final P2PControlListViewModel p2PControlListViewModel, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2106620258);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(p2PControlListViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = p2PControlListViewModel.isEditable;
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(-1227531568, new Function2() { // from class: com.squareup.cash.family.familyhub.views.DependentControlViewKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    long j;
                    int i5 = i3;
                    P2PControlListViewModel p2PControlListViewModel2 = p2PControlListViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
                                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, Modifier.Companion.$$INSTANCE);
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
                                Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                String str = p2PControlListViewModel2.title;
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4084, ((Color) gapComposer2.consume(staticProvidableCompositionLocal)).value, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, true), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                String str2 = p2PControlListViewModel2.rowValue;
                                TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                if (p2PControlListViewModel2.subtleRowValue) {
                                    gapComposer2.startReplaceGroup(749655785);
                                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    j = colors.semantic.text.subtle;
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(749729658);
                                    j = ((Color) gapComposer2.consume(staticProvidableCompositionLocal)).value;
                                    gapComposer2.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                gapComposer2.end(true);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str3 = p2PControlListViewModel2.subtitle;
                                if (str3 == null) {
                                    gapComposer3.startReplaceGroup(-37117797);
                                } else {
                                    gapComposer3.startReplaceGroup(-37117796);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                }
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), null, function0, z, p2PControlListViewModel.subtitle == null, Expect_jvmKt.rememberComposableLambda(2053988182, new Function2() { // from class: com.squareup.cash.family.familyhub.views.DependentControlViewKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    long j;
                    int i5 = i4;
                    P2PControlListViewModel p2PControlListViewModel2 = p2PControlListViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
                                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, Modifier.Companion.$$INSTANCE);
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
                                Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                String str = p2PControlListViewModel2.title;
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4084, ((Color) gapComposer2.consume(staticProvidableCompositionLocal)).value, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, true), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                String str2 = p2PControlListViewModel2.rowValue;
                                TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                if (p2PControlListViewModel2.subtleRowValue) {
                                    gapComposer2.startReplaceGroup(749655785);
                                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    j = colors.semantic.text.subtle;
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(749729658);
                                    j = ((Color) gapComposer2.consume(staticProvidableCompositionLocal)).value;
                                    gapComposer2.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                gapComposer2.end(true);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str3 = p2PControlListViewModel2.subtitle;
                                if (str3 == null) {
                                    gapComposer3.startReplaceGroup(-37117797);
                                } else {
                                    gapComposer3.startReplaceGroup(-37117796);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                }
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), null, 0L, CellDefaultAccessory.Push.INSTANCE, null, gapComposer, ((i2 << 3) & 896) | 806879238, 1418);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(p2PControlListViewModel, function0, i);
        }
    }

    public static final void P2PRowSection(P2PControlListViewModel p2PControlListViewModel, P2PControlListViewModel p2PControlListViewModel2, P2PControlListViewModel p2PControlListViewModel3, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1811921159);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(p2PControlListViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(p2PControlListViewModel2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(p2PControlListViewModel3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda6(5, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            P2PControlRow(p2PControlListViewModel, (Function0) rememberedValue, gapComposer, i2 & 14);
            boolean z2 = i3 == 2048;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(6, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            P2PControlRow(p2PControlListViewModel2, (Function0) rememberedValue2, gapComposer, (i2 >> 3) & 14);
            if (p2PControlListViewModel3 == null) {
                gapComposer.startReplaceGroup(206067841);
            } else {
                gapComposer.startReplaceGroup(206067842);
                boolean z3 = i3 == 2048;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new FamilyHomeViewKt$$ExternalSyntheticLambda6(7, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                P2PControlRow(p2PControlListViewModel3, (Function0) rememberedValue3, gapComposer, 0);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(p2PControlListViewModel, i, p2PControlListViewModel2, p2PControlListViewModel3, function1, 7);
        }
    }

    public static final void PrivacySection(String str, String str2, String str3, Integer num, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(836456572);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(str3) ? 256 : 128) | (gapComposer.changed(num) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, str3, gapComposer, (i2 & 14) | ((i2 << 6) & 57344), 14);
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-297025097, new AllowanceViewKt$$ExternalSyntheticLambda0(13, str2, num), gapComposer);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(28, num, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f407lambda$1591443944, rememberComposableLambda, null, (Function0) rememberedValue, false, true, null, null, push, 0L, gapComposer, 806879286, 3508);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(str, str2, str3, num, function1, i, 23);
        }
    }

    public static final void ShimmeringDetails(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1174432379);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            VisibleKt.ShimmerBox(null, false, Alignment.Companion.Center, lambda$230647414, gapComposer, 3456, 3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(i, 8);
        }
    }

    public static final void SpendingControlsItem(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1479276573);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda6(2, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f403lambda$1251446859, f404lambda$1383770604, null, (Function0) rememberedValue, false, false, lambda$2117254222, null, push, 0L, gapComposer, 817889334, 3444);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 15, false);
        }
    }

    public static final void ToggleSection(DependentControlsToggleViewModel dependentControlsToggleViewModel, ControlType controlType, String str, Function1 function1, Composer composer, int i) {
        int i2;
        String str2;
        GapComposer gapComposer;
        ComposableLambdaImpl rememberComposableLambda;
        DependentControlsToggleViewModel dependentControlsToggleViewModel2 = dependentControlsToggleViewModel;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1715892777);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(dependentControlsToggleViewModel2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(controlType.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            str2 = str;
            i2 |= gapComposer2.changed(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Integer num = dependentControlsToggleViewModel2.toggleIcon;
            if (num == null) {
                gapComposer2.startReplaceGroup(539295771);
                gapComposer2.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer2.startReplaceGroup(539295772);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-504091446, new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(num.intValue(), dependentControlsToggleViewModel2, 14), gapComposer2);
                gapComposer2.end(false);
            }
            CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(dependentControlsToggleViewModel2.toggleChecked);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1758482616, new DependentControlViewKt$$ExternalSyntheticLambda7(dependentControlsToggleViewModel2, 3), gapComposer2);
            boolean changedInstance = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | gapComposer2.changedInstance(dependentControlsToggleViewModel2) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                l2$$ExternalSyntheticLambda7 l2__externalsyntheticlambda7 = new l2$$ExternalSyntheticLambda7(function1, dependentControlsToggleViewModel2, controlType, str2, 25);
                dependentControlsToggleViewModel2 = dependentControlsToggleViewModel2;
                gapComposer2.updateRememberedValue(l2__externalsyntheticlambda7);
                rememberedValue = l2__externalsyntheticlambda7;
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, false, Expect_jvmKt.rememberComposableLambda(1792580098, new DependentControlViewKt$$ExternalSyntheticLambda7(dependentControlsToggleViewModel2, i3), gapComposer2), null, toggle, 0L, gapComposer, 12582960, 3444);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(dependentControlsToggleViewModel2, i, controlType, str, function1, 8);
        }
    }

    public static final void ToolbarContent(Modifier modifier, DependentDetailToolbarModel dependentDetailToolbarModel, Function1 function1, Composer composer, int i) {
        Unit unit;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1174998084);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(dependentDetailToolbarModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(modifier, null, 3);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(wrapContentSize$default, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda6(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m302paddingqDBjuR0$default, false, null, null, (Function0) rememberedValue, 15);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
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
            StackedAvatarViewModel stackedAvatarViewModel = dependentDetailToolbarModel.avatarModel;
            if (stackedAvatarViewModel == null) {
                gapComposer.startReplaceGroup(-1415565450);
                gapComposer.end(false);
                unit = null;
            } else {
                gapComposer.startReplaceGroup(-1415565449);
                AvatarsKt.HorizontalStackedAvatars(AvatarSize.Size64, stackedAvatarViewModel, null, new AddFavoritesViewKt$$ExternalSyntheticLambda15(13), gapComposer, 6, 20);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                ToolbarTitleText(dependentDetailToolbarModel, gapComposer, (i2 >> 3) & 14);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                gapComposer.end(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                gapComposer.startReplaceGroup(-1415271569);
                AvatarLoadingView(gapComposer, 0);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(647072726);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2((Object) modifier, (Object) dependentDetailToolbarModel, function1, i, 22);
        }
    }

    public static final void ToolbarTitleText(DependentDetailToolbarModel dependentDetailToolbarModel, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1850088096);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer2.changed(dependentDetailToolbarModel) : gapComposer2.changedInstance(dependentDetailToolbarModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer2.startReplaceGroup(1340946941);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(2, 1, 0, 5, 1769472, 0, 3730, Strings.getColors(gapComposer2).semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).button, (TextLineBalancing) null, dependentDetailToolbarModel.dependentName, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer2).getClass();
            SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 8.0f));
            Painter painterResource = Countries.painterResource(R.drawable.toolbar_arrow_right, 0, gapComposer2);
            long j = Strings.getColors(gapComposer2).semantic.icon.subtle;
            ImageKt.Image(painterResource, null, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 48, 60);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            gapComposer.end(false);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(dependentDetailToolbarModel, i, 15);
        }
    }

    public static final void U13CelebrationHero(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(805584865);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changed(true) ? 32 : 16);
        int i3 = 18;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState = (MutableState) rememberedValue4;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = Updater.mutableStateOf$default(new TransformOrigin(TransformOrigin.Center));
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue5;
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = AnimatableKt.Animatable(0.64f, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            final Animatable animatable = (Animatable) rememberedValue6;
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            final Animatable animatable2 = (Animatable) rememberedValue7;
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            final Animatable animatable3 = (Animatable) rememberedValue8;
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (rememberedValue9 == neverEqualPolicy) {
                rememberedValue9 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            final Animatable animatable4 = (Animatable) rememberedValue9;
            Object rememberedValue10 = gapComposer.rememberedValue();
            if (rememberedValue10 == neverEqualPolicy) {
                rememberedValue10 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue10);
            }
            final Animatable animatable5 = (Animatable) rememberedValue10;
            Object rememberedValue11 = gapComposer.rememberedValue();
            if (rememberedValue11 == neverEqualPolicy) {
                rememberedValue11 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue11);
            }
            final Animatable animatable6 = (Animatable) rememberedValue11;
            Object rememberedValue12 = gapComposer.rememberedValue();
            if (rememberedValue12 == neverEqualPolicy) {
                rememberedValue12 = AnimatableKt.Animatable(1.0f, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue12);
            }
            final Animatable animatable7 = (Animatable) rememberedValue12;
            Object rememberedValue13 = gapComposer.rememberedValue();
            if (rememberedValue13 == neverEqualPolicy) {
                rememberedValue13 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue13);
            }
            final Animatable animatable8 = (Animatable) rememberedValue13;
            Object rememberedValue14 = gapComposer.rememberedValue();
            if (rememberedValue14 == neverEqualPolicy) {
                rememberedValue14 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue14);
            }
            final Animatable animatable9 = (Animatable) rememberedValue14;
            Object rememberedValue15 = gapComposer.rememberedValue();
            if (rememberedValue15 == neverEqualPolicy) {
                rememberedValue15 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue15);
            }
            final Animatable animatable10 = (Animatable) rememberedValue15;
            Object rememberedValue16 = gapComposer.rememberedValue();
            if (rememberedValue16 == neverEqualPolicy) {
                rememberedValue16 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue16);
            }
            final Animatable animatable11 = (Animatable) rememberedValue16;
            Object rememberedValue17 = gapComposer.rememberedValue();
            if (rememberedValue17 == neverEqualPolicy) {
                rememberedValue17 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue17);
            }
            final Animatable animatable12 = (Animatable) rememberedValue17;
            Object rememberedValue18 = gapComposer.rememberedValue();
            if (rememberedValue18 == neverEqualPolicy) {
                rememberedValue18 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue18);
            }
            final Animatable animatable13 = (Animatable) rememberedValue18;
            Object rememberedValue19 = gapComposer.rememberedValue();
            if (rememberedValue19 == neverEqualPolicy) {
                rememberedValue19 = new MutexImpl();
                gapComposer.updateRememberedValue(rememberedValue19);
            }
            final Mutex mutex = (Mutex) rememberedValue19;
            OffsetKt.BoxWithConstraints(OffsetKt.aspectRatio(1.1956521f, SizeKt.m292widthInVpY3zN4$default(SizeKt.fillMaxWidth(modifier, 0.79f), RecyclerView.DECELERATION_RATE, 330.0f, 1), false), Alignment.Companion.Center, false, Expect_jvmKt.rememberComposableLambda(-1578562869, new Function3() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f;
                    Mutex mutex2;
                    Object registerAliasPresenter$register$result$1;
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4;
                    Animatable animatable14;
                    WalletMetrics walletMetrics;
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState5;
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState6;
                    Animatable animatable15;
                    WalletMetrics walletMetrics2;
                    Animatable animatable16;
                    Animatable animatable17;
                    Animatable animatable18;
                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    boxWithConstraintsScopeImpl.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                        boolean changed = gapComposer2.changed(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM()) | gapComposer2.changed(boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM()) | gapComposer2.changed(density);
                        Object rememberedValue20 = gapComposer2.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                        if (changed || rememberedValue20 == neverEqualPolicy2) {
                            float m259getMaxWidthD9Ej5fM = boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM();
                            float m258getMaxHeightD9Ej5fM = boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM();
                            density.getClass();
                            float f2 = 0.3651f * m258getMaxHeightD9Ej5fM;
                            float f3 = 0.6732f * m258getMaxHeightD9Ej5fM;
                            float f4 = m259getMaxWidthD9Ej5fM * 0.8366f;
                            float f5 = m259getMaxWidthD9Ej5fM * 0.7905f;
                            float f6 = f5 / 1.4140401f;
                            float mo236toPx0680j_4 = density.mo236toPx0680j_4(f2);
                            float mo236toPx0680j_42 = density.mo236toPx0680j_4(f3);
                            float mo236toPx0680j_43 = density.mo236toPx0680j_4(0.1427f * m258getMaxHeightD9Ej5fM);
                            float mo236toPx0680j_44 = density.mo236toPx0680j_4(0.3228f * m258getMaxHeightD9Ej5fM);
                            float mo236toPx0680j_45 = density.mo236toPx0680j_4(0.0532f * m259getMaxWidthD9Ej5fM);
                            float mo236toPx0680j_46 = density.mo236toPx0680j_4(0.0023f * m259getMaxWidthD9Ej5fM);
                            float mo236toPx0680j_47 = density.mo236toPx0680j_4((-0.032f) * m258getMaxHeightD9Ej5fM);
                            float mo236toPx0680j_48 = density.mo236toPx0680j_4(8.0f);
                            float mo236toPx0680j_49 = density.mo236toPx0680j_4(f6);
                            float mo236toPx0680j_410 = density.mo236toPx0680j_4(RecyclerView.DECELERATION_RATE);
                            float f7 = (mo236toPx0680j_42 * 0.625f) + mo236toPx0680j_44;
                            WalletMetrics walletMetrics3 = new WalletMetrics(m259getMaxWidthD9Ej5fM * 0.9162f, f2, m259getMaxWidthD9Ej5fM * 0.9591f, f3, f4, f4 / 1.6542857f, f5, f6, density.mo232toDpu2uoSUM(f7), mo236toPx0680j_43, mo236toPx0680j_45, mo236toPx0680j_44, mo236toPx0680j_46, mo236toPx0680j_47, density.mo236toPx0680j_4(1.0f) + mo236toPx0680j_43 + mo236toPx0680j_4, mo236toPx0680j_48, mo236toPx0680j_44 - density.mo236toPx0680j_4(30.0f), density.mo236toPx0680j_4(30.0f) + mo236toPx0680j_44, density.mo236toPx0680j_4(8.0f) + f7, mo236toPx0680j_410, (mo236toPx0680j_49 * 0.6666667f) - density.mo236toPx0680j_4(8.0f), density.mo236toPx0680j_4(-1.0f), density.mo236toPx0680j_4(1.0f), density.mo236toPx0680j_4(1.0f), density.mo236toPx0680j_4(2.0f), density.mo236toPx0680j_4(6.0f), density.mo236toPx0680j_4(m259getMaxWidthD9Ej5fM), density.mo236toPx0680j_4(m258getMaxHeightD9Ej5fM));
                            gapComposer2.updateRememberedValue(walletMetrics3);
                            rememberedValue20 = walletMetrics3;
                        }
                        WalletMetrics walletMetrics4 = (WalletMetrics) rememberedValue20;
                        MutableState mutableState3 = mutableState;
                        if (((Boolean) mutableState3.getValue()).booleanValue()) {
                            gapComposer2.startReplaceGroup(-1369194458);
                            InfiniteTransition rememberInfiniteTransition = ArcSplineKt.rememberInfiniteTransition("walletFloat", gapComposer2, 0);
                            float f8 = walletMetrics4.floatAmplitudePx;
                            f = ((Number) ArcSplineKt.animateFloat(rememberInfiniteTransition, -f8, f8, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(2600, 0, null, 6), RepeatMode.Reverse, 4), "walletFloatOffset", gapComposer2, 28680, 0).value$delegate.getValue()).floatValue();
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-1368679517);
                            gapComposer2.end(false);
                            f = RecyclerView.DECELERATION_RATE;
                        }
                        float m259getMaxWidthD9Ej5fM2 = boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM();
                        float m258getMaxHeightD9Ej5fM2 = boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM();
                        Object rememberedValue21 = gapComposer2.rememberedValue();
                        if (rememberedValue21 == neverEqualPolicy2) {
                            rememberedValue21 = new DrawerViewKt$$ExternalSyntheticLambda2(22, mutableState3);
                            gapComposer2.updateRememberedValue(rememberedValue21);
                        }
                        Function0 function0 = (Function0) rememberedValue21;
                        Object rememberedValue22 = gapComposer2.rememberedValue();
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState7 = parcelableSnapshotMutableIntState;
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState8 = parcelableSnapshotMutableIntState2;
                        if (rememberedValue22 == neverEqualPolicy2) {
                            rememberedValue22 = new GLSceneScope$$ExternalSyntheticLambda2(7, parcelableSnapshotMutableIntState7, parcelableSnapshotMutableIntState8, mutableState3);
                            gapComposer2.updateRememberedValue(rememberedValue22);
                        }
                        Function0 function02 = (Function0) rememberedValue22;
                        Animatable animatable19 = Animatable.this;
                        Animatable animatable20 = animatable2;
                        Animatable animatable21 = animatable3;
                        Animatable animatable22 = animatable4;
                        Animatable animatable23 = animatable5;
                        Animatable animatable24 = animatable6;
                        AllowanceViewKt.m3532EntranceAnimation6blBNOA(m259getMaxWidthD9Ej5fM2, m258getMaxHeightD9Ej5fM2, walletMetrics4, animatable19, animatable20, animatable21, animatable22, animatable23, animatable24, function0, function02, gapComposer2, 1227128832);
                        float m259getMaxWidthD9Ej5fM3 = boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM();
                        float m258getMaxHeightD9Ej5fM3 = boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM();
                        boolean booleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
                        int intValue2 = parcelableSnapshotMutableIntState8.getIntValue();
                        Mutex mutex3 = mutex;
                        boolean changedInstance = gapComposer2.changedInstance(mutex3) | gapComposer2.changedInstance(animatable21) | gapComposer2.changed(walletMetrics4);
                        Object rememberedValue23 = gapComposer2.rememberedValue();
                        if (changedInstance || rememberedValue23 == neverEqualPolicy2) {
                            mutex2 = mutex3;
                            parcelableSnapshotMutableIntState4 = parcelableSnapshotMutableIntState7;
                            registerAliasPresenter$register$result$1 = new RegisterAliasPresenter$register$result$1(mutex2, animatable21, walletMetrics4, parcelableSnapshotMutableIntState4, parcelableSnapshotMutableIntState8, (Continuation) null, 2);
                            animatable14 = animatable21;
                            walletMetrics = walletMetrics4;
                            parcelableSnapshotMutableIntState5 = parcelableSnapshotMutableIntState8;
                            gapComposer2.updateRememberedValue(registerAliasPresenter$register$result$1);
                        } else {
                            parcelableSnapshotMutableIntState4 = parcelableSnapshotMutableIntState7;
                            animatable14 = animatable21;
                            mutex2 = mutex3;
                            parcelableSnapshotMutableIntState5 = parcelableSnapshotMutableIntState8;
                            registerAliasPresenter$register$result$1 = rememberedValue23;
                            walletMetrics = walletMetrics4;
                        }
                        Mutex mutex4 = mutex2;
                        AllowanceViewKt.m3531AutoplayCyclero3XDK20(m259getMaxWidthD9Ej5fM3, m258getMaxHeightD9Ej5fM3, booleanValue, intValue2, (Function1) registerAliasPresenter$register$result$1, gapComposer2, 0);
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState9 = parcelableSnapshotMutableIntState3;
                        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState9.getIntValue());
                        boolean changedInstance2 = gapComposer2.changedInstance(mutex4) | gapComposer2.changedInstance(animatable14) | gapComposer2.changed(walletMetrics);
                        Object rememberedValue24 = gapComposer2.rememberedValue();
                        if (changedInstance2 || rememberedValue24 == neverEqualPolicy2) {
                            Animatable animatable25 = animatable14;
                            parcelableSnapshotMutableIntState6 = parcelableSnapshotMutableIntState9;
                            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState10 = parcelableSnapshotMutableIntState4;
                            WalletMetrics walletMetrics5 = walletMetrics;
                            RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$1 = new RealBlockersHelper$skipBlocker$1(parcelableSnapshotMutableIntState6, mutex4, animatable25, walletMetrics5, parcelableSnapshotMutableIntState10, null, 26);
                            animatable15 = animatable25;
                            walletMetrics2 = walletMetrics5;
                            parcelableSnapshotMutableIntState4 = parcelableSnapshotMutableIntState10;
                            gapComposer2.updateRememberedValue(realBlockersHelper$skipBlocker$1);
                            rememberedValue24 = realBlockersHelper$skipBlocker$1;
                        } else {
                            animatable15 = animatable14;
                            parcelableSnapshotMutableIntState6 = parcelableSnapshotMutableIntState9;
                            walletMetrics2 = walletMetrics;
                        }
                        Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue24);
                        int intValue3 = parcelableSnapshotMutableIntState4.getIntValue();
                        MutableState mutableState4 = mutableState2;
                        long j = ((TransformOrigin) mutableState4.getValue()).packedValue;
                        boolean changed2 = gapComposer2.changed(walletMetrics2);
                        Animatable animatable26 = animatable7;
                        boolean changedInstance3 = changed2 | gapComposer2.changedInstance(animatable26);
                        Animatable animatable27 = animatable8;
                        boolean changedInstance4 = changedInstance3 | gapComposer2.changedInstance(animatable27);
                        Animatable animatable28 = animatable9;
                        boolean changedInstance5 = changedInstance4 | gapComposer2.changedInstance(animatable28);
                        Animatable animatable29 = animatable10;
                        boolean changedInstance6 = changedInstance5 | gapComposer2.changedInstance(animatable29);
                        Animatable animatable30 = animatable29;
                        Animatable animatable31 = animatable12;
                        boolean changedInstance7 = changedInstance6 | gapComposer2.changedInstance(animatable31) | gapComposer2.changed(density);
                        Animatable animatable32 = animatable11;
                        boolean changedInstance8 = changedInstance7 | gapComposer2.changedInstance(animatable32);
                        Animatable animatable33 = animatable13;
                        boolean changedInstance9 = changedInstance8 | gapComposer2.changedInstance(animatable33);
                        Object rememberedValue25 = gapComposer2.rememberedValue();
                        if (changedInstance9 || rememberedValue25 == neverEqualPolicy2) {
                            U13CelebrationViewKt$U13CelebrationHero$1$5$1 u13CelebrationViewKt$U13CelebrationHero$1$5$1 = new U13CelebrationViewKt$U13CelebrationHero$1$5$1(walletMetrics2, mutableState4, parcelableSnapshotMutableIntState5, parcelableSnapshotMutableIntState6, animatable26, animatable27, animatable28, animatable30, animatable31, density, animatable32, animatable33, null);
                            animatable16 = animatable26;
                            animatable17 = animatable27;
                            animatable30 = animatable30;
                            animatable18 = animatable32;
                            gapComposer2.updateRememberedValue(u13CelebrationViewKt$U13CelebrationHero$1$5$1);
                            rememberedValue25 = u13CelebrationViewKt$U13CelebrationHero$1$5$1;
                        } else {
                            animatable18 = animatable32;
                            animatable16 = animatable26;
                            animatable17 = animatable27;
                        }
                        AllowanceViewKt.m3534WalletLayersIXbI2m4(walletMetrics2, intValue3, animatable19, animatable20, animatable15, animatable22, animatable23, animatable24, animatable16, animatable17, animatable28, animatable30, j, animatable18, animatable31, animatable33, f, (Function3) rememberedValue25, gapComposer2, 1227133440);
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
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, i3);
        }
    }

    public static final void U13CelebrationView(U13CelebrationViewModel u13CelebrationViewModel, Function1 function1, boolean z, Composer composer, int i) {
        int i2;
        boolean z2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1413453257);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(u13CelebrationViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
            z2 = z;
        } else {
            if (u13CelebrationViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new Recipient$$ExternalSyntheticLambda2(23);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 48, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1501626964, new FormCashtag$8$$ExternalSyntheticLambda0(5, function1, u13CelebrationViewModel), gapComposer), gapComposer, 3072, 7);
            z2 = true;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(u13CelebrationViewModel, function1, z2, i, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x03b8, code lost:
    
        if (r15 == r14) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0479, code lost:
    
        if (r13 == r10) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0334 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02fa A[ADDED_TO_REGION] */
    /* renamed from: WalletLayers-IXbI2m4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3534WalletLayersIXbI2m4(WalletMetrics walletMetrics, final int i, final Animatable animatable, final Animatable animatable2, final Animatable animatable3, final Animatable animatable4, final Animatable animatable5, final Animatable animatable6, final Animatable animatable7, final Animatable animatable8, final Animatable animatable9, final Animatable animatable10, final long j, final Animatable animatable11, final Animatable animatable12, final Animatable animatable13, final float f, final Function3 function3, Composer composer, final int i2) {
        final WalletMetrics walletMetrics2;
        GapComposer gapComposer;
        Animatable animatable14;
        GapComposer gapComposer2;
        Applier applier;
        float f2;
        Animatable animatable15;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object rememberedValue;
        NeverEqualPolicy neverEqualPolicy;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        int i3;
        int i4;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        boolean z6;
        NeverEqualPolicy neverEqualPolicy2;
        Animatable animatable16;
        boolean z7;
        Animatable animatable17;
        boolean z8;
        boolean z9;
        NeverEqualPolicy neverEqualPolicy3;
        Object rememberedValue2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1444174269);
        Applier applier2 = gapComposer3.applier;
        int i5 = i2 | (gapComposer3.changed(walletMetrics) ? 4 : 2) | (gapComposer3.changed(i) ? 32 : 16) | (gapComposer3.changedInstance(animatable) ? 256 : 128) | (gapComposer3.changedInstance(animatable2) ? 2048 : 1024) | (gapComposer3.changedInstance(animatable3) ? 16384 : 8192) | (gapComposer3.changedInstance(animatable4) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer3.changedInstance(animatable5) ? PKIFailureInfo.badCertTemplate : 524288) | (gapComposer3.changedInstance(animatable6) ? 8388608 : 4194304) | (gapComposer3.changedInstance(animatable7) ? 67108864 : 33554432) | (gapComposer3.changedInstance(animatable8) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i6 = 36936 | (gapComposer3.changedInstance(animatable9) ? (char) 4 : (char) 2) | (gapComposer3.changedInstance(animatable10) ? ' ' : (char) 16) | (gapComposer3.changed(j) ? (char) 256 : (char) 128) | (gapComposer3.changedInstance(animatable11) ? (char) 2048 : (char) 1024) | (gapComposer3.changedInstance(animatable12) ? (char) 16384 : (char) 8192) | (gapComposer3.changedInstance(animatable13) ? (char) 0 : (char) 0) | (gapComposer3.changed(f) ? (char) 0 : (char) 0) | (gapComposer3.changedInstance(function3) ? (char) 0 : (char) 0);
        if (gapComposer3.shouldExecute(i5 & 1, ((i5 & 306783379) == 306783378 && (4793491 & i6) == 4793490) ? false : true)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer3.changedInstance(function3);
            Object rememberedValue3 = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy4 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue3 == neverEqualPolicy4) {
                rememberedValue3 = new SliderKt$sliderTapModifier$1(function3, 5);
                gapComposer3.updateRememberedValue(rememberedValue3);
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(fillMaxSize, unit, (PointerInputEventHandler) rememberedValue3);
            boolean z10 = ((i6 & 896) == 256) | ((i5 & 896) == 256 || gapComposer3.changedInstance(animatable)) | ((234881024 & i5) == 67108864 || gapComposer3.changedInstance(animatable7)) | ((i5 & 7168) == 2048 || gapComposer3.changedInstance(animatable2)) | ((1879048192 & i5) == 536870912 || gapComposer3.changedInstance(animatable8)) | ((i6 & 14) == 4 || gapComposer3.changedInstance(animatable9)) | ((i6 & 3670016) == 1048576) | ((i6 & 112) == 32 || gapComposer3.changedInstance(animatable10));
            Object rememberedValue4 = gapComposer3.rememberedValue();
            if (z10 || rememberedValue4 == neverEqualPolicy4) {
                animatable14 = animatable13;
                gapComposer2 = gapComposer3;
                applier = applier2;
                f2 = 1.0f;
                Function1 function1 = new Function1() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                        reusableGraphicsLayerScope.getClass();
                        reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(j);
                        Animatable animatable18 = animatable;
                        float floatValue = ((Number) animatable18.getValue()).floatValue();
                        Animatable animatable19 = animatable7;
                        reusableGraphicsLayerScope.setScaleX(((Number) animatable19.getValue()).floatValue() * floatValue);
                        reusableGraphicsLayerScope.setScaleY(((Number) animatable19.getValue()).floatValue() * ((Number) animatable18.getValue()).floatValue());
                        reusableGraphicsLayerScope.setAlpha(((Number) animatable2.getValue()).floatValue());
                        reusableGraphicsLayerScope.setRotationZ(((Number) animatable8.getValue()).floatValue());
                        reusableGraphicsLayerScope.setTranslationX(((Number) animatable9.getValue()).floatValue());
                        reusableGraphicsLayerScope.setTranslationY(((Number) animatable10.getValue()).floatValue() + f);
                        return Unit.INSTANCE;
                    }
                };
                gapComposer2.updateRememberedValue(function1);
                rememberedValue4 = function1;
            } else {
                animatable14 = animatable13;
                gapComposer2 = gapComposer3;
                applier = applier2;
                f2 = 1.0f;
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(pointerInput, (Function1) rememberedValue4);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, graphicsLayer);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$15);
            Painter painterResource = Countries.painterResource(2131233659, 0, gapComposer2);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, f2);
            int i7 = Painter.$stable;
            GapComposer gapComposer4 = gapComposer2;
            ImageKt.Image(painterResource, null, fillMaxSize2, null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, null, gapComposer4, i7 | 25008, 104);
            Painter painterResource2 = Countries.painterResource(2131233658, 0, gapComposer4);
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, walletMetrics.dollarWidth, walletMetrics.dollarHeight);
            BiasAlignment biasAlignment2 = Alignment.Companion.TopCenter;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier align = boxScopeInstance.align(m287sizeVpY3zN4, biasAlignment2);
            int i8 = i5 & 14;
            boolean z11 = i8 == 4;
            if ((i6 & 7168) != 2048) {
                animatable15 = animatable11;
                if (!gapComposer4.changedInstance(animatable15)) {
                    z = false;
                    boolean z12 = z11 | z;
                    if ((i5 & 3670016) != 1048576 && !gapComposer4.changedInstance(animatable5)) {
                        z2 = false;
                        boolean z13 = z12 | z2;
                        if ((i6 & 57344) != 16384 && !gapComposer4.changedInstance(animatable12)) {
                            z3 = false;
                            boolean z14 = z13 | z3;
                            if ((i5 & 29360128) != 8388608 && !gapComposer4.changedInstance(animatable6)) {
                                z4 = false;
                                z5 = z14 | z4 | ((i6 & 458752) != 131072 || gapComposer4.changedInstance(animatable14));
                                rememberedValue = gapComposer4.rememberedValue();
                                if (!z5 || rememberedValue == neverEqualPolicy4) {
                                    neverEqualPolicy = neverEqualPolicy4;
                                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                                    Animatable animatable18 = animatable15;
                                    i3 = i5;
                                    i4 = i7;
                                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                                    walletMetrics2 = walletMetrics;
                                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                                    SliderKt$$ExternalSyntheticLambda3 sliderKt$$ExternalSyntheticLambda3 = new SliderKt$$ExternalSyntheticLambda3(walletMetrics2, animatable18, animatable5, animatable12, animatable6, animatable13, 9);
                                    gapComposer4.updateRememberedValue(sliderKt$$ExternalSyntheticLambda3);
                                    rememberedValue = sliderKt$$ExternalSyntheticLambda3;
                                } else {
                                    neverEqualPolicy = neverEqualPolicy4;
                                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                                    walletMetrics2 = walletMetrics;
                                    i3 = i5;
                                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                                    i4 = i7;
                                }
                                Modifier graphicsLayer2 = ColorKt.graphicsLayer(align, (Function1) rememberedValue);
                                int i9 = i4 | 48;
                                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = layoutNode$Companion$Constructor$1;
                                ImageKt.Image(painterResource2, null, graphicsLayer2, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i9, 120);
                                final int i10 = 0;
                                Painter painterResource3 = Countries.painterResource(2131233661, 0, gapComposer4);
                                Modifier align2 = boxScopeInstance.align(SizeKt.m287sizeVpY3zN4(companion, walletMetrics2.upperPanelWidth, walletMetrics2.upperPanelHeight), biasAlignment);
                                z6 = i8 != 4;
                                Object rememberedValue5 = gapComposer4.rememberedValue();
                                if (z6) {
                                    neverEqualPolicy2 = neverEqualPolicy;
                                } else {
                                    neverEqualPolicy2 = neverEqualPolicy;
                                }
                                rememberedValue5 = new Function1() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i11 = i10;
                                        WalletMetrics walletMetrics3 = walletMetrics2;
                                        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                                        reusableGraphicsLayerScope.getClass();
                                        switch (i11) {
                                            case 0:
                                                reusableGraphicsLayerScope.setTranslationX(walletMetrics3.upperPanelLeftPx);
                                                reusableGraphicsLayerScope.setTranslationY(walletMetrics3.upperPanelTopPx);
                                                break;
                                            default:
                                                reusableGraphicsLayerScope.setTranslationX(walletMetrics3.lowerPanelLeftPx);
                                                reusableGraphicsLayerScope.setTranslationY(walletMetrics3.lowerPanelTopPx);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                gapComposer4.updateRememberedValue(rememberedValue5);
                                NeverEqualPolicy neverEqualPolicy5 = neverEqualPolicy2;
                                boolean z15 = false;
                                ImageKt.Image(painterResource3, null, ColorKt.graphicsLayer(align2, (Function1) rememberedValue5), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i9, 120);
                                Modifier clipToBounds = ClipKt.clipToBounds(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), walletMetrics2.clipBottomDp));
                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, clipToBounds);
                                if (applier != null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer4.startReusableNode();
                                if (gapComposer4.inserting) {
                                    gapComposer4.createNode(layoutNode$Companion$Constructor$13);
                                } else {
                                    gapComposer4.useNode();
                                }
                                Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
                                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer4, composeUiNode$Companion$SetModifier$14, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$13);
                                Updater.m576setimpl(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                                Painter painterResource4 = Countries.painterResource(CARD_DRAWABLES[i], 0, gapComposer4);
                                Modifier align3 = boxScopeInstance.align(SizeKt.m287sizeVpY3zN4(companion, walletMetrics2.cardWidth, walletMetrics2.cardHeight), biasAlignment2);
                                boolean z16 = i8 == 4;
                                if ((i3 & 57344) != 16384) {
                                    animatable16 = animatable3;
                                    if (!gapComposer4.changedInstance(animatable16)) {
                                        z7 = false;
                                        boolean z17 = z16 | z7;
                                        if ((i3 & 458752) == 131072) {
                                            animatable17 = animatable4;
                                            if (!gapComposer4.changedInstance(animatable17)) {
                                                z8 = false;
                                                z9 = z17 | z8;
                                                Object rememberedValue6 = gapComposer4.rememberedValue();
                                                if (z9) {
                                                    neverEqualPolicy3 = neverEqualPolicy5;
                                                } else {
                                                    neverEqualPolicy3 = neverEqualPolicy5;
                                                }
                                                rememberedValue6 = new GpsConfigQueries$$ExternalSyntheticLambda3(7, walletMetrics2, animatable16, animatable17);
                                                gapComposer4.updateRememberedValue(rememberedValue6);
                                                NeverEqualPolicy neverEqualPolicy6 = neverEqualPolicy3;
                                                ImageKt.Image(painterResource4, null, ClipKt.clip(ColorKt.graphicsLayer(align3, (Function1) rememberedValue6), new CardTuckShape(walletMetrics2.cardMaskBottomPx)), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i9, 120);
                                                final int i11 = 1;
                                                gapComposer4.end(true);
                                                Painter painterResource5 = Countries.painterResource(2131233660, 0, gapComposer4);
                                                Modifier align4 = boxScopeInstance.align(SizeKt.m287sizeVpY3zN4(companion, walletMetrics2.lowerPanelWidth, walletMetrics2.lowerPanelHeight), biasAlignment);
                                                if (i8 == 4) {
                                                    z15 = true;
                                                }
                                                rememberedValue2 = gapComposer4.rememberedValue();
                                                if (!z15 || rememberedValue2 == neverEqualPolicy6) {
                                                    rememberedValue2 = new Function1() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda14
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            int i112 = i11;
                                                            WalletMetrics walletMetrics3 = walletMetrics2;
                                                            ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                                                            reusableGraphicsLayerScope.getClass();
                                                            switch (i112) {
                                                                case 0:
                                                                    reusableGraphicsLayerScope.setTranslationX(walletMetrics3.upperPanelLeftPx);
                                                                    reusableGraphicsLayerScope.setTranslationY(walletMetrics3.upperPanelTopPx);
                                                                    break;
                                                                default:
                                                                    reusableGraphicsLayerScope.setTranslationX(walletMetrics3.lowerPanelLeftPx);
                                                                    reusableGraphicsLayerScope.setTranslationY(walletMetrics3.lowerPanelTopPx);
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    gapComposer4.updateRememberedValue(rememberedValue2);
                                                }
                                                ImageKt.Image(painterResource5, null, ColorKt.graphicsLayer(align4, (Function1) rememberedValue2), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i9, 120);
                                                gapComposer = gapComposer4;
                                                gapComposer.end(true);
                                            }
                                        } else {
                                            animatable17 = animatable4;
                                        }
                                        z8 = true;
                                        z9 = z17 | z8;
                                        Object rememberedValue62 = gapComposer4.rememberedValue();
                                        if (z9) {
                                        }
                                        rememberedValue62 = new GpsConfigQueries$$ExternalSyntheticLambda3(7, walletMetrics2, animatable16, animatable17);
                                        gapComposer4.updateRememberedValue(rememberedValue62);
                                        NeverEqualPolicy neverEqualPolicy62 = neverEqualPolicy3;
                                        ImageKt.Image(painterResource4, null, ClipKt.clip(ColorKt.graphicsLayer(align3, (Function1) rememberedValue62), new CardTuckShape(walletMetrics2.cardMaskBottomPx)), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i9, 120);
                                        final int i112 = 1;
                                        gapComposer4.end(true);
                                        Painter painterResource52 = Countries.painterResource(2131233660, 0, gapComposer4);
                                        Modifier align42 = boxScopeInstance.align(SizeKt.m287sizeVpY3zN4(companion, walletMetrics2.lowerPanelWidth, walletMetrics2.lowerPanelHeight), biasAlignment);
                                        if (i8 == 4) {
                                        }
                                        rememberedValue2 = gapComposer4.rememberedValue();
                                        if (!z15) {
                                        }
                                        rememberedValue2 = new Function1() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda14
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                int i1122 = i112;
                                                WalletMetrics walletMetrics3 = walletMetrics2;
                                                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                                                reusableGraphicsLayerScope.getClass();
                                                switch (i1122) {
                                                    case 0:
                                                        reusableGraphicsLayerScope.setTranslationX(walletMetrics3.upperPanelLeftPx);
                                                        reusableGraphicsLayerScope.setTranslationY(walletMetrics3.upperPanelTopPx);
                                                        break;
                                                    default:
                                                        reusableGraphicsLayerScope.setTranslationX(walletMetrics3.lowerPanelLeftPx);
                                                        reusableGraphicsLayerScope.setTranslationY(walletMetrics3.lowerPanelTopPx);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer4.updateRememberedValue(rememberedValue2);
                                        ImageKt.Image(painterResource52, null, ColorKt.graphicsLayer(align42, (Function1) rememberedValue2), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i9, 120);
                                        gapComposer = gapComposer4;
                                        gapComposer.end(true);
                                    }
                                } else {
                                    animatable16 = animatable3;
                                }
                                z7 = true;
                                boolean z172 = z16 | z7;
                                if ((i3 & 458752) == 131072) {
                                }
                                z8 = true;
                                z9 = z172 | z8;
                                Object rememberedValue622 = gapComposer4.rememberedValue();
                                if (z9) {
                                }
                                rememberedValue622 = new GpsConfigQueries$$ExternalSyntheticLambda3(7, walletMetrics2, animatable16, animatable17);
                                gapComposer4.updateRememberedValue(rememberedValue622);
                                NeverEqualPolicy neverEqualPolicy622 = neverEqualPolicy3;
                                ImageKt.Image(painterResource4, null, ClipKt.clip(ColorKt.graphicsLayer(align3, (Function1) rememberedValue622), new CardTuckShape(walletMetrics2.cardMaskBottomPx)), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i9, 120);
                                final int i1122 = 1;
                                gapComposer4.end(true);
                                Painter painterResource522 = Countries.painterResource(2131233660, 0, gapComposer4);
                                Modifier align422 = boxScopeInstance.align(SizeKt.m287sizeVpY3zN4(companion, walletMetrics2.lowerPanelWidth, walletMetrics2.lowerPanelHeight), biasAlignment);
                                if (i8 == 4) {
                                }
                                rememberedValue2 = gapComposer4.rememberedValue();
                                if (!z15) {
                                }
                                rememberedValue2 = new Function1() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i11222 = i1122;
                                        WalletMetrics walletMetrics3 = walletMetrics2;
                                        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                                        reusableGraphicsLayerScope.getClass();
                                        switch (i11222) {
                                            case 0:
                                                reusableGraphicsLayerScope.setTranslationX(walletMetrics3.upperPanelLeftPx);
                                                reusableGraphicsLayerScope.setTranslationY(walletMetrics3.upperPanelTopPx);
                                                break;
                                            default:
                                                reusableGraphicsLayerScope.setTranslationX(walletMetrics3.lowerPanelLeftPx);
                                                reusableGraphicsLayerScope.setTranslationY(walletMetrics3.lowerPanelTopPx);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                gapComposer4.updateRememberedValue(rememberedValue2);
                                ImageKt.Image(painterResource522, null, ColorKt.graphicsLayer(align422, (Function1) rememberedValue2), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i9, 120);
                                gapComposer = gapComposer4;
                                gapComposer.end(true);
                            }
                            z4 = true;
                            z5 = z14 | z4 | ((i6 & 458752) != 131072 || gapComposer4.changedInstance(animatable14));
                            rememberedValue = gapComposer4.rememberedValue();
                            if (z5) {
                            }
                            neverEqualPolicy = neverEqualPolicy4;
                            layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                            Animatable animatable182 = animatable15;
                            i3 = i5;
                            i4 = i7;
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                            walletMetrics2 = walletMetrics;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                            SliderKt$$ExternalSyntheticLambda3 sliderKt$$ExternalSyntheticLambda32 = new SliderKt$$ExternalSyntheticLambda3(walletMetrics2, animatable182, animatable5, animatable12, animatable6, animatable13, 9);
                            gapComposer4.updateRememberedValue(sliderKt$$ExternalSyntheticLambda32);
                            rememberedValue = sliderKt$$ExternalSyntheticLambda32;
                            Modifier graphicsLayer22 = ColorKt.graphicsLayer(align, (Function1) rememberedValue);
                            int i92 = i4 | 48;
                            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$132 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$162 = composeUiNode$Companion$SetModifier$1;
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$132 = layoutNode$Companion$Constructor$1;
                            ImageKt.Image(painterResource2, null, graphicsLayer22, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i92, 120);
                            final int i102 = 0;
                            Painter painterResource32 = Countries.painterResource(2131233661, 0, gapComposer4);
                            Modifier align22 = boxScopeInstance.align(SizeKt.m287sizeVpY3zN4(companion, walletMetrics2.upperPanelWidth, walletMetrics2.upperPanelHeight), biasAlignment);
                            if (i8 != 4) {
                            }
                            Object rememberedValue52 = gapComposer4.rememberedValue();
                            if (z6) {
                            }
                            rememberedValue52 = new Function1() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i11222 = i102;
                                    WalletMetrics walletMetrics3 = walletMetrics2;
                                    ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                                    reusableGraphicsLayerScope.getClass();
                                    switch (i11222) {
                                        case 0:
                                            reusableGraphicsLayerScope.setTranslationX(walletMetrics3.upperPanelLeftPx);
                                            reusableGraphicsLayerScope.setTranslationY(walletMetrics3.upperPanelTopPx);
                                            break;
                                        default:
                                            reusableGraphicsLayerScope.setTranslationX(walletMetrics3.lowerPanelLeftPx);
                                            reusableGraphicsLayerScope.setTranslationY(walletMetrics3.lowerPanelTopPx);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer4.updateRememberedValue(rememberedValue52);
                            NeverEqualPolicy neverEqualPolicy52 = neverEqualPolicy2;
                            boolean z152 = false;
                            ImageKt.Image(painterResource32, null, ColorKt.graphicsLayer(align22, (Function1) rememberedValue52), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i92, 120);
                            Modifier clipToBounds2 = ClipKt.clipToBounds(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), walletMetrics2.clipBottomDp));
                            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                            int hashCode22 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer4.currentCompositionLocalScope();
                            Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer4, clipToBounds2);
                            if (applier != null) {
                            }
                        }
                        z3 = true;
                        boolean z142 = z13 | z3;
                        if ((i5 & 29360128) != 8388608) {
                            z4 = false;
                            z5 = z142 | z4 | ((i6 & 458752) != 131072 || gapComposer4.changedInstance(animatable14));
                            rememberedValue = gapComposer4.rememberedValue();
                            if (z5) {
                            }
                            neverEqualPolicy = neverEqualPolicy4;
                            layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                            Animatable animatable1822 = animatable15;
                            i3 = i5;
                            i4 = i7;
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                            walletMetrics2 = walletMetrics;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                            SliderKt$$ExternalSyntheticLambda3 sliderKt$$ExternalSyntheticLambda322 = new SliderKt$$ExternalSyntheticLambda3(walletMetrics2, animatable1822, animatable5, animatable12, animatable6, animatable13, 9);
                            gapComposer4.updateRememberedValue(sliderKt$$ExternalSyntheticLambda322);
                            rememberedValue = sliderKt$$ExternalSyntheticLambda322;
                            Modifier graphicsLayer222 = ColorKt.graphicsLayer(align, (Function1) rememberedValue);
                            int i922 = i4 | 48;
                            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1322 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1622 = composeUiNode$Companion$SetModifier$1;
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1322 = layoutNode$Companion$Constructor$1;
                            ImageKt.Image(painterResource2, null, graphicsLayer222, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i922, 120);
                            final int i1022 = 0;
                            Painter painterResource322 = Countries.painterResource(2131233661, 0, gapComposer4);
                            Modifier align222 = boxScopeInstance.align(SizeKt.m287sizeVpY3zN4(companion, walletMetrics2.upperPanelWidth, walletMetrics2.upperPanelHeight), biasAlignment);
                            if (i8 != 4) {
                            }
                            Object rememberedValue522 = gapComposer4.rememberedValue();
                            if (z6) {
                            }
                            rememberedValue522 = new Function1() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i11222 = i1022;
                                    WalletMetrics walletMetrics3 = walletMetrics2;
                                    ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                                    reusableGraphicsLayerScope.getClass();
                                    switch (i11222) {
                                        case 0:
                                            reusableGraphicsLayerScope.setTranslationX(walletMetrics3.upperPanelLeftPx);
                                            reusableGraphicsLayerScope.setTranslationY(walletMetrics3.upperPanelTopPx);
                                            break;
                                        default:
                                            reusableGraphicsLayerScope.setTranslationX(walletMetrics3.lowerPanelLeftPx);
                                            reusableGraphicsLayerScope.setTranslationY(walletMetrics3.lowerPanelTopPx);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer4.updateRememberedValue(rememberedValue522);
                            NeverEqualPolicy neverEqualPolicy522 = neverEqualPolicy2;
                            boolean z1522 = false;
                            ImageKt.Image(painterResource322, null, ColorKt.graphicsLayer(align222, (Function1) rememberedValue522), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i922, 120);
                            Modifier clipToBounds22 = ClipKt.clipToBounds(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), walletMetrics2.clipBottomDp));
                            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                            int hashCode222 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope222 = gapComposer4.currentCompositionLocalScope();
                            Modifier materializeModifier222 = PlatformKt.materializeModifier(gapComposer4, clipToBounds22);
                            if (applier != null) {
                            }
                        }
                        z4 = true;
                        z5 = z142 | z4 | ((i6 & 458752) != 131072 || gapComposer4.changedInstance(animatable14));
                        rememberedValue = gapComposer4.rememberedValue();
                        if (z5) {
                        }
                        neverEqualPolicy = neverEqualPolicy4;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        Animatable animatable18222 = animatable15;
                        i3 = i5;
                        i4 = i7;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        walletMetrics2 = walletMetrics;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                        SliderKt$$ExternalSyntheticLambda3 sliderKt$$ExternalSyntheticLambda3222 = new SliderKt$$ExternalSyntheticLambda3(walletMetrics2, animatable18222, animatable5, animatable12, animatable6, animatable13, 9);
                        gapComposer4.updateRememberedValue(sliderKt$$ExternalSyntheticLambda3222);
                        rememberedValue = sliderKt$$ExternalSyntheticLambda3222;
                        Modifier graphicsLayer2222 = ColorKt.graphicsLayer(align, (Function1) rememberedValue);
                        int i9222 = i4 | 48;
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13222 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16222 = composeUiNode$Companion$SetModifier$1;
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13222 = layoutNode$Companion$Constructor$1;
                        ImageKt.Image(painterResource2, null, graphicsLayer2222, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i9222, 120);
                        final int i10222 = 0;
                        Painter painterResource3222 = Countries.painterResource(2131233661, 0, gapComposer4);
                        Modifier align2222 = boxScopeInstance.align(SizeKt.m287sizeVpY3zN4(companion, walletMetrics2.upperPanelWidth, walletMetrics2.upperPanelHeight), biasAlignment);
                        if (i8 != 4) {
                        }
                        Object rememberedValue5222 = gapComposer4.rememberedValue();
                        if (z6) {
                        }
                        rememberedValue5222 = new Function1() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i11222 = i10222;
                                WalletMetrics walletMetrics3 = walletMetrics2;
                                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                                reusableGraphicsLayerScope.getClass();
                                switch (i11222) {
                                    case 0:
                                        reusableGraphicsLayerScope.setTranslationX(walletMetrics3.upperPanelLeftPx);
                                        reusableGraphicsLayerScope.setTranslationY(walletMetrics3.upperPanelTopPx);
                                        break;
                                    default:
                                        reusableGraphicsLayerScope.setTranslationX(walletMetrics3.lowerPanelLeftPx);
                                        reusableGraphicsLayerScope.setTranslationY(walletMetrics3.lowerPanelTopPx);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer4.updateRememberedValue(rememberedValue5222);
                        NeverEqualPolicy neverEqualPolicy5222 = neverEqualPolicy2;
                        boolean z15222 = false;
                        ImageKt.Image(painterResource3222, null, ColorKt.graphicsLayer(align2222, (Function1) rememberedValue5222), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i9222, 120);
                        Modifier clipToBounds222 = ClipKt.clipToBounds(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), walletMetrics2.clipBottomDp));
                        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode2222 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2222 = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier2222 = PlatformKt.materializeModifier(gapComposer4, clipToBounds222);
                        if (applier != null) {
                        }
                    }
                    z2 = true;
                    boolean z132 = z12 | z2;
                    if ((i6 & 57344) != 16384) {
                        z3 = false;
                        boolean z1422 = z132 | z3;
                        if ((i5 & 29360128) != 8388608) {
                        }
                        z4 = true;
                        z5 = z1422 | z4 | ((i6 & 458752) != 131072 || gapComposer4.changedInstance(animatable14));
                        rememberedValue = gapComposer4.rememberedValue();
                        if (z5) {
                        }
                        neverEqualPolicy = neverEqualPolicy4;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        Animatable animatable182222 = animatable15;
                        i3 = i5;
                        i4 = i7;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        walletMetrics2 = walletMetrics;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                        SliderKt$$ExternalSyntheticLambda3 sliderKt$$ExternalSyntheticLambda32222 = new SliderKt$$ExternalSyntheticLambda3(walletMetrics2, animatable182222, animatable5, animatable12, animatable6, animatable13, 9);
                        gapComposer4.updateRememberedValue(sliderKt$$ExternalSyntheticLambda32222);
                        rememberedValue = sliderKt$$ExternalSyntheticLambda32222;
                        Modifier graphicsLayer22222 = ColorKt.graphicsLayer(align, (Function1) rememberedValue);
                        int i92222 = i4 | 48;
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$132222 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$162222 = composeUiNode$Companion$SetModifier$1;
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$132222 = layoutNode$Companion$Constructor$1;
                        ImageKt.Image(painterResource2, null, graphicsLayer22222, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i92222, 120);
                        final int i102222 = 0;
                        Painter painterResource32222 = Countries.painterResource(2131233661, 0, gapComposer4);
                        Modifier align22222 = boxScopeInstance.align(SizeKt.m287sizeVpY3zN4(companion, walletMetrics2.upperPanelWidth, walletMetrics2.upperPanelHeight), biasAlignment);
                        if (i8 != 4) {
                        }
                        Object rememberedValue52222 = gapComposer4.rememberedValue();
                        if (z6) {
                        }
                        rememberedValue52222 = new Function1() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i11222 = i102222;
                                WalletMetrics walletMetrics3 = walletMetrics2;
                                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                                reusableGraphicsLayerScope.getClass();
                                switch (i11222) {
                                    case 0:
                                        reusableGraphicsLayerScope.setTranslationX(walletMetrics3.upperPanelLeftPx);
                                        reusableGraphicsLayerScope.setTranslationY(walletMetrics3.upperPanelTopPx);
                                        break;
                                    default:
                                        reusableGraphicsLayerScope.setTranslationX(walletMetrics3.lowerPanelLeftPx);
                                        reusableGraphicsLayerScope.setTranslationY(walletMetrics3.lowerPanelTopPx);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer4.updateRememberedValue(rememberedValue52222);
                        NeverEqualPolicy neverEqualPolicy52222 = neverEqualPolicy2;
                        boolean z152222 = false;
                        ImageKt.Image(painterResource32222, null, ColorKt.graphicsLayer(align22222, (Function1) rememberedValue52222), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i92222, 120);
                        Modifier clipToBounds2222 = ClipKt.clipToBounds(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), walletMetrics2.clipBottomDp));
                        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode22222 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope22222 = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier22222 = PlatformKt.materializeModifier(gapComposer4, clipToBounds2222);
                        if (applier != null) {
                        }
                    }
                    z3 = true;
                    boolean z14222 = z132 | z3;
                    if ((i5 & 29360128) != 8388608) {
                    }
                    z4 = true;
                    z5 = z14222 | z4 | ((i6 & 458752) != 131072 || gapComposer4.changedInstance(animatable14));
                    rememberedValue = gapComposer4.rememberedValue();
                    if (z5) {
                    }
                    neverEqualPolicy = neverEqualPolicy4;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    Animatable animatable1822222 = animatable15;
                    i3 = i5;
                    i4 = i7;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    walletMetrics2 = walletMetrics;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                    SliderKt$$ExternalSyntheticLambda3 sliderKt$$ExternalSyntheticLambda322222 = new SliderKt$$ExternalSyntheticLambda3(walletMetrics2, animatable1822222, animatable5, animatable12, animatable6, animatable13, 9);
                    gapComposer4.updateRememberedValue(sliderKt$$ExternalSyntheticLambda322222);
                    rememberedValue = sliderKt$$ExternalSyntheticLambda322222;
                    Modifier graphicsLayer222222 = ColorKt.graphicsLayer(align, (Function1) rememberedValue);
                    int i922222 = i4 | 48;
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1322222 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1622222 = composeUiNode$Companion$SetModifier$1;
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1322222 = layoutNode$Companion$Constructor$1;
                    ImageKt.Image(painterResource2, null, graphicsLayer222222, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i922222, 120);
                    final int i1022222 = 0;
                    Painter painterResource322222 = Countries.painterResource(2131233661, 0, gapComposer4);
                    Modifier align222222 = boxScopeInstance.align(SizeKt.m287sizeVpY3zN4(companion, walletMetrics2.upperPanelWidth, walletMetrics2.upperPanelHeight), biasAlignment);
                    if (i8 != 4) {
                    }
                    Object rememberedValue522222 = gapComposer4.rememberedValue();
                    if (z6) {
                    }
                    rememberedValue522222 = new Function1() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i11222 = i1022222;
                            WalletMetrics walletMetrics3 = walletMetrics2;
                            ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                            reusableGraphicsLayerScope.getClass();
                            switch (i11222) {
                                case 0:
                                    reusableGraphicsLayerScope.setTranslationX(walletMetrics3.upperPanelLeftPx);
                                    reusableGraphicsLayerScope.setTranslationY(walletMetrics3.upperPanelTopPx);
                                    break;
                                default:
                                    reusableGraphicsLayerScope.setTranslationX(walletMetrics3.lowerPanelLeftPx);
                                    reusableGraphicsLayerScope.setTranslationY(walletMetrics3.lowerPanelTopPx);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer4.updateRememberedValue(rememberedValue522222);
                    NeverEqualPolicy neverEqualPolicy522222 = neverEqualPolicy2;
                    boolean z1522222 = false;
                    ImageKt.Image(painterResource322222, null, ColorKt.graphicsLayer(align222222, (Function1) rememberedValue522222), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i922222, 120);
                    Modifier clipToBounds22222 = ClipKt.clipToBounds(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), walletMetrics2.clipBottomDp));
                    MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode222222 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope222222 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier222222 = PlatformKt.materializeModifier(gapComposer4, clipToBounds22222);
                    if (applier != null) {
                    }
                }
            } else {
                animatable15 = animatable11;
            }
            z = true;
            boolean z122 = z11 | z;
            if ((i5 & 3670016) != 1048576) {
                z2 = false;
                boolean z1322 = z122 | z2;
                if ((i6 & 57344) != 16384) {
                }
                z3 = true;
                boolean z142222 = z1322 | z3;
                if ((i5 & 29360128) != 8388608) {
                }
                z4 = true;
                z5 = z142222 | z4 | ((i6 & 458752) != 131072 || gapComposer4.changedInstance(animatable14));
                rememberedValue = gapComposer4.rememberedValue();
                if (z5) {
                }
                neverEqualPolicy = neverEqualPolicy4;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                Animatable animatable18222222 = animatable15;
                i3 = i5;
                i4 = i7;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                walletMetrics2 = walletMetrics;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                SliderKt$$ExternalSyntheticLambda3 sliderKt$$ExternalSyntheticLambda3222222 = new SliderKt$$ExternalSyntheticLambda3(walletMetrics2, animatable18222222, animatable5, animatable12, animatable6, animatable13, 9);
                gapComposer4.updateRememberedValue(sliderKt$$ExternalSyntheticLambda3222222);
                rememberedValue = sliderKt$$ExternalSyntheticLambda3222222;
                Modifier graphicsLayer2222222 = ColorKt.graphicsLayer(align, (Function1) rememberedValue);
                int i9222222 = i4 | 48;
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13222222 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16222222 = composeUiNode$Companion$SetModifier$1;
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13222222 = layoutNode$Companion$Constructor$1;
                ImageKt.Image(painterResource2, null, graphicsLayer2222222, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i9222222, 120);
                final int i10222222 = 0;
                Painter painterResource3222222 = Countries.painterResource(2131233661, 0, gapComposer4);
                Modifier align2222222 = boxScopeInstance.align(SizeKt.m287sizeVpY3zN4(companion, walletMetrics2.upperPanelWidth, walletMetrics2.upperPanelHeight), biasAlignment);
                if (i8 != 4) {
                }
                Object rememberedValue5222222 = gapComposer4.rememberedValue();
                if (z6) {
                }
                rememberedValue5222222 = new Function1() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i11222 = i10222222;
                        WalletMetrics walletMetrics3 = walletMetrics2;
                        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                        reusableGraphicsLayerScope.getClass();
                        switch (i11222) {
                            case 0:
                                reusableGraphicsLayerScope.setTranslationX(walletMetrics3.upperPanelLeftPx);
                                reusableGraphicsLayerScope.setTranslationY(walletMetrics3.upperPanelTopPx);
                                break;
                            default:
                                reusableGraphicsLayerScope.setTranslationX(walletMetrics3.lowerPanelLeftPx);
                                reusableGraphicsLayerScope.setTranslationY(walletMetrics3.lowerPanelTopPx);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer4.updateRememberedValue(rememberedValue5222222);
                NeverEqualPolicy neverEqualPolicy5222222 = neverEqualPolicy2;
                boolean z15222222 = false;
                ImageKt.Image(painterResource3222222, null, ColorKt.graphicsLayer(align2222222, (Function1) rememberedValue5222222), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i9222222, 120);
                Modifier clipToBounds222222 = ClipKt.clipToBounds(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), walletMetrics2.clipBottomDp));
                MeasurePolicy maybeCachedBoxMeasurePolicy2222222 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode2222222 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2222222 = gapComposer4.currentCompositionLocalScope();
                Modifier materializeModifier2222222 = PlatformKt.materializeModifier(gapComposer4, clipToBounds222222);
                if (applier != null) {
                }
            }
            z2 = true;
            boolean z13222 = z122 | z2;
            if ((i6 & 57344) != 16384) {
            }
            z3 = true;
            boolean z1422222 = z13222 | z3;
            if ((i5 & 29360128) != 8388608) {
            }
            z4 = true;
            z5 = z1422222 | z4 | ((i6 & 458752) != 131072 || gapComposer4.changedInstance(animatable14));
            rememberedValue = gapComposer4.rememberedValue();
            if (z5) {
            }
            neverEqualPolicy = neverEqualPolicy4;
            layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
            Animatable animatable182222222 = animatable15;
            i3 = i5;
            i4 = i7;
            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
            walletMetrics2 = walletMetrics;
            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
            SliderKt$$ExternalSyntheticLambda3 sliderKt$$ExternalSyntheticLambda32222222 = new SliderKt$$ExternalSyntheticLambda3(walletMetrics2, animatable182222222, animatable5, animatable12, animatable6, animatable13, 9);
            gapComposer4.updateRememberedValue(sliderKt$$ExternalSyntheticLambda32222222);
            rememberedValue = sliderKt$$ExternalSyntheticLambda32222222;
            Modifier graphicsLayer22222222 = ColorKt.graphicsLayer(align, (Function1) rememberedValue);
            int i92222222 = i4 | 48;
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$132222222 = ownerSnapshotObserver$onCommitAffectingLayout$1;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$162222222 = composeUiNode$Companion$SetModifier$1;
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$132222222 = layoutNode$Companion$Constructor$1;
            ImageKt.Image(painterResource2, null, graphicsLayer22222222, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i92222222, 120);
            final int i102222222 = 0;
            Painter painterResource32222222 = Countries.painterResource(2131233661, 0, gapComposer4);
            Modifier align22222222 = boxScopeInstance.align(SizeKt.m287sizeVpY3zN4(companion, walletMetrics2.upperPanelWidth, walletMetrics2.upperPanelHeight), biasAlignment);
            if (i8 != 4) {
            }
            Object rememberedValue52222222 = gapComposer4.rememberedValue();
            if (z6) {
            }
            rememberedValue52222222 = new Function1() { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i11222 = i102222222;
                    WalletMetrics walletMetrics3 = walletMetrics2;
                    ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                    reusableGraphicsLayerScope.getClass();
                    switch (i11222) {
                        case 0:
                            reusableGraphicsLayerScope.setTranslationX(walletMetrics3.upperPanelLeftPx);
                            reusableGraphicsLayerScope.setTranslationY(walletMetrics3.upperPanelTopPx);
                            break;
                        default:
                            reusableGraphicsLayerScope.setTranslationX(walletMetrics3.lowerPanelLeftPx);
                            reusableGraphicsLayerScope.setTranslationY(walletMetrics3.lowerPanelTopPx);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer4.updateRememberedValue(rememberedValue52222222);
            NeverEqualPolicy neverEqualPolicy52222222 = neverEqualPolicy2;
            boolean z152222222 = false;
            ImageKt.Image(painterResource32222222, null, ColorKt.graphicsLayer(align22222222, (Function1) rememberedValue52222222), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer4, i92222222, 120);
            Modifier clipToBounds2222222 = ClipKt.clipToBounds(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), walletMetrics2.clipBottomDp));
            MeasurePolicy maybeCachedBoxMeasurePolicy22222222 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode22222222 = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope22222222 = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier22222222 = PlatformKt.materializeModifier(gapComposer4, clipToBounds2222222);
            if (applier != null) {
            }
        } else {
            walletMetrics2 = walletMetrics;
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(i, animatable, animatable2, animatable3, animatable4, animatable5, animatable6, animatable7, animatable8, animatable9, animatable10, j, animatable11, animatable12, animatable13, f, function3, i2) { // from class: com.squareup.cash.family.familyhub.views.U13CelebrationViewKt$$ExternalSyntheticLambda17
                public final /* synthetic */ int f$1;
                public final /* synthetic */ Animatable f$10;
                public final /* synthetic */ Animatable f$11;
                public final /* synthetic */ long f$12;
                public final /* synthetic */ Animatable f$13;
                public final /* synthetic */ Animatable f$14;
                public final /* synthetic */ Animatable f$15;
                public final /* synthetic */ float f$16;
                public final /* synthetic */ Function3 f$17;
                public final /* synthetic */ Animatable f$2;
                public final /* synthetic */ Animatable f$3;
                public final /* synthetic */ Animatable f$4;
                public final /* synthetic */ Animatable f$5;
                public final /* synthetic */ Animatable f$6;
                public final /* synthetic */ Animatable f$7;
                public final /* synthetic */ Animatable f$8;
                public final /* synthetic */ Animatable f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1227133441);
                    AllowanceViewKt.m3534WalletLayersIXbI2m4(WalletMetrics.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, this.f$16, this.f$17, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(3:(1:(1:(6:13|14|15|16|17|18)(2:24|25))(7:26|27|28|29|30|(4:33|16|17|18)|32))(6:40|41|42|43|44|(2:46|32)(4:47|30|(0)|32))|22|23)(1:51))(3:57|(1:59)|32)|52|53|(2:55|32)(3:56|44|(0)(0))))|60|6|7|(0)(0)|52|53|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0133, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0134, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$U13CelebrationHero$lambda$29$cycleCard(Mutex mutex, Animatable animatable, WalletMetrics walletMetrics, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ContinuationImpl continuationImpl) {
        U13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1 u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1;
        U13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1 u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        Mutex mutex2;
        WalletMetrics walletMetrics2;
        Animatable animatable2;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2;
        int i2;
        Float f;
        TweenSpec tween$default;
        WalletMetrics walletMetrics3;
        Animatable animatable3;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3;
        int i3;
        int i4;
        Mutex mutex3;
        Object animateTo$default;
        if (continuationImpl instanceof U13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1) {
            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1 = (U13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1) continuationImpl;
            int i5 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1.label;
            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1.label = i5 - PKIFailureInfo.systemUnavail;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1;
                Object obj = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.label;
                int i6 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$1 = animatable;
                    u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$2 = walletMetrics;
                    u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$3 = parcelableSnapshotMutableIntState;
                    u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$4 = mutex;
                    u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$0 = 0;
                    u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.label = 1;
                    if (mutex.lock(u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12) != coroutineSingletons) {
                        mutex2 = mutex;
                        walletMetrics2 = walletMetrics;
                        animatable2 = animatable;
                        parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        i6 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$1;
                        int i7 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$0;
                        Mutex mutex4 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$4;
                        parcelableSnapshotMutableIntState3 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$3;
                        walletMetrics3 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$2;
                        animatable3 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$1;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            mutex2 = mutex4;
                            i3 = i7;
                            parcelableSnapshotMutableIntState3.setIntValue((parcelableSnapshotMutableIntState3.getIntValue() + 1) % 8);
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$1 = animatable3;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$2 = walletMetrics3;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$3 = null;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$4 = mutex2;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$0 = i3;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$1 = i6;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.label = 3;
                            if (JobKt.delay(70L, u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12) != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            i4 = i6;
                            Float f2 = new Float(walletMetrics3.cardRestTopPx);
                            SpringSpec spring$default = AnimatableKt.spring$default(0.78f, 520.0f, null, 4);
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$1 = null;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$2 = null;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$3 = null;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$4 = mutex2;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$0 = i3;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$1 = i4;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.label = 4;
                            animateTo$default = Animatable.animateTo$default(animatable3, f2, spring$default, null, null, u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12, 12);
                            if (animateTo$default != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        } catch (Throwable th) {
                            th = th;
                            mutex3 = mutex4;
                        }
                    } else if (i == 3) {
                        i4 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$1;
                        i3 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$0;
                        Mutex mutex5 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$4;
                        walletMetrics3 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$2;
                        animatable3 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$1;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            mutex2 = mutex5;
                            Float f22 = new Float(walletMetrics3.cardRestTopPx);
                            SpringSpec spring$default2 = AnimatableKt.spring$default(0.78f, 520.0f, null, 4);
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$1 = null;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$2 = null;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$3 = null;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$4 = mutex2;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$0 = i3;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$1 = i4;
                            u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.label = 4;
                            animateTo$default = Animatable.animateTo$default(animatable3, f22, spring$default2, null, null, u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12, 12);
                            if (animateTo$default != coroutineSingletons) {
                                mutex3 = mutex2;
                                obj = animateTo$default;
                                mutex3.unlock(null);
                                return Unit.INSTANCE;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex3 = mutex5;
                        }
                    } else {
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex3 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$4;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            mutex3.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    mutex3.unlock(null);
                    throw th;
                }
                int i8 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$0;
                Mutex mutex6 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$4;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$3;
                WalletMetrics walletMetrics4 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$2;
                Animatable animatable4 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$1;
                SafeTrace.throwOnFailure(obj);
                mutex2 = mutex6;
                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState4;
                animatable2 = animatable4;
                i2 = i8;
                walletMetrics2 = walletMetrics4;
                f = new Float(walletMetrics2.cardCycleHiddenTopPx);
                tween$default = AnimatableKt.tween$default(200, 0, EasingKt.FastOutLinearInEasing, 2);
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$1 = animatable2;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$2 = walletMetrics2;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$3 = parcelableSnapshotMutableIntState2;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$4 = mutex2;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$0 = i2;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$1 = 0;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.label = 2;
                int i9 = i2;
                if (Animatable.animateTo$default(animatable2, f, tween$default, null, null, u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12, 12) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                walletMetrics3 = walletMetrics2;
                animatable3 = animatable2;
                parcelableSnapshotMutableIntState3 = parcelableSnapshotMutableIntState2;
                i3 = i9;
                parcelableSnapshotMutableIntState3.setIntValue((parcelableSnapshotMutableIntState3.getIntValue() + 1) % 8);
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$1 = animatable3;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$2 = walletMetrics3;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$3 = null;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$4 = mutex2;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$0 = i3;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$1 = i6;
                u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.label = 3;
                if (JobKt.delay(70L, u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12) != coroutineSingletons) {
                }
            }
        }
        u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1 = new U13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1(continuationImpl);
        u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1;
        Object obj2 = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.label;
        int i62 = 0;
        if (i != 0) {
        }
        f = new Float(walletMetrics2.cardCycleHiddenTopPx);
        tween$default = AnimatableKt.tween$default(200, 0, EasingKt.FastOutLinearInEasing, 2);
        u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$1 = animatable2;
        u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$2 = walletMetrics2;
        u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$3 = parcelableSnapshotMutableIntState2;
        u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.L$4 = mutex2;
        u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$0 = i2;
        u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.I$1 = 0;
        u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12.label = 2;
        int i92 = i2;
        if (Animatable.animateTo$default(animatable2, f, tween$default, null, null, u13CelebrationViewKt$U13CelebrationHero$1$cycleCard$12, 12) != coroutineSingletons) {
        }
    }

    public static final float access$randomFloat(float f, float f2) {
        Random.Default.getClass();
        return (float) Random.defaultRandom.nextDouble(f, f2);
    }

    public static final Modifier disabledClickable(Modifier modifier, boolean z, Function0 function0) {
        modifier.getClass();
        function0.getClass();
        return modifier.then(new DisabledClickableElement(function0, z));
    }
}
