package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4099vw {

    /* renamed from: g, reason: collision with root package name */
    public static final C4099vw f35529g = new C4099vw();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f35530h = new Handler(Looper.getMainLooper());
    public static Handler i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final Y6 f35531j = new Y6(7);

    /* renamed from: k, reason: collision with root package name */
    public static final Y6 f35532k = new Y6(8);

    /* renamed from: f, reason: collision with root package name */
    public long f35538f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f35533a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f35534b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final C2618Hq f35536d = new C2618Hq();

    /* renamed from: c, reason: collision with root package name */
    public final C3067cm f35535c = new C3067cm(23);

    /* renamed from: e, reason: collision with root package name */
    public final S0.c f35537e = new S0.c(new C4297ze(18));

    public static void b() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(f35531j);
            i.postDelayed(f35532k, 200L);
        }
    }

    public final void a(View view, C3128du c3128du, JSONObject jSONObject, boolean z6) {
        Object obj;
        boolean z9;
        int i4;
        if (SK.i(view) == null) {
            C2618Hq c2618Hq = this.f35536d;
            char c9 = ((HashSet) c2618Hq.f26136x).contains(view) ? (char) 1 : c2618Hq.f26132n ? (char) 2 : (char) 3;
            if (c9 == 3) {
                return;
            }
            JSONObject d9 = c3128du.d(view);
            AbstractC3937sw.c(jSONObject, d9);
            HashMap hashMap = (HashMap) c2618Hq.f26133u;
            if (hashMap.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) hashMap.get(view);
                if (obj2 != null) {
                    hashMap.remove(view);
                }
                obj = obj2;
            }
            boolean z10 = false;
            if (obj != null) {
                try {
                    d9.put("adSessionId", obj);
                } catch (JSONException e9) {
                    MA.j("Error with setting ad session id", e9);
                }
                WeakHashMap weakHashMap = (WeakHashMap) c2618Hq.f26131C;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z10 = true;
                }
                try {
                    d9.put("hasWindowFocus", Boolean.valueOf(z10));
                } catch (JSONException e10) {
                    MA.j("Error with setting has window focus", e10);
                }
                boolean contains = ((HashSet) c2618Hq.f26130B).contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        d9.put("isPipActive", valueOf);
                    } catch (JSONException e11) {
                        MA.j("Error with setting is picture-in-picture active", e11);
                    }
                }
                c2618Hq.f26132n = true;
                return;
            }
            HashMap hashMap2 = (HashMap) c2618Hq.f26134v;
            C4045uw c4045uw = (C4045uw) hashMap2.get(view);
            if (c4045uw != null) {
                hashMap2.remove(view);
            }
            if (c4045uw != null) {
                C3398iw c3398iw = c4045uw.f35374a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = c4045uw.f35375b;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    jSONArray.put((String) arrayList.get(i6));
                }
                try {
                    d9.put("isFriendlyObstructionFor", jSONArray);
                    d9.put("friendlyObstructionClass", c3398iw.f31921b);
                    d9.put("friendlyObstructionPurpose", c3398iw.f31922c);
                    d9.put("friendlyObstructionReason", c3398iw.f31923d);
                } catch (JSONException e12) {
                    MA.j("Error with setting friendly obstruction", e12);
                }
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z11 = z6 || z9;
            boolean z12 = c9 == 1;
            c3128du.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z12) {
                    for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                        a(viewGroup.getChildAt(i9), c3128du, d9, z11);
                    }
                    return;
                }
                HashMap hashMap3 = new HashMap();
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    ArrayList arrayList2 = (ArrayList) hashMap3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        hashMap3.put(Float.valueOf(childAt.getZ()), arrayList2);
                    }
                    arrayList2.add(childAt);
                }
                ArrayList arrayList3 = new ArrayList(hashMap3.keySet());
                Collections.sort(arrayList3);
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    ArrayList arrayList4 = (ArrayList) hashMap3.get((Float) arrayList3.get(i11));
                    int size3 = arrayList4.size();
                    int i12 = 0;
                    while (true) {
                        i4 = i11 + 1;
                        if (i12 < size3) {
                            a((View) arrayList4.get(i12), c3128du, d9, z11);
                            i12++;
                        }
                    }
                    i11 = i4;
                }
            }
        }
    }
}
