package defpackage;

import com.yandex.go.taxi.order.api.change.source.interactor.SourcePointChangeReason;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class vg9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SourcePointChangeReason.values().length];
        try {
            iArr[SourcePointChangeReason.MANUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SourcePointChangeReason.ALTPIN_SUGGEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
