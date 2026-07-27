package E0;

/* loaded from: classes.dex */
public final class l extends m implements H0.c, D0.l {
    @Override // E0.c
    public final H0.a b() {
        q.f313a.getClass();
        return this;
    }

    public final void e() {
        if (this.f309l) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        H0.a d2 = d();
        if (d2 == this) {
            throw new C0.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((l) ((H0.c) d2)).e();
    }

    @Override // D0.l
    public final Object i(Object obj) {
        e();
        throw null;
    }
}
