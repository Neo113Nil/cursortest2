package io.appmetrica.analytics.remotepermissions.impl;

import defpackage.vz1;
import java.util.Set;

/* loaded from: classes5.dex */
public final class a {
    public final Set a;

    public a(Set set) {
        this.a = set;
    }

    public final String toString() {
        return vz1.v(new StringBuilder("FeatureConfig(permittedPermissions="), this.a, ')');
    }
}
