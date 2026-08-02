package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.order.domain.repositories.n;
import io.flutter.plugin.common.FlutterException;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.mvp.SummaryPromotionModalWindowsModalView;

/* loaded from: classes6.dex */
public final class qtb1 implements pi1, cho, zme, vo8, wfj, ywm, xg41, ejr, fa20, fx30, g0a0, s1c0, c5c0, wpe0, m8j0, zyn0, pcr0 {
    public static qtb1 a;
    public static final qtb1 b = new qtb1();
    public static final qtb1 c = new qtb1();
    public static final qtb1 w = new qtb1();
    public static final qtb1 x = new qtb1();
    public static final qtb1 y = new qtb1();
    public static final w82 z = new w82(1);
    public static final w82 A = new w82(2);
    public static final qtb1 B = new qtb1();
    public static final qtb1 C = new qtb1();
    public static final qtb1 D = new qtb1();
    public static final qtb1 E = new qtb1();
    public static final qtb1 F = new qtb1();
    public static final qtb1 G = new qtb1();
    public static final qtb1 H = new qtb1();
    public static final ny60 I = new ny60();
    public static final qtb1 J = new qtb1();
    public static final qtb1 K = new qtb1();
    public static final qtb1 L = new qtb1();
    public static final qtb1 M = new qtb1();
    public static final qtb1 N = new qtb1();
    public static final qtb1 O = new qtb1();
    public static final d7g0 P = new d7g0(20);
    public static final qtb1 Q = new qtb1();

    public static teh j(tls tlsVar, tls tlsVar2, sls slsVar, sls slsVar2, sls slsVar3, wx30 wx30Var, wx30 wx30Var2, int i) {
        return new teh((i & 128) == 0, (i & 1) != 0 ? null : tlsVar, (i & 2) != 0 ? null : tlsVar2, (i & 4) != 0 ? null : slsVar, (i & 8) != 0 ? null : slsVar2, (i & 16) != 0 ? null : slsVar3, (i & 32) != 0 ? null : wx30Var, (i & 64) != 0 ? null : wx30Var2);
    }

    public static ojj k() {
        return new ojj();
    }

    public static xju m(g gVar) {
        return new xju(gVar);
    }

    public static luv n(i6r i6rVar) {
        i6rVar.getClass();
        q1g q1gVar = new q1g(i6rVar, 21);
        q1g q1gVar2 = new q1g(i6rVar, 20);
        int i = 10;
        int i2 = 7;
        sk21 sk21Var = new sk21(q1gVar2, new d2g(i6rVar, i), new q1g(i6rVar, 26), i2);
        q1g q1gVar3 = new q1g(i6rVar, 16);
        int i3 = 11;
        d2g d2gVar = new d2g(i6rVar, i3);
        d2g d2gVar2 = new d2g(i6rVar, 4);
        t4 t4Var = new t4(sk21Var, q1gVar3, d2gVar, d2gVar2, 0);
        int i4 = 5;
        u6o0 u6o0Var = new u6o0(new h1t(new q1g(i6rVar, 29), i3), q1gVar, new d2g(i6rVar, i4), new q1g(i6rVar, 25), new q1g(i6rVar, 24), new d2g(i6rVar, 0), 7);
        h1t h1tVar = new h1t(d2gVar2, 12);
        prq prqVar = new prq((xvf0) q1gVar, (xvf0) t4Var, (xvf0) u6o0Var, (xvf0) h1tVar, (xvf0) new d2g(i6rVar, i2), 14);
        q1g q1gVar4 = new q1g(i6rVar, 17);
        int i5 = 2;
        d2g d2gVar3 = new d2g(i6rVar, i5);
        int i6 = 3;
        int i7 = 9;
        e3u e3uVar = new e3u((xvf0) new qzb(new q1g(i6rVar, 19), i6), (xvf0) new x4((xvf0) new d2g(i6rVar, 1), (xvf0) new q1g(i6rVar, 22), (xvf0) new q1g(i6rVar, 23), (v7p) new kgn(new q1g(i6rVar, 28), i5), (xvf0) q1gVar2, (xvf0) new d2g(i6rVar, i6), 0), (xvf0) new h1t(new h1t(new q1g(i6rVar, 27), i), i7), i4);
        d2g d2gVar4 = new d2g(i6rVar, 6);
        d2g d2gVar5 = new d2g(i6rVar, 8);
        gaq0 gaq0Var = new gaq0(h1tVar, i4);
        eqh eqhVar = new eqh();
        d2g d2gVar6 = new d2g(i6rVar, i7);
        q1g q1gVar5 = new q1g(i6rVar, 18);
        eqh.a(eqhVar, new jpn0(q1gVar4, d2gVar3, gaq0Var, e3uVar, d2gVar5, eqhVar, d2gVar6, q1gVar5, 8, false));
        return new luv(new gc((Object) prqVar, (xvf0) q1gVar4, (xvf0) d2gVar3, (xvf0) e3uVar, (xvf0) d2gVar4, (xvf0) d2gVar5, (xvf0) eqhVar, (xvf0) d2gVar6, (xvf0) q1gVar5, 21));
    }

    public static n o(fup0 fup0Var) {
        return fup0Var.a(j73.f0(new DriveState[]{DriveState.PREORDER, DriveState.SEARCH}));
    }

    public static duv p(rqo rqoVar) {
        return new duv(rqoVar);
    }

    public static i6j0 q(MainScreenBehavior mainScreenBehavior, h3y h3yVar) {
        int i = k800.a[mainScreenBehavior.ordinal()];
        if (i == 1) {
            return j6j0.a;
        }
        if (i == 2) {
            return new l800(h3yVar);
        }
        w511.b();
        return null;
    }

