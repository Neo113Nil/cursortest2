package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ProgressBarDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ProgressTileFooterDto;", "", "progressBar", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ProgressBarDto;", "text", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ProgressBarDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)V", "getProgressBar", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ProgressBarDto;", "getText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ProgressTileFooterDto {
    private final ProgressBarDto progressBar;
    private final AttributedTextDto text;

    public ProgressTileFooterDto(@Json(name = "progress_bar") ProgressBarDto progressBarDto, @Json(name = "text") AttributedTextDto attributedTextDto) {
        this.progressBar = progressBarDto;
        this.text = attributedTextDto;
    }

    public static /* synthetic */ ProgressTileFooterDto copy$default(ProgressTileFooterDto progressTileFooterDto, ProgressBarDto progressBarDto, AttributedTextDto attributedTextDto, int i, Object obj) {
        if ((i & 1) != 0) {
            progressBarDto = progressTileFooterDto.progressBar;
        }
        if ((i & 2) != 0) {
            attributedTextDto = progressTileFooterDto.text;
        }
        return progressTileFooterDto.copy(progressBarDto, attributedTextDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ProgressBarDto getProgressBar() {
        return this.progressBar;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getText() {
        return this.text;
    }

    public final ProgressTileFooterDto copy(@Json(name = "progress_bar") ProgressBarDto progressBar, @Json(name = "text") AttributedTextDto text) {
        return new ProgressTileFooterDto(progressBar, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressTileFooterDto)) {
            return false;
        }
        ProgressTileFooterDto progressTileFooterDto = (ProgressTileFooterDto) other;
        return jl40.l(this.progressBar, progressTileFooterDto.progressBar) && jl40.l(this.text, progressTileFooterDto.text);
    }

    public final ProgressBarDto getProgressBar() {
        return this.progressBar;
    }

    public final AttributedTextDto getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.progressBar.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.text;
        return hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode());
    }

    public String toString() {
        return "ProgressTileFooterDto(progressBar=" + this.progressBar + ", text=" + this.text + Extension.C_BRAKE;
    }
}
