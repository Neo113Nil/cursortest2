package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.plus.bdui.flex.b;
import com.yandex.plus.bdui.m;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import org.json.JSONException;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class pt0 implements i1, jzc, x7o, t7k, p7q, ukk, l0e, qce {
    public static ScheduledThreadPoolExecutor c;
    public static String e;
    public static boolean f;
    public static volatile pt0 h;
    public static final pt0 i;
    public Object a;
    public Object b;
    public static final Object d = new Object();
    public static final wvo g = new wvo(12);

    static {
        Object obj = null;
        i = new pt0(obj, obj);
    }

    public pt0(int i2) {
        switch (i2) {
            case 11:
                this.a = new HashSet();
                this.b = new HashSet();
                break;
            case 14:
                xdr a = ydr.a(new Pair(Integer.MIN_VALUE, null));
                this.a = a;
                this.b = new b56(a, 0);
                break;
            case 16:
                this.a = l18.b.b(hag.I(jul.class), true);
                this.b = new bnd(18, this);
                break;
            case 19:
                this.a = new HashSet();
                break;
            case 21:
                this.a = new znk(26);
                this.b = new znk(26);
                break;
            case 26:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(RemoteCameraConfig.Mic.BUFFER_SIZE);
                this.a = byteArrayOutputStream;
                this.b = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.a = new vpl();
                this.b = y7k.a;
                break;
        }
    }

    public static final String g() {
        if (bp6.a.contains(pt0.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            bp6.a(pt0.class, th);
            return null;
        }
    }

    public static final ScheduledThreadPoolExecutor h() {
        if (bp6.a.contains(pt0.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            bp6.a(pt0.class, th);
            return null;
        }
    }

    public static final Object j() {
        if (bp6.a.contains(pt0.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            bp6.a(pt0.class, th);
            return null;
        }
    }

    public static pt0 p(pt0 pt0Var, f8j f8jVar, cds cdsVar, int i2) {
        Object obj = f8jVar;
        if ((i2 & 1) != 0) {
            obj = (wof) pt0Var.a;
        }
        if ((i2 & 2) != 0) {
            cdsVar = (cds) pt0Var.b;
        }
        return new pt0(obj, cdsVar);
    }

    public void A(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        Throwable th;
        if (bp6.a.contains(this)) {
            return;
        }
        tsg tsgVar = tsg.c;
        try {
            if (bigDecimal == null) {
                HashMap hashMap = lsg.d;
                b3i.Q(tsgVar, "AppEvents", "purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                HashMap hashMap2 = lsg.d;
                b3i.Q(tsgVar, "AppEvents", "currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                try {
                    y("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, oh.b());
                    if (y9w.t() != 2) {
                        lt0.d(6);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    bp6.a(this, th);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void B(boolean z, Exception exc) {
        this.b = null;
        HashSet hashSet = (HashSet) this.a;
        yde v = yde.v(hashSet);
        hashSet.clear();
        ude listIterator = v.listIterator(0);
        while (listIterator.hasNext()) {
            ql7 ql7Var = (ql7) listIterator.next();
            ql7Var.getClass();
            ql7Var.c(z ? 1 : 3, exc);
        }
    }

    public void C(ql7 ql7Var) {
        ((HashSet) this.a).add(ql7Var);
        if (((ql7) this.b) != null) {
            return;
        }
        this.b = ql7Var;
        nqb c2 = ql7Var.b.c();
        ql7Var.y = c2;
        ol7 ol7Var = ql7Var.s;
        int i2 = dvt.a;
        c2.getClass();
        ol7Var.getClass();
        ol7Var.obtainMessage(1, new pl7(cfg.f.getAndIncrement(), true, SystemClock.elapsedRealtime(), c2)).sendToTarget();
    }

    public void D(h4a h4aVar) {
        Iterator it = new ArrayList((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            r7b r7bVar = (r7b) this.a;
            com.yandex.plus.bdui.b bVar2 = bVar.b;
            com.yandex.plus.bdui.flex.utils.b bVar3 = bVar.a;
            if (h4aVar instanceof y3a) {
                bVar2.w(bVar3.e(r7bVar));
            } else if (h4aVar instanceof a4a) {
                bVar2.i(bVar3.e(r7bVar));
            } else if (h4aVar instanceof b4a) {
                bVar2.c(bVar3.e(r7bVar));
            } else if (h4aVar instanceof z3a) {
                bVar2.l(bVar3.e(r7bVar));
            } else if (h4aVar instanceof o5a) {
                bVar2.r(bVar3.e(r7bVar), com.yandex.plus.bdui.flex.utils.b.i(((o5a) h4aVar).o));
            } else if (h4aVar instanceof i5a) {
                i5a i5aVar = (i5a) h4aVar;
                bVar2.d(bVar3.e(r7bVar), com.yandex.plus.bdui.flex.utils.b.i(i5aVar.o), bVar3.h(i5aVar.p));
            } else if (h4aVar instanceof g5a) {
                m e2 = bVar3.e(r7bVar);
                g5a g5aVar = (g5a) h4aVar;
                bVar2.o(e2, com.yandex.plus.bdui.flex.utils.b.i(g5aVar.o), g5aVar.p);
            } else if (h4aVar instanceof e5a) {
                bVar2.j(bVar3.e(r7bVar), com.yandex.plus.bdui.flex.utils.b.i(((e5a) h4aVar).o));
            } else if (h4aVar instanceof c5a) {
                bVar2.s(bVar3.e(r7bVar), bVar3.h(((c5a) h4aVar).n));
            } else if (h4aVar instanceof d4a) {
                bVar2.k(bVar3.e(r7bVar), bVar3.h(((d4a) h4aVar).n.a));
            } else if (h4aVar instanceof c4a) {
                bVar2.x(bVar3.e(r7bVar), bVar3.h(((c4a) h4aVar).n.a));
            }
        }
    }

    public void F(Object obj) {
        obj.getClass();
        xdr xdrVar = (xdr) this.a;
        Pair pair = new Pair(Integer.valueOf(((Number) ((Pair) xdrVar.getValue()).a).intValue() + 1), obj);
        xdrVar.getClass();
        xdrVar.m(null, pair);
    }

    @Override // defpackage.qce
    public void G(rce rceVar, bqr bqrVar) {
        x97.y((mm6) this.a, null, null, new i0d(bqrVar, (aqi) this.b, null, 1), 3);
    }

    public void H() {
        View rootView;
        vi2 vi2Var = (vi2) this.a;
        if (((xi2) this.b) == null || !vi2Var.hasWindowFocus()) {
            return;
        }
        if (vi2Var.isShown()) {
            vi2Var.performAccessibilityAction(64, null);
            vi2Var.sendAccessibilityEvent(1);
        } else {
            if (!vi2Var.isAccessibilityFocused() || (rootView = vi2Var.getRootView()) == null) {
                return;
            }
            rootView.performAccessibilityAction(64, null);
            rootView.sendAccessibilityEvent(1);
        }
    }

    public yi6 I(mwk mwkVar) {
        if (mwkVar.a() != null) {
            jkl jklVar = (jkl) this.a;
            mqs a = mwkVar.a();
            a.getClass();
            jklVar.getClass();
            if (a4g.D(gys.UseSeekButtons, a)) {
                return yi6.b;
            }
        }
        return yi6.a;
    }

    @Override // defpackage.t7k
    public y7k a() {
        return (gy2) this.b;
    }

    @Override // defpackage.t7k
    public t8s b() {
        return (vpl) this.a;
    }

    @Override // defpackage.i1
    public void e(q1 q1Var) {
        Object t7oVar;
        synchronized (this) {
            try {
                r7o r7oVar = z7o.b;
                t7oVar = ((i5f) this.b).c(q1.Companion.serializer(), q1Var);
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            if (t7oVar instanceof t7o) {
                t7oVar = null;
            }
            SharedPreferences.Editor edit = ((SharedPreferences) this.a).edit();
            edit.putString("AB_CONFIG_KEY", (String) t7oVar);
            edit.apply();
        }
    }

    @Override // defpackage.l0e
    public c8k f(h0e h0eVar, xzd xzdVar) {
        return new xiu(26, ((l0e) this.a).f(h0eVar, xzdVar), (List) this.b);
    }

    @Override // defpackage.i1
    public q1 getConfig() {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            String string = ((SharedPreferences) this.a).getString("AB_CONFIG_KEY", null);
            t7oVar = string != null ? (q1) ((i5f) this.b).b(q1.Companion.serializer(), string) : null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        q1 q1Var = (q1) (t7oVar instanceof t7o ? null : t7oVar);
        if (q1Var != null) {
            return q1Var;
        }
        q1.Companion.getClass();
        return q1.g;
    }

    @Override // defpackage.ukk
    public void i(List list) {
        if (list == null || !list.contains("android.permission.WRITE_EXTERNAL_STORAGE")) {
            return;
        }
        ((rdk) this.a).W((Uri) this.b);
    }

    @Override // defpackage.i1
    public void invalidate() {
        synchronized (this) {
            ((SharedPreferences) this.a).edit().clear().apply();
        }
    }

    public void k(mpf mpfVar, boolean z) {
        znk znkVar = (znk) this.b;
        znk znkVar2 = (znk) this.a;
        if (z) {
            znkVar2.m(mpfVar);
            znkVar.m(mpfVar);
        } else {
            if (((y9t) znkVar2.b).contains(mpfVar)) {
                return;
            }
            znkVar.m(mpfVar);
        }
    }

    public ybs l(List list) {
        i1b i1bVar;
        Exception e2;
        i1b i1bVar2;
        try {
            int size = list.size();
            int i2 = 0;
            i1bVar = null;
            while (i2 < size) {
                try {
                    i1bVar2 = (i1b) list.get(i2);
                } catch (Exception e3) {
                    e2 = e3;
                }
                try {
                    i1bVar2.a((bh3) this.b);
                    i2++;
                    i1bVar = i1bVar2;
                } catch (Exception e4) {
                    e2 = e4;
                    i1bVar = i1bVar2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((ah3) ((bh3) this.b).f).r());
                    sb2.append(", composition=");
                    sb2.append(((bh3) this.b).e());
                    sb2.append(", selection=");
                    bh3 bh3Var = (bh3) this.b;
                    sb2.append((Object) rds.g(y5g.P(bh3Var.b, bh3Var.c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    CollectionsKt.V(list, sb, StringUtil.LF, new kma(i1bVar, this), 60);
                    throw new RuntimeException(sb.toString(), e2);
                }
            }
            bh3 bh3Var2 = (bh3) this.b;
            bh3Var2.getClass();
            mn0 mn0Var = new mn0(((ah3) bh3Var2.f).toString());
            bh3 bh3Var3 = (bh3) this.b;
            long P = y5g.P(bh3Var3.b, bh3Var3.c);
            rds rdsVar = rds.f(((ybs) this.a).b) ? null : new rds(P);
            ybs ybsVar = new ybs(mn0Var, rdsVar != null ? rdsVar.a : y5g.P(rds.d(P), rds.e(P)), ((bh3) this.b).e());
            this.a = ybsVar;
            return ybsVar;
        } catch (Exception e5) {
            i1bVar = null;
            e2 = e5;
        }
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return (zi6) this.b;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return new zi6(I(szuVar.l), szuVar.n ? xi6.c : xi6.b, szuVar.n() ? xi6.c : xi6.b, true);
    }

    @Override // defpackage.l0e
    public c8k o() {
        return new xiu(26, ((l0e) this.a).o(), (List) this.b);
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        uv3 uv3Var = (uv3) obj;
        gek gekVar = (gek) this.a;
        uv3Var.getClass();
        if (uv3Var instanceof rv3) {
            rv3 rv3Var = (rv3) uv3Var;
            Uri parse = Uri.parse(rv3Var.a);
            parse.getClass();
            gekVar.a(parse, rv3Var.b);
            return;
        }
        if (uv3Var.equals(sv3.a)) {
            gekVar.c();
        } else if (uv3Var instanceof tv3) {
            ((x7o) this.b).onSuccess(((tv3) uv3Var).a);
        }
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return (zi6) this.b;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [arf, java.lang.Object] */
    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        zi6 zi6Var = (zi6) this.b;
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            jbq jbqVar = (jbq) maqVar;
            yi6 I = I(jbqVar.b());
            xi6 xi6Var = xi6.c;
            return new zi6(I, xi6Var, ((naq) jbqVar.m.getValue()) != null ? xi6Var : xi6.b, true);
        }
        if (maqVar instanceof vaq) {
            vaq vaqVar = (vaq) maqVar;
            return new zi6(I(vaqVar.b()), vaqVar.p() != null ? xi6.c : xi6.b, vaqVar.o() != null ? xi6.c : xi6.b, true);
        }
        if (maqVar instanceof eaq) {
            return zi6Var;
        }
        if (maqVar instanceof raq) {
            return zi6Var;
        }
        b6e.s();
        return null;
    }

    public byte[] r(tib tibVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.b;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(tibVar.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(tibVar.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(tibVar.c);
            dataOutputStream.writeLong(tibVar.d);
            dataOutputStream.write(tibVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            b6e.q(e2);
            return null;
        }
    }

    @Override // defpackage.jzc
    public void s(Exception exc, Object obj) {
        kkp kkpVar = (kkp) this.b;
        nsh nshVar = (nsh) kkpVar.e;
        ((ys1) nshVar.d).c(new lr1(nshVar, (qdc) kkpVar.b, (viq) kkpVar.c, (nr1) this.a, exc, obj));
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        zi6 zi6Var = (zi6) this.b;
        t1qVar.getClass();
        m1q m1qVar = t1qVar.c;
        if (m1qVar instanceof c2q) {
            return new zi6(I(m1qVar), t1qVar.b != null ? xi6.c : xi6.b, t1qVar.d != null ? xi6.c : xi6.b, true);
        }
        if ((m1qVar instanceof j1q) || (m1qVar instanceof e2q)) {
            return zi6Var;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return new zi6(I(u7uVar.c), u7uVar.j ? xi6.c : xi6.b, u7uVar.k ? xi6.c : xi6.b, true);
    }

    public boolean v() {
        return !(((y9t) ((znk) this.b).b).isEmpty() && ((y9t) ((znk) this.a).b).isEmpty());
    }

    public void w(Bundle bundle, String str) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            try {
                y(str, null, bundle, false, oh.b());
            } catch (Throwable th) {
                th = th;
                bp6.a(this, th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        ((x7o) this.b).x(bfkVar);
    }

    public void y(String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        if (bp6.a.contains(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            if (m8c.b("app_events_killswitch", j3c.c(), false)) {
                HashMap hashMap = lsg.d;
                synchronized (j3c.a) {
                }
                return;
            }
            try {
                try {
                    y9w.a(new ht0((String) this.a, str, d2, bundle, z, oh.j == 0, uuid), (la) this.b);
                } catch (JSONException e2) {
                    HashMap hashMap2 = lsg.d;
                    e2.toString();
                    synchronized (j3c.a) {
                    }
                }
            } catch (c3c e3) {
                HashMap hashMap3 = lsg.d;
                e3.toString();
                synchronized (j3c.a) {
                }
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public void z(Bundle bundle, String str) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            try {
                y(str, null, bundle, true, oh.b());
            } catch (Throwable th) {
                th = th;
                bp6.a(this, th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.qce
    public void E(rce rceVar, pgb pgbVar) {
    }

    public /* synthetic */ pt0(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ pt0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ pt0(int i2, String str, Throwable th) {
        this(str, (String) null, (i2 & 32) != 0 ? null : th);
    }

    public pt0(String str, String str2, Throwable th) {
        uah.m(jhp.e(xz0.r(new Pair[]{null, str2 != null ? new Pair("elementType", str2) : null})));
        this.a = str;
        this.b = th;
    }

    public pt0(Context context, int i2) {
        Continuation continuation = null;
        switch (i2) {
            case 22:
                this.a = context;
                this.b = null;
                break;
            case 23:
                context.getClass();
                this.a = context;
                this.b = zsd.b0(zsd.I(new j57(this, continuation, 12)));
                break;
            default:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ngg.E(context, adh.class.getCanonicalName(), R.attr.materialCalendarStyle).data, vdn.z);
                l48.k(context, obtainStyledAttributes.getResourceId(4, 0));
                l48.k(context, obtainStyledAttributes.getResourceId(2, 0));
                l48.k(context, obtainStyledAttributes.getResourceId(3, 0));
                l48.k(context, obtainStyledAttributes.getResourceId(5, 0));
                ColorStateList D = ivf.D(context, obtainStyledAttributes, 7);
                this.a = l48.k(context, obtainStyledAttributes.getResourceId(9, 0));
                l48.k(context, obtainStyledAttributes.getResourceId(8, 0));
                this.b = l48.k(context, obtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(D.getDefaultColor());
                obtainStyledAttributes.recycle();
                break;
        }
    }

    public pt0(String str, String str2) {
        wxf.J();
        this.a = str;
        Date date = ja.l;
        ja N = n7w.N();
        if (N != null && !new Date().after(N.a) && (str2 == null || str2.equals(N.h))) {
            this.b = new la(N.e, j3c.c());
        } else {
            if (str2 == null) {
                wxf.H(j3c.b(), "context");
                str2 = j3c.c();
            }
            this.b = new la(null, str2);
        }
        y9w.J();
    }

    public pt0(Context context, String str) {
        this(gvt.m(context), str);
    }

    public pt0(gek gekVar, x7o x7oVar) {
        x7oVar.getClass();
        this.a = gekVar;
        this.b = x7oVar;
    }
}
