package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class bf extends ra {
    public final /* synthetic */ ra FySoLYna;
    public final /* synthetic */ ThreadPoolExecutor gjV1z5T1;

    public bf(ra raVar, ThreadPoolExecutor threadPoolExecutor) {
        this.FySoLYna = raVar;
        this.gjV1z5T1 = threadPoolExecutor;
    }

    @Override // defpackage.ra
    public final void DK9slbsy(VZZbw3BB vZZbw3BB) {
        ThreadPoolExecutor threadPoolExecutor = this.gjV1z5T1;
        try {
            this.FySoLYna.DK9slbsy(vZZbw3BB);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.ra
    public final void WYNAV5pd(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.gjV1z5T1;
        try {
            this.FySoLYna.WYNAV5pd(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
