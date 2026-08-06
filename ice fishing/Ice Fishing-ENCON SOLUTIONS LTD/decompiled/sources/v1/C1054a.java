package v1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.i;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1054a extends u1.a {
    @Override // u1.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "current(...)");
        return current;
    }
}
