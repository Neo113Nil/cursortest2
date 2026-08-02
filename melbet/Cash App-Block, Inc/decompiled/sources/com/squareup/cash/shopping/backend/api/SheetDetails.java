package com.squareup.cash.shopping.backend.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.cash.cashsuggest.api.HorizontalAlignment;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.ui.Image;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SheetDetails {
    public final Button actionButton;
    public final Avatar avatar;
    public final List bullets;
    public final ShopInfoResponse.DisplayCriteria displayCriteria;
    public final String errorMessage;
    public final Text footer;
    public final Integer imageHeight;
    public final HorizontalAlignment imageHorizontalAlignment;
    public final Image picture;
    public final Text subtitle;
    public final Text title;

    public SheetDetails(Image image, Avatar avatar, Text text, Text text2, List list, Button button, Text text3, String str, Integer num, HorizontalAlignment horizontalAlignment, ShopInfoResponse.DisplayCriteria displayCriteria, int i) {
        image = (i & 1) != 0 ? null : image;
        avatar = (i & 2) != 0 ? null : avatar;
        text = (i & 4) != 0 ? null : text;
        text2 = (i & 8) != 0 ? null : text2;
        list = (i & 16) != 0 ? EmptyList.INSTANCE : list;
        button = (i & 32) != 0 ? null : button;
        text3 = (i & 64) != 0 ? null : text3;
        str = (i & 128) != 0 ? null : str;
        num = (i & 256) != 0 ? null : num;
        horizontalAlignment = (i & 512) != 0 ? null : horizontalAlignment;
        displayCriteria = (i & 1024) != 0 ? null : displayCriteria;
        list.getClass();
        this.picture = image;
        this.avatar = avatar;
        this.title = text;
        this.subtitle = text2;
        this.bullets = list;
        this.actionButton = button;
        this.footer = text3;
        this.errorMessage = str;
        this.imageHeight = num;
        this.imageHorizontalAlignment = horizontalAlignment;
        this.displayCriteria = displayCriteria;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SheetDetails)) {
            return false;
        }
        SheetDetails sheetDetails = (SheetDetails) obj;
        return Intrinsics.areEqual(this.picture, sheetDetails.picture) && Intrinsics.areEqual(this.avatar, sheetDetails.avatar) && Intrinsics.areEqual(this.title, sheetDetails.title) && Intrinsics.areEqual(this.subtitle, sheetDetails.subtitle) && this.bullets.equals(sheetDetails.bullets) && Intrinsics.areEqual(this.actionButton, sheetDetails.actionButton) && Intrinsics.areEqual(this.footer, sheetDetails.footer) && Intrinsics.areEqual(this.errorMessage, sheetDetails.errorMessage) && Intrinsics.areEqual(this.imageHeight, sheetDetails.imageHeight) && this.imageHorizontalAlignment == sheetDetails.imageHorizontalAlignment && this.displayCriteria == sheetDetails.displayCriteria;
    }

    public final int hashCode() {
        Image image = this.picture;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        Avatar avatar = this.avatar;
        int hashCode2 = (hashCode + (avatar == null ? 0 : avatar.hashCode())) * 31;
        Text text = this.title;
        int hashCode3 = (hashCode2 + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.subtitle;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (text2 == null ? 0 : text2.hashCode())) * 31, 31, this.bullets);
        Button button = this.actionButton;
        int hashCode4 = (m + (button == null ? 0 : button.hashCode())) * 31;
        Text text3 = this.footer;
        int hashCode5 = (hashCode4 + (text3 == null ? 0 : text3.hashCode())) * 31;
        String str = this.errorMessage;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.imageHeight;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        HorizontalAlignment horizontalAlignment = this.imageHorizontalAlignment;
        int hashCode8 = (hashCode7 + (horizontalAlignment == null ? 0 : horizontalAlignment.hashCode())) * 31;
        ShopInfoResponse.DisplayCriteria displayCriteria = this.displayCriteria;
        return hashCode8 + (displayCriteria != null ? displayCriteria.hashCode() : 0);
    }

    public final String toString() {
        return "SheetDetails(picture=" + this.picture + ", avatar=" + this.avatar + ", title=" + this.title + ", subtitle=" + this.subtitle + ", bullets=" + this.bullets + ", actionButton=" + this.actionButton + ", footer=" + this.footer + ", errorMessage=" + this.errorMessage + ", imageHeight=" + this.imageHeight + ", imageHorizontalAlignment=" + this.imageHorizontalAlignment + ", displayCriteria=" + this.displayCriteria + ")";
    }
}
