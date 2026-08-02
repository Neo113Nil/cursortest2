package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qys0 implements tys0 {
    public final CharSequence a;
    public final CharSequence b;
    public final v4v c;
    public final nhe d;
    public final boolean e;

    public qys0(CharSequence charSequence, CharSequence charSequence2, v4v v4vVar, nhe nheVar, boolean z) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = v4vVar;
        this.d = nheVar;
        this.e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [v4v] */
    public static qys0 a(qys0 qys0Var, j4z j4zVar, nhe nheVar, boolean z, int i) {
        CharSequence charSequence = qys0Var.a;
        CharSequence charSequence2 = qys0Var.b;
        j4z j4zVar2 = j4zVar;
        if ((i & 4) != 0) {
            j4zVar2 = qys0Var.c;
        }
        j4z j4zVar3 = j4zVar2;
        if ((i & 8) != 0) {
            nheVar = qys0Var.d;
        }
        nhe nheVar2 = nheVar;
        if ((i & 16) != 0) {
            z = qys0Var.e;
        }
        qys0Var.getClass();
        return new qys0(charSequence, charSequence2, j4zVar3, nheVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qys0)) {
            return false;
        }
        qys0 qys0Var = (qys0) obj;
        return jl40.l(this.a, qys0Var.a) && jl40.l(this.b, qys0Var.b) && jl40.l(this.c, qys0Var.c) && this.d.equals(qys0Var.d) && this.e == qys0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        v4v v4vVar = this.c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((hashCode2 + (v4vVar != null ? v4vVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "AiSmartCamera(title=", ", hintText=", ", capturedImage=");
        r.append(this.c);
        r.append(", contentScale=");
        r.append(this.d);
        r.append(", shouldValidateCapturedImage=");
        return x4e.i(r, this.e, Extension.C_BRAKE);
    }
}
