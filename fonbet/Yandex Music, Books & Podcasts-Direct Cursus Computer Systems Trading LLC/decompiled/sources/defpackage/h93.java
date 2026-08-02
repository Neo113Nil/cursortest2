package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h93 {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final boolean d;
    public final saj e;

    public h93(String str, ArrayList arrayList, String str2, boolean z, saj sajVar) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = z;
        this.e = sajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h93)) {
            return false;
        }
        h93 h93Var = (h93) obj;
        return Intrinsics.d(this.a, h93Var.a) && this.b.equals(h93Var.b) && Intrinsics.d(this.c, h93Var.c) && this.d == h93Var.d && Intrinsics.d(this.e, h93Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int b = dfi.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        int e = k5r.e((b + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        saj sajVar = this.e;
        return e + (sajVar != null ? sajVar.hashCode() : 0);
    }

    public final String toString() {
        return "BookInfoUiData(description=" + this.a + ", speakers=" + this.b + ", totalDuration=" + this.c + ", hasExplicitLabel=" + this.d + ", previewTrack=" + this.e + ")";
    }
}
