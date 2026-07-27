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

/* renamed from: com.google.android.gms.internal.ads.xw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4197xw {

    /* renamed from: g, reason: collision with root package name */
    public static final C4197xw f35273g = new C4197xw();

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f35274h = new Handler(Looper.getMainLooper());
    public static Handler i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final U6 f35275j = new U6(7);

    /* renamed from: k, reason: collision with root package name */
    public static final U6 f35276k = new U6(8);

    /* renamed from: f, reason: collision with root package name */
    public long f35282f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f35277a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f35278b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final C2631Jq f35280d = new C2631Jq();

    /* renamed from: c, reason: collision with root package name */
    public final C2593Hm f35279c = new C2593Hm(22);

    /* renamed from: e, reason: collision with root package name */
    public final C2593Hm f35281e = new C2593Hm(new C4017ue(18));

    public static void b() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(f35275j);
            i.postDelayed(f35276k, 200L);
        }
    }

    public final void a(View view, Mu mu, JSONObject jSONObject, boolean z8) {
        Object obj;
        boolean z9;
        int i4;
        if (AbstractC3217fl.i(view) == null) {
            C2631Jq c2631Jq = this.f35280d;
            char c4 = ((HashSet) c2631Jq.f25826x).contains(view) ? (char) 1 : c2631Jq.f25822n ? (char) 2 : (char) 3;
            if (c4 == 3) {
                return;
            }
            JSONObject c9 = mu.c(view);
            AbstractC3981tw.c(jSONObject, c9);
            HashMap hashMap = (HashMap) c2631Jq.f25823u;
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
                    c9.put("adSessionId", obj);
                } catch (JSONException e6) {
                    AbstractC2720Pd.j("Error with setting ad session id", e6);
                }
                WeakHashMap weakHashMap = (WeakHashMap) c2631Jq.f25821C;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z10 = true;
                }
                try {
                    c9.put("hasWindowFocus", Boolean.valueOf(z10));
                } catch (JSONException e9) {
                    AbstractC2720Pd.j("Error with setting has window focus", e9);
                }
                boolean contains = ((HashSet) c2631Jq.f25820B).contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        c9.put("isPipActive", valueOf);
                    } catch (JSONException e10) {
                        AbstractC2720Pd.j("Error with setting is picture-in-picture active", e10);
                    }
                }
                c2631Jq.f25822n = true;
                return;
            }
            HashMap hashMap2 = (HashMap) c2631Jq.f25824v;
            C4089vw c4089vw = (C4089vw) hashMap2.get(view);
            if (c4089vw != null) {
                hashMap2.remove(view);
            }
            if (c4089vw != null) {
                C3442jw c3442jw = c4089vw.f34902a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = c4089vw.f34903b;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    jSONArray.put((String) arrayList.get(i9));
                }
                try {
                    c9.put("isFriendlyObstructionFor", jSONArray);
                    c9.put("friendlyObstructionClass", c3442jw.f32219b);
                    c9.put("friendlyObstructionPurpose", c3442jw.f32220c);
                    c9.put("friendlyObstructionReason", c3442jw.f32221d);
                } catch (JSONException e11) {
                    AbstractC2720Pd.j("Error with setting friendly obstruction", e11);
                }
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z11 = z8 || z9;
            boolean z12 = c4 == 1;
            mu.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z12) {
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        a(viewGroup.getChildAt(i10), mu, c9, z11);
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
                        i4 = i12 + 1;
                        if (i13 < size3) {
                            a((View) arrayList4.get(i13), mu, c9, z11);
                            i13++;
                        }
                    }
                    i12 = i4;
                }
            }
        }
    }
}
