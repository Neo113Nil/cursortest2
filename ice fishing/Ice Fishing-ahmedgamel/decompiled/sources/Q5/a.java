package Q5;

import java.util.List;
import java.util.Map;
import q4.C4875b;

/* loaded from: classes2.dex */
public final class a {
    private final Map<String, String> identities;
    private final f properties;
    private final C4875b rywData;
    private final List<h> subscriptions;

    public a(Map<String, String> identities, f properties, List<h> subscriptions, C4875b c4875b) {
        kotlin.jvm.internal.h.e(identities, "identities");
        kotlin.jvm.internal.h.e(properties, "properties");
        kotlin.jvm.internal.h.e(subscriptions, "subscriptions");
        this.identities = identities;
        this.properties = properties;
        this.subscriptions = subscriptions;
        this.rywData = c4875b;
    }

    public final Map<String, String> getIdentities() {
        return this.identities;
    }

    public final f getProperties() {
        return this.properties;
    }

    public final C4875b getRywData() {
        return this.rywData;
    }

    public final List<h> getSubscriptions() {
        return this.subscriptions;
    }

    public /* synthetic */ a(Map map, f fVar, List list, C4875b c4875b, int i, kotlin.jvm.internal.e eVar) {
        this(map, fVar, list, (i & 8) != 0 ? null : c4875b);
    }
}
