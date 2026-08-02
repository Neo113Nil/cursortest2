package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cv4 implements ev4 {
    public final String a;
    public final String b;

    public cv4(String str) {
        str.getClass();
        this.a = str;
        this.b = f1d.g("header: ", str);
    }

    @Override // defpackage.ev4
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cv4) && Intrinsics.d(this.a, ((cv4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("HeaderElement(header=", this.a, ")");
    }
}
