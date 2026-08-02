package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardOpenReason;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;

/* loaded from: classes6.dex */
public abstract class wtb1 {
    public static au2 a;

    public static final String a(int i) {
        long j = i;
        return j < 1000 ? String.valueOf(i) : j < 100000 ? String.format("%.1fk", Arrays.copyOf(new Object[]{Float.valueOf(i / 1000.0f)}, 1)) : i < 1000000 ? b64.e(i / 1000, "k") : i < 100000000 ? String.format("%.1fm", Arrays.copyOf(new Object[]{Float.valueOf(i / 1000000.0f)}, 1)) : "100m+";
    }

    public static final au2 b() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("CrossBan", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 g = tse0.g(17.0f, 2.6f, 21.4f, 7.0f);
        g.e(0.4f, 0.3f, 0.6f, 0.8f, 0.6f, 1.4f);
        g.p(7.2f);
        g.e(0.0f, 0.5f, -0.2f, 1.0f, -0.6f, 1.4f);
        g.h(17.0f, 21.4f);
        g.e(-0.4f, 0.4f, -0.9f, 0.6f, -1.4f, 0.6f);
        g.h(8.4f, 22.0f);
        g.e(-0.6f, 0.0f, -1.1f, -0.2f, -1.4f, -0.6f);
        g.h(2.6f, 17.0f);
        g.e(-0.4f, -0.4f, -0.6f, -0.9f, -0.6f, -1.4f);
        g.h(2.0f, 8.4f);
        g.e(0.0f, -0.6f, 0.2f, -1.1f, 0.6f, -1.4f);
        g.h(7.0f, 2.6f);
        g.e(0.3f, -0.4f, 0.8f, -0.6f, 1.4f, -0.6f);
        g.g(7.2f);
        g.e(0.5f, 0.0f, 1.1f, 0.2f, 1.4f, 0.6f);
        g.j(15.6f, 20.0f);
        g.i(4.4f, -4.4f);
        g.h(20.0f, 8.4f);
        g.h(15.6f, 4.0f);
        g.h(8.4f, 4.0f);
        g.h(4.0f, 8.4f);
        g.p(7.2f);
        g.h(8.4f, 20.0f);
        g.c();
        g.j(13.41f, 12.0f);
        g.h(15.99f, 9.41f);
        g.h(14.58f, 8.0f);
        g.h(12.0f, 10.58f);
        g.h(9.4f, 8.0f);
        g.h(8.0f, 9.41f);
        g.h(10.58f, 12.0f);
        g.h(8.0f, 14.58f);
        g.i(1.41f, 1.41f);
        g.h(12.0f, 13.41f);
        g.i(2.58f, 2.58f);
        g.i(1.41f, -1.41f);
        g.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", g.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final String c(long j) {
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.MICROSECONDS;
        return e3n.o(kp50.V(j, durationUnit), DurationUnit.SECONDS) + Extension.DOT_CHAR + (e3n.e(kp50.V(j, durationUnit)) % 1000);
    }

    public static final ArrayList d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hz30 hz30Var = (hz30) it.next();
            String mapkitType = hz30Var instanceof fj40 ? ((fj40) hz30Var).getType().getMapkitType() : null;
            if (mapkitType != null) {
                arrayList.add(mapkitType);
            }
        }
        return arrayList;
    }

    public static final TransportRouteAnalytics$DetailCardOrigin e(MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason) {
        switch (e411.a[mtDetailRouteCardOpenReason.ordinal()]) {
            case 1:
                return TransportRouteAnalytics$DetailCardOrigin.Pull;
            case 2:
            case 3:
                return TransportRouteAnalytics$DetailCardOrigin.ButtonTap;
            case 4:
                return TransportRouteAnalytics$DetailCardOrigin.SelectorTap;
            case 5:
                return TransportRouteAnalytics$DetailCardOrigin.HandlerTap;
            case 6:
                return TransportRouteAnalytics$DetailCardOrigin.BackFromMapFlow;
            default:
                w511.b();
                return null;
        }
    }

    public static final TransportRouteAnalytics$DetailCardSource f(MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason) {
        switch (e411.a[mtDetailRouteCardOpenReason.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return TransportRouteAnalytics$DetailCardSource.Transport;
            case 3:
                return TransportRouteAnalytics$DetailCardSource.Hub;
            default:
                w511.b();
                return null;
        }
    }
}
