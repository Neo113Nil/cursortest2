package com.squareup.cash.gps.db;

import com.squareup.protos.cash.compass.api.GpsConsentStatus;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class GpsConfigQueries$selectAll$2 extends FunctionReferenceImpl implements Function3 {
    public static final GpsConfigQueries$selectAll$2 INSTANCE = new GpsConfigQueries$selectAll$2(3, GpsConfig.class, "<init>", "<init>(Lcom/squareup/protos/cash/compass/api/GpsConsentStatus;Ljava/lang/Boolean;J)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new GpsConfig((GpsConsentStatus) obj, (Boolean) obj2, ((Number) obj3).longValue());
    }
}
