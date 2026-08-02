package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e8b {
    public final jlq a;
    public final Executor b;

    public e8b(jlq jlqVar, Executor executor) {
        this.a = jlqVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e8b) {
            return this.a.equals(((e8b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
