package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.android.gms.tasks.Task;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.yandex.music.shared.experiments.impl.local.DetailsFile$readAll$typeToken$1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;
import ru.yandex.video.m3.data.dto.VideoData;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class nnk implements hg, wbj, o6k, gs3, z8h {
    public static volatile nnk c;
    public static final Object d = new Object();
    public static urv e;
    public Object a;
    public Object b;

    public nnk(int i) {
        switch (i) {
            case 24:
                this.a = new HashMap();
                this.b = new LinkedHashMap();
                break;
            case 27:
                l18 l18Var = l18.b;
                bdt I = hag.I(oq7.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                this.a = (oq7) qdcVar.C(I);
                this.b = l18Var.b(hag.I(e0j.class), true);
                break;
            default:
                this.a = new cus();
                this.b = (l0t) sk3.I(l0t.class);
                break;
        }
    }

    public static nnk D() {
        if (c == null) {
            synchronized (nnk.class) {
                try {
                    if (c == null) {
                        c = new nnk(0);
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static void I(String str, Exception exc) {
        ssg.a(7, null, "Failed to parse experiment details json from file. File content = " + str, exc);
    }

    public static Task c(Context context, Intent intent, boolean z) {
        urv urvVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (d) {
            try {
                if (e == null) {
                    e = new urv(context);
                }
                urvVar = e;
            } finally {
            }
        }
        if (!z) {
            return urvVar.b(intent).e(new gx0(1), new xla(29));
        }
        if (kkp.v().x(context)) {
            synchronized (vq2.q) {
                try {
                    vq2.w(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        vq2.r.a();
                    }
                    urvVar.b(intent).addOnCompleteListener(new tot(2, intent));
                } finally {
                }
            }
        } else {
            urvVar.b(intent);
        }
        return ywf.w(-1);
    }

    public void A() {
        yfx yfxVar = (yfx) this.b;
        if (yfxVar != null) {
            ((jp0) yfxVar.c).e();
        }
        this.b = null;
    }

    @Override // defpackage.hg
    public boolean B(ig igVar, Menu menu) {
        return ((hg) this.a).B(igVar, menu);
    }

    public mqs C(mqs mqsVar, psd psdVar) {
        l0t l0tVar = (l0t) this.b;
        Timber.v("fetch full track from server \"%s\"", mqsVar.c);
        k10 k10Var = mqsVar.d;
        Parcelable.Creator<k10> creator = k10.CREATOR;
        k10Var.getClass();
        Continuation continuation = null;
        if (k10Var.equals(k10.i)) {
            psdVar.a("Getting full track from remote");
            rj6 a = l0tVar.a(mqsVar.a, psdVar);
            if (a instanceof qj6) {
                return (mqs) ((qj6) a).a;
            }
        } else {
            psdVar.a("Getting full track from remote");
            List singletonList = Collections.singletonList(mqsVar.d());
            l0tVar.getClass();
            singletonList.getClass();
            rj6 rj6Var = (rj6) x97.D(g.a, new h0t(l0tVar, singletonList, psdVar, continuation, 0));
            if (rj6Var instanceof qj6) {
                return (mqs) ((List) ((qj6) rj6Var).a).get(0);
            }
        }
        Timber.e("Failed to get full track \"%s\"", mqsVar.c);
        return null;
    }

    public void E(v35 v35Var) {
        np2 np2Var = (np2) ((jyr) this.b).getValue();
        if (np2Var == null) {
            return;
        }
        int i = CollectionMainActivity.v0;
        Intent B = men.B(np2Var, v35Var);
        sb.D(np2Var, B);
        np2Var.startActivity(B);
    }

    public void F() {
        Object value;
        Set set;
        rg5 rg5Var;
        ug5 ug5Var = (ug5) ((wg5) this.a).a.getValue();
        xh5 xh5Var = (xh5) this.b;
        xdr xdrVar = ug5Var.a;
        do {
            value = xdrVar.getValue();
            tg5 tg5Var = (tg5) value;
            tg5Var.getClass();
            boolean z = tg5Var instanceof rg5;
            rg5 rg5Var2 = z ? (rg5) tg5Var : null;
            if (rg5Var2 == null || (set = rg5Var2.a) == null) {
                set = q5b.a;
            }
            rg5Var = z ? (rg5) tg5Var : null;
        } while (!xdrVar.k(value, new rg5(wop.j(set, xh5Var), wop.g(rg5Var != null ? rg5Var.b : q5b.a, xh5Var))));
    }

    @Override // defpackage.hg
    public boolean G(ig igVar, Menu menu) {
        ViewGroup viewGroup = ((er0) this.b).B;
        WeakHashMap weakHashMap = wdu.a;
        ldu.c(viewGroup);
        return ((hg) this.a).G(igVar, menu);
    }

    public Task H(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.a;
        gx0 gx0Var = (gx0) this.b;
        boolean z = fxf.F() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? ywf.p(gx0Var, new fb7(2, context, intent)).f(gx0Var, new h6c(context, intent, z2)) : c(context, intent, z2);
    }

    public Map J() {
        File file = (File) this.a;
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
        try {
            String F = t7g.F(bufferedReader);
            bufferedReader.close();
            if (F.length() == 0) {
                e5b e5bVar2 = e5b.a;
                e5bVar2.getClass();
                return e5bVar2;
            }
            try {
                Map map = (Map) ((Gson) this.b).c(new StringReader(F), TypeToken.get(new DetailsFile$readAll$typeToken$1().getType()));
                if (map == null) {
                    e5b e5bVar3 = e5b.a;
                    e5bVar3.getClass();
                    return e5bVar3;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key != null && value != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
                for (Object obj : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(((Map.Entry) obj).getKey(), new jxb((JsonObject) ((Map.Entry) obj).getValue()));
                }
                return linkedHashMap2;
            } catch (JsonParseException e2) {
                I(F, e2);
                e5b e5bVar4 = e5b.a;
                e5bVar4.getClass();
                return e5bVar4;
            } catch (IOException e3) {
                I(F, e3);
                e5b e5bVar42 = e5b.a;
                e5bVar42.getClass();
                return e5bVar42;
            } catch (IllegalStateException e4) {
                I(F, e4);
                e5b e5bVar422 = e5b.a;
                e5bVar422.getClass();
                return e5bVar422;
            }
        } finally {
        }
    }

    public cu1 K() {
        File file = (File) this.b;
        File file2 = (File) this.a;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                vq1.n0("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new cu1(file2);
        } catch (FileNotFoundException e2) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e2);
            }
            try {
                return new cu1(file2);
            } catch (FileNotFoundException e3) {
                throw new IOException("Couldn't create " + file2, e3);
            }
        }
    }

    public void L(Map map) {
        map.getClass();
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry entry : map.entrySet()) {
            jsonObject.r((String) entry.getKey(), ((jxb) entry.getValue()).a);
        }
        File file = (File) this.a;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
        try {
            bufferedWriter.write(jsonObject.toString());
            bufferedWriter.flush();
            bufferedWriter.close();
        } finally {
        }
    }

    @Override // defpackage.o6k
    public Object a(f9f f9fVar, ArrayList arrayList) {
        Object t7oVar;
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Class P = leu.P(f9fVar);
        Object obj = concurrentHashMap.get(P);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(P, (obj = new n6k()))) != null) {
            obj = putIfAbsent;
        }
        n6k n6kVar = (n6k) obj;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new w9f((u9f) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = n6kVar.a;
        Object obj2 = concurrentHashMap2.get(arrayList2);
        if (obj2 == null) {
            try {
                r7o r7oVar = z7o.b;
                t7oVar = (t9f) ((Function2) this.a).invoke(f9fVar, arrayList);
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            z7o z7oVar = new z7o(t7oVar);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, z7oVar);
            obj2 = putIfAbsent2 == null ? z7oVar : putIfAbsent2;
        }
        return ((z7o) obj2).a;
    }

    @Override // defpackage.z8h
    public String b(String str, VideoData videoData, String str2, int i) {
        d1 d1Var = (d1) this.b;
        str.getClass();
        String manifestUrl = videoData.getManifestUrl();
        Uri parse = Uri.parse(manifestUrl);
        String scheme = parse.getScheme();
        if (scheme == null || !c.v(scheme, "http", true)) {
            return manifestUrl;
        }
        manifestUrl.getClass();
        s7e s7eVar = new s7e();
        s7eVar.h(null, manifestUrl);
        u7e e2 = s7eVar.e();
        String f = ((cke) this.a).b.f();
        String g = e2.g(jpt.a(18).a);
        if (g != null) {
            String str3 = StringsKt.U(g) ? null : g;
            if (str3 != null) {
                str2 = str3;
            }
        }
        s7e f2 = e2.f();
        String str4 = jpt.a(20).a;
        f2.l(str4);
        f2.d(str4, str);
        String str5 = jpt.a(15).a;
        String valueOf = String.valueOf(System.currentTimeMillis());
        f2.l(str5);
        f2.d(str5, valueOf);
        if (str2 != null) {
            String str6 = jpt.a(18).a;
            f2.l(str6);
            f2.d(str6, str2);
        }
        if (f != null) {
            String str7 = jpt.a(19).a;
            f2.l(str7);
            f2.d(str7, f);
        }
        String path = parse.getPath();
        if (path == null || !c.n(path, ".mpd", true)) {
            parse.getPath();
        } else {
            String str8 = jpt.a(2).a;
            f2.l(str8);
            f2.d(str8, "1");
        }
        String str9 = jpt.a(13).a;
        String valueOf2 = String.valueOf(i);
        f2.l(str9);
        f2.d(str9, valueOf2);
        if (d1Var.b.d) {
            String str10 = jpt.a(1).a;
            f2.l(str10);
            f2.d(str10, "1");
        }
        if (d1Var.b.f) {
            f2.l(jpt.a(7).a);
        }
        if (d1Var.b.e) {
            f2.l(jpt.a(6).a);
        }
        return f2.e().i;
    }

    public void d() {
        ((ug5) ((wg5) this.a).a.getValue()).a(new vg5((xh5) this.b, 0));
    }

    @Override // defpackage.wbj
    public cvo e() {
        return (cvo) this.b;
    }

    @Override // defpackage.hg
    public boolean f(ig igVar, MenuItem menuItem) {
        return ((hg) this.a).f(igVar, menuItem);
    }

    @Override // defpackage.wbj
    public fnb g() {
        return (fnb) this.a;
    }

    public boolean h(int i) {
        return ((xgc) this.a).a.get(i);
    }

    public void i() {
        String str = (String) this.a;
        try {
            jac jacVar = (jac) this.b;
            jacVar.getClass();
            new File((File) jacVar.c, str).createNewFile();
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e2);
        }
    }

    public void j(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((y) this.a).z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.j(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.getClass();
        }
    }

    public void k(o oVar, boolean z) {
        oVar.getClass();
        y yVar = (y) this.a;
        t tVar = yVar.x.b;
        o oVar2 = yVar.z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.k(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.getClass();
        }
    }

    public void l(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((y) this.a).z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.l(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.getClass();
        }
    }

    public void m(o oVar, boolean z) {
        oVar.getClass();
        y yVar = (y) this.a;
        o oVar2 = yVar.z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.m(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.d0(yVar, oVar);
        }
    }

    public void n(o oVar, boolean z) {
        oVar.getClass();
        y yVar = (y) this.a;
        o oVar2 = yVar.z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.n(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.e0(yVar, oVar);
        }
    }

    public void o(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((y) this.a).z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.o(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.getClass();
        }
    }

    public void p(o oVar, boolean z) {
        oVar.getClass();
        y yVar = (y) this.a;
        t tVar = yVar.x.b;
        o oVar2 = yVar.z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.p(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.getClass();
        }
    }

    public void q(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((y) this.a).z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.q(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.getClass();
        }
    }

    @Override // defpackage.hg
    public void r(ig igVar) {
        ((hg) this.a).r(igVar);
        er0 er0Var = (er0) this.b;
        if (er0Var.w != null) {
            er0Var.l.getDecorView().removeCallbacks(er0Var.x);
        }
        if (er0Var.v != null) {
            wgu wguVar = er0Var.y;
            if (wguVar != null) {
                wguVar.b();
            }
            wgu b = wdu.b(er0Var.v);
            b.a(0.0f);
            er0Var.y = b;
            b.d(new uq0(2, this));
        }
        kq0 kq0Var = er0Var.n;
        if (kq0Var != null) {
            kq0Var.onSupportActionModeFinished(er0Var.u);
        }
        er0Var.u = null;
        ViewGroup viewGroup = er0Var.B;
        WeakHashMap weakHashMap = wdu.a;
        ldu.c(viewGroup);
        er0Var.N();
    }

    @Override // defpackage.gs3
    public Type s() {
        return (Type) this.a;
    }

    public void t(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((y) this.a).z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.t(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.getClass();
        }
    }

    public void u(o oVar, Bundle bundle, boolean z) {
        oVar.getClass();
        y yVar = (y) this.a;
        o oVar2 = yVar.z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.u(oVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.f0(yVar, oVar, bundle);
        }
    }

    public void v(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((y) this.a).z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.v(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.getClass();
        }
    }

    public void w(o oVar, boolean z) {
        oVar.getClass();
        y yVar = (y) this.a;
        o oVar2 = yVar.z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.w(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.g0(yVar, oVar);
        }
    }

    public void x(o oVar, View view, boolean z) {
        oVar.getClass();
        view.getClass();
        o oVar2 = ((y) this.a).z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.x(oVar, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.getClass();
        }
    }

    public void y(o oVar, boolean z) {
        oVar.getClass();
        o oVar2 = ((y) this.a).z;
        if (oVar2 != null) {
            y parentFragmentManager = oVar2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.y(oVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            qtc qtcVar = (qtc) it.next();
            if (z) {
                qtcVar.getClass();
            }
            qtcVar.a.getClass();
        }
    }

    @Override // defpackage.gs3
    public Object z(foj fojVar) {
        Executor executor = (Executor) this.b;
        return executor == null ? fojVar : new mk7(executor, fojVar);
    }

    public /* synthetic */ nnk(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public nnk(List list, eul eulVar) {
        list.getClass();
        this.a = list;
        this.b = eulVar;
    }

    public nnk(t tVar, int i) {
        switch (i) {
            case 26:
                this.a = tVar;
                this.b = l18.b.b(hag.I(wst.class), true);
                break;
            default:
                tVar.getClass();
                this.a = tVar;
                break;
        }
    }

    public nnk(File file, Gson gson) {
        this.a = file;
        this.b = gson;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        file.createNewFile();
    }

    public /* synthetic */ nnk(Object obj) {
        this.b = obj;
    }

    public nnk(Context context) {
        this.a = context;
        this.b = new gx0(1);
    }

    public nnk(Function2 function2) {
        this.a = function2;
        this.b = new ConcurrentHashMap();
    }
}
