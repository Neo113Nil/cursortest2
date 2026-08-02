package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ohn extends phn implements Serializable {
    public ohn(DefaultConstructorMarker defaultConstructorMarker) {
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return nhn.a;
    }

    @Override // defpackage.phn
    public final int a(int i) {
        return phn.b.a(i);
    }

    @Override // defpackage.phn
    public final boolean b() {
        throw null;
    }

    @Override // defpackage.phn
    public final int c() {
        return phn.b.c();
    }

    @Override // defpackage.phn
    public final int d(int i) {
        return phn.b.d(i);
    }

    @Override // defpackage.phn
    public final int e(int i, int i2) {
        return phn.b.e(i, i2);
    }

    @Override // defpackage.phn
    public final long f() {
        return phn.b.f();
    }

    @Override // defpackage.phn
    public final long g() {
        throw null;
    }

    public final float h() {
        return phn.b.h().nextFloat();
    }
}
