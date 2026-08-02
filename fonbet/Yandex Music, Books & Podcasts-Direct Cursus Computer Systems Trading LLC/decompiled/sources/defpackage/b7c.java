package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b7c implements uvn {
    public final nrf a;
    public final onq b;
    public final String c;
    public final String d;

    public b7c(nrf nrfVar, onq onqVar, String str, String str2) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = str;
        this.d = str2;
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
        if (!(obj instanceof b7c)) {
            return false;
        }
        b7c b7cVar = (b7c) obj;
        return this.a.equals(b7cVar.a) && this.b.equals(b7cVar.b) && Intrinsics.d(this.c, b7cVar.c) && Intrinsics.d(this.d, b7cVar.d);
    }

    public final int hashCode() {
        int c = eta.c(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ouj.q(eta.i("FeaturedBlock(meta=", this.a, ", source=", this.b, ", title="), this.c, ", description=", this.d, ")");
    }
}
