package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.AbstractC0748tp;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class StartupParamsItem {
    private final String a;
    private final StartupParamsItemStatus b;
    private final String c;

    public StartupParamsItem(String str, StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.a = str;
        this.b = startupParamsItemStatus;
        this.c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StartupParamsItem.class == obj.getClass()) {
            StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
            if (Objects.equals(this.a, startupParamsItem.a) && this.b == startupParamsItem.b && Objects.equals(this.c, startupParamsItem.c)) {
                return true;
            }
        }
        return false;
    }

    public String getErrorDetails() {
        return this.c;
    }

    public String getId() {
        return this.a;
    }

    public StartupParamsItemStatus getStatus() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartupParamsItem{id='");
        sb.append(this.a);
        sb.append("', status=");
        sb.append(this.b);
        sb.append(", errorDetails='");
        return AbstractC0748tp.a(sb, this.c, "'}");
    }
}
