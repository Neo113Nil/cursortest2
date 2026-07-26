package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnPreDrawListenerAuroraNeoStorm9375 implements FrostHunterMergePhoenixEpic5883, Serializable {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814 = 0;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public FrostHunterOnPreDrawListenerAuroraNeoStorm9375(String str) {
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = compile;
    }

    public FrostHunterTraceHyperionAuroraNebula9947 FrostHunterAlphaAnimationNeoCosmos5761(String str, int i) {
        str.getClass();
        Matcher region = ((Pattern) this.FrostHunterFlowMaxDragonHero5809).matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new FrostHunterTraceHyperionAuroraNebula9947(region, str);
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterMergePhoenixEpic5883
    public boolean FrostHunterBundlePulseFusionHero2475() {
        return true;
    }

    @Override // android.content.Context.FrostHunterMergePhoenixEpic5883
    public Object getValue() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    public final String toString() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return String.valueOf(obj);
            default:
                String pattern = ((Pattern) obj).toString();
                pattern.getClass();
                return pattern;
        }
    }

    public FrostHunterOnPreDrawListenerAuroraNeoStorm9375(Object obj) {
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }
}
