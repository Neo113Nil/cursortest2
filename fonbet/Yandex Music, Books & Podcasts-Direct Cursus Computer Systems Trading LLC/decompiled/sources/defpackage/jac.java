package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.a;

/* loaded from: classes3.dex */
public final class jac {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public jac(int i) {
        xdr xdrVar;
        vhd vhdVar;
        switch (i) {
            case 6:
                bdt I = hag.I(l0t.class);
                l18 l18Var = l18.b;
                this.a = l18Var.b(I, true);
                this.b = l18Var.b(hag.I(yr.class), true);
                this.c = l18Var.b(hag.I(go1.class), true);
                this.d = l18Var.b(hag.I(cut.class), true);
                this.e = l18Var.b(hag.I(elm.class), true);
                this.f = l18Var.b(hag.I(f5g.class), true);
                this.g = l18Var.b(hag.I(b8u.class), true);
                break;
            default:
                yiq yiqVar = new yiq();
                this.a = yiqVar;
                bdt I2 = hag.I(odd.class);
                l18 l18Var2 = l18.b;
                jyr b = l18Var2.b(I2, true);
                this.b = l18Var2.b(hag.I(rvh.class), true);
                this.c = l18Var2.b(hag.I(zzp.class), true);
                ced cedVar = ((odd) b.getValue()).l;
                this.d = (cedVar == null || (xdrVar = cedVar.u) == null || (vhdVar = (vhd) xdrVar.getValue()) == null) ? vhd.h : vhdVar;
                ox6.B(((odd) b.getValue()).m, hld.r(yiqVar, dm6.b()), new pdd(this, 0));
                break;
        }
    }

