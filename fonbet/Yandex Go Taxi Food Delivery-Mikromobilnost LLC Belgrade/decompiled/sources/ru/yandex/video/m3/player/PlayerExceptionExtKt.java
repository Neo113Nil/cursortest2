package ru.yandex.video.m3.player;

import android.content.Context;
import defpackage.jl40;
import kotlin.Metadata;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.utils.DefaultResourceProvider;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\n"}, d2 = {"getGenericErrorMessage", "", "context", "Landroid/content/Context;", "getMessage", "Lru/yandex/video/m3/player/PlaybackException;", "resourceProvider", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "hasMeaningfulErrorMessage", "", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerExceptionExtKt {
    public static final String getGenericErrorMessage(Context context) {
        return new DefaultResourceProvider(context).getString(R.string.yandex_video_player_error_generic);
    }

    public static final String getMessage(PlaybackException playbackException, ResourceProvider resourceProvider) {
        if (playbackException instanceof PlaybackException.ErrorLicenseViolation) {
            return resourceProvider.getString(R.string.yandex_video_player_play_list_error_playback_violation);
        }
        if (playbackException instanceof PlaybackException.ErrorGeneric) {
            return resourceProvider.getString(R.string.yandex_video_player_error_generic);
        }
        if (playbackException instanceof PlaybackException.ErrorInstantiatingDecoder) {
            return resourceProvider.getString(R.string.yandex_video_player_error_instantiating_decoder, ((PlaybackException.ErrorInstantiatingDecoder) playbackException).getDecoderName());
        }
        if (playbackException instanceof PlaybackException.ErrorNoDecoder) {
            return resourceProvider.getString(R.string.yandex_video_player_error_no_decoder, ((PlaybackException.ErrorNoDecoder) playbackException).getMimeType());
        }
        if (playbackException instanceof PlaybackException.ErrorNoSecureDecoder) {
            return resourceProvider.getString(R.string.yandex_video_player_error_no_secure_decoder, ((PlaybackException.ErrorNoSecureDecoder) playbackException).getMimeType());
        }
        if (playbackException instanceof PlaybackException.ErrorQueryingDecoders) {
            return resourceProvider.getString(R.string.yandex_video_player_error_querying_decoders);
        }
        if (playbackException instanceof PlaybackException.ErrorSubtitleNoDecoder) {
            return resourceProvider.getString(R.string.yandex_video_player_error_subtitle_decoders);
        }
        if (playbackException instanceof PlaybackException.ErrorNoInternetConnection ? true : playbackException instanceof PlaybackException.ErrorConnection) {
            return resourceProvider.getString(R.string.yandex_video_player_error_connection_universal_title);
        }
        if (playbackException instanceof PlaybackException.ErrorCache) {
            return resourceProvider.getString(R.string.yandex_video_player_error_cache);
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorDrmUnknown) {
            return resourceProvider.getString(R.string.yandex_video_player_error_drm_unknown);
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorDrmNotSupported) {
            return resourceProvider.getString(R.string.yandex_video_player_error_drm_not_supported);
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorDrmUnsupportedScheme) {
            return resourceProvider.getString(R.string.yandex_video_player_error_drm_unsupported_scheme);
        }
        if (playbackException instanceof PlaybackException.DrmThrowable.ErrorSession) {
            return resourceProvider.getString(R.string.yandex_video_player_error_generic);
        }
        if (!(playbackException instanceof PlaybackException.DrmThrowable.ErrorKeysExpired) && !(playbackException instanceof PlaybackException.DrmThrowable.ErrorAuthentication)) {
            return playbackException instanceof PlaybackException.UnsupportedContentException.ErrorAudio ? resourceProvider.getString(R.string.yandex_video_player_error_unsupported_audio) : playbackException instanceof PlaybackException.UnsupportedContentException.ErrorVideo ? resourceProvider.getString(R.string.yandex_video_player_error_unsupported_video) : playbackException instanceof PlaybackException.UnsupportedContentException.ErrorParser ? resourceProvider.getString(R.string.yandex_video_player_error_generic) : resourceProvider.getString(R.string.yandex_video_player_error_generic);
        }
        return resourceProvider.getString(R.string.yandex_video_player_error_keys_expired);
    }

    public static final boolean hasMeaningfulErrorMessage(PlaybackException playbackException, Context context) {
        return !jl40.l(getMessage(playbackException, context), getGenericErrorMessage(context));
    }

    public static final String getMessage(PlaybackException playbackException, Context context) {
        return getMessage(playbackException, new DefaultResourceProvider(context));
    }
}
