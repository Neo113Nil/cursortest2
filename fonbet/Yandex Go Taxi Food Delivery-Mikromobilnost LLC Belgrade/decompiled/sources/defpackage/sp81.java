package defpackage;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.a;
import kotlin.Result;

/* loaded from: classes7.dex */
public final class sp81 {
    public final a a;

    public sp81(a aVar) {
        this.a = aVar;
    }

    public final MediatedAdapterInfo a() {
        Object failure;
        try {
            failure = this.a.getAdapterInfo();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = new MediatedAdapterInfo.Builder().setAdapterVersion("null").setNetworkName("null").setNetworkSdkVersion("null").build();
        }
        return (MediatedAdapterInfo) failure;
    }
}
