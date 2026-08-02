package com.nimbusds.jose;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class JOSEObjectType implements Serializable {

    /* renamed from: type, reason: collision with root package name */
    public final String f1027type;

    public JOSEObjectType(String str) {
        this.f1027type = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof JOSEObjectType) {
            return this.f1027type.equalsIgnoreCase(((JOSEObjectType) obj).f1027type);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1027type.toLowerCase().hashCode();
    }

    public final String toString() {
        return this.f1027type;
    }
}
