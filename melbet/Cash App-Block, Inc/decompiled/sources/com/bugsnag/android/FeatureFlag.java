package com.bugsnag.android;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes.dex */
public final class FeatureFlag implements Map.Entry {
    public final String name;
    public final String variant;

    public FeatureFlag(String str, String str2) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("FeatureFlags cannot have null name");
            throw null;
        }
        this.name = str;
        this.variant = str2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.name.equals(entry.getKey()) && ((str = this.variant) != null ? str.equals(entry.getValue()) : entry.getValue() == null);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.name;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.variant;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode = this.name.hashCode();
        String str = this.variant;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("FeatureFlag is immutable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureFlag{name='");
        sb.append(this.name);
        sb.append("', variant='");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.variant, "'}");
    }
}
