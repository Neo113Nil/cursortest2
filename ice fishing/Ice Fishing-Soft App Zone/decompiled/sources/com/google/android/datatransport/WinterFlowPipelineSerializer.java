package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPipelineSerializer {
    public int WinterFlowHookDataSource;
    public long WinterFlowRouterStructure;

    public final synchronized void WinterFlowHookDataSource(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.WinterFlowHookDataSource = 0;
            }
            return;
        }
        this.WinterFlowHookDataSource++;
        synchronized (this) {
            if (i != 429 && (i < 500 || i >= 600)) {
                min = 86400000;
                this.WinterFlowRouterStructure = System.currentTimeMillis() + min;
            }
            min = (long) Math.min(Math.pow(2.0d, this.WinterFlowHookDataSource) + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            this.WinterFlowRouterStructure = System.currentTimeMillis() + min;
        }
        return;
    }

    public final synchronized boolean WinterFlowRouterStructure() {
        boolean z;
        if (this.WinterFlowHookDataSource != 0) {
            z = System.currentTimeMillis() > this.WinterFlowRouterStructure;
        }
        return z;
    }
}
