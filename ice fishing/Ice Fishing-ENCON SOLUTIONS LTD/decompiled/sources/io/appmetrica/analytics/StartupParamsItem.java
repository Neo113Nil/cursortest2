package io.appmetrica.analytics;

import C1.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class StartupParamsItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f3509a;

    /* renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f3510b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3511c;

    public StartupParamsItem(String str, StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f3509a = str;
        this.f3510b = startupParamsItemStatus;
        this.f3511c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StartupParamsItem.class != obj.getClass()) {
            return false;
        }
        StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
        return Objects.equals(this.f3509a, startupParamsItem.f3509a) && this.f3510b == startupParamsItem.f3510b && Objects.equals(this.f3511c, startupParamsItem.f3511c);
    }

    public String getErrorDetails() {
        return this.f3511c;
    }

    public String getId() {
        return this.f3509a;
    }

    public StartupParamsItemStatus getStatus() {
        return this.f3510b;
    }

    public int hashCode() {
        return Objects.hash(this.f3509a, this.f3510b, this.f3511c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartupParamsItem{id='");
        sb.append(this.f3509a);
        sb.append("', status=");
        sb.append(this.f3510b);
        sb.append(", errorDetails='");
        return a.k(sb, this.f3511c, "'}");
    }
}
