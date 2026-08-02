package defpackage;

import com.yandex.delivery.mapper.model.SelectDestinationPolicy;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class xu8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SelectDestinationPolicy.values().length];
        try {
            iArr[SelectDestinationPolicy.SKIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectDestinationPolicy.REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectDestinationPolicy.SKIP_IF_PRESELECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
