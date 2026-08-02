package defpackage;

import com.yandex.go.taxi.order.search.overlay.long_search_v2.domain.LongSearchV2Facade$HintType;
import com.yandex.go.taxi.order.search.overlay.long_search_v2.domain.LongSearchV2Facade$PollingTerminationEvent;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ymz {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[LongSearchV2Facade$PollingTerminationEvent.values().length];
        try {
            iArr[LongSearchV2Facade$PollingTerminationEvent.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LongSearchV2Facade$PollingTerminationEvent.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[LongSearchV2Facade$HintType.values().length];
        try {
            iArr2[LongSearchV2Facade$HintType.POLLING_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[LongSearchV2Facade$HintType.CAR_POLLING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[LongSearchV2Facade$HintType.CAR_BUSY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[LongSearchV2Facade$HintType.RADIUS_CHANGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
