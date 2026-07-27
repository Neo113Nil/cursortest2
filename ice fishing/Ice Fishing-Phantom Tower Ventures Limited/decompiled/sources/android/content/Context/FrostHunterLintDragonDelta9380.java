package android.content.Context;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLintDragonDelta9380 {
    public final HashMap FrostHunterAlphaAnimationNeoCosmos5761 = new HashMap();
    public final HashMap FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterLintDragonDelta9380(HashMap hashMap) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            FrostHunterMaterialCardViewLegendDragon2868 frostHunterMaterialCardViewLegendDragon2868 = (FrostHunterMaterialCardViewLegendDragon2868) entry.getValue();
            List list = (List) this.FrostHunterAlphaAnimationNeoCosmos5761.get(frostHunterMaterialCardViewLegendDragon2868);
            if (list == null) {
                list = new ArrayList();
                this.FrostHunterAlphaAnimationNeoCosmos5761.put(frostHunterMaterialCardViewLegendDragon2868, list);
            }
            list.add((FrostHunterRotateDrawableEliteNovaXForce9868) entry.getKey());
        }
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(List list, FrostHunterNotificationSpectraTurbo8770 frostHunterNotificationSpectraTurbo8770, FrostHunterMaterialCardViewLegendDragon2868 frostHunterMaterialCardViewLegendDragon2868, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                FrostHunterRotateDrawableEliteNovaXForce9868 frostHunterRotateDrawableEliteNovaXForce9868 = (FrostHunterRotateDrawableEliteNovaXForce9868) list.get(size);
                Method method = frostHunterRotateDrawableEliteNovaXForce9868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                try {
                    int i = frostHunterRotateDrawableEliteNovaXForce9868.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, frostHunterNotificationSpectraTurbo8770);
                    } else if (i == 2) {
                        method.invoke(obj, frostHunterNotificationSpectraTurbo8770, frostHunterMaterialCardViewLegendDragon2868);
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
