package defpackage;

import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes6.dex */
public final class fqe extends yjp<Integer> {

    @NotNull
    public static final eqe Companion = new eqe();
    public final int c;
    public final int d;

    public fqe(String str, int i, int i2, int i3) {
        super(i, str);
        if ((i & 2) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 4) == 0) {
            this.d = this.c;
        } else {
            this.d = i3;
        }
    }

    @Override // defpackage.yjp
    public final Object a() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.yjp
    public final Object b() {
        return Integer.valueOf(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntServiceFlag(defaultFlagValue=");
        sb.append(this.c);
        sb.append(", flagValue=");
        return vz1.r(sb, this.d, ')');
    }
}
