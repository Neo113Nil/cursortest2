package com.bumptech.glide.manager;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.A8;
import com.google.android.gms.internal.ads.C2951b;
import com.google.android.gms.internal.ads.C3058d;
import com.google.android.gms.internal.ads.C3327i;
import com.google.android.gms.internal.ads.C3500lC;
import com.google.android.gms.internal.ads.C3649o;
import com.google.android.gms.internal.ads.C3976u3;
import com.google.android.gms.internal.ads.InterfaceC3113e1;
import com.google.android.gms.internal.ads.InterfaceC3433k;
import com.google.android.gms.internal.ads.InterfaceC3543m1;
import com.google.android.gms.internal.ads.InterfaceC3814r3;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.MB;
import com.google.android.gms.internal.ads.PB;
import com.google.android.gms.internal.ads.RB;
import com.google.android.gms.internal.ads.S0;
import com.google.firebase.messaging.FirebaseMessaging;
import h4.C4572a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import l.C4648e;
import p.AbstractC4817g;
import p.AbstractC4818h;
import p.AbstractC4819i;
import p.BinderC4815e;

/* loaded from: classes.dex */
public final class o implements InterfaceC3433k, S0 {

    /* renamed from: n, reason: collision with root package name */
    public boolean f23463n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f23464u;

    /* renamed from: v, reason: collision with root package name */
    public Object f23465v;

    /* renamed from: w, reason: collision with root package name */
    public Object f23466w;

    public /* synthetic */ o(C3649o c3649o, C3327i c3327i, boolean z3, int[] iArr) {
        this.f23464u = c3649o;
        this.f23465v = c3327i;
        this.f23463n = z3;
        this.f23466w = iArr;
    }

