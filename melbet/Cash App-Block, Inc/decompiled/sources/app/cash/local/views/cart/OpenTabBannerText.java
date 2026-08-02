package app.cash.local.views.cart;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OpenTabBannerText {
    public final String body;
    public final String title;

    public OpenTabBannerText(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.body = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenTabBannerText)) {
            return false;
        }
        OpenTabBannerText openTabBannerText = (OpenTabBannerText) obj;
        return Intrinsics.areEqual(this.title, openTabBannerText.title) && Intrinsics.areEqual(this.body, openTabBannerText.body);
    }

    public final int hashCode() {
        return this.body.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("OpenTabBannerText(title=", this.title, ", body=", this.body, ")");
    }
}
