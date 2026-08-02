package defpackage;

import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsResponse;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class wnm0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScheduledOrderCalculationsResponse.CalculationsStatusDto.values().length];
        try {
            iArr[ScheduledOrderCalculationsResponse.CalculationsStatusDto.FINISHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScheduledOrderCalculationsResponse.CalculationsStatusDto.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ScheduledOrderCalculationsResponse.SlotType.values().length];
        try {
            iArr2[ScheduledOrderCalculationsResponse.SlotType.ONDEMAND.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ScheduledOrderCalculationsResponse.SlotType.ASAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScheduledOrderCalculationsResponse.SlotType.REGULAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
