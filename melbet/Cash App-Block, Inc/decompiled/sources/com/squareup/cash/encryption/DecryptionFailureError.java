package com.squareup.cash.encryption;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/encryption/DecryptionFailureError;", "Lcom/squareup/cash/observability/types/ReportedError;", "encryption"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DecryptionFailureError extends ReportedError {
    public final Exception cause;
    public final String decryptionTool;
    public final String encryptionTool;
    public final Set features;
    public final String groupingDescriptor;
    public final String message;

    public DecryptionFailureError(Exception exc, String str, String str2, String str3) {
        this.cause = exc;
        this.encryptionTool = str;
        this.decryptionTool = str2;
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Client sync decryption of ", str3, " failed.");
        this.message = m;
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Encryption.INSTANCE);
        this.groupingDescriptor = m;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getGroupingDescriptor() {
        return this.groupingDescriptor;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return BalanceFeedKt$$ExternalSyntheticOutline0.m("Encryption Tools", MapsKt__MapsKt.mapOf(new Pair("encryption_tool", this.encryptionTool), new Pair("decryption_tool", this.decryptionTool)));
    }
}
