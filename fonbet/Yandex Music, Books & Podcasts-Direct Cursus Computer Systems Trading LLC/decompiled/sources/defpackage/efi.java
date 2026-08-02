package defpackage;

/* loaded from: classes.dex */
public final class efi {
    public final long a;
    public final long b;
    public final boolean c;

    public efi(boolean z, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final efi a(efi efiVar) {
        return new efi(this.c, enj.h(this.a, efiVar.a), Math.max(this.b, efiVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efi)) {
            return false;
        }
        efi efiVar = (efi) obj;
        return enj.c(this.a, efiVar.a) && this.b == efiVar.b && this.c == efiVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + tlm.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) enj.j(this.a));
        sb.append(", timeMillis=");
        sb.append(this.b);
        sb.append(", shouldApplyImmediately=");
        return dfi.j(sb, this.c, ')');
    }
}
