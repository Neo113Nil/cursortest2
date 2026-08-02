package com.squareup.cash.db2.payment;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentRequest;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.investing.resources.InvestPaymentData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PendingPayment {
    public final Money amount;
    public final ClientScenario client_scenario;
    public final long created_at;
    public final String external_id;
    public final InvestPaymentData invest_payment_data;
    public final Orientation orientation;
    public final InitiatePersonalizedPaymentRequest personalization;
    public final Boolean ready_for_removal;
    public final long recipients;
    public final InitiatePaymentRequest request;
    public final long retry_at;
    public final long retry_count;
    public final boolean succeeded;

    public PendingPayment(String str, long j, long j2, long j3, InitiatePaymentRequest initiatePaymentRequest, Money money, Orientation orientation, boolean z, long j4, InvestPaymentData investPaymentData, ClientScenario clientScenario, InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest, Boolean bool) {
        initiatePaymentRequest.getClass();
        money.getClass();
        orientation.getClass();
        this.external_id = str;
        this.created_at = j;
        this.retry_at = j2;
        this.retry_count = j3;
        this.request = initiatePaymentRequest;
        this.amount = money;
        this.orientation = orientation;
        this.succeeded = z;
        this.recipients = j4;
        this.invest_payment_data = investPaymentData;
        this.client_scenario = clientScenario;
        this.personalization = initiatePersonalizedPaymentRequest;
        this.ready_for_removal = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingPayment)) {
            return false;
        }
        PendingPayment pendingPayment = (PendingPayment) obj;
        return this.external_id.equals(pendingPayment.external_id) && this.created_at == pendingPayment.created_at && this.retry_at == pendingPayment.retry_at && this.retry_count == pendingPayment.retry_count && Intrinsics.areEqual(this.request, pendingPayment.request) && Intrinsics.areEqual(this.amount, pendingPayment.amount) && this.orientation == pendingPayment.orientation && this.succeeded == pendingPayment.succeeded && this.recipients == pendingPayment.recipients && Intrinsics.areEqual(this.invest_payment_data, pendingPayment.invest_payment_data) && this.client_scenario == pendingPayment.client_scenario && Intrinsics.areEqual(this.personalization, pendingPayment.personalization) && Intrinsics.areEqual(this.ready_for_removal, pendingPayment.ready_for_removal);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.orientation.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.amount, (this.request.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.external_id.hashCode() * 31, 31, this.created_at), 31, this.retry_at), 31, this.retry_count)) * 31, 31)) * 31, 31, this.succeeded), 31, this.recipients);
        InvestPaymentData investPaymentData = this.invest_payment_data;
        int hashCode = (m + (investPaymentData == null ? 0 : investPaymentData.hashCode())) * 31;
        ClientScenario clientScenario = this.client_scenario;
        int hashCode2 = (hashCode + (clientScenario == null ? 0 : clientScenario.hashCode())) * 31;
        InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest = this.personalization;
        int hashCode3 = (hashCode2 + (initiatePersonalizedPaymentRequest == null ? 0 : initiatePersonalizedPaymentRequest.hashCode())) * 31;
        Boolean bool = this.ready_for_removal;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("PendingPayment(external_id=", this.external_id, ", created_at=", this.created_at);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.retry_at, ", retry_at=", ", retry_count=", m);
        m.append(this.retry_count);
        m.append(", request=");
        m.append(this.request);
        m.append(", amount=");
        m.append(this.amount);
        m.append(", orientation=");
        m.append(this.orientation);
        m.append(", succeeded=");
        m.append(this.succeeded);
        m.append(", recipients=");
        m.append(this.recipients);
        m.append(", invest_payment_data=");
        m.append(this.invest_payment_data);
        m.append(", client_scenario=");
        m.append(this.client_scenario);
        m.append(", personalization=");
        m.append(this.personalization);
        m.append(", ready_for_removal=");
        m.append(this.ready_for_removal);
        m.append(")");
        return m.toString();
    }
}
