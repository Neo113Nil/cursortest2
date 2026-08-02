package defpackage;

/* loaded from: classes4.dex */
public final class jlu {
    public final boolean a;

    public jlu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jlu) && this.a == ((jlu) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("WaveAgentUiConfig(isShaderWaveAgentEnabled=", ")", this.a);
    }
}
