package defpackage;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class lar implements bse {
    public final spq a;
    public final z66 b;
    public final vpq c;
    public final jyr d;

    public lar(spq spqVar, z66 z66Var, vpq vpqVar) {
        spqVar.getClass();
        vpqVar.getClass();
        this.a = spqVar;
        this.b = z66Var;
        this.c = vpqVar;
        this.d = btf.b(new eyq(9, this));
    }

    public final d0o a(d0o d0oVar) {
        b0o b = d0oVar.b();
        b.c((cp3) this.d.getValue());
        return b.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    @Override // defpackage.bse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l3o b(ukn uknVar) {
        ukn uknVar2;
        boolean z;
        boolean z2;
        spq spqVar = this.a;
        boolean z3 = spqVar.c;
        boolean z4 = spqVar.a;
        z66 z66Var = this.b;
        if (!z3 && z66Var.h()) {
            b0o b = ((d0o) uknVar.i).b();
            b.c(cp3.n);
            return uknVar.f(b.b());
        }
        Integer num = spqVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (num != null) {
            int intValue = num.intValue();
            timeUnit.getClass();
            if (((evj) uknVar.h) != null) {
                xq0.q("Timeouts can't be adjusted in a network interceptor");
                return null;
            }
            uknVar2 = ukn.a(uknVar, 0, null, null, cvt.b("connectTimeout", intValue, timeUnit), 0, 0, 55);
        } else {
            uknVar2 = uknVar;
        }
        Integer num2 = spqVar.f;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            timeUnit.getClass();
            if (((evj) uknVar2.h) != null) {
                xq0.q("Timeouts can't be adjusted in a network interceptor");
                return null;
            }
            long j = intValue2;
            ukn a = ukn.a(uknVar2, 0, null, null, 0, cvt.b("readTimeout", j, timeUnit), 0, 47);
            if (((evj) a.h) != null) {
                xq0.q("Timeouts can't be adjusted in a network interceptor");
                return null;
            }
            uknVar2 = ukn.a(a, 0, null, null, 0, 0, cvt.b("writeTimeout", j, timeUnit), 31);
        }
        d0o d0oVar = (d0o) uknVar2.i;
        l3o l3oVar = null;
        if (!z4 || z66Var.g()) {
            Integer num3 = spqVar.g;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                zzi zziVar = (zzi) z66Var.d().getValue();
                int i = zziVar.c;
                h6r h6rVar = new h6r(i);
                if (i == -1) {
                    h6rVar = null;
                }
                if (h6rVar != null) {
                    int i2 = h6rVar.a;
                    z2 = i2 < intValue3;
                    yzi yziVar = zziVar.b;
                    vpq vpqVar = this.c;
                    vpqVar.getClass();
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.s(Integer.valueOf(i2), "currentDownstreamBandwidthKbps");
                    jsonObject.s(Integer.valueOf(intValue3), "upperLimitSlowNetworkSpeedKbps");
                    jsonObject.t("isSlowNetworkSpeed", Boolean.valueOf(z2));
                    jsonObject.u("networkTransport", yziVar.name());
                    t70 t70Var = vpqVar.a;
                    String jsonElement = jsonObject.toString();
                    jsonElement.getClass();
                    ot0.L(t70Var.e(), "skeleton_network_speed_cache", jsonElement);
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                    if (z) {
                        d0oVar = a(d0oVar);
                    }
                }
            }
            z = false;
            if (z) {
            }
        } else {
            d0oVar = a(d0oVar);
        }
        d0o d0oVar2 = d0oVar;
        try {
            l3oVar = uknVar2.f(d0oVar2);
        } catch (IOException e) {
            if (!z4 || lsq.B(d0oVar2)) {
                throw e;
            }
        }
        if (l3oVar == null) {
            return uknVar.f(a(d0oVar2));
        }
        if (spqVar.b) {
            int i3 = l3oVar.d;
            if ((i3 >= 500 || i3 == 408 || i3 == 429) && !lsq.B(d0oVar2)) {
                if (weo.G(l3oVar.a)) {
                    try {
                        if (l3oVar.g != null) {
                            l3oVar.close();
                        }
                    } catch (Throwable unused) {
                    }
                }
                return uknVar.f(a(d0oVar2));
            }
        }
        return l3oVar;
    }
}
