package defpackage;

/* loaded from: classes4.dex */
public final class pru implements tru {
    public final boolean a;
    public final boolean b;

    public pru(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pru)) {
            return false;
        }
        pru pruVar = (pru) obj;
        return this.a == pruVar.a && this.b == pruVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.tru
    public final boolean k() {
        return this.b;
    }

    public final String toString() {
        return hrg.t("Empty(isInvitationLinkLoading=", this.a, ", isRefreshing=", this.b, ")");
    }
}
