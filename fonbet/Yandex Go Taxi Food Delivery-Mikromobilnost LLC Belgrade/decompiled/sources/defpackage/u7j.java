package defpackage;

import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class u7j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActionType.values().length];
        try {
            iArr[ActionType.WALK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionType.DRIVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionType.SHARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ActionType.COMMUNICATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ActionType.CALL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ActionType.DEAF_DRIVER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ActionType.HELP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ActionType.CHAT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ActionType.TRANSPORT_INFO.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
