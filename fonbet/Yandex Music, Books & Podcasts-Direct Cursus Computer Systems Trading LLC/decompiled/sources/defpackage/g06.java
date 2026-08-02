package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.viewinterop.a;
import androidx.fragment.app.t;
import androidx.media3.session.i;
import com.connectsdk.device.ConnectableDevice;
import com.google.gson.Gson;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.concert.info.screen.network.ConcertSkeletonApi;
import com.yandex.music.shared.skeleton.data.api.model.SkeletonDataDto;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import ru.yandex.music.R;
import ru.yandex.music.catalog.info.FullInfoActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;
import ru.yandex.video.m3.data.PlaybackParameters;

/* loaded from: classes5.dex */
public final class g06 implements l0e, rct, evt {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public g06(t tVar, dzf dzfVar, z0j z0jVar, t1f t1fVar, os8 os8Var, boolean z, lzp lzpVar, qy2 qy2Var) {
        tVar.getClass();
        dzfVar.getClass();
        lzpVar.getClass();
        qy2Var.getClass();
        this.a = dzfVar;
        this.b = z0jVar;
        this.c = t1fVar;
        ct8 a = lzpVar.a(qy2Var);
        a.b(os8Var);
        int i = 0;
        a.b = new es8(new zs8(i, this), i);
        a.f = new qs8(tVar, t1fVar, z);
        gc8 gc8Var = new gc8(new vb8(tVar, a.a(), dzfVar), null, 0, 6, null);
        bt8 bt8Var = (bt8) z0jVar.c;
        Object value = bt8Var.p.a.getValue();
        ts8 ts8Var = value instanceof ts8 ? (ts8) value : null;
        if (ts8Var != null) {
            rs8 rs8Var = ts8Var.a;
            wx2 wx2Var = bt8Var.n;
            ys8 ys8Var = rs8Var.d;
            String str = rs8Var.a;
            wx2Var.getClass();
            str.getClass();
            ((nmb) wx2Var.a.getValue()).f(wx2.a(ys8Var), str);
            gs8 gs8Var = bt8Var.l;
            String str2 = bt8Var.k;
            String str3 = rs8Var.b;
            gs8Var.getClass();
            str2.getClass();
            str3.getClass();
            jyr jyrVar = k3j.e;
            if (ixf.x()) {
                ((oi5) gs8Var.a.getValue()).i(str2, str3);
            } else {
                ((pi5) gs8Var.b.getValue()).e(str3);
            }
        }
        qyf F = wyf.F(dzfVar.getLifecycle());
        lhk lhkVar = (lhk) t1fVar.b;
        ox6.B(lhkVar.y, F, new v0a(gc8Var, 1));
        ox6.B(lhkVar.w, F, new fmi(18, t1fVar));
        this.d = gc8Var;
        ox6.B((fkn) z0jVar.e, wyf.F(dzfVar.getLifecycle()), new t58(3, this, qy2Var));
    }

    public static d70 a0(d70 d70Var, String str) {
        return !Intrinsics.d(str, d70Var.f) ? new d70(d70Var.a, d70Var.b, d70Var.c, d70Var.d, d70Var.e, str) : d70Var;
    }

