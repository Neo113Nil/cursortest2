package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterEventNeoOlympian4847 {
    public static final FrostHunterJobIntentServiceOlympianVortex9856 FrostHunterAlphaAnimationNeoCosmos5761;

    static {
        FrostHunterAlphaAnimationNeoCosmos5761 = (FrostHunterLightSensorCosmosStorm9710.FrostHunterLifecycleBlazeGammaElite2889 && FrostHunterLightSensorCosmosStorm9710.FrostHunterServiceEliteCelestialThunder1757 && !FrostHunterShapeAppearanceQuantumHeroSpark5567.FrostHunterAlphaAnimationNeoCosmos5761()) ? new FrostHunterLayoutInflaterSolarNovaX8393(1) : new FrostHunterLayoutInflaterSolarNovaX8393(0);
    }

    public static int FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new FrostHunterLocationListenerLegendEpic8978(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }
}
