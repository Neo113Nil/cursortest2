package defpackage;

import ru.yandex.taxi.plus.design.gradient.delegate.CashbackRenderType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class tfd {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CashbackRenderType.values().length];
        try {
            iArr[CashbackRenderType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CashbackRenderType.BADGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
