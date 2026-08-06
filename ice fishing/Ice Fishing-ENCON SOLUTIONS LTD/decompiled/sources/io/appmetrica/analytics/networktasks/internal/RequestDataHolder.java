package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class RequestDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private NetworkTask.Method f7508a = NetworkTask.Method.GET;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f7509b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private byte[] f7510c = null;

    /* renamed from: d, reason: collision with root package name */
    private Long f7511d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f7512e;

    public void applySendTime(long j2) {
        this.f7511d = Long.valueOf(j2);
        this.f7512e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j2) * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
    }

    public Map<String, List<String>> getHeaders() {
        return this.f7509b;
    }

    public NetworkTask.Method getMethod() {
        return this.f7508a;
    }

    public byte[] getPostData() {
        return this.f7510c;
    }

    public Long getSendTimestamp() {
        return this.f7511d;
    }

    public Integer getSendTimezoneSec() {
        return this.f7512e;
    }

    public void setHeader(String str, String... strArr) {
        this.f7509b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f7508a = NetworkTask.Method.POST;
        this.f7510c = bArr;
    }
}
