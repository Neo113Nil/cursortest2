package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class WhiteFieldStateUnificationYh53nRk2vgRXz1cU5I77305922756026 {
    public static final int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = 66305;
    public final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public static String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i2 = i & 255;
        String str = "Invalid";
        sb.append((Object) (i2 == 1 ? "Strategy.Simple" : i2 == 2 ? "Strategy.HighQuality" : i2 == 3 ? "Strategy.Balanced" : i2 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i3 = (i >> 8) & 255;
        sb.append((Object) (i3 == 1 ? "Strictness.None" : i3 == 2 ? "Strictness.Loose" : i3 == 3 ? "Strictness.Normal" : i3 == 4 ? "Strictness.Strict" : i3 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str = "WordBreak.None";
        } else if (i4 == 2) {
            str = "WordBreak.Phrase";
        } else if (i4 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WhiteFieldStateUnificationYh53nRk2vgRXz1cU5I77305922756026) {
            return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == ((WhiteFieldStateUnificationYh53nRk2vgRXz1cU5I77305922756026) obj).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
    }

    public final String toString() {
        return ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
    }
}
