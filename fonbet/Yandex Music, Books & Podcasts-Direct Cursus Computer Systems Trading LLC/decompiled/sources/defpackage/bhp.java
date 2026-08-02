package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import com.yandex.pulse.metrics.o;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.YMApplication;
import ru.yandex.music.services.RoutineService;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class bhp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bhp(mmo mmoVar, g2t g2tVar) {
        this.a = 14;
        this.b = mmoVar;
    }

    private final void a() {
        z0j z0jVar = (z0j) this.b;
        Map map = null;
        ((AtomicReference) z0jVar.d).set(null);
        synchronized (z0jVar) {
            if (((AtomicMarkableReference) z0jVar.c).isMarked()) {
                jcf jcfVar = (jcf) ((AtomicMarkableReference) z0jVar.c).getReference();
                synchronized (jcfVar) {
                    map = Collections.unmodifiableMap(new HashMap(jcfVar.a));
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) z0jVar.c;
                atomicMarkableReference.set((jcf) atomicMarkableReference.getReference(), false);
            }
        }
        if (map != null) {
            rn5 rn5Var = (rn5) z0jVar.e;
            ((m0i) rn5Var.b).h((String) rn5Var.d, map, z0jVar.b);
        }
    }

    private final void b() {
        HashSet u0;
        Object t7oVar;
        cbw cbwVar = (cbw) this.b;
        synchronized (cbwVar) {
            try {
                if (!cbwVar.f.f) {
                    cbwVar.f.f = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    cbwVar.p = currentTimeMillis;
                    cbwVar.P.put("releaseTimestamp", Long.valueOf(currentTimeMillis));
                    yjj yjjVar = cbwVar.v;
                    synchronized (yjjVar.a) {
                        u0 = CollectionsKt.u0(yjjVar.a);
                    }
                    Iterator it = u0.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        try {
                            r7o r7oVar = z7o.b;
                            ((ove) next).E();
                            t7oVar = Unit.a;
                        } catch (Throwable th) {
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(th);
                        }
                        Throwable a = z7o.a(t7oVar);
                        if (a != null) {
                            Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                        }
                    }
                    cbwVar.L();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [arf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        heu heuVar;
        int i;
        heu heuVar2;
        HashSet u0;
        Object t7oVar;
        View findFocus;
        HashSet u02;
        boolean z = true;
        String str = null;
        switch (this.a) {
            case 0:
                ((ps1) this.b).d();
                return;
            case 1:
                n3m n3mVar = (n3m) this.b;
                synchronized (((ArrayDeque) n3mVar.e)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) n3mVar.b).edit();
                    String str2 = (String) n3mVar.c;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) n3mVar.e).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) n3mVar.d);
                    }
                    edit.putString(str2, sb.toString()).commit();
                }
                return;
            case 2:
                dfq dfqVar = (dfq) this.b;
                dfqVar.b = false;
                SideSheetBehavior sideSheetBehavior = dfqVar.d;
                heuVar = sideSheetBehavior.viewDragHelper;
                if (heuVar != null) {
                    heuVar2 = sideSheetBehavior.viewDragHelper;
                    if (heuVar2.g()) {
                        dfqVar.a(dfqVar.a);
                        return;
                    }
                }
                i = sideSheetBehavior.state;
                if (i == 2) {
                    sideSheetBehavior.setStateInternal(dfqVar.a);
                    return;
                }
                return;
            case 3:
                ((qrq) this.b).c();
                return;
            case 4:
                l6r l6rVar = (l6r) this.b;
                Surface surface = l6rVar.h;
                if (surface != null) {
                    Iterator it2 = l6rVar.a.iterator();
                    while (it2.hasNext()) {
                        ((urb) it2.next()).a.H1(null);
                    }
                }
                SurfaceTexture surfaceTexture = l6rVar.g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                l6rVar.g = null;
                l6rVar.h = null;
                return;
            case 5:
                k6r k6rVar = (k6r) this.b;
                Surface surface2 = k6rVar.h;
                if (surface2 != null) {
                    Iterator it3 = k6rVar.a.iterator();
                    if (it3.hasNext()) {
                        throw hrg.j(it3);
                    }
                }
                SurfaceTexture surfaceTexture2 = k6rVar.g;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface2 != null) {
                    surface2.release();
                }
                k6rVar.g = null;
                k6rVar.h = null;
                return;
            case 6:
                ((u9r) this.b).B();
                return;
            case 7:
                n3m n3mVar2 = (n3m) this.b;
                ((AtomicBoolean) n3mVar2.e).set(false);
                Object obj = ((AtomicReference) n3mVar2.c).get();
                yjj yjjVar = (yjj) n3mVar2.d;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it4 = u0.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ((qlr) next).a(obj);
                        t7oVar = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                }
                return;
            case 8:
                ((omr) this.b).f(false);
                return;
            case 9:
                wyr wyrVar = ((yyr) this.b).a;
                ViewParent parent = wyrVar.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(wyrVar);
                    return;
                }
                return;
            case 10:
                ((ozr) this.b).e = r0.a.getStreamVolume(3) / r0.a.getStreamMaxVolume(3);
                return;
            case 11:
                ((TextInputLayout) this.b).e.requestLayout();
                return;
            case 12:
                ocs ocsVar = (ocs) this.b;
                ime imeVar = ocsVar.b;
                ocsVar.n = null;
                eqi eqiVar = ocsVar.m;
                View view = ocsVar.a;
                if (!view.isFocused() && (findFocus = view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    eqiVar.i();
                    return;
                }
                xqn xqnVar = new xqn();
                xqn xqnVar2 = new xqn();
                Object[] objArr = eqiVar.a;
                int i2 = eqiVar.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    mcs mcsVar = (mcs) objArr[i3];
                    int ordinal = mcsVar.ordinal();
                    if (ordinal == 0) {
                        Boolean bool = Boolean.TRUE;
                        xqnVar.a = bool;
                        xqnVar2.a = bool;
                    } else if (ordinal == 1) {
                        Boolean bool2 = Boolean.FALSE;
                        xqnVar.a = bool2;
                        xqnVar2.a = bool2;
                    } else if ((ordinal == 2 || ordinal == 3) && !Intrinsics.d(xqnVar.a, Boolean.FALSE)) {
                        xqnVar2.a = Boolean.valueOf(mcsVar == mcs.c);
                    }
                }
                eqiVar.i();
                if (Intrinsics.d(xqnVar.a, Boolean.TRUE)) {
                    ((InputMethodManager) imeVar.c.getValue()).restartInput((View) imeVar.b);
                }
                Boolean bool3 = (Boolean) xqnVar2.a;
                if (bool3 != null) {
                    if (bool3.booleanValue()) {
                        ((f4m) ((knn) imeVar.d).b).A();
                    } else {
                        ((f4m) ((knn) imeVar.d).b).u();
                    }
                }
                if (Intrinsics.d(xqnVar.a, Boolean.FALSE)) {
                    ((InputMethodManager) imeVar.c.getValue()).restartInput((View) imeVar.b);
                    return;
                }
                return;
            case 13:
                try {
                    ((Runnable) this.b).run();
                    return;
                } finally {
                    Thread.interrupted();
                }
            case 14:
                yjj yjjVar2 = (yjj) ((mmo) this.b).g;
                synchronized (yjjVar2.a) {
                    u02 = CollectionsKt.u0(yjjVar2.a);
                }
                Iterator it5 = u02.iterator();
                while (it5.hasNext()) {
                    ((r9g) it5.next()).getClass();
                }
                return;
            case 15:
                z2t z2tVar = (z2t) this.b;
                PlayerState a2 = z2tVar.b.a();
                chs chsVar = z2tVar.x;
                chsVar.getClass();
                chsVar.a("TrackingObserver", "scheduleWatchEvents", "on30SecHeartbeat watched=" + a2.getWatchedTime(), new Object[0]);
                a aVar = z2tVar.a;
                aVar.getClass();
                chs chsVar2 = aVar.p;
                chsVar2.getClass();
                chsVar2.a("[EventTrackerImpl]", "on30SecHeartbeat", null, new Object[0]);
                cjb i4 = aVar.i();
                bjb j = aVar.j();
                if (aVar.l) {
                    x97.y(aVar.k, null, null, new ejb(j, null, aVar, a2, i4, 2), 3);
                    return;
                } else {
                    a.d(aVar, j, Event.f230_SEC_HEARTBEAT, a2, i4);
                    return;
                }
            case 16:
                TransportCardsActivity transportCardsActivity = (TransportCardsActivity) this.b;
                int i5 = TransportCardsActivity.i;
                n9t n9tVar = (n9t) transportCardsActivity.b.getValue();
                ViewGroup viewGroup = (ViewGroup) transportCardsActivity.findViewById(R.id.frameLayoutRoot);
                boolean z2 = transportCardsActivity.j().d().a.a;
                boolean H = ksw.H(transportCardsActivity);
                String stringExtra = transportCardsActivity.getIntent().getStringExtra("com.yandex.payment.sdk.ui.network.extra.TRANSPORT_CARD_DEEPLINK");
                String str3 = stringExtra == null ? "" : stringExtra;
                String stringExtra2 = transportCardsActivity.getIntent().getStringExtra("com.yandex.payment.sdk.ui.network.extra.TRANSPORT_CARD_BODY");
                String str4 = stringExtra2 == null ? "" : stringExtra2;
                ddl ddlVar = new ddl();
                qzc qzcVar = transportCardsActivity.f;
                if (qzcVar == null || ((ConstraintLayout) qzcVar.b) == null) {
                    xq0.q("Error binding is null");
                    return;
                } else {
                    viewGroup.getClass();
                    x97.y(ot0.F(n9tVar), null, null, new m9t(str4, n9tVar, transportCardsActivity, viewGroup, H, z2, str3, ddlVar, null), 3);
                    return;
                }
            case 17:
                rn5 rn5Var = (rn5) this.b;
                synchronized (((AtomicMarkableReference) rn5Var.h)) {
                    try {
                        if (((AtomicMarkableReference) rn5Var.h).isMarked()) {
                            str = (String) ((AtomicMarkableReference) rn5Var.h).getReference();
                            ((AtomicMarkableReference) rn5Var.h).set(str, false);
                        } else {
                            z = false;
                        }
                    } finally {
                    }
                }
                if (z) {
                    ((m0i) rn5Var.b).i((String) rn5Var.d, str);
                    return;
                }
                return;
            case 18:
                a();
                return;
            case 19:
                ((hav) this.b).invoke();
                return;
            case 20:
                vxt vxtVar = (vxt) this.b;
                vxtVar.c.setVisibility(vxtVar.b.c() == 0 ? 8 : 0);
                return;
            case 21:
                trv trvVar = (trv) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + trvVar.a.getAction() + " finishing.");
                trvVar.b.d(null);
                return;
            case 22:
                bjt bjtVar = (bjt) this.b;
                ((bko) bjtVar.d).D(new tot(9, bjtVar));
                return;
            case 23:
                i6w i6wVar = (i6w) this.b;
                i6wVar.a(h6w.NEXT_STEP).setText(R.string.next);
                i6wVar.a(h6w.SEND).setText(R.string.feedback_menu_send);
                return;
            case 24:
                YMApplication yMApplication = (YMApplication) this.b;
                ju0 ju0Var = YMApplication.d;
                String str5 = RoutineService.b;
                yMApplication.startService(new Intent(yMApplication, (Class<?>) RoutineService.class).setAction(RoutineService.b));
                return;
            case 25:
                sbp sbpVar = ((y7w) this.b).o;
                if (sbpVar != null) {
                    ((xpi) sbpVar.b.B.get()).a(Unit.a);
                    sbpVar.t();
                    return;
                }
                return;
            case 26:
                b9w b9wVar = (b9w) this.b;
                rnm rnmVar = b9wVar.h;
                rnmVar.getClass();
                rnmVar.b(b9wVar);
                return;
            case 27:
                b();
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((zaw) this.b).invoke();
                return;
            default:
                ((abw) this.b).invoke();
                return;
        }
    }

    public /* synthetic */ bhp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
