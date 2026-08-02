package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class eee extends fr2 implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient vsn d;
    public final transient int e;

    public eee(vsn vsnVar, int i) {
        this.d = vsnVar;
        this.e = i;
    }

    @Override // defpackage.f8
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // defpackage.f8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public cee a() {
        return this.d;
    }
}
