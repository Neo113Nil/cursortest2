package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import defpackage.scc;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class Wk implements InterfaceC0649qc {
    public final Context a;
    public final C0597oi b;
    public final C0600ol c;
    public final Handler d;
    public final C0459jp e;
    public final C0420ie f;
    public final LinkedHashMap g;
    public final C0260cr h;
    public final List i;
    public Yd j;
    public C0355g7 k;

    public Wk(Context context, C0597oi c0597oi, C0600ol c0600ol, Handler handler, C0459jp c0459jp) {
        this.a = context;
        this.b = c0597oi;
        this.c = c0600ol;
        this.d = handler;
        this.e = c0459jp;
        this.f = new C0420ie(context, c0597oi, c0600ol, c0459jp);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.g = linkedHashMap;
        this.h = new C0260cr(new Yk(linkedHashMap));
        this.i = scc.g("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0649qc
    public final synchronized void a(ReporterConfig reporterConfig) {
        try {
            if (this.g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info("AppMetrica", "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0649qc
    public final synchronized InterfaceC0620pc b(ReporterConfig reporterConfig) {
        InterfaceC0620pc interfaceC0620pc;
        try {
            InterfaceC0620pc interfaceC0620pc2 = (InterfaceC0620pc) this.g.get(reporterConfig.apiKey);
            interfaceC0620pc = interfaceC0620pc2;
            if (interfaceC0620pc2 == null) {
                if (!this.i.contains(reporterConfig.apiKey)) {
                    this.e.i();
                }
                Context context = this.a;
                C0708se c0708se = new C0708se(context, this.b, reporterConfig, this.c, new C0244cb(context));
                c0708se.i = new C0275dd(this.d, c0708se);
                C0459jp c0459jp = this.e;
                C0714sk c0714sk = c0708se.b;
                if (c0459jp != null) {
                    c0714sk.b.setUuid(c0459jp.g());
                } else {
                    c0714sk.getClass();
                }
                c0708se.k();
                this.g.put(reporterConfig.apiKey, c0708se);
                interfaceC0620pc = c0708se;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC0620pc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0649qc
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized Yd a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0665r0 c0665r0) {
        Yd yd;
        try {
            yd = this.j;
            if (yd != null) {
                this.f.a(appMetricaConfig, publicLogger);
            } else {
                this.h.a(appMetricaConfig.apiKey);
                this.f.a(appMetricaConfig, publicLogger);
                yd = new Yd(this.f);
                yd.i = new C0275dd(this.d, yd);
                C0459jp c0459jp = this.e;
                C0714sk c0714sk = yd.b;
                if (c0459jp != null) {
                    c0714sk.b.setUuid(c0459jp.g());
                } else {
                    c0714sk.getClass();
                }
                yd.a(appMetricaConfig, c0665r0);
                yd.k();
                this.c.f.c = new Vk(yd);
                this.g.put(appMetricaConfig.apiKey, yd);
                this.j = yd;
            }
        } catch (Throwable th) {
            throw th;
        }
        return yd;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0649qc
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized Yd b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0665r0 c0665r0) {
        Yd yd;
        try {
            yd = this.j;
            if (yd != null) {
                this.f.b(appMetricaConfig, publicLogger);
                yd.a(appMetricaConfig, c0665r0);
                Nc nc = V4.l().i;
                if (nc != null) {
                    nc.a(new C0448je(this.f, appMetricaConfig, publicLogger), yd);
                }
                this.g.put(appMetricaConfig.apiKey, yd);
            } else {
                this.h.a(appMetricaConfig.apiKey);
                this.f.b(appMetricaConfig, publicLogger);
                yd = new Yd(this.f);
                yd.i = new C0275dd(this.d, yd);
                C0459jp c0459jp = this.e;
                C0714sk c0714sk = yd.b;
                if (c0459jp != null) {
                    c0714sk.b.setUuid(c0459jp.g());
                } else {
                    c0714sk.getClass();
                }
                yd.a(appMetricaConfig, c0665r0);
                yd.k();
                this.c.f.c = new Vk(yd);
                this.g.put(appMetricaConfig.apiKey, yd);
                Nc nc2 = V4.l().i;
                if (nc2 != null) {
                    nc2.a(new C0448je(this.f, appMetricaConfig, publicLogger), yd);
                }
                this.j = yd;
            }
        } catch (Throwable th) {
            throw th;
        }
        return yd;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0649qc, io.appmetrica.analytics.impl.InterfaceC0677rc
    public final InterfaceC0649qc a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0649qc
    public final synchronized InterfaceC0735tc a(AppMetricaConfig appMetricaConfig) {
        C0355g7 c0355g7;
        try {
            c0355g7 = this.k;
            if (c0355g7 != null) {
                c0355g7.a(appMetricaConfig);
            } else {
                C0355g7 c0355g72 = new C0355g7(new C0413i7(this.b, this.f.f, this.c, appMetricaConfig));
                this.k = c0355g72;
                c0355g7 = c0355g72;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0355g7;
    }

    public final Wk b() {
        return this;
    }
}
