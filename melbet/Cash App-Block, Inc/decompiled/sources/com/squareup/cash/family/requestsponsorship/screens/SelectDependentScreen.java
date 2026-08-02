package com.squareup.cash.family.requestsponsorship.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SelectDependentsBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SelectDependentScreen implements BlockersScreens {
    public static final Parcelable.Creator<SelectDependentScreen> CREATOR = new Creator();
    public final boolean allowOnlyCashUsers;
    public final BlockersData blockersData;
    public final SelectDependentsBlocker.AddContactsCard contactsCard;
    public final SelectDependentsBlocker.AddContactsDialog contactsDialog;
    public final String hint;
    public final String title;

    /* loaded from: classes6.dex */
    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SelectDependentScreen((BlockersData) parcel.readParcelable(SelectDependentScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), (SelectDependentsBlocker.AddContactsCard) parcel.readParcelable(SelectDependentScreen.class.getClassLoader()), (SelectDependentsBlocker.AddContactsDialog) parcel.readParcelable(SelectDependentScreen.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectDependentScreen[i];
        }
    }

    public SelectDependentScreen(BlockersData blockersData, String str, String str2, SelectDependentsBlocker.AddContactsCard addContactsCard, SelectDependentsBlocker.AddContactsDialog addContactsDialog, boolean z) {
        blockersData.getClass();
        str.getClass();
        str2.getClass();
        this.blockersData = blockersData;
        this.title = str;
        this.hint = str2;
        this.contactsCard = addContactsCard;
        this.contactsDialog = addContactsDialog;
        this.allowOnlyCashUsers = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectDependentScreen)) {
            return false;
        }
        SelectDependentScreen selectDependentScreen = (SelectDependentScreen) obj;
        return Intrinsics.areEqual(this.blockersData, selectDependentScreen.blockersData) && Intrinsics.areEqual(this.title, selectDependentScreen.title) && Intrinsics.areEqual(this.hint, selectDependentScreen.hint) && Intrinsics.areEqual(this.contactsCard, selectDependentScreen.contactsCard) && Intrinsics.areEqual(this.contactsDialog, selectDependentScreen.contactsDialog) && this.allowOnlyCashUsers == selectDependentScreen.allowOnlyCashUsers;
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.title), 31, this.hint);
        SelectDependentsBlocker.AddContactsCard addContactsCard = this.contactsCard;
        int hashCode = (m + (addContactsCard == null ? 0 : addContactsCard.hashCode())) * 31;
        SelectDependentsBlocker.AddContactsDialog addContactsDialog = this.contactsDialog;
        return Boolean.hashCode(this.allowOnlyCashUsers) + ((hashCode + (addContactsDialog != null ? addContactsDialog.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "SelectDependentScreen(blockersData=", ", title=", this.title, ", hint=");
        m.append(this.hint);
        m.append(", contactsCard=");
        m.append(this.contactsCard);
        m.append(", contactsDialog=");
        m.append(this.contactsDialog);
        m.append(", allowOnlyCashUsers=");
        m.append(this.allowOnlyCashUsers);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeString(this.title);
        parcel.writeString(this.hint);
        parcel.writeParcelable(this.contactsCard, i);
        parcel.writeParcelable(this.contactsDialog, i);
        parcel.writeInt(this.allowOnlyCashUsers ? 1 : 0);
    }
}
