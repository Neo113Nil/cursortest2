package com.gamericefishpro.space.ka;

import android.util.Log;
import android.util.StateSet;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ka.a0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public a0(n nVar) {
        this.a = 0;
        k();
        a(StateSet.WILD_CARD, nVar);
    }

    public static boolean l(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean m(com.gamericefishpro.space.w4.g gVar) {
        return gVar == null || gVar.v;
    }

    public void a(int[] iArr, n nVar) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.c = nVar;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.d = iArr3;
            n[] nVarArr = new n[i2];
            System.arraycopy((n[]) this.e, 0, nVarArr, 0, i);
            this.e = nVarArr;
        }
        int[][] iArr4 = (int[][]) this.d;
        int i3 = this.b;
        iArr4[i3] = iArr;
        ((n[]) this.e)[i3] = nVar;
        this.b = i3 + 1;
    }

    public void b(boolean z) {
        for (com.gamericefishpro.space.w4.g gVar : ((com.gamericefishpro.space.u6.s) this.d).g()) {
            if (gVar != null && z) {
                gVar.i.b(true);
            }
        }
    }

    public boolean c() {
        if (this.b < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (com.gamericefishpro.space.w4.g gVar : ((com.gamericefishpro.space.u6.s) this.d).g()) {
            if (gVar != null && m(gVar) && gVar.i.c()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(gVar);
                z = true;
            }
        }
        if (((ArrayList) this.e) != null) {
            for (int i = 0; i < ((ArrayList) this.e).size(); i++) {
                com.gamericefishpro.space.w4.g gVar2 = (com.gamericefishpro.space.w4.g) ((ArrayList) this.e).get(i);
                if (arrayList == null || !arrayList.contains(gVar2)) {
                    gVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public void d(boolean z) {
        for (com.gamericefishpro.space.w4.g gVar : ((com.gamericefishpro.space.u6.s) this.d).g()) {
            if (gVar != null && z) {
                gVar.i.d(true);
            }
        }
    }

    public void e(boolean z) {
        for (com.gamericefishpro.space.w4.g gVar : ((com.gamericefishpro.space.u6.s) this.d).g()) {
            if (gVar != null && z) {
                gVar.i.e(true);
            }
        }
    }

    public boolean f() {
        if (this.b < 1) {
            return false;
        }
        for (com.gamericefishpro.space.w4.g gVar : ((com.gamericefishpro.space.u6.s) this.d).g()) {
            if (gVar != null && gVar.i.f()) {
                return true;
            }
        }
        return false;
    }

    public void g() {
        if (this.b < 1) {
            return;
        }
        for (com.gamericefishpro.space.w4.g gVar : ((com.gamericefishpro.space.u6.s) this.d).g()) {
            if (gVar != null) {
                gVar.i.g();
            }
        }
    }

    public void h(boolean z) {
        for (com.gamericefishpro.space.w4.g gVar : ((com.gamericefishpro.space.u6.s) this.d).g()) {
            if (gVar != null && z) {
                gVar.i.h(true);
            }
        }
    }

    public boolean i() {
        boolean z = false;
        if (this.b < 1) {
            return false;
        }
        for (com.gamericefishpro.space.w4.g gVar : ((com.gamericefishpro.space.u6.s) this.d).g()) {
            if (gVar != null && m(gVar) && gVar.i.i()) {
                z = true;
            }
        }
        return z;
    }

    public void j() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public void k() {
        this.c = new n();
        this.d = new int[10][];
        this.e = new n[10];
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public a0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = new ArrayList();
                this.d = new com.gamericefishpro.space.u6.s(16);
                new ArrayList();
                this.f = null;
                new com.gamericefishpro.space.d.s(3, this);
                this.g = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                this.h = new ArrayList();
                Intrinsics.checkNotNullParameter(this, "fragmentManager");
                new CopyOnWriteArrayList();
                new CopyOnWriteArrayList();
                final int i2 = 0;
                new com.gamericefishpro.space.c4.a(this) { // from class: com.gamericefishpro.space.w4.h
                    public final /* synthetic */ a0 b;

                    {
                        this.b = this;
                    }

                    @Override // com.gamericefishpro.space.c4.a
                    public final void accept(Object obj) {
                        switch (i2) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                this.b.b(false);
                                break;
                            case 1:
                                if (((Integer) obj).intValue() == 80) {
                                    this.b.d(false);
                                }
                                break;
                            case 2:
                                boolean z = ((com.gamericefishpro.space.r3.b) obj).a;
                                this.b.e(false);
                                break;
                            default:
                                boolean z2 = ((com.gamericefishpro.space.r3.q) obj).a;
                                this.b.h(false);
                                break;
                        }
                    }
                };
                final int i3 = 1;
                new com.gamericefishpro.space.c4.a(this) { // from class: com.gamericefishpro.space.w4.h
                    public final /* synthetic */ a0 b;

                    {
                        this.b = this;
                    }

                    @Override // com.gamericefishpro.space.c4.a
                    public final void accept(Object obj) {
                        switch (i3) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                this.b.b(false);
                                break;
                            case 1:
                                if (((Integer) obj).intValue() == 80) {
                                    this.b.d(false);
                                }
                                break;
                            case 2:
                                boolean z = ((com.gamericefishpro.space.r3.b) obj).a;
                                this.b.e(false);
                                break;
                            default:
                                boolean z2 = ((com.gamericefishpro.space.r3.q) obj).a;
                                this.b.h(false);
                                break;
                        }
                    }
                };
                final int i4 = 2;
                new com.gamericefishpro.space.c4.a(this) { // from class: com.gamericefishpro.space.w4.h
                    public final /* synthetic */ a0 b;

                    {
                        this.b = this;
                    }

                    @Override // com.gamericefishpro.space.c4.a
                    public final void accept(Object obj) {
                        switch (i4) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                this.b.b(false);
                                break;
                            case 1:
                                if (((Integer) obj).intValue() == 80) {
                                    this.b.d(false);
                                }
                                break;
                            case 2:
                                boolean z = ((com.gamericefishpro.space.r3.b) obj).a;
                                this.b.e(false);
                                break;
                            default:
                                boolean z2 = ((com.gamericefishpro.space.r3.q) obj).a;
                                this.b.h(false);
                                break;
                        }
                    }
                };
                final int i5 = 3;
                new com.gamericefishpro.space.c4.a(this) { // from class: com.gamericefishpro.space.w4.h
                    public final /* synthetic */ a0 b;

                    {
                        this.b = this;
                    }

                    @Override // com.gamericefishpro.space.c4.a
                    public final void accept(Object obj) {
                        switch (i5) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                this.b.b(false);
                                break;
                            case 1:
                                if (((Integer) obj).intValue() == 80) {
                                    this.b.d(false);
                                }
                                break;
                            case 2:
                                boolean z = ((com.gamericefishpro.space.r3.b) obj).a;
                                this.b.e(false);
                                break;
                            default:
                                boolean z2 = ((com.gamericefishpro.space.r3.q) obj).a;
                                this.b.h(false);
                                break;
                        }
                    }
                };
                this.b = -1;
                this.i = new com.gamericefishpro.space.u4.f();
                new ArrayDeque();
                new com.gamericefishpro.space.h4.b(28, this);
                break;
        }
    }
}
