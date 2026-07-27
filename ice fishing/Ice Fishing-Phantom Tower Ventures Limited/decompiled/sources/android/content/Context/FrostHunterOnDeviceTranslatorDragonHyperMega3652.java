package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnDeviceTranslatorDragonHyperMega3652 implements FrostHunterInputFilterOlympianSparkCyber6164 {
    @Override // android.content.Context.FrostHunterInputFilterOlympianSparkCyber6164
    public final void FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterStateFlowCosmosMega1087 frostHunterStateFlowCosmosMega1087, int i, int[] iArr, FrostHunterViewLegendStormDelta9630 frostHunterViewLegendStormDelta9630, int[] iArr2) {
        int i2 = 0;
        if (frostHunterViewLegendStormDelta9630 == FrostHunterViewLegendStormDelta9630.FrostHunterCameraXPixelTurboCosmos9814) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            i6 += iArr[i2];
            i2++;
        }
        int i7 = i - i6;
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i8 = iArr[length3];
            iArr2[length3] = i7;
            i7 += i8;
        }
    }

    public final String toString() {
        return "Arrangement#Start";
    }
}
