package com.gamericefishpro.space.i9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m7 implements l7 {
    public static final k4 a;
    public static final k4 b;

    static {
        com.gamericefishpro.space.b4.f fVar = new com.gamericefishpro.space.b4.f(j4.a(), true, true);
        fVar.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        fVar.d("measurement.set_default_event_parameters_with_backfill.service", true);
        fVar.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        a = fVar.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = fVar.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        fVar.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
