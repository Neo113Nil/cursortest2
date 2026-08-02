package app.cash.history.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.FragmentState;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import app.cash.local.primitives.Cart;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.primitives.ActivityItemKey;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class HistoryScreens extends MainScreens {

    public final class CancelPayment extends DialogScreens {
        public static final Parcelable.Creator<CancelPayment> CREATOR = new FragmentState.AnonymousClass1(26);
        public final String flowToken;
        public final Money paymentAmount;
        public final List paymentGetters;
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelPayment(String str, String str2, Money money, List list) {
            super(0);
            str.getClass();
            str2.getClass();
            money.getClass();
            list.getClass();
            this.flowToken = str;
            this.paymentToken = str2;
            this.paymentAmount = money;
            this.paymentGetters = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelPayment)) {
                return false;
            }
            CancelPayment cancelPayment = (CancelPayment) obj;
            return Intrinsics.areEqual(this.flowToken, cancelPayment.flowToken) && Intrinsics.areEqual(this.paymentToken, cancelPayment.paymentToken) && Intrinsics.areEqual(this.paymentAmount, cancelPayment.paymentAmount) && Intrinsics.areEqual(this.paymentGetters, cancelPayment.paymentGetters);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.paymentGetters.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.paymentAmount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowToken.hashCode() * 31, 31, this.paymentToken), 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CancelPayment(flowToken=", this.flowToken, ", paymentToken=", this.paymentToken, ", paymentAmount=");
            m.append(this.paymentAmount);
            m.append(", paymentGetters=");
            m.append(this.paymentGetters);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
            parcel.writeString(this.paymentToken);
            parcel.writeParcelable(this.paymentAmount, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.paymentGetters, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }
    }

    public final class CancelPendingSupPaymentScreen implements BottomSheetScreen {
        public static final Parcelable.Creator<CancelPendingSupPaymentScreen> CREATOR = new FragmentState.AnonymousClass1(27);
        public final String paymentToken;

        public CancelPendingSupPaymentScreen(String str) {
            str.getClass();
            this.paymentToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CancelPendingSupPaymentScreen) && Intrinsics.areEqual(this.paymentToken, ((CancelPendingSupPaymentScreen) obj).paymentToken);
        }

        public final int hashCode() {
            return this.paymentToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CancelPendingSupPaymentScreen(paymentToken=", this.paymentToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.paymentToken);
        }
    }

    public final class CheckPaymentStatus extends DialogScreens {
        public static final Parcelable.Creator<CheckPaymentStatus> CREATOR = new FragmentState.AnonymousClass1(28);
        public final String flowToken;
        public final Money paymentAmount;
        public final String paymentExternalId;
        public final List paymentGetters;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckPaymentStatus(String str, String str2, Money money, List list) {
            super(0);
            str.getClass();
            str2.getClass();
            money.getClass();
            list.getClass();
            this.flowToken = str;
            this.paymentExternalId = str2;
            this.paymentAmount = money;
            this.paymentGetters = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckPaymentStatus)) {
                return false;
            }
            CheckPaymentStatus checkPaymentStatus = (CheckPaymentStatus) obj;
            return Intrinsics.areEqual(this.flowToken, checkPaymentStatus.flowToken) && Intrinsics.areEqual(this.paymentExternalId, checkPaymentStatus.paymentExternalId) && Intrinsics.areEqual(this.paymentAmount, checkPaymentStatus.paymentAmount) && Intrinsics.areEqual(this.paymentGetters, checkPaymentStatus.paymentGetters);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.paymentGetters.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.paymentAmount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowToken.hashCode() * 31, 31, this.paymentExternalId), 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CheckPaymentStatus(flowToken=", this.flowToken, ", paymentExternalId=", this.paymentExternalId, ", paymentAmount=");
            m.append(this.paymentAmount);
            m.append(", paymentGetters=");
            m.append(this.paymentGetters);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
            parcel.writeString(this.paymentExternalId);
            parcel.writeParcelable(this.paymentAmount, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.paymentGetters, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }
    }

    public abstract class DialogScreens extends HistoryScreens implements DialogScreen {
    }

    public final class Error extends DialogScreens {
        public static final Parcelable.Creator<Error> CREATOR = new FragmentState.AnonymousClass1(29);
        public final Redacted message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Redacted redacted) {
            super(0);
            redacted.getClass();
            this.message = redacted;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.message, ((Error) obj).message);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return "Error(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.message, i);
        }
    }

    public final class InvestingPendingTransactionsScreen extends HistoryScreens {
        public static final InvestingPendingTransactionsScreen INSTANCE = new InvestingPendingTransactionsScreen(0);
        public static final Parcelable.Creator<InvestingPendingTransactionsScreen> CREATOR = new Cart.Creator(1);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class InvestingRoundUpsFailedConfirmationScreen extends DialogScreens {
        public static final InvestingRoundUpsFailedConfirmationScreen INSTANCE = new InvestingRoundUpsFailedConfirmationScreen(0);
        public static final Parcelable.Creator<InvestingRoundUpsFailedConfirmationScreen> CREATOR = new Cart.Creator(2);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class InvestingRoundUpsSkippedConfirmationScreen extends DialogScreens {
        public static final InvestingRoundUpsSkippedConfirmationScreen INSTANCE = new InvestingRoundUpsSkippedConfirmationScreen(0);
        public static final Parcelable.Creator<InvestingRoundUpsSkippedConfirmationScreen> CREATOR = new Cart.Creator(3);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class PaymentReceiptDialogScreen extends DialogScreens {
        public static final Parcelable.Creator<PaymentReceiptDialogScreen> CREATOR = new Creator();
        public final PaymentHistoryButton.Dialog dialog;

        /* loaded from: classes3.dex */
        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new PaymentReceiptDialogScreen((PaymentHistoryButton.Dialog) parcel.readParcelable(PaymentReceiptDialogScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentReceiptDialogScreen[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentReceiptDialogScreen(PaymentHistoryButton.Dialog dialog) {
            super(0);
            dialog.getClass();
            this.dialog = dialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentReceiptDialogScreen) && Intrinsics.areEqual(this.dialog, ((PaymentReceiptDialogScreen) obj).dialog);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.dialog.hashCode();
        }

        public final String toString() {
            return "PaymentReceiptDialogScreen(dialog=" + this.dialog + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.dialog, i);
        }
    }

    public final class RefundPayment extends DialogScreens {
        public static final Parcelable.Creator<RefundPayment> CREATOR = new Cart.Creator(7);
        public final String flowToken;
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefundPayment(String str, String str2) {
            super(0);
            str.getClass();
            str2.getClass();
            this.flowToken = str;
            this.paymentToken = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefundPayment)) {
                return false;
            }
            RefundPayment refundPayment = (RefundPayment) obj;
            return Intrinsics.areEqual(this.flowToken, refundPayment.flowToken) && Intrinsics.areEqual(this.paymentToken, refundPayment.paymentToken);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.paymentToken.hashCode() + (this.flowToken.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("RefundPayment(flowToken=", this.flowToken, ", paymentToken=", this.paymentToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
            parcel.writeString(this.paymentToken);
        }
    }

    public final class ReportAbuseDialogScreen implements DialogScreen {
        public static final Parcelable.Creator<ReportAbuseDialogScreen> CREATOR = new Cart.Creator(9);
        public final boolean block;
        public final Redacted customerFirstName;
        public final String customerToken;
        public final Screen destinationScreen;
        public final String flowToken;
        public final String message;
        public final String paymentToken;
        public final String title;
        public final String url;

        public ReportAbuseDialogScreen(boolean z, String str, String str2, String str3, Redacted redacted, String str4, String str5, String str6, Screen screen) {
            str.getClass();
            str2.getClass();
            redacted.getClass();
            this.block = z;
            this.flowToken = str;
            this.customerToken = str2;
            this.paymentToken = str3;
            this.customerFirstName = redacted;
            this.url = str4;
            this.title = str5;
            this.message = str6;
            this.destinationScreen = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReportAbuseDialogScreen)) {
                return false;
            }
            ReportAbuseDialogScreen reportAbuseDialogScreen = (ReportAbuseDialogScreen) obj;
            return this.block == reportAbuseDialogScreen.block && Intrinsics.areEqual(this.flowToken, reportAbuseDialogScreen.flowToken) && Intrinsics.areEqual(this.customerToken, reportAbuseDialogScreen.customerToken) && Intrinsics.areEqual(this.paymentToken, reportAbuseDialogScreen.paymentToken) && Intrinsics.areEqual(this.customerFirstName, reportAbuseDialogScreen.customerFirstName) && Intrinsics.areEqual(this.url, reportAbuseDialogScreen.url) && Intrinsics.areEqual(this.title, reportAbuseDialogScreen.title) && Intrinsics.areEqual(this.message, reportAbuseDialogScreen.message) && Intrinsics.areEqual(this.destinationScreen, reportAbuseDialogScreen.destinationScreen);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.block) * 31, 31, this.flowToken), 31, this.customerToken);
            String str = this.paymentToken;
            int m2 = re$$ExternalSyntheticOutline0.m(this.customerFirstName, (m + (str == null ? 0 : str.hashCode())) * 31, 31);
            String str2 = this.url;
            int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.message;
            int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Screen screen = this.destinationScreen;
            return hashCode3 + (screen != null ? screen.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("ReportAbuseDialogScreen(block=", ", flowToken=", this.flowToken, ", customerToken=", this.block);
            Boxes$$ExternalSyntheticOutline1.m(m, this.customerToken, ", paymentToken=", this.paymentToken, ", customerFirstName=");
            m.append(this.customerFirstName);
            m.append(", url=");
            m.append(this.url);
            m.append(", title=██, message=██, destinationScreen=");
            m.append(this.destinationScreen);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.block ? 1 : 0);
            parcel.writeString(this.flowToken);
            parcel.writeString(this.customerToken);
            parcel.writeString(this.paymentToken);
            parcel.writeParcelable(this.customerFirstName, i);
            parcel.writeString(this.url);
            parcel.writeString(this.title);
            parcel.writeString(this.message);
            parcel.writeParcelable(this.destinationScreen, i);
        }
    }

    public final class SkipPayment extends DialogScreens {
        public static final Parcelable.Creator<SkipPayment> CREATOR = new Cart.Creator(11);
        public final String flowToken;
        public final String paymentToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SkipPayment(String str, String str2) {
            super(0);
            str.getClass();
            str2.getClass();
            this.flowToken = str;
            this.paymentToken = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SkipPayment)) {
                return false;
            }
            SkipPayment skipPayment = (SkipPayment) obj;
            return Intrinsics.areEqual(this.flowToken, skipPayment.flowToken) && Intrinsics.areEqual(this.paymentToken, skipPayment.paymentToken);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.paymentToken.hashCode() + (this.flowToken.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("SkipPayment(flowToken=", this.flowToken, ", paymentToken=", this.paymentToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
            parcel.writeString(this.paymentToken);
        }
    }

    public final class PaymentPasscodeDialog extends DialogScreens {
        public static final Parcelable.Creator<PaymentPasscodeDialog> CREATOR = new Cart.Creator(4);
        public final String flowToken;
        public final InstrumentSelection instrumentSelection;
        public final InstrumentType instrumentType;
        public final String paymentToken;
        public final String suffix;
        public final String verificationInstrumentToken;

        /* loaded from: classes3.dex */
        public final class Result implements Parcelable {
            public static final Parcelable.Creator<Result> CREATOR = new Cart.Creator(5);
            public final ScenarioPlan scenarioPlan;
            public final Status status;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Status {
                public static final /* synthetic */ Status[] $VALUES;
                public static final Status CANCELED;
                public static final Status CARD_BLOCKED;
                public static final Status CONCURRENT_MODIFICATION;
                public static final Status SUCCESS;
                public static final Status TOO_MANY_ATTEMPTS;

                static {
                    Status status = new Status("SUCCESS", 0);
                    SUCCESS = status;
                    Status status2 = new Status("CONCURRENT_MODIFICATION", 1);
                    CONCURRENT_MODIFICATION = status2;
                    Status status3 = new Status("TOO_MANY_ATTEMPTS", 2);
                    TOO_MANY_ATTEMPTS = status3;
                    Status status4 = new Status("CARD_BLOCKED", 3);
                    CARD_BLOCKED = status4;
                    Status status5 = new Status("CANCELED", 4);
                    CANCELED = status5;
                    $VALUES = new Status[]{status, status2, status3, status4, status5, new Status("FAILURE", 5)};
                }

                public static Status valueOf(String str) {
                    return (Status) Enum.valueOf(Status.class, str);
                }

                public static Status[] values() {
                    return (Status[]) $VALUES.clone();
                }
            }

            public Result(Status status, ScenarioPlan scenarioPlan) {
                status.getClass();
                this.status = status;
                this.scenarioPlan = scenarioPlan;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Result)) {
                    return false;
                }
                Result result = (Result) obj;
                return this.status == result.status && Intrinsics.areEqual(this.scenarioPlan, result.scenarioPlan);
            }

            public final int hashCode() {
                int hashCode = this.status.hashCode() * 31;
                ScenarioPlan scenarioPlan = this.scenarioPlan;
                return hashCode + (scenarioPlan == null ? 0 : scenarioPlan.hashCode());
            }

            public final String toString() {
                return "Result(status=" + this.status + ", scenarioPlan=" + this.scenarioPlan + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.status.name());
                parcel.writeParcelable(this.scenarioPlan, i);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PaymentPasscodeDialog(String str, String str2, String str3, String str4, InstrumentType instrumentType, String str5) {
            this(r5, r6, r7, r8, r9, r10);
            String str6;
            String str7;
            InstrumentType instrumentType2;
            String str8;
            String str9;
            InstrumentSelection instrumentSelection;
            str.getClass();
            str2.getClass();
            CashInstrumentType cashInstrumentType = null;
            if (str3 == null) {
                str6 = str4;
                str7 = str;
                instrumentType2 = instrumentType;
                str8 = str2;
                str9 = str5;
                instrumentSelection = null;
            } else {
                InstrumentSelection instrumentSelection2 = new InstrumentSelection(str3, Moneys.zero(CurrencyCode.USD), cashInstrumentType, 12);
                str6 = str4;
                str7 = str;
                instrumentType2 = instrumentType;
                str8 = str2;
                str9 = str5;
                instrumentSelection = instrumentSelection2;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentPasscodeDialog)) {
                return false;
            }
            PaymentPasscodeDialog paymentPasscodeDialog = (PaymentPasscodeDialog) obj;
            return this.instrumentType == paymentPasscodeDialog.instrumentType && Intrinsics.areEqual(this.suffix, paymentPasscodeDialog.suffix) && Intrinsics.areEqual(this.verificationInstrumentToken, paymentPasscodeDialog.verificationInstrumentToken) && Intrinsics.areEqual(this.flowToken, paymentPasscodeDialog.flowToken) && Intrinsics.areEqual(this.paymentToken, paymentPasscodeDialog.paymentToken) && Intrinsics.areEqual(this.instrumentSelection, paymentPasscodeDialog.instrumentSelection);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            InstrumentType instrumentType = this.instrumentType;
            int hashCode = (instrumentType == null ? 0 : instrumentType.hashCode()) * 31;
            String str = this.suffix;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.verificationInstrumentToken;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.flowToken), 31, this.paymentToken);
            InstrumentSelection instrumentSelection = this.instrumentSelection;
            return m + (instrumentSelection != null ? instrumentSelection.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaymentPasscodeDialog(instrumentType=");
            sb.append(this.instrumentType);
            sb.append(", suffix=");
            sb.append(this.suffix);
            sb.append(", verificationInstrumentToken=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.verificationInstrumentToken, ", flowToken=", this.flowToken, ", paymentToken=");
            sb.append(this.paymentToken);
            sb.append(", instrumentSelection=");
            sb.append(this.instrumentSelection);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            InstrumentType instrumentType = this.instrumentType;
            if (instrumentType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(instrumentType.name());
            }
            parcel.writeString(this.suffix);
            parcel.writeString(this.verificationInstrumentToken);
            parcel.writeString(this.flowToken);
            parcel.writeString(this.paymentToken);
            parcel.writeParcelable(this.instrumentSelection, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentPasscodeDialog(InstrumentType instrumentType, String str, String str2, String str3, String str4, InstrumentSelection instrumentSelection) {
            super(0);
            str3.getClass();
            str4.getClass();
            this.instrumentType = instrumentType;
            this.suffix = str;
            this.verificationInstrumentToken = str2;
            this.flowToken = str3;
            this.paymentToken = str4;
            this.instrumentSelection = instrumentSelection;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PaymentPasscodeDialog(String str, String str2, String str3, String str4, InstrumentType instrumentType, String str5, Money money) {
            this(instrumentType, str5, str4, str, str2, new InstrumentSelection(str3, money, (CashInstrumentType) null, 12));
            str.getClass();
            money.getClass();
        }
    }

    public final class PaymentReceipt extends HistoryScreens implements RestoringScreen {
        public static final Parcelable.Creator<PaymentReceipt> CREATOR = new Cart.Creator(6);
        public final ActivityItemKey activityItemKey;
        public final String encodedExitUrl;
        public final String locale;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PaymentReceipt(String str, ActivityToken activityToken, ActivityToken activityToken2, ActivityScope activityScope, String str2, int i) {
            this(new ActivityItemKey(new ActivityItemGlobalId(new ActivityItemGlobalId.ActivityId.ActivityRowId(str), activityToken2, 4), activityToken, activityScope), (String) null, str2);
            activityToken = (i & 2) != 0 ? null : activityToken;
            activityToken2 = (i & 4) != 0 ? null : activityToken2;
            activityScope = (i & 8) != 0 ? null : activityScope;
            str2 = (i & 32) != 0 ? null : str2;
            str.getClass();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentReceipt)) {
                return false;
            }
            PaymentReceipt paymentReceipt = (PaymentReceipt) obj;
            return Intrinsics.areEqual(this.activityItemKey, paymentReceipt.activityItemKey) && Intrinsics.areEqual(this.encodedExitUrl, paymentReceipt.encodedExitUrl) && Intrinsics.areEqual(this.locale, paymentReceipt.locale);
        }

        public final ActivityItemKey getActivityItemKey() {
            return this.activityItemKey;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int hashCode = this.activityItemKey.hashCode() * 31;
            String str = this.encodedExitUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.locale;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaymentReceipt(activityItemKey=");
            sb.append(this.activityItemKey);
            sb.append(", encodedExitUrl=");
            sb.append(this.encodedExitUrl);
            sb.append(", locale=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.locale, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.activityItemKey, i);
            parcel.writeString(this.encodedExitUrl);
            parcel.writeString(this.locale);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentReceipt(ActivityItemKey activityItemKey, String str, String str2) {
            super(0);
            activityItemKey.getClass();
            this.activityItemKey = activityItemKey;
            this.encodedExitUrl = str;
            this.locale = str2;
        }

        public /* synthetic */ PaymentReceipt(ActivityItemKey activityItemKey, String str, int i) {
            this(activityItemKey, (i & 2) != 0 ? null : str, (String) null);
        }
    }

    public final class ReportAbuse extends HistoryScreens implements NeverInBackStackScreen, BottomSheetScreen {
        public static final Parcelable.Creator<ReportAbuse> CREATOR = new Cart.Creator(8);
        public final boolean block;
        public final Redacted customerName;
        public final String customerToken;
        public final Screen destinationScreen;
        public final String flowToken;
        public final boolean isArcadeEnabled;
        public final String message;
        public final String paymentToken;
        public final String title;
        public final String url;

        public ReportAbuse(boolean z, String str, String str2, String str3, RedactedString redactedString, String str4, String str5, String str6, Screen screen, int i) {
            this(z, str, str2, str3, (i & 16) != 0 ? new RedactedString(null) : redactedString, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : screen, (i & 512) == 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReportAbuse)) {
                return false;
            }
            ReportAbuse reportAbuse = (ReportAbuse) obj;
            return this.block == reportAbuse.block && Intrinsics.areEqual(this.flowToken, reportAbuse.flowToken) && Intrinsics.areEqual(this.customerToken, reportAbuse.customerToken) && Intrinsics.areEqual(this.paymentToken, reportAbuse.paymentToken) && Intrinsics.areEqual(this.customerName, reportAbuse.customerName) && Intrinsics.areEqual(this.url, reportAbuse.url) && Intrinsics.areEqual(this.title, reportAbuse.title) && Intrinsics.areEqual(this.message, reportAbuse.message) && Intrinsics.areEqual(this.destinationScreen, reportAbuse.destinationScreen) && this.isArcadeEnabled == reportAbuse.isArcadeEnabled;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.block) * 31, 31, this.flowToken), 31, this.customerToken);
            String str = this.paymentToken;
            int m2 = re$$ExternalSyntheticOutline0.m(this.customerName, (m + (str == null ? 0 : str.hashCode())) * 31, 31);
            String str2 = this.url;
            int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.message;
            int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Screen screen = this.destinationScreen;
            return Boolean.hashCode(this.isArcadeEnabled) + ((hashCode3 + (screen != null ? screen.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("ReportAbuse(block=", ", flowToken=", this.flowToken, ", customerToken=", this.block);
            Boxes$$ExternalSyntheticOutline1.m(m, this.customerToken, ", paymentToken=", this.paymentToken, ", customerName=");
            m.append(this.customerName);
            m.append(", url=");
            m.append(this.url);
            m.append(", title=██, message=██, destinationScreen=");
            m.append(this.destinationScreen);
            m.append(", isArcadeEnabled=");
            m.append(this.isArcadeEnabled);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.block ? 1 : 0);
            parcel.writeString(this.flowToken);
            parcel.writeString(this.customerToken);
            parcel.writeString(this.paymentToken);
            parcel.writeParcelable(this.customerName, i);
            parcel.writeString(this.url);
            parcel.writeString(this.title);
            parcel.writeString(this.message);
            parcel.writeParcelable(this.destinationScreen, i);
            parcel.writeInt(this.isArcadeEnabled ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReportAbuse(boolean z, String str, String str2, String str3, Redacted redacted, String str4, String str5, String str6, Screen screen, boolean z2) {
            super(0);
            str.getClass();
            str2.getClass();
            redacted.getClass();
            this.block = z;
            this.flowToken = str;
            this.customerToken = str2;
            this.paymentToken = str3;
            this.customerName = redacted;
            this.url = str4;
            this.title = str5;
            this.message = str6;
            this.destinationScreen = screen;
            this.isArcadeEnabled = z2;
        }
    }

    /* loaded from: classes3.dex */
    public final class SelectPaymentInstrument extends HistoryScreens implements SelectPaymentInstrumentArgs {
        public static final Parcelable.Creator<SelectPaymentInstrument> CREATOR = new Cart.Creator(10);
        public final Money amount;
        public final boolean cashBalanceEnabled;
        public final boolean confirmingPayment;
        public final long creditCardFeeBps;
        public final boolean creditCardLinkingEnabled;
        public final String customerPasscodeToken;
        public final String flowToken;
        public final List instrumentTokens;
        public final List instrumentTypes;
        public final boolean isRequest;
        public final NextScreen nextScreen;
        public final Role paymentRole;
        public final String paymentToken;
        public final List recipients;
        public final String selectedInstrumentToken;
        public final boolean showDisabledOptions;

        /* renamed from: type, reason: collision with root package name */
        public final SelectPaymentInstrumentType f909type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class NextScreen {
            public static final /* synthetic */ NextScreen[] $VALUES;
            public static final NextScreen CONFIRM_PAYMENT;
            public static final NextScreen PASSCODE;
            public static final NextScreen SEND_PAYMENT;

            static {
                NextScreen nextScreen = new NextScreen("PASSCODE", 0);
                PASSCODE = nextScreen;
                NextScreen nextScreen2 = new NextScreen("CONFIRM_PAYMENT", 1);
                CONFIRM_PAYMENT = nextScreen2;
                NextScreen nextScreen3 = new NextScreen("SEND_PAYMENT", 2);
                SEND_PAYMENT = nextScreen3;
                $VALUES = new NextScreen[]{nextScreen, nextScreen2, nextScreen3};
            }

            public static NextScreen valueOf(String str) {
                return (NextScreen) Enum.valueOf(NextScreen.class, str);
            }

            public static NextScreen[] values() {
                return (NextScreen[]) $VALUES.clone();
            }
        }

        public SelectPaymentInstrument(AbstractList abstractList, List list, Money money, boolean z, boolean z2, long j, String str, boolean z3, String str2, Role role, String str3, String str4, NextScreen nextScreen, int i) {
            this(SelectPaymentInstrumentType.SELECT_FROM_ALL, abstractList, list, money, z, z2, j, EmptyList.INSTANCE, (i & 256) == 0, false, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? false : z3, str2, (i & PKIFailureInfo.certRevoked) != 0 ? null : role, (i & 16384) != 0 ? null : str3, (i & 32768) != 0 ? null : str4, nextScreen);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectPaymentInstrument)) {
                return false;
            }
            SelectPaymentInstrument selectPaymentInstrument = (SelectPaymentInstrument) obj;
            return this.f909type == selectPaymentInstrument.f909type && Intrinsics.areEqual(this.instrumentTokens, selectPaymentInstrument.instrumentTokens) && Intrinsics.areEqual(this.recipients, selectPaymentInstrument.recipients) && Intrinsics.areEqual(this.amount, selectPaymentInstrument.amount) && this.creditCardLinkingEnabled == selectPaymentInstrument.creditCardLinkingEnabled && this.cashBalanceEnabled == selectPaymentInstrument.cashBalanceEnabled && this.creditCardFeeBps == selectPaymentInstrument.creditCardFeeBps && Intrinsics.areEqual(this.instrumentTypes, selectPaymentInstrument.instrumentTypes) && this.confirmingPayment == selectPaymentInstrument.confirmingPayment && this.showDisabledOptions == selectPaymentInstrument.showDisabledOptions && Intrinsics.areEqual(this.selectedInstrumentToken, selectPaymentInstrument.selectedInstrumentToken) && this.isRequest == selectPaymentInstrument.isRequest && Intrinsics.areEqual(this.flowToken, selectPaymentInstrument.flowToken) && this.paymentRole == selectPaymentInstrument.paymentRole && Intrinsics.areEqual(this.paymentToken, selectPaymentInstrument.paymentToken) && Intrinsics.areEqual(this.customerPasscodeToken, selectPaymentInstrument.customerPasscodeToken) && this.nextScreen == selectPaymentInstrument.nextScreen;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final Money getAmount() {
            return this.amount;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final boolean getCashBalanceEnabled() {
            return this.cashBalanceEnabled;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final boolean getConfirmingPayment() {
            return this.confirmingPayment;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final long getCreditCardFeeBps() {
            return this.creditCardFeeBps;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final boolean getCreditCardLinkingEnabled() {
            return this.creditCardLinkingEnabled;
        }

        public final String getCustomerPasscodeToken() {
            return this.customerPasscodeToken;
        }

        public final String getFlowToken() {
            return this.flowToken;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final List getInstrumentTokens() {
            return this.instrumentTokens;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final List getInstrumentTypes() {
            return this.instrumentTypes;
        }

        public final NextScreen getNextScreen() {
            return this.nextScreen;
        }

        public final Role getPaymentRole() {
            return this.paymentRole;
        }

        public final String getPaymentToken() {
            return this.paymentToken;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final List getRecipients() {
            return this.recipients;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final String getSelectedInstrumentToken() {
            return this.selectedInstrumentToken;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final boolean getShowDisabledOptions() {
            return this.showDisabledOptions;
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final SelectPaymentInstrumentType getType() {
            return this.f909type;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.amount, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.f909type.hashCode() * 31, 31, this.instrumentTokens), 31, this.recipients), 31), 31, this.creditCardLinkingEnabled), 31, this.cashBalanceEnabled), 31, this.creditCardFeeBps), 31, this.instrumentTypes), 31, this.confirmingPayment), 31, this.showDisabledOptions);
            String str = this.selectedInstrumentToken;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.isRequest), 31, this.flowToken);
            Role role = this.paymentRole;
            int hashCode = (m2 + (role == null ? 0 : role.hashCode())) * 31;
            String str2 = this.paymentToken;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.customerPasscodeToken;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            NextScreen nextScreen = this.nextScreen;
            return hashCode3 + (nextScreen != null ? nextScreen.hashCode() : 0);
        }

        @Override // com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs
        public final boolean isRequest() {
            return this.isRequest;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectPaymentInstrument(type=");
            sb.append(this.f909type);
            sb.append(", instrumentTokens=");
            sb.append(this.instrumentTokens);
            sb.append(", recipients=");
            sb.append(this.recipients);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", creditCardLinkingEnabled=");
            re$$ExternalSyntheticOutline0.m(sb, this.creditCardLinkingEnabled, ", cashBalanceEnabled=", this.cashBalanceEnabled, ", creditCardFeeBps=");
            sb.append(this.creditCardFeeBps);
            sb.append(", instrumentTypes=");
            sb.append(this.instrumentTypes);
            sb.append(", confirmingPayment=");
            sb.append(this.confirmingPayment);
            sb.append(", showDisabledOptions=");
            sb.append(this.showDisabledOptions);
            sb.append(", selectedInstrumentToken=");
            sb.append(this.selectedInstrumentToken);
            sb.append(", isRequest=");
            sb.append(this.isRequest);
            sb.append(", flowToken=");
            sb.append(this.flowToken);
            sb.append(", paymentRole=");
            sb.append(this.paymentRole);
            Boxes$$ExternalSyntheticOutline1.m(sb, ", paymentToken=", this.paymentToken, ", customerPasscodeToken=", this.customerPasscodeToken);
            sb.append(", nextScreen=");
            sb.append(this.nextScreen);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f909type.name());
            parcel.writeStringList(this.instrumentTokens);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.recipients, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.amount, i);
            parcel.writeInt(this.creditCardLinkingEnabled ? 1 : 0);
            parcel.writeInt(this.cashBalanceEnabled ? 1 : 0);
            parcel.writeLong(this.creditCardFeeBps);
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.instrumentTypes, parcel);
            while (m2.hasNext()) {
                parcel.writeString(((CashInstrumentType) m2.next()).name());
            }
            parcel.writeInt(this.confirmingPayment ? 1 : 0);
            parcel.writeInt(this.showDisabledOptions ? 1 : 0);
            parcel.writeString(this.selectedInstrumentToken);
            parcel.writeInt(this.isRequest ? 1 : 0);
            parcel.writeString(this.flowToken);
            Role role = this.paymentRole;
            if (role == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(role.name());
            }
            parcel.writeString(this.paymentToken);
            parcel.writeString(this.customerPasscodeToken);
            NextScreen nextScreen = this.nextScreen;
            if (nextScreen == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(nextScreen.name());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectPaymentInstrument(SelectPaymentInstrumentType selectPaymentInstrumentType, AbstractList abstractList, List list, Money money, boolean z, boolean z2, long j, List list2, boolean z3, boolean z4, String str, boolean z5, String str2, Role role, String str3, String str4, NextScreen nextScreen) {
            super(0);
            selectPaymentInstrumentType.getClass();
            abstractList.getClass();
            list.getClass();
            money.getClass();
            list2.getClass();
            str2.getClass();
            this.f909type = selectPaymentInstrumentType;
            this.instrumentTokens = abstractList;
            this.recipients = list;
            this.amount = money;
            this.creditCardLinkingEnabled = z;
            this.cashBalanceEnabled = z2;
            this.creditCardFeeBps = j;
            this.instrumentTypes = list2;
            this.confirmingPayment = z3;
            this.showDisabledOptions = z4;
            this.selectedInstrumentToken = str;
            this.isRequest = z5;
            this.flowToken = str2;
            this.paymentRole = role;
            this.paymentToken = str3;
            this.customerPasscodeToken = str4;
            this.nextScreen = nextScreen;
        }
    }
}
