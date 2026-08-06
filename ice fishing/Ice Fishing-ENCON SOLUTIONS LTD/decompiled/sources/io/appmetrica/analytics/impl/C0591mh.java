package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.mh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591mh extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C0770tf f6524b;

    /* renamed from: c, reason: collision with root package name */
    public final C0883xo f6525c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f6526d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeProvider f6527e;

    public C0591mh(X4 x4) {
        this(x4, x4.u(), C0610na.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        X4 x4 = this.f4998a;
        if (this.f6525c.d()) {
            return false;
        }
        P5 a2 = ((C0539kh) x4.f5356k.a()).f6376e ? P5.a(p5, EnumC0301bb.EVENT_TYPE_APP_UPDATE) : P5.a(p5, EnumC0301bb.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f6526d.getInstallerPackageName(x4.f5346a, x4.f5347b.f4950a), ""));
            C0770tf c0770tf = this.f6524b;
            c0770tf.f4927h.a(c0770tf.f4920a);
            jSONObject.put("preloadInfo", ((C0693qf) c0770tf.c()).b());
        } catch (Throwable unused) {
        }
        a2.setValue(jSONObject.toString());
        C0531k9 c0531k9 = x4.f5359n;
        c0531k9.a(a2, Rk.a(c0531k9.f6357c.b(a2), a2.f4912i));
        C0883xo c0883xo = this.f6525c;
        synchronized (c0883xo) {
            C0909yo c0909yo = c0883xo.f7214a;
            c0909yo.a(c0909yo.a().put("init_event_done", true));
        }
        this.f6525c.a(this.f6527e.currentTimeMillis());
        return false;
    }

    public C0591mh(X4 x4, C0883xo c0883xo, C0770tf c0770tf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(x4);
        this.f6525c = c0883xo;
        this.f6524b = c0770tf;
        this.f6526d = safePackageManager;
        this.f6527e = systemTimeProvider;
    }
}
