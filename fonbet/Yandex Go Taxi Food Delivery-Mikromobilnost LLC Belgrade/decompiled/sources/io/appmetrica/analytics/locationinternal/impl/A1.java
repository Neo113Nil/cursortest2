package io.appmetrica.analytics.locationinternal.impl;

import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class A1 {
    public final List a;
    public final List b;

    public A1(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationSources(lastKnownLocationExtractorProviders=");
        sb.append(this.a);
        sb.append(", locationReceiversExtractorProviders=");
        return unr0.t(sb, this.b, ')');
    }
}
