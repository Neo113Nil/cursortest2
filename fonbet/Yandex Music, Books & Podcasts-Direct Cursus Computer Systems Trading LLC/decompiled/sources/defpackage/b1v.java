package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class b1v {
    public final int a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public b1v(int i, int i2, int i3, ArrayList arrayList) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1v)) {
            return false;
        }
        b1v b1vVar = (b1v) obj;
        return this.a == b1vVar.a && this.b == b1vVar.b && this.c == b1vVar.c && this.d.equals(b1vVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f1d.a(this.c, f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("WaveScreenColorsPalette(primary=", this.a, this.b, ", secondary=", ", wordsButton=");
        l.append(this.c);
        l.append(", wordsGradient=");
        l.append(this.d);
        l.append(")");
        return l.toString();
    }
}
