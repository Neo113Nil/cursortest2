package defpackage;

/* loaded from: classes4.dex */
public final class rru implements tru {
    public final boolean a;
    public final boolean b;

    public rru(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rru)) {
            return false;
        }
        rru rruVar = (rru) obj;
        return this.a == rruVar.a && this.b == rruVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.tru
    public final boolean k() {
        return this.b;
    }

    public final String toString() {
        return hrg.t("Loading(isInvitationLinkLoading=", this.a, ", isRefreshing=", this.b, ")");
    }
}
