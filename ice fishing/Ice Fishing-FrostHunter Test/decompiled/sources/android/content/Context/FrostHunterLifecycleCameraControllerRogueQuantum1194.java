package android.content.Context;

import java.util.Arrays;
import java.util.Random;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLifecycleCameraControllerRogueQuantum1194 {
    public final Random FrostHunterAlphaAnimationNeoCosmos5761;
    public final int[] FrostHunterBundlePulseFusionHero2475;
    public final int[] FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterLifecycleCameraControllerRogueQuantum1194(int[] iArr, Random random) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = iArr;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = random;
        this.FrostHunterBundlePulseFusionHero2475 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.FrostHunterBundlePulseFusionHero2475[iArr[i]] = i;
        }
    }

    public final FrostHunterLifecycleCameraControllerRogueQuantum1194 FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i2 = 0;
        while (true) {
            iArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            random = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i2 >= i) {
                break;
            }
            iArr2[i2] = random.nextInt(iArr.length + 1);
            int i3 = i2 + 1;
            int nextInt = random.nextInt(i3);
            iArr3[i2] = iArr3[nextInt];
            iArr3[nextInt] = i2;
            i2 = i3;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length + i; i6++) {
            if (i4 >= i || i5 != iArr2[i4]) {
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                iArr4[i6] = i8;
                if (i8 >= 0) {
                    iArr4[i6] = i8 + i;
                }
                i5 = i7;
            } else {
                iArr4[i6] = iArr3[i4];
                i4++;
            }
        }
        return new FrostHunterLifecycleCameraControllerRogueQuantum1194(iArr4, new Random(random.nextLong()));
    }

    public FrostHunterLifecycleCameraControllerRogueQuantum1194() {
        this(new Random());
    }

    public FrostHunterLifecycleCameraControllerRogueQuantum1194(Random random) {
        this(new int[0], random);
    }
}
