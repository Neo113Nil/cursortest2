package com.squareup.cash.common.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.composable.adapter.ViewStateId;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ColorModel implements Parcelable {

    /* loaded from: classes6.dex */
    public final class Accented extends ColorModel {
        public static final Parcelable.Creator<Accented> CREATOR = new RoutingParams.Creator(22);
        public final Color color;

        public Accented(Color color) {
            color.getClass();
            this.color = color;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Accented) && Intrinsics.areEqual(this.color, ((Accented) obj).color);
        }

        public final Color getColor() {
            return this.color;
        }

        public final int hashCode() {
            return this.color.hashCode();
        }

        public final String toString() {
            return "Accented(color=" + this.color + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.color, i);
        }
    }

    /* loaded from: classes6.dex */
    public final class Arcade extends ColorModel {
        public static final Parcelable.Creator<Arcade> CREATOR = new RoutingParams.Creator(23);
        public final String token;

        public Arcade(String str) {
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
            return (obj instanceof Arcade) && Intrinsics.areEqual(this.token, ((Arcade) obj).token);
        }

        public final String getToken() {
            return this.token;
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Arcade(token=", this.token, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.token);
        }
    }

    /* loaded from: classes6.dex */
    public final class Background extends ColorModel {
        public static final Background INSTANCE = new Background();
        public static final Parcelable.Creator<Background> CREATOR = new RoutingParams.Creator(24);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Background);
        }

        public final int hashCode() {
            return 564382760;
        }

        public final String toString() {
            return "Background";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class BaseWhite extends ColorModel {
        public static final BaseWhite INSTANCE = new BaseWhite();
        public static final Parcelable.Creator<BaseWhite> CREATOR = new RoutingParams.Creator(25);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BaseWhite);
        }

        public final int hashCode() {
            return 869413278;
        }

        public final String toString() {
            return "BaseWhite";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class Bitcoin extends ColorModel {
        public static final Bitcoin INSTANCE = new Bitcoin();
        public static final Parcelable.Creator<Bitcoin> CREATOR = new RoutingParams.Creator(26);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Bitcoin);
        }

        public final int hashCode() {
            return 807360612;
        }

        public final String toString() {
            return "Bitcoin";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class CashGreen extends ColorModel {
        public static final CashGreen INSTANCE = new CashGreen();
        public static final Parcelable.Creator<CashGreen> CREATOR = new RoutingParams.Creator(27);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CashGreen);
        }

        public final int hashCode() {
            return -866636458;
        }

        public final String toString() {
            return "CashGreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class Error extends ColorModel {
        public static final Error INSTANCE = new Error();
        public static final Parcelable.Creator<Error> CREATOR = new RoutingParams.Creator(28);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -36346162;
        }

        public final String toString() {
            return "Error";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class GiftCard extends ColorModel {
        public static final GiftCard INSTANCE = new GiftCard();
        public static final Parcelable.Creator<GiftCard> CREATOR = new RoutingParams.Creator(29);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GiftCard);
        }

        public final int hashCode() {
            return -1003934246;
        }

        public final String toString() {
            return "GiftCard";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class Icon extends ColorModel {
        public static final Icon INSTANCE = new Icon();
        public static final Parcelable.Creator<Icon> CREATOR = new ViewStateId.Creator(1);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Icon);
        }

        public final int hashCode() {
            return 553121523;
        }

        public final String toString() {
            return "Icon";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class Investing extends ColorModel {
        public static final Investing INSTANCE = new Investing();
        public static final Parcelable.Creator<Investing> CREATOR = new ViewStateId.Creator(2);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Investing);
        }

        public final int hashCode() {
            return 677591443;
        }

        public final String toString() {
            return "Investing";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class PrimaryButtonBackground extends ColorModel {
        public static final PrimaryButtonBackground INSTANCE = new PrimaryButtonBackground();
        public static final Parcelable.Creator<PrimaryButtonBackground> CREATOR = new ViewStateId.Creator(3);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryButtonBackground);
        }

        public final int hashCode() {
            return -2121875608;
        }

        public final String toString() {
            return "PrimaryButtonBackground";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class SecondaryButtonBackground extends ColorModel {
        public static final SecondaryButtonBackground INSTANCE = new SecondaryButtonBackground();
        public static final Parcelable.Creator<SecondaryButtonBackground> CREATOR = new ViewStateId.Creator(4);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondaryButtonBackground);
        }

        public final int hashCode() {
            return -402766502;
        }

        public final String toString() {
            return "SecondaryButtonBackground";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class SecondaryLabel extends ColorModel {
        public static final SecondaryLabel INSTANCE = new SecondaryLabel();
        public static final Parcelable.Creator<SecondaryLabel> CREATOR = new ViewStateId.Creator(5);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondaryLabel);
        }

        public final int hashCode() {
            return 961302490;
        }

        public final String toString() {
            return "SecondaryLabel";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class Warning extends ColorModel {
        public static final Warning INSTANCE = new Warning();
        public static final Parcelable.Creator<Warning> CREATOR = new ViewStateId.Creator(6);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Warning);
        }

        public final int hashCode() {
            return 2034510562;
        }

        public final String toString() {
            return "Warning";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
