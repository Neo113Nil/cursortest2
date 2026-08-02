package defpackage;

import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes6.dex */
public final class b6b extends yjp<Boolean> {

    @NotNull
    public static final a6b Companion = new a6b();
    public final boolean c;
    public final boolean d;

    public b6b(String str, boolean z, boolean z2, int i) {
        super(i, str);
        if ((i & 2) == 0) {
            this.c = true;
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
        StringBuilder sb = new StringBuilder("EnableNotDetachingEngineFromPlayingPlayerInListSDK(defaultFlagValue=");
        sb.append(this.c);
        sb.append(", flagValue=");
        return dfi.j(sb, this.d, ')');
    }
}
