package ru.yandex.music.relay.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import defpackage.a23;
import defpackage.apo;
import defpackage.atn;
import defpackage.b6e;
import defpackage.bml;
import defpackage.bw1;
import defpackage.c8q;
import defpackage.cee;
import defpackage.d8q;
import defpackage.d9p;
import defpackage.ee0;
import defpackage.etn;
import defpackage.f1d;
import defpackage.fwf;
import defpackage.gao;
import defpackage.gcp;
import defpackage.h8e;
import defpackage.hjp;
import defpackage.hrg;
import defpackage.htn;
import defpackage.ixf;
import defpackage.j3i;
import defpackage.k3i;
import defpackage.l1j;
import defpackage.lum;
import defpackage.mjp;
import defpackage.n;
import defpackage.o2g;
import defpackage.ovn;
import defpackage.pjp;
import defpackage.pn3;
import defpackage.qld;
import defpackage.rjp;
import defpackage.sjp;
import defpackage.ssg;
import defpackage.suh;
import defpackage.u13;
import defpackage.u75;
import defpackage.v13;
import defpackage.w13;
import defpackage.w4i;
import defpackage.we6;
import defpackage.xhe;
import defpackage.xhj;
import defpackage.xq0;
import io.grpc.internal.b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RelayService extends Service {
    public b a;
    public final h8e b = new h8e();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ssg.a(3, "Relay:Service", "onBind()", null);
        return (fwf) this.b.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ssg.a(3, "Relay:Service", "onCreate()", null);
        int i = ee0.b;
        w13 w13Var = new w13(new ee0(new Intent("grpc.io.action.BIND").setComponent(new ComponentName(this, (Class<?>) RelayService.class))), this.b);
        htn htnVar = new htn();
        mjp mjpVar = w13Var.a;
        mjpVar.getClass();
        apo apoVar = etn.e;
        if (apoVar == null) {
            synchronized (etn.class) {
                try {
                    apoVar = etn.e;
                    if (apoVar == null) {
                        atn atnVar = new atn(5, false);
                        atnVar.c = new ArrayList();
                        atnVar.b = "relay.RelayGrpcService";
                        atnVar.A(etn.K());
                        atnVar.A(etn.D());
                        atnVar.A(etn.I());
                        atnVar.A(etn.G());
                        apoVar = new apo(atnVar);
                        etn.e = apoVar;
                    }
                } finally {
                }
            }
        }
        lum lumVar = new lum();
        lumVar.c = new HashMap();
        lumVar.b = apoVar;
        lumVar.a = (String) apoVar.b;
        lumVar.j(ixf.L(htnVar.a, etn.K(), new w4i(2, htnVar, htn.class, "version", "version(Lcom/yandex/music/shared/relay/common/proto/VersionProto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14)));
        lumVar.j(ixf.L(htnVar.a, etn.D(), new w4i(2, htnVar, htn.class, "checkAuthorization", "checkAuthorization(Lcom/google/protobuf/Empty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15)));
        CoroutineContext coroutineContext = htnVar.a;
        k3i I = etn.I();
        bml bmlVar = new bml(1, htnVar, htn.class, "streamStateUpdates", "streamStateUpdates(Lcom/google/protobuf/Empty;)Lkotlinx/coroutines/flow/Flow;", 0, 18);
        coroutineContext.getClass();
        if (I.a != j3i.c) {
            l1j.p(I, "Expected a server streaming method descriptor but got ");
            return;
        }
        lumVar.j(new pjp(I, new suh(coroutineContext, new gcp(4, I, bmlVar))));
        lumVar.j(ixf.L(htnVar.a, etn.G(), new w4i(2, htnVar, htn.class, "invokeCommand", "invokeCommand(Lcom/yandex/music/shared/relay/common/proto/InvokeCommandRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 16)));
        HashMap hashMap = (HashMap) lumVar.c;
        apo apoVar2 = (apo) lumVar.b;
        if (apoVar2 == null) {
            ArrayList arrayList = new ArrayList(hashMap.size());
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((pjp) it.next()).a);
            }
            String str = (String) lumVar.a;
            atn atnVar2 = new atn(5, false);
            ArrayList arrayList2 = new ArrayList();
            atnVar2.c = arrayList2;
            o2g.O(str, "name");
            atnVar2.b = str;
            arrayList2.addAll(arrayList);
            apoVar2 = new apo(atnVar2);
        }
        HashMap hashMap2 = new HashMap(hashMap);
        for (k3i k3iVar : (List) apoVar2.c) {
            String str2 = k3iVar.b;
            pjp pjpVar = (pjp) hashMap2.remove(str2);
            if (pjpVar == null) {
                xq0.q(f1d.g("No method bound for descriptor entry ", str2));
                return;
            } else if (pjpVar.a != k3iVar) {
                xq0.q(hrg.q("Bound method for ", str2, " not same instance as method in service descriptor"));
                return;
            }
        }
        if (hashMap2.size() > 0) {
            b6e.w(((pjp) hashMap2.values().iterator().next()).a.b, "No entry in descriptor matching bound method ");
            return;
        }
        mjpVar.a.a.put((String) apoVar2.b, new sjp(apoVar2, hashMap));
        HashMap hashMap3 = new HashMap();
        pn3 pn3Var = pn3.d;
        List h = u75.h(ovn.A("aca405ded8b25cb2e8c6da69425d2b4307d087c1276fc06ad5942731ccc51dba").t(), ovn.A("f96d7ce5868fd03877c05e8f580ce0739e568eb242c4c5f7f7c6221e1e69ef96").t());
        PackageManager packageManager = getPackageManager();
        packageManager.getClass();
        h.getClass();
        if (h.isEmpty()) {
            xq0.q("Check failed.");
            return;
        }
        Iterator it2 = h.iterator();
        while (it2.hasNext()) {
            if (((byte[]) it2.next()).length != 32) {
                xq0.q("Check failed.");
                return;
            }
        }
        hashMap3.put("relay.RelayGrpcService", new d9p(packageManager, h));
        w13Var.c = new rjp(cee.a(hashMap3));
        o2g.U("BinderServerBuilder can only be used to build one server instance.", !w13Var.e);
        w13Var.e = true;
        gao gaoVar = w13Var.a.g;
        Executor executor = (Executor) d8q.a((c8q) gaoVar.a);
        w13Var.a.c.add(new a23(executor));
        w13Var.f = new v13(0, gaoVar, executor);
        mjp mjpVar2 = w13Var.a;
        mjpVar2.getClass();
        u13 u13Var = mjpVar2.e;
        ArrayList arrayList3 = new ArrayList();
        synchronized (qld.class) {
        }
        synchronized (qld.class) {
        }
        if (mjpVar2.l) {
            try {
                Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
                Class cls2 = Boolean.TYPE;
                if (cls.getDeclaredMethod("getServerStreamTracerFactory", cls2, cls2, cls2).invoke(null, Boolean.valueOf(mjpVar2.m), Boolean.valueOf(mjpVar2.n), Boolean.FALSE) != null) {
                    throw new ClassCastException();
                }
            } catch (ClassNotFoundException e) {
                mjp.r.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            } catch (IllegalAccessException e2) {
                mjp.r.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            } catch (NoSuchMethodException e3) {
                mjp.r.log(Level.FINE, "Unable to apply census stats", (Throwable) e3);
            } catch (InvocationTargetException e4) {
                mjp.r.log(Level.FINE, "Unable to apply census stats", (Throwable) e4);
            }
        }
        if (mjpVar2.o) {
            try {
                if (Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getServerStreamTracerFactory", null).invoke(null, null) != null) {
                    throw new ClassCastException();
                }
            } catch (ClassNotFoundException e5) {
                mjp.r.log(Level.FINE, "Unable to apply census stats", (Throwable) e5);
            } catch (IllegalAccessException e6) {
                mjp.r.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
            } catch (NoSuchMethodException e7) {
                mjp.r.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            } catch (InvocationTargetException e8) {
                mjp.r.log(Level.FINE, "Unable to apply census stats", (Throwable) e8);
            }
        }
        arrayList3.addAll(mjpVar2.d);
        arrayList3.trimToSize();
        List unmodifiableList = Collections.unmodifiableList(arrayList3);
        w13 w13Var2 = (w13) u13Var.b;
        ee0 ee0Var = (ee0) u13Var.c;
        h8e h8eVar = (h8e) u13Var.d;
        gao gaoVar2 = w13Var2.b;
        rjp rjpVar = w13Var2.c;
        Objects.requireNonNull(rjpVar);
        n nVar = new n(3, rjpVar);
        xhe xheVar = w13Var2.d;
        v13 v13Var = w13Var2.f;
        v13Var.getClass();
        bw1 bw1Var = new bw1(ee0Var, gaoVar2, unmodifiableList, nVar, xheVar, v13Var);
        h8eVar.a = (fwf) bw1Var.f;
        b bVar = new b(mjpVar2, bw1Var, we6.e);
        this.a = bVar;
        synchronized (bVar.o) {
            o2g.U("Already started", !bVar.j);
            o2g.U("Shutting down", !bVar.k);
            hjp hjpVar = new hjp(0, bVar);
            bw1 bw1Var2 = bVar.n;
            synchronized (bw1Var2) {
                bw1Var2.j = hjpVar;
                bw1Var2.k = (ScheduledExecutorService) ((xhj) bw1Var2.c).e();
            }
            Executor executor2 = (Executor) bVar.c.e();
            o2g.O(executor2, "executor");
            bVar.d = executor2;
            bVar.j = true;
        }
        ssg.a(3, "Relay:Service", "gRPC server started", null);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ssg.a(3, "Relay:Service", "onDestroy()", null);
        b bVar = this.a;
        if (bVar == null) {
            Intrinsics.j("server");
            throw null;
        }
        synchronized (bVar.o) {
            try {
                if (bVar.k) {
                    return;
                }
                bVar.k = true;
                boolean z = bVar.j;
                if (!z) {
                    bVar.p = true;
                    bVar.e();
                }
                if (z) {
                    bw1 bw1Var = bVar.n;
                    synchronized (bw1Var) {
                        if (!bw1Var.b) {
                            bw1Var.b = true;
                            ((fwf) bw1Var.f).a = null;
                            ((hjp) bw1Var.j).B();
                            ((xhj) bw1Var.c).K((ScheduledExecutorService) bw1Var.k);
                            bw1Var.k = null;
                            v13 v13Var = (v13) bw1Var.i;
                            ((xhj) v13Var.b).K((Executor) v13Var.c);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
