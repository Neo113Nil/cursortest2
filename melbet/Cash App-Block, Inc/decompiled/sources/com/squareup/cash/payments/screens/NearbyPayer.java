package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.payment.asset.PaymentData;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.recipient.RecipientSearchViewBlocker;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import com.squareup.cash.payments.screens.PaymentAmountResult;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import com.squareup.cash.payments.screens.PaymentConfigurationStep;
import com.squareup.cash.payments.screens.PaymentFlowData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.recipients.backend.api.Bucket;
import com.squareup.cash.recipients.backend.api.GenerationStrategy;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.SignalsContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NearbyPayer implements Parcelable {
    public static final Parcelable.Creator<NearbyPayer> CREATOR = new Creator(0);
    public final String amountFormatted;
    public final NearbyAvatarInfo avatar;
    public final String cashtag;
    public final String displayName;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            boolean z;
            RecipientSearchViewBlocker.Origin origin;
            RecipientSearchViewBlocker.BlockerReason blockerReason;
            int i;
            boolean z2 = true;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new NearbyPayer(NearbyAvatarInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentAmountQuestion.INSTANCE;
                case 2:
                    parcel.getClass();
                    return new PaymentAmountResult.EditAmountResult((Money) parcel.readParcelable(PaymentAmountResult.EditAmountResult.class.getClassLoader()));
                case 3:
                    boolean z3 = true;
                    parcel.getClass();
                    PaymentFlowData.StandardFlowData createFromParcel = PaymentFlowData.StandardFlowData.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        z3 = false;
                    }
                    return new PaymentConfigurationFlow.Default(createFromParcel, z3);
                case 4:
                    parcel.getClass();
                    return new PaymentConfigurationFlow.Lite(PaymentFlowData.StandardFlowData.CREATOR.createFromParcel(parcel));
                case 5:
                    parcel.getClass();
                    return new PaymentConfigurationFlow.PayLink(PaymentFlowData.StandardFlowData.CREATOR.createFromParcel(parcel), parcel.readString());
                case 6:
                    parcel.getClass();
                    return new PaymentConfigurationFlow.PayLinkReview(PaymentFlowData.PayLinkFlowData.CREATOR.createFromParcel(parcel));
                case 7:
                    boolean z4 = true;
                    parcel.getClass();
                    PaymentFlowData.StandardFlowData createFromParcel2 = PaymentFlowData.StandardFlowData.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        z4 = false;
                    }
                    return new PaymentConfigurationFlow.PersonFirst(createFromParcel2, z4);
                case 8:
                    parcel.getClass();
                    return new PaymentConfigurationFlow.StablecoinQrScanFlow(PaymentFlowData.StablecoinQrScanFlowData.CREATOR.createFromParcel(parcel));
                case 9:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentConfigurationStep.NavigableStep.RequestShareOption.INSTANCE;
                case 10:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentConfigurationStep.NavigableStep.ReviewPayment.INSTANCE;
                case 11:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentConfigurationStep.NavigableStep.SelectRecipient.INSTANCE;
                case 12:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentConfigurationStep$TransientStep$Loading.INSTANCE;
                case 13:
                    parcel.getClass();
                    return new PaymentFlowData.PayLinkFlowData(parcel.readString());
                case 14:
                    parcel.getClass();
                    return new PaymentFlowData.StablecoinQrScanFlowData(parcel.readString());
                case 15:
                    parcel.getClass();
                    return new PaymentFlowData.StandardFlowData((Redacted) parcel.readParcelable(PaymentFlowData.StandardFlowData.class.getClassLoader()), (Redacted) parcel.readParcelable(PaymentFlowData.StandardFlowData.class.getClassLoader()));
                case 16:
                    parcel.getClass();
                    String readString = parcel.readString();
                    Orientation valueOf3 = Orientation.valueOf(parcel.readString());
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (r3 != readInt) {
                        r3 = CameraState$Type$EnumUnboxingLocalUtility.m(PaymentInitiatorData.class, parcel, arrayList, r3, 1);
                    }
                    return new PaymentInitiatorData(readString, valueOf3, arrayList, (Money) parcel.readParcelable(PaymentInitiatorData.class.getClassLoader()), parcel.readInt() == 0 ? null : InstrumentSelectionData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (UUID) parcel.readSerializable(), (SignalsContext) parcel.readParcelable(PaymentInitiatorData.class.getClassLoader()), parcel.readString(), parcel.readString(), AppCreationActivity.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), (PersonalizationInput) parcel.readParcelable(PaymentInitiatorData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (BlockersData.MoneybotContext) parcel.readParcelable(PaymentInitiatorData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ScenarioInitiator.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : PaymentScheduleSelection.CREATOR.createFromParcel(parcel), (PaymentData) parcel.readParcelable(PaymentInitiatorData.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    return new PaymentScheduleSelection((LocalDate) parcel.readSerializable(), PaymentScheduleFrequency.valueOf(parcel.readString()));
                case 18:
                    parcel.getClass();
                    return new PaymentScreens.ConfirmDuplicate((Money) parcel.readParcelable(PaymentScreens.ConfirmDuplicate.class.getClassLoader()), (Redacted) parcel.readParcelable(PaymentScreens.ConfirmDuplicate.class.getClassLoader()));
                case 19:
                    parcel.getClass();
                    Bucket valueOf4 = parcel.readInt() == 0 ? null : Bucket.valueOf(parcel.readString());
                    GenerationStrategy valueOf5 = parcel.readInt() == 0 ? null : GenerationStrategy.valueOf(parcel.readString());
                    Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    Bucket bucket = valueOf4;
                    GenerationStrategy generationStrategy = valueOf5;
                    Integer num = valueOf6;
                    Boolean bool = valueOf;
                    String readString2 = parcel.readString();
                    Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    SuggestionStrategy valueOf12 = parcel.readInt() == 0 ? null : SuggestionStrategy.valueOf(parcel.readString());
                    Integer num2 = valueOf9;
                    Integer num3 = valueOf11;
                    String readString3 = parcel.readString();
                    Integer num4 = valueOf7;
                    Boolean bool2 = valueOf2;
                    Integer num5 = valueOf8;
                    Integer num6 = valueOf10;
                    SuggestionStrategy suggestionStrategy = valueOf12;
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    RecipientSearchViewBlocker.Origin valueOf13 = parcel.readInt() == 0 ? null : RecipientSearchViewBlocker.Origin.valueOf(parcel.readString());
                    RecipientSearchViewBlocker.BlockerReason valueOf14 = parcel.readInt() == 0 ? null : RecipientSearchViewBlocker.BlockerReason.valueOf(parcel.readString());
                    if (parcel.readInt() != 0) {
                        origin = valueOf13;
                        blockerReason = valueOf14;
                        z = true;
                    } else {
                        RecipientSearchViewBlocker.BlockerReason blockerReason2 = valueOf14;
                        z = false;
                        origin = valueOf13;
                        blockerReason = blockerReason2;
                    }
                    return new PaymentScreens.ConfirmRecipient.Analytics(bucket, generationStrategy, num, num4, bool, bool2, readString2, num5, num2, num6, num3, suggestionStrategy, readString3, readString4, readString5, readString6, readString7, readString8, origin, blockerReason, z);
                case 20:
                    parcel.getClass();
                    Recipient recipient = (Recipient) parcel.readParcelable(PaymentScreens.ConfirmRecipient.class.getClassLoader());
                    PaymentScreens.ConfirmRecipient.Analytics createFromParcel3 = parcel.readInt() != 0 ? PaymentScreens.ConfirmRecipient.Analytics.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        i = 1;
                    } else {
                        i = 1;
                        z2 = false;
                    }
                    return new PaymentScreens.ConfirmRecipient(recipient, createFromParcel3, z2, parcel.readInt() != 0 ? i : 0, PaymentScreens.ConfirmRecipient.RecipientConfirmationType.valueOf(parcel.readString()), parcel.readString());
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentScreens.ContactSyncPermissionScreen.INSTANCE;
                case 22:
                    parcel.getClass();
                    return new PaymentScreens.DuplicatePayment((Redacted) parcel.readParcelable(PaymentScreens.DuplicatePayment.class.getClassLoader()), Orientation.valueOf(parcel.readString()), (Money) parcel.readParcelable(PaymentScreens.DuplicatePayment.class.getClassLoader()), (AskedQuestion) parcel.readParcelable(PaymentScreens.DuplicatePayment.class.getClassLoader()));
                case 23:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion.INSTANCE;
                case 24:
                    parcel.getClass();
                    return new PaymentScreens.DuplicatePayment.DuplicatePaymentResult((Recipient) parcel.readParcelable(PaymentScreens.DuplicatePayment.DuplicatePaymentResult.class.getClassLoader()));
                case 25:
                    parcel.getClass();
                    return new PaymentScreens$HomeScreens$AppMessageErrorScreen(parcel.readInt());
                case 26:
                    Money money = (Money) NavAction$$ExternalSyntheticOutline0.m(parcel, PaymentScreens.MainPayment.class);
                    Orientation valueOf15 = Orientation.valueOf(parcel.readString());
                    AppCreationActivity valueOf16 = AppCreationActivity.valueOf(parcel.readString());
                    String readString9 = parcel.readString();
                    CashInstrumentType valueOf17 = parcel.readInt() == 0 ? null : CashInstrumentType.valueOf(parcel.readString());
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(PaymentScreens.MainPayment.class, parcel, arrayList2, i2, 1);
                    }
                    return new PaymentScreens.MainPayment(money, valueOf15, valueOf16, readString9, valueOf17, readString10, readString11, arrayList2, (InstrumentSelection) parcel.readParcelable(PaymentScreens.MainPayment.class.getClassLoader()), (UUID) parcel.readSerializable(), parcel.readString(), (Money) parcel.readParcelable(PaymentScreens.MainPayment.class.getClassLoader()), parcel.readInt() == 0 ? null : PaymentScreens.MainPayment.SendCryptoCurrencyType.valueOf(parcel.readString()), parcel.readInt() != 0 ? CryptoPaymentOrigin.valueOf(parcel.readString()) : null, parcel.readString(), (Screen) parcel.readParcelable(PaymentScreens.MainPayment.class.getClassLoader()), parcel.readInt() != 0);
                case 27:
                    parcel.getClass();
                    return new PaymentScreens.NearbyPayRequest(parcel.readString());
                case 28:
                    parcel.getClass();
                    return new PaymentScreens.NearbyPayRequestHelp(parcel.readString());
                default:
                    parcel.getClass();
                    return new PaymentScreens.NearbyPayersSheet((Redacted) parcel.readParcelable(PaymentScreens.NearbyPayersSheet.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new NearbyPayer[i];
                case 1:
                    return new PaymentAmountQuestion[i];
                case 2:
                    return new PaymentAmountResult.EditAmountResult[i];
                case 3:
                    return new PaymentConfigurationFlow.Default[i];
                case 4:
                    return new PaymentConfigurationFlow.Lite[i];
                case 5:
                    return new PaymentConfigurationFlow.PayLink[i];
                case 6:
                    return new PaymentConfigurationFlow.PayLinkReview[i];
                case 7:
                    return new PaymentConfigurationFlow.PersonFirst[i];
                case 8:
                    return new PaymentConfigurationFlow.StablecoinQrScanFlow[i];
                case 9:
                    return new PaymentConfigurationStep.NavigableStep.RequestShareOption[i];
                case 10:
                    return new PaymentConfigurationStep.NavigableStep.ReviewPayment[i];
                case 11:
                    return new PaymentConfigurationStep.NavigableStep.SelectRecipient[i];
                case 12:
                    return new PaymentConfigurationStep$TransientStep$Loading[i];
                case 13:
                    return new PaymentFlowData.PayLinkFlowData[i];
                case 14:
                    return new PaymentFlowData.StablecoinQrScanFlowData[i];
                case 15:
                    return new PaymentFlowData.StandardFlowData[i];
                case 16:
                    return new PaymentInitiatorData[i];
                case 17:
                    return new PaymentScheduleSelection[i];
                case 18:
                    return new PaymentScreens.ConfirmDuplicate[i];
                case 19:
                    return new PaymentScreens.ConfirmRecipient.Analytics[i];
                case 20:
                    return new PaymentScreens.ConfirmRecipient[i];
                case 21:
                    return new PaymentScreens.ContactSyncPermissionScreen[i];
                case 22:
                    return new PaymentScreens.DuplicatePayment[i];
                case 23:
                    return new PaymentScreens.DuplicatePayment.DuplicatePaymentQuestion[i];
                case 24:
                    return new PaymentScreens.DuplicatePayment.DuplicatePaymentResult[i];
                case 25:
                    return new PaymentScreens$HomeScreens$AppMessageErrorScreen[i];
                case 26:
                    return new PaymentScreens.MainPayment[i];
                case 27:
                    return new PaymentScreens.NearbyPayRequest[i];
                case 28:
                    return new PaymentScreens.NearbyPayRequestHelp[i];
                default:
                    return new PaymentScreens.NearbyPayersSheet[i];
            }
        }
    }

    public NearbyPayer(NearbyAvatarInfo nearbyAvatarInfo, String str, String str2, String str3) {
        nearbyAvatarInfo.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.avatar = nearbyAvatarInfo;
        this.displayName = str;
        this.cashtag = str2;
        this.amountFormatted = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPayer)) {
            return false;
        }
        NearbyPayer nearbyPayer = (NearbyPayer) obj;
        return Intrinsics.areEqual(this.avatar, nearbyPayer.avatar) && Intrinsics.areEqual(this.displayName, nearbyPayer.displayName) && Intrinsics.areEqual(this.cashtag, nearbyPayer.cashtag) && Intrinsics.areEqual(this.amountFormatted, nearbyPayer.amountFormatted);
    }

    public final int hashCode() {
        return this.amountFormatted.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.hashCode() * 31, 31, this.displayName), 31, this.cashtag);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyPayer(avatar=");
        sb.append(this.avatar);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", cashtag=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.cashtag, ", amountFormatted=", this.amountFormatted, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.avatar.writeToParcel(parcel, i);
        parcel.writeString(this.displayName);
        parcel.writeString(this.cashtag);
        parcel.writeString(this.amountFormatted);
    }
}
