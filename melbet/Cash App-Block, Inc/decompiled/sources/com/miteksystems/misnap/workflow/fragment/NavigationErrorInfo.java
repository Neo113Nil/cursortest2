package com.miteksystems.misnap.workflow.fragment;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class NavigationErrorInfo {
    public final Exception a;
    public final Class b;
    public final int c;

    public NavigationErrorInfo(Exception exc, Class cls, int i) {
        this.a = exc;
        this.b = cls;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationErrorInfo)) {
            return false;
        }
        NavigationErrorInfo navigationErrorInfo = (NavigationErrorInfo) obj;
        return this.a.equals(navigationErrorInfo.a) && this.b.equals(navigationErrorInfo.b) && this.c == navigationErrorInfo.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationErrorInfo(exception=");
        sb.append(this.a);
        sb.append(", fragmentClass=");
        sb.append(this.b);
        sb.append(", hashCode=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.c, ')');
    }
}
