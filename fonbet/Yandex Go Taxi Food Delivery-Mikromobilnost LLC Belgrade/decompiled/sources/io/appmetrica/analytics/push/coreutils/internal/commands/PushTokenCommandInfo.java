package io.appmetrica.analytics.push.coreutils.internal.commands;

import android.os.Bundle;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0013J\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/commands/PushTokenCommandInfo;", "", "Landroid/os/Bundle;", "toBundle", "", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "b", "getProvider", "provider", "", "c", "Z", "getForce", "()Z", "force", "Companion", "Builder", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class PushTokenCommandInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final String token;

    /* renamed from: b, reason: from kotlin metadata */
    private final String provider;

    /* renamed from: c, reason: from kotlin metadata */
    private final boolean force;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\b¨\u0006\r"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/commands/PushTokenCommandInfo$Builder;", "", "", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "withToken", "", "force", "withForce", "Lio/appmetrica/analytics/push/coreutils/internal/commands/PushTokenCommandInfo;", "build", "provider", "<init>", "(Ljava/lang/String;)V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
    public static final class Builder {
        private final String a;
        private String b;
        private boolean c;

        public Builder(String str) {
            this.a = str;
        }

        public final PushTokenCommandInfo build() {
            return new PushTokenCommandInfo(this.b, this.a, this.c, null);
        }

        public final Builder withForce(boolean force) {
            this.c = force;
            return this;
        }

        public final Builder withToken(String token) {
            this.b = token;
            return this;
        }
    }

    private PushTokenCommandInfo(String str, String str2, boolean z) {
        this.token = str;
        this.provider = str2;
        this.force = z;
    }

    public final boolean getForce() {
        return this.force;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getToken() {
        return this.token;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("TOKEN", this.token);
        bundle.putString("PROVIDER_KEY", this.provider);
        bundle.putBoolean("FORCE", this.force);
        return bundle;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/commands/PushTokenCommandInfo$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lio/appmetrica/analytics/push/coreutils/internal/commands/PushTokenCommandInfo;", "fromBundle", "", "FORCE_DEFAULT", "Z", "", "FORCE_KEY", "Ljava/lang/String;", "PROVIDER_DEFAULT", "PROVIDER_KEY", "TOKEN_KEY", "core-utils_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PushTokenCommandInfo fromBundle(Bundle bundle) {
            return new PushTokenCommandInfo(bundle.getString("TOKEN"), bundle.getString("PROVIDER_KEY", ""), bundle.getBoolean("FORCE", false), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ PushTokenCommandInfo(String str, String str2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z);
    }
}
