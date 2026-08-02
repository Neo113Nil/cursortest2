package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class nwt {
    public Function1 a;

    public abstract void a(jpa jpaVar);

    public Function1 b() {
        return this.a;
    }

    public final void c() {
        Function1 b = b();
        if (b != null) {
            b.invoke(this);
        }
    }

    public void d(kma kmaVar) {
        this.a = kmaVar;
    }
}
