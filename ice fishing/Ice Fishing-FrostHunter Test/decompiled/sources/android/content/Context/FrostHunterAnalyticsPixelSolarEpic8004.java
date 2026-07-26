package android.content.Context;

import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterAnalyticsPixelSolarEpic8004 {
    public static String FrostHunterAlphaAnimationNeoCosmos5761(List list, String str, FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            frostHunterCombineLegendMegaPrime5473 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (frostHunterCombineLegendMegaPrime5473 != null) {
                sb.append((CharSequence) frostHunterCombineLegendMegaPrime5473.FrostHunterAlphaAnimationNeoCosmos5761(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final void FrostHunterConstraintSetCloneMasterUltraRogue2633(String str) {
        throw new UnsupportedOperationException(str);
    }
}
