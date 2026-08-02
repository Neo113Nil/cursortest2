package com.datadog.android.trace;

import com.google.mlkit.vision.text.zzd;

/* loaded from: classes4.dex */
public final class TraceConfiguration {
    public final zzd eventMapper;

    public TraceConfiguration(zzd zzdVar) {
        this.eventMapper = zzdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraceConfiguration) && this.eventMapper == ((TraceConfiguration) obj).eventMapper;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.eventMapper.hashCode() * 31);
    }

    public final String toString() {
        return "TraceConfiguration(customEndpointUrl=null, eventMapper=" + this.eventMapper + ", networkInfoEnabled=true)";
    }
}
