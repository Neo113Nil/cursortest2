package defpackage;

import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuAuthStatus;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class zzn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersMosRuAuthStatus.values().length];
        try {
            iArr[ScootersMosRuAuthStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersMosRuAuthStatus.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersMosRuAuthStatus.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersMosRuAuthStatus.UNAUTHORIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
