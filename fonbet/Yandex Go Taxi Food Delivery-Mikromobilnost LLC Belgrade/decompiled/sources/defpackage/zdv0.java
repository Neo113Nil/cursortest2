package defpackage;

import com.yandex.go.zone.dto.objects.SummaryCardPromo;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class zdv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SummaryCardPromo.Type.values().length];
        try {
            iArr[SummaryCardPromo.Type.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryCardPromo.Type.PROMINENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
