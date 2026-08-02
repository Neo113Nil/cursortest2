package com.yandex.passport.internal.report;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.ReporterYandexConfig;
import io.appmetrica.analytics.RtmConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public abstract class ye {
    public static final void a(String str, IReporterYandex iReporterYandex) {
        String str2;
        RtmConfig.Builder withUserAgent = RtmConfig.newBuilder().withProjectName("passport-android").withEnvironment(RtmConfig.Environment.PRODUCTION).withUserAgent("device_id: ".concat(str));
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            str2 = String.valueOf(Math.abs(ByteBuffer.wrap(messageDigest.digest(bytes)).order(ByteOrder.BIG_ENDIAN).getLong()));
        } catch (NoSuchAlgorithmException unused) {
            str2 = null;
        }
        RtmConfig build = withUserAgent.withUserId(str2).build();
        build.getClass();
        iReporterYandex.updateRtmConfig(build);
    }

    public static final IReporterYandex b(Context context) {
        context.getClass();
        RtmConfig build = RtmConfig.newBuilder().withProjectName("passport-android").withEnvironment(RtmConfig.Environment.PRODUCTION).build();
        build.getClass();
        ReporterYandexConfig build2 = ReporterYandexConfig.newBuilder("67bb016b-be40-4c08-a190-96a3f3b503d3").withRtmConfig(build).build();
        build2.getClass();
        AppMetricaYandex.activateReporter(context, build2);
        IReporterYandex reporter = AppMetricaYandex.getReporter(context, "67bb016b-be40-4c08-a190-96a3f3b503d3");
        reporter.getClass();
        return reporter;
    }
}
