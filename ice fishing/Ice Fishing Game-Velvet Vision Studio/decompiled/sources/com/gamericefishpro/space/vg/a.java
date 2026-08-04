package com.gamericefishpro.space.vg;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final Map<String, String> identities;
    private final f properties;
    private final List<h> subscriptions;

    public a(Map<String, String> identities, f properties, List<h> subscriptions) {
        Intrinsics.checkNotNullParameter(identities, "identities");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.identities = identities;
        this.properties = properties;
        this.subscriptions = subscriptions;
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
