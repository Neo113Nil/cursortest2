package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0956i1 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V0 fromModel(LocationFilter locationFilter) {
        V0 v0 = new V0();
        v0.a = locationFilter.getUpdateTimeInterval();
        v0.b = locationFilter.getUpdateDistanceInterval();
        return v0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        V0 v0 = (V0) obj;
        return new LocationFilter(v0.a, v0.b);
    }

    public final LocationFilter a(V0 v0) {
        return new LocationFilter(v0.a, v0.b);
    }
}
