package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class djq implements uvn {
    public final nrf a;
    public final onq b;
    public final ho6 c;
    public final String d;
    public final String e;

    public djq(nrf nrfVar, onq onqVar, ho6 ho6Var, String str, String str2) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = ho6Var;
        this.d = str;
        this.e = str2;
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
        if (!(obj instanceof djq)) {
            return false;
        }
        djq djqVar = (djq) obj;
        return this.a.equals(djqVar.a) && this.b.equals(djqVar.b) && this.c == djqVar.c && this.d.equals(djqVar.d) && Intrinsics.d(this.e, djqVar.e);
    }

    public final boolean f() {
        int ordinal = this.c.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1 || ordinal == 2) {
            return true;
        }
        b6e.s();
        return false;
    }

    public final int hashCode() {
        int c = k5r.c((this.c.hashCode() + eta.c(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
        String str = this.e;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder i = eta.i("SimplePlaylistBlock(meta=", this.a, ", source=", this.b, ", coverStyle=");
        i.append(this.c);
        i.append(", title=");
        i.append(this.d);
        i.append(", description=");
        return su4.o(i, this.e, ")");
    }
}
