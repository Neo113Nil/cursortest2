package S0;

import B2.z;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC0485s;
import androidx.fragment.app.N;
import androidx.fragment.app.S;
import androidx.fragment.app.V;
import androidx.work.impl.WorkDatabase_Impl;
import b6.C0530a;
import com.google.android.gms.internal.ads.BP;
import com.google.android.gms.internal.ads.C3905sa;
import com.google.android.gms.internal.consent_sdk.B;
import com.google.android.gms.internal.consent_sdk.C4321d;
import com.google.android.gms.internal.consent_sdk.C4333g;
import com.google.android.gms.internal.consent_sdk.C4354l0;
import com.google.android.gms.internal.consent_sdk.C4357m;
import com.google.android.gms.internal.consent_sdk.C4365o;
import com.google.android.gms.internal.consent_sdk.C4375q1;
import com.google.android.gms.internal.consent_sdk.C4392v;
import com.google.android.gms.internal.consent_sdk.C4400x;
import com.google.android.gms.internal.consent_sdk.C4408z;
import com.google.android.gms.internal.consent_sdk.D;
import com.google.android.gms.internal.consent_sdk.E;
import com.google.android.gms.internal.consent_sdk.O;
import com.icefishing.icefishingliveapp.SplashActivity;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONObject;
import t2.G;
import u0.C5098i;
import u8.v;
import u8.w;
import u8.x;

/* loaded from: classes.dex */
public final class i implements D, w {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2900n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2901u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f2902v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f2903w;

