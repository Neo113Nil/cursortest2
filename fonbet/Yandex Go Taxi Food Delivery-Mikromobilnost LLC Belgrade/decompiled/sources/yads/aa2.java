package yads;

import java.io.IOException;

/* loaded from: classes7.dex */
public class aa2 extends IOException {
    public final boolean b;
    public final int c;

    public aa2(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.b = z;
        this.c = i;
    }

    public static aa2 a(String str) {
        return new aa2(str, null, false, 1);
    }
}
