package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class p8r implements Iterable {
    public final /* synthetic */ String a;
    public final /* synthetic */ rjp b;

    public p8r(rjp rjpVar, String str) {
        this.a = str;
        this.b = rjpVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        rjp rjpVar = this.b;
        return new o8r((z6n) rjpVar.b, rjpVar, this.a);
    }

    public final String toString() {
        jpc jpcVar = new jpc(", ", 2);
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        jpcVar.a(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
