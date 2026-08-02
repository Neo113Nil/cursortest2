package com.squareup.cash.family.requestsponsorship.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.SelectSponsorsBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SelectSponsorScreen implements BlockersScreens {
    public static final Parcelable.Creator<SelectSponsorScreen> CREATOR = new Creator();
    public final BlockersData blockersData;
    public final SelectSponsorsBlocker.AddContactsCard contactsCard;
    public final SelectSponsorsBlocker.AddContactsDialog contactsDialog;
    public final String hint;
    public final BlockerAction inviteContactAction;
    public final boolean shouldOnlyRecommendCashUsers;
    public final String title;

    /* loaded from: classes6.dex */
    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SelectSponsorScreen((BlockersData) parcel.readParcelable(SelectSponsorScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (SelectSponsorsBlocker.AddContactsCard) parcel.readParcelable(SelectSponsorScreen.class.getClassLoader()), (SelectSponsorsBlocker.AddContactsDialog) parcel.readParcelable(SelectSponsorScreen.class.getClassLoader()), (BlockerAction) parcel.readParcelable(SelectSponsorScreen.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectSponsorScreen[i];
        }
    }

    public SelectSponsorScreen(BlockersData blockersData, String str, String str2, boolean z, SelectSponsorsBlocker.AddContactsCard addContactsCard, SelectSponsorsBlocker.AddContactsDialog addContactsDialog, BlockerAction blockerAction) {
        blockersData.getClass();
        str.getClass();
        str2.getClass();
        this.blockersData = blockersData;
        this.title = str;
        this.hint = str2;
        this.shouldOnlyRecommendCashUsers = z;
        this.contactsCard = addContactsCard;
        this.contactsDialog = addContactsDialog;
        this.inviteContactAction = blockerAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectSponsorScreen)) {
            return false;
        }
        SelectSponsorScreen selectSponsorScreen = (SelectSponsorScreen) obj;
        return Intrinsics.areEqual(this.blockersData, selectSponsorScreen.blockersData) && Intrinsics.areEqual(this.title, selectSponsorScreen.title) && Intrinsics.areEqual(this.hint, selectSponsorScreen.hint) && this.shouldOnlyRecommendCashUsers == selectSponsorScreen.shouldOnlyRecommendCashUsers && Intrinsics.areEqual(this.contactsCard, selectSponsorScreen.contactsCard) && Intrinsics.areEqual(this.contactsDialog, selectSponsorScreen.contactsDialog) && Intrinsics.areEqual(this.inviteContactAction, selectSponsorScreen.inviteContactAction);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.title), 31, this.hint), 31, this.shouldOnlyRecommendCashUsers);
        SelectSponsorsBlocker.AddContactsCard addContactsCard = this.contactsCard;
        int hashCode = (m + (addContactsCard == null ? 0 : addContactsCard.hashCode())) * 31;
        SelectSponsorsBlocker.AddContactsDialog addContactsDialog = this.contactsDialog;
        int hashCode2 = (hashCode + (addContactsDialog == null ? 0 : addContactsDialog.hashCode())) * 31;
        BlockerAction blockerAction = this.inviteContactAction;
        return hashCode2 + (blockerAction != null ? blockerAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "SelectSponsorScreen(blockersData=", ", title=", this.title, ", hint=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.hint, ", shouldOnlyRecommendCashUsers=", this.shouldOnlyRecommendCashUsers, ", contactsCard=");
        m.append(this.contactsCard);
        m.append(", contactsDialog=");
        m.append(this.contactsDialog);
        m.append(", inviteContactAction=");
        m.append(this.inviteContactAction);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeString(this.title);
        parcel.writeString(this.hint);
        parcel.writeInt(this.shouldOnlyRecommendCashUsers ? 1 : 0);
        parcel.writeParcelable(this.contactsCard, i);
        parcel.writeParcelable(this.contactsDialog, i);
        parcel.writeParcelable(this.inviteContactAction, i);
    }
}
