package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tk21 implements a05 {
    public final Throwable a;
    public final v7l b;
    public final lur0 c;
    public final boolean d;
    public final List e;

    public tk21(Throwable th, v7l v7lVar, lur0 lur0Var, boolean z, List list) {
        this.a = th;
        this.b = v7lVar;
        this.c = lur0Var;
        this.d = z;
        this.e = list;
    }

    public static tk21 b(tk21 tk21Var, Throwable th, v7l v7lVar, lur0 lur0Var, int i) {
        if ((i & 1) != 0) {
            th = tk21Var.a;
        }
        Throwable th2 = th;
        if ((i & 2) != 0) {
            v7lVar = tk21Var.b;
        }
        v7l v7lVar2 = v7lVar;
        if ((i & 4) != 0) {
            lur0Var = tk21Var.c;
        }
        lur0 lur0Var2 = lur0Var;
        boolean z = (i & 8) != 0 ? tk21Var.d : false;
        List list = (i & 16) != 0 ? tk21Var.e : null;
        tk21Var.getClass();
        return new tk21(th2, v7lVar2, lur0Var2, z, list);
    }

    @Override // defpackage.a05
    public final lur0 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk21)) {
            return false;
        }
        tk21 tk21Var = (tk21) obj;
        return jl40.l(this.a, tk21Var.a) && jl40.l(this.b, tk21Var.b) && this.c.equals(tk21Var.c) && this.d == tk21Var.d && jl40.l(this.e, tk21Var.e);
    }

    @Override // defpackage.a05
    public final v7l getEntity() {
        return this.b;
    }

    @Override // defpackage.a05
    public final Throwable getError() {
        return this.a;
    }

    public final int hashCode() {
        Throwable th = this.a;
        int hashCode = (th == null ? 0 : th.hashCode()) * 31;
        v7l v7lVar = this.b;
        return this.e.hashCode() + unr0.e((this.c.hashCode() + ((hashCode + (v7lVar != null ? v7lVar.hashCode() : 0)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserCardsState(error=");
        sb.append(this.a);
        sb.append(", entity=");
        sb.append(this.b);
        sb.append(", shimmerTimerStatus=");
        sb.append(this.c);
        sb.append(", isNfcSettingsAvailable=");
        sb.append(this.d);
        sb.append(", cardTokenizedList=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }
}
