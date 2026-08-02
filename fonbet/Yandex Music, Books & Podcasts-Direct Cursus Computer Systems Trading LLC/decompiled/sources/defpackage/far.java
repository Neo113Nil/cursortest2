package defpackage;

import java.io.PrintWriter;

/* loaded from: classes3.dex */
public final class far extends PrintWriter {
    @Override // java.io.PrintWriter
    public final void println(String str) {
        if (str == null || str.length() <= 250) {
            super.println(str);
        } else {
            super.println(mlr.K(250, str).concat("...(cut)"));
        }
    }

    @Override // java.io.PrintWriter
    public final void println(char[] cArr) {
        cArr.getClass();
        if (cArr.length <= 250) {
            super.println(cArr);
        } else {
            println(new String(cArr));
        }
    }

    @Override // java.io.PrintWriter
    public final void println(Object obj) {
        println(String.valueOf(obj));
    }
}
