package com.gamericefishpro.space.i9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y7 implements x7 {
    public static final k4 a;
    public static final k4 b;
    public static final k4 c;

    static {
        com.gamericefishpro.space.b4.f fVar = new com.gamericefishpro.space.b4.f(j4.a(), true, true);
        fVar.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = fVar.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = fVar.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = fVar.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
