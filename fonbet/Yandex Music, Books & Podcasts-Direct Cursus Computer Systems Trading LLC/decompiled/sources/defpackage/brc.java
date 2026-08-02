package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class brc {
    public final int a;
    public final kyk b;
    public final ArrayList c;

    public brc(int i, kyk kykVar, ArrayList arrayList) {
        this.a = i;
        this.b = kykVar;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brc)) {
            return false;
        }
        brc brcVar = (brc) obj;
        return this.a == brcVar.a && Intrinsics.d(this.b, brcVar.b) && this.c.equals(brcVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        kyk kykVar = this.b;
        return this.c.hashCode() + ((hashCode + (kykVar == null ? 0 : kykVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForceEnginePoolError(playerIndex=");
        sb.append(this.a);
        sb.append(", playbackConfig=");
        sb.append(this.b);
        sb.append(", playersIndexWithEngine=");
        return k5r.o(sb, this.c, ')');
    }
}
