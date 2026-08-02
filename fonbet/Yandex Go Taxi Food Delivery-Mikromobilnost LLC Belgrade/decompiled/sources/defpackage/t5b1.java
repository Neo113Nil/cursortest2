package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class t5b1 extends sab1 {
    public final u4a1 A;
    public final u4a1 B;
    public final u4a1 C;
    public final u4a1 D;
    public final HashMap x;
    public final u4a1 y;
    public final u4a1 z;

    public t5b1(n nVar) {
        super(nVar);
        this.x = new HashMap();
        o5a1 o5a1Var = ((g) this.b).x;
        g.e(o5a1Var);
        this.y = new u4a1(o5a1Var, "last_delete_stale", 0L);
        o5a1 o5a1Var2 = ((g) this.b).x;
        g.e(o5a1Var2);
        this.z = new u4a1(o5a1Var2, "last_delete_stale_batch", 0L);
        o5a1 o5a1Var3 = ((g) this.b).x;
        g.e(o5a1Var3);
        this.A = new u4a1(o5a1Var3, "backoff", 0L);
        o5a1 o5a1Var4 = ((g) this.b).x;
        g.e(o5a1Var4);
        this.B = new u4a1(o5a1Var4, "last_upload", 0L);
        o5a1 o5a1Var5 = ((g) this.b).x;
        g.e(o5a1Var5);
        this.C = new u4a1(o5a1Var5, "last_upload_attempt", 0L);
        o5a1 o5a1Var6 = ((g) this.b).x;
        g.e(o5a1Var6);
        this.D = new u4a1(o5a1Var6, "midnight_offset", 0L);
    }

    @Override // defpackage.sab1
    public final void Jg() {
    }

    public final Pair Kg(String str) {
        o5b1 o5b1Var;
        AdvertisingIdClient.Info info;
        Gg();
        g gVar = (g) this.b;
        kl40 kl40Var = gVar.D;
        j691 j691Var = gVar.w;
        kl40Var.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.x;
        o5b1 o5b1Var2 = (o5b1) hashMap.get(str);
        if (o5b1Var2 != null && elapsedRealtime < o5b1Var2.c) {
            return new Pair(o5b1Var2.a, Boolean.valueOf(o5b1Var2.b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long Ng = j691Var.Ng(str, nw91.b) + elapsedRealtime;
        try {
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(gVar.a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (o5b1Var2 != null && elapsedRealtime < o5b1Var2.c + j691Var.Ng(str, nw91.c)) {
                    return new Pair(o5b1Var2.a, Boolean.valueOf(o5b1Var2.b));
                }
                info = null;
            }
        } catch (Exception e) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.G.b(e, "Unable to get advertising id");
            o5b1Var = new o5b1("", Ng, false);
        }
        if (info == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id = info.getId();
        o5b1Var = id != null ? new o5b1(id, Ng, info.isLimitAdTrackingEnabled()) : new o5b1("", Ng, info.isLimitAdTrackingEnabled());
        hashMap.put(str, o5b1Var);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(o5b1Var.a, Boolean.valueOf(o5b1Var.b));
    }

    public final String Lg(String str, boolean z) {
        Gg();
        String str2 = z ? (String) Kg(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest Xg = ieb1.Xg();
        if (Xg == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, Xg.digest(str2.getBytes())));
    }
}
