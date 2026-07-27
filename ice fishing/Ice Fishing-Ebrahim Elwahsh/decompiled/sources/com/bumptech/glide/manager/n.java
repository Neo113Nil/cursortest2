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
import com.anythink.core.common.n.b.A;
import com.google.android.gms.internal.ads.AbstractC2720Pd;
import com.google.android.gms.internal.ads.B8;
import com.google.android.gms.internal.ads.C3013c;
import com.google.android.gms.internal.ads.C3205fR;
import com.google.android.gms.internal.ads.C3286h;
import com.google.android.gms.internal.ads.C3554m;
import com.google.android.gms.internal.ads.C3675oC;
import com.google.android.gms.internal.ads.C3827r3;
import com.google.android.gms.internal.ads.InterfaceC3015c1;
import com.google.android.gms.internal.ads.InterfaceC3392j;
import com.google.android.gms.internal.ads.InterfaceC3448k1;
import com.google.android.gms.internal.ads.InterfaceC3720p3;
import com.google.android.gms.internal.ads.PB;
import com.google.android.gms.internal.ads.Q0;
import com.google.android.gms.internal.ads.SB;
import com.google.android.gms.internal.ads.UB;
import com.google.firebase.messaging.FirebaseMessaging;
import d4.C4458a;
import g1.C4523c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p.AbstractC4847g;
import p.AbstractC4848h;
import p.AbstractC4849i;
import p.BinderC4845e;

/* loaded from: classes.dex */
public final class n implements InterfaceC3392j, Q0 {

    /* renamed from: n, reason: collision with root package name */
    public boolean f23617n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f23618u;

    /* renamed from: v, reason: collision with root package name */
    public Object f23619v;

    /* renamed from: w, reason: collision with root package name */
    public Object f23620w;

    public /* synthetic */ n(C3554m c3554m, C3286h c3286h, boolean z8, int[] iArr) {
        this.f23618u = c3554m;
        this.f23619v = c3286h;
        this.f23617n = z8;
        this.f23620w = iArr;
    }

    public void a() {
        q1.c.a((q1.c) this.f23620w, this, false);
    }

