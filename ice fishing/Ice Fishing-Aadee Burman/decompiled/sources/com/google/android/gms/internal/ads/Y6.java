package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Y6 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ Y6 f28655u = new Y6(2);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28656n;

    public /* synthetic */ Y6(int i) {
        this.f28656n = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CountDownLatch countDownLatch;
        HashSet hashSet;
        KeyguardManager keyguardManager;
        C2991bm c2991bm;
        HashMap hashMap;
        Iterator it;
        HashSet hashSet2;
        Activity activity;
        Boolean bool;
        String str;
        switch (this.f28656n) {
            case 0:
                try {
                    Z6.f28840b = MessageDigest.getInstance("MD5");
                    countDownLatch = Z6.f28843e;
                } catch (NoSuchAlgorithmException unused) {
                    countDownLatch = Z6.f28843e;
                } catch (Throwable th) {
                    Z6.f28843e.countDown();
                    throw th;
                }
                countDownLatch.countDown();
                return;
            case 1:
                return;
            case 2:
                List list = C4221yf.f35180l;
                AbstractC2639Kg.i("Pinged SB successfully.");
                return;
            case 3:
                Looper.myLooper().quit();
                return;
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                C4076vw c4076vw = C4076vw.f34760g;
                c4076vw.getClass();
                c4076vw.f34765b.clear();
                for (Uv uv : Collections.unmodifiableCollection(C3161ew.f30001c.f30003b)) {
                }
                c4076vw.f34769f = System.nanoTime();
                C2598Hq c2598Hq = c4076vw.f34767d;
                c2598Hq.getClass();
                C3161ew c3161ew = C3161ew.f30001c;
                HashMap hashMap2 = (HashMap) c2598Hq.f25392w;
                HashMap hashMap3 = (HashMap) c2598Hq.f25386A;
                HashSet hashSet3 = (HashSet) c2598Hq.f25395z;
                HashMap hashMap4 = (HashMap) c2598Hq.f25391v;
                HashMap hashMap5 = (HashMap) c2598Hq.f25390u;
                HashSet hashSet4 = (HashSet) c2598Hq.f25393x;
                HashSet hashSet5 = (HashSet) c2598Hq.f25387B;
                HashSet hashSet6 = (HashSet) c2598Hq.f25394y;
                if (c3161ew != null) {
                    Iterator it2 = Collections.unmodifiableCollection(c3161ew.f30003b).iterator();
                    while (it2.hasNext()) {
                        Uv uv2 = (Uv) it2.next();
                        View view = (View) uv2.f28038c.get();
                        if (!uv2.f28040e || uv2.f28041f) {
                            it = it2;
                            hashSet2 = hashSet5;
                        } else {
                            String str2 = uv2.f28042g;
                            if (view != null) {
                                Context context = view.getContext();
                                it = it2;
                                while (true) {
                                    if (!(context instanceof ContextWrapper)) {
                                        activity = null;
                                    } else if (context instanceof Activity) {
                                        activity = (Activity) context;
                                    } else {
                                        context = ((ContextWrapper) context).getBaseContext();
                                    }
                                }
                                boolean isInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                                if (isInPictureInPictureMode) {
                                    hashSet5.add(str2);
                                }
                                boolean z3 = isInPictureInPictureMode;
                                if (view.isAttachedToWindow()) {
                                    boolean hasWindowFocus = view.hasWindowFocus();
                                    WeakHashMap weakHashMap = (WeakHashMap) c2598Hq.f25388C;
                                    if (hasWindowFocus) {
                                        weakHashMap.remove(view);
                                        bool = Boolean.FALSE;
                                    } else if (weakHashMap.containsKey(view)) {
                                        bool = (Boolean) weakHashMap.get(view);
                                    } else {
                                        Boolean bool2 = Boolean.FALSE;
                                        weakHashMap.put(view, bool2);
                                        bool = bool2;
                                    }
                                    if (!bool.booleanValue() || z3) {
                                        HashSet hashSet7 = new HashSet();
                                        View view2 = view;
                                        while (true) {
                                            if (view2 == null) {
                                                hashSet2 = hashSet5;
                                                hashSet4.addAll(hashSet7);
                                                str = null;
                                            } else {
                                                String i = SK.i(view2);
                                                if (i != null) {
                                                    hashSet2 = hashSet5;
                                                    str = i;
                                                } else {
                                                    hashSet7.add(view2);
                                                    Object parent = view2.getParent();
                                                    HashSet hashSet8 = hashSet5;
                                                    if (parent instanceof View) {
                                                        view2 = (View) parent;
                                                        hashSet5 = hashSet8;
                                                    } else {
                                                        hashSet5 = hashSet8;
                                                        view2 = null;
                                                    }
                                                }
                                            }
                                        }
                                        if (str != null) {
                                            hashSet6.add(str2);
                                            hashMap5.put(view, str2);
                                            Iterator it3 = uv2.f28037b.f31136a.iterator();
                                            while (it3.hasNext()) {
                                                C3323hw c3323hw = (C3323hw) it3.next();
                                                View view3 = (View) c3323hw.f30970a.get();
                                                if (view3 != null) {
                                                    C4022uw c4022uw = (C4022uw) hashMap4.get(view3);
                                                    if (c4022uw != null) {
                                                        c4022uw.f34612b.add(str2);
                                                    } else {
                                                        hashMap4.put(view3, new C4022uw(c3323hw, str2));
                                                    }
                                                }
                                            }
                                        } else if (str != "noWindowFocus") {
                                            hashSet3.add(str2);
                                            hashMap2.put(str2, view);
                                            hashMap3.put(str2, str);
                                        }
                                    } else {
                                        str = "noWindowFocus";
                                    }
                                } else {
                                    str = "notAttached";
                                }
                                hashSet2 = hashSet5;
                                if (str != null) {
                                }
                            } else {
                                hashSet3.add(str2);
                                hashMap3.put(str2, "noAdView");
                                it2 = it2;
                            }
                        }
                        it2 = it;
                        hashSet5 = hashSet2;
                    }
                }
                HashSet hashSet9 = hashSet5;
                long nanoTime = System.nanoTime();
                C2991bm c2991bm2 = c4076vw.f34766c;
                C3534lt c3534lt = (C3534lt) c2991bm2.f29324v;
                int size = hashSet3.size();
                S0.c cVar = c4076vw.f34768e;
                if (size > 0) {
                    Iterator it4 = hashSet3.iterator();
                    while (it4.hasNext()) {
                        String str3 = (String) it4.next();
                        Iterator it5 = it4;
                        JSONObject l9 = c3534lt.l(null);
                        View view4 = (View) hashMap2.get(str3);
                        String str4 = (String) hashMap3.get(str3);
                        if (str4 != null) {
                            hashMap = hashMap2;
                            JSONObject d2 = ((C3105du) c2991bm2.f29323u).d(view4);
                            try {
                                d2.put("adSessionId", str3);
                                c2991bm = c2991bm2;
                            } catch (JSONException e9) {
                                c2991bm = c2991bm2;
                                MA.j("Error with setting ad session id", e9);
                            }
                            try {
                                d2.put("notVisibleReason", str4);
                            } catch (JSONException e10) {
                                MA.j("Error with setting not visible reason", e10);
                            }
                            AbstractC3914sw.c(l9, d2);
                        } else {
                            c2991bm = c2991bm2;
                            hashMap = hashMap2;
                        }
                        AbstractC3914sw.d(l9);
                        HashSet hashSet10 = new HashSet();
                        hashSet10.add(str3);
                        cVar.getClass();
                        AsyncTaskC4238yw asyncTaskC4238yw = new AsyncTaskC4238yw(cVar, hashSet10, l9, nanoTime, 0);
                        C4274ze c4274ze = (C4274ze) cVar.f2776v;
                        asyncTaskC4238yw.f34904a = c4274ze;
                        ArrayDeque arrayDeque = (ArrayDeque) c4274ze.f35361v;
                        arrayDeque.add(asyncTaskC4238yw);
                        if (((AbstractAsyncTaskC4130ww) c4274ze.f35362w) == null) {
                            AbstractAsyncTaskC4130ww abstractAsyncTaskC4130ww = (AbstractAsyncTaskC4130ww) arrayDeque.poll();
                            c4274ze.f35362w = abstractAsyncTaskC4130ww;
                            if (abstractAsyncTaskC4130ww != null) {
                                abstractAsyncTaskC4130ww.executeOnExecutor((ThreadPoolExecutor) c4274ze.f35360u, new Object[0]);
                            }
                        }
                        it4 = it5;
                        c2991bm2 = c2991bm;
                        hashMap2 = hashMap;
                    }
                }
                HashMap hashMap6 = hashMap2;
                if (hashSet6.size() > 0) {
                    JSONObject l10 = c3534lt.l(null);
                    c3534lt.getClass();
                    ArrayList arrayList = new ArrayList();
                    C3161ew c3161ew2 = C3161ew.f30001c;
                    if (c3161ew2 != null) {
                        Collection unmodifiableCollection = Collections.unmodifiableCollection(c3161ew2.f30003b);
                        int size2 = unmodifiableCollection.size();
                        IdentityHashMap identityHashMap = new IdentityHashMap(size2 + size2 + 3);
                        Iterator it6 = unmodifiableCollection.iterator();
                        while (it6.hasNext()) {
                            View view5 = (View) ((Uv) it6.next()).f28038c.get();
                            if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                                View view6 = view5;
                                while (true) {
                                    if (view6 == null) {
                                        Iterator it7 = it6;
                                        View rootView = view5.getRootView();
                                        if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                            identityHashMap.put(rootView, rootView);
                                            float z6 = rootView.getZ();
                                            int size3 = arrayList.size();
                                            while (size3 > 0) {
                                                float f3 = z6;
                                                int i6 = size3 - 1;
                                                if (((View) arrayList.get(i6)).getZ() > f3) {
                                                    size3 = i6;
                                                    z6 = f3;
                                                } else {
                                                    arrayList.add(size3, rootView);
                                                }
                                            }
                                            arrayList.add(size3, rootView);
                                        }
                                        it6 = it7;
                                    } else {
                                        if (view6.getAlpha() == 0.0f) {
                                            break;
                                        }
                                        Object parent2 = view6.getParent();
                                        Iterator it8 = it6;
                                        if (parent2 instanceof View) {
                                            view6 = (View) parent2;
                                            it6 = it8;
                                        } else {
                                            it6 = it8;
                                            view6 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int size4 = arrayList.size();
                    int i9 = 0;
                    while (i9 < size4) {
                        c4076vw.a((View) arrayList.get(i9), (C3105du) c3534lt.f31863u, l10, false);
                        i9++;
                        arrayList = arrayList;
                    }
                    AbstractC3914sw.d(l10);
                    cVar.getClass();
                    hashSet = hashSet6;
                    AsyncTaskC4238yw asyncTaskC4238yw2 = new AsyncTaskC4238yw(cVar, hashSet, l10, nanoTime, 1);
                    C4274ze c4274ze2 = (C4274ze) cVar.f2776v;
                    asyncTaskC4238yw2.f34904a = c4274ze2;
                    ArrayDeque arrayDeque2 = (ArrayDeque) c4274ze2.f35361v;
                    arrayDeque2.add(asyncTaskC4238yw2);
                    if (((AbstractAsyncTaskC4130ww) c4274ze2.f35362w) == null) {
                        AbstractAsyncTaskC4130ww abstractAsyncTaskC4130ww2 = (AbstractAsyncTaskC4130ww) arrayDeque2.poll();
                        c4274ze2.f35362w = abstractAsyncTaskC4130ww2;
                        if (abstractAsyncTaskC4130ww2 != null) {
                            abstractAsyncTaskC4130ww2.executeOnExecutor((ThreadPoolExecutor) c4274ze2.f35360u, new Object[0]);
                        }
                    }
                } else {
                    hashSet = hashSet6;
                    cVar.getClass();
                    AsyncTaskC4184xw asyncTaskC4184xw = new AsyncTaskC4184xw(cVar);
                    C4274ze c4274ze3 = (C4274ze) cVar.f2776v;
                    asyncTaskC4184xw.f34904a = c4274ze3;
                    ArrayDeque arrayDeque3 = (ArrayDeque) c4274ze3.f35361v;
                    arrayDeque3.add(asyncTaskC4184xw);
                    if (((AbstractAsyncTaskC4130ww) c4274ze3.f35362w) == null) {
                        AbstractAsyncTaskC4130ww abstractAsyncTaskC4130ww3 = (AbstractAsyncTaskC4130ww) arrayDeque3.poll();
                        c4274ze3.f35362w = abstractAsyncTaskC4130ww3;
                        if (abstractAsyncTaskC4130ww3 != null) {
                            abstractAsyncTaskC4130ww3.executeOnExecutor((ThreadPoolExecutor) c4274ze3.f35360u, new Object[0]);
                        }
                    }
                }
                hashMap5.clear();
                hashMap4.clear();
                hashMap6.clear();
                hashSet4.clear();
                hashSet.clear();
                hashSet3.clear();
                hashMap3.clear();
                c2598Hq.f25389n = false;
                hashSet9.clear();
                long nanoTime2 = System.nanoTime() - c4076vw.f34769f;
                ArrayList arrayList2 = c4076vw.f34764a;
                if (arrayList2.size() > 0) {
                    Iterator it9 = arrayList2.iterator();
                    if (it9.hasNext()) {
                        if (it9.next() != null) {
                            throw new ClassCastException();
                        }
                        TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                        throw null;
                    }
                }
                C3537lw c3537lw = C3537lw.f31865d;
                Context context2 = (Context) c3537lw.f31866a.get();
                if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean isDeviceLocked = keyguardManager.isDeviceLocked();
                c3537lw.a(c3537lw.f31867b, isDeviceLocked);
                c3537lw.f31868c = isDeviceLocked;
                return;
            case 8:
                Handler handler = C4076vw.i;
                if (handler != null) {
                    handler.post(C4076vw.f34762j);
                    C4076vw.i.postDelayed(C4076vw.f34763k, 200L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }

    private final void e() {
    }
}
