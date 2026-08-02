package S0;

import S7.AbstractC0410y;
import S7.C0407v;
import S7.InterfaceC0408w;
import S7.Y;
import S7.h0;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.emoji2.text.u;
import androidx.work.impl.WorkDatabase_Impl;
import b0.C0515a;
import b0.C0516b;
import com.google.android.gms.internal.ads.C3698oP;
import com.google.android.gms.internal.consent_sdk.B;
import com.google.android.gms.internal.consent_sdk.C4331d;
import com.google.android.gms.internal.consent_sdk.C4343g;
import com.google.android.gms.internal.consent_sdk.C4364l0;
import com.google.android.gms.internal.consent_sdk.C4367m;
import com.google.android.gms.internal.consent_sdk.C4375o;
import com.google.android.gms.internal.consent_sdk.C4385q1;
import com.google.android.gms.internal.consent_sdk.C4402v;
import com.google.android.gms.internal.consent_sdk.C4410x;
import com.google.android.gms.internal.consent_sdk.C4418z;
import com.google.android.gms.internal.consent_sdk.D;
import com.google.android.gms.internal.consent_sdk.E;
import com.google.android.gms.internal.consent_sdk.O;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k.AbstractC4625b;
import k.C4629f;
import k.InterfaceC4624a;
import l.MenuC4651B;
import l.t;
import org.json.JSONArray;
import org.json.JSONObject;
import w1.C5133a;
import y8.v;
import y8.w;
import y8.x;

/* loaded from: classes.dex */
public final class n implements D, InterfaceC4624a, w {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2930n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2931u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f2932v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f2933w;

