package defpackage;

import com.connectsdk.discovery.provider.ssdp.SSDPClient;
import io.grpc.util.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class yxj extends deg {
    public static lwi d(Map map) {
        sxj sxjVar;
        sxj sxjVar2;
        Integer num;
        Integer num2;
        Integer num3 = 5;
        Integer num4 = 100;
        Long Y = qwp.Y("interval", map);
        Long Y2 = qwp.Y("baseEjectionTime", map);
        Long Y3 = qwp.Y("maxEjectionTime", map);
        Integer U = qwp.U("maxEjectionPercentage", map);
        Long l = Y != null ? Y : 10000000000L;
        Long l2 = Y2 != null ? Y2 : 30000000000L;
        Long l3 = Y3 != null ? Y3 : 300000000000L;
        Integer num5 = U != null ? U : 10;
        Map V = qwp.V("successRateEjection", map);
        List list = null;
        if (V != null) {
            Integer valueOf = Integer.valueOf(SSDPClient.PORT);
            Integer U2 = qwp.U("stdevFactor", V);
            Integer U3 = qwp.U("enforcementPercentage", V);
            Integer U4 = qwp.U("minimumHosts", V);
            Integer U5 = qwp.U("requestVolume", V);
            if (U2 != null) {
                valueOf = U2;
            }
            if (U3 != null) {
                o2g.L(U3.intValue() >= 0 && U3.intValue() <= 100);
                num = U3;
            } else {
                num = num4;
            }
            if (U4 != null) {
                o2g.L(U4.intValue() >= 0);
                num2 = U4;
            } else {
                num2 = num3;
            }
            if (U5 != null) {
                o2g.L(U5.intValue() >= 0);
            } else {
                U5 = num4;
            }
            sxjVar = new sxj(valueOf, num, num2, U5);
        } else {
            sxjVar = null;
        }
        Map V2 = qwp.V("failurePercentageEjection", map);
        if (V2 != null) {
            Integer num6 = 85;
            Integer num7 = 50;
            Integer U6 = qwp.U("threshold", V2);
            Integer U7 = qwp.U("enforcementPercentage", V2);
            Integer U8 = qwp.U("minimumHosts", V2);
            Integer U9 = qwp.U("requestVolume", V2);
            if (U6 != null) {
                o2g.L(U6.intValue() >= 0 && U6.intValue() <= 100);
                num6 = U6;
            }
            if (U7 != null) {
                o2g.L(U7.intValue() >= 0 && U7.intValue() <= 100);
                num4 = U7;
            }
            if (U8 != null) {
                o2g.L(U8.intValue() >= 0);
                num3 = U8;
            }
            if (U9 != null) {
                o2g.L(U9.intValue() >= 0);
                num7 = U9;
            }
            sxjVar2 = new sxj(num6, num4, num3, num7);
        } else {
            sxjVar2 = null;
        }
        List R = qwp.R("childPolicy", map);
        if (R != null) {
            qwp.F(R);
            list = R;
        }
        List u0 = bkp.u0(list);
        if (u0 == null || u0.isEmpty()) {
            return new lwi(sgr.n.i("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        lwi p0 = bkp.p0(u0, eeg.a());
        if (p0.a != null) {
            return p0;
        }
        akp akpVar = (akp) p0.b;
        o2g.V(akpVar != null);
        o2g.V(akpVar != null);
        return new lwi(new txj(l, l2, l3, num5, sxjVar, sxjVar2, akpVar));
    }

    @Override // defpackage.deg
    public final String a() {
        return "outlier_detection_experimental";
    }

    @Override // defpackage.deg
    public final ceg b(wdg wdgVar) {
        return new b(wdgVar);
    }

    @Override // defpackage.deg
    public final lwi c(Map map) {
        try {
            return d(map);
        } catch (RuntimeException e) {
            return new lwi(sgr.o.h(e).i("Failed parsing configuration for outlier_detection_experimental"));
        }
    }
}
