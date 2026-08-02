package com.squareup.cash.buynowpaylater.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.timeline.viewmodels.TimelineWidgetModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AfterPayOrderDetailsViewModel {

    public final class OrderDetailsErrorLoading extends AfterPayOrderDetailsViewModel {
        public final String message;

        public OrderDetailsErrorLoading(String str) {
            str.getClass();
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderDetailsErrorLoading) && Intrinsics.areEqual(this.message, ((OrderDetailsErrorLoading) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OrderDetailsErrorLoading(message=", this.message, ")");
        }
    }

    public final class OrderDetailsLoading extends AfterPayOrderDetailsViewModel {
        public static final OrderDetailsLoading INSTANCE = new OrderDetailsLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OrderDetailsLoading);
        }

        public final int hashCode() {
            return 28309767;
        }

        public final String toString() {
            return "OrderDetailsLoading";
        }
    }

    public final class ShowingOrderDetailsViewModel extends AfterPayOrderDetailsViewModel {
        public final List availablePaymentMethods;
        public final Avatar avatar;
        public final TextModel balanceSummary;
        public final TextModel infoText;
        public final InfoTileCardViewModel infoTileCard;
        public final TextModel merchantName;
        public final List orderDetailSections;
        public final AfterPayOrderDetailsPaymentMethodModel orderDetailsPaymentMethodModel;
        public final TextModel orderDetailsTitle;
        public final List overflowActions;
        public final ActionButton payEarlyButton;
        public final TextModel purchaseAmount;
        public final SUPOrderDetailsViewModel supOrderDetails;
        public final TimelineWidgetModel timelineModel;

        public ShowingOrderDetailsViewModel(Avatar avatar, TextModel textModel, TextModel textModel2, InfoTileCardViewModel infoTileCardViewModel, AfterPayOrderDetailsPaymentMethodModel afterPayOrderDetailsPaymentMethodModel, TextModel textModel3, TimelineWidgetModel timelineWidgetModel, TextModel textModel4, TextModel textModel5, ArrayList arrayList, ArrayList arrayList2, ActionButton actionButton, SUPOrderDetailsViewModel sUPOrderDetailsViewModel) {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.avatar = avatar;
            this.merchantName = textModel;
            this.purchaseAmount = textModel2;
            this.infoTileCard = infoTileCardViewModel;
            this.orderDetailsPaymentMethodModel = afterPayOrderDetailsPaymentMethodModel;
            this.availablePaymentMethods = emptyList;
            this.balanceSummary = textModel3;
            this.timelineModel = timelineWidgetModel;
            this.infoText = textModel4;
            this.orderDetailsTitle = textModel5;
            this.orderDetailSections = arrayList;
            this.overflowActions = arrayList2;
            this.payEarlyButton = actionButton;
            this.supOrderDetails = sUPOrderDetailsViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowingOrderDetailsViewModel)) {
                return false;
            }
            ShowingOrderDetailsViewModel showingOrderDetailsViewModel = (ShowingOrderDetailsViewModel) obj;
            return this.avatar.equals(showingOrderDetailsViewModel.avatar) && Intrinsics.areEqual(this.merchantName, showingOrderDetailsViewModel.merchantName) && Intrinsics.areEqual(this.purchaseAmount, showingOrderDetailsViewModel.purchaseAmount) && Intrinsics.areEqual(this.infoTileCard, showingOrderDetailsViewModel.infoTileCard) && this.orderDetailsPaymentMethodModel.equals(showingOrderDetailsViewModel.orderDetailsPaymentMethodModel) && Intrinsics.areEqual(this.availablePaymentMethods, showingOrderDetailsViewModel.availablePaymentMethods) && Intrinsics.areEqual(this.balanceSummary, showingOrderDetailsViewModel.balanceSummary) && this.timelineModel.equals(showingOrderDetailsViewModel.timelineModel) && Intrinsics.areEqual(this.infoText, showingOrderDetailsViewModel.infoText) && Intrinsics.areEqual(this.orderDetailsTitle, showingOrderDetailsViewModel.orderDetailsTitle) && this.orderDetailSections.equals(showingOrderDetailsViewModel.orderDetailSections) && this.overflowActions.equals(showingOrderDetailsViewModel.overflowActions) && Intrinsics.areEqual(this.payEarlyButton, showingOrderDetailsViewModel.payEarlyButton) && Intrinsics.areEqual(this.supOrderDetails, showingOrderDetailsViewModel.supOrderDetails);
        }

        public final int hashCode() {
            int hashCode = this.avatar.hashCode() * 31;
            TextModel textModel = this.merchantName;
            int hashCode2 = (hashCode + (textModel == null ? 0 : textModel.hashCode())) * 31;
            TextModel textModel2 = this.purchaseAmount;
            int hashCode3 = (hashCode2 + (textModel2 == null ? 0 : textModel2.hashCode())) * 31;
            InfoTileCardViewModel infoTileCardViewModel = this.infoTileCard;
            int hashCode4 = (this.orderDetailsPaymentMethodModel.hashCode() + ((hashCode3 + (infoTileCardViewModel == null ? 0 : infoTileCardViewModel.hashCode())) * 31)) * 961;
            List list = this.availablePaymentMethods;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            TextModel textModel3 = this.balanceSummary;
            int hashCode6 = (this.timelineModel.hashCode() + ((hashCode5 + (textModel3 == null ? 0 : textModel3.hashCode())) * 31)) * 31;
            TextModel textModel4 = this.infoText;
            int hashCode7 = (hashCode6 + (textModel4 == null ? 0 : textModel4.hashCode())) * 31;
            TextModel textModel5 = this.orderDetailsTitle;
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (textModel5 == null ? 0 : textModel5.hashCode())) * 31, 31, this.orderDetailSections), 31, this.overflowActions);
            ActionButton actionButton = this.payEarlyButton;
            int hashCode8 = (m + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
            SUPOrderDetailsViewModel sUPOrderDetailsViewModel = this.supOrderDetails;
            return hashCode8 + (sUPOrderDetailsViewModel != null ? sUPOrderDetailsViewModel.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowingOrderDetailsViewModel(avatar=");
            sb.append(this.avatar);
            sb.append(", merchantName=");
            sb.append(this.merchantName);
            sb.append(", purchaseAmount=");
            sb.append(this.purchaseAmount);
            sb.append(", infoTileCard=");
            sb.append(this.infoTileCard);
            sb.append(", orderDetailsPaymentMethodModel=");
            sb.append(this.orderDetailsPaymentMethodModel);
            sb.append(", orderPaymentViewModel=null, availablePaymentMethods=");
            sb.append(this.availablePaymentMethods);
            sb.append(", balanceSummary=");
            sb.append(this.balanceSummary);
            sb.append(", timelineModel=");
            sb.append(this.timelineModel);
            sb.append(", infoText=");
            sb.append(this.infoText);
            sb.append(", orderDetailsTitle=");
            sb.append(this.orderDetailsTitle);
            sb.append(", orderDetailSections=");
            Request$Priority$EnumUnboxingLocalUtility.m(sb, this.orderDetailSections, ", overflowActions=", this.overflowActions, ", payEarlyButton=");
            sb.append(this.payEarlyButton);
            sb.append(", supOrderDetails=");
            sb.append(this.supOrderDetails);
            sb.append(")");
            return sb.toString();
        }
    }
}
