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
    public static final /* synthetic */ Y6 f29432u = new Y6(2);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29433n;

    public /* synthetic */ Y6(int i) {
        this.f29433n = i;
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
        C3067cm c3067cm;
        HashMap hashMap;
        Iterator it;
        HashSet hashSet2;
        Activity activity;
        Boolean bool;
        String str;
        switch (this.f29433n) {
            case 0:
                try {
                    Z6.f29620b = MessageDigest.getInstance("MD5");
                    countDownLatch = Z6.f29623e;
                } catch (NoSuchAlgorithmException unused) {
                    countDownLatch = Z6.f29623e;
                } catch (Throwable th) {
                    Z6.f29623e.countDown();
                    throw th;
                }
                countDownLatch.countDown();
                return;
            case 1:
                return;
            case 2:
                List list = C4244yf.f35970l;
                AbstractC2659Kg.i("Pinged SB successfully.");
                return;
            case 3:
                Looper.myLooper().quit();
                return;
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                C4099vw c4099vw = C4099vw.f35529g;
                c4099vw.getClass();
                c4099vw.f35534b.clear();
                for (Uv uv : Collections.unmodifiableCollection(C3238fw.f31233c.f31235b)) {
                }
                c4099vw.f35538f = System.nanoTime();
                C2618Hq c2618Hq = c4099vw.f35536d;
                c2618Hq.getClass();
                C3238fw c3238fw = C3238fw.f31233c;
                HashMap hashMap2 = (HashMap) c2618Hq.f26135w;
                HashMap hashMap3 = (HashMap) c2618Hq.f26129A;
                HashSet hashSet3 = (HashSet) c2618Hq.f26138z;
                HashMap hashMap4 = (HashMap) c2618Hq.f26134v;
                HashMap hashMap5 = (HashMap) c2618Hq.f26133u;
                HashSet hashSet4 = (HashSet) c2618Hq.f26136x;
                HashSet hashSet5 = (HashSet) c2618Hq.f26130B;
                HashSet hashSet6 = (HashSet) c2618Hq.f26137y;
                if (c3238fw != null) {
                    Iterator it2 = Collections.unmodifiableCollection(c3238fw.f31235b).iterator();
                    while (it2.hasNext()) {
                        Uv uv2 = (Uv) it2.next();
                        View view = (View) uv2.f28835c.get();
                        if (!uv2.f28837e || uv2.f28838f) {
                            it = it2;
                            hashSet2 = hashSet5;
                        } else {
                            String str2 = uv2.f28839g;
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
                                boolean z6 = isInPictureInPictureMode;
                                if (view.isAttachedToWindow()) {
                                    boolean hasWindowFocus = view.hasWindowFocus();
                                    WeakHashMap weakHashMap = (WeakHashMap) c2618Hq.f26131C;
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
                                    if (!bool.booleanValue() || z6) {
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
                                            Iterator it3 = uv2.f28834b.f32130a.iterator();
                                            while (it3.hasNext()) {
                                                C3398iw c3398iw = (C3398iw) it3.next();
                                                View view3 = (View) c3398iw.f31920a.get();
                                                if (view3 != null) {
                                                    C4045uw c4045uw = (C4045uw) hashMap4.get(view3);
                                                    if (c4045uw != null) {
                                                        c4045uw.f35375b.add(str2);
                                                    } else {
                                                        hashMap4.put(view3, new C4045uw(c3398iw, str2));
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
                C3067cm c3067cm2 = c4099vw.f35535c;
                C3557lt c3557lt = (C3557lt) c3067cm2.f30366v;
                int size = hashSet3.size();
                S0.c cVar = c4099vw.f35537e;
                if (size > 0) {
                    Iterator it4 = hashSet3.iterator();
                    while (it4.hasNext()) {
                        String str3 = (String) it4.next();
                        Iterator it5 = it4;
                        JSONObject i4 = c3557lt.i(null);
                        View view4 = (View) hashMap2.get(str3);
                        String str4 = (String) hashMap3.get(str3);
                        if (str4 != null) {
                            hashMap = hashMap2;
                            JSONObject d9 = ((C3128du) c3067cm2.f30365u).d(view4);
                            try {
                                d9.put("adSessionId", str3);
                                c3067cm = c3067cm2;
                            } catch (JSONException e9) {
                                c3067cm = c3067cm2;
                                MA.j("Error with setting ad session id", e9);
                            }
                            try {
                                d9.put("notVisibleReason", str4);
                            } catch (JSONException e10) {
                                MA.j("Error with setting not visible reason", e10);
                            }
                            AbstractC3937sw.c(i4, d9);
                        } else {
                            c3067cm = c3067cm2;
                            hashMap = hashMap2;
                        }
                        AbstractC3937sw.d(i4);
                        HashSet hashSet10 = new HashSet();
                        hashSet10.add(str3);
                        cVar.getClass();
                        AsyncTaskC4261yw asyncTaskC4261yw = new AsyncTaskC4261yw(cVar, hashSet10, i4, nanoTime, 0);
                        C4297ze c4297ze = (C4297ze) cVar.f2903v;
                        asyncTaskC4261yw.f35685a = c4297ze;
                        ArrayDeque arrayDeque = (ArrayDeque) c4297ze.f36134v;
                        arrayDeque.add(asyncTaskC4261yw);
                        if (((AbstractAsyncTaskC4153ww) c4297ze.f36135w) == null) {
                            AbstractAsyncTaskC4153ww abstractAsyncTaskC4153ww = (AbstractAsyncTaskC4153ww) arrayDeque.poll();
                            c4297ze.f36135w = abstractAsyncTaskC4153ww;
                            if (abstractAsyncTaskC4153ww != null) {
                                abstractAsyncTaskC4153ww.executeOnExecutor((ThreadPoolExecutor) c4297ze.f36133u, new Object[0]);
                            }
                        }
                        it4 = it5;
                        c3067cm2 = c3067cm;
                        hashMap2 = hashMap;
                    }
                }
                HashMap hashMap6 = hashMap2;
                if (hashSet6.size() > 0) {
                    JSONObject i6 = c3557lt.i(null);
                    c3557lt.getClass();
                    ArrayList arrayList = new ArrayList();
                    C3238fw c3238fw2 = C3238fw.f31233c;
                    if (c3238fw2 != null) {
                        Collection unmodifiableCollection = Collections.unmodifiableCollection(c3238fw2.f31235b);
                        int size2 = unmodifiableCollection.size();
                        IdentityHashMap identityHashMap = new IdentityHashMap(size2 + size2 + 3);
                        Iterator it6 = unmodifiableCollection.iterator();
                        while (it6.hasNext()) {
                            View view5 = (View) ((Uv) it6.next()).f28835c.get();
                            if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                                View view6 = view5;
                                while (true) {
                                    if (view6 == null) {
                                        Iterator it7 = it6;
                                        View rootView = view5.getRootView();
                                        if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                            identityHashMap.put(rootView, rootView);
                                            float z9 = rootView.getZ();
                                            int size3 = arrayList.size();
                                            while (size3 > 0) {
                                                float f2 = z9;
                                                int i9 = size3 - 1;
                                                if (((View) arrayList.get(i9)).getZ() > f2) {
                                                    size3 = i9;
                                                    z9 = f2;
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
                    int i10 = 0;
                    while (i10 < size4) {
                        c4099vw.a((View) arrayList.get(i10), (C3128du) c3557lt.f32643u, i6, false);
                        i10++;
                        arrayList = arrayList;
                    }
                    AbstractC3937sw.d(i6);
                    cVar.getClass();
                    hashSet = hashSet6;
                    AsyncTaskC4261yw asyncTaskC4261yw2 = new AsyncTaskC4261yw(cVar, hashSet, i6, nanoTime, 1);
                    C4297ze c4297ze2 = (C4297ze) cVar.f2903v;
                    asyncTaskC4261yw2.f35685a = c4297ze2;
                    ArrayDeque arrayDeque2 = (ArrayDeque) c4297ze2.f36134v;
                    arrayDeque2.add(asyncTaskC4261yw2);
                    if (((AbstractAsyncTaskC4153ww) c4297ze2.f36135w) == null) {
                        AbstractAsyncTaskC4153ww abstractAsyncTaskC4153ww2 = (AbstractAsyncTaskC4153ww) arrayDeque2.poll();
                        c4297ze2.f36135w = abstractAsyncTaskC4153ww2;
                        if (abstractAsyncTaskC4153ww2 != null) {
                            abstractAsyncTaskC4153ww2.executeOnExecutor((ThreadPoolExecutor) c4297ze2.f36133u, new Object[0]);
                        }
                    }
                } else {
                    hashSet = hashSet6;
                    cVar.getClass();
                    AsyncTaskC4207xw asyncTaskC4207xw = new AsyncTaskC4207xw(cVar);
                    C4297ze c4297ze3 = (C4297ze) cVar.f2903v;
                    asyncTaskC4207xw.f35685a = c4297ze3;
                    ArrayDeque arrayDeque3 = (ArrayDeque) c4297ze3.f36134v;
                    arrayDeque3.add(asyncTaskC4207xw);
                    if (((AbstractAsyncTaskC4153ww) c4297ze3.f36135w) == null) {
                        AbstractAsyncTaskC4153ww abstractAsyncTaskC4153ww3 = (AbstractAsyncTaskC4153ww) arrayDeque3.poll();
                        c4297ze3.f36135w = abstractAsyncTaskC4153ww3;
                        if (abstractAsyncTaskC4153ww3 != null) {
                            abstractAsyncTaskC4153ww3.executeOnExecutor((ThreadPoolExecutor) c4297ze3.f36133u, new Object[0]);
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
                c2618Hq.f26132n = false;
                hashSet9.clear();
                long nanoTime2 = System.nanoTime() - c4099vw.f35538f;
                ArrayList arrayList2 = c4099vw.f35533a;
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
                C3614mw c3614mw = C3614mw.f33405d;
                Context context2 = (Context) c3614mw.f33406a.get();
                if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean isDeviceLocked = keyguardManager.isDeviceLocked();
                c3614mw.a(c3614mw.f33407b, isDeviceLocked);
                c3614mw.f33408c = isDeviceLocked;
                return;
            case 8:
                Handler handler = C4099vw.i;
                if (handler != null) {
                    handler.post(C4099vw.f35531j);
                    C4099vw.i.postDelayed(C4099vw.f35532k, 200L);
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
