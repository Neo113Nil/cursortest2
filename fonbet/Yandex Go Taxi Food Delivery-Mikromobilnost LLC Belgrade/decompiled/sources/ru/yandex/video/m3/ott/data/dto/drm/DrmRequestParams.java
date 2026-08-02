package ru.yandex.video.m3.ott.data.dto.drm;

import defpackage.jl40;
import defpackage.oo31;
import defpackage.qv10;
import defpackage.tls;
import defpackage.unr0;
import defpackage.ysq0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b-\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002KJBÓ\u0001\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010!\u001a\u00020\u00002\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b3\u0010)R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b7\u00106R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b8\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b9\u0010,R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b:\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b>\u0010)R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b?\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\bC\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\bD\u0010,R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\bE\u0010,R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\bF\u0010,R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\bG\u0010)R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\bH\u0010)R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010@\u001a\u0004\bI\u0010B¨\u0006L"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "", "", "productId", "", "sessionTimestamp", "", "sessionId", "serviceName", "contentId", "contentTypeId", "expirationTimestamp", "monetizationModel", "puid", X509CertImpl.SIGNATURE, "", "verificationRequired", "version", "watchSessionId", "persistent", "strictPlaybackTtl", "rentalTtl", "storageTtl", "playbackTtl", "uuid", "uuidSignature", "internalStream", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Long;", "getProductId", "()Ljava/lang/Long;", "Ljava/lang/Integer;", "getSessionTimestamp", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getSessionId", "getServiceName", "getContentId", "J", "getContentTypeId", "()J", "getExpirationTimestamp", "getMonetizationModel", "getPuid", "getSignature", "Z", "getVerificationRequired", "()Z", "getVersion", "getWatchSessionId", "Ljava/lang/Boolean;", "getPersistent", "()Ljava/lang/Boolean;", "getStrictPlaybackTtl", "getRentalTtl", "getStorageTtl", "getPlaybackTtl", "getUuid", "getUuidSignature", "getInternalStream", "Companion", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrmRequestParams {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DrmRequestParams DUMMY = new DrmRequestParams(null, null, null, null, null, 0, 0, "", null, "", false, "", "", null, null, null, null, null, null, null, Boolean.FALSE);
    private final String contentId;
    private final long contentTypeId;
    private final long expirationTimestamp;

    @ysq0("internal")
    private final Boolean internalStream;
    private final String monetizationModel;
    private final Boolean persistent;
    private final Long playbackTtl;
    private final Long productId;
    private final Long puid;
    private final Long rentalTtl;
    private final String serviceName;
    private final String sessionId;
    private final Integer sessionTimestamp;
    private final String signature;
    private final Long storageTtl;
    private final Long strictPlaybackTtl;
    private final String uuid;
    private final String uuidSignature;
    private final boolean verificationRequired;
    private final String version;
    private final String watchSessionId;

    public /* synthetic */ DrmRequestParams(Long l, Integer num, String str, String str2, String str3, long j, long j2, String str4, Long l2, String str5, boolean z, String str6, String str7, Boolean bool, Long l3, Long l4, Long l5, Long l6, String str8, String str9, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, num, str, str2, str3, j, j2, str4, l2, str5, z, str6, str7, bool, l3, l4, l5, l6, (i & 262144) != 0 ? "" : str8, (i & 524288) != 0 ? "" : str9, (i & 1048576) != 0 ? Boolean.FALSE : bool2);
    }

    public static /* synthetic */ DrmRequestParams copy$default(DrmRequestParams drmRequestParams, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DrmRequestParams.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DrmRequestParams.Builder builder) {
                }
            };
        }
        return drmRequestParams.copy(tlsVar);
    }

    public final DrmRequestParams copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DrmRequestParams.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DrmRequestParams drmRequestParams = (DrmRequestParams) other;
        return jl40.l(this.productId, drmRequestParams.productId) && jl40.l(this.sessionTimestamp, drmRequestParams.sessionTimestamp) && this.contentTypeId == drmRequestParams.contentTypeId && this.expirationTimestamp == drmRequestParams.expirationTimestamp && jl40.l(this.puid, drmRequestParams.puid) && this.verificationRequired == drmRequestParams.verificationRequired && jl40.l(this.persistent, drmRequestParams.persistent) && jl40.l(this.strictPlaybackTtl, drmRequestParams.strictPlaybackTtl) && jl40.l(this.rentalTtl, drmRequestParams.rentalTtl) && jl40.l(this.storageTtl, drmRequestParams.storageTtl) && jl40.l(this.playbackTtl, drmRequestParams.playbackTtl) && jl40.l(this.internalStream, drmRequestParams.internalStream) && jl40.l(this.sessionId, drmRequestParams.sessionId) && jl40.l(this.serviceName, drmRequestParams.serviceName) && jl40.l(this.contentId, drmRequestParams.contentId) && jl40.l(this.monetizationModel, drmRequestParams.monetizationModel) && jl40.l(this.signature, drmRequestParams.signature) && jl40.l(this.version, drmRequestParams.version) && jl40.l(this.watchSessionId, drmRequestParams.watchSessionId) && jl40.l(this.uuid, drmRequestParams.uuid) && jl40.l(this.uuidSignature, drmRequestParams.uuidSignature);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final long getContentTypeId() {
        return this.contentTypeId;
    }

    public final long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    public final Boolean getInternalStream() {
        return this.internalStream;
    }

    public final String getMonetizationModel() {
        return this.monetizationModel;
    }

    public final Boolean getPersistent() {
        return this.persistent;
    }

    public final Long getPlaybackTtl() {
        return this.playbackTtl;
    }

    public final Long getProductId() {
        return this.productId;
    }

    public final Long getPuid() {
        return this.puid;
    }

    public final Long getRentalTtl() {
        return this.rentalTtl;
    }

    public final String getServiceName() {
        return this.serviceName;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Integer getSessionTimestamp() {
        return this.sessionTimestamp;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final Long getStorageTtl() {
        return this.storageTtl;
    }

    public final Long getStrictPlaybackTtl() {
        return this.strictPlaybackTtl;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getUuidSignature() {
        return this.uuidSignature;
    }

    public final boolean getVerificationRequired() {
        return this.verificationRequired;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getWatchSessionId() {
        return this.watchSessionId;
    }

    public int hashCode() {
        Long l = this.productId;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Integer num = this.sessionTimestamp;
        int c = qv10.c(qv10.c((hashCode + (num != null ? num.intValue() : 0)) * 31, 31, this.contentTypeId), 31, this.expirationTimestamp);
        Long l2 = this.puid;
        int e = unr0.e((c + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.verificationRequired);
        Boolean bool = this.persistent;
        int hashCode2 = (e + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l3 = this.strictPlaybackTtl;
        int hashCode3 = (hashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.rentalTtl;
        int hashCode4 = (hashCode3 + (l4 != null ? l4.hashCode() : 0)) * 31;
        Long l5 = this.storageTtl;
        int hashCode5 = (hashCode4 + (l5 != null ? l5.hashCode() : 0)) * 31;
        Long l6 = this.playbackTtl;
        int hashCode6 = (hashCode5 + (l6 != null ? l6.hashCode() : 0)) * 31;
        Boolean bool2 = this.internalStream;
        int hashCode7 = (hashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str = this.sessionId;
        int hashCode8 = (hashCode7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.serviceName;
        int hashCode9 = (hashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.contentId;
        int b = unr0.b(unr0.b(unr0.b(unr0.b((hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.monetizationModel), 31, this.signature), 31, this.version), 31, this.watchSessionId);
        String str4 = this.uuid;
        int hashCode10 = (b + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.uuidSignature;
        return hashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DrmRequestParams(productId=");
        sb.append(this.productId);
        sb.append(", sessionTimestamp=");
        sb.append(this.sessionTimestamp);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", serviceName=");
        sb.append(this.serviceName);
        sb.append(", contentId=");
        sb.append(this.contentId);
        sb.append(", contentTypeId=");
        sb.append(this.contentTypeId);
        sb.append(", expirationTimestamp=");
        sb.append(this.expirationTimestamp);
        sb.append(", monetizationModel='");
        sb.append(this.monetizationModel);
        sb.append("', puid=");
        sb.append(this.puid);
        sb.append(", signature='");
        sb.append(this.signature);
        sb.append("', verificationRequired=");
        sb.append(this.verificationRequired);
        sb.append(", version='");
        sb.append(this.version);
        sb.append("', watchSessionId='");
        sb.append(this.watchSessionId);
        sb.append("', persistent=");
        sb.append(this.persistent);
        sb.append(", strictPlaybackTtl=");
        sb.append(this.strictPlaybackTtl);
        sb.append(", rentalTtl=");
        sb.append(this.rentalTtl);
        sb.append(", storageTtl=");
        sb.append(this.storageTtl);
        sb.append(", playbackTtl=");
        sb.append(this.playbackTtl);
        sb.append(", uuid=");
        sb.append(this.uuid);
        sb.append(", uuidSignature=");
        sb.append(this.uuidSignature);
        sb.append(", internalStream=");
        return oo31.i(sb, this.internalStream, ')');
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams$Companion;", "", "()V", "DUMMY", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "getDUMMY$video_player_internalRelease", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DrmRequestParams getDUMMY$video_player_internalRelease() {
            return DrmRequestParams.DUMMY;
        }

        private Companion() {
        }
    }

    private DrmRequestParams(Long l, Integer num, String str, String str2, String str3, long j, long j2, String str4, Long l2, String str5, boolean z, String str6, String str7, Boolean bool, Long l3, Long l4, Long l5, Long l6, String str8, String str9, Boolean bool2) {
        this.productId = l;
        this.sessionTimestamp = num;
        this.sessionId = str;
        this.serviceName = str2;
        this.contentId = str3;
        this.contentTypeId = j;
        this.expirationTimestamp = j2;
        this.monetizationModel = str4;
        this.puid = l2;
        this.signature = str5;
        this.verificationRequired = z;
        this.version = str6;
        this.watchSessionId = str7;
        this.persistent = bool;
        this.strictPlaybackTtl = l3;
        this.rentalTtl = l4;
        this.storageTtl = l5;
        this.playbackTtl = l6;
        this.uuid = str8;
        this.uuidSignature = str9;
        this.internalStream = bool2;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\bG\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u00ad\u0001\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001bJ\r\u0010X\u001a\u00020\u0003H\u0000¢\u0006\u0002\bYR\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001e\u0010&\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b7\u00101\"\u0004\b8\u00103R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b9\u00101\"\u0004\b:\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001d\"\u0004\b<\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001d\"\u0004\b>\u0010\u001fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010\u0011\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001d\"\u0004\bE\u0010\u001fR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\bF\u00101\"\u0004\bG\u00103R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\bH\u00101\"\u0004\bI\u00103R\u001c\u0010J\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001d\"\u0004\bL\u0010\u001fR\u001c\u0010M\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u001d\"\u0004\bO\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u001d\"\u0004\bU\u0010\u001fR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u001d\"\u0004\bW\u0010\u001f¨\u0006Z"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams$Builder;", "", "params", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;)V", "productId", "", "sessionTimestamp", "", "sessionId", "", "serviceName", "contentId", "contentTypeId", "expirationTimestamp", "monetizationModel", "puid", X509CertImpl.SIGNATURE, "verificationRequired", "", "version", "watchSessionId", "persistent", "strictPlaybackTtl", "rentalTtl", "storageTtl", "playbackTtl", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getContentId", "()Ljava/lang/String;", "setContentId", "(Ljava/lang/String;)V", "getContentTypeId", "()J", "setContentTypeId", "(J)V", "getExpirationTimestamp", "setExpirationTimestamp", "internalStream", "getInternalStream", "()Ljava/lang/Boolean;", "setInternalStream", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMonetizationModel", "setMonetizationModel", "getPersistent", "setPersistent", "getPlaybackTtl", "()Ljava/lang/Long;", "setPlaybackTtl", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getProductId", "setProductId", "getPuid", "setPuid", "getRentalTtl", "setRentalTtl", "getServiceName", "setServiceName", "getSessionId", "setSessionId", "getSessionTimestamp", "()Ljava/lang/Integer;", "setSessionTimestamp", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSignature", "setSignature", "getStorageTtl", "setStorageTtl", "getStrictPlaybackTtl", "setStrictPlaybackTtl", "uuid", "getUuid", "setUuid", "uuidSignature", "getUuidSignature", "setUuidSignature", "getVerificationRequired", "()Z", "setVerificationRequired", "(Z)V", "getVersion", "setVersion", "getWatchSessionId", "setWatchSessionId", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String contentId;
        private long contentTypeId;
        private long expirationTimestamp;
        private Boolean internalStream;
        private String monetizationModel;
        private Boolean persistent;
        private Long playbackTtl;
        private Long productId;
        private Long puid;
        private Long rentalTtl;
        private String serviceName;
        private String sessionId;
        private Integer sessionTimestamp;
        private String signature;
        private Long storageTtl;
        private Long strictPlaybackTtl;
        private String uuid;
        private String uuidSignature;
        private boolean verificationRequired;
        private String version;
        private String watchSessionId;

        public Builder(DrmRequestParams drmRequestParams) {
            this(drmRequestParams.getProductId(), drmRequestParams.getSessionTimestamp(), drmRequestParams.getSessionId(), drmRequestParams.getServiceName(), drmRequestParams.getContentId(), drmRequestParams.getContentTypeId(), drmRequestParams.getExpirationTimestamp(), drmRequestParams.getMonetizationModel(), drmRequestParams.getPuid(), drmRequestParams.getSignature(), drmRequestParams.getVerificationRequired(), drmRequestParams.getVersion(), drmRequestParams.getWatchSessionId(), drmRequestParams.getPersistent(), drmRequestParams.getStrictPlaybackTtl(), drmRequestParams.getRentalTtl(), drmRequestParams.getStorageTtl(), drmRequestParams.getPlaybackTtl());
            this.uuid = drmRequestParams.getUuid();
            this.uuidSignature = drmRequestParams.getUuidSignature();
            this.internalStream = drmRequestParams.getInternalStream();
        }

        public final DrmRequestParams build$video_player_internalRelease() {
            return new DrmRequestParams(this.productId, this.sessionTimestamp, this.sessionId, this.serviceName, this.contentId, this.contentTypeId, this.expirationTimestamp, this.monetizationModel, this.puid, this.signature, this.verificationRequired, this.version, this.watchSessionId, this.persistent, this.strictPlaybackTtl, this.rentalTtl, this.storageTtl, this.playbackTtl, this.uuid, this.uuidSignature, this.internalStream, null);
        }

        public final String getContentId() {
            return this.contentId;
        }

        public final long getContentTypeId() {
            return this.contentTypeId;
        }

        public final long getExpirationTimestamp() {
            return this.expirationTimestamp;
        }

        public final Boolean getInternalStream() {
            return this.internalStream;
        }

        public final String getMonetizationModel() {
            return this.monetizationModel;
        }

        public final Boolean getPersistent() {
            return this.persistent;
        }

        public final Long getPlaybackTtl() {
            return this.playbackTtl;
        }

        public final Long getProductId() {
            return this.productId;
        }

        public final Long getPuid() {
            return this.puid;
        }

        public final Long getRentalTtl() {
            return this.rentalTtl;
        }

        public final String getServiceName() {
            return this.serviceName;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final Integer getSessionTimestamp() {
            return this.sessionTimestamp;
        }

        public final String getSignature() {
            return this.signature;
        }

        public final Long getStorageTtl() {
            return this.storageTtl;
        }

        public final Long getStrictPlaybackTtl() {
            return this.strictPlaybackTtl;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final String getUuidSignature() {
            return this.uuidSignature;
        }

        public final boolean getVerificationRequired() {
            return this.verificationRequired;
        }

        public final String getVersion() {
            return this.version;
        }

        public final String getWatchSessionId() {
            return this.watchSessionId;
        }

        public final void setContentId(String str) {
            this.contentId = str;
        }

        public final void setContentTypeId(long j) {
            this.contentTypeId = j;
        }

        public final void setExpirationTimestamp(long j) {
            this.expirationTimestamp = j;
        }

        public final void setInternalStream(Boolean bool) {
            this.internalStream = bool;
        }

        public final void setMonetizationModel(String str) {
            this.monetizationModel = str;
        }

        public final void setPersistent(Boolean bool) {
            this.persistent = bool;
        }

        public final void setPlaybackTtl(Long l) {
            this.playbackTtl = l;
        }

        public final void setProductId(Long l) {
            this.productId = l;
        }

        public final void setPuid(Long l) {
            this.puid = l;
        }

        public final void setRentalTtl(Long l) {
            this.rentalTtl = l;
        }

        public final void setServiceName(String str) {
            this.serviceName = str;
        }

        public final void setSessionId(String str) {
            this.sessionId = str;
        }

        public final void setSessionTimestamp(Integer num) {
            this.sessionTimestamp = num;
        }

        public final void setSignature(String str) {
            this.signature = str;
        }

        public final void setStorageTtl(Long l) {
            this.storageTtl = l;
        }

        public final void setStrictPlaybackTtl(Long l) {
            this.strictPlaybackTtl = l;
        }

        public final void setUuid(String str) {
            this.uuid = str;
        }

        public final void setUuidSignature(String str) {
            this.uuidSignature = str;
        }

        public final void setVerificationRequired(boolean z) {
            this.verificationRequired = z;
        }

        public final void setVersion(String str) {
            this.version = str;
        }

        public final void setWatchSessionId(String str) {
            this.watchSessionId = str;
        }

        public Builder(Long l, Integer num, String str, String str2, String str3, long j, long j2, String str4, Long l2, String str5, boolean z, String str6, String str7, Boolean bool, Long l3, Long l4, Long l5, Long l6) {
            this.productId = l;
            this.sessionTimestamp = num;
            this.sessionId = str;
            this.serviceName = str2;
            this.contentId = str3;
            this.contentTypeId = j;
            this.expirationTimestamp = j2;
            this.monetizationModel = str4;
            this.puid = l2;
            this.signature = str5;
            this.verificationRequired = z;
            this.version = str6;
            this.watchSessionId = str7;
            this.persistent = bool;
            this.strictPlaybackTtl = l3;
            this.rentalTtl = l4;
            this.storageTtl = l5;
            this.playbackTtl = l6;
            this.uuid = "";
            this.uuidSignature = "";
            this.internalStream = Boolean.FALSE;
        }
    }

    public /* synthetic */ DrmRequestParams(Long l, Integer num, String str, String str2, String str3, long j, long j2, String str4, Long l2, String str5, boolean z, String str6, String str7, Boolean bool, Long l3, Long l4, Long l5, Long l6, String str8, String str9, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, num, str, str2, str3, j, j2, str4, l2, str5, z, str6, str7, bool, l3, l4, l5, l6, str8, str9, bool2);
    }
}
