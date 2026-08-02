package defpackage;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowManager;
import androidx.fragment.app.t;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.music.databases.main.MainDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.concert.ConcertActivity;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes6.dex */
public final class z0j implements qmh, zzo, t2c {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public z0j(Context context, xxq xxqVar, uju ujuVar) {
        this.a = 0;
        xxqVar.getClass();
        this.d = xxqVar;
        String str = xxqVar.a;
        pst pstVar = new pst(context, str, "NetworkModeSwitcher.prefs");
        this.c = pstVar;
        this.b = true;
        this.e = ujuVar;
        SharedPreferences sharedPreferences = pstVar.a;
        if (!sharedPreferences.contains("migrated")) {
            pstVar.edit().putBoolean("migrated", true).apply();
            pst a = ost.a(context, xxqVar);
            v0j v0jVar = a1j.e;
            int i = a.a.getInt("network_mode", v0jVar.a);
            b3i b3iVar = v0j.b;
            Integer valueOf = Integer.valueOf(i);
            b3iVar.getClass();
            Assertions.assertNonNull(b3i.C(valueOf));
            v0j C = b3i.C(Integer.valueOf(i));
            v0jVar = C != null ? C : v0jVar;
            if (v0j.e == v0jVar) {
                SharedPreferences.Editor edit = pstVar.edit();
                j6e j6eVar = new j6e(this, edit);
                j6eVar.u(this.b);
                j6eVar.t(a1j.e);
                edit.apply();
            }
            if (v0j.d == v0jVar) {
                SharedPreferences.Editor edit2 = pstVar.edit();
                new j6e(this, edit2).t(a1j.e);
                edit2.apply();
            }
        }
        if (xxqVar.a()) {
            boolean z = sharedPreferences.getBoolean("is_offline", false);
            str.getClass();
            ujuVar.b.c(new tju(ujuVar, str, z, 1));
        }
    }

    public static void G(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / sqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3;
    }

    public static void I(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / sqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3;
    }

    public static String d0(List list) {
        return hrg.q("liked=1 AND album_type IN ", CollectionsKt.X(list, StringUtils.COMMA, "(", ")", new m2j(7), 24), " AND album_for_kids=1");
    }

    public static String e0(List list) {
        return hrg.q("liked=1 AND album_type IN ", CollectionsKt.X(list, StringUtils.COMMA, "(", ")", new m2j(7), 24), " AND album_for_kids=0");
    }

