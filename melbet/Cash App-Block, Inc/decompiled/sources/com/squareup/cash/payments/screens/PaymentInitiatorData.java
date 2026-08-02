package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.payment.asset.PaymentData;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.cash.payments.screens.NearbyPayer;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.SignalsContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaymentInitiatorData implements Parcelable {
    public static final Parcelable.Creator<PaymentInitiatorData> CREATOR = new NearbyPayer.Creator(16);
    public final boolean allowRetry;
    public final Money amount;
    public final AppCreationActivity appCreationActivity;
    public final String creationMechanism;
    public final String exchangeRatesToken;
    public final String flowToken;
    public final List getters;
    public final boolean ignoreDuplicate;
    public final String launchUrl;
    public final BlockersData.MoneybotContext moneybotContext;
    public final String nearbySessionToken;
    public final String note;
    public final Orientation orientation;
    public final PaymentData paymentData;
    public final UUID paymentToken;
    public final String personalizationFlowToken;
    public final PersonalizationInput personalizationInput;
    public final String poolContributorComment;
    public final String poolToken;
    public final String referrer;
    public final ScenarioInitiator scenarioInitiator;
    public final PaymentScheduleSelection scheduleSelection;
    public final InstrumentSelectionData selection;
    public final SignalsContext signals;

    public /* synthetic */ PaymentInitiatorData(String str, Orientation orientation, List list, Money money, InstrumentSelectionData instrumentSelectionData, boolean z, UUID uuid, SignalsContext signalsContext, String str2, String str3, AppCreationActivity appCreationActivity, String str4, PersonalizationInput personalizationInput, String str5, String str6, String str7, BlockersData.MoneybotContext moneybotContext, String str8, String str9, ScenarioInitiator scenarioInitiator, String str10, PaymentScheduleSelection paymentScheduleSelection, int i) {
        this(str, orientation, list, money, instrumentSelectionData, z, uuid, signalsContext, str2, str3, appCreationActivity, true, (i & 4096) != 0 ? null : str4, (i & PKIFailureInfo.certRevoked) != 0 ? null : personalizationInput, (i & 16384) != 0 ? null : str5, (32768 & i) != 0 ? null : str6, (65536 & i) != 0 ? null : str7, (131072 & i) != 0 ? null : moneybotContext, (262144 & i) != 0 ? null : str8, (524288 & i) != 0 ? null : str9, (1048576 & i) != 0 ? null : scenarioInitiator, (2097152 & i) != 0 ? null : str10, (i & 4194304) != 0 ? null : paymentScheduleSelection, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInitiatorData)) {
            return false;
        }
        PaymentInitiatorData paymentInitiatorData = (PaymentInitiatorData) obj;
        return Intrinsics.areEqual(this.note, paymentInitiatorData.note) && this.orientation == paymentInitiatorData.orientation && Intrinsics.areEqual(this.getters, paymentInitiatorData.getters) && Intrinsics.areEqual(this.amount, paymentInitiatorData.amount) && Intrinsics.areEqual(this.selection, paymentInitiatorData.selection) && this.ignoreDuplicate == paymentInitiatorData.ignoreDuplicate && Intrinsics.areEqual(this.paymentToken, paymentInitiatorData.paymentToken) && Intrinsics.areEqual(this.signals, paymentInitiatorData.signals) && Intrinsics.areEqual(this.referrer, paymentInitiatorData.referrer) && Intrinsics.areEqual(this.launchUrl, paymentInitiatorData.launchUrl) && this.appCreationActivity == paymentInitiatorData.appCreationActivity && this.allowRetry == paymentInitiatorData.allowRetry && Intrinsics.areEqual(this.exchangeRatesToken, paymentInitiatorData.exchangeRatesToken) && Intrinsics.areEqual(this.personalizationInput, paymentInitiatorData.personalizationInput) && Intrinsics.areEqual(this.personalizationFlowToken, paymentInitiatorData.personalizationFlowToken) && Intrinsics.areEqual(this.poolToken, paymentInitiatorData.poolToken) && Intrinsics.areEqual(this.poolContributorComment, paymentInitiatorData.poolContributorComment) && Intrinsics.areEqual(this.moneybotContext, paymentInitiatorData.moneybotContext) && Intrinsics.areEqual(this.flowToken, paymentInitiatorData.flowToken) && Intrinsics.areEqual(this.creationMechanism, paymentInitiatorData.creationMechanism) && Intrinsics.areEqual(this.scenarioInitiator, paymentInitiatorData.scenarioInitiator) && Intrinsics.areEqual(this.nearbySessionToken, paymentInitiatorData.nearbySessionToken) && Intrinsics.areEqual(this.scheduleSelection, paymentInitiatorData.scheduleSelection) && Intrinsics.areEqual(this.paymentData, paymentInitiatorData.paymentData);
    }

    public final String getFlowToken() {
        return this.flowToken;
    }

    public final BlockersData.MoneybotContext getMoneybotContext() {
        return this.moneybotContext;
    }

    public final int hashCode() {
        int m = NavAction$$ExternalSyntheticOutline0.m(this.amount, Recorder$$ExternalSyntheticOutline2.m((this.orientation.hashCode() + (this.note.hashCode() * 31)) * 31, 31, this.getters), 31);
        InstrumentSelectionData instrumentSelectionData = this.selection;
        int hashCode = (this.paymentToken.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (instrumentSelectionData == null ? 0 : instrumentSelectionData.hashCode())) * 31, 31, this.ignoreDuplicate)) * 31;
        SignalsContext signalsContext = this.signals;
        int hashCode2 = (hashCode + (signalsContext == null ? 0 : signalsContext.hashCode())) * 31;
        String str = this.referrer;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.launchUrl;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.appCreationActivity.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.allowRetry);
        String str3 = this.exchangeRatesToken;
        int hashCode4 = (m2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PersonalizationInput personalizationInput = this.personalizationInput;
        int hashCode5 = (hashCode4 + (personalizationInput == null ? 0 : personalizationInput.hashCode())) * 31;
        String str4 = this.personalizationFlowToken;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.poolToken;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.poolContributorComment;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BlockersData.MoneybotContext moneybotContext = this.moneybotContext;
        int hashCode9 = (hashCode8 + (moneybotContext == null ? 0 : moneybotContext.hashCode())) * 31;
        String str7 = this.flowToken;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.creationMechanism;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ScenarioInitiator scenarioInitiator = this.scenarioInitiator;
        int hashCode12 = (hashCode11 + (scenarioInitiator == null ? 0 : scenarioInitiator.hashCode())) * 31;
        String str9 = this.nearbySessionToken;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        PaymentScheduleSelection paymentScheduleSelection = this.scheduleSelection;
        int hashCode14 = (hashCode13 + (paymentScheduleSelection == null ? 0 : paymentScheduleSelection.hashCode())) * 31;
        PaymentData paymentData = this.paymentData;
        return hashCode14 + (paymentData != null ? paymentData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentInitiatorData(note=");
        sb.append(this.note);
        sb.append(", orientation=");
        sb.append(this.orientation);
        sb.append(", getters=");
        sb.append(this.getters);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", selection=");
        sb.append(this.selection);
        sb.append(", ignoreDuplicate=");
        sb.append(this.ignoreDuplicate);
        sb.append(", paymentToken=");
        sb.append(this.paymentToken);
        sb.append(", signals=");
        sb.append(this.signals);
        sb.append(", referrer=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.referrer, ", launchUrl=", this.launchUrl, ", appCreationActivity=");
        sb.append(this.appCreationActivity);
        sb.append(", allowRetry=");
        sb.append(this.allowRetry);
        sb.append(", exchangeRatesToken=");
        sb.append(this.exchangeRatesToken);
        sb.append(", personalizationInput=");
        sb.append(this.personalizationInput);
        sb.append(", personalizationFlowToken=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.personalizationFlowToken, ", poolToken=", this.poolToken, ", poolContributorComment=");
        sb.append(this.poolContributorComment);
        sb.append(", moneybotContext=");
        sb.append(this.moneybotContext);
        sb.append(", flowToken=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.flowToken, ", creationMechanism=", this.creationMechanism, ", scenarioInitiator=");
        sb.append(this.scenarioInitiator);
        sb.append(", nearbySessionToken=");
        sb.append(this.nearbySessionToken);
        sb.append(", scheduleSelection=");
        sb.append(this.scheduleSelection);
        sb.append(", paymentData=");
        sb.append(this.paymentData);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.note);
        parcel.writeString(this.orientation.name());
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.getters, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeParcelable(this.amount, i);
        InstrumentSelectionData instrumentSelectionData = this.selection;
        if (instrumentSelectionData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            instrumentSelectionData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.ignoreDuplicate ? 1 : 0);
        parcel.writeSerializable(this.paymentToken);
        parcel.writeParcelable(this.signals, i);
        parcel.writeString(this.referrer);
        parcel.writeString(this.launchUrl);
        parcel.writeString(this.appCreationActivity.name());
        parcel.writeInt(this.allowRetry ? 1 : 0);
        parcel.writeString(this.exchangeRatesToken);
        parcel.writeParcelable(this.personalizationInput, i);
        parcel.writeString(this.personalizationFlowToken);
        parcel.writeString(this.poolToken);
        parcel.writeString(this.poolContributorComment);
        parcel.writeParcelable(this.moneybotContext, i);
        parcel.writeString(this.flowToken);
        parcel.writeString(this.creationMechanism);
        ScenarioInitiator scenarioInitiator = this.scenarioInitiator;
        if (scenarioInitiator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            scenarioInitiator.writeToParcel(parcel, i);
        }
        parcel.writeString(this.nearbySessionToken);
        PaymentScheduleSelection paymentScheduleSelection = this.scheduleSelection;
        if (paymentScheduleSelection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentScheduleSelection.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.paymentData, i);
    }

    public PaymentInitiatorData(String str, Orientation orientation, List list, Money money, InstrumentSelectionData instrumentSelectionData, boolean z, UUID uuid, SignalsContext signalsContext, String str2, String str3, AppCreationActivity appCreationActivity, boolean z2, String str4, PersonalizationInput personalizationInput, String str5, String str6, String str7, BlockersData.MoneybotContext moneybotContext, String str8, String str9, ScenarioInitiator scenarioInitiator, String str10, PaymentScheduleSelection paymentScheduleSelection, PaymentData paymentData) {
        str.getClass();
        orientation.getClass();
        list.getClass();
        money.getClass();
        uuid.getClass();
        appCreationActivity.getClass();
        this.note = str;
        this.orientation = orientation;
        this.getters = list;
        this.amount = money;
        this.selection = instrumentSelectionData;
        this.ignoreDuplicate = z;
        this.paymentToken = uuid;
        this.signals = signalsContext;
        this.referrer = str2;
        this.launchUrl = str3;
        this.appCreationActivity = appCreationActivity;
        this.allowRetry = z2;
        this.exchangeRatesToken = str4;
        this.personalizationInput = personalizationInput;
        this.personalizationFlowToken = str5;
        this.poolToken = str6;
        this.poolContributorComment = str7;
        this.moneybotContext = moneybotContext;
        this.flowToken = str8;
        this.creationMechanism = str9;
        this.scenarioInitiator = scenarioInitiator;
        this.nearbySessionToken = str10;
        this.scheduleSelection = paymentScheduleSelection;
        this.paymentData = paymentData;
    }
}
