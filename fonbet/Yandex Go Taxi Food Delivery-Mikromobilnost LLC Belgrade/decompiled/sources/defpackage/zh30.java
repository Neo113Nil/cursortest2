package defpackage;

import ru.yandex.taxi.masstransit.router.MtHubLeadingItemKind;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class zh30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtHubLeadingItemKind.values().length];
        try {
            iArr[MtHubLeadingItemKind.TRANSPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtHubLeadingItemKind.PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
