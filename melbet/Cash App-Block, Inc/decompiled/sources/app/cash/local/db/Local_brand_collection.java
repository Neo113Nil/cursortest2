package app.cash.local.db;

import com.squareup.protos.cash.local.client.v1.GetBrandCollectionResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Local_brand_collection {
    public final GetBrandCollectionResponse response;

    public Local_brand_collection(GetBrandCollectionResponse getBrandCollectionResponse) {
        this.response = getBrandCollectionResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Local_brand_collection) && Intrinsics.areEqual(this.response, ((Local_brand_collection) obj).response);
    }

    public final int hashCode() {
        GetBrandCollectionResponse getBrandCollectionResponse = this.response;
        if (getBrandCollectionResponse == null) {
            return 0;
        }
        return getBrandCollectionResponse.hashCode();
    }

    public final String toString() {
        return "Local_brand_collection(response=" + this.response + ")";
    }
}
