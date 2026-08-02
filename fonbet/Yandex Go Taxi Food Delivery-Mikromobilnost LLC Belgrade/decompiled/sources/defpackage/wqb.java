package defpackage;

import ru.yandex.taxi.design.ChipsState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class wqb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChipsState.values().length];
        try {
            iArr[ChipsState.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChipsState.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
