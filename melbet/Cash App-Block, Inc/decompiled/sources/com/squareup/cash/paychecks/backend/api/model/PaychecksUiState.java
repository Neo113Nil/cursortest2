package com.squareup.cash.paychecks.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaychecksUiState {
    public final String activitySubtitle;
    public final Applet applet;
    public final PaychecksBenefitsStatusSection benefitsStatusSection;
    public final boolean customerDdaIsLocked;
    public final boolean customerIsDenylisted;
    public final CalendarMonthPaychecksAggregation displayedMonthlyPaychecksAggregation;
    public final Boolean shouldDisplayBenefitsBooklet;
    public final ArrayList upcomingPaychecks;

    public final class Applet {
        public final RolloverAwareContent accessibilityText;
        public final String bankingBenefitsSetupCtaText;
        public final PaychecksBenefitsStatusSection benefitsStatusSection;
        public final String clientRoute;
        public final RolloverAwareContent employer;
        public final RolloverAwareContent label;
        public final RolloverAwareContent legacyLabel;
        public final PaychecksAppletState state;
        public final String title;

        public final class RolloverAwareContent {
            public final Object postRolloverContent;
            public final Object preRolloverContent;
            public final Long rolloverDate;

            public RolloverAwareContent(Object obj, Object obj2, Long l) {
                this.preRolloverContent = obj;
                this.postRolloverContent = obj2;
                this.rolloverDate = l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RolloverAwareContent)) {
                    return false;
                }
                RolloverAwareContent rolloverAwareContent = (RolloverAwareContent) obj;
                return Intrinsics.areEqual(this.preRolloverContent, rolloverAwareContent.preRolloverContent) && Intrinsics.areEqual(this.postRolloverContent, rolloverAwareContent.postRolloverContent) && Intrinsics.areEqual(this.rolloverDate, rolloverAwareContent.rolloverDate);
            }

            public final int hashCode() {
                Object obj = this.preRolloverContent;
                int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
                Object obj2 = this.postRolloverContent;
                int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
                Long l = this.rolloverDate;
                return hashCode2 + (l != null ? l.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RolloverAwareContent(preRolloverContent=");
                sb.append(this.preRolloverContent);
                sb.append(", postRolloverContent=");
                sb.append(this.postRolloverContent);
                sb.append(", rolloverDate=");
                return Thread$State$EnumUnboxingLocalUtility.m(sb, this.rolloverDate, ")");
            }
        }

        public Applet(String str, PaychecksAppletState paychecksAppletState, RolloverAwareContent rolloverAwareContent, RolloverAwareContent rolloverAwareContent2, RolloverAwareContent rolloverAwareContent3, RolloverAwareContent rolloverAwareContent4, String str2, PaychecksBenefitsStatusSection paychecksBenefitsStatusSection, String str3) {
            this.clientRoute = str;
            this.state = paychecksAppletState;
            this.legacyLabel = rolloverAwareContent;
            this.label = rolloverAwareContent2;
            this.accessibilityText = rolloverAwareContent3;
            this.employer = rolloverAwareContent4;
            this.title = str2;
            this.benefitsStatusSection = paychecksBenefitsStatusSection;
            this.bankingBenefitsSetupCtaText = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Applet)) {
                return false;
            }
            Applet applet = (Applet) obj;
            return Intrinsics.areEqual(this.clientRoute, applet.clientRoute) && this.state == applet.state && this.legacyLabel.equals(applet.legacyLabel) && this.label.equals(applet.label) && this.accessibilityText.equals(applet.accessibilityText) && this.employer.equals(applet.employer) && Intrinsics.areEqual(this.title, applet.title) && Intrinsics.areEqual(this.benefitsStatusSection, applet.benefitsStatusSection) && Intrinsics.areEqual(this.bankingBenefitsSetupCtaText, applet.bankingBenefitsSetupCtaText);
        }

        public final int hashCode() {
            String str = this.clientRoute;
            int hashCode = (this.employer.hashCode() + ((this.accessibilityText.hashCode() + ((this.label.hashCode() + ((this.legacyLabel.hashCode() + ((this.state.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            String str2 = this.title;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            PaychecksBenefitsStatusSection paychecksBenefitsStatusSection = this.benefitsStatusSection;
            int hashCode3 = (hashCode2 + (paychecksBenefitsStatusSection == null ? 0 : paychecksBenefitsStatusSection.hashCode())) * 31;
            String str3 = this.bankingBenefitsSetupCtaText;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Applet(clientRoute=");
            sb.append(this.clientRoute);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", legacyLabel=");
            sb.append(this.legacyLabel);
            sb.append(", label=");
            sb.append(this.label);
            sb.append(", accessibilityText=");
            sb.append(this.accessibilityText);
            sb.append(", employer=");
            sb.append(this.employer);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", benefitsStatusSection=");
            sb.append(this.benefitsStatusSection);
            sb.append(", bankingBenefitsSetupCtaText=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.bankingBenefitsSetupCtaText, ")");
        }
    }

    public final class CalendarMonthPaychecksAggregation implements Parcelable {
        public static final Parcelable.Creator<CalendarMonthPaychecksAggregation> CREATOR = new PaymentRecipient.Creator(2);
        public final TimeBoundedPaychecksAggregation aggregation;
        public final long monthInYear;
        public final long year;

        public CalendarMonthPaychecksAggregation(long j, long j2, TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation) {
            timeBoundedPaychecksAggregation.getClass();
            this.monthInYear = j;
            this.year = j2;
            this.aggregation = timeBoundedPaychecksAggregation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CalendarMonthPaychecksAggregation)) {
                return false;
            }
            CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = (CalendarMonthPaychecksAggregation) obj;
            return this.monthInYear == calendarMonthPaychecksAggregation.monthInYear && this.year == calendarMonthPaychecksAggregation.year && Intrinsics.areEqual(this.aggregation, calendarMonthPaychecksAggregation.aggregation);
        }

        public final int hashCode() {
            return this.aggregation.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.monthInYear) * 31, 31, this.year);
        }

        public final String toString() {
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.monthInYear, "CalendarMonthPaychecksAggregation(monthInYear=", ", year=");
            m1149m.append(this.year);
            m1149m.append(", aggregation=");
            m1149m.append(this.aggregation);
            m1149m.append(")");
            return m1149m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.monthInYear);
            parcel.writeLong(this.year);
            this.aggregation.writeToParcel(parcel, i);
        }
    }

    public final class Deduction implements Parcelable {
        public static final Parcelable.Creator<Deduction> CREATOR = new PaymentRecipient.Creator(3);
        public final Money amount;
        public final String description;
        public final String note;
        public final Color tint;

        public Deduction(Money money, String str, String str2, Color color) {
            money.getClass();
            str.getClass();
            color.getClass();
            this.amount = money;
            this.description = str;
            this.note = str2;
            this.tint = color;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Deduction)) {
                return false;
            }
            Deduction deduction = (Deduction) obj;
            return Intrinsics.areEqual(this.amount, deduction.amount) && Intrinsics.areEqual(this.description, deduction.description) && Intrinsics.areEqual(this.note, deduction.note) && Intrinsics.areEqual(this.tint, deduction.tint);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.amount.hashCode() * 31, 31, this.description);
            String str = this.note;
            return this.tint.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "Deduction(amount=" + this.amount + ", description=" + this.description + ", note=" + this.note + ", tint=" + this.tint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
            parcel.writeString(this.description);
            parcel.writeString(this.note);
            parcel.writeParcelable(this.tint, i);
        }
    }

    public final class Employer implements Parcelable {
        public static final Parcelable.Creator<Employer> CREATOR = new PaymentRecipient.Creator(4);
        public final EmployerUiConfiguration uiConfiguration;

        public final class EmployerUiConfiguration implements Parcelable {
            public static final Parcelable.Creator<EmployerUiConfiguration> CREATOR = new PaymentRecipient.Creator(5);
            public final Image avatar;
            public final Color avatarAccentColor;
            public final String title;

            public EmployerUiConfiguration(Color color, Image image, String str) {
                this.title = str;
                this.avatar = image;
                this.avatarAccentColor = color;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EmployerUiConfiguration)) {
                    return false;
                }
                EmployerUiConfiguration employerUiConfiguration = (EmployerUiConfiguration) obj;
                return Intrinsics.areEqual(this.title, employerUiConfiguration.title) && Intrinsics.areEqual(this.avatar, employerUiConfiguration.avatar) && Intrinsics.areEqual(this.avatarAccentColor, employerUiConfiguration.avatarAccentColor);
            }

            public final int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Image image = this.avatar;
                int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
                Color color = this.avatarAccentColor;
                return hashCode2 + (color != null ? color.hashCode() : 0);
            }

            public final String toString() {
                return "EmployerUiConfiguration(title=" + this.title + ", avatar=" + this.avatar + ", avatarAccentColor=" + this.avatarAccentColor + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.title);
                parcel.writeParcelable(this.avatar, i);
                parcel.writeParcelable(this.avatarAccentColor, i);
            }
        }

        public Employer(EmployerUiConfiguration employerUiConfiguration) {
            this.uiConfiguration = employerUiConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Employer) && Intrinsics.areEqual(this.uiConfiguration, ((Employer) obj).uiConfiguration);
        }

        public final int hashCode() {
            EmployerUiConfiguration employerUiConfiguration = this.uiConfiguration;
            if (employerUiConfiguration == null) {
                return 0;
            }
            return employerUiConfiguration.hashCode();
        }

        public final String toString() {
            return "Employer(uiConfiguration=" + this.uiConfiguration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            EmployerUiConfiguration employerUiConfiguration = this.uiConfiguration;
            if (employerUiConfiguration == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                employerUiConfiguration.writeToParcel(parcel, i);
            }
        }
    }

    public final class Paycheck implements Parcelable {
        public static final Parcelable.Creator<Paycheck> CREATOR = new PaymentRecipient.Creator(6);
        public final ArrayList deductions;
        public final PaycheckAllocationDistribution distribution;
        public final Employer employer;
        public final ArrayList realizedAllocationAmounts;
        public final SettlementDate settlementDate;
        public final String token;

        public final class SettlementDate implements Parcelable {
            public static final Parcelable.Creator<SettlementDate> CREATOR = new PaymentRecipient.Creator(7);
            public final long date;

            /* renamed from: type, reason: collision with root package name */
            public final Type f1181type;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Type {
                public static final /* synthetic */ Type[] $VALUES;
                public static final Type COMPLETED;
                public static final Type PENDING;

                static {
                    Type type2 = new Type("PENDING", 0);
                    PENDING = type2;
                    Type type3 = new Type("COMPLETED", 1);
                    COMPLETED = type3;
                    $VALUES = new Type[]{type2, type3};
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            public SettlementDate(Type type2, long j) {
                type2.getClass();
                this.f1181type = type2;
                this.date = j;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SettlementDate)) {
                    return false;
                }
                SettlementDate settlementDate = (SettlementDate) obj;
                return this.f1181type == settlementDate.f1181type && this.date == settlementDate.date;
            }

            public final int hashCode() {
                return Long.hashCode(this.date) + (this.f1181type.hashCode() * 31);
            }

            public final String toString() {
                return "SettlementDate(type=" + this.f1181type + ", date=" + this.date + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.f1181type.name());
                parcel.writeLong(this.date);
            }
        }

        public Paycheck(String str, SettlementDate settlementDate, Employer employer, PaycheckAllocationDistribution paycheckAllocationDistribution, ArrayList arrayList, ArrayList arrayList2) {
            str.getClass();
            settlementDate.getClass();
            paycheckAllocationDistribution.getClass();
            this.token = str;
            this.settlementDate = settlementDate;
            this.employer = employer;
            this.distribution = paycheckAllocationDistribution;
            this.deductions = arrayList;
            this.realizedAllocationAmounts = arrayList2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Paycheck)) {
                return false;
            }
            Paycheck paycheck = (Paycheck) obj;
            return Intrinsics.areEqual(this.token, paycheck.token) && Intrinsics.areEqual(this.settlementDate, paycheck.settlementDate) && Intrinsics.areEqual(this.employer, paycheck.employer) && Intrinsics.areEqual(this.distribution, paycheck.distribution) && this.deductions.equals(paycheck.deductions) && this.realizedAllocationAmounts.equals(paycheck.realizedAllocationAmounts);
        }

        public final int hashCode() {
            int hashCode = (this.settlementDate.hashCode() + (this.token.hashCode() * 31)) * 31;
            Employer employer = this.employer;
            return this.realizedAllocationAmounts.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.deductions, Recorder$$ExternalSyntheticOutline2.m((hashCode + (employer == null ? 0 : employer.hashCode())) * 31, 31, this.distribution.allocations), 31);
        }

        public final String toString() {
            return "Paycheck(token=" + this.token + ", settlementDate=" + this.settlementDate + ", employer=" + this.employer + ", distribution=" + this.distribution + ", deductions=" + this.deductions + ", realizedAllocationAmounts=" + this.realizedAllocationAmounts + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.token);
            this.settlementDate.writeToParcel(parcel, i);
            Employer employer = this.employer;
            if (employer == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                employer.writeToParcel(parcel, i);
            }
            this.distribution.writeToParcel(parcel, i);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.deductions, parcel);
            while (m.hasNext()) {
                ((Deduction) m.next()).writeToParcel(parcel, i);
            }
            Iterator m2 = NavAction$$ExternalSyntheticOutline0.m(this.realizedAllocationAmounts, parcel);
            while (m2.hasNext()) {
                ((RealizedAllocationAmount) m2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PaychecksAppletState {
        public static final /* synthetic */ PaychecksAppletState[] $VALUES;
        public static final PaychecksAppletState ACTIVE_STATE;
        public static final PaychecksAppletState HIDDEN;
        public static final PaychecksAppletState NULL_STATE;

        static {
            PaychecksAppletState paychecksAppletState = new PaychecksAppletState("NULL_STATE", 0);
            NULL_STATE = paychecksAppletState;
            PaychecksAppletState paychecksAppletState2 = new PaychecksAppletState("ACTIVE_STATE", 1);
            ACTIVE_STATE = paychecksAppletState2;
            PaychecksAppletState paychecksAppletState3 = new PaychecksAppletState("HIDDEN", 2);
            HIDDEN = paychecksAppletState3;
            $VALUES = new PaychecksAppletState[]{paychecksAppletState, paychecksAppletState2, paychecksAppletState3};
        }

        public static PaychecksAppletState valueOf(String str) {
            return (PaychecksAppletState) Enum.valueOf(PaychecksAppletState.class, str);
        }

        public static PaychecksAppletState[] values() {
            return (PaychecksAppletState[]) $VALUES.clone();
        }
    }

    public final class PaychecksBenefitsStatusSection implements Parcelable {
        public static final Parcelable.Creator<PaychecksBenefitsStatusSection> CREATOR = new PaymentRecipient.Creator(9);
        public final String body;
        public final PaychecksBenefitsState state;
        public final PaychecksColoredText title;
        public final Button viewBenefitsButton;

        public final class Button implements Parcelable {
            public static final Parcelable.Creator<Button> CREATOR = new PaymentRecipient.Creator(8);
            public final String clientRoute;
            public final String text;

            public Button(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.text = str;
                this.clientRoute = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.clientRoute, button.clientRoute);
            }

            public final int hashCode() {
                return this.clientRoute.hashCode() + (this.text.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Button(text=", this.text, ", clientRoute=", this.clientRoute, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.text);
                parcel.writeString(this.clientRoute);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class PaychecksBenefitsState {
            public static final /* synthetic */ PaychecksBenefitsState[] $VALUES;
            public static final PaychecksBenefitsState ACTIVE_STATE;
            public static final PaychecksBenefitsState INACTIVE_STATE;
            public static final PaychecksBenefitsState NULL_STATE;
            public static final PaychecksBenefitsState PENDING_STATE;

            static {
                PaychecksBenefitsState paychecksBenefitsState = new PaychecksBenefitsState("NULL_STATE", 0);
                NULL_STATE = paychecksBenefitsState;
                PaychecksBenefitsState paychecksBenefitsState2 = new PaychecksBenefitsState("PENDING_STATE", 1);
                PENDING_STATE = paychecksBenefitsState2;
                PaychecksBenefitsState paychecksBenefitsState3 = new PaychecksBenefitsState("ACTIVE_STATE", 2);
                ACTIVE_STATE = paychecksBenefitsState3;
                PaychecksBenefitsState paychecksBenefitsState4 = new PaychecksBenefitsState("INACTIVE_STATE", 3);
                INACTIVE_STATE = paychecksBenefitsState4;
                $VALUES = new PaychecksBenefitsState[]{paychecksBenefitsState, paychecksBenefitsState2, paychecksBenefitsState3, paychecksBenefitsState4};
            }

            public static PaychecksBenefitsState valueOf(String str) {
                return (PaychecksBenefitsState) Enum.valueOf(PaychecksBenefitsState.class, str);
            }

            public static PaychecksBenefitsState[] values() {
                return (PaychecksBenefitsState[]) $VALUES.clone();
            }
        }

        public final class PaychecksColoredText implements Parcelable {
            public static final Parcelable.Creator<PaychecksColoredText> CREATOR = new PaymentRecipient.Creator(10);
            public final String placeholderString;
            public final String text;
            public final Color tintColor;
            public final List values;

            public PaychecksColoredText(String str, String str2, Color color, ArrayList arrayList) {
                str.getClass();
                str2.getClass();
                arrayList.getClass();
                this.text = str;
                this.placeholderString = str2;
                this.tintColor = color;
                this.values = arrayList;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PaychecksColoredText)) {
                    return false;
                }
                PaychecksColoredText paychecksColoredText = (PaychecksColoredText) obj;
                return Intrinsics.areEqual(this.text, paychecksColoredText.text) && Intrinsics.areEqual(this.placeholderString, paychecksColoredText.placeholderString) && Intrinsics.areEqual(this.tintColor, paychecksColoredText.tintColor) && Intrinsics.areEqual(this.values, paychecksColoredText.values);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.placeholderString);
                Color color = this.tintColor;
                return this.values.hashCode() + ((m + (color == null ? 0 : color.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaychecksColoredText(text=", this.text, ", placeholderString=", this.placeholderString, ", tintColor=");
                m.append(this.tintColor);
                m.append(", values=");
                m.append(this.values);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.text);
                parcel.writeString(this.placeholderString);
                parcel.writeParcelable(this.tintColor, i);
                parcel.writeStringList(this.values);
            }
        }

        public PaychecksBenefitsStatusSection(PaychecksColoredText paychecksColoredText, String str, PaychecksBenefitsState paychecksBenefitsState, Button button) {
            paychecksColoredText.getClass();
            str.getClass();
            paychecksBenefitsState.getClass();
            this.title = paychecksColoredText;
            this.body = str;
            this.state = paychecksBenefitsState;
            this.viewBenefitsButton = button;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaychecksBenefitsStatusSection)) {
                return false;
            }
            PaychecksBenefitsStatusSection paychecksBenefitsStatusSection = (PaychecksBenefitsStatusSection) obj;
            return Intrinsics.areEqual(this.title, paychecksBenefitsStatusSection.title) && Intrinsics.areEqual(this.body, paychecksBenefitsStatusSection.body) && this.state == paychecksBenefitsStatusSection.state && Intrinsics.areEqual(this.viewBenefitsButton, paychecksBenefitsStatusSection.viewBenefitsButton);
        }

        public final int hashCode() {
            int hashCode = (this.state.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body)) * 31;
            Button button = this.viewBenefitsButton;
            return hashCode + (button == null ? 0 : button.hashCode());
        }

        public final String toString() {
            return "PaychecksBenefitsStatusSection(title=" + this.title + ", body=" + this.body + ", state=" + this.state + ", viewBenefitsButton=" + this.viewBenefitsButton + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.title.writeToParcel(parcel, i);
            parcel.writeString(this.body);
            parcel.writeString(this.state.name());
            Button button = this.viewBenefitsButton;
            if (button == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                button.writeToParcel(parcel, i);
            }
        }
    }

    public final class RealizedAllocationAmount implements Parcelable {
        public static final Parcelable.Creator<RealizedAllocationAmount> CREATOR = new PaymentRecipient.Creator(11);
        public final AllocationDestination destination;
        public final String note;
        public final Money realizedAmount;
        public final State state;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class State {
            public static final /* synthetic */ State[] $VALUES;
            public static final State COMPLETED;
            public static final State ERRORED;
            public static final State PENDING;

            static {
                State state = new State("PENDING", 0);
                PENDING = state;
                State state2 = new State("COMPLETED", 1);
                COMPLETED = state2;
                State state3 = new State("ERRORED", 2);
                ERRORED = state3;
                $VALUES = new State[]{state, state2, state3};
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }
        }

        public RealizedAllocationAmount(AllocationDestination allocationDestination, Money money, State state, String str) {
            allocationDestination.getClass();
            money.getClass();
            state.getClass();
            this.destination = allocationDestination;
            this.realizedAmount = money;
            this.state = state;
            this.note = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RealizedAllocationAmount)) {
                return false;
            }
            RealizedAllocationAmount realizedAllocationAmount = (RealizedAllocationAmount) obj;
            return Intrinsics.areEqual(this.destination, realizedAllocationAmount.destination) && Intrinsics.areEqual(this.realizedAmount, realizedAllocationAmount.realizedAmount) && this.state == realizedAllocationAmount.state && Intrinsics.areEqual(this.note, realizedAllocationAmount.note);
        }

        public final int hashCode() {
            int hashCode = (this.state.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.realizedAmount, this.destination.hashCode() * 31, 31)) * 31;
            String str = this.note;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "RealizedAllocationAmount(destination=" + this.destination + ", realizedAmount=" + this.realizedAmount + ", state=" + this.state + ", note=" + this.note + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.destination, i);
            parcel.writeParcelable(this.realizedAmount, i);
            parcel.writeString(this.state.name());
            parcel.writeString(this.note);
        }
    }

    public final class TimeBoundedPaychecksAggregation implements Parcelable {
        public static final Parcelable.Creator<TimeBoundedPaychecksAggregation> CREATOR = new PaymentRecipient.Creator(12);
        public final ArrayList deductions;
        public final ArrayList employers;
        public final long endDate;
        public final ArrayList realizedAllocationAmounts;
        public final long startDate;
        public final String token;

        public TimeBoundedPaychecksAggregation(String str, long j, long j2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            str.getClass();
            this.token = str;
            this.startDate = j;
            this.endDate = j2;
            this.employers = arrayList;
            this.deductions = arrayList2;
            this.realizedAllocationAmounts = arrayList3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeBoundedPaychecksAggregation)) {
                return false;
            }
            TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation = (TimeBoundedPaychecksAggregation) obj;
            return Intrinsics.areEqual(this.token, timeBoundedPaychecksAggregation.token) && this.startDate == timeBoundedPaychecksAggregation.startDate && this.endDate == timeBoundedPaychecksAggregation.endDate && this.employers.equals(timeBoundedPaychecksAggregation.employers) && this.deductions.equals(timeBoundedPaychecksAggregation.deductions) && this.realizedAllocationAmounts.equals(timeBoundedPaychecksAggregation.realizedAllocationAmounts);
        }

        public final int hashCode() {
            return this.realizedAllocationAmounts.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.deductions, CameraState$Type$EnumUnboxingLocalUtility.m(this.employers, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.token.hashCode() * 31, 31, this.startDate), 31, this.endDate), 31), 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("TimeBoundedPaychecksAggregation(token=", this.token, ", startDate=", this.startDate);
            Boxes$$ExternalSyntheticOutline1.m1151m(this.endDate, ", endDate=", ", employers=", m);
            m.append(this.employers);
            m.append(", deductions=");
            m.append(this.deductions);
            m.append(", realizedAllocationAmounts=");
            return Recorder$$ExternalSyntheticOutline1.m(")", m, this.realizedAllocationAmounts);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.token);
            parcel.writeLong(this.startDate);
            parcel.writeLong(this.endDate);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.employers, parcel);
            while (m.hasNext()) {
                ((Employer) m.next()).writeToParcel(parcel, i);
            }
            Iterator m2 = NavAction$$ExternalSyntheticOutline0.m(this.deductions, parcel);
            while (m2.hasNext()) {
                ((Deduction) m2.next()).writeToParcel(parcel, i);
            }
            Iterator m3 = NavAction$$ExternalSyntheticOutline0.m(this.realizedAllocationAmounts, parcel);
            while (m3.hasNext()) {
                ((RealizedAllocationAmount) m3.next()).writeToParcel(parcel, i);
            }
        }
    }

    public PaychecksUiState(Applet applet, CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation, boolean z, boolean z2, ArrayList arrayList, String str, PaychecksBenefitsStatusSection paychecksBenefitsStatusSection, Boolean bool) {
        this.applet = applet;
        this.displayedMonthlyPaychecksAggregation = calendarMonthPaychecksAggregation;
        this.customerDdaIsLocked = z;
        this.customerIsDenylisted = z2;
        this.upcomingPaychecks = arrayList;
        this.activitySubtitle = str;
        this.benefitsStatusSection = paychecksBenefitsStatusSection;
        this.shouldDisplayBenefitsBooklet = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaychecksUiState)) {
            return false;
        }
        PaychecksUiState paychecksUiState = (PaychecksUiState) obj;
        return this.applet.equals(paychecksUiState.applet) && Intrinsics.areEqual(this.displayedMonthlyPaychecksAggregation, paychecksUiState.displayedMonthlyPaychecksAggregation) && this.customerDdaIsLocked == paychecksUiState.customerDdaIsLocked && this.customerIsDenylisted == paychecksUiState.customerIsDenylisted && this.upcomingPaychecks.equals(paychecksUiState.upcomingPaychecks) && Intrinsics.areEqual(this.activitySubtitle, paychecksUiState.activitySubtitle) && Intrinsics.areEqual(this.benefitsStatusSection, paychecksUiState.benefitsStatusSection) && Intrinsics.areEqual(this.shouldDisplayBenefitsBooklet, paychecksUiState.shouldDisplayBenefitsBooklet);
    }

    public final int hashCode() {
        int hashCode = this.applet.hashCode() * 31;
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = this.displayedMonthlyPaychecksAggregation;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.upcomingPaychecks, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (calendarMonthPaychecksAggregation == null ? 0 : calendarMonthPaychecksAggregation.hashCode())) * 31, 31, this.customerDdaIsLocked), 31, this.customerIsDenylisted), 31);
        String str = this.activitySubtitle;
        int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
        PaychecksBenefitsStatusSection paychecksBenefitsStatusSection = this.benefitsStatusSection;
        int hashCode3 = (hashCode2 + (paychecksBenefitsStatusSection == null ? 0 : paychecksBenefitsStatusSection.hashCode())) * 31;
        Boolean bool = this.shouldDisplayBenefitsBooklet;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaychecksUiState(applet=");
        sb.append(this.applet);
        sb.append(", displayedMonthlyPaychecksAggregation=");
        sb.append(this.displayedMonthlyPaychecksAggregation);
        sb.append(", customerDdaIsLocked=");
        re$$ExternalSyntheticOutline0.m(sb, this.customerDdaIsLocked, ", customerIsDenylisted=", this.customerIsDenylisted, ", upcomingPaychecks=");
        sb.append(this.upcomingPaychecks);
        sb.append(", activitySubtitle=");
        sb.append(this.activitySubtitle);
        sb.append(", benefitsStatusSection=");
        sb.append(this.benefitsStatusSection);
        sb.append(", shouldDisplayBenefitsBooklet=");
        sb.append(this.shouldDisplayBenefitsBooklet);
        sb.append(")");
        return sb.toString();
    }
}
