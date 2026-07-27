package androidx.versionedparcelable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class DeltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693 {
    public final HashMap AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final HashMap ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new HashMap();

    public DeltaSignalSemaphoreNormalizationBvks9gJSbPgiZYJ5xT90952956731693(HashMap hashMap) {
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 = (NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073) entry.getValue();
            List list = (List) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.get(novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073);
            if (list == null) {
                list = new ArrayList();
                this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.put(novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073, list);
            }
            list.add((MysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832) entry.getKey());
        }
    }

    public static void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(List list, DeltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014 deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014, NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                MysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832 mysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832 = (MysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832) list.get(size);
                Method method = mysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                try {
                    int i = mysticCacheRepositoryUnificationPjJkTe2magxVipRGQL70460812040832.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014);
                    } else if (i == 2) {
                        method.invoke(obj, deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014, novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
