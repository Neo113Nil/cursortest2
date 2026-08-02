package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o3m implements ybb {
    public final String a;
    public final eul b;
    public final boolean c;
    public final Float d;
    public final ArrayList e;

    public o3m(String str, eul eulVar, boolean z, Float f, ArrayList arrayList) {
        this.a = str;
        this.b = eulVar;
        this.c = z;
        this.d = f;
        this.e = arrayList;
    }

    @Override // defpackage.ybb
    public final List a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3m)) {
            return false;
        }
        o3m o3mVar = (o3m) obj;
        return Intrinsics.d(this.a, o3mVar.a) && this.b.equals(o3mVar.b) && this.c == o3mVar.c && Intrinsics.d(this.d, o3mVar.d) && this.e.equals(o3mVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int e = k5r.e((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c);
        Float f = this.d;
        return this.e.hashCode() + ((e + (f != null ? f.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistTrailer(title=");
        sb.append(this.a);
        sb.append(", playlistDomainItem=");
        sb.append(this.b);
        sb.append(", shareable=");
        sb.append(this.c);
        sb.append(", personalColorHue=");
        sb.append(this.d);
        sb.append(", smartPreviews=");
        return vz1.t(sb, this.e, ")");
    }
}
