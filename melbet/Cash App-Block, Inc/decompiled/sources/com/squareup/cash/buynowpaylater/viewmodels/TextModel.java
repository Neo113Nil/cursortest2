package com.squareup.cash.buynowpaylater.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.protos.cash.cashapproxy.api.SemanticColor;
import com.squareup.protos.cash.cashapproxy.api.TextStyle;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class TextModel implements Parcelable {
    public static final Parcelable.Creator<TextModel> CREATOR = new BorrowLimitHub.Creator(24);
    public final Alignment alignment;
    public final SemanticColor color;
    public final TextStyle style;
    public final String text;
    public final boolean useMarkdown;

    public TextModel(String str, TextStyle textStyle, Alignment alignment, SemanticColor semanticColor, boolean z) {
        textStyle.getClass();
        this.text = str;
        this.style = textStyle;
        this.alignment = alignment;
        this.color = semanticColor;
        this.useMarkdown = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextModel)) {
            return false;
        }
        TextModel textModel = (TextModel) obj;
        return Intrinsics.areEqual(this.text, textModel.text) && this.style == textModel.style && this.alignment == textModel.alignment && this.color == textModel.color && this.useMarkdown == textModel.useMarkdown;
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (this.style.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Alignment alignment = this.alignment;
        int hashCode2 = (hashCode + (alignment == null ? 0 : alignment.hashCode())) * 31;
        SemanticColor semanticColor = this.color;
        return Boolean.hashCode(this.useMarkdown) + ((hashCode2 + (semanticColor != null ? semanticColor.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextModel(text=");
        sb.append(this.text);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", alignment=");
        sb.append(this.alignment);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", useMarkdown=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.useMarkdown, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.text);
        parcel.writeString(this.style.name());
        Alignment alignment = this.alignment;
        if (alignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(alignment.name());
        }
        SemanticColor semanticColor = this.color;
        if (semanticColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(semanticColor.name());
        }
        parcel.writeInt(this.useMarkdown ? 1 : 0);
    }
}
