package com.squareup.cash.earnings.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface AllocationDestination extends Parcelable {

    public final class BitcoinDestination implements AllocationDestination {
        public static final BitcoinDestination INSTANCE = new BitcoinDestination();
        public static final Parcelable.Creator<BitcoinDestination> CREATOR = new AddPayerCustomersScreen.Creator(2);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BitcoinDestination);
        }

        public final int hashCode() {
            return 2106339574;
        }

        public final String toString() {
            return "BitcoinDestination";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class CashBalanceDestination implements AllocationDestination {
        public static final CashBalanceDestination INSTANCE = new CashBalanceDestination();
        public static final Parcelable.Creator<CashBalanceDestination> CREATOR = new AddPayerCustomersScreen.Creator(3);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CashBalanceDestination);
        }

        public final int hashCode() {
            return 64801291;
        }

        public final String toString() {
            return "CashBalanceDestination";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class InvestingDestination implements AllocationDestination {
        public static final Parcelable.Creator<InvestingDestination> CREATOR = new AddPayerCustomersScreen.Creator(4);
        public final String entityToken;
        public final UiSpecification uiSpecification;

        public final class UiSpecification implements Parcelable {
            public static final Parcelable.Creator<UiSpecification> CREATOR = new AddPayerCustomersScreen.Creator(5);
            public final String displayName;
            public final Image icon;
            public final String symbol;

            public UiSpecification(Image image, String str, String str2) {
                this.displayName = str;
                this.symbol = str2;
                this.icon = image;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UiSpecification)) {
                    return false;
                }
                UiSpecification uiSpecification = (UiSpecification) obj;
                return Intrinsics.areEqual(this.displayName, uiSpecification.displayName) && Intrinsics.areEqual(this.symbol, uiSpecification.symbol) && Intrinsics.areEqual(this.icon, uiSpecification.icon);
            }

            public final int hashCode() {
                String str = this.displayName;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.symbol;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Image image = this.icon;
                return hashCode2 + (image != null ? image.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UiSpecification(displayName=", this.displayName, ", symbol=", this.symbol, ", icon=");
                m.append(this.icon);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.displayName);
                parcel.writeString(this.symbol);
                parcel.writeParcelable(this.icon, i);
            }
        }

        public InvestingDestination(String str, UiSpecification uiSpecification) {
            this.entityToken = str;
            this.uiSpecification = uiSpecification;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvestingDestination)) {
                return false;
            }
            InvestingDestination investingDestination = (InvestingDestination) obj;
            return Intrinsics.areEqual(this.entityToken, investingDestination.entityToken) && Intrinsics.areEqual(this.uiSpecification, investingDestination.uiSpecification);
        }

        public final int hashCode() {
            String str = this.entityToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            UiSpecification uiSpecification = this.uiSpecification;
            return hashCode + (uiSpecification != null ? uiSpecification.hashCode() : 0);
        }

        public final String toString() {
            return "InvestingDestination(entityToken=" + this.entityToken + ", uiSpecification=" + this.uiSpecification + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.entityToken);
            UiSpecification uiSpecification = this.uiSpecification;
            if (uiSpecification == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiSpecification.writeToParcel(parcel, i);
            }
        }
    }

    public final class SavingsDestination implements AllocationDestination {
        public static final Parcelable.Creator<SavingsDestination> CREATOR = new AddPayerCustomersScreen.Creator(6);
        public final Identifier identifier;
        public final UiSpecification uiSpecification;

        public abstract class Identifier implements Parcelable {

            public final class GoalToken extends Identifier {
                public static final Parcelable.Creator<GoalToken> CREATOR = new AddPayerCustomersScreen.Creator(7);
                public final String token;

                public GoalToken(String str) {
                    str.getClass();
                    this.token = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof GoalToken) && Intrinsics.areEqual(this.token, ((GoalToken) obj).token);
                }

                public final int hashCode() {
                    return this.token.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GoalToken(token=", this.token, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.token);
                }
            }

            public final class None extends Identifier {
                public static final None INSTANCE = new None();
                public static final Parcelable.Creator<None> CREATOR = new AddPayerCustomersScreen.Creator(8);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof None);
                }

                public final int hashCode() {
                    return 406803434;
                }

                public final String toString() {
                    return "None";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class WholeSavings extends Identifier {
                public static final Parcelable.Creator<WholeSavings> CREATOR = new AddPayerCustomersScreen.Creator(9);
                public final String identifier;

                public WholeSavings(String str) {
                    str.getClass();
                    this.identifier = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof WholeSavings) && Intrinsics.areEqual(this.identifier, ((WholeSavings) obj).identifier);
                }

                public final int hashCode() {
                    return this.identifier.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WholeSavings(identifier=", this.identifier, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.identifier);
                }
            }
        }

        public final class UiSpecification implements Parcelable {
            public static final Parcelable.Creator<UiSpecification> CREATOR = new AddPayerCustomersScreen.Creator(10);
            public final String iconId;
            public final String name;

            public UiSpecification(String str, String str2) {
                str.getClass();
                this.name = str;
                this.iconId = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UiSpecification)) {
                    return false;
                }
                UiSpecification uiSpecification = (UiSpecification) obj;
                return Intrinsics.areEqual(this.name, uiSpecification.name) && Intrinsics.areEqual(this.iconId, uiSpecification.iconId);
            }

            public final int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.iconId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("UiSpecification(name=", this.name, ", iconId=", this.iconId, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.name);
                parcel.writeString(this.iconId);
            }
        }

        public SavingsDestination(Identifier identifier, UiSpecification uiSpecification) {
            identifier.getClass();
            this.identifier = identifier;
            this.uiSpecification = uiSpecification;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavingsDestination)) {
                return false;
            }
            SavingsDestination savingsDestination = (SavingsDestination) obj;
            return Intrinsics.areEqual(this.identifier, savingsDestination.identifier) && Intrinsics.areEqual(this.uiSpecification, savingsDestination.uiSpecification);
        }

        public final int hashCode() {
            int hashCode = this.identifier.hashCode() * 31;
            UiSpecification uiSpecification = this.uiSpecification;
            return hashCode + (uiSpecification == null ? 0 : uiSpecification.hashCode());
        }

        public final String toString() {
            return "SavingsDestination(identifier=" + this.identifier + ", uiSpecification=" + this.uiSpecification + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.identifier, i);
            UiSpecification uiSpecification = this.uiSpecification;
            if (uiSpecification == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiSpecification.writeToParcel(parcel, i);
            }
        }
    }
}
