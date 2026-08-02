package defpackage;

import java.util.Comparator;

/* loaded from: classes15.dex */
public final class vi7 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((vh7) obj2).c.getStartedAt()).compareTo(Long.valueOf(((vh7) obj).c.getStartedAt()));
    }
}
