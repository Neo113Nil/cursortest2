package app.cash.local.views.brand.checkout;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.TextStyle;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.viewmodels.CouponSection;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalCheckoutGiftCardSectionViewModel;
import app.cash.local.viewmodels.LocalCheckoutTipSectionViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.applets.views.AllowanceAppletTileKt$$ExternalSyntheticLambda8;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.util.Strings;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LocalBrandLocationCheckoutViewKt {
    public static final Modifier SectionItemModifier = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5);

    public static final void CurbsidePickupInfoSection(Modifier modifier, LocalBrandLocationCheckoutViewModel.CurbsidePickupSection curbsidePickupSection, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-110486918);
        int i2 = i | (gapComposer.changedInstance(curbsidePickupSection) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            modifier2 = modifier;
            Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(modifier2, null, 3);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, animateContentSize$default);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z = curbsidePickupSection.isSelected;
            boolean z2 = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GestureNodeKt$$ExternalSyntheticLambda0(18, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LocalMapKt.InfoEntry(SelectableKt.m337toggleableoSLSa3U$default(fillMaxWidth, z, true, null, (Function1) rememberedValue, 12), Room.stringResource(gapComposer, R.string.local_views_curbside_title), Room.stringResource(gapComposer, R.string.local_views_curbside_subtitle), (Function2) null, Expect_jvmKt.rememberComposableLambda(-541504657, new HintHandler$$ExternalSyntheticLambda0(curbsidePickupSection, 25), gapComposer), (Function0) null, gapComposer, 24576, 40);
            if (curbsidePickupSection.isSelected) {
                gapComposer.startReplaceGroup(-1539851512);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                String stringResource = Room.stringResource(gapComposer, R.string.local_views_vehicle_description_title);
                String str = curbsidePickupSection.vehicleDescription;
                if (str == null) {
                    str = re$$ExternalSyntheticOutline0.m(gapComposer, -603855771, R.string.local_views_vehicle_description_subtitle, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-603857073);
                    gapComposer.end(false);
                }
                LocalMapKt.InfoEntry(fillMaxWidth2, stringResource, str, (Function2) null, Expect_jvmKt.rememberComposableLambda(-1258539596, new LocalMapKt$$ExternalSyntheticLambda9(5, function1, curbsidePickupSection), gapComposer), (Function0) null, gapComposer, 24582, 40);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1539153826);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(modifier2, curbsidePickupSection, function1, i, 17);
        }
    }

    public static final void DropOffNotes(OrderBuilderModel.OrderType.Regular regular, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1449539698);
        int i2 = (gapComposer.changedInstance(regular) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
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
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z = regular.noContactDelivery;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new GestureNodeKt$$ExternalSyntheticLambda0(11, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LocalMapKt.InfoEntry(SelectableKt.m337toggleableoSLSa3U$default(fillMaxWidth, z, true, null, (Function1) rememberedValue, 12), Room.stringResource(gapComposer, R.string.local_views_no_contact_delivery_title), Room.stringResource(gapComposer, R.string.local_views_no_contact_delivery_subtitle), (Function2) null, Expect_jvmKt.rememberComposableLambda(-353579261, new HintHandler$$ExternalSyntheticLambda0(regular, 24), gapComposer), (Function0) null, gapComposer, 24576, 40);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            String stringResource = Room.stringResource(gapComposer, R.string.local_views_dropoff_notes_title);
            String stringResource2 = Room.stringResource(gapComposer, R.string.local_views_dropoff_notes_placeholder);
            String str = regular.dropoffNotes;
            if (str == null) {
                str = "";
            }
            boolean z3 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GestureNodeKt$$ExternalSyntheticLambda0(12, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer;
            CheckoutTipSectionKt.m1306LocalCheckoutNotesgMrHQkA(m302paddingqDBjuR0$default, stringResource, stringResource2, str, false, false, null, RecyclerView.DECELERATION_RATE, (Function1) rememberedValue2, gapComposer, 6, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(regular, function1, i, 4);
        }
    }

    public static final void IdvRequiredRow(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(284791256);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11), 16.0f);
            Painter painter = Icons.IdGovernment16.painter(gapComposer);
            long j = Strings.getColors(gapComposer).semantic.icon.warning;
            ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 25008, 40);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.warning, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, true), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyXSmall, 0L, 0L, null, Fonts.CashSans, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_id_verification_required_delivery), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Savers_androidKt$$ExternalSyntheticLambda0(i, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalBrandLocationCheckoutView(Modifier modifier, LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        boolean z;
        OrderBuilderModel.OrderType orderType;
        boolean z2;
        LocalCheckoutTipSectionViewModel localCheckoutTipSectionViewModel;
        boolean z3;
        boolean changedInstance;
        Object rememberedValue;
        TextFieldState textFieldState;
        TextFieldState textFieldState2;
        int size;
        int i3;
        LocalBottomModalViewModel localBottomModalViewModel;
        localBrandLocationCheckoutViewModel.getClass();
        OrderBuilderModel.BuyerInfo.UiReady uiReady = localBrandLocationCheckoutViewModel.buyerInfo;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-750631327);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(localBrandLocationCheckoutViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
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
            OrderBuilderModel.OrderType orderType2 = localBrandLocationCheckoutViewModel.orderType;
            String name = uiReady.getName();
            if (name == null) {
                name = "";
            }
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(name, 0L, gapComposer2, 0, 2);
            String phone = uiReady.getPhone();
            TextFieldState m382rememberTextFieldStateLepunE2 = TextFieldStateKt.m382rememberTextFieldStateLepunE(phone != null ? phone : "", 0L, gapComposer2, 0, 2);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
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
            ToolbarModel toolbarModel = new ToolbarModel(Room.stringResource(gapComposer2, R.string.local_views_review_and_pay));
            int i5 = i4 & 896;
            boolean z4 = i5 == 256;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z4 || rememberedValue2 == neverEqualPolicy) {
                z = false;
                rememberedValue2 = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 5);
                gapComposer2.updateRememberedValue(rememberedValue2);
            } else {
                z = false;
            }
            LocalToolbarKt.m1333LocalToolbarflo8M7A(companion, toolbarModel, null, (Function0) rememberedValue2, RecyclerView.DECELERATION_RATE, null, gapComposer2, 6, 108);
            boolean z5 = localBrandLocationCheckoutViewModel.detailsExpanded;
            if (localBrandLocationCheckoutViewModel.reviewMode == LocalBrandLocationCheckoutViewModel.ReviewMode.STANDARD) {
                orderType = orderType2;
                if ((orderType instanceof OrderBuilderModel.OrderType.Pickup) && localBrandLocationCheckoutViewModel.curbsidePickupSection != null) {
                    z2 = true;
                    LocalCheckoutGiftCardSectionViewModel localCheckoutGiftCardSectionViewModel = localBrandLocationCheckoutViewModel.giftCardSection;
                    boolean z6 = localCheckoutGiftCardSectionViewModel == null && !(localCheckoutGiftCardSectionViewModel.input == null && localCheckoutGiftCardSectionViewModel.appliedGiftCards.isEmpty());
                    localCheckoutTipSectionViewModel = localBrandLocationCheckoutViewModel.tipSection;
                    if (localCheckoutTipSectionViewModel != null || !localCheckoutTipSectionViewModel.isEnabled || localCheckoutTipSectionViewModel.options.isEmpty()) {
                    }
                    if (localBrandLocationCheckoutViewModel.paymentSection == null && !z6) {
                        CouponSection couponSection = localBrandLocationCheckoutViewModel.couponSection;
                    }
                    z3 = !z2 || (orderType instanceof OrderBuilderModel.OrderType.Regular) || (orderType instanceof OrderBuilderModel.OrderType.IdVerificationRequired) || localBrandLocationCheckoutViewModel.notes != null;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier then2 = fillMaxWidth2.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
                    changedInstance = gapComposer2.changedInstance(localBrandLocationCheckoutViewModel) | (i5 != 256) | gapComposer2.changed(m382rememberTextFieldStateLepunE) | gapComposer2.changed(m382rememberTextFieldStateLepunE2) | gapComposer2.changed(z3) | gapComposer2.changed(z5) | gapComposer2.changed(false);
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!changedInstance || rememberedValue == neverEqualPolicy) {
                        textFieldState = m382rememberTextFieldStateLepunE2;
                        boolean z7 = z3;
                        textFieldState2 = m382rememberTextFieldStateLepunE;
                        TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1 textFieldPointerModifier_commonKt$$ExternalSyntheticLambda1 = new TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1(localBrandLocationCheckoutViewModel, z7, function1, textFieldState2, textFieldState, z5);
                        gapComposer2.updateRememberedValue(textFieldPointerModifier_commonKt$$ExternalSyntheticLambda1);
                        rememberedValue = textFieldPointerModifier_commonKt$$ExternalSyntheticLambda1;
                    } else {
                        textFieldState2 = m382rememberTextFieldStateLepunE;
                        textFieldState = m382rememberTextFieldStateLepunE2;
                    }
                    TextFieldState textFieldState3 = textFieldState2;
                    TextFieldState textFieldState4 = textFieldState;
                    LazyDslKt.LazyColumn(then2, null, m297PaddingValuesa9UjIt4$default, null, null, null, false, null, (Function1) rememberedValue, gapComposer2, MLKEMEngine.KyberPolyBytes, 506);
                    gapComposer = gapComposer2;
                    gapComposer.end(true);
                    gapComposer.startReplaceGroup(91840435);
                    List list = localBrandLocationCheckoutViewModel.banners;
                    size = list.size();
                    i3 = 0;
                    while (i3 < size) {
                        LocalMapKt.LocalBrandBanner(SpacerKt.m301paddingqDBjuR0(companion, 16.0f, i3 > 0 ? 12.0f : RecyclerView.DECELERATION_RATE, 16.0f, 12.0f), (LocalBrandBannerModel) list.get(i3), function1, gapComposer, i5);
                        i3++;
                    }
                    gapComposer.end(false);
                    localBottomModalViewModel = localBrandLocationCheckoutViewModel.modal;
                    if (localBottomModalViewModel != null) {
                        gapComposer.startReplaceGroup(-1447561650);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1447561649);
                        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                        boolean changedInstance2 = gapComposer.changedInstance(localBrandLocationCheckoutViewModel) | gapComposer.changed(textFieldState3) | gapComposer.changed(textFieldState4) | gapComposer.changed(delegatingSoftwareKeyboardController) | (i5 == 256);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                            OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(localBrandLocationCheckoutViewModel, textFieldState3, textFieldState4, delegatingSoftwareKeyboardController, function1, 7);
                            gapComposer.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
                            rememberedValue3 = overlayKt$$ExternalSyntheticLambda3;
                        }
                        LocalMapKt.LocalBottomModal(m300paddingVpY3zN4$default, localBottomModalViewModel, (Function1) rememberedValue3, 0, gapComposer, 6, 8);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                }
            } else {
                orderType = orderType2;
            }
            z2 = false;
            LocalCheckoutGiftCardSectionViewModel localCheckoutGiftCardSectionViewModel2 = localBrandLocationCheckoutViewModel.giftCardSection;
            if (localCheckoutGiftCardSectionViewModel2 == null) {
            }
            localCheckoutTipSectionViewModel = localBrandLocationCheckoutViewModel.tipSection;
            if (localCheckoutTipSectionViewModel != null) {
            }
            if (localBrandLocationCheckoutViewModel.paymentSection == null) {
                CouponSection couponSection2 = localBrandLocationCheckoutViewModel.couponSection;
            }
            if (z2) {
            }
            Modifier fillMaxWidth22 = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            if (1.0f <= 0.0d) {
            }
            Modifier then22 = fillMaxWidth22.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            PaddingValuesImpl m297PaddingValuesa9UjIt4$default2 = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
            changedInstance = gapComposer2.changedInstance(localBrandLocationCheckoutViewModel) | (i5 != 256) | gapComposer2.changed(m382rememberTextFieldStateLepunE) | gapComposer2.changed(m382rememberTextFieldStateLepunE2) | gapComposer2.changed(z3) | gapComposer2.changed(z5) | gapComposer2.changed(false);
            rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance) {
            }
            textFieldState = m382rememberTextFieldStateLepunE2;
            boolean z72 = z3;
            textFieldState2 = m382rememberTextFieldStateLepunE;
            TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1 textFieldPointerModifier_commonKt$$ExternalSyntheticLambda12 = new TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1(localBrandLocationCheckoutViewModel, z72, function1, textFieldState2, textFieldState, z5);
            gapComposer2.updateRememberedValue(textFieldPointerModifier_commonKt$$ExternalSyntheticLambda12);
            rememberedValue = textFieldPointerModifier_commonKt$$ExternalSyntheticLambda12;
            TextFieldState textFieldState32 = textFieldState2;
            TextFieldState textFieldState42 = textFieldState;
            LazyDslKt.LazyColumn(then22, null, m297PaddingValuesa9UjIt4$default2, null, null, null, false, null, (Function1) rememberedValue, gapComposer2, MLKEMEngine.KyberPolyBytes, 506);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            gapComposer.startReplaceGroup(91840435);
            List list2 = localBrandLocationCheckoutViewModel.banners;
            size = list2.size();
            i3 = 0;
            while (i3 < size) {
            }
            gapComposer.end(false);
            localBottomModalViewModel = localBrandLocationCheckoutViewModel.modal;
            if (localBottomModalViewModel != null) {
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) modifier, (Object) localBrandLocationCheckoutViewModel, function1, i, 15);
        }
    }

    public static final void MapView(final GpsCoordinates gpsCoordinates, final Modifier modifier, Composer composer, final int i) {
        final GpsCoordinates gpsCoordinates2;
        final Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1106933925);
        int i2 = (gapComposer.changedInstance(gpsCoordinates) ? 4 : 2) | i;
        final int i3 = 1;
        final int i4 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gpsCoordinates2 = gpsCoordinates;
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        } else {
            if (((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                gapComposer.startReplaceGroup(90693407);
                Modifier aspectRatio = OffsetKt.aspectRatio(2.8f, SizeKt.fillMaxWidth(modifier, 1.0f), false);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj = DefaultSizes.border.entries;
                Modifier clip = ClipKt.clip(aspectRatio, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape), gapComposer, 0);
                gapComposer.end(false);
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2(gpsCoordinates, modifier, i, i4) { // from class: app.cash.local.views.brand.checkout.LocalBrandLocationCheckoutViewKt$$ExternalSyntheticLambda16
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ GpsCoordinates f$0;
                        public final /* synthetic */ Modifier f$1;

                        {
                            this.$r8$classId = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i5 = this.$r8$classId;
                            Composer composer2 = (Composer) obj2;
                            ((Integer) obj3).getClass();
                            switch (i5) {
                                case 0:
                                    LocalBrandLocationCheckoutViewKt.MapView(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(49));
                                    break;
                                default:
                                    LocalBrandLocationCheckoutViewKt.MapView(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(49));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            gapComposer.startReplaceGroup(90947111);
            gapComposer.end(false);
            gpsCoordinates2 = gpsCoordinates;
            modifier2 = modifier;
            LocalMapKt.m1321LocalStaticMaphGBTI10(gpsCoordinates2, modifier2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 28);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new Function2(gpsCoordinates2, modifier2, i, i3) { // from class: app.cash.local.views.brand.checkout.LocalBrandLocationCheckoutViewKt$$ExternalSyntheticLambda16
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ GpsCoordinates f$0;
                public final /* synthetic */ Modifier f$1;

                {
                    this.$r8$classId = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = this.$r8$classId;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj3).getClass();
                    switch (i5) {
                        case 0:
                            LocalBrandLocationCheckoutViewKt.MapView(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(49));
                            break;
                        default:
                            LocalBrandLocationCheckoutViewKt.MapView(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(49));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void StorePolicies(Modifier modifier, AnnotatedString annotatedString, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(960191251);
        int i2 = (gapComposer.changed(false) ? 32 : 16) | i | (gapComposer.changed(annotatedString) ? 256 : 128);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = new Object[0];
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda3(17);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
            String stringResource = Room.stringResource(gapComposer, R.string.local_views_store_policies);
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            boolean changed = gapComposer.changed(mutableState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DateInputKt$$ExternalSyntheticLambda5(15, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CheckoutExpandableReviewRowKt.m1298CheckoutExpandableReviewRowIBGS8fI(modifier, stringResource, null, null, booleanValue, (Function1) rememberedValue2, false, false, true, CheckoutExpandableReviewRowKt.CheckoutReviewCompactRowTouchTargetPadding, null, Expect_jvmKt.rememberComposableLambda(708410558, new AllowanceAppletTileKt$$ExternalSyntheticLambda8(annotatedString, i3), gapComposer), gapComposer, 905970054, 48, 1224);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(modifier, annotatedString, i, 6);
        }
    }
}