    public static se5 j(c cVar, List list, m1q m1qVar, long j, Function1 function1) {
        mqs mqsVar;
        Object obj;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        Pair q = v75.q(list);
        List list2 = (List) q.a;
        List list3 = (List) q.b;
        if (m1qVar instanceof c2q) {
            mqsVar = ((c2q) m1qVar).d;
        } else {
            if (!(m1qVar instanceof j1q) && !(m1qVar instanceof e2q)) {
                b6e.s();
                return null;
            }
            mqsVar = null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d((mqs) obj, mqsVar)) {
                break;
            }
        }
        mqs mqsVar2 = (mqs) obj;
        if (mqsVar2 == null) {
            mqsVar2 = (mqs) CollectionsKt.Q(list2);
        }
        Long valueOf = Intrinsics.d(mqsVar2.a, m1qVar.d().a) ? Long.valueOf(j) : null;
        long longValue = valueOf != null ? valueOf.longValue() : 0L;
        pe5 pe5Var = new pe5(n1q.a, list3);
        cVar.getClass();
        list2.getClass();
        qe5 qe5Var = new qe5(cVar, new sfm(list2, 6), pe5Var);
        int indexOf = list2.indexOf(mqsVar2);
        qe5Var.g = mqsVar2;
        qe5Var.e = indexOf;
        qe5Var.f = longValue;
        function1.invoke(qe5Var);
        return qe5Var.b();
    }

    public static /* synthetic */ se5 k(g06 g06Var, c cVar, List list, m1q m1qVar, long j) {
        g4d g4dVar = new g4d(13);
        g06Var.getClass();
        return j(cVar, list, m1qVar, j, g4dVar);
    }

    public nmb A() {
        return (nmb) ((jyr) this.a).getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public Map B() {
        Map map;
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            ?? r2 = this.d;
            if (r2 != 0) {
                return r2;
            }
            try {
                map = p().J();
                ssg.a(3, null, "DEBUG_YM: load experiments details: " + map, null);
                this.d = map;
            } catch (IOException e) {
                ssg.a(7, null, "Failed to load experiments details from file.", e);
                this.d = null;
                map = e5b.a;
                map.getClass();
            }
            return map;
        } finally {
            reentrantLock.unlock();
        }
    }

    public mf C(kwg kwgVar) {
        boolean p;
        jyr jyrVar = (jyr) this.a;
        kwgVar.getClass();
        boolean z = kwgVar instanceof hwg;
        if (z) {
            p = ((t3g) ((u3g) jyrVar.getValue())).l(((hwg) kwgVar).a.a);
        } else if (kwgVar instanceof iwg) {
            p = ((t3g) ((u3g) jyrVar.getValue())).n(((iwg) kwgVar).a.a);
        } else {
            if (!(kwgVar instanceof jwg)) {
                b6e.s();
                return null;
            }
            p = ((t3g) ((u3g) jyrVar.getValue())).p(((jwg) kwgVar).a.d());
        }
        if ((kwgVar instanceof iwg) || (kwgVar instanceof jwg)) {
            return p ? mf.LIKE : mf.NEUTRAL;
        }
        if (z) {
            lt ltVar = ((hwg) kwgVar).a;
            return lxe.x(ltVar) ? p ? mf.SUBSCRIBED : mf.UNSUBSCRIBED : lxe.w(ltVar) ? p ? mf.SAVED : mf.UNSAVED : p ? mf.LIKE : mf.NEUTRAL;
        }
        b6e.s();
        return null;
    }

    public of D(kwg kwgVar) {
        kwgVar.getClass();
        if (kwgVar instanceof hwg) {
            return of.ALBUM;
        }
        if (kwgVar instanceof iwg) {
            return of.ARTIST;
        }
        if (kwgVar instanceof jwg) {
            return of.PLAYLIST;
        }
        b6e.s();
        return null;
    }

    public ps1 E(wrh wrhVar) {
        t56 t56Var;
        synchronized (this.a) {
            t56Var = (t56) ((xy0) this.c).get(wrhVar);
        }
        if (t56Var != null) {
            return t56Var.b;
        }
        return null;
    }

    public Map F() {
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            Map map = (Map) this.d;
            if (map != null) {
                return map;
            }
            LinkedHashMap W = P((String) this.a).W();
            this.d = W;
            return W;
        } catch (IOException e) {
            ssg.a(7, null, "Failed to load experiments from file.", e);
            this.d = null;
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void G(String str) {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ((ConcurrentHashMap) fsg.c.a).remove(new aic(str));
        List w0 = concurrentLinkedQueue != null ? CollectionsKt.w0(concurrentLinkedQueue) : null;
        if (w0 != null) {
            Iterator it = w0.iterator();
            while (it.hasNext()) {
                O((whc) it.next());
            }
        }
    }

    @Override // defpackage.rct
    public void H(qas qasVar) {
        ((oi9) this.b).setValueUpdater(qasVar);
    }

    public boolean I(wrh wrhVar) {
        boolean z;
        synchronized (this.a) {
            z = ((xy0) this.c).get(wrhVar) != null;
        }
        return z;
    }

    public boolean J(wrh wrhVar, int i) {
        t56 t56Var;
        synchronized (this.a) {
            t56Var = (t56) ((xy0) this.c).get(wrhVar);
        }
        i iVar = (i) ((WeakReference) this.d).get();
        return t56Var != null && t56Var.e.a(i) && iVar != null && iVar.t.f0().a(i);
    }

    public boolean K(wrh wrhVar, int i) {
        t56 t56Var;
        synchronized (this.a) {
            t56Var = (t56) ((xy0) this.c).get(wrhVar);
        }
        if (t56Var == null) {
            return false;
        }
        blp blpVar = t56Var.d;
        blpVar.getClass();
        boolean z = false;
        vq1.u("Use contains(Command) for custom command", i != 0);
        Iterator<E> it = blpVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((alp) it.next()).a == i) {
                z = true;
                break;
            }
        }
        return z;
    }

    public boolean L(wrh wrhVar, alp alpVar) {
        t56 t56Var;
        synchronized (this.a) {
            t56Var = (t56) ((xy0) this.c).get(wrhVar);
        }
        if (t56Var == null) {
            return false;
        }
        hee heeVar = t56Var.d.a;
        alpVar.getClass();
        return heeVar.contains(alpVar);
    }

    public LinkedHashMap M() {
        x3n x3nVar = ((byb) this.d).l;
        ReentrantLock reentrantLock = (ReentrantLock) x3nVar.a;
        reentrantLock.lock();
        try {
            HashMap hashMap = (HashMap) x3nVar.d;
            reentrantLock.unlock();
            LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(hashMap.size()));
            Iterator it = hashMap.entrySet().iterator();
            if (!it.hasNext()) {
                return linkedHashMap;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue().getClass();
            l1j.f();
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void N(yhc yhcVar, String str, jyr jyrVar, List list, String str2, String str3, String str4) {
        String str5 = (String) this.d;
        whc whcVar = new whc(yhcVar, str, jyrVar, new uhc(CollectionsKt.g0((n8g) this.b, list), System.currentTimeMillis(), new vhc(str2, str3, str4)));
        if (str5 != null) {
            n7b n7bVar = fsg.c;
            if (((ConcurrentHashMap) n7bVar.a).get(new aic(str5)) != null) {
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ((ConcurrentHashMap) n7bVar.a).get(new aic(str5));
                if (concurrentLinkedQueue != null) {
                    concurrentLinkedQueue.add(whcVar);
                    return;
                }
                return;
            }
        }
        O(whcVar);
    }

    public void O(whc whcVar) {
        String str = (String) this.d;
        if (str != null) {
            jyr c = fsg.c((arf) fsg.a.get(new aic(str)), whcVar.c);
            List list = (List) fsg.b.get(new aic(str));
            ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
            fsg.c(c, fsg.a(new Pair("tags", arrayList)));
        }
        ((xhc) this.a).getClass();
    }

    public h4b P(String str) {
        File filesDir = ((Context) this.b).getFilesDir();
        filesDir.getClass();
        return new h4b(new File(new File(new File(filesDir, "experiments2"), str), "main.txt"));
    }

    public ayb Q(zxb zxbVar, boolean z) {
        Integer intOrNull;
        String str = zxbVar.a;
        vx6 vx6Var = zxbVar.b;
        CountDownLatch countDownLatch = zxbVar.c;
        k5i k5iVar = ((byb) this.d).f;
        synchronized (k5iVar) {
            try {
                str.getClass();
                if (!k5iVar.c.contains(str)) {
                    File filesDir = k5iVar.a.getFilesDir();
                    filesDir.getClass();
                    File file = new File(new File(new File(filesDir, "experiments2"), str), "version.txt");
                    int i = 0;
                    if (file.exists() && file.isFile() && file.canRead() && (intOrNull = StringsKt.toIntOrNull(zac.d(file))) != null) {
                        i = intOrNull.intValue();
                    }
                    for (j5i j5iVar : k5iVar.b) {
                        if (i < j5iVar.a) {
                            j5iVar.a(str);
                        }
                    }
                    if (i != 2) {
                        File parentFile = file.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        try {
                            zac.f(file, "2");
                        } catch (IOException e) {
                            ssg.a(7, "Experiments", "Failed to write migration version for experiments for userid=" + str + " versionFile=" + file + " isFile=" + file.isFile() + " exists=" + file.exists() + " canRead=" + file.canRead() + " canWrite=" + file.canWrite() + " eventTimeFromStart=" + Long.valueOf(SystemClock.uptimeMillis() - Process.getStartUptimeMillis()), e);
                        }
                    }
                    k5iVar.c.add(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gyb gybVar = ((byb) this.d).b;
        gybVar.a.P();
        gybVar.b.B();
        ((fyb) vx6Var.c).b();
        ReentrantLock reentrantLock = (ReentrantLock) vx6Var.d;
        reentrantLock.lock();
        try {
            Map C = vx6Var.C();
            LinkedHashMap M = M();
            LinkedHashMap i2 = uah.i(C, M);
            reentrantLock = (ReentrantLock) vx6Var.d;
            reentrantLock.lock();
            try {
                ((g06) vx6Var.b).b0(i2);
                reentrantLock.unlock();
                Map map = C;
                countDownLatch.countDown();
                if (z) {
                    exb exbVar = exb.a;
                    Iterator it = ((byb) this.d).l.b0().iterator();
                    while (it.hasNext()) {
                        ((gxb) it.next()).c(exbVar);
                    }
                }
                return new ayb(str, map, M, vx6Var);
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void R(fiu fiuVar, Function2 function2) {
        ReentrantLock reentrantLock = (ReentrantLock) this.d;
        reentrantLock.lock();
        if (fiuVar != null) {
            try {
                this.c = fiuVar;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        function2.invoke((fyd) this.a, (fyd) this.b);
        reentrantLock.unlock();
    }

    public void S(fkb fkbVar) {
        nmb A = A();
        String G = ((fnb) this.b).G();
        if (G == null) {
            G = "";
        }
        gs4 gs4Var = (gs4) this.c;
        ckb ckbVar = (ckb) gs4Var.d;
        String str = (String) gs4Var.a;
        String str2 = (String) gs4Var.b;
        dkb dkbVar = (dkb) this.d;
        A.getClass();
        ckbVar.getClass();
        str.getClass();
        dkbVar.getClass();
        fkbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_type", "other");
        linkedHashMap.put("page_id", "main");
        linkedHashMap.put("hash", G);
        linkedHashMap.put("object_type", ckbVar.a);
        linkedHashMap.put("object_id", str);
        linkedHashMap.put("object_name", str2);
        linkedHashMap.put("opening_method", dkbVar.a);
        linkedHashMap.put("from", "bottomsheet_screen");
        linkedHashMap.put("to", fkbVar.a);
        dfi.p(1, "entity_type", "bottomsheet", "_meta", linkedHashMap);
        A.C("BottomSheet.Navigated", linkedHashMap);
    }

    public void T(sgr sgrVar) {
        synchronized (this.a) {
            try {
                if (((sgr) this.c) != null) {
                    return;
                }
                this.c = sgrVar;
                boolean isEmpty = ((HashSet) this.b).isEmpty();
                if (isEmpty) {
                    ((j8h) this.d).D.b(sgrVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void U(wrh wrhVar) {
        synchronized (this.a) {
            try {
                t56 t56Var = (t56) ((xy0) this.c).remove(wrhVar);
                if (t56Var == null) {
                    return;
                }
                ((xy0) this.b).remove(t56Var.a);
                t56Var.b.d();
                i iVar = (i) ((WeakReference) this.d).get();
                if (iVar == null || iVar.k()) {
                    return;
                }
                dvt.c0(iVar.l, new q56(iVar, wrhVar, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void V(String str, LinkedHashMap linkedHashMap) {
        byb bybVar = (byb) this.d;
        jyb jybVar = bybVar.d;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (bybVar.b.a((String) entry.getKey()) == null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ssg.a(3, null, "Reporting experiments: " + linkedHashMap, null);
        jybVar.getClass();
        HashMap hashMap = new HashMap(linkedHashMap2);
        hashMap.put("clid", "google-play");
        ot0.A(jybVar.e(), "experiments", hashMap);
        AppMetrica.sendEventsBuffer();
        if (!linkedHashMap2.isEmpty()) {
            String d = f1d.d(1, 1, linkedHashMap2.toString());
            int i = 0;
            while (true) {
                int i2 = 1024;
                if (d.length() <= 1024) {
                    break;
                }
                while (d.charAt(i2) != ',') {
                    i2--;
                }
                bow.z("experiments_" + i, d.substring(0, i2));
                d = d.substring(i2 + 2, d.length());
                i++;
            }
            bow.z("experiments_" + i, d);
        }
        boolean z = !Intrinsics.d(str, CommonUrlParts.Values.FALSE_INTEGER);
        y60 e = jybVar.e();
        arf g = tlm.g(bwf.c);
        ((Map) g.getValue()).put("is_authorised", Boolean.valueOf(z));
        tlm.o(e, "experiments_state", g.isInitialized() ? (Map) g.getValue() : null);
    }

    public void W(String str) {
        if (str == null) {
            str = null;
        }
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object X(boolean z, cg6 cg6Var) {
        j06 j06Var;
        int i;
        bii biiVar;
        rj6 J;
        if (cg6Var instanceof j06) {
            j06Var = (j06) cg6Var;
            int i2 = j06Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j06Var.l = i2 - Integer.MIN_VALUE;
                Object obj = j06Var.j;
                nm6 nm6Var = nm6.a;
                i = j06Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<SkeletonDataDto>> a = ((ConcertSkeletonApi) ((jyr) this.a).getValue()).a("concert_page", (String) this.b, z ? "no-cache" : null);
                    j06Var.l = 1;
                    obj = swf.N(a, j06Var);
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
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    snq t1 = gut.t1((SkeletonDataDto) ((aii) biiVar).a, (gnq) this.d, true);
                    J = t1 == null ? new nj6(null) : new qj6(t1);
                } else if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    if (name == null) {
                        name = "";
                    }
                    String message = musicBackendInvocationError.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    J = new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
                } else if (biiVar instanceof yhi) {
                    yhi yhiVar = (yhi) biiVar;
                    J = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                } else {
                    if (!(biiVar instanceof zhi)) {
                        b6e.s();
                        return null;
                    }
                    J = uwf.J((zhi) biiVar);
                }
                return u7g.Y(J);
            }
        }
        j06Var = new j06(this, cg6Var);
        Object obj2 = j06Var.j;
        nm6 nm6Var2 = nm6.a;
        i = j06Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
        return u7g.Y(J);
    }

    public zxb Y(String str) {
        byb bybVar = (byb) this.d;
        ReentrantLock reentrantLock = bybVar.h;
        reentrantLock.lock();
        try {
            zxb zxbVar = bybVar.i;
            boolean d = Intrinsics.d(zxbVar != null ? zxbVar.a : null, str);
            zxb zxbVar2 = bybVar.i;
            if (d) {
                zxbVar2.getClass();
            } else {
                if (zxbVar2 != null) {
                    zxbVar2.c.countDown();
                }
                zxbVar2 = new zxb(str, new vx6((g06) bybVar.a.invoke(str), (fyb) bybVar.c.invoke(str)), new CountDownLatch(1));
                bybVar.i = zxbVar2;
            }
            reentrantLock.unlock();
            bybVar.g.countDown();
            return zxbVar2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void Z(wrh wrhVar, blp blpVar, d8l d8lVar) {
        synchronized (this.a) {
            try {
                t56 t56Var = (t56) ((xy0) this.c).get(wrhVar);
                if (t56Var != null) {
                    t56Var.d = blpVar;
                    t56Var.e = d8lVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.evt
    public void a(c3c c3cVar) {
        ctg ctgVar = (ctg) this.c;
        ctgVar.e(btg.b(ctgVar.g, "Caught exception", c3cVar.getMessage(), null));
    }

    @Override // defpackage.evt
    public void b(JSONObject jSONObject) {
        Bundle bundle = (Bundle) this.a;
        try {
            bundle.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString(ConnectableDevice.KEY_ID));
            ((dcd) this.d).o((atg) this.b, bundle);
        } catch (JSONException e) {
            ctg ctgVar = (ctg) this.c;
            ctgVar.e(btg.b(ctgVar.g, "Caught exception", e.getMessage(), null));
        }
    }

    public void b0(LinkedHashMap linkedHashMap) {
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            if (Intrinsics.d((Map) this.d, linkedHashMap)) {
                return;
            }
            try {
                P((String) this.a).a0(linkedHashMap);
            } catch (IOException e) {
                ssg.a(7, null, "Failed to replace experiments in file.", e);
                linkedHashMap = null;
            }
            this.d = linkedHashMap;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void c(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1865939136);
        int i2 = (oq5Var.h(this) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            us8 us8Var = (us8) gld.O((fkn) ((z0j) this.b).e, oq5Var).getValue();
            if (Intrinsics.d(us8Var, ss8.a)) {
                oq5Var.Z(2128824196);
                oq5Var.p(false);
            } else {
                if (!(us8Var instanceof ts8)) {
                    throw vz1.i(oq5Var, 2128821039, false);
                }
                oq5Var.Z(1569102948);
                boolean h = oq5Var.h(this);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    K = new at5(16, this);
                    oq5Var.k0(K);
                }
                a.a(48, 4, oq5Var, d.d(vci.a, 1.0f), (Function1) K, null);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(this, i, 23);
        }
    }

    @Override // defpackage.rct
    public void d(Object obj) {
        CharSequence charSequence;
        String str = (String) obj;
        dfb dfbVar = (dfb) this.c;
        wz0 F = CollectionsKt.F(((ei9) this.a).A);
        xzb xzbVar = (xzb) this.d;
        kcc kccVar = new kcc(new lcc(F, true, new sv4(24, xzbVar, str)));
        oi9 oi9Var = (oi9) this.b;
        if (kccVar.hasNext()) {
            di9 di9Var = (di9) kccVar.next();
            if (kccVar.hasNext()) {
                dfbVar.e(new Throwable(hrg.q("Multiple options found with value = \"", str, "\", selecting first one")));
            }
            szb szbVar = di9Var.a;
            if (szbVar == null) {
                szbVar = di9Var.b;
            }
            charSequence = (CharSequence) szbVar.a(xzbVar);
        } else {
            dfbVar.e(new Throwable(ouj.k('\"', "No option found with value = \"", str)));
            charSequence = "";
        }
        oi9Var.setText(charSequence);
    }

    public void e(Object obj, wrh wrhVar, blp blpVar, d8l d8lVar) {
        synchronized (this.a) {
            try {
                wrh y = y(obj);
                if (y == null) {
                    ((xy0) this.b).put(obj, wrhVar);
                    ((xy0) this.c).put(wrhVar, new t56(obj, new ps1(), blpVar, d8lVar));
                } else {
                    t56 t56Var = (t56) ((xy0) this.c).get(y);
                    vq1.B(t56Var);
                    t56Var.d = blpVar;
                    t56Var.e = d8lVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l0e
    public c8k f(h0e h0eVar, xzd xzdVar) {
        h0eVar.getClass();
        return new ix6(new c9w(h0eVar, xzdVar, (upt) this.d), (h1b) this.a, (Uri) this.b, (PlaybackParameters) this.c);
    }

    public void g(wrh wrhVar, int i, s56 s56Var) {
        synchronized (this.a) {
            try {
                t56 t56Var = (t56) ((xy0) this.c).get(wrhVar);
                if (t56Var != null) {
                    d8l d8lVar = t56Var.g;
                    d8lVar.getClass();
                    bz2 bz2Var = new bz2(11);
                    bz2Var.j(d8lVar.a);
                    bz2Var.i(i);
                    t56Var.g = new d8l(bz2Var.q());
                    t56Var.c.add(s56Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(String str, m1q m1qVar, long j, cg6 cg6Var) {
        qfd qfdVar;
        int i;
        m1q m1qVar2;
        long j2;
        Pair pair;
        oq oqVar;
        if (cg6Var instanceof qfd) {
            qfdVar = (qfd) cg6Var;
            int i2 = qfdVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qfdVar.n = i2 - Integer.MIN_VALUE;
                Object obj = qfdVar.l;
                Object obj2 = nm6.a;
                i = qfdVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, null, "GlagolCastPlaybackConverter: convert album", null);
                    ms msVar = (ms) ((jyr) this.a).getValue();
                    qfdVar.j = m1qVar;
                    qfdVar.k = j;
                    qfdVar.n = 1;
                    obj = msVar.d(str, qfdVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    m1qVar2 = m1qVar;
                    j2 = j;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j3 = qfdVar.k;
                    m1q m1qVar3 = qfdVar.j;
                    qgg.h0(obj);
                    j2 = j3;
                    m1qVar2 = m1qVar3;
                }
                pair = (Pair) obj;
                if (pair != null || (oqVar = (oq) pair.a) == null) {
                    return null;
                }
                e eVar = (e) this.d;
                ru.yandex.music.common.media.context.a aVar = PlaybackScope.a;
                aVar.getClass();
                eVar.getClass();
                c b = aVar.b(oqVar);
                LinkedList linkedList = oqVar.F;
                ArrayList arrayList = new ArrayList(v75.o(linkedList, 10));
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Pair((mqs) it.next(), n1q.a));
                }
                return j(b, arrayList, m1qVar2, j2, new at5(27, oqVar));
            }
        }
        qfdVar = new qfd(this, cg6Var);
        Object obj3 = qfdVar.l;
        Object obj22 = nm6.a;
        i = qfdVar.n;
        if (i != 0) {
        }
        pair = (Pair) obj3;
        if (pair != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(String str, m1q m1qVar, long j, cg6 cg6Var) {
        rfd rfdVar;
        int i;
        m1q m1qVar2;
        long j2;
        Pair pair;
        if (cg6Var instanceof rfd) {
            rfdVar = (rfd) cg6Var;
            int i2 = rfdVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rfdVar.n = i2 - Integer.MIN_VALUE;
                Object obj = rfdVar.l;
                Object obj2 = nm6.a;
                i = rfdVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, null, "GlagolCastPlaybackConverter: convert artist", null);
                    o21 o21Var = (o21) ((jyr) this.b).getValue();
                    rfdVar.j = m1qVar;
                    rfdVar.k = j;
                    rfdVar.n = 1;
                    obj = o21Var.a(str, rfdVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    m1qVar2 = m1qVar;
                    j2 = j;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j3 = rfdVar.k;
                    m1q m1qVar3 = rfdVar.j;
                    qgg.h0(obj);
                    j2 = j3;
                    m1qVar2 = m1qVar3;
                }
                pair = (Pair) obj;
                if (pair != null) {
                    return null;
                }
                na1 na1Var = (na1) pair.a;
                c01 c01Var = na1Var.a;
                e eVar = (e) this.d;
                ru.yandex.music.common.media.context.a aVar = PlaybackScope.a;
                aVar.getClass();
                eVar.getClass();
                c d = aVar.d(c01Var);
                List a = na1Var.a();
                ArrayList arrayList = new ArrayList(v75.o(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Pair((mqs) it.next(), n1q.a));
                }
                return k(this, d, arrayList, m1qVar2, j2);
            }
        }
        rfdVar = new rfd(this, cg6Var);
        Object obj3 = rfdVar.l;
        Object obj22 = nm6.a;
        i = rfdVar.n;
        if (i != 0) {
        }
        pair = (Pair) obj3;
        if (pair != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096 A[LOOP:0: B:15:0x0090->B:17:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(cvl cvlVar, m1q m1qVar, long j, cg6 cg6Var) {
        sfd sfdVar;
        int i;
        cvl cvlVar2;
        m1q m1qVar2;
        long j2;
        Pair pair;
        List list;
        Iterator it;
        if (cg6Var instanceof sfd) {
            sfdVar = (sfd) cg6Var;
            int i2 = sfdVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sfdVar.o = i2 - Integer.MIN_VALUE;
                Object obj = sfdVar.m;
                Object obj2 = nm6.a;
                i = sfdVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, null, "GlagolCastPlaybackConverter: convert playlist", null);
                    nsl nslVar = (nsl) ((jyr) this.c).getValue();
                    sfdVar.j = cvlVar;
                    sfdVar.k = m1qVar;
                    sfdVar.l = j;
                    sfdVar.o = 1;
                    obj = nslVar.b(cvlVar, sfdVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    cvlVar2 = cvlVar;
                    m1qVar2 = m1qVar;
                    j2 = j;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = sfdVar.l;
                    m1q m1qVar3 = sfdVar.k;
                    cvl cvlVar3 = sfdVar.j;
                    qgg.h0(obj);
                    m1qVar2 = m1qVar3;
                    cvlVar2 = cvlVar3;
                }
                pair = (Pair) obj;
                if (pair == null || (list = ((rrl) pair.a).c) == null) {
                    return null;
                }
                e eVar = (e) this.d;
                ru.yandex.music.common.media.context.a aVar = PlaybackScope.a;
                aVar.getClass();
                eVar.getClass();
                c f = e.f(aVar, cvlVar2);
                List list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Pair((mqs) it.next(), n1q.a));
                }
                return k(this, f, arrayList, m1qVar2, j2);
            }
        }
        sfdVar = new sfd(this, cg6Var);
        Object obj3 = sfdVar.m;
        Object obj22 = nm6.a;
        i = sfdVar.o;
        if (i != 0) {
        }
        pair = (Pair) obj3;
        if (pair == null) {
            e eVar2 = (e) this.d;
            ru.yandex.music.common.media.context.a aVar2 = PlaybackScope.a;
            aVar2.getClass();
            eVar2.getClass();
            c f2 = e.f(aVar2, cvlVar2);
            List list22 = list;
            ArrayList arrayList2 = new ArrayList(v75.o(list22, 10));
            it = list22.iterator();
            while (it.hasNext()) {
            }
            return k(this, f2, arrayList2, m1qVar2, j2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(t1q t1qVar, vhd vhdVar, cg6 cg6Var) {
        tfd tfdVar;
        int i;
        arf a;
        se5 se5Var;
        long j;
        arf arfVar;
        se5 se5Var2;
        if (cg6Var instanceof tfd) {
            tfdVar = (tfd) cg6Var;
            int i2 = tfdVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tfdVar.m = i2 - Integer.MIN_VALUE;
                tfd tfdVar2 = tfdVar;
                Object obj = tfdVar2.k;
                Object obj2 = nm6.a;
                i = tfdVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (t1qVar != null) {
                        a = btf.a(bwf.c, new vd(25, this, t1qVar, vhdVar));
                        z3q z3qVar = t1qVar.a;
                        if (z3qVar instanceof u1q) {
                            return new ofd((u1q) z3qVar, vhdVar != null ? vhdVar.a : null, vhdVar != null ? vhdVar.e : 0L);
                        }
                        if (!(z3qVar instanceof a2q)) {
                            if (z3qVar instanceof c1q) {
                                String str = ((c1q) z3qVar).a.a;
                                m1q m1qVar = t1qVar.c;
                                j = vhdVar != null ? vhdVar.e : 0L;
                                tfdVar2.j = a;
                                tfdVar2.m = 1;
                                obj = h(str, m1qVar, j, tfdVar2);
                                if (obj != obj2) {
                                    arfVar = a;
                                    se5Var2 = (se5) obj;
                                }
                            } else if (z3qVar instanceof e1q) {
                                String str2 = ((e1q) z3qVar).a.a;
                                m1q m1qVar2 = t1qVar.c;
                                j = vhdVar != null ? vhdVar.e : 0L;
                                tfdVar2.j = a;
                                tfdVar2.m = 2;
                                obj = i(str2, m1qVar2, j, tfdVar2);
                                if (obj != obj2) {
                                    arfVar = a;
                                    se5Var2 = (se5) obj;
                                }
                            } else if (z3qVar instanceof r1q) {
                                cvl cvlVar = ((r1q) z3qVar).a;
                                m1q m1qVar3 = t1qVar.c;
                                j = vhdVar != null ? vhdVar.e : 0L;
                                tfdVar2.j = a;
                                tfdVar2.m = 3;
                                obj = l(cvlVar, m1qVar3, j, tfdVar2);
                                if (obj != obj2) {
                                    arfVar = a;
                                    se5Var2 = (se5) obj;
                                }
                            } else if (z3qVar instanceof h1q) {
                                m1q m1qVar4 = t1qVar.c;
                                j1q j1qVar = m1qVar4 instanceof j1q ? (j1q) m1qVar4 : null;
                                if (j1qVar != null) {
                                    return new mfd((h1q) z3qVar, j1qVar);
                                }
                                se5Var = null;
                            } else {
                                if (!(z3qVar instanceof k1q)) {
                                    b6e.s();
                                    return null;
                                }
                                se5Var = (se5) a.getValue();
                            }
                            return obj2;
                        }
                        mqs mqsVar = ((a2q) z3qVar).a;
                        m1q m1qVar5 = t1qVar.c;
                        j = vhdVar != null ? vhdVar.e : 0L;
                        ssg.a(3, null, "GlagolCastPlaybackConverter: convert track", null);
                        e eVar = (e) this.d;
                        h w = ru.yandex.music.common.media.context.d.w();
                        eVar.getClass();
                        se5Var = k(this, e.i(w, mqsVar), t75.c(new Pair(mqsVar, n1q.a)), m1qVar5, j);
                        if (se5Var == null) {
                            se5Var = (se5) a.getValue();
                        }
                        if (se5Var != null) {
                            return new nfd(se5Var);
                        }
                    }
                    return null;
                }
                if (i == 1) {
                    arfVar = (arf) tfdVar2.j;
                    qgg.h0(obj);
                    se5Var2 = (se5) obj;
                } else if (i == 2) {
                    arfVar = (arf) tfdVar2.j;
                    qgg.h0(obj);
                    se5Var2 = (se5) obj;
                } else {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arfVar = (arf) tfdVar2.j;
                    qgg.h0(obj);
                    se5Var2 = (se5) obj;
                }
                a = arfVar;
                se5Var = se5Var2;
                if (se5Var == null) {
                }
                if (se5Var != null) {
                }
                return null;
            }
        }
        tfdVar = new tfd(this, cg6Var);
        tfd tfdVar22 = tfdVar;
        Object obj3 = tfdVar22.k;
        Object obj22 = nm6.a;
        i = tfdVar22.m;
        if (i != 0) {
        }
        a = arfVar;
        se5Var = se5Var2;
        if (se5Var == null) {
        }
        if (se5Var != null) {
        }
        return null;
    }

    public f9h n() {
        String deviceId;
        f9h f9hVar = new f9h();
        f9hVar.put("Accept", "application/json");
        hwd hwdVar = (hwd) this.c;
        hwdVar.getClass();
        Context context = hwdVar.a;
        Function0 function0 = hwdVar.h;
        if (function0 == null || (deviceId = (String) function0.invoke()) == null) {
            deviceId = AppMetricaYandex.getDeviceId(context);
        }
        f9hVar.put("X-Yandex-Music-Device", ((jyr) this.a).getValue() + "; device_id=" + deviceId);
        tfs tfsVar = tfs.f;
        Date date = new Date(System.currentTimeMillis());
        tfsVar.getClass();
        String format = tfsVar.a().format(date);
        format.getClass();
        f9hVar.put("X-Yandex-Music-Client-Now", format);
        f9hVar.put("Accept-Language", hwdVar.d.a(context));
        fos fosVar = (fos) this.d;
        if (fosVar != null) {
            mns mnsVar = (mns) x97.D(g.a, new glp(fosVar, null, 28));
            if (mnsVar != null) {
                f9hVar.put("Authorization", "OAuth " + mnsVar);
            }
        }
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        f9hVar.put("X-Request-Id", uuid);
        return f9hVar.b();
    }

    @Override // defpackage.l0e
    public c8k o() {
        return new ix6(new c9w(h0e.l, null, (upt) this.d), (h1b) this.a, (Uri) this.b, (PlaybackParameters) this.c);
    }

    public nnk p() {
        File filesDir = ((Context) this.a).getFilesDir();
        filesDir.getClass();
        return new nnk(new File(new File(filesDir, "experiments2"), "forceddetails.txt"), (Gson) this.b);
    }

    public void q(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            wvs.p("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((ciq) this.b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                q(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void r() {
        String str = (String) this.d;
        if (str != null) {
            G(str);
        }
    }

    public void s() {
        String str = (String) this.d;
        if (str != null) {
            ((ConcurrentHashMap) fsg.c.a).put(new aic(str), new ConcurrentLinkedQueue());
        }
    }

    public void t(bi6 bi6Var, String str) {
        q43 q43Var = (q43) this.a;
        int ordinal = bi6Var.ordinal();
        if (ordinal == 0) {
            d70 d70Var = (d70) this.b;
            if (d70Var != null) {
                q43Var.e(d70Var, str);
                return;
            }
            return;
        }
        if (ordinal == 1) {
            d70 d70Var2 = (d70) this.c;
            if (d70Var2 != null) {
                q43Var.e(d70Var2, str);
                return;
            }
            return;
        }
        if (ordinal != 2) {
            b6e.s();
            return;
        }
        d70 d70Var3 = (d70) this.d;
        if (d70Var3 != null) {
            q43Var.e(d70Var3, str);
        }
    }

    public void u(t56 t56Var) {
        final s56 s56Var;
        wrh wrhVar;
        i iVar = (i) ((WeakReference) this.d).get();
        if (iVar == null) {
            return;
        }
        final Handler handler = iVar.l;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            synchronized (this.a) {
                try {
                    s56Var = (s56) t56Var.c.poll();
                    if (s56Var == null) {
                        t56Var.f = false;
                        return;
                    }
                    wrhVar = (wrh) ((xy0) this.b).get(t56Var.a);
                } catch (Throwable th) {
                    throw th;
                }
            }
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            final t56 t56Var2 = t56Var;
            dvt.c0(handler, new juc(iVar, wrhVar, new Runnable() { // from class: r56
                @Override // java.lang.Runnable
                public final void run() {
                    s56Var.run().a(new f02(g06.this, atomicBoolean2, atomicBoolean, handler, t56Var2), e48.a);
                }
            }));
            atomicBoolean2.set(false);
            t56Var = t56Var2;
        }
    }

    public void v(final wrh wrhVar) {
        synchronized (this.a) {
            try {
                t56 t56Var = (t56) ((xy0) this.c).get(wrhVar);
                if (t56Var == null) {
                    return;
                }
                final d8l d8lVar = t56Var.g;
                t56Var.g = d8l.b;
                t56Var.c.add(new s56(wrhVar, d8lVar) { // from class: p56
                    public final /* synthetic */ wrh b;

                    @Override // defpackage.s56
                    public final lcg run() {
                        i iVar = (i) ((WeakReference) g06.this.d).get();
                        if (iVar != null) {
                            iVar.r(this.b);
                        }
                        return kde.b;
                    }
                });
                if (t56Var.f) {
                    return;
                }
                t56Var.f = true;
                u(t56Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public d8l w(wrh wrhVar) {
        synchronized (this.a) {
            try {
                t56 t56Var = (t56) ((xy0) this.c).get(wrhVar);
                if (t56Var == null) {
                    return null;
                }
                return t56Var.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public yde x() {
        yde v;
        synchronized (this.a) {
            v = yde.v(((xy0) this.b).values());
        }
        return v;
    }

    public wrh y(Object obj) {
        wrh wrhVar;
        synchronized (this.a) {
            wrhVar = (wrh) ((xy0) this.b).get(obj);
        }
        return wrhVar;
    }

    public kf z(kwg kwgVar) {
        Object obj;
        boolean z;
        kwgVar.getClass();
        if (kwgVar instanceof hwg) {
            z = ((yca) ((aaa) ((jyr) this.d).getValue()).e.getValue()).a.containsKey(((hwg) kwgVar).a.a);
        } else {
            if (!(kwgVar instanceof jwg)) {
                if (kwgVar instanceof iwg) {
                    dfi.r("Cannot get download state for artist", "LongTapBottomSheetDependenciesImpl");
                    return kf.d;
                }
                b6e.s();
                return null;
            }
            Iterator it = ((vga) ((cba) ((jyr) this.b).getValue()).e.getValue()).a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ega egaVar = (ega) obj;
                String str = egaVar.b;
                eul eulVar = ((jwg) kwgVar).a;
                if (Intrinsics.d(str, eulVar.b) && Intrinsics.d(egaVar.a.a, eulVar.a)) {
                    break;
                }
            }
            z = ((ega) obj) != null;
        }
        return z ? kf.e : kf.d;
    }

    public g06(pw5 pw5Var, String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.a = pw5Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public g06(Context context, Integer num, jyb jybVar, i0j i0jVar) {
        jybVar.getClass();
        this.a = context;
        this.b = num;
        this.c = jybVar;
        this.d = i0jVar;
    }

    public g06(upq upqVar, hnq hnqVar, gnq gnqVar) {
        upqVar.getClass();
        hnqVar.getClass();
        gnqVar.getClass();
        this.b = upqVar;
        this.c = hnqVar;
        this.d = gnqVar;
        this.a = btf.b(new r25(20, this));
    }

    public g06(String str, a06 a06Var, i06 i06Var, tmb tmbVar) {
        str.getClass();
        a06Var.getClass();
        i06Var.getClass();
        tmbVar.getClass();
        this.a = str;
        this.b = a06Var;
        this.c = i06Var;
        this.d = tmbVar;
    }

    public g06(String str, String str2, String str3, String str4) {
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public g06(Context context, String str) {
        str.getClass();
        this.a = str;
        this.b = context;
        this.c = new ReentrantLock();
    }

    public g06(fnb fnbVar, gs4 gs4Var) {
        this.b = fnbVar;
        this.c = gs4Var;
        this.a = btf.b(new opg(11));
        this.d = dkb.Longtap;
    }

    public g06(int i) {
        switch (i) {
            case 11:
                this.a = new dhm(10);
                this.b = new ciq(0);
                this.c = new ArrayList();
                this.d = new HashSet();
                break;
            case 22:
                l18 l18Var = l18.b;
                this.a = l18Var.b(hag.I(ms.class), true);
                this.b = l18Var.b(hag.I(o21.class), true);
                this.c = l18Var.b(hag.I(nsl.class), true);
                this.d = new e();
                break;
            default:
                l18 l18Var2 = l18.b;
                this.a = l18Var2.b(hag.I(cc7.class), true);
                this.b = l18Var2.b(hag.I(frt.class), true);
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var2.a;
                qdcVar.getClass();
                this.c = ((s36) ((byb) qdcVar.C(I)).c(ern.a(s36.class))).f;
                this.d = new cp5(14);
                break;
        }
    }

    public g06(muo muoVar, boolean z, qzc qzcVar, mka mkaVar) {
        muoVar.getClass();
        this.a = muoVar;
        this.b = qzcVar;
        this.c = mkaVar;
        this.d = df3.PLAYLIST_BOTTOMSHEET;
    }

    public g06(s63 s63Var, jnq jnqVar) {
        jnqVar.getClass();
        this.a = new q43(s63Var, jnqVar);
    }

    public g06(Context context, Gson gson) {
        this.a = context;
        this.b = gson;
        this.c = new ReentrantLock();
    }

    public g06(String str, upq upqVar, gnq gnqVar) {
        str.getClass();
        this.b = str;
        this.c = upqVar;
        this.d = gnqVar;
        this.a = btf.b(new r25(18, this));
    }

    public g06(xhc xhcVar, List list) {
        this.a = xhcVar;
        n8g b = t75.b();
        b.add(new zhc("flex"));
        kcc kccVar = new kcc(new lcc(CollectionsKt.F(list), false, new san(25)));
        while (kccVar.hasNext()) {
            b.add(new zhc(((zhc) kccVar.next()).a));
        }
        this.b = t75.a(b);
        ((xhc) this.a).getClass();
        this.c = thc.b;
    }

    public g06(FullInfoActivity fullInfoActivity, Intent intent) {
        this.a = fullInfoActivity;
        this.b = intent;
    }

    public g06(Context context, hwd hwdVar, fos fosVar) {
        context.getClass();
        hwdVar.getClass();
        this.b = context;
        this.c = hwdVar;
        this.d = fosVar;
        this.a = btf.b(new iwd(this, 0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g06(List list) {
        this(y9w.d, list);
        xhc.a.getClass();
    }

    public /* synthetic */ g06(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public g06(kwg kwgVar) {
        kwgVar.getClass();
        this.c = kwgVar;
        this.a = l18.b.b(hag.I(u3g.class), true);
        this.b = btf.b(new opg(12));
        this.d = btf.b(new opg(13));
    }

    public g06(i iVar) {
        this.b = new xy0(0);
        this.c = new xy0(0);
        this.a = new Object();
        this.d = new WeakReference(iVar);
    }

    public g06(awc awcVar) {
        this.a = new fyd();
        this.b = new fyd();
        this.d = new ReentrantLock();
    }

    public g06(dcd dcdVar, Bundle bundle, atg atgVar, ctg ctgVar) {
        this.d = dcdVar;
        this.a = bundle;
        this.b = atgVar;
        this.c = ctgVar;
    }

    public g06(byb bybVar, arf arfVar) {
        arfVar.getClass();
        this.d = bybVar;
        this.a = arfVar;
        this.b = Executors.newSingleThreadExecutor(new jt7(1));
        this.c = new ReentrantLock();
        new HashMap();
    }

    public g06(Context context, ky9 ky9Var, hf7 hf7Var) {
        this.a = hf7Var;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setBackgroundResource(R.drawable.error_counter_background);
        appCompatTextView.setTextSize(12.0f);
        appCompatTextView.setTextColor(-16777216);
        appCompatTextView.setGravity(17);
        appCompatTextView.setElevation(context.getResources().getDimension(R.dimen.div_shadow_elevation));
        appCompatTextView.setTypeface(ky9Var.c());
        appCompatTextView.setOnClickListener(new ol(6, this));
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setTextSize(12.0f);
        appCompatTextView2.setTextColor(-16777216);
        appCompatTextView2.setElevation(context.getResources().getDimension(R.dimen.div_shadow_elevation));
        appCompatTextView2.setGravity(20);
        appCompatTextView2.setTypeface(ky9Var.c());
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setMaxWidth(bg3.x(100, displayMetrics));
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        this.c = appCompatTextView2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setClipChildren(false);
        linearLayout.setOrientation(0);
        linearLayout.setElevation(linearLayout.getRootView().getResources().getDimension(R.dimen.div_shadow_elevation));
        int x = bg3.x(8, displayMetrics);
        linearLayout.setPadding(x, x, 0, 0);
        int x2 = bg3.x(24, displayMetrics);
        linearLayout.addView(appCompatTextView, new ViewGroup.MarginLayoutParams(x2, x2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, x2);
        layoutParams.setMarginStart(bg3.x(4, displayMetrics));
        linearLayout.addView(appCompatTextView2, layoutParams);
        this.d = linearLayout;
    }

    public g06(h1b h1bVar, Uri uri, String str, ybr ybrVar, PlaybackParameters playbackParameters) {
        this.a = h1bVar;
        this.b = uri;
        this.c = playbackParameters;
        this.d = str != null ? new yfx(str, ybrVar) : hs4.g;
    }

    public g06(j8h j8hVar) {
        this.d = j8hVar;
        this.a = new Object();
        this.b = new HashSet();
    }
}
