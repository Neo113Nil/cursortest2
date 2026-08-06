package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import i1.AbstractC0253j;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514ji implements Sa {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6292a;

    /* renamed from: b, reason: collision with root package name */
    public final Bf f6293b;

    /* renamed from: c, reason: collision with root package name */
    public final C0851wi f6294c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f6295d;

    /* renamed from: e, reason: collision with root package name */
    public final Ol f6296e;

    /* renamed from: f, reason: collision with root package name */
    public final C0741sc f6297f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f6298g;

    /* renamed from: h, reason: collision with root package name */
    public final En f6299h;

    /* renamed from: i, reason: collision with root package name */
    public final List f6300i;

    /* renamed from: j, reason: collision with root package name */
    public C0457hc f6301j;

    /* renamed from: k, reason: collision with root package name */
    public C0554l6 f6302k;

    public C0514ji(Context context, Bf bf, C0851wi c0851wi, Handler handler, Ol ol) {
        this.f6292a = context;
        this.f6293b = bf;
        this.f6294c = c0851wi;
        this.f6295d = handler;
        this.f6296e = ol;
        this.f6297f = new C0741sc(context, bf, c0851wi, ol);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f6298g = linkedHashMap;
        this.f6299h = new En(new C0566li(linkedHashMap));
        this.f6300i = AbstractC0253j.B("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.Ta
    public final Sa a() {
        return this;
    }

    public final C0514ji b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C0457hc b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0548l0 c0548l0) {
        C0457hc c0457hc;
        try {
            c0457hc = this.f6301j;
            if (c0457hc != null) {
                C0741sc c0741sc = this.f6297f;
                c0741sc.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c0741sc.f6901f.f4459b.applyFromAnonymousConfig(appMetricaConfig);
            } else {
                this.f6299h.a(appMetricaConfig.apiKey);
                C0741sc c0741sc2 = this.f6297f;
                c0741sc2.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c0741sc2.f6901f.f4459b.applyFromAnonymousConfig(appMetricaConfig);
                c0457hc = new C0457hc(this.f6297f);
                c0457hc.f4502i = new C0637ob(this.f6295d, c0457hc);
                Ol ol = this.f6296e;
                Fh fh = c0457hc.f4495b;
                if (ol != null) {
                    fh.f4459b.setUuid(ol.g());
                } else {
                    fh.getClass();
                }
                c0457hc.a(appMetricaConfig, c0548l0);
                c0457hc.k();
                this.f6294c.f7121f.f5444c = new C0488ii(c0457hc);
                this.f6298g.put(appMetricaConfig.apiKey, c0457hc);
                this.f6301j = c0457hc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0457hc;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C0457hc a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0548l0 c0548l0) {
        C0457hc c0457hc;
        try {
            c0457hc = this.f6301j;
            if (c0457hc != null) {
                this.f6297f.a(appMetricaConfig, publicLogger);
                c0457hc.a(appMetricaConfig, c0548l0);
                C0294b4.l().getClass();
                this.f6298g.put(appMetricaConfig.apiKey, c0457hc);
            } else {
                this.f6299h.a(appMetricaConfig.apiKey);
                this.f6297f.a(appMetricaConfig, publicLogger);
                c0457hc = new C0457hc(this.f6297f);
                c0457hc.f4502i = new C0637ob(this.f6295d, c0457hc);
                Ol ol = this.f6296e;
                Fh fh = c0457hc.f4495b;
                if (ol != null) {
                    fh.f4459b.setUuid(ol.g());
                } else {
                    fh.getClass();
                }
                c0457hc.a(appMetricaConfig, c0548l0);
                c0457hc.k();
                this.f6294c.f7121f.f5444c = new C0488ii(c0457hc);
                this.f6298g.put(appMetricaConfig.apiKey, c0457hc);
                C0294b4.l().getClass();
                this.f6301j = c0457hc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0457hc;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final synchronized void a(ReporterConfig reporterConfig) {
        try {
            if (this.f6298g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info("AppMetrica", "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final synchronized Ra b(ReporterConfig reporterConfig) {
        Ra ra;
        try {
            ra = (Ra) this.f6298g.get(reporterConfig.apiKey);
            if (ra == null) {
                if (!this.f6300i.contains(reporterConfig.apiKey)) {
                    this.f6296e.i();
                }
                Context context = this.f6292a;
                C0897yc c0897yc = new C0897yc(context, this.f6293b, reporterConfig, this.f6294c, new M9(context));
                c0897yc.f4502i = new C0637ob(this.f6295d, c0897yc);
                Ol ol = this.f6296e;
                Fh fh = c0897yc.f4495b;
                if (ol != null) {
                    fh.f4459b.setUuid(ol.g());
                } else {
                    fh.getClass();
                }
                c0897yc.k();
                this.f6298g.put(reporterConfig.apiKey, c0897yc);
                ra = c0897yc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return ra;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final synchronized Ua a(AppMetricaConfig appMetricaConfig) {
        C0554l6 c0554l6;
        try {
            c0554l6 = this.f6302k;
            if (c0554l6 != null) {
                c0554l6.a(appMetricaConfig);
            } else {
                C0554l6 c0554l62 = new C0554l6(new C0580m6(this.f6293b, this.f6297f.f6900e, this.f6294c, appMetricaConfig));
                this.f6302k = c0554l62;
                c0554l6 = c0554l62;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0554l6;
    }
}
