package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class hb7 extends IOException {
    public final int a;

    public hb7(int i) {
        this.a = i;
    }

    public hb7(int i, Exception exc) {
        super(exc);
        this.a = i;
    }

    public hb7(String str, int i) {
        super(str);
        this.a = i;
    }

    public hb7(int i, Exception exc, String str) {
        super(str, exc);
        this.a = i;
    }
}
