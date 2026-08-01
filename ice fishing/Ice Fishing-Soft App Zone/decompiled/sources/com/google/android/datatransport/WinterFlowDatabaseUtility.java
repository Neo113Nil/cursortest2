package com.google.android.datatransport;

import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseUtility {
    public final WinterFlowJSONDecorator WinterFlowArrayNetwork;
    public final boolean WinterFlowHookDataSource;
    public final WinterFlowHandlerPlatform WinterFlowResponseEngine;
    public WinterFlowDatabaseProtocol WinterFlowSyntax;
    public boolean WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public int WinterFlowVariableVersionControl;
    public WinterFlowConfigurationModule WinterFlowRouterStructure = new WinterFlowConfigurationModule(5);
    public WinterFlowObjectPackage WinterFlowCacheManagerAgent = new WinterFlowObjectPackage(11);
    public final ArrayList WinterFlowRouterRouter = new ArrayList();

    public WinterFlowDatabaseUtility(WinterFlowDecoratorVersion winterFlowDecoratorVersion, boolean z) {
        this.WinterFlowHookDataSource = z;
        this.WinterFlowArrayNetwork = new WinterFlowJSONDecorator(winterFlowDecoratorVersion);
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol = WinterFlowDatabaseProtocol.WinterFlowTransactionManagerStrategy;
        this.WinterFlowSyntax = winterFlowDatabaseProtocol;
        this.WinterFlowResponseEngine = WinterFlowTestingCloud.WinterFlowCacheManagerAgent(winterFlowDatabaseProtocol);
    }

    public final void WinterFlowArrayNetwork(WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
        winterFlowMicroserviceProcess.getClass();
        WinterFlowCacheManagerAgent("handleLifecycleEvent");
        WinterFlowVariableVersionControl(winterFlowMicroserviceProcess.WinterFlowRouterStructure());
    }

    public final void WinterFlowCacheManagerAgent(String str) {
        if (this.WinterFlowHookDataSource) {
            WinterFlowMiddlewareService.WinterFlowServiceUtility().getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(WinterFlowResolverBackend.WinterFlowResponseEngine("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final WinterFlowDatabaseProtocol WinterFlowHookDataSource(WinterFlowClassDecorator winterFlowClassDecorator) {
        WinterFlowObjectPackage winterFlowObjectPackage = this.WinterFlowCacheManagerAgent;
        winterFlowObjectPackage.getClass();
        winterFlowClassDecorator.getClass();
        WinterFlowHandlerHook winterFlowHandlerHook = (WinterFlowHandlerHook) ((WinterFlowDatabaseSchemaStructure) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowUnitTestResponse(winterFlowClassDecorator);
        WinterFlowHandlerHook winterFlowHandlerHook2 = winterFlowHandlerHook != null ? winterFlowHandlerHook.WinterFlowRouterRouter : null;
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol = winterFlowHandlerHook2 != null ? winterFlowHandlerHook2.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure : null;
        ArrayList arrayList = this.WinterFlowRouterRouter;
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol2 = arrayList.isEmpty() ? null : (WinterFlowDatabaseProtocol) arrayList.get(arrayList.size() - 1);
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol3 = this.WinterFlowSyntax;
        if (winterFlowDatabaseProtocol == null || winterFlowDatabaseProtocol.compareTo(winterFlowDatabaseProtocol3) >= 0) {
            winterFlowDatabaseProtocol = winterFlowDatabaseProtocol3;
        }
        return (winterFlowDatabaseProtocol2 == null || winterFlowDatabaseProtocol2.compareTo(winterFlowDatabaseProtocol) >= 0) ? winterFlowDatabaseProtocol : winterFlowDatabaseProtocol2;
    }

    public final void WinterFlowRouterRouter() {
        Object obj = ((WeakReference) this.WinterFlowArrayNetwork.WinterFlowTransactionManagerStrategy).get();
        if (obj == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final WinterFlowDecoratorVersion winterFlowDecoratorVersion = (WinterFlowDecoratorVersion) obj;
        while (true) {
            WinterFlowObjectPackage winterFlowObjectPackage = this.WinterFlowCacheManagerAgent;
            final int i = 0;
            if (((WinterFlowDatabaseSchemaStructure) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl == 0) {
                break;
            }
            WinterFlowHandlerHook winterFlowHandlerHook = (WinterFlowHandlerHook) winterFlowObjectPackage.WinterFlowUnitTestResponse;
            if (winterFlowHandlerHook == null) {
                WinterFlowCompilerMechanism.WinterFlowSyntax("Collection is empty.");
                return;
            }
            WinterFlowDatabaseProtocol winterFlowDatabaseProtocol = winterFlowHandlerHook.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure;
            WinterFlowHandlerHook winterFlowHandlerHook2 = (WinterFlowHandlerHook) winterFlowObjectPackage.WinterFlowRouterRouter;
            if (winterFlowHandlerHook2 == null) {
                WinterFlowCompilerMechanism.WinterFlowSyntax("Collection is empty.");
                return;
            }
            WinterFlowDatabaseProtocol winterFlowDatabaseProtocol2 = winterFlowHandlerHook2.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure;
            if (winterFlowDatabaseProtocol == winterFlowDatabaseProtocol2 && this.WinterFlowSyntax == winterFlowDatabaseProtocol2) {
                break;
            }
            this.WinterFlowUnitTestResponse = false;
            WinterFlowDatabaseProtocol winterFlowDatabaseProtocol3 = this.WinterFlowSyntax;
            if (winterFlowHandlerHook == null) {
                WinterFlowCompilerMechanism.WinterFlowSyntax("Collection is empty.");
                return;
            }
            if (winterFlowDatabaseProtocol3.compareTo(winterFlowDatabaseProtocol) < 0) {
                WinterFlowObjectPackage winterFlowObjectPackage2 = this.WinterFlowCacheManagerAgent;
                WinterFlowObjectSession winterFlowObjectSession = new WinterFlowObjectSession(this) { // from class: com.google.android.datatransport.WinterFlowTestingMechanism
                    public final /* synthetic */ WinterFlowDatabaseUtility WinterFlowTransactionManagerStrategy;

                    {
                        this.WinterFlowTransactionManagerStrategy = this;
                    }

                    @Override // com.google.android.datatransport.WinterFlowObjectSession
                    public final Object WinterFlowUnitTestResponse(Object obj2) {
                        int i2 = i;
                        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        WinterFlowDecoratorVersion winterFlowDecoratorVersion2 = winterFlowDecoratorVersion;
                        WinterFlowDatabaseUtility winterFlowDatabaseUtility = this.WinterFlowTransactionManagerStrategy;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i2) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                entry.getClass();
                                WinterFlowClassDecorator winterFlowClassDecorator = (WinterFlowClassDecorator) entry.getKey();
                                WinterFlowCacheServer winterFlowCacheServer = (WinterFlowCacheServer) entry.getValue();
                                while (true) {
                                    WinterFlowDatabaseProtocol winterFlowDatabaseProtocol4 = winterFlowCacheServer.WinterFlowRouterStructure;
                                    WinterFlowDatabaseProtocol winterFlowDatabaseProtocol5 = winterFlowDatabaseUtility.WinterFlowSyntax;
                                    ArrayList arrayList = winterFlowDatabaseUtility.WinterFlowRouterRouter;
                                    if (winterFlowDatabaseProtocol4.compareTo(winterFlowDatabaseProtocol5) > 0 && !winterFlowDatabaseUtility.WinterFlowUnitTestResponse) {
                                        WinterFlowObjectPackage winterFlowObjectPackage3 = winterFlowDatabaseUtility.WinterFlowCacheManagerAgent;
                                        winterFlowObjectPackage3.getClass();
                                        winterFlowClassDecorator.getClass();
                                        if (!((WinterFlowDatabaseSchemaStructure) winterFlowObjectPackage3.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent(winterFlowClassDecorator)) {
                                            break;
                                        } else {
                                            WinterFlowDecoratorCache winterFlowDecoratorCache = WinterFlowMicroserviceProcess.Companion;
                                            WinterFlowDatabaseProtocol winterFlowDatabaseProtocol6 = winterFlowCacheServer.WinterFlowRouterStructure;
                                            winterFlowDecoratorCache.getClass();
                                            winterFlowDatabaseProtocol6.getClass();
                                            int ordinal = winterFlowDatabaseProtocol6.ordinal();
                                            WinterFlowMicroserviceProcess winterFlowMicroserviceProcess = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : WinterFlowMicroserviceProcess.ON_PAUSE : WinterFlowMicroserviceProcess.ON_STOP : WinterFlowMicroserviceProcess.ON_DESTROY;
                                            if (winterFlowMicroserviceProcess == null) {
                                                WinterFlowEventEmitterOrchestration.WinterFlowServiceUtility(winterFlowCacheServer.WinterFlowRouterStructure, "no event down from ");
                                                break;
                                            } else {
                                                arrayList.add(winterFlowMicroserviceProcess.WinterFlowRouterStructure());
                                                winterFlowCacheServer.WinterFlowRouterStructure(winterFlowDecoratorVersion2, winterFlowMicroserviceProcess);
                                                WinterFlowEventEmitterNode.WinterFlowCacheManagerException(arrayList);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                WinterFlowClassDecorator winterFlowClassDecorator2 = (WinterFlowClassDecorator) entry.getKey();
                                WinterFlowCacheServer winterFlowCacheServer2 = (WinterFlowCacheServer) entry.getValue();
                                while (true) {
                                    WinterFlowDatabaseProtocol winterFlowDatabaseProtocol7 = winterFlowCacheServer2.WinterFlowRouterStructure;
                                    WinterFlowDatabaseProtocol winterFlowDatabaseProtocol8 = winterFlowDatabaseUtility.WinterFlowSyntax;
                                    ArrayList arrayList2 = winterFlowDatabaseUtility.WinterFlowRouterRouter;
                                    if (winterFlowDatabaseProtocol7.compareTo(winterFlowDatabaseProtocol8) < 0 && !winterFlowDatabaseUtility.WinterFlowUnitTestResponse) {
                                        WinterFlowObjectPackage winterFlowObjectPackage4 = winterFlowDatabaseUtility.WinterFlowCacheManagerAgent;
                                        winterFlowObjectPackage4.getClass();
                                        winterFlowClassDecorator2.getClass();
                                        if (!((WinterFlowDatabaseSchemaStructure) winterFlowObjectPackage4.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent(winterFlowClassDecorator2)) {
                                            break;
                                        } else {
                                            arrayList2.add(winterFlowCacheServer2.WinterFlowRouterStructure);
                                            WinterFlowDecoratorCache winterFlowDecoratorCache2 = WinterFlowMicroserviceProcess.Companion;
                                            WinterFlowDatabaseProtocol winterFlowDatabaseProtocol9 = winterFlowCacheServer2.WinterFlowRouterStructure;
                                            winterFlowDecoratorCache2.getClass();
                                            winterFlowDatabaseProtocol9.getClass();
                                            int ordinal2 = winterFlowDatabaseProtocol9.ordinal();
                                            WinterFlowMicroserviceProcess winterFlowMicroserviceProcess2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : WinterFlowMicroserviceProcess.ON_RESUME : WinterFlowMicroserviceProcess.ON_START : WinterFlowMicroserviceProcess.ON_CREATE;
                                            if (winterFlowMicroserviceProcess2 == null) {
                                                WinterFlowEventEmitterOrchestration.WinterFlowServiceUtility(winterFlowCacheServer2.WinterFlowRouterStructure, "no event up from ");
                                                break;
                                            } else {
                                                winterFlowCacheServer2.WinterFlowRouterStructure(winterFlowDecoratorVersion2, winterFlowMicroserviceProcess2);
                                                WinterFlowEventEmitterNode.WinterFlowCacheManagerException(arrayList2);
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                winterFlowObjectPackage2.getClass();
                for (WinterFlowHandlerHook winterFlowHandlerHook3 = (WinterFlowHandlerHook) winterFlowObjectPackage2.WinterFlowRouterRouter; winterFlowHandlerHook3 != null; winterFlowHandlerHook3 = winterFlowHandlerHook3.WinterFlowRouterRouter) {
                    if (!winterFlowHandlerHook3.WinterFlowSyntax) {
                        winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowHandlerHook3);
                    }
                }
            }
            WinterFlowHandlerHook winterFlowHandlerHook4 = (WinterFlowHandlerHook) this.WinterFlowCacheManagerAgent.WinterFlowRouterRouter;
            if (!this.WinterFlowUnitTestResponse && winterFlowHandlerHook4 != null && this.WinterFlowSyntax.compareTo(winterFlowHandlerHook4.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure) > 0) {
                WinterFlowObjectPackage winterFlowObjectPackage3 = this.WinterFlowCacheManagerAgent;
                final int i2 = 1;
                WinterFlowObjectSession winterFlowObjectSession2 = new WinterFlowObjectSession(this) { // from class: com.google.android.datatransport.WinterFlowTestingMechanism
                    public final /* synthetic */ WinterFlowDatabaseUtility WinterFlowTransactionManagerStrategy;

                    {
                        this.WinterFlowTransactionManagerStrategy = this;
                    }

                    @Override // com.google.android.datatransport.WinterFlowObjectSession
                    public final Object WinterFlowUnitTestResponse(Object obj2) {
                        int i22 = i2;
                        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        WinterFlowDecoratorVersion winterFlowDecoratorVersion2 = winterFlowDecoratorVersion;
                        WinterFlowDatabaseUtility winterFlowDatabaseUtility = this.WinterFlowTransactionManagerStrategy;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i22) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                entry.getClass();
                                WinterFlowClassDecorator winterFlowClassDecorator = (WinterFlowClassDecorator) entry.getKey();
                                WinterFlowCacheServer winterFlowCacheServer = (WinterFlowCacheServer) entry.getValue();
                                while (true) {
                                    WinterFlowDatabaseProtocol winterFlowDatabaseProtocol4 = winterFlowCacheServer.WinterFlowRouterStructure;
                                    WinterFlowDatabaseProtocol winterFlowDatabaseProtocol5 = winterFlowDatabaseUtility.WinterFlowSyntax;
                                    ArrayList arrayList = winterFlowDatabaseUtility.WinterFlowRouterRouter;
                                    if (winterFlowDatabaseProtocol4.compareTo(winterFlowDatabaseProtocol5) > 0 && !winterFlowDatabaseUtility.WinterFlowUnitTestResponse) {
                                        WinterFlowObjectPackage winterFlowObjectPackage32 = winterFlowDatabaseUtility.WinterFlowCacheManagerAgent;
                                        winterFlowObjectPackage32.getClass();
                                        winterFlowClassDecorator.getClass();
                                        if (!((WinterFlowDatabaseSchemaStructure) winterFlowObjectPackage32.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent(winterFlowClassDecorator)) {
                                            break;
                                        } else {
                                            WinterFlowDecoratorCache winterFlowDecoratorCache = WinterFlowMicroserviceProcess.Companion;
                                            WinterFlowDatabaseProtocol winterFlowDatabaseProtocol6 = winterFlowCacheServer.WinterFlowRouterStructure;
                                            winterFlowDecoratorCache.getClass();
                                            winterFlowDatabaseProtocol6.getClass();
                                            int ordinal = winterFlowDatabaseProtocol6.ordinal();
                                            WinterFlowMicroserviceProcess winterFlowMicroserviceProcess = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : WinterFlowMicroserviceProcess.ON_PAUSE : WinterFlowMicroserviceProcess.ON_STOP : WinterFlowMicroserviceProcess.ON_DESTROY;
                                            if (winterFlowMicroserviceProcess == null) {
                                                WinterFlowEventEmitterOrchestration.WinterFlowServiceUtility(winterFlowCacheServer.WinterFlowRouterStructure, "no event down from ");
                                                break;
                                            } else {
                                                arrayList.add(winterFlowMicroserviceProcess.WinterFlowRouterStructure());
                                                winterFlowCacheServer.WinterFlowRouterStructure(winterFlowDecoratorVersion2, winterFlowMicroserviceProcess);
                                                WinterFlowEventEmitterNode.WinterFlowCacheManagerException(arrayList);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                WinterFlowClassDecorator winterFlowClassDecorator2 = (WinterFlowClassDecorator) entry.getKey();
                                WinterFlowCacheServer winterFlowCacheServer2 = (WinterFlowCacheServer) entry.getValue();
                                while (true) {
                                    WinterFlowDatabaseProtocol winterFlowDatabaseProtocol7 = winterFlowCacheServer2.WinterFlowRouterStructure;
                                    WinterFlowDatabaseProtocol winterFlowDatabaseProtocol8 = winterFlowDatabaseUtility.WinterFlowSyntax;
                                    ArrayList arrayList2 = winterFlowDatabaseUtility.WinterFlowRouterRouter;
                                    if (winterFlowDatabaseProtocol7.compareTo(winterFlowDatabaseProtocol8) < 0 && !winterFlowDatabaseUtility.WinterFlowUnitTestResponse) {
                                        WinterFlowObjectPackage winterFlowObjectPackage4 = winterFlowDatabaseUtility.WinterFlowCacheManagerAgent;
                                        winterFlowObjectPackage4.getClass();
                                        winterFlowClassDecorator2.getClass();
                                        if (!((WinterFlowDatabaseSchemaStructure) winterFlowObjectPackage4.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent(winterFlowClassDecorator2)) {
                                            break;
                                        } else {
                                            arrayList2.add(winterFlowCacheServer2.WinterFlowRouterStructure);
                                            WinterFlowDecoratorCache winterFlowDecoratorCache2 = WinterFlowMicroserviceProcess.Companion;
                                            WinterFlowDatabaseProtocol winterFlowDatabaseProtocol9 = winterFlowCacheServer2.WinterFlowRouterStructure;
                                            winterFlowDecoratorCache2.getClass();
                                            winterFlowDatabaseProtocol9.getClass();
                                            int ordinal2 = winterFlowDatabaseProtocol9.ordinal();
                                            WinterFlowMicroserviceProcess winterFlowMicroserviceProcess2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : WinterFlowMicroserviceProcess.ON_RESUME : WinterFlowMicroserviceProcess.ON_START : WinterFlowMicroserviceProcess.ON_CREATE;
                                            if (winterFlowMicroserviceProcess2 == null) {
                                                WinterFlowEventEmitterOrchestration.WinterFlowServiceUtility(winterFlowCacheServer2.WinterFlowRouterStructure, "no event up from ");
                                                break;
                                            } else {
                                                winterFlowCacheServer2.WinterFlowRouterStructure(winterFlowDecoratorVersion2, winterFlowMicroserviceProcess2);
                                                WinterFlowEventEmitterNode.WinterFlowCacheManagerException(arrayList2);
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                winterFlowObjectPackage3.getClass();
                for (WinterFlowHandlerHook winterFlowHandlerHook5 = (WinterFlowHandlerHook) winterFlowObjectPackage3.WinterFlowUnitTestResponse; winterFlowHandlerHook5 != null; winterFlowHandlerHook5 = winterFlowHandlerHook5.WinterFlowUnitTestResponse) {
                    if (!winterFlowHandlerHook5.WinterFlowSyntax) {
                        winterFlowObjectSession2.WinterFlowUnitTestResponse(winterFlowHandlerHook5);
                    }
                }
            }
        }
        this.WinterFlowUnitTestResponse = false;
        this.WinterFlowResponseEngine.WinterFlowResponseEngine(this.WinterFlowSyntax);
    }

    public final void WinterFlowRouterStructure(WinterFlowClassDecorator winterFlowClassDecorator) {
        WinterFlowNodeProtocol winterFlowQueryStructure;
        WinterFlowCacheServer winterFlowCacheServer;
        WinterFlowDecoratorVersion winterFlowDecoratorVersion;
        winterFlowClassDecorator.getClass();
        WinterFlowCacheManagerAgent("addObserver");
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol = this.WinterFlowSyntax;
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol2 = WinterFlowDatabaseProtocol.WinterFlowVariableVersionControl;
        if (winterFlowDatabaseProtocol != winterFlowDatabaseProtocol2) {
            winterFlowDatabaseProtocol2 = WinterFlowDatabaseProtocol.WinterFlowTransactionManagerStrategy;
        }
        WinterFlowCacheServer winterFlowCacheServer2 = new WinterFlowCacheServer();
        winterFlowCacheServer2.WinterFlowRouterStructure = winterFlowDatabaseProtocol2;
        HashMap hashMap = WinterFlowUITool.WinterFlowRouterStructure;
        boolean z = winterFlowClassDecorator instanceof WinterFlowNodeProtocol;
        boolean z2 = winterFlowClassDecorator instanceof WinterFlowJSONWorker;
        int i = 2;
        Object obj = null;
        if (z && z2) {
            winterFlowQueryStructure = new WinterFlowQueryStructure(r5, (WinterFlowJSONWorker) winterFlowClassDecorator, (WinterFlowNodeProtocol) winterFlowClassDecorator);
        } else if (z2) {
            winterFlowQueryStructure = new WinterFlowQueryStructure(r5, (WinterFlowJSONWorker) winterFlowClassDecorator, obj);
        } else if (z) {
            winterFlowQueryStructure = (WinterFlowNodeProtocol) winterFlowClassDecorator;
        } else {
            Class<?> cls = winterFlowClassDecorator.getClass();
            if (WinterFlowUITool.WinterFlowHookDataSource(cls) == 2) {
                Object obj2 = WinterFlowUITool.WinterFlowHookDataSource.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    WinterFlowUITool.WinterFlowRouterStructure((Constructor) list.get(0), winterFlowClassDecorator);
                    throw null;
                }
                int size = list.size();
                WinterFlowWebsocketTool[] winterFlowWebsocketToolArr = new WinterFlowWebsocketTool[size];
                if (size > 0) {
                    WinterFlowUITool.WinterFlowRouterStructure((Constructor) list.get(0), winterFlowClassDecorator);
                    throw null;
                }
                winterFlowQueryStructure = new WinterFlowVariableComponent(i, winterFlowWebsocketToolArr);
            } else {
                winterFlowQueryStructure = new WinterFlowQueryStructure(winterFlowClassDecorator);
            }
        }
        winterFlowCacheServer2.WinterFlowHookDataSource = winterFlowQueryStructure;
        WinterFlowObjectPackage winterFlowObjectPackage = this.WinterFlowCacheManagerAgent;
        winterFlowObjectPackage.getClass();
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = (WinterFlowDatabaseSchemaStructure) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy;
        WinterFlowHandlerHook winterFlowHandlerHook = (WinterFlowHandlerHook) winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(winterFlowClassDecorator);
        if (winterFlowHandlerHook != null) {
            winterFlowCacheServer = winterFlowHandlerHook.WinterFlowTransactionManagerStrategy;
        } else {
            WinterFlowHandlerHook winterFlowHandlerHook2 = new WinterFlowHandlerHook(winterFlowClassDecorator, winterFlowCacheServer2);
            winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(winterFlowClassDecorator, winterFlowHandlerHook2);
            WinterFlowHandlerHook winterFlowHandlerHook3 = (WinterFlowHandlerHook) winterFlowObjectPackage.WinterFlowRouterRouter;
            if (winterFlowHandlerHook3 == null) {
                winterFlowObjectPackage.WinterFlowUnitTestResponse = winterFlowHandlerHook2;
                winterFlowObjectPackage.WinterFlowRouterRouter = winterFlowHandlerHook2;
            } else {
                winterFlowHandlerHook3.WinterFlowUnitTestResponse = winterFlowHandlerHook2;
                winterFlowHandlerHook2.WinterFlowRouterRouter = winterFlowHandlerHook3;
                winterFlowObjectPackage.WinterFlowRouterRouter = winterFlowHandlerHook2;
            }
            winterFlowCacheServer = null;
        }
        if (winterFlowCacheServer == null && (winterFlowDecoratorVersion = (WinterFlowDecoratorVersion) ((WeakReference) this.WinterFlowArrayNetwork.WinterFlowTransactionManagerStrategy).get()) != null) {
            r5 = (this.WinterFlowVariableVersionControl != 0 || this.WinterFlowTransactionManagerStrategy) ? 1 : 0;
            WinterFlowDatabaseProtocol WinterFlowHookDataSource = WinterFlowHookDataSource(winterFlowClassDecorator);
            this.WinterFlowVariableVersionControl++;
            while (winterFlowCacheServer2.WinterFlowRouterStructure.compareTo(WinterFlowHookDataSource) < 0) {
                WinterFlowObjectPackage winterFlowObjectPackage2 = this.WinterFlowCacheManagerAgent;
                winterFlowObjectPackage2.getClass();
                if (!((WinterFlowDatabaseSchemaStructure) winterFlowObjectPackage2.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent(winterFlowClassDecorator)) {
                    break;
                }
                WinterFlowDatabaseProtocol winterFlowDatabaseProtocol3 = winterFlowCacheServer2.WinterFlowRouterStructure;
                ArrayList arrayList = this.WinterFlowRouterRouter;
                arrayList.add(winterFlowDatabaseProtocol3);
                WinterFlowDecoratorCache winterFlowDecoratorCache = WinterFlowMicroserviceProcess.Companion;
                WinterFlowDatabaseProtocol winterFlowDatabaseProtocol4 = winterFlowCacheServer2.WinterFlowRouterStructure;
                winterFlowDecoratorCache.getClass();
                winterFlowDatabaseProtocol4.getClass();
                int ordinal = winterFlowDatabaseProtocol4.ordinal();
                WinterFlowMicroserviceProcess winterFlowMicroserviceProcess = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : WinterFlowMicroserviceProcess.ON_RESUME : WinterFlowMicroserviceProcess.ON_START : WinterFlowMicroserviceProcess.ON_CREATE;
                if (winterFlowMicroserviceProcess == null) {
                    WinterFlowCompilerMechanism.WinterFlowResponseEngine(winterFlowCacheServer2.WinterFlowRouterStructure, "no event up from ");
                    return;
                } else {
                    winterFlowCacheServer2.WinterFlowRouterStructure(winterFlowDecoratorVersion, winterFlowMicroserviceProcess);
                    WinterFlowEventEmitterNode.WinterFlowCacheManagerException(arrayList);
                    WinterFlowHookDataSource = WinterFlowHookDataSource(winterFlowClassDecorator);
                }
            }
            if (r5 == 0) {
                WinterFlowRouterRouter();
            }
            this.WinterFlowVariableVersionControl--;
        }
    }

    public final void WinterFlowTransactionManagerStrategy(WinterFlowClassDecorator winterFlowClassDecorator) {
        winterFlowClassDecorator.getClass();
        WinterFlowCacheManagerAgent("removeObserver");
        WinterFlowObjectPackage winterFlowObjectPackage = this.WinterFlowCacheManagerAgent;
        winterFlowObjectPackage.getClass();
        WinterFlowHandlerHook winterFlowHandlerHook = (WinterFlowHandlerHook) ((WinterFlowDatabaseSchemaStructure) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy).WinterFlowTransactionAgent(winterFlowClassDecorator);
        if (winterFlowHandlerHook == null) {
            return;
        }
        WinterFlowHandlerHook winterFlowHandlerHook2 = winterFlowHandlerHook.WinterFlowRouterRouter;
        WinterFlowHandlerHook winterFlowHandlerHook3 = winterFlowHandlerHook.WinterFlowUnitTestResponse;
        if (winterFlowHandlerHook2 == null) {
            winterFlowObjectPackage.WinterFlowUnitTestResponse = winterFlowHandlerHook3;
        } else {
            winterFlowHandlerHook2.WinterFlowUnitTestResponse = winterFlowHandlerHook3;
        }
        WinterFlowHandlerHook winterFlowHandlerHook4 = winterFlowHandlerHook.WinterFlowUnitTestResponse;
        if (winterFlowHandlerHook4 == null) {
            winterFlowObjectPackage.WinterFlowRouterRouter = winterFlowHandlerHook2;
        } else {
            winterFlowHandlerHook4.WinterFlowRouterRouter = winterFlowHandlerHook2;
        }
        winterFlowHandlerHook.WinterFlowSyntax = true;
    }

    public final void WinterFlowUnitTestResponse(WinterFlowDatabaseProtocol winterFlowDatabaseProtocol) {
        winterFlowDatabaseProtocol.getClass();
        WinterFlowCacheManagerAgent("setCurrentState");
        WinterFlowVariableVersionControl(winterFlowDatabaseProtocol);
    }

    public final void WinterFlowVariableVersionControl(WinterFlowDatabaseProtocol winterFlowDatabaseProtocol) {
        if (this.WinterFlowSyntax == winterFlowDatabaseProtocol) {
            return;
        }
        WinterFlowDecoratorVersion winterFlowDecoratorVersion = (WinterFlowDecoratorVersion) ((WeakReference) this.WinterFlowArrayNetwork.WinterFlowTransactionManagerStrategy).get();
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol2 = this.WinterFlowSyntax;
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol3 = WinterFlowDatabaseProtocol.WinterFlowTransactionManagerStrategy;
        WinterFlowDatabaseProtocol winterFlowDatabaseProtocol4 = WinterFlowDatabaseProtocol.WinterFlowVariableVersionControl;
        if (winterFlowDatabaseProtocol2 == winterFlowDatabaseProtocol3 && winterFlowDatabaseProtocol == winterFlowDatabaseProtocol4) {
            throw new IllegalStateException(("State must be at least '" + WinterFlowDatabaseProtocol.WinterFlowUnitTestResponse + "' to be moved to '" + winterFlowDatabaseProtocol + "' in component " + winterFlowDecoratorVersion).toString());
        }
        if (winterFlowDatabaseProtocol2 == winterFlowDatabaseProtocol4 && winterFlowDatabaseProtocol2 != winterFlowDatabaseProtocol) {
            throw new IllegalStateException(("State is '" + winterFlowDatabaseProtocol4 + "' and cannot be moved to `" + winterFlowDatabaseProtocol + "` in component " + winterFlowDecoratorVersion).toString());
        }
        this.WinterFlowSyntax = winterFlowDatabaseProtocol;
        if (this.WinterFlowTransactionManagerStrategy || this.WinterFlowVariableVersionControl != 0) {
            this.WinterFlowUnitTestResponse = true;
            return;
        }
        this.WinterFlowTransactionManagerStrategy = true;
        WinterFlowRouterRouter();
        this.WinterFlowTransactionManagerStrategy = false;
        if (this.WinterFlowSyntax == winterFlowDatabaseProtocol4) {
            this.WinterFlowCacheManagerAgent = new WinterFlowObjectPackage(11);
        }
    }
}
