package com.gamericefishpro.space.n9;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 extends g4 {
    public final d1 A;
    public final d1 B;
    public final d1 C;
    public final HashMap v;
    public final d1 w;
    public final d1 y;
    public final d1 z;

    public q3(m4 m4Var) {
        super(m4Var);
        this.v = new HashMap();
        f1 f1Var = ((r1) this.d).w;
        r1.j(f1Var);
        this.w = new d1(f1Var, "last_delete_stale", 0L);
        f1 f1Var2 = ((r1) this.d).w;
        r1.j(f1Var2);
        this.y = new d1(f1Var2, "last_delete_stale_batch", 0L);
        f1 f1Var3 = ((r1) this.d).w;
        r1.j(f1Var3);
        this.z = new d1(f1Var3, "backoff", 0L);
        f1 f1Var4 = ((r1) this.d).w;
        r1.j(f1Var4);
        this.A = new d1(f1Var4, "last_upload", 0L);
        f1 f1Var5 = ((r1) this.d).w;
        r1.j(f1Var5);
        this.B = new d1(f1Var5, "last_upload_attempt", 0L);
        f1 f1Var6 = ((r1) this.d).w;
        r1.j(f1Var6);
        this.C = new d1(f1Var6, "midnight_offset", 0L);
    }

    public final Pair v(String str) {
        p3 p3Var;
        com.gamericefishpro.space.o8.a aVarA;
        r();
        r1 r1Var = (r1) this.d;
        com.gamericefishpro.space.z8.a aVar = r1Var.D;
        g gVar = r1Var.v;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.v;
        p3 p3Var2 = (p3) map.get(str);
        if (p3Var2 != null && jElapsedRealtime < p3Var2.c) {
            return new Pair(p3Var2.a, Boolean.valueOf(p3Var2.b));
        }
        long jY = gVar.y(str, e0.b) + jElapsedRealtime;
        try {
            try {
                aVarA = com.gamericefishpro.space.o8.b.a(r1Var.d);
            } catch (PackageManager.NameNotFoundException unused) {
                if (p3Var2 != null && jElapsedRealtime < p3Var2.c + gVar.y(str, e0.c)) {
                    return new Pair(p3Var2.a, Boolean.valueOf(p3Var2.b));
                }
                aVarA = null;
            }
            if (aVarA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = aVarA.c;
            p3Var = str2 != null ? new p3(str2, jY, aVarA.b) : new p3("", jY, aVarA.b);
            map.put(str, p3Var);
            return new Pair(p3Var.a, Boolean.valueOf(p3Var.b));
        } catch (Exception e) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.F.b(e, "Unable to get advertising id");
            p3Var = new p3("", jY, false);
        }
    }

    public final String w(String str, boolean z) {
        r();
        String str2 = z ? (String) v(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestI = r4.I();
        if (messageDigestI == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestI.digest(str2.getBytes())));
    }

    @Override // com.gamericefishpro.space.n9.g4
    public final void u() {
    }
}
