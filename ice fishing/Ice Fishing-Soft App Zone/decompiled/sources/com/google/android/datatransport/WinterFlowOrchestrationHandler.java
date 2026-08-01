package com.google.android.datatransport;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowOrchestrationHandler implements WinterFlowObjectServiceProvider {
    public Handler WinterFlowArrayNetwork;
    public final Object WinterFlowCacheManagerAgent = new Object();
    public final WinterFlowXMLHelper WinterFlowHookDataSource;
    public final Context WinterFlowRouterStructure;
    public ThreadPoolExecutor WinterFlowTransactionManagerStrategy;
    public WinterFlowQuerySyntax WinterFlowUnitTestResponse;
    public ThreadPoolExecutor WinterFlowVariableVersionControl;

    public WinterFlowOrchestrationHandler(Context context, WinterFlowXMLHelper winterFlowXMLHelper) {
        WinterFlowSoftwareException.WinterFlowSerializerStructure(context, "Context cannot be null");
        this.WinterFlowRouterStructure = context.getApplicationContext();
        this.WinterFlowHookDataSource = winterFlowXMLHelper;
    }

    public final WinterFlowLibraryEntity WinterFlowCacheManagerAgent() {
        try {
            Context context = this.WinterFlowRouterStructure;
            Object[] objArr = {this.WinterFlowHookDataSource};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            WinterFlowSyntax WinterFlowRouterStructure = WinterFlowUIDecorator.WinterFlowRouterStructure(context, Collections.unmodifiableList(arrayList));
            int i = WinterFlowRouterStructure.WinterFlowRouterStructure;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            WinterFlowLibraryEntity[] winterFlowLibraryEntityArr = (WinterFlowLibraryEntity[]) ((List) WinterFlowRouterStructure.WinterFlowHookDataSource).get(0);
            if (winterFlowLibraryEntityArr == null || winterFlowLibraryEntityArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return winterFlowLibraryEntityArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    public final void WinterFlowHookDataSource() {
        synchronized (this.WinterFlowCacheManagerAgent) {
            try {
                this.WinterFlowUnitTestResponse = null;
                Handler handler = this.WinterFlowArrayNetwork;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.WinterFlowArrayNetwork = null;
                ThreadPoolExecutor threadPoolExecutor = this.WinterFlowTransactionManagerStrategy;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.WinterFlowVariableVersionControl = null;
                this.WinterFlowTransactionManagerStrategy = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowObjectServiceProvider
    public final void WinterFlowRouterStructure(WinterFlowQuerySyntax winterFlowQuerySyntax) {
        synchronized (this.WinterFlowCacheManagerAgent) {
            this.WinterFlowUnitTestResponse = winterFlowQuerySyntax;
        }
        synchronized (this.WinterFlowCacheManagerAgent) {
            try {
                if (this.WinterFlowUnitTestResponse == null) {
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = this.WinterFlowVariableVersionControl;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new WinterFlowDecoratorProcess("emojiCompat"));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.WinterFlowTransactionManagerStrategy = threadPoolExecutor2;
                    this.WinterFlowVariableVersionControl = threadPoolExecutor2;
                    threadPoolExecutor = threadPoolExecutor2;
                }
                threadPoolExecutor.execute(new WinterFlowServerConcurrency(5, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
