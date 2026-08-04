package com.gamericefishpro.space.n9;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object y;

    public /* synthetic */ x1(y1 y1Var, t4 t4Var, Bundle bundle, j0 j0Var, String str) {
        this.v = y1Var;
        this.i = t4Var;
        this.w = bundle;
        this.y = j0Var;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        r4 r4Var;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y1 y1Var = (y1) this.v;
                t4 t4Var = (t4) this.i;
                Bundle bundle = (Bundle) this.w;
                j0 j0Var = (j0) this.y;
                String str = (String) this.e;
                m4 m4Var = y1Var.d;
                m4Var.B();
                try {
                    j0Var.t(m4Var.c0(bundle, t4Var));
                    return;
                } catch (RemoteException e) {
                    m4Var.a().y.c("Failed to return trigger URIs for app", str, e);
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.v;
                synchronized (atomicReference2) {
                    try {
                        try {
                            o3 o3Var = (o3) this.y;
                            h0 h0Var = o3Var.v;
                            if (h0Var == null) {
                                v0 v0Var = ((r1) o3Var.d).y;
                                r1.l(v0Var);
                                v0Var.y.d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.e, (String) this.w);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(h0Var.y((String) this.e, (String) this.w, (t4) this.i));
                            } else {
                                atomicReference2.set(h0Var.p(null, (String) this.e, (String) this.w));
                            }
                            o3Var.E();
                            atomicReference = (AtomicReference) this.v;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e2) {
                            v0 v0Var2 = ((r1) ((o3) this.y).d).y;
                            r1.l(v0Var2);
                            v0Var2.y.d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.e, e2);
                            ((AtomicReference) this.v).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.v;
                        }
                    } catch (Throwable th) {
                        ((AtomicReference) this.v).notify();
                        throw th;
                    }
                }
                break;
            case 2:
                com.gamericefishpro.space.i9.l0 l0Var = (com.gamericefishpro.space.i9.l0) this.w;
                String str2 = (String) this.v;
                String str3 = (String) this.e;
                o3 o3Var2 = (o3) this.y;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        h0 h0Var2 = o3Var2.v;
                        if (h0Var2 == null) {
                            r1 r1Var = (r1) o3Var2.d;
                            v0 v0Var3 = r1Var.y;
                            r1.l(v0Var3);
                            v0Var3.y.c("Failed to get conditional properties; not connected to service", str3, str2);
                            r4Var = r1Var.B;
                        } else {
                            arrayList = r4.g0(h0Var2.y(str3, str2, (t4) this.i));
                            o3Var2.E();
                            r4Var = ((r1) o3Var2.d).B;
                        }
                    } catch (RemoteException e3) {
                        v0 v0Var4 = ((r1) o3Var2.d).y;
                        r1.l(v0Var4);
                        v0Var4.y.d("Failed to get conditional properties; remote exception", str3, str2, e3);
                    }
                    r1.j(r4Var);
                    r4Var.f0(l0Var, arrayList);
                    return;
                } catch (Throwable th2) {
                    r4 r4Var2 = ((r1) o3Var2.d).B;
                    r1.j(r4Var2);
                    r4Var2.f0(l0Var, arrayList);
                    throw th2;
                }
            default:
                try {
                    if (!(((com.gamericefishpro.space.w6.j) this.v).d instanceof com.gamericefishpro.space.w6.a)) {
                        String string = ((UUID) this.i).toString();
                        com.gamericefishpro.space.u6.p pVarM = ((com.gamericefishpro.space.v6.p) this.e).c.m(string);
                        if (pVarM == null || pVarM.b.a()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((com.gamericefishpro.space.m6.f) ((com.gamericefishpro.space.v6.p) this.e).b).g(string, (com.gamericefishpro.space.l6.i) this.w);
                        ((Context) this.y).startService(com.gamericefishpro.space.t6.b.a((Context) this.y, com.gamericefishpro.space.i9.a4.y(pVarM), (com.gamericefishpro.space.l6.i) this.w));
                    }
                    ((com.gamericefishpro.space.w6.j) this.v).i(null);
                    return;
                } catch (Throwable th3) {
                    ((com.gamericefishpro.space.w6.j) this.v).j(th3);
                    return;
                }
        }
    }

    public x1(o3 o3Var, String str, String str2, t4 t4Var, com.gamericefishpro.space.i9.l0 l0Var) {
        this.e = str;
        this.v = str2;
        this.i = t4Var;
        this.w = l0Var;
        this.y = o3Var;
    }

    public x1(o3 o3Var, AtomicReference atomicReference, String str, String str2, t4 t4Var) {
        this.v = atomicReference;
        this.e = str;
        this.w = str2;
        this.i = t4Var;
        this.y = o3Var;
    }

    public x1(com.gamericefishpro.space.v6.p pVar, com.gamericefishpro.space.w6.j jVar, UUID uuid, com.gamericefishpro.space.l6.i iVar, Context context) {
        this.e = pVar;
        this.v = jVar;
        this.i = uuid;
        this.w = iVar;
        this.y = context;
    }
}
