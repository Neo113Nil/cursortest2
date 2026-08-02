package app.cash.local.primitives;

import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class FulfillmentConfigurationsKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalFulfillment.SchedulingDetails.SchedulingMode.values().length];
            try {
                iArr[LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_ASAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FulfillmentConfiguration getCurrentConfiguration(FulfillmentConfigurations fulfillmentConfigurations) {
        fulfillmentConfigurations.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[fulfillmentConfigurations.currentSchedulingMode.ordinal()];
        if (i == 1 || i == 2) {
            return fulfillmentConfigurations.asap;
        }
        if (i == 3) {
            return fulfillmentConfigurations.scheduled;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
