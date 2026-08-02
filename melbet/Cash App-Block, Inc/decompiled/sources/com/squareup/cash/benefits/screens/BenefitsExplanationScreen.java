package com.squareup.cash.benefits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.appmessages.SheetAppMessage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BenefitsExplanationScreen implements BenefitsScreen {
    public static final Parcelable.Creator<BenefitsExplanationScreen> CREATOR = new SheetAppMessage.Creator(23);
    public final ArrayList content;
    public final List footer;
    public final String title;

    public BenefitsExplanationScreen(String str, ArrayList arrayList, List list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.content = arrayList;
        this.footer = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitsExplanationScreen)) {
            return false;
        }
        BenefitsExplanationScreen benefitsExplanationScreen = (BenefitsExplanationScreen) obj;
        return Intrinsics.areEqual(this.title, benefitsExplanationScreen.title) && this.content.equals(benefitsExplanationScreen.content) && Intrinsics.areEqual(this.footer, benefitsExplanationScreen.footer);
    }

    public final int hashCode() {
        return this.footer.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.content, this.title.hashCode() * 31, 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.content, "BenefitsExplanationScreen(title=", this.title, ", content=", ", footer="), this.footer, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.content, parcel);
        while (m.hasNext()) {
            parcel.writeSerializable((Serializable) m.next());
        }
        parcel.writeStringList(this.footer);
    }
}
