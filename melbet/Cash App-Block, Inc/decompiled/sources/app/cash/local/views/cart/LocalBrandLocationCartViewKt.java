package app.cash.local.views.cart;

import android.icu.text.MessageFormat;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda1;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
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
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.viewmodels.AppliedCouponBanner;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import app.cash.local.viewmodels.ComboSlotViewModel;
import app.cash.local.viewmodels.FreeDeliveryMeter;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.OrderLimitBanner;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.local.viewmodels.internal.Amount;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.internal.LocalViewsKt$$ExternalSyntheticLambda2;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.n$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzc;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackLayoutWeightElement;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.moneybot.widgets.FloatingChatInputKt$$ExternalSyntheticLambda8;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LocalBrandLocationCartViewKt {
    public static final void AppliedCouponBannerView(AppliedCouponBanner appliedCouponBanner, Function0 function0, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Color m;
        long j;
        Throwable th;
        Color m2;
        long j2;
        AppliedCouponBanner appliedCouponBanner2 = appliedCouponBanner;
        Function0 function02 = function0;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1760662043);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(appliedCouponBanner2) ? 4 : 2) | (gapComposer2.changedInstance(function02) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            long j3 = Strings.getColors(gapComposer2).semantic.background.f1047app;
            long j4 = Strings.getColors(gapComposer2).semantic.border.subtle;
            LocalColor localColor = appliedCouponBanner2.backgroundColor;
            if (localColor == null) {
                gapComposer2.startReplaceGroup(1742612278);
                gapComposer2.end(false);
                m = null;
            } else {
                gapComposer2.startReplaceGroup(-220881365);
                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, LocalViewsKt.toComposeColor(localColor, gapComposer2, 0));
            }
            if (m == null) {
                gapComposer2.startReplaceGroup(-220879488);
                j = Strings.getColors(gapComposer2).semantic.background.brand;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-220882061);
                gapComposer2.end(false);
                j = m.value;
            }
            LocalColor localColor2 = appliedCouponBanner2.foregroundColor;
            if (localColor2 == null) {
                gapComposer2.startReplaceGroup(1742732310);
                gapComposer2.end(false);
                th = null;
                m2 = null;
            } else {
                th = null;
                gapComposer2.startReplaceGroup(-220877493);
                m2 = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, LocalViewsKt.toComposeColor(localColor2, gapComposer2, 0));
            }
            if (m2 == null) {
                gapComposer2.startReplaceGroup(-220875806);
                j2 = Strings.getColors(gapComposer2).semantic.icon.inverse;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-220878193);
                gapComposer2.end(false);
                j2 = m2.value;
            }
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(modifier, 1.0f), j3, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(18.0f)), 1.0f, j4, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(18.0f)), 12.0f, 12.0f, 16.0f, 12.0f);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer2, 54);
            long j5 = j2;
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw th;
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m1325borderIfWhiteiJQMabo = LocalViewsKt.m1325borderIfWhiteiJQMabo(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 40.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f)), j, ColorKt.RectangleShape), j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f), gapComposer2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m1325borderIfWhiteiJQMabo);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ImageKt.Image(Icons.DiscountTag16.painter(gapComposer2), null, SizeKt.m285size3ABfNKs(companion, 16.0f), null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j5, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j5), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 432, 56);
            gapComposer2.end(true);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, false, new StreamSharing$$ExternalSyntheticLambda1(vertical, 17)), Alignment.Companion.Start, gapComposer2, 6);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, layoutWeightElement);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            appliedCouponBanner2 = appliedCouponBanner;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).labelSmall, (TextLineBalancing) null, appliedCouponBanner2.label, (Map) null, (Function1) null, false);
            String str = appliedCouponBanner2.code;
            str.getClass();
            String format2 = new MessageFormat(Room.stringResource(gapComposer2, R.string.local_views_coupon_applied_at_checkout)).format(new Object[]{str});
            format2.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
            gapComposer2.end(true);
            function02 = function0;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, function02, 15), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).bodySmall, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.Underline, null, null, 0, 0L, null, null, 0, 16773119), (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.local_views_offer_terms), (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(appliedCouponBanner2, function02, modifier, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0288, code lost:
    
        if (r4 == r3) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CartSelectionItem(LocalBrandLocationCartViewModel.Selection selection, Function1 function1, Composer composer, int i) {
        Modifier.Companion companion;
        NeverEqualPolicy neverEqualPolicy;
        Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2096688051);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(selection) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            boolean changedInstance = (i3 == 32) | gapComposer.changedInstance(selection);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new n$$ExternalSyntheticLambda0(1, function1, selection);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue, 15), RecyclerView.DECELERATION_RATE, 16.0f, 1), 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, Alignment.Companion.Top, gapComposer, 54);
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
            LocalImage localImage = selection.image;
            ArrayList arrayList = selection.errors;
            SelectionImage(localImage, gapComposer, 0);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.m279heightInVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 86.0f, RecyclerView.DECELERATION_RATE, 2), true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, Alignment.Companion.Start, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) companion2, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, selection.label, (Map) null, (Function1) null, false);
            String str = selection.information;
            if (str == null) {
                gapComposer.startReplaceGroup(-1103023948);
                gapComposer.end(false);
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(-1103023947);
                companion = companion2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) companion, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(-1421046752);
            ArrayList arrayList2 = selection.slots;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                ComboSlotViewModel comboSlotViewModel = (ComboSlotViewModel) arrayList2.get(i4);
                if (i4 == 0) {
                    re$$ExternalSyntheticOutline0.m(gapComposer, 918975164, companion, 8.0f, gapComposer);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(919034746);
                    gapComposer.end(false);
                }
                SelectionSlotView(SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, 1), comboSlotViewModel, function1, gapComposer, ((i2 << 3) & 896) | 6);
            }
            gapComposer.end(false);
            String str2 = selection.discountText;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1102475217);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1102475216);
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 4.0f));
                LocalMapKt.LocalDiscountText(null, str2, null, new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), gapComposer, 3072, 5);
                gapComposer.end(false);
            }
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 1.0f);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$Center$1, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
            CartItemCounterViewModel cartItemCounterViewModel = selection.counterModel;
            boolean changedInstance2 = gapComposer.changedInstance(selection) | (i3 == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2) {
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
            }
            rememberedValue2 = new RealBadger2$$ExternalSyntheticLambda0(18, function1, selection);
            gapComposer.updateRememberedValue(rememberedValue2);
            LocalMapKt.CartItemCounterView(null, cartItemCounterViewModel, (Function1) rememberedValue2, null, null, gapComposer, 0, 57);
            if (!(((double) 1.0f) > 0.0d)) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            AnimatedContentKt.AnimatedVisibility(selection.totalPriceBeforeDiscountAmount != null, (Modifier) null, (EnterTransitionImpl) null, (ExitTransitionImpl) null, (String) null, Expect_jvmKt.rememberComposableLambda(-388405559, new SliderDefaults$$ExternalSyntheticLambda3(selection, 15), gapComposer), (Composer) gapComposer, 1572870, 30);
            boolean changedInstance3 = gapComposer.changedInstance(selection);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CachedPageEventFlow$$ExternalSyntheticLambda0(selection, 25);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue3);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
            Amount amount = selection.totalPriceAmount;
            AnimatedAmountTextView.Amount amount2 = new AnimatedAmountTextView.Amount(amount.amount, 1L, amount.text);
            Modifier.Companion companion3 = companion;
            VisibleKt.m3482AnimatedAmountTextJDMA8c0(semantics, textStyle, j, 6, amount2, null, false, 0L, gapComposer, 0, 224);
            gapComposer = gapComposer;
            gapComposer.end(true);
            if (arrayList.isEmpty()) {
                gapComposer.startReplaceGroup(-1100597515);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1100828155);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion3, 16.0f, gapComposer);
                CartBannerViewKt.CreateCartErrorBanners(((i2 << 3) & 896) | 6, gapComposer, SizeKt.fillMaxWidth(companion3, 1.0f), arrayList, function1);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(selection, function1, i, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    public static final void FulfillmentSectionItem(LocalBrandLocationCartViewModel.Fulfillment fulfillment, List list, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        NeverEqualPolicy neverEqualPolicy;
        String format2;
        boolean z;
        Painter painter;
        Modifier.Companion companion;
        GapComposer gapComposer2;
        LocalFulfillmentType localFulfillmentType;
        ?? r0;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-641829846);
        Applier applier = gapComposer3.applier;
        int i2 = i | (gapComposer3.changedInstance(fulfillment) ? 4 : 2) | (gapComposer3.changedInstance(list) ? 32 : 16) | (gapComposer3.changedInstance(function1) ? 256 : 128);
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            LocalFulfillment.SchedulingDetails.SchedulingMode selectedSchedulingMode = fulfillment.getSelectedSchedulingMode();
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy2) {
                neverEqualPolicy = neverEqualPolicy2;
                rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(24, function1);
                gapComposer3.updateRememberedValue(rememberedValue);
            } else {
                neverEqualPolicy = neverEqualPolicy2;
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(fillMaxWidth2, false, null, null, (Function0) rememberedValue, 15);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m183clickableoSLSa3U$default);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion2, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
            int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth3);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            boolean z3 = fulfillment instanceof LocalBrandLocationCartViewModel.Fulfillment.Delivery;
            if (z3) {
                gapComposer3.startReplaceGroup(957109660);
                String str = ((LocalBrandLocationCartViewModel.Fulfillment.Delivery) fulfillment).address;
                str.getClass();
                format2 = new MessageFormat(Room.stringResource(gapComposer3, R.string.local_views_fulfillment_delivery_to)).format(new Object[]{str});
                format2.getClass();
                gapComposer3.end(false);
                z = false;
            } else {
                if (!(fulfillment instanceof LocalBrandLocationCartViewModel.Fulfillment.Pickup)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 957107801, false);
                }
                gapComposer3.startReplaceGroup(957115258);
                format2 = new MessageFormat(Room.stringResource(gapComposer3, R.string.local_views_fulfillment_pickup_at)).format(new Object[]{((LocalBrandLocationCartViewModel.Fulfillment.Pickup) fulfillment).address});
                format2.getClass();
                z = false;
                gapComposer3.end(false);
            }
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, (Modifier) m, Strings.getTypography(gapComposer3).labelMedium, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
            GapComposer gapComposer4 = gapComposer3;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion2, 24.0f);
            if (fulfillment.isExpanded()) {
                gapComposer4.startReplaceGroup(-393816152);
                painter = Icons.CollapseCentered24.painter(gapComposer4);
                gapComposer4.end(false);
            } else {
                gapComposer4.startReplaceGroup(-393746774);
                painter = Icons.ExpandCentered24.painter(gapComposer4);
                gapComposer4.end(false);
            }
            long j = Strings.getColors(gapComposer4).semantic.text.standard;
            ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer4, Painter.$stable | 25008, 40);
            gapComposer4.end(true);
            LocalText selectedEstimatedCompletion = fulfillment.getSelectedEstimatedCompletion();
            if (selectedEstimatedCompletion == null) {
                gapComposer4.startReplaceGroup(-1451889411);
                gapComposer4.end(false);
                companion = companion2;
                gapComposer2 = gapComposer4;
            } else {
                gapComposer4.startReplaceGroup(-1451889410);
                companion = companion2;
                Room.m1164Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer4).semantic.text.subtle, (Composer) gapComposer4, (Modifier) companion, LocalViewsKt.toAnnotatedString(selectedEstimatedCompletion, gapComposer4), Strings.getTypography(gapComposer4).bodySmall, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                GapComposer gapComposer5 = gapComposer4;
                gapComposer5.end(false);
                gapComposer2 = gapComposer5;
            }
            gapComposer2.end(true);
            function12 = function1;
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, fulfillment.isExpanded(), null, null, null, null, Expect_jvmKt.rememberComposableLambda(1377864440, new LocalViewFactory$$ExternalSyntheticLambda6(8, fulfillment, selectedSchedulingMode, function12), gapComposer2), gapComposer2, 1572870, 30);
            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 16.0f));
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer2, 6);
            int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, companion);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$14);
            boolean z4 = i3 == 256;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z4 || rememberedValue2 == neverEqualPolicy3) {
                rememberedValue2 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(25, function12);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue2, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1993871748, new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda35(fulfillment, 0), gapComposer2), gapComposer2, 1572864, 62);
            if (z3) {
                localFulfillmentType = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP;
            } else {
                if (!(fulfillment instanceof LocalBrandLocationCartViewModel.Fulfillment.Pickup)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                localFulfillmentType = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY;
            }
            boolean changed = gapComposer2.changed(localFulfillmentType.ordinal());
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy3) {
                rememberedValue3 = Boolean.valueOf(list.contains(localFulfillmentType));
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            if (((Boolean) rememberedValue3).booleanValue()) {
                gapComposer2.startReplaceGroup(1883810934);
                boolean changed2 = gapComposer2.changed(localFulfillmentType.ordinal()) | (i3 == 256);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue4 == neverEqualPolicy3) {
                    r0 = 0;
                    rememberedValue4 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda36(function12, localFulfillmentType, 0);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                } else {
                    r0 = 0;
                }
                coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue4, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(2073995735, new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda37(localFulfillmentType, r0), gapComposer2), gapComposer2, 1572864, 62);
                gapComposer2.end(r0);
            } else {
                gapComposer2.startReplaceGroup(1884279902);
                gapComposer2.end(false);
            }
            gapComposer2.end(true);
            gapComposer2.end(true);
            gapComposer = gapComposer2;
        } else {
            function12 = function1;
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(fulfillment, list, function12, i, 25);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalBrandLocationCartView(Modifier modifier, final LocalBrandLocationCartViewModel localBrandLocationCartViewModel, final Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        NeverEqualPolicy neverEqualPolicy;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z;
        LocalBrandBannerModel localBrandBannerModel;
        float f;
        Function1 function12;
        boolean z2;
        boolean z3;
        Modifier.Companion companion;
        modifier.getClass();
        localBrandLocationCartViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-651767776);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(localBrandLocationCartViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            LocalBrandLocationCartViewModel.Mode mode = localBrandLocationCartViewModel.mode;
            List list = localBrandLocationCartViewModel.selections;
            boolean z4 = mode == LocalBrandLocationCartViewModel.Mode.CART;
            boolean z5 = mode == LocalBrandLocationCartViewModel.Mode.ADD_TO_OPEN_TAB;
            boolean z6 = z5 && !list.isEmpty();
            boolean z7 = z5 && list.isEmpty();
            boolean z8 = z7 && localBrandLocationCartViewModel.openTabItemCount > 0;
            boolean z9 = z4 && localBrandLocationCartViewModel.fulfillment != null;
            List list2 = localBrandLocationCartViewModel.placeOrderErrors;
            if (list2.isEmpty()) {
                list2 = localBrandLocationCartViewModel.errors;
            }
            final List list3 = list2;
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                i3 += ((LocalBrandLocationCartViewModel.Selection) it.next()).counterModel.quantity;
            }
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            final boolean z10 = z4;
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
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
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            final boolean z11 = z8;
            final boolean z12 = z9;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier then = fillMaxWidth.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, then);
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
            ToolbarModel toolbarModel = new ToolbarModel(localBrandLocationCartViewModel.title);
            int i4 = i2 & 896;
            boolean z13 = i4 == 256;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (z13 || rememberedValue == neverEqualPolicy3) {
                rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(0, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            LocalToolbarKt.m1333LocalToolbarflo8M7A(companion2, toolbarModel, null, (Function0) rememberedValue, RecyclerView.DECELERATION_RATE, null, gapComposer2, 6, 108);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier then2 = fillMaxWidth2.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean changedInstance = gapComposer2.changedInstance(localBrandLocationCartViewModel) | (i4 == 256) | gapComposer2.changedInstance(list3) | gapComposer2.changed(z11) | gapComposer2.changed(z12) | gapComposer2.changed(z10);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance) {
                neverEqualPolicy = neverEqualPolicy3;
            } else {
                neverEqualPolicy = neverEqualPolicy3;
                if (rememberedValue2 != neverEqualPolicy) {
                    z = z10;
                    neverEqualPolicy2 = neverEqualPolicy;
                    LazyDslKt.LazyColumn(then2, null, m295PaddingValuesYgX7TsA$default, null, null, null, false, null, (Function1) rememberedValue2, gapComposer2, MLKEMEngine.KyberPolyBytes, 506);
                    gapComposer = gapComposer2;
                    gapComposer.end(true);
                    localBrandBannerModel = localBrandLocationCartViewModel.banner;
                    if (localBrandBannerModel != null) {
                        gapComposer.startReplaceGroup(207706779);
                        z2 = false;
                        gapComposer.end(false);
                        function12 = function1;
                        f = 16.0f;
                    } else {
                        gapComposer.startReplaceGroup(207706780);
                        if (1.0f <= 0.0d) {
                            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                            return;
                        }
                        f = 16.0f;
                        function12 = function1;
                        LocalMapKt.LocalBrandBanner(SpacerKt.m301paddingqDBjuR0(new AdaptiveStackLayoutWeightElement(1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE), localBrandBannerModel, function12, gapComposer, i4 | 6);
                        z2 = false;
                        gapComposer.end(false);
                    }
                    if (z5) {
                        z3 = z2;
                        companion = companion2;
                        gapComposer.startReplaceGroup(208380844);
                        gapComposer.end(z3);
                    } else {
                        gapComposer.startReplaceGroup(-686026732);
                        LocalBrandLocationCartViewModel.OpenTabBanner openTabBanner = localBrandLocationCartViewModel.openTabBanner;
                        if (openTabBanner == null) {
                            gapComposer.startReplaceGroup(208007789);
                            gapComposer.end(z2);
                            z3 = z2;
                            companion = companion2;
                        } else {
                            gapComposer.startReplaceGroup(208007790);
                            companion = companion2;
                            Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(fillMaxWidth3, f, 12.0f, f, 12.0f);
                            boolean z14 = i4 == 256;
                            Object rememberedValue3 = gapComposer.rememberedValue();
                            if (z14 || rememberedValue3 == neverEqualPolicy2) {
                                rememberedValue3 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(26, function12);
                                gapComposer.updateRememberedValue(rememberedValue3);
                            }
                            z3 = false;
                            OpenTabBannerView(m301paddingqDBjuR0, openTabBanner, (Function0) rememberedValue3, gapComposer, 0);
                            gapComposer.end(false);
                        }
                        gapComposer.end(z3);
                    }
                    if (!z || z5) {
                        gapComposer.startReplaceGroup(208502054);
                        final Function1 function13 = function12;
                        final boolean z15 = z6;
                        final boolean z16 = z7;
                        final int i5 = i3;
                        final boolean z17 = z;
                        DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(-679758102, new Function3() { // from class: app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                GapComposer gapComposer3;
                                Function1 function14;
                                NeverEqualPolicy neverEqualPolicy4;
                                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                adaptiveStackScope.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                                }
                                int i6 = 1;
                                GapComposer gapComposer4 = (GapComposer) composer2;
                                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                                    final boolean z18 = z15;
                                    Function1 function15 = function13;
                                    NeverEqualPolicy neverEqualPolicy5 = Composer.Companion.Empty;
                                    if (z18) {
                                        gapComposer3 = gapComposer4;
                                        function14 = function15;
                                        neverEqualPolicy4 = neverEqualPolicy5;
                                        gapComposer3.startReplaceGroup(97683928);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer4.startReplaceGroup(97250145);
                                        Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion3, 1.0f);
                                        boolean changed = gapComposer4.changed(function15);
                                        Object rememberedValue4 = gapComposer4.rememberedValue();
                                        if (changed || rememberedValue4 == neverEqualPolicy5) {
                                            rememberedValue4 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(21, function15);
                                            gapComposer4.updateRememberedValue(rememberedValue4);
                                        }
                                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-450270550, new MoneyTabUIKt$$ExternalSyntheticLambda38(z17, i6), gapComposer4);
                                        neverEqualPolicy4 = neverEqualPolicy5;
                                        function14 = function15;
                                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, horizontalWeight, null, false, false, null, rememberComposableLambda, gapComposer4, 1572864, 60);
                                        gapComposer3 = gapComposer4;
                                        gapComposer3.end(false);
                                    }
                                    Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion3, 1.0f);
                                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                                    final LocalBrandLocationCartViewModel localBrandLocationCartViewModel2 = localBrandLocationCartViewModel;
                                    boolean z19 = localBrandLocationCartViewModel2.isCheckoutEnabled;
                                    boolean changed2 = gapComposer3.changed(function14);
                                    final boolean z20 = z16;
                                    boolean changed3 = changed2 | gapComposer3.changed(z20);
                                    Object rememberedValue5 = gapComposer3.rememberedValue();
                                    if (changed3 || rememberedValue5 == neverEqualPolicy4) {
                                        rememberedValue5 = new ToggleableNode$$ExternalSyntheticLambda1(function14, z20, 2);
                                        gapComposer3.updateRememberedValue(rememberedValue5);
                                    }
                                    final int i7 = i5;
                                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue5, horizontalWeight2, buttonProminence, false, z19, null, Expect_jvmKt.rememberComposableLambda(2059889637, new Function3() { // from class: app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda20
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i8;
                                            int i9;
                                            String m;
                                            Composer composer3 = (Composer) obj5;
                                            int intValue2 = ((Integer) obj6).intValue();
                                            ((RowScope) obj4).getClass();
                                            GapComposer gapComposer5 = (GapComposer) composer3;
                                            if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                                                int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                                                Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                                                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, companion4);
                                                ComposeUiNode.Companion.getClass();
                                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
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
                                                Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                Updater.m576setimpl(gapComposer5, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                                                if (z18) {
                                                    gapComposer5.startReplaceGroup(-1577157532);
                                                    m = new MessageFormat(Room.stringResource(gapComposer5, R.string.local_views_add_items_to_tab)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i7), "count"));
                                                    m.getClass();
                                                    gapComposer5.end(false);
                                                } else {
                                                    if (z20) {
                                                        i8 = -1577151854;
                                                        i9 = R.string.local_views_finish_and_pay;
                                                    } else {
                                                        i8 = -1577149300;
                                                        i9 = R.string.local_views_checkout;
                                                    }
                                                    m = re$$ExternalSyntheticOutline0.m(gapComposer5, i8, i9, gapComposer5, false);
                                                }
                                                String str = m;
                                                LocalBrandLocationCartViewModel localBrandLocationCartViewModel3 = localBrandLocationCartViewModel2;
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer5, AlphaKt.alpha(companion4, localBrandLocationCartViewModel3.isLoading ? RecyclerView.DECELERATION_RATE : 1.0f), (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                                if (localBrandLocationCartViewModel3.isLoading) {
                                                    gapComposer5.startReplaceGroup(-1646604882);
                                                    DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer5.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
                                                    if (delegatingSoftwareKeyboardController != null) {
                                                        delegatingSoftwareKeyboardController.hide();
                                                    }
                                                    Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                                                    if (colors == null) {
                                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                                                    } else {
                                                        gapComposer5.startReplaceGroup(-1762997739);
                                                        gapComposer5.end(false);
                                                    }
                                                    ArcadeThemeKt.ArcadeTheme(colors.isLight ? ColorsDarkKt.colorsDark : ColorsLightKt.colorsLight, null, null, CartBannerViewKt.f41lambda$1767803975, gapComposer5, 3072, 6);
                                                    gapComposer5.end(false);
                                                } else {
                                                    gapComposer5.startReplaceGroup(-1646031165);
                                                    gapComposer5.end(false);
                                                }
                                                gapComposer5.end(true);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), gapComposer3, 1573248, 40);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), gapComposer, 24966, 10);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(210906476);
                        gapComposer.end(z3);
                    }
                    gapComposer.end(true);
                }
            }
            neverEqualPolicy2 = neverEqualPolicy;
            Function1 function14 = new Function1() { // from class: app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    LazyListScope lazyListScope = (LazyListScope) obj;
                    lazyListScope.getClass();
                    final LocalBrandLocationCartViewModel localBrandLocationCartViewModel2 = LocalBrandLocationCartViewModel.this;
                    final int i6 = 0;
                    final int i7 = 1;
                    LazyListScope.item$default(lazyListScope, "cart_summary_item", null, new ComposableLambdaImpl(new Function3() { // from class: app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i8 = i6;
                            LocalBrandLocationCartViewModel localBrandLocationCartViewModel3 = localBrandLocationCartViewModel2;
                            switch (i8) {
                                case 0:
                                    Composer composer2 = (Composer) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    ((LazyItemScopeImpl) obj2).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                        Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5), 1.0f);
                                        String str = localBrandLocationCartViewModel3.summaryLabel;
                                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer3, fillMaxWidth4, ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    ((LazyItemScopeImpl) obj2).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        LocalBrandLocationCartViewKt.SubtotalItem(localBrandLocationCartViewModel3.subtotalBeforeDiscountAmount, localBrandLocationCartViewModel3.subtotalAmount, gapComposer4, 0);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1631267167), 2);
                    FreeDeliveryMeter freeDeliveryMeter = localBrandLocationCartViewModel2.freeDeliveryMeter;
                    int i8 = 16;
                    if (freeDeliveryMeter != null) {
                        LazyListScope.item$default(lazyListScope, "cart_free_delivery_meter", null, new ComposableLambdaImpl(new SliderDefaults$$ExternalSyntheticLambda3(freeDeliveryMeter, i8), true, 1254374565), 2);
                    }
                    AppliedCouponBanner appliedCouponBanner = localBrandLocationCartViewModel2.appliedCoupon;
                    Function1 function15 = function1;
                    if (appliedCouponBanner != null) {
                        LazyListScope.item$default(lazyListScope, "cart_applied_coupon", null, new ComposableLambdaImpl(new PagerDefaults$$ExternalSyntheticLambda0(24, appliedCouponBanner, function15), true, -915757502), 2);
                    }
                    LocationMenu$$ExternalSyntheticLambda6 locationMenu$$ExternalSyntheticLambda6 = new LocationMenu$$ExternalSyntheticLambda6(15);
                    List list4 = list3;
                    lazyListScope.items(list4.size(), null, new Latch$await$2$2(9, locationMenu$$ExternalSyntheticLambda6, list4), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(1, function15, list4), true, 802480018));
                    OrderLimitBanner orderLimitBanner = localBrandLocationCartViewModel2.orderLimitBanner;
                    if (orderLimitBanner != null) {
                        if (!localBrandLocationCartViewModel2.placeOrderErrors.isEmpty()) {
                            orderLimitBanner = null;
                        }
                        if (orderLimitBanner != null) {
                            LazyListScope.item$default(lazyListScope, "cart_order_limit_banner", null, new ComposableLambdaImpl(new SliderDefaults$$ExternalSyntheticLambda3(orderLimitBanner, 13), true, -974235967), 2);
                        }
                    }
                    if (z11) {
                        LazyListScope.item$default(lazyListScope, "cart_open_tab_empty_state", null, new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda13(localBrandLocationCartViewModel2, function15, i6), true, -308280174), 2);
                    } else {
                        List list5 = localBrandLocationCartViewModel2.selections;
                        lazyListScope.items(list5.size(), null, new Latch$await$2$2(10, new LocationMenu$$ExternalSyntheticLambda6(i8), list5), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(2, function15, list5), true, 802480018));
                    }
                    boolean z18 = z12;
                    boolean z19 = z10;
                    if (z18 || z19) {
                        LazyListScope.item$default(lazyListScope, null, "cart_divider", CartBannerViewKt.f42lambda$517684164, 1);
                    }
                    LocalBrandLocationCartViewModel.Fulfillment fulfillment = localBrandLocationCartViewModel2.fulfillment;
                    if (fulfillment != null) {
                        if (!z18) {
                            fulfillment = null;
                        }
                        if (fulfillment != null) {
                            LazyListScope.item$default(lazyListScope, "cart_fulfillment_item", null, new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda6(7, fulfillment, localBrandLocationCartViewModel2, function15), true, 1897666452), 2);
                            LazyListScope.item$default(lazyListScope, null, "cart_divider", CartBannerViewKt.f40lambda$1401902197, 1);
                        }
                    }
                    if (z19) {
                        LazyListScope.item$default(lazyListScope, "cart_subtotal_item", null, new ComposableLambdaImpl(new Function3() { // from class: app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i82 = i7;
                                LocalBrandLocationCartViewModel localBrandLocationCartViewModel3 = localBrandLocationCartViewModel2;
                                switch (i82) {
                                    case 0:
                                        Composer composer2 = (Composer) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        ((LazyItemScopeImpl) obj2).getClass();
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                            Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5), 1.0f);
                                            String str = localBrandLocationCartViewModel3.summaryLabel;
                                            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-1762997739);
                                                gapComposer3.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer3, fillMaxWidth4, ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer3 = (Composer) obj3;
                                        int intValue2 = ((Integer) obj4).intValue();
                                        ((LazyItemScopeImpl) obj2).getClass();
                                        GapComposer gapComposer4 = (GapComposer) composer3;
                                        if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                            LocalBrandLocationCartViewKt.SubtotalItem(localBrandLocationCartViewModel3.subtotalBeforeDiscountAmount, localBrandLocationCartViewModel3.subtotalAmount, gapComposer4, 0);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, true, 252363251), 2);
                    }
                    return Unit.INSTANCE;
                }
            };
            z = z10;
            gapComposer2.updateRememberedValue(function14);
            rememberedValue2 = function14;
            LazyDslKt.LazyColumn(then2, null, m295PaddingValuesYgX7TsA$default, null, null, null, false, null, (Function1) rememberedValue2, gapComposer2, MLKEMEngine.KyberPolyBytes, 506);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            localBrandBannerModel = localBrandLocationCartViewModel.banner;
            if (localBrandBannerModel != null) {
            }
            if (z5) {
            }
            if (z) {
            }
            gapComposer.startReplaceGroup(208502054);
            final Function1 function132 = function12;
            final boolean z152 = z6;
            final boolean z162 = z7;
            final int i52 = i3;
            final boolean z172 = z;
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(-679758102, new Function3() { // from class: app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    GapComposer gapComposer3;
                    Function1 function142;
                    NeverEqualPolicy neverEqualPolicy4;
                    AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    adaptiveStackScope.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                    }
                    int i6 = 1;
                    GapComposer gapComposer4 = (GapComposer) composer2;
                    if (gapComposer4.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                        final boolean z18 = z152;
                        Function1 function15 = function132;
                        NeverEqualPolicy neverEqualPolicy5 = Composer.Companion.Empty;
                        if (z18) {
                            gapComposer3 = gapComposer4;
                            function142 = function15;
                            neverEqualPolicy4 = neverEqualPolicy5;
                            gapComposer3.startReplaceGroup(97683928);
                            gapComposer3.end(false);
                        } else {
                            gapComposer4.startReplaceGroup(97250145);
                            Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion3, 1.0f);
                            boolean changed = gapComposer4.changed(function15);
                            Object rememberedValue4 = gapComposer4.rememberedValue();
                            if (changed || rememberedValue4 == neverEqualPolicy5) {
                                rememberedValue4 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(21, function15);
                                gapComposer4.updateRememberedValue(rememberedValue4);
                            }
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-450270550, new MoneyTabUIKt$$ExternalSyntheticLambda38(z172, i6), gapComposer4);
                            neverEqualPolicy4 = neverEqualPolicy5;
                            function142 = function15;
                            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, horizontalWeight, null, false, false, null, rememberComposableLambda, gapComposer4, 1572864, 60);
                            gapComposer3 = gapComposer4;
                            gapComposer3.end(false);
                        }
                        Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion3, 1.0f);
                        ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                        final LocalBrandLocationCartViewModel localBrandLocationCartViewModel2 = localBrandLocationCartViewModel;
                        boolean z19 = localBrandLocationCartViewModel2.isCheckoutEnabled;
                        boolean changed2 = gapComposer3.changed(function142);
                        final boolean z20 = z162;
                        boolean changed3 = changed2 | gapComposer3.changed(z20);
                        Object rememberedValue5 = gapComposer3.rememberedValue();
                        if (changed3 || rememberedValue5 == neverEqualPolicy4) {
                            rememberedValue5 = new ToggleableNode$$ExternalSyntheticLambda1(function142, z20, 2);
                            gapComposer3.updateRememberedValue(rememberedValue5);
                        }
                        final int i7 = i52;
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue5, horizontalWeight2, buttonProminence, false, z19, null, Expect_jvmKt.rememberComposableLambda(2059889637, new Function3() { // from class: app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                int i8;
                                int i9;
                                String m;
                                Composer composer3 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                ((RowScope) obj4).getClass();
                                GapComposer gapComposer5 = (GapComposer) composer3;
                                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                                    int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                                    Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, companion4);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
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
                                    Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer5, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                                    if (z18) {
                                        gapComposer5.startReplaceGroup(-1577157532);
                                        m = new MessageFormat(Room.stringResource(gapComposer5, R.string.local_views_add_items_to_tab)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i7), "count"));
                                        m.getClass();
                                        gapComposer5.end(false);
                                    } else {
                                        if (z20) {
                                            i8 = -1577151854;
                                            i9 = R.string.local_views_finish_and_pay;
                                        } else {
                                            i8 = -1577149300;
                                            i9 = R.string.local_views_checkout;
                                        }
                                        m = re$$ExternalSyntheticOutline0.m(gapComposer5, i8, i9, gapComposer5, false);
                                    }
                                    String str = m;
                                    LocalBrandLocationCartViewModel localBrandLocationCartViewModel3 = localBrandLocationCartViewModel2;
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer5, AlphaKt.alpha(companion4, localBrandLocationCartViewModel3.isLoading ? RecyclerView.DECELERATION_RATE : 1.0f), (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    if (localBrandLocationCartViewModel3.isLoading) {
                                        gapComposer5.startReplaceGroup(-1646604882);
                                        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer5.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
                                        if (delegatingSoftwareKeyboardController != null) {
                                            delegatingSoftwareKeyboardController.hide();
                                        }
                                        Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                                        } else {
                                            gapComposer5.startReplaceGroup(-1762997739);
                                            gapComposer5.end(false);
                                        }
                                        ArcadeThemeKt.ArcadeTheme(colors.isLight ? ColorsDarkKt.colorsDark : ColorsLightKt.colorsLight, null, null, CartBannerViewKt.f41lambda$1767803975, gapComposer5, 3072, 6);
                                        gapComposer5.end(false);
                                    } else {
                                        gapComposer5.startReplaceGroup(-1646031165);
                                        gapComposer5.end(false);
                                    }
                                    gapComposer5.end(true);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer3), gapComposer3, 1573248, 40);
                    } else {
                        gapComposer4.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 24966, 10);
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) modifier, (Object) localBrandLocationCartViewModel, function1, i, 29);
        }
    }

    public static final void OpenTabBannerTrailingIcon(LocalBrandLocationCartViewModel.OpenTabBanner.TrailingIcon trailingIcon, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(536460912);
        int i2 = (gapComposer.changed(trailingIcon.ordinal()) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            int ordinal = trailingIcon.ordinal();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(133847613);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
                Icons icons = Icons.CheckFill24;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Trace.m1191Iconww6aTOc(icons, (String) null, m285size3ABfNKs, colors.semantic.icon.success, gapComposer, 438, 0);
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(134047005);
                Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                Icons icons2 = Icons.FailedFill24;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Trace.m1191Iconww6aTOc(icons2, (String) null, m285size3ABfNKs2, colors2.semantic.icon.danger, gapComposer, 438, 0);
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 142863973, false);
                }
                gapComposer.startReplaceGroup(134245312);
                Modifier m285size3ABfNKs3 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                Icons icons3 = Icons.Push24;
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Trace.m1191Iconww6aTOc(icons3, (String) null, m285size3ABfNKs3, colors3.semantic.icon.prominent, gapComposer, 438, 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CartBannerViewKt$$ExternalSyntheticLambda2(trailingIcon, i, 3);
        }
    }

    public static final void OpenTabBannerView(Modifier modifier, LocalBrandLocationCartViewModel.OpenTabBanner openTabBanner, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1726962905);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(openTabBanner) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ImageKt.m183clickableoSLSa3U$default(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape), openTabBanner.isClickable, null, null, function0, 14), 8.0f, 8.0f, 16.0f, 8.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
            CrossfadeKt.Crossfade(openTabBanner.images, (Modifier) null, (FiniteAnimationSpec) null, (String) null, CartBannerViewKt.lambda$2120782154, gapComposer, 24576, 14);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f));
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            int i3 = 0;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
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
            CrossfadeKt.Crossfade(new OpenTabBannerText(openTabBanner.title, openTabBanner.body), (Modifier) null, (FiniteAnimationSpec) null, (String) null, CartBannerViewKt.lambda$1059346356, gapComposer, 24576, 14);
            gapComposer.end(true);
            CrossfadeKt.Crossfade(openTabBanner.trailingIcon, (Modifier) null, (FiniteAnimationSpec) null, (String) null, Expect_jvmKt.rememberComposableLambda(-248584900, new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(i3), gapComposer), gapComposer, 24576, 14);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(modifier, openTabBanner, function0, i, 27);
        }
    }

    public static final void OpenTabEmptyStateMessageItem(int i, int i2, Composer composer, Function0 function0) {
        AnnotatedString annotatedString;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-904782755);
        int i3 = (gapComposer.changed(i) ? 4 : 2) | i2 | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.placeholder;
            TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61438), (SpanStyle) null, (SpanStyle) null, 14);
            String stringResource = Room.stringResource(gapComposer, R.string.local_views_open_tab_empty_state_link);
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_items_count)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i), "count"));
            format2.getClass();
            stringResource.getClass();
            String format3 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_open_tab_empty_state)).format(new Object[]{format2, stringResource});
            format3.getClass();
            boolean changed = ((i3 & 112) == 32) | gapComposer.changed(format3) | gapComposer.changed(stringResource) | gapComposer.changed(textLinkStyles);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) format3, stringResource, 0, false, 6);
                if (indexOf$default == -1) {
                    annotatedString = new AnnotatedString(format3);
                } else {
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    builder.append(format3.substring(0, indexOf$default));
                    int pushLink = builder.pushLink(new LinkAnnotation.Clickable("open_tab_empty_state_link", textLinkStyles, new DisclaimerTextKt$$ExternalSyntheticLambda1(function0, 1)));
                    try {
                        builder.append(stringResource);
                        builder.pop(pushLink);
                        builder.append(format3.substring(stringResource.length() + indexOf$default));
                        annotatedString = builder.toAnnotatedString();
                    } catch (Throwable th) {
                        builder.pop(pushLink);
                        throw th;
                    }
                }
                rememberedValue = annotatedString;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Room.m1164Text25TpFw(0, 0, 0, 0, 48, 0, 4080, j, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 24.0f, 5), (AnnotatedString) rememberedValue, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, (TextLineBalancing) null, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FloatingChatInputKt$$ExternalSyntheticLambda8(i, function0, i2);
        }
    }

    public static final void SelectionImage(LocalImage localImage, Composer composer, int i) {
        String themedUrl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-44079988);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(localImage) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (localImage == null) {
                gapComposer.startReplaceGroup(1073135820);
                gapComposer.end(false);
                themedUrl = null;
            } else {
                gapComposer.startReplaceGroup(588806613);
                themedUrl = LocalViewsKt.getThemedUrl(localImage, gapComposer);
                gapComposer.end(false);
            }
            String str = themedUrl;
            Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 82.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            LocalMapKt.LocalAsyncImage(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape), null, str, ContentScale.Companion.Fit, null, null, Expect_jvmKt.rememberComposableLambda(1048509742, new LocalHomeViewKt$$ExternalSyntheticLambda1(str, i2), gapComposer), gapComposer, 1575936, 50);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalViewsKt$$ExternalSyntheticLambda2(localImage, i, 3);
        }
    }

    public static final void SelectionSlotView(Modifier modifier, ComboSlotViewModel comboSlotViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(42504484);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(comboSlotViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
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
            String str = comboSlotViewModel.title;
            List list = comboSlotViewModel.errors;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            String str2 = comboSlotViewModel.subtitle;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1228654559);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1228654558);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodySmall, 0L, Room.getSp(12), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            if (list.isEmpty()) {
                gapComposer.startReplaceGroup(-1228135928);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1228419423);
                Strings.getSizes(gapComposer).getClass();
                zzc zzcVar = DefaultSizes.spacing;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Request$Priority$EnumUnboxingLocalUtility.m(zzcVar, companion, 16.0f, gapComposer);
                CartBannerViewKt.CreateCartErrorBanners((i2 & 896) | 6, gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), list, function1);
                Strings.getSizes(gapComposer).getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 8.0f));
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) modifier, (Object) comboSlotViewModel, function1, i, 28);
        }
    }

    public static final void SubtotalItem(Amount amount, Amount amount2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(523558074);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(amount) ? 4 : 2) | (gapComposer.changedInstance(amount2) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
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
            if (!(((double) 1.0f) > 0.0d)) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) companion, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_item_subtotal), (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) companion, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_cart_fee_subtitle), (Map) null, (Function1) null, false);
            gapComposer.end(true);
            Strings.getSizes(gapComposer).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion, 32.0f, gapComposer);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            AnimatedContentKt.AnimatedVisibility(amount != null, (Modifier) null, (EnterTransitionImpl) null, (ExitTransitionImpl) null, (String) null, Expect_jvmKt.rememberComposableLambda(-944763366, new SliderDefaults$$ExternalSyntheticLambda3(amount, 14), gapComposer), (Composer) gapComposer, 1572870, 30);
            boolean changedInstance = gapComposer.changedInstance(amount2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CachedPageEventFlow$$ExternalSyntheticLambda0(amount2, 24);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            VisibleKt.m3482AnimatedAmountTextJDMA8c0(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), Strings.getTypography(gapComposer).labelMedium, Strings.getColors(gapComposer).semantic.text.prominent, 6, new AnimatedAmountTextView.Amount(amount2.amount, 1L, amount2.text), null, false, 0L, gapComposer, 0, 224);
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(amount, amount2, i, 20);
        }
    }
}
