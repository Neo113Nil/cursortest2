package defpackage;

/* loaded from: classes4.dex */
public final class ipu implements kpu {
    public final String a;

    public ipu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipu) && this.a.equals(((ipu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("OnlyYouInWave(waveId=", this.a, ")");
    }
}
