package androidx.versionedparcelable;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class ObsidianEngineAsyncExceptionBWHCFitE9HVmW3QucL45436530650683 extends DeltaSignalPayloadDependencyA6nozhzqb35mbLYdQf18383941788059 {
    public final Method ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final Constructor AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final Method LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final Class ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public final Method RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final Method TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final Method YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public ObsidianEngineAsyncExceptionBWHCFitE9HVmW3QucL45436530650683() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = cls;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = constructor;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = method2;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = method3;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = method4;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = method5;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = method;
    }

    public static Method LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // androidx.versionedparcelable.DeltaSignalPayloadDependencyA6nozhzqb35mbLYdQf18383941788059, androidx.versionedparcelable.MysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071
    public final Typeface ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context, BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673[] blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr) {
        Object obj;
        boolean z;
        Typeface RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        boolean z2;
        if (blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr.length >= 1) {
            try {
                if (this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != null) {
                    HashMap hashMap = new HashMap();
                    for (BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673 blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673 : blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr) {
                        if (blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 == 0) {
                            Uri uri = blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, HeliosRuntimeWorkerBootstrapUWc2dFJfLzkMJ9qkq098166330516090.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(uri, context));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr.length;
                        int i = 0;
                        boolean z3 = false;
                        while (true) {
                            Method method = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                            if (i < length) {
                                BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673 blueKernelRouterUnificationAsLC4vrnj424apXKE9837272079806732 = blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr[i];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(blueKernelRouterUnificationAsLC4vrnj424apXKE9837272079806732.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
                                if (byteBuffer != null) {
                                    try {
                                        z2 = ((Boolean) this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.invoke(obj, byteBuffer, Integer.valueOf(blueKernelRouterUnificationAsLC4vrnj424apXKE9837272079806732.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365), null, Integer.valueOf(blueKernelRouterUnificationAsLC4vrnj424apXKE9837272079806732.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495), Integer.valueOf(blueKernelRouterUnificationAsLC4vrnj424apXKE9837272079806732.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        method.invoke(obj, null);
                                        break;
                                    }
                                    z3 = true;
                                }
                                i++;
                                z3 = z3;
                            } else if (z3) {
                                try {
                                    z = ((Boolean) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.invoke(obj, null)).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    z = false;
                                }
                                if (z && (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(obj)) != null) {
                                    return Typeface.create(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, 0);
                                }
                            } else {
                                method.invoke(obj, null);
                            }
                        }
                    }
                } else {
                    BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = MysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(blueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673Arr);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495).setItalic(AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }

    public Typeface RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
