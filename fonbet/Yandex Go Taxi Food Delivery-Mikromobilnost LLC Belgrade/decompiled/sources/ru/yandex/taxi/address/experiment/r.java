package ru.yandex.taxi.address.experiment;

import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class r {
    public final a a;
    public final a b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ r(int i) {
        this(new a(null, r2, r3, r4, null, null, r7, r8, null, false, r11, null, null, 524287), new a(r2, r3, r4, r5, r6, r7, r8, r9, null, r11, false, r13, null, 524287));
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
    }

    public static r a(r rVar, a aVar, a aVar2, int i) {
        if ((i & 1) != 0) {
            aVar = rVar.a;
        }
        if ((i & 2) != 0) {
            aVar2 = rVar.b;
        }
        return new r(aVar, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return jl40.l(this.a, rVar.a) && jl40.l(this.b, rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteBlockState(source=" + this.a + ", destination=" + this.b + Extension.C_BRAKE;
    }

    public r(a aVar, a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public r() {
        this(0);
    }
}
