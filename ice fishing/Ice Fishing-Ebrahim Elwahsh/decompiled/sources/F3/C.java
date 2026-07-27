package F3;

import N2.C0332s;
import N2.N;
import N2.S;
import O.E0;
import O.X;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.AbstractComponentCallbacksC0485s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n;
import androidx.viewpager.widget.ViewPager;
import androidx.work.Worker;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.icefishing.icefishingliveapp.IntroActivity;
import com.icefishing.icefishingliveapp.MainActivity;
import g1.C4523c;
import g3.C4527a;
import h.C4541H;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import m.C4754p0;
import q2.InterfaceC4922x;
import q2.O0;
import q2.Q0;

/* loaded from: classes2.dex */
public final class C implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1009n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1010u;

    public /* synthetic */ C(int i, Object obj) {
        this.f1009n = i;
        this.f1010u = obj;
    }

    private final void a() {
        h8.a b9;
        long j9;
        h8.a b10;
        h8.e eVar = (h8.e) this.f1010u;
        synchronized (eVar) {
            eVar.f38270g++;
            b9 = eVar.b();
        }
        if (b9 == null) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        while (true) {
            try {
                currentThread.setName(b9.f38248a);
                Logger logger = ((h8.e) this.f1010u).f38265b;
                h8.c cVar = b9.f38250c;
                kotlin.jvm.internal.h.b(cVar);
                boolean isLoggable = logger.isLoggable(Level.FINE);
                if (isLoggable) {
                    h8.d dVar = cVar.f38254a.f38264a;
                    j9 = System.nanoTime();
                    com.bumptech.glide.e.a(logger, b9, cVar, "starting");
                } else {
                    j9 = -1;
                }
                try {
                    long a9 = b9.a();
                    if (isLoggable) {
                        h8.d dVar2 = cVar.f38254a.f38264a;
                        com.bumptech.glide.e.a(logger, b9, cVar, "finished run in " + com.bumptech.glide.e.m(System.nanoTime() - j9));
                    }
                    h8.e eVar2 = (h8.e) this.f1010u;
                    synchronized (eVar2) {
                        h8.e.a(eVar2, b9, a9, true);
                        b10 = eVar2.b();
                    }
                    if (b10 == null) {
                        return;
                    } else {
                        b9 = b10;
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        h8.d dVar3 = cVar.f38254a.f38264a;
                        com.bumptech.glide.e.a(logger, b9, cVar, "failed a run in " + com.bumptech.glide.e.m(System.nanoTime() - j9));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    h8.e eVar3 = (h8.e) this.f1010u;
                    synchronized (eVar3) {
                        h8.e.a(eVar3, b9, -1L, false);
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

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        View e6;
        int width;
        Object obj;
        AdViewConstructorParams adViewConstructorParams;
        MediaViewApi mediaViewApi;
        MediaViewApi mediaViewApi2;
        AdViewConstructorParams adViewConstructorParams2;
        switch (this.f1009n) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f1010u).f36296v.f1083z;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                ViewPager viewPager = (ViewPager) this.f1010u;
                viewPager.setScrollState(0);
                viewPager.p();
                return;
            case 2:
                Worker worker = (Worker) this.f1010u;
                try {
                    worker.f5468n.j(worker.doWork());
                    return;
                } catch (Throwable th) {
                    worker.f5468n.k(th);
                    return;
                }
            case 3:
                if (((h3.h) this.f1010u).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 4:
                C0332s c0332s = (C0332s) this.f1010u;
                L2.f fVar = c0332s.f2103w;
                Context context = c0332s.f2102v;
                fVar.getClass();
                if (L2.h.f1727a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e9) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e9);
                    return;
                }
            case 5:
                ((N2.C) this.f1010u).e();
                return;
            case 6:
                M2.c cVar = ((N2.C) ((C4523c) this.f1010u).f37856u).f1989u;
                cVar.c(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 7:
                ((N) this.f1010u).f2025z.b(new L2.b(4, null, null));
                return;
            case 8:
                throw null;
            case 9:
                U.g gVar = (U.g) this.f1010u;
                if (gVar.f3196H) {
                    boolean z8 = gVar.f3194F;
                    U.a aVar = gVar.f3198n;
                    if (z8) {
                        gVar.f3194F = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f3184e = currentAnimationTimeMillis;
                        aVar.f3186g = -1L;
                        aVar.f3185f = currentAnimationTimeMillis;
                        aVar.f3187h = 0.5f;
                    }
                    if ((aVar.f3186g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f3186g + aVar.i) || !gVar.f()) {
                        gVar.f3196H = false;
                        return;
                    }
                    boolean z9 = gVar.f3195G;
                    ListView listView = gVar.f3200v;
                    if (z9) {
                        gVar.f3195G = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f3185f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a9 = aVar.a(currentAnimationTimeMillis2);
                    long j9 = currentAnimationTimeMillis2 - aVar.f3185f;
                    aVar.f3185f = currentAnimationTimeMillis2;
                    gVar.J.scrollListBy((int) (j9 * ((a9 * 4.0f) + ((-4.0f) * a9 * a9)) * aVar.f3183d));
                    WeakHashMap weakHashMap = X.f2240a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 10:
                ((W.e) this.f1010u).p(0);
                return;
            case 11:
                Y2.e eVar = (Y2.e) this.f1010u;
                long j10 = Y2.e.O((Context) eVar.f3963u).getLong("app_set_id_last_used_time", -1L);
                long j11 = j10 != -1 ? j10 + 33696000000L : -1L;
                if (j11 == -1 || System.currentTimeMillis() <= j11) {
                    return;
                }
                Context context2 = (Context) eVar.f3963u;
                if (!Y2.e.O(context2).edit().remove("app_set_id").commit()) {
                    String valueOf = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context2.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context2.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 12:
                a0.f fVar2 = (a0.f) this.f1010u;
                int i = fVar2.f4293b.f3404o;
                int i4 = fVar2.f4292a;
                boolean z10 = i4 == 3;
                DrawerLayout drawerLayout = fVar2.f4295d;
                if (z10) {
                    e6 = drawerLayout.e(3);
                    width = (e6 != null ? -e6.getWidth() : 0) + i;
                } else {
                    e6 = drawerLayout.e(5);
                    width = drawerLayout.getWidth() - i;
                }
                if (e6 != null) {
                    if (((!z10 || e6.getLeft() >= width) && (z10 || e6.getLeft() <= width)) || drawerLayout.i(e6) != 0) {
                        return;
                    }
                    a0.d dVar = (a0.d) e6.getLayoutParams();
                    fVar2.f4293b.s(width, e6.getTop(), e6);
                    dVar.f4285c = true;
                    drawerLayout.invalidate();
                    View e10 = drawerLayout.e(i4 == 3 ? 5 : 3);
                    if (e10 != null) {
                        drawerLayout.b(e10);
                    }
                    if (drawerLayout.f4856K) {
                        return;
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent obtain2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        drawerLayout.getChildAt(i9).dispatchTouchEvent(obtain2);
                    }
                    obtain2.recycle();
                    drawerLayout.f4856K = true;
                    return;
                }
                return;
            case 13:
                DialogInterfaceOnCancelListenerC0481n dialogInterfaceOnCancelListenerC0481n = (DialogInterfaceOnCancelListenerC0481n) this.f1010u;
                dialogInterfaceOnCancelListenerC0481n.f5113A0.onDismiss(dialogInterfaceOnCancelListenerC0481n.f5120I0);
                return;
            case 14:
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = (AbstractComponentCallbacksC0485s) this.f1010u;
                if (abstractComponentCallbacksC0485s.f5165n0 != null) {
                    abstractComponentCallbacksC0485s.b().getClass();
                    return;
                }
                return;
            case 15:
                ((androidx.fragment.app.N) this.f1010u).x(true);
                return;
            case 16:
                synchronized (((androidx.lifecycle.C) this.f1010u).f5203a) {
                    obj = ((androidx.lifecycle.C) this.f1010u).f5208f;
                    ((androidx.lifecycle.C) this.f1010u).f5208f = androidx.lifecycle.C.f5202k;
                }
                ((androidx.lifecycle.C) this.f1010u).e(obj);
                return;
            case 17:
                com.bumptech.glide.p pVar = (com.bumptech.glide.p) this.f1010u;
                pVar.f23647v.b(pVar);
                return;
            case 18:
                MediaView mediaView = (MediaView) this.f1010u;
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
            case 19:
                int i10 = Build.VERSION.SDK_INT;
                IntroActivity introActivity = ((com.icefishing.icefishingliveapp.o) this.f1010u).f37090a;
                E0 h9 = i10 >= 30 ? X.h(introActivity.getWindow().getDecorView()) : new E0(introActivity.getWindow(), null);
                Objects.requireNonNull(h9);
                h9.f2225a.i();
                return;
            case 20:
                com.icefishing.icefishingliveapp.v vVar = (com.icefishing.icefishingliveapp.v) this.f1010u;
                vVar.f37105n.f37009U = r2.f36995N.getCurrentItem() + 1;
                MainActivity mainActivity = vVar.f37105n;
                double d2 = mainActivity.f37009U;
                if (d2 <= 5.0d) {
                    mainActivity.f36995N.setCurrentItem((int) d2);
                    return;
                } else {
                    mainActivity.f37009U = 0.0d;
                    mainActivity.f36995N.setCurrentItem((int) 0.0d);
                    return;
                }
            case 21:
                C4527a c4527a = (C4527a) this.f1010u;
                synchronized (c4527a.f37887a) {
                    try {
                        if (c4527a.b()) {
                            Log.e("WakeLock", String.valueOf(c4527a.f37895j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            c4527a.d();
                            if (c4527a.b()) {
                                c4527a.f37889c = 1;
                                c4527a.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 22:
                C4541H c4541h = (C4541H) this.f1010u;
                h.x xVar = c4541h.f38032b;
                Menu t9 = c4541h.t();
                l.l lVar = t9 instanceof l.l ? (l.l) t9 : null;
                if (lVar != null) {
                    lVar.w();
                }
                try {
                    t9.clear();
                    if (xVar.onCreatePanelMenu(0, t9)) {
                        if (!xVar.onPreparePanel(0, null, t9)) {
                        }
                        if (lVar == null) {
                            lVar.v();
                            return;
                        }
                        return;
                    }
                    t9.clear();
                    if (lVar == null) {
                    }
                } catch (Throwable th2) {
                    if (lVar != null) {
                        lVar.v();
                    }
                    throw th2;
                }
            case 23:
                a();
                return;
            case 24:
                C4754p0 c4754p0 = (C4754p0) this.f1010u;
                c4754p0.f39474E = null;
                c4754p0.drawableStateChanged();
                return;
            case 25:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f1010u;
                if (searchView$SearchAutoComplete.f4698y) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f4698y = false;
                    return;
                }
                return;
            case 26:
                ((Toolbar) this.f1010u).v();
                return;
            case 27:
                D3.f fVar3 = (D3.f) this.f1010u;
                fVar3.f696b = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) fVar3.f699e;
                W.e eVar2 = bottomSheetBehavior.f36004M;
                if (eVar2 != null && eVar2.g()) {
                    fVar3.a(fVar3.f697c);
                    return;
                } else {
                    if (bottomSheetBehavior.f36003L == 2) {
                        bottomSheetBehavior.C(fVar3.f697c);
                        return;
                    }
                    return;
                }
            case 28:
                InterfaceC4922x interfaceC4922x = ((O0) this.f1010u).f39979n.f39980n;
                if (interfaceC4922x != null) {
                    try {
                        interfaceC4922x.D(1);
                        return;
                    } catch (RemoteException e11) {
                        u2.i.g("Could not notify onAdFailedToLoad event.", e11);
                        return;
                    }
                }
                return;
            default:
                InterfaceC4922x interfaceC4922x2 = ((Q0) this.f1010u).f39981n;
                if (interfaceC4922x2 != null) {
                    try {
                        interfaceC4922x2.D(1);
                        return;
                    } catch (RemoteException e12) {
                        u2.i.g("Could not notify onAdFailedToLoad event.", e12);
                        return;
                    }
                }
                return;
        }
    }

    public C(S s3, G1.a aVar) {
        this.f1009n = 8;
        this.f1010u = aVar;
    }

    public C(O0 o02) {
        this.f1009n = 28;
        Objects.requireNonNull(o02);
        this.f1010u = o02;
    }

    public C(Q0 q02) {
        this.f1009n = 29;
        Objects.requireNonNull(q02);
        this.f1010u = q02;
    }
}
