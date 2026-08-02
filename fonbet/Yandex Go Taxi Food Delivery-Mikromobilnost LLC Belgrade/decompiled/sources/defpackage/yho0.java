package defpackage;

import com.yandex.go.scooters.photocontrol.api.ScootersExamType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class yho0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersExamType.values().length];
        try {
            iArr[ScootersExamType.SELFIE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersExamType.PASSPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