    public S0.l b() {
        Intent intent = (Intent) this.f23618u;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f23617n);
        Integer num = (Integer) ((C4523c) this.f23619v).f37856u;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        String a9 = AbstractC4848h.a();
        if (!TextUtils.isEmpty(a9)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a9);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i >= 34) {
            if (((ActivityOptions) this.f23620w) == null) {
                this.f23620w = AbstractC4847g.a();
            }
            AbstractC4849i.a((ActivityOptions) this.f23620w, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f23620w;
        return new S0.l(15, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public File c() {
        File file;
        synchronized (((q1.c) this.f23620w)) {
            try {
                q1.b bVar = (q1.b) this.f23618u;
                if (bVar.f39895f != this) {
                    throw new IllegalStateException();
                }
                if (!bVar.f39894e) {
                    ((boolean[]) this.f23619v)[0] = true;
                }
                file = bVar.f39893d[0];
                ((q1.c) this.f23620w).f39904n.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public int[] d() {
        synchronized (this) {
            try {
                if (!this.f23617n) {
                    return null;
                }
                long[] jArr = (long[]) this.f23618u;
                int length = jArr.length;
                int i = 0;
                int i4 = 0;
                while (i < length) {
                    int i9 = i4 + 1;
                    int i10 = 1;
                    boolean z8 = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.f23619v;
                    if (z8 != zArr[i4]) {
                        int[] iArr = (int[]) this.f23620w;
                        if (!z8) {
                            i10 = 2;
                        }
                        iArr[i4] = i10;
                    } else {
                        ((int[]) this.f23620w)[i4] = 0;
                    }
                    zArr[i4] = z8;
                    i++;
                    i4 = i9;
                }
                this.f23617n = false;
                return (int[]) ((int[]) this.f23620w).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean e() {
        boolean z8;
        boolean z9;
        try {
            synchronized (this) {
                try {
                    if (!this.f23617n) {
                        Boolean f6 = f();
                        this.f23619v = f6;
                        if (f6 == null) {
                            ((N3.l) ((V3.b) this.f23618u)).a(new A(9));
                        }
                        this.f23617n = true;
                    }
                } finally {
                }
            }
            return z9;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.f23619v;
        if (bool != null) {
            z9 = bool.booleanValue();
        } else {
            K3.g gVar = ((FirebaseMessaging) this.f23620w).f36355a;
            gVar.a();
            C4458a c4458a = (C4458a) gVar.f1629g.get();
            synchronized (c4458a) {
                z8 = c4458a.f37201a;
            }
            z9 = z8;
        }
        return z9;
    }

    public Boolean f() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        K3.g gVar = ((FirebaseMessaging) this.f23620w).f36355a;
        gVar.a();
        Context context = gVar.f1623a;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3392j
    public C3675oC g(int i, B8 b82, int[] iArr) {
        C3554m c3554m = (C3554m) this.f23618u;
        C3286h c3286h = (C3286h) this.f23619v;
        C3013c c3013c = new C3013c(c3554m, c3286h);
        int i4 = ((int[]) this.f23620w)[i];
        SB sb = UB.f27942u;
        AbstractC2720Pd.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i9 = 0;
        int i10 = 0;
        while (i9 < b82.f23997a) {
            int i11 = i;
            B8 b83 = b82;
            C3205fR c3205fR = new C3205fR(i11, b83, i9, c3286h, iArr[i9], this.f23617n, c3013c);
            int length = objArr.length;
            int i12 = i10 + 1;
            int d2 = PB.d(length, i12);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i10] = c3205fR;
            i9++;
            i10 = i12;
            i = i11;
            b82 = b83;
        }
        return UB.p(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public void v() {
        ((Q0) this.f23618u).v();
        if (!this.f23617n) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.f23620w;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C3827r3) sparseArray.valueAt(i)).i = true;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public void w(InterfaceC3015c1 interfaceC3015c1) {
        ((Q0) this.f23618u).w(interfaceC3015c1);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public InterfaceC3448k1 x(int i, int i4) {
        if (i4 != 3 && i4 != 5) {
            this.f23617n = true;
        }
        Q0 q02 = (Q0) this.f23618u;
        if (i4 != 3) {
            return q02.x(i, i4);
        }
        SparseArray sparseArray = (SparseArray) this.f23620w;
        C3827r3 c3827r3 = (C3827r3) sparseArray.get(i);
        if (c3827r3 != null) {
            return c3827r3;
        }
        C3827r3 c3827r32 = new C3827r3(q02.x(i, 3), (InterfaceC3720p3) this.f23619v);
        sparseArray.put(i, c3827r32);
        return c3827r32;
    }

    public /* synthetic */ n(Exception exc) {
        this.f23617n = false;
        this.f23618u = null;
        this.f23619v = null;
        this.f23620w = exc;
    }

    public /* synthetic */ n(Object obj, Object obj2) {
        this.f23617n = false;
        this.f23618u = obj;
        this.f23619v = obj2;
        this.f23620w = null;
    }

    public n(Q0 q02, InterfaceC3720p3 interfaceC3720p3) {
        this.f23618u = q02;
        this.f23619v = interfaceC3720p3;
        this.f23620w = new SparseArray();
    }

    public n(byte[] bArr, Map map, List list, boolean z8) {
        this.f23618u = bArr;
        this.f23619v = map;
        if (list == null) {
            this.f23620w = null;
        } else {
            this.f23620w = Collections.unmodifiableList(list);
        }
        this.f23617n = z8;
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
    public n(byte[] bArr, boolean z8, List list) {
        this(bArr, (Map) r0, list, z8);
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
                treeMap.put(dVar.f39030a, dVar.f39031b);
            }
        }
    }

    public n(N1.h hVar, m mVar) {
        this.f23620w = new Q0.h(1, this);
        this.f23619v = hVar;
        this.f23618u = mVar;
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
                arrayList.add(new l1.d((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public n() {
        this.f23618u = new Intent("android.intent.action.VIEW");
        this.f23619v = new C4523c(27);
        this.f23617n = true;
    }

    public n(int i) {
        this.f23618u = new long[i];
        this.f23619v = new boolean[i];
        this.f23620w = new int[i];
    }

    public n(f4.p pVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f23618u = intent;
        this.f23619v = new C4523c(27);
        this.f23617n = true;
        if (pVar != null) {
            intent.setPackage(((ComponentName) pVar.f37766x).getPackageName());
            BinderC4845e binderC4845e = (BinderC4845e) pVar.f37765w;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC4845e);
            intent.putExtras(bundle);
        }
    }

    public n(FirebaseMessaging firebaseMessaging, V3.b bVar) {
        this.f23620w = firebaseMessaging;
        this.f23618u = bVar;
    }

    public n(q1.c cVar, q1.b bVar) {
        this.f23620w = cVar;
        this.f23618u = bVar;
        this.f23619v = bVar.f39894e ? null : new boolean[cVar.f39910z];
    }
}
