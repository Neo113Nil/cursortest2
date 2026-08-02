package com.squareup.cash.profile.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.R;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.Category;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class AliasItem implements Parcelable {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ AliasItem[] $VALUES;
    public static final Parcelable.Creator<AliasItem> CREATOR;
    public static final AliasItem EMAIL;
    public static final AliasItem PHONE;
    public final int body;
    public final Category.Icon icon;
    public final int title;

    static {
        AliasItem aliasItem = new AliasItem("PHONE", 0, R.string.contact_method_phone, Category.Icon.PHONE, R.string.contact_method_details_page_body_phone);
        PHONE = aliasItem;
        AliasItem aliasItem2 = new AliasItem("EMAIL", 1, R.string.contact_method_email, Category.Icon.EMAIL, R.string.contact_method_details_page_body_email);
        EMAIL = aliasItem2;
        AliasItem[] aliasItemArr = {aliasItem, aliasItem2};
        $VALUES = aliasItemArr;
        $ENTRIES = new EnumEntriesList(aliasItemArr);
        CREATOR = new Alias.Creator(18);
    }

    public AliasItem(String str, int i, int i2, Category.Icon icon, int i3) {
        this.title = i2;
        this.icon = icon;
        this.body = i3;
    }

    public static AliasItem valueOf(String str) {
        return (AliasItem) Enum.valueOf(AliasItem.class, str);
    }

    public static AliasItem[] values() {
        return (AliasItem[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
