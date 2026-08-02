package androidx.compose.foundation.text;

import androidx.camera.video.Recorder;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.viewmodels.CouponSection;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalCheckoutGiftCardSectionViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentSectionViewModel;
import app.cash.local.viewmodels.LocalCheckoutSpecialInstructionsViewModel;
import app.cash.local.viewmodels.LocalCheckoutTipSectionViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.brand.checkout.CheckoutCouponSectionKt$$ExternalSyntheticLambda3;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt$$ExternalSyntheticLambda8;
import app.cash.local.views.brand.checkout.LocalOpenTabCheckoutViewKt$$ExternalSyntheticLambda7;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import coil3.size.SizeKt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda16;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z, boolean z2, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping) {
        this.f$0 = legacyTextFieldState;
        this.f$1 = focusRequester;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = textFieldSelectionManager;
        this.f$5 = offsetMapping;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        int i = this.$r8$classId;
        int i2 = 5;
        boolean z = this.f$3;
        Object obj2 = this.f$5;
        Object obj3 = this.f$4;
        Object obj4 = this.f$1;
        boolean z2 = this.f$2;
        Object obj5 = this.f$0;
        int i3 = 1;
        switch (i) {
            case 0:
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj5;
                FocusRequester focusRequester = (FocusRequester) obj4;
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj3;
                OffsetMapping offsetMapping = (OffsetMapping) obj2;
                Offset offset = (Offset) obj;
                if (!legacyTextFieldState.getHasFocus()) {
                    FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
                } else if (!z2 && (delegatingSoftwareKeyboardController = legacyTextFieldState.keyboardController) != null) {
                    delegatingSoftwareKeyboardController.show();
                }
                if (legacyTextFieldState.getHasFocus() && z) {
                    if (legacyTextFieldState.getHandleState() != HandleState.Selection) {
                        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                        if (layoutResult != null) {
                            long j = offset.packedValue;
                            Recorder.AnonymousClass1 anonymousClass1 = legacyTextFieldState.processor;
                            CoreTextFieldKt$$ExternalSyntheticLambda2 coreTextFieldKt$$ExternalSyntheticLambda2 = legacyTextFieldState.onValueChange;
                            int transformedToOriginal = offsetMapping.transformedToOriginal(layoutResult.m369getOffsetForPosition3MmeM6k(j, true));
                            coreTextFieldKt$$ExternalSyntheticLambda2.invoke(TextFieldValue.m1001copy3r_uNRQ$default((TextFieldValue) anonymousClass1.val$videoEncoderSession, (AnnotatedString) null, SizeKt.TextRange(transformedToOriginal, transformedToOriginal), 5));
                            if (legacyTextFieldState.textDelegate.text.text.length() > 0) {
                                legacyTextFieldState.handleState$delegate.setValue(HandleState.Cursor);
                            }
                        }
                    } else {
                        textFieldSelectionManager.m456deselect_kEHs6E$foundation(offset);
                    }
                }
                break;
            default:
                LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel = (LocalBrandLocationCheckoutViewModel) obj5;
                Function1 function1 = (Function1) obj4;
                TextFieldState textFieldState = (TextFieldState) obj3;
                TextFieldState textFieldState2 = (TextFieldState) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LocalBrandLocationCheckoutViewModel.ReviewMode reviewMode = localBrandLocationCheckoutViewModel.reviewMode;
                OrderBuilderModel.OrderType orderType = localBrandLocationCheckoutViewModel.orderType;
                LocalBrandLocationCheckoutViewModel.ReviewMode reviewMode2 = LocalBrandLocationCheckoutViewModel.ReviewMode.STANDARD;
                if (reviewMode == reviewMode2) {
                    LocalBrandLocationCartViewModel.Fulfillment fulfillment = localBrandLocationCheckoutViewModel.fulfillment;
                    if (fulfillment != null) {
                        LazyListScope.item$default(lazyListScope, null, "checkout_info_entry", new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda6(i2, fulfillment, localBrandLocationCheckoutViewModel, function1), true, -1769187850), 1);
                    }
                    GpsCoordinates gpsCoordinates = localBrandLocationCheckoutViewModel.addressCoordinates;
                    if (gpsCoordinates != null) {
                        LazyListScope.item$default(lazyListScope, null, "checkout_map_view", new ComposableLambdaImpl(new SliderDefaults$$ExternalSyntheticLambda3(gpsCoordinates, 7), true, -1546576460), 1);
                        LazyListScope.item$default(lazyListScope, null, "checkout_divider", CheckoutTipSectionKt.lambda$2119896669, 1);
                    }
                }
                LazyListScope.item$default(lazyListScope, null, "checkout_buyer_info", new ComposableLambdaImpl(new ComposeDialogKt$$ExternalSyntheticLambda12(localBrandLocationCheckoutViewModel, textFieldState, textFieldState2, function1, 5), true, -84539870), 1);
                LazyListScope.item$default(lazyListScope, null, "checkout_divider", CheckoutTipSectionKt.lambda$1864711001, 1);
                LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel = localBrandLocationCheckoutViewModel.paymentSection;
                if (localCheckoutPaymentSectionViewModel != null) {
                    LazyListScope.item$default(lazyListScope, null, "checkout_info_entry", new ComposableLambdaImpl(new PagerDefaults$$ExternalSyntheticLambda0(17, localCheckoutPaymentSectionViewModel, function1), true, 1877089637), 1);
                    LazyListScope.item$default(lazyListScope, null, "checkout_divider", CheckoutTipSectionKt.lambda$632950478, 1);
                }
                LocalCheckoutGiftCardSectionViewModel localCheckoutGiftCardSectionViewModel = localBrandLocationCheckoutViewModel.giftCardSection;
                if (localCheckoutGiftCardSectionViewModel != null) {
                    if (localCheckoutGiftCardSectionViewModel.input == null && localCheckoutGiftCardSectionViewModel.appliedGiftCards.isEmpty()) {
                        localCheckoutGiftCardSectionViewModel = null;
                    }
                    if (localCheckoutGiftCardSectionViewModel != null) {
                        LazyListScope.item$default(lazyListScope, null, "checkout_info_entry", new ComposableLambdaImpl(new PagerDefaults$$ExternalSyntheticLambda0(14, localCheckoutGiftCardSectionViewModel, function1), true, -1632890620), 1);
                        LazyListScope.item$default(lazyListScope, null, "checkout_divider", CheckoutTipSectionKt.f28lambda$214811909, 1);
                    }
                }
                CouponSection couponSection = localBrandLocationCheckoutViewModel.couponSection;
                if (couponSection != null) {
                    LazyListScope.item$default(lazyListScope, null, "checkout_coupon_section", new ComposableLambdaImpl(new CheckoutCouponSectionKt$$ExternalSyntheticLambda3(couponSection, function1, i3), true, -229240492), 1);
                    LazyListScope.item$default(lazyListScope, null, "checkout_divider", CheckoutTipSectionKt.f26lambda$1199837109, 1);
                }
                LocalCheckoutTipSectionViewModel localCheckoutTipSectionViewModel = localBrandLocationCheckoutViewModel.tipSection;
                if (localCheckoutTipSectionViewModel != null) {
                    if (!localCheckoutTipSectionViewModel.isEnabled || localCheckoutTipSectionViewModel.options.isEmpty()) {
                        localCheckoutTipSectionViewModel = null;
                    }
                    if (localCheckoutTipSectionViewModel != null) {
                        LazyListScope.item$default(lazyListScope, null, "checkout_info_entry", new ComposableLambdaImpl(new CheckoutTipSectionKt$$ExternalSyntheticLambda8(localCheckoutTipSectionViewModel, function1, i3), true, 1807619315), 1);
                        LazyListScope.item$default(lazyListScope, null, "checkout_divider", CheckoutTipSectionKt.f27lambda$1232778084, 1);
                    }
                }
                LocalBrandLocationCheckoutViewModel.CurbsidePickupSection curbsidePickupSection = localBrandLocationCheckoutViewModel.curbsidePickupSection;
                if (curbsidePickupSection != null && localBrandLocationCheckoutViewModel.reviewMode == reviewMode2 && (orderType instanceof OrderBuilderModel.OrderType.Pickup)) {
                    LazyListScope.item$default(lazyListScope, null, "checkout_curbside_pickup_info", new ComposableLambdaImpl(new PagerDefaults$$ExternalSyntheticLambda0(15, curbsidePickupSection, function1), true, -954272926), 1);
                }
                if (!Intrinsics.areEqual(orderType, OrderBuilderModel.OrderType.Pickup.INSTANCE)) {
                    if (!Intrinsics.areEqual(orderType, OrderBuilderModel.OrderType.IdVerificationRequired.INSTANCE)) {
                        if (!(orderType instanceof OrderBuilderModel.OrderType.Regular)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            LazyListScope.item$default(lazyListScope, null, "checkout_drop_off_notes", new ComposableLambdaImpl(new PagerDefaults$$ExternalSyntheticLambda0(16, orderType, function1), true, 848329565), 1);
                        }
                    } else {
                        LazyListScope.item$default(lazyListScope, null, "checkout_idv_required", CheckoutTipSectionKt.f29lambda$649116546, 1);
                    }
                }
                LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel = localBrandLocationCheckoutViewModel.notes;
                if (localCheckoutSpecialInstructionsViewModel != null) {
                    LazyListScope.item$default(lazyListScope, null, "checkout_special_instructions", new ComposableLambdaImpl(new LocalOpenTabCheckoutViewKt$$ExternalSyntheticLambda7(localCheckoutSpecialInstructionsViewModel, function1, i3), true, 1828520720), 1);
                }
                if (z2) {
                    LazyListScope.item$default(lazyListScope, null, "checkout_divider", CheckoutTipSectionKt.lambda$84723700, 1);
                }
                LazyListScope.item$default(lazyListScope, null, "checkout_order_summary", new ComposableLambdaImpl(new MoneyTabUIKt$$ExternalSyntheticLambda16(localBrandLocationCheckoutViewModel, z, i3), true, 1633448282), 1);
                String str = localBrandLocationCheckoutViewModel.policies;
                if (str != null) {
                    LazyListScope.item$default(lazyListScope, null, "checkout_store_policies", new ComposableLambdaImpl(new TabContentViewKt$$ExternalSyntheticLambda11(str, function1, i3), true, -1028797889), 1);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1(LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel, boolean z, Function1 function1, TextFieldState textFieldState, TextFieldState textFieldState2, boolean z2) {
        this.f$0 = localBrandLocationCheckoutViewModel;
        this.f$2 = z;
        this.f$1 = function1;
        this.f$4 = textFieldState;
        this.f$5 = textFieldState2;
        this.f$3 = z2;
    }
}
