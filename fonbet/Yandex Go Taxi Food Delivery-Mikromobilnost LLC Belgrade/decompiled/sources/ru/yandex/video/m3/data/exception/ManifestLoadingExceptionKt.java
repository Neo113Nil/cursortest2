package ru.yandex.video.m3.data.exception;

import kotlin.Metadata;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"getMessage", "", "Lru/yandex/video/m3/data/exception/ManifestLoadingException;", "getTitle", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManifestLoadingExceptionKt {
    public static final int getMessage(ManifestLoadingException manifestLoadingException) {
        if (manifestLoadingException instanceof ManifestLoadingException.Forbidden) {
            return R.string.manifest_loading_error_login_required_message;
        }
        if (manifestLoadingException instanceof ManifestLoadingException.ForbiddenByLicense) {
            return R.string.manifest_loading_error_has_no_license_message;
        }
        if (manifestLoadingException instanceof ManifestLoadingException.ForbiddenByModeration) {
            return R.string.manifest_loading_error_forbidden_by_moderation;
        }
        if (manifestLoadingException instanceof ManifestLoadingException.PaymentRequired) {
            return R.string.manifest_loading_error_playing_message;
        }
        if (manifestLoadingException instanceof ManifestLoadingException.NotFound) {
            return R.string.manifest_loading_error_video_not_found_message;
        }
        if (manifestLoadingException instanceof ManifestLoadingException.UnsupportedByApplication) {
            return R.string.manifest_loading_error_not_supported_by_message;
        }
        if (manifestLoadingException instanceof ManifestLoadingException.ConnectionError) {
            return R.string.manifest_loading_error_connection_universal_subtitle;
        }
        if (manifestLoadingException instanceof ManifestLoadingException.CommunicationError) {
            return R.string.manifest_loading_error_communication_universal_subtitle;
        }
        if (manifestLoadingException instanceof ManifestLoadingException.PurchaseNotFoundError) {
            return R.string.manifest_loading_error_purchase_not_found_message;
        }
        if (manifestLoadingException instanceof ManifestLoadingException.PurchaseExpiredError) {
            return R.string.manifest_loading_error_expired_message;
        }
        if (manifestLoadingException instanceof ManifestLoadingException.SubscriptionNotFoundError) {
            return R.string.manifest_loading_error_subscription_not_found_message;
        }
        if (manifestLoadingException instanceof ManifestLoadingException.GeoConstraintViolationError) {
            return R.string.manifest_loading_error_geo_constraint_violation_message;
        }
        return manifestLoadingException instanceof ManifestLoadingException.LicensesNotFoundError ? true : manifestLoadingException instanceof ManifestLoadingException.LicenseTypesNotAvailable ? R.string.manifest_loading_error_license_not_found_message : manifestLoadingException instanceof ManifestLoadingException.ServiceConstraintViolationError ? R.string.manifest_loading_error_service_constraint_violation_message : manifestLoadingException instanceof ManifestLoadingException.SupportedStreamsNotFoundError ? R.string.manifest_loading_error_supported_streams_not_found_message : manifestLoadingException instanceof ManifestLoadingException.InvalidRegion ? R.string.manifest_loading_error_invalid_region : manifestLoadingException instanceof ManifestLoadingException.WrongSubscription ? R.string.manifest_loading_error_wrong_subscription : R.string.manifest_loading_error_message;
    }

    public static final int getTitle(ManifestLoadingException manifestLoadingException) {
        if (manifestLoadingException instanceof ManifestLoadingException.Forbidden) {
            return R.string.manifest_loading_error_login_required;
        }
        if (!(manifestLoadingException instanceof ManifestLoadingException.SupportedStreamsNotFoundError ? true : manifestLoadingException instanceof ManifestLoadingException.LicensesNotFoundError ? true : manifestLoadingException instanceof ManifestLoadingException.LicenseTypesNotAvailable ? true : manifestLoadingException instanceof ManifestLoadingException.PurchaseNotFoundError ? true : manifestLoadingException instanceof ManifestLoadingException.ForbiddenByLicense ? true : manifestLoadingException instanceof ManifestLoadingException.ForbiddenByModeration ? true : manifestLoadingException instanceof ManifestLoadingException.WrongSubscription) && !(manifestLoadingException instanceof ManifestLoadingException.PaymentRequired)) {
            return manifestLoadingException instanceof ManifestLoadingException.NotFound ? R.string.manifest_loading_error_video_not_found : manifestLoadingException instanceof ManifestLoadingException.UnsupportedByApplication ? R.string.manifest_loading_error_not_supported_by_app : manifestLoadingException instanceof ManifestLoadingException.ConnectionError ? R.string.manifest_loading_error_connection_universal_title : manifestLoadingException instanceof ManifestLoadingException.CommunicationError ? R.string.manifest_loading_error_communication_universal_title : manifestLoadingException instanceof ManifestLoadingException.PurchaseExpiredError ? R.string.manifest_loading_error_expired : manifestLoadingException instanceof ManifestLoadingException.SubscriptionNotFoundError ? R.string.manifest_loading_error_subscription_not_found : manifestLoadingException instanceof ManifestLoadingException.GeoConstraintViolationError ? R.string.manifest_loading_error_geo_constraint_violation : manifestLoadingException instanceof ManifestLoadingException.ServiceConstraintViolationError ? R.string.manifest_loading_error_service_constraint_violation : manifestLoadingException instanceof ManifestLoadingException.InvalidRegion ? R.string.manifest_loading_error_invalid_region : R.string.manifest_loading_error;
        }
        return R.string.manifest_loading_error_playing;
    }
}
