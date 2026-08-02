package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersSuperpassSection;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class uq9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersSuperpassSection.values().length];
        try {
            iArr[ChargersSuperpassSection.SUPERPASS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersSuperpassSection.ACTIVE_SUPERPASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