    public static xlt0 r(GridLayoutManager gridLayoutManager) {
        return new xlt0(gridLayoutManager);
    }

    public static synchronized void s() {
        synchronized (qtb1.class) {
            if (a == null) {
                a = new qtb1();
            }
        }
    }

    @Override // defpackage.fa20
    public x920 a(ByteBuffer byteBuffer) {
        Object nextValue;
        try {
            if (byteBuffer == null) {
                nextValue = null;
            } else {
                try {
                    zsu0.b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(zsu0.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Invalid JSON", e);
                }
            }
            if (nextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) nextValue;
                Object obj = jSONObject.get("method");
                Object opt = jSONObject.opt("args");
                if (opt == JSONObject.NULL) {
                    opt = null;
                }
                if (obj instanceof String) {
                    return new x920((String) obj, opt);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + nextValue);
        } catch (JSONException e2) {
            yci0.p("Invalid JSON", e2);
            return null;
        }
    }

    @Override // defpackage.pi1
    public Object b(c551 c551Var, Map map, vpr vprVar, boolean z2, Continuation continuation) {
        return zy11.a;
    }

    @Override // defpackage.fa20
    public ByteBuffer c(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(iab1.d(str)).put(JSONObject.NULL).put(iab1.d(str2));
        if (put == null) {
            return null;
        }
        Object d = iab1.d(put);
        if (d instanceof String) {
            zsu0 zsu0Var = zsu0.b;
            String quote = JSONObject.quote((String) d);
            zsu0Var.getClass();
            return zsu0.d(quote);
        }
        zsu0 zsu0Var2 = zsu0.b;
        String obj = d.toString();
        zsu0Var2.getClass();
        return zsu0.d(obj);
    }

    @Override // defpackage.fa20
    public ByteBuffer d(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(iab1.d(str2)).put(iab1.d(obj));
        if (put == null) {
            return null;
        }
        Object d = iab1.d(put);
        if (d instanceof String) {
            zsu0 zsu0Var = zsu0.b;
            String quote = JSONObject.quote((String) d);
            zsu0Var.getClass();
            return zsu0.d(quote);
        }
        zsu0 zsu0Var2 = zsu0.b;
        String obj2 = d.toString();
        zsu0Var2.getClass();
        return zsu0.d(obj2);
    }

    @Override // defpackage.fa20
    public ByteBuffer e(Object obj) {
        JSONArray put = new JSONArray().put(iab1.d(obj));
        if (put == null) {
            return null;
        }
        Object d = iab1.d(put);
        if (d instanceof String) {
            zsu0 zsu0Var = zsu0.b;
            String quote = JSONObject.quote((String) d);
            zsu0Var.getClass();
            return zsu0.d(quote);
        }
        zsu0 zsu0Var2 = zsu0.b;
        String obj2 = d.toString();
        zsu0Var2.getClass();
        return zsu0.d(obj2);
    }

    @Override // defpackage.ejr
    public void f(GoFrameLayout goFrameLayout, SummaryPromotionModalWindowsModalView summaryPromotionModalWindowsModalView) {
    }

    @Override // defpackage.fa20
    public Object g(ByteBuffer byteBuffer) {
        try {
            try {
                zsu0.b.getClass();
                JSONTokener jSONTokener = new JSONTokener(zsu0.c(byteBuffer));
                Object nextValue = jSONTokener.nextValue();
                if (jSONTokener.more()) {
                    throw new IllegalArgumentException("Invalid JSON");
                }
                if (nextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) nextValue;
                    if (jSONArray.length() == 1) {
                        Object opt = jSONArray.opt(0);
                        if (opt == JSONObject.NULL) {
                            return null;
                        }
                        return opt;
                    }
                    if (jSONArray.length() == 3) {
                        Object obj = jSONArray.get(0);
                        Object opt2 = jSONArray.opt(1);
                        Object obj2 = JSONObject.NULL;
                        if (opt2 == obj2) {
                            opt2 = null;
                        }
                        Object opt3 = jSONArray.opt(2);
                        if (opt3 == obj2) {
                            opt3 = null;
                        }
                        if ((obj instanceof String) && (opt2 == null || (opt2 instanceof String))) {
                            throw new FlutterException((String) obj, (String) opt2, opt3);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + nextValue);
            } catch (JSONException e) {
                throw new IllegalArgumentException("Invalid JSON", e);
            }
        } catch (JSONException e2) {
            yci0.p("Invalid JSON", e2);
            return null;
        }
    }

    @Override // defpackage.fa20
    public ByteBuffer h(x920 x920Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", x920Var.a);
            jSONObject.put("args", iab1.d(x920Var.b));
            Object d = iab1.d(jSONObject);
            if (d instanceof String) {
                zsu0 zsu0Var = zsu0.b;
                String quote = JSONObject.quote((String) d);
                zsu0Var.getClass();
                return zsu0.d(quote);
            }
            zsu0 zsu0Var2 = zsu0.b;
            String obj = d.toString();
            zsu0Var2.getClass();
            return zsu0.d(obj);
        } catch (JSONException e) {
            yci0.p("Invalid JSON", e);
            return null;
        }
    }

    @Override // defpackage.m8j0
    public String i() {
        return "Tariff temporarily disabled";
    }

    @Override // defpackage.zme
    public Object l(Object obj) {
        return (rvj0) obj;
    }

    @Override // defpackage.ejr
    public void onDetach() {
    }
}
