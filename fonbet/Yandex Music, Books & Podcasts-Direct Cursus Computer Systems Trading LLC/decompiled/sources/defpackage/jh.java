package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class jh extends WeakReference {
    public final daf a;
    public final boolean b;
    public k2o c;

    public jh(daf dafVar, j8b j8bVar, ReferenceQueue referenceQueue) {
        super(j8bVar, referenceQueue);
        w1g.s(dafVar, "Argument must not be null");
        this.a = dafVar;
        boolean z = j8bVar.a;
        this.c = null;
        this.b = z;
    }
}
