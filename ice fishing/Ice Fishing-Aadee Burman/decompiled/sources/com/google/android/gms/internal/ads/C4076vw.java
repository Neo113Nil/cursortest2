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
public final class C4076vw {

    /* renamed from: g, reason: collision with root package name */
    public static final C4076vw f34760g = new C4076vw();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f34761h = new Handler(Looper.getMainLooper());
    public static Handler i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final Y6 f34762j = new Y6(7);

    /* renamed from: k, reason: collision with root package name */
    public static final Y6 f34763k = new Y6(8);

    /* renamed from: f, reason: collision with root package name */
    public long f34769f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f34764a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f34765b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final C2598Hq f34767d = new C2598Hq();

    /* renamed from: c, reason: collision with root package name */
    public final C2991bm f34766c = new C2991bm(21);

    /* renamed from: e, reason: collision with root package name */
    public final S0.c f34768e = new S0.c(new C4274ze(18));

    public static void b() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(f34762j);
            i.postDelayed(f34763k, 200L);
        }
    }

    public final void a(View view, C3105du c3105du, JSONObject jSONObject, boolean z3) {
        Object obj;
        boolean z6;
        int i6;
        if (SK.i(view) == null) {
            C2598Hq c2598Hq = this.f34767d;
            char c9 = ((HashSet) c2598Hq.f25393x).contains(view) ? (char) 1 : c2598Hq.f25389n ? (char) 2 : (char) 3;
            if (c9 == 3) {
                return;
            }
            JSONObject d2 = c3105du.d(view);
            AbstractC3914sw.c(jSONObject, d2);
            HashMap hashMap = (HashMap) c2598Hq.f25390u;
            if (hashMap.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) hashMap.get(view);
                if (obj2 != null) {
                    hashMap.remove(view);
                }
                obj = obj2;
            }
            boolean z9 = false;
            if (obj != null) {
                try {
                    d2.put("adSessionId", obj);
                } catch (JSONException e9) {
                    MA.j("Error with setting ad session id", e9);
                }
                WeakHashMap weakHashMap = (WeakHashMap) c2598Hq.f25388C;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z9 = true;
                }
                try {
                    d2.put("hasWindowFocus", Boolean.valueOf(z9));
                } catch (JSONException e10) {
                    MA.j("Error with setting has window focus", e10);
                }
                boolean contains = ((HashSet) c2598Hq.f25387B).contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        d2.put("isPipActive", valueOf);
                    } catch (JSONException e11) {
                        MA.j("Error with setting is picture-in-picture active", e11);
                    }
                }
                c2598Hq.f25389n = true;
                return;
            }
            HashMap hashMap2 = (HashMap) c2598Hq.f25391v;
            C4022uw c4022uw = (C4022uw) hashMap2.get(view);
            if (c4022uw != null) {
                hashMap2.remove(view);
            }
            if (c4022uw != null) {
                C3323hw c3323hw = c4022uw.f34611a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = c4022uw.f34612b;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    jSONArray.put((String) arrayList.get(i9));
                }
                try {
                    d2.put("isFriendlyObstructionFor", jSONArray);
                    d2.put("friendlyObstructionClass", c3323hw.f30971b);
                    d2.put("friendlyObstructionPurpose", c3323hw.f30972c);
                    d2.put("friendlyObstructionReason", c3323hw.f30973d);
                } catch (JSONException e12) {
                    MA.j("Error with setting friendly obstruction", e12);
                }
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z10 = z3 || z6;
            boolean z11 = c9 == 1;
            c3105du.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z11) {
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        a(viewGroup.getChildAt(i10), c3105du, d2, z10);
                    }
                    return;
                }
                HashMap hashMap3 = new HashMap();
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
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
                int i12 = 0;
                while (i12 < size2) {
                    ArrayList arrayList4 = (ArrayList) hashMap3.get((Float) arrayList3.get(i12));
                    int size3 = arrayList4.size();
                    int i13 = 0;
                    while (true) {
                        i6 = i12 + 1;
                        if (i13 < size3) {
                            a((View) arrayList4.get(i13), c3105du, d2, z10);
                            i13++;
                        }
                    }
                    i12 = i6;
                }
            }
        }
    }
}
