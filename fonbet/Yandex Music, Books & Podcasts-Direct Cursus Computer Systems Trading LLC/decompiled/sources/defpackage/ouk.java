package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes5.dex */
public final class ouk extends n8 {
    @Override // defpackage.phn
    public final int e(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // defpackage.phn
    public final long g() {
        return ThreadLocalRandom.current().nextLong(0L, Long.MAX_VALUE);
    }

    @Override // defpackage.n8
    public final Random h() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
