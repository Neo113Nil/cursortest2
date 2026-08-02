package defpackage;

import com.yandex.go.places.models.ui.DiscoveryMainTab$TabType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class vsj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DiscoveryMainTab$TabType.values().length];
        try {
            iArr[DiscoveryMainTab$TabType.FLEX_TAB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiscoveryMainTab$TabType.NATIVE_TAB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
