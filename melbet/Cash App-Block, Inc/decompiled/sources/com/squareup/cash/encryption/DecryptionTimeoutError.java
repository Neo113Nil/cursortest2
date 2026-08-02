package com.squareup.cash.encryption;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/encryption/DecryptionTimeoutError;", "Lcom/squareup/cash/observability/types/ReportedError;", "encryption"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DecryptionTimeoutError extends ReportedError {
    public final TimeoutException cause;
    public final byte[] cipherData;
    public final double elapsedMillis;
    public final Set features;
    public final String groupingDescriptor;
    public final String message;

    public DecryptionTimeoutError(byte[] bArr, double d, String str) {
        this.cipherData = bArr;
        this.elapsedMillis = d;
        String concat = "Decryption timeout with ".concat(str);
        this.message = concat;
        this.cause = new TimeoutException(NavAction$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Decrypting ", bArr.length, str, " of size ", " bytes took "), d, " ms."));
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Encryption.INSTANCE);
        this.groupingDescriptor = concat;
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
        return BalanceFeedKt$$ExternalSyntheticOutline0.m("Timeout Failure Data", MapsKt__MapsKt.mapOf(new Pair("byte size", Integer.valueOf(this.cipherData.length)), new Pair("duration milliseconds", Double.valueOf(this.elapsedMillis))));
    }
}
