package defpackage;

import com.yandex.go.payments.api.acceptance.AcceptancePaymentOrderContext;

/* loaded from: classes13.dex */
public final class sd {
    public pzt0 a;
    public final String b;
    public boolean c;
    public final String d;
    public AcceptancePaymentOrderContext e;

    public sd(String str, String str2, AcceptancePaymentOrderContext acceptancePaymentOrderContext, int i) {
        str = (i & 2) != 0 ? "" : str;
        str2 = (i & 8) != 0 ? "" : str2;
        acceptancePaymentOrderContext = (i & 16) != 0 ? AcceptancePaymentOrderContext.TRANSPORTING : acceptancePaymentOrderContext;
        this.a = null;
        this.b = str;
        this.c = false;
        this.d = str2;
        this.e = acceptancePaymentOrderContext;
    }

    public sd() {
        this(null, null, null, 31);
    }
}
