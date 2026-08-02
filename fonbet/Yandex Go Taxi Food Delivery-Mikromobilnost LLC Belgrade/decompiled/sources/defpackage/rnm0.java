package defpackage;

import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class rnm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScheduledOrderSeatsAvailableResponse.TimeSlotDto.TimeSlotTypeDto.values().length];
        try {
            iArr[ScheduledOrderSeatsAvailableResponse.TimeSlotDto.TimeSlotTypeDto.UNAVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScheduledOrderSeatsAvailableResponse.TimeSlotDto.TimeSlotTypeDto.AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScheduledOrderSeatsAvailableResponse.TimeSlotDto.TimeSlotTypeDto.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
