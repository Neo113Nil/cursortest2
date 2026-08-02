package defpackage;

import com.yandex.go.taxi.order.models.api.OrderScreenUtils$OrderScreenType;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class u580 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[OrderScreenUtils$OrderScreenType.values().length];
        try {
            iArr[OrderScreenUtils$OrderScreenType.TAXI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderScreenUtils$OrderScreenType.FEED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[DriveState.values().length];
        try {
            iArr2[DriveState.SCHEDULED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DriveState.SCHEDULING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DriveState.CHECK_IN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DriveState.PREORDER.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DriveState.SEARCH.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DriveState.DRIVING.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DriveState.WAITING.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[DriveState.TRANSPORTING.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[DriveState.COMPLETE.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr2;
    }
}
