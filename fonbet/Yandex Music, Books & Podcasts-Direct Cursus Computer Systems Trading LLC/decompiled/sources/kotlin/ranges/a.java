package kotlin.ranges;

import defpackage.hag;
import defpackage.j9f;
import defpackage.xpe;
import defpackage.xq0;
import defpackage.ype;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public class a implements Iterable, j9f {

    @NotNull
    public static final xpe d = new xpe(null);
    public final int a;
    public final int b;
    public final int c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            xq0.x("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            xq0.x("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.a = i;
        this.b = hag.s(i, i2, i3);
        this.c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final ype iterator() {
        return new ype(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
