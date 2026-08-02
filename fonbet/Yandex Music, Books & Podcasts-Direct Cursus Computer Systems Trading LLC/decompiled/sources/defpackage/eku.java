package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class eku {
    public final ges a;
    public final long b;
    public final long c;
    public final long d;

    public eku(ges gesVar, long j, long j2, long j3) {
        this.a = gesVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eku)) {
            return false;
        }
        eku ekuVar = (eku) obj;
        return this.a.equals(ekuVar.a) && d85.c(this.b, ekuVar.b) && d85.c(this.c, ekuVar.c) && d85.c(this.d, ekuVar.d);
    }

    public final int hashCode() {
        int a = f1d.a(R.drawable.ic_arrow_mid_right_24, f1d.a(R.drawable.ic_offline_mode_lte_wi_fi_40, f1d.a(R.string.vpn_offline_button_label, this.a.hashCode() * 31, 31), 31), 31);
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.d) + tlm.c(this.c, tlm.c(this.b, a, 31), 31);
    }

    public final String toString() {
        String i = d85.i(this.b);
        String i2 = d85.i(this.c);
        String i3 = d85.i(this.d);
        StringBuilder sb = new StringBuilder("VpnOfflineButtonDeps(textStyle=");
        sb.append(this.a);
        sb.append(", labelId=");
        sb.append(R.string.vpn_offline_button_label);
        sb.append(", iconId=");
        hrg.w(R.drawable.ic_offline_mode_lte_wi_fi_40, R.drawable.ic_arrow_mid_right_24, ", anchorIconId=", ", buttonColor=", sb);
        su4.v(sb, i, ", backgroundColor=", i2, ", contentColor=");
        return su4.o(sb, i3, ")");
    }
}
