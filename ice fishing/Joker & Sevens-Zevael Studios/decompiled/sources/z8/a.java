package z8;

import java.util.List;
import java.util.Map;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {
    private final Map<String, String> idTranslations;
    private final List<g> operations;
    private final b result;
    private final Integer retryAfterSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public a(b bVar, Map<String, String> map, List<? extends g> list, Integer num) {
        j.e(bVar, "result");
        this.result = bVar;
        this.idTranslations = map;
        this.operations = list;
        this.retryAfterSeconds = num;
    }

    public final Map<String, String> getIdTranslations() {
        return this.idTranslations;
    }

    public final List<g> getOperations() {
        return this.operations;
    }

    public final b getResult() {
        return this.result;
    }

    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public /* synthetic */ a(b bVar, Map map, List list, Integer num, int i10, pc.f fVar) {
        this(bVar, (i10 & 2) != 0 ? null : map, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : num);
    }
}
