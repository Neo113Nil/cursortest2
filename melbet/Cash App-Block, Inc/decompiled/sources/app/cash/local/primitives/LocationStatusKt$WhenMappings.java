package app.cash.local.primitives;

import com.squareup.protos.cash.local.client.v1.LocalOpenStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class LocationStatusKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[LocalOpenStatus.values().length];
        try {
            iArr[LocalOpenStatus.LOCAL_OPEN_STATUS_UNSPECIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LocalOpenStatus.LOCAL_OPEN_STATUS_CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LocalOpenStatus.LOCAL_OPEN_STATUS_OPEN_24_HOURS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LocalOpenStatus.LOCAL_OPEN_STATUS_HOURS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
