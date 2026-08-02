package com.bugsnag.android;

/* loaded from: classes.dex */
public final class EndpointConfiguration {
    public final String notify;
    public final String sessions;

    public EndpointConfiguration(String str, String str2) {
        this.notify = str;
        this.sessions = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!EndpointConfiguration.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        EndpointConfiguration endpointConfiguration = (EndpointConfiguration) obj;
        return this.notify.equals(endpointConfiguration.notify) && this.sessions.equals(endpointConfiguration.sessions);
    }

    public final int hashCode() {
        return this.sessions.hashCode() + (this.notify.hashCode() * 31);
    }
}
