package androidx.versionedparcelable;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class CosmicForgeFactoryValidationEMJkbvMx5Bvfhe0D2e83375604931887 {
    public static final ReentrantLock ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = new ReentrantLock();
    public static CosmicForgeFactoryValidationEMJkbvMx5Bvfhe0D2e83375604931887 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final SharedPreferences AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final ReentrantLock ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new ReentrantLock();

    public CosmicForgeFactoryValidationEMJkbvMx5Bvfhe0D2e83375604931887(Context context) {
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(String str) {
        ReentrantLock reentrantLock = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        reentrantLock.lock();
        try {
            return this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
