package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.android.material.shape.a;
import com.yandex.pulse.metrics.MetricsState;
import com.yandex.pulse.metrics.k;
import com.yandex.pulse.metrics.l;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class h4b implements zpj, v3q, u97, xk2, cb7, wpd, nlk, p7q, adu {
    public Object a;

    public h4b(int i) {
        switch (i) {
            case 20:
                this.a = Runtime.getRuntime();
                break;
            case 25:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new HashMap();
                new HashMap();
                break;
        }
    }

    public static boolean I(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String Y(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static ArrayList g(oyc oycVar, ArrayList arrayList) {
        mhb mhbVar;
        List b = oycVar.b();
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            int g = u75.g(b);
            if (i > g) {
                i = g;
            }
            mhb mhbVar2 = ((azc) b.get(i)).a;
            boolean z = obj instanceof Long;
            if (z) {
                mhbVar = mhb.INTEGER;
            } else if (obj instanceof Double) {
                mhbVar = mhb.NUMBER;
            } else if (obj instanceof Boolean) {
                mhbVar = mhb.BOOLEAN;
            } else if (obj instanceof String) {
                mhbVar = mhb.STRING;
            } else if (obj instanceof vc7) {
                mhbVar = mhb.DATETIME;
            } else if (obj instanceof c85) {
                mhbVar = mhb.COLOR;
            } else if (obj instanceof lpt) {
                mhbVar = mhb.URL;
            } else if (obj instanceof JSONObject) {
                mhbVar = mhb.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        kac.h("Unable to find type for null", null);
                        return null;
                    }
                    kac.h("Unable to find type for ".concat(obj.getClass().getName()), null);
                    return null;
                }
                mhbVar = mhb.ARRAY;
            }
            if (mhbVar2 != mhbVar && z && nhb.a[mhbVar2.ordinal()] == 1) {
                obj = Double.valueOf(((Number) obj).longValue());
            }
            arrayList2.add(obj);
            i = i2;
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        if (r4.compareTo(r5) <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r4.compareTo(r5) >= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r4.compareTo(r5) > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r4.compareTo(r5) < 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        return java.lang.Boolean.valueOf(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Boolean i(hms hmsVar, Comparable comparable, Comparable comparable2) {
        boolean z = false;
        if (!(hmsVar instanceof fms)) {
            if (!(hmsVar instanceof gms)) {
                if (!(hmsVar instanceof ems)) {
                    if (!(hmsVar instanceof dms)) {
                        b6e.s();
                        return null;
                    }
                }
            }
        }
    }

    @Override // defpackage.v3q
    public Object A(p3q p3qVar) {
        p3qVar.getClass();
        return Boolean.valueOf(x());
    }

    @Override // defpackage.cb7
    public Object C(Object obj, wa7 wa7Var) {
        return Boolean.valueOf(((xin) obj) instanceof win);
    }

    @Override // defpackage.wpd
    public void D(Object obj) {
        oq oqVar = (oq) obj;
        oqVar.getClass();
        r5h r5hVar = (r5h) this.a;
        r5hVar.getClass();
        uy4 uy4Var = r5hVar.b;
        uy4Var.getClass();
        lwg C = g0g.C(oqVar, null);
        y supportFragmentManager = uy4Var.a.getSupportFragmentManager();
        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), d.w());
    }

    @Override // defpackage.v3q
    public Object E(e5q e5qVar) {
        boolean x;
        e5qVar.getClass();
        int ordinal = hdg.W(e5qVar).ordinal();
        if (ordinal == 0) {
            x = x();
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            x = x();
        }
        return Boolean.valueOf(x);
    }

    @Override // defpackage.v3q
    public Object H(l3q l3qVar) {
        l3qVar.getClass();
        return Boolean.valueOf(x());
    }

    @Override // defpackage.wpd
    public void J(Object obj) {
        oq oqVar = (oq) obj;
        oqVar.getClass();
        r5h r5hVar = (r5h) this.a;
        r5hVar.getClass();
        uy4 uy4Var = r5hVar.b;
        uy4Var.getClass();
        PlaybackScope a = d.a();
        t tVar = uy4Var.a;
        tVar.startActivity(quj.U(tVar, new uq(oqVar, a.b(oqVar).a(), null, rq.a, 92), a));
    }

    @Override // defpackage.v3q
    public Object K(j3q j3qVar) {
        j3qVar.getClass();
        return Boolean.valueOf(x());
    }

    @Override // defpackage.cb7
    public Object M(cg6 cg6Var) {
        return this.a;
    }

    @Override // defpackage.cb7
    public Object N(Object obj, cg6 cg6Var) {
        this.a = obj;
        return Unit.a;
    }

    @Override // defpackage.v3q
    public Object O(z3q z3qVar) {
        boolean x;
        z3qVar.getClass();
        if (z3qVar instanceof c1q) {
            x = x();
        } else if (z3qVar instanceof e1q) {
            x = x();
        } else if (z3qVar instanceof h1q) {
            x = x();
        } else if (z3qVar instanceof k1q) {
            x = x();
        } else if (z3qVar instanceof r1q) {
            x = x();
        } else if (z3qVar instanceof u1q) {
            x = x();
        } else {
            if (!(z3qVar instanceof a2q)) {
                b6e.s();
                return null;
            }
            x = x();
        }
        return Boolean.valueOf(x);
    }

    @Override // defpackage.v3q
    public Object P(f5q f5qVar) {
        boolean x;
        f5qVar.getClass();
        if (f5qVar instanceof s9q) {
            x = x();
        } else if (f5qVar instanceof bbq) {
            int ordinal = avf.J((bbq) f5qVar).ordinal();
            if (ordinal == 0) {
                x = x();
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                x = x();
            }
        } else if (f5qVar instanceof taq) {
            x = x();
        } else if (f5qVar instanceof baq) {
            x = x();
        } else {
            if (!(f5qVar instanceof oaq)) {
                b6e.s();
                return null;
            }
            x = x();
        }
        return Boolean.valueOf(x);
    }

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        scv scvVar = (scv) this.a;
        int i = scvVar.h;
        byte[] bArr = new byte[i];
        scvVar.k = bArr;
        om3Var.getClass();
        om3Var.e(i, bArr);
        try {
            scv.b(scvVar);
        } catch (IOException e) {
            pm5 pm5Var = (pm5) scvVar.u.f;
            if (pm5Var != null) {
                pm5Var.r(e);
            }
            e.printStackTrace();
        }
        scvVar.b = 0;
        scvVar.h();
    }

    @Override // defpackage.cb7
    public ya7 S(qec qecVar) {
        return new ya7(this, qecVar);
    }

    public void T(String str, List list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putBundle("data_options", bundle);
        bundle2.putBundle("data_notify_children_changed_options", null);
        if (list != null) {
            bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        X(3, bundle2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [zgn] */
    public void U(String str, xgn xgnVar) {
        Object obj;
        str.getClass();
        xgnVar.getClass();
        elf elfVar = (elf) this.a;
        if (((j5v) elfVar.l.getValue()).a()) {
            elfVar.H();
            return;
        }
        xdr xdrVar = elfVar.v;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        iwe iweVar = elfVar.n;
        iweVar.getClass();
        StringBuilder sb = new StringBuilder("select(");
        sb.append(str);
        sb.append(", ");
        sb.append(xgnVar);
        v3w.m(sb, ")", 3, "RadioRestrictionsManager", null);
        ahn ahnVar = (ahn) ((xdr) iweVar.c).getValue();
        Map map = ahnVar.b;
        Map map2 = ahnVar.a;
        HashMap hashMap = new HashMap(map);
        boolean d = Intrinsics.d((zgn) map.get(str), xgnVar);
        xgn xgnVar2 = xgnVar;
        if (d) {
            wgn wgnVar = (wgn) map2.get(str);
            if (wgnVar != null) {
                Iterator it = wgnVar.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((zgn) obj) instanceof ygn) {
                            break;
                        }
                    }
                }
                xgnVar2 = (zgn) obj;
            } else {
                xgnVar2 = null;
            }
        }
        if (xgnVar2 == null) {
        }
        ssg.a(3, "RadioRestrictionsManager", "New selection state: " + hashMap.entrySet(), null);
        xdr xdrVar2 = (xdr) iweVar.b;
        ahn ahnVar2 = new ahn(map2, hashMap);
        xdrVar2.getClass();
        xdrVar2.m(null, ahnVar2);
        elfVar.G();
    }

    public Bundle V() {
        Bundle bundle = (Bundle) this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public LinkedHashMap W() {
        File file = (File) this.a;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
        try {
            lcc lccVar = new lcc(new o7t(new n86(new wz0(3, bufferedReader)), new qxb(10)), true, new qxb(11));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            kcc kccVar = new kcc(lccVar);
            while (kccVar.hasNext()) {
                List list = (List) kccVar.next();
                linkedHashMap.put((String) list.get(0), (String) list.get(1));
            }
            bufferedReader.close();
            return linkedHashMap;
        } finally {
        }
    }

    public void X(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        ((Messenger) this.a).send(obtain);
    }

    @Override // defpackage.nlk
    public void a(k[] kVarArr) {
        List X;
        MetricsState metricsState = (MetricsState) this.a;
        b5i b5iVar = metricsState.d;
        b5iVar.d();
        ((l) b5iVar.b).clearOngoingLogQueue();
        if (kVarArr != null && (X = xz0.X(kVarArr)) != null) {
            b5iVar.d();
            ((l) b5iVar.b).addAllOngoingLogQueue(X);
        }
        metricsState.a();
    }

    public void a0(LinkedHashMap linkedHashMap) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream((File) this.a), Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
        try {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                bufferedWriter.write(((String) entry.getKey()) + "=" + ((String) entry.getValue()) + StringUtil.LF);
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } finally {
        }
    }

    public zl6 b(zl6 zl6Var) {
        return zl6Var instanceof ctn ? zl6Var : new nn(-((a) this.a).k(), zl6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089 A[SYNTHETIC] */
    @Override // defpackage.xk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(int i, long j, long j2) {
        HashSet u0;
        HashSet u02;
        int i2;
        long j3;
        long j4;
        Object t7oVar;
        Throwable a;
        Object t7oVar2;
        yjj yjjVar = (yjj) this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).F(j2);
                t7oVar2 = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar2 = new t7o(th);
            }
            Throwable a2 = z7o.a(t7oVar2);
            if (a2 != null) {
                Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
            }
        }
        yjj yjjVar2 = (yjj) this.a;
        synchronized (yjjVar2.a) {
            u02 = CollectionsKt.u0(yjjVar2.a);
        }
        Iterator it2 = u02.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            try {
                r7o r7oVar3 = z7o.b;
                i2 = i;
                j3 = j;
                j4 = j2;
                try {
                    ((zbl) next2).c(i2, j3, j4);
                    t7oVar = Unit.a;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    r7o r7oVar4 = z7o.b;
                    t7oVar = new t7o(th3);
                    a = z7o.a(t7oVar);
                    if (a == null) {
                    }
                    i = i2;
                    j = j3;
                    j2 = j4;
                }
            } catch (Throwable th4) {
                th = th4;
                i2 = i;
                j3 = j;
                j4 = j2;
            }
            a = z7o.a(t7oVar);
            if (a == null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }

    @Override // defpackage.zpj
    public void d(Exception exc) {
        ((zt3) this.a).h(null);
    }

    @Override // defpackage.nlk
    public k[] e() {
        MetricsState metricsState = (MetricsState) this.a;
        if (((l) metricsState.d.b).getOngoingLogQueueCount() <= 0) {
            return null;
        }
        List unmodifiableList = Collections.unmodifiableList(((l) metricsState.d.b).getOngoingLogQueueList());
        unmodifiableList.getClass();
        Object[] array = unmodifiableList.toArray(new k[0]);
        if (array != null) {
            return (k[]) array;
        }
        jj4.j("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return null;
    }

    public cph f() {
        cph cphVar = (cph) this.a;
        if (cphVar.a == null) {
            xq0.x("media cannot be null.");
            return null;
        }
        if (!Double.isNaN(cphVar.d) && cphVar.d < 0.0d) {
            xq0.x("startTime cannot be negative or NaN.");
            return null;
        }
        if (Double.isNaN(cphVar.e)) {
            xq0.x("playbackDuration cannot be NaN.");
            return null;
        }
        if (!Double.isNaN(cphVar.f) && cphVar.f >= 0.0d) {
            return cphVar;
        }
        xq0.x("preloadTime cannot be negative or Nan.");
        return null;
    }

    public Object h(jhb jhbVar) {
        jhbVar.getClass();
        try {
            return jhbVar.a(this);
        } catch (khb e) {
            throw e;
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            throw new khb(message, e2);
        }
    }

    public boolean j(String str) {
        String s = s(str);
        return "1".equals(s) || Boolean.parseBoolean(s);
    }

    public Integer k(String str) {
        String s = s(str);
        if (TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(s));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + Y(str) + "(" + s + ") into an int");
            return null;
        }
    }

    public JSONArray l(String str) {
        String s = s(str);
        if (TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            return new JSONArray(s);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + Y(str) + ": " + s + ", falling back to default");
            return null;
        }
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return nyn.a;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return y7g.J((nyn) this.a, hdg.W(szuVar.a));
    }

    @Override // defpackage.v3q
    public Object p(x3q x3qVar) {
        x3qVar.getClass();
        return Boolean.valueOf(x());
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return nyn.a;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            return y7g.J((nyn) this.a, avf.J(((jbq) maqVar).b));
        }
        if ((maqVar instanceof vaq) || (maqVar instanceof eaq) || (maqVar instanceof raq)) {
            return nyn.a;
        }
        b6e.s();
        return null;
    }

    public String r(Resources resources, String str, String str2) {
        String[] strArr;
        String s = s(str2);
        if (!TextUtils.isEmpty(s)) {
            return s;
        }
        String s2 = s(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(s2)) {
            return null;
        }
        int identifier = resources.getIdentifier(s2, PListParser.TAG_STRING, str);
        if (identifier == 0) {
            Log.w("NotificationParams", Y(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray l = l(str2.concat("_loc_args"));
        if (l == null) {
            strArr = null;
        } else {
            int length = l.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = l.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + Y(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public String s(String str) {
        Bundle bundle = (Bundle) this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return nyn.a;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return nyn.a;
    }

    @Override // defpackage.v3q
    public Object v(m3q m3qVar) {
        m3qVar.getClass();
        return Boolean.valueOf(x());
    }

    public boolean x() {
        yxc yxcVar = (yxc) this.a;
        return yxcVar != null && yxcVar.h;
    }

    @Override // defpackage.v3q
    public Object y(y3q y3qVar) {
        y3qVar.getClass();
        return Boolean.valueOf(x());
    }

    @Override // defpackage.v3q
    public Object z(m4q m4qVar) {
        m4qVar.getClass();
        return Boolean.valueOf(x());
    }

    public /* synthetic */ h4b(Object obj) {
        this.a = obj;
    }

    public h4b(File file) {
        this.a = file;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        file.createNewFile();
    }
}
