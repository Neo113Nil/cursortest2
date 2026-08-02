package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import defpackage.u75;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Mk implements InterfaceC0257fc {
    public final Context a;
    public final Xh b;
    public final C0237el c;
    public final Handler d;
    public final Ro e;
    public final Td f;
    public final LinkedHashMap g;
    public final Jq h;
    public final List i;
    public Id j;
    public C0195d7 k;

    public Mk(@NotNull Context context, @NotNull Xh xh, @NotNull C0237el c0237el, @NotNull Handler handler, @NotNull Ro ro) {
        this.a = context;
        this.b = xh;
        this.c = c0237el;
        this.d = handler;
        this.e = ro;
        this.f = new Td(context, xh, c0237el, ro);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.g = linkedHashMap;
        this.h = new Jq(new Ok(linkedHashMap));
        this.i = u75.h("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0257fc
    public final synchronized void a(@NotNull ReporterConfig reporterConfig) {
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

    @Override // io.appmetrica.analytics.impl.InterfaceC0257fc
    @NotNull
    public final synchronized InterfaceC0228ec b(@NotNull ReporterConfig reporterConfig) {
        InterfaceC0228ec interfaceC0228ec;
        try {
            InterfaceC0228ec interfaceC0228ec2 = (InterfaceC0228ec) this.g.get(reporterConfig.apiKey);
            interfaceC0228ec = interfaceC0228ec2;
            if (interfaceC0228ec2 == null) {
                if (!this.i.contains(reporterConfig.apiKey)) {
                    this.e.i();
                }
                Context context = this.a;
                C0202de c0202de = new C0202de(context, this.b, reporterConfig, this.c, new Ua(context));
                c0202de.i = new Nc(this.d, c0202de);
                Ro ro = this.e;
                C0351ik c0351ik = c0202de.b;
                if (ro != null) {
                    c0351ik.b.setUuid(ro.g());
                } else {
                    c0351ik.getClass();
                }
                c0202de.k();
                this.g.put(reporterConfig.apiKey, c0202de);
                interfaceC0228ec = c0202de;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC0228ec;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0257fc
    @NotNull
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized Id b(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, @NotNull C0534p0 c0534p0) {
        Id id;
        try {
            id = this.j;
            if (id != null) {
                Td td = this.f;
                td.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                td.g.b.applyFromAnonymousConfig(appMetricaConfig);
            } else {
                this.h.a(appMetricaConfig.apiKey);
                Td td2 = this.f;
                td2.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                td2.g.b.applyFromAnonymousConfig(appMetricaConfig);
                id = new Id(this.f);
                id.i = new Nc(this.d, id);
                Ro ro = this.e;
                C0351ik c0351ik = id.b;
                if (ro != null) {
                    c0351ik.b.setUuid(ro.g());
                } else {
                    c0351ik.getClass();
                }
                id.a(appMetricaConfig, c0534p0);
                id.k();
                this.c.f.c = new Lk(id);
                this.g.put(appMetricaConfig.apiKey, id);
                this.j = id;
            }
        } catch (Throwable th) {
            throw th;
        }
        return id;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0257fc
    @NotNull
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized Id a(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, @NotNull C0534p0 c0534p0) {
        Id id;
        try {
            id = this.j;
            if (id != null) {
                this.f.a(appMetricaConfig, publicLogger);
                id.a(appMetricaConfig, c0534p0);
                C0777xc c0777xc = R4.l().i;
                if (c0777xc != null) {
                    c0777xc.a(new Ud(this.f, appMetricaConfig, publicLogger), id);
                }
                this.g.put(appMetricaConfig.apiKey, id);
            } else {
                this.h.a(appMetricaConfig.apiKey);
                this.f.a(appMetricaConfig, publicLogger);
                id = new Id(this.f);
                id.i = new Nc(this.d, id);
                Ro ro = this.e;
                C0351ik c0351ik = id.b;
                if (ro != null) {
                    c0351ik.b.setUuid(ro.g());
                } else {
                    c0351ik.getClass();
                }
                id.a(appMetricaConfig, c0534p0);
                id.k();
                this.c.f.c = new Lk(id);
                this.g.put(appMetricaConfig.apiKey, id);
                C0777xc c0777xc2 = R4.l().i;
                if (c0777xc2 != null) {
                    c0777xc2.a(new Ud(this.f, appMetricaConfig, publicLogger), id);
                }
                this.j = id;
            }
        } catch (Throwable th) {
            throw th;
        }
        return id;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0257fc, io.appmetrica.analytics.impl.InterfaceC0286gc
    public final InterfaceC0257fc a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0257fc
    @NotNull
    public final synchronized InterfaceC0315hc a(@NotNull AppMetricaConfig appMetricaConfig) {
        C0195d7 c0195d7;
        try {
            c0195d7 = this.k;
            if (c0195d7 != null) {
                c0195d7.a(appMetricaConfig);
            } else {
                C0195d7 c0195d72 = new C0195d7(new C0252f7(this.b, this.f.f, this.c, appMetricaConfig));
                this.k = c0195d72;
                c0195d7 = c0195d72;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0195d7;
    }

    @NotNull
    public final Mk b() {
        return this;
    }
}
