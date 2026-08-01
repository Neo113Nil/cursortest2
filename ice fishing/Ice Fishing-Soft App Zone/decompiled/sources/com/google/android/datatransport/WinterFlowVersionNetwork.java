package com.google.android.datatransport;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowVersionNetwork implements WinterFlowTransactionManagerMapper {
    public final AtomicBoolean WinterFlowHookDataSource = new AtomicBoolean(false);
    public final File WinterFlowRouterStructure;

    public WinterFlowVersionNetwork(File file) {
        this.WinterFlowRouterStructure = file;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:40|(6:44|45|47|48|(1:50)|51)(2:42|43))|30|31))|69|6|7|(0)(0)|30|31|(3:(1:21)|(0)|(1:36))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006c, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.datatransport.WinterFlowVersionNetwork] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object WinterFlowRouterStructure(WinterFlowVersionNetwork winterFlowVersionNetwork, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowCloud winterFlowCloud;
        ?? r1;
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        Throwable th2;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowCloud) {
            winterFlowCloud = (WinterFlowCloud) winterFlowOrchestrationCompiler;
            int i = winterFlowCloud.WinterFlowServerProtocol;
            if ((i & Integer.MIN_VALUE) != 0) {
                winterFlowCloud.WinterFlowServerProtocol = i - Integer.MIN_VALUE;
                Object obj = winterFlowCloud.WinterFlowResponseEngine;
                r1 = winterFlowCloud.WinterFlowServerProtocol;
                boolean z = true;
                WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (r1 != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    if (winterFlowVersionNetwork.WinterFlowHookDataSource.get()) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This scope has already been closed.");
                        return null;
                    }
                    try {
                        fileInputStream2 = new FileInputStream(winterFlowVersionNetwork.WinterFlowRouterStructure);
                    } catch (FileNotFoundException unused) {
                        if (winterFlowVersionNetwork.WinterFlowRouterStructure.exists()) {
                            return new WinterFlowDataSourceSerializer(z);
                        }
                        FileInputStream fileInputStream4 = new FileInputStream(winterFlowVersionNetwork.WinterFlowRouterStructure);
                        try {
                            winterFlowCloud.WinterFlowRouterRouter = fileInputStream4;
                            winterFlowCloud.WinterFlowSyntax = null;
                            winterFlowCloud.WinterFlowServerProtocol = 2;
                            WinterFlowDataSourceSerializer WinterFlowServerProtocol = WinterFlowCacheUtility.WinterFlowServerProtocol(fileInputStream4);
                            if (WinterFlowServerProtocol != winterFlowListenerJava) {
                                obj = WinterFlowServerProtocol;
                                fileInputStream = fileInputStream4;
                                WinterFlowCloudStack.WinterFlowTransactionAgent(fileInputStream, null);
                                return obj;
                            }
                            return winterFlowListenerJava;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = fileInputStream4;
                            throw th;
                        }
                    }
                    try {
                        winterFlowCloud.WinterFlowRouterRouter = winterFlowVersionNetwork;
                        winterFlowCloud.WinterFlowSyntax = fileInputStream2;
                        winterFlowCloud.WinterFlowServerProtocol = 1;
                        WinterFlowDataSourceSerializer WinterFlowServerProtocol2 = WinterFlowCacheUtility.WinterFlowServerProtocol(fileInputStream2);
                        if (WinterFlowServerProtocol2 != winterFlowListenerJava) {
                            fileInputStream3 = fileInputStream2;
                            obj = WinterFlowServerProtocol2;
                        }
                        return winterFlowListenerJava;
                    } catch (Throwable th4) {
                        r1 = winterFlowVersionNetwork;
                        fileInputStream3 = fileInputStream2;
                        th2 = th4;
                        throw th;
                    }
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileInputStream = (Closeable) winterFlowCloud.WinterFlowRouterRouter;
                    try {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        WinterFlowCloudStack.WinterFlowTransactionAgent(fileInputStream, null);
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                fileInputStream3 = winterFlowCloud.WinterFlowSyntax;
                r1 = (WinterFlowVersionNetwork) winterFlowCloud.WinterFlowRouterRouter;
                try {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
                WinterFlowCloudStack.WinterFlowTransactionAgent(fileInputStream3, null);
                return obj;
            }
        }
        winterFlowCloud = new WinterFlowCloud(winterFlowVersionNetwork, winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowCloud.WinterFlowResponseEngine;
        r1 = winterFlowCloud.WinterFlowServerProtocol;
        boolean z2 = true;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (r1 != 0) {
        }
        WinterFlowCloudStack.WinterFlowTransactionAgent(fileInputStream3, null);
        return obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerMapper
    public final void close() {
        this.WinterFlowHookDataSource.set(true);
    }
}
