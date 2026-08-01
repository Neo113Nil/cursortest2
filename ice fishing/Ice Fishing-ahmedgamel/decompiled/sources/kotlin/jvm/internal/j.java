package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class j extends o implements O7.h {
    @Override // kotlin.jvm.internal.b
    public O7.b computeReflected() {
        s.f38718a.getClass();
        return this;
    }

    @Override // O7.k
    public Object getDelegate(Object obj) {
        return ((O7.h) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ O7.i getGetter() {
        mo54getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ O7.f getSetter() {
        mo55getSetter();
        return null;
    }

    @Override // I7.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // O7.k
    /* renamed from: getGetter, reason: collision with other method in class */
    public O7.j mo54getGetter() {
        ((O7.h) getReflected()).mo54getGetter();
        return null;
    }

    @Override // O7.h
    /* renamed from: getSetter, reason: collision with other method in class */
    public O7.g mo55getSetter() {
        ((O7.h) getReflected()).mo55getSetter();
        return null;
    }
}
