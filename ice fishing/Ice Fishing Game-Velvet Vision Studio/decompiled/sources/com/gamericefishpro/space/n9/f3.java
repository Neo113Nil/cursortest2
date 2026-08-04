package com.gamericefishpro.space.n9;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 implements Runnable {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ String e;
    public final /* synthetic */ String i;
    public final /* synthetic */ t4 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ o3 y;
    public final /* synthetic */ Object z;

    public f3(o3 o3Var, String str, String str2, t4 t4Var, boolean z, com.gamericefishpro.space.i9.l0 l0Var) {
        this.e = str;
        this.i = str2;
        this.v = t4Var;
        this.w = z;
        this.z = l0Var;
        this.y = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        r4 r4Var;
        AtomicReference atomicReference;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = this.i;
                String str2 = this.e;
                com.gamericefishpro.space.i9.l0 l0Var = (com.gamericefishpro.space.i9.l0) this.z;
                o3 o3Var = this.y;
                Bundle bundle = new Bundle();
                try {
                    try {
                        h0 h0Var = o3Var.v;
                        r1 r1Var = (r1) o3Var.d;
                        if (h0Var == null) {
                            v0 v0Var = r1Var.y;
                            r1.l(v0Var);
                            v0Var.y.c("Failed to get user properties; not connected to service", str2, str);
                            r4Var = r1Var.B;
                            r1.j(r4Var);
                            r4Var.e0(l0Var, bundle);
                            return;
                        }
                        List<o4> listE = h0Var.e(str2, str, this.w, this.v);
                        Bundle bundle2 = new Bundle();
                        if (listE != null) {
                            for (o4 o4Var : listE) {
                                String str3 = o4Var.w;
                                String str4 = o4Var.e;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l = o4Var.v;
                                    if (l != null) {
                                        bundle2.putLong(str4, l.longValue());
                                    } else {
                                        Double d = o4Var.z;
                                        if (d != null) {
                                            bundle2.putDouble(str4, d.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            o3Var.E();
                            r4 r4Var2 = r1Var.B;
                            r1.j(r4Var2);
                            r4Var2.e0(l0Var, bundle2);
                            return;
                        } catch (RemoteException e) {
                            e = e;
                            bundle = bundle2;
                            v0 v0Var2 = ((r1) o3Var.d).y;
                            r1.l(v0Var2);
                            v0Var2.y.c("Failed to get user properties; remote exception", str2, e);
                            r4Var = ((r1) o3Var.d).B;
                            r1.j(r4Var);
                            r4Var.e0(l0Var, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle = bundle2;
                            r4 r4Var3 = ((r1) o3Var.d).B;
                            r1.j(r4Var3);
                            r4Var3.e0(l0Var, bundle);
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.z;
                synchronized (atomicReference2) {
                    try {
                        try {
                            o3 o3Var2 = this.y;
                            h0 h0Var2 = o3Var2.v;
                            if (h0Var2 == null) {
                                v0 v0Var3 = ((r1) o3Var2.d).y;
                                r1.l(v0Var3);
                                v0Var3.y.d("(legacy) Failed to get user properties; not connected to service", null, this.e, this.i);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(h0Var2.e(this.e, this.i, this.w, this.v));
                            } else {
                                atomicReference2.set(h0Var2.f(null, this.e, this.i, this.w));
                            }
                            o3Var2.E();
                            atomicReference = (AtomicReference) this.z;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e3) {
                            v0 v0Var4 = ((r1) this.y.d).y;
                            r1.l(v0Var4);
                            v0Var4.y.d("(legacy) Failed to get user properties; remote exception", null, this.e, e3);
                            ((AtomicReference) this.z).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.z;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.z).notify();
                        throw th3;
                    }
                }
                break;
        }
    }

    public f3(o3 o3Var, AtomicReference atomicReference, String str, String str2, t4 t4Var, boolean z) {
        this.z = atomicReference;
        this.e = str;
        this.i = str2;
        this.v = t4Var;
        this.w = z;
        this.y = o3Var;
    }
}
