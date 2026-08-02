package ru.yandex.video.m3.player.tracking;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.qv10;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.tracking.LoadError;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001:\u0001<B\u0091\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u00002\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b,\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b-\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b\r\u00102R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b9\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b:\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b;\u00100R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b\u0015\u00102¨\u0006="}, d2 = {"Lru/yandex/video/m3/player/tracking/LoadError;", "", "", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, LaunchBrowserActivity.KEY_URI, "", "loadDurationMs", "bytesLoaded", "exceptionName", "exceptionMessage", "", "exceptionCode", "", "isEligibleForFallback", "", "eligibleForFallbackExc", "", "throwable", "exceptionCauseName", "exceptionCauseMessage", "exceptionCauseCode", "isEligibleForRetry", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/tracking/LoadError$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/tracking/LoadError;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getHost", "getUri", "J", "getLoadDurationMs", "()J", "getBytesLoaded", "getExceptionName", "getExceptionMessage", "Ljava/lang/Integer;", "getExceptionCode", "()Ljava/lang/Integer;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getEligibleForFallbackExc", "()Ljava/util/List;", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "getExceptionCauseName", "getExceptionCauseMessage", "getExceptionCauseCode", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadError {
    public static final int $stable = 8;
    private final long bytesLoaded;
    private final List<String> eligibleForFallbackExc;
    private final Integer exceptionCauseCode;
    private final String exceptionCauseMessage;
    private final String exceptionCauseName;
    private final Integer exceptionCode;
    private final String exceptionMessage;
    private final String exceptionName;
    private final String host;
    private final Boolean isEligibleForFallback;
    private final Boolean isEligibleForRetry;
    private final long loadDurationMs;
    private final Throwable throwable;
    private final String uri;

    private LoadError(String str, String str2, long j, long j2, String str3, String str4, Integer num, Boolean bool, List<String> list, Throwable th, String str5, String str6, Integer num2, Boolean bool2) {
        this.host = str;
        this.uri = str2;
        this.loadDurationMs = j;
        this.bytesLoaded = j2;
        this.exceptionName = str3;
        this.exceptionMessage = str4;
        this.exceptionCode = num;
        this.isEligibleForFallback = bool;
        this.eligibleForFallbackExc = list;
        this.throwable = th;
        this.exceptionCauseName = str5;
        this.exceptionCauseMessage = str6;
        this.exceptionCauseCode = num2;
        this.isEligibleForRetry = bool2;
    }

    public static /* synthetic */ LoadError copy$default(LoadError loadError, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.tracking.LoadError$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((LoadError.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(LoadError.Builder builder) {
                }
            };
        }
        return loadError.copy(tlsVar);
    }

    public final LoadError copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!LoadError.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        LoadError loadError = (LoadError) other;
        return this.loadDurationMs == loadError.loadDurationMs && this.bytesLoaded == loadError.bytesLoaded && jl40.l(this.exceptionCode, loadError.exceptionCode) && jl40.l(this.isEligibleForFallback, loadError.isEligibleForFallback) && jl40.l(this.exceptionCauseCode, loadError.exceptionCauseCode) && jl40.l(this.isEligibleForRetry, loadError.isEligibleForRetry) && jl40.l(this.host, loadError.host) && jl40.l(this.uri, loadError.uri) && jl40.l(this.exceptionName, loadError.exceptionName) && jl40.l(this.exceptionMessage, loadError.exceptionMessage) && jl40.l(this.eligibleForFallbackExc, loadError.eligibleForFallbackExc) && jl40.l(this.throwable, loadError.throwable) && jl40.l(this.exceptionCauseName, loadError.exceptionCauseName) && jl40.l(this.exceptionCauseMessage, loadError.exceptionCauseMessage);
    }

    public final long getBytesLoaded() {
        return this.bytesLoaded;
    }

    public final List<String> getEligibleForFallbackExc() {
        return this.eligibleForFallbackExc;
    }

    public final Integer getExceptionCauseCode() {
        return this.exceptionCauseCode;
    }

    public final String getExceptionCauseMessage() {
        return this.exceptionCauseMessage;
    }

    public final String getExceptionCauseName() {
        return this.exceptionCauseName;
    }

    public final Integer getExceptionCode() {
        return this.exceptionCode;
    }

    public final String getExceptionMessage() {
        return this.exceptionMessage;
    }

    public final String getExceptionName() {
        return this.exceptionName;
    }

    public final String getHost() {
        return this.host;
    }

    public final long getLoadDurationMs() {
        return this.loadDurationMs;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int c = qv10.c(Long.hashCode(this.loadDurationMs) * 31, 31, this.bytesLoaded);
        Integer num = this.exceptionCode;
        int intValue = (c + (num != null ? num.intValue() : 0)) * 31;
        Boolean bool = this.isEligibleForFallback;
        int hashCode = (intValue + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num2 = this.exceptionCauseCode;
        int intValue2 = (hashCode + (num2 != null ? num2.intValue() : 0)) * 31;
        Boolean bool2 = this.isEligibleForRetry;
        int b = unr0.b(unr0.b(unr0.b((intValue2 + (bool2 != null ? bool2.hashCode() : 0)) * 31, 31, this.host), 31, this.uri), 31, this.exceptionName);
        String str = this.exceptionMessage;
        int hashCode2 = (b + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.eligibleForFallbackExc;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Throwable th = this.throwable;
        int hashCode4 = (hashCode3 + (th != null ? th.hashCode() : 0)) * 31;
        String str2 = this.exceptionCauseName;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.exceptionCauseMessage;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: isEligibleForFallback, reason: from getter */
    public final Boolean getIsEligibleForFallback() {
        return this.isEligibleForFallback;
    }

    /* renamed from: isEligibleForRetry, reason: from getter */
    public final Boolean getIsEligibleForRetry() {
        return this.isEligibleForRetry;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadError(host='");
        sb.append(this.host);
        sb.append("', uri='");
        sb.append(this.uri);
        sb.append("', loadDurationMs=");
        sb.append(this.loadDurationMs);
        sb.append(", bytesLoaded=");
        sb.append(this.bytesLoaded);
        sb.append(", exceptionName='");
        sb.append(this.exceptionName);
        sb.append("', exceptionMessage=");
        sb.append(this.exceptionMessage);
        sb.append(", exceptionCode=");
        sb.append(this.exceptionCode);
        sb.append(", isEligibleForFallback=");
        sb.append(this.isEligibleForFallback);
        sb.append(", eligibleForFallbackExc=");
        sb.append(this.eligibleForFallbackExc);
        sb.append(", throwable=");
        sb.append(this.throwable);
        sb.append(", exceptionCauseName=");
        sb.append(this.exceptionCauseName);
        sb.append(", exceptionCauseMessage=");
        sb.append(this.exceptionCauseMessage);
        sb.append(", exceptionCauseCode=");
        sb.append(this.exceptionCauseCode);
        sb.append(", isEligibleForRetry=");
        return oo31.i(sb, this.isEligibleForRetry, ')');
    }

    public /* synthetic */ LoadError(String str, String str2, long j, long j2, String str3, String str4, Integer num, Boolean bool, List list, Throwable th, String str5, String str6, Integer num2, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, str3, str4, num, bool, list, th, str5, str6, num2, bool2);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\r\u0010B\u001a\u00020\u0003H\u0000¢\u0006\u0002\bCR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R\u001e\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b0\u00102\"\u0004\b3\u00104R\u001e\u00106\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0011\"\u0004\b9\u0010\u0013R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\"\"\u0004\bA\u0010$¨\u0006D"}, d2 = {"Lru/yandex/video/m3/player/tracking/LoadError$Builder;", "", "loadError", "Lru/yandex/video/m3/player/tracking/LoadError;", "(Lru/yandex/video/m3/player/tracking/LoadError;)V", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "", LaunchBrowserActivity.KEY_URI, "loadDurationMs", "", "bytesLoaded", "exceptionName", "exceptionMessage", "exceptionCode", "", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBytesLoaded", "()J", "setBytesLoaded", "(J)V", "eligibleForFallbackExc", "", "getEligibleForFallbackExc", "()Ljava/util/List;", "setEligibleForFallbackExc", "(Ljava/util/List;)V", "exceptionCauseCode", "getExceptionCauseCode", "()Ljava/lang/Integer;", "setExceptionCauseCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "exceptionCauseMessage", "getExceptionCauseMessage", "()Ljava/lang/String;", "setExceptionCauseMessage", "(Ljava/lang/String;)V", "exceptionCauseName", "getExceptionCauseName", "setExceptionCauseName", "getExceptionCode", "setExceptionCode", "getExceptionMessage", "setExceptionMessage", "getExceptionName", "setExceptionName", "getHost", "setHost", "isEligibleForFallback", "", "()Ljava/lang/Boolean;", "setEligibleForFallback", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isEligibleForRetry", "setEligibleForRetry", "getLoadDurationMs", "setLoadDurationMs", "throwable", "", "getThrowable", "()Ljava/lang/Throwable;", "setThrowable", "(Ljava/lang/Throwable;)V", "getUri", "setUri", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private long bytesLoaded;
        private List<String> eligibleForFallbackExc;
        private Integer exceptionCauseCode;
        private String exceptionCauseMessage;
        private String exceptionCauseName;
        private Integer exceptionCode;
        private String exceptionMessage;
        private String exceptionName;
        private String host;
        private Boolean isEligibleForFallback;
        private Boolean isEligibleForRetry;
        private long loadDurationMs;
        private Throwable throwable;
        private String uri;

        public Builder(LoadError loadError) {
            this(loadError.getHost(), loadError.getUri(), loadError.getLoadDurationMs(), loadError.getBytesLoaded(), loadError.getExceptionName(), loadError.getExceptionMessage(), loadError.getExceptionCode());
            this.isEligibleForFallback = loadError.getIsEligibleForFallback();
            this.eligibleForFallbackExc = loadError.getEligibleForFallbackExc();
            this.throwable = loadError.getThrowable();
            this.exceptionCauseName = loadError.getExceptionCauseName();
            this.exceptionCauseMessage = loadError.getExceptionCauseMessage();
            this.exceptionCauseCode = loadError.getExceptionCauseCode();
            this.isEligibleForRetry = loadError.getIsEligibleForRetry();
        }

        public final LoadError build$video_player_internalRelease() {
            return new LoadError(this.host, this.uri, this.loadDurationMs, this.bytesLoaded, this.exceptionName, this.exceptionMessage, this.exceptionCode, this.isEligibleForFallback, this.eligibleForFallbackExc, this.throwable, this.exceptionCauseName, this.exceptionCauseMessage, this.exceptionCauseCode, this.isEligibleForRetry, null);
        }

        public final long getBytesLoaded() {
            return this.bytesLoaded;
        }

        public final List<String> getEligibleForFallbackExc() {
            return this.eligibleForFallbackExc;
        }

        public final Integer getExceptionCauseCode() {
            return this.exceptionCauseCode;
        }

        public final String getExceptionCauseMessage() {
            return this.exceptionCauseMessage;
        }

        public final String getExceptionCauseName() {
            return this.exceptionCauseName;
        }

        public final Integer getExceptionCode() {
            return this.exceptionCode;
        }

        public final String getExceptionMessage() {
            return this.exceptionMessage;
        }

        public final String getExceptionName() {
            return this.exceptionName;
        }

        public final String getHost() {
            return this.host;
        }

        public final long getLoadDurationMs() {
            return this.loadDurationMs;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final String getUri() {
            return this.uri;
        }

        /* renamed from: isEligibleForFallback, reason: from getter */
        public final Boolean getIsEligibleForFallback() {
            return this.isEligibleForFallback;
        }

        /* renamed from: isEligibleForRetry, reason: from getter */
        public final Boolean getIsEligibleForRetry() {
            return this.isEligibleForRetry;
        }

        public final void setBytesLoaded(long j) {
            this.bytesLoaded = j;
        }

        public final void setEligibleForFallback(Boolean bool) {
            this.isEligibleForFallback = bool;
        }

        public final void setEligibleForFallbackExc(List<String> list) {
            this.eligibleForFallbackExc = list;
        }

        public final void setEligibleForRetry(Boolean bool) {
            this.isEligibleForRetry = bool;
        }

        public final void setExceptionCauseCode(Integer num) {
            this.exceptionCauseCode = num;
        }

        public final void setExceptionCauseMessage(String str) {
            this.exceptionCauseMessage = str;
        }

        public final void setExceptionCauseName(String str) {
            this.exceptionCauseName = str;
        }

        public final void setExceptionCode(Integer num) {
            this.exceptionCode = num;
        }

        public final void setExceptionMessage(String str) {
            this.exceptionMessage = str;
        }

        public final void setExceptionName(String str) {
            this.exceptionName = str;
        }

        public final void setHost(String str) {
            this.host = str;
        }

        public final void setLoadDurationMs(long j) {
            this.loadDurationMs = j;
        }

        public final void setThrowable(Throwable th) {
            this.throwable = th;
        }

        public final void setUri(String str) {
            this.uri = str;
        }

        public Builder(String str, String str2, long j, long j2, String str3, String str4, Integer num) {
            this.host = str;
            this.uri = str2;
            this.loadDurationMs = j;
            this.bytesLoaded = j2;
            this.exceptionName = str3;
            this.exceptionMessage = str4;
            this.exceptionCode = num;
        }
    }
}
