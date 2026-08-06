package io.appmetrica.analytics.coreapi.internal.control;

/* loaded from: classes.dex */
public interface DataSendingRestrictionController {
    boolean isRestrictedForMainReporter();

    boolean isRestrictedForReporter(String str);

    boolean isRestrictedForSdk();
}
