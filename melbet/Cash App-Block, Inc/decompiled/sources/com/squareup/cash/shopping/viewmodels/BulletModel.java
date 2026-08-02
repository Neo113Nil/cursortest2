package com.squareup.cash.shopping.viewmodels;

import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BulletModel {
    public final Text body;
    public final BulletImage icon;
    public final Text title;

    public BulletModel(BulletImage bulletImage, Text text, Text text2) {
        this.icon = bulletImage;
        this.title = text;
        this.body = text2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletModel)) {
            return false;
        }
        BulletModel bulletModel = (BulletModel) obj;
        return Intrinsics.areEqual(this.icon, bulletModel.icon) && this.title.equals(bulletModel.title) && this.body.equals(bulletModel.body);
    }

    public final int hashCode() {
        BulletImage bulletImage = this.icon;
        int hashCode = bulletImage == null ? 0 : bulletImage.hashCode();
        return this.body.hashCode() + ((this.title.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "BulletModel(icon=" + this.icon + ", title=" + this.title + ", body=" + this.body + ")";
    }
}
