package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class l7g implements Iterator, j9f {
    public String a;
    public boolean b;
    public final /* synthetic */ wz0 c;

    public l7g(wz0 wz0Var) {
        this.c = wz0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == null && !this.b) {
            String readLine = ((BufferedReader) this.c.b).readLine();
            this.a = readLine;
            if (readLine == null) {
                this.b = true;
            }
        }
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            wvs.n();
            return null;
        }
        String str = this.a;
        this.a = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
