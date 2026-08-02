package defpackage;

import timber.log.Timber;

/* loaded from: classes6.dex */
public final class bl7 implements ta7 {
    public final hp3 a;

    public bl7(hp3 hp3Var) {
        this.a = hp3Var;
    }

    @Override // defpackage.ta7
    public final void a(nb7 nb7Var) {
        Timber.INSTANCE.tag("CACHE_DEBUG").w("Try put to cache " + nb7Var.a, new Object[0]);
        this.a.a(nb7Var);
    }

    @Override // defpackage.ta7
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.ta7
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.a.write(bArr, i, i2);
    }
}
