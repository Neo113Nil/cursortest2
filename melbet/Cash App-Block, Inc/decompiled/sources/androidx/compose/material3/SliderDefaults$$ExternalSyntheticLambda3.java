package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt$$ExternalSyntheticLambda2;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.primitives.MenuDiscountSummary;
import app.cash.local.primitives.MenuItemPreorderingSummary;
import app.cash.local.viewmodels.BrandFollowViewModel;
import app.cash.local.viewmodels.FreeDeliveryMeter;
import app.cash.local.viewmodels.InputError;
import app.cash.local.viewmodels.LocalAddBrandsViewModel;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalBrandLocationOpenTabViewModel;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.local.viewmodels.LocalCheckoutOrderSummaryViewModel;
import app.cash.local.viewmodels.LocalEditorialContent;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.OrderLimitBanner;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import app.cash.local.viewmodels.internal.Amount;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.local.viewmodels.sheet.LoyaltySheetModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.checkout.LocalBrandLocationCheckoutViewKt;
import app.cash.local.views.brand.menu.LocalMenuComboDetailsViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.brand.menu.LocalMenuItemDetailsViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.cart.CartBannerViewKt;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.internal.ExpandableSectionHeaderData;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import coil3.size.SizeKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.util.Strings;
import com.stripe.android.financialconnections.ui.components.ButtonKt$$ExternalSyntheticLambda1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderDefaults$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ SliderDefaults$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
    }

    private final Object invoke$app$cash$local$views$marketingmessages$MarketingMessageKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        MarketingMessageViewModel marketingMessageViewModel = (MarketingMessageViewModel) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 32.0f, RecyclerView.DECELERATION_RATE, 2);
            MarketingMessageViewModel.OfferPreview offerPreview = marketingMessageViewModel.offer;
            if (offerPreview != null && offerPreview.isRedeemed) {
                i = 1909929791;
                i2 = R.string.local_views_redeemed;
            } else if (offerPreview != null) {
                i = 1910042817;
                i2 = R.string.local_views_redeem;
            } else {
                i = 1910129214;
                i2 = R.string.local_views_view_menu;
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4092, 0L, (Composer) gapComposer, m300paddingVpY3zN4$default, (TextStyle) null, (TextLineBalancing) null, re$$ExternalSyntheticOutline0.m(gapComposer, i, i2, gapComposer, false), (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$app$cash$local$views$pos$LocalPosBrandOnboardingViewKt$$ExternalSyntheticLambda21(Object obj, Object obj2, Object obj3) {
        LocalPosBrandOnboardingViewModel.CallToAction callToAction = (LocalPosBrandOnboardingViewModel.CallToAction) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, callToAction.label, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$app$cash$local$views$sheet$LoyaltySheetKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        LoyaltySheetModel loyaltySheetModel = (LoyaltySheetModel) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loyaltySheetModel.ctaText, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$app$cash$local$views$wallet$TabContentViewKt$$ExternalSyntheticLambda55(Object obj, Object obj2, Object obj3) {
        LocalHomeViewModel.TabContent.Widget.LocalCashIncentive localCashIncentive = (LocalHomeViewModel.TabContent.Widget.LocalCashIncentive) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, localCashIncentive.ctaLabel, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x074d  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        Modifier wrapContentHeight;
        Modifier wrapContentHeight2;
        Modifier wrapContentHeight3;
        Modifier wrapContentHeight4;
        int i;
        int i2;
        Color m;
        int i3 = this.$r8$classId;
        String str = "";
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$1;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        switch (i3) {
            case 0:
                SliderState sliderState = (SliderState) obj4;
                MeasureScope measureScope = (MeasureScope) obj;
                Placeable mo833measureBRTryo0 = ((Measurable) obj2).mo833measureBRTryo0(((Constraints) obj3).value);
                return measureScope.layout(mo833measureBRTryo0.width, mo833measureBRTryo0.height, MapsKt__MapsJVMKt.mapOf(new Pair(SliderKt.CornerSizeAlignmentLine, Integer.valueOf(Dp.m1037equalsimpl0(Float.NaN, Float.NaN) ? sliderState.orientation == Orientation.Vertical ? mo833measureBRTryo0.width / 2 : mo833measureBRTryo0.height / 2 : measureScope.mo230roundToPx0680j_4(Float.NaN)))), new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 7));
            case 1:
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = (CoreTextFieldSemanticsModifierNode) obj4;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue = coreTextFieldSemanticsModifierNode.offsetMapping.transformedToOriginal(intValue);
                }
                if (!booleanValue) {
                    intValue2 = coreTextFieldSemanticsModifierNode.offsetMapping.transformedToOriginal(intValue2);
                }
                if (coreTextFieldSemanticsModifierNode.enabled) {
                    long j = coreTextFieldSemanticsModifierNode.value.selection;
                    int i4 = TextRange.$r8$clinit;
                    if (intValue != ((int) (j >> 32)) || intValue2 != ((int) (j & BodyPartID.bodyIdMax))) {
                        if (Math.min(intValue, intValue2) < 0 || Math.max(intValue, intValue2) > coreTextFieldSemanticsModifierNode.value.annotatedString.text.length()) {
                            TextFieldSelectionManager textFieldSelectionManager = coreTextFieldSemanticsModifierNode.manager;
                            textFieldSelectionManager.updateFloatingToolbar(false);
                            textFieldSelectionManager.setHandleState(HandleState.None);
                        } else {
                            if (booleanValue || intValue == intValue2) {
                                z = true;
                                TextFieldSelectionManager textFieldSelectionManager2 = coreTextFieldSemanticsModifierNode.manager;
                                textFieldSelectionManager2.updateFloatingToolbar(false);
                                textFieldSelectionManager2.setHandleState(HandleState.None);
                            } else {
                                z = true;
                                coreTextFieldSemanticsModifierNode.manager.enterSelectionMode$foundation(true);
                            }
                            coreTextFieldSemanticsModifierNode.state.onValueChange.invoke(new TextFieldValue(coreTextFieldSemanticsModifierNode.value.annotatedString, SizeKt.TextRange(intValue, intValue2), (TextRange) null));
                            z2 = z;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 2:
                SelectionManager selectionManager = (SelectionManager) obj4;
                Modifier modifier = (Modifier) obj;
                ((Integer) obj3).getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(-1914520728);
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj5 = rememberedValue;
                if (rememberedValue == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(new IntSize(0L));
                    gapComposer.updateRememberedValue(mutableStateOf$default);
                    obj5 = mutableStateOf$default;
                }
                MutableState mutableState = (MutableState) obj5;
                boolean changedInstance = gapComposer.changedInstance(selectionManager);
                Object rememberedValue2 = gapComposer.rememberedValue();
                Object obj6 = rememberedValue2;
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda0 = new DialogHostKt$$ExternalSyntheticLambda0(20, selectionManager, mutableState);
                    gapComposer.updateRememberedValue(dialogHostKt$$ExternalSyntheticLambda0);
                    obj6 = dialogHostKt$$ExternalSyntheticLambda0;
                }
                Function0 function0 = (Function0) obj6;
                boolean changed = gapComposer.changed(density);
                Object rememberedValue3 = gapComposer.rememberedValue();
                Object obj7 = rememberedValue3;
                if (changed || rememberedValue3 == neverEqualPolicy) {
                    ButtonKt$$ExternalSyntheticLambda1 buttonKt$$ExternalSyntheticLambda1 = new ButtonKt$$ExternalSyntheticLambda1(density, mutableState, 1);
                    gapComposer.updateRememberedValue(buttonKt$$ExternalSyntheticLambda1);
                    obj7 = buttonKt$$ExternalSyntheticLambda1;
                }
                AnimationVector2D animationVector2D = SelectionMagnifierKt.UnspecifiedAnimationVector2D;
                Modifier composed = PlatformKt.composed(modifier, new SelectionMagnifierKt$$ExternalSyntheticLambda2(z2 ? 1 : 0, function0, (Function1) obj7));
                gapComposer.end(false);
                return composed;
            case 3:
                TextFieldSelectionManager textFieldSelectionManager3 = (TextFieldSelectionManager) obj4;
                Modifier modifier2 = (Modifier) obj;
                ((Integer) obj3).getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                gapComposer2.startReplaceGroup(1980580247);
                Density density2 = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                Object obj8 = rememberedValue4;
                if (rememberedValue4 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(new IntSize(0L));
                    gapComposer2.updateRememberedValue(mutableStateOf$default2);
                    obj8 = mutableStateOf$default2;
                }
                MutableState mutableState2 = (MutableState) obj8;
                boolean changedInstance2 = gapComposer2.changedInstance(textFieldSelectionManager3);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                Object obj9 = rememberedValue5;
                if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                    DialogHostKt$$ExternalSyntheticLambda0 dialogHostKt$$ExternalSyntheticLambda02 = new DialogHostKt$$ExternalSyntheticLambda0(21, textFieldSelectionManager3, mutableState2);
                    gapComposer2.updateRememberedValue(dialogHostKt$$ExternalSyntheticLambda02);
                    obj9 = dialogHostKt$$ExternalSyntheticLambda02;
                }
                Function0 function02 = (Function0) obj9;
                boolean changed2 = gapComposer2.changed(density2);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                Object obj10 = rememberedValue6;
                if (changed2 || rememberedValue6 == neverEqualPolicy) {
                    ButtonKt$$ExternalSyntheticLambda1 buttonKt$$ExternalSyntheticLambda12 = new ButtonKt$$ExternalSyntheticLambda1(density2, mutableState2, 3);
                    gapComposer2.updateRememberedValue(buttonKt$$ExternalSyntheticLambda12);
                    obj10 = buttonKt$$ExternalSyntheticLambda12;
                }
                AnimationVector2D animationVector2D2 = SelectionMagnifierKt.UnspecifiedAnimationVector2D;
                Modifier composed2 = PlatformKt.composed(modifier2, new SelectionMagnifierKt$$ExternalSyntheticLambda2(z2 ? 1 : 0, function02, (Function1) obj10));
                gapComposer2.end(false);
                return composed2;
            case 4:
                InputError inputError = (InputError) obj4;
                Composer composer = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InputError.ValueMissing) inputError).errorMessage, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel = (LocalCheckoutOrderSummaryViewModel) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer2;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    CheckoutTipSectionKt.m1301CheckoutOrderSummaryContentiJQMabo(localCheckoutOrderSummaryViewModel, 0L, gapComposer4, 0, 2);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                LocalBrandLocationCheckoutViewModel.CurbsidePickupSection curbsidePickupSection = (LocalBrandLocationCheckoutViewModel.CurbsidePickupSection) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer3;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer5, curbsidePickupSection.vehicleDescription != null ? R.string.local_views_curbside_edit : R.string.local_views_curbside_add), (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                GpsCoordinates gpsCoordinates = (GpsCoordinates) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer4;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    LocalBrandLocationCheckoutViewKt.MapView(gpsCoordinates, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), gapComposer6, 48);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                MenuDiscountSummary menuDiscountSummary = (MenuDiscountSummary) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer5;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, menuDiscountSummary.details, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                MenuItemPreorderingSummary menuItemPreorderingSummary = (MenuItemPreorderingSummary) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer6;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, menuItemPreorderingSummary.description, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                LocalMenuComboDetailsViewModel localMenuComboDetailsViewModel = (LocalMenuComboDetailsViewModel) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer7;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    wrapContentHeight = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 12.0f, 3);
                    String str2 = localMenuComboDetailsViewModel.itemName;
                    TextStyle textStyle = ((com.squareup.cash.arcade.Typography) gapComposer9.consume(ArcadeThemeKt.LocalTypography)).headlineSmall;
                    Colors colors = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.prominent, (Composer) gapComposer9, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    wrapContentHeight2 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    LocalMapKt.LocalCombinedViews(SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 11), null, Expect_jvmKt.rememberComposableLambda(-900081132, new LocalMenuComboDetailsViewKt$$ExternalSyntheticLambda2(localMenuComboDetailsViewModel, 1), gapComposer9), gapComposer9, 390);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel = (LocalMenuItemDetailsViewModel) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer8;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    wrapContentHeight3 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 12.0f, 3);
                    String str3 = localMenuItemDetailsViewModel.itemName;
                    TextStyle textStyle2 = ((com.squareup.cash.arcade.Typography) gapComposer10.consume(ArcadeThemeKt.LocalTypography)).headlineSmall;
                    Colors colors2 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors2.semantic.text.prominent, (Composer) gapComposer10, m302paddingqDBjuR0$default2, textStyle2, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    wrapContentHeight4 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    LocalMapKt.LocalCombinedViews(SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 11), null, Expect_jvmKt.rememberComposableLambda(-1376720641, new LocalMenuItemDetailsViewKt$$ExternalSyntheticLambda2(localMenuItemDetailsViewModel, 1), gapComposer10), gapComposer10, 390);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                BrandFollowViewModel brandFollowViewModel = (BrandFollowViewModel) obj4;
                Composer composer9 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer9;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer11, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    boolean z3 = (brandFollowViewModel instanceof BrandFollowViewModel.Adding) || (brandFollowViewModel instanceof BrandFollowViewModel.Removing);
                    if (Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.Add.INSTANCE) || Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.Adding.INSTANCE)) {
                        i = -1796599908;
                        i2 = R.string.local_views_add;
                    } else if (Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.Remove.INSTANCE) || Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.Removing.INSTANCE)) {
                        i = -1796597569;
                        i2 = R.string.local_views_remove;
                    } else {
                        if (!Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.None.INSTANCE)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer11, -1796601080, false);
                        }
                        gapComposer11.startReplaceGroup(140106474);
                        gapComposer11.end(false);
                        String str4 = str;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer11, AlphaKt.alpha(companion, z3 ? 0.0f : 1.0f), (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                        if (z3) {
                            gapComposer11.startReplaceGroup(-15961822);
                            gapComposer11.end(false);
                        } else {
                            gapComposer11.startReplaceGroup(-16098284);
                            Modifier m279heightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m279heightInVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1);
                            boolean changed3 = gapComposer11.changed(str4);
                            Object rememberedValue7 = gapComposer11.rememberedValue();
                            if (changed3 || rememberedValue7 == neverEqualPolicy) {
                                rememberedValue7 = new androidx.compose.material.IconKt$$ExternalSyntheticLambda0(str4, 26);
                                gapComposer11.updateRememberedValue(rememberedValue7);
                            }
                            ProgressCircularKt.ProgressCircular(0, 0, gapComposer11, SemanticsModifierKt.semantics(m279heightInVpY3zN4$default, false, (Function1) rememberedValue7));
                            gapComposer11.end(false);
                        }
                        gapComposer11.end(true);
                    }
                    str = re$$ExternalSyntheticOutline0.m(gapComposer11, i, i2, gapComposer11, false);
                    String str42 = str;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer11, AlphaKt.alpha(companion, z3 ? 0.0f : 1.0f), (TextStyle) null, (TextLineBalancing) null, str42, (Map) null, (Function1) null, false);
                    if (z3) {
                    }
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                OrderLimitBanner orderLimitBanner = (OrderLimitBanner) obj4;
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer10 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer10).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer10;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    CartBannerViewKt.CartOrderLimitBannerView(SpacerKt.m300paddingVpY3zN4$default(LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, companion), RecyclerView.DECELERATION_RATE, 8.0f, 1), orderLimitBanner, gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Amount amount = (Amount) obj4;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) ((Composer) obj2);
                if (amount == null) {
                    gapComposer13.startReplaceGroup(-524698883);
                    gapComposer13.end(false);
                } else {
                    gapComposer13.startReplaceGroup(-524698882);
                    String str5 = amount.text;
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((com.squareup.cash.arcade.Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773119);
                    Colors colors3 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.disabled, (Composer) gapComposer13, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                    gapComposer13.end(false);
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Amount amount2 = ((LocalBrandLocationCartViewModel.Selection) obj4).totalPriceBeforeDiscountAmount;
                GapComposer gapComposer14 = (GapComposer) ((Composer) obj2);
                if (amount2 == null) {
                    gapComposer14.startReplaceGroup(-348049473);
                    gapComposer14.end(false);
                } else {
                    gapComposer14.startReplaceGroup(-348049472);
                    String str6 = amount2.text;
                    Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, 11);
                    String m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("~~", str6, "~~");
                    Colors colors4 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(m2, null, m302paddingqDBjuR0$default3, ((com.squareup.cash.arcade.Typography) gapComposer14.consume(ArcadeThemeKt.LocalTypography)).bodySmall, colors4.semantic.text.disabled, null, null, null, 0, 0, 0, gapComposer14, 432, 2016);
                    gapComposer14.end(false);
                }
                return Unit.INSTANCE;
            case 16:
                FreeDeliveryMeter freeDeliveryMeter = (FreeDeliveryMeter) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer11;
                if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    LocalMapKt.FreeDeliveryMeterView(freeDeliveryMeter, SpacerKt.m302paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 40.0f, 5), gapComposer15, 48);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                LocalBrandLocationOpenTabViewModel localBrandLocationOpenTabViewModel = (LocalBrandLocationOpenTabViewModel) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer12;
                if (gapComposer16.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 32.0f, 5), 1.0f);
                    String str7 = localBrandLocationOpenTabViewModel.summaryTitle;
                    Colors colors5 = (Colors) gapComposer16.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                    } else {
                        gapComposer16.startReplaceGroup(-1762997739);
                        gapComposer16.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors5.semantic.text.standard, (Composer) gapComposer16, fillMaxWidth, ((com.squareup.cash.arcade.Typography) gapComposer16.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                LocalAddBrandsViewModel localAddBrandsViewModel = (LocalAddBrandsViewModel) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((LazyGridItemScopeImpl) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer13;
                if (gapComposer17.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer17.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer17.consume(staticProvidableCompositionLocal)).getClass();
                    ((DefaultSizes) gapComposer17.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier m302paddingqDBjuR0$default4 = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 8.0f, RecyclerView.DECELERATION_RATE, 8.0f, 16.0f, 2);
                    String str8 = localAddBrandsViewModel.title;
                    if (str8 == null) {
                        str8 = re$$ExternalSyntheticOutline0.m(gapComposer17, -19039219, R.string.local_views_add_brand_title, gapComposer17, false);
                    } else {
                        gapComposer17.startReplaceGroup(-19039684);
                        gapComposer17.end(false);
                    }
                    Room.m1165Text25TpFw(3, 0, 0, 0, 196608, 6, 3032, 0L, (Composer) gapComposer17, m302paddingqDBjuR0$default4, LazyGridKt.getLegacyTabTitle((com.squareup.cash.arcade.Typography) gapComposer17.consume(ArcadeThemeKt.LocalTypography)), new TextLineBalancing(2), str8, (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                LocalCashBalanceViewModel localCashBalanceViewModel = (LocalCashBalanceViewModel) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer14;
                if (gapComposer18.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 5, 48, 0, 3824, Strings.getColors(gapComposer18).semantic.text.standard, (Composer) gapComposer18, SpacerKt.m302paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7), Strings.getTypography(gapComposer18).pageTitle, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.local_views_local_widget_local_cash), (Map) null, (Function1) null, false);
                    Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    String str9 = localCashBalanceViewModel.balanceText;
                    zzacn.m2012AutoScaleTextZLomxE(1, 5, 0, 1597488, MLKEMEngine.KyberPolyBytes, Strings.getColors(gapComposer18).semantic.text.standard, Room.getSp(8), gapComposer18, fillMaxWidth2, Strings.getTypography(gapComposer18).numeralLarge, str9 == null ? "" : str9, null);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                LocalEditorialContent.Image image = (LocalEditorialContent.Image) obj4;
                Composer composer15 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer15;
                if (gapComposer19.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Modifier fillMaxWidth3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    LocalImage localImage = image.value;
                    Float ratio = LocalViewsKt.getRatio(localImage);
                    if (ratio != null) {
                        fillMaxWidth3 = fillMaxWidth3.then(OffsetKt.aspectRatio(ratio.floatValue(), companion, false));
                    }
                    LocalColor localColor = localImage.placeholder_color;
                    if (localColor == null) {
                        gapComposer19.startReplaceGroup(289404800);
                        gapComposer19.end(false);
                        m = null;
                    } else {
                        gapComposer19.startReplaceGroup(-1791779679);
                        m = Recorder$$ExternalSyntheticOutline1.m(gapComposer19, false, LocalViewsKt.toComposeColor(localColor, gapComposer19, 0));
                    }
                    if (m != null) {
                        fillMaxWidth3 = fillMaxWidth3.then(ImageKt.m177backgroundbw27NRU(companion, m.value, ColorKt.RectangleShape));
                    }
                    LocalMapKt.LocalAsyncImage(fillMaxWidth3, null, LocalViewsKt.getThemedUrl(localImage, gapComposer19), ContentScale.Companion.FillWidth, null, null, null, gapComposer19, 3072, 114);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                LocalEditorialContent.Spacer spacer = (LocalEditorialContent.Spacer) obj4;
                Composer composer16 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer16;
                if (gapComposer20.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    boolean z4 = spacer.divider;
                    int i5 = spacer.height;
                    if (z4) {
                        gapComposer20.startReplaceGroup(705714043);
                        ((DefaultSizes) gapComposer20.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        ModalKt.HorizontalDivider(0, 0, gapComposer20, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, i5 / 2));
                        gapComposer20.end(false);
                    } else {
                        gapComposer20.startReplaceGroup(705997538);
                        re$$ExternalSyntheticOutline0.m(companion, i5, gapComposer20, false);
                    }
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                SchedulingDayTimePickerViewModel.ModelState.LoadedDays loadedDays = (SchedulingDayTimePickerViewModel.ModelState.LoadedDays) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer17;
                if (gapComposer21.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    FulfillmentRadioCellKt.EmptyStateBanner(SpacerKt.m300paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), loadedDays.selectedDay, gapComposer21, 6);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                LocalBottomModalViewModel localBottomModalViewModel = (LocalBottomModalViewModel) obj4;
                Composer composer18 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer18;
                if (gapComposer22.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer22, (Modifier) null, ((com.squareup.cash.arcade.Typography) gapComposer22.consume(ArcadeThemeKt.LocalTypography)).button, (TextLineBalancing) null, localBottomModalViewModel.callToActionText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                ExpandableSectionHeaderData expandableSectionHeaderData = (ExpandableSectionHeaderData) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer19;
                if (gapComposer23.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Icons icons = expandableSectionHeaderData.icon;
                    gapComposer23.startReplaceGroup(-2120917072);
                    Color color = expandableSectionHeaderData.iconColor;
                    gapComposer23.startReplaceGroup(-548974881);
                    gapComposer23.end(false);
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, color.value, gapComposer23, 48, 4);
                    ((DefaultSizes) gapComposer23.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    SpacerKt.Spacer(gapComposer23, androidx.compose.foundation.layout.SizeKt.m290width3ABfNKs(companion, 8.0f));
                    gapComposer23.end(false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, expandableSectionHeaderData.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                return invoke$app$cash$local$views$marketingmessages$MarketingMessageKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 26:
                return invoke$app$cash$local$views$pos$LocalPosBrandOnboardingViewKt$$ExternalSyntheticLambda21(obj, obj2, obj3);
            case 27:
                return invoke$app$cash$local$views$sheet$LoyaltySheetKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 28:
                return invoke$app$cash$local$views$wallet$TabContentViewKt$$ExternalSyntheticLambda55(obj, obj2, obj3);
            default:
                LocalHomeViewModel.TabContent.Widget.PastOrders.PastOrder pastOrder = (LocalHomeViewModel.TabContent.Widget.PastOrders.PastOrder) obj4;
                Composer composer20 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer20;
                if (gapComposer24.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, pastOrder.ctaLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
