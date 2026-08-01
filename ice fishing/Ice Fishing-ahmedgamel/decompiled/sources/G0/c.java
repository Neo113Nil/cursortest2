package G0;

import L3.r;
import L3.x;
import L3.y;
import O.E0;
import O.X;
import O2.C0369t;
import O2.D;
import O2.O;
import O2.T;
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
import androidx.fragment.app.AbstractComponentCallbacksC0475s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n;
import androidx.fragment.app.N;
import androidx.lifecycle.C;
import androidx.viewpager.widget.ViewPager;
import androidx.work.Worker;
import com.bumptech.glide.p;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import com.icefishinggame.icefishinggamemultigames.IntroActivity;
import com.icefishinggame.icefishinggamemultigames.MainActivity;
import com.icefishinggame.icefishinggamemultigames.w;
import h.C4539G;
import i3.C4582a;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.m;
import m.C4706p0;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1030n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1031u;

    public /* synthetic */ c(int i, Object obj) {
        this.f1030n = i;
        this.f1031u = obj;
    }

    private final void a() {
        l8.a b9;
        long j6;
        l8.a b10;
        l8.d dVar = (l8.d) this.f1031u;
        synchronized (dVar) {
            dVar.f38954g++;
            b9 = dVar.b();
        }
        if (b9 == null) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        while (true) {
            try {
                currentThread.setName(b9.f38934a);
                Logger logger = ((l8.d) this.f1031u).f38949b;
                l8.c cVar = b9.f38936c;
                kotlin.jvm.internal.h.b(cVar);
                boolean isLoggable = logger.isLoggable(Level.FINE);
                if (isLoggable) {
                    F1.a aVar = cVar.f38940a.f38948a;
                    j6 = System.nanoTime();
                    d6.c.a(logger, b9, cVar, "starting");
                } else {
                    j6 = -1;
                }
                try {
                    long a9 = b9.a();
                    if (isLoggable) {
                        F1.a aVar2 = cVar.f38940a.f38948a;
                        d6.c.a(logger, b9, cVar, "finished run in " + d6.c.e(System.nanoTime() - j6));
                    }
                    l8.d dVar2 = (l8.d) this.f1031u;
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
                        F1.a aVar3 = cVar.f38940a.f38948a;
                        d6.c.a(logger, b9, cVar, "failed a run in " + d6.c.e(System.nanoTime() - j6));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    l8.d dVar3 = (l8.d) this.f1031u;
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
        switch (this.f1030n) {
            case 0:
                ViewPager viewPager = (ViewPager) this.f1031u;
                viewPager.setScrollState(0);
                viewPager.p();
                return;
            case 1:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f1031u).f36131v.f1170z;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 2:
                Worker worker = (Worker) this.f1031u;
                try {
                    worker.f5356n.j(worker.doWork());
                    return;
                } catch (Throwable th) {
                    worker.f5356n.k(th);
                    return;
                }
            case 3:
                if (((j3.h) this.f1031u).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 4:
                Z2.e eVar = (Z2.e) this.f1031u;
                View view = (View) eVar.f4172w;
                if (view == null) {
                    return;
                }
                Activity activity = (Activity) eVar.f4170u;
                if (activity.isInPictureInPictureMode()) {
                    eVar.L();
                    return;
                }
                try {
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = Math.min(activity.getResources().getDimensionPixelSize(C5275R.dimen.sdk_hsdp_loading_ui_height), (int) (d6.c.t(activity) * 0.6f));
                        if (activity.getResources().getConfiguration().screenWidthDp > 640) {
                            layoutParams.width = d6.c.s(activity, 640);
                        } else {
                            layoutParams.width = -1;
                        }
                        ((WindowManager) eVar.f4171v).updateViewLayout(view, layoutParams);
                        Log.i("HsdpLoadingPanel", "updateLoadingView: updated window size.");
                        return;
                    }
                    return;
                } catch (RuntimeException e10) {
                    Log.e("HsdpLoadingPanel", "updateLoadingView: error updating window size.", e10);
                    return;
                }
            case 5:
                y yVar = ((x) this.f1031u).f1741n;
                if (yVar.f1751k != null) {
                    if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                        Log.i("ServiceConnMgrImpl", "unlinkToDeath");
                    }
                    IInterface iInterface = yVar.f1751k;
                    iInterface.getClass();
                    iInterface.asBinder().unlinkToDeath(yVar.i, 0);
                    yVar.f1751k = null;
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in onServiceDisconnected()");
                    yVar.b();
                }
                yVar.f1747f = false;
                return;
            case 6:
                Iterator it = ((L3.g) this.f1031u).f1694c.values().iterator();
                while (it.hasNext()) {
                    ((r) it.next()).a(4);
                    it.remove();
                }
                Log.d("HsdpClientImpl", "HSDP overlays: empty");
                return;
            case 7:
                C0369t c0369t = (C0369t) this.f1031u;
                M2.f fVar = c0369t.f2288w;
                Context context = c0369t.f2287v;
                fVar.getClass();
                if (M2.h.f1845a.getAndSet(true)) {
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
                ((D) this.f1031u).e();
                return;
            case 9:
                N2.c cVar = ((D) ((I0.j) this.f1031u).f1264u).f2172u;
                cVar.d(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 10:
                ((O) this.f1031u).f2208z.b(new M2.b(4, null, null));
                return;
            case 11:
                throw null;
            case 12:
                U.g gVar = (U.g) this.f1031u;
                if (gVar.f3117H) {
                    boolean z3 = gVar.f3115F;
                    U.a aVar = gVar.f3119n;
                    if (z3) {
                        gVar.f3115F = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f3105e = currentAnimationTimeMillis;
                        aVar.f3107g = -1L;
                        aVar.f3106f = currentAnimationTimeMillis;
                        aVar.f3108h = 0.5f;
                    }
                    if ((aVar.f3107g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f3107g + aVar.i) || !gVar.f()) {
                        gVar.f3117H = false;
                        return;
                    }
                    boolean z6 = gVar.f3116G;
                    ListView listView = gVar.f3121v;
                    if (z6) {
                        gVar.f3116G = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f3106f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a9 = aVar.a(currentAnimationTimeMillis2);
                    long j6 = currentAnimationTimeMillis2 - aVar.f3106f;
                    aVar.f3106f = currentAnimationTimeMillis2;
                    gVar.J.scrollListBy((int) (j6 * ((a9 * 4.0f) + ((-4.0f) * a9 * a9)) * aVar.f3104d));
                    WeakHashMap weakHashMap = X.f2054a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 13:
                ((W.e) this.f1031u).p(0);
                return;
            case 14:
                Z2.e eVar2 = (Z2.e) this.f1031u;
                long j9 = Z2.e.N((Context) eVar2.f4170u).getLong("app_set_id_last_used_time", -1L);
                long j10 = j9 != -1 ? j9 + 33696000000L : -1L;
                if (j10 == -1 || System.currentTimeMillis() <= j10) {
                    return;
                }
                Context context2 = (Context) eVar2.f4170u;
                if (!Z2.e.N(context2).edit().remove("app_set_id").commit()) {
                    String valueOf = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context2.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context2.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 15:
                a0.f fVar2 = (a0.f) this.f1031u;
                int i = fVar2.f4244b.f3392o;
                int i6 = fVar2.f4243a;
                boolean z9 = i6 == 3;
                DrawerLayout drawerLayout = fVar2.f4246d;
                if (z9) {
                    e9 = drawerLayout.e(3);
                    width = (e9 != null ? -e9.getWidth() : 0) + i;
                } else {
                    e9 = drawerLayout.e(5);
                    width = drawerLayout.getWidth() - i;
                }
                if (e9 != null) {
                    if (((!z9 || e9.getLeft() >= width) && (z9 || e9.getLeft() <= width)) || drawerLayout.i(e9) != 0) {
                        return;
                    }
                    a0.d dVar = (a0.d) e9.getLayoutParams();
                    fVar2.f4244b.s(width, e9.getTop(), e9);
                    dVar.f4236c = true;
                    drawerLayout.invalidate();
                    View e12 = drawerLayout.e(i6 == 3 ? 5 : 3);
                    if (e12 != null) {
                        drawerLayout.b(e12);
                    }
                    if (drawerLayout.f4741K) {
                        return;
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent obtain2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        drawerLayout.getChildAt(i9).dispatchTouchEvent(obtain2);
                    }
                    obtain2.recycle();
                    drawerLayout.f4741K = true;
                    return;
                }
                return;
            case 16:
                DialogInterfaceOnCancelListenerC0471n dialogInterfaceOnCancelListenerC0471n = (DialogInterfaceOnCancelListenerC0471n) this.f1031u;
                dialogInterfaceOnCancelListenerC0471n.f5001A0.onDismiss(dialogInterfaceOnCancelListenerC0471n.f5008I0);
                return;
            case 17:
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = (AbstractComponentCallbacksC0475s) this.f1031u;
                if (abstractComponentCallbacksC0475s.f5053n0 != null) {
                    abstractComponentCallbacksC0475s.b().getClass();
                    return;
                }
                return;
            case 18:
                ((N) this.f1031u).x(true);
                return;
            case 19:
                synchronized (((C) this.f1031u).f5091a) {
                    obj = ((C) this.f1031u).f5096f;
                    ((C) this.f1031u).f5096f = C.f5090k;
                }
                ((C) this.f1031u).e(obj);
                return;
            case 20:
                p pVar = (p) this.f1031u;
                pVar.f23493v.c(pVar);
                return;
            case 21:
                MediaView mediaView = (MediaView) this.f1031u;
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
            case 22:
                int i10 = Build.VERSION.SDK_INT;
                IntroActivity introActivity = ((com.icefishinggame.icefishinggamemultigames.p) this.f1031u).f36929a;
                E0 h9 = i10 >= 30 ? X.h(introActivity.getWindow().getDecorView()) : new E0(introActivity.getWindow(), null);
                Objects.requireNonNull(h9);
                h9.f2039a.j();
                return;
            case 23:
                w wVar = (w) this.f1031u;
                wVar.f36944n.f36848U = r2.f36834N.getCurrentItem() + 1;
                MainActivity mainActivity = wVar.f36944n;
                double d2 = mainActivity.f36848U;
                if (d2 <= 5.0d) {
                    mainActivity.f36834N.setCurrentItem((int) d2);
                    return;
                } else {
                    mainActivity.f36848U = 0.0d;
                    mainActivity.f36834N.setCurrentItem((int) 0.0d);
                    return;
                }
            case 24:
                C4539G c4539g = (C4539G) this.f1031u;
                h.w wVar2 = c4539g.f37819b;
                Menu t6 = c4539g.t();
                m mVar = t6 instanceof m ? (m) t6 : null;
                if (mVar != null) {
                    mVar.w();
                }
                try {
                    t6.clear();
                    if (wVar2.onCreatePanelMenu(0, t6)) {
                        if (!wVar2.onPreparePanel(0, null, t6)) {
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
                C4582a c4582a = (C4582a) this.f1031u;
                synchronized (c4582a.f38046a) {
                    try {
                        if (c4582a.b()) {
                            Log.e("WakeLock", String.valueOf(c4582a.f38054j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            c4582a.d();
                            if (c4582a.b()) {
                                c4582a.f38048c = 1;
                                c4582a.e();
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
                C4706p0 c4706p0 = (C4706p0) this.f1031u;
                c4706p0.f39203E = null;
                c4706p0.drawableStateChanged();
                return;
            case 28:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f1031u;
                if (searchView$SearchAutoComplete.f4583y) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f4583y = false;
                    return;
                }
                return;
            default:
                ((Toolbar) this.f1031u).v();
                return;
        }
    }

    public c(T t6, G1.a aVar) {
        this.f1030n = 11;
        this.f1031u = aVar;
    }
}
