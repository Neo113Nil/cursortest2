package com.google.android.datatransport;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryFunction {
    public static WinterFlowQueryFunction WinterFlowArrayNetwork;
    public static final ReentrantLock WinterFlowCacheManagerAgent = new ReentrantLock();
    public final SharedPreferences WinterFlowHookDataSource;
    public final ReentrantLock WinterFlowRouterStructure = new ReentrantLock();

    public WinterFlowQueryFunction(Context context) {
        this.WinterFlowHookDataSource = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String WinterFlowRouterStructure(String str) {
        ReentrantLock reentrantLock = this.WinterFlowRouterStructure;
        reentrantLock.lock();
        try {
            return this.WinterFlowHookDataSource.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
