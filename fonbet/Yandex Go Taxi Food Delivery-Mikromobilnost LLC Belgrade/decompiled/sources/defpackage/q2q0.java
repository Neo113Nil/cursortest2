package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class q2q0 extends w2q0 {
    public static final p2q0 Companion = new p2q0();
    public final String c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2q0(int i, String str, String str2, String str3) {
        super(str);
        if (7 != (i & 7)) {
            qje.Z(i, 7, o2q0.a.getDescriptor());
            throw null;
        }
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q2q0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        q2q0 q2q0Var = (q2q0) obj;
        return jl40.l(this.c, q2q0Var.c) && jl40.l(this.d, q2q0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("MergeSectionsOperation(sectionId=", this.c, ", actionId=", this.d, Extension.C_BRAKE);
    }

    public q2q0(String str, String str2) {
        super("merge", 0);
        this.c = str;
        this.d = str2;
    }
}
