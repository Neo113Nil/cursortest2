package defpackage;

import android.graphics.drawable.Drawable;
import coil.graphics.DataSource;
import coil.memory.MemoryCache$Key;

/* loaded from: classes10.dex */
public final class u3v0 extends nev {
    public final Drawable a;
    public final hev b;
    public final DataSource c;
    public final MemoryCache$Key d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public u3v0(Drawable drawable, hev hevVar, DataSource dataSource, MemoryCache$Key memoryCache$Key, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = hevVar;
        this.c = dataSource;
        this.d = memoryCache$Key;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.nev
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.nev
    public final hev b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3v0)) {
            return false;
        }
        u3v0 u3v0Var = (u3v0) obj;
        return jl40.l(this.a, u3v0Var.a) && jl40.l(this.b, u3v0Var.b) && this.c == u3v0Var.c && jl40.l(this.d, u3v0Var.d) && jl40.l(this.e, u3v0Var.e) && this.f == u3v0Var.f && this.g == u3v0Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        MemoryCache$Key memoryCache$Key = this.d;
        int hashCode2 = (hashCode + (memoryCache$Key != null ? memoryCache$Key.hashCode() : 0)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + unr0.e((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }
}
