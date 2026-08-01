package h0;

import androidx.lifecycle.EnumC0096m;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3247a;

    static {
        int[] iArr = new int[EnumC0096m.values().length];
        try {
            iArr[EnumC0096m.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0096m.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0096m.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0096m.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f3247a = iArr;
    }
}
