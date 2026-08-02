package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;

/* loaded from: classes.dex */
public final class zgx {
    public static final msg d = new msg("ApplicationAnalyticsUtils", null);
    public static final String e = "22.0.0";
    public final String a;
    public final Map b;
    public final Map c;

    public zgx(Bundle bundle, String str) {
        this.a = str;
        this.b = lsq.H(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.c = lsq.H(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ohx a(mgx mgxVar, int i) {
        int i2;
        Map map;
        int i3;
        nhx b = b(mgxVar);
        hhx n = ihx.n(b.d());
        Map map2 = this.c;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i);
            if (map2.containsKey(valueOf)) {
                Integer num = (Integer) map2.get(valueOf);
                y1g.G(num);
                i2 = num.intValue();
                n.c();
                ihx.v((ihx) n.b, i2);
                map = this.b;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = (Integer) map.get(valueOf2);
                        y1g.G(num2);
                        i3 = num2.intValue();
                        n.c();
                        ihx.r((ihx) n.b, i3);
                        b.e((ihx) n.b());
                        return (ohx) b.b();
                    }
                }
                i3 = i + 10000;
                n.c();
                ihx.r((ihx) n.b, i3);
                b.e((ihx) n.b());
                return (ohx) b.b();
            }
        }
        i2 = i + 10000;
        n.c();
        ihx.v((ihx) n.b, i2);
        map = this.b;
        if (map != null) {
        }
        i3 = i + 10000;
        n.c();
        ihx.r((ihx) n.b, i3);
        b.e((ihx) n.b());
        return (ohx) b.b();
    }

    public final nhx b(mgx mgxVar) {
        long j;
        nhx n = ohx.n();
        long j2 = mgxVar.d;
        n.c();
        ohx.A((ohx) n.b, j2);
        int i = mgxVar.e;
        mgxVar.e = i + 1;
        n.c();
        ohx.u((ohx) n.b, i);
        String str = mgxVar.c;
        if (str != null) {
            n.c();
            ohx.x((ohx) n.b, str);
        }
        akx m = bkx.m();
        if (!TextUtils.isEmpty(mgxVar.h)) {
            String str2 = mgxVar.h;
            n.c();
            ohx.t((ohx) n.b, str2);
            String str3 = mgxVar.h;
            m.c();
            bkx.p((bkx) m.b, str3);
        }
        if (!TextUtils.isEmpty(mgxVar.i)) {
            String str4 = mgxVar.i;
            m.c();
            bkx.q((bkx) m.b, str4);
        }
        if (!TextUtils.isEmpty(mgxVar.j)) {
            String str5 = mgxVar.j;
            m.c();
            bkx.r((bkx) m.b, str5);
        }
        if (!TextUtils.isEmpty(mgxVar.k)) {
            String str6 = mgxVar.k;
            m.c();
            bkx.n((bkx) m.b, str6);
        }
        if (!TextUtils.isEmpty(mgxVar.l)) {
            String str7 = mgxVar.l;
            m.c();
            bkx.o((bkx) m.b, str7);
        }
        if (!TextUtils.isEmpty(mgxVar.m)) {
            String str8 = mgxVar.m;
            m.c();
            bkx.s((bkx) m.b, str8);
        }
        bkx bkxVar = (bkx) m.b();
        n.c();
        ohx.w((ohx) n.b, bkxVar);
        xgx m2 = ygx.m();
        m2.c();
        ygx.o((ygx) m2.b, e);
        m2.c();
        ygx.n((ygx) m2.b, this.a);
        ygx ygxVar = (ygx) m2.b();
        n.c();
        ohx.p((ohx) n.b, ygxVar);
        hhx m3 = ihx.m();
        if (mgxVar.b != null) {
            lix m4 = mix.m();
            String str9 = mgxVar.b;
            m4.c();
            mix.n((mix) m4.b, str9);
            mix mixVar = (mix) m4.b();
            m3.c();
            ihx.p((ihx) m3.b, mixVar);
        }
        m3.c();
        ihx.u((ihx) m3.b, false);
        String str10 = mgxVar.f;
        if (str10 != null) {
            try {
                String replace = str10.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e2) {
                msg msgVar = d;
                Log.w(msgVar.a, msgVar.d("receiverSessionId %s is not valid for hash", str10), e2);
                j = 0;
            }
            m3.c();
            ihx.w((ihx) m3.b, j);
        }
        int i2 = mgxVar.g;
        m3.c();
        ihx.q((ihx) m3.b, i2);
        boolean z = mgxVar.a.i == 2;
        m3.c();
        ihx.s((ihx) m3.b, z);
        boolean z2 = mgxVar.n;
        m3.c();
        ihx.t((ihx) m3.b, z2);
        n.c();
        ohx.r((ohx) n.b, (ihx) m3.b());
        return n;
    }
}