    /* renamed from: x, reason: collision with root package name */
    public Object f2934x;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2930n = i;
        this.f2931u = obj;
        this.f2932v = obj2;
        this.f2934x = obj4;
        this.f2933w = obj3;
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
        C4343g c4343g;
        boolean z6;
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
        Application application = (Application) this.f2931u;
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
        C4418z c4418z = new C4418z(application);
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            boolean hasNext = keys.hasNext();
            hashMap = c4418z.f36568a;
            hashMap2 = c4418z.f36570c;
            c4343g = (C4343g) this.f2932v;
            if (!hasNext) {
                break;
            }
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(opt));
            Context context = c4418z.f36569b;
            C4367m a9 = E.a(context, next);
            if (a9 != null) {
                String str5 = (String) a9.f36485n;
                if (!hashMap2.containsKey(str5)) {
                    hashMap2.put(str5, context.getSharedPreferences(str5, 0).edit());
                }
                SharedPreferences.Editor editor = (SharedPreferences.Editor) hashMap2.get(str5);
                boolean z9 = opt instanceof Integer;
                String str6 = (String) a9.f36486u;
                if (z9) {
                    Integer num2 = (Integer) opt;
                    editor.putInt(str6, num2.intValue());
                    if (C4418z.f36567d.contains(str6)) {
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
                c4343g.f36447c.add(next);
            }
            Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
        }
        c4343g.f36446b.edit().putStringSet("written_values", c4343g.f36447c).commit();
        Iterator it = hashMap2.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).commit();
        }
        if (hashMap.size() <= 1) {
            return true;
        }
        C4385q1 c4385q1 = (C4385q1) this.f2933w;
        C4331d c4331d = c4385q1.f36509a;
        AtomicReference atomicReference = c4331d.f36432g;
        Object obj3 = atomicReference.get();
        AtomicReference atomicReference2 = c4331d.f36430e;
        AtomicReference atomicReference3 = c4331d.f36429d;
        AtomicReference atomicReference4 = c4331d.f36428c;
        AtomicReference atomicReference5 = c4331d.f36427b;
        if (obj3 != null) {
            z6 = ((Boolean) atomicReference.get()).booleanValue();
        } else {
            Context context2 = c4331d.f36426a;
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
                    z6 = true;
                } catch (Exception e9) {
                    Log.w("UserMessagingPlatform", "No Firebase class found. ", e9);
                    atomicReference.set(Boolean.FALSE);
                }
            }
            z6 = false;
        }
        if (z6) {
            Context context3 = c4385q1.f36510b;
            AtomicReference atomicReference6 = c4331d.f36431f;
            if (atomicReference6.get() == null) {
                try {
                    atomicReference6.set(X2.b.a(context3).f(128, context3.getPackageName()).metaData);
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

    @Override // k.InterfaceC4624a
    public boolean b(AbstractC4625b abstractC4625b, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f2931u).onActionItemClicked(k(abstractC4625b), new t((Context) this.f2932v, (I.a) menuItem));
    }

    @Override // com.google.android.gms.internal.consent_sdk.D
    /* renamed from: c */
    public Executor mo4c() {
        return (B) this.f2934x;
    }

    @Override // y8.w
    public x d() {
        return (z8.d) this.f2933w;
    }

    @Override // k.InterfaceC4624a
    public boolean e(AbstractC4625b abstractC4625b, l.m mVar) {
        C4629f k9 = k(abstractC4625b);
        s.k kVar = (s.k) this.f2934x;
        Menu menu = (Menu) kVar.getOrDefault(mVar, null);
        if (menu == null) {
            menu = new MenuC4651B((Context) this.f2932v, mVar);
            kVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) this.f2931u).onPrepareActionMode(k9, menu);
    }

    @Override // k.InterfaceC4624a
    public boolean f(AbstractC4625b abstractC4625b, l.m mVar) {
        C4629f k9 = k(abstractC4625b);
        s.k kVar = (s.k) this.f2934x;
        Menu menu = (Menu) kVar.getOrDefault(mVar, null);
        if (menu == null) {
            menu = new MenuC4651B((Context) this.f2932v, mVar);
            kVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) this.f2931u).onCreateActionMode(k9, menu);
    }

    @Override // y8.w
    public v g() {
        return (z8.c) this.f2934x;
    }

    @Override // k.InterfaceC4624a
    public void h(AbstractC4625b abstractC4625b) {
        ((ActionMode.Callback) this.f2931u).onDestroyActionMode(k(abstractC4625b));
    }

    public synchronized void i(w1.p pVar, w1.q qVar) {
        C5133a c5133a = (C5133a) ((HashMap) this.f2932v).put(pVar, new C5133a(pVar, qVar, (ReferenceQueue) this.f2933w));
        if (c5133a != null) {
            c5133a.f41430c = null;
            c5133a.clear();
        }
    }

    public void j(C5133a c5133a) {
        w1.w wVar;
        synchronized (this) {
            ((HashMap) this.f2932v).remove(c5133a.f41428a);
            if (c5133a.f41429b && (wVar = c5133a.f41430c) != null) {
                ((w1.k) this.f2934x).e(c5133a.f41428a, new w1.q(wVar, true, false, c5133a.f41428a, (w1.k) this.f2934x));
            }
        }
    }

    public C4629f k(AbstractC4625b abstractC4625b) {
        ArrayList arrayList = (ArrayList) this.f2933w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4629f c4629f = (C4629f) arrayList.get(i);
            if (c4629f != null && c4629f.f38512b == abstractC4625b) {
                return c4629f;
            }
        }
        C4629f c4629f2 = new C4629f((Context) this.f2932v, abstractC4625b);
        arrayList.add(c4629f2);
        return c4629f2;
    }

    public void l(X.l lVar) {
        Object e9 = ((U7.c) this.f2933w).e(lVar);
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
        if (((AtomicInteger) this.f2934x).getAndIncrement() == 0) {
            AbstractC0410y.o((InterfaceC0408w) this.f2931u, null, new X.i(this, null), 3);
        }
    }

    public N2.p m(C3698oP c3698oP) {
        int i;
        String str;
        int i4 = c3698oP.f33684a;
        boolean z6 = i4 == 8;
        C4343g c4343g = (C4343g) this.f2933w;
        c4343g.f36446b.edit().putBoolean("is_pub_misconfigured", z6).commit();
        int i6 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        int i9 = 3;
        switch (i6) {
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
                throw new C4364l0(1, "Invalid response from server: ".concat(String.valueOf((String) c3698oP.f33688e)));
            case 7:
                throw new C4364l0(3, "Publisher misconfiguration: ".concat(String.valueOf((String) c3698oP.f33688e)));
            default:
                throw new C4364l0(1, "Invalid response from server.");
        }
        int i10 = c3698oP.f33685b;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new C4364l0(1, "Invalid response from server.");
            }
            i9 = 2;
        }
        String str2 = (String) c3698oP.f33686c;
        C4375o c4375o = str2 == null ? null : new C4375o((String) c3698oP.f33687d, str2);
        ((C4410x) this.f2934x).f36551a.set((String) c3698oP.f33691h);
        c4343g.f36446b.edit().putStringSet("stored_info", new HashSet((List) c3698oP.f33689f)).commit();
        for (C4402v c4402v : (List) c3698oP.f33690g) {
            int i12 = c4402v.f36541b;
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == 0) {
                str = null;
            } else if (i13 == 1) {
                str = "write";
            } else {
                if (i13 != 2) {
                    throw new RuntimeException(null, null);
                }
                str = "clear";
            }
            if (str != null) {
                String str3 = c4402v.f36540a;
                D[] dArr = {(n) this.f2932v};
                O o4 = (O) this.f2931u;
                o4.getClass();
                o4.f36352a.execute(new E2.x(11, str, str3, dArr));
            }
        }
        return new N2.p(i, i9, c4375o);
    }

    public String toString() {
        switch (this.f2930n) {
            case 8:
                String socket = ((Socket) this.f2931u).toString();
                kotlin.jvm.internal.h.d(socket, "toString(...)");
                return socket;
            default:
                return super.toString();
        }
    }

    public n(int i) {
        this.f2930n = i;
        switch (i) {
            case 7:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new L.j(1));
                this.f2932v = new HashMap();
                this.f2933w = new ReferenceQueue();
                this.f2931u = newSingleThreadExecutor;
                newSingleThreadExecutor.execute(new r3.b(11, this));
                break;
            default:
                this.f2931u = new s.b();
                this.f2932v = new SparseArray();
                this.f2933w = new s.e();
                this.f2934x = new s.b();
                break;
        }
    }

    public n(WorkDatabase_Impl workDatabase_Impl) {
        this.f2930n = 0;
        this.f2931u = workDatabase_Impl;
        this.f2932v = new b(workDatabase_Impl, 4);
        this.f2933w = new h(workDatabase_Impl, 2);
        this.f2934x = new h(workDatabase_Impl, 3);
    }

    public n(InterfaceC0408w interfaceC0408w, J0.k kVar, X.n nVar) {
        this.f2930n = 2;
        this.f2931u = interfaceC0408w;
        this.f2932v = nVar;
        this.f2933w = U7.j.a(Integer.MAX_VALUE, null, 6);
        this.f2934x = new AtomicInteger(0);
        Y y7 = (Y) interfaceC0408w.z().m(C0407v.f3081u);
        if (y7 == null) {
            return;
        }
        ((h0) y7).G(false, true, new T7.d(1, kVar, this));
    }

    public n(Socket socket) {
        this.f2930n = 8;
        this.f2931u = socket;
        this.f2932v = new AtomicInteger();
        this.f2933w = new z8.d(this);
        this.f2934x = new z8.c(this);
    }

    public n(Typeface typeface, C0516b c0516b) {
        int i;
        int i4;
        int i6;
        int i9;
        this.f2930n = 3;
        this.f2934x = typeface;
        this.f2931u = c0516b;
        this.f2933w = new androidx.emoji2.text.r(1024);
        int a9 = c0516b.a(6);
        if (a9 != 0) {
            int i10 = a9 + c0516b.f2130n;
            i = ((ByteBuffer) c0516b.f2133w).getInt(((ByteBuffer) c0516b.f2133w).getInt(i10) + i10);
        } else {
            i = 0;
        }
        this.f2932v = new char[i * 2];
        int a10 = c0516b.a(6);
        if (a10 != 0) {
            int i11 = a10 + c0516b.f2130n;
            i4 = ((ByteBuffer) c0516b.f2133w).getInt(((ByteBuffer) c0516b.f2133w).getInt(i11) + i11);
        } else {
            i4 = 0;
        }
        for (int i12 = 0; i12 < i4; i12++) {
            u uVar = new u(this, i12);
            C0515a b9 = uVar.b();
            int a11 = b9.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b9.f2133w).getInt(a11 + b9.f2130n) : 0, (char[]) this.f2932v, i12 * 2);
            C0515a b10 = uVar.b();
            int a12 = b10.a(16);
            if (a12 != 0) {
                int i13 = a12 + b10.f2130n;
                i6 = ((ByteBuffer) b10.f2133w).getInt(((ByteBuffer) b10.f2133w).getInt(i13) + i13);
            } else {
                i6 = 0;
            }
            A8.b.c("invalid metadata codepoint length", i6 > 0);
            C0515a b11 = uVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i14 = a13 + b11.f2130n;
                i9 = ((ByteBuffer) b11.f2133w).getInt(((ByteBuffer) b11.f2133w).getInt(i14) + i14);
            } else {
                i9 = 0;
            }
            ((androidx.emoji2.text.r) this.f2933w).a(uVar, 0, i9 - 1);
        }
    }

    public n(Context context, ActionMode.Callback callback) {
        this.f2930n = 6;
        this.f2932v = context;
        this.f2931u = callback;
        this.f2933w = new ArrayList();
        this.f2934x = new s.k();
    }
}
