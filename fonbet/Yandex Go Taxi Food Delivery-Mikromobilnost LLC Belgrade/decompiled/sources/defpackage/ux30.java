package defpackage;

import ru.yandex.taxi.masstransit.router.MtRoutesModalBackPressHelper$BackPressAction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ux30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtRoutesModalBackPressHelper$BackPressAction.values().length];
        try {
            iArr[MtRoutesModalBackPressHelper$BackPressAction.Collapse.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtRoutesModalBackPressHelper$BackPressAction.GoBack.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
