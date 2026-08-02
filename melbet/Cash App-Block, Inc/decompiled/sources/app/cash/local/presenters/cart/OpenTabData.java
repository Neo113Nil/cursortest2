package app.cash.local.presenters.cart;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OpenTabData {
    public final String bannerBody;
    public final List images;
    public final int latestRoundItemCount;
    public final int totalItemCount;

    public OpenTabData(String str, int i, int i2, List list) {
        list.getClass();
        this.latestRoundItemCount = i;
        this.totalItemCount = i2;
        this.bannerBody = str;
        this.images = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenTabData)) {
            return false;
        }
        OpenTabData openTabData = (OpenTabData) obj;
        return this.latestRoundItemCount == openTabData.latestRoundItemCount && this.totalItemCount == openTabData.totalItemCount && this.bannerBody.equals(openTabData.bannerBody) && Intrinsics.areEqual(this.images, openTabData.images);
    }

    public final int hashCode() {
        return this.images.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.totalItemCount, Integer.hashCode(this.latestRoundItemCount) * 31, 31), 31, this.bannerBody);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.latestRoundItemCount, this.totalItemCount, "OpenTabData(latestRoundItemCount=", ", totalItemCount=", ", bannerBody=");
        m107m.append(this.bannerBody);
        m107m.append(", images=");
        m107m.append(this.images);
        m107m.append(")");
        return m107m.toString();
    }
}
