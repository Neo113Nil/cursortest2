package com.gamericefishpro.space.r9;

import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.n9.x1;
import com.gamericefishpro.space.pi.g0;
import com.gamericefishpro.space.s5.y;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.u6.p;
import com.gamericefishpro.space.u8.a0;
import com.gamericefishpro.space.u8.c0;
import com.gamericefishpro.space.u8.l0;
import com.gamericefishpro.space.v8.o0;
import com.gamericefishpro.space.v8.w;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {
    public final /* synthetic */ int d;
    public Object e;
    public final Object i;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.d = i;
        this.i = obj;
        this.e = obj2;
    }

    private final void a() {
        try {
            ((Runnable) this.i).run();
            synchronized (((y) this.e).w) {
                ((y) this.e).a();
            }
        } catch (Throwable th) {
            synchronized (((y) this.e).w) {
                ((y) this.e).a();
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws g0 {
        com.gamericefishpro.space.v8.j jVar;
        com.gamericefishpro.space.v8.j o0Var;
        p pVar = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                synchronized (((k) this.i).i) {
                    ((e) ((k) this.i).v).c(((Task) this.e).getResult());
                    break;
                }
                return;
            case 1:
                k kVar = (k) this.i;
                try {
                    o oVarA = ((g) kVar.i).a(((Task) this.e).getResult());
                    n nVar = i.b;
                    oVarA.e(nVar, kVar);
                    oVarA.c(nVar, kVar);
                    oVarA.a(nVar, kVar);
                    return;
                } catch (f e) {
                    if (e.getCause() instanceof Exception) {
                        kVar.d((Exception) e.getCause());
                        return;
                    } else {
                        kVar.d(e);
                        return;
                    }
                } catch (CancellationException unused) {
                    kVar.a();
                    return;
                } catch (Exception e2) {
                    kVar.d(e2);
                    return;
                }
            case 2:
                o oVar = (o) this.e;
                try {
                    oVar.m(((Callable) this.i).call());
                    return;
                } catch (Exception e3) {
                    oVar.l(e3);
                    return;
                } catch (Throwable th) {
                    oVar.l(new RuntimeException(th));
                    return;
                }
            case 3:
                com.gamericefishpro.space.m6.f fVar = ((com.gamericefishpro.space.t6.b) this.i).d.f;
                String str = (String) this.e;
                synchronized (fVar.E) {
                    try {
                        com.gamericefishpro.space.m6.p pVar2 = (com.gamericefishpro.space.m6.p) fVar.y.get(str);
                        if (pVar2 == null) {
                            pVar2 = (com.gamericefishpro.space.m6.p) fVar.z.get(str);
                        }
                        if (pVar2 != null) {
                            pVar = pVar2.w;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (pVar == null || !pVar.b()) {
                    return;
                }
                synchronized (((com.gamericefishpro.space.t6.b) this.i).i) {
                    ((com.gamericefishpro.space.t6.b) this.i).y.put(a4.y(pVar), pVar);
                    ((com.gamericefishpro.space.t6.b) this.i).z.add(pVar);
                    com.gamericefishpro.space.t6.b bVar = (com.gamericefishpro.space.t6.b) this.i;
                    bVar.A.w(bVar.z);
                    break;
                }
                return;
            case 4:
                com.gamericefishpro.space.s8.b bVar2 = (com.gamericefishpro.space.s8.b) this.e;
                c0 c0Var = (c0) this.i;
                com.gamericefishpro.space.t8.a aVar = c0Var.a;
                a0 a0Var = (a0) c0Var.f.C.get(c0Var.b);
                if (a0Var == null) {
                    return;
                }
                if (!bVar2.c()) {
                    a0Var.l(bVar2, null);
                    return;
                }
                c0Var.e = true;
                if (aVar.m()) {
                    if (!c0Var.e || (jVar = c0Var.c) == null) {
                        return;
                    }
                    aVar.e(jVar, c0Var.d);
                    return;
                }
                try {
                    aVar.e(null, aVar.b());
                    return;
                } catch (SecurityException e4) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    aVar.c("Failed to get service from broker.");
                    a0Var.l(new com.gamericefishpro.space.s8.b(10, null, null), null);
                    return;
                }
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                l0 l0Var = (l0) this.i;
                com.gamericefishpro.space.p9.g gVar = (com.gamericefishpro.space.p9.g) this.e;
                com.gamericefishpro.space.s8.b bVar3 = gVar.e;
                if (bVar3.c()) {
                    w wVar = gVar.i;
                    com.gamericefishpro.space.v8.c0.g(wVar);
                    com.gamericefishpro.space.s8.b bVar4 = wVar.i;
                    if (!bVar4.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        l0Var.j.b(bVar4);
                        l0Var.i.l();
                        return;
                    }
                    c0 c0Var2 = l0Var.j;
                    IBinder iBinder = wVar.e;
                    if (iBinder == null) {
                        o0Var = null;
                    } else {
                        int i = com.gamericefishpro.space.v8.a.e;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        o0Var = iInterfaceQueryLocalInterface instanceof com.gamericefishpro.space.v8.j ? (com.gamericefishpro.space.v8.j) iInterfaceQueryLocalInterface : new o0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    Set set = l0Var.g;
                    c0Var2.getClass();
                    if (o0Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c0Var2.b(new com.gamericefishpro.space.s8.b(4, null, null));
                    } else {
                        c0Var2.c = o0Var;
                        c0Var2.d = set;
                        if (c0Var2.e) {
                            c0Var2.a.e(o0Var, set);
                        }
                    }
                } else {
                    l0Var.j.b(bVar3);
                }
                l0Var.i.l();
                return;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.ui.g gVar2 = (com.gamericefishpro.space.ui.g) this.i;
                int i2 = 0;
                while (true) {
                    try {
                        ((Runnable) this.e).run();
                    } catch (Throwable th3) {
                        com.gamericefishpro.space.pi.a0.p(th3, kotlin.coroutines.g.d);
                    }
                    Runnable runnableT = gVar2.T();
                    if (runnableT == null) {
                        return;
                    }
                    this.e = runnableT;
                    i2++;
                    if (i2 >= 16 && com.gamericefishpro.space.ui.a.i(gVar2.v, gVar2)) {
                        com.gamericefishpro.space.ui.a.h(gVar2.v, gVar2, this);
                        return;
                    }
                    break;
                }
                break;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                a();
                return;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                if (((com.gamericefishpro.space.v6.o) this.i).d.d instanceof com.gamericefishpro.space.w6.a) {
                    return;
                }
                try {
                    com.gamericefishpro.space.l6.i iVar = (com.gamericefishpro.space.l6.i) ((com.gamericefishpro.space.w6.j) this.e).get();
                    if (iVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((com.gamericefishpro.space.v6.o) this.i).i.c + ") but did not provide ForegroundInfo");
                    }
                    q qVarC = q.c();
                    int i3 = com.gamericefishpro.space.v6.o.z;
                    String str2 = ((com.gamericefishpro.space.v6.o) this.i).i.c;
                    qVarC.getClass();
                    com.gamericefishpro.space.v6.o oVar2 = (com.gamericefishpro.space.v6.o) this.i;
                    com.gamericefishpro.space.w6.j jVar2 = oVar2.d;
                    com.gamericefishpro.space.v6.p pVar3 = oVar2.w;
                    Context context = oVar2.e;
                    UUID id = oVar2.v.getId();
                    pVar3.getClass();
                    com.gamericefishpro.space.w6.j jVar3 = new com.gamericefishpro.space.w6.j();
                    pVar3.a.a(new x1(pVar3, jVar3, id, iVar, context));
                    jVar2.k(jVar3);
                    return;
                } catch (Throwable th4) {
                    ((com.gamericefishpro.space.v6.o) this.i).d.j(th4);
                    return;
                }
            case 9:
                com.gamericefishpro.space.k4.e eVar = ((SwipeDismissBehavior) this.i).a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                ((View) this.e).postOnAnimation(this);
                return;
            case 10:
                u uVar = (u) this.e;
                Typeface typeface = (Typeface) this.i;
                com.gamericefishpro.space.t3.b bVar5 = (com.gamericefishpro.space.t3.b) uVar.e;
                if (bVar5 != null) {
                    bVar5.h(typeface);
                    return;
                }
                return;
            default:
                ((com.gamericefishpro.space.z3.e) this.e).accept(this.i);
                return;
        }
    }

    public /* synthetic */ l(int i, Object obj, Object obj2, boolean z) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    public l(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.d = 9;
        this.i = swipeDismissBehavior;
        this.e = view;
    }
}
