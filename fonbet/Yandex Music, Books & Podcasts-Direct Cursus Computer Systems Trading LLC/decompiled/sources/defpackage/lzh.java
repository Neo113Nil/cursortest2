package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class lzh implements Serializable {
    private static final long serialVersionUID = 0;
    public final String a;
    public final int b;
    public final String c;

    public lzh(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    private Object readResolve() {
        return new mzh(this.a, this.b, this.c);
    }
}
