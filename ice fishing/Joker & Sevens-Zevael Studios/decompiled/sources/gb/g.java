package gb;

import java.math.BigDecimal;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {
    private final BigDecimal amount;
    private final String iso;
    private final String sku;

    public g(String str, String str2, BigDecimal bigDecimal) {
        pc.j.e(str, "sku");
        pc.j.e(str2, "iso");
        pc.j.e(bigDecimal, "amount");
        this.sku = str;
        this.iso = str2;
        this.amount = bigDecimal;
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
