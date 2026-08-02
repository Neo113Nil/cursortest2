package io.appmetrica.analytics.push.coreutils.internal.commands;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0002\u000b\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/commands/SystemInfoCommandInfo;", "", "Landroid/os/Bundle;", "toBundle", "", "a", "Ljava/lang/Long;", "getStatusChangeTime", "()Ljava/lang/Long;", "statusChangeTime", "Companion", "Builder", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes9.dex */
public final class SystemInfoCommandInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final Long statusChangeTime;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/commands/SystemInfoCommandInfo$Builder;", "", "", "statusChangeTime", "withStatusChangeTime", "(Ljava/lang/Long;)Lio/appmetrica/analytics/push/coreutils/internal/commands/SystemInfoCommandInfo$Builder;", "Lio/appmetrica/analytics/push/coreutils/internal/commands/SystemInfoCommandInfo;", "build", "<init>", "()V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
    public static final class Builder {
        private Long a;

        public final SystemInfoCommandInfo build() {
            return new SystemInfoCommandInfo(this.a, null);
        }

        public final Builder withStatusChangeTime(Long statusChangeTime) {
            this.a = statusChangeTime;
            return this;
        }
    }

    private SystemInfoCommandInfo(Long l) {
        this.statusChangeTime = l;
    }

    public final Long getStatusChangeTime() {
        return this.statusChangeTime;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        Long l = this.statusChangeTime;
        if (l != null) {
            bundle.putLong("STATUS_CHANGE_TIME_KEY", l.longValue());
        }
        return bundle;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/commands/SystemInfoCommandInfo$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lio/appmetrica/analytics/push/coreutils/internal/commands/SystemInfoCommandInfo;", "fromBundle", "", "STATUS_CHANGE_TIME_KEY", "Ljava/lang/String;", "core-utils_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SystemInfoCommandInfo fromBundle(Bundle bundle) {
            return new SystemInfoCommandInfo(bundle.containsKey("STATUS_CHANGE_TIME_KEY") ? Long.valueOf(bundle.getLong("STATUS_CHANGE_TIME_KEY")) : null, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SystemInfoCommandInfo(Long l, DefaultConstructorMarker defaultConstructorMarker) {
        this(l);
    }
}
