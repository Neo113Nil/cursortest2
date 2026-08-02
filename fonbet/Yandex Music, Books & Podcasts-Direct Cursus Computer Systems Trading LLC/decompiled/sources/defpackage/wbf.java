package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wbf extends fq5 {
    public final String c;
    public final Object[] d;

    public wbf(String str, Object[] objArr, pyc pycVar) {
        super(pycVar, lhb.v0);
        this.c = str;
        this.d = objArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wbf)) {
            return false;
        }
        wbf wbfVar = (wbf) obj;
        return this.c.equals(wbfVar.c) && Arrays.equals(this.d, wbfVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
