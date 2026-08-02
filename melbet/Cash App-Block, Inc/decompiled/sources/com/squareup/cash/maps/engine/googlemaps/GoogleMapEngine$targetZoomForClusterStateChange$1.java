package com.squareup.cash.maps.engine.googlemaps;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class GoogleMapEngine$targetZoomForClusterStateChange$1 extends FunctionReferenceImpl implements Function1 {
    public static final GoogleMapEngine$targetZoomForClusterStateChange$1 INSTANCE = new GoogleMapEngine$targetZoomForClusterStateChange$1(1, Integer.TYPE, "toFloat", "floatValue()F", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Float.valueOf(((Number) obj).intValue());
    }
}