    public static fc2 a(fc2 fc2Var, yfx yfxVar, rn5 rn5Var, Map map) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        Map unmodifiableMap3;
        ec2 a = fc2Var.a();
        String j = ((eac) yfxVar.c).j();
        if (j != null) {
            a.e = new sc2(j);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean isEmpty = map.isEmpty();
        z0j z0jVar = (z0j) rn5Var.e;
        if (isEmpty) {
            jcf jcfVar = (jcf) ((AtomicMarkableReference) z0jVar.c).getReference();
            synchronized (jcfVar) {
                unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(jcfVar.a));
            }
        } else {
            jcf jcfVar2 = (jcf) ((AtomicMarkableReference) z0jVar.c).getReference();
            synchronized (jcfVar2) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(jcfVar2.a));
            }
            HashMap hashMap = new HashMap(unmodifiableMap);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String a2 = jcf.a(1024, (String) entry.getKey());
                if (hashMap.size() < 64 || hashMap.containsKey(a2)) {
                    hashMap.put(a2, jcf.a(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap2 = Collections.unmodifiableMap(hashMap);
        }
        List l = l(unmodifiableMap2);
        jcf jcfVar3 = (jcf) ((AtomicMarkableReference) ((z0j) rn5Var.f).c).getReference();
        synchronized (jcfVar3) {
            unmodifiableMap3 = Collections.unmodifiableMap(new HashMap(jcfVar3.a));
        }
        List l2 = l(unmodifiableMap3);
        if (!l.isEmpty() || !l2.isEmpty()) {
            gc2 gc2Var = (gc2) fc2Var.c;
            a.c = new gc2(gc2Var.a, l, l2, gc2Var.d, gc2Var.e, gc2Var.f, gc2Var.g);
        }
        return a.a();
    }

    public static kq6 b(fc2 fc2Var, rn5 rn5Var) {
        List unmodifiableList;
        c11 c11Var = (c11) rn5Var.g;
        synchronized (c11Var) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(c11Var.a));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < unmodifiableList.size(); i++) {
            peo peoVar = (peo) unmodifiableList.get(i);
            peoVar.getClass();
            tc2 tc2Var = new tc2();
            ud2 ud2Var = (ud2) peoVar;
            String str = ud2Var.e;
            if (str == null) {
                jj4.j("Null variantId");
                return null;
            }
            String str2 = ud2Var.b;
            if (str2 == null) {
                jj4.j("Null rolloutId");
                return null;
            }
            tc2Var.a = new vc2(str2, str);
            String str3 = ud2Var.c;
            if (str3 == null) {
                jj4.j("Null parameterKey");
                return null;
            }
            tc2Var.b = str3;
            tc2Var.c = ud2Var.d;
            tc2Var.d = ud2Var.f;
            tc2Var.e = (byte) (tc2Var.e | 1);
            arrayList.add(tc2Var.a());
        }
        if (arrayList.isEmpty()) {
            return fc2Var;
        }
        ec2 a = fc2Var.a();
        a.f = new wc2(arrayList);
        return a.a();
    }

    public static String e(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[RemoteCameraConfig.Notification.ID];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static jac f(Context context, uae uaeVar, jac jacVar, xs0 xs0Var, yfx yfxVar, rn5 rn5Var, j6e j6eVar, hgp hgpVar, jtc jtcVar, dp6 dp6Var, osh oshVar) {
        pq6 pq6Var = new pq6(context, uaeVar, xs0Var, j6eVar, hgpVar);
        tq6 tq6Var = new tq6(jacVar, hgpVar, dp6Var);
        sq6 sq6Var = hc7.b;
        t9t.b(context);
        return new jac(pq6Var, tq6Var, new hc7(new ozn(t9t.a().c(new vn3(hc7.c, hc7.d)).a("FIREBASE_CRASHLYTICS_REPORT", new p6b("json"), hc7.e), hgpVar.l(), jtcVar)), yfxVar, rn5Var, uaeVar, oshVar);
    }

    public static List l(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                jj4.j("Null key");
                return null;
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                jj4.j("Null value");
                return null;
            }
            arrayList.add(new vb2(str, str2));
        }
        Collections.sort(arrayList, new mj(29));
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized void p(File file) {
        synchronized (jac.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean q(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                q(file2);
            }
        }
        return file.delete();
    }

    public static List r(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(cg6 cg6Var) {
        wxu wxuVar;
        int i;
        if (cg6Var instanceof wxu) {
            wxuVar = (wxu) cg6Var;
            int i2 = wxuVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wxuVar.l = i2 - Integer.MIN_VALUE;
                Object obj = wxuVar.j;
                Object obj2 = nm6.a;
                i = wxuVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    hxu hxuVar = (hxu) this.g;
                    if (hxuVar != null) {
                        wxuVar.l = 1;
                        Object C = saf.C(saf.Q(hxuVar.l.a), wxuVar);
                        if (C != obj2) {
                            C = Unit.a;
                        }
                        if (C == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.g = null;
                return Unit.a;
            }
        }
        wxuVar = new wxu(this, cg6Var);
        Object obj3 = wxuVar.j;
        Object obj22 = nm6.a;
        i = wxuVar.l;
        if (i != 0) {
        }
        this.g = null;
        return Unit.a;
    }

    public void d(String str) {
        File file = new File((File) this.b, str);
        if (file.exists() && q(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public void g(float f, float f2, float f3, float f4, float[] fArr) {
        Canvas canvas = (Canvas) this.d;
        xzb xzbVar = (xzb) this.e;
        RectF rectF = new RectF();
        rectF.set(f, f2, f3, f4);
        cs9 cs9Var = (cs9) this.c;
        Object a = cs9Var != null ? cs9Var.a() : null;
        if (a instanceof xl9) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(((Number) ((xl9) a).a.a(xzbVar)).intValue());
            Path path = new Path();
            path.reset();
            if (fArr == null) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            path.close();
            canvas.drawPath(path, paint);
        }
        js9 js9Var = (js9) this.b;
        if ((js9Var != null ? js9Var.b : null) == null) {
            return;
        }
        RectF rectF2 = new RectF();
        ln9 ln9Var = js9Var.b;
        ln9Var.getClass();
        float v0 = bkp.v0(ln9Var, xzbVar, (DisplayMetrics) this.a) / 2.0f;
        rectF2.set(Math.max(0.0f, f + v0), Math.max(0.0f, f2 + v0), Math.max(0.0f, f3 - v0), Math.max(0.0f, f4 - v0));
        float[] fArr2 = fArr != null ? (float[]) fArr.clone() : null;
        if (fArr2 != null) {
            int length = fArr2.length;
            for (int i = 0; i < length; i++) {
                fArr2[i] = Math.max(0.0f, fArr[i] - v0);
            }
        }
        Path path2 = new Path();
        path2.reset();
        if (fArr2 == null) {
            path2.addRect(rectF2, Path.Direction.CW);
        } else {
            path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
        }
        path2.close();
        canvas.drawPath(path2, (Paint) this.f);
    }

    public f5g h() {
        return (f5g) ((jyr) this.f).getValue();
    }

    public i5h i() {
        return (i5h) ((jyr) this.e).getValue();
    }

    public cut j() {
        return (cut) ((jyr) this.d).getValue();
    }

    public File k(String str, String str2) {
        File file = new File((File) this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public pjc m(int i) {
        Set keySet = ((yca) ((aaa) ((jyr) this.f).getValue()).e.getValue()).a.keySet();
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String str = ((frt) qdcVar.C(I)).c().a;
        str.getClass();
        Continuation continuation = null;
        eno f = i().f(str, new String[]{"album_mview"}, new zui(this, str, i, keySet, continuation, 0));
        Set keySet2 = ((yca) ((aaa) ((jyr) this.f).getValue()).e.getValue()).a.keySet();
        bdt I2 = hag.I(frt.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        String str2 = ((frt) qdcVar2.C(I2)).c().a;
        str2.getClass();
        eno f2 = i().f(str2, new String[]{"album_mview"}, new zui(this, str2, i, keySet2, continuation, 2));
        Map map = ((lja) ((e6q) ((uaa) ((jyr) this.g).getValue())).e.getValue()).b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((nq3) entry.getValue()).c.a()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet3 = linkedHashMap.keySet();
        bdt I3 = hag.I(frt.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        String str3 = ((frt) qdcVar3.C(I3)).c().a;
        str3.getClass();
        Continuation continuation2 = null;
        return zsd.k0(new njf(zsd.Q(f, f2, i().f(str3, new String[]{"track_mview"}, new zui(this, str3, i, keySet3, continuation2, 1)), new tfa(4, 2, continuation2)), this, 17), dm6.a);
    }

    public void n() {
        rvh rvhVar = (rvh) ((jyr) this.b).getValue();
        rvhVar.d = null;
        rvhVar.a();
        vqi vqiVar = (vqi) this.f;
        if (vqiVar != null) {
            vqiVar.V();
        }
        this.f = null;
        qec qecVar = (qec) this.g;
        if (qecVar != null) {
            String str = vhd.h.a;
            tnl tnlVar = tnl.a;
            str.getClass();
            zfd.z((zfd) qecVar.b, str, tnlVar, false, 12);
        }
        qec qecVar2 = (qec) this.g;
        if (qecVar2 != null) {
            String str2 = vhd.h.a;
            str2.getClass();
            zfd.z((zfd) qecVar2.b, str2, null, false, 10);
        }
    }

    public void o(Throwable th, Thread thread, String str, uib uibVar, boolean z) {
        byte b;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        boolean equals = str.equals("crash");
        pq6 pq6Var = (pq6) this.a;
        long j = uibVar.b;
        Context context = pq6Var.a;
        int i = context.getResources().getConfiguration().orientation;
        j6e j6eVar = pq6Var.d;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        x3n x3nVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            x3nVar = new x3n(th3.getLocalizedMessage(), th3.getClass().getName(), j6eVar.l(th3.getStackTrace()), x3nVar);
        }
        ec2 ec2Var = new ec2();
        ec2Var.b = str;
        ec2Var.a = j;
        ec2Var.g = (byte) (ec2Var.g | 1);
        dq6 b2 = atm.a.b(context);
        int i2 = ((pc2) b2).c;
        Boolean valueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList a = atm.a(context);
        byte b3 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) x3nVar.c;
        String name = thread.getName();
        if (name == null) {
            jj4.j("Null name");
            return;
        }
        byte b4 = (byte) 1;
        List d = pq6.d(stackTraceElementArr, 4);
        if (d == null) {
            jj4.j("Null frames");
            return;
        }
        if (b4 != 1) {
            StringBuilder sb = new StringBuilder();
            if (b4 == 0) {
                sb.append(" importance");
            }
            xq0.q(su4.n("Missing required properties:", sb));
            return;
        }
        Boolean bool = valueOf;
        arrayList.add(new lc2(name, d, 4));
        if (z) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    b = b4;
                    it = it2;
                } else {
                    StackTraceElement[] l = j6eVar.l(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        jj4.j("Null name");
                        return;
                    }
                    it = it2;
                    List d2 = pq6.d(l, 0);
                    if (d2 == null) {
                        jj4.j("Null frames");
                        return;
                    }
                    if (b4 != 1) {
                        byte b5 = b4;
                        StringBuilder sb2 = new StringBuilder();
                        if (b5 == 0) {
                            sb2.append(" importance");
                        }
                        xq0.q(su4.n("Missing required properties:", sb2));
                        return;
                    }
                    b = b4;
                    arrayList.add(new lc2(name2, d2, 0));
                }
                it2 = it;
                b4 = b;
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        jc2 c = pq6.c(x3nVar, 0);
        kc2 e = pq6.e();
        List a2 = pq6Var.a();
        if (a2 == null) {
            jj4.j("Null binaries");
            return;
        }
        hc2 hc2Var = new hc2(unmodifiableList, c, null, e, a2);
        if (b3 != 1) {
            StringBuilder sb3 = new StringBuilder();
            if (b3 == 0) {
                sb3.append(" uiOrientation");
            }
            xq0.q(su4.n("Missing required properties:", sb3));
            return;
        }
        ec2Var.c = new gc2(hc2Var, null, null, bool, b2, a, i);
        ec2Var.d = pq6Var.b(i);
        fc2 a3 = ec2Var.a();
        Map map = uibVar.c;
        yfx yfxVar = (yfx) this.d;
        rn5 rn5Var = (rn5) this.e;
        kq6 b6 = b(a(a3, yfxVar, rn5Var, map), rn5Var);
        if (z) {
            ((tq6) this.b).d(b6, uibVar.a, equals);
        } else {
            ((vq6) ((osh) this.g).b).d(new srb(this, b6, uibVar, equals, 4));
        }
    }

    public onx s(String str, Executor executor) {
        i8s i8sVar;
        ArrayList b = ((tq6) this.b).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                sq6 sq6Var = tq6.g;
                String e = tq6.e(file);
                sq6Var.getClass();
                arrayList.add(new rb2(sq6.i(e), file.getName(), file));
            } catch (IOException e2) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            rb2 rb2Var = (rb2) it2.next();
            if (str == null || str.equals(rb2Var.b)) {
                hc7 hc7Var = (hc7) this.c;
                qb2 qb2Var = rb2Var.a;
                if (qb2Var.f == null || qb2Var.g == null) {
                    eec b2 = ((uae) this.f).b(true);
                    qb2 qb2Var2 = rb2Var.a;
                    String str2 = b2.a;
                    pb2 a = qb2Var2.a();
                    a.e = str2;
                    qb2 a2 = a.a();
                    String str3 = b2.b;
                    pb2 a3 = a2.a();
                    a3.f = str3;
                    rb2Var = new rb2(a3.a(), rb2Var.b, rb2Var.c);
                }
                boolean z = str != null;
                ozn oznVar = hc7Var.a;
                synchronized (oznVar.f) {
                    try {
                        i8sVar = new i8s();
                        if (z) {
                            ((AtomicInteger) oznVar.i.a).getAndIncrement();
                            if (oznVar.f.size() < oznVar.e) {
                                mvt mvtVar = mvt.h;
                                mvtVar.v("Enqueueing report: " + rb2Var.b);
                                mvtVar.v("Queue size: " + oznVar.f.size());
                                oznVar.g.execute(new nud(15, oznVar, rb2Var, i8sVar));
                                mvtVar.v("Closing task for report: " + rb2Var.b);
                                i8sVar.d(rb2Var);
                            } else {
                                oznVar.a();
                                String str4 = "Dropping report due to queue being full: " + rb2Var.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) oznVar.i.b).getAndIncrement();
                                i8sVar.d(rb2Var);
                            }
                        } else {
                            oznVar.b(rb2Var, i8sVar);
                        }
                    } finally {
                    }
                }
                arrayList2.add(i8sVar.a.e(executor, new e7o(this)));
            }
        }
        return ywf.O(arrayList2);
    }

    public void t(Object obj) {
        String str = (String) this.a;
        List list = (List) this.d;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            wvs.e(2, null, ouj.k('\'', "Cannot set property. No setters provided. Name: '", str));
            return;
        }
        try {
            switch (((nx8) this.b).ordinal()) {
                case 0:
                    obj.getClass();
                    break;
                case 1:
                    obj.getClass();
                    ((Number) obj).longValue();
                    break;
                case 2:
                    obj.getClass();
                    ((Number) obj).doubleValue();
                    break;
                case 3:
                    obj.getClass();
                    break;
                case 4:
                    obj.getClass();
                    break;
                case 5:
                    obj.getClass();
                    break;
                case 6:
                    obj.getClass();
                    break;
                case 7:
                    obj.getClass();
                    break;
                case 8:
                    obj.getClass();
                    break;
            }
            ((eym) this.f).f(str, (String) this.e, list, obj);
        } catch (ClassCastException e) {
            throw new wxt("Unable to set value with type " + obj.getClass() + " to variable '" + str + '\'', e);
        }
    }

    public /* synthetic */ jac(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
    }

    public jac(String str, nx8 nx8Var, szb szbVar, List list, String str2, eym eymVar) {
        this.a = str;
        this.b = nx8Var;
        this.c = szbVar;
        this.d = list;
        this.e = str2;
        this.f = eymVar;
    }

    public jac(t tVar, tmb tmbVar, y yVar, gs4 gs4Var) {
        tVar.getClass();
        yVar.getClass();
        this.a = tVar;
        this.b = tmbVar;
        this.c = yVar;
        this.d = btf.b(new zu4(this, 0));
        this.e = new ybf(ern.a(ru4.class), new r71((jfu) gs4Var.b, 3), new vz(26, new zu4(this, 1)));
        this.f = btf.b(new zu4(this, 2));
        this.g = btf.b(new zu4(this, 3));
    }

    public jac(qzc qzcVar, f5v f5vVar, mmo mmoVar, fmu fmuVar, a aVar, cvu cvuVar) {
        aVar.getClass();
        this.a = qzcVar;
        this.b = f5vVar;
        this.c = mmoVar;
        this.d = fmuVar;
        this.e = aVar;
        this.f = cvuVar;
    }

    public jac(Context context, frt frtVar, cc7 cc7Var) {
        this.a = context;
        this.b = frtVar;
        this.c = cc7Var;
        this.d = btf.b(new dmg(26, this));
        bdt I = hag.I(i5h.class);
        l18 l18Var = l18.b;
        this.e = l18Var.b(I, false);
        this.f = l18Var.b(hag.I(aaa.class), true);
        this.g = l18Var.b(hag.I(uaa.class), true);
    }

    public jac(Context context) {
        String str;
        String replaceAll;
        String str2 = ((pc2) atm.a.b(context)).a;
        this.a = str2;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (!str2.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str2.length() > 40) {
                replaceAll = kg5.J(str2);
            } else {
                replaceAll = str2.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(replaceAll);
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        p(file);
        this.c = file;
        File file2 = new File(file, "open-sessions");
        p(file2);
        this.d = file2;
        File file3 = new File(file, "reports");
        p(file3);
        this.e = file3;
        File file4 = new File(file, "priority-reports");
        p(file4);
        this.f = file4;
        File file5 = new File(file, "native-reports");
        p(file5);
        this.g = file5;
    }

    public jac(DisplayMetrics displayMetrics, js9 js9Var, cs9 cs9Var, Canvas canvas, xzb xzbVar) {
        szb szbVar;
        this.a = displayMetrics;
        this.b = js9Var;
        this.c = cs9Var;
        this.d = canvas;
        this.e = xzbVar;
        Paint paint = new Paint();
        this.f = paint;
        if (js9Var != null) {
            ln9 ln9Var = js9Var.b;
            szb szbVar2 = js9Var.a;
            float w = bg3.w(szbVar2 != null ? (Long) szbVar2.a(xzbVar) : null, displayMetrics);
            this.g = new float[]{w, w, w, w, w, w, w, w};
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(bkp.v0(ln9Var, xzbVar, displayMetrics));
            if (ln9Var == null || (szbVar = ln9Var.a) == null) {
                return;
            }
            paint.setColor(((Number) szbVar.a(xzbVar)).intValue());
            return;
        }
        this.g = null;
    }

    public jac(faw fawVar) {
        this.g = fawVar;
        this.a = btf.b(new p9w(26));
        this.b = btf.b(new r9w(fawVar, 20));
        bdt I = hag.I(et.class);
        l18 l18Var = l18.b;
        this.c = l18Var.b(I, true);
        this.d = l18Var.b(hag.I(p51.class), true);
        this.e = l18Var.b(hag.I(i2m.class), true);
        this.f = l18Var.b(hag.I(rus.class), true);
    }

    public jac(rdc rdcVar, rdc rdcVar2, rdc rdcVar3, rdc rdcVar4, q7b q7bVar, q7b q7bVar2) {
        this.g = irf.U(150, new n7b(this));
        this.a = rdcVar;
        this.b = rdcVar2;
        this.c = rdcVar3;
        this.d = rdcVar4;
        this.e = q7bVar;
        this.f = q7bVar2;
    }
}
