package defpackage;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.RtmConfig;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes7.dex */
public final class xo2 implements IParamsCallback {
    public final /* synthetic */ Context a;
    public final /* synthetic */ IReporterYandex b;

    public xo2(Context context, IReporterYandex iReporterYandex) {
        this.a = context;
        this.b = iReporterYandex;
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onReceive(IParamsCallback.Result result) {
        String uuid = AppMetricaYandex.getUuid(this.a);
        String deviceId = AppMetricaYandex.getDeviceId(this.a);
        trp0 trp0Var = trp0.a;
        trp0.e = uuid;
        trp0.d = deviceId;
        if (uuid != null) {
            this.b.updateRtmConfig(RtmConfig.newBuilder().withUserId(String.valueOf(uuid.hashCode() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)).build());
        }
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onRequestError(IParamsCallback.Reason reason, IParamsCallback.Result result) {
    }
}