    public void B() {
        k78 k78Var = (k78) this.e;
        synchronized (k78Var) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (Intrinsics.d(((d78) this.c).g, this)) {
                    k78Var.b(this, true);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.t2c
    public void E(fap fapVar) {
        ((t2c) this.c).E(fapVar);
    }

    public void F(boolean z) {
        l78 l78Var = (l78) this.e;
        synchronized (l78Var) {
            try {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (Intrinsics.d(((e78) this.c).g, this)) {
                    l78.a(l78Var, this, z);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.t2c
    public void K() {
        SparseArray sparseArray = (SparseArray) this.e;
        ((t2c) this.c).K();
        if (this.b) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((vpr) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public void L() {
        d78 d78Var = (d78) this.c;
        if (Intrinsics.d(d78Var.g, this)) {
            k78 k78Var = (k78) this.e;
            if (k78Var.k) {
                k78Var.b(this, false);
            } else {
                d78Var.f = true;
            }
        }
    }

    @Override // defpackage.t2c
    public azs M(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.e;
        t2c t2cVar = (t2c) this.c;
        if (i2 != 3) {
            this.b = true;
            return t2cVar.M(i, i2);
        }
        vpr vprVar = (vpr) sparseArray.get(i);
        if (vprVar != null) {
            return vprVar;
        }
        vpr vprVar2 = new vpr(t2cVar.M(i, i2), (spr) this.d);
        sparseArray.put(i, vprVar2);
        return vprVar2;
    }

    public cak O(int i) {
        cak cakVar;
        l78 l78Var = (l78) this.e;
        synchronized (l78Var) {
            if (this.b) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.d)[i] = true;
            Object obj = ((e78) this.c).d.get(i);
            i78 i78Var = l78Var.p;
            cak cakVar2 = (cak) obj;
            if (!i78Var.f(cakVar2)) {
                k.a(i78Var.k(cakVar2));
            }
            cakVar = (cak) obj;
        }
        return cakVar;
    }

    public File Q() {
        File file;
        synchronized (((j78) this.e)) {
            try {
                c78 c78Var = (c78) this.c;
                if (c78Var.f != this) {
                    throw new IllegalStateException();
                }
                if (!c78Var.e) {
                    ((boolean[]) this.d)[0] = true;
                }
                file = c78Var.d[0];
                ((j78) this.e).a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public String R() {
        String e0;
        switch (((paj) this.c).ordinal()) {
            case 0:
                e0 = e0(dw.MyMusic.a);
                break;
            case 1:
                e0 = e0(dw.MyMusicPodcasts.a);
                break;
            case 2:
            case 3:
                e0 = e0(dw.MyMusicBooks.a);
                break;
            case 4:
                e0 = "liked=1 AND album_for_kids=1 AND (available=1 OR for_premium=1 OR for_options!='')";
                break;
            case 5:
                e0 = d0(dw.MyMusicPodcasts.a);
                break;
            case 6:
                e0 = d0(dw.MyMusicAlbums.a);
                break;
            case 7:
                e0 = d0(dw.MyMusicBooks.a);
                break;
            case 8:
                e0 = d0(dw.MyMusic.a);
                break;
            default:
                b6e.s();
                return null;
        }
        return e0.concat(" AND (name_surrogate LIKE ? OR artist_name_surrogate LIKE ?)");
    }

    public synchronized boolean U() {
        boolean z;
        boolean z2;
        try {
            synchronized (this) {
                try {
                    if (!this.b) {
                        Boolean b0 = b0();
                        this.d = b0;
                        if (b0 == null) {
                            ((rhb) ((nnr) this.c)).a(new kac(7));
                        }
                        this.b = true;
                    }
                } finally {
                }
            }
            return z2;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.d;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            aec aecVar = ((FirebaseMessaging) this.e).a;
            aecVar.a();
            w97 w97Var = (w97) aecVar.g.get();
            synchronized (w97Var) {
                z = w97Var.a;
            }
            z2 = z;
        }
        return z2;
    }

    public ArrayList V() {
        if (!this.b) {
            this.b = true;
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Method method = cls.getMethod("getInstance", null);
                method.getClass();
                this.c = method.invoke(null, null);
                Field declaredField = cls.getDeclaredField("mViews");
                this.d = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                Field declaredField2 = cls.getDeclaredField("mParams");
                this.e = declaredField2;
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
            } catch (ClassNotFoundException e) {
                Log.d("z0j", String.format("could not find class: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal"}, 1)), e);
            } catch (IllegalAccessException e2) {
                Log.d("z0j", String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"}, 3)), e2);
            } catch (NoSuchFieldException e3) {
                Log.d("z0j", String.format("could not find field: %s or %s on %s", Arrays.copyOf(new Object[]{"mParams", "mViews", "android.view.WindowManagerGlobal"}, 3)), e3);
            } catch (NoSuchMethodException e4) {
                Log.d("z0j", String.format("could not find method: %s on %s", Arrays.copyOf(new Object[]{"getInstance", "android.view.WindowManagerGlobal"}, 2)), e4);
            } catch (RuntimeException e5) {
                Log.d("z0j", String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"}, 3)), e5);
            } catch (InvocationTargetException e6) {
                Log.d("z0j", String.format("could not invoke: %s on %s", Arrays.copyOf(new Object[]{"getInstance", "android.view.WindowManagerGlobal"}, 2)), e6.getCause());
            }
        }
        Object obj = this.c;
        if (obj == null) {
            Log.d("z0j", "No reflective access to windowmanager object.");
            return null;
        }
        Field field = (Field) this.d;
        if (field == null) {
            Log.d("z0j", "No reflective access to mViews");
            return null;
        }
        if (((Field) this.e) == null) {
            Log.d("z0j", "No reflective access to mPArams");
            return null;
        }
        try {
            Iterable iterable = (List) field.get(obj);
            Field field2 = (Field) this.e;
            List list = (List) (field2 != null ? field2.get(this.c) : null);
            ArrayList arrayList = new ArrayList();
            if (iterable == null) {
                iterable = c5b.a;
            }
            Iterator it = CollectionsKt.C0(iterable, list != null ? list : c5b.a).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList.add(new ki0((View) pair.a, (WindowManager.LayoutParams) pair.b));
            }
            return arrayList;
        } catch (IllegalAccessException e7) {
            Log.d("z0j", String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{(Field) this.d, (Field) this.e, this.c}, 3)), e7);
            return null;
        } catch (RuntimeException e8) {
            Log.d("z0j", String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{(Field) this.d, (Field) this.e, this.c}, 3)), e8);
            return null;
        }
    }

    public jmq X(int i) {
        kt1 kt1Var;
        k78 k78Var = (k78) this.e;
        synchronized (k78Var) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.d(((d78) this.c).g, this)) {
                    return new y33();
                }
                if (!((d78) this.c).e) {
                    boolean[] zArr = (boolean[]) this.d;
                    zArr.getClass();
                    zArr[i] = true;
                }
                File file = (File) ((d78) this.c).d.get(i);
                try {
                    file.getClass();
                    try {
                        Logger logger = epj.a;
                        kt1Var = new kt1(new FileOutputStream(file, false), new vis());
                    } catch (FileNotFoundException unused) {
                        file.getParentFile().mkdirs();
                        Logger logger2 = epj.a;
                        kt1Var = new kt1(new FileOutputStream(file, false), new vis());
                    }
                    return new o5c(kt1Var, new sv4(13, k78Var, this));
                } catch (FileNotFoundException unused2) {
                    return new y33();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Z(qt2 qt2Var) {
        Object removeFirst;
        synchronized (((klx) this.d)) {
            ((zx0) this.e).addLast(qt2Var);
            if (this.b) {
                return;
            }
            this.b = true;
            while (true) {
                synchronized (((klx) this.d)) {
                    if (((zx0) this.e).isEmpty()) {
                        this.b = false;
                        return;
                    }
                    removeFirst = ((zx0) this.e).removeFirst();
                }
                ((m5) this.c).invoke(removeFirst);
            }
        }
    }

    @Override // defpackage.qmh
    public byte[] a(UUID uuid, nqb nqbVar) {
        return xp3.H(((zm7) this.c).a(), nqbVar.b + "&signedRequest=" + dvt.r(nqbVar.a), null, Collections.EMPTY_MAP);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable a0(String str, String str2, Continuation continuation) {
        w9j w9jVar;
        int i;
        if (continuation instanceof w9j) {
            w9jVar = (w9j) continuation;
            int i2 = w9jVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w9jVar.m = i2 - Integer.MIN_VALUE;
                Object obj = w9jVar.k;
                nm6 nm6Var = nm6.a;
                i = w9jVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h i5hVar = (i5h) ((jyr) this.e).getValue();
                    w9jVar.j = str2;
                    w9jVar.m = 1;
                    obj = i5hVar.b(str, w9jVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        List<zv> list = (List) obj;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        for (zv zvVar : list) {
                            arrayList.add(new Pair(zvVar.b, h4a.X(zvVar)));
                        }
                        return arrayList;
                    }
                    str2 = w9jVar.j;
                    qgg.h0(obj);
                }
                cw w = ((MainDatabase) obj).w();
                ysr ysrVar = new ysr("album_mview");
                String R = !this.b ? (String) this.d : R();
                String[] strArr = {q7g.S(str2), q7g.S(str2)};
                ysrVar.d = R;
                ysrVar.e = strArr;
                ysrVar.f = "timestamp DESC";
                atn a = ysrVar.a();
                w9jVar.j = null;
                w9jVar.m = 2;
                obj = w.b(a, w9jVar);
            }
        }
        w9jVar = new w9j(this, continuation);
        Object obj2 = w9jVar.k;
        nm6 nm6Var2 = nm6.a;
        i = w9jVar.m;
        if (i != 0) {
        }
        cw w2 = ((MainDatabase) obj2).w();
        ysr ysrVar2 = new ysr("album_mview");
        if (!this.b) {
        }
        String[] strArr2 = {q7g.S(str2), q7g.S(str2)};
        ysrVar2.d = R;
        ysrVar2.e = strArr2;
        ysrVar2.f = "timestamp DESC";
        atn a2 = ysrVar2.a();
        w9jVar.j = null;
        w9jVar.m = 2;
        obj2 = w2.b(a2, w9jVar);
    }

    @Override // defpackage.zzo
    public boolean b() {
        return this.b;
    }

    public Boolean b0() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        aec aecVar = ((FirebaseMessaging) this.e).a;
        aecVar.a();
        Context context = aecVar.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // defpackage.qmh
    public byte[] c(UUID uuid, lqb lqbVar) {
        String str = lqbVar.b;
        if (this.b || TextUtils.isEmpty(str)) {
            str = (String) this.d;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            vq1.C(uri, "The uri must be set.");
            throw new tmh(new nb7(uri, 0L, 1, null, map, 0L, -1L, null, 0), uri, vsn.g, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = un3.e;
        hashMap.put(HttpMessage.CONTENT_TYPE_HEADER, uuid2.equals(uuid) ? "text/xml" : un3.c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.e)) {
            hashMap.putAll((HashMap) this.e);
        }
        return xp3.H(((zm7) this.c).a(), str, lqbVar.a, hashMap);
    }

    @Override // defpackage.zzo
    public void f(y6p y6pVar, int i) {
        String str;
        y6pVar.getClass();
        ((jtc) ((xdh) this.d).c).e(y6pVar, i, q0p.b);
        nnd nndVar = (nnd) this.e;
        us5 us5Var = y6pVar.b;
        w0p w0pVar = new w0p(us5Var.a);
        boolean H = v5g.H(y6pVar.c);
        nndVar.getClass();
        nndVar.N(w0pVar, t0p.b, H);
        mt5 mt5Var = (mt5) this.c;
        String str2 = us5Var.n;
        if (str2 == null || (str = (String) avf.R(str2)) == null) {
            return;
        }
        a0g.D(mt5Var.a, us5Var.a, str);
    }

    public void g0() {
        if (this.b) {
            ((hzr) this.e).e(new he0(5, this));
            this.b = false;
        }
    }

    public boolean h0(String str, String str2) {
        synchronized (this) {
            try {
                if (!((jcf) ((AtomicMarkableReference) this.c).getReference()).b(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.c;
                atomicMarkableReference.set((jcf) atomicMarkableReference.getReference(), true);
                bhp bhpVar = new bhp(18, this);
                AtomicReference atomicReference = (AtomicReference) this.d;
                while (!atomicReference.compareAndSet(null, bhpVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((vq6) ((osh) ((rn5) this.e).c).b).d(bhpVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l() {
        switch (this.a) {
            case 7:
                j78.a((j78) this.e, this, false);
                return;
            default:
                k78 k78Var = (k78) this.e;
                synchronized (k78Var) {
                    try {
                        if (this.b) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (Intrinsics.d(((d78) this.c).g, this)) {
                            k78Var.b(this, false);
                        }
                        this.b = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public void m(int i, String str) {
        u(str, String.valueOf(i));
    }

    public void n(long j, String str) {
        u(str, String.valueOf(j));
    }

    @Override // defpackage.zzo
    public void o(y6p y6pVar, int i) {
        y6pVar.getClass();
        ((jtc) ((xdh) this.d).c).e(y6pVar, i, q0p.a);
        nnd nndVar = (nnd) this.e;
        us5 us5Var = y6pVar.b;
        w0p w0pVar = new w0p(us5Var.a);
        boolean H = v5g.H(y6pVar.c);
        nndVar.getClass();
        nndVar.N(w0pVar, t0p.b, H);
        t tVar = ((mt5) this.c).a;
        int i2 = ConcertActivity.w0;
        y7g.O(tVar, bkp.j0(tVar, us5Var.a, null));
    }

    @Override // defpackage.zzo
    public void p(k7p k7pVar, int i) {
        k7pVar.getClass();
        grh grhVar = (grh) ((xdh) this.d).b;
        q0p q0pVar = q0p.a;
        s26 s26Var = k7pVar.b;
        grhVar.b(q0pVar, s26Var.a.a, i);
        nnd nndVar = (nnd) this.e;
        w0p w0pVar = new w0p(s26Var.a.a);
        boolean H = v5g.H(k7pVar.c);
        nndVar.getClass();
        nndVar.N(w0pVar, t0p.b, H);
        t tVar = ((mt5) this.c).a;
        int i2 = ConcertActivity.w0;
        y7g.O(tVar, bkp.j0(tVar, s26Var.a.a, null));
    }

    public void q(Object obj, String str) {
        ime imeVar = new ime(12);
        ((ime) this.e).d = imeVar;
        this.e = imeVar;
        imeVar.c = obj;
        imeVar.b = str;
    }

    @Override // defpackage.zzo
    public void r(k7p k7pVar, int i) {
        String str;
        k7pVar.getClass();
        grh grhVar = (grh) ((xdh) this.d).b;
        q0p q0pVar = q0p.b;
        s26 s26Var = k7pVar.b;
        grhVar.b(q0pVar, s26Var.a.a, i);
        nnd nndVar = (nnd) this.e;
        w0p w0pVar = new w0p(s26Var.a.a);
        boolean H = v5g.H(k7pVar.c);
        nndVar.getClass();
        nndVar.N(w0pVar, t0p.b, H);
        mt5 mt5Var = (mt5) this.c;
        h06 h06Var = s26Var.a;
        String str2 = h06Var.h;
        if (str2 == null || (str = (String) avf.R(str2)) == null) {
            return;
        }
        a0g.D(mt5Var.a, h06Var.a, str);
    }

    public void t(String str, boolean z) {
        u(str, String.valueOf(z));
    }

    public String toString() {
        switch (this.a) {
            case 16:
                boolean z = this.b;
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.c);
                sb.append('{');
                String str = "";
                for (ime imeVar = (ime) ((ime) this.d).d; imeVar != null; imeVar = (ime) imeVar.d) {
                    Object obj = imeVar.c;
                    if ((imeVar instanceof aei) || obj != null || !z) {
                        sb.append(str);
                        String str2 = (String) imeVar.b;
                        if (str2 != null) {
                            sb.append(str2);
                            sb.append('=');
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                            sb.append(obj);
                        } else {
                            String deepToString = Arrays.deepToString(new Object[]{obj});
                            sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                        }
                        str = ", ";
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(String str, String str2) {
        aei aeiVar = new aei(12);
        ((ime) this.e).d = aeiVar;
        this.e = aeiVar;
        aeiVar.c = str2;
        aeiVar.b = str;
    }

    public yfx w() {
        Intent intent = (Intent) this.c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.b);
        ((x2i) this.d).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        String a = sx6.a();
        if (!TextUtils.isEmpty(a)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (((ActivityOptions) this.e) == null) {
                this.e = rx6.a();
            }
            tx6.a((ActivityOptions) this.e, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.e;
        return new yfx(17, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public z0j(Context context, boolean z) {
        this.a = 17;
        context.getClass();
        this.b = z;
        this.e = new cib(18, this);
    }

    public z0j(m5 m5Var) {
        this.a = 20;
        this.c = m5Var;
        this.d = new klx(26);
        this.e = new zx0();
    }

    public z0j(bt8 bt8Var, fs8 fs8Var, boolean z) {
        this.a = 10;
        bt8Var.getClass();
        fs8Var.getClass();
        this.c = bt8Var;
        this.d = fs8Var;
        this.b = z;
        this.e = bt8Var.p;
    }

    public z0j(mnn mnnVar) {
        this.a = 22;
        this.c = mnnVar;
    }

    public z0j(mt5 mt5Var, xdh xdhVar, nnd nndVar, boolean z) {
        this.a = 19;
        xdhVar.getClass();
        nndVar.getClass();
        this.c = mt5Var;
        this.d = xdhVar;
        this.e = nndVar;
        this.b = z;
    }

    public z0j(x2b x2bVar) {
        this.a = 3;
        this.c = x2bVar;
        this.d = jqa.g;
    }

    public z0j(boolean z, paj pajVar) {
        this.a = 18;
        pajVar.getClass();
        this.b = z;
        this.c = pajVar;
        this.d = R().concat(" AND tracks_cached>0");
        this.e = l18.b.b(hag.I(i5h.class), false);
    }

    public /* synthetic */ z0j(int i, boolean z) {
        this.a = i;
    }

    public z0j(t2c t2cVar, spr sprVar) {
        this.a = 23;
        this.c = t2cVar;
        this.d = sprVar;
        this.e = new SparseArray();
    }

    public z0j(Context context, Looper looper, Looper looper2, urb urbVar, dzr dzrVar) {
        this.a = 2;
        this.c = context.getApplicationContext();
        this.e = dzrVar.a(looper, null);
        this.d = new iv1(this, dzrVar.a(looper2, null), urbVar);
    }

    public z0j(String str, boolean z, zm7 zm7Var) {
        this.a = 14;
        vq1.v((z && TextUtils.isEmpty(str)) ? false : true);
        this.c = zm7Var;
        this.d = str;
        this.b = z;
        this.e = new HashMap();
    }

    public z0j(String str) {
        this.a = 16;
        ime imeVar = new ime(12);
        this.d = imeVar;
        this.e = imeVar;
        this.b = false;
        this.c = str;
    }

    public z0j(u76 u76Var, emq emqVar) {
        this.a = 21;
        this.e = new xd0(5, this);
        this.d = u76Var;
        this.c = emqVar;
    }

    public z0j(rn5 rn5Var, boolean z) {
        this.a = 24;
        this.e = rn5Var;
        this.d = new AtomicReference(null);
        this.b = z;
        this.c = new AtomicMarkableReference(new jcf(z ? RemoteCameraConfig.Notification.ID : 1024), false);
    }

    public z0j(int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.c = new float[16];
                this.d = new float[16];
                this.e = new lis(0);
                break;
            case 13:
                this.c = new float[16];
                this.d = new float[16];
                this.e = new lis(1);
                break;
            case 14:
            default:
                this.c = new Intent("android.intent.action.VIEW");
                this.d = new x2i(19);
                this.b = true;
                break;
            case 15:
                this.c = new Object();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.b = true;
                break;
        }
    }

    public z0j(vx6 vx6Var) {
        this.a = 6;
        Intent intent = new Intent("android.intent.action.VIEW");
        this.c = intent;
        this.d = new x2i(19);
        this.b = true;
        if (vx6Var != null) {
            intent.setPackage(((ComponentName) vx6Var.d).getPackageName());
            qx6 qx6Var = (qx6) vx6Var.c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", qx6Var);
            intent.putExtras(bundle);
        }
    }

    public z0j(l78 l78Var, e78 e78Var) {
        this.a = 9;
        this.e = l78Var;
        this.c = e78Var;
        this.d = new boolean[2];
    }

    public z0j(FirebaseMessaging firebaseMessaging, nnr nnrVar) {
        this.a = 11;
        this.e = firebaseMessaging;
        this.c = nnrVar;
    }

    public z0j(j78 j78Var, c78 c78Var) {
        this.a = 7;
        this.e = j78Var;
        this.c = c78Var;
        this.d = c78Var.e ? null : new boolean[j78Var.g];
    }

    public z0j(k78 k78Var, d78 d78Var) {
        boolean[] zArr;
        this.a = 8;
        this.e = k78Var;
        this.c = d78Var;
        if (d78Var.e) {
            zArr = null;
        } else {
            k78Var.getClass();
            zArr = new boolean[2];
        }
        this.d = zArr;
    }

    public z0j(gw0 gw0Var) {
        this.a = 5;
        this.e = gw0Var;
        this.c = null;
        this.d = new q9(11, this);
        this.b = false;
    }
}
