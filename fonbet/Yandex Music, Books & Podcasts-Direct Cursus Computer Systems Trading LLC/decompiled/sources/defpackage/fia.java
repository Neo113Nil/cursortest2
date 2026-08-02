package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fia implements drf {
    public final nrf a;
    public final String b;
    public final int c;

    public fia(nrf nrfVar, String str, int i) {
        nrfVar.getClass();
        str.getClass();
        this.a = nrfVar;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fia)) {
            return false;
        }
        fia fiaVar = (fia) obj;
        return Intrinsics.d(this.a, fiaVar.a) && Intrinsics.d(this.b, fiaVar.b) && this.c == fiaVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadedSectionsBlock(meta=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionsCount=");
        return f1d.i(sb, this.c, ")");
    }
}
