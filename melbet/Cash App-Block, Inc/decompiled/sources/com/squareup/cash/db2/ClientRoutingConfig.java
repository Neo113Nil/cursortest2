package com.squareup.cash.db2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ClientRoutingConfig {
    public final List client_route_rules;
    public final List deep_link_rules;

    public ClientRoutingConfig(List list, List list2) {
        this.client_route_rules = list;
        this.deep_link_rules = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientRoutingConfig)) {
            return false;
        }
        ClientRoutingConfig clientRoutingConfig = (ClientRoutingConfig) obj;
        return Intrinsics.areEqual(this.client_route_rules, clientRoutingConfig.client_route_rules) && Intrinsics.areEqual(this.deep_link_rules, clientRoutingConfig.deep_link_rules);
    }

    public final int hashCode() {
        List list = this.client_route_rules;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.deep_link_rules;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "ClientRoutingConfig(client_route_rules=" + this.client_route_rules + ", deep_link_rules=" + this.deep_link_rules + ")";
    }
}
