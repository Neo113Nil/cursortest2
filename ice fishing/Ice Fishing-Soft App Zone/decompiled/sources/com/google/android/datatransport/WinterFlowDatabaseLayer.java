package com.google.android.datatransport;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDatabaseLayer {
    public static final WinterFlowProtocolEntity WinterFlowRouterStructure;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if ((r1 instanceof com.google.android.datatransport.WinterFlowProtocolEntity) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        r1 = (com.google.android.datatransport.WinterFlowProtocolEntity) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = null;
     */
    static {
        Object winterFlowDecoratorTool;
        try {
            ClassLoader classLoader = WinterFlowExceptionProxy.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof WinterFlowVariableStructure) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th) {
            winterFlowDecoratorTool = new WinterFlowDecoratorTool(th);
        }
        WinterFlowProtocolEntity winterFlowProtocolEntity = (WinterFlowProtocolEntity) (winterFlowDecoratorTool instanceof WinterFlowDecoratorTool ? null : winterFlowDecoratorTool);
        if (winterFlowProtocolEntity == null) {
            winterFlowProtocolEntity = new WinterFlowPipelineHelper(1, new WinterFlowDeploymentEngine(22));
        }
        WinterFlowRouterStructure = winterFlowProtocolEntity;
    }
}
