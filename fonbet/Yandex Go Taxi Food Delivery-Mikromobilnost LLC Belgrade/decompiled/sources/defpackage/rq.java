package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class rq extends WeakReference {
    public final bl7 a;

    public rq(bl7 bl7Var, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = bl7Var;
    }
}
