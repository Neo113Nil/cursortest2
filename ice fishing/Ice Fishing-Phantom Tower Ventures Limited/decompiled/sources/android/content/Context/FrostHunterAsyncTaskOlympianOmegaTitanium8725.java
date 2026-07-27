package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAsyncTaskOlympianOmegaTitanium8725 extends FrostHunterOnDeviceTranslatorTitanSpectraAlpha7216 {
    public final char FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterAsyncTaskOlympianOmegaTitanium8725(char c) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = c;
    }

    @Override // android.content.Context.FrostHunterOnDeviceTranslatorTitanSpectraAlpha7216
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761(char c) {
        return c == this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.FrostHunterCameraXPixelTurboCosmos9814;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
