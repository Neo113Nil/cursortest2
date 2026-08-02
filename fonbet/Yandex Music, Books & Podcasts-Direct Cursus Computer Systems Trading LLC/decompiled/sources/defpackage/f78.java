package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class f78 implements Closeable {
    public final String a;
    public final long b;
    public final ArrayList c;
    public final /* synthetic */ k78 d;

    public f78(k78 k78Var, String str, long j, ArrayList arrayList, long[] jArr) {
        str.getClass();
        jArr.getClass();
        this.d = k78Var;
        this.a = str;
        this.b = j;
        this.c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            cvt.d((n3r) it.next());
        }
    }
}
