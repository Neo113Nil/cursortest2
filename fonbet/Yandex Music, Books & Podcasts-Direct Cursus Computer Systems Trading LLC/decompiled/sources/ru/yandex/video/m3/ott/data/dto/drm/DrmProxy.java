package ru.yandex.video.m3.ott.data.dto.drm;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.jx9;
import defpackage.qq6;
import defpackage.uqa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001:\u0001\nB#\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "", "proxyUrl", "provisioningUrl", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "drmRequestParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;)V", "Lkotlin/Function1;", "Luqa;", "", "builderAction", "copy", "(Lkotlin/jvm/functions/Function1;)Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getProxyUrl", "getProvisioningUrl", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "getDrmRequestParams", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public class DrmProxy extends DrmConfig {
    public static final int $stable = 0;

    @NotNull
    private final DrmRequestParams drmRequestParams;
    private final String provisioningUrl;

    @NotNull
    private final String proxyUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrmProxy(@NotNull String str, String str2, @NotNull DrmRequestParams drmRequestParams) {
        super(null);
        str.getClass();
        drmRequestParams.getClass();
        this.proxyUrl = str;
        this.provisioningUrl = str2;
        this.drmRequestParams = drmRequestParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrmProxy copy$default(DrmProxy drmProxy, Function1 function1, int i, Object obj) {
        if (obj != null) {
            qq6.d("Super calls with default arguments not supported in this target, function: copy");
            return null;
        }
        if ((i & 1) != 0) {
            function1 = jx9.H;
        }
        return drmProxy.copy(function1);
    }

    @NotNull
    public final DrmProxy copy(@NotNull Function1<? super uqa, Unit> builderAction) {
        builderAction.getClass();
        String proxyUrl = getProxyUrl();
        String provisioningUrl = getProvisioningUrl();
        DrmRequestParams drmRequestParams = getDrmRequestParams();
        proxyUrl.getClass();
        drmRequestParams.getClass();
        uqa uqaVar = new uqa();
        uqaVar.a = drmRequestParams;
        builderAction.invoke(uqaVar);
        return new DrmProxy(proxyUrl, provisioningUrl, uqaVar.a);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        DrmProxy drmProxy = (DrmProxy) other;
        return Intrinsics.d(this.proxyUrl, drmProxy.proxyUrl) && Intrinsics.d(this.provisioningUrl, drmProxy.provisioningUrl) && Intrinsics.d(this.drmRequestParams, drmProxy.drmRequestParams);
    }

    @NotNull
    public final DrmRequestParams getDrmRequestParams() {
        return this.drmRequestParams;
    }

    public final String getProvisioningUrl() {
        return this.provisioningUrl;
    }

    @NotNull
    public final String getProxyUrl() {
        return this.proxyUrl;
    }

    public int hashCode() {
        int hashCode = this.proxyUrl.hashCode() * 31;
        String str = this.provisioningUrl;
        return this.drmRequestParams.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "DrmProxy(proxyUrl='" + this.proxyUrl + "', provisioningUrl=" + this.provisioningUrl + ", drmRequestParams=" + this.drmRequestParams + ')';
    }
}
