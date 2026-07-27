package androidx.versionedparcelable;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class UltraBufferReflectionIteratorDCj5uMRQKfZqzNQpoG49620106397267 extends MysticCacheRequestMonitorQYA1Ym9CAA7fiSEGwn24597175563594 {
    public static void AxiomCoreFunctionSchedulerPDQvcBbHwsy0ZBVyOb90216604270646(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static int DeltaSignalPrefixDelegateOKrpGQ6v30XWLJQ9fy84286487006325(Object[] objArr, Object obj) {
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

    public static void HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382(Object[] objArr, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static void MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static void NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808(iArr, iArr2, i, 0, i2);
    }

    public static ArrayList ZenithPathClosureStorageLMdP6kbfH2eiEM3KeE77240003825952(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object[] ZenithPathConstructorPrefixQEI28Ir4W3yzE2EuDo23499830707914(Object[] objArr, int i, int i2) {
        objArr.getClass();
        MysticCacheRequestMonitorQYA1Ym9CAA7fiSEGwn24597175563594.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static /* synthetic */ void ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(objArr, objArr2, 0, i, i2);
    }

    public static int ZenithPathVectorNormalizationStNnl4OgOjY2uLubQK64607822190606(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }
}
