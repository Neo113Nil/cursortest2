package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowSessionParser {
    public static final float WinterFlowRouterStructure = 0.125f / 18.0f;

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x061e -> B:56:0x0625). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x026c -> B:145:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x0312 -> B:145:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x036f -> B:146:0x03e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:188:0x03cf -> B:142:0x03da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x06b0 -> B:12:0x06b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x047c -> B:65:0x042a). Please report as a decompilation issue!!! */
    public static final java.lang.Object WinterFlowCacheManagerAgent(com.google.android.datatransport.WinterFlowRouterRefactoring r26, com.google.android.datatransport.WinterFlowObjectSystem r27, com.google.android.datatransport.WinterFlowDeploymentEngine r28, com.google.android.datatransport.WinterFlowXMLArray r29, com.google.android.datatransport.WinterFlowAPIVersionControl r30, com.google.android.datatransport.WinterFlowDeploymentEngine r31, com.google.android.datatransport.WinterFlowCompilerCloud r32, com.google.android.datatransport.WinterFlowVersionLayer r33) {
        /*
            Method dump skipped, instructions count: 1922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.WinterFlowSessionParser.WinterFlowCacheManagerAgent(com.google.android.datatransport.WinterFlowRouterRefactoring, com.google.android.datatransport.WinterFlowObjectSystem, com.google.android.datatransport.WinterFlowDeploymentEngine, com.google.android.datatransport.WinterFlowXMLArray, com.google.android.datatransport.WinterFlowAPIVersionControl, com.google.android.datatransport.WinterFlowDeploymentEngine, com.google.android.datatransport.WinterFlowCompilerCloud, com.google.android.datatransport.WinterFlowVersionLayer):java.lang.Object");
    }

    public static final float WinterFlowHookDataSource(WinterFlowInheritanceVariable winterFlowInheritanceVariable, int i) {
        return i == 2 ? winterFlowInheritanceVariable.WinterFlowHookDataSource() * WinterFlowRouterStructure : winterFlowInheritanceVariable.WinterFlowHookDataSource();
    }

    public static final boolean WinterFlowRouterStructure(WinterFlowCacheManagerUtility winterFlowCacheManagerUtility, long j) {
        Object obj;
        List list = winterFlowCacheManagerUtility.WinterFlowRouterStructure;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (WinterFlowServerManager.WinterFlowConcurrencyThread(((WinterFlowObjectSystem) obj).WinterFlowRouterStructure, j)) {
                break;
            }
            i++;
        }
        WinterFlowObjectSystem winterFlowObjectSystem = (WinterFlowObjectSystem) obj;
        if (winterFlowObjectSystem != null && winterFlowObjectSystem.WinterFlowArrayNetwork) {
            z = true;
        }
        return true ^ z;
    }
}
