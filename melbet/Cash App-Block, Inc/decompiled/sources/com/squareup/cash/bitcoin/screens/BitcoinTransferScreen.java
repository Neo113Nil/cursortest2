package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.screens.blockers.AmountSheetSavedState;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class BitcoinTransferScreen extends BitcoinOverlay implements InvestingScreens.HasFrequency {
    public static final Parcelable.Creator<BitcoinTransferScreen> CREATOR = new Creator();
    public final Screen exitScreen;
    public final RecurringSchedule.Frequency frequency;
    public final boolean hideChangeOrderType;
    public final String instrumentToken;
    public final boolean isBuy;
    public final OrderType orderType;
    public final Screen originScreen;
    public final SavedState savedState;
    public final boolean showKeypad;
    public final boolean useBackNavigationIcon;

    /* loaded from: classes5.dex */
    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            OrderType orderType;
            SavedState savedState;
            Screen screen;
            RecurringSchedule.Frequency frequency;
            Screen screen2;
            boolean z4;
            parcel.getClass();
            boolean z5 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z6 = z;
            }
            OrderType orderType2 = (OrderType) parcel.readParcelable(BitcoinTransferScreen.class.getClassLoader());
            RecurringSchedule.Frequency valueOf = parcel.readInt() == 0 ? null : RecurringSchedule.Frequency.valueOf(parcel.readString());
            SavedState createFromParcel = parcel.readInt() != 0 ? SavedState.CREATOR.createFromParcel(parcel) : null;
            Screen screen3 = (Screen) parcel.readParcelable(BitcoinTransferScreen.class.getClassLoader());
            Screen screen4 = (Screen) parcel.readParcelable(BitcoinTransferScreen.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = z2;
                orderType = orderType2;
                savedState = createFromParcel;
                screen = screen4;
                frequency = valueOf;
                screen2 = screen3;
                z4 = z3;
            } else {
                z3 = z2;
                orderType = orderType2;
                savedState = createFromParcel;
                screen = screen4;
                frequency = valueOf;
                screen2 = screen3;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new BitcoinTransferScreen(z5, z6, orderType, frequency, savedState, screen2, screen, z4, z3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BitcoinTransferScreen[i];
        }
    }

    /* loaded from: classes5.dex */
    public abstract class OrderType implements Parcelable {

        public final class CustomOrder extends OrderType {
            public static final Parcelable.Creator<CustomOrder> CREATOR = new MoveBitcoinScreen.Creator(2);
            public final long currentUsdPerBtc;
            public final long targetUsdPerBtc;

            public CustomOrder(long j, long j2) {
                this.currentUsdPerBtc = j;
                this.targetUsdPerBtc = j2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CustomOrder)) {
                    return false;
                }
                CustomOrder customOrder = (CustomOrder) obj;
                return this.currentUsdPerBtc == customOrder.currentUsdPerBtc && this.targetUsdPerBtc == customOrder.targetUsdPerBtc;
            }

            public final int hashCode() {
                return Long.hashCode(this.targetUsdPerBtc) + (Long.hashCode(this.currentUsdPerBtc) * 31);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m(this.targetUsdPerBtc, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.currentUsdPerBtc, "CustomOrder(currentUsdPerBtc=", ", targetUsdPerBtc="));
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeLong(this.currentUsdPerBtc);
                parcel.writeLong(this.targetUsdPerBtc);
            }
        }

        public final class Standard extends OrderType {
            public static final Standard INSTANCE = new Standard();
            public static final Parcelable.Creator<Standard> CREATOR = new MoveBitcoinScreen.Creator(3);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Standard);
            }

            public final int hashCode() {
                return 841040901;
            }

            public final String toString() {
                return "Standard";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new MoveBitcoinScreen.Creator(4);
        public final AmountSheetSavedState uiState;

        public SavedState(AmountSheetSavedState amountSheetSavedState) {
            amountSheetSavedState.getClass();
            this.uiState = amountSheetSavedState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SavedState) && Intrinsics.areEqual(this.uiState, ((SavedState) obj).uiState);
        }

        public final int hashCode() {
            return this.uiState.hashCode();
        }

        public final String toString() {
            return "SavedState(uiState=" + this.uiState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.uiState, i);
        }
    }

    public /* synthetic */ BitcoinTransferScreen(boolean z, boolean z2, OrderType orderType, SavedState savedState, Screen screen, Screen screen2, String str, int i) {
        this(z, z2, orderType, null, savedState, screen, screen2, (i & 128) == 0, (i & 256) == 0, (i & 512) != 0 ? null : str);
    }

    public static BitcoinTransferScreen copy$default(BitcoinTransferScreen bitcoinTransferScreen, RecurringSchedule.Frequency frequency, SavedState savedState, String str, int i) {
        boolean z = bitcoinTransferScreen.isBuy;
        boolean z2 = (i & 2) != 0 ? bitcoinTransferScreen.showKeypad : true;
        OrderType orderType = bitcoinTransferScreen.orderType;
        if ((i & 8) != 0) {
            frequency = bitcoinTransferScreen.frequency;
        }
        RecurringSchedule.Frequency frequency2 = frequency;
        if ((i & 16) != 0) {
            savedState = bitcoinTransferScreen.savedState;
        }
        SavedState savedState2 = savedState;
        Screen screen = bitcoinTransferScreen.exitScreen;
        Screen screen2 = bitcoinTransferScreen.originScreen;
        boolean z3 = bitcoinTransferScreen.hideChangeOrderType;
        boolean z4 = bitcoinTransferScreen.useBackNavigationIcon;
        if ((i & 512) != 0) {
            str = bitcoinTransferScreen.instrumentToken;
        }
        bitcoinTransferScreen.getClass();
        orderType.getClass();
        screen.getClass();
        return new BitcoinTransferScreen(z, z2, orderType, frequency2, savedState2, screen, screen2, z3, z4, str);
    }

    @Override // com.squareup.cash.investing.screen.keys.InvestingScreens.HasFrequency
    public final Screen copyWithFrequency(RecurringSchedule.Frequency frequency) {
        return copy$default(this, frequency, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC);
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
        if (!(obj instanceof BitcoinTransferScreen)) {
            return false;
        }
        BitcoinTransferScreen bitcoinTransferScreen = (BitcoinTransferScreen) obj;
        return this.isBuy == bitcoinTransferScreen.isBuy && this.showKeypad == bitcoinTransferScreen.showKeypad && Intrinsics.areEqual(this.orderType, bitcoinTransferScreen.orderType) && this.frequency == bitcoinTransferScreen.frequency && Intrinsics.areEqual(this.savedState, bitcoinTransferScreen.savedState) && Intrinsics.areEqual(this.exitScreen, bitcoinTransferScreen.exitScreen) && Intrinsics.areEqual(this.originScreen, bitcoinTransferScreen.originScreen) && this.hideChangeOrderType == bitcoinTransferScreen.hideChangeOrderType && this.useBackNavigationIcon == bitcoinTransferScreen.useBackNavigationIcon && Intrinsics.areEqual(this.instrumentToken, bitcoinTransferScreen.instrumentToken);
    }

    @Override // com.squareup.cash.investing.screen.keys.InvestingScreens.HasFrequency
    public final RecurringSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        int hashCode = (this.orderType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isBuy) * 31, 31, this.showKeypad)) * 31;
        RecurringSchedule.Frequency frequency = this.frequency;
        int hashCode2 = (hashCode + (frequency == null ? 0 : frequency.hashCode())) * 31;
        SavedState savedState = this.savedState;
        int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreen, (hashCode2 + (savedState == null ? 0 : savedState.hashCode())) * 31, 31);
        Screen screen = this.originScreen;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (screen == null ? 0 : screen.hashCode())) * 31, 31, this.hideChangeOrderType), 31, this.useBackNavigationIcon);
        String str = this.instrumentToken;
        return m2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("BitcoinTransferScreen(isBuy=", ", showKeypad=", ", orderType=", this.isBuy, this.showKeypad);
        m.append(this.orderType);
        m.append(", frequency=");
        m.append(this.frequency);
        m.append(", savedState=");
        m.append(this.savedState);
        m.append(", exitScreen=");
        m.append(this.exitScreen);
        m.append(", originScreen=");
        m.append(this.originScreen);
        m.append(", hideChangeOrderType=");
        m.append(this.hideChangeOrderType);
        m.append(", useBackNavigationIcon=");
        m.append(this.useBackNavigationIcon);
        m.append(", instrumentToken=");
        m.append(this.instrumentToken);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.isBuy ? 1 : 0);
        parcel.writeInt(this.showKeypad ? 1 : 0);
        parcel.writeParcelable(this.orderType, i);
        RecurringSchedule.Frequency frequency = this.frequency;
        if (frequency == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(frequency.name());
        }
        SavedState savedState = this.savedState;
        if (savedState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            savedState.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.exitScreen, i);
        parcel.writeParcelable(this.originScreen, i);
        parcel.writeInt(this.hideChangeOrderType ? 1 : 0);
        parcel.writeInt(this.useBackNavigationIcon ? 1 : 0);
        parcel.writeString(this.instrumentToken);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinTransferScreen(boolean z, boolean z2, OrderType orderType, RecurringSchedule.Frequency frequency, SavedState savedState, Screen screen, Screen screen2, boolean z3, boolean z4, String str) {
        super(1);
        orderType.getClass();
        screen.getClass();
        this.isBuy = z;
        this.showKeypad = z2;
        this.orderType = orderType;
        this.frequency = frequency;
        this.savedState = savedState;
        this.exitScreen = screen;
        this.originScreen = screen2;
        this.hideChangeOrderType = z3;
        this.useBackNavigationIcon = z4;
        this.instrumentToken = str;
    }
}
