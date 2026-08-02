package defpackage;

/* loaded from: classes7.dex */
public final class rb91 implements id91 {
    public static final Object c = new Object();
    public volatile id91 a;
    public volatile Object b = c;

    public rb91(id91 id91Var) {
        this.a = id91Var;
    }

    public static rb91 a(id91 id91Var) {
        return id91Var instanceof rb91 ? (rb91) id91Var : new rb91(id91Var);
    }

    public static id91 b(id91 id91Var) {
        return id91Var instanceof rb91 ? id91Var : new rb91(id91Var);
    }

    @Override // defpackage.id91
    public final Object zza() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.zza();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
