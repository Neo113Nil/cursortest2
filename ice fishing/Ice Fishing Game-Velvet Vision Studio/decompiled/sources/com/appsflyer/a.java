package com.appsflyer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.a8.c;
import com.gamericefishpro.space.b1.d;
import com.gamericefishpro.space.bb.h;
import com.gamericefishpro.space.i2.i1;
import com.gamericefishpro.space.i2.t;
import com.gamericefishpro.space.i2.z;
import com.gamericefishpro.space.i6.k;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.j1.e;
import com.gamericefishpro.space.l6.l;
import com.gamericefishpro.space.l6.m;
import com.gamericefishpro.space.l6.p;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.m6.o;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.ph.w;
import com.gamericefishpro.space.r4.f;
import com.gamericefishpro.space.t.r0;
import com.gamericefishpro.space.tb.f0;
import com.gamericefishpro.space.tb.s;
import com.gamericefishpro.space.u6.i;
import com.gamericefishpro.space.u6.n;
import com.gamericefishpro.space.w6.j;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    private final void a() {
        d dVar = (d) this.e;
        synchronized (((ArrayDeque) dVar.v)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) dVar.d).edit();
            String str = (String) dVar.e;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) dVar.v).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) dVar.i);
            }
            editorEdit.putString(str, sb.toString()).commit();
        }
    }

    private final void b() {
        ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.e;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.v.d instanceof com.gamericefishpro.space.w6.a) {
            return;
        }
        String strB = this$0.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        q qVarC = q.c();
        Intrinsics.checkNotNullExpressionValue(qVarC, "get()");
        if (strB == null || strB.length() == 0) {
            qVarC.a(com.gamericefishpro.space.y6.a.a, "No worker to delegate to.");
            j future = this$0.v;
            Intrinsics.checkNotNullExpressionValue(future, "future");
            future.i(new l());
            return;
        }
        p pVarA = this$0.getWorkerFactory().a(this$0.getApplicationContext(), strB, this$0.d);
        this$0.w = pVarA;
        if (pVarA == null) {
            String str = com.gamericefishpro.space.y6.a.a;
            qVarC.getClass();
            j future2 = this$0.v;
            Intrinsics.checkNotNullExpressionValue(future2, "future");
            future2.i(new l());
            return;
        }
        o oVarA = o.a(this$0.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(oVarA, "getInstance(applicationContext)");
        com.gamericefishpro.space.u6.q qVarB = oVarA.c.B();
        String string = this$0.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
        com.gamericefishpro.space.u6.p pVarM = qVarB.m(string);
        if (pVarM == null) {
            j future3 = this$0.v;
            Intrinsics.checkNotNullExpressionValue(future3, "future");
            String str2 = com.gamericefishpro.space.y6.a.a;
            future3.i(new l());
            return;
        }
        i iVar = oVarA.j;
        Intrinsics.checkNotNullExpressionValue(iVar, "workManagerImpl.trackers");
        c cVar = new c(iVar, this$0);
        cVar.w(w.c(pVarM));
        String string2 = this$0.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
        if (!cVar.d(string2)) {
            String str3 = com.gamericefishpro.space.y6.a.a;
            qVarC.getClass();
            j future4 = this$0.v;
            Intrinsics.checkNotNullExpressionValue(future4, "future");
            future4.i(new m());
            return;
        }
        String str4 = com.gamericefishpro.space.y6.a.a;
        qVarC.getClass();
        try {
            p pVar = this$0.w;
            Intrinsics.b(pVar);
            com.gamericefishpro.space.va.b bVarStartWork = pVar.startWork();
            Intrinsics.checkNotNullExpressionValue(bVarStartWork, "delegate!!.startWork()");
            bVarStartWork.a(new h(16, this$0, bVarStartWork), this$0.getBackgroundExecutor());
        } catch (Throwable unused) {
            String str5 = com.gamericefishpro.space.y6.a.a;
            synchronized (this$0.e) {
                try {
                    if (this$0.i) {
                        j future5 = this$0.v;
                        Intrinsics.checkNotNullExpressionValue(future5, "future");
                        future5.i(new m());
                    } else {
                        j future6 = this$0.v;
                        Intrinsics.checkNotNullExpressionValue(future6, "future");
                        future6.i(new l());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0178  */
    /* JADX WARN: Code duplicated, block: B:112:0x019a  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:129:0x0224  */
    /* JADX WARN: Code duplicated, block: B:138:0x0296  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:150:0x02da  */
    /* JADX WARN: Code duplicated, block: B:152:0x02dc A[LOOP:1: B:142:0x02bb->B:152:0x02dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:219:0x042d  */
    /* JADX WARN: Code duplicated, block: B:285:0x02c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x02f2 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        long j;
        long j2;
        float f;
        long j3;
        long j4;
        float f2;
        f fVar;
        boolean z;
        ArrayList arrayList;
        com.gamericefishpro.space.r4.b bVarB;
        ArrayList arrayList2;
        int iIndexOf;
        int i;
        int size;
        float f3;
        float f4;
        boolean z2 = false;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFLogger.getMonetizationNetwork((Function1) this.e);
                return;
            case 1:
                com.gamericefishpro.space.d.h hVar = (com.gamericefishpro.space.d.h) this.e;
                Runnable runnable = hVar.e;
                if (runnable != null) {
                    runnable.run();
                    hVar.e = null;
                    return;
                }
                return;
            case 2:
                com.gamericefishpro.space.g3.q.d((com.gamericefishpro.space.g3.q) this.e);
                return;
            case 3:
                View view = (View) this.e;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 4:
                z zVar = (z) this.e;
                Trace.beginSection("measureAndLayout");
                try {
                    zVar.v.u(true);
                    Unit unit = Unit.a;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        zVar.n();
                        Trace.endSection();
                        zVar.c0 = false;
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                n nVar = (n) this.e;
                ((com.gamericefishpro.space.j8.i) ((com.gamericefishpro.space.k8.c) nVar.v)).o(new com.gamericefishpro.space.a8.b(9, nVar));
                return;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.id.a.queryBoughtItems$lambda$0((com.gamericefishpro.space.id.a) this.e);
                return;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.j1.d dVar = (com.gamericefishpro.space.j1.d) this.e;
                boolean zG = dVar.g();
                t tVar = dVar.d;
                if (zG) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        tVar.u(true);
                        com.gamericefishpro.space.t.w wVar = dVar.E;
                        int[] iArr2 = wVar.b;
                        long[] jArr = wVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j5 = jArr[i2];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    long j6 = j5;
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        if ((255 & j6) < 128) {
                                            int i5 = iArr2[(i2 << 3) + i4];
                                            if (!dVar.f().a(i5)) {
                                                dVar.v.add(new e(i5, dVar.D, com.gamericefishpro.space.j1.f.e, null));
                                                dVar.A.k(Unit.a);
                                            }
                                        }
                                        j6 >>= 8;
                                        i4++;
                                        iArr2 = iArr2;
                                    }
                                    iArr = iArr2;
                                    if (i3 == 8) {
                                    }
                                } else {
                                    iArr = iArr2;
                                }
                                if (i2 != length) {
                                    i2++;
                                    iArr2 = iArr;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            dVar.i(tVar.getSemanticsOwner().a(), dVar.F);
                            Unit unit2 = Unit.a;
                            Trace.endSection();
                            dVar.d(dVar.f());
                            dVar.o();
                            dVar.G = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                return;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.jd.c.scheduleStart$lambda$2((com.gamericefishpro.space.jd.c) this.e);
                return;
            case 9:
                CoroutineWorker.a((CoroutineWorker) this.e);
                return;
            case 10:
                i1 i1Var = (i1) this.e;
                i1Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) i1Var.e;
                com.gamericefishpro.space.k4.e eVar = sideSheetBehavior.i;
                if (eVar != null && eVar.f()) {
                    i1Var.a(i1Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(i1Var.b);
                        return;
                    }
                    return;
                }
            case RequestError.STOP_TRACKING /* 11 */:
                com.gamericefishpro.space.mc.a.waitUntilActivityReady$lambda$0((com.gamericefishpro.space.ic.c) this.e);
                return;
            case 12:
                ((com.gamericefishpro.space.na.e) this.e).s(true);
                return;
            case 13:
                com.gamericefishpro.space.na.m mVar = (com.gamericefishpro.space.na.m) this.e;
                boolean zIsPopupShowing = mVar.h.isPopupShowing();
                mVar.s(zIsPopupShowing);
                mVar.m = zIsPopupShowing;
                return;
            case 14:
                ((TextInputLayout) this.e).w.requestLayout();
                return;
            case 15:
                com.gamericefishpro.space.p0.e.setRippleState$lambda$1((com.gamericefishpro.space.p0.e) this.e);
                return;
            case 16:
                ((com.gamericefishpro.space.pa.c) this.e).m();
                return;
            case 17:
                com.gamericefishpro.space.r4.b bVar = (com.gamericefishpro.space.r4.b) ((com.gamericefishpro.space.r4.b) this.e).c.e;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = bVar.b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i6 = 0;
                while (i6 < arrayList3.size()) {
                    com.gamericefishpro.space.r4.e eVar2 = (com.gamericefishpro.space.r4.e) arrayList3.get(i6);
                    if (eVar2 == null) {
                        jUptimeMillis = jUptimeMillis;
                    } else {
                        r0 r0Var = bVar.a;
                        Long l = (Long) r0Var.get(eVar2);
                        if (l == null) {
                            j = eVar2.i;
                            if (j == 0) {
                                eVar2.i = jUptimeMillis;
                                eVar2.c(eVar2.b);
                                jUptimeMillis = jUptimeMillis;
                            } else {
                                j2 = jUptimeMillis - j;
                                eVar2.i = jUptimeMillis;
                                f = com.gamericefishpro.space.r4.e.b().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                if (eVar2.o) {
                                    f4 = eVar2.n;
                                    if (f4 != Float.MAX_VALUE) {
                                        eVar2.m.i = f4;
                                        eVar2.n = Float.MAX_VALUE;
                                    }
                                    eVar2.b = (float) eVar2.m.i;
                                    eVar2.a = 0.0f;
                                    eVar2.o = z2;
                                } else {
                                    jUptimeMillis = jUptimeMillis;
                                    if (eVar2.n != Float.MAX_VALUE) {
                                        long j7 = j4 / 2;
                                        com.gamericefishpro.space.r4.d dVarC = eVar2.m.c(eVar2.b, eVar2.a, j7);
                                        f fVar2 = eVar2.m;
                                        fVar2.i = eVar2.n;
                                        eVar2.n = Float.MAX_VALUE;
                                        com.gamericefishpro.space.r4.d dVarC2 = fVar2.c(dVarC.a, dVarC.b, j7);
                                        eVar2.b = dVarC2.a;
                                        eVar2.a = dVarC2.b;
                                    } else {
                                        com.gamericefishpro.space.r4.d dVarC3 = eVar2.m.c(eVar2.b, eVar2.a, j4);
                                        eVar2.b = dVarC3.a;
                                        eVar2.a = dVarC3.b;
                                    }
                                    float fMax = Math.max(eVar2.b, eVar2.h);
                                    eVar2.b = fMax;
                                    float fMin = Math.min(fMax, eVar2.g);
                                    eVar2.b = fMin;
                                    f2 = eVar2.a;
                                    fVar = eVar2.m;
                                    fVar.getClass();
                                    if (Math.abs(f2) < fVar.e) {
                                    }
                                    z = false;
                                    float fMin2 = Math.min(eVar2.b, eVar2.g);
                                    eVar2.b = fMin2;
                                    float fMax2 = Math.max(fMin2, eVar2.h);
                                    eVar2.b = fMax2;
                                    eVar2.c(fMax2);
                                    if (z) {
                                        arrayList = eVar2.k;
                                        eVar2.f = false;
                                        bVarB = com.gamericefishpro.space.r4.e.b();
                                        bVarB.a.remove(eVar2);
                                        arrayList2 = bVarB.b;
                                        iIndexOf = arrayList2.indexOf(eVar2);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            bVarB.f = true;
                                        }
                                        eVar2.i = 0L;
                                        eVar2.c = false;
                                        for (i = 0; i < arrayList.size(); i++) {
                                            if (arrayList.get(i) != null) {
                                                k kVar = (k) arrayList.get(i);
                                                f3 = eVar2.b;
                                                kVar.getClass();
                                                if (f3 < 1.0f) {
                                                    throw null;
                                                }
                                                throw null;
                                            }
                                        }
                                        for (size = arrayList.size() - 1; size >= 0; size--) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                z = true;
                                float fMin3 = Math.min(eVar2.b, eVar2.g);
                                eVar2.b = fMin3;
                                float fMax3 = Math.max(fMin3, eVar2.h);
                                eVar2.b = fMax3;
                                eVar2.c(fMax3);
                                if (z) {
                                    arrayList = eVar2.k;
                                    eVar2.f = false;
                                    bVarB = com.gamericefishpro.space.r4.e.b();
                                    bVarB.a.remove(eVar2);
                                    arrayList2 = bVarB.b;
                                    iIndexOf = arrayList2.indexOf(eVar2);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        bVarB.f = true;
                                    }
                                    eVar2.i = 0L;
                                    eVar2.c = false;
                                    while (i < arrayList.size()) {
                                        if (arrayList.get(i) != null) {
                                            k kVar2 = (k) arrayList.get(i);
                                            f3 = eVar2.b;
                                            kVar2.getClass();
                                            if (f3 < 1.0f) {
                                                throw null;
                                            }
                                            throw null;
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else if (l.longValue() < jUptimeMillis2) {
                            r0Var.remove(eVar2);
                            j = eVar2.i;
                            if (j == 0) {
                                eVar2.i = jUptimeMillis;
                                eVar2.c(eVar2.b);
                                jUptimeMillis = jUptimeMillis;
                            } else {
                                j2 = jUptimeMillis - j;
                                eVar2.i = jUptimeMillis;
                                f = com.gamericefishpro.space.r4.e.b().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                if (eVar2.o) {
                                    f4 = eVar2.n;
                                    if (f4 != Float.MAX_VALUE) {
                                        eVar2.m.i = f4;
                                        eVar2.n = Float.MAX_VALUE;
                                    }
                                    eVar2.b = (float) eVar2.m.i;
                                    eVar2.a = 0.0f;
                                    eVar2.o = z2;
                                } else {
                                    jUptimeMillis = jUptimeMillis;
                                    if (eVar2.n != Float.MAX_VALUE) {
                                        long j8 = j4 / 2;
                                        com.gamericefishpro.space.r4.d dVarC4 = eVar2.m.c(eVar2.b, eVar2.a, j8);
                                        f fVar3 = eVar2.m;
                                        fVar3.i = eVar2.n;
                                        eVar2.n = Float.MAX_VALUE;
                                        com.gamericefishpro.space.r4.d dVarC5 = fVar3.c(dVarC4.a, dVarC4.b, j8);
                                        eVar2.b = dVarC5.a;
                                        eVar2.a = dVarC5.b;
                                    } else {
                                        com.gamericefishpro.space.r4.d dVarC6 = eVar2.m.c(eVar2.b, eVar2.a, j4);
                                        eVar2.b = dVarC6.a;
                                        eVar2.a = dVarC6.b;
                                    }
                                    float fMax4 = Math.max(eVar2.b, eVar2.h);
                                    eVar2.b = fMax4;
                                    float fMin4 = Math.min(fMax4, eVar2.g);
                                    eVar2.b = fMin4;
                                    f2 = eVar2.a;
                                    fVar = eVar2.m;
                                    fVar.getClass();
                                    if (Math.abs(f2) < fVar.e || Math.abs(fMin4 - ((float) fVar.i)) >= fVar.d) {
                                        z = false;
                                    } else {
                                        eVar2.b = (float) eVar2.m.i;
                                        eVar2.a = 0.0f;
                                    }
                                    float fMin5 = Math.min(eVar2.b, eVar2.g);
                                    eVar2.b = fMin5;
                                    float fMax5 = Math.max(fMin5, eVar2.h);
                                    eVar2.b = fMax5;
                                    eVar2.c(fMax5);
                                    if (z) {
                                        arrayList = eVar2.k;
                                        eVar2.f = false;
                                        bVarB = com.gamericefishpro.space.r4.e.b();
                                        bVarB.a.remove(eVar2);
                                        arrayList2 = bVarB.b;
                                        iIndexOf = arrayList2.indexOf(eVar2);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            bVarB.f = true;
                                        }
                                        eVar2.i = 0L;
                                        eVar2.c = false;
                                        while (i < arrayList.size()) {
                                            if (arrayList.get(i) != null) {
                                                k kVar3 = (k) arrayList.get(i);
                                                f3 = eVar2.b;
                                                kVar3.getClass();
                                                if (f3 < 1.0f) {
                                                    throw null;
                                                }
                                                throw null;
                                            }
                                        }
                                        while (size >= 0) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                z = true;
                                float fMin6 = Math.min(eVar2.b, eVar2.g);
                                eVar2.b = fMin6;
                                float fMax6 = Math.max(fMin6, eVar2.h);
                                eVar2.b = fMax6;
                                eVar2.c(fMax6);
                                if (z) {
                                    arrayList = eVar2.k;
                                    eVar2.f = false;
                                    bVarB = com.gamericefishpro.space.r4.e.b();
                                    bVarB.a.remove(eVar2);
                                    arrayList2 = bVarB.b;
                                    iIndexOf = arrayList2.indexOf(eVar2);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        bVarB.f = true;
                                    }
                                    eVar2.i = 0L;
                                    eVar2.c = false;
                                    while (i < arrayList.size()) {
                                        if (arrayList.get(i) != null) {
                                            k kVar4 = (k) arrayList.get(i);
                                            f3 = eVar2.b;
                                            kVar4.getClass();
                                            if (f3 < 1.0f) {
                                                throw null;
                                            }
                                            throw null;
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            jUptimeMillis = jUptimeMillis;
                        }
                    }
                    i6++;
                    jUptimeMillis = jUptimeMillis;
                    z2 = false;
                }
                if (bVar.f) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        if (arrayList3.get(size2) == null) {
                            arrayList3.remove(size2);
                        }
                    }
                    if (arrayList3.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        com.gamericefishpro.space.u6.l lVar = bVar.h;
                        ValueAnimator.unregisterDurationScaleChangeListener((com.gamericefishpro.space.r4.a) lVar.d);
                        lVar.d = null;
                    }
                    bVar.f = false;
                }
                if (arrayList3.size() > 0) {
                    ((Choreographer) bVar.e.e).postFrameCallback(new com.gamericefishpro.space.p5.e(bVar.d));
                    return;
                }
                return;
            case 18:
                com.gamericefishpro.space.s4.q qVar = (com.gamericefishpro.space.s4.q) this.e;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h == null) {
                            return;
                        }
                        try {
                            com.gamericefishpro.space.z3.h hVarC = qVar.c();
                            int i7 = hVarC.f;
                            if (i7 == 2) {
                                synchronized (qVar.d) {
                                }
                            }
                            if (i7 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                            }
                            try {
                                int i8 = com.gamericefishpro.space.y3.d.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                a0 a0Var = qVar.c;
                                Context context = qVar.a;
                                a0Var.getClass();
                                com.gamericefishpro.space.z3.h[] hVarArr = {hVarC};
                                com.gamericefishpro.space.a.a aVar = com.gamericefishpro.space.u3.f.a;
                                com.gamericefishpro.space.u6.f.k("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceH = com.gamericefishpro.space.u3.f.a.h(context, hVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferC = com.gamericefishpro.space.b9.a.C(qVar.a, hVarC.a);
                                    if (mappedByteBufferC == null || typefaceH == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        s sVar = new s(typefaceH, com.gamericefishpro.space.wa.b.L(mappedByteBufferC));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (qVar.d) {
                                            try {
                                                d5 d5Var = qVar.h;
                                                if (d5Var != null) {
                                                    d5Var.P(sVar);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                            break;
                                        }
                                        qVar.a();
                                        return;
                                    } catch (Throwable th5) {
                                        int i9 = com.gamericefishpro.space.y3.d.a;
                                        Trace.endSection();
                                        throw th5;
                                    }
                                } catch (Throwable th6) {
                                    Trace.endSection();
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                int i10 = com.gamericefishpro.space.y3.d.a;
                                Trace.endSection();
                                throw th7;
                            }
                            break;
                        } catch (Throwable th8) {
                            synchronized (qVar.d) {
                                try {
                                    d5 d5Var2 = qVar.h;
                                    if (d5Var2 != null) {
                                        d5Var2.O(th8);
                                    }
                                    qVar.a();
                                    return;
                                } catch (Throwable th9) {
                                    throw th9;
                                }
                            }
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
            case 19:
                a();
                return;
            case 20:
                f0 f0Var = (f0) this.e;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + f0Var.a.getAction() + " finishing.");
                f0Var.b.c(null);
                return;
            case 21:
                Iterator it = ((ArrayList) ((com.gamericefishpro.space.ka.a0) this.e).h).iterator();
                if (it.hasNext()) {
                    throw com.gamericefishpro.space.m5.a.f(it);
                }
                return;
            case 22:
                com.gamericefishpro.space.we.a.b.invoke$lambda$0((com.gamericefishpro.space.we.a) this.e);
                return;
            case 23:
                b();
                return;
            case 24:
                MaterialButton.a((MaterialButton) this.e);
                return;
            case 25:
                com.gamericefishpro.space.z4.f0 f0Var2 = (com.gamericefishpro.space.z4.f0) this.e;
                com.gamericefishpro.space.z4.w wVar2 = f0Var2.y;
                if (f0Var2.e == 0) {
                    f0Var2.i = true;
                    wVar2.d(com.gamericefishpro.space.z4.o.ON_PAUSE);
                }
                if (f0Var2.d == 0 && f0Var2.i) {
                    wVar2.d(com.gamericefishpro.space.z4.o.ON_STOP);
                    f0Var2.v = true;
                    return;
                }
                return;
            default:
                ((CarouselLayoutManager) this.e).W();
                return;
        }
    }
}
