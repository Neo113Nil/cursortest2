package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class vy5 {
    public final int a;
    public final Integer b;

    public vy5(int i, int i2, Integer num) {
        num = (i2 & 2) != 0 ? null : num;
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy5)) {
            return false;
        }
        vy5 vy5Var = (vy5) obj;
        return this.a == vy5Var.a && Intrinsics.d(this.b, vy5Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return Integer.hashCode(R.string.concert_full_cashback_percent_text) + f1d.a(R.string.concert_tab_buy, f1d.a(R.string.concert_tab_buy, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConcertPriceStringConfig(fromTextId=");
        sb.append(this.a);
        sb.append(", fromTextIdLowerCase=");
        sb.append(this.b);
        sb.append(", defaultTextId=");
        hrg.w(R.string.concert_tab_buy, R.string.concert_tab_buy, ", fallbackTextId=", ", cashbackTextId=", sb);
        return f1d.i(sb, R.string.concert_full_cashback_percent_text, ")");
    }
}
