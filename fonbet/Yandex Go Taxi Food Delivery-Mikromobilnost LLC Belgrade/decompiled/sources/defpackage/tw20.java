package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubLeadingItemKind;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class tw20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HubLeadingItemKind.values().length];
        try {
            iArr[HubLeadingItemKind.PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HubLeadingItemKind.TRANSPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
