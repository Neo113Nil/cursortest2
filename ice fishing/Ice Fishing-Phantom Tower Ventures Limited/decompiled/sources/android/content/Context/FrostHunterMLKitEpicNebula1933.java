package android.content.Context;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterMLKitEpicNebula1933 {
    public static final FrostHunterBitmapNeoCosmos7205 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterScaleAnimationStrikeSpark5059(12);

    public static FrostHunterAlarmManagerHeroTitaniumFusion5758 FrostHunterAlphaAnimationNeoCosmos5761(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles;
        int encapsulationType;
        int format;
        int[] channelMasks;
        audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new FrostHunterFCMTitanHero7675()).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLiveDataMasterEpicNeo4453.FrostHunterLevelListDrawableFusionDragonHero2232(it.next());
            encapsulationType = FrostHunterLevelListDrawableFusionDragonHero2232.getEncapsulationType();
            if (encapsulationType != 1) {
                format = FrostHunterLevelListDrawableFusionDragonHero2232.getFormat();
                if (FrostHunterGyroscopeHeroAlpha1995.FrostHunterLooperHyperionForce4133(format)) {
                    channelMasks = FrostHunterLevelListDrawableFusionDragonHero2232.getChannelMasks();
                    for (int i : channelMasks) {
                        treeSet.add(Integer.valueOf(i));
                    }
                }
            }
        }
        return FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterKeyframeGammaGamma1197(treeSet);
    }
}
