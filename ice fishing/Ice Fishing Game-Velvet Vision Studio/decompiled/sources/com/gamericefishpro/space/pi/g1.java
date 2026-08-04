package com.gamericefishpro.space.pi;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 extends com.gamericefishpro.space.ei.j implements Function1 {
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.B = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object[] objArr;
        switch (this.B) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((h1) this.e).l((Throwable) obj);
                return Unit.a;
            case 1:
                Set invalidatedTablesIds = (Set) obj;
                Intrinsics.checkNotNullParameter(invalidatedTablesIds, "p0");
                com.gamericefishpro.space.s5.g gVar = (com.gamericefishpro.space.s5.g) this.e;
                ReentrantLock reentrantLock = gVar.d;
                reentrantLock.lock();
                try {
                    List listL = CollectionsKt.L(gVar.c.values());
                    reentrantLock.unlock();
                    Iterator it = listL.iterator();
                    if (!it.hasNext()) {
                        return Unit.a;
                    }
                    ((com.gamericefishpro.space.s5.l) it.next()).getClass();
                    Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                com.gamericefishpro.space.y.z zVar = (com.gamericefishpro.space.y.z) this.e;
                com.gamericefishpro.space.t.z zVar2 = zVar.T;
                if (zBooleanValue) {
                    zVar.I0();
                } else {
                    com.gamericefishpro.space.th.a aVar = null;
                    if (zVar.J != null) {
                        Object[] objArr2 = zVar2.c;
                        long[] jArr = zVar2.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8;
                                    int i3 = 8 - ((~(i - length)) >>> 31);
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        if ((255 & j) < 128) {
                                            a0.u(zVar.o0(), null, new com.gamericefishpro.space.y.g(zVar, (com.gamericefishpro.space.b0.k) objArr2[(i << 3) + i4], aVar, 0), 3);
                                        }
                                        j >>= i2;
                                        i4++;
                                        i2 = i2;
                                        objArr2 = objArr2;
                                    }
                                    objArr = objArr2;
                                    if (i3 == i2) {
                                    }
                                } else {
                                    objArr = objArr2;
                                }
                                if (i != length) {
                                    i++;
                                    objArr2 = objArr;
                                }
                            }
                        }
                        com.gamericefishpro.space.b0.k kVar = zVar.V;
                        if (kVar != null) {
                            a0.u(zVar.o0(), null, new com.gamericefishpro.space.y.g(zVar, kVar, aVar, 1), 3);
                        }
                    }
                    zVar2.a();
                    zVar.V = null;
                }
                return Unit.a;
        }
    }
}
