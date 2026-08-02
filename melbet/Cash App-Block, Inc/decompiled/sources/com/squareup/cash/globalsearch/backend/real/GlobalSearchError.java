package com.squareup.cash.globalsearch.backend.real;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/globalsearch/backend/real/GlobalSearchError;", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GlobalSearchError extends ReportedError {
    public final Set features;
    public final String message;
    public final Map metadata;

    public GlobalSearchError(String str, Map map, int i) {
        if ((i & 4) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        map.getClass();
        Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("", map));
        mapOf.getClass();
        this.message = str;
        this.metadata = mapOf;
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.GlobalSearch.INSTANCE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSearchError)) {
            return false;
        }
        GlobalSearchError globalSearchError = (GlobalSearchError) obj;
        return Intrinsics.areEqual(this.message, globalSearchError.message) && Intrinsics.areEqual(this.metadata, globalSearchError.metadata);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }

    public final int hashCode() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.message.hashCode() * 31, this.metadata, 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "GlobalSearchError(message=" + this.message + ", metadata=" + this.metadata + ", cause=null)";
    }
}
