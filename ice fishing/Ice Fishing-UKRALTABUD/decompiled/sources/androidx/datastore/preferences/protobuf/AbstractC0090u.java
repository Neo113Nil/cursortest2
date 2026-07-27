package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0090u implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0092w f1500f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0092w f1501g;

    public AbstractC0090u(AbstractC0092w abstractC0092w) {
        this.f1500f = abstractC0092w;
        if (abstractC0092w.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f1501g = abstractC0092w.k();
    }

    public final AbstractC0092w a() {
        AbstractC0092w b2 = b();
        b2.getClass();
        if (AbstractC0092w.h(b2, true)) {
            return b2;
        }
        throw new c0();
    }

    public final AbstractC0092w b() {
        if (!this.f1501g.i()) {
            return this.f1501g;
        }
        AbstractC0092w abstractC0092w = this.f1501g;
        abstractC0092w.getClass();
        T t2 = T.f1385c;
        t2.getClass();
        t2.a(abstractC0092w.getClass()).g(abstractC0092w);
        abstractC0092w.j();
        return this.f1501g;
    }

    public final void c() {
        if (this.f1501g.i()) {
            return;
        }
        AbstractC0092w k2 = this.f1500f.k();
        AbstractC0092w abstractC0092w = this.f1501g;
        T t2 = T.f1385c;
        t2.getClass();
        t2.a(k2.getClass()).e(k2, abstractC0092w);
        this.f1501g = k2;
    }

    public final Object clone() {
        AbstractC0090u abstractC0090u = (AbstractC0090u) this.f1500f.e(5);
        abstractC0090u.f1501g = b();
        return abstractC0090u;
    }
}
