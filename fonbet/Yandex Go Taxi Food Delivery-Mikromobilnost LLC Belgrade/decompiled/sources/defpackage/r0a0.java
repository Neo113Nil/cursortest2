package defpackage;

import java.util.function.Function;

/* loaded from: classes8.dex */
public final class r0a0 extends t0a0 {
    public final int c;
    public final int d;
    public final String e;

    public /* synthetic */ r0a0(String str, Function function, int i, int i2, int i3) {
        this(str, function, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (String) null);
    }

    public r0a0(String str, Function function, int i, int i2, String str2) {
        super(str, function);
        this.c = i;
        this.d = i2;
        this.e = str2;
    }
}
