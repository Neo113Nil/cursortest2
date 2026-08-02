package app.cash.local.presenters.brand.profile;

import app.cash.local.presenters.internal.FulfillmentTimeUtils;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
import java.time.DayOfWeek;

/* loaded from: classes3.dex */
public final class LocalBrandProfileContentFactory {
    public final AndroidClock clock;
    public final FulfillmentTimeUtils fulfillmentTimeUtils;
    public final AndroidStringManager stringManager;
    public final String versionName;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DayOfWeek.values().length];
            try {
                iArr[DayOfWeek.MONDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayOfWeek.TUESDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DayOfWeek.WEDNESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DayOfWeek.THURSDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DayOfWeek.FRIDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DayOfWeek.SATURDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DayOfWeek.SUNDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LocalOpenHours.HoursForDay.Day.values().length];
            try {
                iArr2[LocalOpenHours.HoursForDay.Day.DAY_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LocalOpenHours.HoursForDay.Day.DAY_MONDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[LocalOpenHours.HoursForDay.Day.DAY_TUESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[LocalOpenHours.HoursForDay.Day.DAY_WEDNESDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[LocalOpenHours.HoursForDay.Day.DAY_THURSDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[LocalOpenHours.HoursForDay.Day.DAY_FRIDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[LocalOpenHours.HoursForDay.Day.DAY_SATURDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[LocalOpenHours.HoursForDay.Day.DAY_SUNDAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[LocalFulfillmentType.values().length];
            try {
                iArr3[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DINE_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_SHIPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[LocalMenuAvailability.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                Origin.Companion companion = LocalMenuAvailability.Companion;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                Origin.Companion companion2 = LocalMenuAvailability.Companion;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public LocalBrandProfileContentFactory(AndroidStringManager androidStringManager, AndroidClock androidClock, FulfillmentTimeUtils fulfillmentTimeUtils, String str) {
        this.stringManager = androidStringManager;
        this.clock = androidClock;
        this.fulfillmentTimeUtils = fulfillmentTimeUtils;
        this.versionName = str;
    }
}
