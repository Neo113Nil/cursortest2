package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class up1 implements wp1 {
    public final String a;
    public final ArrayList b;
    public final mwk c;

    public up1(String str, ArrayList arrayList, mwk mwkVar) {
        mwkVar.getClass();
        this.a = str;
        this.b = arrayList;
        this.c = mwkVar;
    }

    @Override // defpackage.wp1
    public final mwk a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up1)) {
            return false;
        }
        up1 up1Var = (up1) obj;
        return Intrinsics.d(this.a, up1Var.a) && this.b.equals(up1Var.b) && Intrinsics.d(this.c, up1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + dfi.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "SeveralArtists(headerTitle=" + this.a + ", artistsWithConcerts=" + this.b + ", playable=" + this.c + ")";
    }
}
