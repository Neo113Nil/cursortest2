package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s891 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final zzbe f;

    public s891(g gVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzbe zzbeVar;
        cvw.i(str2);
        cvw.i(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.C.b(y1a1.Og(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.z.a("Param name can't be null");
                    it.remove();
                } else {
                    ieb1 ieb1Var = gVar.B;
                    g.e(ieb1Var);
                    Object Ng = ieb1Var.Ng(bundle2.get(next), next);
                    if (Ng == null) {
                        y1a1 y1a1Var3 = gVar.y;
                        g.g(y1a1Var3);
                        y1a1Var3.C.b(gVar.C.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        ieb1 ieb1Var2 = gVar.B;
                        g.e(ieb1Var2);
                        ieb1Var2.Vg(bundle2, next, Ng);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.f = zzbeVar;
    }

    public final s891 a(g gVar, long j) {
        return new s891(gVar, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String zzbeVar = this.f.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + zzbeVar.length() + 1);
        g8e.D(sb, "Event{appId='", str, "', name='", str2);
        return unr0.r(sb, "', params=", zzbeVar, "}");
    }

    public s891(g gVar, String str, String str2, String str3, long j, long j2, zzbe zzbeVar) {
        cvw.i(str2);
        cvw.i(str3);
        cvw.l(zzbeVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.C.c("Event created with reverse previous/current timestamps. appId, name", y1a1.Og(str2), y1a1.Og(str3));
        }
        this.f = zzbeVar;
    }
}
