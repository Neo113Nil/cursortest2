package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyjo;", "Lj530;", "Lzjo;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class yjo extends j530 {
    public final tls a;

    public yjo(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        zjo zjoVar = new zjo();
        zjoVar.a = this.a;
        return zjoVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yjo) {
            return this.a == ((yjo) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((zjo) e530Var).a = this.a;
    }

    public final int hashCode() {
        tls tlsVar = this.a;
        if (tlsVar != null) {
            return tlsVar.hashCode();
        }
        return 0;
    }
}
