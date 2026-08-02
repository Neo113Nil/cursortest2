package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fsj implements uvn {
    public final nrf a;
    public final onq b;
    public final f73 c;
    public final String d;
    public final String e;
    public final ho6 f;
    public final int g;

    public fsj(nrf nrfVar, onq onqVar, f73 f73Var, String str, String str2, ho6 ho6Var, int i) {
        this.a = nrfVar;
        this.b = onqVar;
        this.c = f73Var;
        this.d = str;
        this.e = str2;
        this.f = ho6Var;
        this.g = i;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.wfm
    public final f73 d() {
        return this.c;
    }

    @Override // defpackage.uvn
    public final onq e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsj)) {
            return false;
        }
        fsj fsjVar = (fsj) obj;
        return this.a.equals(fsjVar.a) && this.b.equals(fsjVar.b) && this.c == fsjVar.c && this.d.equals(fsjVar.d) && Intrinsics.d(this.e, fsjVar.e) && this.f == fsjVar.f && this.g == fsjVar.g;
    }

    public final boolean f() {
        int ordinal = this.f.ordinal();
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
        int c = k5r.c(eta.b(this.c, eta.c(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        return Integer.hashCode(this.g) + ((this.f.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder i = eta.i("OpenPlaylistBlock(meta=", this.a, ", source=", this.b, ", showPolicy=");
        i.append(this.c);
        i.append(", title=");
        i.append(this.d);
        i.append(", description=");
        i.append(this.e);
        i.append(", coverStyle=");
        i.append(this.f);
        i.append(", trackCount=");
        return f1d.i(i, this.g, ")");
    }
}
