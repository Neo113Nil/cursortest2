package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class j extends o implements K7.h {
    @Override // kotlin.jvm.internal.b
    public K7.b computeReflected() {
        s.f38862a.getClass();
        return this;
    }

    @Override // K7.k
    public Object getDelegate(Object obj) {
        return ((K7.h) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ K7.i getGetter() {
        mo51getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ K7.f getSetter() {
        mo52getSetter();
        return null;
    }

    @Override // E7.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // K7.k
    /* renamed from: getGetter, reason: collision with other method in class */
    public K7.j mo51getGetter() {
        ((K7.h) getReflected()).mo51getGetter();
        return null;
    }

    @Override // K7.h
    /* renamed from: getSetter, reason: collision with other method in class */
    public K7.g mo52getSetter() {
        ((K7.h) getReflected()).mo52getSetter();
        return null;
    }
}
