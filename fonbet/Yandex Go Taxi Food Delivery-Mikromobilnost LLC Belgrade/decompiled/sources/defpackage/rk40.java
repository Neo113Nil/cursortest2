package defpackage;

import ru.yandex.taxi.masstransit.router.ScheduleExitAction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class rk40 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScheduleExitAction.values().length];
        try {
            iArr[ScheduleExitAction.GoBack.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScheduleExitAction.OpenThreadVariants.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScheduleExitAction.OpenRoute.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
