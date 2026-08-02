package defpackage;

import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes6.dex */
public final class wq4 {

    @NotNull
    public static final vq4 Companion = new vq4();
    public final boolean a;
    public final int b;
    public final long c;
    public final boolean d;

    public /* synthetic */ wq4(int i, boolean z, int i2, long j, boolean z2) {
        this.a = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.b = 3;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = 50L;
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodecInitializationRemoteFlag(shouldTryInitCodecsWithRetries=");
        sb.append(this.a);
        sb.append(", retriesCount=");
        sb.append(this.b);
        sb.append(", timeoutMs=");
        sb.append(this.c);
        sb.append(", useIncrementalCodecInitTimeout=");
        return dfi.j(sb, this.d, ')');
    }

    public wq4() {
        this.a = true;
        this.b = 3;
        this.c = 50L;
        this.d = false;
    }
}
