package ru.yandex.video.m3.data.exception.network;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestExceptionFactory;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"fromManifestLoadingException", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory;", "manifestLoadingException", "Lru/yandex/video/m3/data/exception/ManifestLoadingException;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManifestLoadingExceptionMapperKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v26, types: [T, java.lang.String] */
    public static final NetworkRequestException fromManifestLoadingException(NetworkRequestExceptionFactory networkRequestExceptionFactory, final ManifestLoadingException manifestLoadingException) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        ref$ObjectRef3.element = manifestLoadingException.getMessage();
        if (manifestLoadingException instanceof ManifestLoadingException.Forbidden) {
            ref$ObjectRef.element = 401;
        } else if (manifestLoadingException instanceof ManifestLoadingException.NotFound) {
            ref$ObjectRef.element = 404;
        } else if (manifestLoadingException instanceof ManifestLoadingException.PaymentRequired) {
            ref$ObjectRef.element = 402;
            ref$ObjectRef3.element = "PAYMENT_REQUIRED. " + ((String) ref$ObjectRef3.element);
            ref$BooleanRef.element = true;
        } else if (manifestLoadingException instanceof ManifestLoadingException.ForbiddenByLicense) {
            ref$ObjectRef.element = 412;
            ref$ObjectRef3.element = "FORBIDDEN_BY_LICENSE. " + ((String) ref$ObjectRef3.element);
            ref$BooleanRef.element = true;
        } else if (manifestLoadingException instanceof ManifestLoadingException.UserProfileNotCreated) {
            ref$ObjectRef.element = 417;
            ref$ObjectRef3.element = "USER_PROFILE_NOT_CREATED. " + ((String) ref$ObjectRef3.element);
            ref$BooleanRef.element = true;
        } else if (manifestLoadingException instanceof ManifestLoadingException.CommunicationError) {
            ref$ObjectRef.element = 503;
            ref$ObjectRef3.element = "BLACKBOX_NOT_AVAILABLE. " + ((String) ref$ObjectRef3.element);
            ref$BooleanRef.element = true;
        } else if (manifestLoadingException instanceof ManifestLoadingException.ForbiddenByModeration) {
            ref$ObjectRef.element = 404;
            ref$BooleanRef.element = true;
        } else if (manifestLoadingException instanceof ManifestLoadingException.InvalidRegion) {
            ref$ObjectRef.element = null;
            ref$ObjectRef3.element = "invalid_region " + ((String) ref$ObjectRef3.element);
            ref$BooleanRef.element = true;
        } else if (manifestLoadingException instanceof ManifestLoadingException.SubscriptionNotFoundError) {
            ref$ObjectRef.element = null;
            ref$BooleanRef.element = true;
        } else if (manifestLoadingException instanceof ManifestLoadingException.UnknownError) {
            ref$ObjectRef.element = null;
        } else {
            ref$ObjectRef.element = null;
            ref$BooleanRef.element = true;
        }
        Throwable cause = manifestLoadingException.getCause();
        if (cause instanceof ManifestLoadingException.UnknownError.GenericError) {
            ManifestLoadingException.UnknownError.GenericError genericError = (ManifestLoadingException.UnknownError.GenericError) cause;
            ref$ObjectRef2.element = genericError.getRequestUrl();
            ref$ObjectRef.element = Integer.valueOf(genericError.getCode());
        }
        return networkRequestExceptionFactory.create(NetworkRequestExceptionFactoryKt.NetworkRequestExceptionParameters(new tls() { // from class: ru.yandex.video.m3.data.exception.network.ManifestLoadingExceptionMapperKt$fromManifestLoadingException$parameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(NetworkRequestExceptionFactory.Parameters.Builder builder) {
                builder.setResponseCode(ref$ObjectRef.element);
                builder.setRequestUrl(ref$ObjectRef2.element);
                builder.setResourceType(NetworkRequestException.ResourceType.CONTENT_ID);
                builder.setMessage(ref$ObjectRef3.element);
                builder.setCause(manifestLoadingException.getCause());
                builder.setUnknown(ref$BooleanRef.element);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((NetworkRequestExceptionFactory.Parameters.Builder) obj);
                return zy11.a;
            }
        }));
    }
}
