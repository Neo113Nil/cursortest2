package com.squareup.cash.payments.viewmodels;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class HeaderAvatar {
    public final Character monogram;
    public final Color monogramBackgroundColor;
    public final String name;
    public final Image photoImage;
    public final Recipient recipient;

    public HeaderAvatar(Recipient recipient, String str, Character ch, Color color, Image image) {
        recipient.getClass();
        str.getClass();
        this.recipient = recipient;
        this.name = str;
        this.monogram = ch;
        this.monogramBackgroundColor = color;
        this.photoImage = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderAvatar)) {
            return false;
        }
        HeaderAvatar headerAvatar = (HeaderAvatar) obj;
        return Intrinsics.areEqual(this.recipient, headerAvatar.recipient) && Intrinsics.areEqual(this.name, headerAvatar.name) && Intrinsics.areEqual(this.monogram, headerAvatar.monogram) && this.monogramBackgroundColor.equals(headerAvatar.monogramBackgroundColor) && Intrinsics.areEqual(this.photoImage, headerAvatar.photoImage);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.recipient.hashCode() * 31, 31, this.name);
        Character ch = this.monogram;
        int m2 = SVG$Unit$EnumUnboxingLocalUtility.m(this.monogramBackgroundColor, (m + (ch == null ? 0 : ch.hashCode())) * 31, 31);
        Image image = this.photoImage;
        return m2 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        return "HeaderAvatar(recipient=" + this.recipient + ", name=" + this.name + ", monogram=" + this.monogram + ", monogramBackgroundColor=" + this.monogramBackgroundColor + ", photoImage=" + this.photoImage + ")";
    }
}
