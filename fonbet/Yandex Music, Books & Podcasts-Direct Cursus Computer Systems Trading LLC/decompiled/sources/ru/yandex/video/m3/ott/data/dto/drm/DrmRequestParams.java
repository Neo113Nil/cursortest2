package ru.yandex.video.m3.ott.data.dto.drm;

import androidx.annotation.Keep;
import com.appsflyer.internal.k;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.jx9;
import defpackage.k5r;
import defpackage.tlm;
import defpackage.wqa;
import defpackage.xqa;
import io.appmetrica.analytics.BuildConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b-\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002\u001eKBÓ\u0001\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010!\u001a\u00020\u00002\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b3\u0010)R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b7\u00106R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b8\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b9\u0010,R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b:\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b>\u0010)R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b?\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\bC\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\bD\u0010,R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\bE\u0010,R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\bF\u0010,R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\bG\u0010)R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\bH\u0010)R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010@\u001a\u0004\bI\u0010B¨\u0006L"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "", "", "productId", "", "sessionTimestamp", "", "sessionId", "serviceName", "contentId", "contentTypeId", "expirationTimestamp", "monetizationModel", "puid", "signature", "", "verificationRequired", "version", "watchSessionId", "persistent", "strictPlaybackTtl", "rentalTtl", "storageTtl", "playbackTtl", "uuid", "uuidSignature", "internalStream", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lkotlin/Function1;", "Lwqa;", "", "builderAction", "copy", "(Lkotlin/jvm/functions/Function1;)Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Long;", "getProductId", "()Ljava/lang/Long;", "Ljava/lang/Integer;", "getSessionTimestamp", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getSessionId", "getServiceName", "getContentId", "J", "getContentTypeId", "()J", "getExpirationTimestamp", "getMonetizationModel", "getPuid", "getSignature", "Z", "getVerificationRequired", "()Z", "getVersion", "getWatchSessionId", "Ljava/lang/Boolean;", "getPersistent", "()Ljava/lang/Boolean;", "getStrictPlaybackTtl", "getRentalTtl", "getStorageTtl", "getPlaybackTtl", "getUuid", "getUuidSignature", "getInternalStream", "Companion", "xqa", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class DrmRequestParams {
    public static final int $stable = 0;

    @NotNull
    public static final xqa Companion = new xqa();

    @NotNull
    private static final DrmRequestParams DUMMY = new DrmRequestParams(null, null, null, null, null, 0, 0, "", null, "", false, "", "", null, null, null, null, null, null, null, Boolean.FALSE);
    private final String contentId;
    private final long contentTypeId;
    private final long expirationTimestamp;

    @SerializedName(BuildConfig.SDK_BUILD_FLAVOR)
    private final Boolean internalStream;

    @NotNull
    private final String monetizationModel;
    private final Boolean persistent;
    private final Long playbackTtl;
    private final Long productId;
    private final Long puid;
    private final Long rentalTtl;
    private final String serviceName;
    private final String sessionId;
    private final Integer sessionTimestamp;

    @NotNull
    private final String signature;
    private final Long storageTtl;
    private final Long strictPlaybackTtl;
    private final String uuid;
    private final String uuidSignature;
    private final boolean verificationRequired;

    @NotNull
    private final String version;

    @NotNull
    private final String watchSessionId;

    public /* synthetic */ DrmRequestParams(Long l, Integer num, String str, String str2, String str3, long j, long j2, String str4, Long l2, String str5, boolean z, String str6, String str7, Boolean bool, Long l3, Long l4, Long l5, Long l6, String str8, String str9, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, num, str, str2, str3, j, j2, str4, l2, str5, z, str6, str7, bool, l3, l4, l5, l6, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? "" : str8, (i & 524288) != 0 ? "" : str9, (i & 1048576) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrmRequestParams copy$default(DrmRequestParams drmRequestParams, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = jx9.I;
        }
        return drmRequestParams.copy(function1);
    }

    @NotNull
    public final DrmRequestParams copy(@NotNull Function1<? super wqa, Unit> builderAction) {
        builderAction.getClass();
        Long productId = getProductId();
        Integer sessionTimestamp = getSessionTimestamp();
        String sessionId = getSessionId();
        String serviceName = getServiceName();
        String contentId = getContentId();
        long contentTypeId = getContentTypeId();
        long expirationTimestamp = getExpirationTimestamp();
        String monetizationModel = getMonetizationModel();
        Long puid = getPuid();
        String signature = getSignature();
        boolean verificationRequired = getVerificationRequired();
        String version = getVersion();
        String watchSessionId = getWatchSessionId();
        Boolean persistent = getPersistent();
        Long strictPlaybackTtl = getStrictPlaybackTtl();
        Long rentalTtl = getRentalTtl();
        Long storageTtl = getStorageTtl();
        Long playbackTtl = getPlaybackTtl();
        monetizationModel.getClass();
        signature.getClass();
        version.getClass();
        watchSessionId.getClass();
        wqa wqaVar = new wqa();
        wqaVar.a = sessionId;
        wqaVar.b = puid;
        wqaVar.c = "";
        wqaVar.d = "";
        wqaVar.e = Boolean.FALSE;
        wqaVar.c = getUuid();
        wqaVar.d = getUuidSignature();
        wqaVar.e = getInternalStream();
        builderAction.invoke(wqaVar);
        return new DrmRequestParams(productId, sessionTimestamp, wqaVar.a, serviceName, contentId, contentTypeId, expirationTimestamp, monetizationModel, wqaVar.b, signature, verificationRequired, version, watchSessionId, persistent, strictPlaybackTtl, rentalTtl, storageTtl, playbackTtl, wqaVar.c, wqaVar.d, wqaVar.e, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DrmRequestParams.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        DrmRequestParams drmRequestParams = (DrmRequestParams) other;
        return Intrinsics.d(this.productId, drmRequestParams.productId) && Intrinsics.d(this.sessionTimestamp, drmRequestParams.sessionTimestamp) && this.contentTypeId == drmRequestParams.contentTypeId && this.expirationTimestamp == drmRequestParams.expirationTimestamp && Intrinsics.d(this.puid, drmRequestParams.puid) && this.verificationRequired == drmRequestParams.verificationRequired && Intrinsics.d(this.persistent, drmRequestParams.persistent) && Intrinsics.d(this.strictPlaybackTtl, drmRequestParams.strictPlaybackTtl) && Intrinsics.d(this.rentalTtl, drmRequestParams.rentalTtl) && Intrinsics.d(this.storageTtl, drmRequestParams.storageTtl) && Intrinsics.d(this.playbackTtl, drmRequestParams.playbackTtl) && Intrinsics.d(this.internalStream, drmRequestParams.internalStream) && Intrinsics.d(this.sessionId, drmRequestParams.sessionId) && Intrinsics.d(this.serviceName, drmRequestParams.serviceName) && Intrinsics.d(this.contentId, drmRequestParams.contentId) && Intrinsics.d(this.monetizationModel, drmRequestParams.monetizationModel) && Intrinsics.d(this.signature, drmRequestParams.signature) && Intrinsics.d(this.version, drmRequestParams.version) && Intrinsics.d(this.watchSessionId, drmRequestParams.watchSessionId) && Intrinsics.d(this.uuid, drmRequestParams.uuid) && Intrinsics.d(this.uuidSignature, drmRequestParams.uuidSignature);
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

    @NotNull
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

    @NotNull
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

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final String getWatchSessionId() {
        return this.watchSessionId;
    }

    public int hashCode() {
        Long l = this.productId;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Integer num = this.sessionTimestamp;
        int c = tlm.c(this.expirationTimestamp, tlm.c(this.contentTypeId, (hashCode + (num != null ? num.intValue() : 0)) * 31, 31), 31);
        Long l2 = this.puid;
        int e = k5r.e((c + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.verificationRequired);
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
        int c2 = k5r.c(k5r.c(k5r.c(k5r.c((hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.monetizationModel), 31, this.signature), 31, this.version), 31, this.watchSessionId);
        String str4 = this.uuid;
        int hashCode10 = (c2 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.uuidSignature;
        return hashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
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
        return k.p(sb, this.internalStream, ')');
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

    public /* synthetic */ DrmRequestParams(Long l, Integer num, String str, String str2, String str3, long j, long j2, String str4, Long l2, String str5, boolean z, String str6, String str7, Boolean bool, Long l3, Long l4, Long l5, Long l6, String str8, String str9, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, num, str, str2, str3, j, j2, str4, l2, str5, z, str6, str7, bool, l3, l4, l5, l6, str8, str9, bool2);
    }
}
