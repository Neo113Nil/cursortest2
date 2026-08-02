package io.appmetrica.analytics.blecollecting.impl;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.evu0;
import defpackage.gw00;
import defpackage.uza;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IModuleReporter;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.blewrapper.internal.result.BleData;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0146a implements J {
    public final Context a;
    public final String b;
    public final boolean c;
    public final long d;
    public final N e;
    public final SharedPreferences f;
    public final F g;
    public final String h;
    public final String i;
    public final String j;

    public /* synthetic */ C0146a(Context context, String str, boolean z, long j, N n, SharedPreferences sharedPreferences, F f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, z, j, n, sharedPreferences, (i & 64) != 0 ? new F(new C0161p(context).b()) : f);
    }

    @Override // io.appmetrica.analytics.blecollecting.impl.J
    public final void a(BleData bleData, long j, long j2) {
        boolean a = this.g.a(bleData, this.d);
        if (this.c && a && !evu0.J(this.b)) {
            N n = this.e;
            long j3 = this.f.getLong(this.j, 0L);
            SharedPreferences.Editor edit = this.f.edit();
            edit.putLong(this.j, 1 + j3);
            edit.apply();
            String a2 = ((C0147b) n).a(bleData, j, j2, j3);
            IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
            moduleReporter.reportEvent(ModuleEvent.newBuilder(4).withName(this.i).withValue(a2).withExtras(gw00.e(new Pair("ble_add_location", "true".getBytes(uza.a)))).build());
            moduleReporter.sendEventsBuffer();
        }
    }

    public C0146a(Context context, String str, boolean z, long j, N n, SharedPreferences sharedPreferences, F f) {
        this.a = context;
        this.b = str;
        this.c = z;
        this.d = j;
        this.e = n;
        this.f = sharedPreferences;
        this.g = f;
        this.h = "beacon_scan_error";
        this.i = "beacon_scan_result";
        this.j = "appMetricaReportIndex";
    }

    @Override // io.appmetrica.analytics.blecollecting.impl.J
    public final void a(int i, long j, long j2) {
        if (!this.c || evu0.J(this.b)) {
            return;
        }
        N n = this.e;
        long j3 = this.f.getLong(this.j, 0L);
        SharedPreferences.Editor edit = this.f.edit();
        edit.putLong(this.j, 1 + j3);
        edit.apply();
        String a = ((C0147b) n).a(i, j, j2, j3);
        IReporterYandex reporter = AppMetricaYandex.getReporter(this.a, this.b);
        reporter.reportError(this.h, a);
        reporter.sendEventsBuffer();
    }
}
