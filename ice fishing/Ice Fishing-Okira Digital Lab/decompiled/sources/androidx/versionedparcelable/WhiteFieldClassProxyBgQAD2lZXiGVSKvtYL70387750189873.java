package androidx.versionedparcelable;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class WhiteFieldClassProxyBgQAD2lZXiGVSKvtYL70387750189873 {
    public static final List ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808(Application.class, DragonRouteEventLoopContainerYSJImZuQKhVRXobtuM43720301350472.class);
    public static final List AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(DragonRouteEventLoopContainerYSJImZuQKhVRXobtuM43720301350472.class);

    public static final FrostBridgeSyntaxOverridingBONJ4OVMqZ6OMY40Td67092663955419 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (FrostBridgeSyntaxOverridingBONJ4OVMqZ6OMY40Td67092663955419) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }

    public static final Constructor ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            int length = parameterTypes.length;
            List arrayList = length != 0 ? length != 1 ? new ArrayList(new MysticCacheGatewayEncoderWAVQcXhODoTkb6nT2z39370371047975(parameterTypes, false)) : ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(parameterTypes[0]) : GoldenVectorLoaderRegistryZGq5hhbhblpJ1mpgXV59878749628960.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            if (list.equals(arrayList)) {
                return constructor;
            }
            if (list.size() == arrayList.size() && arrayList.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
