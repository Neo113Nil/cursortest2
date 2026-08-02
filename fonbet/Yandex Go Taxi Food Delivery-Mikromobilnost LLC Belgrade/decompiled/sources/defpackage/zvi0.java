package defpackage;

import com.yandex.mob.model.MobRemoteNotificationCommand;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class zvi0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MobRemoteNotificationCommand.values().length];
        try {
            iArr[MobRemoteNotificationCommand.AddToConfig.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
