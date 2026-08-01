package G1;

import D1.i;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends F1.a {
    @Override // F1.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "current(...)");
        return current;
    }
}
