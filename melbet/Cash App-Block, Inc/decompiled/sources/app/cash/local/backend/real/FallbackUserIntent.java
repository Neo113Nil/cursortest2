package app.cash.local.backend.real;

import com.squareup.protos.cash.local.client.v1.LocalUserIntent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FallbackUserIntent {
    public final LocalUserIntent userIntent;
    public final String userIntentLinkContext;

    public FallbackUserIntent(LocalUserIntent localUserIntent, String str) {
        str.getClass();
        this.userIntent = localUserIntent;
        this.userIntentLinkContext = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FallbackUserIntent)) {
            return false;
        }
        FallbackUserIntent fallbackUserIntent = (FallbackUserIntent) obj;
        return Intrinsics.areEqual(this.userIntent, fallbackUserIntent.userIntent) && Intrinsics.areEqual(this.userIntentLinkContext, fallbackUserIntent.userIntentLinkContext);
    }

    public final int hashCode() {
        LocalUserIntent localUserIntent = this.userIntent;
        return this.userIntentLinkContext.hashCode() + ((localUserIntent == null ? 0 : localUserIntent.hashCode()) * 31);
    }

    public final String toString() {
        return "FallbackUserIntent(userIntent=" + this.userIntent + ", userIntentLinkContext=" + this.userIntentLinkContext + ")";
    }
}
