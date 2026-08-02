package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class t6e implements pvo {
    public final List a;

    public t6e(List list) {
        this.a = list;
    }

    @Override // defpackage.pvo
    public final List a(rvo rvoVar) {
        return this.a;
    }

    @Override // defpackage.pvo
    public final f1k b(rvo rvoVar, tls tlsVar) {
        return f1k.O1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t6e) {
            return jl40.l(this.a, ((t6e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 16;
    }
}
