package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlazePulseObjectEventLoopLW1W4O4wn0KC3QtCrY46709323364574 extends ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531 {
    public final float BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final int NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
    public final int ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
    public final float UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;

    public BlazePulseObjectEventLoopLW1W4O4wn0KC3QtCrY46709323364574(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = f;
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = f2;
        this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = i;
        this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlazePulseObjectEventLoopLW1W4O4wn0KC3QtCrY46709323364574)) {
            return false;
        }
        BlazePulseObjectEventLoopLW1W4O4wn0KC3QtCrY46709323364574 blazePulseObjectEventLoopLW1W4O4wn0KC3QtCrY46709323364574 = (BlazePulseObjectEventLoopLW1W4O4wn0KC3QtCrY46709323364574) obj;
        return this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 == blazePulseObjectEventLoopLW1W4O4wn0KC3QtCrY46709323364574.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 && this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 == blazePulseObjectEventLoopLW1W4O4wn0KC3QtCrY46709323364574.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 && this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 == blazePulseObjectEventLoopLW1W4O4wn0KC3QtCrY46709323364574.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 && this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 == blazePulseObjectEventLoopLW1W4O4wn0KC3QtCrY46709323364574.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
    }

    public final int hashCode() {
        return MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050, MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480, MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339, Float.hashCode(this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818);
        sb.append(", miter=");
        sb.append(this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
