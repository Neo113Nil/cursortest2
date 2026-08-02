package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.payments.viewmodels.Size;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* loaded from: classes6.dex */
public final class Text implements Parcelable, Element {
    public static final Parcelable.Creator<Text> CREATOR = new Size.Creator(25);
    public final float fontSize;
    public final boolean hasFocus;
    public final int id;
    public final boolean isNote;
    public final ListProperty properties;
    public final String value;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text(ListProperty listProperty, float f, boolean z, boolean z2, String str, int i) {
        this(Random.defaultRandom.nextInt(), listProperty, f, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, str);
        Random.Default.getClass();
    }

    public static Text copy$default(Text text, boolean z, String str, int i) {
        int i2 = text.id;
        ListProperty listProperty = text.properties;
        float f = text.fontSize;
        if ((i & 8) != 0) {
            z = text.hasFocus;
        }
        boolean z2 = z;
        boolean z3 = text.isNote;
        if ((i & 32) != 0) {
            str = text.value;
        }
        String str2 = str;
        listProperty.getClass();
        str2.getClass();
        return new Text(i2, listProperty, f, z2, z3, str2);
    }

    @Override // com.squareup.cash.payments.viewmodels.Element
    public final boolean canZoom(float f) {
        return f <= 4.0f;
    }

    @Override // com.squareup.cash.payments.viewmodels.Element
    public final Element copy(ListProperty listProperty) {
        return new Text(this.id, listProperty, this.fontSize, this.hasFocus, this.isNote, this.value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text)) {
            return false;
        }
        Text text = (Text) obj;
        return this.id == text.id && Intrinsics.areEqual(this.properties, text.properties) && Float.compare(this.fontSize, text.fontSize) == 0 && this.hasFocus == text.hasFocus && this.isNote == text.isNote && Intrinsics.areEqual(this.value, text.value);
    }

    @Override // com.squareup.cash.payments.viewmodels.Element
    public final int getId() {
        return this.id;
    }

    @Override // com.squareup.cash.payments.viewmodels.Element
    public final ListProperty getProperties() {
        return this.properties;
    }

    public final int hashCode() {
        return this.value.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.fontSize, (this.properties.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31), 31, this.hasFocus), 31, this.isNote);
    }

    public final String toString() {
        return "Text(id=" + this.id + ", properties=" + this.properties + ", fontSize=" + this.fontSize + ", hasFocus=" + this.hasFocus + ", isNote=" + this.isNote + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.id);
        this.properties.writeToParcel(parcel, i);
        parcel.writeFloat(this.fontSize);
        parcel.writeInt(this.hasFocus ? 1 : 0);
        parcel.writeInt(this.isNote ? 1 : 0);
        parcel.writeString(this.value);
    }

    public Text(int i, ListProperty listProperty, float f, boolean z, boolean z2, String str) {
        listProperty.getClass();
        str.getClass();
        this.id = i;
        this.properties = listProperty;
        this.fontSize = f;
        this.hasFocus = z;
        this.isNote = z2;
        this.value = str;
    }
}
