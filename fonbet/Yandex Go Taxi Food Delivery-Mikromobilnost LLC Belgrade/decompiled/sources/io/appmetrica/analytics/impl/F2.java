package io.appmetrica.analytics.impl;

import defpackage.unr0;
import java.util.List;

/* loaded from: classes9.dex */
public final class F2 {
    public final List a;
    public final C0495l3 b;
    public final List c;

    public F2(List list, C0495l3 c0495l3, List list2) {
        this.a = list;
        this.b = c0495l3;
        this.c = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppPermissionsState{mPermissionStateList=");
        sb.append(this.a);
        sb.append(", mBackgroundRestrictionsState=");
        sb.append(this.b);
        sb.append(", mAvailableProviders=");
        return unr0.t(sb, this.c, '}');
    }
}
