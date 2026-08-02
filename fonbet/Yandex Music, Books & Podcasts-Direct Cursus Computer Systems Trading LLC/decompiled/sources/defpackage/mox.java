package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class mox {
    public static final msg u = new msg("SessionFlowSummary", null);
    public static final String v = "22.0.0";
    public static long w = System.currentTimeMillis();
    public final sbx f;
    public final String g;
    public final long i;
    public p84 j;
    public String k;
    public String l;
    public q03 m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public int t;
    public final pbx a = new pbx(new t7l(10));
    public final List b = Collections.synchronizedList(new ArrayList());
    public final List c = Collections.synchronizedList(new ArrayList());
    public final List d = Collections.synchronizedList(new ArrayList());
    public final Map e = Collections.synchronizedMap(new HashMap());
    public final long h = System.currentTimeMillis();

    public mox(sbx sbxVar, String str) {
        this.f = sbxVar;
        this.g = str;
        long j = w;
        w = 1 + j;
        this.i = j;
    }

    public final void a(p84 p84Var) {
        if (p84Var == null) {
            b(2);
            return;
        }
        CastDevice d = p84Var.d();
        if (d == null) {
            b(3);
            return;
        }
        this.j = p84Var;
        String str = this.l;
        String str2 = d.l;
        if (str != null) {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            b(5);
            return;
        }
        this.l = str2;
        this.n = d.e;
        e0x f = d.f();
        if (f != null) {
            this.o = f.d;
            this.p = f.e;
            this.q = f.f;
            this.r = f.g;
            this.s = f.h;
        }
        p84Var.b();
    }

    public final void b(int i) {
        Integer valueOf = Integer.valueOf(i - 1);
        Map map = this.e;
        o0x o0xVar = (o0x) map.get(valueOf);
        if (o0xVar != null) {
            o0xVar.d.incrementAndGet();
            o0xVar.b = System.currentTimeMillis();
        } else {
            o0x o0xVar2 = new o0x(new jsg(i, 18));
            o0xVar2.c = this.h;
            map.put(valueOf, o0xVar2);
        }
    }
}