    /* renamed from: x, reason: collision with root package name */
    public Object f2904x;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2900n = i;
        this.f2901u = obj;
        this.f2902v = obj2;
        this.f2904x = obj4;
        this.f2903w = obj3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.D
    /* renamed from: a */
    public Executor mo10a() {
        return (B) this.f2904x;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032d  */
    @Override // com.google.android.gms.internal.consent_sdk.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(String str, JSONObject jSONObject) {
        char c4;
        HashMap hashMap;
        HashMap hashMap2;
        C4333g c4333g;
        boolean z8;
        char c9;
        String str2;
        String str3;
        String str4;
        Integer num;
        Object obj;
        Object obj2;
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                c4 = 0;
            }
            c4 = 65535;
        } else {
            if (str.equals("clear")) {
                c4 = 1;
            }
            c4 = 65535;
        }
        Application application = (Application) this.f2901u;
        if (c4 != 0) {
            if (c4 != 1) {
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
        C4408z c4408z = new C4408z(application);
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            boolean hasNext = keys.hasNext();
            hashMap = c4408z.f35962a;
            hashMap2 = c4408z.f35964c;
            c4333g = (C4333g) this.f2902v;
            if (!hasNext) {
                break;
            }
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(opt));
            Context context = c4408z.f35963b;
            C4357m a9 = E.a(context, next);
            if (a9 != null) {
                String str5 = (String) a9.f35879n;
                if (!hashMap2.containsKey(str5)) {
                    hashMap2.put(str5, context.getSharedPreferences(str5, 0).edit());
                }
                SharedPreferences.Editor editor = (SharedPreferences.Editor) hashMap2.get(str5);
                boolean z9 = opt instanceof Integer;
                String str6 = (String) a9.f35880u;
                if (z9) {
                    Integer num2 = (Integer) opt;
                    editor.putInt(str6, num2.intValue());
                    if (C4408z.f35961d.contains(str6)) {
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
                c4333g.f35841c.add(next);
            }
            Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
        }
        c4333g.f35840b.edit().putStringSet("written_values", c4333g.f35841c).commit();
        Iterator it = hashMap2.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).commit();
        }
        if (hashMap.size() <= 1) {
            return true;
        }
        C4375q1 c4375q1 = (C4375q1) this.f2903w;
        C4321d c4321d = c4375q1.f35903a;
        AtomicReference atomicReference = c4321d.f35826g;
        Object obj3 = atomicReference.get();
        AtomicReference atomicReference2 = c4321d.f35824e;
        AtomicReference atomicReference3 = c4321d.f35823d;
        AtomicReference atomicReference4 = c4321d.f35822c;
        AtomicReference atomicReference5 = c4321d.f35821b;
        if (obj3 != null) {
            z8 = ((Boolean) atomicReference.get()).booleanValue();
        } else {
            Context context2 = c4321d.f35820a;
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
                    z8 = true;
                } catch (Exception e6) {
                    Log.w("UserMessagingPlatform", "No Firebase class found. ", e6);
                    atomicReference.set(Boolean.FALSE);
                }
            }
            z8 = false;
        }
        if (z8) {
            Context context3 = c4375q1.f35904b;
            AtomicReference atomicReference6 = c4321d.f35825f;
            if (atomicReference6.get() == null) {
                try {
                    atomicReference6.set(U2.c.a(context3).c(128, context3.getPackageName()).metaData);
                } catch (PackageManager.NameNotFoundException | NullPointerException e9) {
                    Log.w("UserMessagingPlatform", "Failed to get metadata. ", e9);
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
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -142866440:
                            if (str8.equals("UMP_CoMoAnalyticsStoragePurposeConsentStatus")) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1068702385:
                            if (str8.equals("UMP_CoMoAdStoragePurposeConsentStatus")) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1479307131:
                            if (str8.equals("UMP_CoMoAdUserDataPurposeConsentStatus")) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    if (c9 == 0) {
                        str2 = "google_analytics_default_allow_ad_storage";
                        str3 = "AD_STORAGE";
                    } else if (c9 == 1) {
                        str2 = "google_analytics_default_allow_ad_user_data";
                        str3 = "AD_USER_DATA";
                    } else if (c9 == 2) {
                        str2 = "google_analytics_default_allow_ad_personalization_signals";
                        str3 = "AD_PERSONALIZATION";
                    } else if (c9 == 3) {
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
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    hashMap4.put((Enum) ((Method) atomicReference2.get()).invoke(null, str9), (Enum) ((Method) atomicReference3.get()).invoke(null, hashMap3.get(str9)));
                } catch (Exception e11) {
                    e = e11;
                    Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e);
                }
            }
            if (atomicReference4.get() != null && !hashMap4.isEmpty()) {
                try {
                    ((Method) atomicReference4.get()).invoke(atomicReference5.get(), hashMap4);
                } catch (Exception e12) {
                    Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e12);
                }
            }
        }
        hashMap.clear();
        return true;
    }

    @Override // u8.w
    public x c() {
        return (v8.d) this.f2903w;
    }

    public void d(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (((ArrayList) this.f2901u).contains(abstractComponentCallbacksC0485s)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0485s);
        }
        synchronized (((ArrayList) this.f2901u)) {
            ((ArrayList) this.f2901u).add(abstractComponentCallbacksC0485s);
        }
        abstractComponentCallbacksC0485s.f5143D = true;
    }

    public void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((s.k) this.f2902v).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0485s f(String str) {
        V v6 = (V) ((HashMap) this.f2902v).get(str);
        if (v6 != null) {
            return v6.f5019c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0485s g(String str) {
        for (V v6 : ((HashMap) this.f2902v).values()) {
            if (v6 != null) {
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = v6.f5019c;
                if (!str.equals(abstractComponentCallbacksC0485s.f5178x)) {
                    abstractComponentCallbacksC0485s = abstractComponentCallbacksC0485s.f5151M.f4964c.g(str);
                }
                if (abstractComponentCallbacksC0485s != null) {
                    return abstractComponentCallbacksC0485s;
                }
            }
        }
        return null;
    }

    public Object h(final C0530a c0530a, String str) {
        return ((ConcurrentHashMap) this.f2901u).computeIfAbsent(str, new Function() { // from class: W6.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                S0.i iVar = S0.i.this;
                iVar.getClass();
                int i = U6.a.f3300e;
                C0530a c0530a2 = c0530a;
                if (c0530a2 == null) {
                    c0530a2 = C0530a.f5557w;
                }
                Object apply = ((Function) iVar.f2904x).apply(U6.a.a(str2, null, null, c0530a2));
                synchronized (iVar.f2902v) {
                    ((Set) iVar.f2903w).add(apply);
                }
                return apply;
            }
        });
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (V v6 : ((HashMap) this.f2902v).values()) {
            if (v6 != null) {
                arrayList.add(v6);
            }
        }
        return arrayList;
    }

    @Override // u8.w
    public v j() {
        return (v8.c) this.f2904x;
    }

    public ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (V v6 : ((HashMap) this.f2902v).values()) {
            if (v6 != null) {
                arrayList.add(v6.f5019c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList;
        if (((ArrayList) this.f2901u).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f2901u)) {
            arrayList = new ArrayList((ArrayList) this.f2901u);
        }
        return arrayList;
    }

    public g m(j jVar) {
        C5098i a9 = C5098i.a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = jVar.f2905a;
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        a9.h(2, jVar.f2906b);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2901u;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            int g9 = com.bumptech.glide.f.g(m8, "work_spec_id");
            int g10 = com.bumptech.glide.f.g(m8, "generation");
            int g11 = com.bumptech.glide.f.g(m8, "system_id");
            g gVar = null;
            String string = null;
            if (m8.moveToFirst()) {
                if (!m8.isNull(g9)) {
                    string = m8.getString(g9);
                }
                gVar = new g(string, m8.getInt(g10), m8.getInt(g11));
            }
            return gVar;
        } finally {
            m8.close();
            a9.j();
        }
    }

    public void n(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2901u;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f2902v).q(gVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    public void o(V v6) {
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = v6.f5019c;
        String str = abstractComponentCallbacksC0485s.f5178x;
        HashMap hashMap = (HashMap) this.f2902v;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0485s.f5178x, v6);
        if (N.E(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0485s);
        }
    }

    public void p(V v6) {
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = v6.f5019c;
        if (abstractComponentCallbacksC0485s.f5158T) {
            ((S) this.f2904x).d(abstractComponentCallbacksC0485s);
        }
        HashMap hashMap = (HashMap) this.f2902v;
        if (hashMap.get(abstractComponentCallbacksC0485s.f5178x) == v6 && ((V) hashMap.put(abstractComponentCallbacksC0485s.f5178x, null)) != null && N.E(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0485s);
        }
    }

    public Bundle q(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f2903w;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public K2.o r(BP bp) {
        int i;
        String str;
        int i4 = bp.f24035a;
        boolean z8 = i4 == 8;
        C4333g c4333g = (C4333g) this.f2903w;
        c4333g.f35840b.edit().putBoolean("is_pub_misconfigured", z8).commit();
        int i9 = i4 - 1;
        if (i4 == 0) {
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
                throw new C4354l0(1, "Invalid response from server: ".concat(String.valueOf((String) bp.f24039e)));
            case 7:
                throw new C4354l0(3, "Publisher misconfiguration: ".concat(String.valueOf((String) bp.f24039e)));
            default:
                throw new C4354l0(1, "Invalid response from server.");
        }
        int i11 = bp.f24036b;
        int i12 = i11 - 1;
        if (i11 == 0) {
            throw null;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new C4354l0(1, "Invalid response from server.");
            }
            i10 = 2;
        }
        String str2 = (String) bp.f24037c;
        C4365o c4365o = str2 == null ? null : new C4365o((String) bp.f24038d, str2);
        ((C4400x) this.f2904x).f35945a.set((String) bp.f24042h);
        c4333g.f35840b.edit().putStringSet("stored_info", new HashSet((List) bp.f24040f)).commit();
        for (C4392v c4392v : (List) bp.f24041g) {
            int i13 = c4392v.f35935b;
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
                String str3 = c4392v.f35934a;
                D[] dArr = {(i) this.f2902v};
                O o9 = (O) this.f2901u;
                o9.getClass();
                o9.f35746a.execute(new z(str, str3, dArr, 9));
            }
        }
        return new K2.o(i, i10, c4365o);
    }

    public String toString() {
        switch (this.f2900n) {
            case 8:
                String socket = ((Socket) this.f2901u).toString();
                kotlin.jvm.internal.h.d(socket, "toString(...)");
                return socket;
            default:
                return super.toString();
        }
    }

    public i(G g9, C3905sa c3905sa, Bundle bundle, Context context, Uri uri) {
        this.f2900n = 7;
        this.f2901u = c3905sa;
        this.f2902v = bundle;
        this.f2903w = context;
        this.f2904x = uri;
        Objects.requireNonNull(g9);
    }

    public i(WorkDatabase_Impl workDatabase_Impl) {
        this.f2900n = 0;
        this.f2901u = workDatabase_Impl;
        this.f2902v = new b(workDatabase_Impl, 2);
        this.f2903w = new h(workDatabase_Impl, 0);
        this.f2904x = new h(workDatabase_Impl, 1);
    }

    public i(Socket socket) {
        this.f2900n = 8;
        this.f2901u = socket;
        this.f2902v = new AtomicInteger();
        this.f2903w = new v8.d(this);
        this.f2904x = new v8.c(this);
    }

    public i(int i) {
        this.f2900n = i;
        switch (i) {
            case 3:
                this.f2901u = new ArrayList();
                this.f2902v = new HashMap();
                this.f2903w = new HashMap();
                break;
            default:
                this.f2901u = new N.c(10);
                this.f2902v = new s.k();
                this.f2903w = new ArrayList();
                this.f2904x = new HashSet();
                break;
        }
    }

    public i(SplashActivity splashActivity, h4.c cVar, SplashActivity splashActivity2, h4.c cVar2) {
        this.f2900n = 6;
        this.f2904x = splashActivity;
        this.f2901u = cVar;
        this.f2902v = splashActivity2;
        this.f2903w = cVar2;
    }

    public i(Function function) {
        this.f2900n = 2;
        this.f2901u = new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.f2902v = new Object();
        this.f2903w = Collections.newSetFromMap(new IdentityHashMap());
        this.f2904x = function;
    }
}
