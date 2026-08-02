package io.appmetrica.analytics.impl;

import defpackage.eta;
import java.util.List;

/* loaded from: classes5.dex */
public final class F2 {
    public final List a;
    public final C0421l3 b;
    public final List c;

    public F2(List list, C0421l3 c0421l3, List list2) {
        this.a = list;
        this.b = c0421l3;
        this.c = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppPermissionsState{mPermissionStateList=");
        sb.append(this.a);
        sb.append(", mBackgroundRestrictionsState=");
        sb.append(this.b);
        sb.append(", mAvailableProviders=");
        return eta.h(sb, this.c, '}');
    }
}
