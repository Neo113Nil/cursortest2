package S0;

import C2.y;
import S7.AbstractC0406y;
import S7.C0403v;
import S7.InterfaceC0404w;
import S7.Y;
import S7.h0;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.fragment.app.AbstractComponentCallbacksC0475s;
import androidx.fragment.app.N;
import androidx.fragment.app.S;
import androidx.fragment.app.V;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.C3675oP;
import com.google.android.gms.internal.consent_sdk.B;
import com.google.android.gms.internal.consent_sdk.C4308d;
import com.google.android.gms.internal.consent_sdk.C4320g;
import com.google.android.gms.internal.consent_sdk.C4341l0;
import com.google.android.gms.internal.consent_sdk.C4344m;
import com.google.android.gms.internal.consent_sdk.C4352o;
import com.google.android.gms.internal.consent_sdk.C4362q1;
import com.google.android.gms.internal.consent_sdk.C4379v;
import com.google.android.gms.internal.consent_sdk.C4387x;
import com.google.android.gms.internal.consent_sdk.C4395z;
import com.google.android.gms.internal.consent_sdk.D;
import com.google.android.gms.internal.consent_sdk.E;
import com.google.android.gms.internal.consent_sdk.O;
import g1.C4523c;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l1.C4656b;
import m1.C4729d;
import org.json.JSONArray;
import org.json.JSONObject;
import u1.C5062a;
import y8.v;
import y8.w;
import y8.x;

/* loaded from: classes.dex */
public final class n implements D, w {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2801n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2802u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f2803v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f2804w;

