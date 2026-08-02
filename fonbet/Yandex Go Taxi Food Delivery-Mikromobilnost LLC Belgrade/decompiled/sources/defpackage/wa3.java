package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wa3 {
    public final String a;
    public final Object b;
    public final Object c;
    public final Object d;

    public wa3(String str, Object obj, Object obj2, Object obj3) {
        this.a = str;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa3)) {
            return false;
        }
        wa3 wa3Var = (wa3) obj;
        return jl40.l(this.a, wa3Var.a) && this.b.equals(wa3Var.b) && jl40.l(this.c, wa3Var.c) && jl40.l(this.d, wa3Var.d);
    }

    public final int hashCode() {
        int c = smw0.c(this.a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        int hashCode = (c + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.d;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "AsyncProcessParams(taskId=" + this.a + ", formState=" + this.b + ", formStateValue=" + this.c + ", taskParams=" + this.d + Extension.C_BRAKE;
    }
}
