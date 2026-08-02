package defpackage;

import ru.yandex.taxi.masstransit.ui.route.modal.expanded.adapter.Ellipse$Size;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class qhy {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Ellipse$Size.values().length];
        try {
            iArr[Ellipse$Size.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Ellipse$Size.BIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
