package com.google.common.base;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class Functions$ConstantFunction implements Function, Serializable {
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return null;
    }

    @Override // com.google.common.base.Function
    public final boolean equals(Object obj) {
        return obj instanceof Functions$ConstantFunction;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Functions.constant(null)";
    }
}
