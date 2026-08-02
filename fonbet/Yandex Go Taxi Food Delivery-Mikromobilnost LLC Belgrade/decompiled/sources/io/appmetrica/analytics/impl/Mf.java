package io.appmetrica.analytics.impl;

import com.yandex.pulse.histogram.ComponentHistograms;
import defpackage.b64;
import defpackage.bd20;
import defpackage.d6w;
import defpackage.ffp0;
import defpackage.ffx;
import defpackage.jl40;
import defpackage.m810;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.vez0;
import defpackage.w511;
import defpackage.y6i0;
import io.appmetrica.analytics.MviMetricsReporter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class Mf implements bd20 {
    public Vf a;

    public static void a(ffp0 ffp0Var, String str, String str2, long j, String str3, String str4) {
        if (jl40.l(str2, "FirstInputTime")) {
            StringBuilder sb = new StringBuilder("MobileVelocityIndex.");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ffp0Var.getName());
            sb2.append(str.length() != 0 ? Extension.DOT_CHAR.concat(str) : "");
            sb2.append('.');
            sb.append(sb2.toString());
            sb.append("Additional.");
            sb.append(str2);
            sb.append(a(str4));
            ffx.O(sb.toString()).c(j, TimeUnit.MILLISECONDS);
            return;
        }
        if (jl40.l(str2, "InteractionCount")) {
            StringBuilder sb3 = new StringBuilder("MobileVelocityIndex.");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(ffp0Var.getName());
            sb4.append(str.length() == 0 ? "" : Extension.DOT_CHAR.concat(str));
            sb4.append('.');
            sb3.append(sb4.toString());
            sb3.append("Additional.");
            sb3.append(str2);
            sb3.append(str3.length() != 0 ? Extension.DOT_CHAR.concat(str3) : "");
            String sb5 = sb3.toString();
            Object obj = ComponentHistograms.b;
            vez0.u().b(1, 1000, 50, sb5).b((int) j);
        }
    }

    @Override // defpackage.bd20
    public final void reportAdditionalMetric(ffp0 ffp0Var, String str, long j, String str2, String str3) {
        Vf vf = this.a;
        if (vf == null) {
            vf = null;
        }
        Set<String> b = ((Uf) vf).b(ffp0Var);
        if (b.isEmpty()) {
            a(ffp0Var, "", str, j, str2, str3);
            return;
        }
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            a(ffp0Var, it.next(), str, j, str2, str3);
        }
    }

    @Override // defpackage.bd20
    public final void reportKeyMetric(ffp0 ffp0Var, String str, long j, double d, String str2, String str3) {
        Vf vf = this.a;
        if (vf == null) {
            vf = null;
        }
        Set<String> b = ((Uf) vf).b(ffp0Var);
        if (b.isEmpty()) {
            a(ffp0Var, "", j, d, str, str3);
            return;
        }
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            a(ffp0Var, it.next(), j, d, str, str3);
        }
    }

    @Override // defpackage.bd20
    public final void reportTotalScore(ffp0 ffp0Var, String str, double d, Map map) {
        Vf vf = this.a;
        if (vf == null) {
            vf = null;
        }
        Set<String> b = ((Uf) vf).b(ffp0Var);
        if (b.isEmpty()) {
            a(Of.a(str), ffp0Var, "", d, "");
        } else {
            Iterator<String> it = b.iterator();
            while (it.hasNext()) {
                a(Of.a(str), ffp0Var, it.next(), d, "");
            }
        }
        a(Of.a(str), d, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004f  */
    @Override // defpackage.bd20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void reportTotalScoreStartupSpecific(ffp0 ffp0Var, String str, double d, Map map, String str2) {
        MviMetricsReporter.StartupType startupType;
        int i;
        String str3;
        Vf vf;
        Set<String> b;
        double d2;
        int hashCode = str2.hashCode();
        if (hashCode == 103501) {
            if (str2.equals("hot")) {
                startupType = MviMetricsReporter.StartupType.HOT;
                i = Lf.a[startupType.ordinal()];
                if (i == 1) {
                }
                String str4 = str3;
                vf = this.a;
                if (vf == null) {
                }
                b = ((Uf) vf).b(ffp0Var);
                if (b.isEmpty()) {
                }
                a(Of.a(str), d2, str4);
                return;
            }
            ny61.f("invalid startup type string: ".concat(str2));
        }
        if (hashCode == 3059428) {
            if (str2.equals("cold")) {
                startupType = MviMetricsReporter.StartupType.COLD;
                i = Lf.a[startupType.ordinal()];
                if (i == 1) {
                }
                String str42 = str3;
                vf = this.a;
                if (vf == null) {
                }
                b = ((Uf) vf).b(ffp0Var);
                if (b.isEmpty()) {
                }
                a(Of.a(str), d2, str42);
                return;
            }
            ny61.f("invalid startup type string: ".concat(str2));
        }
        if (hashCode == 3641989 && str2.equals("warm")) {
            startupType = MviMetricsReporter.StartupType.WARM;
            i = Lf.a[startupType.ordinal()];
            if (i == 1) {
                str3 = ".Cold";
            } else if (i == 2) {
                str3 = ".Warm";
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                str3 = ".Hot";
            }
            String str422 = str3;
            vf = this.a;
            if (vf == null) {
                vf = null;
            }
            b = ((Uf) vf).b(ffp0Var);
            if (b.isEmpty()) {
                d2 = d;
                a(Of.a(str), ffp0Var, "", d2, str422);
            } else {
                d2 = d;
                Iterator<String> it = b.iterator();
                while (it.hasNext()) {
                    a(Of.a(str), ffp0Var, it.next(), d2, str422);
                }
            }
            a(Of.a(str), d2, str422);
            return;
        }
        ny61.f("invalid startup type string: ".concat(str2));
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportAdditionalMetric(ffp0 ffp0Var, String str, long j, String str2) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportTotalScore(ffp0 ffp0Var, double d, Map map) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void reportTotalScoreStartupSpecific(ffp0 ffp0Var, double d, Map map, String str) {
    }

    public static void a(ffp0 ffp0Var, String str, long j, double d, String str2, String str3) {
        StringBuilder sb = new StringBuilder("MobileVelocityIndex.");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ffp0Var.getName());
        sb2.append(str.length() == 0 ? "" : Extension.DOT_CHAR.concat(str));
        sb2.append('.');
        sb.append(sb2.toString());
        if (jl40.l(str2, "FirstFrameDrawn")) {
            str2 = "FirstContentfulPaint";
        } else if (jl40.l(str2, "FirstContentShown")) {
            str2 = "LargestContentfulPaint";
        }
        sb.append(str2);
        sb.append(a(str3));
        String sb3 = sb.toString();
        String concat = sb3.concat(".Time");
        Object obj = ComponentHistograms.b;
        ffx.J(vez0.u(), concat, 1L, 30000L, 100).c(j, TimeUnit.MILLISECONDS);
        if (d == -1.0d) {
            return;
        }
        ffx.Q(sb3.concat(".Score")).b(y6i0.e(m810.a(d), new d6w(0, 100, 1)));
    }

    public static void a(String str, ffp0 ffp0Var, String str2, double d, String str3) {
        if (d == -1.0d) {
            return;
        }
        int e = y6i0.e(m810.a(d), new d6w(0, 100, 1));
        StringBuilder sb = new StringBuilder();
        sb.append(ffp0Var.getName());
        StringBuilder v = b64.v("MobileVelocityIndex.", str, b64.p(sb, str2.length() == 0 ? "" : Extension.DOT_CHAR.concat(str2), '.'), "Total", str3);
        v.append(".Score");
        ffx.Q(v.toString()).b(e);
    }

    public static void a(String str, double d, String str2) {
        if (d == -1.0d) {
            return;
        }
        ffx.Q("MobileVelocityIndex." + str + "Total" + str2 + ".Score").b(y6i0.e(m810.a(d), new d6w(0, 100, 1)));
        StringBuilder sb = new StringBuilder("MobileVelocityIndex.");
        sb.append(str);
        sb.append("Total");
        String t = oyr.t(sb, str2, ".Scaled.x100.Score");
        int d2 = y6i0.d(m810.a(d * 100.0d), 0, 10000);
        Object obj = ComponentHistograms.b;
        vez0.u().c(10, 10010, 1002, t).b(d2);
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
