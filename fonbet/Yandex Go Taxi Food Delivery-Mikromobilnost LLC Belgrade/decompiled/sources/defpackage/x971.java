package defpackage;

import android.media.metrics.PlaybackMetrics;
import java.util.HashMap;
import java.util.Random;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes7.dex */
public final class x971 {
    public static final vm61 g = new vm61(1);
    public static final Random h = new Random();
    public b171 d;
    public String f;
    public final uk81 a = new uk81();
    public final ie81 b = new ie81();
    public final HashMap c = new HashMap();
    public yn81 e = yn81.b;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q671 a(int i, v281 v281Var) {
        long j;
        HashMap hashMap = this.c;
        q671 q671Var = null;
        long j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        for (q671 q671Var2 : hashMap.values()) {
            long j3 = q671Var2.c;
            v281 v281Var2 = q671Var2.d;
            if (j3 == -1 && i == q671Var2.b && v281Var != null) {
                q671Var2.c = v281Var.d;
            }
            if (v281Var != null) {
                long j4 = v281Var.d;
                if (v281Var2 == null) {
                    if (!v281Var.a() && j4 == q671Var2.c) {
                        j = q671Var2.c;
                        if (j == -1) {
                        }
                        q671Var = q671Var2;
                        j2 = j;
                    }
                } else if (j4 == v281Var2.d && v281Var.b == v281Var2.b && v281Var.c == v281Var2.c) {
                    j = q671Var2.c;
                    if (j == -1) {
                    }
                    q671Var = q671Var2;
                    j2 = j;
                }
            } else if (i == q671Var2.b) {
                j = q671Var2.c;
                if (j == -1 || j < j2) {
                    q671Var = q671Var2;
                    j2 = j;
                } else if (j == j2) {
                    int i2 = rf71.a;
                    if (q671Var.d != null && v281Var2 != null) {
                        q671Var = q671Var2;
                    }
                }
            }
        }
        if (q671Var != null) {
            return q671Var;
        }
        String str = (String) g.get();
        q671 q671Var3 = new q671(this, str, i, v281Var);
        hashMap.put(str, q671Var3);
        return q671Var3;
    }

    public final void b(wc71 wc71Var) {
        v281 v281Var;
        yn81 yn81Var = wc71Var.b;
        int i = wc71Var.c;
        v281 v281Var2 = wc71Var.d;
        if (yn81Var.c()) {
            this.f = null;
            return;
        }
        q671 q671Var = (q671) this.c.get(this.f);
        this.f = a(i, v281Var2).a;
        c(wc71Var);
        if (v281Var2 == null || !v281Var2.a()) {
            return;
        }
        if (q671Var != null && q671Var.c == v281Var2.d && (v281Var = q671Var.d) != null && v281Var.b == v281Var2.b && v281Var.c == v281Var2.c) {
            return;
        }
        a(i, new v281(v281Var2.a, -1, -1, v281Var2.d, -1));
        this.d.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r1.d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(wc71 wc71Var) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        try {
            this.d.getClass();
        } finally {
        }
        if (wc71Var.b.c()) {
            return;
        }
        q671 q671Var = (q671) this.c.get(this.f);
        v281 v281Var = wc71Var.d;
        if (v281Var != null && q671Var != null) {
            long j = q671Var.c;
            if (j == -1) {
                if (q671Var.b != wc71Var.c) {
                    return;
                }
            }
        }
        q671 a = a(wc71Var.c, v281Var);
        if (this.f == null) {
            this.f = a.a;
        }
        v281 v281Var2 = wc71Var.d;
        if (v281Var2 != null && v281Var2.a()) {
            v281 v281Var3 = wc71Var.d;
            q671 a2 = a(wc71Var.c, new v281(v281Var3.a, v281Var3.d, v281Var3.b));
            if (!a2.e) {
                a2.e = true;
                wc71Var.b.a(wc71Var.d.a, this.b);
                ie81 ie81Var = this.b;
                long j2 = ie81Var.z.a(wc71Var.d.b).a;
                int i = rf71.a;
                long j3 = this.b.x;
                this.d.getClass();
            }
        }
        if (!a.e) {
            a.e = true;
            this.d.getClass();
        }
        if (a.a.equals(this.f) && !a.f) {
            a.f = true;
            b171 b171Var = this.d;
            String str = a.a;
            b171Var.getClass();
            v281 v281Var4 = wc71Var.d;
            if (v281Var4 == null || !v281Var4.a()) {
                b171Var.a();
                b171Var.i = str;
                playerName = xbm.k().setPlayerName("ExoPlayerLib");
                playerVersion = playerName.setPlayerVersion("2.18.1");
                b171Var.j = playerVersion;
                b171Var.c(wc71Var.b, wc71Var.d);
            }
        }
    }
}
