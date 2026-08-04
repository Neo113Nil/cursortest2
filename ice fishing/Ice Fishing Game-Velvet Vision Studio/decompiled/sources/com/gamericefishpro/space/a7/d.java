package com.gamericefishpro.space.a7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.MainActivity;
import com.gamericefishpro.space.e7.g;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.t.d0;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t.n0;
import com.gamericefishpro.space.t0.k1;
import com.gamericefishpro.space.t0.o0;
import com.gamericefishpro.space.t0.p0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.gamericefishpro.space.t.d0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.gamericefishpro.space.t0.p0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.gamericefishpro.space.t.d0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter((MainActivity) obj, "<this>");
                com.gamericefishpro.space.b1.d dVar = com.gamericefishpro.space.ej.a.b;
                if (dVar != null) {
                    return ((com.gamericefishpro.space.nj.a) dVar.i).d.a(b0.a(g.class));
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 1:
                Intrinsics.checkNotNullParameter((MainActivity) obj, "<this>");
                com.gamericefishpro.space.b1.d dVar2 = com.gamericefishpro.space.ej.a.b;
                if (dVar2 != null) {
                    return ((com.gamericefishpro.space.nj.a) dVar2.i).d.a(b0.a(com.gamericefishpro.space.w7.b.class));
                }
                throw new IllegalStateException("KoinApplication has not been started");
            default:
                ArrayList arrayList = ((k1) obj).a;
                h0 h0Var = new h0(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ?? r5 = (p0) arrayList.get(i2);
                    Object obj2 = r5.b;
                    int i3 = r5.a;
                    Object o0Var = obj2 != null ? new o0(Integer.valueOf(i3), r5.b) : Integer.valueOf(i3);
                    int iF = h0Var.f(o0Var);
                    boolean z = iF < 0;
                    Object obj3 = z ? null : h0Var.c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof d0) {
                            ?? r9 = (d0) obj3;
                            r9.a(r5);
                            r5 = r9;
                        } else {
                            Object[] objArr = n0.a;
                            ?? d0Var = new d0(2);
                            d0Var.a(obj3);
                            d0Var.a(r5);
                            r5 = d0Var;
                        }
                    }
                    if (z) {
                        int i4 = ~iF;
                        h0Var.b[i4] = o0Var;
                        h0Var.c[i4] = r5;
                    } else {
                        h0Var.c[iF] = r5;
                    }
                }
                return new com.gamericefishpro.space.v0.a(h0Var);
        }
    }
}
