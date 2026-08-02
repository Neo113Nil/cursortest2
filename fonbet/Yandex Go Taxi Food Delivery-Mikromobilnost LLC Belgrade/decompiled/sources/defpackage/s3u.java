package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ls3u;", "Lvn11;", "Companion", "r3u", "q3u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class s3u implements vn11 {
    public static final r3u Companion = new r3u();
    public static final s3u e = new s3u(0);
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ s3u(int i, boolean z, boolean z2, boolean z3) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
    }

    public s3u(int i) {
        this.b = false;
        this.c = false;
        this.d = false;
    }

    public s3u() {
        this(0);
    }
}
