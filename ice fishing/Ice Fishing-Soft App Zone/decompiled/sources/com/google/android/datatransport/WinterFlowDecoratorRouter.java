package com.google.android.datatransport;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDecoratorRouter implements WinterFlowThreadPoolCloud {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean WinterFlowArrayNetwork(File file, Resources resources, int i) {
        FileOutputStream fileOutputStream;
        int read;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream2 = null;
        ?? r0 = 0;
        try {
            InputStream openRawResource = resources.openRawResource(i);
            try {
                StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                boolean z = false;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file, false);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    e = e;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        read = openRawResource.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream.close();
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    z = true;
                    r0 = read;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    e.getMessage();
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    r0 = fileOutputStream2;
                    if (openRawResource != null) {
                    }
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    r0 = fileOutputStream;
                    if (r0 != 0) {
                        try {
                            r0.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (IOException unused4) {
                    }
                }
                return z;
            } catch (Throwable th3) {
                th = th3;
                inputStream = openRawResource;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void WinterFlowCacheManagerAgent(WinterFlowServiceProviderListener winterFlowServiceProviderListener, List list, WinterFlowTransactionBackend winterFlowTransactionBackend) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int WinterFlowCacheManagerAgent = winterFlowServiceProviderListener.WinterFlowCacheManagerAgent((WinterFlowDatabaseSchemaHandler) list.get(i));
            int WinterFlowCompilerHandler = winterFlowServiceProviderListener.WinterFlowCompilerHandler(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(WinterFlowCacheManagerAgent));
            Object obj = WinterFlowCompilerHandler < winterFlowServiceProviderListener.WinterFlowTransactionManagerStrategy(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(WinterFlowCacheManagerAgent + 1)) ? winterFlowServiceProviderListener.WinterFlowCacheManagerAgent[winterFlowServiceProviderListener.WinterFlowUnitTestResponse(WinterFlowCompilerHandler)] : WinterFlowModuleModule.WinterFlowRouterStructure;
            WinterFlowStackEngine winterFlowStackEngine = obj instanceof WinterFlowStackEngine ? (WinterFlowStackEngine) obj : null;
            if (winterFlowStackEngine != null) {
                winterFlowStackEngine.WinterFlowRouterStructure = winterFlowTransactionBackend;
            }
        }
    }

    public static final void WinterFlowHookDataSource(final int i, final WinterFlowEventEvent winterFlowEventEvent, final WinterFlowEventTool winterFlowEventTool, final WinterFlowEventEvent winterFlowEventEvent2, final WinterFlowEventEvent winterFlowEventEvent3, final WinterFlowDatabaseCompiler winterFlowDatabaseCompiler, final WinterFlowEventEvent winterFlowEventEvent4, WinterFlowResolverLibrary winterFlowResolverLibrary, final int i2) {
        int i3;
        int i4;
        int i5;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-280287501);
        int i6 = i2 | (winterFlowResolverLibrary.WinterFlowCacheManagerAgent(i) ? 4 : 2) | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent) ? 32 : 16) | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventTool) ? 256 : 128) | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent2) ? 2048 : 1024) | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent3) ? 16384 : 8192) | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowDatabaseCompiler) ? 131072 : 65536) | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEventEvent4) ? 1048576 : 524288);
        int i7 = 1;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i6 & 1, (599187 & i6) != 599186)) {
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            Object obj = WinterFlowModuleModule.WinterFlowRouterStructure;
            if (WinterFlowSyntaxSubsystem == obj) {
                WinterFlowSyntaxSubsystem = new WinterFlowCacheIDE();
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            final WinterFlowCacheIDE winterFlowCacheIDE = (WinterFlowCacheIDE) WinterFlowSyntaxSubsystem;
            boolean z = (i6 & 112) == 32;
            Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (z || WinterFlowSyntaxSubsystem2 == obj) {
                WinterFlowSyntaxSubsystem2 = new WinterFlowEventTool(605195056, true, new WinterFlowBackendNode(3, winterFlowEventEvent));
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
            }
            final WinterFlowEventEvent winterFlowEventEvent5 = (WinterFlowEventEvent) WinterFlowSyntaxSubsystem2;
            boolean z2 = (i6 & 7168) == 2048;
            Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (z2 || WinterFlowSyntaxSubsystem3 == obj) {
                WinterFlowSyntaxSubsystem3 = new WinterFlowEventTool(418899191, true, new WinterFlowBackendNode(2, winterFlowEventEvent2));
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
            }
            final WinterFlowEventEvent winterFlowEventEvent6 = (WinterFlowEventEvent) WinterFlowSyntaxSubsystem3;
            boolean z3 = (57344 & i6) == 16384;
            Object WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (z3 || WinterFlowSyntaxSubsystem4 == obj) {
                WinterFlowSyntaxSubsystem4 = new WinterFlowEventTool(338600263, true, new WinterFlowBackendNode(i7, winterFlowEventEvent3));
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem4);
            }
            final WinterFlowEventEvent winterFlowEventEvent7 = (WinterFlowEventEvent) WinterFlowSyntaxSubsystem4;
            boolean z4 = (i6 & 896) == 256;
            Object WinterFlowSyntaxSubsystem5 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (z4 || WinterFlowSyntaxSubsystem5 == obj) {
                i3 = i6;
                WinterFlowSyntaxSubsystem5 = new WinterFlowEventTool(-1776388365, true, new WinterFlowProtocolLayer(4, winterFlowEventTool, winterFlowCacheIDE));
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem5);
            } else {
                i3 = i6;
            }
            final WinterFlowEventEvent winterFlowEventEvent8 = (WinterFlowEventEvent) WinterFlowSyntaxSubsystem5;
            boolean z5 = (i3 & 3670016) == 1048576;
            Object WinterFlowSyntaxSubsystem6 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (z5 || WinterFlowSyntaxSubsystem6 == obj) {
                WinterFlowSyntaxSubsystem6 = new WinterFlowEventTool(-1731662488, true, new WinterFlowBackendNode(0, winterFlowEventEvent4));
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem6);
            }
            final WinterFlowEventEvent winterFlowEventEvent9 = (WinterFlowEventEvent) WinterFlowSyntaxSubsystem6;
            boolean WinterFlowVariableVersionControl = ((i3 & 458752) == 131072) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowEventEvent5) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowEventEvent6) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowEventEvent7) | ((i3 & 14) == 4) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowEventEvent9) | winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowEventEvent8);
            Object WinterFlowSyntaxSubsystem7 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowVariableVersionControl || WinterFlowSyntaxSubsystem7 == obj) {
                i4 = 1;
                i5 = 0;
                Object obj2 = new WinterFlowEventEvent() { // from class: com.google.android.datatransport.WinterFlowCacheManagerNetwork
                    @Override // com.google.android.datatransport.WinterFlowEventEvent
                    public final Object WinterFlowVariableVersionControl(Object obj3, Object obj4) {
                        int i8;
                        int WinterFlowUserManagerUserManager;
                        int WinterFlowUserManagerUserManager2;
                        WinterFlowProviderThreadPool winterFlowProviderThreadPool;
                        WinterFlowProviderThreadPool winterFlowProviderThreadPool2;
                        Integer num;
                        int i9;
                        int intValue;
                        int WinterFlowUserManagerUserManager3;
                        int WinterFlowArrayNetwork;
                        final WinterFlowInvokerStructure winterFlowInvokerStructure = (WinterFlowInvokerStructure) obj3;
                        WinterFlowHandlerConsumer winterFlowHandlerConsumer = (WinterFlowHandlerConsumer) obj4;
                        final int WinterFlowRouterRouter = WinterFlowHandlerConsumer.WinterFlowRouterRouter(winterFlowHandlerConsumer.WinterFlowRouterStructure);
                        final int WinterFlowUnitTestResponse = WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(winterFlowHandlerConsumer.WinterFlowRouterStructure);
                        long WinterFlowRouterStructure = WinterFlowHandlerConsumer.WinterFlowRouterStructure(winterFlowHandlerConsumer.WinterFlowRouterStructure, 0, 0, 0, 0, 10);
                        WinterFlowCacheManagerConfiguration layoutDirection = winterFlowInvokerStructure.getLayoutDirection();
                        final WinterFlowDatabaseCompiler winterFlowDatabaseCompiler2 = WinterFlowDatabaseCompiler.this;
                        int WinterFlowRouterStructure2 = winterFlowDatabaseCompiler2.WinterFlowRouterStructure(winterFlowInvokerStructure, layoutDirection);
                        int WinterFlowCacheManagerAgent = winterFlowDatabaseCompiler2.WinterFlowCacheManagerAgent(winterFlowInvokerStructure, winterFlowInvokerStructure.getLayoutDirection());
                        int WinterFlowArrayNetwork2 = winterFlowDatabaseCompiler2.WinterFlowArrayNetwork(winterFlowInvokerStructure);
                        final WinterFlowViewTesting WinterFlowVariableVersionControl2 = ((WinterFlowRuntimeVersion) WinterFlowSerializerUtility.WinterFlowStrategyHook(winterFlowInvokerStructure.WinterFlowUnitTestResponse(winterFlowEventEvent5, WinterFlowModuleValidator.WinterFlowVariableVersionControl))).WinterFlowVariableVersionControl(WinterFlowRouterStructure);
                        int i10 = (-WinterFlowRouterStructure2) - WinterFlowCacheManagerAgent;
                        int i11 = -WinterFlowArrayNetwork2;
                        final WinterFlowViewTesting WinterFlowVariableVersionControl3 = ((WinterFlowRuntimeVersion) WinterFlowSerializerUtility.WinterFlowStrategyHook(winterFlowInvokerStructure.WinterFlowUnitTestResponse(winterFlowEventEvent6, WinterFlowModuleValidator.WinterFlowUnitTestResponse))).WinterFlowVariableVersionControl(WinterFlowServiceOrchestration.WinterFlowRouterRouter(i10, i11, WinterFlowRouterStructure));
                        final WinterFlowViewTesting WinterFlowVariableVersionControl4 = ((WinterFlowRuntimeVersion) WinterFlowSerializerUtility.WinterFlowStrategyHook(winterFlowInvokerStructure.WinterFlowUnitTestResponse(winterFlowEventEvent7, WinterFlowModuleValidator.WinterFlowRouterRouter))).WinterFlowVariableVersionControl(WinterFlowServiceOrchestration.WinterFlowRouterRouter(i10, i11, WinterFlowRouterStructure));
                        int i12 = WinterFlowVariableVersionControl4.WinterFlowVariableVersionControl;
                        WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration = WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl;
                        int i13 = i;
                        if (i12 == 0 && WinterFlowVariableVersionControl4.WinterFlowTransactionManagerStrategy == 0) {
                            winterFlowProviderThreadPool = null;
                        } else {
                            int i14 = WinterFlowVariableVersionControl4.WinterFlowTransactionManagerStrategy;
                            if (i13 == 0) {
                                i8 = WinterFlowRouterStructure2;
                                if (winterFlowInvokerStructure.getLayoutDirection() == winterFlowCacheManagerConfiguration) {
                                    WinterFlowUserManagerUserManager = winterFlowInvokerStructure.WinterFlowUserManagerUserManager(16.0f);
                                    WinterFlowUserManagerUserManager2 = WinterFlowUserManagerUserManager + i8;
                                    winterFlowProviderThreadPool = new WinterFlowProviderThreadPool(WinterFlowUserManagerUserManager2, i14);
                                } else {
                                    WinterFlowUserManagerUserManager2 = ((WinterFlowRouterRouter - winterFlowInvokerStructure.WinterFlowUserManagerUserManager(16.0f)) - i12) - WinterFlowCacheManagerAgent;
                                    winterFlowProviderThreadPool = new WinterFlowProviderThreadPool(WinterFlowUserManagerUserManager2, i14);
                                }
                            } else {
                                i8 = WinterFlowRouterStructure2;
                                if (i13 != 2 && i13 != 3) {
                                    WinterFlowUserManagerUserManager2 = (((WinterFlowRouterRouter - i12) + i8) - WinterFlowCacheManagerAgent) / 2;
                                } else if (winterFlowInvokerStructure.getLayoutDirection() == winterFlowCacheManagerConfiguration) {
                                    WinterFlowUserManagerUserManager2 = ((WinterFlowRouterRouter - winterFlowInvokerStructure.WinterFlowUserManagerUserManager(16.0f)) - i12) - WinterFlowCacheManagerAgent;
                                } else {
                                    WinterFlowUserManagerUserManager = winterFlowInvokerStructure.WinterFlowUserManagerUserManager(16.0f);
                                    WinterFlowUserManagerUserManager2 = WinterFlowUserManagerUserManager + i8;
                                }
                                winterFlowProviderThreadPool = new WinterFlowProviderThreadPool(WinterFlowUserManagerUserManager2, i14);
                            }
                        }
                        final WinterFlowViewTesting WinterFlowVariableVersionControl5 = ((WinterFlowRuntimeVersion) WinterFlowSerializerUtility.WinterFlowStrategyHook(winterFlowInvokerStructure.WinterFlowUnitTestResponse(winterFlowEventEvent9, WinterFlowModuleValidator.WinterFlowSyntax))).WinterFlowVariableVersionControl(WinterFlowRouterStructure);
                        boolean z6 = WinterFlowVariableVersionControl5.WinterFlowVariableVersionControl == 0 && WinterFlowVariableVersionControl5.WinterFlowTransactionManagerStrategy == 0;
                        if (winterFlowProviderThreadPool != null) {
                            int i15 = winterFlowProviderThreadPool.WinterFlowHookDataSource;
                            winterFlowProviderThreadPool2 = winterFlowProviderThreadPool;
                            if (z6 || i13 == 3) {
                                WinterFlowUserManagerUserManager3 = winterFlowInvokerStructure.WinterFlowUserManagerUserManager(16.0f) + i15;
                                WinterFlowArrayNetwork = winterFlowDatabaseCompiler2.WinterFlowArrayNetwork(winterFlowInvokerStructure);
                            } else {
                                WinterFlowUserManagerUserManager3 = WinterFlowVariableVersionControl5.WinterFlowTransactionManagerStrategy + i15;
                                WinterFlowArrayNetwork = winterFlowInvokerStructure.WinterFlowUserManagerUserManager(16.0f);
                            }
                            num = Integer.valueOf(WinterFlowArrayNetwork + WinterFlowUserManagerUserManager3);
                        } else {
                            winterFlowProviderThreadPool2 = winterFlowProviderThreadPool;
                            num = null;
                        }
                        int i16 = WinterFlowVariableVersionControl3.WinterFlowTransactionManagerStrategy;
                        if (i16 != 0) {
                            if (num != null) {
                                intValue = num.intValue();
                            } else {
                                Integer valueOf = z6 ? null : Integer.valueOf(WinterFlowVariableVersionControl5.WinterFlowTransactionManagerStrategy);
                                intValue = valueOf != null ? valueOf.intValue() : winterFlowDatabaseCompiler2.WinterFlowArrayNetwork(winterFlowInvokerStructure);
                            }
                            i9 = intValue + i16;
                        } else {
                            i9 = 0;
                        }
                        float WinterFlowArrayFramework = (WinterFlowVariableVersionControl2.WinterFlowVariableVersionControl == 0 && WinterFlowVariableVersionControl2.WinterFlowTransactionManagerStrategy == 0) ? winterFlowInvokerStructure.WinterFlowArrayFramework(winterFlowDatabaseCompiler2.WinterFlowHookDataSource(winterFlowInvokerStructure)) : winterFlowInvokerStructure.WinterFlowArrayFramework(WinterFlowVariableVersionControl2.WinterFlowTransactionManagerStrategy);
                        float WinterFlowArrayFramework2 = z6 ? winterFlowInvokerStructure.WinterFlowArrayFramework(winterFlowDatabaseCompiler2.WinterFlowArrayNetwork(winterFlowInvokerStructure)) : winterFlowInvokerStructure.WinterFlowArrayFramework(WinterFlowVariableVersionControl5.WinterFlowTransactionManagerStrategy);
                        final Integer num2 = num;
                        WinterFlowCacheManagerConfiguration layoutDirection2 = winterFlowInvokerStructure.getLayoutDirection();
                        float WinterFlowArrayFramework3 = layoutDirection2 == winterFlowCacheManagerConfiguration ? winterFlowInvokerStructure.WinterFlowArrayFramework(winterFlowDatabaseCompiler2.WinterFlowRouterStructure(winterFlowInvokerStructure, layoutDirection2)) : winterFlowInvokerStructure.WinterFlowArrayFramework(winterFlowDatabaseCompiler2.WinterFlowCacheManagerAgent(winterFlowInvokerStructure, layoutDirection2));
                        WinterFlowCacheManagerConfiguration layoutDirection3 = winterFlowInvokerStructure.getLayoutDirection();
                        winterFlowCacheIDE.WinterFlowRouterStructure.setValue(new WinterFlowExceptionXML(WinterFlowArrayFramework3, WinterFlowArrayFramework, layoutDirection3 == winterFlowCacheManagerConfiguration ? winterFlowInvokerStructure.WinterFlowArrayFramework(winterFlowDatabaseCompiler2.WinterFlowCacheManagerAgent(winterFlowInvokerStructure, layoutDirection3)) : winterFlowInvokerStructure.WinterFlowArrayFramework(winterFlowDatabaseCompiler2.WinterFlowRouterStructure(winterFlowInvokerStructure, layoutDirection3)), WinterFlowArrayFramework2));
                        final WinterFlowViewTesting WinterFlowVariableVersionControl6 = ((WinterFlowRuntimeVersion) WinterFlowSerializerUtility.WinterFlowStrategyHook(winterFlowInvokerStructure.WinterFlowUnitTestResponse(winterFlowEventEvent8, WinterFlowModuleValidator.WinterFlowTransactionManagerStrategy))).WinterFlowVariableVersionControl(WinterFlowRouterStructure);
                        final WinterFlowProviderThreadPool winterFlowProviderThreadPool3 = winterFlowProviderThreadPool2;
                        final int i17 = i9;
                        return winterFlowInvokerStructure.WinterFlowThreadListener(WinterFlowRouterRouter, WinterFlowUnitTestResponse, WinterFlowFrontendNode.WinterFlowVariableVersionControl, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowProxyManager
                            @Override // com.google.android.datatransport.WinterFlowObjectSession
                            public final Object WinterFlowUnitTestResponse(Object obj5) {
                                WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager = (WinterFlowDecoratorSessionManager) obj5;
                                WinterFlowDecoratorSessionManager.WinterFlowSyntax(winterFlowDecoratorSessionManager, WinterFlowViewTesting.this, 0, 0);
                                WinterFlowDecoratorSessionManager.WinterFlowSyntax(winterFlowDecoratorSessionManager, WinterFlowVariableVersionControl2, 0, 0);
                                WinterFlowViewTesting winterFlowViewTesting = WinterFlowVariableVersionControl3;
                                int i18 = WinterFlowRouterRouter - winterFlowViewTesting.WinterFlowVariableVersionControl;
                                WinterFlowInvokerStructure winterFlowInvokerStructure2 = winterFlowInvokerStructure;
                                WinterFlowCacheManagerConfiguration layoutDirection4 = winterFlowInvokerStructure2.getLayoutDirection();
                                WinterFlowDatabaseCompiler winterFlowDatabaseCompiler3 = winterFlowDatabaseCompiler2;
                                int WinterFlowRouterStructure3 = ((winterFlowDatabaseCompiler3.WinterFlowRouterStructure(winterFlowInvokerStructure2, layoutDirection4) + i18) - winterFlowDatabaseCompiler3.WinterFlowCacheManagerAgent(winterFlowInvokerStructure2, winterFlowInvokerStructure2.getLayoutDirection())) / 2;
                                int i19 = WinterFlowUnitTestResponse;
                                WinterFlowDecoratorSessionManager.WinterFlowSyntax(winterFlowDecoratorSessionManager, winterFlowViewTesting, WinterFlowRouterStructure3, i19 - i17);
                                WinterFlowViewTesting winterFlowViewTesting2 = WinterFlowVariableVersionControl5;
                                WinterFlowDecoratorSessionManager.WinterFlowSyntax(winterFlowDecoratorSessionManager, winterFlowViewTesting2, 0, i19 - winterFlowViewTesting2.WinterFlowTransactionManagerStrategy);
                                WinterFlowProviderThreadPool winterFlowProviderThreadPool4 = winterFlowProviderThreadPool3;
                                if (winterFlowProviderThreadPool4 != null) {
                                    int i20 = winterFlowProviderThreadPool4.WinterFlowRouterStructure;
                                    Integer num3 = num2;
                                    num3.getClass();
                                    WinterFlowDecoratorSessionManager.WinterFlowSyntax(winterFlowDecoratorSessionManager, WinterFlowVariableVersionControl4, i20, i19 - num3.intValue());
                                }
                                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                            }
                        });
                    }
                };
                winterFlowResolverLibrary.WinterFlowArrayFramework(obj2);
                WinterFlowSyntaxSubsystem7 = obj2;
            } else {
                i4 = 1;
                i5 = 0;
            }
            WinterFlowUnitTestLibrary.WinterFlowTransactionManagerStrategy(null, (WinterFlowEventEvent) WinterFlowSyntaxSubsystem7, winterFlowResolverLibrary, i5, i4);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowEventEvent(i, winterFlowEventEvent, winterFlowEventTool, winterFlowEventEvent2, winterFlowEventEvent3, winterFlowDatabaseCompiler, winterFlowEventEvent4, i2) { // from class: com.google.android.datatransport.WinterFlowJSONBackend
                public final /* synthetic */ WinterFlowDatabaseCompiler WinterFlowResponseEngine;
                public final /* synthetic */ WinterFlowEventEvent WinterFlowRouterRouter;
                public final /* synthetic */ WinterFlowEventEvent WinterFlowSyntax;
                public final /* synthetic */ WinterFlowEventEvent WinterFlowTransactionAgent;
                public final /* synthetic */ WinterFlowEventEvent WinterFlowTransactionManagerStrategy;
                public final /* synthetic */ WinterFlowEventTool WinterFlowUnitTestResponse;
                public final /* synthetic */ int WinterFlowVariableVersionControl;

                @Override // com.google.android.datatransport.WinterFlowEventEvent
                public final Object WinterFlowVariableVersionControl(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int WinterFlowResponseEngine = WinterFlowConfigurationException.WinterFlowResponseEngine(1);
                    WinterFlowDecoratorRouter.WinterFlowHookDataSource(this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, (WinterFlowResolverLibrary) obj3, WinterFlowResponseEngine);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            };
        }
    }

    public static final WinterFlowRouterLayer WinterFlowResponseEngine(WinterFlowManagerHelper winterFlowManagerHelper, int i) {
        Object obj;
        Iterator<T> it = winterFlowManagerHelper.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((WinterFlowSchedulerStructure) ((Map.Entry) obj).getKey()).WinterFlowTransactionManagerStrategy == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (WinterFlowRouterLayer) entry.getValue();
        }
        return null;
    }

    public static final float WinterFlowRouterRouter(WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager, boolean z, WinterFlowWorkerInvoker[] winterFlowWorkerInvokerArr, float f) {
        float f2 = Float.NaN;
        for (WinterFlowWorkerInvoker winterFlowWorkerInvoker : winterFlowWorkerInvokerArr) {
            float WinterFlowRouterStructure = winterFlowDecoratorSessionManager.WinterFlowRouterStructure(winterFlowWorkerInvoker);
            if (!Float.isNaN(f2)) {
                int i = z != (WinterFlowRouterStructure > f2) ? i + 1 : 0;
            }
            f2 = WinterFlowRouterStructure;
        }
        return Float.isNaN(f2) ? f : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WinterFlowRouterStructure(final WinterFlowMapperManager winterFlowMapperManager, WinterFlowEventEvent winterFlowEventEvent, WinterFlowEventEvent winterFlowEventEvent2, WinterFlowEventEvent winterFlowEventEvent3, WinterFlowEventEvent winterFlowEventEvent4, int i, long j, long j2, WinterFlowDatabaseCompiler winterFlowDatabaseCompiler, final WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, final int i2, int i3) {
        WinterFlowDatabaseCompiler winterFlowDatabaseCompiler2;
        int i4;
        int i5;
        final WinterFlowEventEvent winterFlowEventEvent5;
        final WinterFlowEventEvent winterFlowEventEvent6;
        final WinterFlowEventEvent winterFlowEventEvent7;
        final int i6;
        final long j3;
        final long j4;
        final WinterFlowDatabaseCompiler winterFlowDatabaseCompiler3;
        WinterFlowStackEngine WinterFlowConcurrencyThread;
        WinterFlowEventEvent winterFlowEventEvent8;
        WinterFlowEventEvent winterFlowEventEvent9;
        WinterFlowEventEvent winterFlowEventEvent10;
        int i7;
        int i8;
        long j5;
        WinterFlowEventEvent winterFlowEventEvent11;
        int i9;
        boolean z;
        final int i10 = i3;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-1211482744);
        int i11 = i2 | 4943280;
        if ((i10 & 256) == 0) {
            winterFlowDatabaseCompiler2 = winterFlowDatabaseCompiler;
            if (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowDatabaseCompiler2)) {
                i4 = 67108864;
                i5 = i11 | i4;
                if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i5 & 1, (306783379 & i5) == 306783378)) {
                    winterFlowResolverLibrary.WinterFlowQueueService();
                    winterFlowEventEvent5 = winterFlowEventEvent2;
                    winterFlowEventEvent6 = winterFlowEventEvent3;
                    winterFlowEventEvent7 = winterFlowEventEvent4;
                    i6 = i;
                    j3 = j;
                    j4 = j2;
                    winterFlowDatabaseCompiler3 = winterFlowDatabaseCompiler;
                } else {
                    winterFlowResolverLibrary.WinterFlowProxyStructure();
                    if ((i2 & 1) == 0 || winterFlowResolverLibrary.WinterFlowResolverController()) {
                        WinterFlowEventTool winterFlowEventTool2 = WinterFlowFrameworkInvoker.WinterFlowRouterStructure;
                        winterFlowEventEvent8 = WinterFlowFrameworkInvoker.WinterFlowHookDataSource;
                        winterFlowEventEvent9 = WinterFlowFrameworkInvoker.WinterFlowCacheManagerAgent;
                        winterFlowEventEvent10 = WinterFlowFrameworkInvoker.WinterFlowArrayNetwork;
                        WinterFlowProtocolEntity winterFlowProtocolEntity = WinterFlowSessionManagerFrontend.WinterFlowRouterStructure;
                        j3 = ((WinterFlowServiceView) winterFlowResolverLibrary.WinterFlowSyntax(winterFlowProtocolEntity)).WinterFlowServiceUtility;
                        winterFlowResolverLibrary.WinterFlowCompilerDataSource(89374938);
                        WinterFlowServiceView winterFlowServiceView = (WinterFlowServiceView) winterFlowResolverLibrary.WinterFlowSyntax(winterFlowProtocolEntity);
                        long j6 = winterFlowServiceView.WinterFlowRouterStructure;
                        long j7 = winterFlowServiceView.WinterFlowValidatorHandler;
                        long j8 = winterFlowServiceView.WinterFlowQueueService;
                        long j9 = winterFlowServiceView.WinterFlowCompilerHandler;
                        long j10 = winterFlowServiceView.WinterFlowConcurrencyThread;
                        int i12 = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
                        if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, j6)) {
                            j7 = winterFlowServiceView.WinterFlowHookDataSource;
                        } else if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowTransactionManagerStrategy)) {
                            j7 = winterFlowServiceView.WinterFlowUnitTestResponse;
                        } else if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowResponseEngine)) {
                            j7 = winterFlowServiceView.WinterFlowTransactionAgent;
                        } else if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowServiceUtility)) {
                            j7 = winterFlowServiceView.WinterFlowBandwidthObject;
                        } else if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowMapperProtocol)) {
                            j7 = winterFlowServiceView.WinterFlowResolverController;
                        } else if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowCacheManagerAgent)) {
                            j7 = winterFlowServiceView.WinterFlowArrayNetwork;
                        } else if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowRouterRouter)) {
                            j7 = winterFlowServiceView.WinterFlowSyntax;
                        } else if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowServerProtocol)) {
                            j7 = winterFlowServiceView.WinterFlowThreadListener;
                        } else if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowConsumerUserManager)) {
                            j7 = winterFlowServiceView.WinterFlowBackendCacheManager;
                        } else if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowRouterAdapter)) {
                            j7 = winterFlowServiceView.WinterFlowSerializerStructure;
                        } else {
                            if (!WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowOrchestrationSubsystem)) {
                                if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowSingletonPlatform)) {
                                    j7 = winterFlowServiceView.WinterFlowVariableBandwidth;
                                } else if (!WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowConfigurationSubsystem) && !WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowCacheManagerListener) && !WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowPackageIDE) && !WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowSoftwareProtocol) && !WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowUserManagerUserManager) && !WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowSoftwareEngine) && !WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowStrategyTool)) {
                                    if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowSyntaxSubsystem) || WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowTestingNode)) {
                                        j7 = j9;
                                    } else if (WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowCloudMicroservice) || WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowUIMiddleware)) {
                                        j7 = j8;
                                    } else if (!WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowProxyStructure) && !WinterFlowUnitTestSoftware.WinterFlowRouterStructure(j3, winterFlowServiceView.WinterFlowConfiguration)) {
                                        j7 = WinterFlowInheritanceSubsystem.WinterFlowResponseEngine;
                                    }
                                }
                            }
                            j7 = j10;
                        }
                        long j11 = j7 != 16 ? j7 : ((WinterFlowInheritanceSubsystem) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowSoftwareLayer.WinterFlowRouterStructure)).WinterFlowRouterStructure;
                        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                        int i13 = i5 & (-33030145);
                        i10 = i3;
                        i7 = 2;
                        if ((i10 & 256) != 0) {
                            WeakHashMap weakHashMap = WinterFlowBandwidthProcess.WinterFlowSerializerStructure;
                            i8 = i5 & (-267911169);
                            j5 = j11;
                            winterFlowDatabaseCompiler2 = new WinterFlowCompilerThread(WinterFlowDecoratorUI.WinterFlowBandwidthObject(winterFlowResolverLibrary).WinterFlowUnitTestResponse, WinterFlowDecoratorUI.WinterFlowBandwidthObject(winterFlowResolverLibrary).WinterFlowHookDataSource);
                            winterFlowEventEvent11 = winterFlowEventTool2;
                        } else {
                            i8 = i13;
                            j5 = j11;
                            winterFlowEventEvent11 = winterFlowEventTool2;
                            winterFlowDatabaseCompiler2 = winterFlowDatabaseCompiler;
                        }
                    } else {
                        winterFlowResolverLibrary.WinterFlowQueueService();
                        int i14 = i5 & (-33030145);
                        if ((i10 & 256) != 0) {
                            i14 = i5 & (-267911169);
                        }
                        winterFlowEventEvent11 = winterFlowEventEvent;
                        winterFlowEventEvent8 = winterFlowEventEvent2;
                        winterFlowEventEvent9 = winterFlowEventEvent3;
                        winterFlowEventEvent10 = winterFlowEventEvent4;
                        i7 = i;
                        j3 = j;
                        i8 = i14;
                        j5 = j2;
                    }
                    winterFlowResolverLibrary.WinterFlowOrchestrationSubsystem();
                    int i15 = (234881024 & i8) ^ 100663296;
                    if ((i15 <= 67108864 || !winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowDatabaseCompiler2)) && (i8 & 100663296) != 67108864) {
                        i9 = i15;
                        z = false;
                    } else {
                        i9 = i15;
                        z = true;
                    }
                    Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                    WinterFlowEventEvent winterFlowEventEvent12 = winterFlowEventEvent11;
                    Object obj = WinterFlowModuleModule.WinterFlowRouterStructure;
                    if (z || WinterFlowSyntaxSubsystem == obj) {
                        WinterFlowSyntaxSubsystem = new WinterFlowLoaderRenderer(winterFlowDatabaseCompiler2);
                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                    }
                    WinterFlowLoaderRenderer winterFlowLoaderRenderer = (WinterFlowLoaderRenderer) WinterFlowSyntaxSubsystem;
                    int i16 = i7;
                    boolean WinterFlowVariableVersionControl = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowLoaderRenderer) | ((i9 > 67108864 && winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowDatabaseCompiler2)) || (i8 & 100663296) == 67108864);
                    Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                    if (WinterFlowVariableVersionControl || WinterFlowSyntaxSubsystem2 == obj) {
                        WinterFlowSyntaxSubsystem2 = new WinterFlowRouterCompiler(28, winterFlowLoaderRenderer, winterFlowDatabaseCompiler2);
                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                    }
                    WinterFlowMapperManager WinterFlowCacheManagerListener = WinterFlowManagerRequest.WinterFlowCacheManagerListener(winterFlowMapperManager, (WinterFlowObjectSession) WinterFlowSyntaxSubsystem2);
                    WinterFlowEventTool WinterFlowSyntaxSubsystem3 = WinterFlowManagerRequest.WinterFlowSyntaxSubsystem(848889571, new WinterFlowArrayTransaction(i16, winterFlowEventEvent12, winterFlowEventTool, winterFlowEventEvent9, winterFlowEventEvent10, winterFlowLoaderRenderer, winterFlowEventEvent8), winterFlowResolverLibrary);
                    WinterFlowPipelineHelper winterFlowPipelineHelper = WinterFlowVersionControlBatch.WinterFlowRouterStructure;
                    WinterFlowProcessorSessionManager winterFlowProcessorSessionManager = WinterFlowCacheRuntime.WinterFlowTransactionAgent;
                    WinterFlowProtocolEntity winterFlowProtocolEntity2 = WinterFlowVersionControlBatch.WinterFlowRouterStructure;
                    WinterFlowDatabaseCompiler winterFlowDatabaseCompiler4 = winterFlowDatabaseCompiler2;
                    float f = ((WinterFlowRequestScheduler) winterFlowResolverLibrary.WinterFlowSyntax(winterFlowProtocolEntity2)).WinterFlowVariableVersionControl + 0.0f;
                    winterFlowEventEvent = winterFlowEventEvent12;
                    WinterFlowHandlerWebsocket.WinterFlowCacheManagerAgent(new WinterFlowRepositoryWorker[]{WinterFlowSoftwareLayer.WinterFlowRouterStructure.WinterFlowRouterStructure(new WinterFlowInheritanceSubsystem(j5)), winterFlowProtocolEntity2.WinterFlowRouterStructure(new WinterFlowRequestScheduler(f))}, WinterFlowManagerRequest.WinterFlowSyntaxSubsystem(421772006, new WinterFlowUnitTestAgent(WinterFlowCacheManagerListener, winterFlowProcessorSessionManager, j3, f, WinterFlowSyntaxSubsystem3), winterFlowResolverLibrary), winterFlowResolverLibrary, 56);
                    winterFlowEventEvent5 = winterFlowEventEvent8;
                    i6 = i16;
                    long j12 = j5;
                    winterFlowEventEvent6 = winterFlowEventEvent9;
                    j4 = j12;
                    winterFlowEventEvent7 = winterFlowEventEvent10;
                    winterFlowDatabaseCompiler3 = winterFlowDatabaseCompiler4;
                }
                final WinterFlowEventEvent winterFlowEventEvent13 = winterFlowEventEvent;
                WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
                if (WinterFlowConcurrencyThread == null) {
                    WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowEventEvent(winterFlowEventEvent13, winterFlowEventEvent5, winterFlowEventEvent6, winterFlowEventEvent7, i6, j3, j4, winterFlowDatabaseCompiler3, winterFlowEventTool, i2, i10) { // from class: com.google.android.datatransport.WinterFlowInheritanceDebug
                        public final /* synthetic */ int WinterFlowBandwidthObject;
                        public final /* synthetic */ int WinterFlowResponseEngine;
                        public final /* synthetic */ WinterFlowEventEvent WinterFlowRouterRouter;
                        public final /* synthetic */ long WinterFlowServerProtocol;
                        public final /* synthetic */ WinterFlowEventTool WinterFlowServiceUtility;
                        public final /* synthetic */ WinterFlowEventEvent WinterFlowSyntax;
                        public final /* synthetic */ WinterFlowDatabaseCompiler WinterFlowThreadListener;
                        public final /* synthetic */ long WinterFlowTransactionAgent;
                        public final /* synthetic */ WinterFlowEventEvent WinterFlowTransactionManagerStrategy;
                        public final /* synthetic */ WinterFlowEventEvent WinterFlowUnitTestResponse;

                        {
                            this.WinterFlowBandwidthObject = i10;
                        }

                        @Override // com.google.android.datatransport.WinterFlowEventEvent
                        public final Object WinterFlowVariableVersionControl(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int WinterFlowResponseEngine = WinterFlowConfigurationException.WinterFlowResponseEngine(805306375);
                            WinterFlowDecoratorRouter.WinterFlowRouterStructure(WinterFlowMapperManager.this, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, this.WinterFlowServiceUtility, (WinterFlowResolverLibrary) obj2, WinterFlowResponseEngine, this.WinterFlowBandwidthObject);
                            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            winterFlowDatabaseCompiler2 = winterFlowDatabaseCompiler;
        }
        i4 = 33554432;
        i5 = i11 | i4;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i5 & 1, (306783379 & i5) == 306783378)) {
        }
        final WinterFlowEventEvent winterFlowEventEvent132 = winterFlowEventEvent;
        WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread == null) {
        }
    }

    public static int WinterFlowServerProtocol(String str, int i, int i2) {
        return (int) WinterFlowTransactionAgent(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final void WinterFlowServiceUtility() {
        throw new UnsupportedOperationException();
    }

    public static MappedByteBuffer WinterFlowSyntax(Uri uri, Context context) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final WinterFlowBackendSessionManager WinterFlowThreadListener(WinterFlowVariableDataSource winterFlowVariableDataSource) {
        return new WinterFlowBackendSessionManager(winterFlowVariableDataSource.WinterFlowRouterStructure, winterFlowVariableDataSource.WinterFlowHookDataSource, winterFlowVariableDataSource.WinterFlowCacheManagerAgent, winterFlowVariableDataSource.WinterFlowArrayNetwork);
    }

    public static final long WinterFlowTransactionAgent(String str, long j, long j2, long j3) {
        String str2;
        boolean z;
        int i = WinterFlowInterfaceTransaction.WinterFlowRouterStructure;
        Long l = null;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        int i2 = 10;
        WinterFlowQuerySyntax.WinterFlowArrayNetwork(10);
        int length = str2.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str2.charAt(0);
            long j4 = -9223372036854775807L;
            if (charAt < '0') {
                z = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z = false;
                        i3 = 1;
                    } else if (charAt == '-') {
                        j4 = Long.MIN_VALUE;
                        i3 = 1;
                    }
                }
            } else {
                z = false;
            }
            long j5 = 0;
            long j6 = -256204778801521550L;
            while (true) {
                if (i3 < length) {
                    int digit = Character.digit((int) str2.charAt(i3), i2);
                    if (digit < 0) {
                        break;
                    }
                    if (j5 < j6) {
                        if (j6 != -256204778801521550L) {
                            break;
                        }
                        j6 = j4 / 10;
                        if (j5 < j6) {
                            break;
                        }
                    }
                    long j7 = j5 * 10;
                    int i4 = length;
                    long j8 = digit;
                    if (j7 < j4 + j8) {
                        break;
                    }
                    j5 = j7 - j8;
                    i3++;
                    length = i4;
                    i2 = 10;
                } else {
                    l = z ? Long.valueOf(j5) : Long.valueOf(-j5);
                }
            }
        }
        if (l == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = l.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static File WinterFlowTransactionManagerStrategy(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, WinterFlowResolverBackend.WinterFlowSyntax(str, i));
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final WinterFlowMiddlewareModule WinterFlowUnitTestResponse(WinterFlowDecoratorBackend winterFlowDecoratorBackend) {
        WinterFlowObjectSession winterFlowObjectSession;
        ArrayList arrayList = new ArrayList();
        Object WinterFlowUnitTestResponse = winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowRouterStructure);
        if (WinterFlowUnitTestResponse == null) {
            WinterFlowUnitTestResponse = null;
        }
        WinterFlowDecoratorStrategy winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse;
        if (winterFlowDecoratorStrategy == null || (winterFlowObjectSession = (WinterFlowObjectSession) winterFlowDecoratorStrategy.WinterFlowHookDataSource) == null || !((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(arrayList)).booleanValue()) {
            return null;
        }
        return (WinterFlowMiddlewareModule) arrayList.get(0);
    }

    public static final long WinterFlowVariableVersionControl() {
        return Thread.currentThread().getId();
    }
}
