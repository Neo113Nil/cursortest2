package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class hpw extends ipw {
    public final List a;
    public final long b;

    public hpw(List list, long j) {
        this.a = list;
        this.b = j;
    }

    @Override // defpackage.spw
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ipw
    public final List b() {
        return this.a;
    }

    public final String toString() {
        return dfi.c(this.a.size(), "Edit.Add.Next(size=", ")");
    }
}
