package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yon {
    public final ye0 a;
    public final kpn b;
    public final boolean c;

    public yon(ye0 ye0Var, kpn kpnVar, boolean z, int i) {
        z = (i & 32) != 0 ? true : z;
        this.a = ye0Var;
        this.b = kpnVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yon)) {
            return false;
        }
        yon yonVar = (yon) obj;
        return this.a.equals(yonVar.a) && this.b.equals(yonVar.b) && this.c == yonVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + oyr.b(0, (this.b.hashCode() + unr0.e((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31, 31, true)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(needsTransparentNavigationBar=true, screenType=");
        sb.append(this.a);
        sb.append(", needsTransparentStatusBar=true, entity=");
        sb.append(this.b);
        sb.append(", stepIndex=0, isShowingAfterSkeleton=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
