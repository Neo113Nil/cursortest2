package defpackage;

import com.yandex.mob.api.model.MobEnvironment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class wn20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MobEnvironment.values().length];
        try {
            iArr[MobEnvironment.PROD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MobEnvironment.TESTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
