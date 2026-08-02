package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersPassesSection;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class vko0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersPassesSection.values().length];
        try {
            iArr[ScootersPassesSection.SUPERPASS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersPassesSection.ACTIVE_SUPERPASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersPassesSection.PASSES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersPassesSection.ACTIVE_PASSES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
