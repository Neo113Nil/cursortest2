package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jp extends vc0 {
    public final /* synthetic */ vc0 cilMamHF;
    public final /* synthetic */ ThreadPoolExecutor lv06NcmrQ;

    public jp(vc0 vc0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.cilMamHF = vc0Var;
        this.lv06NcmrQ = threadPoolExecutor;
    }

    @Override // defpackage.vc0
    public final void M3K9sHhK(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.lv06NcmrQ;
        try {
            this.cilMamHF.M3K9sHhK(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.vc0
    public final void k8h8IjolWQ(rx0 rx0Var) {
        ThreadPoolExecutor threadPoolExecutor = this.lv06NcmrQ;
        try {
            this.cilMamHF.k8h8IjolWQ(rx0Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
