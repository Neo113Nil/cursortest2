package defpackage;

import ru.yandex.taxi.requirements.ListItemType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class sij0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ListItemType.values().length];
        try {
            iArr[ListItemType.USUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ListItemType.TOGGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
