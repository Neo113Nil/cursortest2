package com.gamericefishpro.space.s4;

import com.gamericefishpro.space.i9.d5;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends d5 {
    public final /* synthetic */ d5 c;
    public final /* synthetic */ ThreadPoolExecutor d;

    public m(d5 d5Var, ThreadPoolExecutor threadPoolExecutor) {
        this.c = d5Var;
        this.d = threadPoolExecutor;
    }

    @Override // com.gamericefishpro.space.i9.d5
    public final void O(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.d;
        try {
            this.c.O(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.gamericefishpro.space.i9.d5
    public final void P(com.gamericefishpro.space.tb.s sVar) {
        ThreadPoolExecutor threadPoolExecutor = this.d;
        try {
            this.c.P(sVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
