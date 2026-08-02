package defpackage;

/* loaded from: classes3.dex */
public final class wtz0 implements xtz0 {
    public final boolean a;

    public wtz0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.xtz0
    public final boolean a() {
        return false;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wtz0) && this.a == ((wtz0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + unr0.e(Boolean.hashCode(this.a) * 31, 31, true);
    }

    public final String toString() {
        return nzs.b("Loading(isLeftSkeletonVisible=", ", isRightSkeletonVisible=true, isTokenizationShimmerVisible=false)", this.a);
    }
}
