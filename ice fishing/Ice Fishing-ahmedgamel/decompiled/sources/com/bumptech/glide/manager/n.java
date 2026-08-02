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
import b4.InterfaceC0525b;
import com.anythink.core.common.n.b.A;
import com.google.android.gms.internal.ads.A8;
import com.google.android.gms.internal.ads.C2974b;
import com.google.android.gms.internal.ads.C3081d;
import com.google.android.gms.internal.ads.C3350i;
import com.google.android.gms.internal.ads.C3523lC;
import com.google.android.gms.internal.ads.C3672o;
import com.google.android.gms.internal.ads.C3999u3;
import com.google.android.gms.internal.ads.InterfaceC3136e1;
import com.google.android.gms.internal.ads.InterfaceC3456k;
import com.google.android.gms.internal.ads.InterfaceC3566m1;
import com.google.android.gms.internal.ads.InterfaceC3837r3;
import com.google.android.gms.internal.ads.LP;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.MB;
import com.google.android.gms.internal.ads.PB;
import com.google.android.gms.internal.ads.RB;
import com.google.android.gms.internal.ads.S0;
import com.google.firebase.messaging.FirebaseMessaging;
import i1.C4586c;
import j4.C4620a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p.AbstractC4821g;
import p.AbstractC4822h;
import p.AbstractC4823i;
import p.BinderC4819e;

/* loaded from: classes.dex */
public final class n implements InterfaceC3456k, S0 {

    /* renamed from: n, reason: collision with root package name */
    public boolean f24248n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f24249u;

    /* renamed from: v, reason: collision with root package name */
    public Object f24250v;

    /* renamed from: w, reason: collision with root package name */
    public Object f24251w;

    public /* synthetic */ n(C3672o c3672o, C3350i c3350i, boolean z6, int[] iArr) {
        this.f24249u = c3672o;
        this.f24250v = c3350i;
        this.f24248n = z6;
        this.f24251w = iArr;
    }

