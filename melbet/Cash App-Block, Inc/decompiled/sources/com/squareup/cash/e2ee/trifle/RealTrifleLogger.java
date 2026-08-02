package com.squareup.cash.e2ee.trifle;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public final class RealTrifleLogger {
    public final RealObservabilityManager observabilityManager;

    public RealTrifleLogger(RealObservabilityManager realObservabilityManager) {
        this.observabilityManager = realObservabilityManager;
    }

    public final void logAction(TrifleAction trifleAction) {
        trifleAction.getClass();
        this.observabilityManager.addAction(new RealTrifleLogger$logAction$1(trifleAction));
    }

    public final TrifleError logError(TrifleError trifleError, Map map) {
        trifleError.getClass();
        String m = Recorder$$ExternalSyntheticOutline2.m("CashTrifleError: ", trifleError.getDescription());
        if (map == null) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        String simpleName = Reflection.factory.getOrCreateKotlinClass(trifleError.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = null;
        } else if (simpleName.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(simpleName.charAt(0));
            valueOf.getClass();
            String lowerCase = valueOf.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            sb.append((Object) lowerCase);
            sb.append(simpleName.substring(1));
            simpleName = sb.toString();
        }
        this.observabilityManager.reportError(m, trifleError, MapsKt__MapsKt.plus(map, MapsKt__MapsJVMKt.mapOf(new Pair("trifle_error_type", simpleName))));
        return trifleError;
    }
}
