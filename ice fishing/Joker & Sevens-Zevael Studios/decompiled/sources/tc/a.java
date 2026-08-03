package tc;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends sc.a {
    @Override // sc.e
    public final int b() {
        return ThreadLocalRandom.current().nextInt(0, 10);
    }

    @Override // sc.a
    public final Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        j.d(current, "current(...)");
        return current;
    }
}