    @Override // com.google.android.gms.internal.ads.S0
    public void B() {
        ((S0) this.f24249u).B();
        if (!this.f24248n) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.f24251w;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C3999u3) sparseArray.valueAt(i)).i = true;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.S0
    public InterfaceC3566m1 C(int i, int i4) {
        if (i4 != 3 && i4 != 5) {
            this.f24248n = true;
        }
        S0 s02 = (S0) this.f24249u;
        if (i4 != 3) {
            return s02.C(i, i4);
        }
        SparseArray sparseArray = (SparseArray) this.f24251w;
        C3999u3 c3999u3 = (C3999u3) sparseArray.get(i);
        if (c3999u3 != null) {
            return c3999u3;
        }
        C3999u3 c3999u32 = new C3999u3(s02.C(i, 3), (InterfaceC3837r3) this.f24250v);
        sparseArray.put(i, c3999u32);
        return c3999u32;
    }

    @Override // com.google.android.gms.internal.ads.S0
    public void D(InterfaceC3136e1 interfaceC3136e1) {
        ((S0) this.f24249u).D(interfaceC3136e1);
    }

    public void a() {
        s1.c.a((s1.c) this.f24251w, this, false);
    }

    public LP b() {
        Intent intent = (Intent) this.f24249u;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f24248n);
        Integer num = (Integer) ((C4586c) this.f24250v).f38154u;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        String a9 = AbstractC4822h.a();
        if (!TextUtils.isEmpty(a9)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a9);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i >= 34) {
            if (((ActivityOptions) this.f24251w) == null) {
                this.f24251w = AbstractC4821g.a();
            }
            AbstractC4823i.a((ActivityOptions) this.f24251w, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f24251w;
        return new LP(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public File c() {
        File file;
        synchronized (((s1.c) this.f24251w)) {
            try {
                s1.b bVar = (s1.b) this.f24249u;
                if (bVar.f40287f != this) {
                    throw new IllegalStateException();
                }
                if (!bVar.f40286e) {
                    ((boolean[]) this.f24250v)[0] = true;
                }
                file = bVar.f40285d[0];
                ((s1.c) this.f24251w).f40296n.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public int[] d() {
        synchronized (this) {
            try {
                if (!this.f24248n) {
                    return null;
                }
                long[] jArr = (long[]) this.f24249u;
                int length = jArr.length;
                int i = 0;
                int i4 = 0;
                while (i < length) {
                    int i6 = i4 + 1;
                    int i9 = 1;
                    boolean z6 = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.f24250v;
                    if (z6 != zArr[i4]) {
                        int[] iArr = (int[]) this.f24251w;
                        if (!z6) {
                            i9 = 2;
                        }
                        iArr[i4] = i9;
                    } else {
                        ((int[]) this.f24251w)[i4] = 0;
                    }
                    zArr[i4] = z6;
                    i++;
                    i4 = i6;
                }
                this.f24248n = false;
                return (int[]) ((int[]) this.f24251w).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean e() {
        boolean z6;
        boolean z9;
        try {
            synchronized (this) {
                try {
                    if (!this.f24248n) {
                        Boolean f2 = f();
                        this.f24250v = f2;
                        if (f2 == null) {
                            ((T3.l) ((InterfaceC0525b) this.f24249u)).a(new A(12));
                        }
                        this.f24248n = true;
                    }
                } finally {
                }
            }
            return z9;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.f24250v;
        if (bool != null) {
            z9 = bool.booleanValue();
        } else {
            Q3.g gVar = ((FirebaseMessaging) this.f24251w).f36960a;
            gVar.a();
            C4620a c4620a = (C4620a) gVar.f2667g.get();
            synchronized (c4620a) {
                z6 = c4620a.f38487a;
            }
            z9 = z6;
        }
        return z9;
    }

    public Boolean f() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Q3.g gVar = ((FirebaseMessaging) this.f24251w).f36960a;
        gVar.a();
        Context context = gVar.f2661a;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3456k
    public C3523lC t(int i, A8 a82, int[] iArr) {
        C3672o c3672o = (C3672o) this.f24249u;
        C3350i c3350i = (C3350i) this.f24250v;
        C3081d c3081d = new C3081d(c3672o, c3350i);
        int i4 = ((int[]) this.f24251w)[i];
        PB pb = RB.f27933u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i6 = 0;
        int i9 = 0;
        while (i6 < a82.f24415a) {
            int i10 = i;
            A8 a83 = a82;
            C2974b c2974b = new C2974b(i10, a83, i6, c3350i, iArr[i6], this.f24248n, c3081d);
            int length = objArr.length;
            int i11 = i9 + 1;
            int d9 = MB.d(length, i11);
            if (d9 > length) {
                objArr = Arrays.copyOf(objArr, d9);
            }
            objArr[i9] = c2974b;
            i6++;
            i9 = i11;
            i = i10;
            a82 = a83;
        }
        return RB.p(objArr, i9);
    }

    public /* synthetic */ n(Exception exc) {
        this.f24248n = false;
        this.f24249u = null;
        this.f24250v = null;
        this.f24251w = exc;
    }

    public /* synthetic */ n(Object obj, Object obj2) {
        this.f24248n = false;
        this.f24249u = obj;
        this.f24250v = obj2;
        this.f24251w = null;
    }

    public n(S0 s02, InterfaceC3837r3 interfaceC3837r3) {
        this.f24249u = s02;
        this.f24250v = interfaceC3837r3;
        this.f24251w = new SparseArray();
    }

    public n(byte[] bArr, Map map, List list, boolean z6) {
        this.f24249u = bArr;
        this.f24250v = map;
        if (list == null) {
            this.f24251w = null;
        } else {
            this.f24251w = Collections.unmodifiableList(list);
        }
        this.f24248n = z6;
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
    public n(byte[] bArr, boolean z6, List list) {
        this(bArr, (Map) r0, list, z6);
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n1.d dVar = (n1.d) it.next();
                treeMap.put(dVar.f39626a, dVar.f39627b);
            }
        }
    }

    public n(P1.h hVar, m mVar) {
        this.f24251w = new Q0.h(1, this);
        this.f24250v = hVar;
        this.f24249u = mVar;
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
    public n(byte[] bArr, Map map) {
        this(bArr, map, (List) r0, false);
        ?? arrayList;
        if (map == null) {
            arrayList = 0;
        } else if (map.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new n1.d((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public n() {
        this.f24249u = new Intent("android.intent.action.VIEW");
        this.f24250v = new C4586c(29, false);
        this.f24248n = true;
    }

    public n(int i) {
        this.f24249u = new long[i];
        this.f24250v = new boolean[i];
        this.f24251w = new int[i];
    }

    public n(S0.i iVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f24249u = intent;
        this.f24250v = new C4586c(29, false);
        this.f24248n = true;
        if (iVar != null) {
            intent.setPackage(((ComponentName) iVar.f2920x).getPackageName());
            BinderC4819e binderC4819e = (BinderC4819e) iVar.f2919w;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC4819e);
            intent.putExtras(bundle);
        }
    }

    public n(FirebaseMessaging firebaseMessaging, InterfaceC0525b interfaceC0525b) {
        this.f24251w = firebaseMessaging;
        this.f24249u = interfaceC0525b;
    }

    public n(s1.c cVar, s1.b bVar) {
        this.f24251w = cVar;
        this.f24249u = bVar;
        this.f24250v = bVar.f40286e ? null : new boolean[cVar.f40302z];
    }
}
