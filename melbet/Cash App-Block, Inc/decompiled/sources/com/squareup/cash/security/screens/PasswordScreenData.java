package com.squareup.cash.security.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.screens.BoostDetailsScreen;
import com.squareup.protos.franklin.api.BlockerAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PasswordScreenData implements Parcelable {
    public static final Parcelable.Creator<PasswordScreenData> CREATOR = new BoostDetailsScreen.Creator(17);
    public final String detailText;
    public final String headerText;
    public final BlockerAction helpAction;
    public final Boolean hidePasswordCheckbox;
    public final String passwordPlaceholder;

    public PasswordScreenData(String str, String str2, String str3, BlockerAction blockerAction, Boolean bool) {
        this.headerText = str;
        this.detailText = str2;
        this.passwordPlaceholder = str3;
        this.helpAction = blockerAction;
        this.hidePasswordCheckbox = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordScreenData)) {
            return false;
        }
        PasswordScreenData passwordScreenData = (PasswordScreenData) obj;
        return Intrinsics.areEqual(this.headerText, passwordScreenData.headerText) && Intrinsics.areEqual(this.detailText, passwordScreenData.detailText) && Intrinsics.areEqual(this.passwordPlaceholder, passwordScreenData.passwordPlaceholder) && Intrinsics.areEqual(this.helpAction, passwordScreenData.helpAction) && Intrinsics.areEqual(this.hidePasswordCheckbox, passwordScreenData.hidePasswordCheckbox);
    }

    public final int hashCode() {
        String str = this.headerText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.detailText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.passwordPlaceholder;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BlockerAction blockerAction = this.helpAction;
        int hashCode4 = (hashCode3 + (blockerAction == null ? 0 : blockerAction.hashCode())) * 31;
        Boolean bool = this.hidePasswordCheckbox;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PasswordScreenData(headerText=", this.headerText, ", detailText=", this.detailText, ", passwordPlaceholder=");
        m.append(this.passwordPlaceholder);
        m.append(", helpAction=");
        m.append(this.helpAction);
        m.append(", hidePasswordCheckbox=");
        return Thread$State$EnumUnboxingLocalUtility.m(m, this.hidePasswordCheckbox, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.headerText);
        parcel.writeString(this.detailText);
        parcel.writeString(this.passwordPlaceholder);
        parcel.writeParcelable(this.helpAction, i);
        Boolean bool = this.hidePasswordCheckbox;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
    }

    public /* synthetic */ PasswordScreenData(String str, String str2, String str3, BlockerAction blockerAction) {
        this(str, str2, str3, blockerAction, null);
    }
}
