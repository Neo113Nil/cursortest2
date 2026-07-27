package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class m extends o implements O7.k {
    @Override // kotlin.jvm.internal.b
    public O7.b computeReflected() {
        s.f38718a.getClass();
        return this;
    }

    @Override // O7.k
    public Object getDelegate(Object obj) {
        return ((O7.k) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ O7.i getGetter() {
        mo54getGetter();
        return null;
    }

    @Override // I7.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // O7.k
    /* renamed from: getGetter */
    public O7.j mo54getGetter() {
        ((O7.k) getReflected()).mo54getGetter();
        return null;
    }
}
