package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class q6b0 implements r6b0 {
    public final v6b0 a;

    public q6b0(v6b0 v6b0Var) {
        this.a = v6b0Var;
    }

    @Override // defpackage.r6b0
    public final v6b0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6b0) && this.a.equals(((q6b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(loadingTrigger=" + this.a + Extension.C_BRAKE;
    }
}
