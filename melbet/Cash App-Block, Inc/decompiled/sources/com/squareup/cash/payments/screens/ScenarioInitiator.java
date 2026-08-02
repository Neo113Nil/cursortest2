package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.asset.PersonalizationOrigin;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.SkippableStep;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ScenarioInitiator implements Parcelable {
    public static final Parcelable.Creator<ScenarioInitiator> CREATOR = new Creator(0);
    public final String details;

    /* renamed from: type, reason: collision with root package name */
    public final ScenarioInitiatorType f1185type;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Money money;
            boolean z3;
            boolean z4;
            boolean z5;
            AppCreationActivity appCreationActivity;
            boolean z6;
            boolean z7;
            ClientScenario clientScenario;
            boolean z8;
            Origin origin;
            CashInstrumentType valueOf;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new ScenarioInitiator(parcel.readInt() == 0 ? null : ScenarioInitiatorType.valueOf(parcel.readString()), parcel.readString());
                case 1:
                    parcel.getClass();
                    return new PaymentScreens.NearbyPaymentKeypad((Screen) parcel.readParcelable(PaymentScreens.NearbyPaymentKeypad.class.getClassLoader()), (Redacted) parcel.readParcelable(PaymentScreens.NearbyPaymentKeypad.class.getClassLoader()), parcel.readString(), parcel.readString());
                case 2:
                    parcel.getClass();
                    return new PaymentScreens.NearbyPaymentsInfo(parcel.readString());
                case 3:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentScreens.NearbyPeopleOverflowSheet.INSTANCE;
                case 4:
                    parcel.getClass();
                    return new PaymentScreens.NearbyPermissionsPromptSheet(parcel.readString());
                case 5:
                    parcel.getClass();
                    return new PaymentScreens.NoteRequired((Redacted) parcel.readParcelable(PaymentScreens.NoteRequired.class.getClassLoader()), parcel.readInt() == 0 ? null : Orientation.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 6:
                    parcel.getClass();
                    return new PaymentScreens.PaymentClaim(parcel.readString());
                case 7:
                    parcel.getClass();
                    return new PaymentScreens.PaymentConfiguration((UUID) parcel.readSerializable(), (Money) parcel.readParcelable(PaymentScreens.PaymentConfiguration.class.getClassLoader()), parcel.readInt() == 0 ? null : InstrumentSelectionData.CREATOR.createFromParcel(parcel), Orientation.valueOf(parcel.readString()), (Screen) parcel.readParcelable(PaymentScreens.PaymentConfiguration.class.getClassLoader()), AppCreationActivity.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), (PaymentConfigurationFlow) parcel.readParcelable(PaymentScreens.PaymentConfiguration.class.getClassLoader()), (BlockersData.MoneybotContext) parcel.readParcelable(PaymentScreens.PaymentConfiguration.class.getClassLoader()));
                case 8:
                    parcel.getClass();
                    return new PaymentScreens.PaymentLoading((BlockersData) parcel.readParcelable(PaymentScreens.PaymentLoading.class.getClassLoader()), (Redacted) parcel.readParcelable(PaymentScreens.PaymentLoading.class.getClassLoader()));
                case 9:
                    parcel.getClass();
                    UUID uuid = (UUID) parcel.readSerializable();
                    Money money2 = (Money) parcel.readParcelable(PaymentScreens.PersonalizePayment.class.getClassLoader());
                    Redacted redacted = (Redacted) parcel.readParcelable(PaymentScreens.PersonalizePayment.class.getClassLoader());
                    Redacted redacted2 = (Redacted) parcel.readParcelable(PaymentScreens.PersonalizePayment.class.getClassLoader());
                    InstrumentSelectionData createFromParcel = parcel.readInt() != 0 ? InstrumentSelectionData.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z2 = true;
                        money = money2;
                        z3 = true;
                    } else {
                        z = false;
                        z2 = true;
                        money = money2;
                        z3 = false;
                    }
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    AppCreationActivity valueOf2 = AppCreationActivity.valueOf(parcel.readString());
                    boolean z9 = z2;
                    String readString3 = parcel.readString();
                    Screen screen = (Screen) parcel.readParcelable(PaymentScreens.PersonalizePayment.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z4 = z;
                        appCreationActivity = valueOf2;
                        z6 = z9;
                        z5 = z6;
                    } else {
                        z4 = z;
                        z5 = z9;
                        appCreationActivity = valueOf2;
                        z6 = z4;
                    }
                    long readLong = parcel.readLong();
                    if (parcel.readInt() != 0) {
                        z7 = z4;
                        z4 = z5;
                    } else {
                        z7 = z4;
                    }
                    ClientScenario valueOf3 = ClientScenario.valueOf(parcel.readString());
                    String readString4 = parcel.readString();
                    BlockersData.MoneybotContext moneybotContext = (BlockersData.MoneybotContext) parcel.readParcelable(PaymentScreens.PersonalizePayment.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z8 = z5;
                        clientScenario = valueOf3;
                    } else {
                        clientScenario = valueOf3;
                        z8 = z7;
                    }
                    return new PaymentScreens.PersonalizePayment(uuid, money, redacted, redacted2, createFromParcel, z3, readString, readString2, appCreationActivity, readString3, screen, z6, readLong, z4, clientScenario, readString4, moneybotContext, z8, PersonalizationOrigin.valueOf(parcel.readString()), (AskedQuestion) parcel.readParcelable(PaymentScreens.PersonalizePayment.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion.INSTANCE;
                case 11:
                    parcel.getClass();
                    return new PaymentScreens.PersonalizePaymentRecipient((Entity) parcel.readParcelable(PaymentScreens.PersonalizePaymentRecipient.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                case 12:
                    parcel.getClass();
                    return new PaymentScreens.PersonalizePaymentStickers(parcel.readString());
                case 13:
                    Screen screen2 = (Screen) NavAction$$ExternalSyntheticOutline0.m(parcel, PaymentScreens.QuickPay.class);
                    Screen screen3 = (Screen) parcel.readParcelable(PaymentScreens.QuickPay.class.getClassLoader());
                    Orientation valueOf4 = Orientation.valueOf(parcel.readString());
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(PaymentScreens.QuickPay.class, parcel, arrayList, i2, 1);
                    }
                    return new PaymentScreens.QuickPay(screen2, screen3, valueOf4, arrayList, (Money) parcel.readParcelable(PaymentScreens.QuickPay.class.getClassLoader()), AppCreationActivity.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (Redacted) parcel.readParcelable(PaymentScreens.QuickPay.class.getClassLoader()), PaymentScreens.QuickPay.QuickPayAnalytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, (BlockersData.MoneybotContext) parcel.readParcelable(PaymentScreens.QuickPay.class.getClassLoader()));
                case 14:
                    parcel.getClass();
                    return new PaymentScreens.QuickPay.QuickPayAnalytics((UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : ContactStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Origin.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : SuggestionStrategy.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                case 15:
                    parcel.getClass();
                    Orientation valueOf5 = Orientation.valueOf(parcel.readString());
                    PaymentScreens.QuickPay.QuickPayAnalytics createFromParcel2 = PaymentScreens.QuickPay.QuickPayAnalytics.CREATOR.createFromParcel(parcel);
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(PaymentScreens.QuickPayDetails.class, parcel, arrayList2, i, 1);
                    }
                    return new PaymentScreens.QuickPayDetails(valueOf5, createFromParcel2, arrayList2, (ColorModel) parcel.readParcelable(PaymentScreens.QuickPayDetails.class.getClassLoader()), (Money) parcel.readParcelable(PaymentScreens.QuickPayDetails.class.getClassLoader()), (Money) parcel.readParcelable(PaymentScreens.QuickPayDetails.class.getClassLoader()));
                case 16:
                    parcel.getClass();
                    return new PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged(Orientation.valueOf(parcel.readString()));
                case 17:
                    parcel.getClass();
                    return new PaymentScreens.QuickPayExitRouterScreen(parcel.readString());
                case 18:
                    parcel.getClass();
                    return new PaymentScreens.RecipientSelectionWarningScreen((Screen) parcel.readParcelable(PaymentScreens.RecipientSelectionWarningScreen.class.getClassLoader()), (Redacted) parcel.readParcelable(PaymentScreens.RecipientSelectionWarningScreen.class.getClassLoader()), parcel.readString(), parcel.readString());
                case 19:
                    parcel.getClass();
                    AskedQuestion askedQuestion = (AskedQuestion) parcel.readParcelable(PaymentScreens.SchedulePayment.class.getClassLoader());
                    String readString5 = parcel.readString();
                    PaymentScheduleSelection createFromParcel3 = parcel.readInt() == 0 ? null : PaymentScheduleSelection.CREATOR.createFromParcel(parcel);
                    String readString6 = parcel.readString();
                    Origin valueOf6 = parcel.readInt() == 0 ? null : Origin.valueOf(parcel.readString());
                    if (parcel.readInt() == 0) {
                        Origin origin2 = valueOf6;
                        valueOf = null;
                        origin = origin2;
                    } else {
                        origin = valueOf6;
                        valueOf = CashInstrumentType.valueOf(parcel.readString());
                    }
                    return new PaymentScreens.SchedulePayment(askedQuestion, readString5, createFromParcel3, readString6, origin, valueOf);
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentScreens.SchedulePayment.SchedulePaymentAnswer.Cleared.INSTANCE;
                case 21:
                    parcel.getClass();
                    return new PaymentScreens.SchedulePayment.SchedulePaymentAnswer.Selected(PaymentScheduleSelection.CREATOR.createFromParcel(parcel));
                case 22:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentScreens.SchedulePayment.SchedulePaymentQuestion.INSTANCE;
                case 23:
                    parcel.getClass();
                    SelectPaymentInstrumentType valueOf7 = SelectPaymentInstrumentType.valueOf(parcel.readString());
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(PaymentScreens.SelectPaymentInstrument.class, parcel, arrayList3, i3, 1);
                    }
                    Money money3 = (Money) parcel.readParcelable(PaymentScreens.SelectPaymentInstrument.class.getClassLoader());
                    boolean z10 = parcel.readInt() != 0;
                    boolean z11 = parcel.readInt() != 0;
                    long readLong2 = parcel.readLong();
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt4);
                    for (int i4 = 0; i4 != readInt4; i4++) {
                        arrayList4.add(CashInstrumentType.valueOf(parcel.readString()));
                    }
                    return new PaymentScreens.SelectPaymentInstrument(valueOf7, createStringArrayList, arrayList3, money3, z10, z11, readLong2, arrayList4, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
                case 24:
                    parcel.getClass();
                    return new PaymentScreens.WarningDialog((Redacted) parcel.readParcelable(PaymentScreens.WarningDialog.class.getClassLoader()), (Redacted) parcel.readParcelable(PaymentScreens.WarningDialog.class.getClassLoader()), (Redacted) parcel.readParcelable(PaymentScreens.WarningDialog.class.getClassLoader()), (Color) parcel.readParcelable(PaymentScreens.WarningDialog.class.getClassLoader()));
                case 25:
                    parcel.getClass();
                    return new PersonalizePaymentResult((Redacted) parcel.readParcelable(PersonalizePaymentResult.class.getClassLoader()));
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return SkippableStep.InputAmount.INSTANCE;
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return SkippableStep.InputNote.INSTANCE;
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return SkippableStep.SelectStablecoinWithdrawalOption.INSTANCE;
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return SkippableStep.SkipRequirement.AmountAlreadySet.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new ScenarioInitiator[i];
                case 1:
                    return new PaymentScreens.NearbyPaymentKeypad[i];
                case 2:
                    return new PaymentScreens.NearbyPaymentsInfo[i];
                case 3:
                    return new PaymentScreens.NearbyPeopleOverflowSheet[i];
                case 4:
                    return new PaymentScreens.NearbyPermissionsPromptSheet[i];
                case 5:
                    return new PaymentScreens.NoteRequired[i];
                case 6:
                    return new PaymentScreens.PaymentClaim[i];
                case 7:
                    return new PaymentScreens.PaymentConfiguration[i];
                case 8:
                    return new PaymentScreens.PaymentLoading[i];
                case 9:
                    return new PaymentScreens.PersonalizePayment[i];
                case 10:
                    return new PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion[i];
                case 11:
                    return new PaymentScreens.PersonalizePaymentRecipient[i];
                case 12:
                    return new PaymentScreens.PersonalizePaymentStickers[i];
                case 13:
                    return new PaymentScreens.QuickPay[i];
                case 14:
                    return new PaymentScreens.QuickPay.QuickPayAnalytics[i];
                case 15:
                    return new PaymentScreens.QuickPayDetails[i];
                case 16:
                    return new PaymentScreens$QuickPayDetails$Result$PaymentOrientationChanged[i];
                case 17:
                    return new PaymentScreens.QuickPayExitRouterScreen[i];
                case 18:
                    return new PaymentScreens.RecipientSelectionWarningScreen[i];
                case 19:
                    return new PaymentScreens.SchedulePayment[i];
                case 20:
                    return new PaymentScreens.SchedulePayment.SchedulePaymentAnswer.Cleared[i];
                case 21:
                    return new PaymentScreens.SchedulePayment.SchedulePaymentAnswer.Selected[i];
                case 22:
                    return new PaymentScreens.SchedulePayment.SchedulePaymentQuestion[i];
                case 23:
                    return new PaymentScreens.SelectPaymentInstrument[i];
                case 24:
                    return new PaymentScreens.WarningDialog[i];
                case 25:
                    return new PersonalizePaymentResult[i];
                case 26:
                    return new SkippableStep.InputAmount[i];
                case 27:
                    return new SkippableStep.InputNote[i];
                case 28:
                    return new SkippableStep.SelectStablecoinWithdrawalOption[i];
                default:
                    return new SkippableStep.SkipRequirement.AmountAlreadySet[i];
            }
        }
    }

    public ScenarioInitiator(ScenarioInitiatorType scenarioInitiatorType, String str) {
        this.f1185type = scenarioInitiatorType;
        this.details = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScenarioInitiator)) {
            return false;
        }
        ScenarioInitiator scenarioInitiator = (ScenarioInitiator) obj;
        return this.f1185type == scenarioInitiator.f1185type && Intrinsics.areEqual(this.details, scenarioInitiator.details);
    }

    public final int hashCode() {
        ScenarioInitiatorType scenarioInitiatorType = this.f1185type;
        int hashCode = (scenarioInitiatorType == null ? 0 : scenarioInitiatorType.hashCode()) * 31;
        String str = this.details;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ScenarioInitiator(type=" + this.f1185type + ", details=" + this.details + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        ScenarioInitiatorType scenarioInitiatorType = this.f1185type;
        if (scenarioInitiatorType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(scenarioInitiatorType.name());
        }
        parcel.writeString(this.details);
    }
}
