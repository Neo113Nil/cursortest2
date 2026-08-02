package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class h7f extends f7f {
    public final q5f j;
    public final List k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7f(x3f x3fVar, q5f q5fVar) {
        super(x3fVar, q5fVar, (String) null, 12);
        x3fVar.getClass();
        this.j = q5fVar;
        List w0 = CollectionsKt.w0(q5fVar.a.keySet());
        this.k = w0;
        this.l = w0.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.f7f, defpackage.z6
    public final w4f I(String str) {
        str.getClass();
        return this.m % 2 == 0 ? x4f.c(str) : (w4f) uah.c(str, this.j);
    }

    @Override // defpackage.f7f, defpackage.z6
    public final String U(mhp mhpVar, int i) {
        mhpVar.getClass();
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.f7f, defpackage.z6
    public final w4f W() {
        return this.j;
    }

    @Override // defpackage.f7f, defpackage.z6, defpackage.tq5
    public final void b(mhp mhpVar) {
        mhpVar.getClass();
    }

    @Override // defpackage.f7f
    /* renamed from: b0 */
    public final q5f W() {
        return this.j;
    }

    @Override // defpackage.f7f, defpackage.tq5
    public final int w(mhp mhpVar) {
        mhpVar.getClass();
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
