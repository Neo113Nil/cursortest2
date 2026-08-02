package defpackage;

import android.content.Context;
import android.util.Log;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.ReporterYandexConfig;
import io.appmetrica.analytics.RtmConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class xb20 {
    public final rb20 a;
    public final whl0 b;
    public final IReporterYandex c;
    public final rhl0 d;
    public String e;
    public Set f;

    public xb20(Context context, rb20 rb20Var, whl0 whl0Var) {
        this.a = rb20Var;
        this.b = whl0Var;
        this.d = new rhl0(context);
        AppMetricaYandex.activateReporter(context, ReporterYandexConfig.newBuilder("9c5e85e6-5b39-4e91-b058-02e0c0b40a57").build());
        this.c = AppMetricaYandex.getReporter(context, "9c5e85e6-5b39-4e91-b058-02e0c0b40a57");
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Long valueOf;
        String str = this.e;
        Set set = this.f;
        if (str != null) {
            try {
                valueOf = Long.valueOf(Math.abs(ByteBuffer.wrap(MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8))).order(ByteOrder.BIG_ENDIAN).getLong()));
            } catch (NoSuchAlgorithmException e) {
                Log.e("UuidUtils", "Error performing hash", e);
            }
            this.c.updateRtmConfig(RtmConfig.newBuilder().withProjectName("messenger_android").withUserId(String.valueOf(valueOf)).withExperiment(set != null ? a.X(set, ";", null, null, null, 62) : null).withEnvironment(RtmConfig.Environment.PRODUCTION).withVersionFlavor(this.d.a.getPackageName()).build());
        }
        valueOf = null;
        this.c.updateRtmConfig(RtmConfig.newBuilder().withProjectName("messenger_android").withUserId(String.valueOf(valueOf)).withExperiment(set != null ? a.X(set, ";", null, null, null, 62) : null).withEnvironment(RtmConfig.Environment.PRODUCTION).withVersionFlavor(this.d.a.getPackageName()).build());
    }

    public final void b(String str, Map map) {
        this.c.reportEvent(str, (Map<String, Object>) map);
        this.a.getClass();
    }

    public final void c(String str, String str2) {
        this.a.getClass();
        this.c.putAppEnvironmentValue(str, str2);
        whl0 whl0Var = this.b;
        whl0Var.getClass();
        if (str2 != null) {
            str2.length();
        }
        z83.i();
        whl0Var.b.put(str, str2);
    }
}