    @Override // com.google.android.gms.internal.ads.S0
    public void B() {
        ((S0) this.f23464u).B();
        if (!this.f23463n) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.f23466w;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C3976u3) sparseArray.valueAt(i)).i = true;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.S0
    public InterfaceC3543m1 C(int i, int i6) {
        if (i6 != 3 && i6 != 5) {
            this.f23463n = true;
        }
        S0 s02 = (S0) this.f23464u;
        if (i6 != 3) {
            return s02.C(i, i6);
        }
        SparseArray sparseArray = (SparseArray) this.f23466w;
        C3976u3 c3976u3 = (C3976u3) sparseArray.get(i);
        if (c3976u3 != null) {
            return c3976u3;
        }
        C3976u3 c3976u32 = new C3976u3(s02.C(i, 3), (InterfaceC3814r3) this.f23465v);
        sparseArray.put(i, c3976u32);
        return c3976u32;
    }

    @Override // com.google.android.gms.internal.ads.S0
    public void D(InterfaceC3113e1 interfaceC3113e1) {
        ((S0) this.f23464u).D(interfaceC3113e1);
    }

    public void a() {
        q1.c.a((q1.c) this.f23466w, this, false);
    }

    public m8.i b() {
        Intent intent = (Intent) this.f23464u;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f23463n);
        Integer num = (Integer) ((C4648e) this.f23465v).f38761u;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        String a9 = AbstractC4818h.a();
        if (!TextUtils.isEmpty(a9)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a9);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i >= 34) {
            if (((ActivityOptions) this.f23466w) == null) {
                this.f23466w = AbstractC4817g.a();
            }
            AbstractC4819i.a((ActivityOptions) this.f23466w, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f23466w;
        return new m8.i(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public File c() {
        File file;
        synchronized (((q1.c) this.f23466w)) {
            try {
                q1.b bVar = (q1.b) this.f23464u;
                if (bVar.f39988f != this) {
                    throw new IllegalStateException();
                }
                if (!bVar.f39987e) {
                    ((boolean[]) this.f23465v)[0] = true;
                }
                file = bVar.f39986d[0];
                ((q1.c) this.f23466w).f39997n.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public int[] d() {
        synchronized (this) {
            try {
                if (!this.f23463n) {
                    return null;
                }
                long[] jArr = (long[]) this.f23464u;
                int length = jArr.length;
                int i = 0;
                int i6 = 0;
                while (i < length) {
                    int i9 = i6 + 1;
                    int i10 = 1;
                    boolean z3 = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.f23465v;
                    if (z3 != zArr[i6]) {
                        int[] iArr = (int[]) this.f23466w;
                        if (!z3) {
                            i10 = 2;
                        }
                        iArr[i6] = i10;
                    } else {
                        ((int[]) this.f23466w)[i6] = 0;
                    }
                    zArr[i6] = z3;
                    i++;
                    i6 = i9;
                }
                this.f23463n = false;
                return (int[]) ((int[]) this.f23466w).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean e() {
        boolean z3;
        boolean z6;
        try {
            synchronized (this) {
                try {
                    if (!this.f23463n) {
                        Boolean f3 = f();
                        this.f23465v = f3;
                        if (f3 == null) {
                            ((R3.l) ((Z3.b) this.f23464u)).a(new d4.f(10));
                        }
                        this.f23463n = true;
                    }
                } finally {
                }
            }
            return z6;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.f23465v;
        if (bool != null) {
            z6 = bool.booleanValue();
        } else {
            O3.g gVar = ((FirebaseMessaging) this.f23466w).f36193a;
            gVar.a();
            C4572a c4572a = (C4572a) gVar.f2351g.get();
            synchronized (c4572a) {
                z3 = c4572a.f38018a;
            }
            z6 = z3;
        }
        return z6;
    }

    public Boolean f() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        O3.g gVar = ((FirebaseMessaging) this.f23466w).f36193a;
        gVar.a();
        Context context = gVar.f2345a;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3433k
    public C3500lC t(int i, A8 a82, int[] iArr) {
        C3649o c3649o = (C3649o) this.f23464u;
        C3327i c3327i = (C3327i) this.f23465v;
        C3058d c3058d = new C3058d(c3649o, c3327i);
        int i6 = ((int[]) this.f23466w)[i];
        PB pb = RB.f27177u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i9 = 0;
        int i10 = 0;
        while (i9 < a82.f23635a) {
            int i11 = i;
            A8 a83 = a82;
            C2951b c2951b = new C2951b(i11, a83, i9, c3327i, iArr[i9], this.f23463n, c3058d);
            int length = objArr.length;
            int i12 = i10 + 1;
            int d2 = MB.d(length, i12);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i10] = c2951b;
            i9++;
            i10 = i12;
            i = i11;
            a82 = a83;
        }
        return RB.p(objArr, i10);
    }

    public /* synthetic */ o(Exception exc) {
        this.f23463n = false;
        this.f23464u = null;
        this.f23465v = null;
        this.f23466w = exc;
    }

    public /* synthetic */ o(Object obj, Object obj2) {
        this.f23463n = false;
        this.f23464u = obj;
        this.f23465v = obj2;
        this.f23466w = null;
    }

    public o(S0 s02, InterfaceC3814r3 interfaceC3814r3) {
        this.f23464u = s02;
        this.f23465v = interfaceC3814r3;
        this.f23466w = new SparseArray();
    }

    public o(byte[] bArr, Map map, List list, boolean z3) {
        this.f23464u = bArr;
        this.f23465v = map;
        if (list == null) {
            this.f23466w = null;
        } else {
            this.f23466w = Collections.unmodifiableList(list);
        }
        this.f23463n = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(byte[] bArr, boolean z3, List list) {
        this(bArr, (Map) r0, list, z3);
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l1.d dVar = (l1.d) it.next();
                treeMap.put(dVar.f38888a, dVar.f38889b);
            }
        }
    }

    public o(N1.h hVar, n nVar) {
        this.f23466w = new Q0.h(1, this);
        this.f23465v = hVar;
        this.f23464u = nVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(byte[] bArr, Map map) {
        this(bArr, map, (List) r0, false);
        ?? arrayList;
        if (map == null) {
            arrayList = 0;
        } else if (map.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new l1.d((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public o() {
        this.f23464u = new Intent("android.intent.action.VIEW");
        this.f23465v = new C4648e(4);
        this.f23463n = true;
    }

    public o(int i) {
        this.f23464u = new long[i];
        this.f23465v = new boolean[i];
        this.f23466w = new int[i];
    }

    public o(S0.i iVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f23464u = intent;
        this.f23465v = new C4648e(4);
        this.f23463n = true;
        if (iVar != null) {
            intent.setPackage(((ComponentName) iVar.f2791x).getPackageName());
            BinderC4815e binderC4815e = (BinderC4815e) iVar.f2790w;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC4815e);
            intent.putExtras(bundle);
        }
    }

    public o(FirebaseMessaging firebaseMessaging, Z3.b bVar) {
        this.f23466w = firebaseMessaging;
        this.f23464u = bVar;
    }

    public o(q1.c cVar, q1.b bVar) {
        this.f23466w = cVar;
        this.f23464u = bVar;
        this.f23465v = bVar.f39987e ? null : new boolean[cVar.f40003z];
    }
}
