package com.squareup.cash.shopping.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProductsResultsItem {
    public final String actionUrl;
    public final Text captionLeft;
    public final Text captionRight;
    public final long id;
    public final Metadata metadata;
    public final Image picture;
    public final long position;
    public final long sectionId;
    public final Text subtitle;
    public final Text title;

    public ProductsResultsItem(long j, long j2, long j3, Text text, Text text2, Text text3, Text text4, String str, Image image, Metadata metadata) {
        this.id = j;
        this.sectionId = j2;
        this.position = j3;
        this.title = text;
        this.subtitle = text2;
        this.captionLeft = text3;
        this.captionRight = text4;
        this.actionUrl = str;
        this.picture = image;
        this.metadata = metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsResultsItem)) {
            return false;
        }
        ProductsResultsItem productsResultsItem = (ProductsResultsItem) obj;
        return this.id == productsResultsItem.id && this.sectionId == productsResultsItem.sectionId && this.position == productsResultsItem.position && Intrinsics.areEqual(this.title, productsResultsItem.title) && Intrinsics.areEqual(this.subtitle, productsResultsItem.subtitle) && Intrinsics.areEqual(this.captionLeft, productsResultsItem.captionLeft) && Intrinsics.areEqual(this.captionRight, productsResultsItem.captionRight) && Intrinsics.areEqual(this.actionUrl, productsResultsItem.actionUrl) && Intrinsics.areEqual(this.picture, productsResultsItem.picture) && Intrinsics.areEqual(this.metadata, productsResultsItem.metadata);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.id) * 31, 31, this.sectionId), 31, this.position);
        Text text = this.title;
        int hashCode = (m + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.subtitle;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        Text text3 = this.captionLeft;
        int hashCode3 = (hashCode2 + (text3 == null ? 0 : text3.hashCode())) * 31;
        Text text4 = this.captionRight;
        int hashCode4 = (hashCode3 + (text4 == null ? 0 : text4.hashCode())) * 31;
        String str = this.actionUrl;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.picture;
        int hashCode6 = (hashCode5 + (image == null ? 0 : image.hashCode())) * 31;
        Metadata metadata = this.metadata;
        return hashCode6 + (metadata != null ? metadata.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.id, "ProductsResultsItem(id=", ", sectionId=");
        m1149m.append(this.sectionId);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.position, ", position=", ", title=", m1149m);
        m1149m.append(this.title);
        m1149m.append(", subtitle=");
        m1149m.append(this.subtitle);
        m1149m.append(", captionLeft=");
        m1149m.append(this.captionLeft);
        m1149m.append(", captionRight=");
        m1149m.append(this.captionRight);
        m1149m.append(", actionUrl=");
        m1149m.append(this.actionUrl);
        m1149m.append(", picture=");
        m1149m.append(this.picture);
        m1149m.append(", metadata=");
        m1149m.append(this.metadata);
        m1149m.append(")");
        return m1149m.toString();
    }
}
