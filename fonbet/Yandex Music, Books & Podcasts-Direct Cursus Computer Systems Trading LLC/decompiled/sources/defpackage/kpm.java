package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.view.Display;
import android.view.ViewGroup;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.gms.tasks.Task;
import com.yandex.messenger.websdk.api.SupportInfoProvider;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kpm implements x7o, num, kln, SupportInfoProvider, nwu, s0o, dn0, lml, pur, z7q, pun, rmp, ag6 {
    public final /* synthetic */ int a;
    public final Object b;

    public kpm(l2t l2tVar) {
        i1j i1jVar;
        this.a = 22;
        l2tVar.getClass();
        bw2 bw2Var = new bw2(l2tVar.b, 0);
        bw2 bw2Var2 = new bw2(l2tVar.c);
        bw2 bw2Var3 = new bw2(l2tVar.e, 4);
        r96 r96Var = l2tVar.d;
        bw2 bw2Var4 = new bw2(r96Var, 2);
        bw2 bw2Var5 = new bw2(r96Var, 3);
        b1j b1jVar = new b1j(r96Var);
        p0j p0jVar = new p0j(r96Var);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = l2tVar.a;
            String str = r3w.a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            i1jVar = new i1j((ConnectivityManager) systemService);
        } else {
            i1jVar = null;
        }
        this.b = xz0.w(new q86[]{bw2Var, bw2Var2, bw2Var3, bw2Var4, bw2Var5, b1jVar, p0jVar, i1jVar});
    }

    public static String H(int i, int i2, String str) {
        return i + '-' + i2 + '-' + str;
    }

    @Override // defpackage.num
    public void A(vk2 vk2Var) {
        aub aubVar = (aub) ((lum) this.b).c;
        if (aubVar != null) {
            aubVar.invoke(vk2Var);
        }
    }

    @Override // defpackage.lml
    public oq7 B() {
        return (oq7) ((ia0) this.b).e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x006a, code lost:
    
        if (r9 == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(ybu ybuVar, cg6 cg6Var) {
        d7u d7uVar;
        int i;
        List list;
        ybu ybuVar2;
        Object b;
        rj6 rj6Var;
        w7u w7uVar;
        ybu ybuVar3;
        f7u f7uVar;
        rj6 rj6Var2;
        vw5 vw5Var = (vw5) this.b;
        if (cg6Var instanceof d7u) {
            d7uVar = (d7u) cg6Var;
            int i2 = d7uVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d7uVar.n = i2 - Integer.MIN_VALUE;
                Object obj = d7uVar.l;
                nm6 nm6Var = nm6.a;
                i = d7uVar.n;
                s7u s7uVar = null;
                if (i != 0) {
                    qgg.h0(obj);
                    list = (List) gdg.C(ybuVar).a;
                    ybuVar2 = ybuVar;
                    d7uVar.j = ybuVar2;
                    d7uVar.k = list;
                    d7uVar.n = 1;
                    b = vw5Var.b(list, true, d7uVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = d7uVar.k;
                        ybuVar3 = d7uVar.j;
                        qgg.h0(obj);
                        rj6Var2 = (rj6) obj;
                        if (rj6Var2 instanceof qj6) {
                            if (rj6Var2 instanceof pj6) {
                                throw ((pj6) rj6Var2).a();
                            }
                            b6e.s();
                            return null;
                        }
                        w7uVar = (w7u) ((qj6) rj6Var2).a;
                        ybuVar2 = ybuVar3;
                        f7u u = p6g.u(w7uVar, gdg.D(ybuVar2), ybuVar2.b);
                        String str = w7uVar.a;
                        f7u f7uVar2 = !u.g() ? u : null;
                        s7u d = f7uVar2 == null ? f7uVar2.d() : null;
                        s7u c = u.c();
                        f7uVar = !u.f() ? u : null;
                        if (f7uVar != null) {
                            if (!f7uVar.f()) {
                                xq0.q("Queue does not contain pending item");
                                return null;
                            }
                            s7uVar = (s7u) f7uVar.b.get(f7uVar.c.a + 1);
                        }
                        return new j7u(str, d, c, s7uVar, u, z2l.a);
                    }
                    list = d7uVar.k;
                    ybu ybuVar4 = d7uVar.j;
                    qgg.h0(obj);
                    b = obj;
                    ybuVar2 = ybuVar4;
                }
                rj6Var = (rj6) b;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        throw ((pj6) rj6Var).a();
                    }
                    b6e.s();
                    return null;
                }
                w7uVar = (w7u) ((qj6) rj6Var).a;
                if (w7uVar.d) {
                    d7uVar.j = ybuVar2;
                    d7uVar.k = null;
                    d7uVar.n = 2;
                    Object b2 = vw5Var.b(list, true, d7uVar);
                    if (b2 != nm6Var) {
                        ybuVar3 = ybuVar2;
                        obj = b2;
                        rj6Var2 = (rj6) obj;
                        if (rj6Var2 instanceof qj6) {
                        }
                    }
                    return nm6Var;
                }
                f7u u2 = p6g.u(w7uVar, gdg.D(ybuVar2), ybuVar2.b);
                String str2 = w7uVar.a;
                if (!u2.g()) {
                }
                if (f7uVar2 == null) {
                }
                s7u c2 = u2.c();
                if (!u2.f()) {
                }
                if (f7uVar != null) {
                }
                return new j7u(str2, d, c2, s7uVar, u2, z2l.a);
            }
        }
        d7uVar = new d7u(this, cg6Var);
        Object obj2 = d7uVar.l;
        nm6 nm6Var2 = nm6.a;
        i = d7uVar.n;
        s7u s7uVar2 = null;
        if (i != 0) {
        }
        rj6Var = (rj6) b;
        if (rj6Var instanceof qj6) {
        }
    }

    @Override // defpackage.z7q
    public Object D(z1q z1qVar) {
        z1qVar.getClass();
        return vnw.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        if (defpackage.s7g.x(r4, r2, r3, r5) == false) goto L52;
     */
    @Override // defpackage.z7q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(k9q k9qVar) {
        szu szuVar;
        k9qVar.getClass();
        maq maqVar = (maq) this.b;
        if (maqVar instanceof jbq) {
            q7q q = pcg.q((t7q) ((kr7) k9qVar).o.getValue());
            if (q != null && (szuVar = (szu) q.a) != null) {
                hbq J = neg.J(szuVar.a.getId());
                jbq jbqVar = (jbq) maqVar;
                hbq id = jbqVar.b.getId();
                id.getClass();
                if (qgg.Z(id, qgg.P(J), qgg.Q(J), J instanceof cbq)) {
                    List n = jbqVar.n();
                    ArrayList arrayList = new ArrayList(v75.o(n, 10));
                    Iterator it = n.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((naq) it.next()).c.a);
                    }
                    List j = szuVar.j();
                    ArrayList arrayList2 = new ArrayList(v75.o(j, 10));
                    Iterator it2 = j.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((jzs) it2.next()).a.a);
                    }
                    if (!arrayList2.equals(arrayList) && !s7g.w(arrayList2, arrayList) && !s7g.w(arrayList, arrayList2)) {
                        if (arrayList2.size() == arrayList.size() && arrayList2.size() != 1) {
                            int size = arrayList2.size();
                            int i = 0;
                            while (i < size && Intrinsics.d(arrayList2.get(i), arrayList.get(i))) {
                                i++;
                            }
                            if (i != size) {
                                if (!s7g.x(i, size, arrayList2, arrayList)) {
                                }
                            }
                        }
                    }
                    return new ynw(new tnw(k9qVar, szuVar, jbqVar));
                }
            }
        } else if (maqVar instanceof raq) {
            return new xnw((raq) maqVar);
        }
        return wnw.a;
    }

    @Override // defpackage.rmp
    public void F(nkp nkpVar, String str) {
        coh cohVar;
        msg msgVar = b4x.i;
        b4x b4xVar = (b4x) this.b;
        msgVar.b("onSessionStarted with transferType = %d", Integer.valueOf(b4xVar.e));
        if (b4xVar.a.n && b4xVar.e == 2) {
            if (b4xVar.h == null) {
                msgVar.b("skip restoring session state due to null SessionState", new Object[0]);
            } else {
                xun a = b4xVar.a();
                if (a == null) {
                    msgVar.b("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                } else {
                    msgVar.b("resume SessionState to current session", new Object[0]);
                    xmp xmpVar = b4xVar.h;
                    if (xmpVar != null && (cohVar = xmpVar.a) != null) {
                        xun.l.b("resume SessionState", new Object[0]);
                        y1g.B("Must be called from the main thread.");
                        if (a.y()) {
                            xun.z(new r1x(a, cohVar, 1));
                        } else {
                            xun.t();
                        }
                    }
                }
            }
        }
        b4xVar.c();
    }

    @Override // defpackage.z7q
    public Object G(b1q b1qVar) {
        q7q q;
        y4d y4dVar;
        b1qVar.getClass();
        maq maqVar = (maq) this.b;
        return (!(maqVar instanceof eaq) || (q = pcg.q((t7q) ((nq7) b1qVar).t.getValue())) == null || (y4dVar = (y4d) q.a) == null || !new caq(y4dVar.a.a.a.a()).equals(((eaq) maqVar).b.c)) ? wnw.a : new ynw(new rnw());
    }

    public void I(bve bveVar, boolean z) {
        bveVar.getClass();
        if (z) {
            y6s y6sVar = ((e8s) this.b).n;
            y6sVar.getClass();
            ((lkj) ((kkj) y6sVar.b.getValue())).b(bveVar);
        }
    }

    public void J(bve bveVar, boolean z) {
        bveVar.getClass();
        e8s e8sVar = (e8s) this.b;
        x97.y(ot0.F(e8sVar), null, null, new ak1(z, e8sVar, bveVar, (Continuation) null, 10), 3);
    }

    public void K() {
        for (u1o u1oVar : (u1o[]) this.b) {
            u1oVar.reset();
        }
    }

    public pjc L(t4w t4wVar) {
        t4wVar.getClass();
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q86) obj).c(t4wVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((q86) it.next()).b(t4wVar.j));
        }
        return zsd.b0(new f9l(24, (pjc[]) CollectionsKt.w0(arrayList2).toArray(new pjc[0])));
    }

    public void M() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + P());
    }

    public void N(long j) {
        long P = P();
        if (P != j) {
            if (P != -1) {
                if (P != -2) {
                    return;
                } else {
                    P = -2;
                }
            }
            StringBuilder l = tlm.l(j, "expected non-string scope or scope ", " but found ");
            l.append(P);
            throw new IOException(l.toString());
        }
    }

    @Override // defpackage.nwu
    public void O(boolean z) {
        ((nrs) this.b).d.dismiss();
    }

    public long P() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // defpackage.s0o
    public t0o a() {
        return (t0o) this.b;
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        m9x m9xVar = new m9x(0, (i8s) obj2);
        llx llxVar = (llx) ((ajx) obj).s();
        j0n j0nVar = (j0n) this.b;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(llxVar.h);
        int i = a5x.a;
        obtain.writeStrongBinder(m9xVar);
        obtain.writeInt(1);
        j0nVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            llxVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // defpackage.kln
    public boolean b(rv8 rv8Var, rv8 rv8Var2, ViewGroup viewGroup, pm9 pm9Var) {
        return false;
    }

    @Override // defpackage.lml
    public mm6 c() {
        return (tf6) ((ia0) this.b).a;
    }

    @Override // defpackage.rmp
    public /* bridge */ /* synthetic */ void e(nkp nkpVar) {
    }

    @Override // defpackage.num
    public void f() {
        u8c u8cVar = (u8c) ((lum) this.b).b;
        if (u8cVar != null) {
            u8cVar.invoke();
        }
    }

    @Override // defpackage.rmp
    public /* bridge */ /* synthetic */ void g(nkp nkpVar, boolean z) {
    }

    @Override // defpackage.dn0
    public qic get(int i) {
        return ((bjc[]) this.b)[i];
    }

    @Override // defpackage.rmp
    public /* bridge */ /* synthetic */ void h(nkp nkpVar, int i) {
    }

    @Override // defpackage.kln
    public ado i() {
        return (ado) this.b;
    }

    @Override // defpackage.rmp
    public /* bridge */ /* synthetic */ void j(nkp nkpVar, int i) {
    }

    @Override // defpackage.num
    public void k() {
        u8c u8cVar = (u8c) ((lum) this.b).a;
        if (u8cVar != null) {
            u8cVar.invoke();
        }
    }

    @Override // defpackage.pur
    public void l(zco zcoVar, float f) {
        zcoVar.getClass();
        ((knn) this.b).l(zcoVar, f);
    }

    @Override // defpackage.kln
    public boolean m() {
        return false;
    }

    @Override // defpackage.rmp
    public /* bridge */ /* synthetic */ void n(nkp nkpVar, String str) {
    }

    @Override // defpackage.z7q
    public Object o(a1q a1qVar) {
        a1qVar.getClass();
        return wnw.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    @Override // defpackage.x7o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSuccess(Object obj) {
        String string;
        String string2;
        String string3;
        String string4;
        gl2 gl2Var;
        Object obj2;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((ggk) obj).getClass();
                ((lpm) obj3).r.l(new fpm(true));
                break;
            default:
                List list = (List) obj;
                list.getClass();
                rro rroVar = (rro) obj3;
                SharedPreferences sharedPreferences = rroVar.o;
                sharedPreferences.getClass();
                String string5 = sharedPreferences.getString("com.yandex.payment.LAST_USED_BANK_NAME", null);
                if (string5 == null || (string = sharedPreferences.getString("com.yandex.payment.LAST_USED_BANK_SCHEME", null)) == null || (string2 = sharedPreferences.getString("com.yandex.payment.LAST_USED_BANK_ICON_URI", null)) == null || (string3 = sharedPreferences.getString("com.yandex.payment.LAST_USED_BANK_URL_TEMPLATE", null)) == null || (string4 = sharedPreferences.getString("com.yandex.payment.LAST_USED_BANK_WEB_CLIENT_URI", null)) == null) {
                    gl2Var = null;
                } else {
                    boolean z = sharedPreferences.getBoolean("com.yandex.payment.LAST_USED_BANK_IS_WEB_CLIENT_ACTIVE", false);
                    boolean z2 = sharedPreferences.getBoolean("com.yandex.payment.LAST_USED_BANK_SBP_TOKEN_BINDING_ON", true);
                    Uri parse = Uri.parse(string2);
                    parse.getClass();
                    gl2Var = new gl2(string5, string, parse, string4, z, string3, z2);
                }
                if (gl2Var != null) {
                    List list2 = list;
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((fl2) obj2).b.equals(gl2Var.b)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (obj2 == null) {
                        rroVar.v = 0;
                        list = CollectionsKt.g0(t75.c(gl2Var), list2);
                        if (!list.isEmpty()) {
                            rroVar.L();
                            break;
                        } else {
                            rroVar.z = hro.b;
                            rroVar.w = rro.a(rroVar);
                            g0c g0cVar = rroVar.q;
                            ArrayList M = rro.M(rroVar.t);
                            String str = rroVar.p;
                            if (str == null) {
                                str = rro.a(rroVar);
                            }
                            String concat = "Список установленных банков отображен: ".concat(CollectionsKt.X(M, ", ", null, null, null, 62));
                            if (str != null) {
                                concat = ouj.o(concat, "; выбранный банк: ", str);
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            r1f r1fVar = r1f.a;
                            my0 my0Var = new my0();
                            Iterator it2 = M.iterator();
                            while (it2.hasNext()) {
                                my0Var.b.add(new jkr((String) it2.next()));
                            }
                            linkedHashMap.put("bank_list", my0Var);
                            if (str != null) {
                                linkedHashMap.put("selected_bank", new jkr(str));
                            }
                            vtm k = su4.k(concat, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                            ci0 ci0Var = qjb.a;
                            ci0Var.a = su4.g(1, ci0Var.a);
                            k.u(qee.n() + ci0Var.a, "eventus_id");
                            qne j = su4.j(k, "event_name", "sbp_installed_bank_list-shown", "sbp_installed_bank_list-shown", k);
                            x60 x60Var = (x60) g0cVar;
                            x60Var.getClass();
                            x60Var.a(j);
                            rro.G(rroVar, list, true);
                            break;
                        }
                    }
                }
                rroVar.v = null;
                if (!list.isEmpty()) {
                }
                break;
        }
    }

    @Override // defpackage.ag6
    public Object p(Task task) {
        y8p y8pVar = (y8p) this.b;
        if (task.l() || task.j()) {
            return task;
        }
        Exception g = task.g();
        if (!(g instanceof qo0)) {
            return task;
        }
        int i = ((qo0) g).a.a;
        if (i != 43001 && i != 43002 && i != 43003 && i != 17) {
            return i == 43000 ? ywf.v(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : i != 15 ? task : ywf.v(new Exception("The operation to get app set ID timed out. Please try again later."));
        }
        yfx yfxVar = (yfx) y8pVar.c;
        yfxVar.getClass();
        i8s i8sVar = new i8s();
        ((ExecutorService) yfxVar.c).execute(new rxw(yfxVar, i8sVar, false, 11));
        return i8sVar.a;
    }

    @Override // com.yandex.messenger.websdk.api.SupportInfoProvider
    public Map q() {
        apo apoVar = (apo) this.b;
        ssg.a(4, "SupportChat", "Requesting device info", null);
        Context context = (Context) apoVar.c;
        Display defaultDisplay = l1b.j(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        Pair pair = new Pair("app_client", "music_android");
        Pair pair2 = new Pair("app_version", "2026.07.4 #157gpr");
        Pair pair3 = new Pair("app_version_code", "24026391");
        Pair pair4 = new Pair("device", ouj.o(Build.MANUFACTURER, StringUtil.SPACE, Build.MODEL));
        Pair pair5 = new Pair("device_os", f1d.g("Android ", Build.VERSION.RELEASE));
        Pair pair6 = new Pair("device_resolution", point.y + "x" + point.x);
        Pair pair7 = new Pair("device_local_time", rd7.a.r(new Date(System.currentTimeMillis())));
        Pair pair8 = new Pair("device_timezone", TimeZone.getDefault().getDisplayName());
        Pair pair9 = new Pair("device_density_dpi", String.valueOf(sht.b(context).densityDpi));
        a40[] a40VarArr = a40.a;
        return uah.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("Signature", CollectionsKt.X(jo0.a(context), StringUtil.LF, null, null, null, 62)));
    }

    @Override // defpackage.z7q
    public Object r(a8q a8qVar) {
        u7u u7uVar;
        a8qVar.getClass();
        maq maqVar = (maq) this.b;
        if (maqVar instanceof vaq) {
            q7q q = pcg.q((t7q) ((s8q) a8qVar).n.getValue());
            if (q != null && (u7uVar = (u7u) q.a) != null) {
                vaq vaqVar = (vaq) maqVar;
                if (Intrinsics.d(new uaq(u7uVar.a.a.a), vaqVar.b.b)) {
                    return new ynw(new snw(a8qVar, u7uVar, vaqVar));
                }
            }
        } else if (maqVar instanceof raq) {
            return new xnw((raq) maqVar);
        }
        return wnw.a;
    }

    @Override // defpackage.z7q
    public Object s(wpw wpwVar) {
        wpwVar.getClass();
        return vnw.a;
    }

    @Override // defpackage.lml
    public kll t() {
        return (kll) ((ia0) this.b).g;
    }

    @Override // defpackage.lml
    public Object u(mwk mwkVar) {
        j2v j2vVar;
        mwkVar.getClass();
        f2v d0 = o2g.d0(mwkVar);
        if ((d0 instanceof x1v) || (d0 instanceof y1v) || d0.equals(z1v.a) || (d0 instanceof a2v) || d0.equals(b2v.a) || (d0 instanceof c2v)) {
            j2vVar = j2v.c;
        } else {
            if (!(d0 instanceof d2v)) {
                b6e.s();
                return null;
            }
            zfm zfmVar = j2v.a;
            s9p s9pVar = ((d2v) d0).a;
            zfmVar.getClass();
            s9pVar.getClass();
            j2vVar = o8g.z(s9pVar) ? j2v.b : j2v.c;
        }
        if (mwkVar instanceof jzs) {
            jzs jzsVar = (jzs) mwkVar;
            return v3g.T(jzsVar.a, jzsVar.c, j2vVar);
        }
        if (mwkVar instanceof k4d) {
            return v3g.V(((k4d) mwkVar).a);
        }
        if (mwkVar instanceof foc) {
            throw null;
        }
        if (mwkVar instanceof i5u) {
            return v3g.U(((i5u) mwkVar).a);
        }
        if (mwkVar instanceof m1q) {
            m1q m1qVar = (m1q) mwkVar;
            if (m1qVar instanceof j1q) {
                return v3g.V(((j1q) m1qVar).d);
            }
            if (m1qVar instanceof c2q) {
                return v3g.T(((c2q) m1qVar).f, null, j2vVar);
            }
            if (m1qVar instanceof e2q) {
                return new v1v(((e2q) m1qVar).c.d);
            }
            b6e.s();
            return null;
        }
        if (!(mwkVar instanceof faq)) {
            kac.j(mwkVar, "Developer Error. Unexpected class for visit ");
            return null;
        }
        faq faqVar = (faq) mwkVar;
        if (faqVar instanceof daq) {
            return v3g.V(((daq) faqVar).e);
        }
        if (faqVar instanceof naq) {
            return v3g.T(((naq) faqVar).e, null, j2vVar);
        }
        if (faqVar instanceof qaq) {
            return new v1v(null);
        }
        if (faqVar instanceof saq) {
            return v3g.U(((saq) faqVar).e);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.rmp
    public void v(nkp nkpVar, int i) {
        msg msgVar = b4x.i;
        msgVar.b("onSessionEnded with error = %d", Integer.valueOf(i));
        b4x b4xVar = (b4x) this.b;
        int i2 = b4xVar.e;
        if (i2 != 0) {
            if (b4xVar.h != null) {
                msgVar.b("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i2), b4xVar.h);
                Iterator it = new HashSet(b4xVar.b).iterator();
                while (it.hasNext()) {
                    ifx ifxVar = (ifx) it.next();
                    int i3 = b4xVar.e;
                    switch (ifxVar.a) {
                        case 0:
                            zfx.j.b("onTransferred with type = %d", Integer.valueOf(i3));
                            zfx zfxVar = (zfx) ifxVar.b;
                            zfxVar.c();
                            nhx b = zfxVar.c.b(zfxVar.g);
                            hhx n = ihx.n(b.d());
                            n.c();
                            ihx.y((ihx) n.b, i3);
                            b.e((ihx) n.b());
                            zfxVar.a.a((ohx) b.b(), 231);
                            zfxVar.i = false;
                            zfxVar.g = null;
                            break;
                    }
                }
            } else {
                msgVar.b("No need to notify with null sessionState", new Object[0]);
            }
        } else {
            msgVar.b("No need to notify transferred if the transfer type is unknown", new Object[0]);
        }
        if (b4xVar.e == 2) {
            return;
        }
        b4xVar.c();
    }

    @Override // defpackage.rmp
    public /* bridge */ /* synthetic */ void w(nkp nkpVar, int i) {
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        switch (this.a) {
            case 0:
                bfk bfkVar = (bfk) obj;
                bfkVar.getClass();
                ((lpm) this.b).r.l(new bpm(true, bfkVar));
                break;
            default:
                ((bfk) obj).getClass();
                ((rro) this.b).L();
                break;
        }
    }

    @Override // defpackage.rmp
    public /* bridge */ /* synthetic */ void y(nkp nkpVar) {
    }

    @Override // com.yandex.messenger.websdk.api.SupportInfoProvider
    public void z(k0r k0rVar) {
        apo apoVar = (apo) this.b;
        x97.y((tf6) apoVar.b, null, null, new n6p((Context) apoVar.c, k0rVar, null, 8), 3);
    }

    @Override // defpackage.kln
    public void clear() {
    }

    @Override // defpackage.nwu
    public void d() {
    }

    public /* synthetic */ kpm(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    public kpm(c1t c1tVar, vcg vcgVar) {
        this.a = 24;
        this.b = c1tVar;
    }

    public kpm(File file) {
        this.a = 9;
        file.getClass();
        this.b = file;
    }

    public kpm(tf6 tf6Var, u1o[] u1oVarArr) {
        this.a = 4;
        tf6Var.getClass();
        this.b = u1oVarArr;
        saf.Q(tf6Var.a).R(new mjm(11, this));
    }

    public kpm(qnq qnqVar) {
        this.a = 10;
        qnqVar.getClass();
        this.b = new zit(qnqVar.b, null, qnqVar.a);
    }

    public kpm(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new LinkedHashMap();
                break;
            case 16:
                this.b = t0o.a;
                break;
            case 20:
                this.b = new knn(3, new jzk(8));
                break;
            case 27:
                this.b = new ArrayDeque(16);
                break;
            default:
                this.b = new ado();
                break;
        }
    }

    public /* synthetic */ kpm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public kpm(long[] jArr) {
        xoi xoiVar;
        this.a = 11;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            xoiVar = new xoi(copyOf.length);
            int i = xoiVar.b;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = xoiVar.a;
                    if (jArr2.length < length) {
                        xoiVar.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = xoiVar.a;
                    int i2 = xoiVar.b;
                    if (i != i2) {
                        uz0.g(jArr3, jArr3, copyOf.length + i, i, i2);
                    }
                    uz0.g(copyOf, jArr3, i, 0, copyOf.length);
                    xoiVar.b += copyOf.length;
                }
            } else {
                e7o.o("");
                throw null;
            }
        } else {
            xoiVar = new xoi(16);
        }
        this.b = xoiVar;
    }

    public kpm(Field field) {
        this.a = 8;
        this.b = field;
        field.setAccessible(true);
    }

    public kpm(float f, float f2, cn0 cn0Var) {
        this.a = 17;
        int b = cn0Var.b();
        bjc[] bjcVarArr = new bjc[b];
        for (int i = 0; i < b; i++) {
            bjcVarArr[i] = new bjc(f, f2, cn0Var.a(i));
        }
        this.b = bjcVarArr;
    }
}
