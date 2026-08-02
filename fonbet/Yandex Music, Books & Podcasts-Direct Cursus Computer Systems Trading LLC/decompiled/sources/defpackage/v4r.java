package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v4r implements uvn {
    public final nrf a;
    public final onq b;
    public final String c;

    public v4r(nrf nrfVar, onq onqVar, String str) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = str;
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
        if (!(obj instanceof v4r)) {
            return false;
        }
        v4r v4rVar = (v4r) obj;
        return this.a.equals(v4rVar.a) && this.b.equals(v4rVar.b) && Intrinsics.d(this.c, v4rVar.c);
    }

    public final int hashCode() {
        int c = eta.c(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return su4.o(eta.i("SpecialBlock(meta=", this.a, ", source=", this.b, ", title="), this.c, ")");
    }
}
