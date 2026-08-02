package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class wy5 {
    public final int a;
    public final int b;
    public final int c;

    public wy5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy5)) {
            return false;
        }
        wy5 wy5Var = (wy5) obj;
        return this.a == wy5Var.a && this.b == wy5Var.b && this.c == wy5Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(R.string.concert_full_cashback_percent_text, f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("ConcertPriceStringConfig(fromTextId=", this.a, this.b, ", defaultTextId=", ", cashbackTextId=");
        l.append(R.string.concert_full_cashback_percent_text);
        l.append(", fallbackTextId=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
