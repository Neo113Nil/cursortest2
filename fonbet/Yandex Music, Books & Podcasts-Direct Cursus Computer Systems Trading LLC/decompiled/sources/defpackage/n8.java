package defpackage;

import java.util.Random;

/* loaded from: classes5.dex */
public abstract class n8 extends phn {
    @Override // defpackage.phn
    public final int a(int i) {
        return ((-i) >> 31) & (h().nextInt() >>> (32 - i));
    }

    @Override // defpackage.phn
    public final boolean b() {
        return h().nextBoolean();
    }

    @Override // defpackage.phn
    public final int c() {
        return h().nextInt();
    }

    @Override // defpackage.phn
    public final int d(int i) {
        return h().nextInt(i);
    }

    @Override // defpackage.phn
    public final long f() {
        return h().nextLong();
    }

    public abstract Random h();
}
