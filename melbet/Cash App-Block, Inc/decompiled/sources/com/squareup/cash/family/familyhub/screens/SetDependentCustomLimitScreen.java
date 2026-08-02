package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerLimit;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SetDependentCustomLimitScreen implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<SetDependentCustomLimitScreen> CREATOR = new FamilyHome.Creator(11);
    public final ControlType controlType;
    public final CurrencyCode currencyCode;
    public final String dependentCustomerToken;
    public final LimitCategory limitCategory;
    public final long maxAmountInCents;
    public final Long selectedAmountInCents;

    /* loaded from: classes6.dex */
    public abstract class LimitCategory implements Parcelable {
        public final LimitFrequency limitFrequency;
        public final List presetLimitsInCents;

        public final class BuyBitcoin extends LimitCategory {
            public static final Parcelable.Creator<BuyBitcoin> CREATOR = new FamilyHome.Creator(12);
            public final Money existingLimit;
            public final CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency frequency;
            public final long maxLimitInCents;
            public final List presetLimitsInCents;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public BuyBitcoin(CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency frequency, Money money, List list, long j) {
                super(list, r0);
                LimitFrequency limitFrequency;
                frequency.getClass();
                money.getClass();
                list.getClass();
                int ordinal = frequency.ordinal();
                if (ordinal == 0) {
                    limitFrequency = LimitFrequency.UNSPECIFIED;
                } else if (ordinal == 1) {
                    limitFrequency = LimitFrequency.WEEKLY;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        throw null;
                    }
                    limitFrequency = LimitFrequency.MONTHLY;
                }
                this.frequency = frequency;
                this.existingLimit = money;
                this.presetLimitsInCents = list;
                this.maxLimitInCents = j;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BuyBitcoin)) {
                    return false;
                }
                BuyBitcoin buyBitcoin = (BuyBitcoin) obj;
                return this.frequency == buyBitcoin.frequency && Intrinsics.areEqual(this.existingLimit, buyBitcoin.existingLimit) && Intrinsics.areEqual(this.presetLimitsInCents, buyBitcoin.presetLimitsInCents) && this.maxLimitInCents == buyBitcoin.maxLimitInCents;
            }

            @Override // com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen.LimitCategory
            public final Money getExistingLimit() {
                return this.existingLimit;
            }

            @Override // com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen.LimitCategory
            public final long getMaxLimitInCents() {
                return this.maxLimitInCents;
            }

            @Override // com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen.LimitCategory
            public final List getPresetLimitsInCents() {
                return this.presetLimitsInCents;
            }

            public final int hashCode() {
                return Long.hashCode(this.maxLimitInCents) + Recorder$$ExternalSyntheticOutline2.m(NavAction$$ExternalSyntheticOutline0.m(this.existingLimit, this.frequency.hashCode() * 31, 31), 31, this.presetLimitsInCents);
            }

            public final String toString() {
                return "BuyBitcoin(frequency=" + this.frequency + ", existingLimit=" + this.existingLimit + ", presetLimitsInCents=" + this.presetLimitsInCents + ", maxLimitInCents=" + this.maxLimitInCents + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.frequency.name());
                parcel.writeParcelable(this.existingLimit, i);
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.presetLimitsInCents, parcel);
                while (m.hasNext()) {
                    parcel.writeLong(((Number) m.next()).longValue());
                }
                parcel.writeLong(this.maxLimitInCents);
            }
        }

        public final class BuyStock extends LimitCategory {
            public static final Parcelable.Creator<BuyStock> CREATOR = new FamilyHome.Creator(13);
            public final Money existingLimit;
            public final CustomerLimit.Frequency frequency;
            public final long maxLimitInCents;
            public final List presetLimitsInCents;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public BuyStock(CustomerLimit.Frequency frequency, Money money, List list, long j) {
                super(list, r0);
                LimitFrequency limitFrequency;
                frequency.getClass();
                money.getClass();
                list.getClass();
                int ordinal = frequency.ordinal();
                if (ordinal == 0) {
                    limitFrequency = LimitFrequency.UNSPECIFIED;
                } else if (ordinal == 1) {
                    limitFrequency = LimitFrequency.WEEKLY;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        throw null;
                    }
                    limitFrequency = LimitFrequency.MONTHLY;
                }
                this.frequency = frequency;
                this.existingLimit = money;
                this.presetLimitsInCents = list;
                this.maxLimitInCents = j;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BuyStock)) {
                    return false;
                }
                BuyStock buyStock = (BuyStock) obj;
                return this.frequency == buyStock.frequency && Intrinsics.areEqual(this.existingLimit, buyStock.existingLimit) && Intrinsics.areEqual(this.presetLimitsInCents, buyStock.presetLimitsInCents) && this.maxLimitInCents == buyStock.maxLimitInCents;
            }

            @Override // com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen.LimitCategory
            public final Money getExistingLimit() {
                return this.existingLimit;
            }

            @Override // com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen.LimitCategory
            public final long getMaxLimitInCents() {
                return this.maxLimitInCents;
            }

            @Override // com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen.LimitCategory
            public final List getPresetLimitsInCents() {
                return this.presetLimitsInCents;
            }

            public final int hashCode() {
                return Long.hashCode(this.maxLimitInCents) + Recorder$$ExternalSyntheticOutline2.m(NavAction$$ExternalSyntheticOutline0.m(this.existingLimit, this.frequency.hashCode() * 31, 31), 31, this.presetLimitsInCents);
            }

            public final String toString() {
                return "BuyStock(frequency=" + this.frequency + ", existingLimit=" + this.existingLimit + ", presetLimitsInCents=" + this.presetLimitsInCents + ", maxLimitInCents=" + this.maxLimitInCents + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.frequency.name());
                parcel.writeParcelable(this.existingLimit, i);
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.presetLimitsInCents, parcel);
                while (m.hasNext()) {
                    parcel.writeLong(((Number) m.next()).longValue());
                }
                parcel.writeLong(this.maxLimitInCents);
            }
        }

        public final class CashCardSpend extends LimitCategory {
            public static final Parcelable.Creator<CashCardSpend> CREATOR = new FamilyHome.Creator(14);
            public final String dependentFirstName;
            public final Money existingLimit;
            public final long maxLimitInCents;
            public final ArrayList presetLimitsInCents;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CashCardSpend(Money money, ArrayList arrayList, long j, String str) {
                super(arrayList, LimitFrequency.MONTHLY);
                str.getClass();
                this.existingLimit = money;
                this.presetLimitsInCents = arrayList;
                this.maxLimitInCents = j;
                this.dependentFirstName = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CashCardSpend)) {
                    return false;
                }
                CashCardSpend cashCardSpend = (CashCardSpend) obj;
                return Intrinsics.areEqual(this.existingLimit, cashCardSpend.existingLimit) && Intrinsics.areEqual(this.presetLimitsInCents, cashCardSpend.presetLimitsInCents) && this.maxLimitInCents == cashCardSpend.maxLimitInCents && Intrinsics.areEqual(this.dependentFirstName, cashCardSpend.dependentFirstName);
            }

            @Override // com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen.LimitCategory
            public final Money getExistingLimit() {
                return this.existingLimit;
            }

            @Override // com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen.LimitCategory
            public final long getMaxLimitInCents() {
                return this.maxLimitInCents;
            }

            @Override // com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen.LimitCategory
            public final List getPresetLimitsInCents() {
                return this.presetLimitsInCents;
            }

            public final int hashCode() {
                Money money = this.existingLimit;
                return this.dependentFirstName.hashCode() + Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.presetLimitsInCents, (money == null ? 0 : money.hashCode()) * 31, 31), 31, this.maxLimitInCents);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CashCardSpend(existingLimit=");
                sb.append(this.existingLimit);
                sb.append(", presetLimitsInCents=");
                sb.append(this.presetLimitsInCents);
                sb.append(", maxLimitInCents=");
                Fragment$5$$ExternalSyntheticOutline0.m(this.maxLimitInCents, ", dependentFirstName=", this.dependentFirstName, sb);
                sb.append(")");
                return sb.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.existingLimit, i);
                Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.presetLimitsInCents, parcel);
                while (m.hasNext()) {
                    parcel.writeLong(((Number) m.next()).longValue());
                }
                parcel.writeLong(this.maxLimitInCents);
                parcel.writeString(this.dependentFirstName);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class LimitFrequency {
            public static final /* synthetic */ LimitFrequency[] $VALUES;
            public static final LimitFrequency MONTHLY;
            public static final LimitFrequency UNSPECIFIED;
            public static final LimitFrequency WEEKLY;

            static {
                LimitFrequency limitFrequency = new LimitFrequency("UNSPECIFIED", 0);
                UNSPECIFIED = limitFrequency;
                LimitFrequency limitFrequency2 = new LimitFrequency("MONTHLY", 1);
                MONTHLY = limitFrequency2;
                LimitFrequency limitFrequency3 = new LimitFrequency("WEEKLY", 2);
                WEEKLY = limitFrequency3;
                $VALUES = new LimitFrequency[]{limitFrequency, limitFrequency2, limitFrequency3};
            }

            public static LimitFrequency valueOf(String str) {
                return (LimitFrequency) Enum.valueOf(LimitFrequency.class, str);
            }

            public static LimitFrequency[] values() {
                return (LimitFrequency[]) $VALUES.clone();
            }
        }

        public final class P2PSend extends LimitCategory {
            public static final Parcelable.Creator<P2PSend> CREATOR = new FamilyHome.Creator(15);
            public final String dependentFirstName;
            public final Money existingLimit;
            public final long maxLimitInCents;
            public final ArrayList presetLimitsInCents;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public P2PSend(Money money, ArrayList arrayList, long j, String str) {
                super(arrayList, LimitFrequency.MONTHLY);
                str.getClass();
                this.existingLimit = money;
                this.presetLimitsInCents = arrayList;
                this.maxLimitInCents = j;
                this.dependentFirstName = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof P2PSend)) {
                    return false;
                }
                P2PSend p2PSend = (P2PSend) obj;
                return Intrinsics.areEqual(this.existingLimit, p2PSend.existingLimit) && Intrinsics.areEqual(this.presetLimitsInCents, p2PSend.presetLimitsInCents) && this.maxLimitInCents == p2PSend.maxLimitInCents && Intrinsics.areEqual(this.dependentFirstName, p2PSend.dependentFirstName);
            }

            @Override // com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen.LimitCategory
            public final Money getExistingLimit() {
                return this.existingLimit;
            }

            @Override // com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen.LimitCategory
            public final long getMaxLimitInCents() {
                return this.maxLimitInCents;
            }

            @Override // com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen.LimitCategory
            public final List getPresetLimitsInCents() {
                return this.presetLimitsInCents;
            }

            public final int hashCode() {
                Money money = this.existingLimit;
                return this.dependentFirstName.hashCode() + Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.presetLimitsInCents, (money == null ? 0 : money.hashCode()) * 31, 31), 31, this.maxLimitInCents);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("P2PSend(existingLimit=");
                sb.append(this.existingLimit);
                sb.append(", presetLimitsInCents=");
                sb.append(this.presetLimitsInCents);
                sb.append(", maxLimitInCents=");
                Fragment$5$$ExternalSyntheticOutline0.m(this.maxLimitInCents, ", dependentFirstName=", this.dependentFirstName, sb);
                sb.append(")");
                return sb.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.existingLimit, i);
                Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.presetLimitsInCents, parcel);
                while (m.hasNext()) {
                    parcel.writeLong(((Number) m.next()).longValue());
                }
                parcel.writeLong(this.maxLimitInCents);
                parcel.writeString(this.dependentFirstName);
            }
        }

        public LimitCategory(List list, LimitFrequency limitFrequency) {
            this.presetLimitsInCents = list;
            this.limitFrequency = limitFrequency;
        }

        public abstract Money getExistingLimit();

        public abstract long getMaxLimitInCents();

        public abstract List getPresetLimitsInCents();
    }

    public SetDependentCustomLimitScreen(String str, LimitCategory limitCategory, ControlType controlType) {
        CurrencyCode currencyCode;
        str.getClass();
        limitCategory.getClass();
        controlType.getClass();
        this.dependentCustomerToken = str;
        this.limitCategory = limitCategory;
        this.controlType = controlType;
        Money existingLimit = limitCategory.getExistingLimit();
        this.selectedAmountInCents = existingLimit != null ? existingLimit.amount : null;
        Money existingLimit2 = limitCategory.getExistingLimit();
        this.currencyCode = (existingLimit2 == null || (currencyCode = existingLimit2.currency_code) == null) ? CurrencyCode.USD : currencyCode;
        this.maxAmountInCents = limitCategory.getMaxLimitInCents();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetDependentCustomLimitScreen)) {
            return false;
        }
        SetDependentCustomLimitScreen setDependentCustomLimitScreen = (SetDependentCustomLimitScreen) obj;
        return Intrinsics.areEqual(this.dependentCustomerToken, setDependentCustomLimitScreen.dependentCustomerToken) && Intrinsics.areEqual(this.limitCategory, setDependentCustomLimitScreen.limitCategory) && this.controlType == setDependentCustomLimitScreen.controlType;
    }

    public final int hashCode() {
        return this.controlType.hashCode() + ((this.limitCategory.hashCode() + (this.dependentCustomerToken.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SetDependentCustomLimitScreen(dependentCustomerToken=" + this.dependentCustomerToken + ", limitCategory=" + this.limitCategory + ", controlType=" + this.controlType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.dependentCustomerToken);
        parcel.writeParcelable(this.limitCategory, i);
        parcel.writeString(this.controlType.name());
    }
}
