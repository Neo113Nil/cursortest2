package defpackage;

/* loaded from: classes4.dex */
public final class tvu {
    public final boolean a;

    public tvu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tvu) && this.a == ((tvu) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("WavePlaybackConfig(useOnlyInitialPlayables=", ")", this.a);
    }
}
