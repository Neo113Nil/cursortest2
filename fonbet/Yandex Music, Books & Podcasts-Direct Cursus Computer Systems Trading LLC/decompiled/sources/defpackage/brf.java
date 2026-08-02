package defpackage;

/* loaded from: classes3.dex */
public final class brf implements uzm {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile uzm b;

    public brf(uzm uzmVar) {
        this.b = uzmVar;
    }

    @Override // defpackage.uzm
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.a;
                if (obj == obj3) {
                    obj = this.b.get();
                    this.a = obj;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
