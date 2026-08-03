package h3;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.UUID;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2761h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2762i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2763j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2764k;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2760g = i10;
        this.f2764k = obj;
        this.f2761h = obj2;
        this.f2762i = obj3;
        this.f2763j = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x4.p k3;
        switch (this.f2760g) {
            case 0:
                e0.i((View) this.f2761h, (i0) this.f2762i, (x4.l) this.f2763j);
                ((ValueAnimator) this.f2764k).start();
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                l.e eVar = (l.e) ((f8.c) this.f2764k).f2340h;
                l.i iVar = (l.i) this.f2762i;
                l.d dVar = (l.d) this.f2761h;
                if (dVar != null) {
                    eVar.F = true;
                    dVar.f3662b.c(false);
                    eVar.F = false;
                }
                if (iVar.isEnabled() && iVar.hasSubMenu()) {
                    ((l.h) this.f2763j).p(iVar, null, 4);
                    return;
                }
                return;
            default:
                z4.j jVar = (z4.j) this.f2763j;
                UUID uuid = (UUID) this.f2761h;
                String uuid2 = uuid.toString();
                o4.o d10 = o4.o.d();
                String str = y4.s.f8777c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                o4.e eVar2 = (o4.e) this.f2762i;
                sb.append(eVar2);
                sb.append(")");
                d10.a(str, sb.toString());
                y4.s sVar = (y4.s) this.f2764k;
                WorkDatabase workDatabase = sVar.f8778a;
                WorkDatabase workDatabase2 = sVar.f8778a;
                workDatabase.c();
                try {
                    k3 = workDatabase2.t().k(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (k3 == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (k3.f8323b == 2) {
                    x4.m mVar = new x4.m(uuid2, eVar2);
                    x4.n s10 = workDatabase2.s();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s10.f8316a;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((x4.b) s10.f8317b).f(mVar);
                        workDatabase_Impl.o();
                        workDatabase_Impl.k();
                    } catch (Throwable th) {
                        workDatabase_Impl.k();
                        throw th;
                    }
                } else {
                    o4.o.d().g(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                }
                jVar.i(null);
                workDatabase2.o();
                return;
        }
    }

    public c0(View view, i0 i0Var, x4.l lVar, ValueAnimator valueAnimator) {
        this.f2760g = 0;
        this.f2761h = view;
        this.f2762i = i0Var;
        this.f2763j = lVar;
        this.f2764k = valueAnimator;
    }
}
