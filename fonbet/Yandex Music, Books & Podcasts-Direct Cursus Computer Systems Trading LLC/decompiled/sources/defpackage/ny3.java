package defpackage;

import androidx.fragment.app.t;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class ny3 {
    public final fy3 a;
    public final az3 b;
    public final t c;
    public final qy7 d;
    public final qwu e;
    public final k6l f;
    public final uwu g;
    public final kxi h;
    public final nmj i;
    public final cvo j;
    public final tmb k;
    public final xdr l;

    public ny3(fy3 fy3Var, az3 az3Var, t tVar, qy7 qy7Var, qwu qwuVar, k6l k6lVar, uwu uwuVar, kxi kxiVar, nmj nmjVar, cvo cvoVar, tmb tmbVar, boolean z) {
        qy7Var.getClass();
        qwuVar.getClass();
        k6lVar.getClass();
        uwuVar.getClass();
        nmjVar.getClass();
        cvoVar.getClass();
        this.a = fy3Var;
        this.b = az3Var;
        this.c = tVar;
        this.d = qy7Var;
        this.e = qwuVar;
        this.f = k6lVar;
        this.g = uwuVar;
        this.h = kxiVar;
        this.i = nmjVar;
        this.j = cvoVar;
        this.k = tmbVar;
        if (!z) {
            nmb nmbVar = (nmb) az3Var.o.c;
            emb[] embVarArr = emb.a;
            nmbVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("stories_type", "promo_stories");
            linkedHashMap.put("_meta", nmb.u(1));
            nmbVar.C("Stories.Opened", linkedHashMap);
        }
        this.l = az3Var.n;
    }

    public final void a() {
        bz2 bz2Var = this.b.o;
        Integer b = b();
        Integer c = c();
        nmb nmbVar = (nmb) bz2Var.c;
        emb[] embVarArr = emb.a;
        int intValue = b != null ? b.intValue() : 0;
        int intValue2 = c != null ? c.intValue() : 0;
        nmbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("stories_type", "promo_stories");
        ouj.y(intValue, linkedHashMap, "stories_count", intValue2, "stories_pos");
        dfi.p(1, "stories_name", "", "_meta", linkedHashMap);
        nmbVar.C("Stories.Closed", linkedHashMap);
        this.a.a.finish();
    }

    public final Integer b() {
        wy3 wy3Var = (wy3) this.l.getValue();
        wy3Var.getClass();
        vy3 vy3Var = wy3Var instanceof vy3 ? (vy3) wy3Var : null;
        if (vy3Var != null) {
            return Integer.valueOf(vy3Var.a.size());
        }
        return null;
    }

    public final Integer c() {
        wy3 wy3Var = (wy3) this.l.getValue();
        wy3Var.getClass();
        vy3 vy3Var = wy3Var instanceof vy3 ? (vy3) wy3Var : null;
        if (vy3Var != null) {
            return Integer.valueOf(vy3Var.b);
        }
        return null;
    }

    public final void d(int i, p6g p6gVar) {
        gmb gmbVar;
        bz2 bz2Var = this.b.o;
        Integer b = b();
        bz2Var.getClass();
        nmb nmbVar = (nmb) bz2Var.c;
        emb[] embVarArr = emb.a;
        int intValue = b != null ? b.intValue() : -1;
        if (p6gVar.equals(vur.a)) {
            gmbVar = gmb.Left;
        } else {
            if (!p6gVar.equals(wur.a)) {
                b6e.s();
                return;
            }
            gmbVar = gmb.Right;
        }
        nmbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("stories_type", "promo_stories");
        ouj.y(intValue, linkedHashMap, "stories_count", i, "stories_pos");
        linkedHashMap.put("stories_name", "");
        dfi.p(1, "swipe_side", gmbVar.a, "_meta", linkedHashMap);
        nmbVar.C("Stories.Swiped", linkedHashMap);
    }

    public final void e() {
        bz2 bz2Var = this.b.o;
        Integer b = b();
        Integer c = c();
        nmb nmbVar = (nmb) bz2Var.c;
        emb[] embVarArr = emb.a;
        int intValue = b != null ? b.intValue() : -1;
        int intValue2 = c != null ? c.intValue() : -1;
        nmbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("stories_type", "promo_stories");
        ouj.y(intValue, linkedHashMap, "stories_count", intValue2, "stories_pos");
        dfi.p(1, "stories_name", "", "_meta", linkedHashMap);
        nmbVar.C("Stories.Button.Showed", linkedHashMap);
    }

    public final void f() {
        az3 az3Var = this.b;
        Object value = az3Var.n.getValue();
        vy3 vy3Var = value instanceof vy3 ? (vy3) value : null;
        if (vy3Var == null) {
            return;
        }
        int i = vy3Var.b;
        az3Var.H(i == 0 ? vy3Var.a.size() - 1 : i - 1);
        d(i, vur.a);
    }

    public final void g() {
        az3 az3Var = this.b;
        wy3 wy3Var = (wy3) az3Var.n.getValue();
        wy3Var.getClass();
        vy3 vy3Var = wy3Var instanceof vy3 ? (vy3) wy3Var : null;
        if (vy3Var == null) {
            return;
        }
        int i = vy3Var.b;
        az3Var.H(i == vy3Var.a.size() + (-1) ? 0 : i + 1);
        d(i, wur.a);
    }
}
