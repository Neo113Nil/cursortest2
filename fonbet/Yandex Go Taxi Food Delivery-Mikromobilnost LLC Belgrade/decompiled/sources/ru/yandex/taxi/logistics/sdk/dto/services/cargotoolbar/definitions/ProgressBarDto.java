package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ProgressBarDto;", "", "progressText", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "progress", "", "accessibilityLabel", "", "progressBarStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ProgressBarStyleDto;", "paddings", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaddingsDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;DLjava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ProgressBarStyleDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaddingsDto;)V", "getProgressText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getProgress", "()D", "getAccessibilityLabel", "()Ljava/lang/String;", "getProgressBarStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ProgressBarStyleDto;", "getPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaddingsDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ProgressBarDto {
    private final String accessibilityLabel;
    private final PaddingsDto paddings;
    private final double progress;
    private final ProgressBarStyleDto progressBarStyle;
    private final AttributedTextDto progressText;

    public ProgressBarDto(@Json(name = "progress_text") AttributedTextDto attributedTextDto, @Json(name = "progress") double d, @Json(name = "accessibility_label") String str, @Json(name = "progress_bar_style") ProgressBarStyleDto progressBarStyleDto, @Json(name = "paddings") PaddingsDto paddingsDto) {
        this.progressText = attributedTextDto;
        this.progress = d;
        this.accessibilityLabel = str;
        this.progressBarStyle = progressBarStyleDto;
        this.paddings = paddingsDto;
    }

    public static /* synthetic */ ProgressBarDto copy$default(ProgressBarDto progressBarDto, AttributedTextDto attributedTextDto, double d, String str, ProgressBarStyleDto progressBarStyleDto, PaddingsDto paddingsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            attributedTextDto = progressBarDto.progressText;
        }
        if ((i & 2) != 0) {
            d = progressBarDto.progress;
        }
        if ((i & 4) != 0) {
            str = progressBarDto.accessibilityLabel;
        }
        if ((i & 8) != 0) {
            progressBarStyleDto = progressBarDto.progressBarStyle;
        }
        if ((i & 16) != 0) {
            paddingsDto = progressBarDto.paddings;
        }
        PaddingsDto paddingsDto2 = paddingsDto;
        String str2 = str;
        return progressBarDto.copy(attributedTextDto, d, str2, progressBarStyleDto, paddingsDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final AttributedTextDto getProgressText() {
        return this.progressText;
    }

    /* renamed from: component2, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final ProgressBarStyleDto getProgressBarStyle() {
        return this.progressBarStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    public final ProgressBarDto copy(@Json(name = "progress_text") AttributedTextDto progressText, @Json(name = "progress") double progress, @Json(name = "accessibility_label") String accessibilityLabel, @Json(name = "progress_bar_style") ProgressBarStyleDto progressBarStyle, @Json(name = "paddings") PaddingsDto paddings) {
        return new ProgressBarDto(progressText, progress, accessibilityLabel, progressBarStyle, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBarDto)) {
            return false;
        }
        ProgressBarDto progressBarDto = (ProgressBarDto) other;
        return jl40.l(this.progressText, progressBarDto.progressText) && Double.compare(this.progress, progressBarDto.progress) == 0 && jl40.l(this.accessibilityLabel, progressBarDto.accessibilityLabel) && jl40.l(this.progressBarStyle, progressBarDto.progressBarStyle) && jl40.l(this.paddings, progressBarDto.paddings);
    }

    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    public final double getProgress() {
        return this.progress;
    }

    public final ProgressBarStyleDto getProgressBarStyle() {
        return this.progressBarStyle;
    }

    public final AttributedTextDto getProgressText() {
        return this.progressText;
    }

    public int hashCode() {
        AttributedTextDto attributedTextDto = this.progressText;
        int a = unr0.a((attributedTextDto == null ? 0 : attributedTextDto.hashCode()) * 31, 31, this.progress);
        String str = this.accessibilityLabel;
        int hashCode = (this.progressBarStyle.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        PaddingsDto paddingsDto = this.paddings;
        return hashCode + (paddingsDto != null ? paddingsDto.hashCode() : 0);
    }

    public String toString() {
        return "ProgressBarDto(progressText=" + this.progressText + ", progress=" + this.progress + ", accessibilityLabel=" + this.accessibilityLabel + ", progressBarStyle=" + this.progressBarStyle + ", paddings=" + this.paddings + Extension.C_BRAKE;
    }
}
