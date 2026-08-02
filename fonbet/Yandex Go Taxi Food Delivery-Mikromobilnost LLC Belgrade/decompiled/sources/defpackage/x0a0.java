package defpackage;

import java.math.BigDecimal;
import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes13.dex */
public final class x0a0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uvc.b((BigDecimal) ((Pair) obj).c(), (BigDecimal) ((Pair) obj2).c());
    }
}
