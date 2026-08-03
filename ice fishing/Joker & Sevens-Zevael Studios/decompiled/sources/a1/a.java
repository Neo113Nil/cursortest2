package a1;

import ac.o;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import androidx.lifecycle.f0;
import androidx.lifecycle.w;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b0.p0;
import bc.a0;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d.m;
import d8.g0;
import d8.s;
import d8.t;
import e3.k;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import q3.q;
import s.u;
import x4.n;
import x4.p;
import y1.r;
import y1.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f153g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f154h;

    public /* synthetic */ a(int i10, Object obj) {
        this.f153g = i10;
        this.f154h = obj;
    }

    private final void a() {
        q qVar = (q) this.f154h;
        synchronized (qVar.f5781d) {
            try {
                if (qVar.f5785h == null) {
                    return;
                }
                try {
                    k c3 = qVar.c();
                    int i10 = c3.f2098f;
                    if (i10 == 2) {
                        synchronized (qVar.f5781d) {
                        }
                    }
                    if (i10 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                    }
                    try {
                        int i11 = d3.b.f1654a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        p6.i iVar = qVar.f5780c;
                        Context context = qVar.f5778a;
                        iVar.getClass();
                        k[] kVarArr = {c3};
                        v6.a aVar = a3.d.f199a;
                        x4.f.y("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface u10 = a3.d.f199a.u(context, kVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer P = x4.f.P(qVar.f5778a, c3.f2093a);
                            if (P == null || u10 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                n nVar = new n(u10, a0.F(P));
                                Trace.endSection();
                                synchronized (qVar.f5781d) {
                                    try {
                                        a.a aVar2 = qVar.f5785h;
                                        if (aVar2 != null) {
                                            aVar2.F(nVar);
                                        }
                                    } finally {
                                    }
                                }
                                qVar.b();
                            } finally {
                                int i12 = d3.b.f1654a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (qVar.f5781d) {
                        try {
                            a.a aVar3 = qVar.f5785h;
                            if (aVar3 != null) {
                                aVar3.E(th2);
                            }
                            qVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        int[] iArr2;
        int i10 = 3;
        int i11 = 0;
        int i12 = 1;
        switch (this.f153g) {
            case 0:
                h hVar = (h) this.f154h;
                boolean j3 = hVar.j();
                r rVar = hVar.f170g;
                if (j3) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        rVar.t(true);
                        u uVar = hVar.f181r;
                        int[] iArr3 = uVar.f6296b;
                        long[] jArr = uVar.f6295a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j6 = jArr[i13];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                                    int i15 = i11;
                                    while (i15 < i14) {
                                        if ((255 & j6) < 128) {
                                            int i16 = iArr3[(i13 << 3) + i15];
                                            if (!hVar.i().a(i16)) {
                                                iArr2 = iArr3;
                                                hVar.f173j.add(new i(i16, hVar.f180q, j.f190h, null));
                                                hVar.f177n.s(o.f277a);
                                                j6 >>= 8;
                                                i15++;
                                                iArr3 = iArr2;
                                            }
                                        }
                                        iArr2 = iArr3;
                                        j6 >>= 8;
                                        i15++;
                                        iArr3 = iArr2;
                                    }
                                    iArr = iArr3;
                                    if (i14 == 8) {
                                    }
                                } else {
                                    iArr = iArr3;
                                }
                                if (i13 != length) {
                                    i13++;
                                    iArr3 = iArr;
                                    i11 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        hVar.l(rVar.getSemanticsOwner().a(), hVar.f182s);
                        Trace.endSection();
                        hVar.e(hVar.i());
                        hVar.p();
                        hVar.f183t = false;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                f0 f0Var = (f0) this.f154h;
                w wVar = f0Var.f673l;
                if (f0Var.f669h == 0) {
                    f0Var.f670i = true;
                    wVar.d(androidx.lifecycle.o.ON_PAUSE);
                }
                if (f0Var.f668g == 0 && f0Var.f670i) {
                    wVar.d(androidx.lifecycle.o.ON_STOP);
                    f0Var.f671j = true;
                    return;
                }
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f154h;
                if (constraintTrackingWorker.f790j.f9129g instanceof z4.a) {
                    return;
                }
                String b2 = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                o4.o d10 = o4.o.d();
                pc.j.d(d10, "get()");
                if (b2 == null || b2.length() == 0) {
                    d10.b(b5.a.f1015a, "No worker to delegate to.");
                    z4.j jVar = constraintTrackingWorker.f790j;
                    pc.j.d(jVar, "future");
                    jVar.i(new o4.j());
                    return;
                }
                o4.n a6 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), b2, constraintTrackingWorker.f787g);
                constraintTrackingWorker.f791k = a6;
                if (a6 == null) {
                    d10.a(b5.a.f1015a, "No worker to delegate to.");
                    z4.j jVar2 = constraintTrackingWorker.f790j;
                    pc.j.d(jVar2, "future");
                    jVar2.i(new o4.j());
                    return;
                }
                p4.n a8 = p4.n.a(constraintTrackingWorker.getApplicationContext());
                x4.q t3 = a8.f5495c.t();
                String uuid = constraintTrackingWorker.getId().toString();
                pc.j.d(uuid, "id.toString()");
                p k3 = t3.k(uuid);
                if (k3 == null) {
                    z4.j jVar3 = constraintTrackingWorker.f790j;
                    pc.j.d(jVar3, "future");
                    String str = b5.a.f1015a;
                    jVar3.i(new o4.j());
                    return;
                }
                n nVar = a8.f5502j;
                pc.j.d(nVar, "workManagerImpl.trackers");
                a5.c cVar = new a5.c(nVar, constraintTrackingWorker);
                cVar.G(i7.b.z(k3));
                String uuid2 = constraintTrackingWorker.getId().toString();
                pc.j.d(uuid2, "id.toString()");
                if (!cVar.l(uuid2)) {
                    d10.a(b5.a.f1015a, "Constraints not met for delegate " + b2 + ". Requesting retry.");
                    z4.j jVar4 = constraintTrackingWorker.f790j;
                    pc.j.d(jVar4, "future");
                    jVar4.i(new o4.k());
                    return;
                }
                d10.a(b5.a.f1015a, "Constraints met for delegate ".concat(b2));
                try {
                    o4.n nVar2 = constraintTrackingWorker.f791k;
                    pc.j.b(nVar2);
                    h7.a startWork = nVar2.startWork();
                    pc.j.d(startWork, "delegate!!.startWork()");
                    startWork.a(new d(i12, constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th2) {
                    String str2 = b5.a.f1015a;
                    String j10 = a4.d.j("Delegated worker ", b2, " threw exception in startWork.");
                    if (d10.f5218a <= 3) {
                        Log.d(str2, j10, th2);
                    }
                    synchronized (constraintTrackingWorker.f788h) {
                        try {
                            if (!constraintTrackingWorker.f789i) {
                                z4.j jVar5 = constraintTrackingWorker.f790j;
                                pc.j.d(jVar5, "future");
                                jVar5.i(new o4.j());
                                return;
                            } else {
                                d10.a(str2, "Constraints were unmet, Retrying.");
                                z4.j jVar6 = constraintTrackingWorker.f790j;
                                pc.j.d(jVar6, "future");
                                jVar6.i(new o4.k());
                                return;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case 3:
                s sVar = (s) this.f154h;
                ((d6.j) ((e6.c) sVar.f1815j)).i(new c6.f(i10, sVar));
                return;
            case 4:
                com.onesignal.core.internal.application.impl.a.m8waitUntilActivityReady$lambda0((com.onesignal.common.threading.c) this.f154h);
                return;
            case 5:
                com.onesignal.core.internal.purchases.impl.a.m9queryBoughtItems$lambda0((com.onesignal.core.internal.purchases.impl.a) this.f154h);
                return;
            case 6:
                m mVar = (m) this.f154h;
                Runnable runnable = mVar.f1499h;
                if (runnable != null) {
                    runnable.run();
                    mVar.f1499h = null;
                    return;
                }
                return;
            case 7:
                t tVar = (t) this.f154h;
                synchronized (((ArrayDeque) tVar.f1819d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) tVar.f1816a).edit();
                    String str3 = (String) tVar.f1817b;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) tVar.f1819d).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) tVar.f1818c);
                    }
                    edit.putString(str3, sb.toString()).commit();
                }
                return;
            case 8:
                g0 g0Var = (g0) this.f154h;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + g0Var.f1777a.getAction() + " finishing.");
                g0Var.f1778b.c(null);
                return;
            case 9:
                d9.c.m48scheduleStart$lambda2((d9.c) this.f154h);
                return;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                i0.n.setRippleState$lambda$2((i0.n) this.f154h);
                return;
            case 11:
                CoroutineWorker.a((CoroutineWorker) this.f154h);
                return;
            case 12:
                a();
                return;
            case 13:
                r rVar2 = (r) this.f154h;
                rVar2.E0 = false;
                MotionEvent motionEvent = rVar2.f8639w0;
                pc.j.b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                rVar2.G(motionEvent);
                return;
            case 14:
                p0 p0Var = (p0) this.f154h;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    p0Var.invoke();
                    return;
                } finally {
                }
            default:
                y yVar = (y) this.f154h;
                Trace.beginSection("measureAndLayout");
                try {
                    yVar.f8679d.t(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        yVar.i();
                        Trace.endSection();
                        yVar.L = false;
                        return;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
