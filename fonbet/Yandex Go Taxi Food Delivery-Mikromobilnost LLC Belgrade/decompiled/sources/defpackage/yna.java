package defpackage;

import com.yandex.go.chargers.qr.api.ChargersQrOpenReason;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class yna {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersQrOpenReason.values().length];
        try {
            iArr[ChargersQrOpenReason.DISCOVERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersQrOpenReason.STATION_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersQrOpenReason.RETURN_CHARGER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChargersQrOpenReason.ACTIVE_ORDER_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
