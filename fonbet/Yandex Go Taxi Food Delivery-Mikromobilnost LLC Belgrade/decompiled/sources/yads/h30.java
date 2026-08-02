package yads;

import java.io.IOException;

/* loaded from: classes7.dex */
public class h30 extends IOException {
    public final int b;

    public h30() {
        this.b = 2008;
    }

    public h30(int i, Exception exc) {
        super(exc);
        this.b = i;
    }

    public h30(int i, Exception exc, String str) {
        super(str, exc);
        this.b = i;
    }
}
