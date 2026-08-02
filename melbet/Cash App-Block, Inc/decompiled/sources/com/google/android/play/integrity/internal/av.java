package com.google.android.play.integrity.internal;

/* loaded from: classes.dex */
public final class av implements az {
    public static final Object a = new Object();
    public volatile aw b;
    public volatile Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public static av b(aw awVar) {
        if (awVar instanceof av) {
            return (av) awVar;
        }
        av avVar = new av();
        avVar.c = a;
        avVar.b = awVar;
        return avVar;
    }

    @Override // com.google.android.play.integrity.internal.az
    public final Object a() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.c;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object a2 = this.b.a();
                Object obj4 = this.c;
                if (obj4 != obj2 && obj4 != a2) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + a2 + ". This is likely due to a circular dependency.");
                }
                this.c = a2;
                this.b = null;
                return a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
