package com.squareup.cash.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.shopping.settings.screens.ShoppingSettingsAutofillScreen;
import com.squareup.cash.shopping.settings.screens.ShoppingSettingsScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RedactedString extends Redacted {
    public static final Parcelable.Creator<RedactedString> CREATOR = new Creator(0);
    public final String value;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new RedactedString(parcel.readString());
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return ShoppingSettingsAutofillScreen.INSTANCE;
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return ShoppingSettingsScreen.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new RedactedString[i];
                case 1:
                    return new ShoppingSettingsAutofillScreen[i];
                default:
                    return new ShoppingSettingsScreen[i];
            }
        }
    }

    public RedactedString(String str) {
        this.value = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RedactedString) && Intrinsics.areEqual(this.value, ((RedactedString) obj).value);
    }

    @Override // com.squareup.cash.screens.Redacted
    public final Object getValue() {
        return this.value;
    }

    public final int hashCode() {
        String str = this.value;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }
}
