package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.player.PreparingParams;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class apo implements zoo, nwu, nkq, ba7, rc {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public apo(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = new ciq(0);
                this.c = new ovg((Object) null);
                break;
            case 19:
                this.b = Collections.synchronizedMap(new WeakHashMap());
                this.c = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 20:
                break;
            default:
                this.b = new CopyOnWriteArrayList();
                this.c = new CopyOnWriteArrayList();
                break;
        }
    }

    @Override // defpackage.nwu
    public void O(boolean z) {
        ((g6p) this.b).s((s9p) this.c);
    }

    @Override // defpackage.zoo
    public Object a(goo gooVar, Object obj) {
        return ((Function2) this.b).invoke(gooVar, obj);
    }

    @Override // defpackage.nkq
    public void b(ka8 ka8Var) {
        ((nkq) this.b).b(ka8Var);
    }

    @Override // defpackage.ba7
    public void c(Exception exc) {
        o3r o3rVar = (o3r) this.c;
        jci jciVar = (jci) this.b;
        jci jciVar2 = o3rVar.f;
        if (jciVar2 == null || jciVar2 != jciVar) {
            return;
        }
        o3r o3rVar2 = (o3r) this.c;
        jci jciVar3 = (jci) this.b;
        xf7 xf7Var = o3rVar2.b;
        t97 t97Var = o3rVar2.g;
        ca7 ca7Var = jciVar3.c;
        xf7Var.a(t97Var, exc, ca7Var, ca7Var.e());
    }

    @Override // defpackage.rc
    public String e() {
        String str;
        mns mnsVar = (mns) x97.D(g.a, new glp((fos) this.c, null, 28));
        return (mnsVar == null || (str = mnsVar.a) == null) ? "" : str;
    }

    @Override // defpackage.zoo
    public Object f(Object obj) {
        return ((Function1) this.c).invoke(obj);
    }

    @Override // defpackage.ba7
    public void g(Object obj) {
        o3r o3rVar = (o3r) this.c;
        jci jciVar = (jci) this.b;
        jci jciVar2 = o3rVar.f;
        if (jciVar2 == null || jciVar2 != jciVar) {
            return;
        }
        o3r o3rVar2 = (o3r) this.c;
        jci jciVar3 = (jci) this.b;
        x68 x68Var = o3rVar2.a.p;
        if (obj == null || !x68Var.a(jciVar3.c.e())) {
            xf7 xf7Var = o3rVar2.b;
            daf dafVar = jciVar3.a;
            ca7 ca7Var = jciVar3.c;
            xf7Var.c(dafVar, obj, ca7Var, ca7Var.e(), o3rVar2.g);
            return;
        }
        o3rVar2.e = obj;
        xf7 xf7Var2 = o3rVar2.b;
        xf7Var2.D = 2;
        g8b g8bVar = xf7Var2.p;
        (g8bVar.m ? g8bVar.i : g8bVar.h).execute(xf7Var2);
    }

    public void h(List list) {
        if (list.isEmpty()) {
            return;
        }
        ((CopyOnWriteArrayList) this.b).addAll(list);
        o();
    }

    public void i(String str) {
        ((CopyOnWriteArrayList) this.b).add(str);
        o();
    }

    @Override // defpackage.rc
    public String j() {
        return ((frt) this.b).c().a;
    }

    public void k(opn opnVar, c9n c9nVar) {
        ciq ciqVar = (ciq) this.b;
        veu veuVar = (veu) ciqVar.get(opnVar);
        if (veuVar == null) {
            veuVar = veu.a();
            ciqVar.put(opnVar, veuVar);
        }
        veuVar.c = c9nVar;
        veuVar.a |= 8;
    }

    public xzi l() {
        return new xzi(new gvs[]{new j4x((xol) this.b), new mka((ejm) this.c)});
    }

    public ArrayList m() {
        return new ArrayList((CopyOnWriteArrayList) this.b);
    }

    public void n(String str) {
        Object t7oVar;
        String str2;
        HashSet u0;
        Object t7oVar2;
        String expandedManifestUrl;
        String scheme;
        Long startPosition;
        var varVar = (var) ((uar) this.c);
        varVar.getClass();
        try {
            r7o r7oVar = z7o.b;
            Uri parse = Uri.parse(str);
            String str3 = null;
            if (varVar.a.o == null && (scheme = parse.getScheme()) != null && StringsKt.M(scheme, "http", false)) {
                xar xarVar = varVar.a;
                olr olrVar = xarVar.c;
                String str4 = xarVar.a;
                it7 it7Var = new it7(str);
                PreparingParams preparingParams = xarVar.n;
                String contentId = preparingParams != null ? preparingParams.getContentId() : null;
                PreparingParams preparingParams2 = varVar.a.n;
                long longValue = (preparingParams2 == null || (startPosition = preparingParams2.getStartPosition()) == null) ? -9223372036854775807L : startPosition.longValue();
                PreparingParams preparingParams3 = varVar.a.n;
                boolean autoPlay = preparingParams3 != null ? preparingParams3.getAutoPlay() : false;
                PreparingParams preparingParams4 = varVar.a.n;
                String k = olrVar.k(str4, it7Var, contentId, longValue, autoPlay, preparingParams4 != null ? preparingParams4.getSourceIndex() : -1, false);
                it7 l = vut.l(k);
                xar xarVar2 = varVar.a;
                PreparingParams preparingParams5 = xarVar2.n;
                xarVar2.n = preparingParams5 != null ? preparingParams5.copy(new gcp(8, l, k)) : null;
                varVar.a.o = l;
                t7oVar = k;
            } else {
                PreparingParams preparingParams6 = varVar.a.n;
                String expandedManifestUrl2 = preparingParams6 != null ? preparingParams6.getExpandedManifestUrl() : null;
                if (expandedManifestUrl2 == null) {
                    expandedManifestUrl2 = "";
                }
                Uri parse2 = Uri.parse(expandedManifestUrl2);
                if (Intrinsics.d(parse.getScheme(), parse2.getScheme()) && !Intrinsics.d(parse.getHost(), parse2.getHost())) {
                    Set<String> queryParameterNames = parse.getQueryParameterNames();
                    queryParameterNames.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : queryParameterNames) {
                        if (!parse2.getQueryParameterNames().contains((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new Pair("name", parse.getQueryParameter((String) it.next())));
                    }
                    Uri.Builder buildUpon = parse.buildUpon();
                    buildUpon.clearQuery();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Pair pair = (Pair) it2.next();
                        buildUpon.appendQueryParameter((String) pair.a, (String) pair.b);
                    }
                    Set<String> queryParameterNames2 = parse2.getQueryParameterNames();
                    if (queryParameterNames2 != null) {
                        for (String str5 : queryParameterNames2) {
                            buildUpon.appendQueryParameter(str5, parse2.getQueryParameter(str5));
                        }
                    }
                    expandedManifestUrl = buildUpon.build().toString();
                } else if (Intrinsics.d(parse.getScheme(), parse2.getScheme()) && Intrinsics.d(parse.getHost(), parse2.getHost()) && Intrinsics.d(parse.getPath(), parse2.getPath())) {
                    expandedManifestUrl = null;
                } else {
                    PreparingParams preparingParams7 = varVar.a.n;
                    expandedManifestUrl = preparingParams7 != null ? preparingParams7.getExpandedManifestUrl() : null;
                    if (expandedManifestUrl == null) {
                        expandedManifestUrl = "";
                    }
                }
                if (expandedManifestUrl != null) {
                    xar xarVar3 = varVar.a;
                    PreparingParams preparingParams8 = xarVar3.n;
                    xarVar3.n = preparingParams8 != null ? preparingParams8.copy(new r23(expandedManifestUrl, 9)) : null;
                    str3 = expandedManifestUrl;
                }
                t7oVar = str3;
            }
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        r7o r7oVar3 = z7o.b;
        if ((t7oVar instanceof t7o) || (str2 = (String) t7oVar) == null) {
            return;
        }
        yjj yjjVar = varVar.a.h;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it3 = u0.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            try {
                r7o r7oVar4 = z7o.b;
                ((u9l) next).c0(str2);
                t7oVar2 = Unit.a;
            } catch (Throwable th2) {
                r7o r7oVar5 = z7o.b;
                t7oVar2 = new t7o(th2);
            }
            Throwable a = z7o.a(t7oVar2);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
    }

    public void o() {
        ArrayList m = m();
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((i3a) it.next()).a(m);
        }
    }

    @Override // defpackage.nkq
    public void onError(Throwable th) {
        try {
            ((g3a) ((zeh) this.c).c).accept(th);
        } catch (Throwable th2) {
            leu.a0(th2);
            th = new ar5(th, th2);
        }
        ((nkq) this.b).onError(th);
    }

    @Override // defpackage.nkq
    public void onSuccess(Object obj) {
        ((nkq) this.b).onSuccess(obj);
    }

    public void p(m6v m6vVar, n6v n6vVar) {
        Function0 function0 = (Function0) this.c;
        m6vVar.getClass();
        n6vVar.getClass();
        String str = n6vVar.c;
        boolean z = n6vVar.b;
        String str2 = n6vVar.d;
        ((Function2) this.b).invoke(m6vVar, n6vVar);
        if (m6vVar.i) {
            p1v p1vVar = (p1v) function0.invoke();
            p1vVar.getClass();
            jyr jyrVar = y7a.a;
            y7a.a(p1vVar.a.a, str2, z);
            return;
        }
        if (str == null || StringsKt.U(str)) {
            w1g.y(((p1v) function0.invoke()).a.a, str2, z);
            return;
        }
        p1v p1vVar2 = (p1v) function0.invoke();
        p1vVar2.getClass();
        str.getClass();
        w1g.y(p1vVar2.a.a, str, true);
    }

    public c9n q(opn opnVar, int i) {
        veu veuVar;
        c9n c9nVar;
        ciq ciqVar = (ciq) this.b;
        int d = ciqVar.d(opnVar);
        if (d >= 0 && (veuVar = (veu) ciqVar.j(d)) != null) {
            int i2 = veuVar.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                veuVar.a = i3;
                if (i == 4) {
                    c9nVar = veuVar.b;
                } else {
                    if (i != 8) {
                        xq0.x("Must provide flag PRE or POST");
                        return null;
                    }
                    c9nVar = veuVar.c;
                }
                if ((i3 & 12) == 0) {
                    ciqVar.h(d);
                    veuVar.a = 0;
                    veuVar.b = null;
                    veuVar.c = null;
                    veu.d.c(veuVar);
                }
                return c9nVar;
            }
        }
        return null;
    }

    public void r(opn opnVar) {
        veu veuVar = (veu) ((ciq) this.b).get(opnVar);
        if (veuVar == null) {
            return;
        }
        veuVar.a &= -2;
    }

    public void s(opn opnVar) {
        ovg ovgVar = (ovg) this.c;
        int h = ovgVar.h() - 1;
        while (true) {
            if (h < 0) {
                break;
            }
            if (opnVar == ovgVar.i(h)) {
                Object[] objArr = ovgVar.c;
                Object obj = objArr[h];
                Object obj2 = vq2.p;
                if (obj != obj2) {
                    objArr[h] = obj2;
                    ovgVar.a = true;
                }
            } else {
                h--;
            }
        }
        veu veuVar = (veu) ((ciq) this.b).remove(opnVar);
        if (veuVar != null) {
            veuVar.a = 0;
            veuVar.b = null;
            veuVar.c = null;
            veu.d.c(veuVar);
        }
    }

    public void t(Status status, boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.b)) {
            hashMap = new HashMap((Map) this.b);
        }
        synchronized (((Map) this.c)) {
            hashMap2 = new HashMap((Map) this.c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).d(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((i8s) entry2.getKey()).c(new qo0(status));
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                z0j Y = ezf.Y(this);
                Y.q((String) this.b, "name");
                Y.q(null, "schemaDescriptor");
                Y.q((List) this.c, "methods");
                Y.b = true;
                return Y.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nwu
    public void d() {
    }

    public /* synthetic */ apo(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public apo(IBinder iBinder) {
        this.a = 22;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new g7x(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public apo(String str, p0p p0pVar) {
        this.a = 1;
        str.getClass();
        p0pVar.getClass();
        this.b = str;
        this.c = p0pVar;
    }

    public /* synthetic */ apo(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public apo(xol xolVar, euk eukVar) {
        this.a = 10;
        eukVar.getClass();
        this.b = xolVar;
        this.c = eukVar;
    }

    public apo(ive iveVar, uar uarVar) {
        this.a = 7;
        uarVar.getClass();
        this.b = iveVar;
        this.c = uarVar;
    }

    public apo(Context context, fos fosVar, h4d h4dVar, Function0 function0, w4i w4iVar, w4i w4iVar2) {
        this.a = 11;
        function0.getClass();
        this.b = h4dVar;
        this.c = function0;
    }

    public apo(x1u x1uVar, gao gaoVar, sai saiVar) {
        this.a = 12;
        x1uVar.getClass();
        this.b = x1uVar;
        this.c = gaoVar;
    }

    public apo(uob uobVar, nsh nshVar, tf6 tf6Var) {
        this.a = 17;
        this.b = uobVar;
        this.c = tf6Var;
    }

    public apo(gqu gquVar) {
        this.a = 14;
        this.b = gquVar;
        this.c = new pzl(gquVar);
    }

    public apo(Context context) {
        this.a = 8;
        this.c = context;
        this.b = gld.e(dm6.b);
    }

    public apo(Context context, String str) {
        this.a = 4;
        this.c = str;
        this.b = context.getApplicationContext().getSharedPreferences("quarantine_master_token_shared_pref", 0).edit();
    }

    public apo(atn atnVar) {
        this.a = 3;
        String str = (String) atnVar.b;
        this.b = str;
        ArrayList<k3i> arrayList = (ArrayList) atnVar.c;
        HashSet hashSet = new HashSet(arrayList.size());
        for (k3i k3iVar : arrayList) {
            o2g.O(k3iVar, "method");
            String str2 = k3iVar.b;
            String str3 = k3iVar.c;
            o2g.M(str.equals(str3), "service names %s != %s", str3, str);
            o2g.H(str2, "duplicate name %s", hashSet.add(str2));
        }
        this.c = Collections.unmodifiableList(new ArrayList(arrayList));
    }
}
