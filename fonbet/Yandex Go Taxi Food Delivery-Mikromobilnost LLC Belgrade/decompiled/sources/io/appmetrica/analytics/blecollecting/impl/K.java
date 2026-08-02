package io.appmetrica.analytics.blecollecting.impl;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.evu0;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.RtmAdditionalData;
import io.appmetrica.analytics.RtmClientEvent;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.blewrapper.internal.result.BleData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class K implements J {
    public final Context a;
    public final String b;
    public final String c;
    public final long d;
    public final N e;
    public final SharedPreferences f;
    public final F g;
    public final String h;
    public final String i;
    public final String j;
    public final RtmConfig k;

    public K(Context context, String str, String str2, long j, N n, SharedPreferences sharedPreferences, F f) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = n;
        this.f = sharedPreferences;
        this.g = f;
        this.h = "beacon_scan_error";
        this.i = "beacon_scan_result";
        this.j = "rtmReportIndex";
        this.k = RtmConfig.newBuilder().withProjectName(str2).build();
    }

    @Override // io.appmetrica.analytics.blecollecting.impl.J
    public final void a(BleData bleData, long j, long j2) {
        boolean a = this.g.a(bleData, this.d);
        String str = this.c;
        if (str == null || evu0.J(str) || !a || evu0.J(this.b)) {
            return;
        }
        N n = this.e;
        long j3 = this.f.getLong(this.j, 0L);
        SharedPreferences.Editor edit = this.f.edit();
        edit.putLong(this.j, 1 + j3);
        edit.apply();
        String a2 = ((C0147b) n).a(bleData, j, j2, j3);
        IReporterYandex reporter = AppMetricaYandex.getReporter(this.a, this.b);
        reporter.updateRtmConfig(this.k);
        reporter.reportRtmEvent(RtmClientEvent.newBuilder(this.i, a2).withAdditional(RtmAdditionalData.newBuilder().withIncludeLocation().build()).build());
        reporter.sendEventsBuffer();
    }

    public /* synthetic */ K(Context context, String str, String str2, long j, N n, SharedPreferences sharedPreferences, F f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, j, n, sharedPreferences, (i & 64) != 0 ? new F(new C0161p(context).c()) : f);
    }

    @Override // io.appmetrica.analytics.blecollecting.impl.J
    public final void a(int i, long j, long j2) {
        String str = this.c;
        if (str == null || evu0.J(str) || evu0.J(this.b)) {
            return;
        }
        N n = this.e;
        long j3 = this.f.getLong(this.j, 0L);
        SharedPreferences.Editor edit = this.f.edit();
        edit.putLong(this.j, 1 + j3);
        edit.apply();
        String a = ((C0147b) n).a(i, j, j2, j3);
        IReporterYandex reporter = AppMetricaYandex.getReporter(this.a, this.b);
        reporter.updateRtmConfig(this.k);
        reporter.reportRtmEvent(RtmClientEvent.newBuilder(this.h, a).withAdditional(RtmAdditionalData.newBuilder().withIncludeLocation().build()).build());
        reporter.sendEventsBuffer();
    }
}
