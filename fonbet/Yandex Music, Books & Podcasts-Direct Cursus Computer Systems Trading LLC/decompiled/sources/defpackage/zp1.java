package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zp1 implements bq1 {
    public final String a;
    public final ArrayList b;
    public final vtm c;

    public zp1(String str, ArrayList arrayList, vtm vtmVar) {
        this.a = str;
        this.b = arrayList;
        this.c = vtmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp1)) {
            return false;
        }
        zp1 zp1Var = (zp1) obj;
        return Intrinsics.d(this.a, zp1Var.a) && this.b.equals(zp1Var.b) && Intrinsics.d(this.c, zp1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int b = dfi.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        vtm vtmVar = this.c;
        return b + (vtmVar != null ? vtmVar.hashCode() : 0);
    }

    public final String toString() {
        return "SeveralArtists(headerTitle=" + this.a + ", artistsWithConcerts=" + this.b + ", analyticsPayload=" + this.c + ")";
    }
}