    /* renamed from: x, reason: collision with root package name */
    public Object f2805x;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2801n = i;
        this.f2802u = obj;
        this.f2803v = obj2;
        this.f2805x = obj4;
        this.f2804w = obj3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032d  */
    @Override // com.google.android.gms.internal.consent_sdk.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(String str, JSONObject jSONObject) {
        char c9;
        HashMap hashMap;
        HashMap hashMap2;
        C4320g c4320g;
        boolean z3;
        char c10;
        String str2;
        String str3;
        String str4;
        Integer num;
        Object obj;
        Object obj2;
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                c9 = 0;
            }
            c9 = 65535;
        } else {
            if (str.equals("clear")) {
                c9 = 1;
            }
            c9 = 65535;
        }
        Application application = (Application) this.f2802u;
        if (c9 != 0) {
            if (c9 != 1) {
                return false;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("keys");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
                return true;
            }
            HashSet hashSet = new HashSet();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (TextUtils.isEmpty(optString)) {
                    Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i);
                } else {
                    hashSet.add(optString);
                }
            }
            E.e(application, hashSet);
            return true;
        }
        C4395z c4395z = new C4395z(application);
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            boolean hasNext = keys.hasNext();
            hashMap = c4395z.f35799a;
            hashMap2 = c4395z.f35801c;
            c4320g = (C4320g) this.f2803v;
            if (!hasNext) {
                break;
            }
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(opt));
            Context context = c4395z.f35800b;
            C4344m a9 = E.a(context, next);
            if (a9 != null) {
                String str5 = (String) a9.f35716n;
                if (!hashMap2.containsKey(str5)) {
                    hashMap2.put(str5, context.getSharedPreferences(str5, 0).edit());
                }
                SharedPreferences.Editor editor = (SharedPreferences.Editor) hashMap2.get(str5);
                boolean z6 = opt instanceof Integer;
                String str6 = (String) a9.f35717u;
                if (z6) {
                    Integer num2 = (Integer) opt;
                    editor.putInt(str6, num2.intValue());
                    if (C4395z.f35798d.contains(str6)) {
                        hashMap.put(str6, num2);
                    }
                } else if (opt instanceof Long) {
                    editor.putLong(str6, ((Long) opt).longValue());
                } else if (opt instanceof Double) {
                    editor.putFloat(str6, ((Double) opt).floatValue());
                } else if (opt instanceof Float) {
                    editor.putFloat(str6, ((Float) opt).floatValue());
                } else if (opt instanceof Boolean) {
                    editor.putBoolean(str6, ((Boolean) opt).booleanValue());
                } else if (opt instanceof String) {
                    editor.putString(str6, (String) opt);
                }
                c4320g.f35678c.add(next);
            }
            Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
        }
        c4320g.f35677b.edit().putStringSet("written_values", c4320g.f35678c).commit();
        Iterator it = hashMap2.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).commit();
        }
        if (hashMap.size() <= 1) {
            return true;
        }
        C4362q1 c4362q1 = (C4362q1) this.f2804w;
        C4308d c4308d = c4362q1.f35740a;
        AtomicReference atomicReference = c4308d.f35663g;
        Object obj3 = atomicReference.get();
        AtomicReference atomicReference2 = c4308d.f35661e;
        AtomicReference atomicReference3 = c4308d.f35660d;
        AtomicReference atomicReference4 = c4308d.f35659c;
        AtomicReference atomicReference5 = c4308d.f35658b;
        if (obj3 != null) {
            z3 = ((Boolean) atomicReference.get()).booleanValue();
        } else {
            Context context2 = c4308d.f35657a;
            if (context2 == null) {
                atomicReference.set(Boolean.FALSE);
            } else {
                try {
                    Class<?> cls = Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                    atomicReference5.set(cls.getDeclaredMethod("getInstance", Context.class).invoke(null, context2));
                    atomicReference4.set(cls.getDeclaredMethod("setConsent", Map.class));
                    Class<?> cls2 = Class.forName("com.google.firebase.analytics.FirebaseAnalytics$ConsentStatus");
                    Class<?> cls3 = Class.forName("com.google.firebase.analytics.FirebaseAnalytics$ConsentType");
                    Method declaredMethod = cls2.getDeclaredMethod("valueOf", String.class);
                    Method declaredMethod2 = cls3.getDeclaredMethod("valueOf", String.class);
                    atomicReference3.set(declaredMethod);
                    atomicReference2.set(declaredMethod2);
                    atomicReference.set(Boolean.TRUE);
                    z3 = true;
                } catch (Exception e9) {
                    Log.w("UserMessagingPlatform", "No Firebase class found. ", e9);
                    atomicReference.set(Boolean.FALSE);
                }
            }
            z3 = false;
        }
        if (z3) {
            Context context3 = c4362q1.f35741b;
            AtomicReference atomicReference6 = c4308d.f35662f;
            if (atomicReference6.get() == null) {
                try {
                    atomicReference6.set(V2.c.a(context3).b(128, context3.getPackageName()).metaData);
                } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
                    Log.w("UserMessagingPlatform", "Failed to get metadata. ", e10);
                }
            }
            String str7 = "IABTCF_gdprApplies";
            Integer num3 = (Integer) hashMap.get("IABTCF_gdprApplies");
            HashMap hashMap3 = new HashMap();
            for (String str8 : hashMap.keySet()) {
                if (!str8.equals(str7)) {
                    switch (str8.hashCode()) {
                        case -1926457382:
                            if (str8.equals("UMP_CoMoAdPersonalizationPurposeConsentStatus")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -142866440:
                            if (str8.equals("UMP_CoMoAnalyticsStoragePurposeConsentStatus")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1068702385:
                            if (str8.equals("UMP_CoMoAdStoragePurposeConsentStatus")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1479307131:
                            if (str8.equals("UMP_CoMoAdUserDataPurposeConsentStatus")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    if (c10 == 0) {
                        str2 = "google_analytics_default_allow_ad_storage";
                        str3 = "AD_STORAGE";
                    } else if (c10 == 1) {
                        str2 = "google_analytics_default_allow_ad_user_data";
                        str3 = "AD_USER_DATA";
                    } else if (c10 == 2) {
                        str2 = "google_analytics_default_allow_ad_personalization_signals";
                        str3 = "AD_PERSONALIZATION";
                    } else if (c10 == 3) {
                        str2 = "google_analytics_default_allow_analytics_storage";
                        str3 = "ANALYTICS_STORAGE";
                    }
                    int intValue = ((Integer) hashMap.get(str8)).intValue();
                    AtomicReference atomicReference7 = atomicReference6;
                    if (intValue != -1) {
                        num = num3;
                        if (intValue != 1) {
                            str4 = str7;
                            if (intValue == 2) {
                                hashMap3.put(str3, "DENIED");
                            } else if (intValue != 4) {
                                if (intValue != 5) {
                                    Log.w("UserMessagingPlatform", "Invalid CoMo consent status: " + intValue);
                                } else {
                                    if (atomicReference7.get() != null && (obj2 = ((Bundle) atomicReference7.get()).get(str2)) != null) {
                                        if (obj2 instanceof Boolean) {
                                            obj = (Boolean) obj2;
                                        } else if (obj2 instanceof String) {
                                            obj = (String) obj2;
                                        }
                                        if (obj != null) {
                                            Log.w("UserMessagingPlatform", "No default metadata");
                                        } else if (obj instanceof Boolean) {
                                            hashMap3.put(str3, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                        } else if ((obj instanceof String) && obj.equals("eu_consent_policy") && ((str3.equals("AD_PERSONALIZATION") || str3.equals("AD_USER_DATA")) && num != null)) {
                                            hashMap3.put(str3, num.intValue() == 1 ? "DENIED" : "GRANTED");
                                        } else {
                                            Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                        }
                                    }
                                    obj = null;
                                    if (obj != null) {
                                    }
                                }
                            }
                        } else {
                            hashMap3.put(str3, "GRANTED");
                            atomicReference6 = atomicReference7;
                            num3 = num;
                        }
                    } else {
                        str4 = str7;
                        num = num3;
                    }
                    atomicReference6 = atomicReference7;
                    num3 = num;
                    str7 = str4;
                }
            }
            Log.d("UserMessagingPlatform", "Update Firebase: ".concat(hashMap3.toString()));
            HashMap hashMap4 = new HashMap();
            for (String str9 : hashMap3.keySet()) {
                try {
                } catch (Exception e11) {
                    e = e11;
                }
                try {
                    hashMap4.put((Enum) ((Method) atomicReference2.get()).invoke(null, str9), (Enum) ((Method) atomicReference3.get()).invoke(null, hashMap3.get(str9)));
                } catch (Exception e12) {
                    e = e12;
                    Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e);
                }
            }
            if (atomicReference4.get() != null && !hashMap4.isEmpty()) {
                try {
                    ((Method) atomicReference4.get()).invoke(atomicReference5.get(), hashMap4);
                } catch (Exception e13) {
                    Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e13);
                }
            }
        }
        hashMap.clear();
        return true;
    }

    public synchronized void b(u1.q qVar, u1.r rVar) {
        C5062a c5062a = (C5062a) ((HashMap) this.f2803v).put(qVar, new C5062a(qVar, rVar, (ReferenceQueue) this.f2804w));
        if (c5062a != null) {
            c5062a.f41044c = null;
            c5062a.clear();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.D
    /* renamed from: c */
    public Executor mo6c() {
        return (B) this.f2805x;
    }

    @Override // y8.w
    public x d() {
        return (z8.d) this.f2804w;
    }

    @Override // y8.w
    public v e() {
        return (z8.c) this.f2805x;
    }

    public void f(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (((ArrayList) this.f2802u).contains(abstractComponentCallbacksC0475s)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0475s);
        }
        synchronized (((ArrayList) this.f2802u)) {
            ((ArrayList) this.f2802u).add(abstractComponentCallbacksC0475s);
        }
        abstractComponentCallbacksC0475s.f5031D = true;
    }

    public void g(C5062a c5062a) {
        u1.x xVar;
        synchronized (this) {
            ((HashMap) this.f2803v).remove(c5062a.f41042a);
            if (c5062a.f41043b && (xVar = c5062a.f41044c) != null) {
                ((u1.l) this.f2805x).e(c5062a.f41042a, new u1.r(xVar, true, false, c5062a.f41042a, (u1.l) this.f2805x));
            }
        }
    }

    public AbstractComponentCallbacksC0475s h(String str) {
        V v9 = (V) ((HashMap) this.f2803v).get(str);
        if (v9 != null) {
            return v9.f4907c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0475s i(String str) {
        for (V v9 : ((HashMap) this.f2803v).values()) {
            if (v9 != null) {
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = v9.f4907c;
                if (!str.equals(abstractComponentCallbacksC0475s.f5066x)) {
                    abstractComponentCallbacksC0475s = abstractComponentCallbacksC0475s.f5039M.f4852c.i(str);
                }
                if (abstractComponentCallbacksC0475s != null) {
                    return abstractComponentCallbacksC0475s;
                }
            }
        }
        return null;
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        for (V v9 : ((HashMap) this.f2803v).values()) {
            if (v9 != null) {
                arrayList.add(v9);
            }
        }
        return arrayList;
    }

    public ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (V v9 : ((HashMap) this.f2803v).values()) {
            if (v9 != null) {
                arrayList.add(v9.f4907c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList;
        if (((ArrayList) this.f2802u).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f2802u)) {
            arrayList = new ArrayList((ArrayList) this.f2802u);
        }
        return arrayList;
    }

    public void m(V v9) {
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = v9.f4907c;
        String str = abstractComponentCallbacksC0475s.f5066x;
        HashMap hashMap = (HashMap) this.f2803v;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0475s.f5066x, v9);
        if (N.E(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0475s);
        }
    }

    public void n(V v9) {
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = v9.f4907c;
        if (abstractComponentCallbacksC0475s.f5046T) {
            ((S) this.f2805x).d(abstractComponentCallbacksC0475s);
        }
        HashMap hashMap = (HashMap) this.f2803v;
        if (hashMap.get(abstractComponentCallbacksC0475s.f5066x) == v9 && ((V) hashMap.put(abstractComponentCallbacksC0475s.f5066x, null)) != null && N.E(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0475s);
        }
    }

    public synchronized boolean o(C4729d c4729d) {
        try {
            String str = c4729d.f39295u;
            if (!((HashMap) this.f2802u).containsKey(str)) {
                ((HashMap) this.f2802u).put(str, null);
                synchronized (c4729d.f39297w) {
                    c4729d.f39291E = this;
                }
                if (l1.j.f38901a) {
                    l1.j.b("new request, sending to network %s", str);
                }
                return false;
            }
            List list = (List) ((HashMap) this.f2802u).get(str);
            if (list == null) {
                list = new ArrayList();
            }
            c4729d.a("waiting-for-response");
            list.add(c4729d);
            ((HashMap) this.f2802u).put(str, list);
            if (l1.j.f38901a) {
                l1.j.b("Request for cacheKey=%s is in flight, putting on hold.", str);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void p(X.l lVar) {
        Object e9 = ((U7.c) this.f2804w).e(lVar);
        if (e9 instanceof U7.h) {
            Throwable b9 = U7.j.b(e9);
            if (b9 != null) {
                throw b9;
            }
            throw new U7.m("Channel was closed normally");
        }
        if (e9 instanceof U7.i) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.f2805x).getAndIncrement() == 0) {
            AbstractC0406y.o((InterfaceC0404w) this.f2802u, null, new X.i(this, null), 3);
        }
    }

    public synchronized void q(C4729d c4729d) {
        PriorityBlockingQueue priorityBlockingQueue;
        try {
            String str = c4729d.f39295u;
            List list = (List) ((HashMap) this.f2802u).remove(str);
            if (list != null && !list.isEmpty()) {
                if (l1.j.f38901a) {
                    l1.j.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), str);
                }
                C4729d c4729d2 = (C4729d) list.remove(0);
                ((HashMap) this.f2802u).put(str, list);
                synchronized (c4729d2.f39297w) {
                    c4729d2.f39291E = this;
                }
                if (((C4656b) this.f2804w) != null && (priorityBlockingQueue = (PriorityBlockingQueue) this.f2805x) != null) {
                    try {
                        priorityBlockingQueue.put(c4729d2);
                    } catch (InterruptedException e9) {
                        l1.j.c("Couldn't add request to queue. %s", e9.toString());
                        Thread.currentThread().interrupt();
                        C4656b c4656b = (C4656b) this.f2804w;
                        c4656b.f38886x = true;
                        c4656b.interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Bundle r(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f2804w;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public L2.o s(C3675oP c3675oP) {
        int i;
        String str;
        int i6 = c3675oP.f32897a;
        boolean z3 = i6 == 8;
        C4320g c4320g = (C4320g) this.f2804w;
        c4320g.f35677b.edit().putBoolean("is_pub_misconfigured", z3).commit();
        int i9 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        int i10 = 3;
        switch (i9) {
            case 1:
            case 2:
            case 3:
                i = 3;
                break;
            case 4:
                i = 2;
                break;
            case 5:
                i = 1;
                break;
            case 6:
                throw new C4341l0(1, "Invalid response from server: ".concat(String.valueOf((String) c3675oP.f32901e)));
            case 7:
                throw new C4341l0(3, "Publisher misconfiguration: ".concat(String.valueOf((String) c3675oP.f32901e)));
            default:
                throw new C4341l0(1, "Invalid response from server.");
        }
        int i11 = c3675oP.f32898b;
        int i12 = i11 - 1;
        if (i11 == 0) {
            throw null;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new C4341l0(1, "Invalid response from server.");
            }
            i10 = 2;
        }
        String str2 = (String) c3675oP.f32899c;
        C4352o c4352o = str2 == null ? null : new C4352o((String) c3675oP.f32900d, str2);
        ((C4387x) this.f2805x).f35782a.set((String) c3675oP.f32904h);
        c4320g.f35677b.edit().putStringSet("stored_info", new HashSet((List) c3675oP.f32902f)).commit();
        for (C4379v c4379v : (List) c3675oP.f32903g) {
            int i13 = c4379v.f35772b;
            int i14 = i13 - 1;
            if (i13 == 0) {
                throw null;
            }
            if (i14 == 0) {
                str = null;
            } else if (i14 == 1) {
                str = "write";
            } else {
                if (i14 != 2) {
                    throw new RuntimeException(null, null);
                }
                str = "clear";
            }
            if (str != null) {
                String str3 = c4379v.f35771a;
                D[] dArr = {(n) this.f2803v};
                O o6 = (O) this.f2802u;
                o6.getClass();
                o6.f35583a.execute(new y(11, str, str3, dArr));
            }
        }
        return new L2.o(i, i10, c4352o);
    }

    public String toString() {
        switch (this.f2801n) {
            case 8:
                String socket = ((Socket) this.f2802u).toString();
                kotlin.jvm.internal.h.d(socket, "toString(...)");
                return socket;
            default:
                return super.toString();
        }
    }

    public n(int i) {
        this.f2801n = i;
        switch (i) {
            case 3:
                this.f2802u = new ArrayList();
                this.f2803v = new HashMap();
                this.f2804w = new HashMap();
                break;
            case 7:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new L.j(1));
                this.f2803v = new HashMap();
                this.f2804w = new ReferenceQueue();
                this.f2802u = newSingleThreadExecutor;
                newSingleThreadExecutor.execute(new p3.b(11, this));
                break;
            default:
                this.f2802u = new s.b();
                this.f2803v = new SparseArray();
                this.f2804w = new s.e();
                this.f2805x = new s.b();
                break;
        }
    }

    public n(WorkDatabase_Impl workDatabase_Impl) {
        this.f2801n = 0;
        this.f2802u = workDatabase_Impl;
        this.f2803v = new b(workDatabase_Impl, 4);
        this.f2804w = new h(workDatabase_Impl, 2);
        this.f2805x = new h(workDatabase_Impl, 3);
    }

    public n(InterfaceC0404w interfaceC0404w, J0.l lVar, X.n nVar) {
        this.f2801n = 2;
        this.f2802u = interfaceC0404w;
        this.f2803v = nVar;
        this.f2804w = U7.j.a(Integer.MAX_VALUE, null, 6);
        this.f2805x = new AtomicInteger(0);
        Y y7 = (Y) interfaceC0404w.z().m(C0403v.f2998u);
        if (y7 == null) {
            return;
        }
        ((h0) y7).G(false, true, new T7.d(1, lVar, this));
    }

    public n(Socket socket) {
        this.f2801n = 8;
        this.f2802u = socket;
        this.f2803v = new AtomicInteger();
        this.f2804w = new z8.d(this);
        this.f2805x = new z8.c(this);
    }

    public n(C4656b c4656b, PriorityBlockingQueue priorityBlockingQueue, C4523c c4523c) {
        this.f2801n = 6;
        this.f2802u = new HashMap();
        this.f2803v = c4523c;
        this.f2804w = c4656b;
        this.f2805x = priorityBlockingQueue;
    }
}
