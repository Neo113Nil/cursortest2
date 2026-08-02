package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes11.dex */
public final class zyt0 extends PrintWriter {
    public final int a;

    public zyt0(StringWriter stringWriter) {
        super(stringWriter);
        this.a = 250;
    }

    @Override // java.io.PrintWriter
    public final void println(String str) {
        if (str != null) {
            int length = str.length();
            int i = this.a;
            if (length > i) {
                super.println(gvu0.A0(i, str).concat("...(cut)"));
                return;
            }
        }
        super.println(str);
    }

    @Override // java.io.PrintWriter
    public final void println(char[] cArr) {
        if (cArr.length <= this.a) {
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
