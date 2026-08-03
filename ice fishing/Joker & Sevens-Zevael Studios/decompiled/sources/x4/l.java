package x4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Insets;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.work.impl.WorkDatabase_Impl;
import b0.p0;
import bc.a0;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m0.m2;
import m0.z;
import n0.j0;
import org.json.JSONException;
import org.json.JSONObject;
import q3.t;
import q3.u;
import q3.w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements j0, q3.o {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8311g;

    /* renamed from: h, reason: collision with root package name */
    public Object f8312h;

    /* renamed from: i, reason: collision with root package name */
    public Object f8313i;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f8311g = i10;
        this.f8312h = obj;
        this.f8313i = obj2;
    }

    @Override // q3.o
    public boolean a(CharSequence charSequence, int i10, int i11, t tVar) {
        if ((tVar.f5795c & 4) > 0) {
            return true;
        }
        if (((w) this.f8312h) == null) {
            this.f8312h = new w(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((m6.i) this.f8313i).getClass();
        ((w) this.f8312h).setSpan(new u(tVar), i10, i11, 33);
        return true;
    }

    public Bundle b(String str) {
        pc.j.e(str, "key");
        g4.a aVar = (g4.a) this.f8312h;
        if (!aVar.f2513g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = aVar.f2512f;
        if (bundle == null) {
            return null;
        }
        Bundle r5 = bundle.containsKey(str) ? a0.r(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            aVar.f2512f = null;
        }
        return r5;
    }

    @Override // n0.j0
    public List c(Integer num) {
        List c3 = ((j0) this.f8312h).c(null);
        m2 m2Var = (m2) this.f8313i;
        int i10 = m2Var.f4679v;
        return i10 < 0 ? c3 : bc.m.a0(u2.b.h(m2Var, num, i10, Integer.valueOf(m2Var.D(m2Var.f4659b, i10))), c3);
    }

    public boolean d(j jVar) {
        boolean containsKey;
        synchronized (this.f8312h) {
            containsKey = ((LinkedHashMap) this.f8313i).containsKey(jVar);
        }
        return containsKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory e(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f8313i) == null) {
            Context context = (Context) this.f8312h;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.f8313i = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f8313i = map;
        }
        String str4 = (String) ((Map) this.f8313i).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    public File f() {
        if (((File) this.f8312h) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f8312h) == null) {
                        i7.g gVar = (i7.g) this.f8313i;
                        gVar.a();
                        this.f8312h = new File(gVar.f3231a.getFilesDir(), "PersistedInstallation." + ((i7.g) this.f8313i).c() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f8312h;
    }

    public e4.d g() {
        e4.d dVar;
        g4.a aVar = (g4.a) this.f8312h;
        synchronized (aVar.f2509c) {
            Iterator it = aVar.f2510d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                e4.d dVar2 = (e4.d) entry.getValue();
                if (pc.j.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    @Override // q3.o
    public Object getResult() {
        return (w) this.f8312h;
    }

    public void h(y7.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f8803a);
            jSONObject.put("Status", v.f.d(bVar.f8804b));
            jSONObject.put("AuthToken", bVar.f8805c);
            jSONObject.put("RefreshToken", bVar.f8806d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f8808f);
            jSONObject.put("ExpiresInSecs", bVar.f8807e);
            jSONObject.put("FisError", bVar.f8809g);
            i7.g gVar = (i7.g) this.f8313i;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f3231a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(f())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void i(int i10) {
        l6.l lVar = (l6.l) this.f8313i;
        yc.g gVar = (yc.g) this.f8312h;
        try {
            if (gVar.u()) {
                if (i10 == 0) {
                    gVar.resumeWith(lVar.a().f1806a.getString("install_referrer"));
                } else {
                    gVar.resumeWith("");
                }
            }
            lVar.f4198a = 3;
            if (((q5.a) lVar.f4201d) != null) {
                a0.z("Unbinding from service.");
                ((Context) lVar.f4199b).unbindService((q5.a) lVar.f4201d);
                lVar.f4201d = null;
            }
            lVar.f4200c = null;
        } catch (Exception unused) {
            if (gVar.u()) {
                gVar.resumeWith("");
            }
        }
    }

    public y7.b j() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(f());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int[] iArr = new int[5];
        System.arraycopy(v.f.f6834a, 0, iArr, 0, 5);
        int i10 = iArr[optInt];
        if (i10 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i10 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new y7.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void k(String str, e4.d dVar) {
        pc.j.e(dVar, "provider");
        g4.a aVar = (g4.a) this.f8312h;
        synchronized (aVar.f2509c) {
            if (aVar.f2510d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.f2510d.put(str, dVar);
        }
    }

    public List l(String str) {
        List e02;
        pc.j.e(str, "workSpecId");
        synchronized (this.f8312h) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8313i;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (pc.j.a(((j) entry.getKey()).f8307a, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f8313i).remove((j) it.next());
                }
                e02 = bc.m.e0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return e02;
    }

    public p4.i m(j jVar) {
        p4.i iVar;
        synchronized (this.f8312h) {
            iVar = (p4.i) ((LinkedHashMap) this.f8313i).remove(jVar);
        }
        return iVar;
    }

    public void n() {
        if (!((g4.a) this.f8312h).f2514h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        e4.a aVar = (e4.a) this.f8313i;
        if (aVar == null) {
            aVar = new e4.a(this);
        }
        this.f8313i = aVar;
        try {
            androidx.lifecycle.l.class.getDeclaredConstructor(null);
            e4.a aVar2 = (e4.a) this.f8313i;
            if (aVar2 != null) {
                aVar2.f2104a.add(androidx.lifecycle.l.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + androidx.lifecycle.l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public p4.i o(j jVar) {
        p4.i iVar;
        synchronized (this.f8312h) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8313i;
                Object obj = linkedHashMap.get(jVar);
                if (obj == null) {
                    obj = new p4.i(jVar);
                    linkedHashMap.put(jVar, obj);
                }
                iVar = (p4.i) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public String toString() {
        switch (this.f8311g) {
            case 3:
                return "Bounds{lower=" + ((a3.b) this.f8312h) + " upper=" + ((a3.b) this.f8313i) + "}";
            default:
                return super.toString();
        }
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f8311g = 0;
        this.f8312h = workDatabase_Impl;
        this.f8313i = new b(workDatabase_Impl, 3);
    }

    public l(g4.a aVar) {
        this.f8311g = 2;
        this.f8312h = aVar;
    }

    public l(int i10) {
        this.f8311g = i10;
        switch (i10) {
            case 9:
                this.f8312h = z.s(Boolean.FALSE);
                break;
            default:
                this.f8312h = new Object();
                this.f8313i = new LinkedHashMap();
                break;
        }
    }

    public l(View view) {
        this.f8311g = 4;
        this.f8312h = view;
        this.f8313i = a0.x(new p0(10, this));
    }

    public l(i7.g gVar) {
        this.f8311g = 11;
        this.f8313i = gVar;
    }

    public l(Context context) {
        this.f8311g = 10;
        this.f8313i = null;
        this.f8312h = context;
    }

    public l(b0.s sVar) {
        this.f8311g = 1;
        this.f8312h = sVar;
        this.f8313i = new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Object obj) {
        this(9);
        this.f8311g = 9;
        this.f8313i = z.s(obj);
        z.s(obj);
    }

    public l(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f8311g = 3;
        lowerBound = bounds.getLowerBound();
        this.f8312h = a3.b.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f8313i = a3.b.c(upperBound);
    }
}
