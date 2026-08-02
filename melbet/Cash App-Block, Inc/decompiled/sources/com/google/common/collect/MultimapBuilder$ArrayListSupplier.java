package com.google.common.collect;

import coil3.size.DimensionKt;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class MultimapBuilder$ArrayListSupplier implements Supplier, Serializable {
    public final int expectedValuesPerKey;

    public MultimapBuilder$ArrayListSupplier() {
        DimensionKt.checkNonnegative(2, "expectedValuesPerKey");
        this.expectedValuesPerKey = 2;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return new ArrayList(this.expectedValuesPerKey);
    }
}
