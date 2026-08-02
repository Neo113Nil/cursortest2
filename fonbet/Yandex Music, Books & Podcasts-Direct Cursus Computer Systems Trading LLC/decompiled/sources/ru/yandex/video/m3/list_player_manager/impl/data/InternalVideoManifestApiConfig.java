package ru.yandex.video.m3.list_player_manager.impl.data;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/data/InternalVideoManifestApiConfig;", "", "endpoint", "", "requestPath", "userAgent", "from", "vhBackendService", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEndpoint", "()Ljava/lang/String;", "getFrom", "getRequestPath", "getUserAgent", "getVhBackendService", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class InternalVideoManifestApiConfig {
    public static final int $stable = 0;

    @NotNull
    private final String endpoint;

    @NotNull
    private final String from;

    @NotNull
    private final String requestPath;
    private final String userAgent;
    private final String vhBackendService;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InternalVideoManifestApiConfig(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = "https://runtime.strm.yandex.ru"
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            java.lang.String r3 = "player/video/batch"
        Lc:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L12
            r4 = r0
        L12:
            r7 = r7 & 16
            if (r7 == 0) goto L1d
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L23
        L1d:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L23:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.video.m3.list_player_manager.impl.data.InternalVideoManifestApiConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ InternalVideoManifestApiConfig copy$default(InternalVideoManifestApiConfig internalVideoManifestApiConfig, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalVideoManifestApiConfig.endpoint;
        }
        if ((i & 2) != 0) {
            str2 = internalVideoManifestApiConfig.requestPath;
        }
        if ((i & 4) != 0) {
            str3 = internalVideoManifestApiConfig.userAgent;
        }
        if ((i & 8) != 0) {
            str4 = internalVideoManifestApiConfig.from;
        }
        if ((i & 16) != 0) {
            str5 = internalVideoManifestApiConfig.vhBackendService;
        }
        String str6 = str5;
        String str7 = str3;
        return internalVideoManifestApiConfig.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRequestPath() {
        return this.requestPath;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* renamed from: component5, reason: from getter */
    public final String getVhBackendService() {
        return this.vhBackendService;
    }

    @NotNull
    public final InternalVideoManifestApiConfig copy(@NotNull String endpoint, @NotNull String requestPath, String userAgent, @NotNull String from, String vhBackendService) {
        endpoint.getClass();
        requestPath.getClass();
        from.getClass();
        return new InternalVideoManifestApiConfig(endpoint, requestPath, userAgent, from, vhBackendService);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalVideoManifestApiConfig)) {
            return false;
        }
        InternalVideoManifestApiConfig internalVideoManifestApiConfig = (InternalVideoManifestApiConfig) other;
        return Intrinsics.d(this.endpoint, internalVideoManifestApiConfig.endpoint) && Intrinsics.d(this.requestPath, internalVideoManifestApiConfig.requestPath) && Intrinsics.d(this.userAgent, internalVideoManifestApiConfig.userAgent) && Intrinsics.d(this.from, internalVideoManifestApiConfig.from) && Intrinsics.d(this.vhBackendService, internalVideoManifestApiConfig.vhBackendService);
    }

    @NotNull
    public final String getEndpoint() {
        return this.endpoint;
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    public final String getRequestPath() {
        return this.requestPath;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getVhBackendService() {
        return this.vhBackendService;
    }

    public int hashCode() {
        int c = k5r.c(this.endpoint.hashCode() * 31, 31, this.requestPath);
        String str = this.userAgent;
        int c2 = k5r.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.from);
        String str2 = this.vhBackendService;
        return c2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("InternalVideoManifestApiConfig(endpoint=");
        sb.append(this.endpoint);
        sb.append(", requestPath=");
        sb.append(this.requestPath);
        sb.append(", userAgent=");
        sb.append(this.userAgent);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", vhBackendService=");
        return dfi.i(sb, this.vhBackendService, ')');
    }

    public InternalVideoManifestApiConfig(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, String str5) {
        dfi.s(str, str2, str4);
        this.endpoint = str;
        this.requestPath = str2;
        this.userAgent = str3;
        this.from = str4;
        this.vhBackendService = str5;
    }
}
