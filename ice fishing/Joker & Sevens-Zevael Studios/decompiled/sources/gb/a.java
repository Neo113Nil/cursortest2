package gb;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {
    private final Map<String, String> identities;
    private final f properties;
    private final List<h> subscriptions;

    public a(Map<String, String> map, f fVar, List<h> list) {
        pc.j.e(map, "identities");
        pc.j.e(fVar, "properties");
        pc.j.e(list, "subscriptions");
        this.identities = map;
        this.properties = fVar;
        this.subscriptions = list;
    }

    public final Map<String, String> getIdentities() {
        return this.identities;
    }

    public final f getProperties() {
        return this.properties;
    }

    public final List<h> getSubscriptions() {
        return this.subscriptions;
    }
}
