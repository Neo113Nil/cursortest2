package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.appsflyer.AdRevenueScheme;
import com.yandex.auth.LegacyAccountType;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.passport.api.c;
import com.yandex.passport.api.exception.a;
import com.yandex.passport.api.h;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.n;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.q;
import com.yandex.passport.api.q2;
import com.yandex.passport.api.x;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.account.f;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.impl.q0;
import com.yandex.passport.internal.properties.g;
import com.yandex.passport.internal.properties.k;
import com.yandex.passport.internal.properties.k0;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.pay.ui.core.b;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes6.dex */
public final class hgp {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public /* synthetic */ hgp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.a = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0069, code lost:
    
        if (r14 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(hgp hgpVar, boolean z, z1 z1Var, cg6 cg6Var) {
        stg stgVar;
        int i;
        Object l;
        String str;
        Object obj;
        z1 z1Var2;
        boolean z2;
        int i2;
        hot hotVar;
        iv0 iv0Var = (iv0) hgpVar.e;
        if (cg6Var instanceof stg) {
            stgVar = (stg) cg6Var;
            int i3 = stgVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                stgVar.q = i3 - Integer.MIN_VALUE;
                Object obj2 = stgVar.o;
                nm6 nm6Var = nm6.a;
                i = stgVar.q;
                yxc yxcVar = null;
                mtg mtgVar = mtg.a;
                if (i != 0) {
                    qgg.h0(obj2);
                    String valueOf = String.valueOf(z1Var.b);
                    stgVar.k = z1Var;
                    stgVar.j = z;
                    stgVar.q = 1;
                    l = iv0Var.l(valueOf, stgVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            yxc yxcVar2 = stgVar.m;
                            qgg.h0(obj2);
                            yxcVar = yxcVar2;
                            if (yxcVar != null) {
                                return new otg(yxcVar);
                            }
                            return mtgVar;
                        }
                        i2 = stgVar.n;
                        z2 = stgVar.j;
                        obj = stgVar.l;
                        z1Var2 = stgVar.k;
                        qgg.h0(obj2);
                        hotVar = (hot) obj2;
                        if (!(hotVar instanceof fot)) {
                            if (!(hotVar instanceof got)) {
                                b6e.s();
                                return null;
                            }
                            yxc yxcVar3 = ((got) hotVar).a;
                            irt irtVar = (irt) hgpVar.d;
                            stgVar.k = z1Var2;
                            stgVar.l = obj;
                            stgVar.m = yxcVar3;
                            stgVar.j = z2;
                            stgVar.n = i2;
                            stgVar.q = 3;
                            if (irtVar.a(yxcVar3, stgVar) != nm6Var) {
                                yxcVar = yxcVar3;
                            }
                            return nm6Var;
                        }
                        if (yxcVar != null) {
                        }
                        return mtgVar;
                    }
                    z = stgVar.j;
                    z1Var = stgVar.k;
                    qgg.h0(obj2);
                    l = ((z7o) obj2).a;
                }
                r7o r7oVar = z7o.b;
                str = (String) (!(l instanceof t7o) ? null : l);
                int i4 = 0;
                if (str == null) {
                    stgVar.k = z1Var;
                    stgVar.l = l;
                    stgVar.j = z;
                    stgVar.n = 0;
                    stgVar.q = 2;
                    Object e = iv0Var.a.e(str, stgVar);
                    if (e != nm6Var) {
                        obj = l;
                        obj2 = e;
                        z1Var2 = z1Var;
                        z2 = z;
                        i2 = 0;
                        hotVar = (hot) obj2;
                        if (!(hotVar instanceof fot)) {
                        }
                        if (yxcVar != null) {
                        }
                        return mtgVar;
                    }
                    return nm6Var;
                }
                Throwable a = z7o.a(l);
                if (a != null) {
                    ssg.a(6, null, "Cannot get token after successful login", a);
                    if (a instanceof a) {
                        ztg ztgVar = ztg.b;
                        ztgVar.getClass();
                        Map b = tah.b(new Pair("throwable", a));
                        b.getClass();
                        ot0.A(ztgVar.e(), "login_retry", b);
                        q0 q0Var = (q0) ((jyr) hgpVar.a).getValue();
                        htg htgVar = new htg(z1Var, i4);
                        zh zhVar = q0Var.q;
                        k kVar = new k();
                        kVar.b(null);
                        htgVar.invoke(kVar);
                        zhVar.a(b.t(kVar));
                        return null;
                    }
                    if (a instanceof com.yandex.passport.api.exception.b) {
                        ztg ztgVar2 = ztg.b;
                        ztgVar2.getClass();
                        Map b2 = tah.b(new Pair("throwable", a));
                        b2.getClass();
                        ot0.A(ztgVar2.e(), "login_retry", b2);
                        hgpVar.p();
                        return null;
                    }
                    ztg.b.g(a, z);
                    Assertions.throwOrSkip$default(new FailedAssertionException("Login is successful, but token is null"), null, 2, null);
                }
                return mtgVar;
            }
        }
        stgVar = new stg(hgpVar, cg6Var);
        Object obj22 = stgVar.o;
        nm6 nm6Var2 = nm6.a;
        i = stgVar.q;
        yxc yxcVar4 = null;
        mtg mtgVar2 = mtg.a;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        str = (String) (!(l instanceof t7o) ? null : l);
        int i42 = 0;
        if (str == null) {
        }
    }

    public static wsu f(mqs mqsVar, e6v e6vVar, v80 v80Var) {
        return new wsu(t75.c(new jzs(mqsVar, v80Var, null, null, null, null, e6vVar, false)), c5b.a, new ssu(0, 0, null), req.a, false);
    }

    public static void o(String str, JSONObject jSONObject) {
        StringBuilder k = dfi.k(str);
        k.append(jSONObject.toString());
        String sb = k.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb, null);
        }
    }

    public void A(dou douVar, mqs mqsVar, String str) {
        z(mqsVar, mqsVar.c, f(mqsVar, new d6v(e(douVar.b, new s4v(douVar.c, douVar.d), str), c6v.a), new v80("mobile-history-my_vibe-default", ((kxi) this.c).a(str).a, null)), str);
    }

    public void B(String str) {
        pjc pjcVar;
        orr orrVar = (orr) ((jyr) this.a).getValue();
        if (str != null) {
            pjcVar = (pjc) orrVar.e.get(str);
        } else {
            orrVar.getClass();
            pjcVar = null;
        }
        if (pjcVar != null) {
            rjq rjqVar = (rjq) this.g;
            dq7 dq7Var = ca8.a;
            ox6.B(pjcVar, hld.s(rjqVar, j5h.a), new ds1(3, this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r13.emit(r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0044, code lost:
    
        if (r13 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(cg6 cg6Var) {
        qtg qtgVar;
        Object obj;
        int i;
        if (cg6Var instanceof qtg) {
            qtgVar = (qtg) cg6Var;
            int i2 = qtgVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qtgVar.l = i2 - Integer.MIN_VALUE;
                obj = qtgVar.j;
                Object obj2 = nm6.a;
                i = qtgVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, null, "autologin", null);
                    qtgVar.l = 1;
                    obj = c(qtgVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    y1 y1Var = y1.a;
                    x xVar = x.a;
                    j jVar = new j();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(le7.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str = r9k.PRODUCTION.a;
                    q qVar = h.b;
                    int parseInt = Integer.parseInt(str);
                    qVar.getClass();
                    h a = q.a(parseInt);
                    if (a == null) {
                        xq0.x("Required value was null.");
                        return null;
                    }
                    jVar.a = a;
                    jVar.y(n.CHILDISH);
                    g gVar = new g(com.yandex.passport.internal.ui.a.s(jVar.l()), pd.M() ? y1.b : y1.a, xVar, null, false, null);
                    bw1 bw1Var = ((q0) ((jyr) this.a).getValue()).r;
                    bw1Var.getClass();
                    bw1Var.b = gVar.e;
                    qyf qyfVar = (qyf) bw1Var.g;
                    dq7 dq7Var = ca8.a;
                    x97.y(qyfVar, mn7.d, null, new rhw(bw1Var, gVar, continuation, 19), 2);
                    return Unit.a;
                }
                x0q x0qVar = (x0q) this.h;
                mtg mtgVar = mtg.a;
                qtgVar.l = 2;
            }
        }
        qtgVar = new qtg(this, cg6Var);
        obj = qtgVar.j;
        Object obj22 = nm6.a;
        i = qtgVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(cg6 cg6Var) {
        rtg rtgVar;
        int i;
        List list;
        if (cg6Var instanceof rtg) {
            rtgVar = (rtg) cg6Var;
            int i2 = rtgVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rtgVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rtgVar.j;
                nm6 nm6Var = nm6.a;
                i = rtgVar.l;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    c9k c9kVar = (c9k) this.f;
                    j jVar = new j();
                    jVar.y(n.PHONISH, n.CHILDISH);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(le7.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str = r9k.PRODUCTION.a;
                    q qVar = h.b;
                    int parseInt = Integer.parseInt(str);
                    qVar.getClass();
                    h a = q.a(parseInt);
                    if (a == null) {
                        xq0.x("Required value was null.");
                        return null;
                    }
                    jVar.a = a;
                    com.yandex.passport.internal.entities.k l = jVar.l();
                    rtgVar.l = 1;
                    obj = c9kVar.f(l, rtgVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    return Boolean.FALSE;
                }
                List<f> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (f fVar : list2) {
                        if (fVar.o && fVar.m != n.PHONISH) {
                            break;
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        rtgVar = new rtg(this, cg6Var);
        Object obj2 = rtgVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rtgVar.l;
        boolean z2 = true;
        if (i != 0) {
        }
        list = (List) obj2;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(cg6 cg6Var) {
        eid eidVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof eid) {
                eidVar = (eid) cg6Var;
                int i2 = eidVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eidVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = eidVar.k;
                    nm6 nm6Var = nm6.a;
                    i = eidVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar2 = (qqi) this.b;
                        eidVar.j = qqiVar2;
                        eidVar.m = 1;
                        if (qqiVar2.a(eidVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = eidVar.j;
                        qgg.h0(obj);
                    }
                    ((HashMap) this.d).clear();
                    ((HashMap) this.f).clear();
                    ((ArrayList) this.a).clear();
                    ((ArrayList) this.g).clear();
                    ((ArrayList) this.h).clear();
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            ((HashMap) this.d).clear();
            ((HashMap) this.f).clear();
            ((ArrayList) this.a).clear();
            ((ArrayList) this.g).clear();
            ((ArrayList) this.h).clear();
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        eidVar = new eid(this, cg6Var);
        Object obj2 = eidVar.k;
        nm6 nm6Var2 = nm6.a;
        i = eidVar.m;
        if (i != 0) {
        }
    }

    public w4q e(s9p s9pVar, s4v s4vVar, String str) {
        return new w4q(new unu(s9pVar, ""), new v4q(new qfn("mobile-history-my_vibe-default"), "error-history-from", new gxc(((kxi) this.c).a.G(), str)), s4vVar, o4q.a, p4q.b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(Iterable iterable, cg6 cg6Var) {
        fid fidVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof fid) {
                fidVar = (fid) cg6Var;
                int i2 = fidVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fidVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = fidVar.l;
                    nm6 nm6Var = nm6.a;
                    i = fidVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.b;
                        fidVar.j = iterable;
                        fidVar.k = qqiVar;
                        fidVar.n = 1;
                        if (qqiVar.a(fidVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = fidVar.k;
                        Iterable iterable2 = fidVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        iterable = iterable2;
                    }
                    Set keySet = ((HashMap) this.d).keySet();
                    keySet.getClass();
                    return CollectionsKt.e0(CollectionsKt.e0(iterable, keySet), (ArrayList) this.a);
                }
            }
            Set keySet2 = ((HashMap) this.d).keySet();
            keySet2.getClass();
            return CollectionsKt.e0(CollectionsKt.e0(iterable, keySet2), (ArrayList) this.a);
        } finally {
            qqiVar.b(null);
        }
        fidVar = new fid(this, cg6Var);
        Object obj2 = fidVar.l;
        nm6 nm6Var2 = nm6.a;
        i = fidVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(Iterable iterable, cg6 cg6Var) {
        gid gidVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof gid) {
                gidVar = (gid) cg6Var;
                int i2 = gidVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gidVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = gidVar.l;
                    nm6 nm6Var = nm6.a;
                    i = gidVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.b;
                        gidVar.j = iterable;
                        gidVar.k = qqiVar;
                        gidVar.n = 1;
                        if (qqiVar.a(gidVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = gidVar.k;
                        Iterable iterable2 = gidVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        iterable = iterable2;
                    }
                    Set keySet = ((HashMap) this.e).keySet();
                    keySet.getClass();
                    return CollectionsKt.e0(CollectionsKt.e0(iterable, keySet), (ArrayList) this.g);
                }
            }
            Set keySet2 = ((HashMap) this.e).keySet();
            keySet2.getClass();
            return CollectionsKt.e0(CollectionsKt.e0(iterable, keySet2), (ArrayList) this.g);
        } finally {
            qqiVar.b(null);
        }
        gidVar = new gid(this, cg6Var);
        Object obj2 = gidVar.l;
        nm6 nm6Var2 = nm6.a;
        i = gidVar.n;
        if (i != 0) {
        }
    }

    public bpp i(int i) {
        bpp bppVar = null;
        try {
            if (!ouj.a(2, i)) {
                JSONObject b = ((qr3) this.f).b();
                if (b != null) {
                    bpp g = ((c5p) this.d).g(b);
                    o("Loaded cached settings: ", b);
                    ((ddl) this.e).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (ouj.a(3, i) || g.c >= currentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return g;
                        } catch (Exception e) {
                            e = e;
                            bppVar = g;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bppVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x004b, B:22:0x0061, B:23:0x0066, B:25:0x0069, B:27:0x0075, B:30:0x007b, B:31:0x0082, B:33:0x008e, B:34:0x0094, B:36:0x009c, B:37:0x00c3, B:38:0x009f, B:40:0x00a3, B:41:0x00cc, B:42:0x00d1), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x004b, B:22:0x0061, B:23:0x0066, B:25:0x0069, B:27:0x0075, B:30:0x007b, B:31:0x0082, B:33:0x008e, B:34:0x0094, B:36:0x009c, B:37:0x00c3, B:38:0x009f, B:40:0x00a3, B:41:0x00cc, B:42:0x00d1), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x004b, B:22:0x0061, B:23:0x0066, B:25:0x0069, B:27:0x0075, B:30:0x007b, B:31:0x0082, B:33:0x008e, B:34:0x0094, B:36:0x009c, B:37:0x00c3, B:38:0x009f, B:40:0x00a3, B:41:0x00cc, B:42:0x00d1), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(ckd ckdVar, cg6 cg6Var) {
        hid hidVar;
        int i;
        qqi qqiVar;
        int ordinal;
        mqs mqsVar;
        d2q a2qVar;
        Object c2qVar;
        try {
            if (cg6Var instanceof hid) {
                hidVar = (hid) cg6Var;
                int i2 = hidVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hidVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = hidVar.l;
                    nm6 nm6Var = nm6.a;
                    i = hidVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.b;
                        hidVar.j = ckdVar;
                        hidVar.k = qqiVar;
                        hidVar.n = 1;
                        if (qqiVar.a(hidVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = hidVar.k;
                        ckd ckdVar2 = hidVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        ckdVar = ckdVar2;
                    }
                    bkd bkdVar = ckdVar.c;
                    String str = ckdVar.a;
                    ordinal = bkdVar.ordinal();
                    if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                        if (ordinal != 3) {
                            e5d e5dVar = (e5d) ((HashMap) this.e).get(str);
                            c2qVar = e5dVar == null ? new e2q(ckdVar) : new j1q(ckdVar, e5dVar);
                            qqiVar.b(null);
                            return c2qVar;
                        }
                        if (ordinal != 4) {
                            throw new x7j();
                        }
                    }
                    mqsVar = (mqs) ((HashMap) this.d).get(str);
                    if (mqsVar != null) {
                        c2qVar = new e2q(ckdVar);
                    } else {
                        z3q z3qVar = (z3q) this.c;
                        if (z3qVar instanceof d2q) {
                            a2qVar = (d2q) z3qVar;
                        } else {
                            if (!(z3qVar instanceof h1q)) {
                                throw new x7j();
                            }
                            Assertions.throwOrSkip("GlagolQueueTracksInfoAppenderState", new FailedAssertionException("Unexpected entity type " + ckdVar));
                            a2qVar = new a2q(mqsVar, ((h1q) z3qVar).a);
                        }
                        c2qVar = new c2q(ckdVar, mqsVar, a2qVar);
                    }
                    qqiVar.b(null);
                    return c2qVar;
                }
            }
            bkd bkdVar2 = ckdVar.c;
            String str2 = ckdVar.a;
            ordinal = bkdVar2.ordinal();
            if (ordinal != 0) {
                if (ordinal != 3) {
                }
            }
            mqsVar = (mqs) ((HashMap) this.d).get(str2);
            if (mqsVar != null) {
            }
            qqiVar.b(null);
            return c2qVar;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        hidVar = new hid(this, cg6Var);
        Object obj2 = hidVar.l;
        nm6 nm6Var2 = nm6.a;
        i = hidVar.n;
        if (i != 0) {
        }
    }

    public e k() {
        return (e) ((jyr) this.f).getValue();
    }

    public bpp l() {
        return (bpp) ((AtomicReference) this.h).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(o3f o3fVar, cg6 cg6Var) {
        iid iidVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof iid) {
                iidVar = (iid) cg6Var;
                int i2 = iidVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iidVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = iidVar.l;
                    nm6 nm6Var = nm6.a;
                    i = iidVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.b;
                        iidVar.j = o3fVar;
                        iidVar.k = qqiVar;
                        iidVar.n = 1;
                        if (qqiVar.a(iidVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = iidVar.k;
                        o3f o3fVar2 = iidVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        o3fVar = o3fVar2;
                    }
                    return Boolean.valueOf(((ArrayList) this.h).contains(String.valueOf(o3fVar)));
                }
            }
            return Boolean.valueOf(((ArrayList) this.h).contains(String.valueOf(o3fVar)));
        } finally {
            qqiVar.b(null);
        }
        iidVar = new iid(this, cg6Var);
        Object obj2 = iidVar.l;
        nm6 nm6Var2 = nm6.a;
        i = iidVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x041b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(de2 de2Var, int i) {
        byte[] bArr;
        long j;
        lb2 lb2Var;
        String str;
        lb2 lb2Var2;
        int i2;
        wx0 l;
        String str2;
        Integer num;
        hgp hgpVar;
        int i3;
        final hgp hgpVar2 = this;
        final de2 de2Var2 = de2Var;
        byte[] bArr2 = de2Var2.b;
        bko bkoVar = (bko) hgpVar2.a;
        j9t a = ((v2i) hgpVar2.c).a(de2Var2.a);
        long j2 = 0;
        while (true) {
            final int i4 = 0;
            if (!((Boolean) bkoVar.D(new iyr(hgpVar2) { // from class: sot
                public final /* synthetic */ hgp b;

                {
                    this.b = hgpVar2;
                }

                @Override // defpackage.iyr
                public final Object execute() {
                    Boolean bool;
                    switch (i4) {
                        case 0:
                            de2 de2Var3 = de2Var2;
                            bko bkoVar2 = (bko) this.b.d;
                            SQLiteDatabase a2 = bkoVar2.a();
                            a2.beginTransaction();
                            try {
                                Long b = bko.b(a2, de2Var3);
                                if (b == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = bkoVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a2.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a2.endTransaction();
                            }
                        default:
                            bko bkoVar3 = (bko) this.b.d;
                            bkoVar3.getClass();
                            return (Iterable) bkoVar3.g(new suh(18, bkoVar3, de2Var2));
                    }
                }
            })).booleanValue()) {
                bkoVar.D(new np6(j2, hgpVar2, de2Var2));
                return;
            }
            final int i5 = 1;
            Iterable iterable = (Iterable) bkoVar.D(new iyr(hgpVar2) { // from class: sot
                public final /* synthetic */ hgp b;

                {
                    this.b = hgpVar2;
                }

                @Override // defpackage.iyr
                public final Object execute() {
                    Boolean bool;
                    switch (i5) {
                        case 0:
                            de2 de2Var3 = de2Var2;
                            bko bkoVar2 = (bko) this.b.d;
                            SQLiteDatabase a2 = bkoVar2.a();
                            a2.beginTransaction();
                            try {
                                Long b = bko.b(a2, de2Var3);
                                if (b == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = bkoVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a2.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a2.endTransaction();
                            }
                        default:
                            bko bkoVar3 = (bko) this.b.d;
                            bkoVar3.getClass();
                            return (Iterable) bkoVar3.g(new suh(18, bkoVar3, de2Var2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a == null) {
                tyf.q("Uploader", "Unknown backend for %s, deleting event batch for it...", de2Var2);
                lb2Var2 = new lb2(3, -1L);
                bArr = bArr2;
                j = j2;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((qd2) it.next()).c);
                }
                if (bArr2 != null) {
                    bko bkoVar2 = (bko) hgpVar2.i;
                    Objects.requireNonNull(bkoVar2);
                    ko4 ko4Var = (ko4) bkoVar.D(new rot(bkoVar2, i4));
                    m mVar = new m();
                    mVar.g = new HashMap();
                    mVar.e = Long.valueOf(((up4) hgpVar2.g).a());
                    mVar.f = Long.valueOf(((up4) hgpVar2.h).a());
                    mVar.b = "GDT_CLIENT_METRICS";
                    p6b p6bVar = new p6b("proto");
                    ko4Var.getClass();
                    sfm sfmVar = pym.a;
                    sfmVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        sfmVar.q(ko4Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    mVar.d = new i6b(p6bVar, byteArrayOutputStream.toByteArray());
                    arrayList.add(((p94) a).a(mVar.c()));
                }
                p94 p94Var = (p94) a;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    cd2 cd2Var = (cd2) it2.next();
                    String str3 = cd2Var.a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(cd2Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(cd2Var);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    cd2 cd2Var2 = (cd2) ((List) entry.getValue()).get(0);
                    i5n i5nVar = i5n.a;
                    long a2 = p94Var.f.a();
                    long a3 = p94Var.e.a();
                    nb2 nb2Var = new nb2(new kb2(Integer.valueOf(cd2Var2.b("sdk-version")), cd2Var2.a(CommonUrlParts.MODEL), cd2Var2.a("hardware"), cd2Var2.a("device"), cd2Var2.a("product"), cd2Var2.a("os-uild"), cd2Var2.a("manufacturer"), cd2Var2.a("fingerprint"), cd2Var2.a(CommonUrlParts.LOCALE), cd2Var2.a(AdRevenueScheme.COUNTRY), cd2Var2.a("mcc_mnc"), cd2Var2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (cd2 cd2Var3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        i6b i6bVar = cd2Var3.c;
                        byte[] bArr4 = cd2Var3.j;
                        p6b p6bVar2 = i6bVar.a;
                        byte[] bArr5 = i6bVar.b;
                        long j3 = j2;
                        if (p6bVar2.equals(new p6b("proto"))) {
                            hgpVar = new hgp();
                            hgpVar.a = bArr5;
                        } else if (p6bVar2.equals(new p6b("json"))) {
                            String str4 = new String(bArr5, Charset.forName("UTF-8"));
                            hgp hgpVar3 = new hgp();
                            hgpVar3.d = str4;
                            hgpVar = hgpVar3;
                        } else {
                            String z = tyf.z("CctTransportBackend");
                            if (Log.isLoggable(z, 5)) {
                                Log.w(z, "Received event of unsupported encoding " + p6bVar2 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j2 = j3;
                        }
                        hgpVar.b = Long.valueOf(cd2Var3.d);
                        hgpVar.f = Long.valueOf(cd2Var3.e);
                        String str5 = (String) cd2Var3.f.get("tz-offset");
                        hgpVar.g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        hgpVar.h = new pd2((qzi) qzi.a.get(cd2Var3.b("net-type")), (pzi) pzi.a.get(cd2Var3.b("mobile-subtype")));
                        Integer num2 = cd2Var3.b;
                        if (num2 != null) {
                            hgpVar.c = num2;
                        }
                        Integer num3 = cd2Var3.g;
                        if (num3 != null) {
                            gd2 gd2Var = new gd2(new fd2(num3));
                            tm5 tm5Var = tm5.a;
                            hgpVar.e = new ob2(gd2Var);
                        }
                        byte[] bArr6 = cd2Var3.i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            hgpVar.i = new ed2(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String str6 = ((Long) hgpVar.b) == null ? " eventTimeMs" : "";
                        if (((Long) hgpVar.f) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) hgpVar.g) == null) {
                            str6 = str6.concat(" timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            xq0.q("Missing required properties:".concat(str6));
                            return;
                        } else {
                            arrayList4.add(new md2(((Long) hgpVar.b).longValue(), (Integer) hgpVar.c, (ob2) hgpVar.e, ((Long) hgpVar.f).longValue(), (byte[]) hgpVar.a, (String) hgpVar.d, ((Long) hgpVar.g).longValue(), (pd2) hgpVar.h, (ed2) hgpVar.i));
                            bArr2 = bArr3;
                            j2 = j3;
                        }
                    }
                    arrayList3.add(new nd2(a2, a3, nb2Var, num, str2, arrayList4));
                }
                bArr = bArr2;
                j = j2;
                mb2 mb2Var = new mb2(arrayList3);
                URL url = p94Var.d;
                if (bArr != null) {
                    try {
                        vn3 a4 = vn3.a(bArr);
                        str = a4.b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a4.a;
                        if (str7 != null) {
                            url = p94.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        lb2Var = new lb2(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i6 = 24;
                    nsh nshVar = new nsh(i6, url, mb2Var, str);
                    n nVar = new n(7, p94Var);
                    int i7 = 5;
                    do {
                        l = nVar.l(nshVar);
                        URL url2 = (URL) l.c;
                        if (url2 != null) {
                            tyf.q("CctTransportBackend", "Following redirect to: %s", url2);
                            nshVar = new nsh(i6, url2, (mb2) nshVar.c, (String) nshVar.d);
                        } else {
                            nshVar = null;
                        }
                        if (nshVar == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = l.a;
                    if (i8 == 200) {
                        lb2Var2 = new lb2(1, l.b);
                    } else {
                        if (i8 >= 500 || i8 == 404) {
                            lb2Var = new lb2(2, -1L);
                        } else if (i8 == 400) {
                            try {
                                lb2Var = new lb2(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                tyf.s("CctTransportBackend", "Could not make request to the backend", e);
                                i2 = 2;
                                lb2Var2 = new lb2(2, -1L);
                                i3 = lb2Var2.a;
                                if (i3 != i2) {
                                }
                            }
                        } else {
                            lb2Var = new lb2(3, -1L);
                        }
                        lb2Var2 = lb2Var;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            i3 = lb2Var2.a;
            if (i3 != i2) {
                bkoVar.D(new fw7(this, iterable, de2Var, j));
                ((ime) this.e).K(de2Var, i + 1, true);
                return;
            }
            hgpVar2 = this;
            de2Var2 = de2Var;
            j2 = j;
            bkoVar.D(new suh(25, hgpVar2, iterable));
            if (i3 == 1) {
                j2 = Math.max(j2, lb2Var2.b);
                if (bArr != null) {
                    bkoVar.D(new tot(0, hgpVar2));
                }
            } else if (i3 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    String str8 = ((qd2) it3.next()).c.a;
                    if (hashMap2.containsKey(str8)) {
                        hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                    } else {
                        hashMap2.put(str8, 1);
                    }
                }
                bkoVar.D(new suh(26, hgpVar2, hashMap2));
            }
            bArr2 = bArr;
        }
    }

    public void p() {
        ssg.a(3, null, LegacyAccountType.STRING_LOGIN, null);
        Intrinsics.d(((iv0) this.e).a.c(), yrt.a);
        k kVar = new k();
        kVar.b(null);
        kVar.u = true;
        kVar.f = pd.M() ? y1.b : y1.a;
        kVar.o = new k0(false, false, false, com.yandex.passport.api.q0.a, true, null, null, null, null, false, false, null, new com.yandex.passport.internal.properties.a(com.yandex.passport.api.e.a, c.a, true, true), new v(new j2(), q2.a, n2.a, true), false, true);
        j jVar = new j();
        jVar.y(n.CHILDISH);
        l18 l18Var = l18.b;
        bdt I = hag.I(le7.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str = r9k.PRODUCTION.a;
        q qVar = h.b;
        int parseInt = Integer.parseInt(str);
        qVar.getClass();
        h a = q.a(parseInt);
        if (a == null) {
            xq0.x("Required value was null.");
            return;
        }
        jVar.a = a;
        dgq E = fgq.E((hn5) this.b);
        if (E != null && E.a.equals("401") && E.b.equals("01")) {
            jVar.y(n.PHONISH);
        }
        kVar.b = jVar.l();
        ((q0) ((jyr) this.a).getValue()).q.a(b.t(kVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae A[Catch: all -> 0x00bb, LOOP:0: B:16:0x00a8->B:18:0x00ae, LOOP_END, TryCatch #0 {all -> 0x00bb, blocks: (B:12:0x0056, B:15:0x009f, B:16:0x00a8, B:18:0x00ae, B:20:0x00bd), top: B:11:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(Iterable iterable, ArrayList arrayList, cg6 cg6Var) {
        jid jidVar;
        int i;
        qqi qqiVar;
        int a;
        HashMap hashMap = (HashMap) this.d;
        try {
            if (cg6Var instanceof jid) {
                jidVar = (jid) cg6Var;
                int i2 = jidVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jidVar.o = i2 - Integer.MIN_VALUE;
                    Object obj = jidVar.m;
                    nm6 nm6Var = nm6.a;
                    i = jidVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.b;
                        jidVar.j = iterable;
                        jidVar.k = arrayList;
                        jidVar.l = qqiVar;
                        jidVar.o = 1;
                        if (qqiVar.a(jidVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = jidVar.l;
                        arrayList = jidVar.k;
                        Iterable iterable2 = jidVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        iterable = iterable2;
                    }
                    ((ArrayList) this.a).clear();
                    Set keySet = hashMap.keySet();
                    Set keySet2 = hashMap.keySet();
                    keySet2.getClass();
                    keySet.removeAll(wop.h(keySet2, iterable));
                    Set keySet3 = ((HashMap) this.f).keySet();
                    Set keySet4 = hashMap.keySet();
                    keySet4.getClass();
                    keySet3.removeAll(wop.h(keySet4, iterable));
                    ((HashMap) this.e).clear();
                    a = tah.a(v75.o(arrayList, 10));
                    if (a < 16) {
                        a = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                    for (Object obj2 : arrayList) {
                        linkedHashMap.put(((mqs) obj2).a, obj2);
                    }
                    hashMap.putAll(linkedHashMap);
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            ((ArrayList) this.a).clear();
            Set keySet5 = hashMap.keySet();
            Set keySet22 = hashMap.keySet();
            keySet22.getClass();
            keySet5.removeAll(wop.h(keySet22, iterable));
            Set keySet32 = ((HashMap) this.f).keySet();
            Set keySet42 = hashMap.keySet();
            keySet42.getClass();
            keySet32.removeAll(wop.h(keySet42, iterable));
            ((HashMap) this.e).clear();
            a = tah.a(v75.o(arrayList, 10));
            if (a < 16) {
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(a);
            while (r6.hasNext()) {
            }
            hashMap.putAll(linkedHashMap2);
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        jidVar = new jid(this, cg6Var);
        Object obj3 = jidVar.m;
        nm6 nm6Var2 = nm6.a;
        i = jidVar.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(String str, e5d e5dVar, cg6 cg6Var) {
        kid kidVar;
        int i;
        qqi qqiVar;
        HashMap hashMap = (HashMap) this.e;
        try {
            if (cg6Var instanceof kid) {
                kidVar = (kid) cg6Var;
                int i2 = kidVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kidVar.o = i2 - Integer.MIN_VALUE;
                    Object obj = kidVar.m;
                    nm6 nm6Var = nm6.a;
                    i = kidVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.b;
                        kidVar.j = str;
                        kidVar.k = e5dVar;
                        kidVar.l = qqiVar;
                        kidVar.o = 1;
                        if (qqiVar.a(kidVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = kidVar.l;
                        e5dVar = kidVar.k;
                        String str2 = kidVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        str = str2;
                    }
                    ((ArrayList) this.g).clear();
                    Set keySet = hashMap.keySet();
                    Set keySet2 = hashMap.keySet();
                    keySet2.getClass();
                    keySet.removeAll(wop.g(keySet2, str));
                    Set keySet3 = ((HashMap) this.f).keySet();
                    Set keySet4 = hashMap.keySet();
                    keySet4.getClass();
                    keySet3.removeAll(wop.g(keySet4, str));
                    ((HashMap) this.d).clear();
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            ((ArrayList) this.g).clear();
            Set keySet5 = hashMap.keySet();
            Set keySet22 = hashMap.keySet();
            keySet22.getClass();
            keySet5.removeAll(wop.g(keySet22, str));
            Set keySet32 = ((HashMap) this.f).keySet();
            Set keySet42 = hashMap.keySet();
            keySet42.getClass();
            keySet32.removeAll(wop.g(keySet42, str));
            ((HashMap) this.d).clear();
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        kidVar = new kid(this, cg6Var);
        Object obj2 = kidVar.m;
        nm6 nm6Var2 = nm6.a;
        i = kidVar.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(Iterable iterable, cg6 cg6Var) {
        lid lidVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof lid) {
                lidVar = (lid) cg6Var;
                int i2 = lidVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lidVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = lidVar.l;
                    nm6 nm6Var = nm6.a;
                    i = lidVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.b;
                        lidVar.j = iterable;
                        lidVar.k = qqiVar;
                        lidVar.n = 1;
                        if (qqiVar.a(lidVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = lidVar.k;
                        Iterable iterable2 = lidVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        iterable = iterable2;
                    }
                    z75.t((ArrayList) this.a, iterable);
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            z75.t((ArrayList) this.a, iterable);
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        lidVar = new lid(this, cg6Var);
        Object obj2 = lidVar.l;
        nm6 nm6Var2 = nm6.a;
        i = lidVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(String str, cg6 cg6Var) {
        mid midVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof mid) {
                midVar = (mid) cg6Var;
                int i2 = midVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    midVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = midVar.l;
                    nm6 nm6Var = nm6.a;
                    i = midVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.b;
                        midVar.j = str;
                        midVar.k = qqiVar;
                        midVar.n = 1;
                        if (qqiVar.a(midVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = midVar.k;
                        String str2 = midVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        str = str2;
                    }
                    ((ArrayList) this.g).add(str);
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            ((ArrayList) this.g).add(str);
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        midVar = new mid(this, cg6Var);
        Object obj2 = midVar.l;
        nm6 nm6Var2 = nm6.a;
        i = midVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:12:0x0053, B:14:0x006e), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(o3f o3fVar, cg6 cg6Var) {
        nid nidVar;
        int i;
        String str;
        qqi qqiVar;
        ArrayList arrayList = (ArrayList) this.h;
        try {
            if (cg6Var instanceof nid) {
                nidVar = (nid) cg6Var;
                int i2 = nidVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nidVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = nidVar.l;
                    nm6 nm6Var = nm6.a;
                    i = nidVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        String valueOf = String.valueOf(o3fVar);
                        qqi qqiVar2 = (qqi) this.b;
                        nidVar.j = valueOf;
                        nidVar.k = qqiVar2;
                        nidVar.n = 1;
                        if (qqiVar2.a(nidVar) == nm6Var) {
                            return nm6Var;
                        }
                        str = valueOf;
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = nidVar.k;
                        str = nidVar.j;
                        qgg.h0(obj);
                    }
                    ssg.a(6, null, "badRequest args: " + str, null);
                    arrayList.add(str);
                    if (arrayList.size() > 50) {
                        arrayList.remove(0);
                    }
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            ssg.a(6, null, "badRequest args: " + str, null);
            arrayList.add(str);
            if (arrayList.size() > 50) {
            }
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        nidVar = new nid(this, cg6Var);
        Object obj2 = nidVar.l;
        nm6 nm6Var2 = nm6.a;
        i = nidVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:12:0x0034, B:14:0x00ab, B:16:0x00b3, B:17:0x00c1), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[Catch: all -> 0x007c, TryCatch #1 {all -> 0x007c, blocks: (B:29:0x006f, B:31:0x0077, B:35:0x0084, B:36:0x0090), top: B:28:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(o3f o3fVar, cg6 cg6Var) {
        oid oidVar;
        Object obj;
        int i;
        oqi oqiVar;
        String str;
        int i2;
        oqi oqiVar2;
        int intValue;
        int i3;
        String str2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.i;
        try {
            if (cg6Var instanceof oid) {
                oidVar = (oid) cg6Var;
                int i4 = oidVar.q;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    oidVar.q = i4 - Integer.MIN_VALUE;
                    Object obj2 = oidVar.o;
                    obj = nm6.a;
                    i = oidVar.q;
                    if (i != 0) {
                        qgg.h0(obj2);
                        String valueOf = String.valueOf(o3fVar);
                        oqiVar = (qqi) this.b;
                        oidVar.j = o3fVar;
                        oidVar.k = valueOf;
                        oidVar.l = oqiVar;
                        oidVar.m = 0;
                        oidVar.q = 1;
                        if (oqiVar.a(oidVar) != obj) {
                            str = valueOf;
                            i2 = 0;
                        }
                        return obj;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = oidVar.n;
                        oqiVar2 = oidVar.l;
                        str2 = oidVar.k;
                        try {
                            qgg.h0(obj2);
                            intValue = i3;
                            str = str2;
                            if (linkedHashMap.size() > 50) {
                                Iterator it = linkedHashMap.entrySet().iterator();
                                it.next();
                                it.remove();
                            }
                            ssg.a(6, null, "retryRequest[" + intValue + "] args: " + str, null);
                            oqiVar2.b(null);
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    int i5 = oidVar.m;
                    oqiVar = oidVar.l;
                    str = oidVar.k;
                    o3f o3fVar2 = oidVar.j;
                    qgg.h0(obj2);
                    i2 = i5;
                    o3fVar = o3fVar2;
                    Integer num = (Integer) linkedHashMap.get(str);
                    intValue = num != null ? num.intValue() : 0;
                    if (intValue < 0 && intValue < 3) {
                        linkedHashMap.put(str, new Integer(intValue + 1));
                        oqiVar2 = oqiVar;
                        if (linkedHashMap.size() > 50) {
                        }
                        ssg.a(6, null, "retryRequest[" + intValue + "] args: " + str, null);
                        oqiVar2.b(null);
                        return Unit.a;
                    }
                    linkedHashMap.remove(str);
                    oidVar.j = null;
                    oidVar.k = str;
                    oidVar.l = oqiVar;
                    oidVar.m = i2;
                    oidVar.n = intValue;
                    oidVar.q = 2;
                    if (u(o3fVar, oidVar) != obj) {
                        oqiVar2 = oqiVar;
                        i3 = intValue;
                        str2 = str;
                        intValue = i3;
                        str = str2;
                        if (linkedHashMap.size() > 50) {
                        }
                        ssg.a(6, null, "retryRequest[" + intValue + "] args: " + str, null);
                        oqiVar2.b(null);
                        return Unit.a;
                    }
                    return obj;
                }
            }
            Integer num2 = (Integer) linkedHashMap.get(str);
            if (num2 != null) {
            }
            if (intValue < 0) {
            }
            linkedHashMap.remove(str);
            oidVar.j = null;
            oidVar.k = str;
            oidVar.l = oqiVar;
            oidVar.m = i2;
            oidVar.n = intValue;
            oidVar.q = 2;
            if (u(o3fVar, oidVar) != obj) {
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
            oqiVar2 = oqiVar;
            oqiVar2.b(null);
            throw th;
        }
        oidVar = new oid(this, cg6Var);
        Object obj22 = oidVar.o;
        obj = nm6.a;
        i = oidVar.q;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(cg6 cg6Var) {
        pid pidVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof pid) {
                pidVar = (pid) cg6Var;
                int i2 = pidVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pidVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = pidVar.k;
                    nm6 nm6Var = nm6.a;
                    i = pidVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar2 = (qqi) this.b;
                        pidVar.j = qqiVar2;
                        pidVar.m = 1;
                        if (qqiVar2.a(pidVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = pidVar.j;
                        qgg.h0(obj);
                    }
                    ((ArrayList) this.a).clear();
                    ((ArrayList) this.g).clear();
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            ((ArrayList) this.a).clear();
            ((ArrayList) this.g).clear();
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        pidVar = new pid(this, cg6Var);
        Object obj2 = pidVar.k;
        nm6 nm6Var2 = nm6.a;
        i = pidVar.m;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(z3q z3qVar, cg6 cg6Var) {
        qid qidVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof qid) {
                qidVar = (qid) cg6Var;
                int i2 = qidVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    qidVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = qidVar.l;
                    nm6 nm6Var = nm6.a;
                    i = qidVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.b;
                        qidVar.j = z3qVar;
                        qidVar.k = qqiVar;
                        qidVar.n = 1;
                        if (qqiVar.a(qidVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = qidVar.k;
                        z3q z3qVar2 = qidVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        z3qVar = z3qVar2;
                    }
                    this.c = z3qVar;
                    qqiVar.b(null);
                    return Unit.a;
                }
            }
            this.c = z3qVar;
            qqiVar.b(null);
            return Unit.a;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        qidVar = new qid(this, cg6Var);
        Object obj2 = qidVar.l;
        nm6 nm6Var2 = nm6.a;
        i = qidVar.n;
        if (i != 0) {
        }
    }

    public void y() {
        ((rjq) this.g).g();
        jyr jyrVar = (jyr) this.a;
        orr orrVar = (orr) jyrVar.getValue();
        String str = (String) this.f;
        HashMap hashMap = orrVar.e;
        if (str != null) {
            hashMap.remove(str);
        }
        orr orrVar2 = (orr) jyrVar.getValue();
        x7c x7cVar = (x7c) this.b;
        mrr mrrVar = (mrr) this.c;
        String str2 = (String) this.d;
        String str3 = (String) this.e;
        orrVar2.getClass();
        xdr a = ydr.a(nrr.c);
        String e = eta.e();
        x97.y(orrVar2.d, null, null, new f44(orrVar2, e, x7cVar, mrrVar, str2, str3, a, null), 3);
        orrVar2.e.put(e, a);
        this.f = e;
        B(e);
    }

    public void z(mqs mqsVar, String str, wsu wsuVar, String str2) {
        z5l z5lVar = (z5l) ((jyr) this.e).getValue();
        StationId o = StationId.o(mqsVar.a);
        o.getClass();
        z5lVar.d(y5g.Y(c9g.E(o), null, wsuVar, new qfn("mobile-history-my_vibe-default"), ((kxi) this.c).a(str2), null, str, null, true, 842), true, uyk.a);
    }
}
