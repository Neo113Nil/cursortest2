package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public final class hoj extends osc {
    public static final m66 m;
    public static final long n;
    public static final gao o;
    public final k8h a;
    public SSLSocketFactory e;
    public final wfl b = xiu.g;
    public final gao c = o;
    public final gao d = new gao(xqd.s);
    public final m66 f = m;
    public int g = 1;
    public long h = Long.MAX_VALUE;
    public long i = xqd.n;
    public final int j = 65535;
    public final int k = RemoteCameraConfig.Camera.BITRATE;
    public final int l = Integer.MAX_VALUE;

    static {
        Logger.getLogger(hoj.class.getName());
        k66 k66Var = new k66(m66.e);
        k66Var.c(fl4.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, fl4.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, fl4.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, fl4.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, fl4.n, fl4.m);
        k66Var.f(tks.TLS_1_2);
        if (!k66Var.a) {
            xq0.q("no TLS extensions for cleartext connections");
            return;
        }
        k66Var.d = true;
        m = new m66(k66Var);
        n = 86400000000000000L;
        o = new gao(new rre(29));
        EnumSet.of(rks.a, rks.b);
    }

    public hoj(String str) {
        this.a = new k8h(str, new h4b(this), new mka(this));
    }

    @Override // defpackage.osc
    public final f8g j0() {
        return this.a;
    }

    public final void k0(long j) {
        o2g.J("keepalive time must be positive", j > 0);
        long nanos = TimeUnit.SECONDS.toNanos(j);
        this.h = nanos;
        long max = Math.max(nanos, 10000000000L);
        this.h = max;
        if (max >= n) {
            this.h = Long.MAX_VALUE;
        }
    }
}
