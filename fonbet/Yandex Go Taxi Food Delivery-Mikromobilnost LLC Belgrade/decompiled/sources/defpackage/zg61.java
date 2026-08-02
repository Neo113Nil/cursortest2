package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yads.mu3;
import yads.ru3;
import yads.uu3;

/* loaded from: classes7.dex */
public final class zg61 implements Runnable {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        KeyguardManager keyguardManager;
        Iterator it;
        zm81 zm81Var;
        HashMap hashMap;
        JSONObject a;
        Activity activity;
        Boolean bool;
        WeakHashMap weakHashMap;
        HashSet hashSet;
        String str;
        oo61 oo61Var = oo61.f;
        oo61Var.getClass();
        ArrayList arrayList = oo61Var.a;
        zm81 zm81Var2 = oo61Var.c;
        yv81 yv81Var = oo61Var.e;
        zw71 zw71Var = oo61Var.d;
        oo61Var.b.clear();
        Iterator it2 = Collections.unmodifiableCollection(kb71.c.b).iterator();
        while (it2.hasNext()) {
            ((j681) it2.next()).getClass();
        }
        System.nanoTime();
        HashMap hashMap2 = zw71Var.g;
        HashMap hashMap3 = zw71Var.g;
        HashMap hashMap4 = zw71Var.a;
        HashSet hashSet2 = zw71Var.d;
        HashSet hashSet3 = zw71Var.h;
        HashMap hashMap5 = zw71Var.c;
        HashSet hashSet4 = zw71Var.e;
        HashSet hashSet5 = zw71Var.f;
        WeakHashMap weakHashMap2 = zw71Var.i;
        kb71 kb71Var = kb71.c;
        if (kb71Var != null) {
            Iterator it3 = Collections.unmodifiableCollection(kb71Var.b).iterator();
            while (it3.hasNext()) {
                j681 j681Var = (j681) it3.next();
                Iterator it4 = it3;
                pj61 pj61Var = j681Var.d;
                String str2 = j681Var.h;
                zw71 zw71Var2 = zw71Var;
                View view = (View) pj61Var.get();
                oo61 oo61Var2 = oo61Var;
                if (j681Var.f && !j681Var.g) {
                    if (view != null) {
                        Context context = view.getContext();
                        yv81 yv81Var2 = yv81Var;
                        while (true) {
                            if (!(context instanceof ContextWrapper)) {
                                activity = null;
                                break;
                            } else {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        }
                        boolean isInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                        if (isInPictureInPictureMode) {
                            hashSet3.add(str2);
                        }
                        boolean z = isInPictureInPictureMode;
                        if (view.isAttachedToWindow()) {
                            if (view.hasWindowFocus()) {
                                weakHashMap2.remove(view);
                                bool = Boolean.FALSE;
                            } else if (weakHashMap2.containsKey(view)) {
                                bool = (Boolean) weakHashMap2.get(view);
                            } else {
                                bool = Boolean.FALSE;
                                weakHashMap2.put(view, bool);
                            }
                            if (!bool.booleanValue() || z) {
                                HashSet hashSet6 = new HashSet();
                                weakHashMap = weakHashMap2;
                                View view2 = view;
                                while (view2 != null) {
                                    String a2 = jna1.a(view2);
                                    if (a2 != null) {
                                        str = a2;
                                        hashSet = hashSet3;
                                        break;
                                    } else {
                                        hashSet6.add(view2);
                                        Object parent = view2.getParent();
                                        HashSet hashSet7 = hashSet3;
                                        view2 = parent instanceof View ? (View) parent : null;
                                        hashSet3 = hashSet7;
                                    }
                                }
                                hashSet = hashSet3;
                                hashSet2.addAll(hashSet6);
                                str = null;
                                if (str != null) {
                                    hashSet4.add(str2);
                                    hashMap4.put(view, str2);
                                    Iterator it5 = j681Var.c.a.iterator();
                                    if (it5.hasNext()) {
                                        ((m381) it5.next()).getClass();
                                        throw null;
                                    }
                                } else if (str != "noWindowFocus") {
                                    hashSet5.add(str2);
                                    hashMap5.put(str2, view);
                                    hashMap2.put(str2, str);
                                }
                                it3 = it4;
                                oo61Var = oo61Var2;
                                zw71Var = zw71Var2;
                                yv81Var = yv81Var2;
                                weakHashMap2 = weakHashMap;
                                hashSet3 = hashSet;
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        weakHashMap = weakHashMap2;
                        hashSet = hashSet3;
                        if (str != null) {
                        }
                        it3 = it4;
                        oo61Var = oo61Var2;
                        zw71Var = zw71Var2;
                        yv81Var = yv81Var2;
                        weakHashMap2 = weakHashMap;
                        hashSet3 = hashSet;
                    } else {
                        hashSet5.add(str2);
                        hashMap2.put(str2, "noAdView");
                    }
                }
                it3 = it4;
                oo61Var = oo61Var2;
                zw71Var = zw71Var2;
            }
        }
        oo61 oo61Var3 = oo61Var;
        yv81 yv81Var3 = yv81Var;
        zw71 zw71Var3 = zw71Var;
        HashSet hashSet8 = hashSet3;
        long nanoTime = System.nanoTime();
        aj31 aj31Var = zm81Var2.b;
        if (hashSet5.size() > 0) {
            Iterator it6 = hashSet5.iterator();
            while (it6.hasNext()) {
                String str3 = (String) it6.next();
                aj31Var.getClass();
                HashSet hashSet9 = hashSet5;
                JSONObject g = aj31.g();
                View view3 = (View) hashMap5.get(str3);
                rq71 rq71Var = zm81Var2.a;
                Iterator it7 = it6;
                String str4 = (String) hashMap3.get(str3);
                if (str4 != null) {
                    int[] iArr = rq71Var.a;
                    if (view3 == null) {
                        zm81Var = zm81Var2;
                        a = y471.a(0, 0, 0, 0);
                        hashMap = hashMap5;
                    } else {
                        zm81Var = zm81Var2;
                        int width = view3.getWidth();
                        hashMap = hashMap5;
                        int height = view3.getHeight();
                        view3.getLocationOnScreen(iArr);
                        a = y471.a(iArr[0], iArr[1], width, height);
                    }
                    JSONObject jSONObject = a;
                    try {
                        jSONObject.put("adSessionId", str3);
                    } catch (JSONException e) {
                        Log.e("OMIDLIB", "Error with setting ad session id", e);
                    }
                    try {
                        jSONObject.put("notVisibleReason", str4);
                    } catch (JSONException e2) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e2);
                    }
                    try {
                        JSONArray optJSONArray = g.optJSONArray("childViews");
                        if (optJSONArray == null) {
                            optJSONArray = new JSONArray();
                            g.put("childViews", optJSONArray);
                        }
                        optJSONArray.put(jSONObject);
                    } catch (JSONException unused) {
                    }
                } else {
                    zm81Var = zm81Var2;
                    hashMap = hashMap5;
                }
                y471.b(g);
                HashSet hashSet10 = hashSet4;
                HashSet hashSet11 = new HashSet();
                hashSet11.add(str3);
                yv81Var3.b.a(new ru3(yv81Var3, hashSet11, g, nanoTime));
                hashSet4 = hashSet10;
                hashSet5 = hashSet9;
                zm81Var2 = zm81Var;
                it6 = it7;
                hashMap5 = hashMap;
            }
        }
        HashMap hashMap6 = hashMap5;
        HashSet hashSet12 = hashSet4;
        HashSet hashSet13 = hashSet5;
        if (hashSet12.size() > 0) {
            aj31Var.getClass();
            JSONObject g2 = aj31.g();
            ArrayList arrayList2 = new ArrayList();
            kb71 kb71Var2 = kb71.c;
            if (kb71Var2 != null) {
                Collection unmodifiableCollection = Collections.unmodifiableCollection(kb71Var2.b);
                IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
                Iterator it8 = unmodifiableCollection.iterator();
                while (it8.hasNext()) {
                    View view4 = (View) ((j681) it8.next()).d.get();
                    if (view4 != null && view4.isAttachedToWindow() && view4.isShown()) {
                        View view5 = view4;
                        while (true) {
                            if (view5 == null) {
                                View rootView = view4.getRootView();
                                if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                    identityHashMap.put(rootView, rootView);
                                    float z2 = rootView.getZ();
                                    int size = arrayList2.size();
                                    while (true) {
                                        if (size <= 0) {
                                            it = it8;
                                            break;
                                        }
                                        it = it8;
                                        if (((View) arrayList2.get(size - 1)).getZ() <= z2) {
                                            break;
                                        }
                                        size--;
                                        it8 = it;
                                    }
                                    arrayList2.add(size, rootView);
                                    it8 = it;
                                }
                            } else {
                                if (view5.getAlpha() == 0.0f) {
                                    break;
                                }
                                Object parent2 = view5.getParent();
                                view5 = parent2 instanceof View ? (View) parent2 : null;
                            }
                        }
                    }
                }
            }
            Iterator it9 = arrayList2.iterator();
            while (it9.hasNext()) {
                oo61Var3.a((View) it9.next(), (rq71) aj31Var.b, g2, false);
            }
            y471.b(g2);
            yv81Var3.b.a(new uu3(yv81Var3, hashSet12, g2, nanoTime));
        } else {
            yv81Var3.b.a(new mu3(yv81Var3));
        }
        hashMap4.clear();
        zw71Var3.b.clear();
        hashMap6.clear();
        hashSet2.clear();
        hashSet12.clear();
        hashSet13.clear();
        hashMap3.clear();
        zw71Var3.j = false;
        hashSet8.clear();
        System.nanoTime();
        if (arrayList.size() > 0) {
            Iterator it10 = arrayList.iterator();
            if (it10.hasNext()) {
                throw unr0.i(it10);
            }
        }
        w171 w171Var = w171.d;
        Context context2 = (Context) w171Var.a.get();
        if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
            return;
        }
        boolean isDeviceLocked = keyguardManager.isDeviceLocked();
        w171Var.a(w171Var.b, isDeviceLocked);
        w171Var.c = isDeviceLocked;
    }
}
