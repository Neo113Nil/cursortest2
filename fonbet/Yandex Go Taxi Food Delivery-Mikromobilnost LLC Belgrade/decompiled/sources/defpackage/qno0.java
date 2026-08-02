package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qno0 implements rno0 {
    public final CharSequence a;
    public final List b;

    public qno0(CharSequence charSequence, List list) {
        this.a = charSequence;
        this.b = list;
    }

    @Override // defpackage.rno0
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qno0)) {
            return false;
        }
        qno0 qno0Var = (qno0) obj;
        return jl40.l(this.a, qno0Var.a) && jl40.l(this.b, qno0Var.b);
    }

    @Override // defpackage.rno0
    public final CharSequence getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(title=" + ((Object) this.a) + ", details=" + this.b + Extension.C_BRAKE;
    }
}
