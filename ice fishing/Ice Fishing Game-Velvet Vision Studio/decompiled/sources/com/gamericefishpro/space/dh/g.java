package com.gamericefishpro.space.dh;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.fc.i {
    public g() {
        super(null, null, 3, null);
    }

    private final void setAmount(BigDecimal bigDecimal) {
        com.gamericefishpro.space.fc.i.setBigDecimalProperty$default(this, "amount", bigDecimal, null, false, 12, null);
    }

    private final void setIso(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "iso", str, null, false, 12, null);
    }

    private final void setSku(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "sku", str, null, false, 12, null);
    }

    public final BigDecimal getAmount() {
        return com.gamericefishpro.space.fc.i.getBigDecimalProperty$default(this, "amount", null, 2, null);
    }

    public final String getIso() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "iso", null, 2, null);
    }

    public final String getSku() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "sku", null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String sku, String iso, BigDecimal amount) {
        this();
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(iso, "iso");
        Intrinsics.checkNotNullParameter(amount, "amount");
        setSku(sku);
        setIso(iso);
        setAmount(amount);
    }
}
