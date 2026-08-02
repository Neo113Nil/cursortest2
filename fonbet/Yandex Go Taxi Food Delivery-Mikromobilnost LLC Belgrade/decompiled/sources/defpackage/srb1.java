package defpackage;

import androidx.fragment.app.a;
import com.yandex.go.navigator.alt_select.traffic.TrafficLevel;
import com.yandex.mapkit.traffic.TrafficColor;
import com.ybsdk.core.mvp.BaseMvvmFragment;

/* loaded from: classes6.dex */
public abstract class srb1 {
    public static final TrafficLevel a(TrafficColor trafficColor) {
        int i = s901.a[trafficColor.ordinal()];
        if (i == 1) {
            return TrafficLevel.HARD;
        }
        if (i == 2) {
            return TrafficLevel.LIGHT;
        }
        if (i == 3) {
            return TrafficLevel.FREE;
        }
        w511.b();
        return null;
    }

    public static double b(double d, double d2) {
        return d2 == 0.0d ? d == 0.0d ? 1.0d : 0.0d : d / d2;
    }

    public static double c(double d, double d2, double d3, double d4) {
        if (d == d3 && d2 == d4) {
            return 0.0d;
        }
        double d5 = (d2 - d4) * 0.017453292519943295d;
        double sin = Math.sin((d + d3) * 0.5d * 0.017453292519943295d);
        double d6 = 1.0d - ((sin * sin) * 0.006705621329494961d);
        double b = b(6335367.6284903595d, Math.pow(d6, 1.5d));
        double b2 = b(6378137.0d, Math.sqrt(d6));
        double sin2 = Math.sin((d - d3) * 0.017453292519943295d * 0.5d);
        double sin3 = Math.sin(0.5d * d5);
        double d7 = d3 * 0.017453292519943295d;
        double sqrt = Math.sqrt((Math.cos(0.017453292519943295d * d) * Math.cos(d7) * sin3 * sin3) + (sin2 * sin2));
        if (sqrt < -1.0d) {
            sqrt = -1.0d;
        }
        if (sqrt > 1.0d) {
            sqrt = 1.0d;
        }
        double asin = Math.asin(sqrt) * 2.0d;
        double sin4 = (Math.sin(d5) * Math.cos(d7)) / Math.sin(asin);
        double d8 = sin4 >= -1.0d ? sin4 : -1.0d;
        if (d8 > 1.0d) {
            d8 = 1.0d;
        }
        double d9 = d8 * d8;
        return b(b * b2, x4e.a(1.0d, d9, b2, b * d9)) * asin;
    }

    public static double d(zzs zzsVar, zzs zzsVar2) {
        return c(zzsVar.a, zzsVar.b, zzsVar2.a, zzsVar2.b);
    }

    public static zzs e(zzs zzsVar, double d) {
        double d2 = zzsVar.a;
        double d3 = d * 9.0E-6d;
        return new zzs(d3 + d2, zzsVar.b + (d3 / Math.cos(d2)), 0, null, null, 28);
    }

    public static zzs f(zzs zzsVar, double d) {
        double d2 = zzsVar.a;
        double d3 = d * 9.0E-6d;
        return new zzs(d2 - d3, zzsVar.b - (d3 / Math.cos(d2)), 0, null, null, 28);
    }

    public static final void g(BaseMvvmFragment baseMvvmFragment) {
        int K = baseMvvmFragment.getParentFragmentManager().K() - 2;
        if (K >= 0) {
            baseMvvmFragment.getParentFragmentManager().X(((a) baseMvvmFragment.getParentFragmentManager().J(K)).t, false);
        } else {
            baseMvvmFragment.getRouter().e();
        }
    }
}
