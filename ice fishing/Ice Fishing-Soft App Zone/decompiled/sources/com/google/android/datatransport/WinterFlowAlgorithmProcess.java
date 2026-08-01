package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAlgorithmProcess extends WinterFlowOrchestrationCompiler implements WinterFlowCacheInterface {
    public final int WinterFlowResponseEngine;
    public final WinterFlowCacheInterface WinterFlowRouterRouter;
    public WinterFlowTransactionManagerLayer WinterFlowServerProtocol;
    public final WinterFlowEncryptionMicroservice WinterFlowSyntax;
    public WinterFlowEncryptionMicroservice WinterFlowTransactionAgent;

    public WinterFlowAlgorithmProcess(WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        super(WinterFlowServiceProviderHelper.WinterFlowUnitTestResponse, WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl);
        this.WinterFlowRouterRouter = winterFlowCacheInterface;
        this.WinterFlowSyntax = winterFlowEncryptionMicroservice;
        this.WinterFlowResponseEngine = ((Number) winterFlowEncryptionMicroservice.WinterFlowServiceUtility(new WinterFlowHandlerTool(14), 0)).intValue();
    }

    public final Object WinterFlowOrchestrationSubsystem(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        Comparable comparable;
        String str;
        WinterFlowEncryptionMicroservice context = winterFlowTransactionManagerLayer.getContext();
        WinterFlowInvokerComponent.WinterFlowRouterAdapter(context);
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = this.WinterFlowTransactionAgent;
        if (winterFlowEncryptionMicroservice != context) {
            int i = 0;
            if (winterFlowEncryptionMicroservice instanceof WinterFlowServiceProviderDecorator) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((WinterFlowServiceProviderDecorator) winterFlowEncryptionMicroservice).WinterFlowTransactionManagerStrategy + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                List WinterFlowCompilerVariable = WinterFlowFrameworkStrategy.WinterFlowCompilerVariable(str2);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : WinterFlowCompilerVariable) {
                    if (!WinterFlowFrameworkStrategy.WinterFlowArrayHelper((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(arrayList, 10));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        if (!WinterFlowQuerySyntax.WinterFlowBatchUI(str3.charAt(i3))) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == -1) {
                        i3 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i3));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                WinterFlowCompilerVariable.size();
                int size2 = WinterFlowCompilerVariable.size() - 1;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : WinterFlowCompilerVariable) {
                    int i4 = i + 1;
                    if (i < 0) {
                        WinterFlowUnitTestLibrary.WinterFlowProxyStructure();
                        throw null;
                    }
                    String str4 = (String) obj4;
                    if ((i == 0 || i == size2) && WinterFlowFrameworkStrategy.WinterFlowArrayHelper(str4)) {
                        str = null;
                    } else {
                        str4.getClass();
                        if (intValue < 0) {
                            WinterFlowEventEmitterOrchestration.WinterFlowVariableVersionControl(intValue, " is less than zero.", "Requested character count ");
                            return null;
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i = i4;
                }
                StringBuilder sb = new StringBuilder(length2);
                WinterFlowSerializerUtility.WinterFlowHandlerJSON(arrayList3, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.WinterFlowServiceUtility(new WinterFlowSessionManagerSystem(7, this), 0)).intValue() != this.WinterFlowResponseEngine) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.WinterFlowSyntax + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.WinterFlowTransactionAgent = context;
        }
        this.WinterFlowServerProtocol = winterFlowTransactionManagerLayer;
        WinterFlowControllerScript winterFlowControllerScript = WinterFlowCompilerException.WinterFlowRouterStructure;
        WinterFlowCacheInterface winterFlowCacheInterface = this.WinterFlowRouterRouter;
        winterFlowCacheInterface.getClass();
        Object WinterFlowArrayNetwork = winterFlowControllerScript.WinterFlowArrayNetwork(winterFlowCacheInterface, obj, this);
        if (!WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowArrayNetwork, WinterFlowListenerJava.WinterFlowVariableVersionControl)) {
            this.WinterFlowServerProtocol = null;
        }
        return WinterFlowArrayNetwork;
    }

    @Override // com.google.android.datatransport.WinterFlowCacheInterface
    public final Object WinterFlowRouterRouter(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        try {
            Object WinterFlowOrchestrationSubsystem = WinterFlowOrchestrationSubsystem(winterFlowTransactionManagerLayer, obj);
            return WinterFlowOrchestrationSubsystem == WinterFlowListenerJava.WinterFlowVariableVersionControl ? WinterFlowOrchestrationSubsystem : WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        } catch (Throwable th) {
            this.WinterFlowTransactionAgent = new WinterFlowServiceProviderDecorator(winterFlowTransactionManagerLayer.getContext(), th);
            throw th;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        Throwable WinterFlowRouterStructure = WinterFlowRendererStructure.WinterFlowRouterStructure(obj);
        if (WinterFlowRouterStructure != null) {
            this.WinterFlowTransactionAgent = new WinterFlowServiceProviderDecorator(getContext(), WinterFlowRouterStructure);
        }
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = this.WinterFlowServerProtocol;
        if (winterFlowTransactionManagerLayer != null) {
            winterFlowTransactionManagerLayer.WinterFlowSyntax(obj);
        }
        return WinterFlowListenerJava.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final StackTraceElement WinterFlowThreadListener() {
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer, com.google.android.datatransport.WinterFlowEventConfiguration
    public final WinterFlowEventConfiguration WinterFlowTransactionManagerStrategy() {
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = this.WinterFlowServerProtocol;
        if (winterFlowTransactionManagerLayer instanceof WinterFlowEventConfiguration) {
            return (WinterFlowEventConfiguration) winterFlowTransactionManagerLayer;
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowOrchestrationCompiler, com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final WinterFlowEncryptionMicroservice getContext() {
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = this.WinterFlowTransactionAgent;
        return winterFlowEncryptionMicroservice == null ? WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl : winterFlowEncryptionMicroservice;
    }
}
