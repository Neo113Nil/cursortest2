package com.bugsnag.android.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class TrimMetrics {
    public final int dataTrimmed;
    public final int itemsTrimmed;

    public TrimMetrics(int i, int i2) {
        this.itemsTrimmed = i;
        this.dataTrimmed = i2;
    }

    public final int component1() {
        return this.itemsTrimmed;
    }

    public final int component2() {
        return this.dataTrimmed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrimMetrics)) {
            return false;
        }
        TrimMetrics trimMetrics = (TrimMetrics) obj;
        return this.itemsTrimmed == trimMetrics.itemsTrimmed && this.dataTrimmed == trimMetrics.dataTrimmed;
    }

    public final int getDataTrimmed() {
        return this.dataTrimmed;
    }

    public final int getItemsTrimmed() {
        return this.itemsTrimmed;
    }

    public final int hashCode() {
        return Integer.hashCode(this.dataTrimmed) + (Integer.hashCode(this.itemsTrimmed) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrimMetrics(itemsTrimmed=");
        sb.append(this.itemsTrimmed);
        sb.append(", dataTrimmed=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.dataTrimmed, ')');
    }
}
