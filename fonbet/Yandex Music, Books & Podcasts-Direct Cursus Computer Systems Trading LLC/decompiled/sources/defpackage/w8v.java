package defpackage;

/* loaded from: classes4.dex */
public final class w8v {
    public final boolean a;

    public w8v(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8v) && this.a == ((w8v) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("WaveWordsSubscriptionConfig(hasOption=", ")", this.a);
    }
}
