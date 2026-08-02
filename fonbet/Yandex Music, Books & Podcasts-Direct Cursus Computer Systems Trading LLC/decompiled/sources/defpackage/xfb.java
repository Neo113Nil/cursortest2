package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xfb implements xnh {
    public final String a;
    public final Object b;
    public final int c;

    public xfb(String str) {
        str.getClass();
        this.a = str;
        this.b = btf.a(bwf.c, new ita(9, this));
        this.c = 1;
    }

    @Override // defpackage.xnh
    public final int a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfb) && Intrinsics.d(this.a, ((xfb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
    @Override // defpackage.xnh
    public final onh l(int i) {
        return (onh) this.b.getValue();
    }

    public final String toString() {
        return hrg.q("ErrorMediaItemsSource(sessionErrorMessage=", this.a, ")");
    }
}
