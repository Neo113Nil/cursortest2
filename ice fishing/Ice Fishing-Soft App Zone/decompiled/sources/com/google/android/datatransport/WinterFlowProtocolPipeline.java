package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class WinterFlowProtocolPipeline extends WinterFlowQuerySyntax {
    public static Object[] WinterFlowCacheTool(Object[] objArr, int i, int i2) {
        objArr.getClass();
        int length = objArr.length;
        if (i2 > length) {
            WinterFlowEventEmitterOrchestration.WinterFlowArrayNetwork(i2, length, ") is greater than size (", "toIndex (");
            return null;
        }
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static void WinterFlowCloudMicroservice(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static int WinterFlowCompilerDataSource(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static void WinterFlowCompilerHandler(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void WinterFlowConfiguration(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static int WinterFlowFrameworkTransaction(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void WinterFlowFrontendBackend(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static Set WinterFlowModuleAgent(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return WinterFlowCacheTool.WinterFlowVariableVersionControl;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            singleton.getClass();
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(WinterFlowDataSourceUtility.WinterFlowFrameworkTransaction(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static List WinterFlowOrchestrationConfiguration(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        }
        if (length == 1) {
            return WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(objArr[0]);
        }
        List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        asList.getClass();
        return asList;
    }

    public static void WinterFlowProxyStructure(Object[] objArr, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static /* synthetic */ void WinterFlowQueueService(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        WinterFlowCloudMicroservice(objArr, objArr2, 0, i, i2);
    }

    public static /* synthetic */ void WinterFlowUIMiddleware(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        WinterFlowCompilerHandler(iArr, iArr2, i, 0, i2);
    }

    public static ArrayList WinterFlowValidatorHandler(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
