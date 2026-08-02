package defpackage;

/* loaded from: classes3.dex */
public final class rbc extends vbc {
    public final boolean a;

    public rbc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vbc
    public final String a() {
        return "podcast";
    }

    @Override // defpackage.vbc
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbc) && this.a == ((rbc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("PodcastSort(isSelected=", ")", this.a);
    }
}
