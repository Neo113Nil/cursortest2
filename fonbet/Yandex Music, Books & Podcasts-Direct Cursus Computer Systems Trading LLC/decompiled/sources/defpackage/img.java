package defpackage;

import com.connectsdk.discovery.provider.ssdp.Argument;
import com.connectsdk.service.command.ServiceCommand;

/* loaded from: classes3.dex */
public enum img {
    NO_STATE("no_state"),
    MISS_CACHE("miss_cache"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    ARGUMENT(Argument.TAG),
    CANCEL("cancel"),
    IO("io"),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCH("launch"),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK("network"),
    REQUIREMENTS("requirements"),
    /* JADX INFO: Fake field, exist only in values array */
    WRONG_STATE("wrong_state"),
    PLAYBACK("playback"),
    UNCATCHED("uncatched"),
    FEATURE_DISABLED("feature_disabled"),
    UN_AUTHORIZED("un_authorized"),
    TOKEN_INVALID("token_invalid"),
    BACKGROUND_RESTRICTIONS("background_restrictions"),
    SUBSCRIBE(ServiceCommand.TYPE_SUB),
    COLLECT("collect");

    public final String a;

    img(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
