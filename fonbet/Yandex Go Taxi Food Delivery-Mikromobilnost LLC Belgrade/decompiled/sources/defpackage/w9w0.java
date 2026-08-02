package defpackage;

import com.yandex.go.analytics.ApplicationAnalytics$SuperappSessionCreationReason;
import com.yandex.go.user_session.data.model.InvalidSessionReason;
import com.yandex.go.user_session.data.model.SuperappSession;
import com.yandex.go.user_session.data.model.SuperappSessionTtlSettingsExperiment;
import java.time.Instant;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.time.DurationUnit;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.am.g;

/* loaded from: classes8.dex */
public final class w9w0 {
    public final rs2 a;
    public final h3y b;
    public final uew0 c;
    public final tew0 d;
    public final ky2 e;
    public final h3y f;

    public w9w0(rs2 rs2Var, h3y h3yVar, uew0 uew0Var, tew0 tew0Var, ky2 ky2Var, h3y h3yVar2) {
        this.a = rs2Var;
        this.b = h3yVar;
        this.c = uew0Var;
        this.d = tew0Var;
        this.e = ky2Var;
        this.f = h3yVar2;
    }

    public final String a() {
        InvalidSessionReason invalidSessionReason;
        boolean z;
        ApplicationAnalytics$SuperappSessionCreationReason applicationAnalytics$SuperappSessionCreationReason;
        Long l;
        String str = null;
        if (!((SuperappSessionTtlSettingsExperiment) this.c.a.c()).b) {
            return null;
        }
        SuperappSession superappSession = (SuperappSession) ((AtomicReference) this.d.c.getValue()).get();
        SuperappSession.Companion.getClass();
        if (jl40.l(superappSession, SuperappSession.h)) {
            invalidSessionReason = InvalidSessionReason.NoSession;
        } else if (System.currentTimeMillis() > superappSession.b + superappSession.d) {
            invalidSessionReason = InvalidSessionReason.MaxTtlExpired;
        } else if (!this.e.a && superappSession.c != null && System.currentTimeMillis() > superappSession.c.longValue() + superappSession.e) {
            invalidSessionReason = InvalidSessionReason.MaxTtlInactivityExpired;
        } else if (superappSession.g != ((g) this.b.get()).i()) {
            invalidSessionReason = InvalidSessionReason.UidChanged;
        } else {
            int i = superappSession.f;
            this.a.getClass();
            invalidSessionReason = i != 50128354 ? InvalidSessionReason.AppVersionChanged : null;
        }
        if (invalidSessionReason != null) {
            String b = gwk0.p().b();
            long currentTimeMillis = System.currentTimeMillis();
            SuperappSessionTtlSettingsExperiment superappSessionTtlSettingsExperiment = (SuperappSessionTtlSettingsExperiment) this.c.a.c();
            jst.e.getClass();
            Long valueOf = this.e.a ? null : Long.valueOf(currentTimeMillis);
            long j = superappSessionTtlSettingsExperiment.c * 1000;
            long j2 = 1000 * superappSessionTtlSettingsExperiment.d;
            this.a.getClass();
            SuperappSession superappSession2 = new SuperappSession(b, currentTimeMillis, valueOf, j, j2, 50128354, ((g) this.b.get()).i());
            tew0 tew0Var = this.d;
            AtomicReference atomicReference = (AtomicReference) tew0Var.c.getValue();
            while (true) {
                if (atomicReference.compareAndSet(superappSession, superappSession2)) {
                    z = true;
                    break;
                }
                if (atomicReference.get() != superappSession) {
                    z = false;
                    break;
                }
            }
            if (z) {
                tew0Var.b.b(superappSession2);
            }
            if (z) {
                wzq0 wzq0Var = (wzq0) this.f.get();
                wzq0Var.getClass();
                int i2 = vzq0.a[invalidSessionReason.ordinal()];
                if (i2 == 1) {
                    applicationAnalytics$SuperappSessionCreationReason = ApplicationAnalytics$SuperappSessionCreationReason.New;
                } else if (i2 == 2) {
                    applicationAnalytics$SuperappSessionCreationReason = ApplicationAnalytics$SuperappSessionCreationReason.MaxTtlExpired;
                } else if (i2 == 3) {
                    applicationAnalytics$SuperappSessionCreationReason = ApplicationAnalytics$SuperappSessionCreationReason.MaxTtlInactivityExpired;
                } else if (i2 == 4) {
                    applicationAnalytics$SuperappSessionCreationReason = ApplicationAnalytics$SuperappSessionCreationReason.UidChanged;
                } else {
                    if (i2 != 5) {
                        w511.b();
                        return null;
                    }
                    applicationAnalytics$SuperappSessionCreationReason = ApplicationAnalytics$SuperappSessionCreationReason.AppVersionChanged;
                }
                String instant = Instant.ofEpochMilli(superappSession.b).toString();
                if (applicationAnalytics$SuperappSessionCreationReason == ApplicationAnalytics$SuperappSessionCreationReason.MaxTtlInactivityExpired && (l = superappSession.c) != null) {
                    str = Instant.ofEpochMilli(l.longValue()).toString();
                }
                zz2 zz2Var = wzq0Var.a;
                o430 o430Var = e3n.b;
                long j3 = superappSession.d;
                DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                long V = kp50.V(j3, durationUnit);
                DurationUnit durationUnit2 = DurationUnit.SECONDS;
                int o = (int) e3n.o(V, durationUnit2);
                int o2 = (int) e3n.o(kp50.V(superappSession.e, durationUnit), durationUnit2);
                zz2Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(CRLReasonCodeExtension.REASON, applicationAnalytics$SuperappSessionCreationReason.getEventValue());
                hashMap.put("max_ttl_sec", Integer.valueOf(o));
                hashMap.put("max_ttl_inactivity_sec", Integer.valueOf(o2));
                if (instant != null) {
                    hashMap.put("created_at", instant);
                }
                if (str != null) {
                    hashMap.put("became_inactive_at", str);
                }
                zz2Var.a.a("Application.SuperappSession.Created", hashMap, 1, new HashMap());
            }
        }
        return ((SuperappSession) ((AtomicReference) this.d.c.getValue()).get()).a;
    }
}
