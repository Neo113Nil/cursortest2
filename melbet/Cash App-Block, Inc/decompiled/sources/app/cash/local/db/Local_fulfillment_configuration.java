package app.cash.local.db;

import app.cash.sqldelight.EnumColumnAdapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Local_fulfillment_configuration {
    public final LocalFulfillment asap_fulfillment;
    public final String brand_token;
    public final LocalFulfillment.SchedulingDetails.SchedulingMode current_scheduling_mode;
    public final LocalMoney delivery_fee;
    public final String location_token;
    public final LocalFulfillment scheduled_fulfillment;

    /* renamed from: type, reason: collision with root package name */
    public final LocalFulfillmentType f910type;

    /* loaded from: classes.dex */
    public final class Adapter {
        public final WireAdapter asap_fulfillmentAdapter;
        public final EnumColumnAdapter current_scheduling_modeAdapter;
        public final WireAdapter delivery_feeAdapter;
        public final WireAdapter scheduled_fulfillmentAdapter;
        public final EnumColumnAdapter typeAdapter;

        public Adapter(EnumColumnAdapter enumColumnAdapter, EnumColumnAdapter enumColumnAdapter2, WireAdapter wireAdapter, WireAdapter wireAdapter2, WireAdapter wireAdapter3) {
            this.typeAdapter = enumColumnAdapter;
            this.current_scheduling_modeAdapter = enumColumnAdapter2;
            this.asap_fulfillmentAdapter = wireAdapter;
            this.scheduled_fulfillmentAdapter = wireAdapter2;
            this.delivery_feeAdapter = wireAdapter3;
        }
    }

    public Local_fulfillment_configuration(String str, LocalFulfillmentType localFulfillmentType, String str2, LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode, LocalFulfillment localFulfillment, LocalFulfillment localFulfillment2, LocalMoney localMoney) {
        str.getClass();
        localFulfillmentType.getClass();
        schedulingMode.getClass();
        this.brand_token = str;
        this.f910type = localFulfillmentType;
        this.location_token = str2;
        this.current_scheduling_mode = schedulingMode;
        this.asap_fulfillment = localFulfillment;
        this.scheduled_fulfillment = localFulfillment2;
        this.delivery_fee = localMoney;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Local_fulfillment_configuration)) {
            return false;
        }
        Local_fulfillment_configuration local_fulfillment_configuration = (Local_fulfillment_configuration) obj;
        return Intrinsics.areEqual(this.brand_token, local_fulfillment_configuration.brand_token) && this.f910type == local_fulfillment_configuration.f910type && Intrinsics.areEqual(this.location_token, local_fulfillment_configuration.location_token) && this.current_scheduling_mode == local_fulfillment_configuration.current_scheduling_mode && Intrinsics.areEqual(this.asap_fulfillment, local_fulfillment_configuration.asap_fulfillment) && Intrinsics.areEqual(this.scheduled_fulfillment, local_fulfillment_configuration.scheduled_fulfillment) && Intrinsics.areEqual(this.delivery_fee, local_fulfillment_configuration.delivery_fee);
    }

    public final int hashCode() {
        int hashCode = (this.f910type.hashCode() + (this.brand_token.hashCode() * 31)) * 31;
        String str = this.location_token;
        int hashCode2 = (this.current_scheduling_mode.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        LocalFulfillment localFulfillment = this.asap_fulfillment;
        int hashCode3 = (hashCode2 + (localFulfillment == null ? 0 : localFulfillment.hashCode())) * 31;
        LocalFulfillment localFulfillment2 = this.scheduled_fulfillment;
        int hashCode4 = (hashCode3 + (localFulfillment2 == null ? 0 : localFulfillment2.hashCode())) * 31;
        LocalMoney localMoney = this.delivery_fee;
        return hashCode4 + (localMoney != null ? localMoney.hashCode() : 0);
    }

    public final String toString() {
        return "Local_fulfillment_configuration(brand_token=" + this.brand_token + ", type=" + this.f910type + ", location_token=" + this.location_token + ", current_scheduling_mode=" + this.current_scheduling_mode + ", asap_fulfillment=" + this.asap_fulfillment + ", scheduled_fulfillment=" + this.scheduled_fulfillment + ", delivery_fee=" + this.delivery_fee + ")";
    }
}
