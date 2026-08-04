package com.gamericefishpro.space.h4;

import android.animation.ValueAnimator;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.work.Worker;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.i2.i1;
import com.gamericefishpro.space.i2.t;
import com.gamericefishpro.space.n.w0;
import com.gamericefishpro.space.n9.b1;
import com.gamericefishpro.space.n9.b4;
import com.gamericefishpro.space.n9.d0;
import com.gamericefishpro.space.n9.d1;
import com.gamericefishpro.space.n9.e0;
import com.gamericefishpro.space.n9.f1;
import com.gamericefishpro.space.n9.h1;
import com.gamericefishpro.space.n9.h2;
import com.gamericefishpro.space.n9.i2;
import com.gamericefishpro.space.n9.j3;
import com.gamericefishpro.space.n9.l1;
import com.gamericefishpro.space.n9.m;
import com.gamericefishpro.space.n9.m3;
import com.gamericefishpro.space.n9.m4;
import com.gamericefishpro.space.n9.n3;
import com.gamericefishpro.space.n9.o3;
import com.gamericefishpro.space.n9.p1;
import com.gamericefishpro.space.n9.q3;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.r4;
import com.gamericefishpro.space.n9.t2;
import com.gamericefishpro.space.n9.t3;
import com.gamericefishpro.space.n9.u3;
import com.gamericefishpro.space.n9.u4;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.n9.v3;
import com.gamericefishpro.space.n9.w3;
import com.gamericefishpro.space.n9.z0;
import com.gamericefishpro.space.r5.m0;
import com.gamericefishpro.space.r5.y;
import com.gamericefishpro.space.r9.k;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.u8.a0;
import com.gamericefishpro.space.u8.o0;
import com.gamericefishpro.space.u8.q0;
import com.gamericefishpro.space.u8.r;
import com.gamericefishpro.space.v8.c0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.onesignal.core.activities.PermissionsActivity;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ b(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0438  */
    @Override // java.lang.Runnable
    public final void run() {
        com.gamericefishpro.space.n.i iVar;
        long j;
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        int i4 = 0;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e eVar = (e) this.e;
                w0 w0Var = eVar.i;
                a aVar = eVar.d;
                if (eVar.H) {
                    if (eVar.F) {
                        eVar.F = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = jCurrentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f = jCurrentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + ((long) aVar.i)) || !eVar.e()) {
                        eVar.H = false;
                        return;
                    }
                    if (eVar.G) {
                        eVar.G = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        w0Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j2 = jCurrentAnimationTimeMillis2 - aVar.f;
                    aVar.f = jCurrentAnimationTimeMillis2;
                    eVar.J.scrollListBy((int) (j2 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.d));
                    Field field = l0.a;
                    w0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                t tVar = (t) this.e;
                tVar.removeCallbacks(this);
                MotionEvent motionEvent = tVar.M0;
                if (motionEvent != null) {
                    i4 = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (i4 != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i5 = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    t tVar2 = (t) this.e;
                    tVar2.J(motionEvent, i5, tVar2.N0, false);
                    return;
                }
                return;
            case 2:
                ((com.gamericefishpro.space.k4.e) this.e).n(0);
                return;
            case 3:
                Worker worker = (Worker) this.e;
                try {
                    worker.d.i(worker.a());
                    return;
                } catch (Throwable th) {
                    worker.d.j(th);
                    return;
                }
            case 4:
                w0 w0Var2 = (w0) this.e;
                w0Var2.E = null;
                w0Var2.drawableStateChanged();
                return;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.e;
                if (searchView$SearchAutoComplete.y) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.y = false;
                    return;
                }
                return;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                ActionMenuView actionMenuView = ((Toolbar) this.e).d;
                if (actionMenuView == null || (iVar = actionMenuView.L) == null) {
                    return;
                }
                iVar.j();
                return;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((b1) this.e).a.N();
                return;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                o3 o3Var = ((n3) this.e).i;
                o3Var.C(new ComponentName(((r1) o3Var.d).d, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 9:
                o3 o3Var2 = ((n3) ((com.gamericefishpro.space.va.a) this.e).i).i;
                p1 p1Var = ((r1) o3Var2.d).z;
                r1.l(p1Var);
                p1Var.A(new m3(o3Var2, i4));
                return;
            case 10:
                t3 t3Var = (t3) this.e;
                w3 w3Var = (w3) t3Var.i.i;
                w3Var.r();
                r1 r1Var = (r1) w3Var.d;
                v0 v0Var = r1Var.y;
                Context context = r1Var.d;
                r1.l(v0Var);
                v0Var.F.a("Application going to the background");
                f1 f1Var = r1Var.w;
                r1.j(f1Var);
                f1Var.L.b(true);
                w3Var.r();
                w3Var.v = true;
                com.gamericefishpro.space.n9.g gVar = r1Var.v;
                if (!gVar.F()) {
                    long j3 = t3Var.e;
                    v3 v3Var = w3Var.y;
                    v3Var.e(false, false, j3);
                    ((u3) v3Var.i).c();
                }
                long j4 = t3Var.d;
                r1.l(v0Var);
                v0Var.E.b(Long.valueOf(j4), "Application backgrounded at: timestamp_millis");
                t2 t2Var = r1Var.F;
                r1.k(t2Var);
                t2Var.r();
                r1 r1Var2 = (r1) t2Var.d;
                t2Var.s();
                o3 o3VarO = r1Var2.o();
                o3VarO.r();
                o3VarO.s();
                if (o3VarO.y()) {
                    r4 r4Var = ((r1) o3VarO.d).B;
                    r1.j(r4Var);
                    if (r4Var.X() >= 242600) {
                        o3 o3VarO2 = r1Var2.o();
                        o3VarO2.r();
                        o3VarO2.s();
                        o3VarO2.F(new j3(o3VarO2, o3VarO2.H(true), i2));
                    }
                } else {
                    o3 o3VarO3 = r1Var2.o();
                    o3VarO3.r();
                    o3VarO3.s();
                    o3VarO3.F(new j3(o3VarO3, o3VarO3.H(true), i2));
                }
                if (gVar.B(null, e0.N0)) {
                    r4 r4Var2 = r1Var.B;
                    r1.j(r4Var2);
                    long jY = r4Var2.R(context.getPackageName(), gVar.i) ? 1000L : gVar.y(context.getPackageName(), e0.E);
                    r1.l(v0Var);
                    v0Var.G.b(Long.valueOf(jY), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    r1.i(r1Var.N);
                    r1Var.N.v(jY);
                    return;
                }
                return;
            case RequestError.STOP_TRACKING /* 11 */:
                m4 m4Var = (m4) this.e;
                m4Var.c().r();
                m4Var.D = new h1(m4Var);
                m mVar = new m(m4Var);
                mVar.t();
                m4Var.i = mVar;
                l1 l1Var = m4Var.d;
                com.gamericefishpro.space.n9.g gVarD0 = m4Var.d0();
                c0.g(l1Var);
                gVarD0.v = l1Var;
                q3 q3Var = new q3(m4Var);
                q3Var.t();
                m4Var.B = q3Var;
                com.gamericefishpro.space.n9.c cVar = new com.gamericefishpro.space.n9.c(m4Var);
                cVar.t();
                m4Var.y = cVar;
                z0 z0Var = new z0(m4Var, i3);
                z0Var.t();
                m4Var.A = z0Var;
                b4 b4Var = new b4(m4Var);
                b4Var.t();
                m4Var.w = b4Var;
                m4Var.v = new b1(m4Var);
                if (m4Var.K != m4Var.L) {
                    m4Var.a().y.c("Not all upload components initialized", Integer.valueOf(m4Var.K), Integer.valueOf(m4Var.L));
                }
                m4Var.F.set(true);
                m4Var.a().G.a("UploadController is now fully initialized");
                m4Var.c().r();
                m mVar2 = m4Var.i;
                m4.T(mVar2);
                mVar2.B();
                m mVar3 = m4Var.i;
                m4.T(mVar3);
                mVar3.r();
                mVar3.s();
                if (mVar3.Y()) {
                    d0 d0Var = e0.v0;
                    if (((Long) d0Var.a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseG0 = mVar3.g0();
                        r1 r1Var3 = (r1) mVar3.d;
                        r1Var3.D.getClass();
                        int iDelete = sQLiteDatabaseG0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(d0Var.a(null))});
                        if (iDelete > 0) {
                            v0 v0Var2 = r1Var3.y;
                            r1.l(v0Var2);
                            v0Var2.G.b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (m4Var.B.A.a() == 0) {
                    d1 d1Var = m4Var.B.A;
                    m4Var.e().getClass();
                    d1Var.b(System.currentTimeMillis());
                }
                m4Var.N();
                return;
            case 12:
                r1 r1Var4 = (r1) ((u4) this.e).b;
                r1.i(r1Var4.N);
                r1Var4.N.v(((Long) e0.D.a(null)).longValue());
                return;
            case 13:
                r1 r1Var5 = (r1) this.e;
                r4 r4Var3 = r1Var5.B;
                t2 t2Var2 = r1Var5.F;
                r1.j(r4Var3);
                r4Var3.r();
                if (r4Var3.M() != 1) {
                    v0 v0Var3 = r1Var5.y;
                    r1.l(v0Var3);
                    v0Var3.B.a("registerTrigger called but app not eligible");
                    return;
                }
                r1.k(t2Var2);
                t2Var2.r();
                i2 i2Var = t2Var2.E;
                if (i2Var != null) {
                    i2Var.c();
                }
                r1.k(t2Var2);
                new Thread(new h2(t2Var2, i)).start();
                return;
            case 14:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.e).i.z;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 15:
                com.gamericefishpro.space.q9.a aVar2 = (com.gamericefishpro.space.q9.a) this.e;
                synchronized (aVar2.a) {
                    try {
                        if (aVar2.b()) {
                            Log.e("WakeLock", String.valueOf(aVar2.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar2.d();
                            if (aVar2.b()) {
                                aVar2.c = 1;
                                aVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 16:
                com.gamericefishpro.space.r5.j jVar = (com.gamericefishpro.space.r5.j) this.e;
                ValueAnimator valueAnimator = jVar.u;
                int i6 = jVar.v;
                if (i6 == 1) {
                    valueAnimator.cancel();
                } else if (i6 != 2) {
                    return;
                }
                jVar.v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
                valueAnimator.start();
                return;
            case 17:
                y yVar = ((RecyclerView) this.e).b0;
                if (yVar != null) {
                    com.gamericefishpro.space.r5.g gVar2 = (com.gamericefishpro.space.r5.g) yVar;
                    ArrayList arrayList = gVar2.h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = gVar2.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = gVar2.k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = gVar2.i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        return;
                    }
                    if (arrayList.size() > 0) {
                        ((m0) arrayList.get(0)).getClass();
                        throw null;
                    }
                    arrayList.clear();
                    if (zIsEmpty2) {
                        j = 0;
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        j = 0;
                        gVar2.m.add(arrayList5);
                        arrayList2.clear();
                        com.gamericefishpro.space.r5.c cVar2 = new com.gamericefishpro.space.r5.c(gVar2, arrayList5, i4);
                        if (!zIsEmpty) {
                            ((com.gamericefishpro.space.r5.f) arrayList5.get(0)).getClass();
                            throw null;
                        }
                        cVar2.run();
                    }
                    if (!zIsEmpty3) {
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.addAll(arrayList3);
                        gVar2.n.add(arrayList6);
                        arrayList3.clear();
                        com.gamericefishpro.space.r5.c cVar3 = new com.gamericefishpro.space.r5.c(gVar2, arrayList6, i3);
                        if (!zIsEmpty) {
                            ((com.gamericefishpro.space.r5.e) arrayList6.get(0)).getClass();
                            throw null;
                        }
                        cVar3.run();
                    }
                    if (zIsEmpty4) {
                        return;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList4);
                    gVar2.l.add(arrayList7);
                    arrayList4.clear();
                    com.gamericefishpro.space.r5.c cVar4 = new com.gamericefishpro.space.r5.c(gVar2, arrayList7, i2);
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                        cVar4.run();
                        return;
                    }
                    Math.max(!zIsEmpty2 ? gVar2.e : j, !zIsEmpty3 ? gVar2.f : j);
                    ((m0) arrayList7.get(0)).getClass();
                    Field field2 = l0.a;
                    throw null;
                }
                return;
            case 18:
                ((StaggeredGridLayoutManager) this.e).c0();
                return;
            case 19:
                if (((com.gamericefishpro.space.r9.h) this.e).b(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 20:
                synchronized (((k) this.e).i) {
                    ((com.gamericefishpro.space.r9.c) ((k) this.e).v).a();
                    break;
                }
                return;
            case 21:
                r rVar = (r) this.e;
                com.gamericefishpro.space.s8.f fVar = rVar.v;
                Context context2 = rVar.i;
                fVar.getClass();
                if (com.gamericefishpro.space.s8.h.a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException unused) {
                    return;
                }
            case 22:
                ((a0) this.e).e();
                return;
            case 23:
                com.gamericefishpro.space.t8.a aVar3 = ((a0) ((u) this.e).e).e;
                aVar3.c(aVar3.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 24:
                ((com.gamericefishpro.space.u8.l0) this.e).j.b(new com.gamericefishpro.space.s8.b(4, null, null));
                return;
            case 25:
                return;
            case 26:
                ((com.gamericefishpro.space.w4.e) this.e).E.onDismiss(null);
                return;
            case 27:
                com.gamericefishpro.space.w4.g gVar3 = (com.gamericefishpro.space.w4.g) this.e;
                if (gVar3.w != null) {
                    if (gVar3.w == null) {
                        com.gamericefishpro.space.w4.f fVar2 = new com.gamericefishpro.space.w4.f();
                        Object obj = com.gamericefishpro.space.w4.g.D;
                        fVar2.a = obj;
                        fVar2.b = obj;
                        fVar2.c = obj;
                        fVar2.d = 1.0f;
                        gVar3.w = fVar2;
                    }
                    gVar3.w.getClass();
                    return;
                }
                return;
            case 28:
                ((com.gamericefishpro.space.ka.a0) this.e).j();
                throw null;
            default:
                i1 i1Var = (i1) this.e;
                i1Var.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) i1Var.e;
                com.gamericefishpro.space.k4.e eVar2 = bottomSheetBehavior.O;
                if (eVar2 != null && eVar2.f()) {
                    i1Var.a(i1Var.b);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.C(i1Var.b);
                        return;
                    }
                    return;
                }
        }
    }

    public b(q0 q0Var, o0 o0Var) {
        this.d = 25;
        this.e = o0Var;
    }

    public b(b1 b1Var, boolean z) {
        this.d = 7;
        this.e = b1Var;
    }

    public b(m4 m4Var, com.gamericefishpro.space.b9.b bVar) {
        this.d = 11;
        this.e = m4Var;
    }
}
