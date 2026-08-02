package defpackage;

/* loaded from: classes4.dex */
public final class bhn {
    public final ae a;

    public bhn(ae aeVar) {
        this.a = aeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhn) && this.a.equals(((bhn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "RadioSdkConfig(forAlice=false, playbackConfig=" + this.a + ")";
    }
}
