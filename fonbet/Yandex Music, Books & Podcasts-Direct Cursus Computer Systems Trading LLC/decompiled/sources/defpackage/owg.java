package defpackage;

import java.util.Locale;

/* loaded from: classes5.dex */
public final class owg {
    public final long a;
    public final long b;

    public owg(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return hrg.m(this.b, "]}", tlm.l(this.a, "LongTask {start=[", "] duration["));
    }
}
