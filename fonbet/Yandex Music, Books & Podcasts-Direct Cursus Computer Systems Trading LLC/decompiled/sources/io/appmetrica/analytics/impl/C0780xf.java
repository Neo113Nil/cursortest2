package io.appmetrica.analytics.impl;

import com.yandex.pulse.histogram.ComponentHistograms;
import defpackage.b6e;
import defpackage.dfi;
import defpackage.eeh;
import defpackage.f1d;
import defpackage.gvo;
import defpackage.o4i;
import defpackage.xee;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.yhn;
import io.appmetrica.analytics.MviMetricsReporter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0780xf implements o4i {
    public Gf a;

    public static void a(gvo gvoVar, String str, String str2, long j, String str3, String str4) {
        if (Intrinsics.d(str2, "FirstInputTime")) {
            StringBuilder sb = new StringBuilder("MobileVelocityIndex.");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(gvoVar.getName());
            sb2.append(str.length() != 0 ? ".".concat(str) : "");
            sb2.append('.');
            sb.append(sb2.toString());
            sb.append("Additional.");
            sb.append(str2);
            sb.append(a(str4));
            String sb3 = sb.toString();
            Object obj = ComponentHistograms.b;
            y2x.u(xee.B(), sb3, 10L, 180000L, 50).c(j, TimeUnit.MILLISECONDS);
            return;
        }
        if (Intrinsics.d(str2, "InteractionCount")) {
            StringBuilder sb4 = new StringBuilder("MobileVelocityIndex.");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(gvoVar.getName());
            sb5.append(str.length() == 0 ? "" : ".".concat(str));
            sb5.append('.');
            sb4.append(sb5.toString());
            sb4.append("Additional.");
            sb4.append(str2);
            sb4.append(str3.length() != 0 ? ".".concat(str3) : "");
            String sb6 = sb4.toString();
            Object obj2 = ComponentHistograms.b;
            xee.B().b(sb6, 1, 1000, 50).b((int) j);
        }
    }

    @Override // defpackage.o4i
    public final void reportAdditionalMetric(gvo gvoVar, String str, long j, String str2, String str3) {
        Gf gf = this.a;
        if (gf == null) {
            Intrinsics.j("screenReportingDataProvider");
            throw null;
        }
        Set<String> b = ((Ff) gf).b(gvoVar);
        if (b.isEmpty()) {
            a(gvoVar, "", str, j, str2, str3);
            return;
        }
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            a(gvoVar, it.next(), str, j, str2, str3);
        }
    }

    @Override // defpackage.o4i
    public final void reportKeyMetric(gvo gvoVar, String str, long j, double d, String str2, String str3) {
        Gf gf = this.a;
        if (gf == null) {
            Intrinsics.j("screenReportingDataProvider");
            throw null;
        }
        Set<String> b = ((Ff) gf).b(gvoVar);
        if (b.isEmpty()) {
            a(gvoVar, "", j, d, str, str3);
            return;
        }
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            a(gvoVar, it.next(), j, d, str, str3);
        }
    }

    @Override // defpackage.o4i
    public final void reportTotalScore(gvo gvoVar, String str, double d, Map map) {
        Gf gf = this.a;
        if (gf == null) {
            Intrinsics.j("screenReportingDataProvider");
            throw null;
        }
        Set<String> b = ((Ff) gf).b(gvoVar);
        if (b.isEmpty()) {
            a(AbstractC0836zf.a(str), gvoVar, "", d, "");
        } else {
            Iterator<String> it = b.iterator();
            while (it.hasNext()) {
                a(AbstractC0836zf.a(str), gvoVar, it.next(), d, "");
            }
        }
        a(AbstractC0836zf.a(str), d, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004f  */
    @Override // defpackage.o4i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void reportTotalScoreStartupSpecific(gvo gvoVar, String str, double d, Map map, String str2) {
        MviMetricsReporter.StartupType startupType;
        int i;
        String str3;
        Gf gf;
        double d2;
        int hashCode = str2.hashCode();
        if (hashCode == 103501) {
            if (str2.equals("hot")) {
                startupType = MviMetricsReporter.StartupType.HOT;
                i = AbstractC0751wf.a[startupType.ordinal()];
                if (i == 1) {
                }
                String str4 = str3;
                gf = this.a;
                if (gf == null) {
                }
            }
            xq0.w("invalid startup type string: ".concat(str2));
        }
        if (hashCode == 3059428) {
            if (str2.equals("cold")) {
                startupType = MviMetricsReporter.StartupType.COLD;
                i = AbstractC0751wf.a[startupType.ordinal()];
                if (i == 1) {
                }
                String str42 = str3;
                gf = this.a;
                if (gf == null) {
                }
            }
            xq0.w("invalid startup type string: ".concat(str2));
        }
        if (hashCode == 3641989 && str2.equals("warm")) {
            startupType = MviMetricsReporter.StartupType.WARM;
            i = AbstractC0751wf.a[startupType.ordinal()];
            if (i == 1) {
                str3 = ".Cold";
            } else if (i == 2) {
                str3 = ".Warm";
            } else {
                if (i != 3) {
                    b6e.s();
                    return;
                }
                str3 = ".Hot";
            }
            String str422 = str3;
            gf = this.a;
            if (gf == null) {
                Intrinsics.j("screenReportingDataProvider");
                throw null;
            }
            Set<String> b = ((Ff) gf).b(gvoVar);
            if (b.isEmpty()) {
                d2 = d;
                a(AbstractC0836zf.a(str), gvoVar, "", d2, str422);
            } else {
                d2 = d;
                Iterator<String> it = b.iterator();
                while (it.hasNext()) {
                    a(AbstractC0836zf.a(str), gvoVar, it.next(), d2, str422);
                }
            }
            a(AbstractC0836zf.a(str), d2, str422);
            return;
        }
        xq0.w("invalid startup type string: ".concat(str2));
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportAdditionalMetric(gvo gvoVar, String str, long j, String str2) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportTotalScore(gvo gvoVar, double d, Map map) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportTotalScoreStartupSpecific(gvo gvoVar, double d, Map map, String str) {
    }

    public static void a(gvo gvoVar, String str, long j, double d, String str2, String str3) {
        StringBuilder sb = new StringBuilder("MobileVelocityIndex.");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(gvoVar.getName());
        sb2.append(str.length() == 0 ? "" : ".".concat(str));
        sb2.append('.');
        sb.append(sb2.toString());
        if (Intrinsics.d(str2, "FirstFrameDrawn")) {
            str2 = "FirstContentfulPaint";
        } else if (Intrinsics.d(str2, "FirstContentShown")) {
            str2 = "LargestContentfulPaint";
        }
        sb.append(str2);
        sb.append(a(str3));
        String sb3 = sb.toString();
        y2x.t(1L, 30000L, 100, sb3.concat(".Time")).c(j, TimeUnit.MILLISECONDS);
        if (d == -1.0d) {
            return;
        }
        y2x.z(sb3.concat(".Score")).b(yhn.e(eeh.a(d), new IntRange(0, 100, 1)));
    }

    public static void a(String str, gvo gvoVar, String str2, double d, String str3) {
        if (d == -1.0d) {
            return;
        }
        int e = yhn.e(eeh.a(d), new IntRange(0, 100, 1));
        StringBuilder sb = new StringBuilder();
        sb.append(gvoVar.getName());
        StringBuilder m = f1d.m("MobileVelocityIndex.", str, dfi.i(sb, str2.length() == 0 ? "" : ".".concat(str2), '.'), "Total", str3);
        m.append(".Score");
        y2x.z(m.toString()).b(e);
    }

    public static void a(String str, double d, String str2) {
        if (d == -1.0d) {
            return;
        }
        y2x.z("MobileVelocityIndex." + str + "Total" + str2 + ".Score").b(yhn.e(eeh.a(d), new IntRange(0, 100, 1)));
        StringBuilder sb = new StringBuilder("MobileVelocityIndex.");
        sb.append(str);
        sb.append("Total");
        String a = AbstractC0155bp.a(sb, str2, ".Scaled.x100.Score");
        int d2 = yhn.d(eeh.a(d * ((double) 100)), 0, 10000);
        a.getClass();
        Object obj = ComponentHistograms.b;
        xee.B().c(a, 10, 10010, 1002).b(d2);
    }

    public static String a(String str) {
        int hashCode = str.hashCode();
        if (hashCode == 103501) {
            if (!str.equals("hot")) {
                return "";
            }
            return ".Hot";
        }
        if (hashCode == 3059428) {
            if (str.equals("cold")) {
                return ".Cold";
            }
            return "";
        }
        if (hashCode == 3641989 && str.equals("warm")) {
            return ".Warm";
        }
        return "";
    }
}
