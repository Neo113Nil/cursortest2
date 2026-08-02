package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotStaticPickerOption implements Parcelable {
    public static final Parcelable.Creator<MoneybotStaticPickerOption> CREATOR = new MusicScreen.Creator(15);
    public final Icon icon;
    public final String label;
    public final Money maxAmount;
    public final String subtitle;
    public final String value;

    public interface Icon extends Parcelable {

        public final class Avatar implements Icon {
            public static final Parcelable.Creator<Avatar> CREATOR = new MusicScreen.Creator(16);
            public final UiAvatar avatar;

            public Avatar(UiAvatar uiAvatar) {
                uiAvatar.getClass();
                this.avatar = uiAvatar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Avatar) && Intrinsics.areEqual(this.avatar, ((Avatar) obj).avatar);
            }

            public final int hashCode() {
                return this.avatar.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.avatar, "Avatar(avatar=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.avatar, i);
            }
        }

        public final class SavingsGoalIcon implements Icon {
            public static final Parcelable.Creator<SavingsGoalIcon> CREATOR = new MusicScreen.Creator(17);
            public final com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon savingsGoalIcon;

            public SavingsGoalIcon(com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon savingsGoalIcon) {
                savingsGoalIcon.getClass();
                this.savingsGoalIcon = savingsGoalIcon;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavingsGoalIcon) && Intrinsics.areEqual(this.savingsGoalIcon, ((SavingsGoalIcon) obj).savingsGoalIcon);
            }

            public final int hashCode() {
                return this.savingsGoalIcon.hashCode();
            }

            public final String toString() {
                return "SavingsGoalIcon(savingsGoalIcon=" + this.savingsGoalIcon + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.savingsGoalIcon, i);
            }
        }
    }

    public MoneybotStaticPickerOption(String str, String str2, String str3, Money money, Icon icon) {
        str.getClass();
        str2.getClass();
        this.value = str;
        this.label = str2;
        this.subtitle = str3;
        this.maxAmount = money;
        this.icon = icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotStaticPickerOption)) {
            return false;
        }
        MoneybotStaticPickerOption moneybotStaticPickerOption = (MoneybotStaticPickerOption) obj;
        return Intrinsics.areEqual(this.value, moneybotStaticPickerOption.value) && Intrinsics.areEqual(this.label, moneybotStaticPickerOption.label) && Intrinsics.areEqual(this.subtitle, moneybotStaticPickerOption.subtitle) && Intrinsics.areEqual(this.maxAmount, moneybotStaticPickerOption.maxAmount) && Intrinsics.areEqual(this.icon, moneybotStaticPickerOption.icon);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value.hashCode() * 31, 31, this.label);
        String str = this.subtitle;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Money money = this.maxAmount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        Icon icon = this.icon;
        return hashCode2 + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotStaticPickerOption(value=", this.value, ", label=", this.label, ", subtitle=");
        m.append(this.subtitle);
        m.append(", maxAmount=");
        m.append(this.maxAmount);
        m.append(", icon=");
        m.append(this.icon);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
        parcel.writeString(this.label);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.maxAmount, i);
        parcel.writeParcelable(this.icon, i);
    }
}
