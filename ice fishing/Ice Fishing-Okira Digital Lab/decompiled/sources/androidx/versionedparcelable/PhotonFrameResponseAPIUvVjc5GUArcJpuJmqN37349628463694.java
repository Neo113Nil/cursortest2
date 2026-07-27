package androidx.versionedparcelable;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class PhotonFrameResponseAPIUvVjc5GUArcJpuJmqN37349628463694 extends MysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071 {
    public static final Method ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public static final Constructor AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public static final Class ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public static final Method RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = constructor;
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = cls;
        ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = method2;
        RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = method;
    }

    @Override // androidx.versionedparcelable.MysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071
    public final Typeface ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context, BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673[] blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr) {
        Object obj;
        Typeface typeface;
        boolean z;
        try {
            obj = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            IronMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868 ironMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868 = new IronMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868(0);
            int length = blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673 blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673 = blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr[i];
                    Uri uri = blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    Object obj2 = (ByteBuffer) ironMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868.get(uri);
                    if (obj2 == null) {
                        obj2 = HeliosRuntimeWorkerBootstrapUWc2dFJfLzkMJ9qkq098166330516090.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(uri, context);
                        ironMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868.put(uri, obj2);
                    }
                    if (obj2 == null) {
                        break;
                    }
                    try {
                        z = ((Boolean) ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.invoke(obj, obj2, Integer.valueOf(blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365), null, Integer.valueOf(blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495), Boolean.valueOf(blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        break;
                    }
                    i++;
                } else {
                    try {
                        Object newInstance = Array.newInstance((Class<?>) ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, 1);
                        Array.set(newInstance, 0, obj);
                        typeface = (Typeface) RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.invoke(null, newInstance);
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        return Typeface.create(typeface, 0);
                    }
                }
            }
        }
        return null;
    }
}
