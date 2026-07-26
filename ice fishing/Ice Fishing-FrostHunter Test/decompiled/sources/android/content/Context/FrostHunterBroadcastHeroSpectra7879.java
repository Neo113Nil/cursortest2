package android.content.Context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterBroadcastHeroSpectra7879 extends FrostHunterCanvasInfernoVortex4700 {
    public static Map FrostHunterColorStateListMegaBetaFusion7423(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return FrostHunterLayoutInfernoStrike4529.FrostHunterCameraXPixelTurboCosmos9814;
        }
        int i = 0;
        if (size == 1) {
            FrostHunterLaunchHeroForce4010 frostHunterLaunchHeroForce4010 = (FrostHunterLaunchHeroForce4010) arrayList.get(0);
            frostHunterLaunchHeroForce4010.getClass();
            Map singletonMap = Collections.singletonMap(frostHunterLaunchHeroForce4010.FrostHunterCameraXPixelTurboCosmos9814, frostHunterLaunchHeroForce4010.FrostHunterFlowMaxDragonHero5809);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(FrostHunterSoundPoolNovaTitanTitan5784(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            FrostHunterLaunchHeroForce4010 frostHunterLaunchHeroForce40102 = (FrostHunterLaunchHeroForce4010) obj;
            linkedHashMap.put(frostHunterLaunchHeroForce40102.FrostHunterCameraXPixelTurboCosmos9814, frostHunterLaunchHeroForce40102.FrostHunterFlowMaxDragonHero5809);
        }
        return linkedHashMap;
    }

    public static Map FrostHunterNestedScrollViewPixelPhantom8605(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return FrostHunterLayoutInfernoStrike4529.FrostHunterCameraXPixelTurboCosmos9814;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static final void FrostHunterNestedScrollViewThunderNovaX6772(HashMap hashMap, FrostHunterLaunchHeroForce4010[] frostHunterLaunchHeroForce4010Arr) {
        for (FrostHunterLaunchHeroForce4010 frostHunterLaunchHeroForce4010 : frostHunterLaunchHeroForce4010Arr) {
            hashMap.put(frostHunterLaunchHeroForce4010.FrostHunterCameraXPixelTurboCosmos9814, frostHunterLaunchHeroForce4010.FrostHunterFlowMaxDragonHero5809);
        }
    }

    public static int FrostHunterSoundPoolNovaTitanTitan5784(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
