package Q5;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class g {
    private final BigDecimal amount;
    private final String iso;
    private final String sku;

    public g(String sku, String iso, BigDecimal amount) {
        kotlin.jvm.internal.h.e(sku, "sku");
        kotlin.jvm.internal.h.e(iso, "iso");
        kotlin.jvm.internal.h.e(amount, "amount");
        this.sku = sku;
        this.iso = iso;
        this.amount = amount;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getIso() {
        return this.iso;
    }

    public final String getSku() {
        return this.sku;
    }
}
