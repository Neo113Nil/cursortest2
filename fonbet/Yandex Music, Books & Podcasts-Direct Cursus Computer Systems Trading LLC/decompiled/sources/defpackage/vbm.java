package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class vbm implements ubm {
    public final boolean a;
    public final mt b;
    public final String c;

    public vbm(boolean z, mt mtVar, String str) {
        mtVar.getClass();
        this.a = z;
        this.b = mtVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbm)) {
            return false;
        }
        vbm vbmVar = (vbm) obj;
        return this.a == vbmVar.a && Intrinsics.d(this.b, vbmVar.b) && Intrinsics.d(this.c, vbmVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalDisclaimer(showLoadingScreen=");
        sb.append(this.a);
        sb.append(", albumFull=");
        sb.append(this.b);
        sb.append(", foreignAgentDisclaimer=");
        return su4.o(sb, this.c, ")");
    }
}
