package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f3n implements h3n {
    public final m3n a;
    public final q2n b;
    public final m c;
    public final ArrayList d;

    public f3n(m3n m3nVar, q2n q2nVar, m mVar, ArrayList arrayList) {
        this.a = m3nVar;
        this.b = q2nVar;
        this.c = mVar;
        this.d = arrayList;
    }

    @Override // defpackage.i3n
    public final m3n a() {
        return this.a;
    }

    @Override // defpackage.h3n
    public final q2n b() {
        return this.b;
    }

    @Override // defpackage.h3n
    public final m c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3n)) {
            return false;
        }
        f3n f3nVar = (f3n) obj;
        return this.a.equals(f3nVar.a) && Intrinsics.d(this.b, f3nVar.b) && Intrinsics.d(this.c, f3nVar.c) && this.d.equals(f3nVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q2n q2nVar = this.b;
        int hashCode2 = (hashCode + (q2nVar == null ? 0 : q2nVar.hashCode())) * 31;
        m mVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ButtonList(texts=" + this.a + ", bottomButton=" + this.b + ", disclaimer=" + this.c + ", buttons=" + this.d + ")";
    }
}
