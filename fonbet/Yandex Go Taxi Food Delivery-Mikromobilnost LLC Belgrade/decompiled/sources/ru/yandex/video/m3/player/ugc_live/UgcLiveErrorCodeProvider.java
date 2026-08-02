package ru.yandex.video.m3.player.ugc_live;

import defpackage.i3y;
import defpackage.sls;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCodeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.ErrorCodeProvider;
import ru.yandex.video.m3.player.ugc_live.UgcLiveException;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveErrorCodeProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;", "<init>", "()V", "", "throwable", "", "getCode", "(Ljava/lang/Throwable;)Ljava/lang/String;", "Lru/yandex/video/m3/player/impl/tracking/data/DefaultErrorCodeProvider;", "defaultErrorCodeProvider$delegate", "Li3y;", "getDefaultErrorCodeProvider", "()Lru/yandex/video/m3/player/impl/tracking/data/DefaultErrorCodeProvider;", "defaultErrorCodeProvider", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcLiveErrorCodeProvider implements ErrorCodeProvider {
    public static final int $stable = 8;

    /* renamed from: defaultErrorCodeProvider$delegate, reason: from kotlin metadata */
    private final i3y defaultErrorCodeProvider = a.a(new sls() { // from class: ru.yandex.video.m3.player.ugc_live.UgcLiveErrorCodeProvider$defaultErrorCodeProvider$2
        @Override // defpackage.sls
        public final DefaultErrorCodeProvider invoke() {
            return new DefaultErrorCodeProvider();
        }
    });

    private final DefaultErrorCodeProvider getDefaultErrorCodeProvider() {
        return (DefaultErrorCodeProvider) this.defaultErrorCodeProvider.getValue();
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.data.ErrorCodeProvider
    public String getCode(Throwable throwable) {
        String str = null;
        UgcLiveException ugcLiveException = throwable instanceof UgcLiveException ? (UgcLiveException) throwable : null;
        if (ugcLiveException == null) {
            Throwable cause = throwable.getCause();
            ugcLiveException = cause instanceof UgcLiveException ? (UgcLiveException) cause : null;
        }
        if (ugcLiveException instanceof UgcLiveException.BroadcastIsCancelled) {
            str = "BroadcastIsCancelled";
        } else {
            String str2 = "ConnectionError";
            if (ugcLiveException instanceof UgcLiveException.ConnectionError) {
                str = "ConnectionError";
            } else if (ugcLiveException instanceof UgcLiveException.XivaException) {
                UgcLiveException.XivaException xivaException = (UgcLiveException.XivaException) ugcLiveException;
                if (xivaException instanceof UgcLiveException.XivaException.OtherClosedError) {
                    str2 = "OtherClosedError";
                } else if (xivaException instanceof UgcLiveException.XivaException.AuthError) {
                    str2 = "AuthError";
                } else if (xivaException instanceof UgcLiveException.XivaException.RequestError) {
                    str2 = "RequestError";
                } else if (xivaException instanceof UgcLiveException.XivaException.InternalError) {
                    str2 = "InternalError";
                } else if (!(xivaException instanceof UgcLiveException.XivaException.ConnectionError)) {
                    if (xivaException instanceof UgcLiveException.XivaException.JsonParseException) {
                        str2 = "JsonParseException";
                    } else if (xivaException instanceof UgcLiveException.XivaException.UnknownError) {
                        str2 = "UnknownError";
                    } else {
                        if (!(xivaException instanceof UgcLiveException.XivaException.WrongResponseError)) {
                            w511.b();
                            return null;
                        }
                        str2 = "WrongResponseError";
                    }
                }
                str = "XivaException.".concat(str2);
            } else if (ugcLiveException instanceof UgcLiveException.UgcLiveStatusIsNull) {
                str = "UgcLiveStatusIsNull";
            } else if (ugcLiveException instanceof UgcLiveException.UnknownUgcLiveStatus) {
                str = "UnknownUgcLiveStatus";
            } else if (ugcLiveException != null) {
                w511.b();
                return null;
            }
        }
        return str != null ? throwable instanceof PlaybackException.ErrorPreparing ? "Preparing.".concat(str) : str : getDefaultErrorCodeProvider().getCode(throwable);
    }
}
