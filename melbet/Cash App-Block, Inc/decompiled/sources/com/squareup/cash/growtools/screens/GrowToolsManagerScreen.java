package com.squareup.cash.growtools.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.fileupload.api.UriString;

/* loaded from: classes.dex */
public abstract class GrowToolsManagerScreen implements Screen {

    /* renamed from: type, reason: collision with root package name */
    public final InvestmentType f1144type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class InvestmentType {
        public static final /* synthetic */ InvestmentType[] $VALUES;
        public static final InvestmentType AUTO_INVEST;
        public static final InvestmentType BITCOIN_AUTO_WITHDRAW;
        public static final InvestmentType DIRECT_DEPOSIT;
        public static final InvestmentType RECEIVE_P2P_AS_BITCOIN;
        public static final InvestmentType ROUND_UPS;

        static {
            InvestmentType investmentType = new InvestmentType("ROUND_UPS", 0);
            ROUND_UPS = investmentType;
            InvestmentType investmentType2 = new InvestmentType("AUTO_INVEST", 1);
            AUTO_INVEST = investmentType2;
            InvestmentType investmentType3 = new InvestmentType("DIRECT_DEPOSIT", 2);
            DIRECT_DEPOSIT = investmentType3;
            InvestmentType investmentType4 = new InvestmentType("RECEIVE_P2P_AS_BITCOIN", 3);
            RECEIVE_P2P_AS_BITCOIN = investmentType4;
            InvestmentType investmentType5 = new InvestmentType("BITCOIN_AUTO_WITHDRAW", 4);
            BITCOIN_AUTO_WITHDRAW = investmentType5;
            $VALUES = new InvestmentType[]{investmentType, investmentType2, investmentType3, investmentType4, investmentType5};
        }

        public static InvestmentType valueOf(String str) {
            return (InvestmentType) Enum.valueOf(InvestmentType.class, str);
        }

        public static InvestmentType[] values() {
            return (InvestmentType[]) $VALUES.clone();
        }
    }

    /* loaded from: classes6.dex */
    public final class ManageAutoInvestScreen extends GrowToolsManagerScreen {
        public static final Parcelable.Creator<ManageAutoInvestScreen> CREATOR = new UriString.Creator(13);
        public final Origin origin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManageAutoInvestScreen(Origin origin) {
            super(InvestmentType.AUTO_INVEST);
            origin.getClass();
            this.origin = origin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ManageAutoInvestScreen) && this.origin == ((ManageAutoInvestScreen) obj).origin;
        }

        @Override // com.squareup.cash.growtools.screens.GrowToolsManagerScreen
        public final Origin getOrigin() {
            return this.origin;
        }

        public final int hashCode() {
            return this.origin.hashCode();
        }

        public final String toString() {
            return "ManageAutoInvestScreen(origin=" + this.origin + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.origin.name());
        }
    }

    /* loaded from: classes6.dex */
    public final class ManageBitcoinAutoWithdrawScreen extends GrowToolsManagerScreen {
        public static final Parcelable.Creator<ManageBitcoinAutoWithdrawScreen> CREATOR = new UriString.Creator(14);
        public final Origin origin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManageBitcoinAutoWithdrawScreen(Origin origin) {
            super(InvestmentType.BITCOIN_AUTO_WITHDRAW);
            origin.getClass();
            this.origin = origin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ManageBitcoinAutoWithdrawScreen) && this.origin == ((ManageBitcoinAutoWithdrawScreen) obj).origin;
        }

        @Override // com.squareup.cash.growtools.screens.GrowToolsManagerScreen
        public final Origin getOrigin() {
            return this.origin;
        }

        public final int hashCode() {
            return this.origin.hashCode();
        }

        public final String toString() {
            return "ManageBitcoinAutoWithdrawScreen(origin=" + this.origin + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.origin.name());
        }
    }

    /* loaded from: classes6.dex */
    public final class ManageDirectDepositScreen extends GrowToolsManagerScreen {
        public static final Parcelable.Creator<ManageDirectDepositScreen> CREATOR = new UriString.Creator(15);
        public final Origin origin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManageDirectDepositScreen(Origin origin) {
            super(InvestmentType.DIRECT_DEPOSIT);
            origin.getClass();
            this.origin = origin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ManageDirectDepositScreen) && this.origin == ((ManageDirectDepositScreen) obj).origin;
        }

        @Override // com.squareup.cash.growtools.screens.GrowToolsManagerScreen
        public final Origin getOrigin() {
            return this.origin;
        }

        public final int hashCode() {
            return this.origin.hashCode();
        }

        public final String toString() {
            return "ManageDirectDepositScreen(origin=" + this.origin + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.origin.name());
        }
    }

    /* loaded from: classes6.dex */
    public final class ManageReceiveP2PAsBitcoinScreen extends GrowToolsManagerScreen {
        public static final Parcelable.Creator<ManageReceiveP2PAsBitcoinScreen> CREATOR = new UriString.Creator(16);
        public final Origin origin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManageReceiveP2PAsBitcoinScreen(Origin origin) {
            super(InvestmentType.RECEIVE_P2P_AS_BITCOIN);
            origin.getClass();
            this.origin = origin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ManageReceiveP2PAsBitcoinScreen) && this.origin == ((ManageReceiveP2PAsBitcoinScreen) obj).origin;
        }

        @Override // com.squareup.cash.growtools.screens.GrowToolsManagerScreen
        public final Origin getOrigin() {
            return this.origin;
        }

        public final int hashCode() {
            return this.origin.hashCode();
        }

        public final String toString() {
            return "ManageReceiveP2PAsBitcoinScreen(origin=" + this.origin + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.origin.name());
        }
    }

    /* loaded from: classes6.dex */
    public final class ManageRoundUpsScreen extends GrowToolsManagerScreen {
        public static final Parcelable.Creator<ManageRoundUpsScreen> CREATOR = new UriString.Creator(17);
        public final Origin origin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManageRoundUpsScreen(Origin origin) {
            super(InvestmentType.ROUND_UPS);
            origin.getClass();
            this.origin = origin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ManageRoundUpsScreen) && this.origin == ((ManageRoundUpsScreen) obj).origin;
        }

        @Override // com.squareup.cash.growtools.screens.GrowToolsManagerScreen
        public final Origin getOrigin() {
            return this.origin;
        }

        public final int hashCode() {
            return this.origin.hashCode();
        }

        public final String toString() {
            return "ManageRoundUpsScreen(origin=" + this.origin + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.origin.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class Origin {
        public static final /* synthetic */ Origin[] $VALUES;
        public static final Origin BITCOIN;
        public static final Origin CARD;
        public static final Origin SAVINGS;
        public static final Origin UNSPECIFIED;

        static {
            Origin origin = new Origin("BITCOIN", 0);
            BITCOIN = origin;
            Origin origin2 = new Origin("CARD", 1);
            CARD = origin2;
            Origin origin3 = new Origin("SAVINGS", 2);
            SAVINGS = origin3;
            Origin origin4 = new Origin("STOCKS", 3);
            Origin origin5 = new Origin("UNSPECIFIED", 4);
            UNSPECIFIED = origin5;
            $VALUES = new Origin[]{origin, origin2, origin3, origin4, origin5};
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) $VALUES.clone();
        }
    }

    public GrowToolsManagerScreen(InvestmentType investmentType) {
        this.f1144type = investmentType;
    }

    public abstract Origin getOrigin();
}
