package defpackage;

import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes6.dex */
public final class y5b extends yjp<Boolean> {

    @NotNull
    public static final x5b Companion = new x5b();
    public final boolean c;
    public final boolean d;

    public y5b(String str, boolean z, boolean z2, int i) {
        super(i, str);
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 4) == 0) {
            this.d = this.c;
        } else {
            this.d = z2;
        }
    }

    @Override // defpackage.yjp
    public final Object a() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.yjp
    public final Object b() {
        return Boolean.valueOf(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnableHevcServiceFlag(service=");
        sb.append(this.a);
        sb.append(", defaultFlagValue=");
        sb.append(this.c);
        sb.append(", flagValue=");
        return dfi.j(sb, this.d, ')');
    }
}
