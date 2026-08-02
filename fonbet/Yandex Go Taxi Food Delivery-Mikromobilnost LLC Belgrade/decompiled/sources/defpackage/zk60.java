package defpackage;

import com.yandex.mob.model.MobNotificationType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class zk60 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MobNotificationType.values().length];
        try {
            iArr[MobNotificationType.UpdateConfig.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MobNotificationType.AvailabilityReport.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MobNotificationType.DetailedReport.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
