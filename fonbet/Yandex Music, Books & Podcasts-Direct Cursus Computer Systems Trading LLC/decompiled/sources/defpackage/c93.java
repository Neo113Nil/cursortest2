package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c93 {
    public final iab a;
    public final gvd b;
    public final o8w c;

    public c93(iab iabVar, ivd ivdVar, o8w o8wVar) {
        ivdVar.getClass();
        this.a = iabVar;
        this.b = ivdVar;
        this.c = o8wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c93)) {
            return false;
        }
        c93 c93Var = (c93) obj;
        return this.a.equals(c93Var.a) && Intrinsics.d(this.b, c93Var.b) && this.c.equals(c93Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BookHeaderBlock(header=" + this.a + ", coverLoadState=" + this.b + ", yandexBooksUiData=" + this.c + ")";
    }
}
