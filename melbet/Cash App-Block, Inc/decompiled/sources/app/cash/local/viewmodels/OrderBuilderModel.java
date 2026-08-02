package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.Cart;
import app.cash.local.primitives.ComputedOrderSummary;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.PaymentMethodToken;
import app.cash.local.viewmodels.internal.CanWorkAsync;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.CurbsidePickupSettings;
import com.squareup.protos.cash.local.client.v1.LegalConsent;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OrderBuilderModel implements CanWorkAsync {
    public final List availableOrderWorkflows;
    public final BuyerInfo buyerInfo;
    public final Cart cart;
    public final ComputedOrderSummary computedOrderSummary;
    public final CurbsidePickupDetails curbsidePickupDetails;
    public final CurbsidePickupSettings curbsidePickupSettings;
    public final List discountCodes;
    public final LocalErrorResponse.Error discountCodesError;
    public final LocalMoney estimatedEarnings;
    public final Fulfillment fulfillment;
    public final List giftCardCodes;
    public final LocalErrorResponse giftCardError;
    public final List giftCards;
    public final boolean isWorkingAsync;
    public final LocalMoney localCashRedeemableValue;
    public final CreateCartResponse.CartLoyaltySummary loyaltySummary;
    public final OrderType orderType;
    public final PaymentMethodConfig paymentMethodConfig;
    public final boolean redeemLocalCash;
    public final LocalMoney tipAmount;
    public final boolean updatingCart;

    public abstract class OrderType {

        public abstract class Delivery extends OrderType {
        }

        public final class IdVerificationRequired extends Delivery {
            public static final IdVerificationRequired INSTANCE = new IdVerificationRequired();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof IdVerificationRequired);
            }

            public final int hashCode() {
                return -706984293;
            }

            public final String toString() {
                return "IdVerificationRequired";
            }
        }

        public final class Pickup extends OrderType {
            public static final Pickup INSTANCE = new Pickup();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Pickup);
            }

            public final int hashCode() {
                return 1485331586;
            }

            public final String toString() {
                return "Pickup";
            }
        }

        public final class Regular extends Delivery {
            public final String dropoffNotes;
            public final boolean noContactDelivery;

            public Regular(boolean z, String str) {
                this.noContactDelivery = z;
                this.dropoffNotes = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Regular)) {
                    return false;
                }
                Regular regular = (Regular) obj;
                return this.noContactDelivery == regular.noContactDelivery && Intrinsics.areEqual(this.dropoffNotes, regular.dropoffNotes);
            }

            public final int hashCode() {
                int hashCode = Boolean.hashCode(this.noContactDelivery) * 31;
                String str = this.dropoffNotes;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return "Regular(noContactDelivery=" + this.noContactDelivery + ", dropoffNotes=" + this.dropoffNotes + ")";
            }
        }

        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.ViewDirectDepositSetupWithoutNuxDeprecated.deepLinkSpecs;
        }
    }

    public final class PaymentMethodConfig {
        public final ArrayList paymentMethods;
        public final String selectedPaymentMethodToken;

        public PaymentMethodConfig(String str, ArrayList arrayList) {
            str.getClass();
            this.selectedPaymentMethodToken = str;
            this.paymentMethods = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodConfig)) {
                return false;
            }
            PaymentMethodConfig paymentMethodConfig = (PaymentMethodConfig) obj;
            return Intrinsics.areEqual(this.selectedPaymentMethodToken, paymentMethodConfig.selectedPaymentMethodToken) && this.paymentMethods.equals(paymentMethodConfig.paymentMethods);
        }

        public final int hashCode() {
            return this.paymentMethods.hashCode() + (this.selectedPaymentMethodToken.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.paymentMethods, "PaymentMethodConfig(selectedPaymentMethodToken=", PaymentMethodToken.m1282toStringimpl(this.selectedPaymentMethodToken), ", paymentMethods=", ")");
        }
    }

    public OrderBuilderModel(Cart cart, ComputedOrderSummary computedOrderSummary, List list, boolean z, BuyerInfo buyerInfo, LocalMoney localMoney, OrderType orderType, Fulfillment fulfillment, CreateCartResponse.CartLoyaltySummary cartLoyaltySummary, PaymentMethodConfig paymentMethodConfig, LocalMoney localMoney2, LocalMoney localMoney3, boolean z2, List list2, List list3, LocalErrorResponse localErrorResponse, List list4, LocalErrorResponse.Error error, CurbsidePickupDetails curbsidePickupDetails, CurbsidePickupSettings curbsidePickupSettings, boolean z3) {
        cart.getClass();
        list.getClass();
        buyerInfo.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        curbsidePickupDetails.getClass();
        this.cart = cart;
        this.computedOrderSummary = computedOrderSummary;
        this.availableOrderWorkflows = list;
        this.redeemLocalCash = z;
        this.buyerInfo = buyerInfo;
        this.localCashRedeemableValue = localMoney;
        this.orderType = orderType;
        this.fulfillment = fulfillment;
        this.loyaltySummary = cartLoyaltySummary;
        this.paymentMethodConfig = paymentMethodConfig;
        this.estimatedEarnings = localMoney2;
        this.tipAmount = localMoney3;
        this.updatingCart = z2;
        this.giftCards = list2;
        this.giftCardCodes = list3;
        this.giftCardError = localErrorResponse;
        this.discountCodes = list4;
        this.discountCodesError = error;
        this.curbsidePickupDetails = curbsidePickupDetails;
        this.curbsidePickupSettings = curbsidePickupSettings;
        this.isWorkingAsync = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderBuilderModel)) {
            return false;
        }
        OrderBuilderModel orderBuilderModel = (OrderBuilderModel) obj;
        return Intrinsics.areEqual(this.cart, orderBuilderModel.cart) && Intrinsics.areEqual(this.computedOrderSummary, orderBuilderModel.computedOrderSummary) && Intrinsics.areEqual(this.availableOrderWorkflows, orderBuilderModel.availableOrderWorkflows) && this.redeemLocalCash == orderBuilderModel.redeemLocalCash && Intrinsics.areEqual(this.buyerInfo, orderBuilderModel.buyerInfo) && Intrinsics.areEqual(this.localCashRedeemableValue, orderBuilderModel.localCashRedeemableValue) && this.orderType.equals(orderBuilderModel.orderType) && Intrinsics.areEqual(this.fulfillment, orderBuilderModel.fulfillment) && Intrinsics.areEqual(this.loyaltySummary, orderBuilderModel.loyaltySummary) && this.paymentMethodConfig.equals(orderBuilderModel.paymentMethodConfig) && Intrinsics.areEqual(this.estimatedEarnings, orderBuilderModel.estimatedEarnings) && Intrinsics.areEqual(this.tipAmount, orderBuilderModel.tipAmount) && this.updatingCart == orderBuilderModel.updatingCart && Intrinsics.areEqual(this.giftCards, orderBuilderModel.giftCards) && Intrinsics.areEqual(this.giftCardCodes, orderBuilderModel.giftCardCodes) && Intrinsics.areEqual(this.giftCardError, orderBuilderModel.giftCardError) && Intrinsics.areEqual(this.discountCodes, orderBuilderModel.discountCodes) && Intrinsics.areEqual(this.discountCodesError, orderBuilderModel.discountCodesError) && Intrinsics.areEqual(this.curbsidePickupDetails, orderBuilderModel.curbsidePickupDetails) && Intrinsics.areEqual(this.curbsidePickupSettings, orderBuilderModel.curbsidePickupSettings) && this.isWorkingAsync == orderBuilderModel.isWorkingAsync;
    }

    public final int hashCode() {
        int hashCode = this.cart.hashCode() * 31;
        ComputedOrderSummary computedOrderSummary = this.computedOrderSummary;
        int hashCode2 = (this.buyerInfo.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (computedOrderSummary == null ? 0 : computedOrderSummary.hashCode())) * 31, 31, this.availableOrderWorkflows), 31, this.redeemLocalCash)) * 31;
        LocalMoney localMoney = this.localCashRedeemableValue;
        int hashCode3 = (this.orderType.hashCode() + ((hashCode2 + (localMoney == null ? 0 : localMoney.hashCode())) * 31)) * 31;
        Fulfillment fulfillment = this.fulfillment;
        int hashCode4 = (hashCode3 + (fulfillment == null ? 0 : fulfillment.hashCode())) * 31;
        CreateCartResponse.CartLoyaltySummary cartLoyaltySummary = this.loyaltySummary;
        int hashCode5 = (this.paymentMethodConfig.hashCode() + ((hashCode4 + (cartLoyaltySummary == null ? 0 : cartLoyaltySummary.hashCode())) * 31)) * 31;
        LocalMoney localMoney2 = this.estimatedEarnings;
        int hashCode6 = (hashCode5 + (localMoney2 == null ? 0 : localMoney2.hashCode())) * 31;
        LocalMoney localMoney3 = this.tipAmount;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (localMoney3 == null ? 0 : localMoney3.hashCode())) * 31, 31, this.updatingCart), 31, this.giftCards), 31, this.giftCardCodes);
        LocalErrorResponse localErrorResponse = this.giftCardError;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (localErrorResponse == null ? 0 : localErrorResponse.hashCode())) * 31, 31, this.discountCodes);
        LocalErrorResponse.Error error = this.discountCodesError;
        int hashCode7 = (this.curbsidePickupDetails.hashCode() + ((m2 + (error == null ? 0 : error.hashCode())) * 31)) * 31;
        CurbsidePickupSettings curbsidePickupSettings = this.curbsidePickupSettings;
        return Boolean.hashCode(this.isWorkingAsync) + ((hashCode7 + (curbsidePickupSettings != null ? curbsidePickupSettings.hashCode() : 0)) * 31);
    }

    @Override // app.cash.local.viewmodels.internal.CanWorkAsync
    public final boolean isWorkingAsync() {
        return this.isWorkingAsync;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderBuilderModel(cart=");
        sb.append(this.cart);
        sb.append(", computedOrderSummary=");
        sb.append(this.computedOrderSummary);
        sb.append(", availableOrderWorkflows=");
        sb.append(this.availableOrderWorkflows);
        sb.append(", redeemLocalCash=");
        sb.append(this.redeemLocalCash);
        sb.append(", buyerInfo=");
        sb.append(this.buyerInfo);
        sb.append(", localCashRedeemableValue=");
        sb.append(this.localCashRedeemableValue);
        sb.append(", orderType=");
        sb.append(this.orderType);
        sb.append(", fulfillment=");
        sb.append(this.fulfillment);
        sb.append(", loyaltySummary=");
        sb.append(this.loyaltySummary);
        sb.append(", paymentMethodConfig=");
        sb.append(this.paymentMethodConfig);
        sb.append(", estimatedEarnings=");
        sb.append(this.estimatedEarnings);
        sb.append(", tipAmount=");
        sb.append(this.tipAmount);
        sb.append(", updatingCart=");
        sb.append(this.updatingCart);
        sb.append(", giftCards=");
        sb.append(this.giftCards);
        sb.append(", giftCardCodes=");
        sb.append(this.giftCardCodes);
        sb.append(", giftCardError=");
        sb.append(this.giftCardError);
        sb.append(", discountCodes=");
        sb.append(this.discountCodes);
        sb.append(", discountCodesError=");
        sb.append(this.discountCodesError);
        sb.append(", curbsidePickupDetails=");
        sb.append(this.curbsidePickupDetails);
        sb.append(", curbsidePickupSettings=");
        sb.append(this.curbsidePickupSettings);
        sb.append(", isWorkingAsync=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isWorkingAsync, ")");
    }

    public abstract class BuyerInfo {

        public final class Unvalidated extends BuyerInfo {
            public final LegalConsent legalConsent;
            public final String name;
            public final String phone;

            public Unvalidated(String str, String str2, LegalConsent legalConsent) {
                this.name = str;
                this.phone = str2;
                this.legalConsent = legalConsent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Unvalidated)) {
                    return false;
                }
                Unvalidated unvalidated = (Unvalidated) obj;
                return Intrinsics.areEqual(this.name, unvalidated.name) && Intrinsics.areEqual(this.phone, unvalidated.phone) && Intrinsics.areEqual(this.legalConsent, unvalidated.legalConsent);
            }

            @Override // app.cash.local.viewmodels.OrderBuilderModel.BuyerInfo
            public final LegalConsent getLegalConsent() {
                return this.legalConsent;
            }

            @Override // app.cash.local.viewmodels.OrderBuilderModel.BuyerInfo
            public final String getName() {
                return this.name;
            }

            @Override // app.cash.local.viewmodels.OrderBuilderModel.BuyerInfo
            public final String getPhone() {
                return this.phone;
            }

            public final int hashCode() {
                String str = this.name;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.phone;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                LegalConsent legalConsent = this.legalConsent;
                return hashCode2 + (legalConsent != null ? legalConsent.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unvalidated(name=", this.name, ", phone=", this.phone, ", legalConsent=");
                m.append(this.legalConsent);
                m.append(")");
                return m.toString();
            }
        }

        public abstract LegalConsent getLegalConsent();

        public abstract String getName();

        public abstract String getPhone();

        public abstract class UiReady extends BuyerInfo {

            public final class Validated extends UiReady {
                public final LegalConsent legalConsent;
                public final String name;
                public final String phone;

                public Validated(String str, String str2, LegalConsent legalConsent) {
                    this.name = str;
                    this.phone = str2;
                    this.legalConsent = legalConsent;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Validated)) {
                        return false;
                    }
                    Validated validated = (Validated) obj;
                    return this.name.equals(validated.name) && this.phone.equals(validated.phone) && Intrinsics.areEqual(this.legalConsent, validated.legalConsent);
                }

                @Override // app.cash.local.viewmodels.OrderBuilderModel.BuyerInfo
                public final LegalConsent getLegalConsent() {
                    return this.legalConsent;
                }

                @Override // app.cash.local.viewmodels.OrderBuilderModel.BuyerInfo
                public final String getName() {
                    return this.name;
                }

                @Override // app.cash.local.viewmodels.OrderBuilderModel.BuyerInfo
                public final String getPhone() {
                    return this.phone;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.phone);
                    LegalConsent legalConsent = this.legalConsent;
                    return m + (legalConsent == null ? 0 : legalConsent.hashCode());
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Validated(name=", this.name, ", phone=", this.phone, ", legalConsent=");
                    m.append(this.legalConsent);
                    m.append(")");
                    return m.toString();
                }
            }

            public final class Editing extends UiReady {
                public final LegalConsent legalConsent;
                public final String name;
                public final InputError nameError;
                public final String phone;
                public final InputError phoneError;

                public Editing(String str, InputError inputError, String str2, InputError inputError2, LegalConsent legalConsent) {
                    this.name = str;
                    this.nameError = inputError;
                    this.phone = str2;
                    this.phoneError = inputError2;
                    this.legalConsent = legalConsent;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Editing)) {
                        return false;
                    }
                    Editing editing = (Editing) obj;
                    return Intrinsics.areEqual(this.name, editing.name) && Intrinsics.areEqual(this.nameError, editing.nameError) && Intrinsics.areEqual(this.phone, editing.phone) && Intrinsics.areEqual(this.phoneError, editing.phoneError) && Intrinsics.areEqual(this.legalConsent, editing.legalConsent);
                }

                @Override // app.cash.local.viewmodels.OrderBuilderModel.BuyerInfo
                public final LegalConsent getLegalConsent() {
                    return this.legalConsent;
                }

                @Override // app.cash.local.viewmodels.OrderBuilderModel.BuyerInfo
                public final String getName() {
                    return this.name;
                }

                @Override // app.cash.local.viewmodels.OrderBuilderModel.BuyerInfo
                public final String getPhone() {
                    return this.phone;
                }

                public final int hashCode() {
                    String str = this.name;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    InputError inputError = this.nameError;
                    int hashCode2 = (hashCode + (inputError == null ? 0 : inputError.hashCode())) * 31;
                    String str2 = this.phone;
                    int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    InputError inputError2 = this.phoneError;
                    int hashCode4 = (hashCode3 + (inputError2 == null ? 0 : inputError2.hashCode())) * 31;
                    LegalConsent legalConsent = this.legalConsent;
                    return hashCode4 + (legalConsent != null ? legalConsent.hashCode() : 0);
                }

                public final String toString() {
                    return "Editing(name=" + this.name + ", nameError=" + this.nameError + ", phone=" + this.phone + ", phoneError=" + this.phoneError + ", legalConsent=" + this.legalConsent + ")";
                }

                public /* synthetic */ Editing(String str, String str2, LegalConsent legalConsent) {
                    this(str, null, str2, null, legalConsent);
                }
            }
        }
    }
}
