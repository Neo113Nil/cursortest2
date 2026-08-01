package com.google.android.datatransport;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJavaJSON implements WinterFlowDeserializationHandler, WinterFlowCacheCacheManager {
    public Throwable WinterFlowRouterRouter;
    public final WinterFlowSchedulerModule WinterFlowSyntax;
    public final WinterFlowCacheCacheManager WinterFlowTransactionManagerStrategy;
    public WinterFlowEncryptionMicroservice WinterFlowUnitTestResponse;
    public final WinterFlowDeserializationHandler WinterFlowVariableVersionControl;

    public WinterFlowJavaJSON(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        WinterFlowIDEPlatform winterFlowIDEPlatform = new WinterFlowIDEPlatform();
        winterFlowDeserializationHandler.getClass();
        this.WinterFlowVariableVersionControl = winterFlowDeserializationHandler;
        this.WinterFlowTransactionManagerStrategy = winterFlowIDEPlatform;
        this.WinterFlowSyntax = new WinterFlowSchedulerModule(this);
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationHandler
    public final WinterFlowConcurrencyLayer WinterFlowArrayHelper(String str) {
        str.getClass();
        WinterFlowSchedulerModule winterFlowSchedulerModule = this.WinterFlowSyntax;
        if (winterFlowSchedulerModule == null) {
            return this.WinterFlowVariableVersionControl.WinterFlowArrayHelper(str);
        }
        Object WinterFlowCacheManagerAgent = winterFlowSchedulerModule.WinterFlowCacheManagerAgent(str);
        WinterFlowCacheManagerAgent.getClass();
        return new WinterFlowStackPlatform((WinterFlowConcurrencyLayer) WinterFlowCacheManagerAgent);
    }

    @Override // com.google.android.datatransport.WinterFlowCacheCacheManager
    public final Object WinterFlowArrayNetwork(WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        return this.WinterFlowTransactionManagerStrategy.WinterFlowArrayNetwork(winterFlowOrchestrationCompiler);
    }

    @Override // com.google.android.datatransport.WinterFlowCacheCacheManager
    public final void WinterFlowHookDataSource(Object obj) {
        this.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource(null);
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationHandler
    public final boolean WinterFlowServerProtocol() {
        return this.WinterFlowVariableVersionControl.WinterFlowServerProtocol();
    }

    public final void WinterFlowTransactionManagerStrategy(StringBuilder sb) {
        int i;
        if (this.WinterFlowUnitTestResponse == null && this.WinterFlowRouterRouter == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = this.WinterFlowUnitTestResponse;
            if (winterFlowEncryptionMicroservice != null) {
                sb.append("\t\tCoroutine: " + winterFlowEncryptionMicroservice);
                sb.append('\n');
            }
            Throwable th = this.WinterFlowRouterRouter;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String stringWriter2 = stringWriter.toString();
                stringWriter2.getClass();
                Iterator it = WinterFlowSerializerUtility.WinterFlowArrayFramework(WinterFlowFrameworkStrategy.WinterFlowCompilerVariable(stringWriter2)).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.WinterFlowSyntax != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            WinterFlowSchedulerModule winterFlowSchedulerModule = this.WinterFlowSyntax;
            synchronized (winterFlowSchedulerModule.WinterFlowCacheManagerAgent) {
                i = winterFlowSchedulerModule.WinterFlowArrayNetwork;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        WinterFlowSchedulerModule winterFlowSchedulerModule = this.WinterFlowSyntax;
        if (winterFlowSchedulerModule != null) {
            winterFlowSchedulerModule.WinterFlowTransactionManagerStrategy(-1);
        }
        this.WinterFlowVariableVersionControl.close();
    }

    public final String toString() {
        return this.WinterFlowVariableVersionControl.toString();
    }
}
