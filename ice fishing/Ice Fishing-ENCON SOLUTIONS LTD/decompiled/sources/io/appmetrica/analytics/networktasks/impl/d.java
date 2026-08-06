package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f7461a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7462b;

    public d(NetworkTask networkTask) {
        this.f7461a = networkTask;
        this.f7462b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f7462b.equals(((d) obj).f7462b);
    }

    public final int hashCode() {
        return this.f7462b.hashCode();
    }
}
