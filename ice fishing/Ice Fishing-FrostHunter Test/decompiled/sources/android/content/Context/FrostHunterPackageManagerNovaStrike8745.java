package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPackageManagerNovaStrike8745 {
    public final FrostHunterImageCaptureNeoStorm3125 FrostHunterAlphaAnimationNeoCosmos5761;

    static {
        new FrostHunterPackageManagerNovaStrike8745("", 0, 0);
    }

    public FrostHunterPackageManagerNovaStrike8745(String str, int i, int i2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterImageCaptureNeoStorm3125(str, i, i2);
    }

    public static FrostHunterPackageManagerNovaStrike8745 FrostHunterAlphaAnimationNeoCosmos5761(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String sb;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            sb = "M0," + i8 + " A" + i7 + "," + i8 + " 0 1,1 " + i + "," + i8 + " A" + i7 + "," + i8 + " 0 1,1 0," + i8 + " Z";
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int min = Math.min(i / 2, i2 / 2);
            int min2 = Math.min(min, i3);
            int min3 = Math.min(min, i4);
            int min4 = Math.min(min, i5);
            int min5 = Math.min(min, i6);
            sb2.append(min2);
            sb2.append(",0 L ");
            sb2.append(i - min3);
            sb2.append(",0");
            if (min3 > 0) {
                sb2.append(" A ");
                sb2.append(min3);
                sb2.append(",");
                sb2.append(min3);
                sb2.append(" 0 0,1 ");
                sb2.append(i);
                sb2.append(",");
                sb2.append(min3);
            }
            sb2.append(" L ");
            sb2.append(i);
            sb2.append(",");
            sb2.append(i2 - min4);
            if (min4 > 0) {
                sb2.append(" A ");
                sb2.append(min4);
                sb2.append(",");
                sb2.append(min4);
                sb2.append(" 0 0,1 ");
                sb2.append(i - min4);
                sb2.append(",");
                sb2.append(i2);
            }
            sb2.append(" L ");
            sb2.append(min5);
            sb2.append(",");
            sb2.append(i2);
            if (min5 > 0) {
                sb2.append(" A ");
                sb2.append(min5);
                sb2.append(",");
                sb2.append(min5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i2 - min5);
            }
            if (min2 > 0) {
                sb2.append(" L 0,");
                sb2.append(min2);
                sb2.append(" A ");
                sb2.append(min2);
                sb2.append(",");
                sb2.append(min2);
                sb2.append(" 0 0,1 ");
                sb2.append(min2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            sb = sb2.toString();
        }
        return new FrostHunterPackageManagerNovaStrike8745(sb, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FrostHunterPackageManagerNovaStrike8745) {
            return this.FrostHunterAlphaAnimationNeoCosmos5761.equals(((FrostHunterPackageManagerNovaStrike8745) obj).FrostHunterAlphaAnimationNeoCosmos5761);
        }
        return false;
    }

    public final int hashCode() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode();
    }

    public final String toString() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.toString();
    }
}
