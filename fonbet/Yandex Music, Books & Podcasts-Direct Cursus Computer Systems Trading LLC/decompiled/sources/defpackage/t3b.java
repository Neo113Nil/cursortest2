package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class t3b extends men {
    public final /* synthetic */ men k;
    public final /* synthetic */ ThreadPoolExecutor l;

    public t3b(men menVar, ThreadPoolExecutor threadPoolExecutor) {
        this.k = menVar;
        this.l = threadPoolExecutor;
    }

    @Override // defpackage.men
    public final void C(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.C(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.men
    public final void D(xdh xdhVar) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.D(xdhVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
