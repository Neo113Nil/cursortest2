package defpackage;

import com.yandex.go.safety.center.api.AccidentsResponse;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class qtl0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AccidentsResponse.Status.values().length];
        try {
            iArr[AccidentsResponse.Status.QUESTIONABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
