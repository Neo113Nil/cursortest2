package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class smb {
    public final nab a;
    public final u0s b;

    public smb(nab nabVar, u0s u0sVar) {
        nabVar.getClass();
        this.a = nabVar;
        this.b = u0sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smb)) {
            return false;
        }
        smb smbVar = (smb) obj;
        return Intrinsics.d(this.a, smbVar.a) && Intrinsics.d(this.b, smbVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u0s u0sVar = this.b;
        return hashCode + (u0sVar == null ? 0 : u0sVar.hashCode());
    }

    public final String toString() {
        return "Key(block=" + this.a + ", tab=" + this.b + ")";
    }
}
