package defpackage;

import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public interface q2v0 {
    void b(byte[] bArr, int i, int i2, p2v0 p2v0Var, c9e c9eVar);

    default e2v0 d(int i, int i2, byte[] bArr) {
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        b(bArr, 0, i2, p2v0.c, new n2v0(0, aVar));
        return new udf(aVar.g());
    }

    int f();

    default void reset() {
    }
}
