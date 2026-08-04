package com.gamericefishpro.space.h0;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final com.gamericefishpro.space.v0.e a;

    public l(int i) {
        switch (i) {
            case 1:
                this.a = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.z.f[16]);
                break;
            default:
                this.a = new com.gamericefishpro.space.v0.e(new k[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        com.gamericefishpro.space.v0.e eVar = this.a;
        int i = eVar.i;
        com.gamericefishpro.space.pi.f[] fVarArr = new com.gamericefishpro.space.pi.f[i];
        for (int i2 = 0; i2 < i; i2++) {
            fVarArr[i2] = ((com.gamericefishpro.space.z.f) eVar.d[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            fVarArr[i3].i(cancellationException);
        }
        if (eVar.i == 0) {
            return;
        }
        com.gamericefishpro.space.c0.a.c("uncancelled requests present");
    }

    public void b() {
        com.gamericefishpro.space.v0.e eVar = this.a;
        IntRange intRangeF = com.gamericefishpro.space.ji.f.f(0, eVar.i);
        int i = intRangeF.d;
        int i2 = intRangeF.e;
        if (i <= i2) {
            while (true) {
                com.gamericefishpro.space.pi.h hVar = ((com.gamericefishpro.space.z.f) eVar.d[i]).b;
                Unit unit = Unit.a;
                com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                hVar.resumeWith(unit);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        eVar.g();
    }
}
