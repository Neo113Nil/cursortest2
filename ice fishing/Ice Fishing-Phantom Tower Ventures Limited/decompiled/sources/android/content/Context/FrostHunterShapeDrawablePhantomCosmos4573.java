package android.content.Context;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterShapeDrawablePhantomCosmos4573 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterShapeDrawablePhantomCosmos4573(Set set, FrostHunterLayoutInflaterTurboHyperion3832 frostHunterLayoutInflaterTurboHyperion3832) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterConstraintSetCloneMasterUltraRogue2633(set);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterLayoutInflaterTurboHyperion3832;
    }

    public static String FrostHunterConstraintSetCloneMasterUltraRogue2633(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            FrostHunterClipDrawableAlphaTitanMaster5034 frostHunterClipDrawableAlphaTitanMaster5034 = (FrostHunterClipDrawableAlphaTitanMaster5034) it.next();
            sb.append(frostHunterClipDrawableAlphaTitanMaster5034.FrostHunterAlphaAnimationNeoCosmos5761);
            sb.append('/');
            sb.append(frostHunterClipDrawableAlphaTitanMaster5034.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String FrostHunterAlphaAnimationNeoCosmos5761() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        FrostHunterLayoutInflaterTurboHyperion3832 frostHunterLayoutInflaterTurboHyperion3832 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        synchronized (((HashSet) frostHunterLayoutInflaterTurboHyperion3832.FrostHunterFlowMaxDragonHero5809)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) frostHunterLayoutInflaterTurboHyperion3832.FrostHunterFlowMaxDragonHero5809);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) frostHunterLayoutInflaterTurboHyperion3832.FrostHunterFlowMaxDragonHero5809)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) frostHunterLayoutInflaterTurboHyperion3832.FrostHunterFlowMaxDragonHero5809);
        }
        sb.append(FrostHunterConstraintSetCloneMasterUltraRogue2633(unmodifiableSet2));
        return sb.toString();
    }
}
