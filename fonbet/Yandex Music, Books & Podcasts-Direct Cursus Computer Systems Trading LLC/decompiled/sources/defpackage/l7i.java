package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l7i implements uvn {
    public final nrf a;
    public final onq b;
    public final String c;
    public final o43 d;

    public l7i(nrf nrfVar, onq onqVar, String str, o43 o43Var) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = str;
        this.d = o43Var;
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
        if (!(obj instanceof l7i)) {
            return false;
        }
        l7i l7iVar = (l7i) obj;
        return this.a.equals(l7iVar.a) && this.b.equals(l7iVar.b) && Intrinsics.d(this.c, l7iVar.c) && Intrinsics.d(this.d, l7iVar.d);
    }

    public final int hashCode() {
        int c = eta.c(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        o43 o43Var = this.d;
        return hashCode + (o43Var != null ? o43Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder i = eta.i("MixesBlock(meta=", this.a, ", source=", this.b, ", title=");
        i.append(this.c);
        i.append(", viewAllAction=");
        i.append(this.d);
        i.append(")");
        return i.toString();
    }
}
