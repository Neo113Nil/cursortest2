package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fq0 extends ozMwhSAI {
    @Override // defpackage.ozMwhSAI
    public final Random OOA6hdeuvCS() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }

    @Override // defpackage.ts0
    public final int xqGvceK5x(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }
}
