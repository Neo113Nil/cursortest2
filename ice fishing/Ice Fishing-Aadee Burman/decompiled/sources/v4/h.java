package v4;

/* loaded from: classes2.dex */
public final class h extends e {
    private Object obj;

    public h(Object obj) {
        this.obj = obj;
    }

    @Override // v4.e
    public Object resolve(b provider) {
        kotlin.jvm.internal.h.e(provider, "provider");
        return this.obj;
    }
}
