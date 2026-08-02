package app.cash.local.db;

import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Local_tab_content {
    public final GetNeighborhoodsTabContentResponse response;

    /* loaded from: classes.dex */
    public final class Adapter {
        public final WireAdapter responseAdapter;

        public /* synthetic */ Adapter(WireAdapter wireAdapter) {
            this.responseAdapter = wireAdapter;
        }
    }

    public Local_tab_content(GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse) {
        this.response = getNeighborhoodsTabContentResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Local_tab_content) && Intrinsics.areEqual(this.response, ((Local_tab_content) obj).response);
    }

    public final int hashCode() {
        GetNeighborhoodsTabContentResponse getNeighborhoodsTabContentResponse = this.response;
        if (getNeighborhoodsTabContentResponse == null) {
            return 0;
        }
        return getNeighborhoodsTabContentResponse.hashCode();
    }

    public final String toString() {
        return "Local_tab_content(response=" + this.response + ")";
    }
}
