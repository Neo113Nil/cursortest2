package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0120u implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0122w f2460a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0122w f2461b;

    public AbstractC0120u(AbstractC0122w abstractC0122w) {
        this.f2460a = abstractC0122w;
        if (abstractC0122w.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2461b = abstractC0122w.k();
    }

    public final AbstractC0122w a() {
        AbstractC0122w b2 = b();
        b2.getClass();
        if (AbstractC0122w.h(b2, true)) {
            return b2;
        }
        throw new c0();
    }

    public final AbstractC0122w b() {
        if (!this.f2461b.i()) {
            return this.f2461b;
        }
        AbstractC0122w abstractC0122w = this.f2461b;
        abstractC0122w.getClass();
        T t = T.f2345c;
        t.getClass();
        t.a(abstractC0122w.getClass()).h(abstractC0122w);
        abstractC0122w.j();
        return this.f2461b;
    }

    public final void c() {
        if (this.f2461b.i()) {
            return;
        }
        AbstractC0122w k2 = this.f2460a.k();
        AbstractC0122w abstractC0122w = this.f2461b;
        T t = T.f2345c;
        t.getClass();
        t.a(k2.getClass()).c(k2, abstractC0122w);
        this.f2461b = k2;
    }

    public final Object clone() {
        AbstractC0120u abstractC0120u = (AbstractC0120u) this.f2460a.e(5);
        abstractC0120u.f2461b = b();
        return abstractC0120u;
    }
}
