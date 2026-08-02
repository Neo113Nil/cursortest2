package ru.yandex.tankerapp.geocoding.domain.errors;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\t\n\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/tankerapp/geocoding/domain/errors/GeocodingError;", "", "", ErrorResponseData.JSON_ERROR_CODE, "Ljava/lang/String;", "a", "()Ljava/lang/String;", ErrorResponseData.JSON_ERROR_MESSAGE, "b", "NotFound", "SearchRequestError", "InvalidArguments", "Lru/yandex/tankerapp/geocoding/domain/errors/GeocodingError$InvalidArguments;", "Lru/yandex/tankerapp/geocoding/domain/errors/GeocodingError$NotFound;", "Lru/yandex/tankerapp/geocoding/domain/errors/GeocodingError$SearchRequestError;", "tanker_geocoding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class GeocodingError extends Throwable {
    private final String errorCode;
    private final String errorMessage;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/tankerapp/geocoding/domain/errors/GeocodingError$InvalidArguments;", "Lru/yandex/tankerapp/geocoding/domain/errors/GeocodingError;", "", "readResolve", "()Ljava/lang/Object;", "tanker_geocoding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvalidArguments extends GeocodingError {
        public static final InvalidArguments a = new InvalidArguments("3", "Invalid Arguments");

        private final Object readResolve() {
            return a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/tankerapp/geocoding/domain/errors/GeocodingError$NotFound;", "Lru/yandex/tankerapp/geocoding/domain/errors/GeocodingError;", "", "readResolve", "()Ljava/lang/Object;", "tanker_geocoding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotFound extends GeocodingError {
        public static final NotFound a = new NotFound("1", "No coordinates found");

        private final Object readResolve() {
            return a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/tankerapp/geocoding/domain/errors/GeocodingError$SearchRequestError;", "Lru/yandex/tankerapp/geocoding/domain/errors/GeocodingError;", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "tanker_geocoding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchRequestError extends GeocodingError {
        private final String description;

        public SearchRequestError(String str) {
            super("2", str);
            this.description = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchRequestError) && jl40.l(this.description, ((SearchRequestError) obj).description);
        }

        public final int hashCode() {
            String str = this.description;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return oyr.p("SearchRequestError(description=", this.description, Extension.C_BRAKE);
        }
    }

    public GeocodingError(String str, String str2) {
        this.errorCode = str;
        this.errorMessage = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
