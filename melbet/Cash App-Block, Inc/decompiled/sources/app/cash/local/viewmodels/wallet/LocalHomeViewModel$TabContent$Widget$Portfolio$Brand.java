package app.cash.local.viewmodels.wallet;

import app.cash.local.primitives.BrandSpot;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalHomeViewModel$TabContent$Widget$Portfolio$Brand {
    public final LocalColor backgroundColor;
    public final BrandSpot brandSpot;
    public final LocalImage image;
    public final String name;

    public LocalHomeViewModel$TabContent$Widget$Portfolio$Brand(BrandSpot brandSpot, String str, LocalImage localImage, LocalColor localColor) {
        brandSpot.getClass();
        this.brandSpot = brandSpot;
        this.name = str;
        this.image = localImage;
        this.backgroundColor = localColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalHomeViewModel$TabContent$Widget$Portfolio$Brand)) {
            return false;
        }
        LocalHomeViewModel$TabContent$Widget$Portfolio$Brand localHomeViewModel$TabContent$Widget$Portfolio$Brand = (LocalHomeViewModel$TabContent$Widget$Portfolio$Brand) obj;
        return Intrinsics.areEqual(this.brandSpot, localHomeViewModel$TabContent$Widget$Portfolio$Brand.brandSpot) && this.name.equals(localHomeViewModel$TabContent$Widget$Portfolio$Brand.name) && Intrinsics.areEqual(this.image, localHomeViewModel$TabContent$Widget$Portfolio$Brand.image) && Intrinsics.areEqual(this.backgroundColor, localHomeViewModel$TabContent$Widget$Portfolio$Brand.backgroundColor);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.brandSpot.hashCode() * 31, 31, this.name);
        LocalImage localImage = this.image;
        int hashCode = (m + (localImage == null ? 0 : localImage.hashCode())) * 31;
        LocalColor localColor = this.backgroundColor;
        return hashCode + (localColor != null ? localColor.hashCode() : 0);
    }

    public final String toString() {
        return "Brand(brandSpot=" + this.brandSpot + ", name=" + this.name + ", image=" + this.image + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
