package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ag4 implements uvn {
    public final nrf a;
    public final onq b;
    public final String c;
    public final String d;
    public final int e;

    public ag4(nrf nrfVar, onq onqVar, String str, String str2, int i) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.uvn
    public final onq e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag4)) {
            return false;
        }
        ag4 ag4Var = (ag4) obj;
        return this.a.equals(ag4Var.a) && this.b.equals(ag4Var.b) && Intrinsics.d(this.c, ag4Var.c) && Intrinsics.d(this.d, ag4Var.d) && this.e == ag4Var.e;
    }

    public final int hashCode() {
        int c = eta.c(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Integer.hashCode(this.e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder i = eta.i("ChartTracksBlock(meta=", this.a, ", source=", this.b, ", title=");
        su4.v(i, this.c, ", description=", this.d, ", trackCount=");
        return f1d.i(i, this.e, ")");
    }
}
