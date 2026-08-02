package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Zj extends Aj {
    public final C0337fi b;
    public final as c;
    public final SafePackageManager d;
    public final TimeProvider e;

    public Zj(S5 s5) {
        this(s5, s5.v(), Jb.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        S5 s5 = this.a;
        if (!this.c.d()) {
            K6 a = ((Xj) s5.k.a()).e ? K6.a(k6, Hc.EVENT_TYPE_APP_UPDATE) : K6.a(k6, Hc.EVENT_TYPE_INIT);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.d.getInstallerPackageName(s5.a, s5.b.a), ""));
                C0337fi c0337fi = this.b;
                c0337fi.h.a(c0337fi.a);
                jSONObject.put("preloadInfo", ((C0251ci) c0337fi.c()).b());
            } catch (Throwable unused) {
            }
            a.setValue(jSONObject.toString());
            C0907za c0907za = s5.n;
            c0907za.a(a, C0574no.a(c0907za.c.b(a), a.i));
            as asVar = this.c;
            synchronized (asVar) {
                JSONObject a2 = asVar.a.a();
                if (!a2.optBoolean("init_event_done", false)) {
                    asVar.a.a(a2.put("init_event_done", true));
                }
                bs bsVar = asVar.a;
                bs.a(bsVar.a);
                bs.a(bsVar.b);
            }
            this.c.a(this.e.currentTimeMillis());
        }
        return false;
    }

    public Zj(S5 s5, as asVar, C0337fi c0337fi, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(s5);
        this.c = asVar;
        this.b = c0337fi;
        this.d = safePackageManager;
        this.e = systemTimeProvider;
    }
}
