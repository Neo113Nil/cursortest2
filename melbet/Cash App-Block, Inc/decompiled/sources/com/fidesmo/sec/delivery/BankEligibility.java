package com.fidesmo.sec.delivery;

import com.fidesmo.sec.core.CertificateKeySet;
import com.fidesmo.sec.core.CheckEligibilityClient;
import com.fidesmo.sec.core.EligibilityCheckRequest;
import com.fidesmo.sec.core.EligibilityResponse;
import com.fidesmo.sec.utils.Hex;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/fidesmo/sec/delivery/BankEligibility;", "", "()V", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BankEligibility {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0010\u0007\u001a\u0018\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bj\u0002`\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J:\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0010\u0007\u001a\u0018\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J<\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u001c\u0010\u0007\u001a\u0018\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0014"}, d2 = {"Lcom/fidesmo/sec/delivery/BankEligibility$Companion;", "", "()V", "buildRequest", "Lcom/fidesmo/sec/core/EligibilityCheckRequest;", "batchId", "", "userData", "", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "Lcom/fidesmo/sec/delivery/models/UserDataResponse;", "certificateKeySet", "Lcom/fidesmo/sec/core/CertificateKeySet;", "checkCardEligibility", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/fidesmo/sec/core/EligibilityResponse;", "client", "Lcom/fidesmo/sec/core/CheckEligibilityClient;", "checkEligibility", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EligibilityCheckRequest buildRequest(int batchId, Map<String, String> userData, CertificateKeySet certificateKeySet) {
            String kid = certificateKeySet.getKeys().get(0).getKid();
            EncryptedUserResponse encryptUserResponse = Encryption.encryptUserResponse(userData, Encryption.stringToPublicKey(certificateKeySet.getKeys().get(0).getX5c().get(0)));
            String encodeHex = Hex.encodeHex(encryptUserResponse.getKey());
            Map<String, String> response = encryptUserResponse.getResponse();
            if (response == null) {
                response = EmptyMap.INSTANCE;
                response.getClass();
            }
            String str = response.get(CollectionsKt.elementAt(response.keySet(), 0));
            if (str == null) {
                str = "";
            }
            encodeHex.getClass();
            return new EligibilityCheckRequest(kid, batchId, str, encodeHex);
        }

        public final Observable<EligibilityResponse> checkCardEligibility(final int batchId, final Map<String, String> userData, final CheckEligibilityClient client) {
            userData.getClass();
            client.getClass();
            return client.getCertificateKeySet("v2").flatMap(new Function() { // from class: com.fidesmo.sec.delivery.BankEligibility$Companion$checkCardEligibility$1
                @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                public final ObservableSource mo39apply(CertificateKeySet certificateKeySet) {
                    EligibilityCheckRequest buildRequest;
                    certificateKeySet.getClass();
                    buildRequest = BankEligibility.INSTANCE.buildRequest(batchId, userData, certificateKeySet);
                    return client.checkCardEligibility("v2", buildRequest);
                }
            });
        }

        @Deprecated
        public final Observable<EligibilityResponse> checkEligibility(final int batchId, final Map<String, String> userData, final CheckEligibilityClient client) {
            userData.getClass();
            client.getClass();
            return client.getCertificateKeySet("v1").flatMap(new Function() { // from class: com.fidesmo.sec.delivery.BankEligibility$Companion$checkEligibility$1
                @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                public final ObservableSource mo39apply(CertificateKeySet certificateKeySet) {
                    EligibilityCheckRequest buildRequest;
                    certificateKeySet.getClass();
                    buildRequest = BankEligibility.INSTANCE.buildRequest(batchId, userData, certificateKeySet);
                    return client.checkEligibility("v1", buildRequest);
                }
            });
        }

        private Companion() {
        }
    }
}
