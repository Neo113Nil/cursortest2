package bo.app;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes3.dex */
public final class e4 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((id) obj).b), Long.valueOf(((id) obj2).b));
    }
}
