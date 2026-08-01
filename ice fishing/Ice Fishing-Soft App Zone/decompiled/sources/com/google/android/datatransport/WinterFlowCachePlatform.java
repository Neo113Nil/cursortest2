package com.google.android.datatransport;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCachePlatform implements WinterFlowTransactionManagerMapper {
    public final AtomicBoolean WinterFlowArrayNetwork;
    public final WinterFlowRouterEngine WinterFlowCacheManagerAgent;
    public final WinterFlowDebugStrategy WinterFlowHookDataSource;
    public final File WinterFlowRouterStructure;
    public final WinterFlowIDEPlatform WinterFlowVariableVersionControl;

    public WinterFlowCachePlatform(File file, WinterFlowDebugStrategy winterFlowDebugStrategy, WinterFlowRouterEngine winterFlowRouterEngine) {
        winterFlowDebugStrategy.getClass();
        this.WinterFlowRouterStructure = file;
        this.WinterFlowHookDataSource = winterFlowDebugStrategy;
        this.WinterFlowCacheManagerAgent = winterFlowRouterEngine;
        this.WinterFlowArrayNetwork = new AtomicBoolean(false);
        this.WinterFlowVariableVersionControl = new WinterFlowIDEPlatform();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:(2:3|(11:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(3:20|21|22)|27|28)(1:29))(2:40|41))(1:42))(2:60|(5:62|(2:64|(2:66|67))|68|(1:70)|49)(2:71|72))|43|44|45|46|47|(5:50|14|15|16|(0)(0))|49))|44|45|46|47|(0)|49)|78|6|7|(0)(0)|43|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0116, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0117, code lost:
    
        r12 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8 A[Catch: all -> 0x0114, IOException -> 0x0116, TRY_ENTER, TryCatch #1 {all -> 0x0114, blocks: (B:18:0x00d8, B:20:0x00de, B:22:0x00e0, B:24:0x00f3, B:25:0x0113, B:29:0x011f, B:56:0x012e, B:58:0x0134, B:59:0x0137, B:36:0x012c, B:39:0x0129, B:43:0x009b, B:45:0x00b7), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011f A[Catch: all -> 0x0114, IOException -> 0x0116, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0114, blocks: (B:18:0x00d8, B:20:0x00de, B:22:0x00e0, B:24:0x00f3, B:25:0x0113, B:29:0x011f, B:56:0x012e, B:58:0x0134, B:59:0x0137, B:36:0x012c, B:39:0x0129, B:43:0x009b, B:45:0x00b7), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.datatransport.WinterFlowCacheCacheManager, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowHookDataSource(WinterFlowBatchUnitTest winterFlowBatchUnitTest, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowControllerTesting winterFlowControllerTesting;
        ?? r2;
        WinterFlowListenerJava winterFlowListenerJava;
        File file;
        WinterFlowCacheCacheManager winterFlowCacheCacheManager;
        WinterFlowEventEvent winterFlowEventEvent;
        WinterFlowNodeView winterFlowNodeView;
        Throwable th;
        WinterFlowNodeView winterFlowNodeView2;
        WinterFlowCachePlatform winterFlowCachePlatform;
        File file2;
        try {
            try {
                try {
                    if (winterFlowOrchestrationCompiler instanceof WinterFlowControllerTesting) {
                        winterFlowControllerTesting = (WinterFlowControllerTesting) winterFlowOrchestrationCompiler;
                        int i = winterFlowControllerTesting.WinterFlowServiceUtility;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            winterFlowControllerTesting.WinterFlowServiceUtility = i - Integer.MIN_VALUE;
                            Object obj = winterFlowControllerTesting.WinterFlowServerProtocol;
                            r2 = winterFlowControllerTesting.WinterFlowServiceUtility;
                            winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                            if (r2 != 0) {
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                                if (this.WinterFlowArrayNetwork.get()) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("StorageConnection has already been disposed.");
                                    return null;
                                }
                                File file3 = this.WinterFlowRouterStructure;
                                File parentFile = file3.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        throw new IOException("Unable to create parent directories of " + file3);
                                    }
                                }
                                winterFlowControllerTesting.WinterFlowRouterRouter = this;
                                winterFlowControllerTesting.WinterFlowSyntax = winterFlowBatchUnitTest;
                                WinterFlowIDEPlatform winterFlowIDEPlatform = this.WinterFlowVariableVersionControl;
                                winterFlowControllerTesting.WinterFlowResponseEngine = winterFlowIDEPlatform;
                                winterFlowControllerTesting.WinterFlowServiceUtility = 1;
                                if (winterFlowIDEPlatform.WinterFlowArrayNetwork(winterFlowControllerTesting) != winterFlowListenerJava) {
                                    winterFlowCacheCacheManager = winterFlowIDEPlatform;
                                    winterFlowEventEvent = winterFlowBatchUnitTest;
                                }
                                return winterFlowListenerJava;
                            }
                            if (r2 != 1) {
                                if (r2 != 2) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                winterFlowNodeView2 = winterFlowControllerTesting.WinterFlowTransactionAgent;
                                file2 = (File) winterFlowControllerTesting.WinterFlowResponseEngine;
                                winterFlowCacheCacheManager = (WinterFlowCacheCacheManager) winterFlowControllerTesting.WinterFlowSyntax;
                                winterFlowCachePlatform = winterFlowControllerTesting.WinterFlowRouterRouter;
                                try {
                                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                                    try {
                                        winterFlowNodeView2.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (file2.exists()) {
                                        try {
                                            Files.move(file2.toPath(), winterFlowCachePlatform.WinterFlowRouterStructure.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                        } catch (IOException unused) {
                                            throw new IOException("Unable to rename " + file2 + " to " + winterFlowCachePlatform.WinterFlowRouterStructure + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    winterFlowCacheCacheManager.WinterFlowHookDataSource(null);
                                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        winterFlowNodeView2.close();
                                    } catch (Throwable th4) {
                                        WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            WinterFlowCacheCacheManager winterFlowCacheCacheManager2 = (WinterFlowCacheCacheManager) winterFlowControllerTesting.WinterFlowResponseEngine;
                            WinterFlowEventEvent winterFlowEventEvent2 = (WinterFlowEventEvent) winterFlowControllerTesting.WinterFlowSyntax;
                            WinterFlowCachePlatform winterFlowCachePlatform2 = winterFlowControllerTesting.WinterFlowRouterRouter;
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            winterFlowCacheCacheManager = winterFlowCacheCacheManager2;
                            this = winterFlowCachePlatform2;
                            winterFlowEventEvent = winterFlowEventEvent2;
                            file = new File(this.WinterFlowRouterStructure.getAbsolutePath() + ".tmp");
                            winterFlowNodeView = new WinterFlowNodeView(file);
                            winterFlowControllerTesting.WinterFlowRouterRouter = this;
                            winterFlowControllerTesting.WinterFlowSyntax = winterFlowCacheCacheManager;
                            winterFlowControllerTesting.WinterFlowResponseEngine = file;
                            winterFlowControllerTesting.WinterFlowTransactionAgent = winterFlowNodeView;
                            winterFlowControllerTesting.WinterFlowServiceUtility = 2;
                            if (winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowNodeView, winterFlowControllerTesting) != winterFlowListenerJava) {
                                winterFlowCachePlatform = this;
                                file2 = file;
                                winterFlowNodeView2 = winterFlowNodeView;
                                winterFlowNodeView2.close();
                                th = null;
                                if (th == null) {
                                }
                            }
                            return winterFlowListenerJava;
                        }
                    }
                    winterFlowControllerTesting.WinterFlowRouterRouter = this;
                    winterFlowControllerTesting.WinterFlowSyntax = winterFlowCacheCacheManager;
                    winterFlowControllerTesting.WinterFlowResponseEngine = file;
                    winterFlowControllerTesting.WinterFlowTransactionAgent = winterFlowNodeView;
                    winterFlowControllerTesting.WinterFlowServiceUtility = 2;
                    if (winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowNodeView, winterFlowControllerTesting) != winterFlowListenerJava) {
                    }
                    return winterFlowListenerJava;
                } catch (Throwable th5) {
                    th = th5;
                    winterFlowNodeView2 = winterFlowNodeView;
                    winterFlowNodeView2.close();
                    throw th;
                }
                winterFlowNodeView = new WinterFlowNodeView(file);
            } catch (IOException e) {
                e = e;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r2 != 0) {
            }
            file = new File(this.WinterFlowRouterStructure.getAbsolutePath() + ".tmp");
        } catch (Throwable th6) {
            r2.WinterFlowHookDataSource(null);
            throw th6;
        }
        winterFlowControllerTesting = new WinterFlowControllerTesting(this, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowControllerTesting.WinterFlowServerProtocol;
        r2 = winterFlowControllerTesting.WinterFlowServiceUtility;
        winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:41|42))(2:43|(6:45|46|47|48|49|(1:51)(1:52))(2:56|57))|14|15|16|(2:(1:19)|20)(2:22|23)))|59|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.datatransport.WinterFlowVariableWidget] */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterStructure(WinterFlowVariableWidget winterFlowVariableWidget, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowConcurrencyAPI winterFlowConcurrencyAPI;
        Object obj;
        int i;
        Throwable th;
        WinterFlowVersionNetwork winterFlowVersionNetwork;
        WinterFlowCachePlatform winterFlowCachePlatform;
        ?? r6;
        Object obj2;
        try {
            if (winterFlowOrchestrationCompiler instanceof WinterFlowConcurrencyAPI) {
                winterFlowConcurrencyAPI = (WinterFlowConcurrencyAPI) winterFlowOrchestrationCompiler;
                int i2 = winterFlowConcurrencyAPI.WinterFlowThreadListener;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    winterFlowConcurrencyAPI.WinterFlowThreadListener = i2 - Integer.MIN_VALUE;
                    obj = winterFlowConcurrencyAPI.WinterFlowTransactionAgent;
                    i = winterFlowConcurrencyAPI.WinterFlowThreadListener;
                    if (i != 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        if (this.WinterFlowArrayNetwork.get()) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("StorageConnection has already been disposed.");
                            return null;
                        }
                        ?? WinterFlowVariableVersionControl = this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl();
                        WinterFlowVersionNetwork winterFlowVersionNetwork2 = new WinterFlowVersionNetwork(this.WinterFlowRouterStructure);
                        try {
                            Boolean valueOf = Boolean.valueOf((boolean) WinterFlowVariableVersionControl);
                            winterFlowConcurrencyAPI.WinterFlowRouterRouter = this;
                            winterFlowConcurrencyAPI.WinterFlowSyntax = winterFlowVersionNetwork2;
                            winterFlowConcurrencyAPI.WinterFlowResponseEngine = WinterFlowVariableVersionControl;
                            winterFlowConcurrencyAPI.WinterFlowThreadListener = 1;
                            Object WinterFlowArrayNetwork = winterFlowVariableWidget.WinterFlowArrayNetwork(winterFlowVersionNetwork2, valueOf, winterFlowConcurrencyAPI);
                            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                            if (WinterFlowArrayNetwork == winterFlowListenerJava) {
                                return winterFlowListenerJava;
                            }
                            winterFlowCachePlatform = this;
                            r6 = WinterFlowVariableVersionControl == true ? 1 : 0;
                            obj2 = WinterFlowArrayNetwork;
                            winterFlowVersionNetwork = winterFlowVersionNetwork2;
                        } catch (Throwable th2) {
                            th = th2;
                            winterFlowVersionNetwork = winterFlowVersionNetwork2;
                            obj = WinterFlowVariableVersionControl;
                            winterFlowVersionNetwork.close();
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r6 = winterFlowConcurrencyAPI.WinterFlowResponseEngine;
                        winterFlowVersionNetwork = winterFlowConcurrencyAPI.WinterFlowSyntax;
                        winterFlowCachePlatform = winterFlowConcurrencyAPI.WinterFlowRouterRouter;
                        try {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            obj2 = obj;
                        } catch (Throwable th3) {
                            obj = r6;
                            this = winterFlowCachePlatform;
                            th = th3;
                            try {
                                winterFlowVersionNetwork.close();
                                throw th;
                            } catch (Throwable th4) {
                                WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(th, th4);
                                throw th;
                            }
                        }
                    }
                    winterFlowVersionNetwork.close();
                    th = null;
                    if (th != null) {
                        if (r6 != false) {
                            winterFlowCachePlatform.WinterFlowVariableVersionControl.WinterFlowHookDataSource(null);
                        }
                        return obj2;
                    }
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        th = th5;
                        obj = r6;
                        this = winterFlowCachePlatform;
                        if (obj != null) {
                        }
                        throw th;
                    }
                }
            }
            if (i != 0) {
            }
            winterFlowVersionNetwork.close();
            th = null;
            if (th != null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (obj != null) {
                this.WinterFlowVariableVersionControl.WinterFlowHookDataSource(null);
            }
            throw th;
        }
        winterFlowConcurrencyAPI = new WinterFlowConcurrencyAPI(this, winterFlowOrchestrationCompiler);
        obj = winterFlowConcurrencyAPI.WinterFlowTransactionAgent;
        i = winterFlowConcurrencyAPI.WinterFlowThreadListener;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerMapper
    public final void close() {
        this.WinterFlowArrayNetwork.set(true);
        this.WinterFlowCacheManagerAgent.WinterFlowRouterStructure();
    }
}
