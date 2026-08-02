package G0;

import N3.C;
import N3.o;
import N3.u;
import N3.v;
import O.E0;
import O.X;
import Q2.C0373s;
import Q2.N;
import Q2.S;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.IInterface;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.AbstractComponentCallbacksC0479s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n;
import androidx.viewpager.widget.ViewPager;
import androidx.work.Worker;
import com.IceFishing.LiveIceFishing.C5248R;
import com.IceFishing.LiveIceFishing.IntroActivity;
import com.IceFishing.LiveIceFishing.MainActivity;
import com.IceFishing.LiveIceFishing.p;
import com.IceFishing.LiveIceFishing.x;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import h.C4543G;
import h.C4544H;
import h.w;
import i1.C4585b;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import k3.C4643a;
import l.m;
import m.C4719p0;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1056n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1057u;

    public /* synthetic */ c(int i, Object obj) {
        this.f1056n = i;
        this.f1057u = obj;
    }

    private final void a() {
        l8.a b9;
        long j6;
        l8.a b10;
        l8.d dVar = (l8.d) this.f1057u;
        synchronized (dVar) {
            dVar.f39022g++;
            b9 = dVar.b();
        }
        if (b9 == null) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        while (true) {
            try {
                currentThread.setName(b9.f39002a);
                Logger logger = ((l8.d) this.f1057u).f39017b;
                l8.c cVar = b9.f39004c;
                kotlin.jvm.internal.h.b(cVar);
                boolean isLoggable = logger.isLoggable(Level.FINE);
                if (isLoggable) {
                    C4543G c4543g = cVar.f39008a.f39016a;
                    j6 = System.nanoTime();
                    d6.c.a(logger, b9, cVar, "starting");
                } else {
                    j6 = -1;
                }
                try {
                    long a9 = b9.a();
                    if (isLoggable) {
                        C4543G c4543g2 = cVar.f39008a.f39016a;
                        d6.c.a(logger, b9, cVar, "finished run in " + d6.c.d(System.nanoTime() - j6));
                    }
                    l8.d dVar2 = (l8.d) this.f1057u;
                    synchronized (dVar2) {
                        l8.d.a(dVar2, b9, a9, true);
                        b10 = dVar2.b();
                    }
                    if (b10 == null) {
                        return;
                    } else {
                        b9 = b10;
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        C4543G c4543g3 = cVar.f39008a.f39016a;
                        d6.c.a(logger, b9, cVar, "failed a run in " + d6.c.d(System.nanoTime() - j6));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    l8.d dVar3 = (l8.d) this.f1057u;
                    synchronized (dVar3) {
                        l8.d.a(dVar3, b9, -1L, false);
                        if (!(th2 instanceof InterruptedException)) {
                            throw th2;
                        }
                        Thread.currentThread().interrupt();
                        return;
                    }
                } finally {
                    currentThread.setName(name);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        View e9;
        int width;
        Object obj;
        AdViewConstructorParams adViewConstructorParams;
        MediaViewApi mediaViewApi;
        MediaViewApi mediaViewApi2;
        AdViewConstructorParams adViewConstructorParams2;
        switch (this.f1056n) {
            case 0:
                ViewPager viewPager = (ViewPager) this.f1057u;
                viewPager.setScrollState(0);
                viewPager.p();
                return;
            case 1:
                Worker worker = (Worker) this.f1057u;
                try {
                    worker.f5321n.j(worker.doWork());
                    return;
                } catch (Throwable th) {
                    worker.f5321n.k(th);
                    return;
                }
            case 2:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f1057u).f36898v.f1526z;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 3:
                if (((l3.h) this.f1057u).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 4:
                b3.e eVar = (b3.e) this.f1057u;
                View view = (View) eVar.f5559w;
                if (view == null) {
                    return;
                }
                Activity activity = (Activity) eVar.f5557u;
                if (activity.isInPictureInPictureMode()) {
                    eVar.L();
                    return;
                }
                try {
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = Math.min(activity.getResources().getDimensionPixelSize(C5248R.dimen.sdk_hsdp_loading_ui_height), (int) (C.W(activity) * 0.6f));
                        if (activity.getResources().getConfiguration().screenWidthDp > 640) {
                            layoutParams.width = C.T(activity, 640);
                        } else {
                            layoutParams.width = -1;
                        }
                        ((WindowManager) eVar.f5558v).updateViewLayout(view, layoutParams);
                        Log.i("HsdpLoadingPanel", "updateLoadingView: updated window size.");
                        return;
                    }
                    return;
                } catch (RuntimeException e10) {
                    Log.e("HsdpLoadingPanel", "updateLoadingView: error updating window size.", e10);
                    return;
                }
            case 5:
                v vVar = ((u) this.f1057u).f2013n;
                if (vVar.f2023k != null) {
                    if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                        Log.i("ServiceConnMgrImpl", "unlinkToDeath");
                    }
                    IInterface iInterface = vVar.f2023k;
                    iInterface.getClass();
                    iInterface.asBinder().unlinkToDeath(vVar.i, 0);
                    vVar.f2023k = null;
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in onServiceDisconnected()");
                    vVar.b();
                }
                vVar.f2019f = false;
                return;
            case 6:
                Iterator it = ((N3.g) this.f1057u).f1973c.values().iterator();
                while (it.hasNext()) {
                    ((o) it.next()).a(4);
                    it.remove();
                }
                Log.d("HsdpClientImpl", "HSDP overlays: empty");
                return;
            case 7:
                C0373s c0373s = (C0373s) this.f1057u;
                O2.f fVar = c0373s.f2604w;
                Context context = c0373s.f2603v;
                fVar.getClass();
                if (O2.h.f2271a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e11) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e11);
                    return;
                }
            case 8:
                ((Q2.C) this.f1057u).e();
                return;
            case 9:
                P2.c cVar = ((Q2.C) ((C4585b) this.f1057u).f38152u).f2490u;
                cVar.b(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 10:
                ((N) this.f1057u).f2526z.b(new O2.b(4, null, null));
                return;
            case 11:
                throw null;
            case 12:
                U.g gVar = (U.g) this.f1057u;
                if (gVar.f3234H) {
                    boolean z6 = gVar.f3232F;
                    U.a aVar = gVar.f3236n;
                    if (z6) {
                        gVar.f3232F = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f3222e = currentAnimationTimeMillis;
                        aVar.f3224g = -1L;
                        aVar.f3223f = currentAnimationTimeMillis;
                        aVar.f3225h = 0.5f;
                    }
                    if ((aVar.f3224g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f3224g + aVar.i) || !gVar.f()) {
                        gVar.f3234H = false;
                        return;
                    }
                    boolean z9 = gVar.f3233G;
                    ListView listView = gVar.f3238v;
                    if (z9) {
                        gVar.f3233G = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f3223f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a9 = aVar.a(currentAnimationTimeMillis2);
                    long j6 = currentAnimationTimeMillis2 - aVar.f3223f;
                    aVar.f3223f = currentAnimationTimeMillis2;
                    gVar.J.scrollListBy((int) (j6 * ((a9 * 4.0f) + ((-4.0f) * a9 * a9)) * aVar.f3221d));
                    WeakHashMap weakHashMap = X.f2142a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 13:
                ((W.e) this.f1057u).p(0);
                return;
            case 14:
                a0.f fVar2 = (a0.f) this.f1057u;
                int i = fVar2.f4221b.f3522o;
                int i4 = fVar2.f4220a;
                boolean z10 = i4 == 3;
                DrawerLayout drawerLayout = fVar2.f4223d;
                if (z10) {
                    e9 = drawerLayout.e(3);
                    width = (e9 != null ? -e9.getWidth() : 0) + i;
                } else {
                    e9 = drawerLayout.e(5);
                    width = drawerLayout.getWidth() - i;
                }
                if (e9 != null) {
                    if (((!z10 || e9.getLeft() >= width) && (z10 || e9.getLeft() <= width)) || drawerLayout.i(e9) != 0) {
                        return;
                    }
                    a0.d dVar = (a0.d) e9.getLayoutParams();
                    fVar2.f4221b.s(width, e9.getTop(), e9);
                    dVar.f4213c = true;
                    drawerLayout.invalidate();
                    View e12 = drawerLayout.e(i4 == 3 ? 5 : 3);
                    if (e12 != null) {
                        drawerLayout.b(e12);
                    }
                    if (drawerLayout.f4709K) {
                        return;
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent obtain2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i6 = 0; i6 < childCount; i6++) {
                        drawerLayout.getChildAt(i6).dispatchTouchEvent(obtain2);
                    }
                    obtain2.recycle();
                    drawerLayout.f4709K = true;
                    return;
                }
                return;
            case 15:
                DialogInterfaceOnCancelListenerC0475n dialogInterfaceOnCancelListenerC0475n = (DialogInterfaceOnCancelListenerC0475n) this.f1057u;
                dialogInterfaceOnCancelListenerC0475n.f4977v0.onDismiss(dialogInterfaceOnCancelListenerC0475n.f4971D0);
                return;
            case 16:
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = (AbstractComponentCallbacksC0479s) this.f1057u;
                if (abstractComponentCallbacksC0479s.f5020i0 != null) {
                    abstractComponentCallbacksC0479s.b().getClass();
                    return;
                }
                return;
            case 17:
                ((androidx.fragment.app.N) this.f1057u).x(true);
                return;
            case 18:
                synchronized (((androidx.lifecycle.C) this.f1057u).f5058a) {
                    obj = ((androidx.lifecycle.C) this.f1057u).f5063f;
                    ((androidx.lifecycle.C) this.f1057u).f5063f = androidx.lifecycle.C.f5057k;
                }
                ((androidx.lifecycle.C) this.f1057u).e(obj);
                return;
            case 19:
                b3.e eVar2 = (b3.e) this.f1057u;
                long j9 = b3.e.N((Context) eVar2.f5557u).getLong("app_set_id_last_used_time", -1L);
                long j10 = j9 != -1 ? j9 + 33696000000L : -1L;
                if (j10 == -1 || System.currentTimeMillis() <= j10) {
                    return;
                }
                Context context2 = (Context) eVar2.f5557u;
                if (!b3.e.N(context2).edit().remove("app_set_id").commit()) {
                    String valueOf = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context2.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context2.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 20:
                int i9 = Build.VERSION.SDK_INT;
                IntroActivity introActivity = ((p) this.f1057u).f6418a;
                E0 h3 = i9 >= 30 ? X.h(introActivity.getWindow().getDecorView()) : new E0(introActivity.getWindow(), null);
                Objects.requireNonNull(h3);
                h3.f2127a.d();
                return;
            case 21:
                x xVar = (x) this.f1057u;
                xVar.f6435n.f6338U = r2.f6324N.getCurrentItem() + 1;
                MainActivity mainActivity = xVar.f6435n;
                double d9 = mainActivity.f6338U;
                if (d9 <= 5.0d) {
                    mainActivity.f6324N.setCurrentItem((int) d9);
                    return;
                } else {
                    mainActivity.f6338U = 0.0d;
                    mainActivity.f6324N.setCurrentItem((int) 0.0d);
                    return;
                }
            case 22:
                com.bumptech.glide.p pVar = (com.bumptech.glide.p) this.f1057u;
                pVar.f24278v.h(pVar);
                return;
            case 23:
                MediaView mediaView = (MediaView) this.f1057u;
                mediaView.removeAllViews();
                ((AdNativeComponentView) mediaView).mAdComponentViewApi = null;
                adViewConstructorParams = mediaView.mConstructorParams;
                mediaView.mMediaViewApi = DynamicLoaderFactory.makeLoader(adViewConstructorParams.getContext()).createMediaViewApi();
                mediaViewApi = mediaView.mMediaViewApi;
                mediaView.attachAdComponentViewApi(mediaViewApi);
                mediaViewApi2 = mediaView.mMediaViewApi;
                adViewConstructorParams2 = mediaView.mConstructorParams;
                mediaViewApi2.initialize(adViewConstructorParams2, mediaView);
                return;
            case 24:
                C4544H c4544h = (C4544H) this.f1057u;
                w wVar = c4544h.f37845b;
                Menu t6 = c4544h.t();
                m mVar = t6 instanceof m ? (m) t6 : null;
                if (mVar != null) {
                    mVar.w();
                }
                try {
                    t6.clear();
                    if (wVar.onCreatePanelMenu(0, t6)) {
                        if (!wVar.onPreparePanel(0, null, t6)) {
                        }
                        if (mVar == null) {
                            mVar.v();
                            return;
                        }
                        return;
                    }
                    t6.clear();
                    if (mVar == null) {
                    }
                } catch (Throwable th2) {
                    if (mVar != null) {
                        mVar.v();
                    }
                    throw th2;
                }
            case 25:
                C4643a c4643a = (C4643a) this.f1057u;
                synchronized (c4643a.f38583a) {
                    try {
                        if (c4643a.b()) {
                            Log.e("WakeLock", String.valueOf(c4643a.f38591j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            c4643a.d();
                            if (c4643a.b()) {
                                c4643a.f38585c = 1;
                                c4643a.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 26:
                a();
                return;
            case 27:
                C4719p0 c4719p0 = (C4719p0) this.f1057u;
                c4719p0.f39272E = null;
                c4719p0.drawableStateChanged();
                return;
            case 28:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f1057u;
                if (searchView$SearchAutoComplete.f4551y) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f4551y = false;
                    return;
                }
                return;
            default:
                ((Toolbar) this.f1057u).v();
                return;
        }
    }

    public c(S s9, I1.a aVar) {
        this.f1056n = 11;
        this.f1057u = aVar;
    }
}
